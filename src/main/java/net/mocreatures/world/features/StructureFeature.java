package net.mocreatures.world.features;

import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockIgnoreProcessor;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplateManager;
import net.mocreatures.world.features.configurations.StructureFeatureConfiguration;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class StructureFeature extends Feature<StructureFeatureConfiguration> {
   public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(Registries.FEATURE, "mocreatures");
   public static final DeferredHolder<Feature<?>, StructureFeature> STRUCTURE_FEATURE = REGISTRY.register(
      "structure_feature", () -> new StructureFeature(StructureFeatureConfiguration.CODEC)
   );

   public StructureFeature(Codec<StructureFeatureConfiguration> codec) {
      super(codec);
   }

   public boolean place(FeaturePlaceContext<StructureFeatureConfiguration> context) {
      RandomSource random = context.random();
      WorldGenLevel worldGenLevel = context.level();
      StructureFeatureConfiguration config = (StructureFeatureConfiguration)context.config();
      Rotation rotation = config.randomRotation() ? Rotation.getRandom(random) : Rotation.NONE;
      Mirror mirror = config.randomMirror() ? Mirror.values()[random.nextInt(2)] : Mirror.NONE;
      BlockPos placePos = context.origin().offset(config.offset());
      StructureTemplateManager structureManager = worldGenLevel.getLevel().getServer().getStructureManager();
      StructureTemplate template = structureManager.getOrCreate(config.structure());
      StructurePlaceSettings placeSettings = new StructurePlaceSettings()
         .setRotation(rotation)
         .setMirror(mirror)
         .setRotationPivot(new BlockPos(-config.offset().getX(), 0, -config.offset().getZ()))
         .setRandom(random)
         .setIgnoreEntities(false)
         .addProcessor(new BlockIgnoreProcessor(config.ignoredBlocks().stream().map(Holder::value).toList()));
      template.placeInWorld(worldGenLevel, placePos, placePos, placeSettings, random, 4);
      return true;
   }
}
