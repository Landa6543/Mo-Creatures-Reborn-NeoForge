package net.mocreatures.procedures;

import javax.annotation.Nullable;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.TamableAnimal;
import net.mocreatures.entity.LeogerEntity;
import net.neoforged.bus.api.Event;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.tick.EntityTickEvent.Pre;

@EventBusSubscriber
public class LeogerGrowUpProcedure {
   @SubscribeEvent
   public static void onEntityTick(Pre event) {
      execute(event, event.getEntity());
   }

   public static void execute(Entity entity) {
      execute(null, entity);
   }

   private static void execute(@Nullable Event event, Entity entity) {
      if (entity != null) {
         if (entity instanceof TamableAnimal _tamEnt && _tamEnt.isTame() && entity instanceof LeogerEntity) {
            if (entity instanceof LeogerEntity _datEntSetI) {
               _datEntSetI.getEntityData()
                  .set(
                     LeogerEntity.DATA_GrowUp,
                     (entity instanceof LeogerEntity _datEntI ? (Integer)_datEntI.getEntityData().get(LeogerEntity.DATA_GrowUp) : 0) + 1
                  );
            }

            if ((entity instanceof LeogerEntity _datEntI ? (Integer)_datEntI.getEntityData().get(LeogerEntity.DATA_GrowUp) : 0) >= 1200
               && entity instanceof LeogerEntity _datEntSetL) {
               _datEntSetL.getEntityData().set(LeogerEntity.DATA_Baby, false);
            }
         }
      }
   }
}
