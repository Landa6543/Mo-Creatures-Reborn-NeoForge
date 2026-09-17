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
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.SpawnPlacementTypes;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
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
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.levelgen.Heightmap.Types;
import net.minecraft.world.phys.Vec3;
import net.mocreatures.init.MocreaturesModEntities;
import net.mocreatures.init.MocreaturesModItems;
import net.mocreatures.procedures.AttackLionProcedure;
import net.mocreatures.procedures.BigCatFlyAnimationProcedure;
import net.mocreatures.procedures.BigCatIdleProcedure;
import net.mocreatures.procedures.LionBabyProcedure;
import net.mocreatures.procedures.LionBabyRightClickedProcedure;
import net.mocreatures.procedures.LionDiesProcedure;
import net.mocreatures.procedures.LionOnInitialEntitySpawnProcedure;
import net.mocreatures.procedures.MoCFlightHelper;
import net.mocreatures.world.inventory.LionInventoryMenu;
import net.neoforged.neoforge.event.EventHooks;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent.Operation;
import net.neoforged.neoforge.items.IItemHandlerModifiable;
import net.neoforged.neoforge.items.ItemStackHandler;
import net.neoforged.neoforge.items.wrapper.CombinedInvWrapper;
import net.neoforged.neoforge.items.wrapper.EntityArmorInvWrapper;
import net.neoforged.neoforge.items.wrapper.EntityHandsInvWrapper;

