package net.mocreatures.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.mocreatures.entity.HumanWerewolfEntity;

public class HumanWerewolfOnInitialEntitySpawnProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         if (Math.random() < 0.3 && entity instanceof HumanWerewolfEntity animatable) {
            animatable.setTexture("werehuman_woman");
         }

         if (Math.random() < 0.4 && entity instanceof HumanWerewolfEntity animatable) {
            animatable.setTexture("werehuman_oldie");
         }

         if (Math.random() < 0.5 && entity instanceof HumanWerewolfEntity animatable) {
            animatable.setTexture("werehuman_dude");
         }

         if (Math.random() < 0.6 && entity instanceof HumanWerewolfEntity animatable) {
            animatable.setTexture("werehuman_classic");
         }

         if (entity instanceof LivingEntity _entity) {
            _entity.setHealth(15.0F);
         }
      }
   }
}
