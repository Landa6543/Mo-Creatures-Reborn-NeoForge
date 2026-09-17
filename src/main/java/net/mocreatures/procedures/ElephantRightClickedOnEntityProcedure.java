package net.mocreatures.procedures;

import io.netty.buffer.Unpooled;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.mocreatures.entity.ElephantEntity;
import net.mocreatures.init.MocreaturesModItems;
import net.mocreatures.world.inventory.NamingElephantMenu;

public class ElephantRightClickedOnEntityProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
      if (entity != null && sourceentity != null) {
         if (entity instanceof ElephantEntity _datEntL0
            && (Boolean)_datEntL0.getEntityData().get(ElephantEntity.DATA_Baby)
            && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == MocreaturesModItems.SUGAR_LUMP.get()) {
            if (entity instanceof ElephantEntity _datEntSetI) {
               _datEntSetI.getEntityData()
                  .set(
                     ElephantEntity.DATA_Sugar_Lump_Count,
                     (entity instanceof ElephantEntity _datEntI ? (Integer)_datEntI.getEntityData().get(ElephantEntity.DATA_Sugar_Lump_Count) : 0) + 1
                  );
            }

            if (world instanceof Level _level) {
               if (!_level.isClientSide()) {
                  _level.playSound(
                     null,
                     BlockPos.containing(x, y, z),
                     (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("mocreatures:eat")),
                     SoundSource.NEUTRAL,
                     1.0F,
                     1.0F
                  );
               } else {
                  _level.playLocalSound(
                     x, y, z, (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("mocreatures:eat")), SoundSource.NEUTRAL, 1.0F, 1.0F, false
                  );
               }
            }
         }

         if (entity instanceof ElephantEntity _datEntL6
            && (Boolean)_datEntL6.getEntityData().get(ElephantEntity.DATA_Baby)
            && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == MocreaturesModItems.SUGAR_LUMP.get()
            && (entity instanceof ElephantEntity _datEntI ? (Integer)_datEntI.getEntityData().get(ElephantEntity.DATA_Sugar_Lump_Count) : 0) == 10) {
            if (entity instanceof ElephantEntity _datEntSetI) {
               _datEntSetI.getEntityData().set(ElephantEntity.DATA_Sugar_Lump_Count, 0);
            }

            if (entity instanceof TamableAnimal _toTame && sourceentity instanceof Player _owner) {
               _toTame.tame(_owner);
            }

            if (sourceentity instanceof ServerPlayer _ent) {
               final BlockPos _bpos = BlockPos.containing(x, y, z);
               _ent.openMenu(new MenuProvider() {
                  public Component getDisplayName() {
                     return Component.literal("NamingElephant");
                  }

                  public boolean shouldTriggerClientSideContainerClosingOnOpen() {
                     return false;
                  }

                  public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
                     return new NamingElephantMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
                  }
               }, _bpos);
            }
         }

         if (entity instanceof ElephantEntity _datEntL13
            && (Boolean)_datEntL13.getEntityData().get(ElephantEntity.DATA_Baby)
            && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.CAKE) {
            if (entity instanceof ElephantEntity _datEntSetI) {
               _datEntSetI.getEntityData()
                  .set(
                     ElephantEntity.DATA_Cake_Count,
                     (entity instanceof ElephantEntity _datEntI ? (Integer)_datEntI.getEntityData().get(ElephantEntity.DATA_Cake_Count) : 0) + 1
                  );
            }

            if (world instanceof Level _level) {
               if (!_level.isClientSide()) {
                  _level.playSound(
                     null,
                     BlockPos.containing(x, y, z),
                     (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("mocreatures:eat")),
                     SoundSource.NEUTRAL,
                     1.0F,
                     1.0F
                  );
               } else {
                  _level.playLocalSound(
                     x, y, z, (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("mocreatures:eat")), SoundSource.NEUTRAL, 1.0F, 1.0F, false
                  );
               }
            }
         }

         if (entity instanceof ElephantEntity _datEntL19
            && (Boolean)_datEntL19.getEntityData().get(ElephantEntity.DATA_Baby)
            && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.CAKE
            && (entity instanceof ElephantEntity _datEntI ? (Integer)_datEntI.getEntityData().get(ElephantEntity.DATA_Cake_Count) : 0) == 5) {
            if (entity instanceof ElephantEntity _datEntSetI) {
               _datEntSetI.getEntityData().set(ElephantEntity.DATA_Cake_Count, 0);
            }

            if (entity instanceof TamableAnimal _toTame && sourceentity instanceof Player _owner) {
               _toTame.tame(_owner);
            }

            if (sourceentity instanceof ServerPlayer _ent) {
               final BlockPos _bpos = BlockPos.containing(x, y, z);
               _ent.openMenu(new MenuProvider() {
                  public Component getDisplayName() {
                     return Component.literal("NamingElephant");
                  }

                  public boolean shouldTriggerClientSideContainerClosingOnOpen() {
                     return false;
                  }

                  public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
                     return new NamingElephantMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
                  }
               }, _bpos);
            }
         }
      }
   }
}
