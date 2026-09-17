package net.mocreatures.block;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class MossyCobbledWyvstoneWallBlock extends WallBlock {
   public MossyCobbledWyvstoneWallBlock() {
      super(Properties.of().sound(SoundType.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops().forceSolidOn());
   }
}
