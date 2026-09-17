package net.mocreatures.procedures;

import javax.annotation.Nullable;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.mocreatures.MocreaturesMod;
import net.mocreatures.entity.HorseEntity;
import net.neoforged.bus.api.Event;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.tick.EntityTickEvent.Pre;

@EventBusSubscriber
public class NeighTimerProcedure {
   @SubscribeEvent
   public static void onEntityTick(Pre event) {
      execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
   }

   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
      execute(null, world, x, y, z, entity);
   }

   private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
      if (entity != null) {
         if (entity instanceof HorseEntity _datEntSetI) {
            _datEntSetI.getEntityData()
               .set(
                  HorseEntity.DATA_NeighCooldown,
                  (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_NeighCooldown) : 0) + 1
               );
         }

         if ((entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_NeighCooldown) : 0) == 150) {
            if ((
                  (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 107
                     || (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 110
                     || (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 111
                     || (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 112
                     || (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 113
                     || (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 114
               )
               && world instanceof Level _level) {
               if (!_level.isClientSide()) {
                  _level.playSound(
                     null,
                     BlockPos.containing(x, y, z),
                     (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("mocreatures:undead_horse_ambient")),
                     SoundSource.NEUTRAL,
                     1.0F,
                     1.0F
                  );
               } else {
                  _level.playLocalSound(
                     x,
                     y,
                     z,
                     (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("mocreatures:undead_horse_ambient")),
                     SoundSource.NEUTRAL,
                     1.0F,
                     1.0F,
                     false
                  );
               }
            }

            if ((entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) != 107
               && (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) != 110
               && (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) != 111
               && (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) != 112
               && (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) != 113
               && (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) != 114
               && (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) != 115
               && (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) != 116
               && world instanceof Level _level) {
               if (!_level.isClientSide()) {
                  _level.playSound(
                     null,
                     BlockPos.containing(x, y, z),
                     (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("mocreatures:horse_ambient")),
                     SoundSource.NEUTRAL,
                     1.0F,
                     1.0F
                  );
               } else {
                  _level.playLocalSound(
                     x,
                     y,
                     z,
                     (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("mocreatures:horse_ambient")),
                     SoundSource.NEUTRAL,
                     1.0F,
                     1.0F,
                     false
                  );
               }
            }

            if ((
                  (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 115
                     || (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 116
               )
               && world instanceof Level _level) {
               if (!_level.isClientSide()) {
                  _level.playSound(
                     null,
                     BlockPos.containing(x, y, z),
                     (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("mocreatures:ghost_horse_ambient")),
                     SoundSource.NEUTRAL,
                     1.0F,
                     1.0F
                  );
               } else {
                  _level.playLocalSound(
                     x,
                     y,
                     z,
                     (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("mocreatures:ghost_horse_ambient")),
                     SoundSource.NEUTRAL,
                     1.0F,
                     1.0F,
                     false
                  );
               }
            }

            if (entity instanceof HorseEntity _datEntSetL) {
               _datEntSetL.getEntityData().set(HorseEntity.DATA_Neigh, true);
            }

            if (entity instanceof HorseEntity _datEntSetI) {
               _datEntSetI.getEntityData().set(HorseEntity.DATA_NeighCooldown, 0);
            }

            MocreaturesMod.queueServerWork(40, () -> {
               if (entity instanceof HorseEntity _datEntSetL) {
                  _datEntSetL.getEntityData().set(HorseEntity.DATA_Neigh, false);
               }
            });
         }

         if (entity instanceof HorseEntity _datEntSetI) {
            _datEntSetI.getEntityData()
               .set(
                  HorseEntity.DATA_TailWagCooldown,
                  (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_TailWagCooldown) : 0) + 1
               );
         }

         if ((entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_TailWagCooldown) : 0) == 270) {
            if (entity instanceof HorseEntity _datEntSetL) {
               _datEntSetL.getEntityData().set(HorseEntity.DATA_TailWag, true);
            }

            if (entity instanceof HorseEntity _datEntSetI) {
               _datEntSetI.getEntityData().set(HorseEntity.DATA_TailWagCooldown, 0);
            }

            MocreaturesMod.queueServerWork(40, () -> {
               if (entity instanceof HorseEntity _datEntSetL) {
                  _datEntSetL.getEntityData().set(HorseEntity.DATA_TailWag, false);
               }
            });
         }
      }
   }
}
