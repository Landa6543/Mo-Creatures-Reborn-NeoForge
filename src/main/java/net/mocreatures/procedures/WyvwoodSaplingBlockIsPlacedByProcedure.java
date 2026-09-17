package net.mocreatures.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.mocreatures.MocreaturesMod;
import net.mocreatures.init.MocreaturesModBlocks;

public class WyvwoodSaplingBlockIsPlacedByProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z) {
      if (world.getBlockState(BlockPos.containing(x + 1.0, y, z + 1.0)).getBlock() == Blocks.AIR
         && world.getBlockState(BlockPos.containing(x + 1.0, y, z)).getBlock() == Blocks.AIR
         && world.getBlockState(BlockPos.containing(x, y, z + 1.0)).getBlock() == Blocks.AIR) {
         MocreaturesMod.queueServerWork(
            18000,
            () -> {
               if (world.getBlockState(BlockPos.containing(x, y, z)).getBlock() == MocreaturesModBlocks.WYVWOOD_SAPLING.get()
                  && world instanceof ServerLevel _serverworld) {
                  StructureTemplate template = _serverworld.getStructureManager()
                     .getOrCreate(ResourceLocation.fromNamespaceAndPath("mocreatures", "wyvwood_tree_2"));
                  if (template != null) {
                     template.placeInWorld(
                        _serverworld,
                        BlockPos.containing(x - 7.0, y, z - 6.0),
                        BlockPos.containing(x - 7.0, y, z - 6.0),
                        new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
                        _serverworld.random,
                        3
                     );
                  }
               }
            }
         );
      }
   }
}
