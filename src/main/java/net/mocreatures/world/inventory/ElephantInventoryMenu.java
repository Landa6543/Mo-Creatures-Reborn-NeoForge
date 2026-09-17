package net.mocreatures.world.inventory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import net.minecraft.core.BlockPos;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BaseContainerBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.mocreatures.init.MocreaturesModMenus;
import net.neoforged.neoforge.capabilities.Capabilities.ItemHandler;
import net.neoforged.neoforge.items.IItemHandler;
import net.neoforged.neoforge.items.IItemHandlerModifiable;
import net.neoforged.neoforge.items.ItemStackHandler;
import net.neoforged.neoforge.items.SlotItemHandler;
import net.neoforged.neoforge.items.wrapper.InvWrapper;

public class ElephantInventoryMenu extends AbstractContainerMenu implements Supplier<Map<Integer, Slot>> {
   public static final HashMap<String, Object> guistate = new HashMap<>();
   public final Level world;
   public final Player entity;
   public int x;
   public int y;
   public int z;
   private ContainerLevelAccess access = ContainerLevelAccess.NULL;
   private IItemHandler internal;
   private final Map<Integer, Slot> customSlots = new HashMap<>();
   private boolean bound = false;
   private Supplier<Boolean> boundItemMatcher = null;
   private Entity boundEntity = null;
   private BlockEntity boundBlockEntity = null;

