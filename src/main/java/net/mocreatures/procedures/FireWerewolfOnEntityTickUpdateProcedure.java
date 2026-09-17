package net.mocreatures.procedures;

import java.util.Comparator;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.mocreatures.entity.FireWerewolfEntity;
import net.mocreatures.entity.HumanWerewolfEntity;
import net.mocreatures.init.MocreaturesModEntities;

public class FireWerewolfOnEntityTickUpdateProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
      if (entity != null) {
         if (entity instanceof FireWerewolfEntity _datEntSetI) {
            _datEntSetI.getEntityData()
               .set(
                  FireWerewolfEntity.DATA_TextureTimer,
                  (entity instanceof FireWerewolfEntity _datEntI ? (Integer)_datEntI.getEntityData().get(FireWerewolfEntity.DATA_TextureTimer) : 0) + 1
               );
         }

         if ((entity instanceof FireWerewolfEntity _datEntI ? (Integer)_datEntI.getEntityData().get(FireWerewolfEntity.DATA_TextureTimer) : 0) == 5
            && entity instanceof FireWerewolfEntity animatable) {
            animatable.setTexture("werewolf_fire1");
         }

         if ((entity instanceof FireWerewolfEntity _datEntI ? (Integer)_datEntI.getEntityData().get(FireWerewolfEntity.DATA_TextureTimer) : 0) == 10
            && entity instanceof FireWerewolfEntity animatable) {
            animatable.setTexture("werewolf_fire2");
         }

         if ((entity instanceof FireWerewolfEntity _datEntI ? (Integer)_datEntI.getEntityData().get(FireWerewolfEntity.DATA_TextureTimer) : 0) == 15
            && entity instanceof FireWerewolfEntity animatable) {
            animatable.setTexture("werewolf_fire3");
         }

         if ((entity instanceof FireWerewolfEntity _datEntI ? (Integer)_datEntI.getEntityData().get(FireWerewolfEntity.DATA_TextureTimer) : 0) == 16
            && entity instanceof FireWerewolfEntity _datEntSetI) {
            _datEntSetI.getEntityData().set(FireWerewolfEntity.DATA_TextureTimer, 0);
         }

         if (world instanceof Level _lvl10 && _lvl10.isDay()) {
            entity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.GENERIC)), 1.0F);
            if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1.0F) == 2.0F) {
               if (!entity.level().isClientSide()) {
                  entity.discard();
               }

               if (world instanceof ServerLevel _level) {
                  Entity entityToSpawn = (MocreaturesModEntities.HUMAN_WEREWOLF.get())
                     .spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.setDeltaMovement(0.0, 0.0, 0.0);
                  }
               }

               Entity var23 = world.getEntitiesOfClass(HumanWerewolfEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var23 instanceof HumanWerewolfEntity animatable) {
                  animatable.setTexture("werehuman_woman");
               }
            }
         }
      }
   }
}
