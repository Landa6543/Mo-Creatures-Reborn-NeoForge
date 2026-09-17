package net.mocreatures.block;

import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.block.state.properties.WoodType;

public class WyvwoodFenceGateBlock extends FenceGateBlock {
   public WyvwoodFenceGateBlock() {
      super(WoodType.OAK, Properties.of().sound(SoundType.WOOD).strength(2.0F, 3.0F).forceSolidOn());
   }
}