   public ElephantInventoryMenu(int id, Inventory inv, FriendlyByteBuf extraData) {
      super((MenuType)MocreaturesModMenus.ELEPHANT_INVENTORY.get(), id);
      this.entity = inv.player;
      this.world = inv.player.level();
      this.internal = new ItemStackHandler(36);
      BlockPos pos = null;
      if (extraData != null) {
         pos = extraData.readBlockPos();
         this.x = pos.getX();
         this.y = pos.getY();
         this.z = pos.getZ();
         this.access = ContainerLevelAccess.create(this.world, pos);
      }

      if (pos != null) {
         if (extraData.readableBytes() == 1) {
            byte hand = extraData.readByte();
            ItemStack itemstack = hand == 0 ? this.entity.getMainHandItem() : this.entity.getOffhandItem();
            this.boundItemMatcher = () -> itemstack == (hand == 0 ? this.entity.getMainHandItem() : this.entity.getOffhandItem());
            IItemHandler cap = (IItemHandler)itemstack.getCapability(ItemHandler.ITEM);
            if (cap != null) {
               this.internal = cap;
               this.bound = true;
            }
         } else if (extraData.readableBytes() > 1) {
            extraData.readByte();
            this.boundEntity = this.world.getEntity(extraData.readVarInt());
            if (this.boundEntity != null) {
               IItemHandler cap = (IItemHandler)this.boundEntity.getCapability(ItemHandler.ENTITY);
               if (cap != null) {
                  this.internal = cap;
                  this.bound = true;
               }
            }
         } else {
            this.boundBlockEntity = this.world.getBlockEntity(pos);
            if (this.boundBlockEntity instanceof BaseContainerBlockEntity baseContainerBlockEntity) {
               this.internal = new InvWrapper(baseContainerBlockEntity);
               this.bound = true;
            }
         }
      }

      this.customSlots.put(0, this.addSlot(new SlotItemHandler(this.internal, 0, 8, 62) {
         private final int slot = 0;
         private int x;
         private int y;

         {
            this.x = ElephantInventoryMenu.this.x;
            this.y = ElephantInventoryMenu.this.y;
         }
      }));
      this.customSlots.put(1, this.addSlot(new SlotItemHandler(this.internal, 1, 26, 62) {
         private final int slot = 1;
         private int x;
         private int y;

         {
            this.x = ElephantInventoryMenu.this.x;
            this.y = ElephantInventoryMenu.this.y;
         }
      }));
      this.customSlots.put(2, this.addSlot(new SlotItemHandler(this.internal, 2, 44, 62) {
         private final int slot = 2;
         private int x;
         private int y;

         {
            this.x = ElephantInventoryMenu.this.x;
            this.y = ElephantInventoryMenu.this.y;
         }
      }));
      this.customSlots.put(3, this.addSlot(new SlotItemHandler(this.internal, 3, 62, 62) {
         private final int slot = 3;
         private int x;
         private int y;

         {
            this.x = ElephantInventoryMenu.this.x;
            this.y = ElephantInventoryMenu.this.y;
         }
      }));
      this.customSlots.put(4, this.addSlot(new SlotItemHandler(this.internal, 4, 80, 62) {
         private final int slot = 4;
         private int x;
         private int y;

         {
            this.x = ElephantInventoryMenu.this.x;
            this.y = ElephantInventoryMenu.this.y;
         }
      }));
      this.customSlots.put(5, this.addSlot(new SlotItemHandler(this.internal, 5, 98, 62) {
         private final int slot = 5;
         private int x;
         private int y;

         {
            this.x = ElephantInventoryMenu.this.x;
            this.y = ElephantInventoryMenu.this.y;
         }
      }));
      this.customSlots.put(6, this.addSlot(new SlotItemHandler(this.internal, 6, 116, 62) {
         private final int slot = 6;
         private int x;
         private int y;

         {
            this.x = ElephantInventoryMenu.this.x;
            this.y = ElephantInventoryMenu.this.y;
         }
      }));
      this.customSlots.put(7, this.addSlot(new SlotItemHandler(this.internal, 7, 134, 62) {
         private final int slot = 7;
         private int x;
         private int y;

         {
            this.x = ElephantInventoryMenu.this.x;
            this.y = ElephantInventoryMenu.this.y;
         }
      }));
      this.customSlots.put(8, this.addSlot(new SlotItemHandler(this.internal, 8, 152, 62) {
         private final int slot = 8;
         private int x;
         private int y;

         {
            this.x = ElephantInventoryMenu.this.x;
            this.y = ElephantInventoryMenu.this.y;
         }
      }));
      this.customSlots.put(9, this.addSlot(new SlotItemHandler(this.internal, 9, 8, 44) {
         private final int slot = 9;
         private int x;
         private int y;

         {
            this.x = ElephantInventoryMenu.this.x;
            this.y = ElephantInventoryMenu.this.y;
         }
      }));
      this.customSlots.put(10, this.addSlot(new SlotItemHandler(this.internal, 10, 26, 44) {
         private final int slot = 10;
         private int x;
         private int y;

         {
            this.x = ElephantInventoryMenu.this.x;
            this.y = ElephantInventoryMenu.this.y;
         }
      }));
      this.customSlots.put(11, this.addSlot(new SlotItemHandler(this.internal, 11, 44, 44) {
         private final int slot = 11;
         private int x;
         private int y;

         {
            this.x = ElephantInventoryMenu.this.x;
            this.y = ElephantInventoryMenu.this.y;
         }
      }));
      this.customSlots.put(12, this.addSlot(new SlotItemHandler(this.internal, 12, 62, 44) {
         private final int slot = 12;
         private int x;
         private int y;

         {
            this.x = ElephantInventoryMenu.this.x;
            this.y = ElephantInventoryMenu.this.y;
         }
      }));
      this.customSlots.put(13, this.addSlot(new SlotItemHandler(this.internal, 13, 80, 44) {
         private final int slot = 13;
         private int x;
         private int y;

         {
            this.x = ElephantInventoryMenu.this.x;
            this.y = ElephantInventoryMenu.this.y;
         }
      }));
      this.customSlots.put(14, this.addSlot(new SlotItemHandler(this.internal, 14, 98, 44) {
         private final int slot = 14;
         private int x;
         private int y;

         {
            this.x = ElephantInventoryMenu.this.x;
            this.y = ElephantInventoryMenu.this.y;
         }
      }));
      this.customSlots.put(15, this.addSlot(new SlotItemHandler(this.internal, 15, 116, 44) {
         private final int slot = 15;
         private int x;
         private int y;

         {
            this.x = ElephantInventoryMenu.this.x;
            this.y = ElephantInventoryMenu.this.y;
         }
      }));
      this.customSlots.put(16, this.addSlot(new SlotItemHandler(this.internal, 16, 134, 44) {
         private final int slot = 16;
         private int x;
         private int y;

         {
            this.x = ElephantInventoryMenu.this.x;
            this.y = ElephantInventoryMenu.this.y;
         }
      }));
      this.customSlots.put(17, this.addSlot(new SlotItemHandler(this.internal, 17, 152, 44) {
         private final int slot = 17;
         private int x;
         private int y;

         {
            this.x = ElephantInventoryMenu.this.x;
            this.y = ElephantInventoryMenu.this.y;
         }
      }));
      this.customSlots.put(18, this.addSlot(new SlotItemHandler(this.internal, 18, 8, 26) {
         private final int slot = 18;
         private int x;
         private int y;

         {
            this.x = ElephantInventoryMenu.this.x;
            this.y = ElephantInventoryMenu.this.y;
         }
      }));
      this.customSlots.put(19, this.addSlot(new SlotItemHandler(this.internal, 19, 26, 26) {
         private final int slot = 19;
         private int x;
         private int y;

         {
            this.x = ElephantInventoryMenu.this.x;
            this.y = ElephantInventoryMenu.this.y;
         }
      }));
      this.customSlots.put(20, this.addSlot(new SlotItemHandler(this.internal, 20, 44, 26) {
         private final int slot = 20;
         private int x;
         private int y;

         {
            this.x = ElephantInventoryMenu.this.x;
            this.y = ElephantInventoryMenu.this.y;
         }
      }));
      this.customSlots.put(21, this.addSlot(new SlotItemHandler(this.internal, 21, 62, 26) {
         private final int slot = 21;
         private int x;
         private int y;

         {
            this.x = ElephantInventoryMenu.this.x;
            this.y = ElephantInventoryMenu.this.y;
         }
      }));
      this.customSlots.put(22, this.addSlot(new SlotItemHandler(this.internal, 22, 80, 26) {
         private final int slot = 22;
         private int x;
         private int y;

         {
            this.x = ElephantInventoryMenu.this.x;
            this.y = ElephantInventoryMenu.this.y;
         }
      }));
      this.customSlots.put(23, this.addSlot(new SlotItemHandler(this.internal, 23, 98, 26) {
         private final int slot = 23;
         private int x;
         private int y;

         {
            this.x = ElephantInventoryMenu.this.x;
            this.y = ElephantInventoryMenu.this.y;
         }
      }));
      this.customSlots.put(24, this.addSlot(new SlotItemHandler(this.internal, 24, 116, 26) {
         private final int slot = 24;
         private int x;
         private int y;

         {
            this.x = ElephantInventoryMenu.this.x;
            this.y = ElephantInventoryMenu.this.y;
         }
      }));
      this.customSlots.put(25, this.addSlot(new SlotItemHandler(this.internal, 25, 134, 26) {
         private final int slot = 25;
         private int x;
         private int y;

         {
            this.x = ElephantInventoryMenu.this.x;
            this.y = ElephantInventoryMenu.this.y;
         }
      }));
      this.customSlots.put(26, this.addSlot(new SlotItemHandler(this.internal, 26, 152, 26) {
         private final int slot = 26;
         private int x;
         private int y;

         {
            this.x = ElephantInventoryMenu.this.x;
            this.y = ElephantInventoryMenu.this.y;
         }
      }));
      this.customSlots.put(27, this.addSlot(new SlotItemHandler(this.internal, 27, 8, 8) {
         private final int slot = 27;
         private int x;
         private int y;

         {
            this.x = ElephantInventoryMenu.this.x;
            this.y = ElephantInventoryMenu.this.y;
         }
      }));
      this.customSlots.put(28, this.addSlot(new SlotItemHandler(this.internal, 28, 26, 8) {
         private final int slot = 28;
         private int x;
         private int y;

         {
            this.x = ElephantInventoryMenu.this.x;
            this.y = ElephantInventoryMenu.this.y;
         }
      }));
      this.customSlots.put(29, this.addSlot(new SlotItemHandler(this.internal, 29, 44, 8) {
         private final int slot = 29;
         private int x;
         private int y;

         {
            this.x = ElephantInventoryMenu.this.x;
            this.y = ElephantInventoryMenu.this.y;
         }
      }));
      this.customSlots.put(30, this.addSlot(new SlotItemHandler(this.internal, 30, 62, 8) {
         private final int slot = 30;
         private int x;
         private int y;

         {
            this.x = ElephantInventoryMenu.this.x;
            this.y = ElephantInventoryMenu.this.y;
         }
      }));
      this.customSlots.put(31, this.addSlot(new SlotItemHandler(this.internal, 31, 80, 8) {
         private final int slot = 31;
         private int x;
         private int y;

         {
            this.x = ElephantInventoryMenu.this.x;
            this.y = ElephantInventoryMenu.this.y;
         }
      }));
      this.customSlots.put(32, this.addSlot(new SlotItemHandler(this.internal, 32, 98, 8) {
         private final int slot = 32;
         private int x;
         private int y;

         {
            this.x = ElephantInventoryMenu.this.x;
            this.y = ElephantInventoryMenu.this.y;
         }
      }));
      this.customSlots.put(33, this.addSlot(new SlotItemHandler(this.internal, 33, 116, 8) {
         private final int slot = 33;
         private int x;
         private int y;

         {
            this.x = ElephantInventoryMenu.this.x;
            this.y = ElephantInventoryMenu.this.y;
         }
      }));
      this.customSlots.put(34, this.addSlot(new SlotItemHandler(this.internal, 34, 134, 8) {
         private final int slot = 34;
         private int x;
         private int y;

         {
            this.x = ElephantInventoryMenu.this.x;
            this.y = ElephantInventoryMenu.this.y;
         }
      }));
      this.customSlots.put(35, this.addSlot(new SlotItemHandler(this.internal, 35, 152, 8) {
         private final int slot = 35;
         private int x;
         private int y;

         {
            this.x = ElephantInventoryMenu.this.x;
            this.y = ElephantInventoryMenu.this.y;
         }
      }));

      for (int si = 0; si < 3; si++) {
         for (int sj = 0; sj < 9; sj++) {
            this.addSlot(new Slot(inv, sj + (si + 1) * 9, 8 + sj * 18, 89 + si * 18));
         }
      }

      for (int si = 0; si < 9; si++) {
         this.addSlot(new Slot(inv, si, 8 + si * 18, 147));
      }
   }

