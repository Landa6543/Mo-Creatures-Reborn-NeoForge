package net.mocreatures.entity;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnPlacementTypes;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder;
import net.minecraft.world.entity.ai.control.MoveControl;
import net.minecraft.world.entity.ai.goal.AvoidEntityGoal;
import net.minecraft.world.entity.ai.goal.PanicGoal;
import net.minecraft.world.entity.ai.goal.RandomSwimmingGoal;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.ai.navigation.WaterBoundPathNavigation;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.Heightmap.Types;
import net.minecraft.world.level.pathfinder.PathType;
import net.mocreatures.init.MocreaturesModEntities;
import net.mocreatures.procedures.DryOutProcedure;
import net.mocreatures.procedures.RaySwimProcedure;
import net.neoforged.neoforge.common.NeoForgeMod;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.fluids.FluidType;

public class MantaRayEntity extends Animal {
   public final AnimationState animationState0 = new AnimationState();

   public MantaRayEntity(EntityType<MantaRayEntity> type, Level world) {
      super(type, world);
      this.xpReward = 3;
      this.setNoAi(false);
      this.setPathfindingMalus(PathType.WATER, 0.0F);
      this.moveControl = new MoveControl(this) {
         public void tick() {
            if (MantaRayEntity.this.isInWater()) {
               MantaRayEntity.this.setDeltaMovement(MantaRayEntity.this.getDeltaMovement().add(0.0, 0.005, 0.0));
            }

            if (this.operation == Operation.MOVE_TO && !MantaRayEntity.this.getNavigation().isDone()) {
               double dx = this.wantedX - MantaRayEntity.this.getX();
               double dy = this.wantedY - MantaRayEntity.this.getY();
               double dz = this.wantedZ - MantaRayEntity.this.getZ();
               float f = (float)(Mth.atan2(dz, dx) * (180.0 / Math.PI)) - 90.0F;
               float f1 = (float)(this.speedModifier * MantaRayEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
               MantaRayEntity.this.setYRot(this.rotlerp(MantaRayEntity.this.getYRot(), f, 10.0F));
               MantaRayEntity.this.yBodyRot = MantaRayEntity.this.getYRot();
               MantaRayEntity.this.yHeadRot = MantaRayEntity.this.getYRot();
               if (MantaRayEntity.this.isInWater()) {
                  MantaRayEntity.this.setSpeed((float)MantaRayEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
                  float f2 = -((float)(Mth.atan2(dy, (float)Math.sqrt(dx * dx + dz * dz)) * (180.0 / Math.PI)));
                  f2 = Mth.clamp(Mth.wrapDegrees(f2), -85.0F, 85.0F);
                  MantaRayEntity.this.setXRot(this.rotlerp(MantaRayEntity.this.getXRot(), f2, 5.0F));
                  float f3 = Mth.cos(MantaRayEntity.this.getXRot() * (float) (Math.PI / 180.0));
                  MantaRayEntity.this.setZza(f3 * f1);
                  MantaRayEntity.this.setYya((float)(f1 * dy));
               } else {
                  MantaRayEntity.this.setSpeed(f1 * 0.05F);
               }
            } else {
               MantaRayEntity.this.setSpeed(0.0F);
               MantaRayEntity.this.setYya(0.0F);
               MantaRayEntity.this.setZza(0.0F);
            }
         }
      };
   }

   protected PathNavigation createNavigation(Level world) {
      return new WaterBoundPathNavigation(this, world);
   }

   protected void registerGoals() {
      super.registerGoals();
      this.goalSelector.addGoal(1, new AvoidEntityGoal(this, Player.class, 6.0F, 1.0, 1.2));
      this.goalSelector.addGoal(2, new RandomSwimmingGoal(this, 1.0, 40));
      this.goalSelector.addGoal(3, new PanicGoal(this, 1.2));
   }

   public void tick() {
      super.tick();
      if (this.level().isClientSide()) {
         this.animationState0.animateWhen(RaySwimProcedure.execute(this), this.tickCount);
      }
   }

   public void baseTick() {
      super.baseTick();
      DryOutProcedure.execute(this.level(), this);
   }

   public AgeableMob getBreedOffspring(ServerLevel serverWorld, AgeableMob ageable) {
      MantaRayEntity retval = (MantaRayEntity)(MocreaturesModEntities.MANTA_RAY.get()).create(serverWorld);
      retval.finalizeSpawn(serverWorld, serverWorld.getCurrentDifficultyAt(retval.blockPosition()), MobSpawnType.BREEDING, null);
      return retval;
   }

   public boolean isFood(ItemStack stack) {
      return Ingredient.of().test(stack);
   }

   public boolean checkSpawnObstruction(LevelReader world) {
      return world.isUnobstructed(this);
   }

   public boolean canDrownInFluidType(FluidType type) {
      return false;
   }

   public boolean isPushedByFluid() {
      return false;
   }

   public static void init(RegisterSpawnPlacementsEvent event) {
      event.register(
         MocreaturesModEntities.MANTA_RAY.get(),
         SpawnPlacementTypes.IN_WATER,
         Types.MOTION_BLOCKING_NO_LEAVES,
         (entityType, world, reason, pos, random) -> world.getBlockState(pos).is(Blocks.WATER) && world.getBlockState(pos.above()).is(Blocks.WATER),
         net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent.Operation.REPLACE
      );
   }

   public static Builder createAttributes() {
      Builder builder = Mob.createMobAttributes();
      builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
      builder = builder.add(Attributes.MAX_HEALTH, 20.0);
      builder = builder.add(Attributes.ARMOR, 0.0);
      builder = builder.add(Attributes.ATTACK_DAMAGE, 3.0);
      builder = builder.add(Attributes.FOLLOW_RANGE, 16.0);
      builder = builder.add(Attributes.STEP_HEIGHT, 0.6);
      return builder.add(NeoForgeMod.SWIM_SPEED, 0.3);
   }
}
