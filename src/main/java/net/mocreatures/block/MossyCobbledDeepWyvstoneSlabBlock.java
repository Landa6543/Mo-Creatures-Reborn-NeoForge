package net.mocreatures.block;

import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class MossyCobbledDeepWyvstoneSlabBlock extends SlabBlock {
   public MossyCobbledDeepWyvstoneSlabBlock() {
      super(Properties.of().sound(SoundType.STONE).strength(3.0F, 6.0F).requiresCorrectToolForDrops());
   }
}
