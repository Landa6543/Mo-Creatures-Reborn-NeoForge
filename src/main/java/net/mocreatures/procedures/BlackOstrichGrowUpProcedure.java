package net.mocreatures.procedures;

import javax.annotation.Nullable;
import net.minecraft.world.entity.Entity;
import net.mocreatures.entity.BlackOstrichEntity;
import net.neoforged.bus.api.Event;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.tick.EntityTickEvent.Pre;

@EventBusSubscriber
public class BlackOstrichGrowUpProcedure {
   @SubscribeEvent
   public static void onEntityTick(Pre event) {
      execute(event, event.getEntity());
   }

   public static void execute(Entity entity) {
      execute(null, entity);
   }

   private static void execute(@Nullable Event event, Entity entity) {
      if (entity != null) {
         if (entity instanceof BlackOstrichEntity _datEntSetI) {
            _datEntSetI.getEntityData()
               .set(
                  BlackOstrichEntity.DATA_GrowUp,
                  (entity instanceof BlackOstrichEntity _datEntI ? (Integer)_datEntI.getEntityData().get(BlackOstrichEntity.DATA_GrowUp) : 0) + 1
               );
         }

         if ((entity instanceof BlackOstrichEntity _datEntI ? (Integer)_datEntI.getEntityData().get(BlackOstrichEntity.DATA_GrowUp) : 0) >= 1200
            && entity instanceof BlackOstrichEntity _datEntSetL) {
            _datEntSetL.getEntityData().set(BlackOstrichEntity.DATA_Baby, false);
         }
      }
   }
}
