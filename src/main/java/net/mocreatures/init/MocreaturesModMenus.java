package net.mocreatures.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.inventory.MenuType;
import net.mocreatures.world.inventory.ElephantInventoryMenu;
import net.mocreatures.world.inventory.HorseInventoryMenu;
import net.mocreatures.world.inventory.LeogerInventoryMenu;
import net.mocreatures.world.inventory.LeopardInventoryMenu;
import net.mocreatures.world.inventory.LiardInventoryMenu;
import net.mocreatures.world.inventory.LigerInventoryMenu;
import net.mocreatures.world.inventory.LionInventoryMenu;
import net.mocreatures.world.inventory.LitherInventoryMenu;
import net.mocreatures.world.inventory.NamingAnchovyMenu;
import net.mocreatures.world.inventory.NamingAngelfishMenu;
import net.mocreatures.world.inventory.NamingAnglerfishMenu;
import net.mocreatures.world.inventory.NamingBassMenu;
import net.mocreatures.world.inventory.NamingBlackBearMenu;
import net.mocreatures.world.inventory.NamingBlackBirdMenu;
import net.mocreatures.world.inventory.NamingBlackOstrichMenu;
import net.mocreatures.world.inventory.NamingBlueBirdMenu;
import net.mocreatures.world.inventory.NamingBrownOstrichMenu;
import net.mocreatures.world.inventory.NamingBunnyMenu;
import net.mocreatures.world.inventory.NamingCaveScorpionMenu;
import net.mocreatures.world.inventory.NamingClownfishMenu;
import net.mocreatures.world.inventory.NamingDarkManticoreMenu;
import net.mocreatures.world.inventory.NamingDirtScorpionMenu;
import net.mocreatures.world.inventory.NamingElephantMenu;
import net.mocreatures.world.inventory.NamingFireManticoreMenu;
import net.mocreatures.world.inventory.NamingFireScorpionMenu;
import net.mocreatures.world.inventory.NamingFishyMenu;
import net.mocreatures.world.inventory.NamingFrostManticoreMenu;
import net.mocreatures.world.inventory.NamingFrostScorpionMenu;
import net.mocreatures.world.inventory.NamingGoldFishMenu;
import net.mocreatures.world.inventory.NamingGreenBirdMenu;
import net.mocreatures.world.inventory.NamingGrizzlyBearMenu;
import net.mocreatures.world.inventory.NamingHippoTangMenu;
import net.mocreatures.world.inventory.NamingHorseMenu;
import net.mocreatures.world.inventory.NamingKittyAMenu;
import net.mocreatures.world.inventory.NamingKittyBMenu;
import net.mocreatures.world.inventory.NamingKittyCMenu;
import net.mocreatures.world.inventory.NamingKittyDMenu;
import net.mocreatures.world.inventory.NamingKittyEMenu;
import net.mocreatures.world.inventory.NamingKittyFMenu;
import net.mocreatures.world.inventory.NamingKittyGMenu;
import net.mocreatures.world.inventory.NamingKittyHMenu;
import net.mocreatures.world.inventory.NamingKittyIMenu;
import net.mocreatures.world.inventory.NamingKittyJMenu;
import net.mocreatures.world.inventory.NamingKomodoDragonMenu;
import net.mocreatures.world.inventory.NamingLeogerMenu;
import net.mocreatures.world.inventory.NamingLeopardMenu;
import net.mocreatures.world.inventory.NamingLiardMenu;
import net.mocreatures.world.inventory.NamingLigerMenu;
import net.mocreatures.world.inventory.NamingLionMenu;
import net.mocreatures.world.inventory.NamingLitherMenu;
import net.mocreatures.world.inventory.NamingMandarinfishMenu;
import net.mocreatures.world.inventory.NamingNetherOstrichMenu;
import net.mocreatures.world.inventory.NamingPandaBearMenu;
import net.mocreatures.world.inventory.NamingPanthardMenu;
import net.mocreatures.world.inventory.NamingPantherMenu;
import net.mocreatures.world.inventory.NamingPanthgerMenu;
import net.mocreatures.world.inventory.NamingPiranhaMenu;
import net.mocreatures.world.inventory.NamingPlainManticoreMenu;
import net.mocreatures.world.inventory.NamingPolarBearMenu;
import net.mocreatures.world.inventory.NamingRaccoonMenu;
import net.mocreatures.world.inventory.NamingRedBirdMenu;
import net.mocreatures.world.inventory.NamingSharkMenu;
import net.mocreatures.world.inventory.NamingTigerMenu;
import net.mocreatures.world.inventory.NamingToxicManticoreMenu;
import net.mocreatures.world.inventory.NamingUndeadOstrichMenu;
import net.mocreatures.world.inventory.NamingUndeadScorpionMenu;
import net.mocreatures.world.inventory.NamingUnihornedOstrichMenu;
import net.mocreatures.world.inventory.NamingWhiteBirdMenu;
import net.mocreatures.world.inventory.NamingWyvernMenu;
import net.mocreatures.world.inventory.NamingWyvernOstrichMenu;
import net.mocreatures.world.inventory.NamingYellowBirdMenu;
import net.mocreatures.world.inventory.NaminingPorcupineMenu;
import net.mocreatures.world.inventory.OstrichInventory2Menu;
import net.mocreatures.world.inventory.OstrichInventory3Menu;
import net.mocreatures.world.inventory.OstrichInventory4Menu;
import net.mocreatures.world.inventory.OstrichInventory5Menu;
import net.mocreatures.world.inventory.OstrichInventory6Menu;
import net.mocreatures.world.inventory.OstrichInventoryMenu;
import net.mocreatures.world.inventory.PanthardInventoryMenu;
import net.mocreatures.world.inventory.PantherInventoryMenu;
import net.mocreatures.world.inventory.PanthgerInventoryMenu;
import net.mocreatures.world.inventory.TigerInventoryMenu;
import net.mocreatures.world.inventory.WyvernInventoryMenu;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class MocreaturesModMenus {
   public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, "mocreatures");
   public static final DeferredHolder<MenuType<?>, MenuType<NamingRaccoonMenu>> NAMING_RACCOON = REGISTRY.register(
      "naming_raccoon", () -> IMenuTypeExtension.create(NamingRaccoonMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<NamingBrownOstrichMenu>> NAMING_BROWN_OSTRICH = REGISTRY.register(
      "naming_brown_ostrich", () -> IMenuTypeExtension.create(NamingBrownOstrichMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<NamingBlackOstrichMenu>> NAMING_BLACK_OSTRICH = REGISTRY.register(
      "naming_black_ostrich", () -> IMenuTypeExtension.create(NamingBlackOstrichMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<NamingSharkMenu>> NAMING_SHARK = REGISTRY.register(
      "naming_shark", () -> IMenuTypeExtension.create(NamingSharkMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<NamingDirtScorpionMenu>> NAMING_DIRT_SCORPION = REGISTRY.register(
      "naming_dirt_scorpion", () -> IMenuTypeExtension.create(NamingDirtScorpionMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<NamingCaveScorpionMenu>> NAMING_CAVE_SCORPION = REGISTRY.register(
      "naming_cave_scorpion", () -> IMenuTypeExtension.create(NamingCaveScorpionMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<NamingFireScorpionMenu>> NAMING_FIRE_SCORPION = REGISTRY.register(
      "naming_fire_scorpion", () -> IMenuTypeExtension.create(NamingFireScorpionMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<NamingFrostScorpionMenu>> NAMING_FROST_SCORPION = REGISTRY.register(
      "naming_frost_scorpion", () -> IMenuTypeExtension.create(NamingFrostScorpionMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<NamingUndeadScorpionMenu>> NAMING_UNDEAD_SCORPION = REGISTRY.register(
      "naming_undead_scorpion", () -> IMenuTypeExtension.create(NamingUndeadScorpionMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<NamingKomodoDragonMenu>> NAMING_KOMODO_DRAGON = REGISTRY.register(
      "naming_komodo_dragon", () -> IMenuTypeExtension.create(NamingKomodoDragonMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<NamingKittyAMenu>> NAMING_KITTY_A = REGISTRY.register(
      "naming_kitty_a", () -> IMenuTypeExtension.create(NamingKittyAMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<NamingKittyBMenu>> NAMING_KITTY_B = REGISTRY.register(
      "naming_kitty_b", () -> IMenuTypeExtension.create(NamingKittyBMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<NamingKittyCMenu>> NAMING_KITTY_C = REGISTRY.register(
      "naming_kitty_c", () -> IMenuTypeExtension.create(NamingKittyCMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<NamingKittyDMenu>> NAMING_KITTY_D = REGISTRY.register(
      "naming_kitty_d", () -> IMenuTypeExtension.create(NamingKittyDMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<NamingKittyEMenu>> NAMING_KITTY_E = REGISTRY.register(
      "naming_kitty_e", () -> IMenuTypeExtension.create(NamingKittyEMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<NamingKittyFMenu>> NAMING_KITTY_F = REGISTRY.register(
      "naming_kitty_f", () -> IMenuTypeExtension.create(NamingKittyFMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<NamingKittyGMenu>> NAMING_KITTY_G = REGISTRY.register(
      "naming_kitty_g", () -> IMenuTypeExtension.create(NamingKittyGMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<NamingKittyHMenu>> NAMING_KITTY_H = REGISTRY.register(
      "naming_kitty_h", () -> IMenuTypeExtension.create(NamingKittyHMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<NamingKittyIMenu>> NAMING_KITTY_I = REGISTRY.register(
      "naming_kitty_i", () -> IMenuTypeExtension.create(NamingKittyIMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<NamingKittyJMenu>> NAMING_KITTY_J = REGISTRY.register(
      "naming_kitty_j", () -> IMenuTypeExtension.create(NamingKittyJMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<NamingNetherOstrichMenu>> NAMING_NETHER_OSTRICH = REGISTRY.register(
      "naming_nether_ostrich", () -> IMenuTypeExtension.create(NamingNetherOstrichMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<NamingBlackBirdMenu>> NAMING_BLACK_BIRD = REGISTRY.register(
      "naming_black_bird", () -> IMenuTypeExtension.create(NamingBlackBirdMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<NamingBlueBirdMenu>> NAMING_BLUE_BIRD = REGISTRY.register(
      "naming_blue_bird", () -> IMenuTypeExtension.create(NamingBlueBirdMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<NamingGreenBirdMenu>> NAMING_GREEN_BIRD = REGISTRY.register(
      "naming_green_bird", () -> IMenuTypeExtension.create(NamingGreenBirdMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<NamingRedBirdMenu>> NAMING_RED_BIRD = REGISTRY.register(
      "naming_red_bird", () -> IMenuTypeExtension.create(NamingRedBirdMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<NamingWhiteBirdMenu>> NAMING_WHITE_BIRD = REGISTRY.register(
      "naming_white_bird", () -> IMenuTypeExtension.create(NamingWhiteBirdMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<NamingYellowBirdMenu>> NAMING_YELLOW_BIRD = REGISTRY.register(
      "naming_yellow_bird", () -> IMenuTypeExtension.create(NamingYellowBirdMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<NamingGrizzlyBearMenu>> NAMING_GRIZZLY_BEAR = REGISTRY.register(
      "naming_grizzly_bear", () -> IMenuTypeExtension.create(NamingGrizzlyBearMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<NamingBlackBearMenu>> NAMING_BLACK_BEAR = REGISTRY.register(
      "naming_black_bear", () -> IMenuTypeExtension.create(NamingBlackBearMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<NamingPandaBearMenu>> NAMING_PANDA_BEAR = REGISTRY.register(
      "naming_panda_bear", () -> IMenuTypeExtension.create(NamingPandaBearMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<NamingPolarBearMenu>> NAMING_POLAR_BEAR = REGISTRY.register(
      "naming_polar_bear", () -> IMenuTypeExtension.create(NamingPolarBearMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<NamingUnihornedOstrichMenu>> NAMING_UNIHORNED_OSTRICH = REGISTRY.register(
      "naming_unihorned_ostrich", () -> IMenuTypeExtension.create(NamingUnihornedOstrichMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<NamingFishyMenu>> NAMING_FISHY = REGISTRY.register(
      "naming_fishy", () -> IMenuTypeExtension.create(NamingFishyMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<NamingAnchovyMenu>> NAMING_ANCHOVY = REGISTRY.register(
      "naming_anchovy", () -> IMenuTypeExtension.create(NamingAnchovyMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<NamingGoldFishMenu>> NAMING_GOLD_FISH = REGISTRY.register(
      "naming_gold_fish", () -> IMenuTypeExtension.create(NamingGoldFishMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<NamingAnglerfishMenu>> NAMING_ANGLERFISH = REGISTRY.register(
      "naming_anglerfish", () -> IMenuTypeExtension.create(NamingAnglerfishMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<NamingAngelfishMenu>> NAMING_ANGELFISH = REGISTRY.register(
      "naming_angelfish", () -> IMenuTypeExtension.create(NamingAngelfishMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<NamingClownfishMenu>> NAMING_CLOWNFISH = REGISTRY.register(
      "naming_clownfish", () -> IMenuTypeExtension.create(NamingClownfishMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<NamingHippoTangMenu>> NAMING_HIPPO_TANG = REGISTRY.register(
      "naming_hippo_tang", () -> IMenuTypeExtension.create(NamingHippoTangMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<NamingMandarinfishMenu>> NAMING_MANDARINFISH = REGISTRY.register(
      "naming_mandarinfish", () -> IMenuTypeExtension.create(NamingMandarinfishMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<NamingPiranhaMenu>> NAMING_PIRANHA = REGISTRY.register(
      "naming_piranha", () -> IMenuTypeExtension.create(NamingPiranhaMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<NamingPlainManticoreMenu>> NAMING_PLAIN_MANTICORE = REGISTRY.register(
      "naming_plain_manticore", () -> IMenuTypeExtension.create(NamingPlainManticoreMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<NamingDarkManticoreMenu>> NAMING_DARK_MANTICORE = REGISTRY.register(
      "naming_dark_manticore", () -> IMenuTypeExtension.create(NamingDarkManticoreMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<NamingFireManticoreMenu>> NAMING_FIRE_MANTICORE = REGISTRY.register(
      "naming_fire_manticore", () -> IMenuTypeExtension.create(NamingFireManticoreMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<NamingFrostManticoreMenu>> NAMING_FROST_MANTICORE = REGISTRY.register(
      "naming_frost_manticore", () -> IMenuTypeExtension.create(NamingFrostManticoreMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<NamingToxicManticoreMenu>> NAMING_TOXIC_MANTICORE = REGISTRY.register(
      "naming_toxic_manticore", () -> IMenuTypeExtension.create(NamingToxicManticoreMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<NamingBassMenu>> NAMING_BASS = REGISTRY.register(
      "naming_bass", () -> IMenuTypeExtension.create(NamingBassMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<OstrichInventoryMenu>> OSTRICH_INVENTORY = REGISTRY.register(
      "ostrich_inventory", () -> IMenuTypeExtension.create(OstrichInventoryMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<OstrichInventory2Menu>> OSTRICH_INVENTORY_2 = REGISTRY.register(
      "ostrich_inventory_2", () -> IMenuTypeExtension.create(OstrichInventory2Menu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<OstrichInventory3Menu>> OSTRICH_INVENTORY_3 = REGISTRY.register(
      "ostrich_inventory_3", () -> IMenuTypeExtension.create(OstrichInventory3Menu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<OstrichInventory4Menu>> OSTRICH_INVENTORY_4 = REGISTRY.register(
      "ostrich_inventory_4", () -> IMenuTypeExtension.create(OstrichInventory4Menu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<NamingElephantMenu>> NAMING_ELEPHANT = REGISTRY.register(
      "naming_elephant", () -> IMenuTypeExtension.create(NamingElephantMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<ElephantInventoryMenu>> ELEPHANT_INVENTORY = REGISTRY.register(
      "elephant_inventory", () -> IMenuTypeExtension.create(ElephantInventoryMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<NaminingPorcupineMenu>> NAMINING_PORCUPINE = REGISTRY.register(
      "namining_porcupine", () -> IMenuTypeExtension.create(NaminingPorcupineMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<OstrichInventory5Menu>> OSTRICH_INVENTORY_5 = REGISTRY.register(
      "ostrich_inventory_5", () -> IMenuTypeExtension.create(OstrichInventory5Menu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<NamingWyvernOstrichMenu>> NAMING_WYVERN_OSTRICH = REGISTRY.register(
      "naming_wyvern_ostrich", () -> IMenuTypeExtension.create(NamingWyvernOstrichMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<OstrichInventory6Menu>> OSTRICH_INVENTORY_6 = REGISTRY.register(
      "ostrich_inventory_6", () -> IMenuTypeExtension.create(OstrichInventory6Menu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<NamingUndeadOstrichMenu>> NAMING_UNDEAD_OSTRICH = REGISTRY.register(
      "naming_undead_ostrich", () -> IMenuTypeExtension.create(NamingUndeadOstrichMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<NamingWyvernMenu>> NAMING_WYVERN = REGISTRY.register(
      "naming_wyvern", () -> IMenuTypeExtension.create(NamingWyvernMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<WyvernInventoryMenu>> WYVERN_INVENTORY = REGISTRY.register(
      "wyvern_inventory", () -> IMenuTypeExtension.create(WyvernInventoryMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<LionInventoryMenu>> LION_INVENTORY = REGISTRY.register(
      "lion_inventory", () -> IMenuTypeExtension.create(LionInventoryMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<NamingLionMenu>> NAMING_LION = REGISTRY.register(
      "naming_lion", () -> IMenuTypeExtension.create(NamingLionMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<TigerInventoryMenu>> TIGER_INVENTORY = REGISTRY.register(
      "tiger_inventory", () -> IMenuTypeExtension.create(TigerInventoryMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<NamingTigerMenu>> NAMING_TIGER = REGISTRY.register(
      "naming_tiger", () -> IMenuTypeExtension.create(NamingTigerMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<LeopardInventoryMenu>> LEOPARD_INVENTORY = REGISTRY.register(
      "leopard_inventory", () -> IMenuTypeExtension.create(LeopardInventoryMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<NamingLeopardMenu>> NAMING_LEOPARD = REGISTRY.register(
      "naming_leopard", () -> IMenuTypeExtension.create(NamingLeopardMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<PantherInventoryMenu>> PANTHER_INVENTORY = REGISTRY.register(
      "panther_inventory", () -> IMenuTypeExtension.create(PantherInventoryMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<NamingPantherMenu>> NAMING_PANTHER = REGISTRY.register(
      "naming_panther", () -> IMenuTypeExtension.create(NamingPantherMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<PanthgerInventoryMenu>> PANTHGER_INVENTORY = REGISTRY.register(
      "panthger_inventory", () -> IMenuTypeExtension.create(PanthgerInventoryMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<NamingPanthgerMenu>> NAMING_PANTHGER = REGISTRY.register(
      "naming_panthger", () -> IMenuTypeExtension.create(NamingPanthgerMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<PanthardInventoryMenu>> PANTHARD_INVENTORY = REGISTRY.register(
      "panthard_inventory", () -> IMenuTypeExtension.create(PanthardInventoryMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<NamingPanthardMenu>> NAMING_PANTHARD = REGISTRY.register(
      "naming_panthard", () -> IMenuTypeExtension.create(NamingPanthardMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<LitherInventoryMenu>> LITHER_INVENTORY = REGISTRY.register(
      "lither_inventory", () -> IMenuTypeExtension.create(LitherInventoryMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<NamingLitherMenu>> NAMING_LITHER = REGISTRY.register(
      "naming_lither", () -> IMenuTypeExtension.create(NamingLitherMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<NamingLeogerMenu>> NAMING_LEOGER = REGISTRY.register(
      "naming_leoger", () -> IMenuTypeExtension.create(NamingLeogerMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<LeogerInventoryMenu>> LEOGER_INVENTORY = REGISTRY.register(
      "leoger_inventory", () -> IMenuTypeExtension.create(LeogerInventoryMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<LiardInventoryMenu>> LIARD_INVENTORY = REGISTRY.register(
      "liard_inventory", () -> IMenuTypeExtension.create(LiardInventoryMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<NamingLiardMenu>> NAMING_LIARD = REGISTRY.register(
      "naming_liard", () -> IMenuTypeExtension.create(NamingLiardMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<LigerInventoryMenu>> LIGER_INVENTORY = REGISTRY.register(
      "liger_inventory", () -> IMenuTypeExtension.create(LigerInventoryMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<NamingLigerMenu>> NAMING_LIGER = REGISTRY.register(
      "naming_liger", () -> IMenuTypeExtension.create(NamingLigerMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<HorseInventoryMenu>> HORSE_INVENTORY = REGISTRY.register(
      "horse_inventory", () -> IMenuTypeExtension.create(HorseInventoryMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<NamingHorseMenu>> NAMING_HORSE = REGISTRY.register(
      "naming_horse", () -> IMenuTypeExtension.create(NamingHorseMenu::new)
   );
   public static final DeferredHolder<MenuType<?>, MenuType<NamingBunnyMenu>> NAMING_BUNNY = REGISTRY.register(
      "naming_bunny", () -> IMenuTypeExtension.create(NamingBunnyMenu::new)
   );
}
