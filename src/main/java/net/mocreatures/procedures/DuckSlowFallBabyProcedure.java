package net.mocreatures.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.Vec3;
import net.mocreatures.init.MocreaturesModEntities;
import net.mocreatures.network.MocreaturesModVariables;

public class DuckSlowFallBabyProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
      if (entity != null) {
         entity.setDeltaMovement(
            new Vec3(
               entity instanceof Player _plr ? _plr.getAbilities().getWalkingSpeed() : 0.0,
               -0.1,
               entity instanceof Player _plr ? _plr.getAbilities().getWalkingSpeed() : 0.0
            )
         );
         MocreaturesModVariables.MapVariables.get(world).GrowUp++;
         MocreaturesModVariables.MapVariables.get(world).syncData(world);
         if (MocreaturesModVariables.MapVariables.get(world).GrowUp >= 24000.0) {
            if (world instanceof ServerLevel _level) {
               Entity entityToSpawn = (MocreaturesModEntities.DUCK.get()).spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
               if (entityToSpawn != null) {
               }
            }

            if (!entity.level().isClientSide()) {
               entity.discard();
            }
         }
      }
   }
}
