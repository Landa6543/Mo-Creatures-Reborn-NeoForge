package net.mocreatures.entity.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.entity.CaveScorpionEggEntityEntity;
import software.bernie.geckolib.model.GeoModel;

public class CaveScorpionEggEntityModel extends GeoModel<CaveScorpionEggEntityEntity> {
   public ResourceLocation getAnimationResource(CaveScorpionEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:animations/egg.animation.json");
   }

   public ResourceLocation getModelResource(CaveScorpionEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:geo/egg.geo.json");
   }

   public ResourceLocation getTextureResource(CaveScorpionEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/" + entity.getTexture() + ".png");
   }
}
