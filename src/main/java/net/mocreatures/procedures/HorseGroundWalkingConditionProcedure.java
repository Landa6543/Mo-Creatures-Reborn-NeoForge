package net.mocreatures.procedures;

import javax.annotation.Nullable;
import net.minecraft.world.entity.Entity;
import net.mocreatures.entity.HorseEntity;
import net.neoforged.bus.api.Event;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.tick.EntityTickEvent.Pre;

@EventBusSubscriber
public class HorseGroundWalkingConditionProcedure {
   @SubscribeEvent
   public static void onEntityTick(Pre var0) {
      execute(var0, var0.getEntity());
   }

   public static boolean execute(Entity var0) {
      return execute(null, var0);
   }

   private static boolean execute(@Nullable Event var0, Entity var1) {
      if (var1 == null) {
         return false;
      }

      int var2 = var1 instanceof HorseEntity var3 ? (Integer)var3.getEntityData().get(HorseEntity.DATA_Variant) : 0;
      return var2 != 115 && var2 != 116;
   }
}
