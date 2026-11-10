# SwordsSMP

Eine Fabric-Mod für Minecraft 1.21.11 mit eigenen Schwertern, Items und Effekten für SMP-Server.

**[English version](README.md)**

Download: [Modrinth](https://modrinth.com/mod/sword-smp)

## Features

- **Eigene Waffen und Werkzeuge**, jedes mit eigener Fähigkeit: Life Stealer, Descending Dark, Thunder Sword, TNT Sword, Wind Blade, Phantom Blade, Ghost Blade, Earth Wave Sword, Chorus Slayer, Warden Blaster, Dragon Slayer, Amethyst Sword, Breacher, The Abomination, Ancient Void Relic, Gods View, Levitation Wand, TNT Rod, Reinforced Stick und mehr.
- **Life Stealer:** Kills geben Absorption. Mit aktivierter Gamerule `swordssmp:life_stealer_hardcore` bekommt der Killer bei einem Spieler-Kill dauerhaft +2 maximale Gesundheit (1 Herz), einmal pro Kill.
- **Descending Dark:** Rechtsklick halten, um dich nach unten zu stürzen; die Landeexplosion wächst mit der Fallzeit (nach oben begrenzt) und hat einen Cooldown von 30 Sekunden.
- **Smelter Pickaxe:** Abgebaute Blöcke droppen direkt ihr geschmolzenes Ergebnis.
- **Chaos Crystal:** Setzt die Cooldowns der speziellen Items der Mod zurück, solange du es trägst.
- **Versteckte Rüstung:** Rüstung wird bei Spielern mit Unsichtbarkeit II oder stärker nicht mehr angezeigt.
- **Eigene Effekte und Tränke:** Corrosive Fire, Instant XP und PVP-Tränke, inklusive Braurezepten.

## Installation

1. Installiere den [Fabric Loader](https://fabricmc.net/) für Minecraft 1.21.11.
2. Lade die [Fabric API](https://modrinth.com/mod/fabric-api) herunter und lege sie in deinen `mods`-Ordner.
3. Lade die neueste SwordsSMP-Jar von [Modrinth](https://modrinth.com/mod/sword-smp) herunter und lege sie in denselben Ordner.
4. Starte das Spiel. Java 21 oder neuer wird benötigt und vom Vanilla-Launcher automatisch bereitgestellt.

## Aus dem Quellcode bauen

Benötigt JDK 21 oder neuer.

```bash
git clone https://github.com/Gladiatorsarius/swordssmp.git
cd swordssmp
./gradlew build
```

Die fertige Jar liegt in `build/libs/`. Mit `./gradlew runClient` startest du einen Entwicklungs-Client.

## Lizenz

[CC0 1.0 Universal](LICENSE)
