package net.mocreatures.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;
import net.mocreatures.MocreaturesMod;
import net.mocreatures.entity.KomodoDragonEntity;

public class KomodoDragonEntityIsHurtProcedure {
   public static void execute(LevelAccessor world, Entity entity) {
      if (entity != null) {
         if (entity instanceof KomodoDragonEntity) {
            ((KomodoDragonEntity)entity).setAnimation("hurt");
         }

         MocreaturesMod.queueServerWork(20, () -> {
            if (entity instanceof KomodoDragonEntity) {
               ((KomodoDragonEntity)entity).setAnimation("empty");
            }
         });
      }
   }
}
