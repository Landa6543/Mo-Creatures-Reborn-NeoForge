package net.mocreatures.procedures;

import net.minecraft.world.entity.Entity;
import net.mocreatures.entity.MothEntity;

public class MothOnInitialEntitySpawnProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         if (Math.random() < 0.5 && entity instanceof MothEntity animatable) {
            animatable.setTexture("moth_camptogramma_bilineata");
         }

         if (Math.random() < 0.5 && entity instanceof MothEntity animatable) {
            animatable.setTexture("moth_idia_aemula");
         }

         if (Math.random() < 0.5 && entity instanceof MothEntity animatable) {
            animatable.setTexture("moth_thyatira_batis");
         }
      }
   }
}