   public boolean stillValid(Player player) {
      if (this.bound) {
         if (this.boundItemMatcher != null) {
            return this.boundItemMatcher.get();
         }

         if (this.boundBlockEntity != null) {
            return AbstractContainerMenu.stillValid(this.access, player, this.boundBlockEntity.getBlockState().getBlock());
         }

         if (this.boundEntity != null) {
            return this.boundEntity.isAlive();
         }
      }

      return true;
   }

   public ItemStack quickMoveStack(Player playerIn, int index) {
      ItemStack itemstack = ItemStack.EMPTY;
      Slot slot = (Slot)this.slots.get(index);
      if (slot != null && slot.hasItem()) {
         ItemStack itemstack1 = slot.getItem();
         itemstack = itemstack1.copy();
         if (index < 36) {
            if (!this.moveItemStackTo(itemstack1, 36, this.slots.size(), true)) {
               return ItemStack.EMPTY;
            }

            slot.onQuickCraft(itemstack1, itemstack);
         } else if (!this.moveItemStackTo(itemstack1, 0, 36, false)) {
            if (index < 63) {
               if (!this.moveItemStackTo(itemstack1, 63, this.slots.size(), true)) {
                  return ItemStack.EMPTY;
               }
            } else if (!this.moveItemStackTo(itemstack1, 36, 63, false)) {
               return ItemStack.EMPTY;
            }

            return ItemStack.EMPTY;
         }

         if (itemstack1.getCount() == 0) {
            slot.set(ItemStack.EMPTY);
         } else {
            slot.setChanged();
         }

         if (itemstack1.getCount() == itemstack.getCount()) {
            return ItemStack.EMPTY;
         }

         slot.onTake(playerIn, itemstack1);
      }

      return itemstack;
   }

