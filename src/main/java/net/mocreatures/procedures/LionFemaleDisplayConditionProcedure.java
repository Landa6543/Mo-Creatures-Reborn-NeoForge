package net.mocreatures.procedures;

import javax.annotation.Nullable;
import net.minecraft.world.entity.Entity;
import net.mocreatures.entity.LionEntity;
import net.neoforged.bus.api.Event;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.tick.EntityTickEvent.Pre;

@EventBusSubscriber
public class LionFemaleDisplayConditionProcedure {
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
         : (entity instanceof LionEntity _datEntI ? (Integer)_datEntI.getEntityData().get(LionEntity.DATA_LionGender) : 0) == 1
            && (entity instanceof LionEntity _datEntI ? (Integer)_datEntI.getEntityData().get(LionEntity.DATA_LionColor) : 0) == 1
            && !(entity instanceof LionEntity _datEntL2 && (Boolean)_datEntL2.getEntityData().get(LionEntity.DATA_Baby));
   }
}
