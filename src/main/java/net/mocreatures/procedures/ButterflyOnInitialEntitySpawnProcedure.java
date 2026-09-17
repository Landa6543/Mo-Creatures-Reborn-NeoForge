package net.mocreatures.procedures;

import net.minecraft.world.entity.Entity;
import net.mocreatures.entity.ButterflyEntity;

public class ButterflyOnInitialEntitySpawnProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         if (Math.random() < 0.5 && entity instanceof ButterflyEntity animatable) {
            animatable.setTexture("butterfly_argyreus_hyperbius");
         }

         if (Math.random() < 0.5 && entity instanceof ButterflyEntity animatable) {
            animatable.setTexture("butterfly_athyma_nefte");
         }

         if (Math.random() < 0.5 && entity instanceof ButterflyEntity animatable) {
            animatable.setTexture("butterfly_catopsilia_pomona");
         }

         if (Math.random() < 0.5 && entity instanceof ButterflyEntity animatable) {
            animatable.setTexture("butterfly_morpho_peleides");
         }

         if (Math.random() < 0.5 && entity instanceof ButterflyEntity animatable) {
            animatable.setTexture("butterfly_pieris_rapae");
         }

         if (Math.random() < 0.5 && entity instanceof ButterflyEntity animatable) {
            animatable.setTexture("butterfly_vanessa_atalanta");
         }

         if (Math.random() < 0.5 && entity instanceof ButterflyEntity animatable) {
            animatable.setTexture("butterfly_agalais_urticae");
         }
      }
   }
}
