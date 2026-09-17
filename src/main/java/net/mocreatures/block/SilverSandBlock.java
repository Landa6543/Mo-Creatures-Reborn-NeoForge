package net.mocreatures.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class SilverSandBlock extends FallingBlock {
   public static final MapCodec<SilverSandBlock> CODEC = simpleCodec(properties -> new SilverSandBlock());

   public MapCodec<SilverSandBlock> codec() {
      return CODEC;
   }

   public SilverSandBlock() {
      super(Properties.of().sound(SoundType.SAND).strength(0.5F));
   }

   public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
      return 15;
   }
}
