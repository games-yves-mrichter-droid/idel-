# Onsen Idle

Ein offline spielbares Idle-Spiel rund um ein japanisches Onsen (heiße Quellen).

## Android-App (APK)
Die fertige APK liegt unter [`release/OnsenIdle.apk`](release/OnsenIdle.apk).
1. Datei aufs Handy laden (z. B. über GitHub → Datei öffnen → „Download raw file“).
2. Antippen und installieren. Beim ersten Mal fragt Android, ob Installationen aus dieser Quelle erlaubt sind → erlauben.
3. Die App läuft komplett offline.

Selbst bauen: `cd android && gradle assembleRelease` (benötigt Android SDK 34).

## Im Browser starten
- **Einfach:** `index.html` im Browser öffnen – funktioniert komplett ohne Internet.
- **Als App installieren (PWA):** Ordner über einen lokalen Webserver ausliefern (z. B. `python3 -m http.server`), im Browser öffnen und „Zum Startbildschirm hinzufügen“ wählen. Danach läuft das Spiel offline wie eine App.

## Features
- 8 Becken bauen & ausbauen, die Gold pro Sekunde erzeugen (×2 alle 25 Level)
- 13 sammelbare Mädchen (alle 21+) mit Seltenheiten R / SR / SSR / UR / LR
- Charakterseite mit Stufenaufstieg, Sternenaufstieg (Splitter), Siegel und 4 Ausrüstungsplätzen
- Werte (Angriff, Leben, Verteidigung, Tempo) und Kampfkraft bestimmen den Gastgeberin-Bonus
- Mädchen als Gastgeberinnen den Becken zuweisen → Einnahmen-Multiplikator
- Outfits schalten sich mit dem Level frei: Freizeit → Yukata → Badeanzug → Bikini → Badetuch
- Verschiedene Posen, Outfit-Galerie pro Mädchen
- Beschwörung mit zwei Bannern (Standard & Luxus mit 4× LR-Chance), SSR-Garantie bei 10er-Beschwörung, LR-Garantie nach 80 Beschwörungen
- Offline-Einnahmen (bis 12 Stunden)
- **Gratis-Menü:** Gold/Juwelen/Tickets kostenlos, Unendlich-Modus, alles freischalten
- Spielstand wird lokal gespeichert, Export/Import möglich

---

# Pfotenklinge Idle ⚔️🐱

Ein zweites Spiel im Ordner [`pfotenklinge/`](pfotenklinge/): ein Idle-Action-RPG im bunten Chibi-Cartoon-Stil.
Eine kleine Katzen-Schwertkämpferin läuft automatisch durch die Gebiete und besiegt Monster.

**Starten:** `pfotenklinge/index.html` im Browser öffnen (läuft offline).

## Features
- Automatischer Seitenscroll-Kampf mit Schadenszahlen, kritischen Treffern und Münzregen; Tippen gibt Extra-Schläge
- 5 Gebiete mit eigener Grafik und eigenen Monstern: Sonnenwiese, Goldwüste, Frostgipfel, Glutvulkan, Mondwald
- 10 Monster pro Stufe, danach ein Boss mit 30-Sekunden-Timer (verloren → Farm-Modus, Boss erneut herausfordern)
- Training mit Gold: Angriff, Leben, Krit-Chance, Krit-Schaden, Angriffstempo, Goldfund, Regeneration (×1 / ×10 / MAX)
- Ausrüstungs-Beschwörung (Waffe, Rüstung, Ring) in 6 Seltenheiten bis Mythisch; Duplikate verbessern Gegenstände, Besitzbonus
- 3 Fertigkeiten (Wirbelklinge, Donnerpfote, Katzenwut) mit Auto-Modus
- Wiedergeburt ab Stufe 3-5 für Seelensteine (dauerhafte Boni)
- Gratis-Geschenk alle 10 Minuten, Offline-Gold (bis 8 Stunden), Gratis-Menü, Export/Import des Spielstands
