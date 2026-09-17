package net.mocreatures.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.mocreatures.init.MocreaturesModBlocks;

public class WyvgrassBlockOnTickUpdate2Procedure {
   public static void execute(LevelAccessor world, double x, double y, double z) {
      if (world.getBlockFloorHeight(BlockPos.containing(x, y + 1.0, z)) > 0.0) {
         world.setBlock(BlockPos.containing(x, y, z), ((Block)MocreaturesModBlocks.WYVDIRT.get()).defaultBlockState(), 3);
      }
   }
}
