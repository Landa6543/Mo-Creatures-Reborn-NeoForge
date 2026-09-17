package net.mocreatures.entity.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.entity.DirtScorpionEntity;
import software.bernie.geckolib.model.GeoModel;

public class DirtScorpionModel extends GeoModel<DirtScorpionEntity> {
   public ResourceLocation getAnimationResource(DirtScorpionEntity entity) {
      return ResourceLocation.parse("mocreatures:animations/scorpion.animation.json");
   }

   public ResourceLocation getModelResource(DirtScorpionEntity entity) {
      return ResourceLocation.parse("mocreatures:geo/scorpion.geo.json");
   }

   public ResourceLocation getTextureResource(DirtScorpionEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/" + entity.getTexture() + ".png");
   }
}
