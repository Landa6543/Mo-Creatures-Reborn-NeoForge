package net.mocreatures.procedures;

import net.minecraft.world.entity.Entity;
import net.mocreatures.entity.ToxicManticoreEntity;

public class ToxicManticorePassiveBabyProcedure {
   public static boolean execute(Entity entity) {
      return entity == null
         ? false
         : !(entity instanceof ToxicManticoreEntity _datEntL0 && (Boolean)_datEntL0.getEntityData().get(ToxicManticoreEntity.DATA_Baby));
   }
}
