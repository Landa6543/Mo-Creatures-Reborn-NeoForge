package net.mocreatures.procedures;

import javax.annotation.Nullable;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.mocreatures.entity.BlackOstrichEntity;
import net.mocreatures.init.MocreaturesModItems;
import net.neoforged.bus.api.Event;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent.EntityInteract;

@EventBusSubscriber
public class Ostrich2EquipmentSwapProcedure {
   @SubscribeEvent
   public static void onRightClickEntity(EntityInteract event) {
      if (event.getHand() == event.getEntity().getUsedItemHand()) {
         execute(event, event.getLevel(), event.getTarget(), event.getEntity());
      }
   }

   public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
      execute(null, world, entity, sourceentity);
   }

   private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, Entity sourceentity) {
      if (entity != null && sourceentity != null) {
         if (entity instanceof BlackOstrichEntity) {
            if (entity instanceof TamableAnimal _tamEnt && _tamEnt.isTame()) {
               if ((!(sourceentity instanceof LivingEntity _livEnt) ? ItemStack.EMPTY : _livEnt.getMainHandItem()).getItem() == Items.DIAMOND_HELMET) {
                  if (entity instanceof BlackOstrichEntity _datEntL4
                     && (Boolean)_datEntL4.getEntityData().get(BlackOstrichEntity.DATA_Gold_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Items.GOLDEN_HELMET));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL9
                     && (Boolean)_datEntL9.getEntityData().get(BlackOstrichEntity.DATA_Iron_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Items.IRON_HELMET));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL14
                     && (Boolean)_datEntL14.getEntityData().get(BlackOstrichEntity.DATA_Fur_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(
                        _level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack((ItemLike)MocreaturesModItems.FUR_ARMOR_HELMET.get())
                     );
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL19
                     && (Boolean)_datEntL19.getEntityData().get(BlackOstrichEntity.DATA_Reptile_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(
                        _level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack((ItemLike)MocreaturesModItems.REPTILE_ARMOR_HELMET.get())
                     );
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL24
                     && (Boolean)_datEntL24.getEntityData().get(BlackOstrichEntity.DATA_Hide_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(
                        _level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack((ItemLike)MocreaturesModItems.HIDE_ARMOR_HELMET.get())
                     );
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL29
                     && (Boolean)_datEntL29.getEntityData().get(BlackOstrichEntity.DATA_Leather_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Items.LEATHER_HELMET));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL34
                     && (Boolean)_datEntL34.getEntityData().get(BlackOstrichEntity.DATA_Frost_Scorpion_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.AIR));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL39
                     && (Boolean)_datEntL39.getEntityData().get(BlackOstrichEntity.DATA_Dirt_Scorpion_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.AIR));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL44
                     && (Boolean)_datEntL44.getEntityData().get(BlackOstrichEntity.DATA_Cave_Scorpion_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.AIR));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL49
                     && (Boolean)_datEntL49.getEntityData().get(BlackOstrichEntity.DATA_Nether_Scorpion_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.AIR));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }
               }

               if ((!(sourceentity instanceof LivingEntity _livEnt) ? ItemStack.EMPTY : _livEnt.getMainHandItem()).getItem() == Items.GOLDEN_HELMET) {
                  if (entity instanceof BlackOstrichEntity _datEntL56
                     && (Boolean)_datEntL56.getEntityData().get(BlackOstrichEntity.DATA_Diamond_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Items.DIAMOND_HELMET));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL61
                     && (Boolean)_datEntL61.getEntityData().get(BlackOstrichEntity.DATA_Iron_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Items.IRON_HELMET));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL66
                     && (Boolean)_datEntL66.getEntityData().get(BlackOstrichEntity.DATA_Fur_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(
                        _level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack((ItemLike)MocreaturesModItems.FUR_ARMOR_HELMET.get())
                     );
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL71
                     && (Boolean)_datEntL71.getEntityData().get(BlackOstrichEntity.DATA_Reptile_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(
                        _level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack((ItemLike)MocreaturesModItems.REPTILE_ARMOR_HELMET.get())
                     );
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL76
                     && (Boolean)_datEntL76.getEntityData().get(BlackOstrichEntity.DATA_Hide_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(
                        _level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack((ItemLike)MocreaturesModItems.HIDE_ARMOR_HELMET.get())
                     );
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL81
                     && (Boolean)_datEntL81.getEntityData().get(BlackOstrichEntity.DATA_Leather_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Items.LEATHER_HELMET));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL86
                     && (Boolean)_datEntL86.getEntityData().get(BlackOstrichEntity.DATA_Frost_Scorpion_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.AIR));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL91
                     && (Boolean)_datEntL91.getEntityData().get(BlackOstrichEntity.DATA_Dirt_Scorpion_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.AIR));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL96
                     && (Boolean)_datEntL96.getEntityData().get(BlackOstrichEntity.DATA_Cave_Scorpion_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.AIR));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL101
                     && (Boolean)_datEntL101.getEntityData().get(BlackOstrichEntity.DATA_Nether_Scorpion_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.AIR));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }
               }

               if ((!(sourceentity instanceof LivingEntity _livEnt) ? ItemStack.EMPTY : _livEnt.getMainHandItem()).getItem() == Items.IRON_HELMET) {
                  if (entity instanceof BlackOstrichEntity _datEntL108
                     && (Boolean)_datEntL108.getEntityData().get(BlackOstrichEntity.DATA_Diamond_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Items.DIAMOND_HELMET));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL113
                     && (Boolean)_datEntL113.getEntityData().get(BlackOstrichEntity.DATA_Gold_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Items.GOLDEN_HELMET));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL118
                     && (Boolean)_datEntL118.getEntityData().get(BlackOstrichEntity.DATA_Fur_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(
                        _level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack((ItemLike)MocreaturesModItems.FUR_ARMOR_HELMET.get())
                     );
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL123
                     && (Boolean)_datEntL123.getEntityData().get(BlackOstrichEntity.DATA_Reptile_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(
                        _level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack((ItemLike)MocreaturesModItems.REPTILE_ARMOR_HELMET.get())
                     );
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL128
                     && (Boolean)_datEntL128.getEntityData().get(BlackOstrichEntity.DATA_Hide_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(
                        _level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack((ItemLike)MocreaturesModItems.HIDE_ARMOR_HELMET.get())
                     );
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL133
                     && (Boolean)_datEntL133.getEntityData().get(BlackOstrichEntity.DATA_Leather_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Items.LEATHER_HELMET));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL138
                     && (Boolean)_datEntL138.getEntityData().get(BlackOstrichEntity.DATA_Frost_Scorpion_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.AIR));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL143
                     && (Boolean)_datEntL143.getEntityData().get(BlackOstrichEntity.DATA_Dirt_Scorpion_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.AIR));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL148
                     && (Boolean)_datEntL148.getEntityData().get(BlackOstrichEntity.DATA_Cave_Scorpion_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.AIR));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL153
                     && (Boolean)_datEntL153.getEntityData().get(BlackOstrichEntity.DATA_Nether_Scorpion_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.AIR));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }
               }

               if ((!(sourceentity instanceof LivingEntity _livEnt) ? ItemStack.EMPTY : _livEnt.getMainHandItem()).getItem()
                  == MocreaturesModItems.FUR_ARMOR_HELMET.get()) {
                  if (entity instanceof BlackOstrichEntity _datEntL160
                     && (Boolean)_datEntL160.getEntityData().get(BlackOstrichEntity.DATA_Diamond_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Items.DIAMOND_HELMET));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL165
                     && (Boolean)_datEntL165.getEntityData().get(BlackOstrichEntity.DATA_Gold_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Items.GOLDEN_HELMET));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL170
                     && (Boolean)_datEntL170.getEntityData().get(BlackOstrichEntity.DATA_Iron_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Items.IRON_HELMET));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL175
                     && (Boolean)_datEntL175.getEntityData().get(BlackOstrichEntity.DATA_Reptile_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(
                        _level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack((ItemLike)MocreaturesModItems.REPTILE_ARMOR_HELMET.get())
                     );
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL180
                     && (Boolean)_datEntL180.getEntityData().get(BlackOstrichEntity.DATA_Hide_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(
                        _level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack((ItemLike)MocreaturesModItems.HIDE_ARMOR_HELMET.get())
                     );
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL185
                     && (Boolean)_datEntL185.getEntityData().get(BlackOstrichEntity.DATA_Leather_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Items.LEATHER_HELMET));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL190
                     && (Boolean)_datEntL190.getEntityData().get(BlackOstrichEntity.DATA_Frost_Scorpion_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.AIR));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL195
                     && (Boolean)_datEntL195.getEntityData().get(BlackOstrichEntity.DATA_Dirt_Scorpion_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.AIR));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL200
                     && (Boolean)_datEntL200.getEntityData().get(BlackOstrichEntity.DATA_Cave_Scorpion_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.AIR));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL205
                     && (Boolean)_datEntL205.getEntityData().get(BlackOstrichEntity.DATA_Nether_Scorpion_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.AIR));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }
               }

               if ((!(sourceentity instanceof LivingEntity _livEnt) ? ItemStack.EMPTY : _livEnt.getMainHandItem()).getItem()
                  == MocreaturesModItems.REPTILE_ARMOR_HELMET.get()) {
                  if (entity instanceof BlackOstrichEntity _datEntL212
                     && (Boolean)_datEntL212.getEntityData().get(BlackOstrichEntity.DATA_Diamond_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Items.DIAMOND_HELMET));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL217
                     && (Boolean)_datEntL217.getEntityData().get(BlackOstrichEntity.DATA_Gold_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Items.GOLDEN_HELMET));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL222
                     && (Boolean)_datEntL222.getEntityData().get(BlackOstrichEntity.DATA_Iron_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Items.IRON_HELMET));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL227
                     && (Boolean)_datEntL227.getEntityData().get(BlackOstrichEntity.DATA_Fur_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(
                        _level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack((ItemLike)MocreaturesModItems.FUR_ARMOR_HELMET.get())
                     );
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL232
                     && (Boolean)_datEntL232.getEntityData().get(BlackOstrichEntity.DATA_Hide_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(
                        _level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack((ItemLike)MocreaturesModItems.HIDE_ARMOR_HELMET.get())
                     );
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL237
                     && (Boolean)_datEntL237.getEntityData().get(BlackOstrichEntity.DATA_Leather_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Items.LEATHER_HELMET));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL242
                     && (Boolean)_datEntL242.getEntityData().get(BlackOstrichEntity.DATA_Frost_Scorpion_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.AIR));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL247
                     && (Boolean)_datEntL247.getEntityData().get(BlackOstrichEntity.DATA_Dirt_Scorpion_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.AIR));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL252
                     && (Boolean)_datEntL252.getEntityData().get(BlackOstrichEntity.DATA_Cave_Scorpion_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.AIR));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL257
                     && (Boolean)_datEntL257.getEntityData().get(BlackOstrichEntity.DATA_Nether_Scorpion_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.AIR));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }
               }

               if ((!(sourceentity instanceof LivingEntity _livEnt) ? ItemStack.EMPTY : _livEnt.getMainHandItem()).getItem()
                  == MocreaturesModItems.HIDE_ARMOR_HELMET.get()) {
                  if (entity instanceof BlackOstrichEntity _datEntL264
                     && (Boolean)_datEntL264.getEntityData().get(BlackOstrichEntity.DATA_Diamond_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Items.DIAMOND_HELMET));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL269
                     && (Boolean)_datEntL269.getEntityData().get(BlackOstrichEntity.DATA_Gold_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Items.GOLDEN_HELMET));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL274
                     && (Boolean)_datEntL274.getEntityData().get(BlackOstrichEntity.DATA_Iron_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Items.IRON_HELMET));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL279
                     && (Boolean)_datEntL279.getEntityData().get(BlackOstrichEntity.DATA_Fur_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(
                        _level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack((ItemLike)MocreaturesModItems.FUR_ARMOR_HELMET.get())
                     );
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL284
                     && (Boolean)_datEntL284.getEntityData().get(BlackOstrichEntity.DATA_Reptile_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(
                        _level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack((ItemLike)MocreaturesModItems.REPTILE_ARMOR_HELMET.get())
                     );
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL289
                     && (Boolean)_datEntL289.getEntityData().get(BlackOstrichEntity.DATA_Leather_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Items.LEATHER_HELMET));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL294
                     && (Boolean)_datEntL294.getEntityData().get(BlackOstrichEntity.DATA_Frost_Scorpion_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.AIR));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL299
                     && (Boolean)_datEntL299.getEntityData().get(BlackOstrichEntity.DATA_Dirt_Scorpion_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.AIR));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL304
                     && (Boolean)_datEntL304.getEntityData().get(BlackOstrichEntity.DATA_Cave_Scorpion_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.AIR));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL309
                     && (Boolean)_datEntL309.getEntityData().get(BlackOstrichEntity.DATA_Nether_Scorpion_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.AIR));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }
               }

               if ((!(sourceentity instanceof LivingEntity _livEnt) ? ItemStack.EMPTY : _livEnt.getMainHandItem()).getItem() == Items.LEATHER_HELMET) {
                  if (entity instanceof BlackOstrichEntity _datEntL316
                     && (Boolean)_datEntL316.getEntityData().get(BlackOstrichEntity.DATA_Diamond_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Items.DIAMOND_HELMET));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL321
                     && (Boolean)_datEntL321.getEntityData().get(BlackOstrichEntity.DATA_Gold_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Items.GOLDEN_HELMET));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL326
                     && (Boolean)_datEntL326.getEntityData().get(BlackOstrichEntity.DATA_Iron_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Items.IRON_HELMET));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL331
                     && (Boolean)_datEntL331.getEntityData().get(BlackOstrichEntity.DATA_Fur_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(
                        _level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack((ItemLike)MocreaturesModItems.FUR_ARMOR_HELMET.get())
                     );
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL336
                     && (Boolean)_datEntL336.getEntityData().get(BlackOstrichEntity.DATA_Reptile_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(
                        _level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack((ItemLike)MocreaturesModItems.REPTILE_ARMOR_HELMET.get())
                     );
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL341
                     && (Boolean)_datEntL341.getEntityData().get(BlackOstrichEntity.DATA_Hide_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(
                        _level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack((ItemLike)MocreaturesModItems.HIDE_ARMOR_HELMET.get())
                     );
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL346
                     && (Boolean)_datEntL346.getEntityData().get(BlackOstrichEntity.DATA_Frost_Scorpion_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.AIR));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL351
                     && (Boolean)_datEntL351.getEntityData().get(BlackOstrichEntity.DATA_Dirt_Scorpion_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.AIR));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL356
                     && (Boolean)_datEntL356.getEntityData().get(BlackOstrichEntity.DATA_Cave_Scorpion_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.AIR));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL361
                     && (Boolean)_datEntL361.getEntityData().get(BlackOstrichEntity.DATA_Nether_Scorpion_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.AIR));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }
               }
            }

            if (entity instanceof TamableAnimal _tamEnt && _tamEnt.isTame()) {
               if ((!(sourceentity instanceof LivingEntity _livEnt) ? ItemStack.EMPTY : _livEnt.getMainHandItem()).getItem() == Blocks.GREEN_WOOL.asItem()) {
                  if (entity instanceof BlackOstrichEntity _datEntL369
                     && (Boolean)_datEntL369.getEntityData().get(BlackOstrichEntity.DATA_LightGreen_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIME_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL374
                     && (Boolean)_datEntL374.getEntityData().get(BlackOstrichEntity.DATA_Blue_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL379
                     && (Boolean)_datEntL379.getEntityData().get(BlackOstrichEntity.DATA_LightBlue_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIGHT_BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL384
                     && (Boolean)_datEntL384.getEntityData().get(BlackOstrichEntity.DATA_Pink_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.PINK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL389
                     && (Boolean)_datEntL389.getEntityData().get(BlackOstrichEntity.DATA_Magenta_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.MAGENTA_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL394
                     && (Boolean)_datEntL394.getEntityData().get(BlackOstrichEntity.DATA_Purple_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.PURPLE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL399
                     && (Boolean)_datEntL399.getEntityData().get(BlackOstrichEntity.DATA_Orange_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.ORANGE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL404
                     && (Boolean)_datEntL404.getEntityData().get(BlackOstrichEntity.DATA_Cyan_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.CYAN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL409
                     && (Boolean)_datEntL409.getEntityData().get(BlackOstrichEntity.DATA_Red_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.RED_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL414
                     && (Boolean)_datEntL414.getEntityData().get(BlackOstrichEntity.DATA_Yellow_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.YELLOW_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL419
                     && (Boolean)_datEntL419.getEntityData().get(BlackOstrichEntity.DATA_White_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.WHITE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL424
                     && (Boolean)_datEntL424.getEntityData().get(BlackOstrichEntity.DATA_Grey_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL429
                     && (Boolean)_datEntL429.getEntityData().get(BlackOstrichEntity.DATA_LightGrey_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIGHT_GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL434
                     && (Boolean)_datEntL434.getEntityData().get(BlackOstrichEntity.DATA_Black_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BLACK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL439
                     && (Boolean)_datEntL439.getEntityData().get(BlackOstrichEntity.DATA_Brown_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BROWN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }
               }

               if ((!(sourceentity instanceof LivingEntity _livEnt) ? ItemStack.EMPTY : _livEnt.getMainHandItem()).getItem() == Blocks.LIME_WOOL.asItem()) {
                  if (entity instanceof BlackOstrichEntity _datEntL446
                     && (Boolean)_datEntL446.getEntityData().get(BlackOstrichEntity.DATA_Green_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.GREEN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL451
                     && (Boolean)_datEntL451.getEntityData().get(BlackOstrichEntity.DATA_Blue_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL456
                     && (Boolean)_datEntL456.getEntityData().get(BlackOstrichEntity.DATA_LightBlue_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIGHT_BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL461
                     && (Boolean)_datEntL461.getEntityData().get(BlackOstrichEntity.DATA_Pink_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.PINK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL466
                     && (Boolean)_datEntL466.getEntityData().get(BlackOstrichEntity.DATA_Magenta_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.MAGENTA_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL471
                     && (Boolean)_datEntL471.getEntityData().get(BlackOstrichEntity.DATA_Purple_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.PURPLE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL476
                     && (Boolean)_datEntL476.getEntityData().get(BlackOstrichEntity.DATA_Orange_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.ORANGE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL481
                     && (Boolean)_datEntL481.getEntityData().get(BlackOstrichEntity.DATA_Cyan_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.CYAN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL486
                     && (Boolean)_datEntL486.getEntityData().get(BlackOstrichEntity.DATA_Red_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.RED_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL491
                     && (Boolean)_datEntL491.getEntityData().get(BlackOstrichEntity.DATA_Yellow_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.YELLOW_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL496
                     && (Boolean)_datEntL496.getEntityData().get(BlackOstrichEntity.DATA_White_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.WHITE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL501
                     && (Boolean)_datEntL501.getEntityData().get(BlackOstrichEntity.DATA_Grey_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL506
                     && (Boolean)_datEntL506.getEntityData().get(BlackOstrichEntity.DATA_LightGrey_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIGHT_GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL511
                     && (Boolean)_datEntL511.getEntityData().get(BlackOstrichEntity.DATA_Black_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BLACK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL516
                     && (Boolean)_datEntL516.getEntityData().get(BlackOstrichEntity.DATA_Brown_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BROWN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }
               }

               if ((!(sourceentity instanceof LivingEntity _livEnt) ? ItemStack.EMPTY : _livEnt.getMainHandItem()).getItem() == Blocks.BLUE_WOOL.asItem()) {
                  if (entity instanceof BlackOstrichEntity _datEntL523
                     && (Boolean)_datEntL523.getEntityData().get(BlackOstrichEntity.DATA_LightGreen_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIME_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL528
                     && (Boolean)_datEntL528.getEntityData().get(BlackOstrichEntity.DATA_Green_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.GREEN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL533
                     && (Boolean)_datEntL533.getEntityData().get(BlackOstrichEntity.DATA_LightBlue_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIGHT_BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL538
                     && (Boolean)_datEntL538.getEntityData().get(BlackOstrichEntity.DATA_Pink_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.PINK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL543
                     && (Boolean)_datEntL543.getEntityData().get(BlackOstrichEntity.DATA_Magenta_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.MAGENTA_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL548
                     && (Boolean)_datEntL548.getEntityData().get(BlackOstrichEntity.DATA_Purple_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.PURPLE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL553
                     && (Boolean)_datEntL553.getEntityData().get(BlackOstrichEntity.DATA_Orange_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.ORANGE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL558
                     && (Boolean)_datEntL558.getEntityData().get(BlackOstrichEntity.DATA_Cyan_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.CYAN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL563
                     && (Boolean)_datEntL563.getEntityData().get(BlackOstrichEntity.DATA_Red_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.RED_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL568
                     && (Boolean)_datEntL568.getEntityData().get(BlackOstrichEntity.DATA_Yellow_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.YELLOW_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL573
                     && (Boolean)_datEntL573.getEntityData().get(BlackOstrichEntity.DATA_White_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.WHITE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL578
                     && (Boolean)_datEntL578.getEntityData().get(BlackOstrichEntity.DATA_Grey_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL583
                     && (Boolean)_datEntL583.getEntityData().get(BlackOstrichEntity.DATA_LightGrey_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIGHT_GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL588
                     && (Boolean)_datEntL588.getEntityData().get(BlackOstrichEntity.DATA_Black_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BLACK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL593
                     && (Boolean)_datEntL593.getEntityData().get(BlackOstrichEntity.DATA_Brown_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BROWN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }
               }

               if ((!(sourceentity instanceof LivingEntity _livEnt) ? ItemStack.EMPTY : _livEnt.getMainHandItem()).getItem() == Blocks.LIGHT_BLUE_WOOL.asItem()
                  )
                {
                  if (entity instanceof BlackOstrichEntity _datEntL600
                     && (Boolean)_datEntL600.getEntityData().get(BlackOstrichEntity.DATA_LightGreen_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIME_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL605
                     && (Boolean)_datEntL605.getEntityData().get(BlackOstrichEntity.DATA_Blue_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL610
                     && (Boolean)_datEntL610.getEntityData().get(BlackOstrichEntity.DATA_Green_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.GREEN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL615
                     && (Boolean)_datEntL615.getEntityData().get(BlackOstrichEntity.DATA_Pink_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.PINK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL620
                     && (Boolean)_datEntL620.getEntityData().get(BlackOstrichEntity.DATA_Magenta_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.MAGENTA_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL625
                     && (Boolean)_datEntL625.getEntityData().get(BlackOstrichEntity.DATA_Purple_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.PURPLE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL630
                     && (Boolean)_datEntL630.getEntityData().get(BlackOstrichEntity.DATA_Orange_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.ORANGE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL635
                     && (Boolean)_datEntL635.getEntityData().get(BlackOstrichEntity.DATA_Cyan_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.CYAN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL640
                     && (Boolean)_datEntL640.getEntityData().get(BlackOstrichEntity.DATA_Red_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.RED_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL645
                     && (Boolean)_datEntL645.getEntityData().get(BlackOstrichEntity.DATA_Yellow_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.YELLOW_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL650
                     && (Boolean)_datEntL650.getEntityData().get(BlackOstrichEntity.DATA_White_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.WHITE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL655
                     && (Boolean)_datEntL655.getEntityData().get(BlackOstrichEntity.DATA_Grey_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL660
                     && (Boolean)_datEntL660.getEntityData().get(BlackOstrichEntity.DATA_LightGrey_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIGHT_GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL665
                     && (Boolean)_datEntL665.getEntityData().get(BlackOstrichEntity.DATA_Black_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BLACK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL670
                     && (Boolean)_datEntL670.getEntityData().get(BlackOstrichEntity.DATA_Brown_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BROWN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }
               }

               if ((!(sourceentity instanceof LivingEntity _livEnt) ? ItemStack.EMPTY : _livEnt.getMainHandItem()).getItem() == Blocks.PINK_WOOL.asItem()) {
                  if (entity instanceof BlackOstrichEntity _datEntL677
                     && (Boolean)_datEntL677.getEntityData().get(BlackOstrichEntity.DATA_LightGreen_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIME_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL682
                     && (Boolean)_datEntL682.getEntityData().get(BlackOstrichEntity.DATA_Blue_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL687
                     && (Boolean)_datEntL687.getEntityData().get(BlackOstrichEntity.DATA_LightBlue_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIGHT_BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL692
                     && (Boolean)_datEntL692.getEntityData().get(BlackOstrichEntity.DATA_Green_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.GREEN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL697
                     && (Boolean)_datEntL697.getEntityData().get(BlackOstrichEntity.DATA_Magenta_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.MAGENTA_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL702
                     && (Boolean)_datEntL702.getEntityData().get(BlackOstrichEntity.DATA_Purple_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.PURPLE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL707
                     && (Boolean)_datEntL707.getEntityData().get(BlackOstrichEntity.DATA_Orange_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.ORANGE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL712
                     && (Boolean)_datEntL712.getEntityData().get(BlackOstrichEntity.DATA_Cyan_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.CYAN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL717
                     && (Boolean)_datEntL717.getEntityData().get(BlackOstrichEntity.DATA_Red_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.RED_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL722
                     && (Boolean)_datEntL722.getEntityData().get(BlackOstrichEntity.DATA_Yellow_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.YELLOW_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL727
                     && (Boolean)_datEntL727.getEntityData().get(BlackOstrichEntity.DATA_White_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.WHITE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL732
                     && (Boolean)_datEntL732.getEntityData().get(BlackOstrichEntity.DATA_Grey_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL737
                     && (Boolean)_datEntL737.getEntityData().get(BlackOstrichEntity.DATA_LightGrey_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIGHT_GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL742
                     && (Boolean)_datEntL742.getEntityData().get(BlackOstrichEntity.DATA_Black_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BLACK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL747
                     && (Boolean)_datEntL747.getEntityData().get(BlackOstrichEntity.DATA_Brown_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BROWN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }
               }

               if ((!(sourceentity instanceof LivingEntity _livEnt) ? ItemStack.EMPTY : _livEnt.getMainHandItem()).getItem() == Blocks.MAGENTA_WOOL.asItem()) {
                  if (entity instanceof BlackOstrichEntity _datEntL754
                     && (Boolean)_datEntL754.getEntityData().get(BlackOstrichEntity.DATA_LightGreen_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIME_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL759
                     && (Boolean)_datEntL759.getEntityData().get(BlackOstrichEntity.DATA_Blue_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL764
                     && (Boolean)_datEntL764.getEntityData().get(BlackOstrichEntity.DATA_LightBlue_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIGHT_BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL769
                     && (Boolean)_datEntL769.getEntityData().get(BlackOstrichEntity.DATA_Pink_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.PINK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL774
                     && (Boolean)_datEntL774.getEntityData().get(BlackOstrichEntity.DATA_Green_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.GREEN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL779
                     && (Boolean)_datEntL779.getEntityData().get(BlackOstrichEntity.DATA_Purple_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.PURPLE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL784
                     && (Boolean)_datEntL784.getEntityData().get(BlackOstrichEntity.DATA_Orange_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.ORANGE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL789
                     && (Boolean)_datEntL789.getEntityData().get(BlackOstrichEntity.DATA_Cyan_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.CYAN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL794
                     && (Boolean)_datEntL794.getEntityData().get(BlackOstrichEntity.DATA_Red_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.RED_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL799
                     && (Boolean)_datEntL799.getEntityData().get(BlackOstrichEntity.DATA_Yellow_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.YELLOW_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL804
                     && (Boolean)_datEntL804.getEntityData().get(BlackOstrichEntity.DATA_White_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.WHITE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL809
                     && (Boolean)_datEntL809.getEntityData().get(BlackOstrichEntity.DATA_Grey_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL814
                     && (Boolean)_datEntL814.getEntityData().get(BlackOstrichEntity.DATA_LightGrey_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIGHT_GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL819
                     && (Boolean)_datEntL819.getEntityData().get(BlackOstrichEntity.DATA_Black_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BLACK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL824
                     && (Boolean)_datEntL824.getEntityData().get(BlackOstrichEntity.DATA_Brown_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BROWN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }
               }

               if ((!(sourceentity instanceof LivingEntity _livEnt) ? ItemStack.EMPTY : _livEnt.getMainHandItem()).getItem() == Blocks.PURPLE_WOOL.asItem()) {
                  if (entity instanceof BlackOstrichEntity _datEntL831
                     && (Boolean)_datEntL831.getEntityData().get(BlackOstrichEntity.DATA_LightGreen_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIME_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL836
                     && (Boolean)_datEntL836.getEntityData().get(BlackOstrichEntity.DATA_Blue_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL841
                     && (Boolean)_datEntL841.getEntityData().get(BlackOstrichEntity.DATA_LightBlue_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIGHT_BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL846
                     && (Boolean)_datEntL846.getEntityData().get(BlackOstrichEntity.DATA_Pink_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.PINK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL851
                     && (Boolean)_datEntL851.getEntityData().get(BlackOstrichEntity.DATA_Magenta_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.MAGENTA_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL856
                     && (Boolean)_datEntL856.getEntityData().get(BlackOstrichEntity.DATA_Green_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.GREEN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL861
                     && (Boolean)_datEntL861.getEntityData().get(BlackOstrichEntity.DATA_Orange_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.ORANGE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL866
                     && (Boolean)_datEntL866.getEntityData().get(BlackOstrichEntity.DATA_Cyan_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.CYAN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL871
                     && (Boolean)_datEntL871.getEntityData().get(BlackOstrichEntity.DATA_Red_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.RED_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL876
                     && (Boolean)_datEntL876.getEntityData().get(BlackOstrichEntity.DATA_Yellow_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.YELLOW_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL881
                     && (Boolean)_datEntL881.getEntityData().get(BlackOstrichEntity.DATA_White_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.WHITE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL886
                     && (Boolean)_datEntL886.getEntityData().get(BlackOstrichEntity.DATA_Grey_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL891
                     && (Boolean)_datEntL891.getEntityData().get(BlackOstrichEntity.DATA_LightGrey_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIGHT_GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL896
                     && (Boolean)_datEntL896.getEntityData().get(BlackOstrichEntity.DATA_Black_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BLACK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL901
                     && (Boolean)_datEntL901.getEntityData().get(BlackOstrichEntity.DATA_Brown_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BROWN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }
               }

               if ((!(sourceentity instanceof LivingEntity _livEnt) ? ItemStack.EMPTY : _livEnt.getMainHandItem()).getItem() == Blocks.ORANGE_WOOL.asItem()) {
                  if (entity instanceof BlackOstrichEntity _datEntL908
                     && (Boolean)_datEntL908.getEntityData().get(BlackOstrichEntity.DATA_LightGreen_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIME_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL913
                     && (Boolean)_datEntL913.getEntityData().get(BlackOstrichEntity.DATA_Blue_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL918
                     && (Boolean)_datEntL918.getEntityData().get(BlackOstrichEntity.DATA_LightBlue_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIGHT_BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL923
                     && (Boolean)_datEntL923.getEntityData().get(BlackOstrichEntity.DATA_Pink_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.PINK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL928
                     && (Boolean)_datEntL928.getEntityData().get(BlackOstrichEntity.DATA_Magenta_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.MAGENTA_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL933
                     && (Boolean)_datEntL933.getEntityData().get(BlackOstrichEntity.DATA_Purple_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.PURPLE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL938
                     && (Boolean)_datEntL938.getEntityData().get(BlackOstrichEntity.DATA_Green_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.GREEN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL943
                     && (Boolean)_datEntL943.getEntityData().get(BlackOstrichEntity.DATA_Cyan_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.CYAN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL948
                     && (Boolean)_datEntL948.getEntityData().get(BlackOstrichEntity.DATA_Red_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.RED_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL953
                     && (Boolean)_datEntL953.getEntityData().get(BlackOstrichEntity.DATA_Yellow_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.YELLOW_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL958
                     && (Boolean)_datEntL958.getEntityData().get(BlackOstrichEntity.DATA_White_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.WHITE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL963
                     && (Boolean)_datEntL963.getEntityData().get(BlackOstrichEntity.DATA_Grey_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL968
                     && (Boolean)_datEntL968.getEntityData().get(BlackOstrichEntity.DATA_LightGrey_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIGHT_GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL973
                     && (Boolean)_datEntL973.getEntityData().get(BlackOstrichEntity.DATA_Black_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BLACK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL978
                     && (Boolean)_datEntL978.getEntityData().get(BlackOstrichEntity.DATA_Brown_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BROWN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }
               }

               if ((!(sourceentity instanceof LivingEntity _livEnt) ? ItemStack.EMPTY : _livEnt.getMainHandItem()).getItem() == Blocks.CYAN_WOOL.asItem()) {
                  if (entity instanceof BlackOstrichEntity _datEntL985
                     && (Boolean)_datEntL985.getEntityData().get(BlackOstrichEntity.DATA_LightGreen_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIME_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL990
                     && (Boolean)_datEntL990.getEntityData().get(BlackOstrichEntity.DATA_Blue_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL995
                     && (Boolean)_datEntL995.getEntityData().get(BlackOstrichEntity.DATA_LightBlue_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIGHT_BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1000
                     && (Boolean)_datEntL1000.getEntityData().get(BlackOstrichEntity.DATA_Pink_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.PINK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1005
                     && (Boolean)_datEntL1005.getEntityData().get(BlackOstrichEntity.DATA_Magenta_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.MAGENTA_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1010
                     && (Boolean)_datEntL1010.getEntityData().get(BlackOstrichEntity.DATA_Purple_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.PURPLE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1015
                     && (Boolean)_datEntL1015.getEntityData().get(BlackOstrichEntity.DATA_Orange_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.ORANGE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1020
                     && (Boolean)_datEntL1020.getEntityData().get(BlackOstrichEntity.DATA_Green_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.GREEN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1025
                     && (Boolean)_datEntL1025.getEntityData().get(BlackOstrichEntity.DATA_Red_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.RED_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1030
                     && (Boolean)_datEntL1030.getEntityData().get(BlackOstrichEntity.DATA_Yellow_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.YELLOW_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1035
                     && (Boolean)_datEntL1035.getEntityData().get(BlackOstrichEntity.DATA_White_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.WHITE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1040
                     && (Boolean)_datEntL1040.getEntityData().get(BlackOstrichEntity.DATA_Grey_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1045
                     && (Boolean)_datEntL1045.getEntityData().get(BlackOstrichEntity.DATA_LightGrey_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIGHT_GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1050
                     && (Boolean)_datEntL1050.getEntityData().get(BlackOstrichEntity.DATA_Black_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BLACK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1055
                     && (Boolean)_datEntL1055.getEntityData().get(BlackOstrichEntity.DATA_Brown_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BROWN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }
               }

               if ((!(sourceentity instanceof LivingEntity _livEnt) ? ItemStack.EMPTY : _livEnt.getMainHandItem()).getItem() == Blocks.RED_WOOL.asItem()) {
                  if (entity instanceof BlackOstrichEntity _datEntL1062
                     && (Boolean)_datEntL1062.getEntityData().get(BlackOstrichEntity.DATA_LightGreen_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIME_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1067
                     && (Boolean)_datEntL1067.getEntityData().get(BlackOstrichEntity.DATA_Blue_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1072
                     && (Boolean)_datEntL1072.getEntityData().get(BlackOstrichEntity.DATA_LightBlue_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIGHT_BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1077
                     && (Boolean)_datEntL1077.getEntityData().get(BlackOstrichEntity.DATA_Pink_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.PINK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1082
                     && (Boolean)_datEntL1082.getEntityData().get(BlackOstrichEntity.DATA_Magenta_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.MAGENTA_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1087
                     && (Boolean)_datEntL1087.getEntityData().get(BlackOstrichEntity.DATA_Purple_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.PURPLE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1092
                     && (Boolean)_datEntL1092.getEntityData().get(BlackOstrichEntity.DATA_Orange_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.ORANGE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1097
                     && (Boolean)_datEntL1097.getEntityData().get(BlackOstrichEntity.DATA_Cyan_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.CYAN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1102
                     && (Boolean)_datEntL1102.getEntityData().get(BlackOstrichEntity.DATA_Green_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.GREEN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1107
                     && (Boolean)_datEntL1107.getEntityData().get(BlackOstrichEntity.DATA_Yellow_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.YELLOW_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1112
                     && (Boolean)_datEntL1112.getEntityData().get(BlackOstrichEntity.DATA_White_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.WHITE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1117
                     && (Boolean)_datEntL1117.getEntityData().get(BlackOstrichEntity.DATA_Grey_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1122
                     && (Boolean)_datEntL1122.getEntityData().get(BlackOstrichEntity.DATA_LightGrey_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIGHT_GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1127
                     && (Boolean)_datEntL1127.getEntityData().get(BlackOstrichEntity.DATA_Black_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BLACK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1132
                     && (Boolean)_datEntL1132.getEntityData().get(BlackOstrichEntity.DATA_Brown_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BROWN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }
               }

               if ((!(sourceentity instanceof LivingEntity _livEnt) ? ItemStack.EMPTY : _livEnt.getMainHandItem()).getItem() == Blocks.YELLOW_WOOL.asItem()) {
                  if (entity instanceof BlackOstrichEntity _datEntL1139
                     && (Boolean)_datEntL1139.getEntityData().get(BlackOstrichEntity.DATA_LightGreen_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIME_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1144
                     && (Boolean)_datEntL1144.getEntityData().get(BlackOstrichEntity.DATA_Blue_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1149
                     && (Boolean)_datEntL1149.getEntityData().get(BlackOstrichEntity.DATA_LightBlue_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIGHT_BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1154
                     && (Boolean)_datEntL1154.getEntityData().get(BlackOstrichEntity.DATA_Pink_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.PINK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1159
                     && (Boolean)_datEntL1159.getEntityData().get(BlackOstrichEntity.DATA_Magenta_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.MAGENTA_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1164
                     && (Boolean)_datEntL1164.getEntityData().get(BlackOstrichEntity.DATA_Purple_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.PURPLE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1169
                     && (Boolean)_datEntL1169.getEntityData().get(BlackOstrichEntity.DATA_Orange_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.ORANGE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1174
                     && (Boolean)_datEntL1174.getEntityData().get(BlackOstrichEntity.DATA_Cyan_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.CYAN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1179
                     && (Boolean)_datEntL1179.getEntityData().get(BlackOstrichEntity.DATA_Red_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.RED_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1184
                     && (Boolean)_datEntL1184.getEntityData().get(BlackOstrichEntity.DATA_Green_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.GREEN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1189
                     && (Boolean)_datEntL1189.getEntityData().get(BlackOstrichEntity.DATA_White_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.WHITE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1194
                     && (Boolean)_datEntL1194.getEntityData().get(BlackOstrichEntity.DATA_Grey_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1199
                     && (Boolean)_datEntL1199.getEntityData().get(BlackOstrichEntity.DATA_LightGrey_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIGHT_GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1204
                     && (Boolean)_datEntL1204.getEntityData().get(BlackOstrichEntity.DATA_Black_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BLACK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1209
                     && (Boolean)_datEntL1209.getEntityData().get(BlackOstrichEntity.DATA_Brown_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BROWN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }
               }

               if ((!(sourceentity instanceof LivingEntity _livEnt) ? ItemStack.EMPTY : _livEnt.getMainHandItem()).getItem() == Blocks.WHITE_WOOL.asItem()) {
                  if (entity instanceof BlackOstrichEntity _datEntL1216
                     && (Boolean)_datEntL1216.getEntityData().get(BlackOstrichEntity.DATA_LightGreen_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIME_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1221
                     && (Boolean)_datEntL1221.getEntityData().get(BlackOstrichEntity.DATA_Blue_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1226
                     && (Boolean)_datEntL1226.getEntityData().get(BlackOstrichEntity.DATA_LightBlue_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIGHT_BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1231
                     && (Boolean)_datEntL1231.getEntityData().get(BlackOstrichEntity.DATA_Pink_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.PINK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1236
                     && (Boolean)_datEntL1236.getEntityData().get(BlackOstrichEntity.DATA_Magenta_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.MAGENTA_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1241
                     && (Boolean)_datEntL1241.getEntityData().get(BlackOstrichEntity.DATA_Purple_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.PURPLE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1246
                     && (Boolean)_datEntL1246.getEntityData().get(BlackOstrichEntity.DATA_Orange_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.ORANGE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1251
                     && (Boolean)_datEntL1251.getEntityData().get(BlackOstrichEntity.DATA_Cyan_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.CYAN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1256
                     && (Boolean)_datEntL1256.getEntityData().get(BlackOstrichEntity.DATA_Red_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.RED_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1261
                     && (Boolean)_datEntL1261.getEntityData().get(BlackOstrichEntity.DATA_Yellow_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.YELLOW_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1266
                     && (Boolean)_datEntL1266.getEntityData().get(BlackOstrichEntity.DATA_Green_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.GREEN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1271
                     && (Boolean)_datEntL1271.getEntityData().get(BlackOstrichEntity.DATA_Grey_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1276
                     && (Boolean)_datEntL1276.getEntityData().get(BlackOstrichEntity.DATA_LightGrey_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIGHT_GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1281
                     && (Boolean)_datEntL1281.getEntityData().get(BlackOstrichEntity.DATA_Black_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BLACK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1286
                     && (Boolean)_datEntL1286.getEntityData().get(BlackOstrichEntity.DATA_Brown_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BROWN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }
               }

               if ((!(sourceentity instanceof LivingEntity _livEnt) ? ItemStack.EMPTY : _livEnt.getMainHandItem()).getItem() == Blocks.GRAY_WOOL.asItem()) {
                  if (entity instanceof BlackOstrichEntity _datEntL1293
                     && (Boolean)_datEntL1293.getEntityData().get(BlackOstrichEntity.DATA_LightGreen_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIME_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1298
                     && (Boolean)_datEntL1298.getEntityData().get(BlackOstrichEntity.DATA_Blue_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1303
                     && (Boolean)_datEntL1303.getEntityData().get(BlackOstrichEntity.DATA_LightBlue_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIGHT_BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1308
                     && (Boolean)_datEntL1308.getEntityData().get(BlackOstrichEntity.DATA_Pink_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.PINK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1313
                     && (Boolean)_datEntL1313.getEntityData().get(BlackOstrichEntity.DATA_Magenta_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.MAGENTA_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1318
                     && (Boolean)_datEntL1318.getEntityData().get(BlackOstrichEntity.DATA_Purple_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.PURPLE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1323
                     && (Boolean)_datEntL1323.getEntityData().get(BlackOstrichEntity.DATA_Orange_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.ORANGE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1328
                     && (Boolean)_datEntL1328.getEntityData().get(BlackOstrichEntity.DATA_Cyan_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.CYAN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1333
                     && (Boolean)_datEntL1333.getEntityData().get(BlackOstrichEntity.DATA_Red_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.RED_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1338
                     && (Boolean)_datEntL1338.getEntityData().get(BlackOstrichEntity.DATA_Yellow_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.YELLOW_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1343
                     && (Boolean)_datEntL1343.getEntityData().get(BlackOstrichEntity.DATA_White_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.WHITE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1348
                     && (Boolean)_datEntL1348.getEntityData().get(BlackOstrichEntity.DATA_Green_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.GREEN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1353
                     && (Boolean)_datEntL1353.getEntityData().get(BlackOstrichEntity.DATA_LightGrey_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIGHT_GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1358
                     && (Boolean)_datEntL1358.getEntityData().get(BlackOstrichEntity.DATA_Black_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BLACK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1363
                     && (Boolean)_datEntL1363.getEntityData().get(BlackOstrichEntity.DATA_Brown_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BROWN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }
               }

               if ((!(sourceentity instanceof LivingEntity _livEnt) ? ItemStack.EMPTY : _livEnt.getMainHandItem()).getItem() == Blocks.LIGHT_GRAY_WOOL.asItem()
                  )
                {
                  if (entity instanceof BlackOstrichEntity _datEntL1370
                     && (Boolean)_datEntL1370.getEntityData().get(BlackOstrichEntity.DATA_LightGreen_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIME_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1375
                     && (Boolean)_datEntL1375.getEntityData().get(BlackOstrichEntity.DATA_Blue_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1380
                     && (Boolean)_datEntL1380.getEntityData().get(BlackOstrichEntity.DATA_LightBlue_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIGHT_BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1385
                     && (Boolean)_datEntL1385.getEntityData().get(BlackOstrichEntity.DATA_Pink_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.PINK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1390
                     && (Boolean)_datEntL1390.getEntityData().get(BlackOstrichEntity.DATA_Magenta_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.MAGENTA_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1395
                     && (Boolean)_datEntL1395.getEntityData().get(BlackOstrichEntity.DATA_Purple_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.PURPLE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1400
                     && (Boolean)_datEntL1400.getEntityData().get(BlackOstrichEntity.DATA_Orange_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.ORANGE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1405
                     && (Boolean)_datEntL1405.getEntityData().get(BlackOstrichEntity.DATA_Cyan_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.CYAN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1410
                     && (Boolean)_datEntL1410.getEntityData().get(BlackOstrichEntity.DATA_Red_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.RED_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1415
                     && (Boolean)_datEntL1415.getEntityData().get(BlackOstrichEntity.DATA_Yellow_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.YELLOW_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1420
                     && (Boolean)_datEntL1420.getEntityData().get(BlackOstrichEntity.DATA_White_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.WHITE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1425
                     && (Boolean)_datEntL1425.getEntityData().get(BlackOstrichEntity.DATA_Grey_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1430
                     && (Boolean)_datEntL1430.getEntityData().get(BlackOstrichEntity.DATA_Green_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.GREEN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1435
                     && (Boolean)_datEntL1435.getEntityData().get(BlackOstrichEntity.DATA_Black_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BLACK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1440
                     && (Boolean)_datEntL1440.getEntityData().get(BlackOstrichEntity.DATA_Brown_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BROWN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }
               }

               if ((!(sourceentity instanceof LivingEntity _livEnt) ? ItemStack.EMPTY : _livEnt.getMainHandItem()).getItem() == Blocks.BLACK_WOOL.asItem()) {
                  if (entity instanceof BlackOstrichEntity _datEntL1447
                     && (Boolean)_datEntL1447.getEntityData().get(BlackOstrichEntity.DATA_LightGreen_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIME_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1452
                     && (Boolean)_datEntL1452.getEntityData().get(BlackOstrichEntity.DATA_Blue_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1457
                     && (Boolean)_datEntL1457.getEntityData().get(BlackOstrichEntity.DATA_LightBlue_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIGHT_BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1462
                     && (Boolean)_datEntL1462.getEntityData().get(BlackOstrichEntity.DATA_Pink_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.PINK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1467
                     && (Boolean)_datEntL1467.getEntityData().get(BlackOstrichEntity.DATA_Magenta_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.MAGENTA_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1472
                     && (Boolean)_datEntL1472.getEntityData().get(BlackOstrichEntity.DATA_Purple_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.PURPLE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1477
                     && (Boolean)_datEntL1477.getEntityData().get(BlackOstrichEntity.DATA_Orange_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.ORANGE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1482
                     && (Boolean)_datEntL1482.getEntityData().get(BlackOstrichEntity.DATA_Cyan_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.CYAN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1487
                     && (Boolean)_datEntL1487.getEntityData().get(BlackOstrichEntity.DATA_Red_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.RED_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1492
                     && (Boolean)_datEntL1492.getEntityData().get(BlackOstrichEntity.DATA_Yellow_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.YELLOW_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1497
                     && (Boolean)_datEntL1497.getEntityData().get(BlackOstrichEntity.DATA_White_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.WHITE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1502
                     && (Boolean)_datEntL1502.getEntityData().get(BlackOstrichEntity.DATA_Grey_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1507
                     && (Boolean)_datEntL1507.getEntityData().get(BlackOstrichEntity.DATA_LightGrey_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIGHT_GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1512
                     && (Boolean)_datEntL1512.getEntityData().get(BlackOstrichEntity.DATA_Green_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.GREEN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1517
                     && (Boolean)_datEntL1517.getEntityData().get(BlackOstrichEntity.DATA_Brown_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BROWN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }
               }

               if ((!(sourceentity instanceof LivingEntity _livEnt) ? ItemStack.EMPTY : _livEnt.getMainHandItem()).getItem() == Blocks.BROWN_WOOL.asItem()) {
                  if (entity instanceof BlackOstrichEntity _datEntL1524
                     && (Boolean)_datEntL1524.getEntityData().get(BlackOstrichEntity.DATA_LightGreen_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIME_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1529
                     && (Boolean)_datEntL1529.getEntityData().get(BlackOstrichEntity.DATA_Blue_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1534
                     && (Boolean)_datEntL1534.getEntityData().get(BlackOstrichEntity.DATA_LightBlue_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIGHT_BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1539
                     && (Boolean)_datEntL1539.getEntityData().get(BlackOstrichEntity.DATA_Pink_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.PINK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1544
                     && (Boolean)_datEntL1544.getEntityData().get(BlackOstrichEntity.DATA_Magenta_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.MAGENTA_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1549
                     && (Boolean)_datEntL1549.getEntityData().get(BlackOstrichEntity.DATA_Purple_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.PURPLE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1554
                     && (Boolean)_datEntL1554.getEntityData().get(BlackOstrichEntity.DATA_Orange_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.ORANGE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1559
                     && (Boolean)_datEntL1559.getEntityData().get(BlackOstrichEntity.DATA_Cyan_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.CYAN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1564
                     && (Boolean)_datEntL1564.getEntityData().get(BlackOstrichEntity.DATA_Red_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.RED_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1569
                     && (Boolean)_datEntL1569.getEntityData().get(BlackOstrichEntity.DATA_Yellow_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.YELLOW_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1574
                     && (Boolean)_datEntL1574.getEntityData().get(BlackOstrichEntity.DATA_White_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.WHITE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1579
                     && (Boolean)_datEntL1579.getEntityData().get(BlackOstrichEntity.DATA_Grey_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1584
                     && (Boolean)_datEntL1584.getEntityData().get(BlackOstrichEntity.DATA_LightGrey_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIGHT_GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1589
                     && (Boolean)_datEntL1589.getEntityData().get(BlackOstrichEntity.DATA_Black_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BLACK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof BlackOstrichEntity _datEntL1594
                     && (Boolean)_datEntL1594.getEntityData().get(BlackOstrichEntity.DATA_Green_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.GREEN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }
               }
            }
         }
      }
   }
}
