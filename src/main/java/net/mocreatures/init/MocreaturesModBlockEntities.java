package net.mocreatures.init;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.BlockEntityType.BlockEntitySupplier;
import net.minecraft.world.level.block.entity.BlockEntityType.Builder;
import net.mocreatures.block.entity.FireflyJarTileEntity;
import net.mocreatures.block.entity.HangingFireflyJarTileEntity;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class MocreaturesModBlockEntities {
   public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, "mocreatures");
   public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> FIREFLY_JAR = register(
      "firefly_jar", MocreaturesModBlocks.FIREFLY_JAR, FireflyJarTileEntity::new
   );
   public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> HANGING_FIREFLY_JAR = register(
      "hanging_firefly_jar", MocreaturesModBlocks.HANGING_FIREFLY_JAR, HangingFireflyJarTileEntity::new
   );

   private static DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> register(
      String registryname, DeferredHolder<Block, Block> block, BlockEntitySupplier<?> supplier
   ) {
      return REGISTRY.register(registryname, () -> Builder.of(supplier, new Block[]{(Block)block.get()}).build(null));
   }
}
