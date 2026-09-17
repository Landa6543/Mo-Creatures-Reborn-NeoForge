package net.mocreatures.procedures;

import net.minecraft.world.entity.Entity;
import net.mocreatures.entity.DarkManticoreEntity;

public class DarkManticorePassiveBabyProcedure {
   public static boolean execute(Entity entity) {
      return entity == null
         ? false
         : !(entity instanceof DarkManticoreEntity _datEntL0 && (Boolean)_datEntL0.getEntityData().get(DarkManticoreEntity.DATA_Baby));
   }
}
