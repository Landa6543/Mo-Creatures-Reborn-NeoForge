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
import net.mocreatures.entity.BlackBearEntity;
import net.mocreatures.entity.BlackBirdEntity;
import net.mocreatures.entity.BlackOstrichEntity;
import net.mocreatures.entity.BlueBirdEntity;
import net.mocreatures.entity.CaveScorpionEntity;
import net.mocreatures.entity.DarkManticoreEntity;
import net.mocreatures.entity.DirtScorpionEntity;
import net.mocreatures.entity.ElephantEntity;
import net.mocreatures.entity.FireManticoreEntity;
import net.mocreatures.entity.FireScorpionEntity;
import net.mocreatures.entity.FrostManticoreEntity;
import net.mocreatures.entity.FrostScorpionEntity;
import net.mocreatures.entity.GreenBirdEntity;
import net.mocreatures.entity.GrizzlyBearEntity;
import net.mocreatures.entity.HorseEntity;
import net.mocreatures.entity.KittyAEntity;
import net.mocreatures.entity.KittyBEntity;
import net.mocreatures.entity.KittyCEntity;
import net.mocreatures.entity.KittyDEntity;
import net.mocreatures.entity.KittyEEntity;
import net.mocreatures.entity.KittyFEntity;
import net.mocreatures.entity.KittyGEntity;
import net.mocreatures.entity.KittyHEntity;
import net.mocreatures.entity.KittyIEntity;
import net.mocreatures.entity.KittyJEntity;
import net.mocreatures.entity.KomodoDragonEntity;
import net.mocreatures.entity.LeogerEntity;
import net.mocreatures.entity.LeopardEntity;
import net.mocreatures.entity.LiardEntity;
import net.mocreatures.entity.LigerEntity;
import net.mocreatures.entity.LionEntity;
import net.mocreatures.entity.LitherEntity;
import net.mocreatures.entity.ManticoreEntity;
import net.mocreatures.entity.NetherOstrichEntity;
import net.mocreatures.entity.OstrichEntity;
import net.mocreatures.entity.PandaBearEntity;
import net.mocreatures.entity.PanthardEntity;
import net.mocreatures.entity.PantherEntity;
import net.mocreatures.entity.PanthgerEntity;
import net.mocreatures.entity.PolarBearEntity;
import net.mocreatures.entity.RaccoonEntity;
import net.mocreatures.entity.RedBirdEntity;
import net.mocreatures.entity.TigerEntity;
import net.mocreatures.entity.ToxicManticoreEntity;
import net.mocreatures.entity.UndeadOstrichEntity;
import net.mocreatures.entity.UndeadScorpionEntity;
import net.mocreatures.entity.UnihornedOstrichEntity;
import net.mocreatures.entity.WhiteBirdEntity;
import net.mocreatures.entity.WyvernEntity;
import net.mocreatures.entity.WyvernOstrichEntity;
import net.mocreatures.entity.YellowBirdEntity;
import net.mocreatures.init.MocreaturesModItems;
import net.neoforged.bus.api.Event;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent.RightClickBlock;

