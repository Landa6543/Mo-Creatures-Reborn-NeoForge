package net.mocreatures.block;

import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class CutSilverSandstoneSlabBlock extends SlabBlock {
   public CutSilverSandstoneSlabBlock() {
      super(Properties.of().sound(SoundType.STONE).strength(0.8F).requiresCorrectToolForDrops());
   }
}
