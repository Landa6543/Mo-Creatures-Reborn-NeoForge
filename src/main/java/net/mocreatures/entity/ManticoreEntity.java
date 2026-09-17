package net.mocreatures.entity;

import java.util.List;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.network.syncher.SynchedEntityData.Builder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.Difficulty;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.SpawnPlacementTypes;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Entity.RemovalReason;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.levelgen.Heightmap.Types;
import net.minecraft.world.phys.Vec3;
import net.mocreatures.init.MocreaturesModEntities;
import net.mocreatures.procedures.ManticorePassiveBabyProcedure;
import net.mocreatures.procedures.MoCFlightHelper;
import net.mocreatures.procedures.PlainManticoreBabyProcedure;
import net.mocreatures.procedures.PlainManticoreBabyRightClickedProcedure;
import net.mocreatures.procedures.PlainManticoreDiesProcedure;
import net.neoforged.neoforge.event.EventHooks;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent.Operation;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animation.AnimationController;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.animation.PlayState;
import software.bernie.geckolib.animation.RawAnimation;
import software.bernie.geckolib.animation.AnimatableManager.ControllerRegistrar;
import software.bernie.geckolib.animation.AnimationController.State;
import software.bernie.geckolib.util.GeckoLibUtil;

public class ManticoreEntity extends TamableAnimal implements GeoEntity {
   public static final EntityDataAccessor<Boolean> SHOOT = SynchedEntityData.defineId(ManticoreEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<String> ANIMATION = SynchedEntityData.defineId(ManticoreEntity.class, EntityDataSerializers.STRING);
   public static final EntityDataAccessor<String> TEXTURE = SynchedEntityData.defineId(ManticoreEntity.class, EntityDataSerializers.STRING);
   public static final EntityDataAccessor<Boolean> DATA_Saddled = SynchedEntityData.defineId(ManticoreEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Boolean> DATA_Baby = SynchedEntityData.defineId(ManticoreEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Integer> DATA_GrowUp = SynchedEntityData.defineId(ManticoreEntity.class, EntityDataSerializers.INT);
   public static final EntityDataAccessor<Boolean> DATA_Fly = SynchedEntityData.defineId(ManticoreEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Boolean> DATA_Grounded = SynchedEntityData.defineId(ManticoreEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Integer> DATA_FlyCooldown = SynchedEntityData.defineId(ManticoreEntity.class, EntityDataSerializers.INT);
   public static final EntityDataAccessor<Integer> DATA_GroundedCooldown = SynchedEntityData.defineId(ManticoreEntity.class, EntityDataSerializers.INT);
   public static final EntityDataAccessor<Integer> DATA_StingCount = SynchedEntityData.defineId(ManticoreEntity.class, EntityDataSerializers.INT);
   private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);
   private boolean swinging;
   private boolean lastloop;
   private long lastSwing;
   public String animationprocedure = "empty";
   String prevAnim = "empty";

   public ManticoreEntity(EntityType<ManticoreEntity> type, Level world) {
      super(type, world);
      this.xpReward = 5;
      this.setNoAi(false);
   }

   protected void defineSynchedData(Builder builder) {
      super.defineSynchedData(builder);
      builder.define(SHOOT, false);
      builder.define(ANIMATION, "undefined");
      builder.define(TEXTURE, "manticore_plain_bare");
      builder.define(DATA_Saddled, false);
      builder.define(DATA_Baby, false);
      builder.define(DATA_GrowUp, 0);
      builder.define(DATA_Fly, false);
      builder.define(DATA_Grounded, false);
      builder.define(DATA_FlyCooldown, 0);
      builder.define(DATA_GroundedCooldown, 0);
      builder.define(DATA_StingCount, 0);
   }

   public void setTexture(String texture) {
      this.entityData.set(TEXTURE, texture);
   }

   public String getTexture() {
      return (String)this.entityData.get(TEXTURE);
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

               public boolean canUse() {
                  double x = ManticoreEntity.this.getX();
                  double y = ManticoreEntity.this.getY();
                  double z = ManticoreEntity.this.getZ();
                  Entity entity = ManticoreEntity.this;
                  Level world = ManticoreEntity.this.level();
                  return super.canUse() && ManticorePassiveBabyProcedure.execute(entity);
               }
            }
         );
      this.targetSelector.addGoal(2, new HurtByTargetGoal(this) {
         public boolean canUse() {
            double x = ManticoreEntity.this.getX();
            double y = ManticoreEntity.this.getY();
            double z = ManticoreEntity.this.getZ();
            Entity entity = ManticoreEntity.this;
            Level world = ManticoreEntity.this.level();
            return super.canUse() && ManticorePassiveBabyProcedure.execute(entity);
         }
      });
      this.goalSelector.addGoal(3, new RandomStrollGoal(this, 0.8));
      this.goalSelector.addGoal(4, new FloatGoal(this));
      this.goalSelector.addGoal(5, new RandomLookAroundGoal(this));
      this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, Player.class, false, false) {
         public boolean canUse() {
            double x = ManticoreEntity.this.getX();
            double y = ManticoreEntity.this.getY();
            double z = ManticoreEntity.this.getZ();
            Entity entity = ManticoreEntity.this;
            Level world = ManticoreEntity.this.level();
            return super.canUse() && ManticorePassiveBabyProcedure.execute(entity);
         }
      });
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

   public boolean hurt(DamageSource source, float amount) {
      return source.is(DamageTypes.FALL) ? false : super.hurt(source, amount);
   }

   public void die(DamageSource source) {
      super.die(source);
      PlainManticoreDiesProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ(), this);
   }

