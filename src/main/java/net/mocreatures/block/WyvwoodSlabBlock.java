package net.mocreatures.block;

import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class WyvwoodSlabBlock extends SlabBlock {
   public WyvwoodSlabBlock() {
      super(Properties.of().sound(SoundType.WOOD).strength(2.0F, 15.0F));
   }
}
