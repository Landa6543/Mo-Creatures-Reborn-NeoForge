package net.mocreatures.block;

import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class DeepWyvstoneButtonBlock extends ButtonBlock {
   public DeepWyvstoneButtonBlock() {
      super(BlockSetType.STONE, 20, Properties.of().sound(SoundType.STONE).strength(0.5F));
   }
}
