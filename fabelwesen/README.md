# Fabelwesen 🥚🐉

Ein 3D-Handyspiel, in dem du Fabelwesen aus Eiern ausbrütest und in einem Zauberwald großziehst.

## Android-App (APK)
Die fertige APK liegt unter [`release/Fabelwesen.apk`](../release/Fabelwesen.apk).
1. Datei aufs Handy laden (z. B. über GitHub → Datei öffnen → „Download raw file“).
2. Antippen und installieren. Beim ersten Mal fragt Android, ob Installationen aus dieser Quelle erlaubt sind → erlauben.
3. Die App läuft komplett offline.

Selbst bauen: `cd fabelwesen/android && gradle assembleRelease` (benötigt Android SDK 34).

## Im Browser
`fabelwesen/index.html` öffnen oder den Ordner über einen Webserver ausliefern (`python3 -m http.server`) und „Zum Startbildschirm hinzufügen“ wählen.

## So wird gespielt
- **Eier kaufen** im Eier-Shop (Waldei, Mondei, Sternenei, Feuerei) – wahlweise zufällig, gezielt niedlich oder gezielt böse.
- **Ausbrüten:** Das Ei liegt im Nest auf der Insel. Antippen wärmt es und es schlüpft schneller.
- **Aufgaben:** Schicke deine Wesen los (Beeren sammeln, Schatz suchen, Expedition …). Niedliche Wesen haben eigene Aufgaben (Kinder unterhalten, Tiere heilen, Regenbogen malen), böse auch (Dorf erschrecken, Ritter verjagen, Vulkan wecken). Dafür gibt es Gold und Erfahrung.
- **Pflegen:** Füttern hält den Hunger fern (hungrige Wesen verdienen nur die Hälfte), Streicheln oder Raufen hebt die Laune (+25 % Gold).
- **Wachsen:** Baby → Kind (Lv 5) → Jugendlich (Lv 12) → Erwachsen (Lv 22) → Uralt (Lv 35). Mit jedem Abschnitt verändert sich das 3D-Modell: Kitsune bekommen mehr Schwänze, Zerberus bis zu drei Köpfe, die Hydra bis zu sieben.
- **Fabelbuch:** Sammle alle 37 Fabelwesen und schalte ihre Lebensabschnitte frei.
- **Ausbau:** Mehr Waldplätze und Nester kaufen.
- **Lebendige Bewegungen:** Weiches Beschleunigen und Abbremsen, wippender und schwankender Gang, Neigen in Kurven, Stauchen und Strecken beim Hüpfen, nachfederndes Schwanzwedeln (stärker bei guter Laune), Umherschauen, Kopfneigen und Nicken. Dazu Leerlauf-Aktionen: hinsetzen, schnuppern, sich schütteln, gähnen, den eigenen Schwanz jagen, Freudensprünge, Flügelschlagen – und bei Menschenwesen winken und strecken. Hungrige Wesen lassen den Kopf hängen.
- **Begegnungen auf der Wiese:** Die Wesen treffen sich von selbst. Zwei böse Wesen **kämpfen** (Angriffe, Blitze, Funken, Sieger und benommener Verlierer), zwei niedliche **spielen Fangen** (Kreise, Hüpfer, Herzen), und ein böses Wesen **schleicht sich an und erschreckt** ein niedliches („BUH!“, das niedliche flieht) oder **ärgert** es, indem es um es herumtanzt. Das bringt etwas Erfahrung und verändert die Laune.
- **Schimmernde Wesen:** Selten (1:40) schlüpft ein Wesen in besonderer Farbe – z. B. ein goldener Wolpertinger oder ein schwarzes Einhorn. Eigene Seite im Fabelbuch.
- **Züchten:** Zwei erwachsene Wesen legen ein Herzei. Das Junge ist eine Mischung (Art eines Elternteils mit Farbe des anderen). Bestimmte Paare bringen eines von 10 **Zucht-Wesen** hervor, die es nur so gibt: Alicorn, Feuerfuchs, Eisgreif, Höllenwolf, Seehydra, Nachtfürst, Pilzfee, Gefallener Engel, Sirene, Sonnendrache.
- **Wesen-Kämpfe:** Wilde Wesen tauchen auf. Mit einem Team aus bis zu drei Wesen wird rundenbasiert gekämpft (Element-Angriffe Feuer, Wasser, Natur, Eis, Licht, Schatten mit Stärken und Schwächen, Heilen oder Erschrecken). Nach einem Sieg kann man das wilde Wesen einfangen.
- **Minispiele:** Glühwürmchen fangen, Beeren fangen, Wettrennen und Verstecken.
- **Wald gestalten:** 14 Dekorationen frei platzieren. Die Wesen spielen von selbst damit: auf der **Rutsche** rutschen, **schaukeln**, auf dem **Trampolin** hüpfen, über die **Brücke** laufen, am **Lagerfeuer** oder auf der **Bank** sitzen, am **Brunnen** trinken, im **Feenhaus** verschwinden, am **Hexenkessel** brauen, an Blumen schnuppern, vor der Statue verbeugen, am Grab heulen (niedliche erschrecken sich). Jede Deko gibt einen eigenen Bonus:
  Laterne (nachts +15 % XP), Feenhaus (Eier 20 % schneller), Brunnen (langsamer hungrig), Blumenbeet (Laune hält länger), Brücke (Aufgaben 10 % schneller), Hexenkessel (Tränke 20 % billiger), Kristall (+10 % XP), Gruselgrab (böse +10 % Gold), Bank (Energie schneller), Lagerfeuer (nachts +10 % Gold), Statue (+10 % Angriff), Schaukel (niedliche +10 % Gold), Rutsche (Minispiele +25 %), Trampolin (öfter wilde Wesen).
