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
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
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
import net.mocreatures.procedures.ElephantBabyProcedure;
import net.mocreatures.procedures.ElephantRightClickedOnEntityProcedure;
import net.mocreatures.procedures.ElephantSpawnProcedure;
import net.mocreatures.procedures.MoCFlightHelper;
import net.mocreatures.world.inventory.ElephantInventoryMenu;
import net.neoforged.neoforge.event.EventHooks;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent.Operation;
import net.neoforged.neoforge.items.IItemHandlerModifiable;
import net.neoforged.neoforge.items.ItemStackHandler;
import net.neoforged.neoforge.items.wrapper.CombinedInvWrapper;
import net.neoforged.neoforge.items.wrapper.EntityArmorInvWrapper;
import net.neoforged.neoforge.items.wrapper.EntityHandsInvWrapper;

public class ElephantEntity extends TamableAnimal {
   public static final EntityDataAccessor<Boolean> DATA_Baby = SynchedEntityData.defineId(ElephantEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Boolean> DATA_African = SynchedEntityData.defineId(ElephantEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Boolean> DATA_Asian = SynchedEntityData.defineId(ElephantEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Boolean> DATA_Songhua = SynchedEntityData.defineId(ElephantEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Boolean> DATA_Woolly = SynchedEntityData.defineId(ElephantEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Integer> DATA_Sugar_Lump_Count = SynchedEntityData.defineId(ElephantEntity.class, EntityDataSerializers.INT);
   public static final EntityDataAccessor<Integer> DATA_Cake_Count = SynchedEntityData.defineId(ElephantEntity.class, EntityDataSerializers.INT);
   public static final EntityDataAccessor<Integer> DATA_GrowUp = SynchedEntityData.defineId(ElephantEntity.class, EntityDataSerializers.INT);
   public static final EntityDataAccessor<Boolean> DATA_Wood_Tusks = SynchedEntityData.defineId(ElephantEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Boolean> DATA_Iron_Tusks = SynchedEntityData.defineId(ElephantEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Boolean> DATA_Diamond_Tusks = SynchedEntityData.defineId(ElephantEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Boolean> DATA_Netherite_Tusks = SynchedEntityData.defineId(ElephantEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Boolean> DATA_Asian_Decorated = SynchedEntityData.defineId(ElephantEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Boolean> DATA_Chest = SynchedEntityData.defineId(ElephantEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Boolean> DATA_Harness = SynchedEntityData.defineId(ElephantEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Boolean> DATA_Howdah = SynchedEntityData.defineId(ElephantEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Boolean> DATA_Platform = SynchedEntityData.defineId(ElephantEntity.class, EntityDataSerializers.BOOLEAN);
   public static final EntityDataAccessor<Integer> DATA_Mine = SynchedEntityData.defineId(ElephantEntity.class, EntityDataSerializers.INT);
   public static final EntityDataAccessor<Integer> DATA_Mine2 = SynchedEntityData.defineId(ElephantEntity.class, EntityDataSerializers.INT);
   public static final EntityDataAccessor<Integer> DATA_Mine3 = SynchedEntityData.defineId(ElephantEntity.class, EntityDataSerializers.INT);
   public static final EntityDataAccessor<Integer> DATA_Mine4 = SynchedEntityData.defineId(ElephantEntity.class, EntityDataSerializers.INT);
   public final AnimationState animationState0 = new AnimationState();
   private final ItemStackHandler inventory = new ItemStackHandler(36) {
      public int getSlotLimit(int slot) {
         return 64;
      }
   };
   private final CombinedInvWrapper combined = new CombinedInvWrapper(
      new IItemHandlerModifiable[]{this.inventory, new EntityHandsInvWrapper(this), new EntityArmorInvWrapper(this)}
   );

   public ElephantEntity(EntityType<ElephantEntity> type, Level world) {
      super(type, world);
      this.xpReward = 7;
      this.setNoAi(false);
   }

   protected void defineSynchedData(Builder builder) {
      super.defineSynchedData(builder);
      builder.define(DATA_Baby, false);
      builder.define(DATA_African, false);
      builder.define(DATA_Asian, false);
      builder.define(DATA_Songhua, false);
      builder.define(DATA_Woolly, false);
      builder.define(DATA_Sugar_Lump_Count, 0);
      builder.define(DATA_Cake_Count, 0);
      builder.define(DATA_GrowUp, 0);
      builder.define(DATA_Wood_Tusks, false);
      builder.define(DATA_Iron_Tusks, false);
      builder.define(DATA_Diamond_Tusks, false);
      builder.define(DATA_Netherite_Tusks, false);
      builder.define(DATA_Asian_Decorated, false);
      builder.define(DATA_Chest, false);
      builder.define(DATA_Harness, false);
      builder.define(DATA_Howdah, false);
      builder.define(DATA_Platform, false);
      builder.define(DATA_Mine, 0);
      builder.define(DATA_Mine2, 0);
      builder.define(DATA_Mine3, 0);
      builder.define(DATA_Mine4, 0);
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
      this.goalSelector.addGoal(2, new RandomStrollGoal(this, 1.0));
      this.targetSelector.addGoal(3, new HurtByTargetGoal(this, new Class[0]));
      this.goalSelector.addGoal(4, new RandomLookAroundGoal(this));
      this.goalSelector.addGoal(5, new FloatGoal(this));
   }

   public SoundEvent getAmbientSound() {
      return (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("mocreatures:elephant_ambient"));
   }

   public SoundEvent getHurtSound(DamageSource ds) {
      return (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("mocreatures:elephant_hurt"));
   }

   public SoundEvent getDeathSound() {
      return (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("mocreatures:elephant_death"));
   }

   public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata) {
      SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata);
      ElephantSpawnProcedure.execute(world, this.getX(), this.getY(), this.getZ(), this);
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
      compound.putBoolean("DataAfrican", (Boolean)this.entityData.get(DATA_African));
      compound.putBoolean("DataAsian", (Boolean)this.entityData.get(DATA_Asian));
      compound.putBoolean("DataSonghua", (Boolean)this.entityData.get(DATA_Songhua));
      compound.putBoolean("DataWoolly", (Boolean)this.entityData.get(DATA_Woolly));
      compound.putInt("DataSugar_Lump_Count", (Integer)this.entityData.get(DATA_Sugar_Lump_Count));
      compound.putInt("DataCake_Count", (Integer)this.entityData.get(DATA_Cake_Count));
      compound.putInt("DataGrowUp", (Integer)this.entityData.get(DATA_GrowUp));
      compound.putBoolean("DataWood_Tusks", (Boolean)this.entityData.get(DATA_Wood_Tusks));
      compound.putBoolean("DataIron_Tusks", (Boolean)this.entityData.get(DATA_Iron_Tusks));
      compound.putBoolean("DataDiamond_Tusks", (Boolean)this.entityData.get(DATA_Diamond_Tusks));
      compound.putBoolean("DataNetherite_Tusks", (Boolean)this.entityData.get(DATA_Netherite_Tusks));
      compound.putBoolean("DataAsian_Decorated", (Boolean)this.entityData.get(DATA_Asian_Decorated));
      compound.putBoolean("DataChest", (Boolean)this.entityData.get(DATA_Chest));
      compound.putBoolean("DataHarness", (Boolean)this.entityData.get(DATA_Harness));
      compound.putBoolean("DataHowdah", (Boolean)this.entityData.get(DATA_Howdah));
      compound.putBoolean("DataPlatform", (Boolean)this.entityData.get(DATA_Platform));
      compound.putInt("DataMine", (Integer)this.entityData.get(DATA_Mine));
      compound.putInt("DataMine2", (Integer)this.entityData.get(DATA_Mine2));
      compound.putInt("DataMine3", (Integer)this.entityData.get(DATA_Mine3));
      compound.putInt("DataMine4", (Integer)this.entityData.get(DATA_Mine4));
      compound.put("InventoryCustom", this.inventory.serializeNBT(this.registryAccess()));
   }

   public void readAdditionalSaveData(CompoundTag compound) {
      super.readAdditionalSaveData(compound);
      if (compound.contains("DataBaby")) {
         this.entityData.set(DATA_Baby, compound.getBoolean("DataBaby"));
      }

      if (compound.contains("DataAfrican")) {
         this.entityData.set(DATA_African, compound.getBoolean("DataAfrican"));
      }

      if (compound.contains("DataAsian")) {
         this.entityData.set(DATA_Asian, compound.getBoolean("DataAsian"));
      }

      if (compound.contains("DataSonghua")) {
         this.entityData.set(DATA_Songhua, compound.getBoolean("DataSonghua"));
      }

      if (compound.contains("DataWoolly")) {
         this.entityData.set(DATA_Woolly, compound.getBoolean("DataWoolly"));
      }

      if (compound.contains("DataSugar_Lump_Count")) {
         this.entityData.set(DATA_Sugar_Lump_Count, compound.getInt("DataSugar_Lump_Count"));
      }

      if (compound.contains("DataCake_Count")) {
         this.entityData.set(DATA_Cake_Count, compound.getInt("DataCake_Count"));
      }

      if (compound.contains("DataGrowUp")) {
         this.entityData.set(DATA_GrowUp, compound.getInt("DataGrowUp"));
      }

      if (compound.contains("DataWood_Tusks")) {
         this.entityData.set(DATA_Wood_Tusks, compound.getBoolean("DataWood_Tusks"));
      }

      if (compound.contains("DataIron_Tusks")) {
         this.entityData.set(DATA_Iron_Tusks, compound.getBoolean("DataIron_Tusks"));
      }

      if (compound.contains("DataDiamond_Tusks")) {
         this.entityData.set(DATA_Diamond_Tusks, compound.getBoolean("DataDiamond_Tusks"));
      }

      if (compound.contains("DataNetherite_Tusks")) {
         this.entityData.set(DATA_Netherite_Tusks, compound.getBoolean("DataNetherite_Tusks"));
      }

      if (compound.contains("DataAsian_Decorated")) {
         this.entityData.set(DATA_Asian_Decorated, compound.getBoolean("DataAsian_Decorated"));
      }

      if (compound.contains("DataChest")) {
         this.entityData.set(DATA_Chest, compound.getBoolean("DataChest"));
      }

      if (compound.contains("DataHarness")) {
         this.entityData.set(DATA_Harness, compound.getBoolean("DataHarness"));
      }

      if (compound.contains("DataHowdah")) {
         this.entityData.set(DATA_Howdah, compound.getBoolean("DataHowdah"));
      }

      if (compound.contains("DataPlatform")) {
         this.entityData.set(DATA_Platform, compound.getBoolean("DataPlatform"));
      }

      if (compound.contains("DataMine")) {
         this.entityData.set(DATA_Mine, compound.getInt("DataMine"));
      }

      if (compound.contains("DataMine2")) {
         this.entityData.set(DATA_Mine2, compound.getInt("DataMine2"));
      }

      if (compound.contains("DataMine3")) {
         this.entityData.set(DATA_Mine3, compound.getInt("DataMine3"));
      }

      if (compound.contains("DataMine4")) {
         this.entityData.set(DATA_Mine4, compound.getInt("DataMine4"));
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
                  return Component.literal("Elephant");
               }

               public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
                  FriendlyByteBuf packetBuffer = new FriendlyByteBuf(Unpooled.buffer());
                  packetBuffer.writeBlockPos(sourceentity.blockPosition());
                  packetBuffer.writeByte(0);
                  packetBuffer.writeVarInt(ElephantEntity.this.getId());
                  return new ElephantInventoryMenu(id, inventory, packetBuffer);
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
         ElephantRightClickedOnEntityProcedure.execute(world, x, y, z, entity, sourceentity);
         return retval;
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
      ElephantBabyProcedure.execute(this);
   }

   public AgeableMob getBreedOffspring(ServerLevel serverWorld, AgeableMob ageable) {
      ElephantEntity retval = (ElephantEntity)(MocreaturesModEntities.ELEPHANT.get()).create(serverWorld);
      retval.finalizeSpawn(serverWorld, serverWorld.getCurrentDifficultyAt(retval.blockPosition()), MobSpawnType.BREEDING, null);
      return retval;
   }

   public boolean isFood(ItemStack stack) {
      return Ingredient.of(new ItemStack[]{new ItemStack((ItemLike)MocreaturesModItems.ELEPHANT_SPAWN_EGG.get())}).test(stack);
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
         MocreaturesModEntities.ELEPHANT.get(),
         SpawnPlacementTypes.ON_GROUND,
         Types.MOTION_BLOCKING_NO_LEAVES,
         (entityType, world, reason, pos, random) -> world.getBlockState(pos.below()).is(BlockTags.ANIMALS_SPAWNABLE_ON) && world.getRawBrightness(pos, 0) > 8,
         Operation.REPLACE
      );
   }

   public static net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder createAttributes() {
      net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder builder = Mob.createMobAttributes();
      builder = builder.add(Attributes.MOVEMENT_SPEED, 0.2);
      builder = builder.add(Attributes.MAX_HEALTH, 50.0);
      builder = builder.add(Attributes.ARMOR, 0.0);
      builder = builder.add(Attributes.ATTACK_DAMAGE, 8.0);
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
