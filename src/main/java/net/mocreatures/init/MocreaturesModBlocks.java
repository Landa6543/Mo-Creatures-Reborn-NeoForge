package net.mocreatures.init;

import net.minecraft.world.level.block.Block;
import net.mocreatures.block.AncientSilverBlockBlock;
import net.mocreatures.block.ChiseledSilverSandstoneBlock;
import net.mocreatures.block.CobbledDeepWyvstoneBlock;
import net.mocreatures.block.CobbledDeepWyvstoneSlabBlock;
import net.mocreatures.block.CobbledDeepWyvstoneStairsBlock;
import net.mocreatures.block.CobbledDeepWyvstoneWallBlock;
import net.mocreatures.block.CobbledWyvstoneBlock;
import net.mocreatures.block.CobbledWyvstoneSlabBlock;
import net.mocreatures.block.CobbledWyvstoneStairsBlock;
import net.mocreatures.block.CobbledWyvstoneWallBlock;
import net.mocreatures.block.CutSilverSandstoneBlock;
import net.mocreatures.block.CutSilverSandstoneSlabBlock;
import net.mocreatures.block.CutSilverSandstoneStairsBlock;
import net.mocreatures.block.DeepWyvstoneBlock;
import net.mocreatures.block.DeepWyvstoneButtonBlock;
import net.mocreatures.block.DeepWyvstonePressurePlateBlock;
import net.mocreatures.block.DeepWyvstoneSlabBlock;
import net.mocreatures.block.DeepWyvstoneStairsBlock;
import net.mocreatures.block.DeepWyvstoneWallBlock;
import net.mocreatures.block.FineSilverBlockBlock;
import net.mocreatures.block.FireflyJarBlock;
import net.mocreatures.block.GlassJarBlock;
import net.mocreatures.block.GleamingGlassBlock;
import net.mocreatures.block.GleamingGlassPaneBlock;
import net.mocreatures.block.HangingFireflyJarBlock;
import net.mocreatures.block.HangingGlassJarBlock;
import net.mocreatures.block.MossyCobbledDeepWyvstoneBlock;
import net.mocreatures.block.MossyCobbledDeepWyvstoneSlabBlock;
import net.mocreatures.block.MossyCobbledDeepWyvstoneStairsBlock;
import net.mocreatures.block.MossyCobbledDeepWyvstoneWallBlock;
import net.mocreatures.block.MossyCobbledWyvstoneBlock;
import net.mocreatures.block.MossyCobbledWyvstoneSlabBlock;
import net.mocreatures.block.MossyCobbledWyvstoneStairsBlock;
import net.mocreatures.block.MossyCobbledWyvstoneWallBlock;
import net.mocreatures.block.SilverSandBlock;
import net.mocreatures.block.SilverSandstoneBlock;
import net.mocreatures.block.SilverSandstoneSlabBlock;
import net.mocreatures.block.SilverSandstoneStairsBlock;
import net.mocreatures.block.SilverSandstoneWallBlock;
import net.mocreatures.block.SmoothSilverSandstoneBlock;
import net.mocreatures.block.SmoothSilverSandstoneSlabBlock;
import net.mocreatures.block.SmoothSilverSandstoneStairsBlock;
import net.mocreatures.block.WyvdirtBlock;
import net.mocreatures.block.WyvgrassBlock;
import net.mocreatures.block.WyvgrassBlockBlock;
import net.mocreatures.block.WyvstoneBlock;
import net.mocreatures.block.WyvstoneButtonBlock;
import net.mocreatures.block.WyvstoneDiamondOreBlock;
import net.mocreatures.block.WyvstoneEmeraldOreBlock;
import net.mocreatures.block.WyvstoneGoldOreBlock;
import net.mocreatures.block.WyvstoneIronOreBlock;
import net.mocreatures.block.WyvstoneLapisOreBlock;
import net.mocreatures.block.WyvstonePressurePlateBlock;
import net.mocreatures.block.WyvstoneRedstoneOreBlock;
import net.mocreatures.block.WyvstoneSlabBlock;
import net.mocreatures.block.WyvstoneStairsBlock;
import net.mocreatures.block.WyvstoneWallBlock;
import net.mocreatures.block.WyvwoodButtonBlock;
import net.mocreatures.block.WyvwoodDoorBlock;
import net.mocreatures.block.WyvwoodFenceBlock;
import net.mocreatures.block.WyvwoodFenceGateBlock;
import net.mocreatures.block.WyvwoodLeavesBlock;
import net.mocreatures.block.WyvwoodLogBlock;
import net.mocreatures.block.WyvwoodPlanksBlock;
import net.mocreatures.block.WyvwoodPressurePlateBlock;
import net.mocreatures.block.WyvwoodSaplingBlock;
import net.mocreatures.block.WyvwoodSlabBlock;
import net.mocreatures.block.WyvwoodStairsBlock;
import net.mocreatures.block.WyvwoodTrapdoorBlock;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredRegister.Blocks;

