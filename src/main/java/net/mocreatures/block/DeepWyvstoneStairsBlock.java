package net.mocreatures.block;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class DeepWyvstoneStairsBlock extends StairBlock {
   public DeepWyvstoneStairsBlock() {
      super(Blocks.AIR.defaultBlockState(), Properties.of().sound(SoundType.STONE).strength(3.0F, 6.0F).requiresCorrectToolForDrops());
   }

   public float getExplosionResistance() {
      return 6.0F;
   }
}
