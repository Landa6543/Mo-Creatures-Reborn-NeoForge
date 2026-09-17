package net.mocreatures.block;

import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class CobbledWyvstoneSlabBlock extends SlabBlock {
   public CobbledWyvstoneSlabBlock() {
      super(Properties.of().sound(SoundType.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops());
   }
}
