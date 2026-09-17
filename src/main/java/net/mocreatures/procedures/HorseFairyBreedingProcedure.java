package net.mocreatures.procedures;

import java.util.Comparator;
import javax.annotation.Nullable;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.mocreatures.entity.HorseEntity;
import net.mocreatures.init.MocreaturesModEntities;
import net.mocreatures.init.MocreaturesModItems;
import net.neoforged.bus.api.Event;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent.EntityInteract;

@EventBusSubscriber
public class HorseFairyBreedingProcedure {
   @SubscribeEvent
   public static void onRightClickEntity(EntityInteract event) {
      if (event.getHand() == event.getEntity().getUsedItemHand()) {
         execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getTarget(), event.getEntity());
      }
   }

   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
      execute(null, world, x, y, z, entity, sourceentity);
   }

   private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
      if (entity != null && sourceentity != null) {
         if (entity instanceof HorseEntity
            && (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 104
            && !(entity instanceof HorseEntity _datEntL2 && (Boolean)_datEntL2.getEntityData().get(HorseEntity.DATA_FairyBreeding))
            && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()
               == MocreaturesModItems.ESSENCE_OF_LIGHTNESS.get()) {
            if (sourceentity instanceof Player _player) {
               ItemStack _stktoremove = new ItemStack((ItemLike)MocreaturesModItems.ESSENCE_OF_LIGHTNESS.get());
               _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }

            if (entity instanceof HorseEntity _datEntSetL) {
               _datEntSetL.getEntityData().set(HorseEntity.DATA_FairyBreeding, true);
            }

            Vec3 _center = new Vec3(x, y, z);

            for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(3.0), e -> true)
               .stream()
               .sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
               .toList()) {
               if (entityiterator != entity
                  && entityiterator instanceof HorseEntity _datEntL8
                  && (Boolean)_datEntL8.getEntityData().get(HorseEntity.DATA_FairyBreeding)
                  && (entityiterator instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 105) {
                  if (!entity.level().isClientSide()) {
                     entity.discard();
                  }

                  if (!entityiterator.level().isClientSide()) {
                     entityiterator.discard();
                  }

                  if (world instanceof ServerLevel _level) {
                     Entity entityToSpawn = (MocreaturesModEntities.HORSE.get())
                        .spawn(_level, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), MobSpawnType.MOB_SUMMONED);
                     if (entityToSpawn != null) {
                        entityToSpawn.setDeltaMovement(0.0, 0.0, 0.0);
                     }
                  }

                  Entity var42 = world.getEntitiesOfClass(
                        HorseEntity.class, AABB.ofSize(new Vec3(entity.getX(), entity.getY(), entity.getZ()), 3.0, 3.0, 3.0), e -> true
                     )
                     .stream()
                     .sorted((new Object() {
                        Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                           return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                        }
                     }).compareDistOf(entity.getX(), entity.getY(), entity.getZ()))
                     .findFirst()
                     .orElse(null);
                  if (var42 instanceof HorseEntity _datEntSetI) {
                     _datEntSetI.getEntityData().set(HorseEntity.DATA_Variant, 117);
                  }

                  Entity var21 = world.getEntitiesOfClass(
                        HorseEntity.class, AABB.ofSize(new Vec3(entity.getX(), entity.getY(), entity.getZ()), 3.0, 3.0, 3.0), e -> true
                     )
                     .stream()
                     .sorted((new Object() {
                        Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                           return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                        }
                     }).compareDistOf(entity.getX(), entity.getY(), entity.getZ()))
                     .findFirst()
                     .orElse(null);
                  if (var21 instanceof TamableAnimal _toTame && sourceentity instanceof Player _owner) {
                     _toTame.tame(_owner);
                  }
               }
            }
         }

         if (entity instanceof HorseEntity
            && (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 105
            && !(entity instanceof HorseEntity _datEntL29 && (Boolean)_datEntL29.getEntityData().get(HorseEntity.DATA_FairyBreeding))
            && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()
               == MocreaturesModItems.ESSENCE_OF_LIGHTNESS.get()) {
            if (sourceentity instanceof Player _player) {
               ItemStack _stktoremove = new ItemStack((ItemLike)MocreaturesModItems.ESSENCE_OF_LIGHTNESS.get());
               _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }

            if (entity instanceof HorseEntity _datEntSetL) {
               _datEntSetL.getEntityData().set(HorseEntity.DATA_FairyBreeding, true);
            }

            Vec3 _center = new Vec3(x, y, z);

            for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(3.0), e -> true)
               .stream()
               .sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
               .toList()) {
               if (entityiterator != entity
                  && entityiterator instanceof HorseEntity _datEntL35
                  && (Boolean)_datEntL35.getEntityData().get(HorseEntity.DATA_FairyBreeding)
                  && (entityiterator instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 104) {
                  if (!entity.level().isClientSide()) {
                     entity.discard();
                  }

                  if (!entityiterator.level().isClientSide()) {
                     entityiterator.discard();
                  }

                  if (world instanceof ServerLevel _level) {
                     Entity entityToSpawn = (MocreaturesModEntities.HORSE.get())
                        .spawn(_level, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), MobSpawnType.MOB_SUMMONED);
                     if (entityToSpawn != null) {
                        entityToSpawn.setDeltaMovement(0.0, 0.0, 0.0);
                     }
                  }

                  Entity var45 = world.getEntitiesOfClass(
                        HorseEntity.class, AABB.ofSize(new Vec3(entity.getX(), entity.getY(), entity.getZ()), 3.0, 3.0, 3.0), e -> true
                     )
                     .stream()
                     .sorted((new Object() {
                        Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                           return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                        }
                     }).compareDistOf(entity.getX(), entity.getY(), entity.getZ()))
                     .findFirst()
                     .orElse(null);
                  if (var45 instanceof HorseEntity _datEntSetI) {
                     _datEntSetI.getEntityData().set(HorseEntity.DATA_Variant, 117);
                  }

                  Entity var47 = world.getEntitiesOfClass(
                        HorseEntity.class, AABB.ofSize(new Vec3(entity.getX(), entity.getY(), entity.getZ()), 3.0, 3.0, 3.0), e -> true
                     )
                     .stream()
                     .sorted((new Object() {
                        Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                           return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                        }
                     }).compareDistOf(entity.getX(), entity.getY(), entity.getZ()))
                     .findFirst()
                     .orElse(null);
                  if (var47 instanceof TamableAnimal _toTame && sourceentity instanceof Player _owner) {
                     _toTame.tame(_owner);
                  }
               }
            }
         }
      }
   }
}
