package net.mocreatures.entity.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.entity.UndeadScorpionEntity;
import software.bernie.geckolib.model.GeoModel;

public class UndeadScorpionModel extends GeoModel<UndeadScorpionEntity> {
   public ResourceLocation getAnimationResource(UndeadScorpionEntity entity) {
      return ResourceLocation.parse("mocreatures:animations/scorpion.animation.json");
   }

   public ResourceLocation getModelResource(UndeadScorpionEntity entity) {
      return ResourceLocation.parse("mocreatures:geo/scorpion.geo.json");
   }

   public ResourceLocation getTextureResource(UndeadScorpionEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/" + entity.getTexture() + ".png");
   }
}
