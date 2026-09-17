package net.mocreatures.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.mocreatures.init.MocreaturesModBlocks;

public class FireflyJarBlockIsPlacedByProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
      if (entity != null) {
         if (!world.getBlockState(BlockPos.containing(x, y - 1.0, z)).canOcclude()) {
            world.setBlock(BlockPos.containing(x, y, z), ((Block)MocreaturesModBlocks.HANGING_FIREFLY_JAR.get()).defaultBlockState(), 3);
            Direction _dir = entity.getDirection().getOpposite();
            BlockPos _pos = BlockPos.containing(x, y, z);
            BlockState _bs = world.getBlockState(_pos);
            if (_bs.getBlock().getStateDefinition().getProperty("facing") instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
               world.setBlock(_pos, (BlockState)_bs.setValue(_dp, _dir), 3);
            } else if (_bs.getBlock().getStateDefinition().getProperty("axis") instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis())) {
               world.setBlock(_pos, (BlockState)_bs.setValue(_ap, _dir.getAxis()), 3);
            }
         }
      }
   }
}
