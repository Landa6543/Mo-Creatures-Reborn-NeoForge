package net.mocreatures.procedures;

import java.lang.reflect.Field;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MoverType;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.phys.Vec3;
import net.mocreatures.entity.HorseEntity;

public class MoCFlightHelper {
   private static final Map<Class<?>, EntityDataAccessor<Boolean>> CAT_WINGS_ACCESSORS = new ConcurrentHashMap<>();
   private static final Field LIVING_JUMPING_FIELD;

   public static boolean isFlightCapable(LivingEntity var0) {
      if (var0 == null) {
         return false;
      }

      if (var0 instanceof HorseEntity var5) {
         try {
            if ((Boolean)var5.getEntityData().get(HorseEntity.DATA_Winged)) {
               return true;
            }

            int var6 = (Integer)var5.getEntityData().get(HorseEntity.DATA_Variant);
            if (var6 == 105 || var6 == 106 || var6 == 111 || var6 == 112 || var6 == 116) {
               return true;
            }

            if ((Boolean)var5.getEntityData().get(HorseEntity.DATA_Fairy)) {
               return true;
            }
         } catch (Throwable var4) {
         }

         return var0.getPersistentData().getBoolean("DataWinged");
      } else {
         String var1 = var0.getClass().getSimpleName();
         if (var1.equals("WyvernEntity") || var1.equals("WyvernOstrichEntity") || var1.equals("NetherOstrichEntity")) {
            return true;
         }

         if (var1.contains("Manticore")) {
            return true;
         }

         if (!var1.equals("LionEntity")
            && !var1.equals("TigerEntity")
            && !var1.equals("LeopardEntity")
            && !var1.equals("PantherEntity")
            && !var1.equals("LigerEntity")
            && !var1.equals("LeogerEntity")
            && !var1.equals("PanthardEntity")
            && !var1.equals("PanthgerEntity")
            && !var1.equals("LitherEntity")
            && !var1.equals("LiardEntity")) {
            return var0.getPersistentData().getDouble("VerticalMovement") != 0.0;
         }

         try {
            EntityDataAccessor var2 = CAT_WINGS_ACCESSORS.computeIfAbsent(var0.getClass(), var0x -> {
               try {
                  Field var1x = var0x.getField("DATA_Wings");
                  return (EntityDataAccessor<Boolean>)var1x.get(null);
               } catch (Throwable var2x) {
                  return null;
               }
            });
            if (var2 != null && (Boolean)var0.getEntityData().get(var2)) {
               return true;
            }
         } catch (Throwable var3) {
         }

         return var0.getPersistentData().getBoolean("DataWings");
      }
   }

   public static boolean isBoosting(LivingEntity var0) {
      if (var0 == null) {
         return false;
      } else if (var0.isSprinting()) {
         return true;
      } else {
         return var0.level().isClientSide() ? MoCClientHelper.isSprintDown() : false;
      }
   }

   public static boolean isJumpPressed(LivingEntity var0, double var1) {
      if (var1 == 1.0) {
         return true;
      }

      if (var0 != null) {
         if (var0.level().isClientSide() && MoCClientHelper.isJumpDown()) {
            return true;
         }

         if (LIVING_JUMPING_FIELD != null) {
            try {
               if ((Boolean)LIVING_JUMPING_FIELD.get(var0)) {
                  return true;
               }
            } catch (Throwable var4) {
            }
         }
      }

      return false;
   }

