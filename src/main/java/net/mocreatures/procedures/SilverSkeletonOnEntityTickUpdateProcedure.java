package net.mocreatures.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.Attributes;

public class SilverSkeletonOnEntityTickUpdateProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         if (entity instanceof Mob _mobEnt0 && _mobEnt0.isAggressive()) {
            if (entity instanceof LivingEntity _livingEntity1 && _livingEntity1.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED)) {
               _livingEntity1.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(0.3);
            }
         } else if (!(entity instanceof Mob _mobEnt2 && _mobEnt2.isAggressive())
            && entity instanceof LivingEntity _livingEntity3
            && _livingEntity3.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED)) {
            _livingEntity3.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(0.25);
         }
      }
   }
}
