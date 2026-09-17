package net.mocreatures.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.mocreatures.entity.WyvernEntity;
import virtuoel.pehkui.api.ScaleOperations;
import virtuoel.pehkui.api.ScaleTypes;

public class WyvernBabyProcedure {
   public static void execute(Entity var0) {
      if (var0 != null) {
         boolean var1;
         if (var0 instanceof WyvernEntity var2 && (Boolean)var2.getEntityData().get(WyvernEntity.DATA_Boss)) {
            var1 = true;
         } else {
            var1 = false;
         }

         if (!var1) {
            if (var0 instanceof WyvernEntity var13 && (Boolean)var13.getEntityData().get(WyvernEntity.DATA_Baby)) {
               var1 = true;
            } else {
               var1 = false;
            }

            if (var1) {
               ScaleTypes.HEIGHT
                  .getScaleData(var0)
                  .setTargetScale((float)ScaleOperations.SET.applyAsDouble(ScaleTypes.HEIGHT.getScaleData(var0).getTargetScale(), 0.5));
               ScaleTypes.WIDTH
                  .getScaleData(var0)
                  .setTargetScale((float)ScaleOperations.SET.applyAsDouble(ScaleTypes.WIDTH.getScaleData(var0).getTargetScale(), 0.5));
            }

            if ((var0 instanceof WyvernEntity var14 ? (Integer)var14.getEntityData().get(WyvernEntity.DATA_WyvernVariant) : 0) != 9) {
               if (var0 instanceof WyvernEntity var3 && (Boolean)var3.getEntityData().get(WyvernEntity.DATA_Baby)) {
                  var1 = true;
               } else {
                  var1 = false;
               }

               if (!var1 && var0 instanceof TamableAnimal var37 && var37.isTame()) {
                  ScaleTypes.HEIGHT
                     .getScaleData(var0)
                     .setTargetScale((float)ScaleOperations.SET.applyAsDouble(ScaleTypes.HEIGHT.getScaleData(var0).getTargetScale(), 1.2));
                  ScaleTypes.WIDTH
                     .getScaleData(var0)
                     .setTargetScale((float)ScaleOperations.SET.applyAsDouble(ScaleTypes.WIDTH.getScaleData(var0).getTargetScale(), 1.2));
               }
            }

            if (var0.isVehicle()) {
               if (var0 instanceof LivingEntity var38 && var38.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED)) {
                  var38.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(0.35);
               }
            } else if (var0 instanceof LivingEntity var15 && var15.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED)) {
               var15.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(0.25);
            }

            FlightBoostProcedure.apply(var0);
            if ((var0 instanceof WyvernEntity var16 ? (Integer)var16.getEntityData().get(WyvernEntity.DATA_WyvernVariant) : 0) == 9) {
               ScaleTypes.HEIGHT
                  .getScaleData(var0)
                  .setTargetScale((float)ScaleOperations.SET.applyAsDouble(ScaleTypes.HEIGHT.getScaleData(var0).getTargetScale(), 1.4));
               ScaleTypes.WIDTH
                  .getScaleData(var0)
                  .setTargetScale((float)ScaleOperations.SET.applyAsDouble(ScaleTypes.WIDTH.getScaleData(var0).getTargetScale(), 1.4));
            }

            if ((var0 instanceof WyvernEntity var17 ? (Integer)var17.getEntityData().get(WyvernEntity.DATA_WyvernVariant) : 0) == 10) {
               ScaleTypes.HEIGHT
                  .getScaleData(var0)
                  .setTargetScale((float)ScaleOperations.SET.applyAsDouble(ScaleTypes.HEIGHT.getScaleData(var0).getTargetScale(), 1.4));
               ScaleTypes.WIDTH
                  .getScaleData(var0)
                  .setTargetScale((float)ScaleOperations.SET.applyAsDouble(ScaleTypes.WIDTH.getScaleData(var0).getTargetScale(), 1.4));
            }

            if ((var0 instanceof WyvernEntity var18 ? (Integer)var18.getEntityData().get(WyvernEntity.DATA_WyvernVariant) : 0) == 11) {
               ScaleTypes.HEIGHT
                  .getScaleData(var0)
                  .setTargetScale((float)ScaleOperations.SET.applyAsDouble(ScaleTypes.HEIGHT.getScaleData(var0).getTargetScale(), 1.4));
               ScaleTypes.WIDTH
                  .getScaleData(var0)
                  .setTargetScale((float)ScaleOperations.SET.applyAsDouble(ScaleTypes.WIDTH.getScaleData(var0).getTargetScale(), 1.4));
            }

            if ((var0 instanceof WyvernEntity var19 ? (Integer)var19.getEntityData().get(WyvernEntity.DATA_WyvernVariant) : 0) == 12) {
               ScaleTypes.HEIGHT
                  .getScaleData(var0)
                  .setTargetScale((float)ScaleOperations.SET.applyAsDouble(ScaleTypes.HEIGHT.getScaleData(var0).getTargetScale(), 1.4));
               ScaleTypes.WIDTH
                  .getScaleData(var0)
                  .setTargetScale((float)ScaleOperations.SET.applyAsDouble(ScaleTypes.WIDTH.getScaleData(var0).getTargetScale(), 1.4));
            }

            if (var0 instanceof WyvernEntity var20 && (Boolean)var20.getEntityData().get(WyvernEntity.DATA_Diamond_Armor)) {
               var1 = true;
            } else {
               var1 = false;
            }

            if (var1) {
               if (var0 instanceof LivingEntity var21 && var21.getAttributes().hasAttribute(Attributes.ARMOR)) {
                  var21.getAttribute(Attributes.ARMOR).setBaseValue(25.0);
               }

               if (var0 instanceof LivingEntity var22 && var22.getAttributes().hasAttribute(Attributes.ARMOR_TOUGHNESS)) {
                  var22.getAttribute(Attributes.ARMOR_TOUGHNESS).setBaseValue(2.0);
               }
            }

            if (var0 instanceof WyvernEntity var23 && (Boolean)var23.getEntityData().get(WyvernEntity.DATA_Golden_Armor)) {
               var1 = true;
            } else {
               var1 = false;
            }

            if (var1 && var0 instanceof LivingEntity var24 && var24.getAttributes().hasAttribute(Attributes.ARMOR)) {
               var24.getAttribute(Attributes.ARMOR).setBaseValue(21.0);
            }

            if (var0 instanceof WyvernEntity var25 && (Boolean)var25.getEntityData().get(WyvernEntity.DATA_Iron_Armor)) {
               var1 = true;
            } else {
               var1 = false;
            }

            if (var1 && var0 instanceof LivingEntity var26 && var26.getAttributes().hasAttribute(Attributes.ARMOR)) {
               var26.getAttribute(Attributes.ARMOR).setBaseValue(19.0);
            }

            if (var0 instanceof WyvernEntity var27 && (Boolean)var27.getEntityData().get(WyvernEntity.DATA_Diamond_Armor)) {
               var1 = true;
            } else {
               var1 = false;
            }

            if (!var1) {
               if (var0 instanceof WyvernEntity var28 && (Boolean)var28.getEntityData().get(WyvernEntity.DATA_Golden_Armor)) {
                  var1 = true;
               } else {
                  var1 = false;
               }

               if (!var1) {
                  if (var0 instanceof WyvernEntity var29 && (Boolean)var29.getEntityData().get(WyvernEntity.DATA_Iron_Armor)) {
                     var1 = true;
                  } else {
                     var1 = false;
                  }

                  if (!var1) {
                     if (var0 instanceof LivingEntity var30 && var30.getAttributes().hasAttribute(Attributes.ARMOR)) {
                        var30.getAttribute(Attributes.ARMOR).setBaseValue(14.0);
                     }

                     if (var0 instanceof LivingEntity var31 && var31.getAttributes().hasAttribute(Attributes.ARMOR_TOUGHNESS)) {
                        var31.getAttribute(Attributes.ARMOR_TOUGHNESS).setBaseValue(0.0);
                     }
                  }
               }
            }
         }

