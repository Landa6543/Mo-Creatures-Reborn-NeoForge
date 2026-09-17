package net.mocreatures.block;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class DeepWyvstoneWallBlock extends WallBlock {
   public DeepWyvstoneWallBlock() {
      super(Properties.of().sound(SoundType.STONE).strength(3.0F, 6.0F).requiresCorrectToolForDrops().forceSolidOn());
   }
}
