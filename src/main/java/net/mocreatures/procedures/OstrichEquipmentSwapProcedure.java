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
import net.mocreatures.entity.OstrichEntity;
import net.mocreatures.init.MocreaturesModItems;
import net.neoforged.bus.api.Event;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent.EntityInteract;

@EventBusSubscriber
public class OstrichEquipmentSwapProcedure {
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
         if (entity instanceof OstrichEntity) {
            if (entity instanceof TamableAnimal _tamEnt && _tamEnt.isTame()) {
               if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.DIAMOND_HELMET) {
                  if (entity instanceof OstrichEntity _datEntL4
                     && (Boolean)_datEntL4.getEntityData().get(OstrichEntity.DATA_Gold_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Items.GOLDEN_HELMET));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL9
                     && (Boolean)_datEntL9.getEntityData().get(OstrichEntity.DATA_Iron_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Items.IRON_HELMET));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL14
                     && (Boolean)_datEntL14.getEntityData().get(OstrichEntity.DATA_Fur_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(
                        _level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack((ItemLike)MocreaturesModItems.FUR_ARMOR_HELMET.get())
                     );
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL19
                     && (Boolean)_datEntL19.getEntityData().get(OstrichEntity.DATA_Reptile_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(
                        _level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack((ItemLike)MocreaturesModItems.REPTILE_ARMOR_HELMET.get())
                     );
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL24
                     && (Boolean)_datEntL24.getEntityData().get(OstrichEntity.DATA_Hide_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(
                        _level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack((ItemLike)MocreaturesModItems.HIDE_ARMOR_HELMET.get())
                     );
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL29
                     && (Boolean)_datEntL29.getEntityData().get(OstrichEntity.DATA_Leather_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Items.LEATHER_HELMET));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }
               }

               if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.GOLDEN_HELMET) {
                  if (entity instanceof OstrichEntity _datEntL36
                     && (Boolean)_datEntL36.getEntityData().get(OstrichEntity.DATA_Diamond_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Items.DIAMOND_HELMET));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL41
                     && (Boolean)_datEntL41.getEntityData().get(OstrichEntity.DATA_Iron_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Items.IRON_HELMET));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL46
                     && (Boolean)_datEntL46.getEntityData().get(OstrichEntity.DATA_Fur_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(
                        _level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack((ItemLike)MocreaturesModItems.FUR_ARMOR_HELMET.get())
                     );
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL51
                     && (Boolean)_datEntL51.getEntityData().get(OstrichEntity.DATA_Reptile_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(
                        _level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack((ItemLike)MocreaturesModItems.REPTILE_ARMOR_HELMET.get())
                     );
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL56
                     && (Boolean)_datEntL56.getEntityData().get(OstrichEntity.DATA_Hide_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(
                        _level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack((ItemLike)MocreaturesModItems.HIDE_ARMOR_HELMET.get())
                     );
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL61
                     && (Boolean)_datEntL61.getEntityData().get(OstrichEntity.DATA_Leather_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Items.LEATHER_HELMET));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }
               }

