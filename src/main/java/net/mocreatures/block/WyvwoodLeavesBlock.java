package net.mocreatures.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class WyvwoodLeavesBlock extends LeavesBlock {
   public WyvwoodLeavesBlock() {
      super(Properties.of().sound(SoundType.GRASS).strength(0.2F, 1.0F).requiresCorrectToolForDrops().noOcclusion());
   }

   public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
      return 15;
   }

   public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
      return 20;
   }
}
