package net.mocreatures.init;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.level.block.Block;
import net.mocreatures.block.display.FireflyJarDisplayItem;
import net.mocreatures.block.display.HangingFireflyJarDisplayItem;
import net.mocreatures.item.AnchovyEggItem;
import net.mocreatures.item.AncientSilverArmorItem;
import net.mocreatures.item.AncientSilverAxeItem;
import net.mocreatures.item.AncientSilverBowItem;
import net.mocreatures.item.AncientSilverIngotItem;
import net.mocreatures.item.AncientSilverMattockItem;
import net.mocreatures.item.AncientSilverNuggetItem;
import net.mocreatures.item.AncientSilverScrapItem;
import net.mocreatures.item.AncientSilverSwordItem;
import net.mocreatures.item.AngelfishEggItem;
import net.mocreatures.item.AnglerfishEggItem;
import net.mocreatures.item.ArcticWyvernEggItem;
import net.mocreatures.item.BassEggItem;
import net.mocreatures.item.BigCatClawItem;
import net.mocreatures.item.BoneAmuletFullItem;
import net.mocreatures.item.BoneAmuletItem;
import net.mocreatures.item.CaveChitinItem;
import net.mocreatures.item.CaveScorpionArmorItem;
import net.mocreatures.item.CaveScorpionAxeItem;
import net.mocreatures.item.CaveScorpionBladeItem;
import net.mocreatures.item.CaveScorpionEggItem;
import net.mocreatures.item.CaveScorpionMattockItem;
import net.mocreatures.item.CaveScorpionStingerItem;
import net.mocreatures.item.CaveWyvernEggItem;
import net.mocreatures.item.ClownfishEggItem;
import net.mocreatures.item.CookedCrabItem;
import net.mocreatures.item.CookedDuckItem;
import net.mocreatures.item.CookedOstrichItem;
import net.mocreatures.item.CookedRatItem;
import net.mocreatures.item.CookedTurkeyItem;
import net.mocreatures.item.CookedTurtleItem;
import net.mocreatures.item.CookedVenisonItem;
import net.mocreatures.item.CraftedSaddleItem;
import net.mocreatures.item.CrystalHorseArmorItem;
import net.mocreatures.item.DarkManticoreEggItem;
import net.mocreatures.item.DiamondTusksItem;
import net.mocreatures.item.DirtScorpionEggItem;
import net.mocreatures.item.EarthChitinItem;
import net.mocreatures.item.EarthScorpionArmorItem;
import net.mocreatures.item.EarthScorpionAxeItem;
import net.mocreatures.item.EarthScorpionBladeItem;
import net.mocreatures.item.EarthScorpionMattockItem;
import net.mocreatures.item.EarthScorpionStingerItem;
import net.mocreatures.item.ElephantChestItem;
import net.mocreatures.item.ElephantGarmentItem;
import net.mocreatures.item.ElephantHarnessItem;
import net.mocreatures.item.ElephantHowdahItem;
import net.mocreatures.item.EssenceOfDarknessItem;
import net.mocreatures.item.EssenceOfFireItem;
import net.mocreatures.item.EssenceOfLightnessItem;
import net.mocreatures.item.EssenceOfUndeadItem;
import net.mocreatures.item.FairyAmuletFullItem;
import net.mocreatures.item.FairyAmuletItem;
import net.mocreatures.item.FineSilverIngotItem;
import net.mocreatures.item.FineSilverNuggetItem;
import net.mocreatures.item.FireChitinItem;
import net.mocreatures.item.FireManticoreEggItem;
import net.mocreatures.item.FireScorpionArmorItem;
import net.mocreatures.item.FireScorpionAxeItem;
import net.mocreatures.item.FireScorpionBladeItem;
import net.mocreatures.item.FireScorpionEggItem;
import net.mocreatures.item.FireScorpionMattockItem;
import net.mocreatures.item.FireScorpionStingerItem;
import net.mocreatures.item.FishingNetFullItem;
import net.mocreatures.item.FishingNetItem;
import net.mocreatures.item.FishyEggItem;
import net.mocreatures.item.FrostChitinItem;
import net.mocreatures.item.FrostManticoreEggItem;
import net.mocreatures.item.FrostScorpionArmorItem;
import net.mocreatures.item.FrostScorpionAxeItem;
import net.mocreatures.item.FrostScorpionBladeItem;
import net.mocreatures.item.FrostScorpionEggItem;
import net.mocreatures.item.FrostScorpionMattockItem;
import net.mocreatures.item.FrostScorpionStingerItem;
import net.mocreatures.item.FurArmorItem;
import net.mocreatures.item.FurItem;
import net.mocreatures.item.GhostAmuletFullItem;
import net.mocreatures.item.GhostAmuletItem;
import net.mocreatures.item.GoldFishEggItem;
import net.mocreatures.item.HeartOfDarknessItem;
import net.mocreatures.item.HeartOfFireItem;
import net.mocreatures.item.HeartOfUndeadItem;
import net.mocreatures.item.HeldPorcupineItem;
import net.mocreatures.item.HideArmorItem;
import net.mocreatures.item.HideItem;
import net.mocreatures.item.HippoTangEggItem;
import net.mocreatures.item.IronTusksItem;
import net.mocreatures.item.JungleWyvernEggItem;
import net.mocreatures.item.KomodoDragonEggItem;
import net.mocreatures.item.MammothPlatformItem;
import net.mocreatures.item.MandarinfishEggItem;
import net.mocreatures.item.MedallionItem;
import net.mocreatures.item.MotherWyvernEggItem;
import net.mocreatures.item.MountainWyvernEggItem;
import net.mocreatures.item.MysticPearItem;
import net.mocreatures.item.NetheriteTusksItem;
import net.mocreatures.item.NinjaBoStaffItem;
import net.mocreatures.item.NinjaKatanaItem;
import net.mocreatures.item.NinjaNunchakuItem;
import net.mocreatures.item.NinjaSaiItem;
import net.mocreatures.item.OmeletteItem;
import net.mocreatures.item.OstrichEggItem;
import net.mocreatures.item.PetAmuletFullItem;
import net.mocreatures.item.PetAmuletItem;
import net.mocreatures.item.PiranhaEggItem;
import net.mocreatures.item.PlainManticoreEggItem;
import net.mocreatures.item.RatBurgerItem;
import net.mocreatures.item.RawCrabItem;
import net.mocreatures.item.RawDuckItem;
import net.mocreatures.item.RawOstrichItem;
import net.mocreatures.item.RawRatItem;
import net.mocreatures.item.RawTurkeyItem;
import net.mocreatures.item.RawTurtleItem;
import net.mocreatures.item.RawVenisonItem;
import net.mocreatures.item.ReptileArmorItem;
import net.mocreatures.item.ReptileHideItem;
import net.mocreatures.item.SandWyvernEggItem;
import net.mocreatures.item.SeaWyvernEggItem;
import net.mocreatures.item.SharkAxeItem;
import net.mocreatures.item.SharkEggItem;
import net.mocreatures.item.SharkMattockItem;
import net.mocreatures.item.SharkSwordItem;
import net.mocreatures.item.SharkTeethItem;
import net.mocreatures.item.SkyAmuletFullItem;
import net.mocreatures.item.SkyAmuletItem;
import net.mocreatures.item.SugarLumpItem;
import net.mocreatures.item.SunWyvernEggItem;
import net.mocreatures.item.SwampWyvernEggItem;
import net.mocreatures.item.TameItem;
import net.mocreatures.item.ToxicManticoreEggItem;
import net.mocreatures.item.TurtleSoupItem;
import net.mocreatures.item.UndeadChitinItem;
import net.mocreatures.item.UndeadScorpionArmorItem;
import net.mocreatures.item.UndeadScorpionAxeItem;
import net.mocreatures.item.UndeadScorpionBladeItem;
import net.mocreatures.item.UndeadScorpionMattockItem;
import net.mocreatures.item.UndeadScorpionStingerItem;
import net.mocreatures.item.UnicornHornItem;
import net.mocreatures.item.WhipItem;
import net.mocreatures.item.WoodenTusksItem;
import net.mocreatures.item.WyvernPortalStaffItem;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredRegister.Items;