public class LionEntity extends TamableAnimal {
   public static final EntityDataAccessor<Boolean> DATA_Baby = SynchedEntityData.defineId(LionEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Boolean> DATA_Saddle = SynchedEntityData.defineId(LionEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Boolean> DATA_Chest = SynchedEntityData.defineId(LionEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Boolean> DATA_Wings = SynchedEntityData.defineId(LionEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Integer> DATA_GrowUp = SynchedEntityData.defineId(LionEntity.class, EntityDataSerializers.INT);
   public static final EntityDataAccessor<Boolean> DATA_Medallion = SynchedEntityData.defineId(LionEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Integer> DATA_LionColor = SynchedEntityData.defineId(LionEntity.class, EntityDataSerializers.INT);
   public static final EntityDataAccessor<Integer> DATA_LionGender = SynchedEntityData.defineId(LionEntity.class, EntityDataSerializers.INT);
   public static final EntityDataAccessor<Boolean> DATA_Tameable = SynchedEntityData.defineId(LionEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Boolean> DATA_Breed = SynchedEntityData.defineId(LionEntity.class, EntityDataSerializers.BOOLEAN);
   public final AnimationState animationState1 = new AnimationState();
   public final AnimationState animationState2 = new AnimationState();
   private final ItemStackHandler inventory = new ItemStackHandler(18) {
      public int getSlotLimit(int var1) {
         return 64;
      }
   };
   private final CombinedInvWrapper combined = new CombinedInvWrapper(
      new IItemHandlerModifiable[]{this.inventory, new EntityHandsInvWrapper(this), new EntityArmorInvWrapper(this)}
   );

   public LionEntity(EntityType<LionEntity> var1, Level var2) {
      super(var1, var2);
      this.xpReward = 3;
      this.setNoAi(false);
   }

   protected void defineSynchedData(Builder var1) {
      super.defineSynchedData(var1);
      var1.define(DATA_Baby, false);
      var1.define(DATA_Saddle, false);
      var1.define(DATA_Chest, false);
      var1.define(DATA_Wings, false);
      var1.define(DATA_GrowUp, 0);
      var1.define(DATA_Medallion, false);
      var1.define(DATA_LionColor, 1);
      var1.define(DATA_LionGender, 1);
      var1.define(DATA_Tameable, false);
      var1.define(DATA_Breed, false);
   }

   protected void registerGoals() {
      super.registerGoals();
      this.goalSelector
         .addGoal(
            1,
            new MeleeAttackGoal(this, 1.2, false) {
               protected boolean canPerformAttack(LivingEntity var1) {
                  return this.isTimeToAttack()
                     && this.mob.distanceToSqr(var1) < this.mob.getBbWidth() * this.mob.getBbWidth() + var1.getBbWidth()
                     && this.mob.getSensing().hasLineOfSight(var1);
               }
            }
         );
      this.targetSelector.addGoal(2, new HurtByTargetGoal(this, new Class[0]));
      this.goalSelector.addGoal(3, new RandomStrollGoal(this, 0.8));
      this.goalSelector.addGoal(4, new RandomLookAroundGoal(this));
      this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, Player.class, false, false) {
         public boolean canUse() {
            double var1 = LionEntity.this.getX();
            double var3 = LionEntity.this.getY();
            double var5 = LionEntity.this.getZ();
            LionEntity var7 = LionEntity.this;
            Level var8 = LionEntity.this.level();
            return super.canUse() && AttackLionProcedure.execute(var7);
         }
      });
   }

   protected Vec3 getPassengerAttachmentPoint(Entity var1, EntityDimensions var2, float var3) {
      return super.getPassengerAttachmentPoint(var1, var2, var3).add(0.0, -0.3F, 0.0);
   }

   public SoundEvent getAmbientSound() {
      return (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("mocreatures:lion_ambient"));
   }

   public SoundEvent getHurtSound(DamageSource var1) {
      return (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("mocreatures:lion_hurt"));
   }

   public SoundEvent getDeathSound() {
      return (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("mocreatures:lion_death"));
   }

   public boolean hurt(DamageSource var1, float var2) {
      return var1.is(DamageTypes.FALL) ? false : super.hurt(var1, var2);
   }

   public void die(DamageSource var1) {
      super.die(var1);
      LionDiesProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ(), this);
   }

   public SpawnGroupData finalizeSpawn(ServerLevelAccessor var1, DifficultyInstance var2, MobSpawnType var3, @Nullable SpawnGroupData var4) {
      SpawnGroupData var5 = super.finalizeSpawn(var1, var2, var3, var4);
      LionOnInitialEntitySpawnProcedure.execute(this);
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
      var1.putBoolean("DataBaby", (Boolean)this.entityData.get(DATA_Baby));
      var1.putBoolean("DataSaddle", (Boolean)this.entityData.get(DATA_Saddle));
      var1.putBoolean("DataChest", (Boolean)this.entityData.get(DATA_Chest));
      var1.putBoolean("DataWings", (Boolean)this.entityData.get(DATA_Wings));
      var1.putInt("DataGrowUp", (Integer)this.entityData.get(DATA_GrowUp));
      var1.putBoolean("DataMedallion", (Boolean)this.entityData.get(DATA_Medallion));
      var1.putInt("DataLionColor", (Integer)this.entityData.get(DATA_LionColor));
      var1.putInt("DataLionGender", (Integer)this.entityData.get(DATA_LionGender));
      var1.putBoolean("DataTameable", (Boolean)this.entityData.get(DATA_Tameable));
      var1.putBoolean("DataBreed", (Boolean)this.entityData.get(DATA_Breed));
      var1.put("InventoryCustom", this.inventory.serializeNBT(this.registryAccess()));
   }

   public void readAdditionalSaveData(CompoundTag var1) {
      super.readAdditionalSaveData(var1);
      if (var1.contains("DataBaby")) {
         this.entityData.set(DATA_Baby, var1.getBoolean("DataBaby"));
      }

      if (var1.contains("DataSaddle")) {
         this.entityData.set(DATA_Saddle, var1.getBoolean("DataSaddle"));
      }

      if (var1.contains("DataChest")) {
         this.entityData.set(DATA_Chest, var1.getBoolean("DataChest"));
      }

      if (var1.contains("DataWings")) {
         this.entityData.set(DATA_Wings, var1.getBoolean("DataWings"));
      }

      if (var1.contains("DataGrowUp")) {
         this.entityData.set(DATA_GrowUp, var1.getInt("DataGrowUp"));
      }

      if (var1.contains("DataMedallion")) {
         this.entityData.set(DATA_Medallion, var1.getBoolean("DataMedallion"));
      }

      if (var1.contains("DataLionColor")) {
         this.entityData.set(DATA_LionColor, var1.getInt("DataLionColor"));
      }

      if (var1.contains("DataLionGender")) {
         this.entityData.set(DATA_LionGender, var1.getInt("DataLionGender"));
      }

      if (var1.contains("DataTameable")) {
         this.entityData.set(DATA_Tameable, var1.getBoolean("DataTameable"));
      }

      if (var1.contains("DataBreed")) {
         this.entityData.set(DATA_Breed, var1.getBoolean("DataBreed"));
      }

      if (var1.get("InventoryCustom") instanceof CompoundTag var2) {
         this.inventory.deserializeNBT(this.registryAccess(), var2);
      }
   }

   public InteractionResult mobInteract(final Player var1, InteractionHand var2) {
      ItemStack var3 = var1.getItemInHand(var2);
      InteractionResult var4 = InteractionResult.sidedSuccess(this.level().isClientSide());
      if (var1.isSecondaryUseActive() && (Boolean)this.entityData.get(DATA_Chest)) {
         if (var1 instanceof ServerPlayer var13) {
            var13.openMenu(new MenuProvider() {
               public Component getDisplayName() {
                  return Component.literal("Lion");
               }

               public AbstractContainerMenu createMenu(int var1x, Inventory var2x, Player var3x) {
                  FriendlyByteBuf var4x = new FriendlyByteBuf(Unpooled.buffer());
                  var4x.writeBlockPos(var1.blockPosition());
                  var4x.writeByte(0);
                  var4x.writeVarInt(LionEntity.this.getId());
                  return new LionInventoryMenu(var1x, var2x, var4x);
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
            var4 = (!this.isTame() || !this.isOwnedBy(var1)) && !this.isFood(var3)
               ? InteractionResult.PASS
               : InteractionResult.sidedSuccess(this.level().isClientSide());
         } else if (this.isTame()) {
            if (this.isOwnedBy(var1)) {
               if (this.isFood(var3) && this.getHealth() < this.getMaxHealth()) {
                  this.usePlayerItem(var1, var2, var3);
                  FoodProperties var6 = var3.getFoodProperties(this);
                  float var7 = var6 != null ? var6.nutrition() : 1.0F;
                  this.heal(var7);
                  var4 = InteractionResult.sidedSuccess(this.level().isClientSide());
               } else if (this.isFood(var3) && this.getHealth() < this.getMaxHealth()) {
                  this.usePlayerItem(var1, var2, var3);
                  this.heal(4.0F);
                  var4 = InteractionResult.sidedSuccess(this.level().isClientSide());
               } else {
                  var4 = super.mobInteract(var1, var2);
               }
            }
         } else if (this.isFood(var3)) {
            this.usePlayerItem(var1, var2, var3);
            if (this.random.nextInt(3) == 0 && !EventHooks.onAnimalTame(this, var1)) {
               this.tame(var1);
               this.level().broadcastEntityEvent(this, (byte)7);
            } else {
               this.level().broadcastEntityEvent(this, (byte)6);
            }

            this.setPersistenceRequired();
            var4 = InteractionResult.sidedSuccess(this.level().isClientSide());
         } else {
            var4 = super.mobInteract(var1, var2);
            if (var4 == InteractionResult.SUCCESS || var4 == InteractionResult.CONSUME) {
               this.setPersistenceRequired();
            }
         }

         double var14 = this.getX();
         double var8 = this.getY();
         double var10 = this.getZ();
         Level var12 = this.level();
         LionBabyRightClickedProcedure.execute(var12, var14, var8, var10, this, var1);
         return var4;
      }
   }

   public void tick() {
      super.tick();
      if (this.level().isClientSide()) {
         this.animationState1.animateWhen(BigCatFlyAnimationProcedure.execute(this), this.tickCount);
         this.animationState2.animateWhen(BigCatIdleProcedure.execute(this), this.tickCount);
      }
   }

   public void baseTick() {
      super.baseTick();
      LionBabyProcedure.execute(this);
   }

   public AgeableMob getBreedOffspring(ServerLevel var1, AgeableMob var2) {
      LionEntity var3 = (LionEntity)(MocreaturesModEntities.LION.get()).create(var1);
      var3.finalizeSpawn(var1, var1.getCurrentDifficultyAt(var3.blockPosition()), MobSpawnType.BREEDING, null);
      return var3;
   }

   public boolean isFood(ItemStack var1) {
      return Ingredient.of(new ItemStack[]{new ItemStack((ItemLike)MocreaturesModItems.TAME.get())}).test(var1);
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
         MocreaturesModEntities.LION.get(),
         SpawnPlacementTypes.ON_GROUND,
         Types.MOTION_BLOCKING_NO_LEAVES,
         (var0x, var1, var2, var3, var4) -> var1.getBlockState(var3.below()).is(BlockTags.ANIMALS_SPAWNABLE_ON) && var1.getRawBrightness(var3, 0) > 8,
         Operation.REPLACE
      );
   }

   public static net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder createAttributes() {
      net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder var0 = Mob.createMobAttributes();
      var0 = var0.add(Attributes.MOVEMENT_SPEED, 0.22);
      var0 = var0.add(Attributes.MAX_HEALTH, 40.0);
      var0 = var0.add(Attributes.ARMOR, 0.0);
      var0 = var0.add(Attributes.ATTACK_DAMAGE, 7.0);
      var0 = var0.add(Attributes.FOLLOW_RANGE, 16.0);
      return var0.add(Attributes.STEP_HEIGHT, 1.0);
   }

   public LivingEntity getControllingPassenger() {
      Entity var1 = this.getFirstPassenger();
      return var1 instanceof LivingEntity ? (LivingEntity)var1 : null;
   }

   public boolean canSprint() {
      return true;
   }
}
