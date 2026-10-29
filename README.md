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
