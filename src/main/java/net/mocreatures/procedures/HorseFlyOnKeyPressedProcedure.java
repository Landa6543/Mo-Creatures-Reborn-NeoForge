package net.mocreatures.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.mocreatures.entity.HorseEntity;

public class HorseFlyOnKeyPressedProcedure {
   public static void execute(LevelAccessor var0, double var1, double var3, double var5, Entity var7) {
      if (var7 != null && var7.getVehicle() instanceof HorseEntity var8) {
         int var13 = (Integer)var8.getEntityData().get(HorseEntity.DATA_Variant);
         boolean var10 = (Boolean)var8.getEntityData().get(HorseEntity.DATA_Winged)
            || var13 == 105
            || var13 == 106
            || var13 == 111
            || var13 == 112
            || var13 == 116
            || (Boolean)var8.getEntityData().get(HorseEntity.DATA_Fairy);
         if (var10) {
            var8.getEntityData().set(HorseEntity.DATA_Winged, true);
            var8.getPersistentData().putDouble("VerticalMovement", 1.0);
            if (var0 instanceof Level var11) {
               SoundEvent var12 = (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("mocreatures:flap"));
               if (var12 != null) {
                  if (!var11.isClientSide()) {
                     var11.playSound(null, BlockPos.containing(var1, var3, var5), var12, SoundSource.NEUTRAL, 1.0F, 1.0F);
                  } else {
                     var11.playLocalSound(var1, var3, var5, var12, SoundSource.NEUTRAL, 1.0F, 1.0F, false);
                  }
               }
            }
         }
      }
   }
}
