package net.mocreatures.procedures;

import javax.annotation.Nullable;
import net.minecraft.world.entity.Entity;
import net.neoforged.bus.api.Event;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.tick.PlayerTickEvent.Post;

@EventBusSubscriber
public class BreedTimesOutProcedure {
   @SubscribeEvent
   public static void onPlayerTick(Post event) {
      execute(event, event.getEntity());
   }

   public static void execute(Entity entity) {
      execute(null, entity);
   }

   private static void execute(@Nullable Event event, Entity entity) {
      if (entity != null) {
         if (entity.getPersistentData().getDouble("MocHorseParent1") != 0.0 || entity.getPersistentData().getDouble("MocHorseParent2") != 0.0) {
            entity.getPersistentData().putDouble("MocHorseParentCooldown", entity.getPersistentData().getDouble("MocHorseParentCooldown") + 1.0);
            if (entity.getPersistentData().getDouble("MocHorseParentCooldown") >= 200.0) {
               entity.getPersistentData().putDouble("MocHorseParent1", 0.0);
               entity.getPersistentData().putDouble("MocHorseParent2", 0.0);
               entity.getPersistentData().putDouble("MocHorseParentCooldown", 0.0);
            }
         }

         if (entity.getPersistentData().getDouble("MocHorseParent1") == 102.0 || entity.getPersistentData().getDouble("MocHorseParent2") == 102.0) {
            entity.getPersistentData().putDouble("MocHorseParent1", 0.0);
            entity.getPersistentData().putDouble("MocHorseParent2", 0.0);
         }
      }
   }
}
