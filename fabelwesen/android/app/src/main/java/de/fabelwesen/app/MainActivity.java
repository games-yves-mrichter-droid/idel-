package de.fabelwesen.app;

import android.app.Activity;
import android.content.ContentValues;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.io.IOException;

public class MainActivity extends Activity {
    private static final String HOST = "appassets.androidplatform.net";
    private WebView web;

    private static String mime(String p) {
        if (p.endsWith(".html")) return "text/html";
        if (p.endsWith(".svg")) return "image/svg+xml";
        if (p.endsWith(".js")) return "application/javascript";
        if (p.endsWith(".webmanifest") || p.endsWith(".json")) return "application/json";
        if (p.endsWith(".png")) return "image/png";
        return "application/octet-stream";
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Spieldateien aus assets/www über eine feste https-Adresse ausliefern,
        // damit localStorage (Spielstand) zuverlässig erhalten bleibt.
        web = new WebView(this);
        WebSettings s = web.getSettings();
        s.setJavaScriptEnabled(true);
        s.setDomStorageEnabled(true);
        s.setUserAgentString(s.getUserAgentString() + " FabelwesenApp");
        web.setWebViewClient(new WebViewClient() {
            @Override
            public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest req) {
                Uri u = req.getUrl();
                if (!HOST.equals(u.getHost()) || u.getPath() == null || !u.getPath().startsWith("/www/")) return null;
                String path = u.getPath().substring(1);
                try {
                    return new WebResourceResponse(mime(path), "utf-8", getAssets().open(path));
                } catch (IOException e) {
                    return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
                }
            }
        });
        // Fotos aus dem Foto-Modus in der Galerie speichern
        web.addJavascriptInterface(new Bridge(), "Android");
        setContentView(web);
        if (savedInstanceState != null) web.restoreState(savedInstanceState);
        else web.loadUrl("https://" + HOST + "/www/index.html");
    }

    private class Bridge {
        @JavascriptInterface
        public void saveImage(String dataUrl) {
            try {
                byte[] bytes = Base64.decode(dataUrl.substring(dataUrl.indexOf(',') + 1), Base64.DEFAULT);
                String name = "Fabelwesen_" + System.currentTimeMillis() + ".jpg";
                if (Build.VERSION.SDK_INT >= 29) {
                    ContentValues v = new ContentValues();
                    v.put(MediaStore.Images.Media.DISPLAY_NAME, name);
                    v.put(MediaStore.Images.Media.MIME_TYPE, "image/jpeg");
                    v.put(MediaStore.Images.Media.RELATIVE_PATH, Environment.DIRECTORY_PICTURES + "/Fabelwesen");
                    android.net.Uri uri = getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, v);
                    if (uri == null) return;
                    try (OutputStream os = getContentResolver().openOutputStream(uri)) { os.write(bytes); }
                } else {
                    File f = new File(getExternalFilesDir(Environment.DIRECTORY_PICTURES), name);
                    try (FileOutputStream os = new FileOutputStream(f)) { os.write(bytes); }
                }
            } catch (Exception ignored) {
            }
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle out) {
        super.onSaveInstanceState(out);
        web.saveState(out);
    }

    @Override
    protected void onPause() {
        super.onPause();
        web.evaluateJavascript("window.save&&save()", null);
    }

    @Override
    public void onBackPressed() {
        web.evaluateJavascript("window.onAndroidBack?onAndroidBack():false", v -> {
            if (!"true".equals(v)) finish();
        });
    }
}
