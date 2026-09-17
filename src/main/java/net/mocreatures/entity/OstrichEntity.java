package net.mocreatures.entity;

import io.netty.buffer.Unpooled;
import javax.annotation.Nullable;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.chat.Component;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.network.syncher.SynchedEntityData.Builder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.SpawnPlacementTypes;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.enchantment.EnchantmentEffectComponents;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.Heightmap.Types;
import net.minecraft.world.phys.Vec3;
import net.mocreatures.init.MocreaturesModEntities;
import net.mocreatures.procedures.BrownOstrichBabyProcedure;
import net.mocreatures.procedures.BrownOstrichBabyRightClickedProcedure;
import net.mocreatures.procedures.MoCFlightHelper;
import net.mocreatures.procedures.OstrichDiesProcedure;
import net.mocreatures.procedures.OstrichVariant2SpawnProcedure;
import net.mocreatures.world.inventory.OstrichInventory2Menu;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent.Operation;
import net.neoforged.neoforge.items.IItemHandlerModifiable;
import net.neoforged.neoforge.items.ItemStackHandler;
import net.neoforged.neoforge.items.wrapper.CombinedInvWrapper;
import net.neoforged.neoforge.items.wrapper.EntityArmorInvWrapper;
import net.neoforged.neoforge.items.wrapper.EntityHandsInvWrapper;