- **Freundschaften:** Wer oft spielt, wird Freund und bleibt gern zusammen; wer sich oft streitet, wird Rivale.
- **Jahreszeiten:** Frühling (Blüten), Sommer, Herbst (bunte Blätter) und Winter (Schnee) nach dem Kalender, mit besonderen Jahreszeiten-Eiern (Schimmer-Chance 1:5).
- **Weitere Welten:** Sonnenstrand, Vulkanhöhle und Wolkenschloss – freischaltbar, mit Lieblingswelten für bestimmte Wesen.
- **Expeditionsberichte:** Wesen erzählen, was sie erlebt haben, und bringen manchmal Schätze, Tränke oder seltene Eier mit.
- **Foto-Modus:** Kamera frei bewegen, Oberfläche ausblenden, Fotos in der Galerie speichern.
- **Steckbrief:** Geburtstag, Lieblingsessen, Eltern, bester Freund, Rivale und Lebensgeschichte.
- **Musik:** Ruhige Melodien, die sich bei Nacht und im Kampf ändern.
- **Tag & Nacht:** Ein Spieltag dauert 24 Minuten – mit Sonnenauf- und -untergang, Mond und Sternen. Nachts verdienen böse Wesen +30 % Gold, tagsüber niedliche +20 %.
- **Wetter:** Klar, Regen (+20 % Erfahrung, nasser Boden, Regentropfen) oder Nebel (böse Wesen +15 % Gold).
- **Minispiel „Glühwürmchen fangen“:** 25 Sekunden lang leuchtende Glühwürmchen antippen – goldene zählen fünffach. Bringt Gold, Erfahrung und gute Laune.
- **Zaubertränke:** Energietrank, Wachstumselixier, Festmahl (alle satt) und Brutfeuer (alle Eier sofort schlupfbereit).
- **Erfolge:** 17 Erfolge mit Gold-Belohnungen.
- **Tägliche Belohnung:** Jeden Tag Gold, am 7. Tag in Folge ein Wachstumselixier.
- **Geräusche:** Vogelgezwitscher am Tag, Grillen in der Nacht, Regen und Effektklänge (im Menü abschaltbar).