public class MocreaturesModBlocks {
   public static final Blocks REGISTRY = DeferredRegister.createBlocks("mocreatures");
   public static final DeferredBlock<Block> ANCIENT_SILVER_BLOCK = REGISTRY.register("ancient_silver_block", AncientSilverBlockBlock::new);
   public static final DeferredBlock<Block> FINE_SILVER_BLOCK = REGISTRY.register("fine_silver_block", FineSilverBlockBlock::new);
   public static final DeferredBlock<Block> GLASS_JAR = REGISTRY.register("glass_jar", GlassJarBlock::new);
   public static final DeferredBlock<Block> FIREFLY_JAR = REGISTRY.register("firefly_jar", FireflyJarBlock::new);
   public static final DeferredBlock<Block> HANGING_FIREFLY_JAR = REGISTRY.register("hanging_firefly_jar", HangingFireflyJarBlock::new);
   public static final DeferredBlock<Block> HANGING_GLASS_JAR = REGISTRY.register("hanging_glass_jar", HangingGlassJarBlock::new);
   public static final DeferredBlock<Block> WYVGRASS_BLOCK = REGISTRY.register("wyvgrass_block", WyvgrassBlockBlock::new);
   public static final DeferredBlock<Block> WYVDIRT = REGISTRY.register("wyvdirt", WyvdirtBlock::new);
   public static final DeferredBlock<Block> WYVSTONE = REGISTRY.register("wyvstone", WyvstoneBlock::new);
   public static final DeferredBlock<Block> WYVWOOD_LOG = REGISTRY.register("wyvwood_log", WyvwoodLogBlock::new);
   public static final DeferredBlock<Block> WYVWOOD_LEAVES = REGISTRY.register("wyvwood_leaves", WyvwoodLeavesBlock::new);
   public static final DeferredBlock<Block> WYVGRASS = REGISTRY.register("wyvgrass", WyvgrassBlock::new);
   public static final DeferredBlock<Block> WYVWOOD_PLANKS = REGISTRY.register("wyvwood_planks", WyvwoodPlanksBlock::new);
   public static final DeferredBlock<Block> COBBLED_WYVSTONE = REGISTRY.register("cobbled_wyvstone", CobbledWyvstoneBlock::new);
   public static final DeferredBlock<Block> WYVSTONE_DIAMOND_ORE = REGISTRY.register("wyvstone_diamond_ore", WyvstoneDiamondOreBlock::new);
   public static final DeferredBlock<Block> WYVSTONE_IRON_ORE = REGISTRY.register("wyvstone_iron_ore", WyvstoneIronOreBlock::new);
   public static final DeferredBlock<Block> WYVSTONE_GOLD_ORE = REGISTRY.register("wyvstone_gold_ore", WyvstoneGoldOreBlock::new);
   public static final DeferredBlock<Block> WYVSTONE_EMERALD_ORE = REGISTRY.register("wyvstone_emerald_ore", WyvstoneEmeraldOreBlock::new);
   public static final DeferredBlock<Block> WYVSTONE_LAPIS_ORE = REGISTRY.register("wyvstone_lapis_ore", WyvstoneLapisOreBlock::new);
   public static final DeferredBlock<Block> DEEP_WYVSTONE = REGISTRY.register("deep_wyvstone", DeepWyvstoneBlock::new);
   public static final DeferredBlock<Block> COBBLED_DEEP_WYVSTONE = REGISTRY.register("cobbled_deep_wyvstone", CobbledDeepWyvstoneBlock::new);
   public static final DeferredBlock<Block> WYVSTONE_REDSTONE_ORE = REGISTRY.register("wyvstone_redstone_ore", WyvstoneRedstoneOreBlock::new);
   public static final DeferredBlock<Block> WYVWOOD_SAPLING = REGISTRY.register("wyvwood_sapling", WyvwoodSaplingBlock::new);
   public static final DeferredBlock<Block> SILVER_SAND = REGISTRY.register("silver_sand", SilverSandBlock::new);
   public static final DeferredBlock<Block> SILVER_SANDSTONE = REGISTRY.register("silver_sandstone", SilverSandstoneBlock::new);
   public static final DeferredBlock<Block> SMOOTH_SILVER_SANDSTONE = REGISTRY.register("smooth_silver_sandstone", SmoothSilverSandstoneBlock::new);
   public static final DeferredBlock<Block> CUT_SILVER_SANDSTONE = REGISTRY.register("cut_silver_sandstone", CutSilverSandstoneBlock::new);
   public static final DeferredBlock<Block> CHISELED_SILVER_SANDSTONE = REGISTRY.register("chiseled_silver_sandstone", ChiseledSilverSandstoneBlock::new);
   public static final DeferredBlock<Block> SILVER_SANDSTONE_SLAB = REGISTRY.register("silver_sandstone_slab", SilverSandstoneSlabBlock::new);
   public static final DeferredBlock<Block> CUT_SILVER_SANDSTONE_SLAB = REGISTRY.register("cut_silver_sandstone_slab", CutSilverSandstoneSlabBlock::new);
   public static final DeferredBlock<Block> SMOOTH_SILVER_SANDSTONE_SLAB = REGISTRY.register(
      "smooth_silver_sandstone_slab", SmoothSilverSandstoneSlabBlock::new
   );
   public static final DeferredBlock<Block> GLEAMING_GLASS = REGISTRY.register("gleaming_glass", GleamingGlassBlock::new);
   public static final DeferredBlock<Block> GLEAMING_GLASS_PANE = REGISTRY.register("gleaming_glass_pane", GleamingGlassPaneBlock::new);
   public static final DeferredBlock<Block> SILVER_SANDSTONE_STAIRS = REGISTRY.register("silver_sandstone_stairs", SilverSandstoneStairsBlock::new);
   public static final DeferredBlock<Block> CUT_SILVER_SANDSTONE_STAIRS = REGISTRY.register("cut_silver_sandstone_stairs", CutSilverSandstoneStairsBlock::new);
   public static final DeferredBlock<Block> SMOOTH_SILVER_SANDSTONE_STAIRS = REGISTRY.register(
      "smooth_silver_sandstone_stairs", SmoothSilverSandstoneStairsBlock::new
   );
   public static final DeferredBlock<Block> MOSSY_COBBLED_WYVSTONE = REGISTRY.register("mossy_cobbled_wyvstone", MossyCobbledWyvstoneBlock::new);
   public static final DeferredBlock<Block> MOSSY_COBBLED_DEEP_WYVSTONE = REGISTRY.register("mossy_cobbled_deep_wyvstone", MossyCobbledDeepWyvstoneBlock::new);
   public static final DeferredBlock<Block> WYVWOOD_FENCE = REGISTRY.register("wyvwood_fence", WyvwoodFenceBlock::new);
   public static final DeferredBlock<Block> WYVWOOD_BUTTON = REGISTRY.register("wyvwood_button", WyvwoodButtonBlock::new);
   public static final DeferredBlock<Block> WYVWOOD_DOOR = REGISTRY.register("wyvwood_door", WyvwoodDoorBlock::new);
   public static final DeferredBlock<Block> WYVWOOD_TRAPDOOR = REGISTRY.register("wyvwood_trapdoor", WyvwoodTrapdoorBlock::new);
   public static final DeferredBlock<Block> WYVWOOD_PRESSURE_PLATE = REGISTRY.register("wyvwood_pressure_plate", WyvwoodPressurePlateBlock::new);
   public static final DeferredBlock<Block> WYVWOOD_SLAB = REGISTRY.register("wyvwood_slab", WyvwoodSlabBlock::new);
   public static final DeferredBlock<Block> WYVWOOD_STAIRS = REGISTRY.register("wyvwood_stairs", WyvwoodStairsBlock::new);
   public static final DeferredBlock<Block> WYVWOOD_FENCE_GATE = REGISTRY.register("wyvwood_fence_gate", WyvwoodFenceGateBlock::new);
   public static final DeferredBlock<Block> WYVSTONE_STAIRS = REGISTRY.register("wyvstone_stairs", WyvstoneStairsBlock::new);
   public static final DeferredBlock<Block> COBBLED_WYVSTONE_STAIRS = REGISTRY.register("cobbled_wyvstone_stairs", CobbledWyvstoneStairsBlock::new);
   public static final DeferredBlock<Block> MOSSY_COBBLED_WYVSTONE_STAIRS = REGISTRY.register(
      "mossy_cobbled_wyvstone_stairs", MossyCobbledWyvstoneStairsBlock::new
   );
   public static final DeferredBlock<Block> DEEP_WYVSTONE_STAIRS = REGISTRY.register("deep_wyvstone_stairs", DeepWyvstoneStairsBlock::new);
   public static final DeferredBlock<Block> COBBLED_DEEP_WYVSTONE_STAIRS = REGISTRY.register(
      "cobbled_deep_wyvstone_stairs", CobbledDeepWyvstoneStairsBlock::new
   );
   public static final DeferredBlock<Block> MOSSY_COBBLED_DEEP_WYVSTONE_STAIRS = REGISTRY.register(
      "mossy_cobbled_deep_wyvstone_stairs", MossyCobbledDeepWyvstoneStairsBlock::new
   );
   public static final DeferredBlock<Block> WYVSTONE_SLAB = REGISTRY.register("wyvstone_slab", WyvstoneSlabBlock::new);
   public static final DeferredBlock<Block> COBBLED_WYVSTONE_SLAB = REGISTRY.register("cobbled_wyvstone_slab", CobbledWyvstoneSlabBlock::new);
   public static final DeferredBlock<Block> MOSSY_COBBLED_WYVSTONE_SLAB = REGISTRY.register("mossy_cobbled_wyvstone_slab", MossyCobbledWyvstoneSlabBlock::new);
   public static final DeferredBlock<Block> DEEP_WYVSTONE_SLAB = REGISTRY.register("deep_wyvstone_slab", DeepWyvstoneSlabBlock::new);
   public static final DeferredBlock<Block> COBBLED_DEEP_WYVSTONE_SLAB = REGISTRY.register("cobbled_deep_wyvstone_slab", CobbledDeepWyvstoneSlabBlock::new);
   public static final DeferredBlock<Block> MOSSY_COBBLED_DEEP_WYVSTONE_SLAB = REGISTRY.register(
      "mossy_cobbled_deep_wyvstone_slab", MossyCobbledDeepWyvstoneSlabBlock::new
   );
   public static final DeferredBlock<Block> WYVSTONE_WALL = REGISTRY.register("wyvstone_wall", WyvstoneWallBlock::new);
   public static final DeferredBlock<Block> COBBLED_WYVSTONE_WALL = REGISTRY.register("cobbled_wyvstone_wall", CobbledWyvstoneWallBlock::new);
   public static final DeferredBlock<Block> MOSSY_COBBLED_WYVSTONE_WALL = REGISTRY.register("mossy_cobbled_wyvstone_wall", MossyCobbledWyvstoneWallBlock::new);
   public static final DeferredBlock<Block> DEEP_WYVSTONE_WALL = REGISTRY.register("deep_wyvstone_wall", DeepWyvstoneWallBlock::new);
   public static final DeferredBlock<Block> COBBLED_DEEP_WYVSTONE_WALL = REGISTRY.register("cobbled_deep_wyvstone_wall", CobbledDeepWyvstoneWallBlock::new);
   public static final DeferredBlock<Block> MOSSY_COBBLED_DEEP_WYVSTONE_WALL = REGISTRY.register(
      "mossy_cobbled_deep_wyvstone_wall", MossyCobbledDeepWyvstoneWallBlock::new
   );
   public static final DeferredBlock<Block> SILVER_SANDSTONE_WALL = REGISTRY.register("silver_sandstone_wall", SilverSandstoneWallBlock::new);
   public static final DeferredBlock<Block> WYVSTONE_BUTTON = REGISTRY.register("wyvstone_button", WyvstoneButtonBlock::new);
   public static final DeferredBlock<Block> DEEP_WYVSTONE_BUTTON = REGISTRY.register("deep_wyvstone_button", DeepWyvstoneButtonBlock::new);
   public static final DeferredBlock<Block> WYVSTONE_PRESSURE_PLATE = REGISTRY.register("wyvstone_pressure_plate", WyvstonePressurePlateBlock::new);
   public static final DeferredBlock<Block> DEEP_WYVSTONE_PRESSURE_PLATE = REGISTRY.register(
      "deep_wyvstone_pressure_plate", DeepWyvstonePressurePlateBlock::new
   );
}
