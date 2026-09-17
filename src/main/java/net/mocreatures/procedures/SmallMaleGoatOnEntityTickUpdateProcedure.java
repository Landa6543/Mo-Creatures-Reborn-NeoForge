package net.mocreatures.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.mocreatures.MocreaturesMod;
import net.mocreatures.entity.SmallMaleGoatEntity;

public class SmallMaleGoatOnEntityTickUpdateProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
      if (entity != null) {
         if (entity instanceof SmallMaleGoatEntity _datEntSetI) {
            _datEntSetI.getEntityData()
               .set(
                  SmallMaleGoatEntity.DATA_Tail_Wag,
                  (entity instanceof SmallMaleGoatEntity _datEntI ? (Integer)_datEntI.getEntityData().get(SmallMaleGoatEntity.DATA_Tail_Wag) : 0) + 1
               );
         }

         if ((entity instanceof SmallMaleGoatEntity _datEntI ? (Integer)_datEntI.getEntityData().get(SmallMaleGoatEntity.DATA_Tail_Wag) : 0) >= 100) {
            if (entity instanceof SmallMaleGoatEntity _datEntSetI) {
               _datEntSetI.getEntityData().set(SmallMaleGoatEntity.DATA_Tail_Wag, 0);
            }

            if (entity instanceof SmallMaleGoatEntity) {
               ((SmallMaleGoatEntity)entity).setAnimation("wag");
            }
         }

         if (entity instanceof SmallMaleGoatEntity _datEntSetI) {
            _datEntSetI.getEntityData()
               .set(
                  SmallMaleGoatEntity.DATA_Bleat,
                  (entity instanceof SmallMaleGoatEntity _datEntI ? (Integer)_datEntI.getEntityData().get(SmallMaleGoatEntity.DATA_Bleat) : 0) + 1
               );
         }

         if ((entity instanceof SmallMaleGoatEntity _datEntI ? (Integer)_datEntI.getEntityData().get(SmallMaleGoatEntity.DATA_Bleat) : 0) >= 150) {
            if (entity instanceof SmallMaleGoatEntity _datEntSetI) {
               _datEntSetI.getEntityData().set(SmallMaleGoatEntity.DATA_Bleat, 0);
            }

            if (entity instanceof SmallMaleGoatEntity) {
               ((SmallMaleGoatEntity)entity).setAnimation("bleat");
            }

            if (world instanceof Level _level) {
               if (!_level.isClientSide()) {
                  _level.playSound(
                     null,
                     BlockPos.containing(x, y, z),
                     (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("mocreatures:goat_ambient")),
                     SoundSource.NEUTRAL,
                     1.0F,
                     1.0F
                  );
               } else {
                  _level.playLocalSound(
                     x,
                     y,
                     z,
                     (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("mocreatures:goat_ambient")),
                     SoundSource.NEUTRAL,
                     1.0F,
                     1.0F,
                     false
                  );
               }
            }

            MocreaturesMod.queueServerWork(20, () -> {
               if (entity instanceof SmallMaleGoatEntity) {
                  ((SmallMaleGoatEntity)entity).setAnimation("empty");
               }
            });
         }

         if (entity instanceof SmallMaleGoatEntity _datEntSetI) {
            _datEntSetI.getEntityData()
               .set(
                  SmallMaleGoatEntity.DATA_Ear_Wag,
                  (entity instanceof SmallMaleGoatEntity _datEntI ? (Integer)_datEntI.getEntityData().get(SmallMaleGoatEntity.DATA_Ear_Wag) : 0) + 1
               );
         }

         if ((entity instanceof SmallMaleGoatEntity _datEntI ? (Integer)_datEntI.getEntityData().get(SmallMaleGoatEntity.DATA_Ear_Wag) : 0) >= 250) {
            if (entity instanceof SmallMaleGoatEntity _datEntSetI) {
               _datEntSetI.getEntityData().set(SmallMaleGoatEntity.DATA_Ear_Wag, 0);
            }

            if (entity instanceof SmallMaleGoatEntity) {
               ((SmallMaleGoatEntity)entity).setAnimation("earswag");
            }
         }
      }
   }
}
