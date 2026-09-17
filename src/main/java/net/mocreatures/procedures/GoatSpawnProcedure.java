package net.mocreatures.procedures;

import net.minecraft.world.entity.Entity;
import net.mocreatures.entity.SmallMaleGoatEntity;

public class GoatSpawnProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         if (Math.random() < 0.5 && entity instanceof SmallMaleGoatEntity animatable) {
            animatable.setTexture("goat_brown");
         }

         if (Math.random() < 0.5 && entity instanceof SmallMaleGoatEntity animatable) {
            animatable.setTexture("goat_brown_light");
         }

         if (Math.random() < 0.5 && entity instanceof SmallMaleGoatEntity animatable) {
            animatable.setTexture("goat_brown_spotted");
         }

         if (Math.random() < 0.5 && entity instanceof SmallMaleGoatEntity animatable) {
            animatable.setTexture("goat_gray");
         }

         if (Math.random() < 0.5 && entity instanceof SmallMaleGoatEntity animatable) {
            animatable.setTexture("goat_gray_spotted");
         }

         if (Math.random() < 0.5 && entity instanceof SmallMaleGoatEntity animatable) {
            animatable.setTexture("goat_white");
         }
      }
   }
}
