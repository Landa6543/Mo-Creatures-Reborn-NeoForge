package net.mocreatures.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class MocreaturesModSounds {
   public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, "mocreatures");
   public static final DeferredHolder<SoundEvent, SoundEvent> RACCOON_AMBIENT = REGISTRY.register(
      "raccoon_ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "raccoon_ambient"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> RACCOON_HURT = REGISTRY.register(
      "raccoon_hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "raccoon_hurt"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> RACCOON_DEATH = REGISTRY.register(
      "raccoon_death", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "raccoon_death"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> BEAR_AMBIENT = REGISTRY.register(
      "bear_ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "bear_ambient"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> BEAR_DEATH = REGISTRY.register(
      "bear_death", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "bear_death"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> BEAR_HURT = REGISTRY.register(
      "bear_hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "bear_hurt"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> BUNNY_HURT = REGISTRY.register(
      "bunny_hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "bunny_hurt"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> BUNNY_DEATH = REGISTRY.register(
      "bunny_death", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "bunny_death"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> BUNNY_LIFT = REGISTRY.register(
      "bunny_lift", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "bunny_lift"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> DUCK_AMBIENT = REGISTRY.register(
      "duck_ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "duck_ambient"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> DUCK_HURT = REGISTRY.register(
      "duck_hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "duck_hurt"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> CROCODILE_AMBIENT = REGISTRY.register(
      "crocodile_ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "crocodile_ambient"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> CROCODILE_HURT = REGISTRY.register(
      "crocodile_hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "crocodile_hurt"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> CROCODILE_JAW_SNAP = REGISTRY.register(
      "crocodile_jaw_snap", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "crocodile_jaw_snap"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> CROCODILE_DEATH = REGISTRY.register(
      "crocodile_death", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "crocodile_death"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> RAT_AMBIENT = REGISTRY.register(
      "rat_ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "rat_ambient"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> RAT_HURT = REGISTRY.register(
      "rat_hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "rat_hurt"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> RAT_DEATH = REGISTRY.register(
      "rat_death", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "rat_death"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> MONEY = REGISTRY.register(
      "money", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "money"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> TURKEY_AMBIENT = REGISTRY.register(
      "turkey_ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "turkey_ambient"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> TURKEY_HURT = REGISTRY.register(
      "turkey_hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "turkey_hurt"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> ELEPHANT_AMBIENT = REGISTRY.register(
      "elephant_ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "elephant_ambient"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> ELEPHANT_HURT = REGISTRY.register(
      "elephant_hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "elephant_hurt"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> ELEPHANT_DEATH = REGISTRY.register(
      "elephant_death", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "elephant_death"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> OSTRICH_AMBIENT = REGISTRY.register(
      "ostrich_ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "ostrich_ambient"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> OSTRICH_HURT = REGISTRY.register(
      "ostrich_hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "ostrich_hurt"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> OSTRICH_DEATH = REGISTRY.register(
      "ostrich_death", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "ostrich_death"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> SILVER_SKELETON_ATTACK = REGISTRY.register(
      "silver_skeleton_attack", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "silver_skeleton_attack"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> SILVER_SKELETON_DEATH = REGISTRY.register(
      "silver_skeleton_death", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "silver_skeleton_death"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> SILVER_SKELETON_STEP = REGISTRY.register(
      "silver_skeleton_step", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "silver_skeleton_step"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> AMBIENT_BABY_OSTRICH = REGISTRY.register(
      "ambient_baby_ostrich", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "ambient_baby_ostrich"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> SCORPION_ATTACK = REGISTRY.register(
      "scorpion_attack", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "scorpion_attack"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> DEER_AMBIENT = REGISTRY.register(
      "deer_ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "deer_ambient"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> KITTY_BABY_AMBIENT = REGISTRY.register(
      "kitty_baby_ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "kitty_baby_ambient"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> KITTY_DEATH = REGISTRY.register(
      "kitty_death", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "kitty_death"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> KITTY_BABY_DEATH = REGISTRY.register(
      "kitty_baby_death", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "kitty_baby_death"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> KITTY_ANGRY = REGISTRY.register(
      "kitty_angry", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "kitty_angry"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> KITTY_BED_POUR_FOOD = REGISTRY.register(
      "kitty_bed_pour_food", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "kitty_bed_pour_food"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> KITTY_BED_POUR_MILK = REGISTRY.register(
      "kitty_bed_pour_milk", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "kitty_bed_pour_milk"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> KITTY_HURT = REGISTRY.register(
      "kitty_hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "kitty_hurt"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> KITTY_BABY_HURT = REGISTRY.register(
      "kitty_baby_hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "kitty_baby_hurt"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> OGRE_HURT = REGISTRY.register(
      "ogre_hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "ogre_hurt"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> OGRE_DEATH = REGISTRY.register(
      "ogre_death", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "ogre_death"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> SILVER_SKELETON_AMBIENT = REGISTRY.register(
      "silver_skeleton_ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "silver_skeleton_ambient"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> SILVER_SKELETON_HURT = REGISTRY.register(
      "silver_skeleton_hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "silver_skeleton_hurt"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> WRAITH_AMBIENT = REGISTRY.register(
      "wraith_ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "wraith_ambient"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> WRAITH_HURT = REGISTRY.register(
      "wraith_hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "wraith_hurt"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> WRAITH_DEATH = REGISTRY.register(
      "wraith_death", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "wraith_death"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> SCORPION_AMBIENT = REGISTRY.register(
      "scorpion_ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "scorpion_ambient"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> SCORPION_HURT = REGISTRY.register(
      "scorpion_hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "scorpion_hurt"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> SCORPION_DEATH = REGISTRY.register(
      "scorpion_death", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "scorpion_death"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> DEER_BABY_AMBIENT = REGISTRY.register(
      "deer_baby_ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "deer_baby_ambient"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> DEER_DEATH = REGISTRY.register(
      "deer_death", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "deer_death"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> DEER_HURT = REGISTRY.register(
      "deer_hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "deer_hurt"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> KITTY_AMBIENT = REGISTRY.register(
      "kitty_ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "kitty_ambient"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> SNAKE_HURT = REGISTRY.register(
      "snake_hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "snake_hurt"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> SNAKE_AMBIENT = REGISTRY.register(
      "snake_ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "snake_ambient"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> SNAKE_DEATH = REGISTRY.register(
      "snake_death", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "snake_death"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> BLUE_GROSBEAK_AMBIENT = REGISTRY.register(
      "blue_grosbeak_ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "blue_grosbeak_ambient"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> CANARY_AMBIENT = REGISTRY.register(
      "canary_ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "canary_ambient"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> CARDINAL_AMBIENT = REGISTRY.register(
      "cardinal_ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "cardinal_ambient"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> CROW_AMBIENT = REGISTRY.register(
      "crow_ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "crow_ambient"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> MOURNING_DOVE_AMBIENT = REGISTRY.register(
      "mourning_dove_ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "mourning_dove_ambient"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> PARROT_AMBIENT = REGISTRY.register(
      "parrot_ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "parrot_ambient"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> SMALL_BEE_AMBIENT = REGISTRY.register(
      "small_bee_ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "small_bee_ambient"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> SMALL_BEE_HURT = REGISTRY.register(
      "small_bee_hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "small_bee_hurt"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> OGRE_AMBIENT = REGISTRY.register(
      "ogre_ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "ogre_ambient"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> CRICKET_AMBIENT = REGISTRY.register(
      "cricket_ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "cricket_ambient"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> CRICKET_HURT = REGISTRY.register(
      "cricket_hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "cricket_hurt"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> DRAGONFLY_AMBIENT = REGISTRY.register(
      "dragonfly_ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "dragonfly_ambient"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> DRAGONFLY_HURT = REGISTRY.register(
      "dragonfly_hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "dragonfly_hurt"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> DRINK = REGISTRY.register(
      "drink", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "drink"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> FLAP = REGISTRY.register(
      "flap", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "flap"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> FLY_AMBIENT = REGISTRY.register(
      "fly_ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "fly_ambient"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> FLY_HURT = REGISTRY.register(
      "fly_hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "fly_hurt"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> GRASSHOPPER_HURT = REGISTRY.register(
      "grasshopper_hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "grasshopper_hurt"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> MINIGOLEM_HURT = REGISTRY.register(
      "minigolem_hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "minigolem_hurt"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> MINIGOLEM_DEATH = REGISTRY.register(
      "minigolem_death", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "minigolem_death"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> LION_AMBIENT = REGISTRY.register(
      "lion_ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "lion_ambient"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> LION_DEATH = REGISTRY.register(
      "lion_death", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "lion_death"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> LION_HURT = REGISTRY.register(
      "lion_hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "lion_hurt"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> STING = REGISTRY.register(
      "sting", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "sting"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> EAT = REGISTRY.register(
      "eat", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "eat"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> MOLE_AMBIENT = REGISTRY.register(
      "mole_ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "mole_ambient"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> MOLE_HURT = REGISTRY.register(
      "mole_hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "mole_hurt"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> MOLE_DEATH = REGISTRY.register(
      "mole_death", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "mole_death"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> MOUSE_AMBIENT = REGISTRY.register(
      "mouse_ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "mouse_ambient"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> MOUSE_HURT = REGISTRY.register(
      "mouse_hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "mouse_hurt"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> MOUSE_DEATH = REGISTRY.register(
      "mouse_death", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "mouse_death"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> GOAT_AMBIENT = REGISTRY.register(
      "goat_ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "goat_ambient"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> GOAT_BABY_AMBIENT = REGISTRY.register(
      "goat_baby_ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "goat_baby_ambient"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> GOAT_FEMALE_AMBIENT = REGISTRY.register(
      "goat_female_ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "goat_female_ambient"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> GOAT_HURT = REGISTRY.register(
      "goat_hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "goat_hurt"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> GOAT_EAT = REGISTRY.register(
      "goat_eat", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "goat_eat"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> GOAT_DIG = REGISTRY.register(
      "goat_dig", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "goat_dig"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> GOAT_DEATH = REGISTRY.register(
      "goat_death", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "goat_death"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> BIG_GOLEM_IDLE = REGISTRY.register(
      "big_golem_idle", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "big_golem_idle"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> BIG_GOLEM_HURT = REGISTRY.register(
      "big_golem_hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "big_golem_hurt"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> BIG_GOLEM_DEATH = REGISTRY.register(
      "big_golem_death", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "big_golem_death"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> BIG_GOLEM_STEP = REGISTRY.register(
      "big_golem_step", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "big_golem_step"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> WILD_WOLF_AMBIENT = REGISTRY.register(
      "wild_wolf_ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "wild_wolf_ambient"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> WILD_WOLD_HURT = REGISTRY.register(
      "wild_wold_hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "wild_wold_hurt"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> WILD_WOLD_DEATH = REGISTRY.register(
      "wild_wold_death", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "wild_wold_death"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> WEREWOLF_AMBIENT = REGISTRY.register(
      "werewolf_ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "werewolf_ambient"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> WEREWOLF_TRANSFORM = REGISTRY.register(
      "werewolf_transform", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "werewolf_transform"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> WEREWOLF_HURT = REGISTRY.register(
      "werewolf_hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "werewolf_hurt"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> WEREWOLF_DEATH = REGISTRY.register(
      "werewolf_death", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "werewolf_death"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> WEREHUMAN_HURT = REGISTRY.register(
      "werehuman_hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "werehuman_hurt"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> WEREHUMAN_DEATH = REGISTRY.register(
      "werehuman_death", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "werehuman_death"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> WYVERN_AMBIENT = REGISTRY.register(
      "wyvern_ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "wyvern_ambient"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> WYVERN_HURT = REGISTRY.register(
      "wyvern_hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "wyvern_hurt"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> WYVERN_DEATH = REGISTRY.register(
      "wyvern_death", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "wyvern_death"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> WYVERN_STEP = REGISTRY.register(
      "wyvern_step", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "wyvern_step"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> WYVERN_FLAP = REGISTRY.register(
      "wyvern_flap", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "wyvern_flap"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> WHIP = REGISTRY.register(
      "whip", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "whip"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> HORSE_AMBIENT = REGISTRY.register(
      "horse_ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "horse_ambient"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> HORSE_HURT = REGISTRY.register(
      "horse_hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "horse_hurt"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> HORSE_DEATH = REGISTRY.register(
      "horse_death", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "horse_death"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> HORSE_ANGRY = REGISTRY.register(
      "horse_angry", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "horse_angry"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> GHOST_HORSE_AMBIENT = REGISTRY.register(
      "ghost_horse_ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "ghost_horse_ambient"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> GHOST_HORSE_HURT = REGISTRY.register(
      "ghost_horse_hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "ghost_horse_hurt"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> GHOST_HORSE_DEATH = REGISTRY.register(
      "ghost_horse_death", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "ghost_horse_death"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> GHOST_HORSE_ANGRY = REGISTRY.register(
      "ghost_horse_angry", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "ghost_horse_angry"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> UNDEAD_HORSE_AMBIENT = REGISTRY.register(
      "undead_horse_ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "undead_horse_ambient"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> UNDEAD_HORSE_HURT = REGISTRY.register(
      "undead_horse_hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "undead_horse_hurt"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> UNDEAD_HORSE_DEATH = REGISTRY.register(
      "undead_horse_death", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "undead_horse_death"))
   );
   public static final DeferredHolder<SoundEvent, SoundEvent> UNDEAD_HORSE_ANGRY = REGISTRY.register(
      "undead_horse_angry", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mocreatures", "undead_horse_angry"))
   );
}
