package net.mocreatures.procedures;

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
import net.mocreatures.entity.HumanWerewolfEntity;
import net.mocreatures.init.MocreaturesModEntities;

public class HumanWerewolfOnEntityTickUpdateProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
      if (entity != null) {
         if ((entity instanceof HumanWerewolfEntity animatable ? animatable.getTexture() : "null").equals("werehuman_classic")
            && entity instanceof HumanWerewolfEntity _datEntSetL) {
            _datEntSetL.getEntityData().set(HumanWerewolfEntity.DATA_Brown, true);
         }

         if ((entity instanceof HumanWerewolfEntity animatable ? animatable.getTexture() : "null").equals("werehuman_dude")
            && entity instanceof HumanWerewolfEntity _datEntSetL) {
            _datEntSetL.getEntityData().set(HumanWerewolfEntity.DATA_Black, true);
         }

         if ((entity instanceof HumanWerewolfEntity animatable ? animatable.getTexture() : "null").equals("werehuman_oldie")
            && entity instanceof HumanWerewolfEntity _datEntSetL) {
            _datEntSetL.getEntityData().set(HumanWerewolfEntity.DATA_White, true);
         }

         if ((entity instanceof HumanWerewolfEntity animatable ? animatable.getTexture() : "null").equals("werehuman_woman")
            && entity instanceof HumanWerewolfEntity _datEntSetL) {
            _datEntSetL.getEntityData().set(HumanWerewolfEntity.DATA_Fire, true);
         }

         if (!(world instanceof Level _lvl8 && _lvl8.isDay())
            && entity instanceof HumanWerewolfEntity _datEntL9
            && (Boolean)_datEntL9.getEntityData().get(HumanWerewolfEntity.DATA_Brown)) {
            entity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.GENERIC)), 1.0F);
            if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1.0F) == 2.0F) {
               if (!entity.level().isClientSide()) {
                  entity.discard();
               }

               if (world instanceof ServerLevel _level) {
                  Entity entityToSpawn = (MocreaturesModEntities.BROWN_WEREWOLF.get())
                     .spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.setDeltaMovement(0.0, 0.0, 0.0);
                  }
               }
            }
         }

         if (!(world instanceof Level _lvl15 && _lvl15.isDay())
            && entity instanceof HumanWerewolfEntity _datEntL16
            && (Boolean)_datEntL16.getEntityData().get(HumanWerewolfEntity.DATA_Black)) {
            entity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.GENERIC)), 1.0F);
            if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1.0F) == 2.0F) {
               if (!entity.level().isClientSide()) {
                  entity.discard();
               }

               if (world instanceof ServerLevel _level) {
                  Entity entityToSpawn = (MocreaturesModEntities.BLACK_WEREWOLF.get())
                     .spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.setDeltaMovement(0.0, 0.0, 0.0);
                  }
               }
            }
         }

         if (!(world instanceof Level _lvl22 && _lvl22.isDay())
            && entity instanceof HumanWerewolfEntity _datEntL23
            && (Boolean)_datEntL23.getEntityData().get(HumanWerewolfEntity.DATA_White)) {
            entity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.GENERIC)), 1.0F);
            if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1.0F) == 2.0F) {
               if (!entity.level().isClientSide()) {
                  entity.discard();
               }

               if (world instanceof ServerLevel _level) {
                  Entity entityToSpawn = (MocreaturesModEntities.WHITE_WEREWOLF.get())
                     .spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.setDeltaMovement(0.0, 0.0, 0.0);
                  }
               }
            }
         }

         if (!(world instanceof Level _lvl29 && _lvl29.isDay())
            && entity instanceof HumanWerewolfEntity _datEntL30
            && (Boolean)_datEntL30.getEntityData().get(HumanWerewolfEntity.DATA_Fire)) {
            entity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.GENERIC)), 1.0F);
            if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1.0F) == 2.0F) {
               if (!entity.level().isClientSide()) {
                  entity.discard();
               }

               if (world instanceof ServerLevel _level) {
                  Entity entityToSpawn = (MocreaturesModEntities.FIRE_WEREWOLF.get())
                     .spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
                  if (entityToSpawn != null) {
                     entityToSpawn.setDeltaMovement(0.0, 0.0, 0.0);
                  }
               }
            }
         }
      }
   }
}
