package net.mocreatures.procedures;

import java.util.Comparator;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.mocreatures.MocreaturesMod;
import net.mocreatures.entity.PorcupineEntity;

public class PorcupineEntityDiesProcedure {
   public static void execute(LevelAccessor var0, double var1, double var3, double var5) {
      MocreaturesMod.queueServerWork(
         6,
         () -> {
            PorcupineEntity var7 = var0.getEntitiesOfClass(PorcupineEntity.class, AABB.ofSize(new Vec3(var1, var3, var5), 10.0, 10.0, 10.0))
               .stream()
               .filter(Entity::isAlive)
               .min(Comparator.comparingDouble(var6 -> var6.distanceToSqr(var1, var3, var5)))
               .orElse(null);
            if (var7 != null) {
               var7.setAnimation("frightened");
            }
         }
      );
   }
}
