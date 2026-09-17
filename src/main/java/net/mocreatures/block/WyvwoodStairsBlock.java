package net.mocreatures.block;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class WyvwoodStairsBlock extends StairBlock {
   public WyvwoodStairsBlock() {
      super(Blocks.AIR.defaultBlockState(), Properties.of().sound(SoundType.WOOD).strength(2.0F, 15.0F));
   }

   public float getExplosionResistance() {
      return 15.0F;
   }
}
