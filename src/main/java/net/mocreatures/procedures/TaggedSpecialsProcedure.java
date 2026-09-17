package net.mocreatures.procedures;

import javax.annotation.Nullable;
import net.minecraft.world.entity.Entity;
import net.mocreatures.entity.HorseEntity;
import net.neoforged.bus.api.Event;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.tick.EntityTickEvent.Pre;

@EventBusSubscriber
public class TaggedSpecialsProcedure {
   @SubscribeEvent
   public static void onEntityTick(Pre event) {
      execute(event, event.getEntity());
   }

   public static void execute(Entity entity) {
      execute(null, entity);
   }

   private static void execute(@Nullable Event event, Entity entity) {
      if (entity != null) {
         if (entity instanceof HorseEntity) {
            if ((
                  (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 102
                     || (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 103
                     || (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 104
                     || (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 105
                     || (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 106
                     || (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 107
                     || (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 108
                     || (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 109
                     || (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 110
                     || (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 111
                     || (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 112
                     || (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 113
                     || (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 114
                     || (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 115
                     || (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 116
               )
               && entity instanceof HorseEntity _datEntSetL) {
               _datEntSetL.getEntityData().set(HorseEntity.DATA_Special, true);
            }

            if ((
                  (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 5
                     || (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 6
                     || (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 7
                     || (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 8
                     || (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 9
               )
               && entity instanceof HorseEntity _datEntSetL) {
               _datEntSetL.getEntityData().set(HorseEntity.DATA_Tier1, true);
            }

            if ((
                  (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 1
                     || (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 2
                     || (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 3
                     || (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 10
               )
               && entity instanceof HorseEntity _datEntSetL) {
               _datEntSetL.getEntityData().set(HorseEntity.DATA_Tier2, true);
            }

            if ((
                  (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 11
                     || (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 12
                     || (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 13
               )
               && entity instanceof HorseEntity _datEntSetL) {
               _datEntSetL.getEntityData().set(HorseEntity.DATA_Tier3, true);
            }

            if ((
                  (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 14
                     || (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 15
               )
               && entity instanceof HorseEntity _datEntSetL) {
               _datEntSetL.getEntityData().set(HorseEntity.DATA_Tier4, true);
            }

            if ((
                  (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 117
                     || (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 118
                     || (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 119
                     || (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 120
                     || (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 121
                     || (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 122
                     || (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 123
                     || (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 124
                     || (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 125
                     || (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 126
                     || (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 127
                     || (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 128
               )
               && entity instanceof HorseEntity _datEntSetL) {
               _datEntSetL.getEntityData().set(HorseEntity.DATA_Fairy, true);
            }

            if ((
                  (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 103
                     || (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 105
                     || (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 106
                     || (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 111
                     || (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 112
                     || (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 116
                     || entity instanceof HorseEntity _datEntL54 && (Boolean)_datEntL54.getEntityData().get(HorseEntity.DATA_Fairy)
               )
               && entity instanceof HorseEntity _datEntSetL) {
               _datEntSetL.getEntityData().set(HorseEntity.DATA_Winged, true);
            }
         }
      }
   }
}
