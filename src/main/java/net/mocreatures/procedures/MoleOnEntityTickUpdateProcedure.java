package net.mocreatures.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;
import net.mocreatures.entity.MoleEntity;
import net.mocreatures.init.MocreaturesModParticleTypes;
import virtuoel.pehkui.api.ScaleOperations;
import virtuoel.pehkui.api.ScaleTypes;

public class MoleOnEntityTickUpdateProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
      if (entity != null) {
         if (world.getBlockState(BlockPos.containing(x, entity.getY() - 1.0, z)).is(BlockTags.create(ResourceLocation.parse("minecraft:dirt")))) {
            if (entity instanceof MoleEntity) {
               ((MoleEntity)entity).setAnimation("burrow");
            }

            if (world instanceof ServerLevel _level) {
               _level.sendParticles((SimpleParticleType)MocreaturesModParticleTypes.DIGGING.get(), x, y, z, 5, 0.0, 0.0, 0.0, 0.05);
            }

            if (entity instanceof MoleEntity _datEntSetI) {
               _datEntSetI.getEntityData()
                  .set(
                     MoleEntity.DATA_BurrowTime,
                     (entity instanceof MoleEntity _datEntI ? (Integer)_datEntI.getEntityData().get(MoleEntity.DATA_BurrowTime) : 0) + 1
                  );
            }

            if ((entity instanceof MoleEntity _datEntI ? (Integer)_datEntI.getEntityData().get(MoleEntity.DATA_BurrowTime) : 0) >= 40) {
               if (entity instanceof MoleEntity) {
                  ((MoleEntity)entity).setAnimation("burrowed");
               }

               ScaleTypes.HITBOX_WIDTH
                  .getScaleData(entity)
                  .setTargetScale((float)ScaleOperations.SET.applyAsDouble(ScaleTypes.HITBOX_WIDTH.getScaleData(entity).getTargetScale(), 0.1));
               ScaleTypes.HITBOX_HEIGHT
                  .getScaleData(entity)
                  .setTargetScale((float)ScaleOperations.SET.applyAsDouble(ScaleTypes.HITBOX_HEIGHT.getScaleData(entity).getTargetScale(), 0.1));
            }
         }

         if (!world.getBlockState(BlockPos.containing(x, entity.getY() - 1.0, z)).is(BlockTags.create(ResourceLocation.parse("minecraft:dirt")))) {
            if (entity instanceof MoleEntity) {
               ((MoleEntity)entity).setAnimation("empty");
            }

            if (entity instanceof MoleEntity _datEntSetI) {
               _datEntSetI.getEntityData().set(MoleEntity.DATA_BurrowTime, 0);
            }

            ScaleTypes.HITBOX_WIDTH
               .getScaleData(entity)
               .setTargetScale((float)ScaleOperations.SET.applyAsDouble(ScaleTypes.HITBOX_WIDTH.getScaleData(entity).getTargetScale(), 1.0));
            ScaleTypes.HITBOX_HEIGHT
               .getScaleData(entity)
               .setTargetScale((float)ScaleOperations.SET.applyAsDouble(ScaleTypes.HITBOX_HEIGHT.getScaleData(entity).getTargetScale(), 1.0));
         }
      }
   }
}
