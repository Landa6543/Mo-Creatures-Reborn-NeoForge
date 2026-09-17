package net.mocreatures.init;

import net.minecraft.core.particles.ParticleType;
import net.mocreatures.client.particle.DiggingParticle;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.EventBusSubscriber.Bus;
import net.neoforged.neoforge.client.event.RegisterParticleProvidersEvent;

@EventBusSubscriber(bus = Bus.MOD, value = Dist.CLIENT)
public class MocreaturesModParticles {
   @SubscribeEvent
   public static void registerParticles(RegisterParticleProvidersEvent event) {
      event.registerSpriteSet((ParticleType)MocreaturesModParticleTypes.DIGGING.get(), DiggingParticle::provider);
   }
}
