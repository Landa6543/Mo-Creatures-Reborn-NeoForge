package net.mocreatures.procedures;

import javax.annotation.Nullable;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.mocreatures.entity.DarkManticoreEntity;
import net.mocreatures.entity.FireManticoreEntity;
import net.mocreatures.entity.FrostManticoreEntity;
import net.mocreatures.entity.HorseEntity;
import net.mocreatures.entity.LeogerEntity;
import net.mocreatures.entity.LiardEntity;
import net.mocreatures.entity.LigerEntity;
import net.mocreatures.entity.LionEntity;
import net.mocreatures.entity.LitherEntity;
import net.mocreatures.entity.ManticoreEntity;
import net.mocreatures.entity.NetherOstrichEntity;
import net.mocreatures.entity.PanthardEntity;
import net.mocreatures.entity.PantherEntity;
import net.mocreatures.entity.PanthgerEntity;
import net.mocreatures.entity.TigerEntity;
import net.mocreatures.entity.ToxicManticoreEntity;
import net.mocreatures.entity.WyvernEntity;
import net.mocreatures.entity.WyvernOstrichEntity;
import net.neoforged.bus.api.Event;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.tick.PlayerTickEvent.Post;

@EventBusSubscriber
public class NoFallDamageWhileRidingProcedure {
   @SubscribeEvent
   public static void onPlayerTick(Post event) {
      execute(event, event.getEntity());
   }

   public static void execute(Entity entity) {
      execute(null, entity);
   }

   private static void execute(@Nullable Event event, Entity entity) {
      if (entity != null) {
         if (!(entity.getVehicle() instanceof NetherOstrichEntity)
            && !(entity.getVehicle() instanceof DarkManticoreEntity)
            && !(entity.getVehicle() instanceof WyvernEntity)
            && !(entity.getVehicle() instanceof WyvernOstrichEntity)
            && (
               !(entity.getVehicle() instanceof LionEntity)
                  || !(entity.getVehicle() instanceof LionEntity _datEntL11 && (Boolean)_datEntL11.getEntityData().get(LionEntity.DATA_Wings))
            )
            && (
               !(entity.getVehicle() instanceof TigerEntity)
                  || !(entity.getVehicle() instanceof TigerEntity _datEntL15 && (Boolean)_datEntL15.getEntityData().get(TigerEntity.DATA_Wings))
            )
            && (
               !(entity.getVehicle() instanceof PantherEntity)
                  || !(entity.getVehicle() instanceof PantherEntity _datEntL19 && (Boolean)_datEntL19.getEntityData().get(PantherEntity.DATA_Wings))
            )
            && (
               !(entity.getVehicle() instanceof PanthgerEntity)
                  || !(entity.getVehicle() instanceof PanthgerEntity _datEntL23 && (Boolean)_datEntL23.getEntityData().get(PanthgerEntity.DATA_Wings))
            )
            && (
               !(entity.getVehicle() instanceof LitherEntity)
                  || !(entity.getVehicle() instanceof LitherEntity _datEntL27 && (Boolean)_datEntL27.getEntityData().get(LitherEntity.DATA_Wings))
            )
            && (
               !(entity.getVehicle() instanceof PanthardEntity)
                  || !(entity.getVehicle() instanceof PanthardEntity _datEntL31 && (Boolean)_datEntL31.getEntityData().get(PanthardEntity.DATA_Wings))
            )
            && (
               !(entity.getVehicle() instanceof LeogerEntity)
                  || !(entity.getVehicle() instanceof LeogerEntity _datEntL35 && (Boolean)_datEntL35.getEntityData().get(LeogerEntity.DATA_Wings))
            )
            && (
               !(entity.getVehicle() instanceof LiardEntity)
                  || !(entity.getVehicle() instanceof LiardEntity _datEntL39 && (Boolean)_datEntL39.getEntityData().get(LiardEntity.DATA_Wings))
            )
            && (
               !(entity.getVehicle() instanceof LigerEntity)
                  || !(entity.getVehicle() instanceof LigerEntity _datEntL43 && (Boolean)_datEntL43.getEntityData().get(LigerEntity.DATA_Wings))
            )
            && !(entity.getVehicle() instanceof FireManticoreEntity)
            && !(entity.getVehicle() instanceof FrostManticoreEntity)
            && !(entity.getVehicle() instanceof ManticoreEntity)
            && !(entity.getVehicle() instanceof ToxicManticoreEntity)
            && (
               !(entity.getVehicle() instanceof HorseEntity)
                  || !(entity.getVehicle() instanceof HorseEntity _datEntL55 && (Boolean)_datEntL55.getEntityData().get(HorseEntity.DATA_Winged))
            )) {
            if ((
                     entity instanceof LivingEntity _livingEntity57 && _livingEntity57.getAttributes().hasAttribute(Attributes.FALL_DAMAGE_MULTIPLIER)
                        ? _livingEntity57.getAttribute(Attributes.FALL_DAMAGE_MULTIPLIER).getBaseValue()
                        : 0.0
                  )
                  == -200.0
               && entity instanceof LivingEntity _livingEntity58
               && _livingEntity58.getAttributes().hasAttribute(Attributes.FALL_DAMAGE_MULTIPLIER)) {
               _livingEntity58.getAttribute(Attributes.FALL_DAMAGE_MULTIPLIER).setBaseValue(1.0);
            }
         } else if (entity instanceof LivingEntity _livingEntity56 && _livingEntity56.getAttributes().hasAttribute(Attributes.FALL_DAMAGE_MULTIPLIER)) {
            _livingEntity56.getAttribute(Attributes.FALL_DAMAGE_MULTIPLIER).setBaseValue(-200.0);
         }
      }
   }
}