         if (var0 instanceof WyvernEntity var32 && (Boolean)var32.getEntityData().get(WyvernEntity.DATA_Boss)) {
            var1 = true;
         } else {
            var1 = false;
         }

         if (var1) {
            ScaleTypes.HEIGHT
               .getScaleData(var0)
               .setTargetScale((float)ScaleOperations.SET.applyAsDouble(ScaleTypes.HEIGHT.getScaleData(var0).getTargetScale(), 1.8));
            ScaleTypes.WIDTH
               .getScaleData(var0)
               .setTargetScale((float)ScaleOperations.SET.applyAsDouble(ScaleTypes.WIDTH.getScaleData(var0).getTargetScale(), 1.8));
            if (var0 instanceof LivingEntity var33 && var33.getAttributes().hasAttribute(Attributes.ARMOR)) {
               var33.getAttribute(Attributes.ARMOR).setBaseValue(20.0);
            }

            if (var0 instanceof LivingEntity var34 && var34.getAttributes().hasAttribute(Attributes.ARMOR_TOUGHNESS)) {
               var34.getAttribute(Attributes.ARMOR_TOUGHNESS).setBaseValue(2.0);
            }

            if (var0 instanceof LivingEntity var35 && var35.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE)) {
               var35.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue(13.0);
            }

            if (var0 instanceof LivingEntity var36 && var36.getAttributes().hasAttribute(Attributes.MAX_HEALTH)) {
               var36.getAttribute(Attributes.MAX_HEALTH).setBaseValue(120.0);
            }
         }
      }
   }
}
