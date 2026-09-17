package net.mocreatures.procedures;

import javax.annotation.Nullable;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.mocreatures.entity.LiardEntity;
import net.mocreatures.init.MocreaturesModItems;
import net.neoforged.bus.api.Event;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent.EntityInteract;

@EventBusSubscriber
public class LiardEquipmentProcedure {
   @SubscribeEvent
   public static void onRightClickEntity(EntityInteract var0) {
      if (var0.getHand() == var0.getEntity().getUsedItemHand()) {
         execute(var0, var0.getTarget(), var0.getEntity());
      }
   }

   public static void execute(Entity var0, Entity var1) {
      execute(null, var0, var1);
   }

   private static void execute(@Nullable Event var0, Entity var1, Entity var2) {
      if (var1 != null && var2 != null) {
         if (var1 instanceof LiardEntity var3 && var1 instanceof TamableAnimal var4 && var4.isTame()) {
            if (var2 instanceof Player var5) {
               boolean var6 = Boolean.TRUE.equals(var3.getEntityData().get(LiardEntity.DATA_Saddle));
               boolean var7 = Boolean.TRUE.equals(var3.getEntityData().get(LiardEntity.DATA_Chest));
               ItemStack var8 = var5.getMainHandItem();
               if (var6
                  && !var5.isSecondaryUseActive()
                  && !var3.isVehicle()
                  && (var8.isEmpty() || !var8.is((Item)MocreaturesModItems.CRAFTED_SADDLE.get()) && !var8.is(Items.SADDLE) && !var8.is(Blocks.CHEST.asItem()))) {
                  var5.startRiding(var3);
               } else if (var6 || !var8.is((Item)MocreaturesModItems.CRAFTED_SADDLE.get()) && !var8.is(Items.SADDLE)) {
                  if (!var7 && var8.is(Blocks.CHEST.asItem())) {
                     if (!var5.getAbilities().instabuild) {
                        var8.shrink(1);
                     }

                     var3.getEntityData().set(LiardEntity.DATA_Chest, true);
                  }
               } else {
                  if (!var5.getAbilities().instabuild) {
                     var8.shrink(1);
                  }

                  var3.getEntityData().set(LiardEntity.DATA_Saddle, true);
               }
            }
         }
      }
   }
}
