package net.mocreatures.procedures;

import javax.annotation.Nullable;
import net.minecraft.world.entity.Entity;
import net.mocreatures.entity.HorseEntity;
import net.neoforged.bus.api.Event;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.tick.EntityTickEvent.Pre;

@EventBusSubscriber
public class NightmareTextureCycleProcedure {
   @SubscribeEvent
   public static void onEntityTick(Pre event) {
      execute(event, event.getEntity());
   }

   public static void execute(Entity entity) {
      execute(null, entity);
   }

   private static void execute(@Nullable Event event, Entity entity) {
      if (entity != null) {
         if (entity instanceof HorseEntity
            && (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 102) {
            if (entity instanceof HorseEntity _datEntSetI) {
               _datEntSetI.getEntityData()
                  .set(
                     HorseEntity.DATA_NightmareTextureSwap,
                     (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_NightmareTextureSwap) : 0) + 1
                  );
            }

            if ((entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_NightmareTextureSwap) : 0) == 5
               && entity instanceof HorseEntity _datEntSetI) {
               _datEntSetI.getEntityData().set(HorseEntity.DATA_NightmareTextureFrame, 2);
            }

            if ((entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_NightmareTextureSwap) : 0) == 10
               && entity instanceof HorseEntity _datEntSetI) {
               _datEntSetI.getEntityData().set(HorseEntity.DATA_NightmareTextureFrame, 3);
            }

            if ((entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_NightmareTextureSwap) : 0) == 15
               && entity instanceof HorseEntity _datEntSetI) {
               _datEntSetI.getEntityData().set(HorseEntity.DATA_NightmareTextureFrame, 4);
            }

            if ((entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_NightmareTextureSwap) : 0) == 20
               && entity instanceof HorseEntity _datEntSetI) {
               _datEntSetI.getEntityData().set(HorseEntity.DATA_NightmareTextureFrame, 5);
            }

            if ((entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_NightmareTextureSwap) : 0) == 25) {
               if (entity instanceof HorseEntity _datEntSetI) {
                  _datEntSetI.getEntityData().set(HorseEntity.DATA_NightmareTextureFrame, 1);
               }

               if (entity instanceof HorseEntity _datEntSetI) {
                  _datEntSetI.getEntityData().set(HorseEntity.DATA_NightmareTextureSwap, 0);
               }
            }
         }
      }
   }
}
