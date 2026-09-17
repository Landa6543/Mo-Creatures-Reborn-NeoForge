package net.mocreatures.procedures;

import net.minecraft.world.entity.Entity;
import net.mocreatures.entity.TurtleEntity;

public class TurtleOnEntityTickUpdateProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         if (entity.getDisplayName().getString().equals("Leonardo") && entity instanceof TurtleEntity _datEntSetL) {
            _datEntSetL.getEntityData().set(TurtleEntity.DATA_Leonardo, true);
         }

         if (entity.getDisplayName().getString().equals("Donatello") && entity instanceof TurtleEntity _datEntSetL) {
            _datEntSetL.getEntityData().set(TurtleEntity.DATA_Donatello, true);
         }

         if (entity.getDisplayName().getString().equals("Raphael") && entity instanceof TurtleEntity _datEntSetL) {
            _datEntSetL.getEntityData().set(TurtleEntity.DATA_Raphael, true);
         }

         if (entity.getDisplayName().getString().equals("Michelangelo") && entity instanceof TurtleEntity _datEntSetL) {
            _datEntSetL.getEntityData().set(TurtleEntity.DATA_Michelangelo, true);
         }
      }
   }
}
