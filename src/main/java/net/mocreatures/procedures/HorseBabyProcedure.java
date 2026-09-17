package net.mocreatures.procedures;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.mocreatures.entity.HorseEntity;
import virtuoel.pehkui.api.ScaleOperations;
import virtuoel.pehkui.api.ScaleTypes;

public class HorseBabyProcedure {
   public static void execute(Entity var0) {
      if (var0 != null) {
         boolean var1;
         if (var0 instanceof HorseEntity var2 && (Boolean)var2.getEntityData().get(HorseEntity.DATA_Baby)) {
            var1 = true;
         } else {
            var1 = false;
         }

         if (var1) {
            ScaleTypes.HEIGHT
               .getScaleData(var0)
               .setTargetScale((float)ScaleOperations.SET.applyAsDouble(ScaleTypes.HEIGHT.getScaleData(var0).getTargetScale(), 0.6));
            ScaleTypes.WIDTH
               .getScaleData(var0)
               .setTargetScale((float)ScaleOperations.SET.applyAsDouble(ScaleTypes.WIDTH.getScaleData(var0).getTargetScale(), 0.6));
         }

         if (var0 instanceof HorseEntity var15 && (Boolean)var15.getEntityData().get(HorseEntity.DATA_Baby)) {
            var1 = true;
         } else {
            var1 = false;
         }

         if (!var1) {
            ScaleTypes.HEIGHT
               .getScaleData(var0)
               .setTargetScale((float)ScaleOperations.SET.applyAsDouble(ScaleTypes.HEIGHT.getScaleData(var0).getTargetScale(), 1.0));
            ScaleTypes.WIDTH
               .getScaleData(var0)
               .setTargetScale((float)ScaleOperations.SET.applyAsDouble(ScaleTypes.WIDTH.getScaleData(var0).getTargetScale(), 1.0));
         }

         if (var0 instanceof HorseEntity var16 && (Boolean)var16.getEntityData().get(HorseEntity.DATA_MetalArmored)) {
            var1 = true;
         } else {
            var1 = false;
         }

         if (!var1) {
            if (var0 instanceof HorseEntity var17 && (Boolean)var17.getEntityData().get(HorseEntity.DATA_GoldenArmored)) {
               var1 = true;
            } else {
               var1 = false;
            }

            if (!var1) {
               if (var0 instanceof HorseEntity var18 && (Boolean)var18.getEntityData().get(HorseEntity.DATA_DiamondArmored)) {
                  var1 = true;
               } else {
                  var1 = false;
               }

               if (!var1) {
                  if (var0 instanceof HorseEntity var19 && (Boolean)var19.getEntityData().get(HorseEntity.DATA_CrystalineArmored)) {
                     var1 = true;
                  } else {
                     var1 = false;
                  }

                  if (!var1) {
                     if (var0 instanceof LivingEntity var20 && var20.getAttributes().hasAttribute(Attributes.ARMOR)) {
                        var20.getAttribute(Attributes.ARMOR).setBaseValue(0.0);
                     }

                     if (var0 instanceof LivingEntity var21 && var21.getAttributes().hasAttribute(Attributes.ARMOR_TOUGHNESS)) {
                        var21.getAttribute(Attributes.ARMOR_TOUGHNESS).setBaseValue(0.0);
                     }
                  }
               }
            }
         }

         if (var0 instanceof HorseEntity var22 && (Boolean)var22.getEntityData().get(HorseEntity.DATA_MetalArmored)) {
            var1 = true;
         } else {
            var1 = false;
         }

         if (var1) {
            if (var0 instanceof LivingEntity var23 && var23.getAttributes().hasAttribute(Attributes.ARMOR)) {
               var23.getAttribute(Attributes.ARMOR).setBaseValue(5.0);
            }

            if (var0 instanceof LivingEntity var24 && var24.getAttributes().hasAttribute(Attributes.ARMOR_TOUGHNESS)) {
               var24.getAttribute(Attributes.ARMOR_TOUGHNESS).setBaseValue(0.0);
            }
         }

         if (var0 instanceof HorseEntity var25 && (Boolean)var25.getEntityData().get(HorseEntity.DATA_GoldenArmored)) {
            var1 = true;
         } else {
            var1 = false;
         }

         if (var1) {
            if (var0 instanceof LivingEntity var26 && var26.getAttributes().hasAttribute(Attributes.ARMOR)) {
               var26.getAttribute(Attributes.ARMOR).setBaseValue(7.0);
            }

            if (var0 instanceof LivingEntity var27 && var27.getAttributes().hasAttribute(Attributes.ARMOR_TOUGHNESS)) {
               var27.getAttribute(Attributes.ARMOR_TOUGHNESS).setBaseValue(0.0);
            }
         }

         if (var0 instanceof HorseEntity var28 && (Boolean)var28.getEntityData().get(HorseEntity.DATA_DiamondArmored)) {
            var1 = true;
         } else {
            var1 = false;
         }

         if (var1) {
            if (var0 instanceof LivingEntity var29 && var29.getAttributes().hasAttribute(Attributes.ARMOR)) {
               var29.getAttribute(Attributes.ARMOR).setBaseValue(11.0);
            }

            if (var0 instanceof LivingEntity var30 && var30.getAttributes().hasAttribute(Attributes.ARMOR_TOUGHNESS)) {
               var30.getAttribute(Attributes.ARMOR_TOUGHNESS).setBaseValue(2.0);
            }
         }

         if (var0 instanceof HorseEntity var31 && (Boolean)var31.getEntityData().get(HorseEntity.DATA_Winged)) {
            var1 = true;
         } else {
            var1 = false;
         }

         if (var1) {
            if (var0 instanceof LivingEntity var3 && var3.getAttributes().hasAttribute(Attributes.FALL_DAMAGE_MULTIPLIER)) {
               var3.getAttribute(Attributes.FALL_DAMAGE_MULTIPLIER).setBaseValue(-200.0);
            }
         } else if (var0 instanceof LivingEntity var32 && var32.getAttributes().hasAttribute(Attributes.FALL_DAMAGE_MULTIPLIER)) {
            var32.getAttribute(Attributes.FALL_DAMAGE_MULTIPLIER).setBaseValue(1.0);
         }

         if ((var0 instanceof HorseEntity var33 ? (Integer)var33.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 102
            && var0 instanceof LivingEntity var36
            && !var36.level().isClientSide()) {
            var36.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 30, 1, false, false));
         }

         if (var0.isVehicle()) {
            if (var0 instanceof LivingEntity var37 && var37.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED)) {
               var37.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(0.2);
            }
         } else if (var0 instanceof LivingEntity var34 && var34.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED)) {
            var34.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(0.25);
         }

         int var35 = var0 instanceof HorseEntity var38 ? (Integer)var38.getEntityData().get(HorseEntity.DATA_Variant) : 0;
         boolean var39 = var0 instanceof HorseEntity var5 && (Boolean)var5.getEntityData().get(HorseEntity.DATA_Winged)
            || var35 == 105
            || var35 == 106
            || var35 == 111
            || var35 == 112
            || var35 == 116
            || var0 instanceof HorseEntity var4 && (Boolean)var4.getEntityData().get(HorseEntity.DATA_Fairy);
         if (var39 && var0 instanceof HorseEntity var40 && !(Boolean)var40.getEntityData().get(HorseEntity.DATA_Winged)) {
            var40.getEntityData().set(HorseEntity.DATA_Winged, true);
         }

         if (var39) {
            FlightBoostProcedure.apply(var0);
         }
      }
   }
}
