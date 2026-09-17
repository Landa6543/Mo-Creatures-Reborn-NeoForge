package net.mocreatures.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.mocreatures.entity.BigGolemEntity;

public class BigGolemAggressionProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
      if (entity != null) {
         if (((BigGolemEntity)entity).animationprocedure.equals("idle")) {
            if (entity instanceof BigGolemEntity) {
               ((BigGolemEntity)entity).setAnimation("aggression");
            }

            if (world.getBlockState(BlockPos.containing(x, y - 1.0, z)).getBlock() == Blocks.GRASS_BLOCK) {
               if (entity instanceof BigGolemEntity animatable) {
                  animatable.setTexture("big_golem_dirt");
               }
            } else if (world.getBlockState(BlockPos.containing(x, y - 1.0, z)).getBlock() == Blocks.DIRT) {
               if (entity instanceof BigGolemEntity animatable) {
                  animatable.setTexture("big_golem_dirt");
               }
            } else if (world.getBlockState(BlockPos.containing(x, y - 1.0, z)).getBlock() == Blocks.BRICKS) {
               if (entity instanceof BigGolemEntity animatable) {
                  animatable.setTexture("big_golem_bricks");
               }
            } else if (world.getBlockState(BlockPos.containing(x, y - 1.0, z)).getBlock() == Blocks.STONE) {
               if (entity instanceof BigGolemEntity animatable) {
                  animatable.setTexture("big_golem_stone");
               }
            } else if (world.getBlockState(BlockPos.containing(x, y - 1.0, z)).getBlock() == Blocks.OAK_PLANKS) {
               if (entity instanceof BigGolemEntity animatable) {
                  animatable.setTexture("big_golem_planks");
               }
            } else if (world.getBlockState(BlockPos.containing(x, y - 1.0, z)).getBlock() == Blocks.DIAMOND_ORE) {
               if (entity instanceof BigGolemEntity animatable) {
                  animatable.setTexture("big_golem_diamond_ore");
               }
            } else if (world.getBlockState(BlockPos.containing(x, y - 1.0, z)).getBlock() == Blocks.GRAVEL) {
               if (entity instanceof BigGolemEntity animatable) {
                  animatable.setTexture("big_golem_gravel");
               }
            } else if (world.getBlockState(BlockPos.containing(x, y - 1.0, z)).getBlock() == Blocks.SAND) {
               if (entity instanceof BigGolemEntity animatable) {
                  animatable.setTexture("big_golem_sand");
               }
            } else if (world.getBlockState(BlockPos.containing(x, y - 1.0, z)).getBlock() == Blocks.COBBLESTONE) {
               if (entity instanceof BigGolemEntity animatable) {
                  animatable.setTexture("big_golem_cobblestone");
               }
            } else if (world.getBlockState(BlockPos.containing(x, y - 1.0, z)).getBlock() == Blocks.OAK_LOG) {
               if (entity instanceof BigGolemEntity animatable) {
                  animatable.setTexture("big_golem_log");
               }
            } else if (world.getBlockState(BlockPos.containing(x, y - 1.0, z)).getBlock() == Blocks.CLAY) {
               if (entity instanceof BigGolemEntity animatable) {
                  animatable.setTexture("big_golem_clay");
               }
            } else if (world.getBlockState(BlockPos.containing(x, y - 1.0, z)).getBlock() == Blocks.ICE) {
               if (entity instanceof BigGolemEntity animatable) {
                  animatable.setTexture("big_golem_ice");
               }
            } else if (world.getBlockState(BlockPos.containing(x, y - 1.0, z)).getBlock() == Blocks.OBSIDIAN) {
               if (entity instanceof BigGolemEntity animatable) {
                  animatable.setTexture("big_golem_obsidian");
               }
            } else if (world.getBlockState(BlockPos.containing(x, y - 1.0, z)).getBlock() == Blocks.CARVED_PUMPKIN) {
               if (entity instanceof BigGolemEntity animatable) {
                  animatable.setTexture("big_golem_carved_pumpkin");
               }
            } else if (world.getBlockState(BlockPos.containing(x, y - 1.0, z)).getBlock() == Blocks.STONE_BRICKS) {
               if (entity instanceof BigGolemEntity animatable) {
                  animatable.setTexture("big_golem_stone_bricks");
               }
            } else if (world.getBlockState(BlockPos.containing(x, y - 1.0, z)).getBlock() == Blocks.NETHER_BRICKS) {
               if (entity instanceof BigGolemEntity animatable) {
                  animatable.setTexture("big_golem_nether_bricks");
               }
            } else if (world.getBlockState(BlockPos.containing(x, y - 1.0, z)).getBlock() == Blocks.NETHERRACK) {
               if (entity instanceof BigGolemEntity animatable) {
                  animatable.setTexture("big_golem_netherrack");
               }
            } else if (world.getBlockState(BlockPos.containing(x, y - 1.0, z)).getBlock() == Blocks.GLOWSTONE) {
               if (entity instanceof BigGolemEntity animatable) {
                  animatable.setTexture("big_golem_glowstone");
               }
            } else if (world.getBlockState(BlockPos.containing(x, y - 1.0, z)).getBlock() == Blocks.SANDSTONE) {
               if (entity instanceof BigGolemEntity animatable) {
                  animatable.setTexture("big_golem_sandstone");
               }
            } else if (world.getBlockState(BlockPos.containing(x, y - 1.0, z)).getBlock() == Blocks.WHITE_WOOL) {
               if (entity instanceof BigGolemEntity animatable) {
                  animatable.setTexture("big_golem_wool");
               }
            } else if (entity instanceof BigGolemEntity animatable) {
               animatable.setTexture("big_golem_stone");
            }
         }
      }
   }
}
