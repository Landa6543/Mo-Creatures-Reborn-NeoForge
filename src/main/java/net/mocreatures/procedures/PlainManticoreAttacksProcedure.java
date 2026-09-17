package net.mocreatures.procedures;

import javax.annotation.Nullable;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.mocreatures.entity.ManticoreEntity;
import net.neoforged.bus.api.Event;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.living.LivingDamageEvent.Post;

@EventBusSubscriber
public class PlainManticoreAttacksProcedure {
   @SubscribeEvent
   public static void onEntityAttacked(Post event) {
      if (event.getEntity() != null) {
         execute(event, event.getEntity().level(), event.getEntity(), event.getSource().getEntity());
      }
   }

   public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
      execute(null, world, entity, sourceentity);
   }

   private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, Entity sourceentity) {
      if (entity != null && sourceentity != null) {
         if (entity instanceof Player && sourceentity instanceof ManticoreEntity) {
            if (sourceentity instanceof ManticoreEntity _datEntSetI) {
               _datEntSetI.getEntityData()
                  .set(
                     ManticoreEntity.DATA_StingCount,
                     (sourceentity instanceof ManticoreEntity _datEntI ? (Integer)_datEntI.getEntityData().get(ManticoreEntity.DATA_StingCount) : 0) + 1
                  );
            }

            if ((sourceentity instanceof ManticoreEntity _datEntI ? (Integer)_datEntI.getEntityData().get(ManticoreEntity.DATA_StingCount) : 0) >= 4) {
               if (sourceentity instanceof ManticoreEntity _datEntSetI) {
                  _datEntSetI.getEntityData().set(ManticoreEntity.DATA_StingCount, 0);
               }

               if (world instanceof Level _level) {
                  if (!_level.isClientSide()) {
                     _level.playSound(
                        null,
                        BlockPos.containing(sourceentity.getX(), sourceentity.getY(), sourceentity.getZ()),
                        (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("mocreatures:sting")),
                        SoundSource.NEUTRAL,
                        1.0F,
                        1.0F
                     );
                  } else {
                     _level.playLocalSound(
                        sourceentity.getX(),
                        sourceentity.getY(),
                        sourceentity.getZ(),
                        (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("mocreatures:sting")),
                        SoundSource.NEUTRAL,
                        1.0F,
                        1.0F,
                        false
                     );
                  }
               }

               if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide()) {
                  _entity.addEffect(new MobEffectInstance(MobEffects.POISON, 600, 1));
               }
            }
         }
      }
   }
}
