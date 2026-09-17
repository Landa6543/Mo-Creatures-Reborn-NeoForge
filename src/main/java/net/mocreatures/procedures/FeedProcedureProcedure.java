package net.mocreatures.procedures;

import javax.annotation.Nullable;
import net.minecraft.world.level.LevelAccessor;
import net.mocreatures.network.MocreaturesModVariables;
import net.neoforged.bus.api.Event;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.tick.LevelTickEvent.Post;

@EventBusSubscriber
public class FeedProcedureProcedure {
   @SubscribeEvent
   public static void onWorldTick(Post event) {
      execute(event, event.getLevel());
   }

   public static boolean execute(LevelAccessor world) {
      return execute(null, world);
   }

   private static boolean execute(@Nullable Event event, LevelAccessor world) {
      return MocreaturesModVariables.MapVariables.get(world).Feed == 1.0;
   }
}
