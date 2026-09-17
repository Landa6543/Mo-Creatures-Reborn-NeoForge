package net.mocreatures.procedures;

import net.minecraft.world.entity.Entity;
import net.mocreatures.entity.ElephantEntity;

public class ElephantChestDisplayConditionProcedure {
   public static boolean execute(Entity entity) {
      return entity == null
         ? false
         : entity instanceof ElephantEntity _datEntL0
            && (Boolean)_datEntL0.getEntityData().get(ElephantEntity.DATA_Chest)
            && !(entity instanceof ElephantEntity _datEntL1 && (Boolean)_datEntL1.getEntityData().get(ElephantEntity.DATA_Asian_Decorated));
   }
}
