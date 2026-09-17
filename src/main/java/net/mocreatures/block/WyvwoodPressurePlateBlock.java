package net.mocreatures.block;

import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class WyvwoodPressurePlateBlock extends PressurePlateBlock {
   public WyvwoodPressurePlateBlock() {
      super(BlockSetType.IRON, Properties.of().sound(SoundType.WOOD).strength(0.5F).forceSolidOn());
   }
}
