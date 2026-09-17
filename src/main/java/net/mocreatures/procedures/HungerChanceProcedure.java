package net.mocreatures.procedures;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;

public class HungerChanceProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         if (Math.random() < 0.3 && entity instanceof LivingEntity _entity && !_entity.level().isClientSide()) {
            _entity.addEffect(new MobEffectInstance(MobEffects.HUNGER, 1200, 1));
         }
      }
   }
}
