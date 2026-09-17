package net.mocreatures.block;

import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class WyvwoodDoorBlock extends DoorBlock {
   public WyvwoodDoorBlock() {
      super(BlockSetType.STONE, Properties.of().sound(SoundType.WOOD).strength(3.0F));
   }
}
