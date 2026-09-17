package net.mocreatures.procedures;

import javax.annotation.Nullable;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.mocreatures.entity.ElephantEntity;
import net.neoforged.bus.api.Event;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.tick.EntityTickEvent.Pre;

@EventBusSubscriber
public class ElephantTuskBreakingProcedure {
   @SubscribeEvent
   public static void onEntityTick(Pre event) {
      execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
   }

   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
      execute(null, world, x, y, z, entity);
   }

   private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
      if (entity != null) {
         if (entity instanceof ElephantEntity
            && entity instanceof ElephantEntity _datEntL1
            && (Boolean)_datEntL1.getEntityData().get(ElephantEntity.DATA_Wood_Tusks)
            && entity.isVehicle()) {
            if (entity instanceof ElephantEntity _datEntSetI) {
               _datEntSetI.getEntityData()
                  .set(
                     ElephantEntity.DATA_Mine,
                     (entity instanceof ElephantEntity _datEntI ? (Integer)_datEntI.getEntityData().get(ElephantEntity.DATA_Mine) : 0) + 1
                  );
            }

            if ((entity instanceof ElephantEntity _datEntI ? (Integer)_datEntI.getEntityData().get(ElephantEntity.DATA_Mine) : 0) >= 20) {
               if (entity instanceof ElephantEntity _datEntSetI) {
                  _datEntSetI.getEntityData().set(ElephantEntity.DATA_Mine, 0);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() + 1.0, y, z))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:wooden_tusk_mineable_blocks")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() + 1.0, y, z);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX() + 1.0, y, z), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() + 1.0, y, entity.getZ() + 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:wooden_tusk_mineable_blocks")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() + 1.0, y, entity.getZ() + 1.0);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX() + 1.0, y, entity.getZ() + 1.0), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() + 1.0, y, entity.getZ() - 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:wooden_tusk_mineable_blocks")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() + 1.0, y, entity.getZ() - 1.0);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX() + 1.0, y, entity.getZ() - 1.0), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() + 1.0, entity.getY() + 1.0, z))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:wooden_tusk_mineable_blocks")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() + 1.0, entity.getY() + 1.0, z);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX() + 1.0, entity.getY() + 1.0, z), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() + 1.0, entity.getY() + 1.0, entity.getZ() - 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:wooden_tusk_mineable_blocks")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() + 1.0, entity.getY() + 1.0, entity.getZ() - 1.0);
                  Block.dropResources(
                     world.getBlockState(_pos), world, BlockPos.containing(entity.getX() + 1.0, entity.getY() + 1.0, entity.getZ() - 1.0), null
                  );
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() + 1.0, entity.getY() + 1.0, entity.getZ() + 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:wooden_tusk_mineable_blocks")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() + 1.0, entity.getY() + 1.0, entity.getZ() + 1.0);
                  Block.dropResources(
                     world.getBlockState(_pos), world, BlockPos.containing(entity.getX() + 1.0, entity.getY() + 1.0, entity.getZ() + 1.0), null
                  );
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() + 1.0, entity.getY() + 2.0, z))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:wooden_tusk_mineable_blocks")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() + 1.0, entity.getY() + 2.0, z);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX() + 1.0, entity.getY() + 2.0, z), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() + 1.0, entity.getY() + 2.0, entity.getZ() + 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:wooden_tusk_mineable_blocks")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() + 1.0, entity.getY() + 2.0, entity.getZ() + 1.0);
                  Block.dropResources(
                     world.getBlockState(_pos), world, BlockPos.containing(entity.getX() + 1.0, entity.getY() + 2.0, entity.getZ() + 1.0), null
                  );
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() + 1.0, entity.getY() + 2.0, entity.getZ() - 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:wooden_tusk_mineable_blocks")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() + 1.0, entity.getY() + 2.0, entity.getZ() - 1.0);
                  Block.dropResources(
                     world.getBlockState(_pos), world, BlockPos.containing(entity.getX() + 1.0, entity.getY() + 2.0, entity.getZ() - 1.0), null
                  );
                  world.destroyBlock(_pos, false);
               }
            }
         }

         if (entity instanceof ElephantEntity
            && entity instanceof ElephantEntity _datEntL98
            && (Boolean)_datEntL98.getEntityData().get(ElephantEntity.DATA_Wood_Tusks)
            && entity.isVehicle()) {
            if (entity instanceof ElephantEntity _datEntSetI) {
               _datEntSetI.getEntityData()
                  .set(
                     ElephantEntity.DATA_Mine2,
                     (entity instanceof ElephantEntity _datEntI ? (Integer)_datEntI.getEntityData().get(ElephantEntity.DATA_Mine2) : 0) + 1
                  );
            }

            if ((entity instanceof ElephantEntity _datEntI ? (Integer)_datEntI.getEntityData().get(ElephantEntity.DATA_Mine2) : 0) >= 20) {
               if (entity instanceof ElephantEntity _datEntSetI) {
                  _datEntSetI.getEntityData().set(ElephantEntity.DATA_Mine2, 0);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() - 1.0, y, z))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:wooden_tusk_mineable_blocks")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() - 1.0, y, z);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX() - 1.0, y, z), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() - 1.0, y, entity.getZ() - 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:wooden_tusk_mineable_blocks")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() - 1.0, y, entity.getZ() - 1.0);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX() - 1.0, y, entity.getZ() - 1.0), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() - 1.0, y, entity.getZ() + 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:wooden_tusk_mineable_blocks")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() - 1.0, y, entity.getZ() + 1.0);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX() - 1.0, y, entity.getZ() + 1.0), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() - 1.0, entity.getY() + 1.0, z))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:wooden_tusk_mineable_blocks")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() - 1.0, entity.getY() + 1.0, z);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX() - 1.0, entity.getY() + 1.0, z), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() - 1.0, entity.getY() + 1.0, entity.getZ() - 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:wooden_tusk_mineable_blocks")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() - 1.0, entity.getY() + 1.0, entity.getZ() - 1.0);
                  Block.dropResources(
                     world.getBlockState(_pos), world, BlockPos.containing(entity.getX() - 1.0, entity.getY() + 1.0, entity.getZ() - 1.0), null
                  );
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() - 1.0, entity.getY() + 1.0, entity.getZ() + 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:wooden_tusk_mineable_blocks")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() - 1.0, entity.getY() + 1.0, entity.getZ() + 1.0);
                  Block.dropResources(
                     world.getBlockState(_pos), world, BlockPos.containing(entity.getX() - 1.0, entity.getY() + 1.0, entity.getZ() + 1.0), null
                  );
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() - 1.0, entity.getY() + 2.0, z))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:wooden_tusk_mineable_blocks")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() - 1.0, entity.getY() + 2.0, z);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX() - 1.0, entity.getY() + 2.0, z), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() - 1.0, entity.getY() + 2.0, entity.getZ() - 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:wooden_tusk_mineable_blocks")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() - 1.0, entity.getY() + 2.0, entity.getZ() - 1.0);
                  Block.dropResources(
                     world.getBlockState(_pos), world, BlockPos.containing(entity.getX() - 1.0, entity.getY() + 2.0, entity.getZ() - 1.0), null
                  );
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() - 1.0, entity.getY() + 2.0, entity.getZ() + 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:wooden_tusk_mineable_blocks")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() - 1.0, entity.getY() + 2.0, entity.getZ() + 1.0);
                  Block.dropResources(
                     world.getBlockState(_pos), world, BlockPos.containing(entity.getX() - 1.0, entity.getY() + 2.0, entity.getZ() + 1.0), null
                  );
                  world.destroyBlock(_pos, false);
               }
            }
         }

         if (entity instanceof ElephantEntity
            && entity instanceof ElephantEntity _datEntL195
            && (Boolean)_datEntL195.getEntityData().get(ElephantEntity.DATA_Wood_Tusks)
            && entity.isVehicle()) {
            if (entity instanceof ElephantEntity _datEntSetI) {
               _datEntSetI.getEntityData()
                  .set(
                     ElephantEntity.DATA_Mine3,
                     (entity instanceof ElephantEntity _datEntI ? (Integer)_datEntI.getEntityData().get(ElephantEntity.DATA_Mine3) : 0) + 1
                  );
            }

            if ((entity instanceof ElephantEntity _datEntI ? (Integer)_datEntI.getEntityData().get(ElephantEntity.DATA_Mine3) : 0) >= 20) {
               if (entity instanceof ElephantEntity _datEntSetI) {
                  _datEntSetI.getEntityData().set(ElephantEntity.DATA_Mine3, 0);
               }

               if (world.getBlockState(BlockPos.containing(x, y, entity.getZ() + 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:wooden_tusk_mineable_blocks")))) {
                  BlockPos _pos = BlockPos.containing(x, y, entity.getZ() + 1.0);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, entity.getZ() + 1.0), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() + 1.0, y, entity.getZ() + 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:wooden_tusk_mineable_blocks")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() + 1.0, y, entity.getZ() + 1.0);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX() + 1.0, y, entity.getZ() + 1.0), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() - 1.0, y, entity.getZ() + 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:wooden_tusk_mineable_blocks")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() - 1.0, y, entity.getZ() + 1.0);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX() - 1.0, y, entity.getZ() + 1.0), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(x, entity.getY() + 1.0, entity.getZ() + 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:wooden_tusk_mineable_blocks")))) {
                  BlockPos _pos = BlockPos.containing(x, entity.getY() + 1.0, entity.getZ() + 1.0);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, entity.getY() + 1.0, entity.getZ() + 1.0), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() + 1.0, entity.getY() + 1.0, entity.getZ() + 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:wooden_tusk_mineable_blocks")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() + 1.0, entity.getY() + 1.0, entity.getZ() + 1.0);
                  Block.dropResources(
                     world.getBlockState(_pos), world, BlockPos.containing(entity.getX() + 1.0, entity.getY() + 1.0, entity.getZ() + 1.0), null
                  );
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() - 1.0, entity.getY() + 1.0, entity.getZ() + 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:wooden_tusk_mineable_blocks")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() - 1.0, entity.getY() + 1.0, entity.getZ() + 1.0);
                  Block.dropResources(
                     world.getBlockState(_pos), world, BlockPos.containing(entity.getX() - 1.0, entity.getY() + 1.0, entity.getZ() + 1.0), null
                  );
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(x, entity.getY() + 2.0, entity.getZ() + 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:wooden_tusk_mineable_blocks")))) {
                  BlockPos _pos = BlockPos.containing(x, entity.getY() + 2.0, entity.getZ() + 1.0);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, entity.getY() + 2.0, entity.getZ() + 1.0), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() + 1.0, entity.getY() + 2.0, entity.getZ() + 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:wooden_tusk_mineable_blocks")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() + 1.0, entity.getY() + 2.0, entity.getZ() + 1.0);
                  Block.dropResources(
                     world.getBlockState(_pos), world, BlockPos.containing(entity.getX() + 1.0, entity.getY() + 2.0, entity.getZ() + 1.0), null
                  );
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() - 1.0, entity.getY() + 2.0, entity.getZ() + 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:wooden_tusk_mineable_blocks")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() - 1.0, entity.getY() + 2.0, entity.getZ() + 1.0);
                  Block.dropResources(
                     world.getBlockState(_pos), world, BlockPos.containing(entity.getX() - 1.0, entity.getY() + 2.0, entity.getZ() + 1.0), null
                  );
                  world.destroyBlock(_pos, false);
               }
            }
         }

         if (entity instanceof ElephantEntity
            && entity instanceof ElephantEntity _datEntL292
            && (Boolean)_datEntL292.getEntityData().get(ElephantEntity.DATA_Wood_Tusks)
            && entity.isVehicle()) {
            if (entity instanceof ElephantEntity _datEntSetI) {
               _datEntSetI.getEntityData()
                  .set(
                     ElephantEntity.DATA_Mine4,
                     (entity instanceof ElephantEntity _datEntI ? (Integer)_datEntI.getEntityData().get(ElephantEntity.DATA_Mine4) : 0) + 1
                  );
            }

            if ((entity instanceof ElephantEntity _datEntI ? (Integer)_datEntI.getEntityData().get(ElephantEntity.DATA_Mine4) : 0) >= 20) {
               if (entity instanceof ElephantEntity _datEntSetI) {
                  _datEntSetI.getEntityData().set(ElephantEntity.DATA_Mine4, 0);
               }

               if (world.getBlockState(BlockPos.containing(x, y, entity.getZ() - 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:wooden_tusk_mineable_blocks")))) {
                  BlockPos _pos = BlockPos.containing(x, y, entity.getZ() - 1.0);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, entity.getZ() - 1.0), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() + 1.0, y, entity.getZ() - 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:wooden_tusk_mineable_blocks")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() + 1.0, y, entity.getZ() - 1.0);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX() + 1.0, y, entity.getZ() - 1.0), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() - 1.0, y, entity.getZ() - 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:wooden_tusk_mineable_blocks")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() - 1.0, y, entity.getZ() - 1.0);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX() - 1.0, y, entity.getZ() - 1.0), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(x, entity.getY() + 1.0, entity.getZ() - 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:wooden_tusk_mineable_blocks")))) {
                  BlockPos _pos = BlockPos.containing(x, entity.getY() + 1.0, entity.getZ() - 1.0);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, entity.getY() + 1.0, entity.getZ() - 1.0), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() + 1.0, entity.getY() + 1.0, entity.getZ() - 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:wooden_tusk_mineable_blocks")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() + 1.0, entity.getY() + 1.0, entity.getZ() - 1.0);
                  Block.dropResources(
                     world.getBlockState(_pos), world, BlockPos.containing(entity.getX() + 1.0, entity.getY() + 1.0, entity.getZ() - 1.0), null
                  );
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() - 1.0, entity.getY() + 1.0, entity.getZ() - 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:wooden_tusk_mineable_blocks")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() - 1.0, entity.getY() + 1.0, entity.getZ() - 1.0);
                  Block.dropResources(
                     world.getBlockState(_pos), world, BlockPos.containing(entity.getX() - 1.0, entity.getY() + 1.0, entity.getZ() - 1.0), null
                  );
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(x, entity.getY() + 2.0, entity.getZ() - 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:wooden_tusk_mineable_blocks")))) {
                  BlockPos _pos = BlockPos.containing(x, entity.getY() + 2.0, entity.getZ() - 1.0);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, entity.getY() + 2.0, entity.getZ() - 1.0), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() + 1.0, entity.getY() + 2.0, entity.getZ() - 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:wooden_tusk_mineable_blocks")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() + 1.0, entity.getY() + 2.0, entity.getZ() - 1.0);
                  Block.dropResources(
                     world.getBlockState(_pos), world, BlockPos.containing(entity.getX() + 1.0, entity.getY() + 2.0, entity.getZ() - 1.0), null
                  );
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() - 1.0, entity.getY() + 2.0, entity.getZ() - 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:wooden_tusk_mineable_blocks")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() - 1.0, entity.getY() + 2.0, entity.getZ() - 1.0);
                  Block.dropResources(
                     world.getBlockState(_pos), world, BlockPos.containing(entity.getX() - 1.0, entity.getY() + 2.0, entity.getZ() - 1.0), null
                  );
                  world.destroyBlock(_pos, false);
               }
            }
         }

         if (entity instanceof ElephantEntity
            && entity instanceof ElephantEntity _datEntL389
            && (Boolean)_datEntL389.getEntityData().get(ElephantEntity.DATA_Iron_Tusks)
            && entity.isVehicle()) {
            if (entity instanceof ElephantEntity _datEntSetI) {
               _datEntSetI.getEntityData()
                  .set(
                     ElephantEntity.DATA_Mine,
                     (entity instanceof ElephantEntity _datEntI ? (Integer)_datEntI.getEntityData().get(ElephantEntity.DATA_Mine) : 0) + 1
                  );
            }

            if ((entity instanceof ElephantEntity _datEntI ? (Integer)_datEntI.getEntityData().get(ElephantEntity.DATA_Mine) : 0) >= 20) {
               if (entity instanceof ElephantEntity _datEntSetI) {
                  _datEntSetI.getEntityData().set(ElephantEntity.DATA_Mine, 0);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() + 1.0, y, z))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:iron_tusk_mineable_blocks")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() + 1.0, y, z);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX() + 1.0, y, z), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() + 1.0, y, entity.getZ() + 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:iron_tusk_mineable_blocks")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() + 1.0, y, entity.getZ() + 1.0);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX() + 1.0, y, entity.getZ() + 1.0), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() + 1.0, y, entity.getZ() - 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:iron_tusk_mineable_blocks")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() + 1.0, y, entity.getZ() - 1.0);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX() + 1.0, y, entity.getZ() - 1.0), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() + 1.0, entity.getY() + 1.0, z))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:iron_tusk_mineable_blocks")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() + 1.0, entity.getY() + 1.0, z);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX() + 1.0, entity.getY() + 1.0, z), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() + 1.0, entity.getY() + 1.0, entity.getZ() - 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:iron_tusk_mineable_blocks")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() + 1.0, entity.getY() + 1.0, entity.getZ() - 1.0);
                  Block.dropResources(
                     world.getBlockState(_pos), world, BlockPos.containing(entity.getX() + 1.0, entity.getY() + 1.0, entity.getZ() - 1.0), null
                  );
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() + 1.0, entity.getY() + 1.0, entity.getZ() + 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:iron_tusk_mineable_blocks")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() + 1.0, entity.getY() + 1.0, entity.getZ() + 1.0);
                  Block.dropResources(
                     world.getBlockState(_pos), world, BlockPos.containing(entity.getX() + 1.0, entity.getY() + 1.0, entity.getZ() + 1.0), null
                  );
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() + 1.0, entity.getY() + 2.0, z))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:iron_tusk_mineable_blocks")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() + 1.0, entity.getY() + 2.0, z);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX() + 1.0, entity.getY() + 2.0, z), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() + 1.0, entity.getY() + 2.0, entity.getZ() + 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:iron_tusk_mineable_blocks")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() + 1.0, entity.getY() + 2.0, entity.getZ() + 1.0);
                  Block.dropResources(
                     world.getBlockState(_pos), world, BlockPos.containing(entity.getX() + 1.0, entity.getY() + 2.0, entity.getZ() + 1.0), null
                  );
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() + 1.0, entity.getY() + 2.0, entity.getZ() - 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:iron_tusk_mineable_blocks")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() + 1.0, entity.getY() + 2.0, entity.getZ() - 1.0);
                  Block.dropResources(
                     world.getBlockState(_pos), world, BlockPos.containing(entity.getX() + 1.0, entity.getY() + 2.0, entity.getZ() - 1.0), null
                  );
                  world.destroyBlock(_pos, false);
               }
            }
         }

         if (entity instanceof ElephantEntity
            && entity instanceof ElephantEntity _datEntL486
            && (Boolean)_datEntL486.getEntityData().get(ElephantEntity.DATA_Iron_Tusks)
            && entity.isVehicle()) {
            if (entity instanceof ElephantEntity _datEntSetI) {
               _datEntSetI.getEntityData()
                  .set(
                     ElephantEntity.DATA_Mine2,
                     (entity instanceof ElephantEntity _datEntI ? (Integer)_datEntI.getEntityData().get(ElephantEntity.DATA_Mine2) : 0) + 1
                  );
            }

            if ((entity instanceof ElephantEntity _datEntI ? (Integer)_datEntI.getEntityData().get(ElephantEntity.DATA_Mine2) : 0) >= 20) {
               if (entity instanceof ElephantEntity _datEntSetI) {
                  _datEntSetI.getEntityData().set(ElephantEntity.DATA_Mine2, 0);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() - 1.0, y, z))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:iron_tusk_mineable_blocks")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() - 1.0, y, z);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX() - 1.0, y, z), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() - 1.0, y, entity.getZ() - 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:iron_tusk_mineable_blocks")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() - 1.0, y, entity.getZ() - 1.0);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX() - 1.0, y, entity.getZ() - 1.0), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() - 1.0, y, entity.getZ() + 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:iron_tusk_mineable_blocks")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() - 1.0, y, entity.getZ() + 1.0);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX() - 1.0, y, entity.getZ() + 1.0), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() - 1.0, entity.getY() + 1.0, z))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:iron_tusk_mineable_blocks")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() - 1.0, entity.getY() + 1.0, z);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX() - 1.0, entity.getY() + 1.0, z), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() - 1.0, entity.getY() + 1.0, entity.getZ() - 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:iron_tusk_mineable_blocks")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() - 1.0, entity.getY() + 1.0, entity.getZ() - 1.0);
                  Block.dropResources(
                     world.getBlockState(_pos), world, BlockPos.containing(entity.getX() - 1.0, entity.getY() + 1.0, entity.getZ() - 1.0), null
                  );
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() - 1.0, entity.getY() + 1.0, entity.getZ() + 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:iron_tusk_mineable_blocks")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() - 1.0, entity.getY() + 1.0, entity.getZ() + 1.0);
                  Block.dropResources(
                     world.getBlockState(_pos), world, BlockPos.containing(entity.getX() - 1.0, entity.getY() + 1.0, entity.getZ() + 1.0), null
                  );
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() - 1.0, entity.getY() + 2.0, z))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:iron_tusk_mineable_blocks")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() - 1.0, entity.getY() + 2.0, z);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX() - 1.0, entity.getY() + 2.0, z), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() - 1.0, entity.getY() + 2.0, entity.getZ() - 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:iron_tusk_mineable_blocks")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() - 1.0, entity.getY() + 2.0, entity.getZ() - 1.0);
                  Block.dropResources(
                     world.getBlockState(_pos), world, BlockPos.containing(entity.getX() - 1.0, entity.getY() + 2.0, entity.getZ() - 1.0), null
                  );
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() - 1.0, entity.getY() + 2.0, entity.getZ() + 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:iron_tusk_mineable_blocks")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() - 1.0, entity.getY() + 2.0, entity.getZ() + 1.0);
                  Block.dropResources(
                     world.getBlockState(_pos), world, BlockPos.containing(entity.getX() - 1.0, entity.getY() + 2.0, entity.getZ() + 1.0), null
                  );
                  world.destroyBlock(_pos, false);
               }
            }
         }

         if (entity instanceof ElephantEntity
            && entity instanceof ElephantEntity _datEntL583
            && (Boolean)_datEntL583.getEntityData().get(ElephantEntity.DATA_Iron_Tusks)
            && entity.isVehicle()) {
            if (entity instanceof ElephantEntity _datEntSetI) {
               _datEntSetI.getEntityData()
                  .set(
                     ElephantEntity.DATA_Mine3,
                     (entity instanceof ElephantEntity _datEntI ? (Integer)_datEntI.getEntityData().get(ElephantEntity.DATA_Mine3) : 0) + 1
                  );
            }

            if ((entity instanceof ElephantEntity _datEntI ? (Integer)_datEntI.getEntityData().get(ElephantEntity.DATA_Mine3) : 0) >= 20) {
               if (entity instanceof ElephantEntity _datEntSetI) {
                  _datEntSetI.getEntityData().set(ElephantEntity.DATA_Mine3, 0);
               }

               if (world.getBlockState(BlockPos.containing(x, y, entity.getZ() + 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:iron_tusk_mineable_blocks")))) {
                  BlockPos _pos = BlockPos.containing(x, y, entity.getZ() + 1.0);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, entity.getZ() + 1.0), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() + 1.0, y, entity.getZ() + 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:iron_tusk_mineable_blocks")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() + 1.0, y, entity.getZ() + 1.0);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX() + 1.0, y, entity.getZ() + 1.0), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() - 1.0, y, entity.getZ() + 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:iron_tusk_mineable_blocks")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() - 1.0, y, entity.getZ() + 1.0);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX() - 1.0, y, entity.getZ() + 1.0), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(x, entity.getY() + 1.0, entity.getZ() + 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:iron_tusk_mineable_blocks")))) {
                  BlockPos _pos = BlockPos.containing(x, entity.getY() + 1.0, entity.getZ() + 1.0);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, entity.getY() + 1.0, entity.getZ() + 1.0), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() + 1.0, entity.getY() + 1.0, entity.getZ() + 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:iron_tusk_mineable_blocks")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() + 1.0, entity.getY() + 1.0, entity.getZ() + 1.0);
                  Block.dropResources(
                     world.getBlockState(_pos), world, BlockPos.containing(entity.getX() + 1.0, entity.getY() + 1.0, entity.getZ() + 1.0), null
                  );
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() - 1.0, entity.getY() + 1.0, entity.getZ() + 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:iron_tusk_mineable_blocks")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() - 1.0, entity.getY() + 1.0, entity.getZ() + 1.0);
                  Block.dropResources(
                     world.getBlockState(_pos), world, BlockPos.containing(entity.getX() - 1.0, entity.getY() + 1.0, entity.getZ() + 1.0), null
                  );
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(x, entity.getY() + 2.0, entity.getZ() + 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:iron_tusk_mineable_blocks")))) {
                  BlockPos _pos = BlockPos.containing(x, entity.getY() + 2.0, entity.getZ() + 1.0);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, entity.getY() + 2.0, entity.getZ() + 1.0), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() + 1.0, entity.getY() + 2.0, entity.getZ() + 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:iron_tusk_mineable_blocks")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() + 1.0, entity.getY() + 2.0, entity.getZ() + 1.0);
                  Block.dropResources(
                     world.getBlockState(_pos), world, BlockPos.containing(entity.getX() + 1.0, entity.getY() + 2.0, entity.getZ() + 1.0), null
                  );
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() - 1.0, entity.getY() + 2.0, entity.getZ() + 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:iron_tusk_mineable_blocks")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() - 1.0, entity.getY() + 2.0, entity.getZ() + 1.0);
                  Block.dropResources(
                     world.getBlockState(_pos), world, BlockPos.containing(entity.getX() - 1.0, entity.getY() + 2.0, entity.getZ() + 1.0), null
                  );
                  world.destroyBlock(_pos, false);
               }
            }
         }

         if (entity instanceof ElephantEntity
            && entity instanceof ElephantEntity _datEntL680
            && (Boolean)_datEntL680.getEntityData().get(ElephantEntity.DATA_Iron_Tusks)
            && entity.isVehicle()) {
            if (entity instanceof ElephantEntity _datEntSetI) {
               _datEntSetI.getEntityData()
                  .set(
                     ElephantEntity.DATA_Mine4,
                     (entity instanceof ElephantEntity _datEntI ? (Integer)_datEntI.getEntityData().get(ElephantEntity.DATA_Mine4) : 0) + 1
                  );
            }

            if ((entity instanceof ElephantEntity _datEntI ? (Integer)_datEntI.getEntityData().get(ElephantEntity.DATA_Mine4) : 0) >= 20) {
               if (entity instanceof ElephantEntity _datEntSetI) {
                  _datEntSetI.getEntityData().set(ElephantEntity.DATA_Mine4, 0);
               }

               if (world.getBlockState(BlockPos.containing(x, y, entity.getZ() - 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:iron_tusk_mineable_blocks")))) {
                  BlockPos _pos = BlockPos.containing(x, y, entity.getZ() - 1.0);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, entity.getZ() - 1.0), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() + 1.0, y, entity.getZ() - 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:iron_tusk_mineable_blocks")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() + 1.0, y, entity.getZ() - 1.0);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX() + 1.0, y, entity.getZ() - 1.0), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() - 1.0, y, entity.getZ() - 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:iron_tusk_mineable_blocks")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() - 1.0, y, entity.getZ() - 1.0);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX() - 1.0, y, entity.getZ() - 1.0), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(x, entity.getY() + 1.0, entity.getZ() - 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:iron_tusk_mineable_blocks")))) {
                  BlockPos _pos = BlockPos.containing(x, entity.getY() + 1.0, entity.getZ() - 1.0);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, entity.getY() + 1.0, entity.getZ() - 1.0), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() + 1.0, entity.getY() + 1.0, entity.getZ() - 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:iron_tusk_mineable_blocks")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() + 1.0, entity.getY() + 1.0, entity.getZ() - 1.0);
                  Block.dropResources(
                     world.getBlockState(_pos), world, BlockPos.containing(entity.getX() + 1.0, entity.getY() + 1.0, entity.getZ() - 1.0), null
                  );
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() - 1.0, entity.getY() + 1.0, entity.getZ() - 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:iron_tusk_mineable_blocks")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() - 1.0, entity.getY() + 1.0, entity.getZ() - 1.0);
                  Block.dropResources(
                     world.getBlockState(_pos), world, BlockPos.containing(entity.getX() - 1.0, entity.getY() + 1.0, entity.getZ() - 1.0), null
                  );
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(x, entity.getY() + 2.0, entity.getZ() - 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:iron_tusk_mineable_blocks")))) {
                  BlockPos _pos = BlockPos.containing(x, entity.getY() + 2.0, entity.getZ() - 1.0);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, entity.getY() + 2.0, entity.getZ() - 1.0), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() + 1.0, entity.getY() + 2.0, entity.getZ() - 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:iron_tusk_mineable_blocks")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() + 1.0, entity.getY() + 2.0, entity.getZ() - 1.0);
                  Block.dropResources(
                     world.getBlockState(_pos), world, BlockPos.containing(entity.getX() + 1.0, entity.getY() + 2.0, entity.getZ() - 1.0), null
                  );
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() - 1.0, entity.getY() + 2.0, entity.getZ() - 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:iron_tusk_mineable_blocks")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() - 1.0, entity.getY() + 2.0, entity.getZ() - 1.0);
                  Block.dropResources(
                     world.getBlockState(_pos), world, BlockPos.containing(entity.getX() - 1.0, entity.getY() + 2.0, entity.getZ() - 1.0), null
                  );
                  world.destroyBlock(_pos, false);
               }
            }
         }

         if (entity instanceof ElephantEntity
            && entity instanceof ElephantEntity _datEntL777
            && (Boolean)_datEntL777.getEntityData().get(ElephantEntity.DATA_Diamond_Tusks)
            && entity.isVehicle()) {
            if (entity instanceof ElephantEntity _datEntSetI) {
               _datEntSetI.getEntityData()
                  .set(
                     ElephantEntity.DATA_Mine,
                     (entity instanceof ElephantEntity _datEntI ? (Integer)_datEntI.getEntityData().get(ElephantEntity.DATA_Mine) : 0) + 1
                  );
            }

            if ((entity instanceof ElephantEntity _datEntI ? (Integer)_datEntI.getEntityData().get(ElephantEntity.DATA_Mine) : 0) >= 15) {
               if (entity instanceof ElephantEntity _datEntSetI) {
                  _datEntSetI.getEntityData().set(ElephantEntity.DATA_Mine, 0);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() + 1.0, y, z))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:diamond/netherite_tusk_mineable_block")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() + 1.0, y, z);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX() + 1.0, y, z), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() + 1.0, y, entity.getZ() + 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:diamond/netherite_tusk_mineable_block")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() + 1.0, y, entity.getZ() + 1.0);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX() + 1.0, y, entity.getZ() + 1.0), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() + 1.0, y, entity.getZ() - 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:diamond/netherite_tusk_mineable_block")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() + 1.0, y, entity.getZ() - 1.0);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX() + 1.0, y, entity.getZ() - 1.0), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() + 1.0, entity.getY() + 1.0, z))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:diamond/netherite_tusk_mineable_block")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() + 1.0, entity.getY() + 1.0, z);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX() + 1.0, entity.getY() + 1.0, z), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() + 1.0, entity.getY() + 1.0, entity.getZ() - 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:diamond/netherite_tusk_mineable_block")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() + 1.0, entity.getY() + 1.0, entity.getZ() - 1.0);
                  Block.dropResources(
                     world.getBlockState(_pos), world, BlockPos.containing(entity.getX() + 1.0, entity.getY() + 1.0, entity.getZ() - 1.0), null
                  );
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() + 1.0, entity.getY() + 1.0, entity.getZ() + 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:diamond/netherite_tusk_mineable_block")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() + 1.0, entity.getY() + 1.0, entity.getZ() + 1.0);
                  Block.dropResources(
                     world.getBlockState(_pos), world, BlockPos.containing(entity.getX() + 1.0, entity.getY() + 1.0, entity.getZ() + 1.0), null
                  );
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() + 1.0, entity.getY() + 2.0, z))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:diamond/netherite_tusk_mineable_block")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() + 1.0, entity.getY() + 2.0, z);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX() + 1.0, entity.getY() + 2.0, z), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() + 1.0, entity.getY() + 2.0, entity.getZ() + 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:diamond/netherite_tusk_mineable_block")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() + 1.0, entity.getY() + 2.0, entity.getZ() + 1.0);
                  Block.dropResources(
                     world.getBlockState(_pos), world, BlockPos.containing(entity.getX() + 1.0, entity.getY() + 2.0, entity.getZ() + 1.0), null
                  );
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() + 1.0, entity.getY() + 2.0, entity.getZ() - 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:diamond/netherite_tusk_mineable_block")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() + 1.0, entity.getY() + 2.0, entity.getZ() - 1.0);
                  Block.dropResources(
                     world.getBlockState(_pos), world, BlockPos.containing(entity.getX() + 1.0, entity.getY() + 2.0, entity.getZ() - 1.0), null
                  );
                  world.destroyBlock(_pos, false);
               }
            }
         }

         if (entity instanceof ElephantEntity
            && entity instanceof ElephantEntity _datEntL874
            && (Boolean)_datEntL874.getEntityData().get(ElephantEntity.DATA_Diamond_Tusks)
            && entity.isVehicle()) {
            if (entity instanceof ElephantEntity _datEntSetI) {
               _datEntSetI.getEntityData()
                  .set(
                     ElephantEntity.DATA_Mine2,
                     (entity instanceof ElephantEntity _datEntI ? (Integer)_datEntI.getEntityData().get(ElephantEntity.DATA_Mine2) : 0) + 1
                  );
            }

            if ((entity instanceof ElephantEntity _datEntI ? (Integer)_datEntI.getEntityData().get(ElephantEntity.DATA_Mine2) : 0) >= 15) {
               if (entity instanceof ElephantEntity _datEntSetI) {
                  _datEntSetI.getEntityData().set(ElephantEntity.DATA_Mine2, 0);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() - 1.0, y, z))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:diamond/netherite_tusk_mineable_block")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() - 1.0, y, z);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX() - 1.0, y, z), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() - 1.0, y, entity.getZ() - 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:diamond/netherite_tusk_mineable_block")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() - 1.0, y, entity.getZ() - 1.0);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX() - 1.0, y, entity.getZ() - 1.0), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() - 1.0, y, entity.getZ() + 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:diamond/netherite_tusk_mineable_block")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() - 1.0, y, entity.getZ() + 1.0);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX() - 1.0, y, entity.getZ() + 1.0), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() - 1.0, entity.getY() + 1.0, z))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:diamond/netherite_tusk_mineable_block")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() - 1.0, entity.getY() + 1.0, z);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX() - 1.0, entity.getY() + 1.0, z), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() - 1.0, entity.getY() + 1.0, entity.getZ() - 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:diamond/netherite_tusk_mineable_block")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() - 1.0, entity.getY() + 1.0, entity.getZ() - 1.0);
                  Block.dropResources(
                     world.getBlockState(_pos), world, BlockPos.containing(entity.getX() - 1.0, entity.getY() + 1.0, entity.getZ() - 1.0), null
                  );
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() - 1.0, entity.getY() + 1.0, entity.getZ() + 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:diamond/netherite_tusk_mineable_block")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() - 1.0, entity.getY() + 1.0, entity.getZ() + 1.0);
                  Block.dropResources(
                     world.getBlockState(_pos), world, BlockPos.containing(entity.getX() - 1.0, entity.getY() + 1.0, entity.getZ() + 1.0), null
                  );
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() - 1.0, entity.getY() + 2.0, z))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:diamond/netherite_tusk_mineable_block")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() - 1.0, entity.getY() + 2.0, z);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX() - 1.0, entity.getY() + 2.0, z), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() - 1.0, entity.getY() + 2.0, entity.getZ() - 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:diamond/netherite_tusk_mineable_block")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() - 1.0, entity.getY() + 2.0, entity.getZ() - 1.0);
                  Block.dropResources(
                     world.getBlockState(_pos), world, BlockPos.containing(entity.getX() - 1.0, entity.getY() + 2.0, entity.getZ() - 1.0), null
                  );
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() - 1.0, entity.getY() + 2.0, entity.getZ() + 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:diamond/netherite_tusk_mineable_block")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() - 1.0, entity.getY() + 2.0, entity.getZ() + 1.0);
                  Block.dropResources(
                     world.getBlockState(_pos), world, BlockPos.containing(entity.getX() - 1.0, entity.getY() + 2.0, entity.getZ() + 1.0), null
                  );
                  world.destroyBlock(_pos, false);
               }
            }
         }

         if (entity instanceof ElephantEntity
            && entity instanceof ElephantEntity _datEntL971
            && (Boolean)_datEntL971.getEntityData().get(ElephantEntity.DATA_Diamond_Tusks)
            && entity.isVehicle()) {
            if (entity instanceof ElephantEntity _datEntSetI) {
               _datEntSetI.getEntityData()
                  .set(
                     ElephantEntity.DATA_Mine3,
                     (entity instanceof ElephantEntity _datEntI ? (Integer)_datEntI.getEntityData().get(ElephantEntity.DATA_Mine3) : 0) + 1
                  );
            }

            if ((entity instanceof ElephantEntity _datEntI ? (Integer)_datEntI.getEntityData().get(ElephantEntity.DATA_Mine3) : 0) >= 15) {
               if (entity instanceof ElephantEntity _datEntSetI) {
                  _datEntSetI.getEntityData().set(ElephantEntity.DATA_Mine3, 0);
               }

               if (world.getBlockState(BlockPos.containing(x, y, entity.getZ() + 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:diamond/netherite_tusk_mineable_block")))) {
                  BlockPos _pos = BlockPos.containing(x, y, entity.getZ() + 1.0);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, entity.getZ() + 1.0), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() + 1.0, y, entity.getZ() + 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:diamond/netherite_tusk_mineable_block")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() + 1.0, y, entity.getZ() + 1.0);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX() + 1.0, y, entity.getZ() + 1.0), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() - 1.0, y, entity.getZ() + 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:diamond/netherite_tusk_mineable_block")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() - 1.0, y, entity.getZ() + 1.0);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX() - 1.0, y, entity.getZ() + 1.0), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(x, entity.getY() + 1.0, entity.getZ() + 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:diamond/netherite_tusk_mineable_block")))) {
                  BlockPos _pos = BlockPos.containing(x, entity.getY() + 1.0, entity.getZ() + 1.0);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, entity.getY() + 1.0, entity.getZ() + 1.0), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() + 1.0, entity.getY() + 1.0, entity.getZ() + 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:diamond/netherite_tusk_mineable_block")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() + 1.0, entity.getY() + 1.0, entity.getZ() + 1.0);
                  Block.dropResources(
                     world.getBlockState(_pos), world, BlockPos.containing(entity.getX() + 1.0, entity.getY() + 1.0, entity.getZ() + 1.0), null
                  );
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() - 1.0, entity.getY() + 1.0, entity.getZ() + 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:diamond/netherite_tusk_mineable_block")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() - 1.0, entity.getY() + 1.0, entity.getZ() + 1.0);
                  Block.dropResources(
                     world.getBlockState(_pos), world, BlockPos.containing(entity.getX() - 1.0, entity.getY() + 1.0, entity.getZ() + 1.0), null
                  );
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(x, entity.getY() + 2.0, entity.getZ() + 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:diamond/netherite_tusk_mineable_block")))) {
                  BlockPos _pos = BlockPos.containing(x, entity.getY() + 2.0, entity.getZ() + 1.0);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, entity.getY() + 2.0, entity.getZ() + 1.0), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() + 1.0, entity.getY() + 2.0, entity.getZ() + 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:diamond/netherite_tusk_mineable_block")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() + 1.0, entity.getY() + 2.0, entity.getZ() + 1.0);
                  Block.dropResources(
                     world.getBlockState(_pos), world, BlockPos.containing(entity.getX() + 1.0, entity.getY() + 2.0, entity.getZ() + 1.0), null
                  );
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() - 1.0, entity.getY() + 2.0, entity.getZ() + 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:diamond/netherite_tusk_mineable_block")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() - 1.0, entity.getY() + 2.0, entity.getZ() + 1.0);
                  Block.dropResources(
                     world.getBlockState(_pos), world, BlockPos.containing(entity.getX() - 1.0, entity.getY() + 2.0, entity.getZ() + 1.0), null
                  );
                  world.destroyBlock(_pos, false);
               }
            }
         }

         if (entity instanceof ElephantEntity
            && entity instanceof ElephantEntity _datEntL1068
            && (Boolean)_datEntL1068.getEntityData().get(ElephantEntity.DATA_Diamond_Tusks)
            && entity.isVehicle()) {
            if (entity instanceof ElephantEntity _datEntSetI) {
               _datEntSetI.getEntityData()
                  .set(
                     ElephantEntity.DATA_Mine4,
                     (entity instanceof ElephantEntity _datEntI ? (Integer)_datEntI.getEntityData().get(ElephantEntity.DATA_Mine4) : 0) + 1
                  );
            }

            if ((entity instanceof ElephantEntity _datEntI ? (Integer)_datEntI.getEntityData().get(ElephantEntity.DATA_Mine4) : 0) >= 15) {
               if (entity instanceof ElephantEntity _datEntSetI) {
                  _datEntSetI.getEntityData().set(ElephantEntity.DATA_Mine4, 0);
               }

               if (world.getBlockState(BlockPos.containing(x, y, entity.getZ() - 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:diamond/netherite_tusk_mineable_block")))) {
                  BlockPos _pos = BlockPos.containing(x, y, entity.getZ() - 1.0);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, entity.getZ() - 1.0), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() + 1.0, y, entity.getZ() - 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:diamond/netherite_tusk_mineable_block")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() + 1.0, y, entity.getZ() - 1.0);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX() + 1.0, y, entity.getZ() - 1.0), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() - 1.0, y, entity.getZ() - 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:diamond/netherite_tusk_mineable_block")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() - 1.0, y, entity.getZ() - 1.0);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX() - 1.0, y, entity.getZ() - 1.0), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(x, entity.getY() + 1.0, entity.getZ() - 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:diamond/netherite_tusk_mineable_block")))) {
                  BlockPos _pos = BlockPos.containing(x, entity.getY() + 1.0, entity.getZ() - 1.0);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, entity.getY() + 1.0, entity.getZ() - 1.0), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() + 1.0, entity.getY() + 1.0, entity.getZ() - 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:diamond/netherite_tusk_mineable_block")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() + 1.0, entity.getY() + 1.0, entity.getZ() - 1.0);
                  Block.dropResources(
                     world.getBlockState(_pos), world, BlockPos.containing(entity.getX() + 1.0, entity.getY() + 1.0, entity.getZ() - 1.0), null
                  );
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() - 1.0, entity.getY() + 1.0, entity.getZ() - 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:diamond/netherite_mineable_block")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() - 1.0, entity.getY() + 1.0, entity.getZ() - 1.0);
                  Block.dropResources(
                     world.getBlockState(_pos), world, BlockPos.containing(entity.getX() - 1.0, entity.getY() + 1.0, entity.getZ() - 1.0), null
                  );
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(x, entity.getY() + 2.0, entity.getZ() - 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:diamond/netherite_tusk_mineable_block")))) {
                  BlockPos _pos = BlockPos.containing(x, entity.getY() + 2.0, entity.getZ() - 1.0);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, entity.getY() + 2.0, entity.getZ() - 1.0), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() + 1.0, entity.getY() + 2.0, entity.getZ() - 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:diamond/netherite_tusk_mineable_block")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() + 1.0, entity.getY() + 2.0, entity.getZ() - 1.0);
                  Block.dropResources(
                     world.getBlockState(_pos), world, BlockPos.containing(entity.getX() + 1.0, entity.getY() + 2.0, entity.getZ() - 1.0), null
                  );
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() - 1.0, entity.getY() + 2.0, entity.getZ() - 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:diamond/netherite_tusk_mineable_block")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() - 1.0, entity.getY() + 2.0, entity.getZ() - 1.0);
                  Block.dropResources(
                     world.getBlockState(_pos), world, BlockPos.containing(entity.getX() - 1.0, entity.getY() + 2.0, entity.getZ() - 1.0), null
                  );
                  world.destroyBlock(_pos, false);
               }
            }
         }

         if (entity instanceof ElephantEntity
            && entity instanceof ElephantEntity _datEntL1165
            && (Boolean)_datEntL1165.getEntityData().get(ElephantEntity.DATA_Netherite_Tusks)
            && entity.isVehicle()) {
            if (entity instanceof ElephantEntity _datEntSetI) {
               _datEntSetI.getEntityData()
                  .set(
                     ElephantEntity.DATA_Mine,
                     (entity instanceof ElephantEntity _datEntI ? (Integer)_datEntI.getEntityData().get(ElephantEntity.DATA_Mine) : 0) + 1
                  );
            }

            if ((entity instanceof ElephantEntity _datEntI ? (Integer)_datEntI.getEntityData().get(ElephantEntity.DATA_Mine) : 0) >= 5) {
               if (entity instanceof ElephantEntity _datEntSetI) {
                  _datEntSetI.getEntityData().set(ElephantEntity.DATA_Mine, 0);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() + 1.0, y, z))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:diamond/netherite_tusk_mineable_block")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() + 1.0, y, z);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX() + 1.0, y, z), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() + 1.0, y, entity.getZ() + 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:diamond/netherite_tusk_mineable_block")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() + 1.0, y, entity.getZ() + 1.0);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX() + 1.0, y, entity.getZ() + 1.0), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() + 1.0, y, entity.getZ() - 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:diamond/netherite_tusk_mineable_block")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() + 1.0, y, entity.getZ() - 1.0);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX() + 1.0, y, entity.getZ() - 1.0), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() + 1.0, entity.getY() + 1.0, z))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:diamond/netherite_tusk_mineable_block")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() + 1.0, entity.getY() + 1.0, z);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX() + 1.0, entity.getY() + 1.0, z), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() + 1.0, entity.getY() + 1.0, entity.getZ() - 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:diamond/netherite_tusk_mineable_block")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() + 1.0, entity.getY() + 1.0, entity.getZ() - 1.0);
                  Block.dropResources(
                     world.getBlockState(_pos), world, BlockPos.containing(entity.getX() + 1.0, entity.getY() + 1.0, entity.getZ() - 1.0), null
                  );
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() + 1.0, entity.getY() + 1.0, entity.getZ() + 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:diamond/netherite_tusk_mineable_block")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() + 1.0, entity.getY() + 1.0, entity.getZ() + 1.0);
                  Block.dropResources(
                     world.getBlockState(_pos), world, BlockPos.containing(entity.getX() + 1.0, entity.getY() + 1.0, entity.getZ() + 1.0), null
                  );
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() + 1.0, entity.getY() + 2.0, z))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:diamond/netherite_tusk_mineable_block")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() + 1.0, entity.getY() + 2.0, z);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX() + 1.0, entity.getY() + 2.0, z), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() + 1.0, entity.getY() + 2.0, entity.getZ() + 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:diamond/netherite_tusk_mineable_block")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() + 1.0, entity.getY() + 2.0, entity.getZ() + 1.0);
                  Block.dropResources(
                     world.getBlockState(_pos), world, BlockPos.containing(entity.getX() + 1.0, entity.getY() + 2.0, entity.getZ() + 1.0), null
                  );
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() + 1.0, entity.getY() + 2.0, entity.getZ() - 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:diamond/netherite_tusk_mineable_block")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() + 1.0, entity.getY() + 2.0, entity.getZ() - 1.0);
                  Block.dropResources(
                     world.getBlockState(_pos), world, BlockPos.containing(entity.getX() + 1.0, entity.getY() + 2.0, entity.getZ() - 1.0), null
                  );
                  world.destroyBlock(_pos, false);
               }
            }
         }

         if (entity instanceof ElephantEntity
            && entity instanceof ElephantEntity _datEntL1262
            && (Boolean)_datEntL1262.getEntityData().get(ElephantEntity.DATA_Netherite_Tusks)
            && entity.isVehicle()) {
            if (entity instanceof ElephantEntity _datEntSetI) {
               _datEntSetI.getEntityData()
                  .set(
                     ElephantEntity.DATA_Mine2,
                     (entity instanceof ElephantEntity _datEntI ? (Integer)_datEntI.getEntityData().get(ElephantEntity.DATA_Mine2) : 0) + 1
                  );
            }

            if ((entity instanceof ElephantEntity _datEntI ? (Integer)_datEntI.getEntityData().get(ElephantEntity.DATA_Mine2) : 0) >= 5) {
               if (entity instanceof ElephantEntity _datEntSetI) {
                  _datEntSetI.getEntityData().set(ElephantEntity.DATA_Mine2, 0);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() - 1.0, y, z))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:diamond/netherite_tusk_mineable_block")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() - 1.0, y, z);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX() - 1.0, y, z), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() - 1.0, y, entity.getZ() - 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:diamond/netherite_tusk_mineable_block")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() - 1.0, y, entity.getZ() - 1.0);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX() - 1.0, y, entity.getZ() - 1.0), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() - 1.0, y, entity.getZ() + 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:diamond/netherite_tusk_mineable_block")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() - 1.0, y, entity.getZ() + 1.0);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX() - 1.0, y, entity.getZ() + 1.0), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() - 1.0, entity.getY() + 1.0, z))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:diamond/netherite_tusk_mineable_block")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() - 1.0, entity.getY() + 1.0, z);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX() - 1.0, entity.getY() + 1.0, z), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() - 1.0, entity.getY() + 1.0, entity.getZ() - 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:diamond/netherite_tusk_mineable_block")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() - 1.0, entity.getY() + 1.0, entity.getZ() - 1.0);
                  Block.dropResources(
                     world.getBlockState(_pos), world, BlockPos.containing(entity.getX() - 1.0, entity.getY() + 1.0, entity.getZ() - 1.0), null
                  );
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() - 1.0, entity.getY() + 1.0, entity.getZ() + 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:diamond/netherite_tusk_mineable_block")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() - 1.0, entity.getY() + 1.0, entity.getZ() + 1.0);
                  Block.dropResources(
                     world.getBlockState(_pos), world, BlockPos.containing(entity.getX() - 1.0, entity.getY() + 1.0, entity.getZ() + 1.0), null
                  );
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() - 1.0, entity.getY() + 2.0, z))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:diamond/netherite_tusk_mineable_block")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() - 1.0, entity.getY() + 2.0, z);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX() - 1.0, entity.getY() + 2.0, z), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() - 1.0, entity.getY() + 2.0, entity.getZ() - 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:diamond/netherite_tusk_mineable_block")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() - 1.0, entity.getY() + 2.0, entity.getZ() - 1.0);
                  Block.dropResources(
                     world.getBlockState(_pos), world, BlockPos.containing(entity.getX() - 1.0, entity.getY() + 2.0, entity.getZ() - 1.0), null
                  );
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() - 1.0, entity.getY() + 2.0, entity.getZ() + 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:diamond/netherite_tusk_mineable_block")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() - 1.0, entity.getY() + 2.0, entity.getZ() + 1.0);
                  Block.dropResources(
                     world.getBlockState(_pos), world, BlockPos.containing(entity.getX() - 1.0, entity.getY() + 2.0, entity.getZ() + 1.0), null
                  );
                  world.destroyBlock(_pos, false);
               }
            }
         }

         if (entity instanceof ElephantEntity
            && entity instanceof ElephantEntity _datEntL1359
            && (Boolean)_datEntL1359.getEntityData().get(ElephantEntity.DATA_Netherite_Tusks)
            && entity.isVehicle()) {
            if (entity instanceof ElephantEntity _datEntSetI) {
               _datEntSetI.getEntityData()
                  .set(
                     ElephantEntity.DATA_Mine3,
                     (entity instanceof ElephantEntity _datEntI ? (Integer)_datEntI.getEntityData().get(ElephantEntity.DATA_Mine3) : 0) + 1
                  );
            }

            if ((entity instanceof ElephantEntity _datEntI ? (Integer)_datEntI.getEntityData().get(ElephantEntity.DATA_Mine3) : 0) >= 5) {
               if (entity instanceof ElephantEntity _datEntSetI) {
                  _datEntSetI.getEntityData().set(ElephantEntity.DATA_Mine3, 0);
               }

               if (world.getBlockState(BlockPos.containing(x, y, entity.getZ() + 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:diamond/netherite_tusk_mineable_block")))) {
                  BlockPos _pos = BlockPos.containing(x, y, entity.getZ() + 1.0);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, entity.getZ() + 1.0), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() + 1.0, y, entity.getZ() + 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:diamond/netherite_tusk_mineable_block")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() + 1.0, y, entity.getZ() + 1.0);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX() + 1.0, y, entity.getZ() + 1.0), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() - 1.0, y, entity.getZ() + 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:diamond/netherite_tusk_mineable_block")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() - 1.0, y, entity.getZ() + 1.0);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX() - 1.0, y, entity.getZ() + 1.0), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(x, entity.getY() + 1.0, entity.getZ() + 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:diamond/netherite_tusk_mineable_block")))) {
                  BlockPos _pos = BlockPos.containing(x, entity.getY() + 1.0, entity.getZ() + 1.0);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, entity.getY() + 1.0, entity.getZ() + 1.0), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() + 1.0, entity.getY() + 1.0, entity.getZ() + 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:diamond/netherite_tusk_mineable_block")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() + 1.0, entity.getY() + 1.0, entity.getZ() + 1.0);
                  Block.dropResources(
                     world.getBlockState(_pos), world, BlockPos.containing(entity.getX() + 1.0, entity.getY() + 1.0, entity.getZ() + 1.0), null
                  );
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() - 1.0, entity.getY() + 1.0, entity.getZ() + 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:diamond/netherite_tusk_mineable_block")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() - 1.0, entity.getY() + 1.0, entity.getZ() + 1.0);
                  Block.dropResources(
                     world.getBlockState(_pos), world, BlockPos.containing(entity.getX() - 1.0, entity.getY() + 1.0, entity.getZ() + 1.0), null
                  );
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(x, entity.getY() + 2.0, entity.getZ() + 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:diamond/netherite_tusk_mineable_block")))) {
                  BlockPos _pos = BlockPos.containing(x, entity.getY() + 2.0, entity.getZ() + 1.0);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, entity.getY() + 2.0, entity.getZ() + 1.0), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() + 1.0, entity.getY() + 2.0, entity.getZ() + 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:diamond/netherite_tusk_mineable_block")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() + 1.0, entity.getY() + 2.0, entity.getZ() + 1.0);
                  Block.dropResources(
                     world.getBlockState(_pos), world, BlockPos.containing(entity.getX() + 1.0, entity.getY() + 2.0, entity.getZ() + 1.0), null
                  );
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() - 1.0, entity.getY() + 2.0, entity.getZ() + 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:diamond/netherite_tusk_mineable_block")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() - 1.0, entity.getY() + 2.0, entity.getZ() + 1.0);
                  Block.dropResources(
                     world.getBlockState(_pos), world, BlockPos.containing(entity.getX() - 1.0, entity.getY() + 2.0, entity.getZ() + 1.0), null
                  );
                  world.destroyBlock(_pos, false);
               }
            }
         }

         if (entity instanceof ElephantEntity
            && entity instanceof ElephantEntity _datEntL1456
            && (Boolean)_datEntL1456.getEntityData().get(ElephantEntity.DATA_Netherite_Tusks)
            && entity.isVehicle()) {
            if (entity instanceof ElephantEntity _datEntSetI) {
               _datEntSetI.getEntityData()
                  .set(
                     ElephantEntity.DATA_Mine4,
                     (entity instanceof ElephantEntity _datEntI ? (Integer)_datEntI.getEntityData().get(ElephantEntity.DATA_Mine4) : 0) + 1
                  );
            }

            if ((entity instanceof ElephantEntity _datEntI ? (Integer)_datEntI.getEntityData().get(ElephantEntity.DATA_Mine4) : 0) >= 5) {
               if (entity instanceof ElephantEntity _datEntSetI) {
                  _datEntSetI.getEntityData().set(ElephantEntity.DATA_Mine4, 0);
               }

               if (world.getBlockState(BlockPos.containing(x, y, entity.getZ() - 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:diamond/netherite_tusk_mineable_block")))) {
                  BlockPos _pos = BlockPos.containing(x, y, entity.getZ() - 1.0);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, entity.getZ() - 1.0), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() + 1.0, y, entity.getZ() - 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:diamond/netherite_tusk_mineable_block")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() + 1.0, y, entity.getZ() - 1.0);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX() + 1.0, y, entity.getZ() - 1.0), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() - 1.0, y, entity.getZ() - 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:diamond/netherite_tusk_mineable_block")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() - 1.0, y, entity.getZ() - 1.0);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX() - 1.0, y, entity.getZ() - 1.0), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(x, entity.getY() + 1.0, entity.getZ() - 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:diamond/netherite_tusk_mineable_block")))) {
                  BlockPos _pos = BlockPos.containing(x, entity.getY() + 1.0, entity.getZ() - 1.0);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, entity.getY() + 1.0, entity.getZ() - 1.0), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() + 1.0, entity.getY() + 1.0, entity.getZ() - 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:diamond/netherite_tusk_mineable_block")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() + 1.0, entity.getY() + 1.0, entity.getZ() - 1.0);
                  Block.dropResources(
                     world.getBlockState(_pos), world, BlockPos.containing(entity.getX() + 1.0, entity.getY() + 1.0, entity.getZ() - 1.0), null
                  );
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() - 1.0, entity.getY() + 1.0, entity.getZ() - 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:diamond/netherite_tusk_mineable_block")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() - 1.0, entity.getY() + 1.0, entity.getZ() - 1.0);
                  Block.dropResources(
                     world.getBlockState(_pos), world, BlockPos.containing(entity.getX() - 1.0, entity.getY() + 1.0, entity.getZ() - 1.0), null
                  );
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(x, entity.getY() + 2.0, entity.getZ() - 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:diamond/netherite_tusk_mineable_block")))) {
                  BlockPos _pos = BlockPos.containing(x, entity.getY() + 2.0, entity.getZ() - 1.0);
                  Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, entity.getY() + 2.0, entity.getZ() - 1.0), null);
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() + 1.0, entity.getY() + 2.0, entity.getZ() - 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:diamond/netherite_tusk_mineable_block")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() + 1.0, entity.getY() + 2.0, entity.getZ() - 1.0);
                  Block.dropResources(
                     world.getBlockState(_pos), world, BlockPos.containing(entity.getX() + 1.0, entity.getY() + 2.0, entity.getZ() - 1.0), null
                  );
                  world.destroyBlock(_pos, false);
               }

               if (world.getBlockState(BlockPos.containing(entity.getX() - 1.0, entity.getY() + 2.0, entity.getZ() - 1.0))
                  .is(BlockTags.create(ResourceLocation.parse("mocreatures:diamond/netherite_tusk_mineable_block")))) {
                  BlockPos _pos = BlockPos.containing(entity.getX() - 1.0, entity.getY() + 2.0, entity.getZ() - 1.0);
                  Block.dropResources(
                     world.getBlockState(_pos), world, BlockPos.containing(entity.getX() - 1.0, entity.getY() + 2.0, entity.getZ() - 1.0), null
                  );
                  world.destroyBlock(_pos, false);
               }
            }
         }
      }
   }
}
