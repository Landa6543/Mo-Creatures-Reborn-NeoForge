package net.mocreatures.procedures;

import io.netty.buffer.Unpooled;
import javax.annotation.Nullable;
import net.minecraft.core.BlockPos;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.LevelAccessor;
import net.mocreatures.entity.HorseEntity;
import net.mocreatures.world.inventory.NamingHorseMenu;
import net.neoforged.bus.api.Event;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent.EntityInteract;

@EventBusSubscriber
public class HorseTameProcedure {
   @SubscribeEvent
   public static void onRightClickEntity(EntityInteract event) {
      if (event.getHand() == event.getEntity().getUsedItemHand()) {
         execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getTarget(), event.getEntity());
      }
   }

   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
      execute(null, world, x, y, z, entity, sourceentity);
   }

   private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
      if (entity != null && sourceentity != null) {
         if (!(entity instanceof TamableAnimal _tamEnt && _tamEnt.isTame())
            && entity instanceof HorseEntity
            && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.APPLE
            && (
               entity instanceof HorseEntity _datEntL4 && (Boolean)_datEntL4.getEntityData().get(HorseEntity.DATA_Tier1)
                  || entity instanceof HorseEntity _datEntL5 && (Boolean)_datEntL5.getEntityData().get(HorseEntity.DATA_Tier2)
                  || entity instanceof HorseEntity _datEntL6 && (Boolean)_datEntL6.getEntityData().get(HorseEntity.DATA_Tier3)
                  || entity instanceof HorseEntity _datEntL7 && (Boolean)_datEntL7.getEntityData().get(HorseEntity.DATA_Tier4)
            )) {
            if (entity instanceof TamableAnimal _toTame && sourceentity instanceof Player _owner) {
               _toTame.tame(_owner);
            }

            if (sourceentity instanceof ServerPlayer _ent) {
               final BlockPos _bpos = BlockPos.containing(x, y, z);
               _ent.openMenu(new MenuProvider() {
                  public Component getDisplayName() {
                     return Component.literal("NamingHorse");
                  }

                  public boolean shouldTriggerClientSideContainerClosingOnOpen() {
                     return false;
                  }

                  public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
                     return new NamingHorseMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
                  }
               }, _bpos);
            }

            if (sourceentity instanceof Player _player) {
               ItemStack _stktoremove = new ItemStack(Items.APPLE);
               _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
         }

         if (!(entity instanceof TamableAnimal _tamEnt && _tamEnt.isTame())
            && entity instanceof HorseEntity
            && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.APPLE
            && (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 100
            && sourceentity.isPassenger()
            && (
               sourceentity.getVehicle() instanceof HorseEntity _datEntL18 && (Boolean)_datEntL18.getEntityData().get(HorseEntity.DATA_Tier4)
                  || sourceentity.getVehicle() instanceof HorseEntity _datEntL20 && (Boolean)_datEntL20.getEntityData().get(HorseEntity.DATA_Special)
            )) {
            if (entity instanceof TamableAnimal _toTame && sourceentity instanceof Player _owner) {
               _toTame.tame(_owner);
            }

            if (sourceentity instanceof ServerPlayer _ent) {
               final BlockPos _bpos = BlockPos.containing(x, y, z);
               _ent.openMenu(new MenuProvider() {
                  public Component getDisplayName() {
                     return Component.literal("NamingHorse");
                  }

                  public boolean shouldTriggerClientSideContainerClosingOnOpen() {
                     return false;
                  }

                  public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
                     return new NamingHorseMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
                  }
               }, _bpos);
            }

            if (sourceentity instanceof Player _player) {
               ItemStack _stktoremove = new ItemStack(Items.APPLE);
               _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
         }
      }
   }
}
