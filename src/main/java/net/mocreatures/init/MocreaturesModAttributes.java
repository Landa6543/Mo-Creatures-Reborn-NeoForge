package net.mocreatures.init;

import java.util.List;
import java.util.stream.Collectors;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.DefaultAttributes;
import net.minecraft.world.entity.ai.attributes.RangedAttribute;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.EventBusSubscriber.Bus;
import net.neoforged.neoforge.event.entity.EntityAttributeModificationEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

@EventBusSubscriber(bus = Bus.MOD)
public class MocreaturesModAttributes {
   public static final DeferredRegister<Attribute> REGISTRY = DeferredRegister.create(BuiltInRegistries.ATTRIBUTE, "mocreatures");
   public static final DeferredHolder<Attribute, Attribute> TESTATTRIBUTE = REGISTRY.register(
      "testattribute", () -> new RangedAttribute("attribute.mocreatures.testattribute", 0.0, 0.0, 400.0).setSyncable(true)
   );

   @SubscribeEvent
   public static void addAttributes(EntityAttributeModificationEvent event) {
      List.of(EntityType.HORSE)
         .stream()
         .filter(DefaultAttributes::hasSupplier)
         .map(entityType -> (EntityType)entityType)
         .collect(Collectors.toList())
         .forEach(entity -> event.add(entity, TESTATTRIBUTE));
   }
}
