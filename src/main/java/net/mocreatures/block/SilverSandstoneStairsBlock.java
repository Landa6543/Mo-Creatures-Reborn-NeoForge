package net.mocreatures.block;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class SilverSandstoneStairsBlock extends StairBlock {
   public SilverSandstoneStairsBlock() {
      super(Blocks.AIR.defaultBlockState(), Properties.of().sound(SoundType.STONE).strength(0.8F));
   }

   public float getExplosionResistance() {
      return 0.8F;
   }
}
