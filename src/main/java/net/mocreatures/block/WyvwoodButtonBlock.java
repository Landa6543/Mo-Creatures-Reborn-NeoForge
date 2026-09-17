package net.mocreatures.block;

import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class WyvwoodButtonBlock extends ButtonBlock {
   public WyvwoodButtonBlock() {
      super(BlockSetType.STONE, 20, Properties.of().sound(SoundType.WOOD).strength(0.5F));
   }
}