               if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.IRON_HELMET) {
                  if (entity instanceof OstrichEntity _datEntL68
                     && (Boolean)_datEntL68.getEntityData().get(OstrichEntity.DATA_Diamond_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Items.DIAMOND_HELMET));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL73
                     && (Boolean)_datEntL73.getEntityData().get(OstrichEntity.DATA_Gold_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Items.GOLDEN_HELMET));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL78
                     && (Boolean)_datEntL78.getEntityData().get(OstrichEntity.DATA_Fur_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(
                        _level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack((ItemLike)MocreaturesModItems.FUR_ARMOR_HELMET.get())
                     );
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL83
                     && (Boolean)_datEntL83.getEntityData().get(OstrichEntity.DATA_Reptile_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(
                        _level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack((ItemLike)MocreaturesModItems.REPTILE_ARMOR_HELMET.get())
                     );
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL88
                     && (Boolean)_datEntL88.getEntityData().get(OstrichEntity.DATA_Hide_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(
                        _level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack((ItemLike)MocreaturesModItems.HIDE_ARMOR_HELMET.get())
                     );
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL93
                     && (Boolean)_datEntL93.getEntityData().get(OstrichEntity.DATA_Leather_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Items.LEATHER_HELMET));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }
               }

               if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()
                  == MocreaturesModItems.FUR_ARMOR_HELMET.get()) {
                  if (entity instanceof OstrichEntity _datEntL100
                     && (Boolean)_datEntL100.getEntityData().get(OstrichEntity.DATA_Diamond_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Items.DIAMOND_HELMET));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL105
                     && (Boolean)_datEntL105.getEntityData().get(OstrichEntity.DATA_Gold_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Items.GOLDEN_HELMET));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL110
                     && (Boolean)_datEntL110.getEntityData().get(OstrichEntity.DATA_Iron_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Items.IRON_HELMET));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL115
                     && (Boolean)_datEntL115.getEntityData().get(OstrichEntity.DATA_Reptile_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(
                        _level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack((ItemLike)MocreaturesModItems.REPTILE_ARMOR_HELMET.get())
                     );
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL120
                     && (Boolean)_datEntL120.getEntityData().get(OstrichEntity.DATA_Hide_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(
                        _level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack((ItemLike)MocreaturesModItems.HIDE_ARMOR_HELMET.get())
                     );
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL125
                     && (Boolean)_datEntL125.getEntityData().get(OstrichEntity.DATA_Leather_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Items.LEATHER_HELMET));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }
               }

               if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()
                  == MocreaturesModItems.REPTILE_ARMOR_HELMET.get()) {
                  if (entity instanceof OstrichEntity _datEntL132
                     && (Boolean)_datEntL132.getEntityData().get(OstrichEntity.DATA_Diamond_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Items.DIAMOND_HELMET));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL137
                     && (Boolean)_datEntL137.getEntityData().get(OstrichEntity.DATA_Gold_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Items.GOLDEN_HELMET));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL142
                     && (Boolean)_datEntL142.getEntityData().get(OstrichEntity.DATA_Iron_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Items.IRON_HELMET));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL147
                     && (Boolean)_datEntL147.getEntityData().get(OstrichEntity.DATA_Fur_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(
                        _level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack((ItemLike)MocreaturesModItems.FUR_ARMOR_HELMET.get())
                     );
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL152
                     && (Boolean)_datEntL152.getEntityData().get(OstrichEntity.DATA_Hide_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(
                        _level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack((ItemLike)MocreaturesModItems.HIDE_ARMOR_HELMET.get())
                     );
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL157
                     && (Boolean)_datEntL157.getEntityData().get(OstrichEntity.DATA_Leather_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Items.LEATHER_HELMET));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }
               }

               if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()
                  == MocreaturesModItems.HIDE_ARMOR_HELMET.get()) {
                  if (entity instanceof OstrichEntity _datEntL164
                     && (Boolean)_datEntL164.getEntityData().get(OstrichEntity.DATA_Diamond_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Items.DIAMOND_HELMET));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL169
                     && (Boolean)_datEntL169.getEntityData().get(OstrichEntity.DATA_Gold_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Items.GOLDEN_HELMET));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL174
                     && (Boolean)_datEntL174.getEntityData().get(OstrichEntity.DATA_Iron_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Items.IRON_HELMET));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL179
                     && (Boolean)_datEntL179.getEntityData().get(OstrichEntity.DATA_Fur_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(
                        _level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack((ItemLike)MocreaturesModItems.FUR_ARMOR_HELMET.get())
                     );
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL184
                     && (Boolean)_datEntL184.getEntityData().get(OstrichEntity.DATA_Reptile_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(
                        _level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack((ItemLike)MocreaturesModItems.REPTILE_ARMOR_HELMET.get())
                     );
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL189
                     && (Boolean)_datEntL189.getEntityData().get(OstrichEntity.DATA_Leather_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Items.LEATHER_HELMET));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }
               }

               if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.LEATHER_HELMET) {
                  if (entity instanceof OstrichEntity _datEntL196
                     && (Boolean)_datEntL196.getEntityData().get(OstrichEntity.DATA_Diamond_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Items.DIAMOND_HELMET));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL201
                     && (Boolean)_datEntL201.getEntityData().get(OstrichEntity.DATA_Gold_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Items.GOLDEN_HELMET));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL206
                     && (Boolean)_datEntL206.getEntityData().get(OstrichEntity.DATA_Iron_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Items.IRON_HELMET));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL211
                     && (Boolean)_datEntL211.getEntityData().get(OstrichEntity.DATA_Fur_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(
                        _level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack((ItemLike)MocreaturesModItems.FUR_ARMOR_HELMET.get())
                     );
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL216
                     && (Boolean)_datEntL216.getEntityData().get(OstrichEntity.DATA_Reptile_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(
                        _level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack((ItemLike)MocreaturesModItems.REPTILE_ARMOR_HELMET.get())
                     );
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL221
                     && (Boolean)_datEntL221.getEntityData().get(OstrichEntity.DATA_Hide_Helmet)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(
                        _level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack((ItemLike)MocreaturesModItems.HIDE_ARMOR_HELMET.get())
                     );
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }
               }
            }

            if (entity instanceof TamableAnimal _tamEnt && _tamEnt.isTame()) {
               if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.GREEN_WOOL.asItem()) {
                  if (entity instanceof OstrichEntity _datEntL229
                     && (Boolean)_datEntL229.getEntityData().get(OstrichEntity.DATA_LightGreen_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIME_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL234
                     && (Boolean)_datEntL234.getEntityData().get(OstrichEntity.DATA_Blue_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL239
                     && (Boolean)_datEntL239.getEntityData().get(OstrichEntity.DATA_LightBlue_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIGHT_BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL244
                     && (Boolean)_datEntL244.getEntityData().get(OstrichEntity.DATA_Pink_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.PINK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL249
                     && (Boolean)_datEntL249.getEntityData().get(OstrichEntity.DATA_Magenta_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.MAGENTA_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL254
                     && (Boolean)_datEntL254.getEntityData().get(OstrichEntity.DATA_Purple_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.PURPLE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL259
                     && (Boolean)_datEntL259.getEntityData().get(OstrichEntity.DATA_Orange_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.ORANGE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL264
                     && (Boolean)_datEntL264.getEntityData().get(OstrichEntity.DATA_Cyan_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.CYAN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL269
                     && (Boolean)_datEntL269.getEntityData().get(OstrichEntity.DATA_Red_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.RED_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL274
                     && (Boolean)_datEntL274.getEntityData().get(OstrichEntity.DATA_Yellow_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.YELLOW_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL279
                     && (Boolean)_datEntL279.getEntityData().get(OstrichEntity.DATA_White_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.WHITE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL284
                     && (Boolean)_datEntL284.getEntityData().get(OstrichEntity.DATA_Grey_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL289
                     && (Boolean)_datEntL289.getEntityData().get(OstrichEntity.DATA_LightGrey_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIGHT_GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL294
                     && (Boolean)_datEntL294.getEntityData().get(OstrichEntity.DATA_Black_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BLACK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL299
                     && (Boolean)_datEntL299.getEntityData().get(OstrichEntity.DATA_Brown_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BROWN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }
               }

               if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.LIME_WOOL.asItem()) {
                  if (entity instanceof OstrichEntity _datEntL306
                     && (Boolean)_datEntL306.getEntityData().get(OstrichEntity.DATA_Green_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.GREEN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL311
                     && (Boolean)_datEntL311.getEntityData().get(OstrichEntity.DATA_Blue_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL316
                     && (Boolean)_datEntL316.getEntityData().get(OstrichEntity.DATA_LightBlue_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIGHT_BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL321
                     && (Boolean)_datEntL321.getEntityData().get(OstrichEntity.DATA_Pink_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.PINK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL326
                     && (Boolean)_datEntL326.getEntityData().get(OstrichEntity.DATA_Magenta_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.MAGENTA_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL331
                     && (Boolean)_datEntL331.getEntityData().get(OstrichEntity.DATA_Purple_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.PURPLE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL336
                     && (Boolean)_datEntL336.getEntityData().get(OstrichEntity.DATA_Orange_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.ORANGE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL341
                     && (Boolean)_datEntL341.getEntityData().get(OstrichEntity.DATA_Cyan_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.CYAN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL346
                     && (Boolean)_datEntL346.getEntityData().get(OstrichEntity.DATA_Red_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.RED_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL351
                     && (Boolean)_datEntL351.getEntityData().get(OstrichEntity.DATA_Yellow_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.YELLOW_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL356
                     && (Boolean)_datEntL356.getEntityData().get(OstrichEntity.DATA_White_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.WHITE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL361
                     && (Boolean)_datEntL361.getEntityData().get(OstrichEntity.DATA_Grey_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL366
                     && (Boolean)_datEntL366.getEntityData().get(OstrichEntity.DATA_LightGrey_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIGHT_GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL371
                     && (Boolean)_datEntL371.getEntityData().get(OstrichEntity.DATA_Black_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BLACK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL376
                     && (Boolean)_datEntL376.getEntityData().get(OstrichEntity.DATA_Brown_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BROWN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }
               }

               if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.BLUE_WOOL.asItem()) {
                  if (entity instanceof OstrichEntity _datEntL383
                     && (Boolean)_datEntL383.getEntityData().get(OstrichEntity.DATA_Green_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.GREEN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL388
                     && (Boolean)_datEntL388.getEntityData().get(OstrichEntity.DATA_LightGreen_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIME_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL393
                     && (Boolean)_datEntL393.getEntityData().get(OstrichEntity.DATA_LightBlue_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIGHT_BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL398
                     && (Boolean)_datEntL398.getEntityData().get(OstrichEntity.DATA_Pink_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.PINK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL403
                     && (Boolean)_datEntL403.getEntityData().get(OstrichEntity.DATA_Magenta_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.MAGENTA_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL408
                     && (Boolean)_datEntL408.getEntityData().get(OstrichEntity.DATA_Purple_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.PURPLE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL413
                     && (Boolean)_datEntL413.getEntityData().get(OstrichEntity.DATA_Orange_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.ORANGE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL418
                     && (Boolean)_datEntL418.getEntityData().get(OstrichEntity.DATA_Cyan_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.CYAN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL423
                     && (Boolean)_datEntL423.getEntityData().get(OstrichEntity.DATA_Red_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.RED_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL428
                     && (Boolean)_datEntL428.getEntityData().get(OstrichEntity.DATA_Yellow_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.YELLOW_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL433
                     && (Boolean)_datEntL433.getEntityData().get(OstrichEntity.DATA_White_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.WHITE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL438
                     && (Boolean)_datEntL438.getEntityData().get(OstrichEntity.DATA_Grey_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL443
                     && (Boolean)_datEntL443.getEntityData().get(OstrichEntity.DATA_LightGrey_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIGHT_GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL448
                     && (Boolean)_datEntL448.getEntityData().get(OstrichEntity.DATA_Black_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BLACK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL453
                     && (Boolean)_datEntL453.getEntityData().get(OstrichEntity.DATA_Brown_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BROWN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }
               }

               if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.LIGHT_BLUE_WOOL.asItem()) {
                  if (entity instanceof OstrichEntity _datEntL460
                     && (Boolean)_datEntL460.getEntityData().get(OstrichEntity.DATA_Green_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.GREEN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL465
                     && (Boolean)_datEntL465.getEntityData().get(OstrichEntity.DATA_LightGreen_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIME_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL470
                     && (Boolean)_datEntL470.getEntityData().get(OstrichEntity.DATA_Blue_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL475
                     && (Boolean)_datEntL475.getEntityData().get(OstrichEntity.DATA_Pink_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.PINK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL480
                     && (Boolean)_datEntL480.getEntityData().get(OstrichEntity.DATA_Magenta_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.MAGENTA_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL485
                     && (Boolean)_datEntL485.getEntityData().get(OstrichEntity.DATA_Purple_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.PURPLE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL490
                     && (Boolean)_datEntL490.getEntityData().get(OstrichEntity.DATA_Orange_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.ORANGE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL495
                     && (Boolean)_datEntL495.getEntityData().get(OstrichEntity.DATA_Cyan_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.CYAN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL500
                     && (Boolean)_datEntL500.getEntityData().get(OstrichEntity.DATA_Red_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.RED_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL505
                     && (Boolean)_datEntL505.getEntityData().get(OstrichEntity.DATA_Yellow_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.YELLOW_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL510
                     && (Boolean)_datEntL510.getEntityData().get(OstrichEntity.DATA_White_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.WHITE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL515
                     && (Boolean)_datEntL515.getEntityData().get(OstrichEntity.DATA_Grey_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL520
                     && (Boolean)_datEntL520.getEntityData().get(OstrichEntity.DATA_LightGrey_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIGHT_GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL525
                     && (Boolean)_datEntL525.getEntityData().get(OstrichEntity.DATA_Black_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BLACK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL530
                     && (Boolean)_datEntL530.getEntityData().get(OstrichEntity.DATA_Brown_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BROWN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }
               }

               if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.PINK_WOOL.asItem()) {
                  if (entity instanceof OstrichEntity _datEntL537
                     && (Boolean)_datEntL537.getEntityData().get(OstrichEntity.DATA_Green_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.GREEN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL542
                     && (Boolean)_datEntL542.getEntityData().get(OstrichEntity.DATA_LightGreen_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIME_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL547
                     && (Boolean)_datEntL547.getEntityData().get(OstrichEntity.DATA_Blue_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL552
                     && (Boolean)_datEntL552.getEntityData().get(OstrichEntity.DATA_LightBlue_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIGHT_BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL557
                     && (Boolean)_datEntL557.getEntityData().get(OstrichEntity.DATA_Magenta_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.MAGENTA_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL562
                     && (Boolean)_datEntL562.getEntityData().get(OstrichEntity.DATA_Purple_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.PURPLE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL567
                     && (Boolean)_datEntL567.getEntityData().get(OstrichEntity.DATA_Orange_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.ORANGE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL572
                     && (Boolean)_datEntL572.getEntityData().get(OstrichEntity.DATA_Cyan_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.CYAN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL577
                     && (Boolean)_datEntL577.getEntityData().get(OstrichEntity.DATA_Red_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.RED_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL582
                     && (Boolean)_datEntL582.getEntityData().get(OstrichEntity.DATA_Yellow_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.YELLOW_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL587
                     && (Boolean)_datEntL587.getEntityData().get(OstrichEntity.DATA_White_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.WHITE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL592
                     && (Boolean)_datEntL592.getEntityData().get(OstrichEntity.DATA_Grey_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL597
                     && (Boolean)_datEntL597.getEntityData().get(OstrichEntity.DATA_LightGrey_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIGHT_GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL602
                     && (Boolean)_datEntL602.getEntityData().get(OstrichEntity.DATA_Black_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BLACK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL607
                     && (Boolean)_datEntL607.getEntityData().get(OstrichEntity.DATA_Brown_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BROWN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }
               }

               if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.MAGENTA_WOOL.asItem()) {
                  if (entity instanceof OstrichEntity _datEntL614
                     && (Boolean)_datEntL614.getEntityData().get(OstrichEntity.DATA_Green_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.GREEN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL619
                     && (Boolean)_datEntL619.getEntityData().get(OstrichEntity.DATA_LightGreen_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIME_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL624
                     && (Boolean)_datEntL624.getEntityData().get(OstrichEntity.DATA_Blue_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL629
                     && (Boolean)_datEntL629.getEntityData().get(OstrichEntity.DATA_LightBlue_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIGHT_BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL634
                     && (Boolean)_datEntL634.getEntityData().get(OstrichEntity.DATA_Pink_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.PINK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL639
                     && (Boolean)_datEntL639.getEntityData().get(OstrichEntity.DATA_Purple_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.PURPLE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL644
                     && (Boolean)_datEntL644.getEntityData().get(OstrichEntity.DATA_Orange_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.ORANGE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL649
                     && (Boolean)_datEntL649.getEntityData().get(OstrichEntity.DATA_Cyan_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.CYAN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL654
                     && (Boolean)_datEntL654.getEntityData().get(OstrichEntity.DATA_Red_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.RED_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL659
                     && (Boolean)_datEntL659.getEntityData().get(OstrichEntity.DATA_Yellow_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.YELLOW_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL664
                     && (Boolean)_datEntL664.getEntityData().get(OstrichEntity.DATA_White_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.WHITE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL669
                     && (Boolean)_datEntL669.getEntityData().get(OstrichEntity.DATA_Grey_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL674
                     && (Boolean)_datEntL674.getEntityData().get(OstrichEntity.DATA_LightGrey_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIGHT_GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL679
                     && (Boolean)_datEntL679.getEntityData().get(OstrichEntity.DATA_Black_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BLACK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL684
                     && (Boolean)_datEntL684.getEntityData().get(OstrichEntity.DATA_Brown_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BROWN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }
               }

               if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.PURPLE_WOOL.asItem()) {
                  if (entity instanceof OstrichEntity _datEntL691
                     && (Boolean)_datEntL691.getEntityData().get(OstrichEntity.DATA_Green_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.GREEN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL696
                     && (Boolean)_datEntL696.getEntityData().get(OstrichEntity.DATA_LightGreen_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIME_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL701
                     && (Boolean)_datEntL701.getEntityData().get(OstrichEntity.DATA_Blue_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL706
                     && (Boolean)_datEntL706.getEntityData().get(OstrichEntity.DATA_LightBlue_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIGHT_BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL711
                     && (Boolean)_datEntL711.getEntityData().get(OstrichEntity.DATA_Pink_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.PINK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL716
                     && (Boolean)_datEntL716.getEntityData().get(OstrichEntity.DATA_Magenta_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.MAGENTA_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL721
                     && (Boolean)_datEntL721.getEntityData().get(OstrichEntity.DATA_Orange_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.ORANGE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL726
                     && (Boolean)_datEntL726.getEntityData().get(OstrichEntity.DATA_Cyan_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.CYAN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL731
                     && (Boolean)_datEntL731.getEntityData().get(OstrichEntity.DATA_Red_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.RED_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL736
                     && (Boolean)_datEntL736.getEntityData().get(OstrichEntity.DATA_Yellow_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.YELLOW_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL741
                     && (Boolean)_datEntL741.getEntityData().get(OstrichEntity.DATA_White_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.WHITE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL746
                     && (Boolean)_datEntL746.getEntityData().get(OstrichEntity.DATA_Grey_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL751
                     && (Boolean)_datEntL751.getEntityData().get(OstrichEntity.DATA_LightGrey_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIGHT_GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL756
                     && (Boolean)_datEntL756.getEntityData().get(OstrichEntity.DATA_Black_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BLACK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL761
                     && (Boolean)_datEntL761.getEntityData().get(OstrichEntity.DATA_Brown_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BROWN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }
               }

               if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.ORANGE_WOOL.asItem()) {
                  if (entity instanceof OstrichEntity _datEntL768
                     && (Boolean)_datEntL768.getEntityData().get(OstrichEntity.DATA_Green_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.GREEN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL773
                     && (Boolean)_datEntL773.getEntityData().get(OstrichEntity.DATA_LightGreen_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIME_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL778
                     && (Boolean)_datEntL778.getEntityData().get(OstrichEntity.DATA_Blue_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL783
                     && (Boolean)_datEntL783.getEntityData().get(OstrichEntity.DATA_LightBlue_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIGHT_BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL788
                     && (Boolean)_datEntL788.getEntityData().get(OstrichEntity.DATA_Pink_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.PINK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL793
                     && (Boolean)_datEntL793.getEntityData().get(OstrichEntity.DATA_Magenta_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.MAGENTA_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL798
                     && (Boolean)_datEntL798.getEntityData().get(OstrichEntity.DATA_Purple_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.PURPLE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL803
                     && (Boolean)_datEntL803.getEntityData().get(OstrichEntity.DATA_Cyan_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.CYAN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL808
                     && (Boolean)_datEntL808.getEntityData().get(OstrichEntity.DATA_Red_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.RED_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL813
                     && (Boolean)_datEntL813.getEntityData().get(OstrichEntity.DATA_Yellow_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.YELLOW_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL818
                     && (Boolean)_datEntL818.getEntityData().get(OstrichEntity.DATA_White_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.WHITE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL823
                     && (Boolean)_datEntL823.getEntityData().get(OstrichEntity.DATA_Grey_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL828
                     && (Boolean)_datEntL828.getEntityData().get(OstrichEntity.DATA_LightGrey_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIGHT_GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL833
                     && (Boolean)_datEntL833.getEntityData().get(OstrichEntity.DATA_Black_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BLACK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL838
                     && (Boolean)_datEntL838.getEntityData().get(OstrichEntity.DATA_Brown_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BROWN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }
               }

               if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.CYAN_WOOL.asItem()) {
                  if (entity instanceof OstrichEntity _datEntL845
                     && (Boolean)_datEntL845.getEntityData().get(OstrichEntity.DATA_Green_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.GREEN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL850
                     && (Boolean)_datEntL850.getEntityData().get(OstrichEntity.DATA_LightGreen_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIME_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL855
                     && (Boolean)_datEntL855.getEntityData().get(OstrichEntity.DATA_Blue_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL860
                     && (Boolean)_datEntL860.getEntityData().get(OstrichEntity.DATA_LightBlue_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIGHT_BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL865
                     && (Boolean)_datEntL865.getEntityData().get(OstrichEntity.DATA_Pink_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.PINK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL870
                     && (Boolean)_datEntL870.getEntityData().get(OstrichEntity.DATA_Magenta_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.MAGENTA_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL875
                     && (Boolean)_datEntL875.getEntityData().get(OstrichEntity.DATA_Purple_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.PURPLE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL880
                     && (Boolean)_datEntL880.getEntityData().get(OstrichEntity.DATA_Orange_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.ORANGE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL885
                     && (Boolean)_datEntL885.getEntityData().get(OstrichEntity.DATA_Red_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.RED_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL890
                     && (Boolean)_datEntL890.getEntityData().get(OstrichEntity.DATA_Yellow_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.YELLOW_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL895
                     && (Boolean)_datEntL895.getEntityData().get(OstrichEntity.DATA_White_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.WHITE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL900
                     && (Boolean)_datEntL900.getEntityData().get(OstrichEntity.DATA_Grey_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL905
                     && (Boolean)_datEntL905.getEntityData().get(OstrichEntity.DATA_LightGrey_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIGHT_GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL910
                     && (Boolean)_datEntL910.getEntityData().get(OstrichEntity.DATA_Black_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BLACK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL915
                     && (Boolean)_datEntL915.getEntityData().get(OstrichEntity.DATA_Brown_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BROWN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }
               }

               if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.RED_WOOL.asItem()) {
                  if (entity instanceof OstrichEntity _datEntL922
                     && (Boolean)_datEntL922.getEntityData().get(OstrichEntity.DATA_Green_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.GREEN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL927
                     && (Boolean)_datEntL927.getEntityData().get(OstrichEntity.DATA_LightGreen_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIME_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL932
                     && (Boolean)_datEntL932.getEntityData().get(OstrichEntity.DATA_Blue_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL937
                     && (Boolean)_datEntL937.getEntityData().get(OstrichEntity.DATA_LightBlue_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIGHT_BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL942
                     && (Boolean)_datEntL942.getEntityData().get(OstrichEntity.DATA_Pink_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.PINK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL947
                     && (Boolean)_datEntL947.getEntityData().get(OstrichEntity.DATA_Magenta_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.MAGENTA_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL952
                     && (Boolean)_datEntL952.getEntityData().get(OstrichEntity.DATA_Purple_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.PURPLE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL957
                     && (Boolean)_datEntL957.getEntityData().get(OstrichEntity.DATA_Orange_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.ORANGE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL962
                     && (Boolean)_datEntL962.getEntityData().get(OstrichEntity.DATA_Cyan_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.CYAN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL967
                     && (Boolean)_datEntL967.getEntityData().get(OstrichEntity.DATA_Yellow_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.YELLOW_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL972
                     && (Boolean)_datEntL972.getEntityData().get(OstrichEntity.DATA_White_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.WHITE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL977
                     && (Boolean)_datEntL977.getEntityData().get(OstrichEntity.DATA_Grey_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL982
                     && (Boolean)_datEntL982.getEntityData().get(OstrichEntity.DATA_LightGrey_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIGHT_GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL987
                     && (Boolean)_datEntL987.getEntityData().get(OstrichEntity.DATA_Black_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BLACK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL992
                     && (Boolean)_datEntL992.getEntityData().get(OstrichEntity.DATA_Brown_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BROWN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }
               }

               if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.YELLOW_WOOL.asItem()) {
                  if (entity instanceof OstrichEntity _datEntL999
                     && (Boolean)_datEntL999.getEntityData().get(OstrichEntity.DATA_Green_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.GREEN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1004
                     && (Boolean)_datEntL1004.getEntityData().get(OstrichEntity.DATA_LightGreen_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIME_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1009
                     && (Boolean)_datEntL1009.getEntityData().get(OstrichEntity.DATA_Blue_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1014
                     && (Boolean)_datEntL1014.getEntityData().get(OstrichEntity.DATA_LightBlue_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIGHT_BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1019
                     && (Boolean)_datEntL1019.getEntityData().get(OstrichEntity.DATA_Pink_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.PINK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1024
                     && (Boolean)_datEntL1024.getEntityData().get(OstrichEntity.DATA_Magenta_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.MAGENTA_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1029
                     && (Boolean)_datEntL1029.getEntityData().get(OstrichEntity.DATA_Purple_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.PURPLE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1034
                     && (Boolean)_datEntL1034.getEntityData().get(OstrichEntity.DATA_Orange_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.ORANGE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1039
                     && (Boolean)_datEntL1039.getEntityData().get(OstrichEntity.DATA_Cyan_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.CYAN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1044
                     && (Boolean)_datEntL1044.getEntityData().get(OstrichEntity.DATA_Red_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.RED_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1049
                     && (Boolean)_datEntL1049.getEntityData().get(OstrichEntity.DATA_White_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.WHITE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1054
                     && (Boolean)_datEntL1054.getEntityData().get(OstrichEntity.DATA_Grey_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1059
                     && (Boolean)_datEntL1059.getEntityData().get(OstrichEntity.DATA_LightGrey_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIGHT_GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1064
                     && (Boolean)_datEntL1064.getEntityData().get(OstrichEntity.DATA_Black_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BLACK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1069
                     && (Boolean)_datEntL1069.getEntityData().get(OstrichEntity.DATA_Brown_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BROWN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }
               }

               if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.WHITE_WOOL.asItem()) {
                  if (entity instanceof OstrichEntity _datEntL1076
                     && (Boolean)_datEntL1076.getEntityData().get(OstrichEntity.DATA_Green_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.GREEN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1081
                     && (Boolean)_datEntL1081.getEntityData().get(OstrichEntity.DATA_LightGreen_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIME_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1086
                     && (Boolean)_datEntL1086.getEntityData().get(OstrichEntity.DATA_Blue_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1091
                     && (Boolean)_datEntL1091.getEntityData().get(OstrichEntity.DATA_LightBlue_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIGHT_BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1096
                     && (Boolean)_datEntL1096.getEntityData().get(OstrichEntity.DATA_Pink_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.PINK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1101
                     && (Boolean)_datEntL1101.getEntityData().get(OstrichEntity.DATA_Magenta_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.MAGENTA_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1106
                     && (Boolean)_datEntL1106.getEntityData().get(OstrichEntity.DATA_Purple_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.PURPLE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1111
                     && (Boolean)_datEntL1111.getEntityData().get(OstrichEntity.DATA_Orange_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.ORANGE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1116
                     && (Boolean)_datEntL1116.getEntityData().get(OstrichEntity.DATA_Cyan_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.CYAN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1121
                     && (Boolean)_datEntL1121.getEntityData().get(OstrichEntity.DATA_Red_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.RED_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1126
                     && (Boolean)_datEntL1126.getEntityData().get(OstrichEntity.DATA_Yellow_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.YELLOW_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1131
                     && (Boolean)_datEntL1131.getEntityData().get(OstrichEntity.DATA_Grey_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1136
                     && (Boolean)_datEntL1136.getEntityData().get(OstrichEntity.DATA_LightGrey_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIGHT_GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1141
                     && (Boolean)_datEntL1141.getEntityData().get(OstrichEntity.DATA_Black_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BLACK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1146
                     && (Boolean)_datEntL1146.getEntityData().get(OstrichEntity.DATA_Brown_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BROWN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }
               }

               if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.GRAY_WOOL.asItem()) {
                  if (entity instanceof OstrichEntity _datEntL1153
                     && (Boolean)_datEntL1153.getEntityData().get(OstrichEntity.DATA_Green_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.GREEN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1158
                     && (Boolean)_datEntL1158.getEntityData().get(OstrichEntity.DATA_LightGreen_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIME_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1163
                     && (Boolean)_datEntL1163.getEntityData().get(OstrichEntity.DATA_Blue_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1168
                     && (Boolean)_datEntL1168.getEntityData().get(OstrichEntity.DATA_LightBlue_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIGHT_BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1173
                     && (Boolean)_datEntL1173.getEntityData().get(OstrichEntity.DATA_Pink_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.PINK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1178
                     && (Boolean)_datEntL1178.getEntityData().get(OstrichEntity.DATA_Magenta_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.MAGENTA_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1183
                     && (Boolean)_datEntL1183.getEntityData().get(OstrichEntity.DATA_Purple_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.PURPLE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1188
                     && (Boolean)_datEntL1188.getEntityData().get(OstrichEntity.DATA_Orange_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.ORANGE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1193
                     && (Boolean)_datEntL1193.getEntityData().get(OstrichEntity.DATA_Cyan_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.CYAN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1198
                     && (Boolean)_datEntL1198.getEntityData().get(OstrichEntity.DATA_Red_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.RED_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1203
                     && (Boolean)_datEntL1203.getEntityData().get(OstrichEntity.DATA_Yellow_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.YELLOW_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1208
                     && (Boolean)_datEntL1208.getEntityData().get(OstrichEntity.DATA_White_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.WHITE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1213
                     && (Boolean)_datEntL1213.getEntityData().get(OstrichEntity.DATA_LightGrey_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIGHT_GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1218
                     && (Boolean)_datEntL1218.getEntityData().get(OstrichEntity.DATA_Black_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BLACK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1223
                     && (Boolean)_datEntL1223.getEntityData().get(OstrichEntity.DATA_Brown_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BROWN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }
               }

               if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.LIGHT_GRAY_WOOL.asItem()) {
                  if (entity instanceof OstrichEntity _datEntL1230
                     && (Boolean)_datEntL1230.getEntityData().get(OstrichEntity.DATA_Green_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.GREEN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1235
                     && (Boolean)_datEntL1235.getEntityData().get(OstrichEntity.DATA_LightGreen_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIME_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1240
                     && (Boolean)_datEntL1240.getEntityData().get(OstrichEntity.DATA_Blue_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1245
                     && (Boolean)_datEntL1245.getEntityData().get(OstrichEntity.DATA_LightBlue_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIGHT_BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1250
                     && (Boolean)_datEntL1250.getEntityData().get(OstrichEntity.DATA_Pink_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.PINK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1255
                     && (Boolean)_datEntL1255.getEntityData().get(OstrichEntity.DATA_Magenta_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.MAGENTA_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1260
                     && (Boolean)_datEntL1260.getEntityData().get(OstrichEntity.DATA_Purple_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.PURPLE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1265
                     && (Boolean)_datEntL1265.getEntityData().get(OstrichEntity.DATA_Orange_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.ORANGE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1270
                     && (Boolean)_datEntL1270.getEntityData().get(OstrichEntity.DATA_Cyan_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.CYAN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1275
                     && (Boolean)_datEntL1275.getEntityData().get(OstrichEntity.DATA_Red_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.RED_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1280
                     && (Boolean)_datEntL1280.getEntityData().get(OstrichEntity.DATA_Yellow_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.YELLOW_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1285
                     && (Boolean)_datEntL1285.getEntityData().get(OstrichEntity.DATA_White_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.WHITE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1290
                     && (Boolean)_datEntL1290.getEntityData().get(OstrichEntity.DATA_Grey_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1295
                     && (Boolean)_datEntL1295.getEntityData().get(OstrichEntity.DATA_Black_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BLACK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1300
                     && (Boolean)_datEntL1300.getEntityData().get(OstrichEntity.DATA_Brown_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BROWN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }
               }

               if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.BLACK_WOOL.asItem()) {
                  if (entity instanceof OstrichEntity _datEntL1307
                     && (Boolean)_datEntL1307.getEntityData().get(OstrichEntity.DATA_Green_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.GREEN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1312
                     && (Boolean)_datEntL1312.getEntityData().get(OstrichEntity.DATA_LightGreen_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIME_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1317
                     && (Boolean)_datEntL1317.getEntityData().get(OstrichEntity.DATA_Blue_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1322
                     && (Boolean)_datEntL1322.getEntityData().get(OstrichEntity.DATA_LightBlue_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIGHT_BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1327
                     && (Boolean)_datEntL1327.getEntityData().get(OstrichEntity.DATA_Pink_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.PINK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1332
                     && (Boolean)_datEntL1332.getEntityData().get(OstrichEntity.DATA_Magenta_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.MAGENTA_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1337
                     && (Boolean)_datEntL1337.getEntityData().get(OstrichEntity.DATA_Purple_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.PURPLE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1342
                     && (Boolean)_datEntL1342.getEntityData().get(OstrichEntity.DATA_Orange_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.ORANGE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1347
                     && (Boolean)_datEntL1347.getEntityData().get(OstrichEntity.DATA_Cyan_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.CYAN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1352
                     && (Boolean)_datEntL1352.getEntityData().get(OstrichEntity.DATA_Red_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.RED_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1357
                     && (Boolean)_datEntL1357.getEntityData().get(OstrichEntity.DATA_Yellow_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.YELLOW_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1362
                     && (Boolean)_datEntL1362.getEntityData().get(OstrichEntity.DATA_White_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.WHITE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1367
                     && (Boolean)_datEntL1367.getEntityData().get(OstrichEntity.DATA_Grey_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1372
                     && (Boolean)_datEntL1372.getEntityData().get(OstrichEntity.DATA_LightGrey_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIGHT_GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1377
                     && (Boolean)_datEntL1377.getEntityData().get(OstrichEntity.DATA_Brown_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BROWN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }
               }

               if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.BROWN_WOOL.asItem()) {
                  if (entity instanceof OstrichEntity _datEntL1384
                     && (Boolean)_datEntL1384.getEntityData().get(OstrichEntity.DATA_Green_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.GREEN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1389
                     && (Boolean)_datEntL1389.getEntityData().get(OstrichEntity.DATA_LightGreen_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIME_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1394
                     && (Boolean)_datEntL1394.getEntityData().get(OstrichEntity.DATA_Blue_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1399
                     && (Boolean)_datEntL1399.getEntityData().get(OstrichEntity.DATA_LightBlue_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIGHT_BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1404
                     && (Boolean)_datEntL1404.getEntityData().get(OstrichEntity.DATA_Pink_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.PINK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1409
                     && (Boolean)_datEntL1409.getEntityData().get(OstrichEntity.DATA_Magenta_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.MAGENTA_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1414
                     && (Boolean)_datEntL1414.getEntityData().get(OstrichEntity.DATA_Purple_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.PURPLE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1419
                     && (Boolean)_datEntL1419.getEntityData().get(OstrichEntity.DATA_Orange_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.ORANGE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1424
                     && (Boolean)_datEntL1424.getEntityData().get(OstrichEntity.DATA_Cyan_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.CYAN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1429
                     && (Boolean)_datEntL1429.getEntityData().get(OstrichEntity.DATA_Red_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.RED_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1434
                     && (Boolean)_datEntL1434.getEntityData().get(OstrichEntity.DATA_Yellow_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.YELLOW_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1439
                     && (Boolean)_datEntL1439.getEntityData().get(OstrichEntity.DATA_White_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.WHITE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1444
                     && (Boolean)_datEntL1444.getEntityData().get(OstrichEntity.DATA_Grey_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1449
                     && (Boolean)_datEntL1449.getEntityData().get(OstrichEntity.DATA_LightGrey_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.LIGHT_GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof OstrichEntity _datEntL1454
                     && (Boolean)_datEntL1454.getEntityData().get(OstrichEntity.DATA_Black_Flag)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Blocks.BLACK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }
               }
            }
         }
      }
   }
}
