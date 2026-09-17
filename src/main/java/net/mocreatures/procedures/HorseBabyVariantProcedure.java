package net.mocreatures.procedures;

import java.util.Comparator;
import javax.annotation.Nullable;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.mocreatures.entity.HorseEntity;
import net.neoforged.bus.api.Event;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.tick.PlayerTickEvent.Post;

@EventBusSubscriber
public class HorseBabyVariantProcedure {
   @SubscribeEvent
   public static void onPlayerTick(Post event) {
      execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
   }

   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
      execute(null, world, x, y, z, entity);
   }

   private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
      if (entity != null) {
         Vec3 _center = new Vec3(x, y, z);

         for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5.0), e -> true)
            .stream()
            .sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
            .toList()) {
            if (entityiterator instanceof LivingEntity _livEnt0 && _livEnt0.isBaby() && entityiterator instanceof HorseEntity) {
               if (entity.getPersistentData().getDouble("MocHorseParent1") == 1.0 && entity.getPersistentData().getDouble("MocHorseParent2") == 1.0) {
                  if (entityiterator instanceof HorseEntity _datEntSetI) {
                     _datEntSetI.getEntityData().set(HorseEntity.DATA_Variant, 1);
                  }

                  if (entityiterator instanceof HorseEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(HorseEntity.DATA_Baby, true);
                  }

                  if (entityiterator instanceof AgeableMob _ageable) {
                     _ageable.setAge(100);
                  }

                  entity.getPersistentData().putDouble("MocHorseParent1", 0.0);
                  entity.getPersistentData().putDouble("MocHorseParent2", 0.0);
               }

               if (entity.getPersistentData().getDouble("MocHorseParent1") == 2.0 && entity.getPersistentData().getDouble("MocHorseParent2") == 2.0) {
                  if (entityiterator instanceof HorseEntity _datEntSetI) {
                     _datEntSetI.getEntityData().set(HorseEntity.DATA_Variant, 2);
                  }

                  if (entityiterator instanceof HorseEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(HorseEntity.DATA_Baby, true);
                  }

                  if (entityiterator instanceof AgeableMob _ageable) {
                     _ageable.setAge(100);
                  }

                  entity.getPersistentData().putDouble("MocHorseParent1", 0.0);
                  entity.getPersistentData().putDouble("MocHorseParent2", 0.0);
               }

               if (entity.getPersistentData().getDouble("MocHorseParent1") == 3.0 && entity.getPersistentData().getDouble("MocHorseParent2") == 3.0) {
                  if (entityiterator instanceof HorseEntity _datEntSetI) {
                     _datEntSetI.getEntityData().set(HorseEntity.DATA_Variant, 3);
                  }

                  if (entityiterator instanceof HorseEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(HorseEntity.DATA_Baby, true);
                  }

                  if (entityiterator instanceof AgeableMob _ageable) {
                     _ageable.setAge(100);
                  }

                  entity.getPersistentData().putDouble("MocHorseParent1", 0.0);
                  entity.getPersistentData().putDouble("MocHorseParent2", 0.0);
               }

               if (entity.getPersistentData().getDouble("MocHorseParent1") == 5.0 && entity.getPersistentData().getDouble("MocHorseParent2") == 5.0) {
                  if (entityiterator instanceof HorseEntity _datEntSetI) {
                     _datEntSetI.getEntityData().set(HorseEntity.DATA_Variant, 5);
                  }

                  if (entityiterator instanceof HorseEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(HorseEntity.DATA_Baby, true);
                  }

                  if (entityiterator instanceof AgeableMob _ageable) {
                     _ageable.setAge(100);
                  }

                  entity.getPersistentData().putDouble("MocHorseParent1", 0.0);
                  entity.getPersistentData().putDouble("MocHorseParent2", 0.0);
               }

               if (entity.getPersistentData().getDouble("MocHorseParent1") == 1.0 && entity.getPersistentData().getDouble("MocHorseParent2") == 2.0
                  || entity.getPersistentData().getDouble("MocHorseParent1") == 2.0 && entity.getPersistentData().getDouble("MocHorseParent2") == 1.0) {
                  if (entityiterator instanceof HorseEntity _datEntSetI) {
                     _datEntSetI.getEntityData().set(HorseEntity.DATA_Variant, 5);
                  }

                  if (entityiterator instanceof HorseEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(HorseEntity.DATA_Baby, true);
                  }

                  if (entityiterator instanceof AgeableMob _ageable) {
                     _ageable.setAge(100);
                  }

                  entity.getPersistentData().putDouble("MocHorseParent1", 0.0);
                  entity.getPersistentData().putDouble("MocHorseParent2", 0.0);
               }

               if (entity.getPersistentData().getDouble("MocHorseParent1") == 5.0 && entity.getPersistentData().getDouble("MocHorseParent2") == 2.0
                  || entity.getPersistentData().getDouble("MocHorseParent1") == 2.0 && entity.getPersistentData().getDouble("MocHorseParent2") == 5.0) {
                  if (entityiterator instanceof HorseEntity _datEntSetI) {
                     _datEntSetI.getEntityData().set(HorseEntity.DATA_Variant, 6);
                  }

                  if (entityiterator instanceof HorseEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(HorseEntity.DATA_Baby, true);
                  }

                  if (entityiterator instanceof AgeableMob _ageable) {
                     _ageable.setAge(100);
                  }

                  entity.getPersistentData().putDouble("MocHorseParent1", 0.0);
                  entity.getPersistentData().putDouble("MocHorseParent2", 0.0);
               }

               if (entity.getPersistentData().getDouble("MocHorseParent1") == 100.0 && entity.getPersistentData().getDouble("MocHorseParent2") != 100.0
                  || entity.getPersistentData().getDouble("MocHorseParent1") != 100.0 && entity.getPersistentData().getDouble("MocHorseParent2") == 100.0) {
                  if (entityiterator instanceof HorseEntity _datEntSetI) {
                     _datEntSetI.getEntityData().set(HorseEntity.DATA_Variant, 101);
                  }

                  if (entityiterator instanceof HorseEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(HorseEntity.DATA_Baby, true);
                  }

                  if (entityiterator instanceof AgeableMob _ageable) {
                     _ageable.setAge(100);
                  }

                  entity.getPersistentData().putDouble("MocHorseParent1", 0.0);
                  entity.getPersistentData().putDouble("MocHorseParent2", 0.0);
               }

               if (entity.getPersistentData().getDouble("MocHorseParent1") == 9.0 && entity.getPersistentData().getDouble("MocHorseParent2") == 3.0
                  || entity.getPersistentData().getDouble("MocHorseParent1") == 3.0 && entity.getPersistentData().getDouble("MocHorseParent2") == 9.0) {
                  if (entityiterator instanceof HorseEntity _datEntSetI) {
                     _datEntSetI.getEntityData().set(HorseEntity.DATA_Variant, 11);
                  }

                  if (entityiterator instanceof HorseEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(HorseEntity.DATA_Baby, true);
                  }

                  if (entityiterator instanceof AgeableMob _ageable) {
                     _ageable.setAge(100);
                  }

                  entity.getPersistentData().putDouble("MocHorseParent1", 0.0);
                  entity.getPersistentData().putDouble("MocHorseParent2", 0.0);
               }

               if (entity.getPersistentData().getDouble("MocHorseParent1") == 9.0 && entity.getPersistentData().getDouble("MocHorseParent2") == 10.0
                  || entity.getPersistentData().getDouble("MocHorseParent1") == 10.0 && entity.getPersistentData().getDouble("MocHorseParent2") == 9.0) {
                  if (entityiterator instanceof HorseEntity _datEntSetI) {
                     _datEntSetI.getEntityData().set(HorseEntity.DATA_Variant, 12);
                  }

                  if (entityiterator instanceof HorseEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(HorseEntity.DATA_Baby, true);
                  }

                  if (entityiterator instanceof AgeableMob _ageable) {
                     _ageable.setAge(100);
                  }

                  entity.getPersistentData().putDouble("MocHorseParent1", 0.0);
                  entity.getPersistentData().putDouble("MocHorseParent2", 0.0);
               }

               if (entity.getPersistentData().getDouble("MocHorseParent1") == 3.0 && entity.getPersistentData().getDouble("MocHorseParent2") == 6.0
                  || entity.getPersistentData().getDouble("MocHorseParent1") == 6.0 && entity.getPersistentData().getDouble("MocHorseParent2") == 3.0) {
                  if (entityiterator instanceof HorseEntity _datEntSetI) {
                     _datEntSetI.getEntityData().set(HorseEntity.DATA_Variant, 13);
                  }

                  if (entityiterator instanceof HorseEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(HorseEntity.DATA_Baby, true);
                  }

                  if (entityiterator instanceof AgeableMob _ageable) {
                     _ageable.setAge(100);
                  }

                  entity.getPersistentData().putDouble("MocHorseParent1", 0.0);
                  entity.getPersistentData().putDouble("MocHorseParent2", 0.0);
               }

               if (entity.getPersistentData().getDouble("MocHorseParent1") == 12.0 && entity.getPersistentData().getDouble("MocHorseParent2") == 8.0
                  || entity.getPersistentData().getDouble("MocHorseParent1") == 8.0 && entity.getPersistentData().getDouble("MocHorseParent2") == 12.0) {
                  if (entityiterator instanceof HorseEntity _datEntSetI) {
                     _datEntSetI.getEntityData().set(HorseEntity.DATA_Variant, 14);
                  }

                  if (entityiterator instanceof HorseEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(HorseEntity.DATA_Baby, true);
                  }

                  if (entityiterator instanceof AgeableMob _ageable) {
                     _ageable.setAge(100);
                  }

                  entity.getPersistentData().putDouble("MocHorseParent1", 0.0);
                  entity.getPersistentData().putDouble("MocHorseParent2", 0.0);
               }

               if (entity.getPersistentData().getDouble("MocHorseParent1") == 13.0 && entity.getPersistentData().getDouble("MocHorseParent2") == 8.0
                  || entity.getPersistentData().getDouble("MocHorseParent1") == 8.0 && entity.getPersistentData().getDouble("MocHorseParent2") == 13.0) {
                  if (entityiterator instanceof HorseEntity _datEntSetI) {
                     _datEntSetI.getEntityData().set(HorseEntity.DATA_Variant, 15);
                  }

                  if (entityiterator instanceof HorseEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(HorseEntity.DATA_Baby, true);
                  }

                  if (entityiterator instanceof AgeableMob _ageable) {
                     _ageable.setAge(100);
                  }

                  entity.getPersistentData().putDouble("MocHorseParent1", 0.0);
                  entity.getPersistentData().putDouble("MocHorseParent2", 0.0);
               }

               if (entityiterator instanceof TamableAnimal _toTame && entity instanceof Player _owner) {
                  _toTame.tame(_owner);
               }
            }
         }
      }
   }
}
