package net.mocreatures.procedures;

import net.minecraft.world.entity.Entity;

public class BunnyDropProcedure {
   public static void execute(Entity entity, Entity sourceentity) {
      if (entity != null && sourceentity != null) {
         if (sourceentity.isShiftKeyDown()) {
            entity.stopRiding();
         }
      }
   }
}
