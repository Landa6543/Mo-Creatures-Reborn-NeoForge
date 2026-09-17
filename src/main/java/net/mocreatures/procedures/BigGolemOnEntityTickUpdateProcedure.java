package net.mocreatures.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.mocreatures.entity.BigGolemEntity;

public class BigGolemOnEntityTickUpdateProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         if (!(entity instanceof Mob _mobEnt0 && _mobEnt0.isAggressive())
            && (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1.0F) == 60.0F
            && entity instanceof BigGolemEntity) {
            ((BigGolemEntity)entity).setAnimation("idle");
         }
      }
   }
}
