package net.mocreatures.entity;

import io.netty.buffer.Unpooled;
import javax.annotation.Nullable;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.chat.Component;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.network.syncher.SynchedEntityData.Builder;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.SpawnPlacementTypes;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.BreedGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.LeapAtTargetGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
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
import net.mocreatures.procedures.HorseBabyProcedure;
import net.mocreatures.procedures.HorseDiesProcedure;
import net.mocreatures.procedures.HorseEntityIsHurtProcedure;
import net.mocreatures.procedures.HorseFlyPlaybackConditionProcedure;
import net.mocreatures.procedures.HorseNeighPlaybackConditionProcedure;
import net.mocreatures.procedures.HorseOnInitialEntitySpawnProcedure;
import net.mocreatures.procedures.HorseTailWagPlaybackConditionProcedure;
import net.mocreatures.procedures.MoCFlightHelper;
import net.mocreatures.world.inventory.HorseInventoryMenu;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent.Operation;
import net.neoforged.neoforge.items.IItemHandlerModifiable;
import net.neoforged.neoforge.items.ItemStackHandler;
import net.neoforged.neoforge.items.wrapper.CombinedInvWrapper;
import net.neoforged.neoforge.items.wrapper.EntityArmorInvWrapper;
import net.neoforged.neoforge.items.wrapper.EntityHandsInvWrapper;

