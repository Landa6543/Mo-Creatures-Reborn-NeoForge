package net.mocreatures.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.mocreatures.procedures.WyvgrassBlockOnTickUpdateProcedure;
import net.neoforged.neoforge.common.util.TriState;

public class WyvdirtBlock extends Block {
   public WyvdirtBlock() {
      super(Properties.of().sound(SoundType.GRAVEL).strength(0.5F, 2.5F).randomTicks());
   }

   public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
      return 15;
   }

   public TriState canSustainPlant(BlockState state, BlockGetter world, BlockPos pos, Direction direction, BlockState plant) {
      return TriState.TRUE;
   }

   public void randomTick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
      super.randomTick(blockstate, world, pos, random);
      WyvgrassBlockOnTickUpdateProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
   }
}
