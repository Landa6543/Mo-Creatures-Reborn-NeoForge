package net.mocreatures.procedures;

import javax.annotation.Nullable;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.TamableAnimal;
import net.mocreatures.entity.PandaBearEntity;
import net.neoforged.bus.api.Event;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.tick.EntityTickEvent.Pre;

@EventBusSubscriber
public class PandaBearGrowUpProcedure {
   @SubscribeEvent
   public static void onEntityTick(Pre event) {
      execute(event, event.getEntity());
   }

   public static void execute(Entity entity) {
      execute(null, entity);
   }

   private static void execute(@Nullable Event event, Entity entity) {
      if (entity != null) {
         if (entity instanceof TamableAnimal _tamEnt && _tamEnt.isTame() && entity instanceof PandaBearEntity) {
            if (entity instanceof PandaBearEntity _datEntSetI) {
               _datEntSetI.getEntityData()
                  .set(
                     PandaBearEntity.DATA_GrowUp,
                     (entity instanceof PandaBearEntity _datEntI ? (Integer)_datEntI.getEntityData().get(PandaBearEntity.DATA_GrowUp) : 0) + 1
                  );
            }

            if ((entity instanceof PandaBearEntity _datEntI ? (Integer)_datEntI.getEntityData().get(PandaBearEntity.DATA_GrowUp) : 0) >= 1200
               && entity instanceof PandaBearEntity _datEntSetL) {
               _datEntSetL.getEntityData().set(PandaBearEntity.DATA_Baby, false);
            }
         }
      }
   }
}
