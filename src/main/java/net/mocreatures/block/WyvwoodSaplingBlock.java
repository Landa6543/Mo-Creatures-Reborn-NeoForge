package net.mocreatures.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour.OffsetType;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.mocreatures.init.MocreaturesModBlocks;
import net.mocreatures.procedures.WyvwoodSaplingBlockIsPlacedByProcedure;
import net.mocreatures.procedures.WyvwoodSaplingBoneMealSuccessConditionProcedure;
import net.mocreatures.procedures.WyvwoodSaplingOnBoneMealSuccessProcedure;

public class WyvwoodSaplingBlock extends FlowerBlock implements BonemealableBlock {
   public WyvwoodSaplingBlock() {
      super(
         MobEffects.MOVEMENT_SPEED,
         100.0F,
         Properties.of()
            .mapColor(MapColor.PLANT)
            .randomTicks()
            .sound(SoundType.GRASS)
            .instabreak()
            .noCollission()
            .offsetType(OffsetType.XZ)
            .pushReaction(PushReaction.DESTROY)
      );
   }

   public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
      return 100;
   }

   public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
      return 60;
   }

   public boolean mayPlaceOn(BlockState groundState, BlockGetter worldIn, BlockPos pos) {
      return groundState.is((Block)MocreaturesModBlocks.WYVGRASS_BLOCK.get()) || groundState.is((Block)MocreaturesModBlocks.WYVDIRT.get());
   }

   public boolean canSurvive(BlockState blockstate, LevelReader worldIn, BlockPos pos) {
      BlockPos blockpos = pos.below();
      BlockState groundState = worldIn.getBlockState(blockpos);
      return this.mayPlaceOn(groundState, worldIn, blockpos);
   }

   public void setPlacedBy(Level world, BlockPos pos, BlockState blockstate, LivingEntity entity, ItemStack itemstack) {
      super.setPlacedBy(world, pos, blockstate, entity, itemstack);
      WyvwoodSaplingBlockIsPlacedByProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
   }

   public boolean isValidBonemealTarget(LevelReader worldIn, BlockPos pos, BlockState blockstate) {
      return true;
   }

   public boolean isBonemealSuccess(Level world, RandomSource random, BlockPos pos, BlockState blockstate) {
      return WyvwoodSaplingBoneMealSuccessConditionProcedure.execute();
   }

   public void performBonemeal(ServerLevel world, RandomSource random, BlockPos pos, BlockState blockstate) {
      WyvwoodSaplingOnBoneMealSuccessProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
   }
}