public class HorseEntity extends TamableAnimal {
   public static final EntityDataAccessor<Integer> DATA_NeighCooldown = SynchedEntityData.defineId(HorseEntity.class, EntityDataSerializers.INT);
   public static final EntityDataAccessor<Integer> DATA_TailWagCooldown = SynchedEntityData.defineId(HorseEntity.class, EntityDataSerializers.INT);
   public static final EntityDataAccessor<Boolean> DATA_Chest = SynchedEntityData.defineId(HorseEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Boolean> DATA_Saddle = SynchedEntityData.defineId(HorseEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Integer> DATA_Zebra = SynchedEntityData.defineId(HorseEntity.class, EntityDataSerializers.INT);
   public static final EntityDataAccessor<Boolean> DATA_Breed = SynchedEntityData.defineId(HorseEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Boolean> DATA_Baby = SynchedEntityData.defineId(HorseEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Integer> DATA_Variant = SynchedEntityData.defineId(HorseEntity.class, EntityDataSerializers.INT);
   public static final EntityDataAccessor<Integer> DATA_NightmareTextureSwap = SynchedEntityData.defineId(HorseEntity.class, EntityDataSerializers.INT);
   public static final EntityDataAccessor<Integer> DATA_NightmareTextureFrame = SynchedEntityData.defineId(HorseEntity.class, EntityDataSerializers.INT);
   public static final EntityDataAccessor<Boolean> DATA_Decaying = SynchedEntityData.defineId(HorseEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Integer> DATA_DecayingTimer = SynchedEntityData.defineId(HorseEntity.class, EntityDataSerializers.INT);
   public static final EntityDataAccessor<Integer> DATA_DecayedStage = SynchedEntityData.defineId(HorseEntity.class, EntityDataSerializers.INT);
   public static final EntityDataAccessor<Boolean> DATA_Special = SynchedEntityData.defineId(HorseEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Boolean> DATA_Tier1 = SynchedEntityData.defineId(HorseEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Boolean> DATA_Tier2 = SynchedEntityData.defineId(HorseEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Boolean> DATA_Tier3 = SynchedEntityData.defineId(HorseEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Boolean> DATA_Tier4 = SynchedEntityData.defineId(HorseEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Boolean> DATA_RareBreed = SynchedEntityData.defineId(HorseEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Boolean> DATA_FairyBreeding = SynchedEntityData.defineId(HorseEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Boolean> DATA_MetalArmored = SynchedEntityData.defineId(HorseEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Boolean> DATA_GoldenArmored = SynchedEntityData.defineId(HorseEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Boolean> DATA_DiamondArmored = SynchedEntityData.defineId(HorseEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Boolean> DATA_CrystalineArmored = SynchedEntityData.defineId(HorseEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Boolean> DATA_Fairy = SynchedEntityData.defineId(HorseEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Boolean> DATA_Winged = SynchedEntityData.defineId(HorseEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Integer> DATA_GrowUp = SynchedEntityData.defineId(HorseEntity.class, EntityDataSerializers.INT);
   public static final EntityDataAccessor<Boolean> DATA_FireWalk = SynchedEntityData.defineId(HorseEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Boolean> DATA_Neigh = SynchedEntityData.defineId(HorseEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Boolean> DATA_TailWag = SynchedEntityData.defineId(HorseEntity.class, EntityDataSerializers.BOOLEAN);
   public final AnimationState animationState1 = new AnimationState();
   public final AnimationState animationState3 = new AnimationState();
   public final AnimationState animationState4 = new AnimationState();
   private final ItemStackHandler inventory = new ItemStackHandler(18) {
      public int getSlotLimit(int var1) {
         return 64;
      }
   };
   private final CombinedInvWrapper combined = new CombinedInvWrapper(
      new IItemHandlerModifiable[]{this.inventory, new EntityHandsInvWrapper(this), new EntityArmorInvWrapper(this)}
   );

   public HorseEntity(EntityType<HorseEntity> var1, Level var2) {
      super(var1, var2);
      this.xpReward = 0;
      this.setNoAi(false);
   }

   protected void defineSynchedData(Builder var1) {
      super.defineSynchedData(var1);
      var1.define(DATA_NeighCooldown, 0);
      var1.define(DATA_TailWagCooldown, 0);
      var1.define(DATA_Chest, false);
      var1.define(DATA_Saddle, false);
      var1.define(DATA_Zebra, 0);
      var1.define(DATA_Breed, false);
      var1.define(DATA_Baby, false);
      var1.define(DATA_Variant, 0);
      var1.define(DATA_NightmareTextureSwap, 0);
      var1.define(DATA_NightmareTextureFrame, 0);
      var1.define(DATA_Decaying, false);
      var1.define(DATA_DecayingTimer, 0);
      var1.define(DATA_DecayedStage, 0);
      var1.define(DATA_Special, false);
      var1.define(DATA_Tier1, false);
      var1.define(DATA_Tier2, false);
      var1.define(DATA_Tier3, false);
      var1.define(DATA_Tier4, false);
      var1.define(DATA_RareBreed, false);
      var1.define(DATA_FairyBreeding, false);
      var1.define(DATA_MetalArmored, false);
      var1.define(DATA_GoldenArmored, false);
      var1.define(DATA_DiamondArmored, false);
      var1.define(DATA_CrystalineArmored, false);
      var1.define(DATA_Fairy, false);
      var1.define(DATA_Winged, false);
      var1.define(DATA_GrowUp, 0);
      var1.define(DATA_FireWalk, false);
      var1.define(DATA_Neigh, false);
      var1.define(DATA_TailWag, false);
   }

   protected void registerGoals() {
      super.registerGoals();
      this.goalSelector.addGoal(1, new BreedGoal(this, 1.0));
      this.goalSelector.addGoal(2, new RandomStrollGoal(this, 1.0));
      this.goalSelector.addGoal(3, new RandomLookAroundGoal(this));
      this.goalSelector.addGoal(4, new FloatGoal(this));
      this.goalSelector.addGoal(5, new LeapAtTargetGoal(this, 0.5F));
   }

   public LivingEntity getControllingPassenger() {
      Entity var1 = this.getFirstPassenger();
      return var1 instanceof LivingEntity ? (LivingEntity)var1 : null;
   }

   public boolean causeFallDamage(float var1, float var2, DamageSource var3) {
      return this.entityData.get(DATA_Winged) ? false : super.causeFallDamage(var1, var2, var3);
   }

   protected Vec3 getPassengerAttachmentPoint(Entity var1, EntityDimensions var2, float var3) {
      return super.getPassengerAttachmentPoint(var1, var2, var3).add(0.0, -0.2F, 0.0);
   }

   public boolean hurt(DamageSource var1, float var2) {
      double var3 = this.getX();
      double var5 = this.getY();
      double var7 = this.getZ();
      Level var9 = this.level();
      Entity var10 = var1.getEntity();
      Entity var11 = var1.getDirectEntity();
      HorseEntityIsHurtProcedure.execute(var9, var3, var5, var7, this);
      return super.hurt(var1, var2);
   }

   public void die(DamageSource var1) {
      super.die(var1);
      HorseDiesProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ(), this);
   }

   public SpawnGroupData finalizeSpawn(ServerLevelAccessor var1, DifficultyInstance var2, MobSpawnType var3, @Nullable SpawnGroupData var4) {
      SpawnGroupData var5 = super.finalizeSpawn(var1, var2, var3, var4);
      HorseOnInitialEntitySpawnProcedure.execute(this);
      return var5;
   }

   public CombinedInvWrapper getCombinedInventory() {
      return this.combined;
   }

   protected void dropEquipment() {
      super.dropEquipment();

      for (int var1 = 0; var1 < this.inventory.getSlots(); var1++) {
         ItemStack var2 = this.inventory.getStackInSlot(var1);
         if (!var2.isEmpty() && !EnchantmentHelper.has(var2, EnchantmentEffectComponents.PREVENT_EQUIPMENT_DROP)) {
            this.spawnAtLocation(var2);
         }
      }
   }

   public void addAdditionalSaveData(CompoundTag var1) {
      super.addAdditionalSaveData(var1);
      var1.putInt("DataNeighCooldown", (Integer)this.entityData.get(DATA_NeighCooldown));
      var1.putInt("DataTailWagCooldown", (Integer)this.entityData.get(DATA_TailWagCooldown));
      var1.putBoolean("DataChest", (Boolean)this.entityData.get(DATA_Chest));
      var1.putBoolean("DataSaddle", (Boolean)this.entityData.get(DATA_Saddle));
      var1.putInt("DataZebra", (Integer)this.entityData.get(DATA_Zebra));
      var1.putBoolean("DataBreed", (Boolean)this.entityData.get(DATA_Breed));
      var1.putBoolean("DataBaby", (Boolean)this.entityData.get(DATA_Baby));
      var1.putInt("DataVariant", (Integer)this.entityData.get(DATA_Variant));
      var1.putInt("DataNightmareTextureSwap", (Integer)this.entityData.get(DATA_NightmareTextureSwap));
      var1.putInt("DataNightmareTextureFrame", (Integer)this.entityData.get(DATA_NightmareTextureFrame));
      var1.putBoolean("DataDecaying", (Boolean)this.entityData.get(DATA_Decaying));
      var1.putInt("DataDecayingTimer", (Integer)this.entityData.get(DATA_DecayingTimer));
      var1.putInt("DataDecayedStage", (Integer)this.entityData.get(DATA_DecayedStage));
      var1.putBoolean("DataSpecial", (Boolean)this.entityData.get(DATA_Special));
      var1.putBoolean("DataTier1", (Boolean)this.entityData.get(DATA_Tier1));
      var1.putBoolean("DataTier2", (Boolean)this.entityData.get(DATA_Tier2));
      var1.putBoolean("DataTier3", (Boolean)this.entityData.get(DATA_Tier3));
      var1.putBoolean("DataTier4", (Boolean)this.entityData.get(DATA_Tier4));
      var1.putBoolean("DataRareBreed", (Boolean)this.entityData.get(DATA_RareBreed));
      var1.putBoolean("DataFairyBreeding", (Boolean)this.entityData.get(DATA_FairyBreeding));
      var1.putBoolean("DataMetalArmored", (Boolean)this.entityData.get(DATA_MetalArmored));
      var1.putBoolean("DataGoldenArmored", (Boolean)this.entityData.get(DATA_GoldenArmored));
      var1.putBoolean("DataDiamondArmored", (Boolean)this.entityData.get(DATA_DiamondArmored));
      var1.putBoolean("DataCrystalineArmored", (Boolean)this.entityData.get(DATA_CrystalineArmored));
      var1.putBoolean("DataFairy", (Boolean)this.entityData.get(DATA_Fairy));
      var1.putBoolean("DataWinged", (Boolean)this.entityData.get(DATA_Winged));
      var1.putInt("DataGrowUp", (Integer)this.entityData.get(DATA_GrowUp));
      var1.putBoolean("DataFireWalk", (Boolean)this.entityData.get(DATA_FireWalk));
      var1.putBoolean("DataNeigh", (Boolean)this.entityData.get(DATA_Neigh));
      var1.putBoolean("DataTailWag", (Boolean)this.entityData.get(DATA_TailWag));
      var1.put("InventoryCustom", this.inventory.serializeNBT(this.registryAccess()));
   }

   public void readAdditionalSaveData(CompoundTag var1) {
      super.readAdditionalSaveData(var1);
      if (var1.contains("DataNeighCooldown")) {
         this.entityData.set(DATA_NeighCooldown, var1.getInt("DataNeighCooldown"));
      }

      if (var1.contains("DataTailWagCooldown")) {
         this.entityData.set(DATA_TailWagCooldown, var1.getInt("DataTailWagCooldown"));
      }

      if (var1.contains("DataChest")) {
         this.entityData.set(DATA_Chest, var1.getBoolean("DataChest"));
      }

      if (var1.contains("DataSaddle")) {
         this.entityData.set(DATA_Saddle, var1.getBoolean("DataSaddle"));
      }

      if (var1.contains("DataZebra")) {
         this.entityData.set(DATA_Zebra, var1.getInt("DataZebra"));
      }

      if (var1.contains("DataBreed")) {
         this.entityData.set(DATA_Breed, var1.getBoolean("DataBreed"));
      }

      if (var1.contains("DataBaby")) {
         this.entityData.set(DATA_Baby, var1.getBoolean("DataBaby"));
      }

      if (var1.contains("DataVariant")) {
         this.entityData.set(DATA_Variant, var1.getInt("DataVariant"));
      }

      if (var1.contains("DataNightmareTextureSwap")) {
         this.entityData.set(DATA_NightmareTextureSwap, var1.getInt("DataNightmareTextureSwap"));
      }

      if (var1.contains("DataNightmareTextureFrame")) {
         this.entityData.set(DATA_NightmareTextureFrame, var1.getInt("DataNightmareTextureFrame"));
      }

      if (var1.contains("DataDecaying")) {
         this.entityData.set(DATA_Decaying, var1.getBoolean("DataDecaying"));
      }

      if (var1.contains("DataDecayingTimer")) {
         this.entityData.set(DATA_DecayingTimer, var1.getInt("DataDecayingTimer"));
      }

      if (var1.contains("DataDecayedStage")) {
         this.entityData.set(DATA_DecayedStage, var1.getInt("DataDecayedStage"));
      }

      if (var1.contains("DataSpecial")) {
         this.entityData.set(DATA_Special, var1.getBoolean("DataSpecial"));
      }

      if (var1.contains("DataTier1")) {
         this.entityData.set(DATA_Tier1, var1.getBoolean("DataTier1"));
      }

      if (var1.contains("DataTier2")) {
         this.entityData.set(DATA_Tier2, var1.getBoolean("DataTier2"));
      }

      if (var1.contains("DataTier3")) {
         this.entityData.set(DATA_Tier3, var1.getBoolean("DataTier3"));
      }

      if (var1.contains("DataTier4")) {
         this.entityData.set(DATA_Tier4, var1.getBoolean("DataTier4"));
      }

      if (var1.contains("DataRareBreed")) {
         this.entityData.set(DATA_RareBreed, var1.getBoolean("DataRareBreed"));
      }

      if (var1.contains("DataFairyBreeding")) {
         this.entityData.set(DATA_FairyBreeding, var1.getBoolean("DataFairyBreeding"));
      }

      if (var1.contains("DataMetalArmored")) {
         this.entityData.set(DATA_MetalArmored, var1.getBoolean("DataMetalArmored"));
      }

      if (var1.contains("DataGoldenArmored")) {
         this.entityData.set(DATA_GoldenArmored, var1.getBoolean("DataGoldenArmored"));
      }

      if (var1.contains("DataDiamondArmored")) {
         this.entityData.set(DATA_DiamondArmored, var1.getBoolean("DataDiamondArmored"));
      }

      if (var1.contains("DataCrystalineArmored")) {
         this.entityData.set(DATA_CrystalineArmored, var1.getBoolean("DataCrystalineArmored"));
      }

      if (var1.contains("DataFairy")) {
         this.entityData.set(DATA_Fairy, var1.getBoolean("DataFairy"));
      }

      if (var1.contains("DataWinged")) {
         this.entityData.set(DATA_Winged, var1.getBoolean("DataWinged"));
      }

      if (var1.contains("DataGrowUp")) {
         this.entityData.set(DATA_GrowUp, var1.getInt("DataGrowUp"));
      }

      if (var1.contains("DataFireWalk")) {
         this.entityData.set(DATA_FireWalk, var1.getBoolean("DataFireWalk"));
      }

      if (var1.contains("DataNeigh")) {
         this.entityData.set(DATA_Neigh, var1.getBoolean("DataNeigh"));
      }

      if (var1.contains("DataTailWag")) {
         this.entityData.set(DATA_TailWag, var1.getBoolean("DataTailWag"));
      }

      if (var1.get("InventoryCustom") instanceof CompoundTag var2) {
         this.inventory.deserializeNBT(this.registryAccess(), var2);
      }
   }

   public InteractionResult mobInteract(final Player var1, InteractionHand var2) {
      ItemStack var3 = var1.getItemInHand(var2);
      InteractionResult var4 = InteractionResult.sidedSuccess(this.level().isClientSide());
      if (var1.isSecondaryUseActive() && (Boolean)this.entityData.get(DATA_Chest)) {
         if (var1 instanceof ServerPlayer var9) {
            var9.openMenu(new MenuProvider() {
               public Component getDisplayName() {
                  return Component.literal("Horse");
               }

               public AbstractContainerMenu createMenu(int var1x, Inventory var2x, Player var3x) {
                  FriendlyByteBuf var4x = new FriendlyByteBuf(Unpooled.buffer());
                  var4x.writeBlockPos(var1.blockPosition());
                  var4x.writeByte(0);
                  var4x.writeVarInt(HorseEntity.this.getId());
                  return new HorseInventoryMenu(var1x, var2x, var4x);
               }
            }, var2x -> {
               var2x.writeBlockPos(var1.blockPosition());
               var2x.writeByte(0);
               var2x.writeVarInt(this.getId());
            });
         }

         return InteractionResult.sidedSuccess(this.level().isClientSide());
      } else {
         Item var5 = var3.getItem();
         if (var3.getItem() instanceof SpawnEggItem) {
            var4 = super.mobInteract(var1, var2);
         } else if (this.level().isClientSide()) {
            var4 = InteractionResult.sidedSuccess(this.level().isClientSide());
         } else if (this.isTame()) {
            if (this.isOwnedBy(var1)) {
               if (this.isFood(var3) && this.getHealth() < this.getMaxHealth()) {
                  this.usePlayerItem(var1, var2, var3);
                  FoodProperties var6 = var3.getFoodProperties(this);
                  float var7 = var6 != null ? var6.nutrition() : 1.0F;
                  this.heal(var7);
                  var4 = InteractionResult.sidedSuccess(this.level().isClientSide());
               } else if (!var1.isSecondaryUseActive() && (Boolean)this.entityData.get(DATA_Saddle)) {
                  if (!this.level().isClientSide()) {
                     var1.startRiding(this);
                  }

                  var4 = InteractionResult.sidedSuccess(this.level().isClientSide());
               } else {
                  var4 = super.mobInteract(var1, var2);
               }
            } else if (!var1.isSecondaryUseActive() && (Boolean)this.entityData.get(DATA_Saddle)) {
               if (!this.level().isClientSide()) {
                  var1.startRiding(this);
               }

               var4 = InteractionResult.sidedSuccess(this.level().isClientSide());
            } else {
               var4 = super.mobInteract(var1, var2);
            }
         } else if (var5 != Items.APPLE && var5 != Items.GOLDEN_APPLE && var5 != Items.ENCHANTED_GOLDEN_APPLE) {
            if (!var1.isSecondaryUseActive() && (Boolean)this.entityData.get(DATA_Saddle)) {
               if (!this.level().isClientSide()) {
                  this.tame(var1);
                  var1.startRiding(this);
               }

               var4 = InteractionResult.sidedSuccess(this.level().isClientSide());
            } else {
               var4 = super.mobInteract(var1, var2);
               if (var4 == InteractionResult.SUCCESS || var4 == InteractionResult.CONSUME) {
                  this.setPersistenceRequired();
               }
            }
         } else {
            if (!var1.getAbilities().instabuild) {
               var3.shrink(1);
            }

            if (!this.level().isClientSide()) {
               this.tame(var1);
               this.level().broadcastEntityEvent(this, (byte)7);
            }

            var4 = InteractionResult.sidedSuccess(this.level().isClientSide());
         }

         return var4;
      }
   }

   public void tick() {
      super.tick();
      if (this.level().isClientSide()) {
         this.animationState1.animateWhen(HorseFlyPlaybackConditionProcedure.execute(this), this.tickCount);
         this.animationState3.animateWhen(HorseNeighPlaybackConditionProcedure.execute(this), this.tickCount);
         this.animationState4.animateWhen(HorseTailWagPlaybackConditionProcedure.execute(this), this.tickCount);
      }
   }

   public void baseTick() {
      super.baseTick();
      HorseBabyProcedure.execute(this);
   }

   public AgeableMob getBreedOffspring(ServerLevel var1, AgeableMob var2) {
      HorseEntity var3 = (HorseEntity)(MocreaturesModEntities.HORSE.get()).create(var1);
      var3.finalizeSpawn(var1, var1.getCurrentDifficultyAt(var3.blockPosition()), MobSpawnType.BREEDING, null);
      return var3;
   }

   public boolean isFood(ItemStack var1) {
      return Ingredient.of(new ItemStack[]{new ItemStack(Blocks.PUMPKIN), new ItemStack(Items.MUSHROOM_STEW)}).test(var1);
   }

   public boolean canSprint() {
      return true;
   }

   public void travel(Vec3 var1) {
      if (!MoCFlightHelper.handleTravel(this, var1)) {
         Entity var2 = this.getPassengers().isEmpty() ? null : (Entity)this.getPassengers().get(0);
         if (this.isVehicle()) {
            this.setYRot(var2.getYRot());
            this.yRotO = this.getYRot();
            this.setXRot(var2.getXRot() * 0.5F);
            this.setRot(this.getYRot(), this.getXRot());
            this.yBodyRot = var2.getYRot();
            this.yHeadRot = var2.getYRot();
            if (var2 instanceof LivingEntity var3) {
               float var4 = (float)this.getAttributeValue(Attributes.MOVEMENT_SPEED);
               this.setSpeed(Math.min(var4, 0.22F));
               float var5 = var3.zza;
               float var6 = var3.xxa;
               super.travel(new Vec3(var6, 0.0, var5));
            }

            double var8 = this.getX() - this.xo;
            double var9 = this.getZ() - this.zo;
            float var7 = (float)Math.sqrt(var8 * var8 + var9 * var9) * 4.0F;
            if (var7 > 1.0F) {
               var7 = 1.0F;
            }

            this.walkAnimation.setSpeed(this.walkAnimation.speed() + (var7 - this.walkAnimation.speed()) * 0.4F);
            this.walkAnimation.position(this.walkAnimation.position() + this.walkAnimation.speed());
            this.calculateEntityAnimation(true);
         } else {
            super.travel(var1);
         }
      }
   }

   public static void init(RegisterSpawnPlacementsEvent var0) {
      var0.register(
         MocreaturesModEntities.HORSE.get(),
         SpawnPlacementTypes.ON_GROUND,
         Types.MOTION_BLOCKING_NO_LEAVES,
         (var0x, var1, var2, var3, var4) -> var1.getBlockState(var3.below()).is(BlockTags.ANIMALS_SPAWNABLE_ON) && var1.getRawBrightness(var3, 0) > 8,
         Operation.REPLACE
      );
   }

   public static net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder createAttributes() {
      net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder var0 = Mob.createMobAttributes();
      var0 = var0.add(Attributes.MOVEMENT_SPEED, 0.25);
      var0 = var0.add(Attributes.MAX_HEALTH, 30.0);
      var0 = var0.add(Attributes.ARMOR, 0.0);
      var0 = var0.add(Attributes.ATTACK_DAMAGE, 3.0);
      var0 = var0.add(Attributes.FOLLOW_RANGE, 16.0);
      return var0.add(Attributes.STEP_HEIGHT, 1.0);
   }
}