## Die Fabelwesen (37 + 10 Zucht-Wesen)
| Seltenheit | Niedlich 💖 | Böse 😈 |
|---|---|---|
| Gewöhnlich | Wolpertinger, Irrlicht, Pilzling, Fee, Zwerg | Basilisk, Gargoyle, Mimic, Unglücksrabe, Kobold |
| Selten | Einhorn, Greif, Pegasus, Nessie, Waldelfe, Meerjungfrau | Schattenwolf, Krake, Lindwurm, Vampir, Hexe |
| Episch | Kitsune, Kristalldrache, Waldhirsch, Engel | Zerberus, Hydra, Mantikor, Donnervogel, Werwolf, Troll |
| Legendär | Phönix, Qilin, Dryade | Höllendrache, Leviathan, Dämon |

Menschenähnliche Wesen sind realistisch modelliert: Gesicht mit Augenhöhlen, Augen mit Lidern, Iris und Brauen, Nase mit Nasenflügeln, Lippen, Wangenknochen und Kinn; Körper mit Muskeln, Händen mit Fingern, Knien, Waden und Stiefeln; Haut mit weichem Schimmer, Haare aus fallenden Strähnen, Kleidung mit Stoffstruktur und Falten, wehende Umhänge und Gewänder, Atmen und Umherschauen. Sie haben einen eigenen Bauplan mit Kopf, Gesicht, Haaren (3D-Haar), Armen, Beinen und Kleidung – samt Umhang (Vampir, Elfe), Hexenhut, Zipfelmütze und Bart (Zwerg), Heiligenschein (Engel), Feenflügeln, Fischschwanz (Meerjungfrau), Hauern (Troll) oder Hörnern und Flammenhänden (Dämon). Der Werwolf hat einen echten Wolfskopf mit Fell.

## Grafik
Echtzeit-3D mit Three.js:
- Realistische Tierkörper nach echten Vorbildern (Pferd, Hirsch, Hund, Fuchs, Katze, Hase, Drache, Vogel): Brustkorb, Hüfte, Beine mit Knie- und Sprunggelenk, lange Schnauzen, angelegte Federflügel
- Schlangen, Hälse und Tentakel als glatte Röhren mit Schlängel- und Wellenbewegung
- Dichter Zauberwald statt schwebender Insel: Lichtung umgeben von hunderten Bäumen (Laubbäume und Tannen in vielen Reihen, per Instancing), Büsche, umgestürzte bemooste Stämme und Waldboden bis zum Horizont im Nebel; Bäume, die die Sicht verdecken, werden automatisch durchsichtig
- Zauberbäume: knorrige Uraltbäume mit Wurzeln, leuchtende Ranken, Trauerweiden, Blütenbäume, Leuchtpilze und Feenring, Farne, bemooste Felsen, Glühwürmchen, Lichtstrahlen und Nebel
- Weiche, organische Körper: Rumpf, Kopf, Beine und Schwänze werden aus Formen verschmolzen (Signed-Distance-Felder + Surface Nets) – mit fließenden Farbübergängen
- Echtes 3D-Fell (Shell-Rendering), Mähnen und buschige Schwänze
- Augen mit strukturierter Iris und Glanz, leuchtende Augen bei bösen Wesen
- Physikalisch basierte Materialien mit Schuppen-, Feder-, Stein- und Holzstrukturen
- Himmel mit Sonne, Spiegelungen, Gegenlicht, weiche Schatten, Leuchteffekte für Flammen und Magie
- Wehendes Gras, Teich mit bewegten Wellen, Wolkenmeer unter der Insel

Dazu kommen Bloom-Leuchten, Vignette und Farbstimmung als Kino-Look, weiche Kontaktschatten unter den Wesen und tanzende Lichtmuster (Kaustik) im Teich.

Alle Fabelwesen – auch die menschlichen – sind im gleichen weichen, gemalten Stil wie Bäume und Blumen gehalten (Haare und Bärte als büschelige Volumen wie Baumkronen, weiche Gesichtszüge): matte Oberflächen, aufgehellte Schatten mit sanftem Eigenleuchten und ein zarter Lichtsaum an den Rändern.

Im Menü lässt sich die Grafik zwischen **Hoch** und **Schnell** (für ältere Handys) umschalten.

Der Spielstand wird automatisch gespeichert; Aufgaben und Brutzeiten laufen auch weiter, wenn die App geschlossen ist.
