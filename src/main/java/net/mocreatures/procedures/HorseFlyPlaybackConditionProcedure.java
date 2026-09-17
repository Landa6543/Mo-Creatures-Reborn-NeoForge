package net.mocreatures.procedures;

import javax.annotation.Nullable;
import net.minecraft.world.entity.Entity;
import net.mocreatures.entity.HorseEntity;
import net.neoforged.bus.api.Event;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.tick.EntityTickEvent.Pre;

@EventBusSubscriber
public class HorseFlyPlaybackConditionProcedure {
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

      if (var1 instanceof HorseEntity var2) {
         boolean var3 = false;

         try {
            var3 = (Boolean)var2.getEntityData().get(HorseEntity.DATA_Winged);
         } catch (Throwable var5) {
         }

         if (var3 || var2.getPersistentData().getBoolean("DataWinged")) {
            if (var1.isVehicle()) {
               return var1.getPersistentData().getBoolean("MoC_IsFlying");
            }

            return !var1.onGround();
         }
      }

      return false;
   }
}
