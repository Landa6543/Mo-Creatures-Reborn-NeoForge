package net.mocreatures.procedures;

import java.text.DecimalFormat;
import java.util.Comparator;
import javax.annotation.Nullable;
import net.minecraft.commands.CommandSource;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.core.BlockPos;
import net.minecraft.core.component.DataComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.Vec3;
import net.mocreatures.entity.AnchovyEntity;
import net.mocreatures.entity.AngelfishEntity;
import net.mocreatures.entity.AnglerfishEntity;
import net.mocreatures.entity.BassEntity;
import net.mocreatures.entity.FishyEntity;
import net.mocreatures.entity.GoldFishEntity;
import net.mocreatures.entity.HippoTangEntity;
import net.mocreatures.entity.MandarinfishEntity;
import net.mocreatures.entity.PiranhaEntity;
import net.mocreatures.entity.SharkEntity;
import net.mocreatures.init.MocreaturesModItems;
import net.neoforged.bus.api.Event;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent.RightClickBlock;

@EventBusSubscriber
public class FishingNetReleaseProcedure {
   @SubscribeEvent
   public static void onRightClickBlock(RightClickBlock event) {
      if (event.getHand() == event.getEntity().getUsedItemHand()) {
         execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getEntity());
      }
   }

   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
      execute(null, world, x, y, z, entity);
   }

   private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
      if (entity != null) {
         if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
            .is(ItemTags.create(ResourceLocation.parse("mocreatures:net/full")))) {
            if (((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                     .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                  .copyTag()
                  .getBoolean("Leashed")
               && world.getBlockState(BlockPos.containing(x, y + 1.0, z + 1.0)).is(BlockTags.create(ResourceLocation.parse("minecraft:fences")))) {
               if (world instanceof ServerLevel _level) {
                  _level.getServer()
                     .getCommands()
                     .performPrefixedCommand(
                        new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null)
                           .withSuppressedOutput(),
                        "summon "
                           + ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                                 .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                              .copyTag()
                              .getString("Mob")
                           + " ~ ~1 ~ {CustomName:'{\"text\":\""
                           + ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                                 .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                              .copyTag()
                              .getString("Name")
                           + "\",\"color\":\"white\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false}',Air:"
                           + ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                                 .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                              .copyTag()
                              .getDouble("Air")
                           + ",NoGravity:"
                           + ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                                 .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                              .copyTag()
                              .getBoolean("NoGravity")
                           + ",Leashed:"
                           + ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                                 .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                              .copyTag()
                              .getBoolean("Leashed")
                           + ",Leash:{X:"
                           + x
                           + ",Y:"
                           + (y + 1.0)
                           + ",Z:"
                           + (z + 1.0)
                           + "},PersistenceRequired:1b,Health:"
                           + new DecimalFormat("##")
                              .format(
                                 ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                                       .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                                    .copyTag()
                                    .getDouble("Health")
                              )
                           + "f,Attributes:[{Name:generic.max_health,Base:"
                           + new DecimalFormat("##")
                              .format(
                                 ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                                       .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                                    .copyTag()
                                    .getDouble("MaxHealth")
                              )
                           + "}],Motion:["
                           + ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                                 .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                              .copyTag()
                              .getDouble("MotionX")
                           + ","
                           + ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                                 .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                              .copyTag()
                              .getDouble("MotionY")
                           + ","
                           + ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                                 .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                              .copyTag()
                              .getDouble("MotionZ")
                           + "],Rotation:["
                           + ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                                 .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                              .copyTag()
                              .getDouble("RotationYaw")
                           + "F,"
                           + ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                                 .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                              .copyTag()
                              .getDouble("RotationPitch")
                           + "F]}"
                     );
               }
            } else if (((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                     .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                  .copyTag()
                  .getBoolean("Leashed")
               && world.getBlockState(BlockPos.containing(x - 1.0, y + 1.0, z)).is(BlockTags.create(ResourceLocation.parse("minecraft:fences")))) {
               if (world instanceof ServerLevel _level) {
                  _level.getServer()
                     .getCommands()
                     .performPrefixedCommand(
                        new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null)
                           .withSuppressedOutput(),
                        "summon "
                           + ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                                 .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                              .copyTag()
                              .getString("Mob")
                           + " ~ ~1 ~ {CustomName:'{\"text\":\""
                           + ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                                 .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                              .copyTag()
                              .getString("Name")
                           + "\",\"color\":\"white\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false}',Air:"
                           + ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                                 .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                              .copyTag()
                              .getDouble("Air")
                           + ",NoGravity:"
                           + ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                                 .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                              .copyTag()
                              .getBoolean("NoGravity")
                           + ",Leashed:"
                           + ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                                 .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                              .copyTag()
                              .getBoolean("Leashed")
                           + ",Leash:{X:"
                           + (x - 1.0)
                           + ",Y:"
                           + (y + 1.0)
                           + ",Z:"
                           + z
                           + "},PersistenceRequired:1b,Health:"
                           + new DecimalFormat("##")
                              .format(
                                 ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                                       .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                                    .copyTag()
                                    .getDouble("Health")
                              )
                           + "f,Attributes:[{Name:generic.max_health,Base:"
                           + new DecimalFormat("##")
                              .format(
                                 ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                                       .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                                    .copyTag()
                                    .getDouble("MaxHealth")
                              )
                           + "}],Motion:["
                           + ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                                 .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                              .copyTag()
                              .getDouble("MotionX")
                           + ","
                           + ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                                 .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                              .copyTag()
                              .getDouble("MotionY")
                           + ","
                           + ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                                 .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                              .copyTag()
                              .getDouble("MotionZ")
                           + "],Rotation:["
                           + ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                                 .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                              .copyTag()
                              .getDouble("RotationYaw")
                           + "F,"
                           + ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                                 .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                              .copyTag()
                              .getDouble("RotationPitch")
                           + "F]}"
                     );
               }
            } else if (((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                     .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                  .copyTag()
                  .getBoolean("Leashed")
               && world.getBlockState(BlockPos.containing(x, y + 1.0, z - 1.0)).is(BlockTags.create(ResourceLocation.parse("minecraft:fences")))) {
               if (world instanceof ServerLevel _level) {
                  _level.getServer()
                     .getCommands()
                     .performPrefixedCommand(
                        new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null)
                           .withSuppressedOutput(),
                        "summon "
                           + ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                                 .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                              .copyTag()
                              .getString("Mob")
                           + " ~ ~1 ~ {CustomName:'{\"text\":\""
                           + ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                                 .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                              .copyTag()
                              .getString("Name")
                           + "\",\"color\":\"white\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false}',Air:"
                           + ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                                 .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                              .copyTag()
                              .getDouble("Air")
                           + ",NoGravity:"
                           + ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                                 .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                              .copyTag()
                              .getBoolean("NoGravity")
                           + ",Leashed:"
                           + ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                                 .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                              .copyTag()
                              .getBoolean("Leashed")
                           + ",Leash:{X:"
                           + x
                           + ",Y:"
                           + (y + 1.0)
                           + ",Z:"
                           + (z - 1.0)
                           + "},PersistenceRequired:1b,Health:"
                           + new DecimalFormat("##")
                              .format(
                                 ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                                       .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                                    .copyTag()
                                    .getDouble("Health")
                              )
                           + "f,Attributes:[{Name:generic.max_health,Base:"
                           + new DecimalFormat("##")
                              .format(
                                 ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                                       .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                                    .copyTag()
                                    .getDouble("MaxHealth")
                              )
                           + "}],Motion:["
                           + ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                                 .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                              .copyTag()
                              .getDouble("MotionX")
                           + ","
                           + ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                                 .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                              .copyTag()
                              .getDouble("MotionY")
                           + ","
                           + ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                                 .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                              .copyTag()
                              .getDouble("MotionZ")
                           + "],Rotation:["
                           + ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                                 .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                              .copyTag()
                              .getDouble("RotationYaw")
                           + "F,"
                           + ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                                 .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                              .copyTag()
                              .getDouble("RotationPitch")
                           + "F]}"
                     );
               }
            } else if (((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                     .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                  .copyTag()
                  .getBoolean("Leashed")
               && world.getBlockState(BlockPos.containing(x + 1.0, y + 1.0, z)).is(BlockTags.create(ResourceLocation.parse("minecraft:fences")))) {
               if (world instanceof ServerLevel _level) {
                  _level.getServer()
                     .getCommands()
                     .performPrefixedCommand(
                        new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null)
                           .withSuppressedOutput(),
                        "summon "
                           + ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                                 .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                              .copyTag()
                              .getString("Mob")
                           + " ~ ~1 ~ {CustomName:'{\"text\":\""
                           + ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                                 .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                              .copyTag()
                              .getString("Name")
                           + "\",\"color\":\"white\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false}',Air:"
                           + ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                                 .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                              .copyTag()
                              .getDouble("Air")
                           + ",NoGravity:"
                           + ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                                 .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                              .copyTag()
                              .getBoolean("NoGravity")
                           + ",Leashed:"
                           + ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                                 .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                              .copyTag()
                              .getBoolean("Leashed")
                           + ",Leash:{X:"
                           + (x + 1.0)
                           + ",Y:"
                           + (y + 1.0)
                           + ",Z:"
                           + z
                           + "},PersistenceRequired:1b,Health:"
                           + new DecimalFormat("##")
                              .format(
                                 ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                                       .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                                    .copyTag()
                                    .getDouble("Health")
                              )
                           + "f,Attributes:[{Name:generic.max_health,Base:"
                           + new DecimalFormat("##")
                              .format(
                                 ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                                       .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                                    .copyTag()
                                    .getDouble("MaxHealth")
                              )
                           + "}],Motion:["
                           + ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                                 .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                              .copyTag()
                              .getDouble("MotionX")
                           + ","
                           + ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                                 .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                              .copyTag()
                              .getDouble("MotionY")
                           + ","
                           + ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                                 .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                              .copyTag()
                              .getDouble("MotionZ")
                           + "],Rotation:["
                           + ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                                 .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                              .copyTag()
                              .getDouble("RotationYaw")
                           + "F,"
                           + ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                                 .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                              .copyTag()
                              .getDouble("RotationPitch")
                           + "F]}"
                     );
               }
            } else if (world instanceof ServerLevel _level) {
               _level.getServer()
                  .getCommands()
                  .performPrefixedCommand(
                     new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null)
                        .withSuppressedOutput(),
                     "summon "
                        + ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                              .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                           .copyTag()
                           .getString("Mob")
                        + " ~ ~1 ~ {CustomName:'{\"text\":\""
                        + ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                              .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                           .copyTag()
                           .getString("Name")
                        + "\",\"color\":\"white\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false}',Air:"
                        + ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                              .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                           .copyTag()
                           .getDouble("Air")
                        + ",NoGravity:"
                        + ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                              .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                           .copyTag()
                           .getBoolean("NoGravity")
                        + ",PersistenceRequired:1b,Health:"
                        + new DecimalFormat("##")
                           .format(
                              ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                                    .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                                 .copyTag()
                                 .getDouble("Health")
                           )
                        + "f,Attributes:[{Name:generic.max_health,Base:"
                        + new DecimalFormat("##")
                           .format(
                              ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                                    .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                                 .copyTag()
                                 .getDouble("MaxHealth")
                           )
                        + "}],Motion:["
                        + ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                              .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                           .copyTag()
                           .getDouble("MotionX")
                        + ","
                        + ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                              .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                           .copyTag()
                           .getDouble("MotionY")
                        + ","
                        + ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                              .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                           .copyTag()
                           .getDouble("MotionZ")
                        + "],Rotation:["
                        + ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                              .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                           .copyTag()
                           .getDouble("RotationYaw")
                        + "F,"
                        + ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                              .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                           .copyTag()
                           .getDouble("RotationPitch")
                        + "F]}"
                  );
            }

            if (!world.getEntitiesOfClass(SharkEntity.class, AABB.ofSize(new Vec3(x, y, z), 5.0, 5.0, 5.0), e -> true).isEmpty()) {
               Entity var87 = world.getEntitiesOfClass(SharkEntity.class, AABB.ofSize(new Vec3(x, y, z), 5.0, 5.0, 5.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var87 instanceof TamableAnimal _toTame && entity instanceof Player _owner) {
                  _toTame.tame(_owner);
               }

               var87 = world.getEntitiesOfClass(SharkEntity.class, AABB.ofSize(new Vec3(x, y, z), 5.0, 5.0, 5.0), e -> true).stream().sorted((new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                  }
               }).compareDistOf(x, y, z)).findFirst().orElse(null);
               if (var87 instanceof LivingEntity _entity) {
                  _entity.setHealth(
                     (float)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                           .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                        .copyTag()
                        .getDouble("Health")
                  );
               }
            }

            if (!world.getEntitiesOfClass(FishyEntity.class, AABB.ofSize(new Vec3(x, y, z), 5.0, 5.0, 5.0), e -> true).isEmpty()) {
               Entity var89 = world.getEntitiesOfClass(FishyEntity.class, AABB.ofSize(new Vec3(x, y, z), 5.0, 5.0, 5.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var89 instanceof TamableAnimal _toTame && entity instanceof Player _owner) {
                  _toTame.tame(_owner);
               }

               var89 = world.getEntitiesOfClass(FishyEntity.class, AABB.ofSize(new Vec3(x, y, z), 5.0, 5.0, 5.0), e -> true).stream().sorted((new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                  }
               }).compareDistOf(x, y, z)).findFirst().orElse(null);
               if (var89 instanceof LivingEntity _entity) {
                  _entity.setHealth(
                     (float)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                           .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                        .copyTag()
                        .getDouble("Health")
                  );
               }

               var89 = world.getEntitiesOfClass(FishyEntity.class, AABB.ofSize(new Vec3(x, y, z), 5.0, 5.0, 5.0), e -> true).stream().sorted((new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                  }
               }).compareDistOf(x, y, z)).findFirst().orElse(null);
               if (var89 instanceof FishyEntity animatable) {
                  animatable.setTexture(
                     ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                           .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                        .copyTag()
                        .getString("Variant")
                  );
               }
            }

            if (!world.getEntitiesOfClass(AnchovyEntity.class, AABB.ofSize(new Vec3(x, y, z), 5.0, 5.0, 5.0), e -> true).isEmpty()) {
               Entity var92 = world.getEntitiesOfClass(AnchovyEntity.class, AABB.ofSize(new Vec3(x, y, z), 5.0, 5.0, 5.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var92 instanceof TamableAnimal _toTame && entity instanceof Player _owner) {
                  _toTame.tame(_owner);
               }

               var92 = world.getEntitiesOfClass(AnchovyEntity.class, AABB.ofSize(new Vec3(x, y, z), 5.0, 5.0, 5.0), e -> true).stream().sorted((new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                  }
               }).compareDistOf(x, y, z)).findFirst().orElse(null);
               if (var92 instanceof LivingEntity _entity) {
                  _entity.setHealth(
                     (float)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                           .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                        .copyTag()
                        .getDouble("Health")
                  );
               }

               var92 = world.getEntitiesOfClass(AnchovyEntity.class, AABB.ofSize(new Vec3(x, y, z), 5.0, 5.0, 5.0), e -> true).stream().sorted((new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                  }
               }).compareDistOf(x, y, z)).findFirst().orElse(null);
               if (var92 instanceof AnchovyEntity animatable) {
                  animatable.setTexture(
                     ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                           .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                        .copyTag()
                        .getString("Variant")
                  );
               }
            }

            if (!world.getEntitiesOfClass(GoldFishEntity.class, AABB.ofSize(new Vec3(x, y, z), 5.0, 5.0, 5.0), e -> true).isEmpty()) {
               Entity var95 = world.getEntitiesOfClass(GoldFishEntity.class, AABB.ofSize(new Vec3(x, y, z), 5.0, 5.0, 5.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var95 instanceof TamableAnimal _toTame && entity instanceof Player _owner) {
                  _toTame.tame(_owner);
               }

               var95 = world.getEntitiesOfClass(GoldFishEntity.class, AABB.ofSize(new Vec3(x, y, z), 5.0, 5.0, 5.0), e -> true).stream().sorted((new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                  }
               }).compareDistOf(x, y, z)).findFirst().orElse(null);
               if (var95 instanceof LivingEntity _entity) {
                  _entity.setHealth(
                     (float)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                           .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                        .copyTag()
                        .getDouble("Health")
                  );
               }

               var95 = world.getEntitiesOfClass(GoldFishEntity.class, AABB.ofSize(new Vec3(x, y, z), 5.0, 5.0, 5.0), e -> true).stream().sorted((new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                  }
               }).compareDistOf(x, y, z)).findFirst().orElse(null);
               if (var95 instanceof GoldFishEntity animatable) {
                  animatable.setTexture(
                     ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                           .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                        .copyTag()
                        .getString("Variant")
                  );
               }
            }

            if (!world.getEntitiesOfClass(AnglerfishEntity.class, AABB.ofSize(new Vec3(x, y, z), 5.0, 5.0, 5.0), e -> true).isEmpty()) {
               Entity var98 = world.getEntitiesOfClass(AnglerfishEntity.class, AABB.ofSize(new Vec3(x, y, z), 5.0, 5.0, 5.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var98 instanceof TamableAnimal _toTame && entity instanceof Player _owner) {
                  _toTame.tame(_owner);
               }

               var98 = world.getEntitiesOfClass(AnglerfishEntity.class, AABB.ofSize(new Vec3(x, y, z), 5.0, 5.0, 5.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var98 instanceof LivingEntity _entity) {
                  _entity.setHealth(
                     (float)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                           .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                        .copyTag()
                        .getDouble("Health")
                  );
               }

               var98 = world.getEntitiesOfClass(AnglerfishEntity.class, AABB.ofSize(new Vec3(x, y, z), 5.0, 5.0, 5.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var98 instanceof AnglerfishEntity animatable) {
                  animatable.setTexture(
                     ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                           .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                        .copyTag()
                        .getString("Variant")
                  );
               }
            }

            if (!world.getEntitiesOfClass(AngelfishEntity.class, AABB.ofSize(new Vec3(x, y, z), 5.0, 5.0, 5.0), e -> true).isEmpty()) {
               Entity var101 = world.getEntitiesOfClass(AngelfishEntity.class, AABB.ofSize(new Vec3(x, y, z), 5.0, 5.0, 5.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var101 instanceof TamableAnimal _toTame && entity instanceof Player _owner) {
                  _toTame.tame(_owner);
               }

               var101 = world.getEntitiesOfClass(AngelfishEntity.class, AABB.ofSize(new Vec3(x, y, z), 5.0, 5.0, 5.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var101 instanceof LivingEntity _entity) {
                  _entity.setHealth(
                     (float)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                           .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                        .copyTag()
                        .getDouble("Health")
                  );
               }

               var101 = world.getEntitiesOfClass(AngelfishEntity.class, AABB.ofSize(new Vec3(x, y, z), 5.0, 5.0, 5.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var101 instanceof AngelfishEntity animatable) {
                  animatable.setTexture(
                     ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                           .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                        .copyTag()
                        .getString("Variant")
                  );
               }
            }

            if (!world.getEntitiesOfClass(HippoTangEntity.class, AABB.ofSize(new Vec3(x, y, z), 5.0, 5.0, 5.0), e -> true).isEmpty()) {
               Entity var104 = world.getEntitiesOfClass(HippoTangEntity.class, AABB.ofSize(new Vec3(x, y, z), 5.0, 5.0, 5.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var104 instanceof TamableAnimal _toTame && entity instanceof Player _owner) {
                  _toTame.tame(_owner);
               }

               var104 = world.getEntitiesOfClass(HippoTangEntity.class, AABB.ofSize(new Vec3(x, y, z), 5.0, 5.0, 5.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var104 instanceof LivingEntity _entity) {
                  _entity.setHealth(
                     (float)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                           .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                        .copyTag()
                        .getDouble("Health")
                  );
               }

               var104 = world.getEntitiesOfClass(HippoTangEntity.class, AABB.ofSize(new Vec3(x, y, z), 5.0, 5.0, 5.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var104 instanceof HippoTangEntity animatable) {
                  animatable.setTexture(
                     ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                           .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                        .copyTag()
                        .getString("Variant")
                  );
               }
            }

            if (!world.getEntitiesOfClass(MandarinfishEntity.class, AABB.ofSize(new Vec3(x, y, z), 5.0, 5.0, 5.0), e -> true).isEmpty()) {
               Entity var107 = world.getEntitiesOfClass(MandarinfishEntity.class, AABB.ofSize(new Vec3(x, y, z), 5.0, 5.0, 5.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var107 instanceof TamableAnimal _toTame && entity instanceof Player _owner) {
                  _toTame.tame(_owner);
               }

               var107 = world.getEntitiesOfClass(MandarinfishEntity.class, AABB.ofSize(new Vec3(x, y, z), 5.0, 5.0, 5.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var107 instanceof LivingEntity _entity) {
                  _entity.setHealth(
                     (float)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                           .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                        .copyTag()
                        .getDouble("Health")
                  );
               }

               var107 = world.getEntitiesOfClass(MandarinfishEntity.class, AABB.ofSize(new Vec3(x, y, z), 5.0, 5.0, 5.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var107 instanceof MandarinfishEntity animatable) {
                  animatable.setTexture(
                     ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                           .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                        .copyTag()
                        .getString("Variant")
                  );
               }
            }

            if (!world.getEntitiesOfClass(PiranhaEntity.class, AABB.ofSize(new Vec3(x, y, z), 5.0, 5.0, 5.0), e -> true).isEmpty()) {
               Entity var110 = world.getEntitiesOfClass(PiranhaEntity.class, AABB.ofSize(new Vec3(x, y, z), 5.0, 5.0, 5.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var110 instanceof TamableAnimal _toTame && entity instanceof Player _owner) {
                  _toTame.tame(_owner);
               }

               var110 = world.getEntitiesOfClass(PiranhaEntity.class, AABB.ofSize(new Vec3(x, y, z), 5.0, 5.0, 5.0), e -> true).stream().sorted((new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                  }
               }).compareDistOf(x, y, z)).findFirst().orElse(null);
               if (var110 instanceof LivingEntity _entity) {
                  _entity.setHealth(
                     (float)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                           .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                        .copyTag()
                        .getDouble("Health")
                  );
               }

               var110 = world.getEntitiesOfClass(PiranhaEntity.class, AABB.ofSize(new Vec3(x, y, z), 5.0, 5.0, 5.0), e -> true).stream().sorted((new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                  }
               }).compareDistOf(x, y, z)).findFirst().orElse(null);
               if (var110 instanceof PiranhaEntity animatable) {
                  animatable.setTexture(
                     ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                           .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                        .copyTag()
                        .getString("Variant")
                  );
               }
            }

            if (!world.getEntitiesOfClass(BassEntity.class, AABB.ofSize(new Vec3(x, y, z), 5.0, 5.0, 5.0), e -> true).isEmpty()) {
               Entity var113 = world.getEntitiesOfClass(BassEntity.class, AABB.ofSize(new Vec3(x, y, z), 5.0, 5.0, 5.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var113 instanceof TamableAnimal _toTame && entity instanceof Player _owner) {
                  _toTame.tame(_owner);
               }

               var113 = world.getEntitiesOfClass(BassEntity.class, AABB.ofSize(new Vec3(x, y, z), 5.0, 5.0, 5.0), e -> true).stream().sorted((new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                  }
               }).compareDistOf(x, y, z)).findFirst().orElse(null);
               if (var113 instanceof LivingEntity _entity) {
                  _entity.setHealth(
                     (float)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                           .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                        .copyTag()
                        .getDouble("Health")
                  );
               }

               var113 = world.getEntitiesOfClass(BassEntity.class, AABB.ofSize(new Vec3(x, y, z), 5.0, 5.0, 5.0), e -> true).stream().sorted((new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                  }
               }).compareDistOf(x, y, z)).findFirst().orElse(null);
               if (var113 instanceof BassEntity animatable) {
                  animatable.setTexture(
                     ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                           .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                        .copyTag()
                        .getString("Variant")
                  );
               }
            }

            if (entity instanceof LivingEntity _entity) {
               ItemStack _setstack = new ItemStack((ItemLike)MocreaturesModItems.FISHING_NET.get()).copy();
               _setstack.setCount(1);
               _entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
               if (_entity instanceof Player _player) {
                  _player.getInventory().setChanged();
               }
            }
         }
      }
   }
}
