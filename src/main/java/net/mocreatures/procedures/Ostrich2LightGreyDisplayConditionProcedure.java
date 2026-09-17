package net.mocreatures.procedures;

import javax.annotation.Nullable;
import net.minecraft.world.entity.Entity;
import net.mocreatures.entity.BlackOstrichEntity;
import net.neoforged.bus.api.Event;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.tick.EntityTickEvent.Pre;

@EventBusSubscriber
public class Ostrich2LightGreyDisplayConditionProcedure {
   @SubscribeEvent
   public static void onEntityTick(Pre event) {
      execute(event, event.getEntity());
   }

   public static boolean execute(Entity entity) {
      return execute(null, entity);
   }

   private static boolean execute(@Nullable Event event, Entity entity) {
      return entity == null
         ? false
         : entity instanceof BlackOstrichEntity _datEntL0
            && (Boolean)_datEntL0.getEntityData().get(BlackOstrichEntity.DATA_LightGrey_Flag)
            && entity instanceof BlackOstrichEntity _datEntL1
            && (Boolean)_datEntL1.getEntityData().get(BlackOstrichEntity.DATA_Chest);
   }
}
