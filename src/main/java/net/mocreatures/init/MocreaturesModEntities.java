package net.mocreatures.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType.Builder;
import net.mocreatures.entity.AnchovyEggEntityEntity;
import net.mocreatures.entity.AnchovyEntity;
import net.mocreatures.entity.AngelfishEggEntityEntity;
import net.mocreatures.entity.AngelfishEntity;
import net.mocreatures.entity.AnglerfishEggEntityEntity;
import net.mocreatures.entity.AnglerfishEntity;
import net.mocreatures.entity.ArcticWyvernEggEntityEntity;
import net.mocreatures.entity.BabyDuckEntity;
import net.mocreatures.entity.BassEggEntityEntity;
import net.mocreatures.entity.BassEntity;
import net.mocreatures.entity.BigGolemEntity;
import net.mocreatures.entity.BirchEntEntity;
import net.mocreatures.entity.BlackBearEntity;
import net.mocreatures.entity.BlackBirdEntity;
import net.mocreatures.entity.BlackOstrichEntity;
import net.mocreatures.entity.BlackWerewolfEntity;
import net.mocreatures.entity.BlockProjectileEntity;
import net.mocreatures.entity.BlueBirdEntity;
import net.mocreatures.entity.BoarEntity;
import net.mocreatures.entity.BrownAntEntity;
import net.mocreatures.entity.BrownBunnyEntity;
import net.mocreatures.entity.BrownWerewolfEntity;
import net.mocreatures.entity.ButterflyEntity;
import net.mocreatures.entity.CaveOgre1Entity;
import net.mocreatures.entity.CaveOgre2Entity;
import net.mocreatures.entity.CaveScorpionEggEntityEntity;
import net.mocreatures.entity.CaveScorpionEntity;
import net.mocreatures.entity.CaveWyvernEggEntityEntity;
import net.mocreatures.entity.ClownfishEggEntityEntity;
import net.mocreatures.entity.ClownfishEntity;
import net.mocreatures.entity.CrabEntity;
import net.mocreatures.entity.CricketEntity;
import net.mocreatures.entity.CrocodileEntity;
import net.mocreatures.entity.DarkManticoreEggEntityEntity;
import net.mocreatures.entity.DarkManticoreEntity;
import net.mocreatures.entity.DeerDoeEntity;
import net.mocreatures.entity.DeerFawnEntity;
import net.mocreatures.entity.DeerStagEntity;
import net.mocreatures.entity.DirtScorpionEggEntityEntity;
import net.mocreatures.entity.DirtScorpionEntity;
import net.mocreatures.entity.DragonflyEntity;
import net.mocreatures.entity.DuckEntity;
import net.mocreatures.entity.ElephantEntity;
import net.mocreatures.entity.FireAntEntity;
import net.mocreatures.entity.FireManticoreEggEntityEntity;
import net.mocreatures.entity.FireManticoreEntity;
import net.mocreatures.entity.FireOgre1Entity;
import net.mocreatures.entity.FireOgre2Entity;
import net.mocreatures.entity.FireScorpionEggEntityEntity;
import net.mocreatures.entity.FireScorpionEntity;
import net.mocreatures.entity.FireWerewolfEntity;
import net.mocreatures.entity.FireWraithEntity;
import net.mocreatures.entity.FireflyEntity;
import net.mocreatures.entity.FishyEggEntityEntity;
import net.mocreatures.entity.FishyEntity;
import net.mocreatures.entity.FlyEntity;
import net.mocreatures.entity.FrostManticoreEggEntityEntity;
import net.mocreatures.entity.FrostManticoreEntity;
import net.mocreatures.entity.FrostScorpionEggEntityEntity;
import net.mocreatures.entity.FrostScorpionEntity;
import net.mocreatures.entity.GoldFishEggEntityEntity;
import net.mocreatures.entity.GoldFishEntity;
import net.mocreatures.entity.GreenBirdEntity;
import net.mocreatures.entity.GreenOgre1Entity;
import net.mocreatures.entity.GreenOgre2Entity;
import net.mocreatures.entity.GrizzlyBearEntity;
import net.mocreatures.entity.HellRatEntity;
import net.mocreatures.entity.HippoTangEggEntityEntity;
import net.mocreatures.entity.HippoTangEntity;
import net.mocreatures.entity.HorseEntity;
import net.mocreatures.entity.HostileBatHorseEntity;
import net.mocreatures.entity.HostileNightmareHorseEntity;
import net.mocreatures.entity.HostileSkeletonHorseEntity;
import net.mocreatures.entity.HostileZombieHorseEntity;
import net.mocreatures.entity.HumanWerewolfEntity;
import net.mocreatures.entity.JellyFishEntity;
import net.mocreatures.entity.JungleWyvernEggEntityEntity;
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
import net.mocreatures.entity.KomodoDragonEggEntityEntity;
import net.mocreatures.entity.KomodoDragonEntity;
import net.mocreatures.entity.LeogerEntity;
import net.mocreatures.entity.LeopardEntity;
import net.mocreatures.entity.LiardEntity;
import net.mocreatures.entity.LigerEntity;
import net.mocreatures.entity.LionEntity;
import net.mocreatures.entity.LitherEntity;
import net.mocreatures.entity.MaggotEntity;
import net.mocreatures.entity.MandarinfishEggEntityEntity;
import net.mocreatures.entity.MandarinfishEntity;
import net.mocreatures.entity.MantaRayEntity;
import net.mocreatures.entity.ManticoreEntity;
import net.mocreatures.entity.MiniGolemEntity;
import net.mocreatures.entity.MoleEntity;
import net.mocreatures.entity.MothEntity;
import net.mocreatures.entity.MotherWyvernEggEntityEntity;
import net.mocreatures.entity.MountainWyvernEggEntityEntity;
import net.mocreatures.entity.MouseEntity;
import net.mocreatures.entity.NetherOstrichEntity;
import net.mocreatures.entity.OakEntEntity;
import net.mocreatures.entity.OstrichEggEntityEntity;
import net.mocreatures.entity.OstrichEntity;
import net.mocreatures.entity.PandaBearEntity;
import net.mocreatures.entity.PanthardEntity;
import net.mocreatures.entity.PantherEntity;
import net.mocreatures.entity.PanthgerEntity;
import net.mocreatures.entity.PiranhaEggEntityEntity;
import net.mocreatures.entity.PiranhaEntity;
import net.mocreatures.entity.PlainManticoreEggEntityEntity;
import net.mocreatures.entity.PolarBearEntity;
import net.mocreatures.entity.PorcupineEntity;
import net.mocreatures.entity.QuillEntity;
import net.mocreatures.entity.RaccoonEntity;
import net.mocreatures.entity.RatEntity;
import net.mocreatures.entity.RedBirdEntity;
import net.mocreatures.entity.RoachEntity;
import net.mocreatures.entity.SandWyvernEggEntityEntity;
import net.mocreatures.entity.SeaWyvernEggEntityEntity;
import net.mocreatures.entity.SharkEggEntityEntity;
import net.mocreatures.entity.SharkEntity;
import net.mocreatures.entity.SilverSkeletonEntity;
import net.mocreatures.entity.SmallBeeEntity;
import net.mocreatures.entity.SmallMaleGoatEntity;
import net.mocreatures.entity.SnailEntity;
import net.mocreatures.entity.StingRayEntity;
import net.mocreatures.entity.SunWyvernEggEntityEntity;
import net.mocreatures.entity.SwampWyvernEggEntityEntity;
import net.mocreatures.entity.TigerEntity;
import net.mocreatures.entity.ToxicManticoreEggEntityEntity;
import net.mocreatures.entity.ToxicManticoreEntity;
import net.mocreatures.entity.TurkeyEntity;
import net.mocreatures.entity.TurtleEntity;
import net.mocreatures.entity.UndeadOstrichEntity;
import net.mocreatures.entity.UndeadScorpionEntity;
import net.mocreatures.entity.UnihornedOstrichEntity;
import net.mocreatures.entity.WhiteBirdEntity;
import net.mocreatures.entity.WhiteWerewolfEntity;
import net.mocreatures.entity.WildWolfEntity;
import net.mocreatures.entity.WraithEntity;
import net.mocreatures.entity.WyvernEntity;
import net.mocreatures.entity.WyvernOstrichEntity;
import net.mocreatures.entity.YellowBirdEntity;
import net.neoforged.bus.api.EventPriority;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.EventBusSubscriber.Bus;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities.ItemHandler;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

