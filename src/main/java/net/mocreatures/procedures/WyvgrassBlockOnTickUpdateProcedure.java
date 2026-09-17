package net.mocreatures.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.mocreatures.init.MocreaturesModBlocks;

public class WyvgrassBlockOnTickUpdateProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z) {
      if (world.isEmptyBlock(BlockPos.containing(x, y + 1.0, z))
         && (
            world.getBlockState(BlockPos.containing(x + 1.0, y, z)).getBlock() == MocreaturesModBlocks.WYVGRASS_BLOCK.get()
               || world.getBlockState(BlockPos.containing(x - 1.0, y, z)).getBlock() == MocreaturesModBlocks.WYVGRASS_BLOCK.get()
               || world.getBlockState(BlockPos.containing(x, y, z - 1.0)).getBlock() == MocreaturesModBlocks.WYVGRASS_BLOCK.get()
               || world.getBlockState(BlockPos.containing(x, y, z + 1.0)).getBlock() == MocreaturesModBlocks.WYVGRASS_BLOCK.get()
               || world.getBlockState(BlockPos.containing(x + 1.0, y + 1.0, z)).getBlock() == MocreaturesModBlocks.WYVGRASS_BLOCK.get()
               || world.getBlockState(BlockPos.containing(x - 1.0, y + 1.0, z)).getBlock() == MocreaturesModBlocks.WYVGRASS_BLOCK.get()
               || world.getBlockState(BlockPos.containing(x + 1.0, y - 1.0, z)).getBlock() == MocreaturesModBlocks.WYVGRASS_BLOCK.get()
               || world.getBlockState(BlockPos.containing(x - 1.0, y - 1.0, z)).getBlock() == MocreaturesModBlocks.WYVGRASS_BLOCK.get()
               || world.getBlockState(BlockPos.containing(x, y + 1.0, z + 1.0)).getBlock() == MocreaturesModBlocks.WYVGRASS_BLOCK.get()
               || world.getBlockState(BlockPos.containing(x, y + 1.0, z - 1.0)).getBlock() == MocreaturesModBlocks.WYVGRASS_BLOCK.get()
               || world.getBlockState(BlockPos.containing(x, y - 1.0, z + 1.0)).getBlock() == MocreaturesModBlocks.WYVGRASS_BLOCK.get()
               || world.getBlockState(BlockPos.containing(x, y - 1.0, z - 1.0)).getBlock() == MocreaturesModBlocks.WYVGRASS_BLOCK.get()
         )) {
         world.setBlock(BlockPos.containing(x, y, z), ((Block)MocreaturesModBlocks.WYVGRASS_BLOCK.get()).defaultBlockState(), 3);
      }
   }
}
