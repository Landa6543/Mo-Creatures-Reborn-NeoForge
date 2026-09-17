package net.mocreatures;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload.Type;
import net.minecraft.util.Tuple;
import net.mocreatures.init.MocreaturesModAttributes;
import net.mocreatures.init.MocreaturesModBlockEntities;
import net.mocreatures.init.MocreaturesModBlocks;
import net.mocreatures.init.MocreaturesModEntities;
import net.mocreatures.init.MocreaturesModItems;
import net.mocreatures.init.MocreaturesModMenus;
import net.mocreatures.init.MocreaturesModParticleTypes;
import net.mocreatures.init.MocreaturesModSounds;
import net.mocreatures.init.MocreaturesModTabs;
import net.mocreatures.network.MocreaturesModVariables;
import net.mocreatures.world.features.StructureFeature;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.util.thread.SidedThreadGroups;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.tick.ServerTickEvent.Post;
import net.neoforged.neoforge.network.event.RegisterPayloadHandlersEvent;
import net.neoforged.neoforge.network.handling.IPayloadHandler;
import net.neoforged.neoforge.network.registration.PayloadRegistrar;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("mocreatures")
public class MocreaturesMod {
   public static final Logger LOGGER = LogManager.getLogger(MocreaturesMod.class);
   public static final String MODID = "mocreatures";
   private static boolean networkingRegistered = false;
   private static final Map<Type<?>, MocreaturesMod.NetworkMessage<?>> MESSAGES = new HashMap<>();
   private static final Collection<Tuple<Runnable, Integer>> workQueue = new ConcurrentLinkedQueue<>();

   public MocreaturesMod(IEventBus modEventBus) {
      NeoForge.EVENT_BUS.register(this);
      modEventBus.addListener(this::registerNetworking);
      MocreaturesModSounds.REGISTRY.register(modEventBus);
      MocreaturesModBlocks.REGISTRY.register(modEventBus);
      MocreaturesModBlockEntities.REGISTRY.register(modEventBus);
      MocreaturesModItems.REGISTRY.register(modEventBus);
      MocreaturesModEntities.REGISTRY.register(modEventBus);
      MocreaturesModTabs.REGISTRY.register(modEventBus);
      MocreaturesModVariables.ATTACHMENT_TYPES.register(modEventBus);
      StructureFeature.REGISTRY.register(modEventBus);
      MocreaturesModMenus.REGISTRY.register(modEventBus);
      MocreaturesModParticleTypes.REGISTRY.register(modEventBus);
      MocreaturesModAttributes.REGISTRY.register(modEventBus);
   }

   public static <T extends CustomPacketPayload> void addNetworkMessage(
      Type<T> id, StreamCodec<? extends FriendlyByteBuf, T> reader, IPayloadHandler<T> handler
   ) {
      if (networkingRegistered) {
         throw new IllegalStateException("Cannot register new network messages after networking has been registered");
      }

      MESSAGES.put(id, new MocreaturesMod.NetworkMessage(reader, handler));
   }

   @SuppressWarnings("unchecked")
   private static <T extends CustomPacketPayload> void registerMessage(PayloadRegistrar registrar, Type<?> id, NetworkMessage<?> msg) {
      registrar.playBidirectional((Type<T>) id, (StreamCodec) msg.reader(), (IPayloadHandler<T>) msg.handler());
   }

   private void registerNetworking(RegisterPayloadHandlersEvent event) {
      PayloadRegistrar registrar = event.registrar("mocreatures");
      MESSAGES.forEach((id, networkMessage) -> registerMessage(registrar, id, networkMessage));
      networkingRegistered = true;
   }

   public static void queueServerWork(int tick, Runnable action) {
      if (Thread.currentThread().getThreadGroup() == SidedThreadGroups.SERVER) {
         workQueue.add(new Tuple(action, tick));
      }
   }

   @SubscribeEvent
   public void tick(Post event) {
      List<Tuple<Runnable, Integer>> actions = new ArrayList<>();
      workQueue.forEach(work -> {
         work.setB((Integer)work.getB() - 1);
         if ((Integer)work.getB() == 0) {
            actions.add((Tuple<Runnable, Integer>)work);
         }
      });
      actions.forEach(e -> ((Runnable)e.getA()).run());
      workQueue.removeAll(actions);
   }

   private record NetworkMessage<T extends CustomPacketPayload>(StreamCodec<? extends FriendlyByteBuf, T> reader, IPayloadHandler<T> handler) {
   }
}
