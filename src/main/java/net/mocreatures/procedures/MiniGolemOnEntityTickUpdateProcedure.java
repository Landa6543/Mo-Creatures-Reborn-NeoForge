package net.mocreatures.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.Vec3;
import net.mocreatures.MocreaturesMod;
import net.mocreatures.entity.BlockProjectileEntity;
import net.mocreatures.entity.MiniGolemEntity;
import net.mocreatures.init.MocreaturesModEntities;

public class MiniGolemOnEntityTickUpdateProcedure {
   public static void execute(LevelAccessor world, Entity entity) {
      if (entity != null) {
         if (entity instanceof MiniGolemEntity _datEntL0
            && (Boolean)_datEntL0.getEntityData().get(MiniGolemEntity.DATA_HoldingBlock)
            && entity instanceof Mob _mobEnt1
            && _mobEnt1.isAggressive()) {
            if (entity instanceof MiniGolemEntity _datEntSetI) {
               _datEntSetI.getEntityData()
                  .set(
                     MiniGolemEntity.DATA_ThrowCooldown,
                     (entity instanceof MiniGolemEntity _datEntI ? (Integer)_datEntI.getEntityData().get(MiniGolemEntity.DATA_ThrowCooldown) : 0) + 1
                  );
            }

            if ((entity instanceof MiniGolemEntity _datEntI ? (Integer)_datEntI.getEntityData().get(MiniGolemEntity.DATA_ThrowCooldown) : 0) >= 40) {
               if (entity instanceof MiniGolemEntity _datEntSetL) {
                  _datEntSetL.getEntityData().set(MiniGolemEntity.DATA_HoldingBlock, false);
               }

               if (entity instanceof MiniGolemEntity _datEntSetI) {
                  _datEntSetI.getEntityData().set(MiniGolemEntity.DATA_PickUpCooldown, 0);
               }

               if (entity instanceof MiniGolemEntity _datEntSetI) {
                  _datEntSetI.getEntityData().set(MiniGolemEntity.DATA_ThrowCooldown, 0);
               }

               if (entity instanceof MiniGolemEntity) {
                  ((MiniGolemEntity)entity).setAnimation("throwblock");
               }

               if (entity instanceof LivingEntity _livingEntity9 && _livingEntity9.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED)) {
                  _livingEntity9.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(0.25);
               }

               Entity _shootFrom = entity;
               Level projectileLevel = _shootFrom.level();
               if (!projectileLevel.isClientSide()) {
                  Projectile _entityToSpawn = (new Object() {
                     public Projectile getArrow(Level level, Entity shooter, float damage, final int knockback, final byte piercing) {
                        AbstractArrow entityToSpawn = new BlockProjectileEntity(MocreaturesModEntities.BLOCK_PROJECTILE.get(), level) {
                           public byte getPierceLevel() {
                              return piercing;
                           }

                           @Override
                           protected void doKnockback(LivingEntity livingEntity, DamageSource damageSource) {
                              if (knockback > 0) {
                                 double d1 = Math.max(0.0, 1.0 - livingEntity.getAttributeValue(Attributes.KNOCKBACK_RESISTANCE));
                                 Vec3 vec3 = this.getDeltaMovement().multiply(1.0, 0.0, 1.0).normalize().scale(knockback * 0.6 * d1);
                                 if (vec3.lengthSqr() > 0.0) {
                                    livingEntity.push(vec3.x, 0.1, vec3.z);
                                 }
                              }
                           }
                        };
                        entityToSpawn.setOwner(shooter);
                        entityToSpawn.setBaseDamage(damage);
                        entityToSpawn.setSilent(true);
                        return entityToSpawn;
                     }
                  }).getArrow(projectileLevel, entity, 2.0F, 1, (byte)0);
                  _entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
                  _entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1.0F, 0.0F);
                  projectileLevel.addFreshEntity(_entityToSpawn);
               }

               MocreaturesMod.queueServerWork(20, () -> {
                  if (entity instanceof MiniGolemEntity) {
                     ((MiniGolemEntity)entity).setAnimation("empty");
                  }
               });
            }
         }

