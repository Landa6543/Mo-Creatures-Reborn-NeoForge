package net.mocreatures.init;

import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.registries.Registries;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class MocreaturesModParticleTypes {
   public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(Registries.PARTICLE_TYPE, "mocreatures");
   public static final DeferredHolder<ParticleType<?>, SimpleParticleType> DIGGING = REGISTRY.register("digging", () -> new SimpleParticleType(false));
}
