package net.mocreatures.block;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class WyvwoodTrapdoorBlock extends TrapDoorBlock {
   public WyvwoodTrapdoorBlock() {
      super(BlockSetType.STONE, Properties.of().sound(SoundType.WOOD).strength(3.0F));
   }
}