         if (entity instanceof Mob _mobEnt14 && _mobEnt14.isAggressive()) {
            if (entity instanceof MiniGolemEntity _datEntSetI) {
               _datEntSetI.getEntityData()
                  .set(
                     MiniGolemEntity.DATA_PickUpCooldown,
                     (entity instanceof MiniGolemEntity _datEntI ? (Integer)_datEntI.getEntityData().get(MiniGolemEntity.DATA_PickUpCooldown) : 0) + 1
                  );
            }

            if ((entity instanceof MiniGolemEntity _datEntI ? (Integer)_datEntI.getEntityData().get(MiniGolemEntity.DATA_PickUpCooldown) : 0) >= 100
               && !(entity instanceof MiniGolemEntity _datEntL18 && (Boolean)_datEntL18.getEntityData().get(MiniGolemEntity.DATA_HoldingBlock))
               && world.getBlockState(BlockPos.containing(entity.getX(), entity.getY() - 1.0, entity.getZ())).getBlock() == Blocks.GRASS_BLOCK) {
               world.destroyBlock(BlockPos.containing(entity.getX(), entity.getY() - 1.0, entity.getZ()), false);
               if (entity instanceof MiniGolemEntity) {
                  ((MiniGolemEntity)entity).setAnimation("holdblock");
               }

               if (entity instanceof LivingEntity _livingEntity29 && _livingEntity29.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED)) {
                  _livingEntity29.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(0.1);
               }

               if (entity instanceof MiniGolemEntity _datEntSetL) {
                  _datEntSetL.getEntityData().set(MiniGolemEntity.DATA_HoldingBlock, true);
               }
            }
         }

         if (!(entity instanceof Mob _mobEnt31 && _mobEnt31.isAggressive())) {
            if (entity instanceof MiniGolemEntity animatable) {
               animatable.setTexture("mini_golem_peaceful");
            }

            if (entity instanceof MiniGolemEntity _datEntL33 && (Boolean)_datEntL33.getEntityData().get(MiniGolemEntity.DATA_HoldingBlock)) {
               Entity _shootFrom = entity;
               Level projectileLevel = _shootFrom.level();
               if (!projectileLevel.isClientSide()) {
                  Projectile _entityToSpawn = (new Object() {
                     public Projectile getArrow(Level level, Entity shooter, float damage, final int knockback, final byte piercing) {
                        AbstractArrow entityToSpawn = new BlockProjectileEntity(MocreaturesModEntities.BLOCK_PROJECTILE.get(), level) {
                           public byte getPierceLevel() {
                              return piercing;
                           }

                           @Override
                           protected void doKnockback(LivingEntity livingEntity, DamageSource damageSource) {
                              if (knockback > 0) {
                                 double d1 = Math.max(0.0, 1.0 - livingEntity.getAttributeValue(Attributes.KNOCKBACK_RESISTANCE));
                                 Vec3 vec3 = this.getDeltaMovement().multiply(1.0, 0.0, 1.0).normalize().scale(knockback * 0.6 * d1);
                                 if (vec3.lengthSqr() > 0.0) {
                                    livingEntity.push(vec3.x, 0.1, vec3.z);
                                 }
                              }
                           }
                        };
                        entityToSpawn.setOwner(shooter);
                        entityToSpawn.setBaseDamage(damage);
                        entityToSpawn.setSilent(true);
                        return entityToSpawn;
                     }
                  }).getArrow(projectileLevel, entity, 2.0F, 1, (byte)0);
                  _entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
                  _entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1.0F, 0.0F);
                  projectileLevel.addFreshEntity(_entityToSpawn);
               }

               if (entity instanceof MiniGolemEntity _datEntSetL) {
                  _datEntSetL.getEntityData().set(MiniGolemEntity.DATA_HoldingBlock, false);
               }

               if (entity instanceof MiniGolemEntity _datEntSetI) {
                  _datEntSetI.getEntityData().set(MiniGolemEntity.DATA_PickUpCooldown, 0);
               }

               if (entity instanceof MiniGolemEntity _datEntSetI) {
                  _datEntSetI.getEntityData().set(MiniGolemEntity.DATA_ThrowCooldown, 0);
               }

               if (entity instanceof MiniGolemEntity) {
                  ((MiniGolemEntity)entity).setAnimation("throwblock");
               }

               if (entity instanceof LivingEntity _livingEntity40 && _livingEntity40.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED)) {
                  _livingEntity40.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(0.25);
               }

               MocreaturesMod.queueServerWork(20, () -> {
                  if (entity instanceof MiniGolemEntity) {
                     ((MiniGolemEntity)entity).setAnimation("empty");
                  }
               });
            }
         }

         if (entity instanceof Mob _mobEnt43 && _mobEnt43.isAggressive() && entity instanceof MiniGolemEntity animatable) {
            animatable.setTexture("mini_golem_angry_grass_block");
         }
      }
   }
}