   public void addAdditionalSaveData(CompoundTag compound) {
      super.addAdditionalSaveData(compound);
      compound.putString("Texture", this.getTexture());
      compound.putBoolean("DataSaddled", (Boolean)this.entityData.get(DATA_Saddled));
      compound.putBoolean("DataBaby", (Boolean)this.entityData.get(DATA_Baby));
      compound.putInt("DataGrowUp", (Integer)this.entityData.get(DATA_GrowUp));
      compound.putBoolean("DataFly", (Boolean)this.entityData.get(DATA_Fly));
      compound.putBoolean("DataGrounded", (Boolean)this.entityData.get(DATA_Grounded));
      compound.putInt("DataFlyCooldown", (Integer)this.entityData.get(DATA_FlyCooldown));
      compound.putInt("DataGroundedCooldown", (Integer)this.entityData.get(DATA_GroundedCooldown));
      compound.putInt("DataStingCount", (Integer)this.entityData.get(DATA_StingCount));
   }

   public void readAdditionalSaveData(CompoundTag compound) {
      super.readAdditionalSaveData(compound);
      if (compound.contains("Texture")) {
         this.setTexture(compound.getString("Texture"));
      }

      if (compound.contains("DataSaddled")) {
         this.entityData.set(DATA_Saddled, compound.getBoolean("DataSaddled"));
      }

      if (compound.contains("DataBaby")) {
         this.entityData.set(DATA_Baby, compound.getBoolean("DataBaby"));
      }

      if (compound.contains("DataGrowUp")) {
         this.entityData.set(DATA_GrowUp, compound.getInt("DataGrowUp"));
      }

      if (compound.contains("DataFly")) {
         this.entityData.set(DATA_Fly, compound.getBoolean("DataFly"));
      }

      if (compound.contains("DataGrounded")) {
         this.entityData.set(DATA_Grounded, compound.getBoolean("DataGrounded"));
      }

      if (compound.contains("DataFlyCooldown")) {
         this.entityData.set(DATA_FlyCooldown, compound.getInt("DataFlyCooldown"));
      }

      if (compound.contains("DataGroundedCooldown")) {
         this.entityData.set(DATA_GroundedCooldown, compound.getInt("DataGroundedCooldown"));
      }

      if (compound.contains("DataStingCount")) {
         this.entityData.set(DATA_StingCount, compound.getInt("DataStingCount"));
      }
   }

   public InteractionResult mobInteract(Player sourceentity, InteractionHand hand) {
      ItemStack itemstack = sourceentity.getItemInHand(hand);
      InteractionResult retval = InteractionResult.sidedSuccess(this.level().isClientSide());
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
      PlainManticoreBabyRightClickedProcedure.execute(world, x, y, z, entity, sourceentity);
      return retval;
   }

   public void baseTick() {
      super.baseTick();
      PlainManticoreBabyProcedure.execute(this);
      this.refreshDimensions();
   }

