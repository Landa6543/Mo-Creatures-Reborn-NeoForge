package net.mocreatures.block;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class SilverSandstoneWallBlock extends WallBlock {
   public SilverSandstoneWallBlock() {
      super(Properties.of().sound(SoundType.STONE).strength(0.8F).forceSolidOn());
   }
}