public class MocreaturesModItems {
   public static final Items REGISTRY = DeferredRegister.createItems("mocreatures");
   public static final DeferredItem<Item> BROWN_ANT_SPAWN_EGG = REGISTRY.register(
      "brown_ant_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.BROWN_ANT, -11848418, -10535651, new Properties())
   );
   public static final DeferredItem<Item> FIRE_ANT_SPAWN_EGG = REGISTRY.register(
      "fire_ant_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.FIRE_ANT, -10289152, -7994107, new Properties())
   );
   public static final DeferredItem<Item> RACCOON_SPAWN_EGG = REGISTRY.register(
      "raccoon_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.RACCOON, -12369085, -3552823, new Properties())
   );
   public static final DeferredItem<Item> FUR_ARMOR_HELMET = REGISTRY.register("fur_armor_helmet", FurArmorItem.Helmet::new);
   public static final DeferredItem<Item> FUR_ARMOR_CHESTPLATE = REGISTRY.register("fur_armor_chestplate", FurArmorItem.Chestplate::new);
   public static final DeferredItem<Item> FUR_ARMOR_LEGGINGS = REGISTRY.register("fur_armor_leggings", FurArmorItem.Leggings::new);
   public static final DeferredItem<Item> FUR_ARMOR_BOOTS = REGISTRY.register("fur_armor_boots", FurArmorItem.Boots::new);
   public static final DeferredItem<Item> FUR = REGISTRY.register("fur", FurItem::new);
   public static final DeferredItem<Item> DUCK_SPAWN_EGG = REGISTRY.register(
      "duck_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.DUCK, -8826330, -12689637, new Properties())
   );
   public static final DeferredItem<Item> RAW_DUCK = REGISTRY.register("raw_duck", RawDuckItem::new);
   public static final DeferredItem<Item> COOKED_DUCK = REGISTRY.register("cooked_duck", CookedDuckItem::new);
   public static final DeferredItem<Item> HIDE_ARMOR_HELMET = REGISTRY.register("hide_armor_helmet", HideArmorItem.Helmet::new);
   public static final DeferredItem<Item> HIDE_ARMOR_CHESTPLATE = REGISTRY.register("hide_armor_chestplate", HideArmorItem.Chestplate::new);
   public static final DeferredItem<Item> HIDE_ARMOR_LEGGINGS = REGISTRY.register("hide_armor_leggings", HideArmorItem.Leggings::new);
   public static final DeferredItem<Item> HIDE_ARMOR_BOOTS = REGISTRY.register("hide_armor_boots", HideArmorItem.Boots::new);
   public static final DeferredItem<Item> HIDE = REGISTRY.register("hide", HideItem::new);
   public static final DeferredItem<Item> SNAIL_SPAWN_EGG = REGISTRY.register(
      "snail_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.SNAIL, -8363720, -7317721, new Properties())
   );
   public static final DeferredItem<Item> CROCODILE_SPAWN_EGG = REGISTRY.register(
      "crocodile_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.CROCODILE, -14008278, -6518442, new Properties())
   );
   public static final DeferredItem<Item> REPTILE_HIDE = REGISTRY.register("reptile_hide", ReptileHideItem::new);
   public static final DeferredItem<Item> REPTILE_ARMOR_HELMET = REGISTRY.register("reptile_armor_helmet", ReptileArmorItem.Helmet::new);
   public static final DeferredItem<Item> REPTILE_ARMOR_CHESTPLATE = REGISTRY.register("reptile_armor_chestplate", ReptileArmorItem.Chestplate::new);
   public static final DeferredItem<Item> REPTILE_ARMOR_LEGGINGS = REGISTRY.register("reptile_armor_leggings", ReptileArmorItem.Leggings::new);
   public static final DeferredItem<Item> REPTILE_ARMOR_BOOTS = REGISTRY.register("reptile_armor_boots", ReptileArmorItem.Boots::new);
   public static final DeferredItem<Item> RAT_SPAWN_EGG = REGISTRY.register(
      "rat_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.RAT, -14474461, -25958, new Properties())
   );
   public static final DeferredItem<Item> RAW_RAT = REGISTRY.register("raw_rat", RawRatItem::new);
   public static final DeferredItem<Item> COOKED_RAT = REGISTRY.register("cooked_rat", CookedRatItem::new);
   public static final DeferredItem<Item> CRAB_SPAWN_EGG = REGISTRY.register(
      "crab_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.CRAB, -6601181, -10211817, new Properties())
   );
   public static final DeferredItem<Item> RAW_CRAB = REGISTRY.register("raw_crab", RawCrabItem::new);
   public static final DeferredItem<Item> COOKED_CRAB = REGISTRY.register("cooked_crab", CookedCrabItem::new);
   public static final DeferredItem<Item> RAT_BURGER = REGISTRY.register("rat_burger", RatBurgerItem::new);
   public static final DeferredItem<Item> TURKEY_SPAWN_EGG = REGISTRY.register(
      "turkey_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.TURKEY, -13755375, -9628395, new Properties())
   );
   public static final DeferredItem<Item> RAW_TURKEY = REGISTRY.register("raw_turkey", RawTurkeyItem::new);
   public static final DeferredItem<Item> COOKED_TURKEY = REGISTRY.register("cooked_turkey", CookedTurkeyItem::new);
   public static final DeferredItem<Item> SHARK_SPAWN_EGG = REGISTRY.register(
      "shark_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.SHARK, -7893869, -30070, new Properties())
   );
   public static final DeferredItem<Item> SHARK_TEETH = REGISTRY.register("shark_teeth", SharkTeethItem::new);
   public static final DeferredItem<Item> SHARK_SWORD = REGISTRY.register("shark_sword", SharkSwordItem::new);
   public static final DeferredItem<Item> COOKED_OSTRICH = REGISTRY.register("cooked_ostrich", CookedOstrichItem::new);
   public static final DeferredItem<Item> RAW_OSTRICH = REGISTRY.register("raw_ostrich", RawOstrichItem::new);
   public static final DeferredItem<Item> CRAFTED_SADDLE = REGISTRY.register("crafted_saddle", CraftedSaddleItem::new);
   public static final DeferredItem<Item> PET_AMULET = REGISTRY.register("pet_amulet", PetAmuletItem::new);
   public static final DeferredItem<Item> PET_AMULET_FULL = REGISTRY.register("pet_amulet_full", PetAmuletFullItem::new);
   public static final DeferredItem<Item> BROWN_OSTRICH_SPAWN_EGG = REGISTRY.register(
      "brown_ostrich_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.BROWN_OSTRICH, -11122379, -25701, new Properties())
   );
   public static final DeferredItem<Item> TURTLE_SPAWN_EGG = REGISTRY.register(
      "turtle_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.TURTLE, -13088219, -9809619, new Properties())
   );
   public static final DeferredItem<Item> NINJA_SAI = REGISTRY.register("ninja_sai", NinjaSaiItem::new);
   public static final DeferredItem<Item> NINJA_KATANA = REGISTRY.register("ninja_katana", NinjaKatanaItem::new);
   public static final DeferredItem<Item> NINJA_BO_STAFF = REGISTRY.register("ninja_bo_staff", NinjaBoStaffItem::new);
   public static final DeferredItem<Item> NINJA_NUNCHAKU = REGISTRY.register("ninja_nunchaku", NinjaNunchakuItem::new);
   public static final DeferredItem<Item> ANCIENT_SILVER_ARMOR_HELMET = REGISTRY.register("ancient_silver_armor_helmet", AncientSilverArmorItem.Helmet::new);
   public static final DeferredItem<Item> ANCIENT_SILVER_ARMOR_CHESTPLATE = REGISTRY.register(
      "ancient_silver_armor_chestplate", AncientSilverArmorItem.Chestplate::new
   );
   public static final DeferredItem<Item> ANCIENT_SILVER_ARMOR_LEGGINGS = REGISTRY.register(
      "ancient_silver_armor_leggings", AncientSilverArmorItem.Leggings::new
   );
   public static final DeferredItem<Item> ANCIENT_SILVER_ARMOR_BOOTS = REGISTRY.register("ancient_silver_armor_boots", AncientSilverArmorItem.Boots::new);
   public static final DeferredItem<Item> ANCIENT_SILVER_SCRAP = REGISTRY.register("ancient_silver_scrap", AncientSilverScrapItem::new);
   public static final DeferredItem<Item> SILVER_SKELETON_SPAWN_EGG = REGISTRY.register(
      "silver_skeleton_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.SILVER_SKELETON, -6710887, -6509882, new Properties())
   );
   public static final DeferredItem<Item> ANCIENT_SILVER_INGOT = REGISTRY.register("ancient_silver_ingot", AncientSilverIngotItem::new);
   public static final DeferredItem<Item> ANCIENT_SILVER_SWORD = REGISTRY.register("ancient_silver_sword", AncientSilverSwordItem::new);
   public static final DeferredItem<Item> ANCIENT_SILVER_NUGGET = REGISTRY.register("ancient_silver_nugget", AncientSilverNuggetItem::new);
   public static final DeferredItem<Item> ANCIENT_SILVER_MATTOCK = REGISTRY.register("ancient_silver_mattock", AncientSilverMattockItem::new);
   public static final DeferredItem<Item> ANCIENT_SILVER_AXE = REGISTRY.register("ancient_silver_axe", AncientSilverAxeItem::new);
   public static final DeferredItem<Item> ANCIENT_SILVER_BOW = REGISTRY.register("ancient_silver_bow", AncientSilverBowItem::new);
   public static final DeferredItem<Item> SHARK_MATTOCK = REGISTRY.register("shark_mattock", SharkMattockItem::new);
   public static final DeferredItem<Item> SHARK_AXE = REGISTRY.register("shark_axe", SharkAxeItem::new);
   public static final DeferredItem<Item> ANCIENT_SILVER_BLOCK = block(MocreaturesModBlocks.ANCIENT_SILVER_BLOCK);
   public static final DeferredItem<Item> FINE_SILVER_BLOCK = block(MocreaturesModBlocks.FINE_SILVER_BLOCK);
   public static final DeferredItem<Item> FINE_SILVER_INGOT = REGISTRY.register("fine_silver_ingot", FineSilverIngotItem::new);
   public static final DeferredItem<Item> FINE_SILVER_NUGGET = REGISTRY.register("fine_silver_nugget", FineSilverNuggetItem::new);
   public static final DeferredItem<Item> OSTRICH_EGG = REGISTRY.register("ostrich_egg", OstrichEggItem::new);
   public static final DeferredItem<Item> SHARK_EGG = REGISTRY.register("shark_egg", SharkEggItem::new);
   public static final DeferredItem<Item> WRAITH_SPAWN_EGG = REGISTRY.register(
      "wraith_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.WRAITH, -13421773, -10092544, new Properties())
   );
   public static final DeferredItem<Item> DIRT_SCORPION_SPAWN_EGG = REGISTRY.register(
      "dirt_scorpion_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.DIRT_SCORPION, -8433630, -8174585, new Properties())
   );
   public static final DeferredItem<Item> CAVE_SCORPION_SPAWN_EGG = REGISTRY.register(
      "cave_scorpion_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.CAVE_SCORPION, -16185079, -13948117, new Properties())
   );
   public static final DeferredItem<Item> FIRE_SCORPION_SPAWN_EGG = REGISTRY.register(
      "fire_scorpion_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.FIRE_SCORPION, -8257536, -4764160, new Properties())
   );
   public static final DeferredItem<Item> FROST_SCORPION_SPAWN_EGG = REGISTRY.register(
      "frost_scorpion_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.FROST_SCORPION, -16734285, -16753035, new Properties())
   );
   public static final DeferredItem<Item> UNDEAD_SCORPION_SPAWN_EGG = REGISTRY.register(
      "undead_scorpion_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.UNDEAD_SCORPION, -14399962, -15518438, new Properties())
   );
   public static final DeferredItem<Item> DIRT_SCORPION_EGG = REGISTRY.register("dirt_scorpion_egg", DirtScorpionEggItem::new);
   public static final DeferredItem<Item> CAVE_CHITIN = REGISTRY.register("cave_chitin", CaveChitinItem::new);
   public static final DeferredItem<Item> EARTH_CHITIN = REGISTRY.register("earth_chitin", EarthChitinItem::new);
   public static final DeferredItem<Item> FIRE_CHITIN = REGISTRY.register("fire_chitin", FireChitinItem::new);
   public static final DeferredItem<Item> FROST_CHITIN = REGISTRY.register("frost_chitin", FrostChitinItem::new);
   public static final DeferredItem<Item> UNDEAD_CHITIN = REGISTRY.register("undead_chitin", UndeadChitinItem::new);
   public static final DeferredItem<Item> CAVE_SCORPION_BLADE = REGISTRY.register("cave_scorpion_blade", CaveScorpionBladeItem::new);
   public static final DeferredItem<Item> CAVE_SCORPION_MATTOCK = REGISTRY.register("cave_scorpion_mattock", CaveScorpionMattockItem::new);
   public static final DeferredItem<Item> CAVE_SCORPION_AXE = REGISTRY.register("cave_scorpion_axe", CaveScorpionAxeItem::new);
   public static final DeferredItem<Item> EARTH_SCORPION_BLADE = REGISTRY.register("earth_scorpion_blade", EarthScorpionBladeItem::new);
   public static final DeferredItem<Item> EARTH_SCORPION_MATTOCK = REGISTRY.register("earth_scorpion_mattock", EarthScorpionMattockItem::new);
   public static final DeferredItem<Item> EARTH_SCORPION_AXE = REGISTRY.register("earth_scorpion_axe", EarthScorpionAxeItem::new);
   public static final DeferredItem<Item> FIRE_SCORPION_BLADE = REGISTRY.register("fire_scorpion_blade", FireScorpionBladeItem::new);
   public static final DeferredItem<Item> FIRE_SCORPION_MATTOCK = REGISTRY.register("fire_scorpion_mattock", FireScorpionMattockItem::new);
   public static final DeferredItem<Item> FIRE_SCORPION_AXE = REGISTRY.register("fire_scorpion_axe", FireScorpionAxeItem::new);
   public static final DeferredItem<Item> FROST_SCORPION_BLADE = REGISTRY.register("frost_scorpion_blade", FrostScorpionBladeItem::new);
   public static final DeferredItem<Item> FROST_SCORPION_MATTOCK = REGISTRY.register("frost_scorpion_mattock", FrostScorpionMattockItem::new);
   public static final DeferredItem<Item> FROST_SCORPION_AXE = REGISTRY.register("frost_scorpion_axe", FrostScorpionAxeItem::new);
   public static final DeferredItem<Item> UNDEAD_SCORPION_BLADE = REGISTRY.register("undead_scorpion_blade", UndeadScorpionBladeItem::new);
   public static final DeferredItem<Item> UNDEAD_SCORPION_MATTOCK = REGISTRY.register("undead_scorpion_mattock", UndeadScorpionMattockItem::new);
   public static final DeferredItem<Item> UNDEAD_SCORPION_AXE = REGISTRY.register("undead_scorpion_axe", UndeadScorpionAxeItem::new);
   public static final DeferredItem<Item> CAVE_SCORPION_ARMOR_HELMET = REGISTRY.register("cave_scorpion_armor_helmet", CaveScorpionArmorItem.Helmet::new);
   public static final DeferredItem<Item> CAVE_SCORPION_ARMOR_CHESTPLATE = REGISTRY.register(
      "cave_scorpion_armor_chestplate", CaveScorpionArmorItem.Chestplate::new
   );
   public static final DeferredItem<Item> CAVE_SCORPION_ARMOR_LEGGINGS = REGISTRY.register("cave_scorpion_armor_leggings", CaveScorpionArmorItem.Leggings::new);
   public static final DeferredItem<Item> CAVE_SCORPION_ARMOR_BOOTS = REGISTRY.register("cave_scorpion_armor_boots", CaveScorpionArmorItem.Boots::new);
   public static final DeferredItem<Item> EARTH_SCORPION_ARMOR_HELMET = REGISTRY.register("earth_scorpion_armor_helmet", EarthScorpionArmorItem.Helmet::new);
   public static final DeferredItem<Item> EARTH_SCORPION_ARMOR_CHESTPLATE = REGISTRY.register(
      "earth_scorpion_armor_chestplate", EarthScorpionArmorItem.Chestplate::new
   );
   public static final DeferredItem<Item> EARTH_SCORPION_ARMOR_LEGGINGS = REGISTRY.register(
      "earth_scorpion_armor_leggings", EarthScorpionArmorItem.Leggings::new
   );
   public static final DeferredItem<Item> EARTH_SCORPION_ARMOR_BOOTS = REGISTRY.register("earth_scorpion_armor_boots", EarthScorpionArmorItem.Boots::new);
   public static final DeferredItem<Item> FIRE_SCORPION_ARMOR_HELMET = REGISTRY.register("fire_scorpion_armor_helmet", FireScorpionArmorItem.Helmet::new);
   public static final DeferredItem<Item> FIRE_SCORPION_ARMOR_CHESTPLATE = REGISTRY.register(
      "fire_scorpion_armor_chestplate", FireScorpionArmorItem.Chestplate::new
   );
   public static final DeferredItem<Item> FIRE_SCORPION_ARMOR_LEGGINGS = REGISTRY.register("fire_scorpion_armor_leggings", FireScorpionArmorItem.Leggings::new);
   public static final DeferredItem<Item> FIRE_SCORPION_ARMOR_BOOTS = REGISTRY.register("fire_scorpion_armor_boots", FireScorpionArmorItem.Boots::new);
   public static final DeferredItem<Item> FROST_SCORPION_ARMOR_HELMET = REGISTRY.register("frost_scorpion_armor_helmet", FrostScorpionArmorItem.Helmet::new);
   public static final DeferredItem<Item> FROST_SCORPION_ARMOR_CHESTPLATE = REGISTRY.register(
      "frost_scorpion_armor_chestplate", FrostScorpionArmorItem.Chestplate::new
   );
   public static final DeferredItem<Item> FROST_SCORPION_ARMOR_LEGGINGS = REGISTRY.register(
      "frost_scorpion_armor_leggings", FrostScorpionArmorItem.Leggings::new
   );
   public static final DeferredItem<Item> FROST_SCORPION_ARMOR_BOOTS = REGISTRY.register("frost_scorpion_armor_boots", FrostScorpionArmorItem.Boots::new);
   public static final DeferredItem<Item> UNDEAD_SCORPION_ARMOR_HELMET = REGISTRY.register("undead_scorpion_armor_helmet", UndeadScorpionArmorItem.Helmet::new);
   public static final DeferredItem<Item> UNDEAD_SCORPION_ARMOR_CHESTPLATE = REGISTRY.register(
      "undead_scorpion_armor_chestplate", UndeadScorpionArmorItem.Chestplate::new
   );
   public static final DeferredItem<Item> UNDEAD_SCORPION_ARMOR_LEGGINGS = REGISTRY.register(
      "undead_scorpion_armor_leggings", UndeadScorpionArmorItem.Leggings::new
   );
   public static final DeferredItem<Item> UNDEAD_SCORPION_ARMOR_BOOTS = REGISTRY.register("undead_scorpion_armor_boots", UndeadScorpionArmorItem.Boots::new);
   public static final DeferredItem<Item> CAVE_SCORPION_STINGER = REGISTRY.register("cave_scorpion_stinger", CaveScorpionStingerItem::new);
   public static final DeferredItem<Item> EARTH_SCORPION_STINGER = REGISTRY.register("earth_scorpion_stinger", EarthScorpionStingerItem::new);
   public static final DeferredItem<Item> FIRE_SCORPION_STINGER = REGISTRY.register("fire_scorpion_stinger", FireScorpionStingerItem::new);
   public static final DeferredItem<Item> FROST_SCORPION_STINGER = REGISTRY.register("frost_scorpion_stinger", FrostScorpionStingerItem::new);
   public static final DeferredItem<Item> UNDEAD_SCORPION_STINGER = REGISTRY.register("undead_scorpion_stinger", UndeadScorpionStingerItem::new);
   public static final DeferredItem<Item> CAVE_SCORPION_EGG = REGISTRY.register("cave_scorpion_egg", CaveScorpionEggItem::new);
   public static final DeferredItem<Item> FIRE_SCORPION_EGG = REGISTRY.register("fire_scorpion_egg", FireScorpionEggItem::new);
   public static final DeferredItem<Item> FROST_SCORPION_EGG = REGISTRY.register("frost_scorpion_egg", FrostScorpionEggItem::new);
   public static final DeferredItem<Item> ESSENCE_OF_UNDEAD = REGISTRY.register("essence_of_undead", EssenceOfUndeadItem::new);
   public static final DeferredItem<Item> ESSENCE_OF_DARKNESS = REGISTRY.register("essence_of_darkness", EssenceOfDarknessItem::new);
   public static final DeferredItem<Item> ESSENCE_OF_LIGHTNESS = REGISTRY.register("essence_of_lightness", EssenceOfLightnessItem::new);
   public static final DeferredItem<Item> ESSENCE_OF_FIRE = REGISTRY.register("essence_of_fire", EssenceOfFireItem::new);
   public static final DeferredItem<Item> HEART_OF_DARKNESS = REGISTRY.register("heart_of_darkness", HeartOfDarknessItem::new);
   public static final DeferredItem<Item> HEART_OF_FIRE = REGISTRY.register("heart_of_fire", HeartOfFireItem::new);
   public static final DeferredItem<Item> HEART_OF_UNDEAD = REGISTRY.register("heart_of_undead", HeartOfUndeadItem::new);
   public static final DeferredItem<Item> FISHING_NET = REGISTRY.register("fishing_net", FishingNetItem::new);
   public static final DeferredItem<Item> FISHING_NET_FULL = REGISTRY.register("fishing_net_full", FishingNetFullItem::new);
   public static final DeferredItem<Item> FIRE_WRAITH_SPAWN_EGG = REGISTRY.register(
      "fire_wraith_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.FIRE_WRAITH, -10092544, -16777216, new Properties())
   );
   public static final DeferredItem<Item> HELL_RAT_SPAWN_EGG = REGISTRY.register(
      "hell_rat_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.HELL_RAT, -10092544, -6737152, new Properties())
   );
   public static final DeferredItem<Item> BLACK_BIRD_SPAWN_EGG = REGISTRY.register(
      "black_bird_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.BLACK_BIRD, -16777216, -13421773, new Properties())
   );
   public static final DeferredItem<Item> BLUE_BIRD_SPAWN_EGG = REGISTRY.register(
      "blue_bird_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.BLUE_BIRD, -16737844, -3355444, new Properties())
   );
   public static final DeferredItem<Item> GREEN_BIRD_SPAWN_EGG = REGISTRY.register(
      "green_bird_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.GREEN_BIRD, -13382656, -3355444, new Properties())
   );
   public static final DeferredItem<Item> RED_BIRD_SPAWN_EGG = REGISTRY.register(
      "red_bird_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.RED_BIRD, -3407872, -3355444, new Properties())
   );
   public static final DeferredItem<Item> WHITE_BIRD_SPAWN_EGG = REGISTRY.register(
      "white_bird_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.WHITE_BIRD, -1, -3355444, new Properties())
   );
   public static final DeferredItem<Item> YELLOW_BIRD_SPAWN_EGG = REGISTRY.register(
      "yellow_bird_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.YELLOW_BIRD, -3355648, -3355444, new Properties())
   );
   public static final DeferredItem<Item> OAK_ENT_SPAWN_EGG = REGISTRY.register(
      "oak_ent_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.OAK_ENT, -11847643, -13349085, new Properties())
   );
   public static final DeferredItem<Item> BIRCH_ENT_SPAWN_EGG = REGISTRY.register(
      "birch_ent_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.BIRCH_ENT, -2500135, -15329770, new Properties())
   );
   public static final DeferredItem<Item> DEER_DOE_SPAWN_EGG = REGISTRY.register(
      "deer_doe_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.DEER_DOE, -6716844, -6716844, new Properties())
   );
   public static final DeferredItem<Item> DEER_STAG_SPAWN_EGG = REGISTRY.register(
      "deer_stag_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.DEER_STAG, -6716844, -6716844, new Properties())
   );
   public static final DeferredItem<Item> BONE_AMULET = REGISTRY.register("bone_amulet", BoneAmuletItem::new);
   public static final DeferredItem<Item> BONE_AMULET_FULL = REGISTRY.register("bone_amulet_full", BoneAmuletFullItem::new);
   public static final DeferredItem<Item> GHOST_AMULET = REGISTRY.register("ghost_amulet", GhostAmuletItem::new);
   public static final DeferredItem<Item> GHOST_AMULET_FULL = REGISTRY.register("ghost_amulet_full", GhostAmuletFullItem::new);
   public static final DeferredItem<Item> FAIRY_AMULET = REGISTRY.register("fairy_amulet", FairyAmuletItem::new);
   public static final DeferredItem<Item> FAIRY_AMULET_FULL = REGISTRY.register("fairy_amulet_full", FairyAmuletFullItem::new);
   public static final DeferredItem<Item> SKY_AMULET = REGISTRY.register("sky_amulet", SkyAmuletItem::new);
   public static final DeferredItem<Item> SKY_AMULET_FULL = REGISTRY.register("sky_amulet_full", SkyAmuletFullItem::new);
   public static final DeferredItem<Item> RAW_TURTLE = REGISTRY.register("raw_turtle", RawTurtleItem::new);
   public static final DeferredItem<Item> COOKED_TURTLE = REGISTRY.register("cooked_turtle", CookedTurtleItem::new);
   public static final DeferredItem<Item> TURTLE_SOUP = REGISTRY.register("turtle_soup", TurtleSoupItem::new);
   public static final DeferredItem<Item> RAW_VENISON = REGISTRY.register("raw_venison", RawVenisonItem::new);
   public static final DeferredItem<Item> COOKED_VENISON = REGISTRY.register("cooked_venison", CookedVenisonItem::new);
   public static final DeferredItem<Item> BROWN_BUNNY_SPAWN_EGG = REGISTRY.register(
      "brown_bunny_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.BROWN_BUNNY, -5213919, -2253259, new Properties())
   );
   public static final DeferredItem<Item> KOMODO_DRAGON_SPAWN_EGG = REGISTRY.register(
      "komodo_dragon_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.KOMODO_DRAGON, -10263464, -6591123, new Properties())
   );
   public static final DeferredItem<Item> KOMODO_DRAGON_EGG = REGISTRY.register("komodo_dragon_egg", KomodoDragonEggItem::new);
   public static final DeferredItem<Item> KITTY_A_SPAWN_EGG = REGISTRY.register(
      "kitty_a_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.KITTY_A, -1912680, -3894638, new Properties())
   );
   public static final DeferredItem<Item> MEDALLION = REGISTRY.register("medallion", MedallionItem::new);
   public static final DeferredItem<Item> WHIP = REGISTRY.register("whip", WhipItem::new);
   public static final DeferredItem<Item> MANTA_RAY_SPAWN_EGG = REGISTRY.register(
      "manta_ray_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.MANTA_RAY, -7895161, -8946031, new Properties())
   );
   public static final DeferredItem<Item> STING_RAY_SPAWN_EGG = REGISTRY.register(
      "sting_ray_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.STING_RAY, -10728651, -6184543, new Properties())
   );
   public static final DeferredItem<Item> UNICORN_HORN = REGISTRY.register("unicorn_horn", UnicornHornItem::new);
   public static final DeferredItem<Item> OMELETTE = REGISTRY.register("omelette", OmeletteItem::new);
   public static final DeferredItem<Item> WYVERN_PORTAL_STAFF = REGISTRY.register("wyvern_portal_staff", WyvernPortalStaffItem::new);
   public static final DeferredItem<Item> CAVE_OGRE_1_SPAWN_EGG = REGISTRY.register(
      "cave_ogre_1_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.CAVE_OGRE_1, -9589562, -4799781, new Properties())
   );
   public static final DeferredItem<Item> FIRE_OGRE_1_SPAWN_EGG = REGISTRY.register(
      "fire_ogre_1_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.FIRE_OGRE_1, -6552572, -3316480, new Properties())
   );
   public static final DeferredItem<Item> GREEN_OGRE_1_SPAWN_EGG = REGISTRY.register(
      "green_ogre_1_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.GREEN_OGRE_1, -14206430, -14606047, new Properties())
   );
   public static final DeferredItem<Item> SMALL_BEE_SPAWN_EGG = REGISTRY.register(
      "small_bee_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.SMALL_BEE, -3355648, -16777216, new Properties())
   );
   public static final DeferredItem<Item> GRIZZLY_BEAR_SPAWN_EGG = REGISTRY.register(
      "grizzly_bear_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.GRIZZLY_BEAR, -13753580, -12769002, new Properties())
   );
   public static final DeferredItem<Item> BLACK_BEAR_SPAWN_EGG = REGISTRY.register(
      "black_bear_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.BLACK_BEAR, -16777216, -12769002, new Properties())
   );
   public static final DeferredItem<Item> PANDA_BEAR_SPAWN_EGG = REGISTRY.register(
      "panda_bear_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.PANDA_BEAR, -16777216, -1, new Properties())
   );
   public static final DeferredItem<Item> POLAR_BEAR_SPAWN_EGG = REGISTRY.register(
      "polar_bear_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.POLAR_BEAR, -1, -3355444, new Properties())
   );
   public static final DeferredItem<Item> BOAR_SPAWN_EGG = REGISTRY.register(
      "boar_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.BOAR, -13884906, -7039852, new Properties())
   );
   public static final DeferredItem<Item> BUTTERFLY_SPAWN_EGG = REGISTRY.register(
      "butterfly_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.BUTTERFLY, -65536, -16777216, new Properties())
   );
   public static final DeferredItem<Item> MOTH_SPAWN_EGG = REGISTRY.register(
      "moth_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.MOTH, -11124204, -16777216, new Properties())
   );
   public static final DeferredItem<Item> CRICKET_SPAWN_EGG = REGISTRY.register(
      "cricket_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.CRICKET, -11124204, -11584479, new Properties())
   );
   public static final DeferredItem<Item> DRAGONFLY_SPAWN_EGG = REGISTRY.register(
      "dragonfly_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.DRAGONFLY, -16711681, -855310, new Properties())
   );
   public static final DeferredItem<Item> FIREFLY_SPAWN_EGG = REGISTRY.register(
      "firefly_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.FIREFLY, -16777216, -13382656, new Properties())
   );
   public static final DeferredItem<Item> FLY_SPAWN_EGG = REGISTRY.register(
      "fly_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.FLY, -13421773, -3355444, new Properties())
   );
   public static final DeferredItem<Item> FISHY_SPAWN_EGG = REGISTRY.register(
      "fishy_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.FISHY, -16777012, -256, new Properties())
   );
   public static final DeferredItem<Item> FISHY_EGG = REGISTRY.register("fishy_egg", FishyEggItem::new);
   public static final DeferredItem<Item> ROACH_SPAWN_EGG = REGISTRY.register(
      "roach_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.ROACH, -13425642, -11649243, new Properties())
   );
   public static final DeferredItem<Item> ANCHOVY_SPAWN_EGG = REGISTRY.register(
      "anchovy_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.ANCHOVY, -6648715, -5855578, new Properties())
   );
   public static final DeferredItem<Item> ANCHOVY_EGG = REGISTRY.register("anchovy_egg", AnchovyEggItem::new);
   public static final DeferredItem<Item> GOLD_FISH_SPAWN_EGG = REGISTRY.register(
      "gold_fish_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.GOLD_FISH, -48384, -20480, new Properties())
   );
   public static final DeferredItem<Item> GOLD_FISH_EGG = REGISTRY.register("gold_fish_egg", GoldFishEggItem::new);
   public static final DeferredItem<Item> ANGLERFISH_EGG = REGISTRY.register("anglerfish_egg", AnglerfishEggItem::new);
   public static final DeferredItem<Item> ANGLERFISH_SPAWN_EGG = REGISTRY.register(
      "anglerfish_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.ANGLERFISH, -13292760, -16726837, new Properties())
   );
   public static final DeferredItem<Item> ANGELFISH_SPAWN_EGG = REGISTRY.register(
      "angelfish_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.ANGELFISH, -1710619, -659886, new Properties())
   );
   public static final DeferredItem<Item> ANGELFISH_EGG = REGISTRY.register("angelfish_egg", AngelfishEggItem::new);
   public static final DeferredItem<Item> CLOWNFISH_SPAWN_EGG = REGISTRY.register(
      "clownfish_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.CLOWNFISH, -37632, -3092272, new Properties())
   );
   public static final DeferredItem<Item> CLOWNFISH_EGG = REGISTRY.register("clownfish_egg", ClownfishEggItem::new);
   public static final DeferredItem<Item> HIPPO_TANG_SPAWN_EGG = REGISTRY.register(
      "hippo_tang_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.HIPPO_TANG, -13421569, -154, new Properties())
   );
   public static final DeferredItem<Item> HIPPO_TANG_EGG = REGISTRY.register("hippo_tang_egg", HippoTangEggItem::new);
   public static final DeferredItem<Item> MANDARINFISH_SPAWN_EGG = REGISTRY.register(
      "mandarinfish_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.MANDARINFISH, -39424, -16776961, new Properties())
   );
   public static final DeferredItem<Item> MANDARINFISH_EGG = REGISTRY.register("mandarinfish_egg", MandarinfishEggItem::new);
   public static final DeferredItem<Item> PIRANHA_SPAWN_EGG = REGISTRY.register(
      "piranha_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.PIRANHA, -10989488, -12312544, new Properties())
   );
   public static final DeferredItem<Item> PIRANHA_EGG = REGISTRY.register("piranha_egg", PiranhaEggItem::new);
   public static final DeferredItem<Item> GLASS_JAR = block(MocreaturesModBlocks.GLASS_JAR);
   public static final DeferredItem<Item> FIREFLY_JAR = REGISTRY.register(
      MocreaturesModBlocks.FIREFLY_JAR.getId().getPath(), () -> new FireflyJarDisplayItem((Block)MocreaturesModBlocks.FIREFLY_JAR.get(), new Properties())
   );
   public static final DeferredItem<Item> HANGING_FIREFLY_JAR = REGISTRY.register(
      MocreaturesModBlocks.HANGING_FIREFLY_JAR.getId().getPath(),
      () -> new HangingFireflyJarDisplayItem((Block)MocreaturesModBlocks.HANGING_FIREFLY_JAR.get(), new Properties())
   );
   public static final DeferredItem<Item> HANGING_GLASS_JAR = block(MocreaturesModBlocks.HANGING_GLASS_JAR);
   public static final DeferredItem<Item> MINI_GOLEM_SPAWN_EGG = REGISTRY.register(
      "mini_golem_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.MINI_GOLEM, -6710887, -13582608, new Properties())
   );
   public static final DeferredItem<Item> MANTICORE_SPAWN_EGG = REGISTRY.register(
      "manticore_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.MANTICORE, -8168137, -13430511, new Properties())
   );
   public static final DeferredItem<Item> PLAIN_MANTICORE_EGG = REGISTRY.register("plain_manticore_egg", PlainManticoreEggItem::new);
   public static final DeferredItem<Item> DARK_MANTICORE_SPAWN_EGG = REGISTRY.register(
      "dark_manticore_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.DARK_MANTICORE, -14342875, -15395563, new Properties())
   );
   public static final DeferredItem<Item> FIRE_MANTICORE_SPAWN_EGG = REGISTRY.register(
      "fire_manticore_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.FIRE_MANTICORE, -8257536, -12645878, new Properties())
   );
   public static final DeferredItem<Item> FROST_MANTICORE_SPAWN_EGG = REGISTRY.register(
      "frost_manticore_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.FROST_MANTICORE, -11637395, -14127239, new Properties())
   );
   public static final DeferredItem<Item> TOXIC_MANTICORE_SPAWN_EGG = REGISTRY.register(
      "toxic_manticore_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.TOXIC_MANTICORE, -13613528, -14536418, new Properties())
   );
   public static final DeferredItem<Item> DARK_MANTICORE_EGG = REGISTRY.register("dark_manticore_egg", DarkManticoreEggItem::new);
   public static final DeferredItem<Item> FIRE_MANTICORE_EGG = REGISTRY.register("fire_manticore_egg", FireManticoreEggItem::new);
   public static final DeferredItem<Item> FROST_MANTICORE_EGG = REGISTRY.register("frost_manticore_egg", FrostManticoreEggItem::new);
   public static final DeferredItem<Item> TOXIC_MANTICORE_EGG = REGISTRY.register("toxic_manticore_egg", ToxicManticoreEggItem::new);
   public static final DeferredItem<Item> BIG_CAT_CLAW = REGISTRY.register("big_cat_claw", BigCatClawItem::new);
   public static final DeferredItem<Item> BASS_SPAWN_EGG = REGISTRY.register(
      "bass_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.BASS, -12494027, -7566250, new Properties())
   );
   public static final DeferredItem<Item> BASS_EGG = REGISTRY.register("bass_egg", BassEggItem::new);
   public static final DeferredItem<Item> MAGGOT_SPAWN_EGG = REGISTRY.register(
      "maggot_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.MAGGOT, -5859980, -6119077, new Properties())
   );
   public static final DeferredItem<Item> ELEPHANT_HARNESS = REGISTRY.register("elephant_harness", ElephantHarnessItem::new);
   public static final DeferredItem<Item> ELEPHANT_CHEST = REGISTRY.register("elephant_chest", ElephantChestItem::new);
   public static final DeferredItem<Item> ELEPHANT_GARMENT = REGISTRY.register("elephant_garment", ElephantGarmentItem::new);
   public static final DeferredItem<Item> ELEPHANT_HOWDAH = REGISTRY.register("elephant_howdah", ElephantHowdahItem::new);
   public static final DeferredItem<Item> MAMMOTH_PLATFORM = REGISTRY.register("mammoth_platform", MammothPlatformItem::new);
   public static final DeferredItem<Item> ELEPHANT_SPAWN_EGG = REGISTRY.register(
      "elephant_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.ELEPHANT, -11251889, -5921371, new Properties())
   );
   public static final DeferredItem<Item> SUGAR_LUMP = REGISTRY.register("sugar_lump", SugarLumpItem::new);
   public static final DeferredItem<Item> WOODEN_TUSKS = REGISTRY.register("wooden_tusks", WoodenTusksItem::new);
   public static final DeferredItem<Item> IRON_TUSKS = REGISTRY.register("iron_tusks", IronTusksItem::new);
   public static final DeferredItem<Item> DIAMOND_TUSKS = REGISTRY.register("diamond_tusks", DiamondTusksItem::new);
   public static final DeferredItem<Item> NETHERITE_TUSKS = REGISTRY.register("netherite_tusks", NetheriteTusksItem::new);
   public static final DeferredItem<Item> MOLE_SPAWN_EGG = REGISTRY.register(
      "mole_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.MOLE, -16777216, -13159, new Properties())
   );
   public static final DeferredItem<Item> MOUSE_SPAWN_EGG = REGISTRY.register(
      "mouse_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.MOUSE, -11388383, -3440255, new Properties())
   );
   public static final DeferredItem<Item> SMALL_MALE_GOAT_SPAWN_EGG = REGISTRY.register(
      "small_male_goat_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.SMALL_MALE_GOAT, -8421505, -13290187, new Properties())
   );
   public static final DeferredItem<Item> BIG_GOLEM_SPAWN_EGG = REGISTRY.register(
      "big_golem_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.BIG_GOLEM, -6710887, -13582608, new Properties())
   );
   public static final DeferredItem<Item> WILD_WOLF_SPAWN_EGG = REGISTRY.register(
      "wild_wolf_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.WILD_WOLF, -6710887, -5265240, new Properties())
   );
   public static final DeferredItem<Item> JELLYFISH_SPAWN_EGG = REGISTRY.register(
      "jellyfish_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.JELLYFISH, -3368449, -6520138, new Properties())
   );
   public static final DeferredItem<Item> BROWN_WEREWOLF_SPAWN_EGG = REGISTRY.register(
      "brown_werewolf_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.BROWN_WEREWOLF, -13688044, -13031920, new Properties())
   );
   public static final DeferredItem<Item> WHITE_WEREWOLF_SPAWN_EGG = REGISTRY.register(
      "white_werewolf_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.WHITE_WEREWOLF, -1, -6842473, new Properties())
   );
   public static final DeferredItem<Item> BLACK_WEREWOLF_SPAWN_EGG = REGISTRY.register(
      "black_werewolf_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.BLACK_WEREWOLF, -16185079, -14935012, new Properties())
   );
   public static final DeferredItem<Item> FIRE_WEREWOLF_SPAWN_EGG = REGISTRY.register(
      "fire_werewolf_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.FIRE_WEREWOLF, -12643576, -4568575, new Properties())
   );
   public static final DeferredItem<Item> HUMAN_WEREWOLF_SPAWN_EGG = REGISTRY.register(
      "human_werewolf_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.HUMAN_WEREWOLF, -3299966, -9539986, new Properties())
   );
   public static final DeferredItem<Item> PORCUPINE_SPAWN_EGG = REGISTRY.register(
      "porcupine_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.PORCUPINE, -6842473, -15132391, new Properties())
   );
   public static final DeferredItem<Item> HELD_PORCUPINE = REGISTRY.register("held_porcupine", HeldPorcupineItem::new);
   public static final DeferredItem<Item> TAME = REGISTRY.register("tame", TameItem::new);
   public static final DeferredItem<Item> WYVERN_SPAWN_EGG = REGISTRY.register(
      "wyvern_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.WYVERN, -5665450, -4543402, new Properties())
   );
   public static final DeferredItem<Item> WYVGRASS_BLOCK = block(MocreaturesModBlocks.WYVGRASS_BLOCK);
   public static final DeferredItem<Item> WYVDIRT = block(MocreaturesModBlocks.WYVDIRT);
   public static final DeferredItem<Item> WYVSTONE = block(MocreaturesModBlocks.WYVSTONE);
   public static final DeferredItem<Item> WYVWOOD_LOG = block(MocreaturesModBlocks.WYVWOOD_LOG);
   public static final DeferredItem<Item> WYVWOOD_LEAVES = block(MocreaturesModBlocks.WYVWOOD_LEAVES);
   public static final DeferredItem<Item> WYVGRASS = block(MocreaturesModBlocks.WYVGRASS);
   public static final DeferredItem<Item> ARCTIC_WYVERN_EGG = REGISTRY.register("arctic_wyvern_egg", ArcticWyvernEggItem::new);
   public static final DeferredItem<Item> CAVE_WYVERN_EGG = REGISTRY.register("cave_wyvern_egg", CaveWyvernEggItem::new);
   public static final DeferredItem<Item> JUNGLE_WYVERN_EGG = REGISTRY.register("jungle_wyvern_egg", JungleWyvernEggItem::new);
   public static final DeferredItem<Item> MOUNTAIN_WYVERN_EGG = REGISTRY.register("mountain_wyvern_egg", MountainWyvernEggItem::new);
   public static final DeferredItem<Item> SAND_WYVERN_EGG = REGISTRY.register("sand_wyvern_egg", SandWyvernEggItem::new);
   public static final DeferredItem<Item> SEA_WYVERN_EGG = REGISTRY.register("sea_wyvern_egg", SeaWyvernEggItem::new);
   public static final DeferredItem<Item> SUN_WYVERN_EGG = REGISTRY.register("sun_wyvern_egg", SunWyvernEggItem::new);
   public static final DeferredItem<Item> SWAMP_WYVERN_EGG = REGISTRY.register("swamp_wyvern_egg", SwampWyvernEggItem::new);
   public static final DeferredItem<Item> MOTHER_WYVERN_EGG = REGISTRY.register("mother_wyvern_egg", MotherWyvernEggItem::new);
   public static final DeferredItem<Item> WYVWOOD_PLANKS = block(MocreaturesModBlocks.WYVWOOD_PLANKS);
   public static final DeferredItem<Item> COBBLED_WYVSTONE = block(MocreaturesModBlocks.COBBLED_WYVSTONE);
   public static final DeferredItem<Item> WYVSTONE_DIAMOND_ORE = block(MocreaturesModBlocks.WYVSTONE_DIAMOND_ORE);
   public static final DeferredItem<Item> WYVSTONE_IRON_ORE = block(MocreaturesModBlocks.WYVSTONE_IRON_ORE);
   public static final DeferredItem<Item> WYVSTONE_GOLD_ORE = block(MocreaturesModBlocks.WYVSTONE_GOLD_ORE);
   public static final DeferredItem<Item> WYVSTONE_EMERALD_ORE = block(MocreaturesModBlocks.WYVSTONE_EMERALD_ORE);
   public static final DeferredItem<Item> WYVSTONE_LAPIS_ORE = block(MocreaturesModBlocks.WYVSTONE_LAPIS_ORE);
   public static final DeferredItem<Item> DEEP_WYVSTONE = block(MocreaturesModBlocks.DEEP_WYVSTONE);
   public static final DeferredItem<Item> COBBLED_DEEP_WYVSTONE = block(MocreaturesModBlocks.COBBLED_DEEP_WYVSTONE);
   public static final DeferredItem<Item> WYVSTONE_REDSTONE_ORE = block(MocreaturesModBlocks.WYVSTONE_REDSTONE_ORE);
   public static final DeferredItem<Item> WYVWOOD_SAPLING = block(MocreaturesModBlocks.WYVWOOD_SAPLING);
   public static final DeferredItem<Item> SILVER_SAND = block(MocreaturesModBlocks.SILVER_SAND);
   public static final DeferredItem<Item> SILVER_SANDSTONE = block(MocreaturesModBlocks.SILVER_SANDSTONE);
   public static final DeferredItem<Item> SMOOTH_SILVER_SANDSTONE = block(MocreaturesModBlocks.SMOOTH_SILVER_SANDSTONE);
   public static final DeferredItem<Item> CUT_SILVER_SANDSTONE = block(MocreaturesModBlocks.CUT_SILVER_SANDSTONE);
   public static final DeferredItem<Item> CHISELED_SILVER_SANDSTONE = block(MocreaturesModBlocks.CHISELED_SILVER_SANDSTONE);
   public static final DeferredItem<Item> SILVER_SANDSTONE_SLAB = block(MocreaturesModBlocks.SILVER_SANDSTONE_SLAB);
   public static final DeferredItem<Item> CUT_SILVER_SANDSTONE_SLAB = block(MocreaturesModBlocks.CUT_SILVER_SANDSTONE_SLAB);
   public static final DeferredItem<Item> SMOOTH_SILVER_SANDSTONE_SLAB = block(MocreaturesModBlocks.SMOOTH_SILVER_SANDSTONE_SLAB);
   public static final DeferredItem<Item> GLEAMING_GLASS = block(MocreaturesModBlocks.GLEAMING_GLASS);
   public static final DeferredItem<Item> GLEAMING_GLASS_PANE = block(MocreaturesModBlocks.GLEAMING_GLASS_PANE);
   public static final DeferredItem<Item> SILVER_SANDSTONE_STAIRS = block(MocreaturesModBlocks.SILVER_SANDSTONE_STAIRS);
   public static final DeferredItem<Item> CUT_SILVER_SANDSTONE_STAIRS = block(MocreaturesModBlocks.CUT_SILVER_SANDSTONE_STAIRS);
   public static final DeferredItem<Item> SMOOTH_SILVER_SANDSTONE_STAIRS = block(MocreaturesModBlocks.SMOOTH_SILVER_SANDSTONE_STAIRS);
   public static final DeferredItem<Item> MOSSY_COBBLED_WYVSTONE = block(MocreaturesModBlocks.MOSSY_COBBLED_WYVSTONE);
   public static final DeferredItem<Item> MOSSY_COBBLED_DEEP_WYVSTONE = block(MocreaturesModBlocks.MOSSY_COBBLED_DEEP_WYVSTONE);
   public static final DeferredItem<Item> WYVWOOD_FENCE = block(MocreaturesModBlocks.WYVWOOD_FENCE);
   public static final DeferredItem<Item> WYVWOOD_BUTTON = block(MocreaturesModBlocks.WYVWOOD_BUTTON);
   public static final DeferredItem<Item> WYVWOOD_DOOR = doubleBlock(MocreaturesModBlocks.WYVWOOD_DOOR);
   public static final DeferredItem<Item> WYVWOOD_TRAPDOOR = block(MocreaturesModBlocks.WYVWOOD_TRAPDOOR);
   public static final DeferredItem<Item> WYVWOOD_PRESSURE_PLATE = block(MocreaturesModBlocks.WYVWOOD_PRESSURE_PLATE);
   public static final DeferredItem<Item> WYVWOOD_SLAB = block(MocreaturesModBlocks.WYVWOOD_SLAB);
   public static final DeferredItem<Item> WYVWOOD_STAIRS = block(MocreaturesModBlocks.WYVWOOD_STAIRS);
   public static final DeferredItem<Item> WYVWOOD_FENCE_GATE = block(MocreaturesModBlocks.WYVWOOD_FENCE_GATE);
   public static final DeferredItem<Item> WYVSTONE_STAIRS = block(MocreaturesModBlocks.WYVSTONE_STAIRS);
   public static final DeferredItem<Item> COBBLED_WYVSTONE_STAIRS = block(MocreaturesModBlocks.COBBLED_WYVSTONE_STAIRS);
   public static final DeferredItem<Item> MOSSY_COBBLED_WYVSTONE_STAIRS = block(MocreaturesModBlocks.MOSSY_COBBLED_WYVSTONE_STAIRS);
   public static final DeferredItem<Item> DEEP_WYVSTONE_STAIRS = block(MocreaturesModBlocks.DEEP_WYVSTONE_STAIRS);
   public static final DeferredItem<Item> COBBLED_DEEP_WYVSTONE_STAIRS = block(MocreaturesModBlocks.COBBLED_DEEP_WYVSTONE_STAIRS);
   public static final DeferredItem<Item> MOSSY_COBBLED_DEEP_WYVSTONE_STAIRS = block(MocreaturesModBlocks.MOSSY_COBBLED_DEEP_WYVSTONE_STAIRS);
   public static final DeferredItem<Item> WYVSTONE_SLAB = block(MocreaturesModBlocks.WYVSTONE_SLAB);
   public static final DeferredItem<Item> COBBLED_WYVSTONE_SLAB = block(MocreaturesModBlocks.COBBLED_WYVSTONE_SLAB);
   public static final DeferredItem<Item> MOSSY_COBBLED_WYVSTONE_SLAB = block(MocreaturesModBlocks.MOSSY_COBBLED_WYVSTONE_SLAB);
   public static final DeferredItem<Item> DEEP_WYVSTONE_SLAB = block(MocreaturesModBlocks.DEEP_WYVSTONE_SLAB);
   public static final DeferredItem<Item> COBBLED_DEEP_WYVSTONE_SLAB = block(MocreaturesModBlocks.COBBLED_DEEP_WYVSTONE_SLAB);
   public static final DeferredItem<Item> MOSSY_COBBLED_DEEP_WYVSTONE_SLAB = block(MocreaturesModBlocks.MOSSY_COBBLED_DEEP_WYVSTONE_SLAB);
   public static final DeferredItem<Item> WYVSTONE_WALL = block(MocreaturesModBlocks.WYVSTONE_WALL);
   public static final DeferredItem<Item> COBBLED_WYVSTONE_WALL = block(MocreaturesModBlocks.COBBLED_WYVSTONE_WALL);
   public static final DeferredItem<Item> MOSSY_COBBLED_WYVSTONE_WALL = block(MocreaturesModBlocks.MOSSY_COBBLED_WYVSTONE_WALL);
   public static final DeferredItem<Item> DEEP_WYVSTONE_WALL = block(MocreaturesModBlocks.DEEP_WYVSTONE_WALL);
   public static final DeferredItem<Item> COBBLED_DEEP_WYVSTONE_WALL = block(MocreaturesModBlocks.COBBLED_DEEP_WYVSTONE_WALL);
   public static final DeferredItem<Item> MOSSY_COBBLED_DEEP_WYVSTONE_WALL = block(MocreaturesModBlocks.MOSSY_COBBLED_DEEP_WYVSTONE_WALL);
   public static final DeferredItem<Item> SILVER_SANDSTONE_WALL = block(MocreaturesModBlocks.SILVER_SANDSTONE_WALL);
   public static final DeferredItem<Item> MYSTIC_PEAR = REGISTRY.register("mystic_pear", MysticPearItem::new);
   public static final DeferredItem<Item> WYVSTONE_BUTTON = block(MocreaturesModBlocks.WYVSTONE_BUTTON);
   public static final DeferredItem<Item> DEEP_WYVSTONE_BUTTON = block(MocreaturesModBlocks.DEEP_WYVSTONE_BUTTON);
   public static final DeferredItem<Item> WYVSTONE_PRESSURE_PLATE = block(MocreaturesModBlocks.WYVSTONE_PRESSURE_PLATE);
   public static final DeferredItem<Item> DEEP_WYVSTONE_PRESSURE_PLATE = block(MocreaturesModBlocks.DEEP_WYVSTONE_PRESSURE_PLATE);
   public static final DeferredItem<Item> CRYSTAL_HORSE_ARMOR = REGISTRY.register("crystal_horse_armor", CrystalHorseArmorItem::new);
   public static final DeferredItem<Item> LION_SPAWN_EGG = REGISTRY.register(
      "lion_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.LION, -3429239, -15724528, new Properties())
   );
   public static final DeferredItem<Item> TIGER_SPAWN_EGG = REGISTRY.register(
      "tiger_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.TIGER, -3381760, -15724528, new Properties())
   );
   public static final DeferredItem<Item> LEOPARD_SPAWN_EGG = REGISTRY.register(
      "leopard_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.LEOPARD, -5139338, -15724528, new Properties())
   );
   public static final DeferredItem<Item> PANTHER_SPAWN_EGG = REGISTRY.register(
      "panther_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.PANTHER, -16777216, -5592539, new Properties())
   );
   public static final DeferredItem<Item> PANTHGER_SPAWN_EGG = REGISTRY.register(
      "panthger_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.PANTHGER, -16777216, -3289836, new Properties())
   );
   public static final DeferredItem<Item> PANTHARD_SPAWN_EGG = REGISTRY.register(
      "panthard_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.PANTHARD, -16777216, -10198016, new Properties())
   );
   public static final DeferredItem<Item> LITHER_SPAWN_EGG = REGISTRY.register(
      "lither_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.LITHER, -14147817, -10664149, new Properties())
   );
   public static final DeferredItem<Item> LEOGER_SPAWN_EGG = REGISTRY.register(
      "leoger_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.LEOGER, -6583975, -14148079, new Properties())
   );
   public static final DeferredItem<Item> LIARD_SPAWN_EGG = REGISTRY.register(
      "liard_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.LIARD, -7437466, -9415116, new Properties())
   );
   public static final DeferredItem<Item> LIGER_SPAWN_EGG = REGISTRY.register(
      "liger_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.LIGER, -9412293, -9283788, new Properties())
   );
   public static final DeferredItem<Item> HORSE_SPAWN_EGG = REGISTRY.register(
      "horse_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.HORSE, -5270181, -3229901, new Properties())
   );
   public static final DeferredItem<Item> HOSTILE_BAT_HORSE_SPAWN_EGG = REGISTRY.register(
      "hostile_bat_horse_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.HOSTILE_BAT_HORSE, -16777216, -14672084, new Properties())
   );
   public static final DeferredItem<Item> HOSTILE_ZOMBIE_HORSE_SPAWN_EGG = REGISTRY.register(
      "hostile_zombie_horse_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.HOSTILE_ZOMBIE_HORSE, -13539545, -12889572, new Properties())
   );
   public static final DeferredItem<Item> HOSTILE_SKELETON_HORSE_SPAWN_EGG = REGISTRY.register(
      "hostile_skeleton_horse_spawn_egg", () -> new DeferredSpawnEggItem(MocreaturesModEntities.HOSTILE_SKELETON_HORSE, -2829100, -8618884, new Properties())
   );
   public static final DeferredItem<Item> HOSTILE_NIGHTMARE_HORSE_SPAWN_EGG = REGISTRY.register(
      "hostile_nightmare_horse_spawn_egg",
      () -> new DeferredSpawnEggItem(MocreaturesModEntities.HOSTILE_NIGHTMARE_HORSE, -13299182, -3107549, new Properties())
   );

   private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
      return REGISTRY.register(block.getId().getPath(), () -> new BlockItem((Block)block.get(), new Properties()));
   }

   private static DeferredItem<Item> doubleBlock(DeferredHolder<Block, Block> block) {
      return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem((Block)block.get(), new Properties()));
   }
}
