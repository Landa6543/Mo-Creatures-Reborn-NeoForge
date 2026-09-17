package net.mocreatures.procedures;

import java.util.Comparator;
import javax.annotation.Nullable;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.mocreatures.entity.HorseEntity;
import net.mocreatures.init.MocreaturesModItems;
import net.neoforged.bus.api.Event;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent.RightClickItem;

@EventBusSubscriber
public class UnicornChargeProcedure {
   @SubscribeEvent
   public static void onRightClickItem(RightClickItem event) {
      if (event.getHand() == event.getEntity().getUsedItemHand()) {
         execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getEntity());
      }
   }

   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
      execute(null, world, x, y, z, entity);
   }

   private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
      if (entity != null) {
         if (entity.isPassenger()
            && (
               (entity.getVehicle() instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 104
                  || (entity.getVehicle() instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 113
                  || (entity.getVehicle() instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 114
            )
            && (
               (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == MocreaturesModItems.WHIP.get()
                  || (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == MocreaturesModItems.WHIP.get()
            )) {
            entity.getVehicle().push(entity.getVehicle().getLookAngle().x, entity.getVehicle().getLookAngle().y, entity.getVehicle().getLookAngle().z);
            entity.getVehicle().push(entity.getVehicle().getLookAngle().x, entity.getVehicle().getLookAngle().y, entity.getVehicle().getLookAngle().z);
            entity.getVehicle().push(entity.getVehicle().getLookAngle().x, entity.getVehicle().getLookAngle().y, entity.getVehicle().getLookAngle().z);
            Vec3 _center = new Vec3(x, y, z);

            for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(3.0), e -> true)
               .stream()
               .sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
               .toList()) {
               if (entityiterator != entity && entityiterator != entity.getVehicle()) {
                  entityiterator.hurt(new DamageSource(world.holderOrThrow(DamageTypes.GENERIC)), 5.0F);
               }
            }

            if (world instanceof Level _level) {
               if (!_level.isClientSide()) {
                  _level.playSound(
                     null,
                     BlockPos.containing(x, y, z),
                     (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("mocreatures:whip")),
                     SoundSource.NEUTRAL,
                     1.0F,
                     1.0F
                  );
               } else {
                  _level.playLocalSound(
                     x, y, z, (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("mocreatures:whip")), SoundSource.NEUTRAL, 1.0F, 1.0F, false
                  );
               }
            }

            if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == MocreaturesModItems.WHIP.get()) {
               if (entity instanceof LivingEntity _entity) {
                  _entity.swing(InteractionHand.MAIN_HAND, true);
               }

               if (entity instanceof Player _player) {
                  _player.getCooldowns().addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem(), 40);
               }
            }

            if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == MocreaturesModItems.WHIP.get()) {
               if (entity instanceof LivingEntity _entity) {
                  _entity.swing(InteractionHand.OFF_HAND, true);
               }

               if (entity instanceof Player _player) {
                  _player.getCooldowns().addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem(), 40);
               }
            }
         }
      }
   }
}