@EventBusSubscriber
public class PetAmuletReleaseProcedure {
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
            .is(ItemTags.create(ResourceLocation.parse("mocreatures:amulet/full")))) {
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

            if (!world.getEntitiesOfClass(OstrichEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true).isEmpty()) {
               Entity var325 = world.getEntitiesOfClass(OstrichEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var325 instanceof TamableAnimal _toTame && entity instanceof Player _owner) {
                  _toTame.tame(_owner);
               }

               var325 = world.getEntitiesOfClass(OstrichEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var325 instanceof LivingEntity _entity) {
                  _entity.setHealth(
                     (float)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                           .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                        .copyTag()
                        .getDouble("Health")
                  );
               }
            }

            if (!world.getEntitiesOfClass(BlackOstrichEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true).isEmpty()) {
               Entity var327 = world.getEntitiesOfClass(BlackOstrichEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var327 instanceof TamableAnimal _toTame && entity instanceof Player _owner) {
                  _toTame.tame(_owner);
               }

               var327 = world.getEntitiesOfClass(BlackOstrichEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var327 instanceof LivingEntity _entity) {
                  _entity.setHealth(
                     (float)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                           .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                        .copyTag()
                        .getDouble("Health")
                  );
               }
            }

            if (!world.getEntitiesOfClass(RaccoonEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true).isEmpty()) {
               Entity var329 = world.getEntitiesOfClass(RaccoonEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var329 instanceof TamableAnimal _toTame && entity instanceof Player _owner) {
                  _toTame.tame(_owner);
               }

               var329 = world.getEntitiesOfClass(RaccoonEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var329 instanceof LivingEntity _entity) {
                  _entity.setHealth(
                     (float)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                           .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                        .copyTag()
                        .getDouble("Health")
                  );
               }
            }

            if (!world.getEntitiesOfClass(CaveScorpionEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true).isEmpty()) {
               Entity var331 = world.getEntitiesOfClass(CaveScorpionEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var331 instanceof TamableAnimal _toTame && entity instanceof Player _owner) {
                  _toTame.tame(_owner);
               }

               var331 = world.getEntitiesOfClass(CaveScorpionEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var331 instanceof LivingEntity _entity) {
                  _entity.setHealth(
                     (float)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                           .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                        .copyTag()
                        .getDouble("Health")
                  );
               }
            }

            if (!world.getEntitiesOfClass(DirtScorpionEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true).isEmpty()) {
               Entity var333 = world.getEntitiesOfClass(DirtScorpionEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var333 instanceof TamableAnimal _toTame && entity instanceof Player _owner) {
                  _toTame.tame(_owner);
               }

               var333 = world.getEntitiesOfClass(DirtScorpionEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var333 instanceof LivingEntity _entity) {
                  _entity.setHealth(
                     (float)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                           .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                        .copyTag()
                        .getDouble("Health")
                  );
               }
            }

            if (!world.getEntitiesOfClass(FireScorpionEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true).isEmpty()) {
               Entity var335 = world.getEntitiesOfClass(FireScorpionEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var335 instanceof TamableAnimal _toTame && entity instanceof Player _owner) {
                  _toTame.tame(_owner);
               }

               var335 = world.getEntitiesOfClass(FireScorpionEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var335 instanceof LivingEntity _entity) {
                  _entity.setHealth(
                     (float)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                           .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                        .copyTag()
                        .getDouble("Health")
                  );
               }
            }

            if (!world.getEntitiesOfClass(FrostScorpionEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true).isEmpty()) {
               Entity var337 = world.getEntitiesOfClass(FrostScorpionEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var337 instanceof TamableAnimal _toTame && entity instanceof Player _owner) {
                  _toTame.tame(_owner);
               }

               var337 = world.getEntitiesOfClass(FrostScorpionEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var337 instanceof LivingEntity _entity) {
                  _entity.setHealth(
                     (float)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                           .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                        .copyTag()
                        .getDouble("Health")
                  );
               }
            }

            if (!world.getEntitiesOfClass(UndeadScorpionEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true).isEmpty()) {
               Entity var339 = world.getEntitiesOfClass(UndeadScorpionEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var339 instanceof TamableAnimal _toTame && entity instanceof Player _owner) {
                  _toTame.tame(_owner);
               }

               var339 = world.getEntitiesOfClass(UndeadScorpionEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var339 instanceof LivingEntity _entity) {
                  _entity.setHealth(
                     (float)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                           .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                        .copyTag()
                        .getDouble("Health")
                  );
               }
            }

            if (!world.getEntitiesOfClass(KomodoDragonEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true).isEmpty()) {
               Entity var341 = world.getEntitiesOfClass(KomodoDragonEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var341 instanceof TamableAnimal _toTame && entity instanceof Player _owner) {
                  _toTame.tame(_owner);
               }

               var341 = world.getEntitiesOfClass(KomodoDragonEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var341 instanceof LivingEntity _entity) {
                  _entity.setHealth(
                     (float)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                           .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                        .copyTag()
                        .getDouble("Health")
                  );
               }
            }

            if (!world.getEntitiesOfClass(KittyAEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true).isEmpty()) {
               Entity var343 = world.getEntitiesOfClass(KittyAEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var343 instanceof TamableAnimal _toTame && entity instanceof Player _owner) {
                  _toTame.tame(_owner);
               }

               var343 = world.getEntitiesOfClass(KittyAEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var343 instanceof LivingEntity _entity) {
                  _entity.setHealth(
                     (float)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                           .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                        .copyTag()
                        .getDouble("Health")
                  );
               }
            }

            if (!world.getEntitiesOfClass(KittyBEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true).isEmpty()) {
               Entity var345 = world.getEntitiesOfClass(KittyBEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var345 instanceof TamableAnimal _toTame && entity instanceof Player _owner) {
                  _toTame.tame(_owner);
               }

               var345 = world.getEntitiesOfClass(KittyBEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var345 instanceof LivingEntity _entity) {
                  _entity.setHealth(
                     (float)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                           .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                        .copyTag()
                        .getDouble("Health")
                  );
               }
            }

            if (!world.getEntitiesOfClass(KittyCEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true).isEmpty()) {
               Entity var347 = world.getEntitiesOfClass(KittyCEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var347 instanceof TamableAnimal _toTame && entity instanceof Player _owner) {
                  _toTame.tame(_owner);
               }

               var347 = world.getEntitiesOfClass(KittyCEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var347 instanceof LivingEntity _entity) {
                  _entity.setHealth(
                     (float)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                           .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                        .copyTag()
                        .getDouble("Health")
                  );
               }
            }

            if (!world.getEntitiesOfClass(KittyDEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true).isEmpty()) {
               Entity var349 = world.getEntitiesOfClass(KittyDEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var349 instanceof TamableAnimal _toTame && entity instanceof Player _owner) {
                  _toTame.tame(_owner);
               }

               var349 = world.getEntitiesOfClass(KittyDEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var349 instanceof LivingEntity _entity) {
                  _entity.setHealth(
                     (float)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                           .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                        .copyTag()
                        .getDouble("Health")
                  );
               }
            }

            if (!world.getEntitiesOfClass(KittyEEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true).isEmpty()) {
               Entity var351 = world.getEntitiesOfClass(KittyEEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var351 instanceof TamableAnimal _toTame && entity instanceof Player _owner) {
                  _toTame.tame(_owner);
               }

               var351 = world.getEntitiesOfClass(KittyEEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var351 instanceof LivingEntity _entity) {
                  _entity.setHealth(
                     (float)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                           .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                        .copyTag()
                        .getDouble("Health")
                  );
               }
            }

            if (!world.getEntitiesOfClass(KittyFEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true).isEmpty()) {
               Entity var353 = world.getEntitiesOfClass(KittyFEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var353 instanceof TamableAnimal _toTame && entity instanceof Player _owner) {
                  _toTame.tame(_owner);
               }

               var353 = world.getEntitiesOfClass(KittyFEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var353 instanceof LivingEntity _entity) {
                  _entity.setHealth(
                     (float)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                           .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                        .copyTag()
                        .getDouble("Health")
                  );
               }
            }

            if (!world.getEntitiesOfClass(KittyGEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true).isEmpty()) {
               Entity var355 = world.getEntitiesOfClass(KittyGEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var355 instanceof TamableAnimal _toTame && entity instanceof Player _owner) {
                  _toTame.tame(_owner);
               }

               var355 = world.getEntitiesOfClass(KittyGEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var355 instanceof LivingEntity _entity) {
                  _entity.setHealth(
                     (float)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                           .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                        .copyTag()
                        .getDouble("Health")
                  );
               }
            }

            if (!world.getEntitiesOfClass(KittyHEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true).isEmpty()) {
               Entity var357 = world.getEntitiesOfClass(KittyHEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var357 instanceof TamableAnimal _toTame && entity instanceof Player _owner) {
                  _toTame.tame(_owner);
               }

               var357 = world.getEntitiesOfClass(KittyHEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var357 instanceof LivingEntity _entity) {
                  _entity.setHealth(
                     (float)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                           .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                        .copyTag()
                        .getDouble("Health")
                  );
               }
            }

            if (!world.getEntitiesOfClass(KittyIEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true).isEmpty()) {
               Entity var359 = world.getEntitiesOfClass(KittyIEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var359 instanceof TamableAnimal _toTame && entity instanceof Player _owner) {
                  _toTame.tame(_owner);
               }

               var359 = world.getEntitiesOfClass(KittyIEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var359 instanceof LivingEntity _entity) {
                  _entity.setHealth(
                     (float)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                           .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                        .copyTag()
                        .getDouble("Health")
                  );
               }
            }

            if (!world.getEntitiesOfClass(KittyJEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true).isEmpty()) {
               Entity var361 = world.getEntitiesOfClass(KittyJEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var361 instanceof TamableAnimal _toTame && entity instanceof Player _owner) {
                  _toTame.tame(_owner);
               }

               var361 = world.getEntitiesOfClass(KittyJEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var361 instanceof LivingEntity _entity) {
                  _entity.setHealth(
                     (float)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                           .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                        .copyTag()
                        .getDouble("Health")
                  );
               }
            }

            if (!world.getEntitiesOfClass(NetherOstrichEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true).isEmpty()) {
               Entity var363 = world.getEntitiesOfClass(NetherOstrichEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var363 instanceof TamableAnimal _toTame && entity instanceof Player _owner) {
                  _toTame.tame(_owner);
               }

               var363 = world.getEntitiesOfClass(NetherOstrichEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var363 instanceof LivingEntity _entity) {
                  _entity.setHealth(
                     (float)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                           .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                        .copyTag()
                        .getDouble("Health")
                  );
               }
            }

            if (!world.getEntitiesOfClass(BlackBirdEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true).isEmpty()) {
               Entity var365 = world.getEntitiesOfClass(BlackBirdEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var365 instanceof TamableAnimal _toTame && entity instanceof Player _owner) {
                  _toTame.tame(_owner);
               }

               var365 = world.getEntitiesOfClass(BlackBirdEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var365 instanceof LivingEntity _entity) {
                  _entity.setHealth(
                     (float)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                           .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                        .copyTag()
                        .getDouble("Health")
                  );
               }
            }

            if (!world.getEntitiesOfClass(BlueBirdEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true).isEmpty()) {
               Entity var367 = world.getEntitiesOfClass(BlueBirdEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var367 instanceof TamableAnimal _toTame && entity instanceof Player _owner) {
                  _toTame.tame(_owner);
               }

               var367 = world.getEntitiesOfClass(BlueBirdEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var367 instanceof LivingEntity _entity) {
                  _entity.setHealth(
                     (float)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                           .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                        .copyTag()
                        .getDouble("Health")
                  );
               }
            }

            if (!world.getEntitiesOfClass(GreenBirdEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true).isEmpty()) {
               Entity var369 = world.getEntitiesOfClass(GreenBirdEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var369 instanceof TamableAnimal _toTame && entity instanceof Player _owner) {
                  _toTame.tame(_owner);
               }

               var369 = world.getEntitiesOfClass(GreenBirdEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var369 instanceof LivingEntity _entity) {
                  _entity.setHealth(
                     (float)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                           .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                        .copyTag()
                        .getDouble("Health")
                  );
               }
            }

            if (!world.getEntitiesOfClass(RedBirdEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true).isEmpty()) {
               Entity var371 = world.getEntitiesOfClass(RedBirdEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var371 instanceof TamableAnimal _toTame && entity instanceof Player _owner) {
                  _toTame.tame(_owner);
               }

               var371 = world.getEntitiesOfClass(RedBirdEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var371 instanceof LivingEntity _entity) {
                  _entity.setHealth(
                     (float)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                           .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                        .copyTag()
                        .getDouble("Health")
                  );
               }
            }

            if (!world.getEntitiesOfClass(WhiteBirdEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true).isEmpty()) {
               Entity var373 = world.getEntitiesOfClass(WhiteBirdEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var373 instanceof TamableAnimal _toTame && entity instanceof Player _owner) {
                  _toTame.tame(_owner);
               }

               var373 = world.getEntitiesOfClass(WhiteBirdEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var373 instanceof LivingEntity _entity) {
                  _entity.setHealth(
                     (float)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                           .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                        .copyTag()
                        .getDouble("Health")
                  );
               }
            }

            if (!world.getEntitiesOfClass(YellowBirdEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true).isEmpty()) {
               Entity var375 = world.getEntitiesOfClass(YellowBirdEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var375 instanceof TamableAnimal _toTame && entity instanceof Player _owner) {
                  _toTame.tame(_owner);
               }

               var375 = world.getEntitiesOfClass(YellowBirdEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var375 instanceof LivingEntity _entity) {
                  _entity.setHealth(
                     (float)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                           .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                        .copyTag()
                        .getDouble("Health")
                  );
               }
            }

            if (!world.getEntitiesOfClass(GrizzlyBearEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true).isEmpty()) {
               Entity var377 = world.getEntitiesOfClass(GrizzlyBearEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var377 instanceof TamableAnimal _toTame && entity instanceof Player _owner) {
                  _toTame.tame(_owner);
               }

               var377 = world.getEntitiesOfClass(GrizzlyBearEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var377 instanceof LivingEntity _entity) {
                  _entity.setHealth(
                     (float)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                           .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                        .copyTag()
                        .getDouble("Health")
                  );
               }
            }

            if (!world.getEntitiesOfClass(BlackBearEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true).isEmpty()) {
               Entity var379 = world.getEntitiesOfClass(BlackBearEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var379 instanceof TamableAnimal _toTame && entity instanceof Player _owner) {
                  _toTame.tame(_owner);
               }

               var379 = world.getEntitiesOfClass(BlackBearEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var379 instanceof LivingEntity _entity) {
                  _entity.setHealth(
                     (float)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                           .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                        .copyTag()
                        .getDouble("Health")
                  );
               }
            }

            if (!world.getEntitiesOfClass(PandaBearEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true).isEmpty()) {
               Entity var381 = world.getEntitiesOfClass(PandaBearEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var381 instanceof TamableAnimal _toTame && entity instanceof Player _owner) {
                  _toTame.tame(_owner);
               }

               var381 = world.getEntitiesOfClass(PandaBearEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var381 instanceof LivingEntity _entity) {
                  _entity.setHealth(
                     (float)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                           .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                        .copyTag()
                        .getDouble("Health")
                  );
               }
            }

            if (!world.getEntitiesOfClass(PolarBearEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true).isEmpty()) {
               Entity var383 = world.getEntitiesOfClass(PolarBearEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var383 instanceof TamableAnimal _toTame && entity instanceof Player _owner) {
                  _toTame.tame(_owner);
               }

               var383 = world.getEntitiesOfClass(PolarBearEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var383 instanceof LivingEntity _entity) {
                  _entity.setHealth(
                     (float)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                           .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                        .copyTag()
                        .getDouble("Health")
                  );
               }
            }

            if (!world.getEntitiesOfClass(UnihornedOstrichEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true).isEmpty()) {
               Entity var385 = world.getEntitiesOfClass(UnihornedOstrichEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var385 instanceof TamableAnimal _toTame && entity instanceof Player _owner) {
                  _toTame.tame(_owner);
               }

               var385 = world.getEntitiesOfClass(UnihornedOstrichEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var385 instanceof LivingEntity _entity) {
                  _entity.setHealth(
                     (float)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                           .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                        .copyTag()
                        .getDouble("Health")
                  );
               }
            }

            if (!world.getEntitiesOfClass(ManticoreEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true).isEmpty()) {
               Entity var387 = world.getEntitiesOfClass(ManticoreEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var387 instanceof TamableAnimal _toTame && entity instanceof Player _owner) {
                  _toTame.tame(_owner);
               }

               var387 = world.getEntitiesOfClass(ManticoreEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var387 instanceof LivingEntity _entity) {
                  _entity.setHealth(
                     (float)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                           .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                        .copyTag()
                        .getDouble("Health")
                  );
               }
            }

            if (!world.getEntitiesOfClass(DarkManticoreEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true).isEmpty()) {
               Entity var389 = world.getEntitiesOfClass(DarkManticoreEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var389 instanceof TamableAnimal _toTame && entity instanceof Player _owner) {
                  _toTame.tame(_owner);
               }

               var389 = world.getEntitiesOfClass(DarkManticoreEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var389 instanceof LivingEntity _entity) {
                  _entity.setHealth(
                     (float)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                           .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                        .copyTag()
                        .getDouble("Health")
                  );
               }
            }

            if (!world.getEntitiesOfClass(FireManticoreEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true).isEmpty()) {
               Entity var391 = world.getEntitiesOfClass(FireManticoreEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var391 instanceof TamableAnimal _toTame && entity instanceof Player _owner) {
                  _toTame.tame(_owner);
               }

               var391 = world.getEntitiesOfClass(FireManticoreEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var391 instanceof LivingEntity _entity) {
                  _entity.setHealth(
                     (float)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                           .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                        .copyTag()
                        .getDouble("Health")
                  );
               }
            }

            if (!world.getEntitiesOfClass(FrostManticoreEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true).isEmpty()) {
               Entity var393 = world.getEntitiesOfClass(FrostManticoreEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var393 instanceof TamableAnimal _toTame && entity instanceof Player _owner) {
                  _toTame.tame(_owner);
               }

               var393 = world.getEntitiesOfClass(FrostManticoreEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var393 instanceof LivingEntity _entity) {
                  _entity.setHealth(
                     (float)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                           .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                        .copyTag()
                        .getDouble("Health")
                  );
               }
            }

            if (!world.getEntitiesOfClass(ToxicManticoreEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true).isEmpty()) {
               Entity var395 = world.getEntitiesOfClass(ToxicManticoreEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var395 instanceof TamableAnimal _toTame && entity instanceof Player _owner) {
                  _toTame.tame(_owner);
               }

               var395 = world.getEntitiesOfClass(ToxicManticoreEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var395 instanceof LivingEntity _entity) {
                  _entity.setHealth(
                     (float)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                           .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                        .copyTag()
                        .getDouble("Health")
                  );
               }
            }

            if (!world.getEntitiesOfClass(ElephantEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true).isEmpty()) {
               Entity var397 = world.getEntitiesOfClass(ElephantEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var397 instanceof TamableAnimal _toTame && entity instanceof Player _owner) {
                  _toTame.tame(_owner);
               }

               var397 = world.getEntitiesOfClass(ElephantEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var397 instanceof LivingEntity _entity) {
                  _entity.setHealth(
                     (float)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                           .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                        .copyTag()
                        .getDouble("Health")
                  );
               }

               if (((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                     .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                  .copyTag()
                  .getBoolean("African")) {
                  Entity var474 = world.getEntitiesOfClass(ElephantEntity.class, AABB.ofSize(new Vec3(x, y, z), 5.0, 5.0, 5.0), e -> true)
                     .stream()
                     .sorted((new Object() {
                        Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                           return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                        }
                     }).compareDistOf(x, y, z))
                     .findFirst()
                     .orElse(null);
                  if (var474 instanceof ElephantEntity _datEntSetL) {
                     _datEntSetL.getEntityData()
                        .set(
                           ElephantEntity.DATA_African,
                           ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                                 .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                              .copyTag()
                              .getBoolean("African")
                        );
                  }
               }

               if (((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                     .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                  .copyTag()
                  .getBoolean("Asian")) {
                  Entity var475 = world.getEntitiesOfClass(ElephantEntity.class, AABB.ofSize(new Vec3(x, y, z), 5.0, 5.0, 5.0), e -> true)
                     .stream()
                     .sorted((new Object() {
                        Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                           return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                        }
                     }).compareDistOf(x, y, z))
                     .findFirst()
                     .orElse(null);
                  if (var475 instanceof ElephantEntity _datEntSetL) {
                     _datEntSetL.getEntityData()
                        .set(
                           ElephantEntity.DATA_Asian,
                           ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                                 .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                              .copyTag()
                              .getBoolean("Asian")
                        );
                  }
               }

               if (((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                     .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                  .copyTag()
                  .getBoolean("Songhua")) {
                  Entity var476 = world.getEntitiesOfClass(ElephantEntity.class, AABB.ofSize(new Vec3(x, y, z), 5.0, 5.0, 5.0), e -> true)
                     .stream()
                     .sorted((new Object() {
                        Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                           return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                        }
                     }).compareDistOf(x, y, z))
                     .findFirst()
                     .orElse(null);
                  if (var476 instanceof ElephantEntity _datEntSetL) {
                     _datEntSetL.getEntityData()
                        .set(
                           ElephantEntity.DATA_Songhua,
                           ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                                 .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                              .copyTag()
                              .getBoolean("Songhua")
                        );
                  }
               }

               if (((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                     .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                  .copyTag()
                  .getBoolean("Woolly")) {
                  Entity var477 = world.getEntitiesOfClass(ElephantEntity.class, AABB.ofSize(new Vec3(x, y, z), 5.0, 5.0, 5.0), e -> true)
                     .stream()
                     .sorted((new Object() {
                        Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                           return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                        }
                     }).compareDistOf(x, y, z))
                     .findFirst()
                     .orElse(null);
                  if (var477 instanceof ElephantEntity _datEntSetL) {
                     _datEntSetL.getEntityData()
                        .set(
                           ElephantEntity.DATA_Woolly,
                           ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                                 .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                              .copyTag()
                              .getBoolean("Woolly")
                        );
                  }
               }
            }

            if (!world.getEntitiesOfClass(WyvernOstrichEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true).isEmpty()) {
               Entity var403 = world.getEntitiesOfClass(WyvernOstrichEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var403 instanceof TamableAnimal _toTame && entity instanceof Player _owner) {
                  _toTame.tame(_owner);
               }

               var403 = world.getEntitiesOfClass(WyvernOstrichEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var403 instanceof LivingEntity _entity) {
                  _entity.setHealth(
                     (float)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                           .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                        .copyTag()
                        .getDouble("Health")
                  );
               }
            }

            if (!world.getEntitiesOfClass(UndeadOstrichEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true).isEmpty()) {
               Entity var405 = world.getEntitiesOfClass(UndeadOstrichEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var405 instanceof TamableAnimal _toTame && entity instanceof Player _owner) {
                  _toTame.tame(_owner);
               }

               var405 = world.getEntitiesOfClass(UndeadOstrichEntity.class, AABB.ofSize(new Vec3(x, y, z), 15.0, 15.0, 15.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var405 instanceof LivingEntity _entity) {
                  _entity.setHealth(
                     (float)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                           .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                        .copyTag()
                        .getDouble("Health")
                  );
               }
            }

            if (!world.getEntitiesOfClass(WyvernEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true).isEmpty()) {
               Entity var407 = world.getEntitiesOfClass(WyvernEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var407 instanceof TamableAnimal _toTame && entity instanceof Player _owner) {
                  _toTame.tame(_owner);
               }

               var407 = world.getEntitiesOfClass(WyvernEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true).stream().sorted((new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                  }
               }).compareDistOf(x, y, z)).findFirst().orElse(null);
               if (var407 instanceof LivingEntity _entity) {
                  _entity.setHealth(
                     (float)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                           .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                        .copyTag()
                        .getDouble("Health")
                  );
               }

               var407 = world.getEntitiesOfClass(WyvernEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true).stream().sorted((new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                  }
               }).compareDistOf(x, y, z)).findFirst().orElse(null);
               if (var407 instanceof WyvernEntity _datEntSetI) {
                  _datEntSetI.getEntityData()
                     .set(
                        WyvernEntity.DATA_WyvernVariant,
                        (int)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                              .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                           .copyTag()
                           .getDouble("Variant")
                     );
               }
            }

            if (!world.getEntitiesOfClass(LionEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true).isEmpty()) {
               Entity var410 = world.getEntitiesOfClass(LionEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var410 instanceof TamableAnimal _toTame && entity instanceof Player _owner) {
                  _toTame.tame(_owner);
               }

               var410 = world.getEntitiesOfClass(LionEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true).stream().sorted((new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                  }
               }).compareDistOf(x, y, z)).findFirst().orElse(null);
               if (var410 instanceof LivingEntity _entity) {
                  _entity.setHealth(
                     (float)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                           .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                        .copyTag()
                        .getDouble("Health")
                  );
               }

               var410 = world.getEntitiesOfClass(LionEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true).stream().sorted((new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                  }
               }).compareDistOf(x, y, z)).findFirst().orElse(null);
               if (var410 instanceof LionEntity _datEntSetI) {
                  _datEntSetI.getEntityData()
                     .set(
                        LionEntity.DATA_LionGender,
                        (int)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                              .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                           .copyTag()
                           .getDouble("Gender")
                     );
               }

               var410 = world.getEntitiesOfClass(LionEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true).stream().sorted((new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                  }
               }).compareDistOf(x, y, z)).findFirst().orElse(null);
               if (var410 instanceof LionEntity _datEntSetI) {
                  _datEntSetI.getEntityData()
                     .set(
                        LionEntity.DATA_LionColor,
                        (int)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                              .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                           .copyTag()
                           .getDouble("Color")
                     );
               }

               var410 = world.getEntitiesOfClass(LionEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true).stream().sorted((new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                  }
               }).compareDistOf(x, y, z)).findFirst().orElse(null);
               if (var410 instanceof LionEntity _datEntSetL) {
                  _datEntSetL.getEntityData()
                     .set(
                        LionEntity.DATA_Wings,
                        ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                              .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                           .copyTag()
                           .getBoolean("Wings")
                     );
               }

               var410 = world.getEntitiesOfClass(LionEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true).stream().sorted((new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                  }
               }).compareDistOf(x, y, z)).findFirst().orElse(null);
               if (var410 instanceof LionEntity _datEntSetL) {
                  _datEntSetL.getEntityData()
                     .set(
                        LionEntity.DATA_Medallion,
                        ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                              .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                           .copyTag()
                           .getBoolean("Medallion")
                     );
               }
            }

            if (!world.getEntitiesOfClass(TigerEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true).isEmpty()) {
               Entity var416 = world.getEntitiesOfClass(TigerEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var416 instanceof TamableAnimal _toTame && entity instanceof Player _owner) {
                  _toTame.tame(_owner);
               }

               var416 = world.getEntitiesOfClass(TigerEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true).stream().sorted((new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                  }
               }).compareDistOf(x, y, z)).findFirst().orElse(null);
               if (var416 instanceof LivingEntity _entity) {
                  _entity.setHealth(
                     (float)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                           .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                        .copyTag()
                        .getDouble("Health")
                  );
               }

               var416 = world.getEntitiesOfClass(TigerEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true).stream().sorted((new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                  }
               }).compareDistOf(x, y, z)).findFirst().orElse(null);
               if (var416 instanceof TigerEntity _datEntSetI) {
                  _datEntSetI.getEntityData()
                     .set(
                        TigerEntity.DATA_Gender,
                        (int)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                              .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                           .copyTag()
                           .getDouble("Gender")
                     );
               }

               var416 = world.getEntitiesOfClass(TigerEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true).stream().sorted((new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                  }
               }).compareDistOf(x, y, z)).findFirst().orElse(null);
               if (var416 instanceof TigerEntity _datEntSetI) {
                  _datEntSetI.getEntityData()
                     .set(
                        TigerEntity.DATA_Color,
                        (int)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                              .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                           .copyTag()
                           .getDouble("Color")
                     );
               }

               var416 = world.getEntitiesOfClass(TigerEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true).stream().sorted((new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                  }
               }).compareDistOf(x, y, z)).findFirst().orElse(null);
               if (var416 instanceof TigerEntity _datEntSetL) {
                  _datEntSetL.getEntityData()
                     .set(
                        TigerEntity.DATA_Wings,
                        ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                              .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                           .copyTag()
                           .getBoolean("Wings")
                     );
               }

               var416 = world.getEntitiesOfClass(TigerEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true).stream().sorted((new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                  }
               }).compareDistOf(x, y, z)).findFirst().orElse(null);
               if (var416 instanceof TigerEntity _datEntSetL) {
                  _datEntSetL.getEntityData()
                     .set(
                        TigerEntity.DATA_Medallion,
                        ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                              .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                           .copyTag()
                           .getBoolean("Medallion")
                     );
               }
            }

            if (!world.getEntitiesOfClass(LeopardEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true).isEmpty()) {
               Entity var422 = world.getEntitiesOfClass(LeopardEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var422 instanceof TamableAnimal _toTame && entity instanceof Player _owner) {
                  _toTame.tame(_owner);
               }

               var422 = world.getEntitiesOfClass(LeopardEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true).stream().sorted((new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                  }
               }).compareDistOf(x, y, z)).findFirst().orElse(null);
               if (var422 instanceof LivingEntity _entity) {
                  _entity.setHealth(
                     (float)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                           .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                        .copyTag()
                        .getDouble("Health")
                  );
               }

               var422 = world.getEntitiesOfClass(LeopardEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true).stream().sorted((new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                  }
               }).compareDistOf(x, y, z)).findFirst().orElse(null);
               if (var422 instanceof LeopardEntity _datEntSetI) {
                  _datEntSetI.getEntityData()
                     .set(
                        LeopardEntity.DATA_Gender,
                        (int)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                              .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                           .copyTag()
                           .getDouble("Gender")
                     );
               }

               var422 = world.getEntitiesOfClass(LeopardEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true).stream().sorted((new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                  }
               }).compareDistOf(x, y, z)).findFirst().orElse(null);
               if (var422 instanceof LeopardEntity _datEntSetI) {
                  _datEntSetI.getEntityData()
                     .set(
                        LeopardEntity.DATA_Color,
                        (int)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                              .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                           .copyTag()
                           .getDouble("Color")
                     );
               }

               var422 = world.getEntitiesOfClass(LeopardEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true).stream().sorted((new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                  }
               }).compareDistOf(x, y, z)).findFirst().orElse(null);
               if (var422 instanceof LeopardEntity _datEntSetL) {
                  _datEntSetL.getEntityData()
                     .set(
                        LeopardEntity.DATA_Wings,
                        ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                              .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                           .copyTag()
                           .getBoolean("Wings")
                     );
               }

               var422 = world.getEntitiesOfClass(LeopardEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true).stream().sorted((new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                  }
               }).compareDistOf(x, y, z)).findFirst().orElse(null);
               if (var422 instanceof LeopardEntity _datEntSetL) {
                  _datEntSetL.getEntityData()
                     .set(
                        LeopardEntity.DATA_Medallion,
                        ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                              .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                           .copyTag()
                           .getBoolean("Medallion")
                     );
               }
            }

            if (!world.getEntitiesOfClass(PantherEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true).isEmpty()) {
               Entity var428 = world.getEntitiesOfClass(PantherEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var428 instanceof TamableAnimal _toTame && entity instanceof Player _owner) {
                  _toTame.tame(_owner);
               }

               var428 = world.getEntitiesOfClass(PantherEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true).stream().sorted((new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                  }
               }).compareDistOf(x, y, z)).findFirst().orElse(null);
               if (var428 instanceof LivingEntity _entity) {
                  _entity.setHealth(
                     (float)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                           .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                        .copyTag()
                        .getDouble("Health")
                  );
               }

               var428 = world.getEntitiesOfClass(PantherEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true).stream().sorted((new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                  }
               }).compareDistOf(x, y, z)).findFirst().orElse(null);
               if (var428 instanceof PantherEntity _datEntSetI) {
                  _datEntSetI.getEntityData()
                     .set(
                        PantherEntity.DATA_Gender,
                        (int)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                              .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                           .copyTag()
                           .getDouble("Gender")
                     );
               }

               var428 = world.getEntitiesOfClass(PantherEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true).stream().sorted((new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                  }
               }).compareDistOf(x, y, z)).findFirst().orElse(null);
               if (var428 instanceof PantherEntity _datEntSetI) {
                  _datEntSetI.getEntityData()
                     .set(
                        PantherEntity.DATA_Color,
                        (int)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                              .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                           .copyTag()
                           .getDouble("Color")
                     );
               }

               var428 = world.getEntitiesOfClass(PantherEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true).stream().sorted((new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                  }
               }).compareDistOf(x, y, z)).findFirst().orElse(null);
               if (var428 instanceof PantherEntity _datEntSetL) {
                  _datEntSetL.getEntityData()
                     .set(
                        PantherEntity.DATA_Wings,
                        ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                              .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                           .copyTag()
                           .getBoolean("Wings")
                     );
               }

               var428 = world.getEntitiesOfClass(PantherEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true).stream().sorted((new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                  }
               }).compareDistOf(x, y, z)).findFirst().orElse(null);
               if (var428 instanceof PantherEntity _datEntSetL) {
                  _datEntSetL.getEntityData()
                     .set(
                        PantherEntity.DATA_Medallion,
                        ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                              .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                           .copyTag()
                           .getBoolean("Medallion")
                     );
               }
            }

            if (!world.getEntitiesOfClass(PanthgerEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true).isEmpty()) {
               Entity var434 = world.getEntitiesOfClass(PanthgerEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var434 instanceof TamableAnimal _toTame && entity instanceof Player _owner) {
                  _toTame.tame(_owner);
               }

               var434 = world.getEntitiesOfClass(PanthgerEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var434 instanceof LivingEntity _entity) {
                  _entity.setHealth(
                     (float)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                           .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                        .copyTag()
                        .getDouble("Health")
                  );
               }

               var434 = world.getEntitiesOfClass(PanthgerEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var434 instanceof PanthgerEntity _datEntSetI) {
                  _datEntSetI.getEntityData()
                     .set(
                        PanthgerEntity.DATA_Gender,
                        (int)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                              .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                           .copyTag()
                           .getDouble("Gender")
                     );
               }

               var434 = world.getEntitiesOfClass(PanthgerEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var434 instanceof PanthgerEntity _datEntSetI) {
                  _datEntSetI.getEntityData()
                     .set(
                        PanthgerEntity.DATA_Color,
                        (int)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                              .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                           .copyTag()
                           .getDouble("Color")
                     );
               }

               var434 = world.getEntitiesOfClass(PanthgerEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var434 instanceof PanthgerEntity _datEntSetL) {
                  _datEntSetL.getEntityData()
                     .set(
                        PanthgerEntity.DATA_Wings,
                        ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                              .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                           .copyTag()
                           .getBoolean("Wings")
                     );
               }

               var434 = world.getEntitiesOfClass(PanthgerEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var434 instanceof PanthgerEntity _datEntSetL) {
                  _datEntSetL.getEntityData()
                     .set(
                        PanthgerEntity.DATA_Medallion,
                        ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                              .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                           .copyTag()
                           .getBoolean("Medallion")
                     );
               }
            }

            if (!world.getEntitiesOfClass(PanthardEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true).isEmpty()) {
               Entity var440 = world.getEntitiesOfClass(PanthardEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var440 instanceof TamableAnimal _toTame && entity instanceof Player _owner) {
                  _toTame.tame(_owner);
               }

               var440 = world.getEntitiesOfClass(PanthardEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var440 instanceof LivingEntity _entity) {
                  _entity.setHealth(
                     (float)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                           .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                        .copyTag()
                        .getDouble("Health")
                  );
               }

               var440 = world.getEntitiesOfClass(PanthardEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var440 instanceof PanthardEntity _datEntSetI) {
                  _datEntSetI.getEntityData()
                     .set(
                        PanthardEntity.DATA_Gender,
                        (int)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                              .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                           .copyTag()
                           .getDouble("Gender")
                     );
               }

               var440 = world.getEntitiesOfClass(PanthardEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var440 instanceof PanthardEntity _datEntSetI) {
                  _datEntSetI.getEntityData()
                     .set(
                        PanthardEntity.DATA_Color,
                        (int)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                              .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                           .copyTag()
                           .getDouble("Color")
                     );
               }

               var440 = world.getEntitiesOfClass(PanthardEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var440 instanceof PanthardEntity _datEntSetL) {
                  _datEntSetL.getEntityData()
                     .set(
                        PanthardEntity.DATA_Wings,
                        ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                              .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                           .copyTag()
                           .getBoolean("Wings")
                     );
               }

               var440 = world.getEntitiesOfClass(PanthardEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var440 instanceof PanthardEntity _datEntSetL) {
                  _datEntSetL.getEntityData()
                     .set(
                        PanthardEntity.DATA_Medallion,
                        ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                              .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                           .copyTag()
                           .getBoolean("Medallion")
                     );
               }
            }

            if (!world.getEntitiesOfClass(LitherEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true).isEmpty()) {
               Entity var446 = world.getEntitiesOfClass(LitherEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var446 instanceof TamableAnimal _toTame && entity instanceof Player _owner) {
                  _toTame.tame(_owner);
               }

               var446 = world.getEntitiesOfClass(LitherEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true).stream().sorted((new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                  }
               }).compareDistOf(x, y, z)).findFirst().orElse(null);
               if (var446 instanceof LivingEntity _entity) {
                  _entity.setHealth(
                     (float)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                           .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                        .copyTag()
                        .getDouble("Health")
                  );
               }

               var446 = world.getEntitiesOfClass(LitherEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true).stream().sorted((new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                  }
               }).compareDistOf(x, y, z)).findFirst().orElse(null);
               if (var446 instanceof LitherEntity _datEntSetI) {
                  _datEntSetI.getEntityData()
                     .set(
                        LitherEntity.DATA_Gender,
                        (int)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                              .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                           .copyTag()
                           .getDouble("Gender")
                     );
               }

               var446 = world.getEntitiesOfClass(LitherEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true).stream().sorted((new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                  }
               }).compareDistOf(x, y, z)).findFirst().orElse(null);
               if (var446 instanceof LitherEntity _datEntSetI) {
                  _datEntSetI.getEntityData()
                     .set(
                        LitherEntity.DATA_Color,
                        (int)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                              .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                           .copyTag()
                           .getDouble("Color")
                     );
               }

               var446 = world.getEntitiesOfClass(LitherEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true).stream().sorted((new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                  }
               }).compareDistOf(x, y, z)).findFirst().orElse(null);
               if (var446 instanceof LitherEntity _datEntSetL) {
                  _datEntSetL.getEntityData()
                     .set(
                        LitherEntity.DATA_Wings,
                        ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                              .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                           .copyTag()
                           .getBoolean("Wings")
                     );
               }

               var446 = world.getEntitiesOfClass(LitherEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true).stream().sorted((new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                  }
               }).compareDistOf(x, y, z)).findFirst().orElse(null);
               if (var446 instanceof LitherEntity _datEntSetL) {
                  _datEntSetL.getEntityData()
                     .set(
                        LitherEntity.DATA_Medallion,
                        ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                              .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                           .copyTag()
                           .getBoolean("Medallion")
                     );
               }
            }

            if (!world.getEntitiesOfClass(LeogerEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true).isEmpty()) {
               Entity var452 = world.getEntitiesOfClass(LeogerEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var452 instanceof TamableAnimal _toTame && entity instanceof Player _owner) {
                  _toTame.tame(_owner);
               }

               var452 = world.getEntitiesOfClass(LeogerEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true).stream().sorted((new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                  }
               }).compareDistOf(x, y, z)).findFirst().orElse(null);
               if (var452 instanceof LivingEntity _entity) {
                  _entity.setHealth(
                     (float)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                           .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                        .copyTag()
                        .getDouble("Health")
                  );
               }

               var452 = world.getEntitiesOfClass(LeogerEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true).stream().sorted((new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                  }
               }).compareDistOf(x, y, z)).findFirst().orElse(null);
               if (var452 instanceof LeogerEntity _datEntSetI) {
                  _datEntSetI.getEntityData()
                     .set(
                        LeogerEntity.DATA_Gender,
                        (int)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                              .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                           .copyTag()
                           .getDouble("Gender")
                     );
               }

               var452 = world.getEntitiesOfClass(LeogerEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true).stream().sorted((new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                  }
               }).compareDistOf(x, y, z)).findFirst().orElse(null);
               if (var452 instanceof LeogerEntity _datEntSetI) {
                  _datEntSetI.getEntityData()
                     .set(
                        LeogerEntity.DATA_Color,
                        (int)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                              .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                           .copyTag()
                           .getDouble("Color")
                     );
               }

               var452 = world.getEntitiesOfClass(LeogerEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true).stream().sorted((new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                  }
               }).compareDistOf(x, y, z)).findFirst().orElse(null);
               if (var452 instanceof LeogerEntity _datEntSetL) {
                  _datEntSetL.getEntityData()
                     .set(
                        LeogerEntity.DATA_Wings,
                        ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                              .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                           .copyTag()
                           .getBoolean("Wings")
                     );
               }

               var452 = world.getEntitiesOfClass(LeogerEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true).stream().sorted((new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                  }
               }).compareDistOf(x, y, z)).findFirst().orElse(null);
               if (var452 instanceof LeogerEntity _datEntSetL) {
                  _datEntSetL.getEntityData()
                     .set(
                        LeogerEntity.DATA_Medallion,
                        ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                              .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                           .copyTag()
                           .getBoolean("Medallion")
                     );
               }
            }

            if (!world.getEntitiesOfClass(LiardEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true).isEmpty()) {
               Entity var458 = world.getEntitiesOfClass(LiardEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var458 instanceof TamableAnimal _toTame && entity instanceof Player _owner) {
                  _toTame.tame(_owner);
               }

               var458 = world.getEntitiesOfClass(LiardEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true).stream().sorted((new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                  }
               }).compareDistOf(x, y, z)).findFirst().orElse(null);
               if (var458 instanceof LivingEntity _entity) {
                  _entity.setHealth(
                     (float)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                           .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                        .copyTag()
                        .getDouble("Health")
                  );
               }

               var458 = world.getEntitiesOfClass(LiardEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true).stream().sorted((new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                  }
               }).compareDistOf(x, y, z)).findFirst().orElse(null);
               if (var458 instanceof LiardEntity _datEntSetI) {
                  _datEntSetI.getEntityData()
                     .set(
                        LiardEntity.DATA_Gender,
                        (int)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                              .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                           .copyTag()
                           .getDouble("Gender")
                     );
               }

               var458 = world.getEntitiesOfClass(LiardEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true).stream().sorted((new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                  }
               }).compareDistOf(x, y, z)).findFirst().orElse(null);
               if (var458 instanceof LiardEntity _datEntSetI) {
                  _datEntSetI.getEntityData()
                     .set(
                        LiardEntity.DATA_Color,
                        (int)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                              .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                           .copyTag()
                           .getDouble("Color")
                     );
               }

               var458 = world.getEntitiesOfClass(LiardEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true).stream().sorted((new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                  }
               }).compareDistOf(x, y, z)).findFirst().orElse(null);
               if (var458 instanceof LiardEntity _datEntSetL) {
                  _datEntSetL.getEntityData()
                     .set(
                        LiardEntity.DATA_Wings,
                        ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                              .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                           .copyTag()
                           .getBoolean("Wings")
                     );
               }

               var458 = world.getEntitiesOfClass(LiardEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true).stream().sorted((new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                  }
               }).compareDistOf(x, y, z)).findFirst().orElse(null);
               if (var458 instanceof LiardEntity _datEntSetL) {
                  _datEntSetL.getEntityData()
                     .set(
                        LiardEntity.DATA_Medallion,
                        ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                              .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                           .copyTag()
                           .getBoolean("Medallion")
                     );
               }
            }

            if (!world.getEntitiesOfClass(LigerEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true).isEmpty()) {
               Entity var464 = world.getEntitiesOfClass(LigerEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var464 instanceof TamableAnimal _toTame && entity instanceof Player _owner) {
                  _toTame.tame(_owner);
               }

               var464 = world.getEntitiesOfClass(LigerEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true).stream().sorted((new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                  }
               }).compareDistOf(x, y, z)).findFirst().orElse(null);
               if (var464 instanceof LivingEntity _entity) {
                  _entity.setHealth(
                     (float)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                           .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                        .copyTag()
                        .getDouble("Health")
                  );
               }

               var464 = world.getEntitiesOfClass(LigerEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true).stream().sorted((new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                  }
               }).compareDistOf(x, y, z)).findFirst().orElse(null);
               if (var464 instanceof LigerEntity _datEntSetI) {
                  _datEntSetI.getEntityData()
                     .set(
                        LigerEntity.DATA_Gender,
                        (int)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                              .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                           .copyTag()
                           .getDouble("Gender")
                     );
               }

               var464 = world.getEntitiesOfClass(LigerEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true).stream().sorted((new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                  }
               }).compareDistOf(x, y, z)).findFirst().orElse(null);
               if (var464 instanceof LigerEntity _datEntSetI) {
                  _datEntSetI.getEntityData()
                     .set(
                        LigerEntity.DATA_Color,
                        (int)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                              .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                           .copyTag()
                           .getDouble("Color")
                     );
               }

               var464 = world.getEntitiesOfClass(LigerEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true).stream().sorted((new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                  }
               }).compareDistOf(x, y, z)).findFirst().orElse(null);
               if (var464 instanceof LigerEntity _datEntSetL) {
                  _datEntSetL.getEntityData()
                     .set(
                        LigerEntity.DATA_Wings,
                        ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                              .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                           .copyTag()
                           .getBoolean("Wings")
                     );
               }

               var464 = world.getEntitiesOfClass(LigerEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true).stream().sorted((new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                  }
               }).compareDistOf(x, y, z)).findFirst().orElse(null);
               if (var464 instanceof LigerEntity _datEntSetL) {
                  _datEntSetL.getEntityData()
                     .set(
                        LigerEntity.DATA_Medallion,
                        ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                              .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                           .copyTag()
                           .getBoolean("Medallion")
                     );
               }
            }

            if (!world.getEntitiesOfClass(HorseEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true).isEmpty()) {
               Entity var470 = world.getEntitiesOfClass(HorseEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true)
                  .stream()
                  .sorted((new Object() {
                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                     }
                  }).compareDistOf(x, y, z))
                  .findFirst()
                  .orElse(null);
               if (var470 instanceof TamableAnimal _toTame && entity instanceof Player _owner) {
                  _toTame.tame(_owner);
               }

               var470 = world.getEntitiesOfClass(HorseEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true).stream().sorted((new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                  }
               }).compareDistOf(x, y, z)).findFirst().orElse(null);
               if (var470 instanceof LivingEntity _entity) {
                  _entity.setHealth(
                     (float)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                           .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                        .copyTag()
                        .getDouble("Health")
                  );
               }

               var470 = world.getEntitiesOfClass(HorseEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), e -> true).stream().sorted((new Object() {
                  Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                  }
               }).compareDistOf(x, y, z)).findFirst().orElse(null);
               if (var470 instanceof HorseEntity _datEntSetI) {
                  _datEntSetI.getEntityData()
                     .set(
                        HorseEntity.DATA_Variant,
                        (int)((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                              .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                           .copyTag()
                           .getDouble("Variant")
                     );
               }
            }

            if (entity instanceof LivingEntity _entity) {
               ItemStack _setstack = new ItemStack((ItemLike)MocreaturesModItems.PET_AMULET.get()).copy();
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
