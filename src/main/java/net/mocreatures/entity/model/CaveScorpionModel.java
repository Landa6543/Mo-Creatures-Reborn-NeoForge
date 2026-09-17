package net.mocreatures.entity.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.entity.CaveScorpionEntity;
import software.bernie.geckolib.model.GeoModel;

public class CaveScorpionModel extends GeoModel<CaveScorpionEntity> {
   public ResourceLocation getAnimationResource(CaveScorpionEntity entity) {
      return ResourceLocation.parse("mocreatures:animations/scorpion.animation.json");
   }

   public ResourceLocation getModelResource(CaveScorpionEntity entity) {
      return ResourceLocation.parse("mocreatures:geo/scorpion.geo.json");
   }

   public ResourceLocation getTextureResource(CaveScorpionEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/" + entity.getTexture() + ".png");
   }
}
