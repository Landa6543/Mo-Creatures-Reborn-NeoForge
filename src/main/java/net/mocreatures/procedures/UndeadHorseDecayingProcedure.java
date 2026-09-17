package net.mocreatures.procedures;

import javax.annotation.Nullable;
import net.minecraft.world.entity.Entity;
import net.mocreatures.entity.HorseEntity;
import net.neoforged.bus.api.Event;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.tick.EntityTickEvent.Pre;

@EventBusSubscriber
public class UndeadHorseDecayingProcedure {
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
            && (
               (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 107
                  || (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 111
                  || (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 113
            )
            && entity instanceof HorseEntity _datEntL4
            && (Boolean)_datEntL4.getEntityData().get(HorseEntity.DATA_Decaying)) {
            if (entity instanceof HorseEntity _datEntSetI) {
               _datEntSetI.getEntityData()
                  .set(
                     HorseEntity.DATA_DecayingTimer,
                     (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_DecayingTimer) : 0) + 1
                  );
            }

            if ((entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_DecayingTimer) : 0) == 6000
               && entity instanceof HorseEntity _datEntSetI) {
               _datEntSetI.getEntityData().set(HorseEntity.DATA_DecayedStage, 2);
            }

            if ((entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_DecayingTimer) : 0) == 12000
               && entity instanceof HorseEntity _datEntSetI) {
               _datEntSetI.getEntityData().set(HorseEntity.DATA_DecayedStage, 3);
            }

            if ((entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_DecayingTimer) : 0) == 18000
               && entity instanceof HorseEntity _datEntSetI) {
               _datEntSetI.getEntityData().set(HorseEntity.DATA_DecayedStage, 4);
            }

            if ((entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_DecayingTimer) : 0) == 24000) {
               if (entity instanceof HorseEntity _datEntSetI) {
                  _datEntSetI.getEntityData().set(HorseEntity.DATA_DecayingTimer, 0);
               }

               if (entity instanceof HorseEntity _datEntSetI) {
                  _datEntSetI.getEntityData().set(HorseEntity.DATA_DecayedStage, 0);
               }

               if ((entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 107
                  && entity instanceof HorseEntity _datEntSetI) {
                  _datEntSetI.getEntityData().set(HorseEntity.DATA_Variant, 110);
               }

               if ((entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 111
                  && entity instanceof HorseEntity _datEntSetI) {
                  _datEntSetI.getEntityData().set(HorseEntity.DATA_Variant, 112);
               }

               if ((entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 113
                  && entity instanceof HorseEntity _datEntSetI) {
                  _datEntSetI.getEntityData().set(HorseEntity.DATA_Variant, 114);
               }
            }
         }
      }
   }
}
