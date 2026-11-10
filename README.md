# SwordsSMP

A Fabric mod for Minecraft 1.21.11 that adds custom swords, items, and effects built for SMP servers.

**[Deutsche Version](README.de.md)**

Download: [Modrinth](https://modrinth.com/mod/sword-smp)

## Features

- **Custom weapons and tools**, each with its own ability: Life Stealer, Descending Dark, Thunder Sword, TNT Sword, Wind Blade, Phantom Blade, Ghost Blade, Earth Wave Sword, Chorus Slayer, Warden Blaster, Dragon Slayer, Amethyst Sword, Breacher, The Abomination, Ancient Void Relic, Gods View, Levitation Wand, TNT Rod, Reinforced Stick, and more.
- **Life Stealer:** kills grant absorption. With the `swordssmp:life_stealer_hardcore` gamerule enabled, killing a player permanently grants the killer +2 max health, once per kill.
- **Descending Dark:** hold right-click to dive; the landing explosion grows with your fall time (capped) and has a 30-second cooldown.
- **Smelter Pickaxe:** mined blocks drop their smelted result.
- **Chaos Crystal:** clears the cooldowns of the mod's special items while carried.
- **Hidden armor:** armor no longer renders on players under Invisibility II or stronger.
- **Custom effects and potions:** Corrosive Fire, Instant XP, and PVP potions, including brewing recipes.

## Installation

1. Install [Fabric Loader](https://fabricmc.net/) for Minecraft 1.21.11.
2. Download [Fabric API](https://modrinth.com/mod/fabric-api) and place it in your `mods` folder.
3. Download the latest SwordsSMP jar from [Modrinth](https://modrinth.com/mod/sword-smp) and place it in the same folder.
4. Start the game. Java 21 or newer is required, which the vanilla launcher provides automatically.

## Building from source

Requires JDK 21 or newer.

```bash
git clone https://github.com/Gladiatorsarius/swordssmp.git
cd swordssmp
./gradlew build
```

The built jar lands in `build/libs/`. Use `./gradlew runClient` to start a development client.

## License

[CC0 1.0 Universal](LICENSE)
