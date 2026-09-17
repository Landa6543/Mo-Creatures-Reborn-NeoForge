package net.mocreatures.procedures;

import java.util.Comparator;
import javax.annotation.Nullable;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.animal.horse.Horse;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.mocreatures.MocreaturesMod;
import net.mocreatures.entity.HorseEntity;
import net.mocreatures.init.MocreaturesModAttributes;
import net.mocreatures.init.MocreaturesModEntities;
import net.neoforged.bus.api.Event;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.tick.EntityTickEvent.Pre;

@EventBusSubscriber
public class VanillaHorseBreedProcedure {
   @SubscribeEvent
   public static void onEntityTick(Pre event) {
      execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
   }

   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
      execute(null, world, x, y, z, entity);
   }

   private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
      if (entity != null) {
         if (entity instanceof Horse) {
            Entity _livingEntity253 = world.getEntitiesOfClass(HorseEntity.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
               .stream()
               .sorted((new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                  }
               }).compareDistOf(x, y, z))
               .findFirst()
               .orElse(null);
            if (_livingEntity253 instanceof HorseEntity _datEntL2 && (Boolean)_datEntL2.getEntityData().get(HorseEntity.DATA_Breed)) {
               _livingEntity253 = world.getEntitiesOfClass(HorseEntity.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if ((_livingEntity253 instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 3
                  && entity.getPersistentData().getBoolean("MocBreed")
                  && !world.getEntitiesOfClass(HorseEntity.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true).isEmpty()
                  && !world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true).isEmpty()
                  && (
                        entity instanceof LivingEntity _livingEntity8 && _livingEntity8.getAttributes().hasAttribute(MocreaturesModAttributes.TESTATTRIBUTE)
                           ? _livingEntity8.getAttribute(MocreaturesModAttributes.TESTATTRIBUTE).getValue()
                           : 0.0
                     )
                     == 2.0) {
                  Entity var13 = world.getEntitiesOfClass(HorseEntity.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                     .stream()
                     .sorted((new Object() {
                        Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                           return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                        }
                     }).compareDistOf(x, y, z))
                     .findFirst()
                     .orElse(null);
                  if (var13 instanceof HorseEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(HorseEntity.DATA_Breed, false);
                  }

                  entity.getPersistentData().putBoolean("MocBreed", false);
                  MocreaturesMod.queueServerWork(
                     60,
                     () -> {
                        if (world instanceof ServerLevel _level) {
                           Entity entityToSpawn = (MocreaturesModEntities.HORSE.get())
                              .spawn(
                                 _level,
                                 BlockPos.containing(
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getX(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getY(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getZ()
                                 ),
                                 MobSpawnType.MOB_SUMMONED
                              );
                           if (entityToSpawn != null) {
                              entityToSpawn.setDeltaMovement(0.0, 0.0, 0.0);
                           }
                        }

                        Entity patt0$temp = world.getEntitiesOfClass(
                              HorseEntity.class,
                              AABB.ofSize(
                                 new Vec3(
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getX(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getY(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getZ()
                                 ),
                                 4.0,
                                 4.0,
                                 4.0
                              ),
                              e -> true
                           )
                           .stream()
                           .sorted(
                              (new Object() {
                                    Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                       return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                    }
                                 })
                                 .compareDistOf(
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getX(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getY(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getZ()
                                 )
                           )
                           .findFirst()
                           .orElse(null);
                        if (patt0$temp instanceof HorseEntity _datEntSetLx) {
                           _datEntSetLx.getEntityData().set(HorseEntity.DATA_Baby, true);
                        }

                        patt0$temp = world.getEntitiesOfClass(
                              HorseEntity.class,
                              AABB.ofSize(
                                 new Vec3(
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getX(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getY(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getZ()
                                 ),
                                 4.0,
                                 4.0,
                                 4.0
                              ),
                              e -> true
                           )
                           .stream()
                           .sorted(
                              (new Object() {
                                    Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                       return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                    }
                                 })
                                 .compareDistOf(
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getX(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getY(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getZ()
                                 )
                           )
                           .findFirst()
                           .orElse(null);
                        if (patt0$temp instanceof HorseEntity _datEntSetI) {
                           _datEntSetI.getEntityData().set(HorseEntity.DATA_Variant, 7);
                        }
                     }
                  );
               }
            }

            _livingEntity253 = world.getEntitiesOfClass(HorseEntity.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
               .stream()
               .sorted((new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                  }
               }).compareDistOf(x, y, z))
               .findFirst()
               .orElse(null);
            if (_livingEntity253 instanceof HorseEntity _datEntL37 && (Boolean)_datEntL37.getEntityData().get(HorseEntity.DATA_Breed)) {
               _livingEntity253 = world.getEntitiesOfClass(HorseEntity.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if ((_livingEntity253 instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 102
                  && entity.getPersistentData().getBoolean("MocBreed")
                  && !world.getEntitiesOfClass(HorseEntity.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true).isEmpty()
                  && !world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true).isEmpty()
                  && (
                        entity instanceof LivingEntity _livingEntity43 && _livingEntity43.getAttributes().hasAttribute(MocreaturesModAttributes.TESTATTRIBUTE)
                           ? _livingEntity43.getAttribute(MocreaturesModAttributes.TESTATTRIBUTE).getValue()
                           : 0.0
                     )
                     == 2.0) {
                  Entity var58 = world.getEntitiesOfClass(HorseEntity.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                     .stream()
                     .sorted((new Object() {
                        Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                           return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                        }
                     }).compareDistOf(x, y, z))
                     .findFirst()
                     .orElse(null);
                  if (var58 instanceof HorseEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(HorseEntity.DATA_Breed, false);
                  }

                  entity.getPersistentData().putBoolean("MocBreed", false);
                  MocreaturesMod.queueServerWork(
                     60,
                     () -> {
                        if (world instanceof ServerLevel _level) {
                           Entity entityToSpawn = (MocreaturesModEntities.HORSE.get())
                              .spawn(
                                 _level,
                                 BlockPos.containing(
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getX(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getY(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getZ()
                                 ),
                                 MobSpawnType.MOB_SUMMONED
                              );
                           if (entityToSpawn != null) {
                              entityToSpawn.setDeltaMovement(0.0, 0.0, 0.0);
                           }
                        }

                        Entity patt0$temp = world.getEntitiesOfClass(
                              HorseEntity.class,
                              AABB.ofSize(
                                 new Vec3(
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getX(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getY(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getZ()
                                 ),
                                 4.0,
                                 4.0,
                                 4.0
                              ),
                              e -> true
                           )
                           .stream()
                           .sorted(
                              (new Object() {
                                    Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                       return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                    }
                                 })
                                 .compareDistOf(
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getX(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getY(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getZ()
                                 )
                           )
                           .findFirst()
                           .orElse(null);
                        if (patt0$temp instanceof HorseEntity _datEntSetLx) {
                           _datEntSetLx.getEntityData().set(HorseEntity.DATA_Baby, true);
                        }

                        patt0$temp = world.getEntitiesOfClass(
                              HorseEntity.class,
                              AABB.ofSize(
                                 new Vec3(
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getX(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getY(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getZ()
                                 ),
                                 4.0,
                                 4.0,
                                 4.0
                              ),
                              e -> true
                           )
                           .stream()
                           .sorted(
                              (new Object() {
                                    Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                       return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                    }
                                 })
                                 .compareDistOf(
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getX(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getY(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getZ()
                                 )
                           )
                           .findFirst()
                           .orElse(null);
                        if (patt0$temp instanceof HorseEntity _datEntSetI) {
                           _datEntSetI.getEntityData().set(HorseEntity.DATA_Variant, 8);
                        }
                     }
                  );
               }
            }

            _livingEntity253 = world.getEntitiesOfClass(HorseEntity.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
               .stream()
               .sorted((new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                  }
               }).compareDistOf(x, y, z))
               .findFirst()
               .orElse(null);
            if (_livingEntity253 instanceof HorseEntity _datEntL72 && (Boolean)_datEntL72.getEntityData().get(HorseEntity.DATA_Breed)) {
               _livingEntity253 = world.getEntitiesOfClass(HorseEntity.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if ((_livingEntity253 instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 102
                  && entity.getPersistentData().getBoolean("MocBreed")
                  && !world.getEntitiesOfClass(HorseEntity.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true).isEmpty()
                  && !world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true).isEmpty()
                  && (
                        entity instanceof LivingEntity _livingEntity78 && _livingEntity78.getAttributes().hasAttribute(MocreaturesModAttributes.TESTATTRIBUTE)
                           ? _livingEntity78.getAttribute(MocreaturesModAttributes.TESTATTRIBUTE).getValue()
                           : 0.0
                     )
                     == 1.0) {
                  Entity var59 = world.getEntitiesOfClass(HorseEntity.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                     .stream()
                     .sorted((new Object() {
                        Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                           return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                        }
                     }).compareDistOf(x, y, z))
                     .findFirst()
                     .orElse(null);
                  if (var59 instanceof HorseEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(HorseEntity.DATA_Breed, false);
                  }

                  entity.getPersistentData().putBoolean("MocBreed", false);
                  MocreaturesMod.queueServerWork(
                     60,
                     () -> {
                        if (world instanceof ServerLevel _level) {
                           Entity entityToSpawn = (MocreaturesModEntities.HORSE.get())
                              .spawn(
                                 _level,
                                 BlockPos.containing(
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getX(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getY(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getZ()
                                 ),
                                 MobSpawnType.MOB_SUMMONED
                              );
                           if (entityToSpawn != null) {
                              entityToSpawn.setDeltaMovement(0.0, 0.0, 0.0);
                           }
                        }

                        Entity patt0$temp = world.getEntitiesOfClass(
                              HorseEntity.class,
                              AABB.ofSize(
                                 new Vec3(
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getX(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getY(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getZ()
                                 ),
                                 4.0,
                                 4.0,
                                 4.0
                              ),
                              e -> true
                           )
                           .stream()
                           .sorted(
                              (new Object() {
                                    Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                       return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                    }
                                 })
                                 .compareDistOf(
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getX(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getY(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getZ()
                                 )
                           )
                           .findFirst()
                           .orElse(null);
                        if (patt0$temp instanceof HorseEntity _datEntSetLx) {
                           _datEntSetLx.getEntityData().set(HorseEntity.DATA_Baby, true);
                        }

                        patt0$temp = world.getEntitiesOfClass(
                              HorseEntity.class,
                              AABB.ofSize(
                                 new Vec3(
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getX(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getY(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getZ()
                                 ),
                                 4.0,
                                 4.0,
                                 4.0
                              ),
                              e -> true
                           )
                           .stream()
                           .sorted(
                              (new Object() {
                                    Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                       return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                    }
                                 })
                                 .compareDistOf(
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getX(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getY(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getZ()
                                 )
                           )
                           .findFirst()
                           .orElse(null);
                        if (patt0$temp instanceof HorseEntity _datEntSetI) {
                           _datEntSetI.getEntityData().set(HorseEntity.DATA_Variant, 9);
                        }
                     }
                  );
               }
            }

            _livingEntity253 = world.getEntitiesOfClass(HorseEntity.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
               .stream()
               .sorted((new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                  }
               }).compareDistOf(x, y, z))
               .findFirst()
               .orElse(null);
            if (_livingEntity253 instanceof HorseEntity _datEntL107 && (Boolean)_datEntL107.getEntityData().get(HorseEntity.DATA_Breed)) {
               _livingEntity253 = world.getEntitiesOfClass(HorseEntity.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if ((_livingEntity253 instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 102
                  && entity.getPersistentData().getBoolean("MocBreed")
                  && !world.getEntitiesOfClass(HorseEntity.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true).isEmpty()
                  && !world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true).isEmpty()
                  && (
                        entity instanceof LivingEntity _livingEntity113
                              && _livingEntity113.getAttributes().hasAttribute(MocreaturesModAttributes.TESTATTRIBUTE)
                           ? _livingEntity113.getAttribute(MocreaturesModAttributes.TESTATTRIBUTE).getValue()
                           : 0.0
                     )
                     == 3.0) {
                  Entity var60 = world.getEntitiesOfClass(HorseEntity.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                     .stream()
                     .sorted((new Object() {
                        Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                           return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                        }
                     }).compareDistOf(x, y, z))
                     .findFirst()
                     .orElse(null);
                  if (var60 instanceof HorseEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(HorseEntity.DATA_Breed, false);
                  }

                  entity.getPersistentData().putBoolean("MocBreed", false);
                  MocreaturesMod.queueServerWork(
                     60,
                     () -> {
                        if (world instanceof ServerLevel _level) {
                           Entity entityToSpawn = (MocreaturesModEntities.HORSE.get())
                              .spawn(
                                 _level,
                                 BlockPos.containing(
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getX(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getY(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getZ()
                                 ),
                                 MobSpawnType.MOB_SUMMONED
                              );
                           if (entityToSpawn != null) {
                              entityToSpawn.setDeltaMovement(0.0, 0.0, 0.0);
                           }
                        }

                        Entity patt0$temp = world.getEntitiesOfClass(
                              HorseEntity.class,
                              AABB.ofSize(
                                 new Vec3(
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getX(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getY(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getZ()
                                 ),
                                 4.0,
                                 4.0,
                                 4.0
                              ),
                              e -> true
                           )
                           .stream()
                           .sorted(
                              (new Object() {
                                    Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                       return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                    }
                                 })
                                 .compareDistOf(
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getX(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getY(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getZ()
                                 )
                           )
                           .findFirst()
                           .orElse(null);
                        if (patt0$temp instanceof HorseEntity _datEntSetLx) {
                           _datEntSetLx.getEntityData().set(HorseEntity.DATA_Baby, true);
                        }

                        patt0$temp = world.getEntitiesOfClass(
                              HorseEntity.class,
                              AABB.ofSize(
                                 new Vec3(
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getX(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getY(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getZ()
                                 ),
                                 4.0,
                                 4.0,
                                 4.0
                              ),
                              e -> true
                           )
                           .stream()
                           .sorted(
                              (new Object() {
                                    Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                       return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                    }
                                 })
                                 .compareDistOf(
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getX(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getY(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getZ()
                                 )
                           )
                           .findFirst()
                           .orElse(null);
                        if (patt0$temp instanceof HorseEntity _datEntSetI) {
                           _datEntSetI.getEntityData().set(HorseEntity.DATA_Variant, 10);
                        }
                     }
                  );
               }
            }

            _livingEntity253 = world.getEntitiesOfClass(HorseEntity.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
               .stream()
               .sorted((new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                  }
               }).compareDistOf(x, y, z))
               .findFirst()
               .orElse(null);
            if (_livingEntity253 instanceof HorseEntity _datEntL142 && (Boolean)_datEntL142.getEntityData().get(HorseEntity.DATA_Breed)) {
               _livingEntity253 = world.getEntitiesOfClass(HorseEntity.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if ((_livingEntity253 instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 3
                  && entity.getPersistentData().getBoolean("MocBreed")
                  && !world.getEntitiesOfClass(HorseEntity.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true).isEmpty()
                  && !world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true).isEmpty()
                  && (
                        entity instanceof LivingEntity _livingEntity148
                              && _livingEntity148.getAttributes().hasAttribute(MocreaturesModAttributes.TESTATTRIBUTE)
                           ? _livingEntity148.getAttribute(MocreaturesModAttributes.TESTATTRIBUTE).getValue()
                           : 0.0
                     )
                     == 1.0) {
                  Entity var61 = world.getEntitiesOfClass(HorseEntity.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                     .stream()
                     .sorted((new Object() {
                        Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                           return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                        }
                     }).compareDistOf(x, y, z))
                     .findFirst()
                     .orElse(null);
                  if (var61 instanceof HorseEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(HorseEntity.DATA_Breed, false);
                  }

                  entity.getPersistentData().putBoolean("MocBreed", false);
                  MocreaturesMod.queueServerWork(
                     60,
                     () -> {
                        if (world instanceof ServerLevel _level) {
                           Entity entityToSpawn = (MocreaturesModEntities.HORSE.get())
                              .spawn(
                                 _level,
                                 BlockPos.containing(
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getX(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getY(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getZ()
                                 ),
                                 MobSpawnType.MOB_SUMMONED
                              );
                           if (entityToSpawn != null) {
                              entityToSpawn.setDeltaMovement(0.0, 0.0, 0.0);
                           }
                        }

                        Entity patt0$temp = world.getEntitiesOfClass(
                              HorseEntity.class,
                              AABB.ofSize(
                                 new Vec3(
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getX(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getY(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getZ()
                                 ),
                                 4.0,
                                 4.0,
                                 4.0
                              ),
                              e -> true
                           )
                           .stream()
                           .sorted(
                              (new Object() {
                                    Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                       return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                    }
                                 })
                                 .compareDistOf(
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getX(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getY(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getZ()
                                 )
                           )
                           .findFirst()
                           .orElse(null);
                        if (patt0$temp instanceof HorseEntity _datEntSetLx) {
                           _datEntSetLx.getEntityData().set(HorseEntity.DATA_Baby, true);
                        }

                        patt0$temp = world.getEntitiesOfClass(
                              HorseEntity.class,
                              AABB.ofSize(
                                 new Vec3(
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getX(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getY(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getZ()
                                 ),
                                 4.0,
                                 4.0,
                                 4.0
                              ),
                              e -> true
                           )
                           .stream()
                           .sorted(
                              (new Object() {
                                    Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                       return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                    }
                                 })
                                 .compareDistOf(
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getX(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getY(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getZ()
                                 )
                           )
                           .findFirst()
                           .orElse(null);
                        if (patt0$temp instanceof HorseEntity _datEntSetI) {
                           _datEntSetI.getEntityData().set(HorseEntity.DATA_Variant, 11);
                        }
                     }
                  );
               }
            }

            _livingEntity253 = world.getEntitiesOfClass(HorseEntity.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
               .stream()
               .sorted((new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                  }
               }).compareDistOf(x, y, z))
               .findFirst()
               .orElse(null);
            if (_livingEntity253 instanceof HorseEntity _datEntL177 && (Boolean)_datEntL177.getEntityData().get(HorseEntity.DATA_Breed)) {
               _livingEntity253 = world.getEntitiesOfClass(HorseEntity.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if ((_livingEntity253 instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 10
                  && entity.getPersistentData().getBoolean("MocBreed")
                  && !world.getEntitiesOfClass(HorseEntity.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true).isEmpty()
                  && !world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true).isEmpty()
                  && (
                        entity instanceof LivingEntity _livingEntity183
                              && _livingEntity183.getAttributes().hasAttribute(MocreaturesModAttributes.TESTATTRIBUTE)
                           ? _livingEntity183.getAttribute(MocreaturesModAttributes.TESTATTRIBUTE).getValue()
                           : 0.0
                     )
                     == 1.0) {
                  Entity var62 = world.getEntitiesOfClass(HorseEntity.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                     .stream()
                     .sorted((new Object() {
                        Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                           return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                        }
                     }).compareDistOf(x, y, z))
                     .findFirst()
                     .orElse(null);
                  if (var62 instanceof HorseEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(HorseEntity.DATA_Breed, false);
                  }

                  entity.getPersistentData().putBoolean("MocBreed", false);
                  MocreaturesMod.queueServerWork(
                     60,
                     () -> {
                        if (world instanceof ServerLevel _level) {
                           Entity entityToSpawn = (MocreaturesModEntities.HORSE.get())
                              .spawn(
                                 _level,
                                 BlockPos.containing(
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getX(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getY(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getZ()
                                 ),
                                 MobSpawnType.MOB_SUMMONED
                              );
                           if (entityToSpawn != null) {
                              entityToSpawn.setDeltaMovement(0.0, 0.0, 0.0);
                           }
                        }

                        Entity patt0$temp = world.getEntitiesOfClass(
                              HorseEntity.class,
                              AABB.ofSize(
                                 new Vec3(
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getX(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getY(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getZ()
                                 ),
                                 4.0,
                                 4.0,
                                 4.0
                              ),
                              e -> true
                           )
                           .stream()
                           .sorted(
                              (new Object() {
                                    Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                       return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                    }
                                 })
                                 .compareDistOf(
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getX(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getY(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getZ()
                                 )
                           )
                           .findFirst()
                           .orElse(null);
                        if (patt0$temp instanceof HorseEntity _datEntSetLx) {
                           _datEntSetLx.getEntityData().set(HorseEntity.DATA_Baby, true);
                        }

                        patt0$temp = world.getEntitiesOfClass(
                              HorseEntity.class,
                              AABB.ofSize(
                                 new Vec3(
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getX(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getY(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getZ()
                                 ),
                                 4.0,
                                 4.0,
                                 4.0
                              ),
                              e -> true
                           )
                           .stream()
                           .sorted(
                              (new Object() {
                                    Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                       return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                    }
                                 })
                                 .compareDistOf(
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getX(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getY(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getZ()
                                 )
                           )
                           .findFirst()
                           .orElse(null);
                        if (patt0$temp instanceof HorseEntity _datEntSetI) {
                           _datEntSetI.getEntityData().set(HorseEntity.DATA_Variant, 12);
                        }
                     }
                  );
               }
            }

            _livingEntity253 = world.getEntitiesOfClass(HorseEntity.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
               .stream()
               .sorted((new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                  }
               }).compareDistOf(x, y, z))
               .findFirst()
               .orElse(null);
            if (_livingEntity253 instanceof HorseEntity _datEntL212 && (Boolean)_datEntL212.getEntityData().get(HorseEntity.DATA_Breed)) {
               _livingEntity253 = world.getEntitiesOfClass(HorseEntity.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if ((_livingEntity253 instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 3
                  && entity.getPersistentData().getBoolean("MocBreed")
                  && !world.getEntitiesOfClass(HorseEntity.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true).isEmpty()
                  && !world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true).isEmpty()
                  && (
                        entity instanceof LivingEntity _livingEntity218
                              && _livingEntity218.getAttributes().hasAttribute(MocreaturesModAttributes.TESTATTRIBUTE)
                           ? _livingEntity218.getAttribute(MocreaturesModAttributes.TESTATTRIBUTE).getValue()
                           : 0.0
                     )
                     == 4.0) {
                  Entity var63 = world.getEntitiesOfClass(HorseEntity.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                     .stream()
                     .sorted((new Object() {
                        Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                           return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                        }
                     }).compareDistOf(x, y, z))
                     .findFirst()
                     .orElse(null);
                  if (var63 instanceof HorseEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(HorseEntity.DATA_Breed, false);
                  }

                  entity.getPersistentData().putBoolean("MocBreed", false);
                  MocreaturesMod.queueServerWork(
                     60,
                     () -> {
                        if (world instanceof ServerLevel _level) {
                           Entity entityToSpawn = (MocreaturesModEntities.HORSE.get())
                              .spawn(
                                 _level,
                                 BlockPos.containing(
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getX(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getY(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getZ()
                                 ),
                                 MobSpawnType.MOB_SUMMONED
                              );
                           if (entityToSpawn != null) {
                              entityToSpawn.setDeltaMovement(0.0, 0.0, 0.0);
                           }
                        }

                        Entity patt0$temp = world.getEntitiesOfClass(
                              HorseEntity.class,
                              AABB.ofSize(
                                 new Vec3(
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getX(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getY(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getZ()
                                 ),
                                 4.0,
                                 4.0,
                                 4.0
                              ),
                              e -> true
                           )
                           .stream()
                           .sorted(
                              (new Object() {
                                    Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                       return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                    }
                                 })
                                 .compareDistOf(
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getX(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getY(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getZ()
                                 )
                           )
                           .findFirst()
                           .orElse(null);
                        if (patt0$temp instanceof HorseEntity _datEntSetLx) {
                           _datEntSetLx.getEntityData().set(HorseEntity.DATA_Baby, true);
                        }

                        patt0$temp = world.getEntitiesOfClass(
                              HorseEntity.class,
                              AABB.ofSize(
                                 new Vec3(
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getX(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getY(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getZ()
                                 ),
                                 4.0,
                                 4.0,
                                 4.0
                              ),
                              e -> true
                           )
                           .stream()
                           .sorted(
                              (new Object() {
                                    Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                       return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                    }
                                 })
                                 .compareDistOf(
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getX(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getY(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getZ()
                                 )
                           )
                           .findFirst()
                           .orElse(null);
                        if (patt0$temp instanceof HorseEntity _datEntSetI) {
                           _datEntSetI.getEntityData().set(HorseEntity.DATA_Variant, 13);
                        }
                     }
                  );
               }
            }

            _livingEntity253 = world.getEntitiesOfClass(HorseEntity.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
               .stream()
               .sorted((new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                  }
               }).compareDistOf(x, y, z))
               .findFirst()
               .orElse(null);
            if (_livingEntity253 instanceof HorseEntity _datEntL247 && (Boolean)_datEntL247.getEntityData().get(HorseEntity.DATA_Breed)) {
               _livingEntity253 = world.getEntitiesOfClass(HorseEntity.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if ((_livingEntity253 instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 13
                  && entity.getPersistentData().getBoolean("MocBreed")
                  && !world.getEntitiesOfClass(HorseEntity.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true).isEmpty()
                  && !world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true).isEmpty()
                  && (
                        entity instanceof LivingEntity _livingEntity253x
                              && _livingEntity253x.getAttributes().hasAttribute(MocreaturesModAttributes.TESTATTRIBUTE)
                           ? _livingEntity253x.getAttribute(MocreaturesModAttributes.TESTATTRIBUTE).getValue()
                           : 0.0
                     )
                     == 2.0) {
                  Entity var64 = world.getEntitiesOfClass(HorseEntity.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                     .stream()
                     .sorted((new Object() {
                        Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                           return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                        }
                     }).compareDistOf(x, y, z))
                     .findFirst()
                     .orElse(null);
                  if (var64 instanceof HorseEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(HorseEntity.DATA_Breed, false);
                  }

                  entity.getPersistentData().putBoolean("MocBreed", false);
                  MocreaturesMod.queueServerWork(
                     60,
                     () -> {
                        if (world instanceof ServerLevel _level) {
                           Entity entityToSpawn = (MocreaturesModEntities.HORSE.get())
                              .spawn(
                                 _level,
                                 BlockPos.containing(
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getX(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getY(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getZ()
                                 ),
                                 MobSpawnType.MOB_SUMMONED
                              );
                           if (entityToSpawn != null) {
                              entityToSpawn.setDeltaMovement(0.0, 0.0, 0.0);
                           }
                        }

                        Entity patt0$temp = world.getEntitiesOfClass(
                              HorseEntity.class,
                              AABB.ofSize(
                                 new Vec3(
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getX(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getY(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getZ()
                                 ),
                                 4.0,
                                 4.0,
                                 4.0
                              ),
                              e -> true
                           )
                           .stream()
                           .sorted(
                              (new Object() {
                                    Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                       return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                    }
                                 })
                                 .compareDistOf(
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getX(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getY(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getZ()
                                 )
                           )
                           .findFirst()
                           .orElse(null);
                        if (patt0$temp instanceof HorseEntity _datEntSetLx) {
                           _datEntSetLx.getEntityData().set(HorseEntity.DATA_Baby, true);
                        }

                        patt0$temp = world.getEntitiesOfClass(
                              HorseEntity.class,
                              AABB.ofSize(
                                 new Vec3(
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getX(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getY(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getZ()
                                 ),
                                 4.0,
                                 4.0,
                                 4.0
                              ),
                              e -> true
                           )
                           .stream()
                           .sorted(
                              (new Object() {
                                    Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                       return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                    }
                                 })
                                 .compareDistOf(
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getX(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getY(),
                                    world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), e -> true)
                                       .stream()
                                       .sorted((new Object() {
                                          Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                          }
                                       }).compareDistOf(x, y, z))
                                       .findFirst()
                                       .orElse(null)
                                       .getZ()
                                 )
                           )
                           .findFirst()
                           .orElse(null);
                        if (patt0$temp instanceof HorseEntity _datEntSetI) {
                           _datEntSetI.getEntityData().set(HorseEntity.DATA_Variant, 15);
                        }
                     }
                  );
               }
            }
         }
      }
   }
}
