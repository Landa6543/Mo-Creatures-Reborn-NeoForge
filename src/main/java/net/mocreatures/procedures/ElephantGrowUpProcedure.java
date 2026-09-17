package net.mocreatures.procedures;

import javax.annotation.Nullable;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.TamableAnimal;
import net.mocreatures.entity.ElephantEntity;
import net.neoforged.bus.api.Event;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.tick.EntityTickEvent.Pre;
import virtuoel.pehkui.api.ScaleOperations;
import virtuoel.pehkui.api.ScaleRegistries;
import virtuoel.pehkui.api.ScaleType;
import virtuoel.pehkui.api.ScaleTypes;

@EventBusSubscriber
public class ElephantGrowUpProcedure {
   @SubscribeEvent
   public static void onEntityTick(Pre event) {
      execute(event, event.getEntity());
   }

   public static void execute(Entity entity) {
      execute(null, entity);
   }

   private static void execute(@Nullable Event event, Entity entity) {
      if (entity != null) {
         if (entity instanceof TamableAnimal _tamEnt && _tamEnt.isTame() && entity instanceof ElephantEntity) {
            if (entity instanceof ElephantEntity _datEntSetI) {
               _datEntSetI.getEntityData()
                  .set(
                     ElephantEntity.DATA_GrowUp,
                     (entity instanceof ElephantEntity _datEntI ? (Integer)_datEntI.getEntityData().get(ElephantEntity.DATA_GrowUp) : 0) + 1
                  );
            }

            if ((entity instanceof ElephantEntity _datEntI ? (Integer)_datEntI.getEntityData().get(ElephantEntity.DATA_GrowUp) : 0) >= 1200) {
               if (entity instanceof ElephantEntity _datEntSetL) {
                  _datEntSetL.getEntityData().set(ElephantEntity.DATA_Baby, false);
               }

               if (entity instanceof ElephantEntity _datEntL6 && (Boolean)_datEntL6.getEntityData().get(ElephantEntity.DATA_African)) {
                  ScaleTypes.HEIGHT
                     .getScaleData(entity)
                     .setTargetScale((float)ScaleOperations.SET.applyAsDouble(ScaleTypes.HEIGHT.getScaleData(entity).getTargetScale(), 1.2));
                  ScaleTypes.WIDTH
                     .getScaleData(entity)
                     .setTargetScale((float)ScaleOperations.SET.applyAsDouble(ScaleTypes.WIDTH.getScaleData(entity).getTargetScale(), 1.2));
               } else {
                  for (ScaleType type : ScaleRegistries.SCALE_TYPES.values()) {
                     type.getScaleData(entity).setPersistence(type.getScaleData(entity).getPersistence());
                     type.getScaleData(entity).resetScale();
                  }
               }
            }
         }
      }
   }
}