public class OstrichEntity extends TamableAnimal {
   public static final EntityDataAccessor<Boolean> DATA_Saddle = SynchedEntityData.defineId(OstrichEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Boolean> DATA_Chest = SynchedEntityData.defineId(OstrichEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Boolean> DATA_Diamond_Helmet = SynchedEntityData.defineId(OstrichEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Boolean> DATA_Gold_Helmet = SynchedEntityData.defineId(OstrichEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Boolean> DATA_Iron_Helmet = SynchedEntityData.defineId(OstrichEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Boolean> DATA_Fur_Helmet = SynchedEntityData.defineId(OstrichEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Boolean> DATA_Reptile_Helmet = SynchedEntityData.defineId(OstrichEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Boolean> DATA_Hide_Helmet = SynchedEntityData.defineId(OstrichEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Boolean> DATA_Leather_Helmet = SynchedEntityData.defineId(OstrichEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Boolean> DATA_Frost_Scorpion_Helmet = SynchedEntityData.defineId(OstrichEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Boolean> DATA_Dirt_Scorpion_Helmet = SynchedEntityData.defineId(OstrichEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Boolean> DATA_Cave_Scorpion_Helmet = SynchedEntityData.defineId(OstrichEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Boolean> DATA_Nether_Scorpion_Helmet = SynchedEntityData.defineId(OstrichEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Boolean> DATA_Green_Flag = SynchedEntityData.defineId(OstrichEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Boolean> DATA_LightGreen_Flag = SynchedEntityData.defineId(OstrichEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Boolean> DATA_Blue_Flag = SynchedEntityData.defineId(OstrichEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Boolean> DATA_LightBlue_Flag = SynchedEntityData.defineId(OstrichEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Boolean> DATA_Pink_Flag = SynchedEntityData.defineId(OstrichEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Boolean> DATA_Magenta_Flag = SynchedEntityData.defineId(OstrichEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Boolean> DATA_Purple_Flag = SynchedEntityData.defineId(OstrichEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Boolean> DATA_Orange_Flag = SynchedEntityData.defineId(OstrichEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Boolean> DATA_Cyan_Flag = SynchedEntityData.defineId(OstrichEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Boolean> DATA_Red_Flag = SynchedEntityData.defineId(OstrichEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Boolean> DATA_Yellow_Flag = SynchedEntityData.defineId(OstrichEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Boolean> DATA_White_Flag = SynchedEntityData.defineId(OstrichEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Boolean> DATA_Grey_Flag = SynchedEntityData.defineId(OstrichEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Boolean> DATA_LightGrey_Flag = SynchedEntityData.defineId(OstrichEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Boolean> DATA_Black_Flag = SynchedEntityData.defineId(OstrichEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Boolean> DATA_Brown_Flag = SynchedEntityData.defineId(OstrichEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Boolean> DATA_Ostrich_Variant_2 = SynchedEntityData.defineId(OstrichEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Boolean> DATA_Baby = SynchedEntityData.defineId(OstrichEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Integer> DATA_GrowUp = SynchedEntityData.defineId(OstrichEntity.class, EntityDataSerializers.INT);
   public final AnimationState animationState1 = new AnimationState();
   private final ItemStackHandler inventory = new ItemStackHandler(9) {
      public int getSlotLimit(int slot) {
         return 64;
      }
   };
   private final CombinedInvWrapper combined = new CombinedInvWrapper(
      new IItemHandlerModifiable[]{this.inventory, new EntityHandsInvWrapper(this), new EntityArmorInvWrapper(this)}
   );

   public OstrichEntity(EntityType<OstrichEntity> type, Level world) {
      super(type, world);
      this.xpReward = 3;
      this.setNoAi(false);
   }

   protected void defineSynchedData(Builder builder) {
      super.defineSynchedData(builder);
      builder.define(DATA_Saddle, false);
      builder.define(DATA_Chest, false);
      builder.define(DATA_Diamond_Helmet, false);
      builder.define(DATA_Gold_Helmet, false);
      builder.define(DATA_Iron_Helmet, false);
      builder.define(DATA_Fur_Helmet, false);
      builder.define(DATA_Reptile_Helmet, false);
      builder.define(DATA_Hide_Helmet, false);
      builder.define(DATA_Leather_Helmet, false);
      builder.define(DATA_Frost_Scorpion_Helmet, false);
      builder.define(DATA_Dirt_Scorpion_Helmet, false);
      builder.define(DATA_Cave_Scorpion_Helmet, false);
      builder.define(DATA_Nether_Scorpion_Helmet, false);
      builder.define(DATA_Green_Flag, false);
      builder.define(DATA_LightGreen_Flag, false);
      builder.define(DATA_Blue_Flag, false);
      builder.define(DATA_LightBlue_Flag, false);
      builder.define(DATA_Pink_Flag, false);
      builder.define(DATA_Magenta_Flag, false);
      builder.define(DATA_Purple_Flag, false);
      builder.define(DATA_Orange_Flag, false);
      builder.define(DATA_Cyan_Flag, false);
      builder.define(DATA_Red_Flag, false);
      builder.define(DATA_Yellow_Flag, false);
      builder.define(DATA_White_Flag, false);
      builder.define(DATA_Grey_Flag, false);
      builder.define(DATA_LightGrey_Flag, false);
      builder.define(DATA_Black_Flag, false);
      builder.define(DATA_Brown_Flag, false);
      builder.define(DATA_Ostrich_Variant_2, false);
      builder.define(DATA_Baby, false);
      builder.define(DATA_GrowUp, 0);
   }

   protected void registerGoals() {
      super.registerGoals();
      this.goalSelector.addGoal(1, new RandomStrollGoal(this, 1.0));
      this.goalSelector.addGoal(2, new RandomLookAroundGoal(this));
      this.goalSelector.addGoal(3, new FloatGoal(this));
   }

   public SoundEvent getAmbientSound() {
      return (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("mocreatures:ostrich_ambient"));
   }

   public SoundEvent getHurtSound(DamageSource ds) {
      return (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("mocreatures:ostrich_hurt"));
   }

   public SoundEvent getDeathSound() {
      return (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("mocreatures:ostrich_death"));
   }

   public boolean hurt(DamageSource damagesource, float amount) {
      return damagesource.is(DamageTypes.FALL) ? false : super.hurt(damagesource, amount);
   }

   public void die(DamageSource source) {
      super.die(source);
      OstrichDiesProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ(), this);
   }

   public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata) {
      SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata);
      OstrichVariant2SpawnProcedure.execute(world, this.getX(), this.getY(), this.getZ(), this);
      return retval;
   }

   public CombinedInvWrapper getCombinedInventory() {
      return this.combined;
   }

   protected void dropEquipment() {
      super.dropEquipment();

      for (int i = 0; i < this.inventory.getSlots(); i++) {
         ItemStack itemstack = this.inventory.getStackInSlot(i);
         if (!itemstack.isEmpty() && !EnchantmentHelper.has(itemstack, EnchantmentEffectComponents.PREVENT_EQUIPMENT_DROP)) {
            this.spawnAtLocation(itemstack);
         }
      }
   }

   public void addAdditionalSaveData(CompoundTag compound) {
      super.addAdditionalSaveData(compound);
      compound.putBoolean("DataSaddle", (Boolean)this.entityData.get(DATA_Saddle));
      compound.putBoolean("DataChest", (Boolean)this.entityData.get(DATA_Chest));
      compound.putBoolean("DataDiamond_Helmet", (Boolean)this.entityData.get(DATA_Diamond_Helmet));
      compound.putBoolean("DataGold_Helmet", (Boolean)this.entityData.get(DATA_Gold_Helmet));
      compound.putBoolean("DataIron_Helmet", (Boolean)this.entityData.get(DATA_Iron_Helmet));
      compound.putBoolean("DataFur_Helmet", (Boolean)this.entityData.get(DATA_Fur_Helmet));
      compound.putBoolean("DataReptile_Helmet", (Boolean)this.entityData.get(DATA_Reptile_Helmet));
      compound.putBoolean("DataHide_Helmet", (Boolean)this.entityData.get(DATA_Hide_Helmet));
      compound.putBoolean("DataLeather_Helmet", (Boolean)this.entityData.get(DATA_Leather_Helmet));
      compound.putBoolean("DataFrost_Scorpion_Helmet", (Boolean)this.entityData.get(DATA_Frost_Scorpion_Helmet));
      compound.putBoolean("DataDirt_Scorpion_Helmet", (Boolean)this.entityData.get(DATA_Dirt_Scorpion_Helmet));
      compound.putBoolean("DataCave_Scorpion_Helmet", (Boolean)this.entityData.get(DATA_Cave_Scorpion_Helmet));
      compound.putBoolean("DataNether_Scorpion_Helmet", (Boolean)this.entityData.get(DATA_Nether_Scorpion_Helmet));
      compound.putBoolean("DataGreen_Flag", (Boolean)this.entityData.get(DATA_Green_Flag));
      compound.putBoolean("DataLightGreen_Flag", (Boolean)this.entityData.get(DATA_LightGreen_Flag));
      compound.putBoolean("DataBlue_Flag", (Boolean)this.entityData.get(DATA_Blue_Flag));
      compound.putBoolean("DataLightBlue_Flag", (Boolean)this.entityData.get(DATA_LightBlue_Flag));
      compound.putBoolean("DataPink_Flag", (Boolean)this.entityData.get(DATA_Pink_Flag));
      compound.putBoolean("DataMagenta_Flag", (Boolean)this.entityData.get(DATA_Magenta_Flag));
      compound.putBoolean("DataPurple_Flag", (Boolean)this.entityData.get(DATA_Purple_Flag));
      compound.putBoolean("DataOrange_Flag", (Boolean)this.entityData.get(DATA_Orange_Flag));
      compound.putBoolean("DataCyan_Flag", (Boolean)this.entityData.get(DATA_Cyan_Flag));
      compound.putBoolean("DataRed_Flag", (Boolean)this.entityData.get(DATA_Red_Flag));
      compound.putBoolean("DataYellow_Flag", (Boolean)this.entityData.get(DATA_Yellow_Flag));
      compound.putBoolean("DataWhite_Flag", (Boolean)this.entityData.get(DATA_White_Flag));
      compound.putBoolean("DataGrey_Flag", (Boolean)this.entityData.get(DATA_Grey_Flag));
      compound.putBoolean("DataLightGrey_Flag", (Boolean)this.entityData.get(DATA_LightGrey_Flag));
      compound.putBoolean("DataBlack_Flag", (Boolean)this.entityData.get(DATA_Black_Flag));
      compound.putBoolean("DataBrown_Flag", (Boolean)this.entityData.get(DATA_Brown_Flag));
      compound.putBoolean("DataOstrich_Variant_2", (Boolean)this.entityData.get(DATA_Ostrich_Variant_2));
      compound.putBoolean("DataBaby", (Boolean)this.entityData.get(DATA_Baby));
      compound.putInt("DataGrowUp", (Integer)this.entityData.get(DATA_GrowUp));
      compound.put("InventoryCustom", this.inventory.serializeNBT(this.registryAccess()));
   }

   public void readAdditionalSaveData(CompoundTag compound) {
      super.readAdditionalSaveData(compound);
      if (compound.contains("DataSaddle")) {
         this.entityData.set(DATA_Saddle, compound.getBoolean("DataSaddle"));
      }

      if (compound.contains("DataChest")) {
         this.entityData.set(DATA_Chest, compound.getBoolean("DataChest"));
      }

      if (compound.contains("DataDiamond_Helmet")) {
         this.entityData.set(DATA_Diamond_Helmet, compound.getBoolean("DataDiamond_Helmet"));
      }

      if (compound.contains("DataGold_Helmet")) {
         this.entityData.set(DATA_Gold_Helmet, compound.getBoolean("DataGold_Helmet"));
      }

      if (compound.contains("DataIron_Helmet")) {
         this.entityData.set(DATA_Iron_Helmet, compound.getBoolean("DataIron_Helmet"));
      }

      if (compound.contains("DataFur_Helmet")) {
         this.entityData.set(DATA_Fur_Helmet, compound.getBoolean("DataFur_Helmet"));
      }

      if (compound.contains("DataReptile_Helmet")) {
         this.entityData.set(DATA_Reptile_Helmet, compound.getBoolean("DataReptile_Helmet"));
      }

      if (compound.contains("DataHide_Helmet")) {
         this.entityData.set(DATA_Hide_Helmet, compound.getBoolean("DataHide_Helmet"));
      }

      if (compound.contains("DataLeather_Helmet")) {
         this.entityData.set(DATA_Leather_Helmet, compound.getBoolean("DataLeather_Helmet"));
      }

      if (compound.contains("DataFrost_Scorpion_Helmet")) {
         this.entityData.set(DATA_Frost_Scorpion_Helmet, compound.getBoolean("DataFrost_Scorpion_Helmet"));
      }

      if (compound.contains("DataDirt_Scorpion_Helmet")) {
         this.entityData.set(DATA_Dirt_Scorpion_Helmet, compound.getBoolean("DataDirt_Scorpion_Helmet"));
      }

      if (compound.contains("DataCave_Scorpion_Helmet")) {
         this.entityData.set(DATA_Cave_Scorpion_Helmet, compound.getBoolean("DataCave_Scorpion_Helmet"));
      }

      if (compound.contains("DataNether_Scorpion_Helmet")) {
         this.entityData.set(DATA_Nether_Scorpion_Helmet, compound.getBoolean("DataNether_Scorpion_Helmet"));
      }

      if (compound.contains("DataGreen_Flag")) {
         this.entityData.set(DATA_Green_Flag, compound.getBoolean("DataGreen_Flag"));
      }

      if (compound.contains("DataLightGreen_Flag")) {
         this.entityData.set(DATA_LightGreen_Flag, compound.getBoolean("DataLightGreen_Flag"));
      }

      if (compound.contains("DataBlue_Flag")) {
         this.entityData.set(DATA_Blue_Flag, compound.getBoolean("DataBlue_Flag"));
      }

      if (compound.contains("DataLightBlue_Flag")) {
         this.entityData.set(DATA_LightBlue_Flag, compound.getBoolean("DataLightBlue_Flag"));
      }

      if (compound.contains("DataPink_Flag")) {
         this.entityData.set(DATA_Pink_Flag, compound.getBoolean("DataPink_Flag"));
      }

      if (compound.contains("DataMagenta_Flag")) {
         this.entityData.set(DATA_Magenta_Flag, compound.getBoolean("DataMagenta_Flag"));
      }

      if (compound.contains("DataPurple_Flag")) {
         this.entityData.set(DATA_Purple_Flag, compound.getBoolean("DataPurple_Flag"));
      }

      if (compound.contains("DataOrange_Flag")) {
         this.entityData.set(DATA_Orange_Flag, compound.getBoolean("DataOrange_Flag"));
      }

      if (compound.contains("DataCyan_Flag")) {
         this.entityData.set(DATA_Cyan_Flag, compound.getBoolean("DataCyan_Flag"));
      }

      if (compound.contains("DataRed_Flag")) {
         this.entityData.set(DATA_Red_Flag, compound.getBoolean("DataRed_Flag"));
      }

      if (compound.contains("DataYellow_Flag")) {
         this.entityData.set(DATA_Yellow_Flag, compound.getBoolean("DataYellow_Flag"));
      }

      if (compound.contains("DataWhite_Flag")) {
         this.entityData.set(DATA_White_Flag, compound.getBoolean("DataWhite_Flag"));
      }

      if (compound.contains("DataGrey_Flag")) {
         this.entityData.set(DATA_Grey_Flag, compound.getBoolean("DataGrey_Flag"));
      }

      if (compound.contains("DataLightGrey_Flag")) {
         this.entityData.set(DATA_LightGrey_Flag, compound.getBoolean("DataLightGrey_Flag"));
      }

      if (compound.contains("DataBlack_Flag")) {
         this.entityData.set(DATA_Black_Flag, compound.getBoolean("DataBlack_Flag"));
      }

      if (compound.contains("DataBrown_Flag")) {
         this.entityData.set(DATA_Brown_Flag, compound.getBoolean("DataBrown_Flag"));
      }

      if (compound.contains("DataOstrich_Variant_2")) {
         this.entityData.set(DATA_Ostrich_Variant_2, compound.getBoolean("DataOstrich_Variant_2"));
      }

      if (compound.contains("DataBaby")) {
         this.entityData.set(DATA_Baby, compound.getBoolean("DataBaby"));
      }

      if (compound.contains("DataGrowUp")) {
         this.entityData.set(DATA_GrowUp, compound.getInt("DataGrowUp"));
      }

      if (compound.get("InventoryCustom") instanceof CompoundTag inventoryTag) {
         this.inventory.deserializeNBT(this.registryAccess(), inventoryTag);
      }
   }

   public InteractionResult mobInteract(final Player sourceentity, InteractionHand hand) {
      ItemStack itemstack = sourceentity.getItemInHand(hand);
      InteractionResult retval = InteractionResult.sidedSuccess(this.level().isClientSide());
      if (sourceentity.isSecondaryUseActive() && (Boolean)this.getEntityData().get(DATA_Chest)) {
         if (sourceentity instanceof ServerPlayer serverPlayer) {
            serverPlayer.openMenu(new MenuProvider() {
               public Component getDisplayName() {
                  return Component.literal("Ostrich");
               }

               public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
                  FriendlyByteBuf packetBuffer = new FriendlyByteBuf(Unpooled.buffer());
                  packetBuffer.writeBlockPos(sourceentity.blockPosition());
                  packetBuffer.writeByte(0);
                  packetBuffer.writeVarInt(OstrichEntity.this.getId());
                  return new OstrichInventory2Menu(id, inventory, packetBuffer);
               }
            }, buf -> {
               buf.writeBlockPos(sourceentity.blockPosition());
               buf.writeByte(0);
               buf.writeVarInt(this.getId());
            });
         }

         return InteractionResult.sidedSuccess(this.level().isClientSide());
      } else {
         Item item = itemstack.getItem();
         if (itemstack.getItem() instanceof SpawnEggItem) {
            retval = super.mobInteract(sourceentity, hand);
         } else if (this.level().isClientSide()) {
            retval = (!this.isTame() || !this.isOwnedBy(sourceentity)) && !this.isFood(itemstack)
               ? InteractionResult.PASS
               : InteractionResult.sidedSuccess(this.level().isClientSide());
         } else if (this.isTame()) {
            if (this.isOwnedBy(sourceentity)) {
               if (this.isFood(itemstack) && this.getHealth() < this.getMaxHealth()) {
                  this.usePlayerItem(sourceentity, hand, itemstack);
                  FoodProperties foodproperties = itemstack.getFoodProperties(this);
                  float nutrition = foodproperties != null ? foodproperties.nutrition() : 1.0F;
                  this.heal(nutrition);
                  retval = InteractionResult.sidedSuccess(this.level().isClientSide());
               } else if (this.isFood(itemstack) && this.getHealth() < this.getMaxHealth()) {
                  this.usePlayerItem(sourceentity, hand, itemstack);
                  this.heal(4.0F);
                  retval = InteractionResult.sidedSuccess(this.level().isClientSide());
               } else {
                  retval = super.mobInteract(sourceentity, hand);
               }
            }
         } else {
            retval = super.mobInteract(sourceentity, hand);
            if (retval == InteractionResult.SUCCESS || retval == InteractionResult.CONSUME) {
               this.setPersistenceRequired();
            }
         }

         double x = this.getX();
         double y = this.getY();
         double z = this.getZ();
         Entity entity = this;
         Level world = this.level();
         BrownOstrichBabyRightClickedProcedure.execute(world, x, y, z, entity, sourceentity);
         return retval;
      }
   }

   public void tick() {
      super.tick();
      if (this.level().isClientSide()) {
         this.animationState1.animateWhen(true, this.tickCount);
      }
   }

   public void baseTick() {
      super.baseTick();
      BrownOstrichBabyProcedure.execute(this);
   }

   public AgeableMob getBreedOffspring(ServerLevel serverWorld, AgeableMob ageable) {
      OstrichEntity retval = (OstrichEntity)(MocreaturesModEntities.BROWN_OSTRICH.get()).create(serverWorld);
      retval.finalizeSpawn(serverWorld, serverWorld.getCurrentDifficultyAt(retval.blockPosition()), MobSpawnType.BREEDING, null);
      return retval;
   }

   public boolean isFood(ItemStack stack) {
      return Ingredient.of(new ItemStack[]{new ItemStack(Blocks.AIR)}).test(stack);
   }

   public void travel(Vec3 dir) {
      if (!MoCFlightHelper.handleTravel(this, dir)) {
         Entity entity = this.getPassengers().isEmpty() ? null : (Entity)this.getPassengers().get(0);
         if (this.isVehicle()) {
            this.setYRot(entity.getYRot());
            this.yRotO = this.getYRot();
            this.setXRot(entity.getXRot() * 0.5F);
            this.setRot(this.getYRot(), this.getXRot());
            this.yBodyRot = entity.getYRot();
            this.yHeadRot = entity.getYRot();
            if (entity instanceof LivingEntity passenger) {
               this.setSpeed((float)this.getAttributeValue(Attributes.MOVEMENT_SPEED));
               float forward = passenger.zza;
               float strafe = passenger.xxa;
               super.travel(new Vec3(strafe, 0.0, forward));
            }

            double d1 = this.getX() - this.xo;
            double d0 = this.getZ() - this.zo;
            float f1 = (float)Math.sqrt(d1 * d1 + d0 * d0) * 4.0F;
            if (f1 > 1.0F) {
               f1 = 1.0F;
            }

            this.walkAnimation.setSpeed(this.walkAnimation.speed() + (f1 - this.walkAnimation.speed()) * 0.4F);
            this.walkAnimation.position(this.walkAnimation.position() + this.walkAnimation.speed());
            this.calculateEntityAnimation(true);
         } else {
            super.travel(dir);
         }
      }
   }

   public static void init(RegisterSpawnPlacementsEvent event) {
      event.register(
         MocreaturesModEntities.BROWN_OSTRICH.get(),
         SpawnPlacementTypes.ON_GROUND,
         Types.MOTION_BLOCKING_NO_LEAVES,
         (entityType, world, reason, pos, random) -> world.getBlockState(pos.below()).is(BlockTags.ANIMALS_SPAWNABLE_ON) && world.getRawBrightness(pos, 0) > 8,
         Operation.REPLACE
      );
   }

   public static net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder createAttributes() {
      net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder builder = Mob.createMobAttributes();
      builder = builder.add(Attributes.MOVEMENT_SPEED, 0.25);
      builder = builder.add(Attributes.MAX_HEALTH, 20.0);
      builder = builder.add(Attributes.ARMOR, 0.0);
      builder = builder.add(Attributes.ATTACK_DAMAGE, 3.0);
      builder = builder.add(Attributes.FOLLOW_RANGE, 16.0);
      return builder.add(Attributes.STEP_HEIGHT, 1.0);
   }

   public LivingEntity getControllingPassenger() {
      Entity var1 = this.getFirstPassenger();
      return var1 instanceof LivingEntity ? (LivingEntity)var1 : null;
   }

   public boolean canSprint() {
      return true;
   }
}