@EventBusSubscriber(bus = Bus.MOD)
public class MocreaturesModEntities {
   public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, "mocreatures");
   public static final DeferredHolder<EntityType<?>, EntityType<BrownAntEntity>> BROWN_ANT = register(
      "brown_ant",
      Builder.of(BrownAntEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.2F, 0.2F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<FireAntEntity>> FIRE_ANT = register(
      "fire_ant",
      Builder.of(FireAntEntity::new, MobCategory.AMBIENT)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .fireImmune()
         .sized(0.2F, 0.2F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<RaccoonEntity>> RACCOON = register(
      "raccoon",
      Builder.of(RaccoonEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.6F, 0.6F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<DuckEntity>> DUCK = register(
      "duck",
      Builder.of(DuckEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.6F, 0.5F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<SnailEntity>> SNAIL = register(
      "snail",
      Builder.of(SnailEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.2F, 0.2F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<BabyDuckEntity>> BABY_DUCK = register(
      "baby_duck",
      Builder.of(BabyDuckEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.2F, 0.3F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<CrocodileEntity>> CROCODILE = register(
      "crocodile",
      Builder.of(CrocodileEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.6F, 0.4F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<RatEntity>> RAT = register(
      "rat", Builder.of(RatEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.4F, 0.4F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<CrabEntity>> CRAB = register(
      "crab",
      Builder.of(CrabEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.4F, 0.4F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<TurkeyEntity>> TURKEY = register(
      "turkey",
      Builder.of(TurkeyEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.5F, 0.8F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<SharkEntity>> SHARK = register(
      "shark",
      Builder.of(SharkEntity::new, MobCategory.WATER_CREATURE)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .sized(1.0F, 1.2F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<OstrichEntity>> BROWN_OSTRICH = register(
      "brown_ostrich",
      Builder.of(OstrichEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.6F, 1.3F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<BlackOstrichEntity>> BLACK_OSTRICH = register(
      "black_ostrich",
      Builder.of(BlackOstrichEntity::new, MobCategory.CREATURE)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .sized(0.6F, 1.3F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<TurtleEntity>> TURTLE = register(
      "turtle",
      Builder.of(TurtleEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.3F, 0.3F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<SilverSkeletonEntity>> SILVER_SKELETON = register(
      "silver_skeleton",
      Builder.of(SilverSkeletonEntity::new, MobCategory.MONSTER)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .sized(0.6F, 1.8F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<OstrichEggEntityEntity>> OSTRICH_EGG_ENTITY = register(
      "ostrich_egg_entity",
      Builder.of(OstrichEggEntityEntity::new, MobCategory.CREATURE)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .sized(0.2F, 0.2F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<SharkEggEntityEntity>> SHARK_EGG_ENTITY = register(
      "shark_egg_entity",
      Builder.of(SharkEggEntityEntity::new, MobCategory.CREATURE)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .sized(0.2F, 0.2F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<WraithEntity>> WRAITH = register(
      "wraith",
      Builder.of(WraithEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.6F, 1.8F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<DirtScorpionEntity>> DIRT_SCORPION = register(
      "dirt_scorpion",
      Builder.of(DirtScorpionEntity::new, MobCategory.MONSTER)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .sized(1.4F, 0.6F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<CaveScorpionEntity>> CAVE_SCORPION = register(
      "cave_scorpion",
      Builder.of(CaveScorpionEntity::new, MobCategory.MONSTER)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .sized(1.4F, 1.2F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<FireScorpionEntity>> FIRE_SCORPION = register(
      "fire_scorpion",
      Builder.of(FireScorpionEntity::new, MobCategory.AMBIENT)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .fireImmune()
         .sized(1.4F, 1.2F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<FrostScorpionEntity>> FROST_SCORPION = register(
      "frost_scorpion",
      Builder.of(FrostScorpionEntity::new, MobCategory.MONSTER)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .sized(1.4F, 1.2F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<UndeadScorpionEntity>> UNDEAD_SCORPION = register(
      "undead_scorpion",
      Builder.of(UndeadScorpionEntity::new, MobCategory.MONSTER)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .sized(1.4F, 1.2F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<DirtScorpionEggEntityEntity>> DIRT_SCORPION_EGG_ENTITY = register(
      "dirt_scorpion_egg_entity",
      Builder.of(DirtScorpionEggEntityEntity::new, MobCategory.CREATURE)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .sized(0.2F, 0.2F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<CaveScorpionEggEntityEntity>> CAVE_SCORPION_EGG_ENTITY = register(
      "cave_scorpion_egg_entity",
      Builder.of(CaveScorpionEggEntityEntity::new, MobCategory.CREATURE)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .sized(0.2F, 0.2F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<FireScorpionEggEntityEntity>> FIRE_SCORPION_EGG_ENTITY = register(
      "fire_scorpion_egg_entity",
      Builder.of(FireScorpionEggEntityEntity::new, MobCategory.CREATURE)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .sized(0.2F, 0.2F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<FrostScorpionEggEntityEntity>> FROST_SCORPION_EGG_ENTITY = register(
      "frost_scorpion_egg_entity",
      Builder.of(FrostScorpionEggEntityEntity::new, MobCategory.CREATURE)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .sized(0.2F, 0.2F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<FireWraithEntity>> FIRE_WRAITH = register(
      "fire_wraith",
      Builder.of(FireWraithEntity::new, MobCategory.MONSTER)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .fireImmune()
         .sized(0.6F, 1.8F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<HellRatEntity>> HELL_RAT = register(
      "hell_rat",
      Builder.of(HellRatEntity::new, MobCategory.MONSTER)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .fireImmune()
         .sized(0.8F, 1.0F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<BlackBirdEntity>> BLACK_BIRD = register(
      "black_bird",
      Builder.of(BlackBirdEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.4F, 0.4F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<BlueBirdEntity>> BLUE_BIRD = register(
      "blue_bird",
      Builder.of(BlueBirdEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.4F, 0.4F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<GreenBirdEntity>> GREEN_BIRD = register(
      "green_bird",
      Builder.of(GreenBirdEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.4F, 0.4F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<RedBirdEntity>> RED_BIRD = register(
      "red_bird",
      Builder.of(RedBirdEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.4F, 0.4F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<WhiteBirdEntity>> WHITE_BIRD = register(
      "white_bird",
      Builder.of(WhiteBirdEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.4F, 0.4F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<YellowBirdEntity>> YELLOW_BIRD = register(
      "yellow_bird",
      Builder.of(YellowBirdEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.4F, 0.4F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<OakEntEntity>> OAK_ENT = register(
      "oak_ent",
      Builder.of(OakEntEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(1.2F, 7.0F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<BirchEntEntity>> BIRCH_ENT = register(
      "birch_ent",
      Builder.of(BirchEntEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(1.2F, 7.0F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<DeerDoeEntity>> DEER_DOE = register(
      "deer_doe",
      Builder.of(DeerDoeEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.6F, 0.8F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<DeerStagEntity>> DEER_STAG = register(
      "deer_stag",
      Builder.of(DeerStagEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.6F, 0.8F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<DeerFawnEntity>> DEER_FAWN = register(
      "deer_fawn",
      Builder.of(DeerFawnEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.6F, 0.8F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<BrownBunnyEntity>> BROWN_BUNNY = register(
      "brown_bunny",
      Builder.of(BrownBunnyEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.4F, 0.5F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<KomodoDragonEntity>> KOMODO_DRAGON = register(
      "komodo_dragon",
      Builder.of(KomodoDragonEntity::new, MobCategory.CREATURE)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .sized(0.6F, 0.4F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<KomodoDragonEggEntityEntity>> KOMODO_DRAGON_EGG_ENTITY = register(
      "komodo_dragon_egg_entity",
      Builder.of(KomodoDragonEggEntityEntity::new, MobCategory.CREATURE)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .sized(0.2F, 0.2F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<KittyAEntity>> KITTY_A = register(
      "kitty_a",
      Builder.of(KittyAEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.6F, 0.8F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<KittyBEntity>> KITTY_B = register(
      "kitty_b",
      Builder.of(KittyBEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.6F, 0.8F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<KittyCEntity>> KITTY_C = register(
      "kitty_c",
      Builder.of(KittyCEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.6F, 0.8F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<KittyDEntity>> KITTY_D = register(
      "kitty_d",
      Builder.of(KittyDEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.6F, 0.8F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<KittyEEntity>> KITTY_E = register(
      "kitty_e",
      Builder.of(KittyEEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.6F, 0.8F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<KittyFEntity>> KITTY_F = register(
      "kitty_f",
      Builder.of(KittyFEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.6F, 0.8F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<KittyGEntity>> KITTY_G = register(
      "kitty_g",
      Builder.of(KittyGEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.6F, 0.8F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<KittyHEntity>> KITTY_H = register(
      "kitty_h",
      Builder.of(KittyHEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.6F, 0.8F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<KittyIEntity>> KITTY_I = register(
      "kitty_i",
      Builder.of(KittyIEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.6F, 0.8F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<KittyJEntity>> KITTY_J = register(
      "kitty_j",
      Builder.of(KittyJEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.6F, 0.8F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<NetherOstrichEntity>> NETHER_OSTRICH = register(
      "nether_ostrich",
      Builder.of(NetherOstrichEntity::new, MobCategory.CREATURE)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .fireImmune()
         .sized(0.6F, 1.3F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<MantaRayEntity>> MANTA_RAY = register(
      "manta_ray",
      Builder.of(MantaRayEntity::new, MobCategory.WATER_CREATURE)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .sized(0.8F, 0.4F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<StingRayEntity>> STING_RAY = register(
      "sting_ray",
      Builder.of(StingRayEntity::new, MobCategory.WATER_CREATURE)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .sized(0.6F, 1.8F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<CaveOgre1Entity>> CAVE_OGRE_1 = register(
      "cave_ogre_1",
      Builder.of(CaveOgre1Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(1.2F, 3.0F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<CaveOgre2Entity>> CAVE_OGRE_2 = register(
      "cave_ogre_2",
      Builder.of(CaveOgre2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(1.2F, 3.0F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<FireOgre1Entity>> FIRE_OGRE_1 = register(
      "fire_ogre_1",
      Builder.of(FireOgre1Entity::new, MobCategory.MONSTER)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .fireImmune()
         .sized(1.2F, 3.0F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<FireOgre2Entity>> FIRE_OGRE_2 = register(
      "fire_ogre_2",
      Builder.of(FireOgre2Entity::new, MobCategory.MONSTER)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .fireImmune()
         .sized(1.2F, 3.0F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<GreenOgre1Entity>> GREEN_OGRE_1 = register(
      "green_ogre_1",
      Builder.of(GreenOgre1Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.6F, 1.8F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<GreenOgre2Entity>> GREEN_OGRE_2 = register(
      "green_ogre_2",
      Builder.of(GreenOgre2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.6F, 1.8F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<SmallBeeEntity>> SMALL_BEE = register(
      "small_bee",
      Builder.of(SmallBeeEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.2F, 0.2F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<GrizzlyBearEntity>> GRIZZLY_BEAR = register(
      "grizzly_bear",
      Builder.of(GrizzlyBearEntity::new, MobCategory.CREATURE)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .sized(1.2F, 1.2F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<BlackBearEntity>> BLACK_BEAR = register(
      "black_bear",
      Builder.of(BlackBearEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(1.2F, 1.2F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<PandaBearEntity>> PANDA_BEAR = register(
      "panda_bear",
      Builder.of(PandaBearEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(1.2F, 1.2F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<PolarBearEntity>> POLAR_BEAR = register(
      "polar_bear",
      Builder.of(PolarBearEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(1.2F, 1.2F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<BoarEntity>> BOAR = register(
      "boar",
      Builder.of(BoarEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.6F, 0.6F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<ButterflyEntity>> BUTTERFLY = register(
      "butterfly",
      Builder.of(ButterflyEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.2F, 0.2F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<MothEntity>> MOTH = register(
      "moth",
      Builder.of(MothEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.2F, 0.2F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<CricketEntity>> CRICKET = register(
      "cricket",
      Builder.of(CricketEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.2F, 0.2F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<DragonflyEntity>> DRAGONFLY = register(
      "dragonfly",
      Builder.of(DragonflyEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.2F, 0.2F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<UnihornedOstrichEntity>> UNIHORNED_OSTRICH = register(
      "unihorned_ostrich",
      Builder.of(UnihornedOstrichEntity::new, MobCategory.CREATURE)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .sized(0.6F, 1.3F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<FireflyEntity>> FIREFLY = register(
      "firefly",
      Builder.of(FireflyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.2F, 0.4F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<FlyEntity>> FLY = register(
      "fly", Builder.of(FlyEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.2F, 0.2F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<FishyEntity>> FISHY = register(
      "fishy",
      Builder.of(FishyEntity::new, MobCategory.WATER_CREATURE)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .sized(0.4F, 0.4F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<FishyEggEntityEntity>> FISHY_EGG_ENTITY = register(
      "fishy_egg_entity",
      Builder.of(FishyEggEntityEntity::new, MobCategory.CREATURE)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .sized(0.2F, 0.2F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<RoachEntity>> ROACH = register(
      "roach",
      Builder.of(RoachEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.2F, 0.4F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<AnchovyEntity>> ANCHOVY = register(
      "anchovy",
      Builder.of(AnchovyEntity::new, MobCategory.WATER_CREATURE)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .sized(0.4F, 0.4F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<AnchovyEggEntityEntity>> ANCHOVY_EGG_ENTITY = register(
      "anchovy_egg_entity",
      Builder.of(AnchovyEggEntityEntity::new, MobCategory.CREATURE)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .sized(0.2F, 0.2F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<GoldFishEntity>> GOLD_FISH = register(
      "gold_fish",
      Builder.of(GoldFishEntity::new, MobCategory.WATER_CREATURE)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .sized(0.4F, 0.4F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<GoldFishEggEntityEntity>> GOLD_FISH_EGG_ENTITY = register(
      "gold_fish_egg_entity",
      Builder.of(GoldFishEggEntityEntity::new, MobCategory.CREATURE)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .sized(0.2F, 0.2F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<AnglerfishEggEntityEntity>> ANGLERFISH_EGG_ENTITY = register(
      "anglerfish_egg_entity",
      Builder.of(AnglerfishEggEntityEntity::new, MobCategory.CREATURE)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .sized(0.2F, 0.2F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<AnglerfishEntity>> ANGLERFISH = register(
      "anglerfish",
      Builder.of(AnglerfishEntity::new, MobCategory.WATER_CREATURE)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .sized(0.4F, 0.4F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<AngelfishEntity>> ANGELFISH = register(
      "angelfish",
      Builder.of(AngelfishEntity::new, MobCategory.WATER_CREATURE)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .sized(0.4F, 0.4F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<AngelfishEggEntityEntity>> ANGELFISH_EGG_ENTITY = register(
      "angelfish_egg_entity",
      Builder.of(AngelfishEggEntityEntity::new, MobCategory.CREATURE)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .sized(0.2F, 0.2F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<ClownfishEntity>> CLOWNFISH = register(
      "clownfish",
      Builder.of(ClownfishEntity::new, MobCategory.WATER_CREATURE)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .sized(0.4F, 0.4F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<ClownfishEggEntityEntity>> CLOWNFISH_EGG_ENTITY = register(
      "clownfish_egg_entity",
      Builder.of(ClownfishEggEntityEntity::new, MobCategory.CREATURE)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .sized(0.2F, 0.2F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<HippoTangEntity>> HIPPO_TANG = register(
      "hippo_tang",
      Builder.of(HippoTangEntity::new, MobCategory.WATER_CREATURE)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .sized(0.4F, 0.4F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<HippoTangEggEntityEntity>> HIPPO_TANG_EGG_ENTITY = register(
      "hippo_tang_egg_entity",
      Builder.of(HippoTangEggEntityEntity::new, MobCategory.CREATURE)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .sized(0.2F, 0.2F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<MandarinfishEntity>> MANDARINFISH = register(
      "mandarinfish",
      Builder.of(MandarinfishEntity::new, MobCategory.WATER_CREATURE)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .sized(0.4F, 0.4F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<MandarinfishEggEntityEntity>> MANDARINFISH_EGG_ENTITY = register(
      "mandarinfish_egg_entity",
      Builder.of(MandarinfishEggEntityEntity::new, MobCategory.CREATURE)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .sized(0.2F, 0.2F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<PiranhaEntity>> PIRANHA = register(
      "piranha",
      Builder.of(PiranhaEntity::new, MobCategory.WATER_CREATURE)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .sized(0.4F, 0.4F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<PiranhaEggEntityEntity>> PIRANHA_EGG_ENTITY = register(
      "piranha_egg_entity",
      Builder.of(PiranhaEggEntityEntity::new, MobCategory.CREATURE)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .sized(0.2F, 0.2F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<MiniGolemEntity>> MINI_GOLEM = register(
      "mini_golem",
      Builder.of(MiniGolemEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.8F, 1.2F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<BlockProjectileEntity>> BLOCK_PROJECTILE = register(
      "block_projectile",
      Builder.<BlockProjectileEntity>of(BlockProjectileEntity::new, MobCategory.MISC)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(1)
         .sized(0.8F, 0.8F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<ManticoreEntity>> MANTICORE = register(
      "manticore",
      Builder.of(ManticoreEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(1.2F, 1.0F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<PlainManticoreEggEntityEntity>> PLAIN_MANTICORE_EGG_ENTITY = register(
      "plain_manticore_egg_entity",
      Builder.of(PlainManticoreEggEntityEntity::new, MobCategory.CREATURE)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .sized(0.2F, 0.2F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<DarkManticoreEntity>> DARK_MANTICORE = register(
      "dark_manticore",
      Builder.of(DarkManticoreEntity::new, MobCategory.MONSTER)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .sized(1.2F, 1.0F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<FireManticoreEntity>> FIRE_MANTICORE = register(
      "fire_manticore",
      Builder.of(FireManticoreEntity::new, MobCategory.MONSTER)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .fireImmune()
         .sized(1.2F, 1.0F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<FrostManticoreEntity>> FROST_MANTICORE = register(
      "frost_manticore",
      Builder.of(FrostManticoreEntity::new, MobCategory.MONSTER)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .sized(1.2F, 1.0F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<ToxicManticoreEntity>> TOXIC_MANTICORE = register(
      "toxic_manticore",
      Builder.of(ToxicManticoreEntity::new, MobCategory.MONSTER)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .sized(1.2F, 1.0F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<DarkManticoreEggEntityEntity>> DARK_MANTICORE_EGG_ENTITY = register(
      "dark_manticore_egg_entity",
      Builder.of(DarkManticoreEggEntityEntity::new, MobCategory.CREATURE)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .sized(0.2F, 0.2F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<FireManticoreEggEntityEntity>> FIRE_MANTICORE_EGG_ENTITY = register(
      "fire_manticore_egg_entity",
      Builder.of(FireManticoreEggEntityEntity::new, MobCategory.CREATURE)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .sized(0.2F, 0.2F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<FrostManticoreEggEntityEntity>> FROST_MANTICORE_EGG_ENTITY = register(
      "frost_manticore_egg_entity",
      Builder.of(FrostManticoreEggEntityEntity::new, MobCategory.CREATURE)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .sized(0.2F, 0.2F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<ToxicManticoreEggEntityEntity>> TOXIC_MANTICORE_EGG_ENTITY = register(
      "toxic_manticore_egg_entity",
      Builder.of(ToxicManticoreEggEntityEntity::new, MobCategory.CREATURE)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .sized(0.2F, 0.2F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<BassEntity>> BASS = register(
      "bass",
      Builder.of(BassEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.6F, 0.4F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<BassEggEntityEntity>> BASS_EGG_ENTITY = register(
      "bass_egg_entity",
      Builder.of(BassEggEntityEntity::new, MobCategory.CREATURE)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .sized(0.2F, 0.2F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<MaggotEntity>> MAGGOT = register(
      "maggot",
      Builder.of(MaggotEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.2F, 0.2F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<ElephantEntity>> ELEPHANT = register(
      "elephant",
      Builder.of(ElephantEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(1.0F, 2.4F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<MoleEntity>> MOLE = register(
      "mole",
      Builder.of(MoleEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(1.0F, 0.5F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<MouseEntity>> MOUSE = register(
      "mouse",
      Builder.of(MouseEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.4F, 0.4F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<SmallMaleGoatEntity>> SMALL_MALE_GOAT = register(
      "small_male_goat",
      Builder.of(SmallMaleGoatEntity::new, MobCategory.CREATURE)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .sized(0.8F, 0.8F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<BigGolemEntity>> BIG_GOLEM = register(
      "big_golem",
      Builder.of(BigGolemEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(2.0F, 4.0F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<WildWolfEntity>> WILD_WOLF = register(
      "wild_wolf",
      Builder.of(WildWolfEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.8F, 0.6F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<JellyFishEntity>> JELLYFISH = register(
      "jellyfish",
      Builder.of(JellyFishEntity::new, MobCategory.WATER_CREATURE)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .sized(0.5F, 0.6F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<BrownWerewolfEntity>> BROWN_WEREWOLF = register(
      "brown_werewolf",
      Builder.of(BrownWerewolfEntity::new, MobCategory.MONSTER)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .sized(0.8F, 2.2F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<WhiteWerewolfEntity>> WHITE_WEREWOLF = register(
      "white_werewolf",
      Builder.of(WhiteWerewolfEntity::new, MobCategory.MONSTER)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .sized(0.8F, 2.2F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<BlackWerewolfEntity>> BLACK_WEREWOLF = register(
      "black_werewolf",
      Builder.of(BlackWerewolfEntity::new, MobCategory.MONSTER)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .sized(0.8F, 2.2F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<FireWerewolfEntity>> FIRE_WEREWOLF = register(
      "fire_werewolf",
      Builder.of(FireWerewolfEntity::new, MobCategory.MONSTER)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .fireImmune()
         .sized(0.8F, 2.2F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<HumanWerewolfEntity>> HUMAN_WEREWOLF = register(
      "human_werewolf",
      Builder.of(HumanWerewolfEntity::new, MobCategory.MONSTER)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .sized(0.6F, 1.8F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<PorcupineEntity>> PORCUPINE = register(
      "porcupine",
      Builder.of(PorcupineEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.4F, 0.4F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<QuillEntity>> QUILL = register(
      "quill", Builder.<QuillEntity>of(QuillEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5F, 0.5F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<WyvernOstrichEntity>> WYVERN_OSTRICH = register(
      "wyvern_ostrich",
      Builder.of(WyvernOstrichEntity::new, MobCategory.CREATURE)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .sized(0.6F, 1.3F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<UndeadOstrichEntity>> UNDEAD_OSTRICH = register(
      "undead_ostrich",
      Builder.of(UndeadOstrichEntity::new, MobCategory.CREATURE)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .sized(0.6F, 1.3F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<WyvernEntity>> WYVERN = register(
      "wyvern",
      Builder.of(WyvernEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(1.0F, 1.8F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<ArcticWyvernEggEntityEntity>> ARCTIC_WYVERN_EGG_ENTITY = register(
      "arctic_wyvern_egg_entity",
      Builder.of(ArcticWyvernEggEntityEntity::new, MobCategory.CREATURE)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .sized(0.2F, 0.2F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<CaveWyvernEggEntityEntity>> CAVE_WYVERN_EGG_ENTITY = register(
      "cave_wyvern_egg_entity",
      Builder.of(CaveWyvernEggEntityEntity::new, MobCategory.CREATURE)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .sized(0.2F, 0.2F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<JungleWyvernEggEntityEntity>> JUNGLE_WYVERN_EGG_ENTITY = register(
      "jungle_wyvern_egg_entity",
      Builder.of(JungleWyvernEggEntityEntity::new, MobCategory.CREATURE)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .sized(0.2F, 0.2F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<MountainWyvernEggEntityEntity>> MOUNTAIN_WYVERN_EGG_ENTITY = register(
      "mountain_wyvern_egg_entity",
      Builder.of(MountainWyvernEggEntityEntity::new, MobCategory.CREATURE)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .sized(0.2F, 0.2F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<SandWyvernEggEntityEntity>> SAND_WYVERN_EGG_ENTITY = register(
      "sand_wyvern_egg_entity",
      Builder.of(SandWyvernEggEntityEntity::new, MobCategory.CREATURE)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .sized(0.2F, 0.2F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<SeaWyvernEggEntityEntity>> SEA_WYVERN_EGG_ENTITY = register(
      "sea_wyvern_egg_entity",
      Builder.of(SeaWyvernEggEntityEntity::new, MobCategory.CREATURE)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .sized(0.2F, 0.2F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<SunWyvernEggEntityEntity>> SUN_WYVERN_EGG_ENTITY = register(
      "sun_wyvern_egg_entity",
      Builder.of(SunWyvernEggEntityEntity::new, MobCategory.CREATURE)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .sized(0.2F, 0.2F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<SwampWyvernEggEntityEntity>> SWAMP_WYVERN_EGG_ENTITY = register(
      "swamp_wyvern_egg_entity",
      Builder.of(SwampWyvernEggEntityEntity::new, MobCategory.CREATURE)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .sized(0.2F, 0.2F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<MotherWyvernEggEntityEntity>> MOTHER_WYVERN_EGG_ENTITY = register(
      "mother_wyvern_egg_entity",
      Builder.of(MotherWyvernEggEntityEntity::new, MobCategory.CREATURE)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .sized(0.2F, 0.2F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<LionEntity>> LION = register(
      "lion",
      Builder.of(LionEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(1.0F, 1.5F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<TigerEntity>> TIGER = register(
      "tiger",
      Builder.of(TigerEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(1.0F, 1.5F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<LeopardEntity>> LEOPARD = register(
      "leopard",
      Builder.of(LeopardEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(1.0F, 1.5F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<PantherEntity>> PANTHER = register(
      "panther",
      Builder.of(PantherEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(1.0F, 1.5F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<PanthgerEntity>> PANTHGER = register(
      "panthger",
      Builder.of(PanthgerEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(1.0F, 1.5F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<PanthardEntity>> PANTHARD = register(
      "panthard",
      Builder.of(PanthardEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(1.0F, 1.5F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<LitherEntity>> LITHER = register(
      "lither",
      Builder.of(LitherEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(1.0F, 1.5F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<LeogerEntity>> LEOGER = register(
      "leoger",
      Builder.of(LeogerEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(1.0F, 1.5F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<LiardEntity>> LIARD = register(
      "liard",
      Builder.of(LiardEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(1.0F, 1.5F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<LigerEntity>> LIGER = register(
      "liger",
      Builder.of(LigerEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(1.0F, 1.5F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<HorseEntity>> HORSE = register(
      "horse",
      Builder.of(HorseEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(1.2F, 1.6F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<HostileBatHorseEntity>> HOSTILE_BAT_HORSE = register(
      "hostile_bat_horse",
      Builder.of(HostileBatHorseEntity::new, MobCategory.MONSTER)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .sized(1.2F, 1.6F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<HostileZombieHorseEntity>> HOSTILE_ZOMBIE_HORSE = register(
      "hostile_zombie_horse",
      Builder.of(HostileZombieHorseEntity::new, MobCategory.MONSTER)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .sized(1.2F, 1.6F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<HostileSkeletonHorseEntity>> HOSTILE_SKELETON_HORSE = register(
      "hostile_skeleton_horse",
      Builder.of(HostileSkeletonHorseEntity::new, MobCategory.MONSTER)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .sized(1.2F, 1.6F)
   );
   public static final DeferredHolder<EntityType<?>, EntityType<HostileNightmareHorseEntity>> HOSTILE_NIGHTMARE_HORSE = register(
      "hostile_nightmare_horse",
      Builder.of(HostileNightmareHorseEntity::new, MobCategory.MONSTER)
         .setShouldReceiveVelocityUpdates(true)
         .setTrackingRange(64)
         .setUpdateInterval(3)
         .fireImmune()
         .sized(1.2F, 1.6F)
   );

   private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, Builder<T> entityTypeBuilder) {
      return REGISTRY.register(registryname, () -> entityTypeBuilder.build(registryname));
   }

   @SubscribeEvent(priority = EventPriority.HIGHEST)
   public static void registerCapabilities(RegisterCapabilitiesEvent event) {
      event.registerEntity(ItemHandler.ENTITY, BROWN_OSTRICH.get(), (living, context) -> living.getCombinedInventory());
      event.registerEntity(ItemHandler.ENTITY, BLACK_OSTRICH.get(), (living, context) -> living.getCombinedInventory());
      event.registerEntity(ItemHandler.ENTITY, NETHER_OSTRICH.get(), (living, context) -> living.getCombinedInventory());
      event.registerEntity(ItemHandler.ENTITY, UNIHORNED_OSTRICH.get(), (living, context) -> living.getCombinedInventory());
      event.registerEntity(ItemHandler.ENTITY, ELEPHANT.get(), (living, context) -> living.getCombinedInventory());
      event.registerEntity(ItemHandler.ENTITY, WYVERN_OSTRICH.get(), (living, context) -> living.getCombinedInventory());
      event.registerEntity(ItemHandler.ENTITY, UNDEAD_OSTRICH.get(), (living, context) -> living.getCombinedInventory());
      event.registerEntity(ItemHandler.ENTITY, WYVERN.get(), (living, context) -> living.getCombinedInventory());
      event.registerEntity(ItemHandler.ENTITY, LION.get(), (living, context) -> living.getCombinedInventory());
      event.registerEntity(ItemHandler.ENTITY, TIGER.get(), (living, context) -> living.getCombinedInventory());
      event.registerEntity(ItemHandler.ENTITY, LEOPARD.get(), (living, context) -> living.getCombinedInventory());
      event.registerEntity(ItemHandler.ENTITY, PANTHER.get(), (living, context) -> living.getCombinedInventory());
      event.registerEntity(ItemHandler.ENTITY, PANTHGER.get(), (living, context) -> living.getCombinedInventory());
      event.registerEntity(ItemHandler.ENTITY, PANTHARD.get(), (living, context) -> living.getCombinedInventory());
      event.registerEntity(ItemHandler.ENTITY, LITHER.get(), (living, context) -> living.getCombinedInventory());
      event.registerEntity(ItemHandler.ENTITY, LEOGER.get(), (living, context) -> living.getCombinedInventory());
      event.registerEntity(ItemHandler.ENTITY, LIARD.get(), (living, context) -> living.getCombinedInventory());
      event.registerEntity(ItemHandler.ENTITY, LIGER.get(), (living, context) -> living.getCombinedInventory());
      event.registerEntity(ItemHandler.ENTITY, HORSE.get(), (living, context) -> living.getCombinedInventory());
   }

   @SubscribeEvent
   public static void init(RegisterSpawnPlacementsEvent event) {
      BrownAntEntity.init(event);
      FireAntEntity.init(event);
      RaccoonEntity.init(event);
      DuckEntity.init(event);
      SnailEntity.init(event);
      BabyDuckEntity.init(event);
      CrocodileEntity.init(event);
      RatEntity.init(event);
      CrabEntity.init(event);
      TurkeyEntity.init(event);
      SharkEntity.init(event);
      OstrichEntity.init(event);
      BlackOstrichEntity.init(event);
      TurtleEntity.init(event);
      SilverSkeletonEntity.init(event);
      OstrichEggEntityEntity.init(event);
      SharkEggEntityEntity.init(event);
      WraithEntity.init(event);
      DirtScorpionEntity.init(event);
      CaveScorpionEntity.init(event);
      FireScorpionEntity.init(event);
      FrostScorpionEntity.init(event);
      UndeadScorpionEntity.init(event);
      DirtScorpionEggEntityEntity.init(event);
      CaveScorpionEggEntityEntity.init(event);
      FireScorpionEggEntityEntity.init(event);
      FrostScorpionEggEntityEntity.init(event);
      FireWraithEntity.init(event);
      HellRatEntity.init(event);
      BlackBirdEntity.init(event);
      BlueBirdEntity.init(event);
      GreenBirdEntity.init(event);
      RedBirdEntity.init(event);
      WhiteBirdEntity.init(event);
      YellowBirdEntity.init(event);
      OakEntEntity.init(event);
      BirchEntEntity.init(event);
      DeerDoeEntity.init(event);
      DeerStagEntity.init(event);
      DeerFawnEntity.init(event);
      BrownBunnyEntity.init(event);
      KomodoDragonEntity.init(event);
      KomodoDragonEggEntityEntity.init(event);
      KittyAEntity.init(event);
      KittyBEntity.init(event);
      KittyCEntity.init(event);
      KittyDEntity.init(event);
      KittyEEntity.init(event);
      KittyFEntity.init(event);
      KittyGEntity.init(event);
      KittyHEntity.init(event);
      KittyIEntity.init(event);
      KittyJEntity.init(event);
      NetherOstrichEntity.init(event);
      MantaRayEntity.init(event);
      StingRayEntity.init(event);
      CaveOgre1Entity.init(event);
      CaveOgre2Entity.init(event);
      FireOgre1Entity.init(event);
      FireOgre2Entity.init(event);
      GreenOgre1Entity.init(event);
      GreenOgre2Entity.init(event);
      SmallBeeEntity.init(event);
      GrizzlyBearEntity.init(event);
      BlackBearEntity.init(event);
      PandaBearEntity.init(event);
      PolarBearEntity.init(event);
      BoarEntity.init(event);
      ButterflyEntity.init(event);
      MothEntity.init(event);
      CricketEntity.init(event);
      DragonflyEntity.init(event);
      UnihornedOstrichEntity.init(event);
      FireflyEntity.init(event);
      FlyEntity.init(event);
      FishyEntity.init(event);
      FishyEggEntityEntity.init(event);
      RoachEntity.init(event);
      AnchovyEntity.init(event);
      AnchovyEggEntityEntity.init(event);
      GoldFishEntity.init(event);
      GoldFishEggEntityEntity.init(event);
      AnglerfishEggEntityEntity.init(event);
      AnglerfishEntity.init(event);
      AngelfishEntity.init(event);
      AngelfishEggEntityEntity.init(event);
      ClownfishEntity.init(event);
      ClownfishEggEntityEntity.init(event);
      HippoTangEntity.init(event);
      HippoTangEggEntityEntity.init(event);
      MandarinfishEntity.init(event);
      MandarinfishEggEntityEntity.init(event);
      PiranhaEntity.init(event);
      PiranhaEggEntityEntity.init(event);
      MiniGolemEntity.init(event);
      ManticoreEntity.init(event);
      PlainManticoreEggEntityEntity.init(event);
      DarkManticoreEntity.init(event);
      FireManticoreEntity.init(event);
      FrostManticoreEntity.init(event);
      ToxicManticoreEntity.init(event);
      DarkManticoreEggEntityEntity.init(event);
      FireManticoreEggEntityEntity.init(event);
      FrostManticoreEggEntityEntity.init(event);
      ToxicManticoreEggEntityEntity.init(event);
      BassEntity.init(event);
      BassEggEntityEntity.init(event);
      MaggotEntity.init(event);
      ElephantEntity.init(event);
      MoleEntity.init(event);
      MouseEntity.init(event);
      SmallMaleGoatEntity.init(event);
      BigGolemEntity.init(event);
      WildWolfEntity.init(event);
      JellyFishEntity.init(event);
      BrownWerewolfEntity.init(event);
      WhiteWerewolfEntity.init(event);
      BlackWerewolfEntity.init(event);
      FireWerewolfEntity.init(event);
      HumanWerewolfEntity.init(event);
      PorcupineEntity.init(event);
      WyvernOstrichEntity.init(event);
      UndeadOstrichEntity.init(event);
      WyvernEntity.init(event);
      ArcticWyvernEggEntityEntity.init(event);
      CaveWyvernEggEntityEntity.init(event);
      JungleWyvernEggEntityEntity.init(event);
      MountainWyvernEggEntityEntity.init(event);
      SandWyvernEggEntityEntity.init(event);
      SeaWyvernEggEntityEntity.init(event);
      SunWyvernEggEntityEntity.init(event);
      SwampWyvernEggEntityEntity.init(event);
      MotherWyvernEggEntityEntity.init(event);
      LionEntity.init(event);
      TigerEntity.init(event);
      LeopardEntity.init(event);
      PantherEntity.init(event);
      PanthgerEntity.init(event);
      PanthardEntity.init(event);
      LitherEntity.init(event);
      LeogerEntity.init(event);
      LiardEntity.init(event);
      LigerEntity.init(event);
      HorseEntity.init(event);
      HostileBatHorseEntity.init(event);
      HostileZombieHorseEntity.init(event);
      HostileSkeletonHorseEntity.init(event);
      HostileNightmareHorseEntity.init(event);
   }

   @SubscribeEvent
   public static void registerAttributes(EntityAttributeCreationEvent event) {
      event.put((EntityType)BROWN_ANT.get(), BrownAntEntity.createAttributes().build());
      event.put((EntityType)FIRE_ANT.get(), FireAntEntity.createAttributes().build());
      event.put((EntityType)RACCOON.get(), RaccoonEntity.createAttributes().build());
      event.put((EntityType)DUCK.get(), DuckEntity.createAttributes().build());
      event.put((EntityType)SNAIL.get(), SnailEntity.createAttributes().build());
      event.put((EntityType)BABY_DUCK.get(), BabyDuckEntity.createAttributes().build());
      event.put((EntityType)CROCODILE.get(), CrocodileEntity.createAttributes().build());
      event.put((EntityType)RAT.get(), RatEntity.createAttributes().build());
      event.put((EntityType)CRAB.get(), CrabEntity.createAttributes().build());
      event.put((EntityType)TURKEY.get(), TurkeyEntity.createAttributes().build());
      event.put((EntityType)SHARK.get(), SharkEntity.createAttributes().build());
      event.put((EntityType)BROWN_OSTRICH.get(), OstrichEntity.createAttributes().build());
      event.put((EntityType)BLACK_OSTRICH.get(), BlackOstrichEntity.createAttributes().build());
      event.put((EntityType)TURTLE.get(), TurtleEntity.createAttributes().build());
      event.put((EntityType)SILVER_SKELETON.get(), SilverSkeletonEntity.createAttributes().build());
      event.put((EntityType)OSTRICH_EGG_ENTITY.get(), OstrichEggEntityEntity.createAttributes().build());
      event.put((EntityType)SHARK_EGG_ENTITY.get(), SharkEggEntityEntity.createAttributes().build());
      event.put((EntityType)WRAITH.get(), WraithEntity.createAttributes().build());
      event.put((EntityType)DIRT_SCORPION.get(), DirtScorpionEntity.createAttributes().build());
      event.put((EntityType)CAVE_SCORPION.get(), CaveScorpionEntity.createAttributes().build());
      event.put((EntityType)FIRE_SCORPION.get(), FireScorpionEntity.createAttributes().build());
      event.put((EntityType)FROST_SCORPION.get(), FrostScorpionEntity.createAttributes().build());
      event.put((EntityType)UNDEAD_SCORPION.get(), UndeadScorpionEntity.createAttributes().build());
      event.put((EntityType)DIRT_SCORPION_EGG_ENTITY.get(), DirtScorpionEggEntityEntity.createAttributes().build());
      event.put((EntityType)CAVE_SCORPION_EGG_ENTITY.get(), CaveScorpionEggEntityEntity.createAttributes().build());
      event.put((EntityType)FIRE_SCORPION_EGG_ENTITY.get(), FireScorpionEggEntityEntity.createAttributes().build());
      event.put((EntityType)FROST_SCORPION_EGG_ENTITY.get(), FrostScorpionEggEntityEntity.createAttributes().build());
      event.put((EntityType)FIRE_WRAITH.get(), FireWraithEntity.createAttributes().build());
      event.put((EntityType)HELL_RAT.get(), HellRatEntity.createAttributes().build());
      event.put((EntityType)BLACK_BIRD.get(), BlackBirdEntity.createAttributes().build());
      event.put((EntityType)BLUE_BIRD.get(), BlueBirdEntity.createAttributes().build());
      event.put((EntityType)GREEN_BIRD.get(), GreenBirdEntity.createAttributes().build());
      event.put((EntityType)RED_BIRD.get(), RedBirdEntity.createAttributes().build());
      event.put((EntityType)WHITE_BIRD.get(), WhiteBirdEntity.createAttributes().build());
      event.put((EntityType)YELLOW_BIRD.get(), YellowBirdEntity.createAttributes().build());
      event.put((EntityType)OAK_ENT.get(), OakEntEntity.createAttributes().build());
      event.put((EntityType)BIRCH_ENT.get(), BirchEntEntity.createAttributes().build());
      event.put((EntityType)DEER_DOE.get(), DeerDoeEntity.createAttributes().build());
      event.put((EntityType)DEER_STAG.get(), DeerStagEntity.createAttributes().build());
      event.put((EntityType)DEER_FAWN.get(), DeerFawnEntity.createAttributes().build());
      event.put((EntityType)BROWN_BUNNY.get(), BrownBunnyEntity.createAttributes().build());
      event.put((EntityType)KOMODO_DRAGON.get(), KomodoDragonEntity.createAttributes().build());
      event.put((EntityType)KOMODO_DRAGON_EGG_ENTITY.get(), KomodoDragonEggEntityEntity.createAttributes().build());
      event.put((EntityType)KITTY_A.get(), KittyAEntity.createAttributes().build());
      event.put((EntityType)KITTY_B.get(), KittyBEntity.createAttributes().build());
      event.put((EntityType)KITTY_C.get(), KittyCEntity.createAttributes().build());
      event.put((EntityType)KITTY_D.get(), KittyDEntity.createAttributes().build());
      event.put((EntityType)KITTY_E.get(), KittyEEntity.createAttributes().build());
      event.put((EntityType)KITTY_F.get(), KittyFEntity.createAttributes().build());
      event.put((EntityType)KITTY_G.get(), KittyGEntity.createAttributes().build());
      event.put((EntityType)KITTY_H.get(), KittyHEntity.createAttributes().build());
      event.put((EntityType)KITTY_I.get(), KittyIEntity.createAttributes().build());
      event.put((EntityType)KITTY_J.get(), KittyJEntity.createAttributes().build());
      event.put((EntityType)NETHER_OSTRICH.get(), NetherOstrichEntity.createAttributes().build());
      event.put((EntityType)MANTA_RAY.get(), MantaRayEntity.createAttributes().build());
      event.put((EntityType)STING_RAY.get(), StingRayEntity.createAttributes().build());
      event.put((EntityType)CAVE_OGRE_1.get(), CaveOgre1Entity.createAttributes().build());
      event.put((EntityType)CAVE_OGRE_2.get(), CaveOgre2Entity.createAttributes().build());
      event.put((EntityType)FIRE_OGRE_1.get(), FireOgre1Entity.createAttributes().build());
      event.put((EntityType)FIRE_OGRE_2.get(), FireOgre2Entity.createAttributes().build());
      event.put((EntityType)GREEN_OGRE_1.get(), GreenOgre1Entity.createAttributes().build());
      event.put((EntityType)GREEN_OGRE_2.get(), GreenOgre2Entity.createAttributes().build());
      event.put((EntityType)SMALL_BEE.get(), SmallBeeEntity.createAttributes().build());
      event.put((EntityType)GRIZZLY_BEAR.get(), GrizzlyBearEntity.createAttributes().build());
      event.put((EntityType)BLACK_BEAR.get(), BlackBearEntity.createAttributes().build());
      event.put((EntityType)PANDA_BEAR.get(), PandaBearEntity.createAttributes().build());
      event.put((EntityType)POLAR_BEAR.get(), PolarBearEntity.createAttributes().build());
      event.put((EntityType)BOAR.get(), BoarEntity.createAttributes().build());
      event.put((EntityType)BUTTERFLY.get(), ButterflyEntity.createAttributes().build());
      event.put((EntityType)MOTH.get(), MothEntity.createAttributes().build());
      event.put((EntityType)CRICKET.get(), CricketEntity.createAttributes().build());
      event.put((EntityType)DRAGONFLY.get(), DragonflyEntity.createAttributes().build());
      event.put((EntityType)UNIHORNED_OSTRICH.get(), UnihornedOstrichEntity.createAttributes().build());
      event.put((EntityType)FIREFLY.get(), FireflyEntity.createAttributes().build());
      event.put((EntityType)FLY.get(), FlyEntity.createAttributes().build());
      event.put((EntityType)FISHY.get(), FishyEntity.createAttributes().build());
      event.put((EntityType)FISHY_EGG_ENTITY.get(), FishyEggEntityEntity.createAttributes().build());
      event.put((EntityType)ROACH.get(), RoachEntity.createAttributes().build());
      event.put((EntityType)ANCHOVY.get(), AnchovyEntity.createAttributes().build());
      event.put((EntityType)ANCHOVY_EGG_ENTITY.get(), AnchovyEggEntityEntity.createAttributes().build());
      event.put((EntityType)GOLD_FISH.get(), GoldFishEntity.createAttributes().build());
      event.put((EntityType)GOLD_FISH_EGG_ENTITY.get(), GoldFishEggEntityEntity.createAttributes().build());
      event.put((EntityType)ANGLERFISH_EGG_ENTITY.get(), AnglerfishEggEntityEntity.createAttributes().build());
      event.put((EntityType)ANGLERFISH.get(), AnglerfishEntity.createAttributes().build());
      event.put((EntityType)ANGELFISH.get(), AngelfishEntity.createAttributes().build());
      event.put((EntityType)ANGELFISH_EGG_ENTITY.get(), AngelfishEggEntityEntity.createAttributes().build());
      event.put((EntityType)CLOWNFISH.get(), ClownfishEntity.createAttributes().build());
      event.put((EntityType)CLOWNFISH_EGG_ENTITY.get(), ClownfishEggEntityEntity.createAttributes().build());
      event.put((EntityType)HIPPO_TANG.get(), HippoTangEntity.createAttributes().build());
      event.put((EntityType)HIPPO_TANG_EGG_ENTITY.get(), HippoTangEggEntityEntity.createAttributes().build());
      event.put((EntityType)MANDARINFISH.get(), MandarinfishEntity.createAttributes().build());
      event.put((EntityType)MANDARINFISH_EGG_ENTITY.get(), MandarinfishEggEntityEntity.createAttributes().build());
      event.put((EntityType)PIRANHA.get(), PiranhaEntity.createAttributes().build());
      event.put((EntityType)PIRANHA_EGG_ENTITY.get(), PiranhaEggEntityEntity.createAttributes().build());
      event.put((EntityType)MINI_GOLEM.get(), MiniGolemEntity.createAttributes().build());
      event.put((EntityType)MANTICORE.get(), ManticoreEntity.createAttributes().build());
      event.put((EntityType)PLAIN_MANTICORE_EGG_ENTITY.get(), PlainManticoreEggEntityEntity.createAttributes().build());
      event.put((EntityType)DARK_MANTICORE.get(), DarkManticoreEntity.createAttributes().build());
      event.put((EntityType)FIRE_MANTICORE.get(), FireManticoreEntity.createAttributes().build());
      event.put((EntityType)FROST_MANTICORE.get(), FrostManticoreEntity.createAttributes().build());
      event.put((EntityType)TOXIC_MANTICORE.get(), ToxicManticoreEntity.createAttributes().build());
      event.put((EntityType)DARK_MANTICORE_EGG_ENTITY.get(), DarkManticoreEggEntityEntity.createAttributes().build());
      event.put((EntityType)FIRE_MANTICORE_EGG_ENTITY.get(), FireManticoreEggEntityEntity.createAttributes().build());
      event.put((EntityType)FROST_MANTICORE_EGG_ENTITY.get(), FrostManticoreEggEntityEntity.createAttributes().build());
      event.put((EntityType)TOXIC_MANTICORE_EGG_ENTITY.get(), ToxicManticoreEggEntityEntity.createAttributes().build());
      event.put((EntityType)BASS.get(), BassEntity.createAttributes().build());
      event.put((EntityType)BASS_EGG_ENTITY.get(), BassEggEntityEntity.createAttributes().build());
      event.put((EntityType)MAGGOT.get(), MaggotEntity.createAttributes().build());
      event.put((EntityType)ELEPHANT.get(), ElephantEntity.createAttributes().build());
      event.put((EntityType)MOLE.get(), MoleEntity.createAttributes().build());
      event.put((EntityType)MOUSE.get(), MouseEntity.createAttributes().build());
      event.put((EntityType)SMALL_MALE_GOAT.get(), SmallMaleGoatEntity.createAttributes().build());
      event.put((EntityType)BIG_GOLEM.get(), BigGolemEntity.createAttributes().build());
      event.put((EntityType)WILD_WOLF.get(), WildWolfEntity.createAttributes().build());
      event.put((EntityType)JELLYFISH.get(), JellyFishEntity.createAttributes().build());
      event.put((EntityType)BROWN_WEREWOLF.get(), BrownWerewolfEntity.createAttributes().build());
      event.put((EntityType)WHITE_WEREWOLF.get(), WhiteWerewolfEntity.createAttributes().build());
      event.put((EntityType)BLACK_WEREWOLF.get(), BlackWerewolfEntity.createAttributes().build());
      event.put((EntityType)FIRE_WEREWOLF.get(), FireWerewolfEntity.createAttributes().build());
      event.put((EntityType)HUMAN_WEREWOLF.get(), HumanWerewolfEntity.createAttributes().build());
      event.put((EntityType)PORCUPINE.get(), PorcupineEntity.createAttributes().build());
      event.put((EntityType)WYVERN_OSTRICH.get(), WyvernOstrichEntity.createAttributes().build());
      event.put((EntityType)UNDEAD_OSTRICH.get(), UndeadOstrichEntity.createAttributes().build());
      event.put((EntityType)WYVERN.get(), WyvernEntity.createAttributes().build());
      event.put((EntityType)ARCTIC_WYVERN_EGG_ENTITY.get(), ArcticWyvernEggEntityEntity.createAttributes().build());
      event.put((EntityType)CAVE_WYVERN_EGG_ENTITY.get(), CaveWyvernEggEntityEntity.createAttributes().build());
      event.put((EntityType)JUNGLE_WYVERN_EGG_ENTITY.get(), JungleWyvernEggEntityEntity.createAttributes().build());
      event.put((EntityType)MOUNTAIN_WYVERN_EGG_ENTITY.get(), MountainWyvernEggEntityEntity.createAttributes().build());
      event.put((EntityType)SAND_WYVERN_EGG_ENTITY.get(), SandWyvernEggEntityEntity.createAttributes().build());
      event.put((EntityType)SEA_WYVERN_EGG_ENTITY.get(), SeaWyvernEggEntityEntity.createAttributes().build());
      event.put((EntityType)SUN_WYVERN_EGG_ENTITY.get(), SunWyvernEggEntityEntity.createAttributes().build());
      event.put((EntityType)SWAMP_WYVERN_EGG_ENTITY.get(), SwampWyvernEggEntityEntity.createAttributes().build());
      event.put((EntityType)MOTHER_WYVERN_EGG_ENTITY.get(), MotherWyvernEggEntityEntity.createAttributes().build());
      event.put((EntityType)LION.get(), LionEntity.createAttributes().build());
      event.put((EntityType)TIGER.get(), TigerEntity.createAttributes().build());
      event.put((EntityType)LEOPARD.get(), LeopardEntity.createAttributes().build());
      event.put((EntityType)PANTHER.get(), PantherEntity.createAttributes().build());
      event.put((EntityType)PANTHGER.get(), PanthgerEntity.createAttributes().build());
      event.put((EntityType)PANTHARD.get(), PanthardEntity.createAttributes().build());
      event.put((EntityType)LITHER.get(), LitherEntity.createAttributes().build());
      event.put((EntityType)LEOGER.get(), LeogerEntity.createAttributes().build());
      event.put((EntityType)LIARD.get(), LiardEntity.createAttributes().build());
      event.put((EntityType)LIGER.get(), LigerEntity.createAttributes().build());
      event.put((EntityType)HORSE.get(), HorseEntity.createAttributes().build());
      event.put((EntityType)HOSTILE_BAT_HORSE.get(), HostileBatHorseEntity.createAttributes().build());
      event.put((EntityType)HOSTILE_ZOMBIE_HORSE.get(), HostileZombieHorseEntity.createAttributes().build());
      event.put((EntityType)HOSTILE_SKELETON_HORSE.get(), HostileSkeletonHorseEntity.createAttributes().build());
      event.put((EntityType)HOSTILE_NIGHTMARE_HORSE.get(), HostileNightmareHorseEntity.createAttributes().build());
   }
}
