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
import net.minecraft.world.phys.Vec3;
import net.mocreatures.init.MocreaturesModEntities;
import net.mocreatures.init.MocreaturesModItems;
import net.mocreatures.procedures.AttackPanthgerProcedure;
import net.mocreatures.procedures.BigCatFlyAnimationProcedure;
import net.mocreatures.procedures.BigCatIdleProcedure;
import net.mocreatures.procedures.MoCFlightHelper;
import net.mocreatures.procedures.PanthgerBabyProcedure;
import net.mocreatures.procedures.PanthgerBabyRightClickedProcedure;
import net.mocreatures.procedures.PanthgerDiesProcedure;
import net.mocreatures.procedures.PanthgerOnEnitialEntitySpawnProcedure;
import net.mocreatures.world.inventory.PanthgerInventoryMenu;
import net.neoforged.neoforge.event.EventHooks;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.items.IItemHandlerModifiable;
import net.neoforged.neoforge.items.ItemStackHandler;
import net.neoforged.neoforge.items.wrapper.CombinedInvWrapper;
import net.neoforged.neoforge.items.wrapper.EntityArmorInvWrapper;
import net.neoforged.neoforge.items.wrapper.EntityHandsInvWrapper;

public class PanthgerEntity extends TamableAnimal {
   public static final EntityDataAccessor<Boolean> DATA_Baby = SynchedEntityData.defineId(PanthgerEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Boolean> DATA_Saddle = SynchedEntityData.defineId(PanthgerEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Boolean> DATA_Chest = SynchedEntityData.defineId(PanthgerEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Boolean> DATA_Wings = SynchedEntityData.defineId(PanthgerEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Integer> DATA_GrowUp = SynchedEntityData.defineId(PanthgerEntity.class, EntityDataSerializers.INT);
   public static final EntityDataAccessor<Boolean> DATA_Medallion = SynchedEntityData.defineId(PanthgerEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Boolean> DATA_Tameable = SynchedEntityData.defineId(PanthgerEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Integer> DATA_Gender = SynchedEntityData.defineId(PanthgerEntity.class, EntityDataSerializers.INT);
   public static final EntityDataAccessor<Integer> DATA_Color = SynchedEntityData.defineId(PanthgerEntity.class, EntityDataSerializers.INT);
   public final AnimationState animationState1 = new AnimationState();
   public final AnimationState animationState2 = new AnimationState();
   private final ItemStackHandler inventory = new ItemStackHandler(18) {
      public int getSlotLimit(int slot) {
         return 64;
      }
   };
   private final CombinedInvWrapper combined = new CombinedInvWrapper(
      new IItemHandlerModifiable[]{this.inventory, new EntityHandsInvWrapper(this), new EntityArmorInvWrapper(this)}
   );

   public PanthgerEntity(EntityType<PanthgerEntity> type, Level world) {
      super(type, world);
      this.xpReward = 3;
      this.setNoAi(false);
   }

   protected void defineSynchedData(Builder builder) {
      super.defineSynchedData(builder);
      builder.define(DATA_Baby, false);
      builder.define(DATA_Saddle, false);
      builder.define(DATA_Chest, false);
      builder.define(DATA_Wings, false);
      builder.define(DATA_GrowUp, 0);
      builder.define(DATA_Medallion, false);
      builder.define(DATA_Tameable, false);
      builder.define(DATA_Gender, 0);
      builder.define(DATA_Color, 1);
   }

   protected void registerGoals() {
      super.registerGoals();
      this.goalSelector
         .addGoal(
            1,
            new MeleeAttackGoal(this, 1.2, false) {
               protected boolean canPerformAttack(LivingEntity entity) {
                  return this.isTimeToAttack()
                     && this.mob.distanceToSqr(entity) < this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth()
                     && this.mob.getSensing().hasLineOfSight(entity);
               }
            }
         );
      this.targetSelector.addGoal(2, new HurtByTargetGoal(this, new Class[0]));
      this.goalSelector.addGoal(3, new RandomStrollGoal(this, 0.8));
      this.goalSelector.addGoal(4, new RandomLookAroundGoal(this));
      this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, Player.class, false, false) {
         public boolean canUse() {
            double x = PanthgerEntity.this.getX();
            double y = PanthgerEntity.this.getY();
            double z = PanthgerEntity.this.getZ();
            Entity entity = PanthgerEntity.this;
            Level world = PanthgerEntity.this.level();
            return super.canUse() && AttackPanthgerProcedure.execute(entity);
         }
      });
   }

   protected Vec3 getPassengerAttachmentPoint(Entity entity, EntityDimensions dimensions, float f) {
      return super.getPassengerAttachmentPoint(entity, dimensions, f).add(0.0, -0.3F, 0.0);
   }

   public SoundEvent getAmbientSound() {
      return (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("mocreatures:lion_ambient"));
   }

   public SoundEvent getHurtSound(DamageSource ds) {
      return (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("mocreatures:lion_hurt"));
   }

   public SoundEvent getDeathSound() {
      return (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("mocreatures:lion_death"));
   }

   public boolean hurt(DamageSource damagesource, float amount) {
      return damagesource.is(DamageTypes.FALL) ? false : super.hurt(damagesource, amount);
   }

   public void die(DamageSource source) {
      super.die(source);
      PanthgerDiesProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ(), this);
   }

   public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata) {
      SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata);
      PanthgerOnEnitialEntitySpawnProcedure.execute();
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
      compound.putBoolean("DataBaby", (Boolean)this.entityData.get(DATA_Baby));
      compound.putBoolean("DataSaddle", (Boolean)this.entityData.get(DATA_Saddle));
      compound.putBoolean("DataChest", (Boolean)this.entityData.get(DATA_Chest));
      compound.putBoolean("DataWings", (Boolean)this.entityData.get(DATA_Wings));
      compound.putInt("DataGrowUp", (Integer)this.entityData.get(DATA_GrowUp));
      compound.putBoolean("DataMedallion", (Boolean)this.entityData.get(DATA_Medallion));
      compound.putBoolean("DataTameable", (Boolean)this.entityData.get(DATA_Tameable));
      compound.putInt("DataGender", (Integer)this.entityData.get(DATA_Gender));
      compound.putInt("DataColor", (Integer)this.entityData.get(DATA_Color));
      compound.put("InventoryCustom", this.inventory.serializeNBT(this.registryAccess()));
   }

   public void readAdditionalSaveData(CompoundTag compound) {
      super.readAdditionalSaveData(compound);
      if (compound.contains("DataBaby")) {
         this.entityData.set(DATA_Baby, compound.getBoolean("DataBaby"));
      }

      if (compound.contains("DataSaddle")) {
         this.entityData.set(DATA_Saddle, compound.getBoolean("DataSaddle"));
      }

      if (compound.contains("DataChest")) {
         this.entityData.set(DATA_Chest, compound.getBoolean("DataChest"));
      }

      if (compound.contains("DataWings")) {
         this.entityData.set(DATA_Wings, compound.getBoolean("DataWings"));
      }

      if (compound.contains("DataGrowUp")) {
         this.entityData.set(DATA_GrowUp, compound.getInt("DataGrowUp"));
      }

      if (compound.contains("DataMedallion")) {
         this.entityData.set(DATA_Medallion, compound.getBoolean("DataMedallion"));
      }

      if (compound.contains("DataTameable")) {
         this.entityData.set(DATA_Tameable, compound.getBoolean("DataTameable"));
      }

      if (compound.contains("DataGender")) {
         this.entityData.set(DATA_Gender, compound.getInt("DataGender"));
      }

      if (compound.contains("DataColor")) {
         this.entityData.set(DATA_Color, compound.getInt("DataColor"));
      }

      if (compound.get("InventoryCustom") instanceof CompoundTag inventoryTag) {
         this.inventory.deserializeNBT(this.registryAccess(), inventoryTag);
      }
   }

   public InteractionResult mobInteract(final Player sourceentity, InteractionHand hand) {
      ItemStack itemstack = sourceentity.getItemInHand(hand);
      InteractionResult retval = InteractionResult.sidedSuccess(this.level().isClientSide());
      if (sourceentity.isSecondaryUseActive() && (Boolean)this.entityData.get(DATA_Chest)) {
         if (sourceentity instanceof ServerPlayer serverPlayer) {
            serverPlayer.openMenu(new MenuProvider() {
               public Component getDisplayName() {
                  return Component.literal("Panthger");
               }

               public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
                  FriendlyByteBuf packetBuffer = new FriendlyByteBuf(Unpooled.buffer());
                  packetBuffer.writeBlockPos(sourceentity.blockPosition());
                  packetBuffer.writeByte(0);
                  packetBuffer.writeVarInt(PanthgerEntity.this.getId());
                  return new PanthgerInventoryMenu(id, inventory, packetBuffer);
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
         } else if (this.isFood(itemstack)) {
            this.usePlayerItem(sourceentity, hand, itemstack);
            if (this.random.nextInt(3) == 0 && !EventHooks.onAnimalTame(this, sourceentity)) {
               this.tame(sourceentity);
               this.level().broadcastEntityEvent(this, (byte)7);
            } else {
               this.level().broadcastEntityEvent(this, (byte)6);
            }

            this.setPersistenceRequired();
            retval = InteractionResult.sidedSuccess(this.level().isClientSide());
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
         PanthgerBabyRightClickedProcedure.execute(world, x, y, z, entity, sourceentity);
         return retval;
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
      PanthgerBabyProcedure.execute(this);
   }

   public AgeableMob getBreedOffspring(ServerLevel serverWorld, AgeableMob ageable) {
      PanthgerEntity retval = (PanthgerEntity)(MocreaturesModEntities.PANTHGER.get()).create(serverWorld);
      retval.finalizeSpawn(serverWorld, serverWorld.getCurrentDifficultyAt(retval.blockPosition()), MobSpawnType.BREEDING, null);
      return retval;
   }

   public boolean isFood(ItemStack stack) {
      return Ingredient.of(new ItemStack[]{new ItemStack((ItemLike)MocreaturesModItems.TAME.get())}).test(stack);
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
   }

   public static net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder createAttributes() {
      net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder builder = Mob.createMobAttributes();
      builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
      builder = builder.add(Attributes.MAX_HEALTH, 40.0);
      builder = builder.add(Attributes.ARMOR, 0.0);
      builder = builder.add(Attributes.ATTACK_DAMAGE, 7.0);
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
