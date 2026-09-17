package net.mocreatures.procedures;

import javax.annotation.Nullable;
import net.minecraft.world.entity.Entity;
import net.mocreatures.entity.HorseEntity;
import net.neoforged.bus.api.Event;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.tick.EntityTickEvent.Pre;

@EventBusSubscriber
public class HorseDarkBlueCrystalSaddleDisplayConditionProcedure {
   @SubscribeEvent
   public static void onEntityTick(Pre event) {
      execute(event, event.getEntity());
   }

   public static boolean execute(Entity entity) {
      return execute(null, entity);
   }

   private static boolean execute(@Nullable Event event, Entity entity) {
      return entity == null
         ? false
         : (
               entity instanceof HorseEntity _datEntL0 && (Boolean)_datEntL0.getEntityData().get(HorseEntity.DATA_Special)
                  || (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) != 123
                     && (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) != 120
                     && entity instanceof HorseEntity _datEntL3
                     && (Boolean)_datEntL3.getEntityData().get(HorseEntity.DATA_Fairy)
            )
            && !(entity instanceof HorseEntity _datEntL4 && (Boolean)_datEntL4.getEntityData().get(HorseEntity.DATA_MetalArmored))
            && !(entity instanceof HorseEntity _datEntL5 && (Boolean)_datEntL5.getEntityData().get(HorseEntity.DATA_GoldenArmored))
            && !(entity instanceof HorseEntity _datEntL6 && (Boolean)_datEntL6.getEntityData().get(HorseEntity.DATA_DiamondArmored))
            && entity instanceof HorseEntity _datEntL7
            && (Boolean)_datEntL7.getEntityData().get(HorseEntity.DATA_CrystalineArmored)
            && entity instanceof HorseEntity _datEntL8
            && (Boolean)_datEntL8.getEntityData().get(HorseEntity.DATA_Saddle);
   }
}
