package net.mocreatures.block;

import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class WyvstonePressurePlateBlock extends PressurePlateBlock {
   public WyvstonePressurePlateBlock() {
      super(BlockSetType.IRON, Properties.of().sound(SoundType.STONE).strength(0.5F).forceSolidOn());
   }
}
