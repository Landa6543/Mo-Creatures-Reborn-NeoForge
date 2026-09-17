package net.mocreatures.entity.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.entity.OstrichEggEntityEntity;
import software.bernie.geckolib.model.GeoModel;

public class OstrichEggEntityModel extends GeoModel<OstrichEggEntityEntity> {
   public ResourceLocation getAnimationResource(OstrichEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:animations/egg.animation.json");
   }

   public ResourceLocation getModelResource(OstrichEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:geo/egg.geo.json");
   }

   public ResourceLocation getTextureResource(OstrichEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/" + entity.getTexture() + ".png");
   }
}
