package net.mocreatures.procedures;

import net.minecraft.world.entity.Entity;
import net.mocreatures.entity.HorseEntity;

public class HorseFlyOnKeyReleasedProcedure {
   public static void execute(Entity var0) {
      if (var0 != null && var0.getVehicle() instanceof HorseEntity var1) {
         int var4 = (Integer)var1.getEntityData().get(HorseEntity.DATA_Variant);
         boolean var3 = (Boolean)var1.getEntityData().get(HorseEntity.DATA_Winged)
            || var4 == 105
            || var4 == 106
            || var4 == 111
            || var4 == 112
            || var4 == 116
            || (Boolean)var1.getEntityData().get(HorseEntity.DATA_Fairy);
         if (var3) {
            var1.getPersistentData().putDouble("VerticalMovement", -1.0);
         }
      }
   }
}