   protected boolean moveItemStackTo(ItemStack p_38904_, int p_38905_, int p_38906_, boolean p_38907_) {
      boolean flag = false;
      int i = p_38905_;
      if (p_38907_) {
         i = p_38906_ - 1;
      }

      if (p_38904_.isStackable()) {
         while (!p_38904_.isEmpty() && (p_38907_ ? i >= p_38905_ : i < p_38906_)) {
            Slot slot = (Slot)this.slots.get(i);
            ItemStack itemstack = slot.getItem();
            if (slot.mayPlace(itemstack) && !itemstack.isEmpty() && ItemStack.isSameItemSameComponents(p_38904_, itemstack)) {
               int j = itemstack.getCount() + p_38904_.getCount();
               int k = slot.getMaxStackSize(itemstack);
               if (j <= k) {
                  p_38904_.setCount(0);
                  itemstack.setCount(j);
                  slot.set(itemstack);
                  flag = true;
               } else if (itemstack.getCount() < k) {
                  p_38904_.shrink(k - itemstack.getCount());
                  itemstack.setCount(k);
                  slot.set(itemstack);
                  flag = true;
               }
            }

            if (p_38907_) {
               i--;
            } else {
               i++;
            }
         }
      }

      if (!p_38904_.isEmpty()) {
         if (p_38907_) {
            i = p_38906_ - 1;
         } else {
            i = p_38905_;
         }

         while (p_38907_ ? i >= p_38905_ : i < p_38906_) {
            Slot slot1 = (Slot)this.slots.get(i);
            ItemStack itemstack1 = slot1.getItem();
            if (itemstack1.isEmpty() && slot1.mayPlace(p_38904_)) {
               int l = slot1.getMaxStackSize(p_38904_);
               slot1.setByPlayer(p_38904_.split(Math.min(p_38904_.getCount(), l)));
               slot1.setChanged();
               flag = true;
               break;
            }

            if (p_38907_) {
               i--;
            } else {
               i++;
            }
         }
      }

      return flag;
   }

   public void removed(Player playerIn) {
      super.removed(playerIn);
      if (!this.bound && playerIn instanceof ServerPlayer serverPlayer) {
         if (serverPlayer.isAlive() && !serverPlayer.hasDisconnected()) {
            for (int i = 0; i < this.internal.getSlots(); i++) {
               playerIn.getInventory().placeItemBackInInventory(this.internal.getStackInSlot(i));
               if (this.internal instanceof IItemHandlerModifiable ihm) {
                  ihm.setStackInSlot(i, ItemStack.EMPTY);
               }
            }
         } else {
            for (int j = 0; j < this.internal.getSlots(); j++) {
               playerIn.drop(this.internal.getStackInSlot(j), false);
               if (this.internal instanceof IItemHandlerModifiable ihm) {
                  ihm.setStackInSlot(j, ItemStack.EMPTY);
               }
            }
         }
      }
   }

   public Map<Integer, Slot> get() {
      return this.customSlots;
   }
}
