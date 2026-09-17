package net.mocreatures.procedures;

import javax.annotation.Nullable;
import net.minecraft.world.entity.Entity;
import net.mocreatures.entity.ClownfishEntity;
import net.neoforged.bus.api.Event;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.tick.EntityTickEvent.Pre;

@EventBusSubscriber
public class ClownfishGrowUpProcedure {
   @SubscribeEvent
   public static void onEntityTick(Pre event) {
      execute(event, event.getEntity());
   }

   public static void execute(Entity entity) {
      execute(null, entity);
   }

   private static void execute(@Nullable Event event, Entity entity) {
      if (entity != null) {
         if (entity instanceof ClownfishEntity _datEntSetI) {
            _datEntSetI.getEntityData()
               .set(
                  ClownfishEntity.DATA_GrowUp,
                  (entity instanceof ClownfishEntity _datEntI ? (Integer)_datEntI.getEntityData().get(ClownfishEntity.DATA_GrowUp) : 0) + 1
               );
         }

         if ((entity instanceof ClownfishEntity _datEntI ? (Integer)_datEntI.getEntityData().get(ClownfishEntity.DATA_GrowUp) : 0) >= 1200
            && entity instanceof ClownfishEntity _datEntSetL) {
            _datEntSetL.getEntityData().set(ClownfishEntity.DATA_Baby, false);
         }
      }
   }
}
