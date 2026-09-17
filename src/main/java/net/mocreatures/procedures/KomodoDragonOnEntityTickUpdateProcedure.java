package net.mocreatures.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.mocreatures.entity.KomodoDragonEntity;

public class KomodoDragonOnEntityTickUpdateProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         if (entity instanceof KomodoDragonEntity _datEntL0 && (Boolean)_datEntL0.getEntityData().get(KomodoDragonEntity.DATA_Sit)) {
            if (entity instanceof KomodoDragonEntity) {
               ((KomodoDragonEntity)entity).setAnimation("sit");
            }

            if (entity instanceof LivingEntity _livingEntity2 && _livingEntity2.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED)) {
               _livingEntity2.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(0.0);
            }
         }
      }
   }
}