   public EntityDimensions getDefaultDimensions(Pose pose) {
      return super.getDefaultDimensions(pose).scale(1.2F);
   }

   public AgeableMob getBreedOffspring(ServerLevel serverWorld, AgeableMob ageable) {
      ManticoreEntity retval = (ManticoreEntity)(MocreaturesModEntities.MANTICORE.get()).create(serverWorld);
      retval.finalizeSpawn(serverWorld, serverWorld.getCurrentDifficultyAt(retval.blockPosition()), MobSpawnType.BREEDING, null);
      return retval;
   }

   public boolean isFood(ItemStack stack) {
      return List.of().contains(stack.getItem());
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

   public void aiStep() {
      super.aiStep();
      this.updateSwingTime();
   }

   public static void init(RegisterSpawnPlacementsEvent event) {
      event.register(
         MocreaturesModEntities.MANTICORE.get(),
         SpawnPlacementTypes.ON_GROUND,
         Types.MOTION_BLOCKING_NO_LEAVES,
         (entityType, world, reason, pos, random) -> world.getDifficulty() != Difficulty.PEACEFUL
            && Monster.isDarkEnoughToSpawn(world, pos, random)
            && Mob.checkMobSpawnRules(entityType, world, reason, pos, random),
         Operation.REPLACE
      );
   }

   public static net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder createAttributes() {
      net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder builder = Mob.createMobAttributes();
      builder = builder.add(Attributes.MOVEMENT_SPEED, 0.25);
      builder = builder.add(Attributes.MAX_HEALTH, 40.0);
      builder = builder.add(Attributes.ARMOR, 0.0);
      builder = builder.add(Attributes.ATTACK_DAMAGE, 5.0);
      builder = builder.add(Attributes.FOLLOW_RANGE, 16.0);
      return builder.add(Attributes.STEP_HEIGHT, 1.0);
   }

   private PlayState movementPredicate(AnimationState event) {
      if (!this.animationprocedure.equals("empty")) {
         return PlayState.STOP;
      } else if ((event.isMoving() || !(event.getLimbSwingAmount() > -0.15F) || !(event.getLimbSwingAmount() < 0.15F)) && this.onGround()) {
         return event.setAndContinue(RawAnimation.begin().thenLoop("walk"));
      } else {
         return !this.onGround() ? event.setAndContinue(RawAnimation.begin().thenLoop("flight")) : event.setAndContinue(RawAnimation.begin().thenLoop("idle"));
      }
   }

   private PlayState procedurePredicate(AnimationState event) {
      if (!this.animationprocedure.equals("empty") && event.getController().getAnimationState() == State.STOPPED
         || !this.animationprocedure.equals(this.prevAnim) && !this.animationprocedure.equals("empty")) {
         if (!this.animationprocedure.equals(this.prevAnim)) {
            event.getController().forceAnimationReset();
         }

         event.getController().setAnimation(RawAnimation.begin().thenPlay(this.animationprocedure));
         if (event.getController().getAnimationState() == State.STOPPED) {
            this.animationprocedure = "empty";
            event.getController().forceAnimationReset();
         }
      } else if (this.animationprocedure.equals("empty")) {
         this.prevAnim = "empty";
         return PlayState.STOP;
      }

      this.prevAnim = this.animationprocedure;
      return PlayState.CONTINUE;
   }

   protected void tickDeath() {
      this.deathTime++;
      if (this.deathTime == 20) {
         this.remove(RemovalReason.KILLED);
         this.dropExperience(this);
      }
   }

   public String getSyncedAnimation() {
      return (String)this.entityData.get(ANIMATION);
   }

   public void setAnimation(String animation) {
      this.entityData.set(ANIMATION, animation);
   }

   public void registerControllers(ControllerRegistrar data) {
      data.add(new AnimationController(this, "movement", 4, this::movementPredicate));
      data.add(new AnimationController(this, "procedure", 4, this::procedurePredicate));
   }

   public AnimatableInstanceCache getAnimatableInstanceCache() {
      return this.cache;
   }

   public LivingEntity getControllingPassenger() {
      Entity var1 = this.getFirstPassenger();
      return var1 instanceof LivingEntity ? (LivingEntity)var1 : null;
   }

   public boolean causeFallDamage(float var1, float var2, DamageSource var3) {
      return false;
   }

   public boolean canSprint() {
      return true;
   }
}
