package net.mocreatures.entity.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.entity.TurkeyEntity;
import software.bernie.geckolib.model.GeoModel;

public class TurkeyModel extends GeoModel<TurkeyEntity> {
   public ResourceLocation getAnimationResource(TurkeyEntity entity) {
      return ResourceLocation.parse("mocreatures:animations/turkey.animation.json");
   }

   public ResourceLocation getModelResource(TurkeyEntity entity) {
      return ResourceLocation.parse("mocreatures:geo/turkey.geo.json");
   }

   public ResourceLocation getTextureResource(TurkeyEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/" + entity.getTexture() + ".png");
   }
}
