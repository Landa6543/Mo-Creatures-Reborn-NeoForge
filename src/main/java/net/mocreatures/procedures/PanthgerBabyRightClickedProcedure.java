package net.mocreatures.procedures;

import io.netty.buffer.Unpooled;
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
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.LevelAccessor;
import net.mocreatures.entity.PanthgerEntity;
import net.mocreatures.init.MocreaturesModItems;
import net.mocreatures.world.inventory.NamingPanthgerMenu;

public class PanthgerBabyRightClickedProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
      if (entity != null && sourceentity != null) {
         if (entity instanceof PanthgerEntity _datEntL0
            && (Boolean)_datEntL0.getEntityData().get(PanthgerEntity.DATA_Baby)
            && entity instanceof PanthgerEntity _datEntL1
            && (Boolean)_datEntL1.getEntityData().get(PanthgerEntity.DATA_Tameable)
            && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == MocreaturesModItems.MEDALLION.get()) {
            if (entity instanceof TamableAnimal _toTame && sourceentity instanceof Player _owner) {
               _toTame.tame(_owner);
            }

            if (sourceentity instanceof ServerPlayer _ent) {
               final BlockPos _bpos = BlockPos.containing(x, y, z);
               _ent.openMenu(new MenuProvider() {
                  public Component getDisplayName() {
                     return Component.literal("NamingPanthger");
                  }

                  public boolean shouldTriggerClientSideContainerClosingOnOpen() {
                     return false;
                  }

                  public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
                     return new NamingPanthgerMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
                  }
               }, _bpos);
            }

            if (sourceentity instanceof Player _player) {
               ItemStack _stktoremove = new ItemStack((ItemLike)MocreaturesModItems.MEDALLION.get());
               _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }

            if (entity instanceof PanthgerEntity _datEntSetL) {
               _datEntSetL.getEntityData().set(PanthgerEntity.DATA_Medallion, true);
            }
         }
      }
   }
}
