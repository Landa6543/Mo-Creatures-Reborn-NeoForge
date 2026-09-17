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
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.LevelAccessor;
import net.mocreatures.entity.GrizzlyBearEntity;
import net.mocreatures.init.MocreaturesModItems;
import net.mocreatures.world.inventory.NamingGrizzlyBearMenu;

public class GrizzlyBearRightClickedOnEntityProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
      if (entity != null && sourceentity != null) {
         if (entity instanceof GrizzlyBearEntity _datEntL0
            && (Boolean)_datEntL0.getEntityData().get(GrizzlyBearEntity.DATA_Baby)
            && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BEEF) {
            if (entity instanceof TamableAnimal _toTame && sourceentity instanceof Player _owner) {
               _toTame.tame(_owner);
            }

            if (sourceentity instanceof ServerPlayer _ent) {
               final BlockPos _bpos = BlockPos.containing(x, y, z);
               _ent.openMenu(new MenuProvider() {
                  public Component getDisplayName() {
                     return Component.literal("NamingGrizzlyBear");
                  }

                  public boolean shouldTriggerClientSideContainerClosingOnOpen() {
                     return false;
                  }

                  public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
                     return new NamingGrizzlyBearMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
                  }
               }, _bpos);
            }
         }

         if (!(entity instanceof GrizzlyBearEntity _datEntL5 && (Boolean)_datEntL5.getEntityData().get(GrizzlyBearEntity.DATA_Sit))
            && entity instanceof TamableAnimal _tamEnt
            && _tamEnt.isTame()
            && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == MocreaturesModItems.WHIP.get()
            && entity instanceof GrizzlyBearEntity _datEntSetL) {
            _datEntSetL.getEntityData().set(GrizzlyBearEntity.DATA_Sit, true);
         }

         if (entity instanceof GrizzlyBearEntity _datEntL10
            && (Boolean)_datEntL10.getEntityData().get(GrizzlyBearEntity.DATA_Sit)
            && sourceentity.isShiftKeyDown()
            && entity instanceof TamableAnimal _tamEnt
            && _tamEnt.isTame()
            && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == MocreaturesModItems.WHIP.get()) {
            if (entity instanceof GrizzlyBearEntity _datEntSetL) {
               _datEntSetL.getEntityData().set(GrizzlyBearEntity.DATA_Sit, false);
            }

            if (entity instanceof GrizzlyBearEntity) {
               ((GrizzlyBearEntity)entity).setAnimation("empty");
            }

            if (entity instanceof LivingEntity _livingEntity17 && _livingEntity17.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED)) {
               _livingEntity17.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(0.25);
            }
         }

         if (!(entity instanceof GrizzlyBearEntity _datEntL18 && (Boolean)_datEntL18.getEntityData().get(GrizzlyBearEntity.DATA_Saddled))
            && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()
               == MocreaturesModItems.CRAFTED_SADDLE.get()
            && entity instanceof TamableAnimal _tamEnt
            && _tamEnt.isTame()) {
            if (entity instanceof GrizzlyBearEntity _datEntSetL) {
               _datEntSetL.getEntityData().set(GrizzlyBearEntity.DATA_Saddled, true);
            }

            if (sourceentity instanceof Player _player) {
               ItemStack _stktoremove = new ItemStack((ItemLike)MocreaturesModItems.CRAFTED_SADDLE.get());
               _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
         }

         if (entity instanceof GrizzlyBearEntity _datEntL24
            && (Boolean)_datEntL24.getEntityData().get(GrizzlyBearEntity.DATA_Saddled)
            && !(entity instanceof GrizzlyBearEntity _datEntL25 && (Boolean)_datEntL25.getEntityData().get(GrizzlyBearEntity.DATA_Baby))
            && entity instanceof TamableAnimal _tamEnt
            && _tamEnt.isTame()) {
            sourceentity.startRiding(entity);
         }
      }
   }
}
