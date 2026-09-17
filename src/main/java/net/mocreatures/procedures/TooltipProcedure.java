package net.mocreatures.procedures;

import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.core.component.DataComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.component.CustomData;
import net.mocreatures.init.MocreaturesModItems;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.bus.api.Event;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.ItemTooltipEvent;

@EventBusSubscriber(Dist.CLIENT)
public class TooltipProcedure {
   @OnlyIn(Dist.CLIENT)
   @SubscribeEvent
   public static void onItemTooltip(ItemTooltipEvent event) {
      execute(event, event.getItemStack(), event.getToolTip());
   }

   public static void execute(ItemStack itemstack, List<Component> tooltip) {
      execute(null, itemstack, tooltip);
   }

   private static void execute(@Nullable Event event, ItemStack itemstack, List<Component> tooltip) {
      if (tooltip != null) {
         if (itemstack.getItem() == MocreaturesModItems.PET_AMULET_FULL.get()) {
            tooltip.add(
               Component.literal("§6" + ((CustomData)itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY)).copyTag().getString("Name"))
            );
            tooltip.add(
               Component.literal(
                  "§4"
                     + ((CustomData)itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY)).copyTag().getDouble("Health")
                     + "/"
                     + ((CustomData)itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY)).copyTag().getDouble("MaxHealth")
                     + " HP"
               )
            );
            tooltip.add(Component.literal("§7" + ((CustomData)itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY)).copyTag().getString("Mob")));
         }

         if (itemstack.getItem() == MocreaturesModItems.FISHING_NET_FULL.get()) {
            tooltip.add(
               Component.literal("§6" + ((CustomData)itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY)).copyTag().getString("Name"))
            );
            tooltip.add(
               Component.literal(
                  "§4"
                     + ((CustomData)itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY)).copyTag().getDouble("Health")
                     + "/"
                     + ((CustomData)itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY)).copyTag().getDouble("MaxHealth")
                     + " HP"
               )
            );
            tooltip.add(Component.literal("§7" + ((CustomData)itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY)).copyTag().getString("Mob")));
         }

         if (itemstack.getItem() == MocreaturesModItems.GHOST_AMULET_FULL.get()) {
            tooltip.add(
               Component.literal("§6" + ((CustomData)itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY)).copyTag().getString("Name"))
            );
            tooltip.add(
               Component.literal(
                  "§4"
                     + ((CustomData)itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY)).copyTag().getDouble("Health")
                     + "/"
                     + ((CustomData)itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY)).copyTag().getDouble("MaxHealth")
                     + " HP"
               )
            );
            tooltip.add(Component.literal("§7" + ((CustomData)itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY)).copyTag().getString("Mob")));
         }

         if (itemstack.getItem() == MocreaturesModItems.BONE_AMULET_FULL.get()) {
            tooltip.add(
               Component.literal("§6" + ((CustomData)itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY)).copyTag().getString("Name"))
            );
            tooltip.add(
               Component.literal(
                  "§4"
                     + ((CustomData)itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY)).copyTag().getDouble("Health")
                     + "/"
                     + ((CustomData)itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY)).copyTag().getDouble("MaxHealth")
                     + " HP"
               )
            );
            tooltip.add(Component.literal("§7" + ((CustomData)itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY)).copyTag().getString("Mob")));
         }

         if (itemstack.getItem() == MocreaturesModItems.FAIRY_AMULET_FULL.get()) {
            tooltip.add(
               Component.literal("§6" + ((CustomData)itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY)).copyTag().getString("Name"))
            );
            tooltip.add(
               Component.literal(
                  "§4"
                     + ((CustomData)itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY)).copyTag().getDouble("Health")
                     + "/"
                     + ((CustomData)itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY)).copyTag().getDouble("MaxHealth")
                     + " HP"
               )
            );
            tooltip.add(Component.literal("§7" + ((CustomData)itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY)).copyTag().getString("Mob")));
         }

         if (itemstack.getItem() == MocreaturesModItems.SKY_AMULET_FULL.get()) {
            tooltip.add(
               Component.literal("§6" + ((CustomData)itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY)).copyTag().getString("Name"))
            );
            tooltip.add(
               Component.literal(
                  "§4"
                     + ((CustomData)itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY)).copyTag().getDouble("Health")
                     + "/"
                     + ((CustomData)itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY)).copyTag().getDouble("MaxHealth")
                     + " HP"
               )
            );
            tooltip.add(Component.literal("§7" + ((CustomData)itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY)).copyTag().getString("Mob")));
         }
      }
   }
}
