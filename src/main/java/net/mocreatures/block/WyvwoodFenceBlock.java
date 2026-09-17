package net.mocreatures.block;

import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class WyvwoodFenceBlock extends FenceBlock {
   public WyvwoodFenceBlock() {
      super(Properties.of().sound(SoundType.WOOD).strength(2.0F, 3.0F).forceSolidOn());
   }
}
