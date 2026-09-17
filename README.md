# 🦁 Mo' Creatures Reborn

<div align="center">

![Minecraft](https://img.shields.io/badge/Minecraft-1.21.1-brightgreen?style=for-the-badge&logo=minecraft)
![NeoForge](https://img.shields.io/badge/Loader-NeoForge-orange?style=for-the-badge)
![Java](https://img.shields.io/badge/Java-21-blue?style=for-the-badge&logo=openjdk)
![License](https://img.shields.io/badge/License-GPL--3.0-yellow?style=for-the-badge)
![GeckoLib](https://img.shields.io/badge/GeckoLib-4.9.2-purple?style=for-the-badge)

**The legendary creature ecosystem mod originally created by DrZhark, fully revitalized, re-engineered, and modernized for Minecraft 1.21.1 with NeoForge.**

[Features](#-features) • [The Wyvern Lair](#-the-wyvern-lair-dimension) • [Mounts & Flight](#-mounts--dynamic-flight-system) • [Installation](#-installation--dependencies) • [Compiling](#-compiling--development) • [Credits](#-credits--attributions)

---

</div>

## 📖 Overview

**Mo' Creatures Reborn** brings back one of the most iconic, nostalgic, and comprehensive creature mods in Minecraft history. Rebuilt from the ground up for modern Minecraft (**1.21.1**) on the **NeoForge** mod loader, it seamlessly merges the beloved classic aesthetics with cutting-edge Java 21 performance and smooth **GeckoLib** animation mechanics.

Whether you're exploring the wild savanna with herds of elephants, diving through deep oceans with stingrays and sharks, or soaring through the skies of the **Wyvern Lair** on the back of a tamed Wyvern, this mod breathes unmatched life and adventure into your Minecraft worlds.

---

## ✨ Features

### 🐾 Over 60+ Restored & Polished Creatures

| Category | Creatures Included |
| :--- | :--- |
| **Big Cats & Predators** | Lions, Tigers, White Tigers, Leopards, Panthers, Panthgers, Cheetahs, Grizzly Bears, Black Bears, Polar Bears, Pandas |
| **Savanna & Forest Wildlife** | Elephants, Mammoths, Deer (Stag & Doe), Boars, Bunnies, Mice, Moles, Turkeys, Ducks, Songbirds (Green, Blue, Black) |
| **Mythical & Fantasy Beasts** | Wyverns (9 variants), Manticores (Fire, Frost, Dark, Toxic), Ogres (Green, Cave, Fire), Golems, Werewolves, Wraiths, Hell Rats |
| **Equines & Special Steeds** | Horses, Nightmares, Pegasus, Unicorns, Skeleton Horses, Bat Horses, Undead Horses, Ostriches (Wild, Nether, Undead, Unicorn) |
| **Aquatic Life** | Dolphins, Sharks, Manta Rays, Stingrays, Piranhas, Jellyfish, Anchovies, Angelfish, Anglerfish, Bass, Clownfish, Goldfish, Hippo Tang |
| **Insects & Amphibians** | Elemental Scorpions (Dirt, Cave, Fire, Frost, Undead), Ants, Crickets, Flies, Fireflies, Dragonflies, Butterflies, Snails, Turtles, Frogs |

---

### 🌌 The Wyvern Lair Dimension

Enter an otherworldly realm of floating purple islands suspended high in the void:
- 🌲 **Wyvwood Trees:** Towering ancient trees with thick 2x2 trunks and expansive vibrant cyan canopies (`wyvwood_leaves`).
- 🌾 **Alien Flora & Terrain:** Lush `wyvgrass_block`, rolling hills with deep stone formations, and mysterious mushroom groves.
- 🏰 **Wyvern Towers & Nests:** Discover natural stone towers, locate wild wyverns of all elements, and obtain rare Wyvern Eggs to hatch your own loyal companions!

---

### 🦅 Mounts & Dynamic Flight System

Take your mobility to the next level with an intuitive 3D flight engine tailored for aerial mounts (Wyverns, Pegasi, Manticores, and Ostriches):

- **Realistic Ground Pace:** Ground walking and trotting are smoothly balanced to vanilla speeds.
- **Fluid 3D Aerial Controls:**
  - `Space` — Ascend smoothly / gain altitude
  - `Shift` — Descend safely towards the ground / land
  - `Ctrl` (Sprint) — Activate high-speed mid-air flight boost
  - Full pitch and yaw camera responsiveness for acrobatic turns

---

### 🦴 Taming, Breeding & Pet Management

- **Magical Amulets:** Use **Bone**, **Fairy**, **Ghost**, and **Sky Amulets** to safely capture, transport, and protect your precious companions.
- **Fishing Nets:** Easily scoop up small aquatic critters and transport them between aquariums and ponds.
- **Dedicated Pet Naming Interface:** Interactive GUI menus let you name and personalize your tamed animals on the spot.

---

### ⚔️ Elemental Armor & Weaponry

- **Scorpion Armor Sets:** Craft full armor sets from Cave, Frost, Fire, Dirt, and Undead scorpion carapaces, each granting defensive perks and full-set bonuses.
- **Combat Weapons:** Equip specialized scorpion stingers, battle axes, ninja weaponry (Katanas, Sai, Bo Staffs, Nunchaku), and ancient silver weapons infused with elemental attributes (poison, slowness, wither, and fire aspect).

---

## 📋 Installation & Dependencies

### Prerequisites
- **Minecraft:** `1.21.1`
- **Mod Loader:** `NeoForge` (Recommended version: `21.1.65` or newer)
- **Java:** `JDK 21`

### Required Mods
| Mod | Link | Purpose |
| :--- | :--- | :--- |
| **GeckoLib** | [CurseForge](https://www.curseforge.com/minecraft/mc-mods/geckolib) / [Modrinth](https://modrinth.com/mod/geckolib) | Essential for entity models, rig hierarchies, and fluid animations. |

### Optional / Recommended Mods
| Mod | Link | Purpose |
| :--- | :--- | :--- |
| **Pehkui** | [CurseForge](https://www.curseforge.com/minecraft/mc-mods/pehkui) / [Modrinth](https://modrinth.com/mod/pehkui) | Dynamic entity scaling and resizing mechanics. |

---

## 🛠️ Compiling & Development

Mo' Creatures Reborn is managed as a standard Gradle NeoForge project. To build the mod locally from source:

### 1. Clone the repository
```bash
git clone https://github.com/Landa6543/Mo-Creatures-Reborn-NeoForge.git
cd Mo-Creatures-Reborn-NeoForge
```

### 2. Compile Java sources
```bash
# Windows
.\gradlew.bat compileJava

# Linux / macOS
./gradlew compileJava
```

### 3. Build the mod `.jar`
```bash
# Windows
.\gradlew.bat build

# Linux / macOS
./gradlew build
```
The compiled mod `.jar` will be generated in `build/libs/mocreatures-1.0.0.jar`.

### 4. Run the development test client
```bash
# Windows
.\gradlew.bat runClient

# Linux / macOS
./gradlew runClient
```

---

## 📜 Credits & Attributions

This mod is an open-source community tribute and continuation built upon the foundational work of legendary creators:

- 👑 **[DrZhark](https://www.curseforge.com/members/drzharky):** Original creator and author of the legendary [Mo' Creatures mod](https://www.curseforge.com/minecraft/mc-mods/mo-creatures). All praise and homage to the pioneer of Minecraft wildlife and fantasy fauna.
- 🛠️ **[ACGaming](https://www.curseforge.com/members/acgaming):** Maintainer of [Mo' Creatures Extended](https://www.curseforge.com/minecraft/mc-mods/mo-creatures-extended), whose updated models, textures, and maintenance groundwork served as a vital cornerstone for this modern edition.
- ⚙️ **Modern Reborn Team:** Ported, overhauled, and maintained for NeoForge 1.21.1 by **TomCraft20** & **LanderAlo**.

---

## ⚖️ License

**Mo' Creatures Reborn** is licensed under the **[GNU General Public License v3.0 (GPL-3.0)](https://www.gnu.org/licenses/gpl-3.0.html)**, respecting and preserving the original licensing of DrZhark's Mo' Creatures and ACGaming's Mo' Creatures Extended.

- **Modpacks:** You are 100% welcome and encouraged to include Mo' Creatures Reborn in your public or private modpacks on CurseForge, Modrinth, and FTB!
- **Source Modifications:** You are free to fork, contribute to, and adapt the codebase under the terms and copyleft guarantees of GPL-3.0 with appropriate attribution to original authors.
