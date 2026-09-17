package net.mocreatures.procedures;

import net.minecraft.world.entity.Entity;
import net.mocreatures.entity.FireManticoreEntity;

public class FireManticorePassiveBabyProcedure {
   public static boolean execute(Entity entity) {
      return entity == null
         ? false
         : !(entity instanceof FireManticoreEntity _datEntL0 && (Boolean)_datEntL0.getEntityData().get(FireManticoreEntity.DATA_Baby));
   }
}