   public static boolean handleTravel(LivingEntity var0, Vec3 var1) {
      if (var0 != null && var0.isVehicle()) {
         if (!(var0.getFirstPassenger() instanceof LivingEntity var3)) {
            return false;
         } else {
            boolean var4 = isFlightCapable(var0);
            boolean var5 = isBoosting(var3);
            double var6 = var0.getPersistentData().getDouble("VerticalMovement");
            boolean var8 = var0.getPersistentData().getBoolean("MoC_IsFlying");
            boolean var9 = isJumpPressed(var3, var6);
            if (var4 && var9 && !var8) {
               var8 = true;
               var0.getPersistentData().putBoolean("MoC_IsFlying", true);
               var0.getPersistentData().putInt("MoC_TakeoffTicks", 10);
               var0.setOnGround(false);
               var0.hasImpulse = true;
               Vec3 var10 = var0.getDeltaMovement();
               var0.setDeltaMovement(new Vec3(var10.x, var5 ? 0.85 : 0.55, var10.z));
            }

            int var29 = var0.getPersistentData().getInt("MoC_TakeoffTicks");
            if (var29 > 0) {
               var0.getPersistentData().putInt("MoC_TakeoffTicks", var29 - 1);
            } else if (var0.onGround() && !var9) {
               var8 = false;
               var0.getPersistentData().putBoolean("MoC_IsFlying", false);
               var0.getPersistentData().putDouble("VerticalMovement", 0.0);
            }

            if (!var8) {
               float var30 = (float)var0.getAttributeValue(Attributes.MOVEMENT_SPEED);
               float var31 = Math.min(var30, 0.22F);
               var0.setSpeed(var31);
               return false;
            }

            if (!var0.level().isClientSide() && !var0.isControlledByLocalInstance()) {
               var0.resetFallDistance();
               return true;
            }

            var0.setYRot(var3.getYRot());
            var0.yRotO = var0.getYRot();
            var0.setXRot(var3.getXRot() * 0.5F);
            var0.xRotO = var0.getXRot();
            var0.yBodyRot = var3.getYRot();
            var0.yHeadRot = var3.getYRot();
            float var11 = var3.zza;
            float var12 = var3.xxa;
            double var13 = var5 ? 1.3 : 0.65;
            Vec3 var15 = var0.getDeltaMovement();
            double var16 = var15.x();
            double var18 = var15.y();
            double var20 = var15.z();
            if (var11 == 0.0F && var12 == 0.0F) {
               var16 *= 0.88;
               var20 *= 0.88;
            } else {
               float var22 = var3.getYRot();
               if (var11 < 0.0F) {
                  var22 += 180.0F;
               }

               if (var12 > 0.0F) {
                  var22 -= var11 == 0.0F ? 90.0F : (var11 > 0.0F ? 45.0F : -45.0F);
               } else if (var12 < 0.0F) {
                  var22 += var11 == 0.0F ? 90.0F : (var11 > 0.0F ? 45.0F : -45.0F);
               }

               double var23 = Math.toRadians(var22);
               double var25 = -Math.sin(var23) * var13;
               double var27 = Math.cos(var23) * var13;
               var16 += (var25 - var16) * 0.42;
               var20 += (var27 - var20) * 0.42;
            }

            if (var9) {
               var18 = var5 ? 0.8 : 0.48;
               var0.hasImpulse = true;
            } else if (var11 > 0.0F) {
               float var35 = var3.getXRot();
               if (var35 > 10.0F) {
                  double var37 = Math.sin(Math.toRadians(var35));
                  var18 = -var37 * (var5 ? 1.15 : 0.65);
               } else if (var35 < -12.0F) {
                  double var38 = -Math.sin(Math.toRadians(var35));
                  var18 = var38 * (var5 ? 0.85 : 0.5);
               } else {
                  var18 = Math.max(var18 * 0.8, -0.02);
               }
            } else if (var11 < 0.0F) {
               var18 = Math.max(var18 * 0.8, -0.06);
            } else {
               var18 = Math.max(var18 * 0.8, -0.15);
            }

            var0.setDeltaMovement(new Vec3(var16, var18, var20));
            var0.resetFallDistance();
            var0.move(MoverType.SELF, var0.getDeltaMovement());
            if (var29 <= 0 && var0.onGround() && !var9) {
               var0.getPersistentData().putBoolean("MoC_IsFlying", false);
               var0.getPersistentData().putDouble("VerticalMovement", 0.0);
            }

            double var36 = var0.getX() - var0.xo;
            double var24 = var0.getZ() - var0.zo;
            float var26 = (float)Math.sqrt(var36 * var36 + var24 * var24) * 4.0F;
            if (var26 > 1.0F) {
               var26 = 1.0F;
            }

            var0.walkAnimation.setSpeed(var0.walkAnimation.speed() + (var26 - var0.walkAnimation.speed()) * 0.4F);
            var0.walkAnimation.position(var0.walkAnimation.position() + var0.walkAnimation.speed());
            var0.calculateEntityAnimation(true);
            return true;
         }
      } else {
         return false;
      }
   }

   static {
      Field var0 = null;

      try {
         var0 = LivingEntity.class.getDeclaredField("jumping");
         var0.setAccessible(true);
      } catch (Throwable var7) {
         try {
            for (Field var5 : LivingEntity.class.getDeclaredFields()) {
               if (var5.getType() == boolean.class && var5.getName().equals("jumping")) {
                  var5.setAccessible(true);
                  var0 = var5;
                  break;
               }
            }
         } catch (Throwable var6) {
         }
      }

      LIVING_JUMPING_FIELD = var0;
   }
}
