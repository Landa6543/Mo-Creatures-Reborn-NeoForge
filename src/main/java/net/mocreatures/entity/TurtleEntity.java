package net.mocreatures.entity;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.network.syncher.SynchedEntityData.Builder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnPlacementTypes;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.LeapAtTargetGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.Heightmap.Types;
import net.mocreatures.init.MocreaturesModEntities;
import net.mocreatures.procedures.TurtleDiesProcedure;
import net.mocreatures.procedures.TurtleOnEntityTickUpdateProcedure;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent.Operation;

public class TurtleEntity extends Animal {
   public static final EntityDataAccessor<Boolean> DATA_Leonardo = SynchedEntityData.defineId(TurtleEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Boolean> DATA_Donatello = SynchedEntityData.defineId(TurtleEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Boolean> DATA_Raphael = SynchedEntityData.defineId(TurtleEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Boolean> DATA_Michelangelo = SynchedEntityData.defineId(TurtleEntity.class, EntityDataSerializers.BOOLEAN);
   public final AnimationState animationState0 = new AnimationState();

   public TurtleEntity(EntityType<TurtleEntity> type, Level world) {
      super(type, world);
      this.xpReward = 3;
      this.setNoAi(false);
   }

   protected void defineSynchedData(Builder builder) {
      super.defineSynchedData(builder);
      builder.define(DATA_Leonardo, false);
      builder.define(DATA_Donatello, false);
      builder.define(DATA_Raphael, false);
      builder.define(DATA_Michelangelo, false);
   }

   protected void registerGoals() {
      super.registerGoals();
      this.goalSelector.addGoal(1, new RandomStrollGoal(this, 1.0));
      this.goalSelector.addGoal(2, new RandomLookAroundGoal(this));
      this.goalSelector.addGoal(3, new FloatGoal(this));
      this.goalSelector.addGoal(4, new LeapAtTargetGoal(this, 0.5F));
   }

   public SoundEvent getHurtSound(DamageSource ds) {
      return (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.generic.hurt"));
   }

   public SoundEvent getDeathSound() {
      return (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.generic.death"));
   }

   public boolean hurt(DamageSource damagesource, float amount) {
      return damagesource.is(DamageTypes.DROWN) ? false : super.hurt(damagesource, amount);
   }

   public void die(DamageSource source) {
      super.die(source);
      TurtleDiesProcedure.execute(this.level(), this);
   }

   public void addAdditionalSaveData(CompoundTag compound) {
      super.addAdditionalSaveData(compound);
      compound.putBoolean("DataLeonardo", (Boolean)this.entityData.get(DATA_Leonardo));
      compound.putBoolean("DataDonatello", (Boolean)this.entityData.get(DATA_Donatello));
      compound.putBoolean("DataRaphael", (Boolean)this.entityData.get(DATA_Raphael));
      compound.putBoolean("DataMichelangelo", (Boolean)this.entityData.get(DATA_Michelangelo));
   }

   public void readAdditionalSaveData(CompoundTag compound) {
      super.readAdditionalSaveData(compound);
      if (compound.contains("DataLeonardo")) {
         this.entityData.set(DATA_Leonardo, compound.getBoolean("DataLeonardo"));
      }

      if (compound.contains("DataDonatello")) {
         this.entityData.set(DATA_Donatello, compound.getBoolean("DataDonatello"));
      }

      if (compound.contains("DataRaphael")) {
         this.entityData.set(DATA_Raphael, compound.getBoolean("DataRaphael"));
      }

      if (compound.contains("DataMichelangelo")) {
         this.entityData.set(DATA_Michelangelo, compound.getBoolean("DataMichelangelo"));
      }
   }

   public void tick() {
      super.tick();
      if (this.level().isClientSide()) {
         this.animationState0.animateWhen(true, this.tickCount);
      }
   }

   public void baseTick() {
      super.baseTick();
      TurtleOnEntityTickUpdateProcedure.execute(this);
   }

   public AgeableMob getBreedOffspring(ServerLevel serverWorld, AgeableMob ageable) {
      TurtleEntity retval = (TurtleEntity)(MocreaturesModEntities.TURTLE.get()).create(serverWorld);
      retval.finalizeSpawn(serverWorld, serverWorld.getCurrentDifficultyAt(retval.blockPosition()), MobSpawnType.BREEDING, null);
      return retval;
   }

   public boolean isFood(ItemStack stack) {
      return Ingredient.of(new ItemStack[]{new ItemStack(Blocks.SUGAR_CANE), new ItemStack(Items.MELON_SLICE)}).test(stack);
   }

   public static void init(RegisterSpawnPlacementsEvent event) {
      event.register(
         MocreaturesModEntities.TURTLE.get(),
         SpawnPlacementTypes.ON_GROUND,
         Types.MOTION_BLOCKING_NO_LEAVES,
         (entityType, world, reason, pos, random) -> world.getBlockState(pos.below()).is(BlockTags.ANIMALS_SPAWNABLE_ON) && world.getRawBrightness(pos, 0) > 8,
         Operation.REPLACE
      );
   }

   public static net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder createAttributes() {
      net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder builder = Mob.createMobAttributes();
      builder = builder.add(Attributes.MOVEMENT_SPEED, 0.2);
      builder = builder.add(Attributes.MAX_HEALTH, 15.0);
      builder = builder.add(Attributes.ARMOR, 0.0);
      builder = builder.add(Attributes.ATTACK_DAMAGE, 3.0);
      builder = builder.add(Attributes.FOLLOW_RANGE, 16.0);
      return builder.add(Attributes.STEP_HEIGHT, 0.6);
   }
}
