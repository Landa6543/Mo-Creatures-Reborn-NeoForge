package net.mocreatures.entity.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.entity.ButterflyEntity;
import software.bernie.geckolib.model.GeoModel;

public class ButterflyModel extends GeoModel<ButterflyEntity> {
   public ResourceLocation getAnimationResource(ButterflyEntity entity) {
      return ResourceLocation.parse("mocreatures:animations/butterfly.animation.json");
   }

   public ResourceLocation getModelResource(ButterflyEntity entity) {
      return ResourceLocation.parse("mocreatures:geo/butterfly.geo.json");
   }

   public ResourceLocation getTextureResource(ButterflyEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/" + entity.getTexture() + ".png");
   }
}
