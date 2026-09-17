package net.mocreatures.procedures;

import java.util.Comparator;
import javax.annotation.Nullable;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.mocreatures.MocreaturesMod;
import net.mocreatures.entity.HorseEntity;
import net.mocreatures.init.MocreaturesModEntities;
import net.neoforged.bus.api.Event;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.living.LivingDeathEvent;

@EventBusSubscriber
public class HorseGhostifyProcedure {
   @SubscribeEvent
   public static void onEntityDeath(LivingDeathEvent event) {
      if (event.getEntity() != null) {
         execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
      }
   }

   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
      execute(null, world, x, y, z, entity);
   }

   private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
      if (entity != null) {
         if (entity instanceof HorseEntity
            && (
               entity instanceof HorseEntity _datEntL1 && (Boolean)_datEntL1.getEntityData().get(HorseEntity.DATA_Tier4)
                  || entity instanceof HorseEntity _datEntL2 && (Boolean)_datEntL2.getEntityData().get(HorseEntity.DATA_Special)
            )
            && (
               (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) != 103
                  || (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) != 105
                  || (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) != 106
                  || (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) != 115
                  || (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) != 116
            )
            && Math.random() < 0.25) {
            if (!entity.level().isClientSide()) {
               entity.discard();
            }

            MocreaturesMod.queueServerWork(
               1,
               () -> {
                  if (world instanceof ServerLevel _level) {
                     Entity entityToSpawn = (MocreaturesModEntities.HORSE.get())
                        .spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
                     if (entityToSpawn != null) {
                        entityToSpawn.setDeltaMovement(0.0, 0.0, 0.0);
                     }
                  }

                  Entity patt0$temp = world.getEntitiesOfClass(HorseEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true)
                     .stream()
                     .sorted((new Object() {
                        Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                           return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                        }
                     }).compareDistOf(x, y, z))
                     .findFirst()
                     .orElse(null);
                  if (patt0$temp instanceof HorseEntity _datEntSetI) {
                     _datEntSetI.getEntityData().set(HorseEntity.DATA_Variant, 115);
                  }

                  Entity patt1$temp = world.getEntitiesOfClass(HorseEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true)
                     .stream()
                     .sorted((new Object() {
                        Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                           return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                        }
                     }).compareDistOf(x, y, z))
                     .findFirst()
                     .orElse(null);
                  if (patt1$temp instanceof TamableAnimal _toTame) {
                     patt1$temp = world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 5.0, 5.0, 5.0), e -> true)
                        .stream()
                        .sorted((new Object() {
                           Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                              return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                           }
                        }).compareDistOf(x, y, z))
                        .findFirst()
                        .orElse(null);
                     if (patt1$temp instanceof Player _owner) {
                        _toTame.tame(_owner);
                     }
                  }
               }
            );
         }

         if (entity instanceof HorseEntity
            && (
               (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 103
                  || (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 105
                  || (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 106
                  || entity instanceof HorseEntity _datEntL20 && (Boolean)_datEntL20.getEntityData().get(HorseEntity.DATA_Fairy)
            )
            && Math.random() < 0.25) {
            if (!entity.level().isClientSide()) {
               entity.discard();
            }

            MocreaturesMod.queueServerWork(
               1,
               () -> {
                  if (world instanceof ServerLevel _level) {
                     Entity entityToSpawn = (MocreaturesModEntities.HORSE.get())
                        .spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
                     if (entityToSpawn != null) {
                        entityToSpawn.setDeltaMovement(0.0, 0.0, 0.0);
                     }
                  }

                  Entity patt0$temp = world.getEntitiesOfClass(HorseEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true)
                     .stream()
                     .sorted((new Object() {
                        Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                           return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                        }
                     }).compareDistOf(x, y, z))
                     .findFirst()
                     .orElse(null);
                  if (patt0$temp instanceof HorseEntity _datEntSetI) {
                     _datEntSetI.getEntityData().set(HorseEntity.DATA_Variant, 116);
                  }

                  Entity patt1$temp = world.getEntitiesOfClass(HorseEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true)
                     .stream()
                     .sorted((new Object() {
                        Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                           return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                        }
                     }).compareDistOf(x, y, z))
                     .findFirst()
                     .orElse(null);
                  if (patt1$temp instanceof TamableAnimal _toTame) {
                     patt1$temp = world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 5.0, 5.0, 5.0), e -> true)
                        .stream()
                        .sorted((new Object() {
                           Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                              return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                           }
                        }).compareDistOf(x, y, z))
                        .findFirst()
                        .orElse(null);
                     if (patt1$temp instanceof Player _owner) {
                        _toTame.tame(_owner);
                     }
                  }
               }
            );
         }
      }
   }
}
