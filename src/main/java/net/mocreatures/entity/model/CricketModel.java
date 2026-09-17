package net.mocreatures.entity.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.entity.CricketEntity;
import software.bernie.geckolib.model.GeoModel;

public class CricketModel extends GeoModel<CricketEntity> {
   public ResourceLocation getAnimationResource(CricketEntity entity) {
      return ResourceLocation.parse("mocreatures:animations/cricket.animation.json");
   }

   public ResourceLocation getModelResource(CricketEntity entity) {
      return ResourceLocation.parse("mocreatures:geo/cricket.geo.json");
   }

   public ResourceLocation getTextureResource(CricketEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/" + entity.getTexture() + ".png");
   }
}
