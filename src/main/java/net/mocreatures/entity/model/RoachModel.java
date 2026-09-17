package net.mocreatures.entity.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.entity.RoachEntity;
import software.bernie.geckolib.model.GeoModel;

public class RoachModel extends GeoModel<RoachEntity> {
   public ResourceLocation getAnimationResource(RoachEntity entity) {
      return ResourceLocation.parse("mocreatures:animations/roach.animation.json");
   }

   public ResourceLocation getModelResource(RoachEntity entity) {
      return ResourceLocation.parse("mocreatures:geo/roach.geo.json");
   }

   public ResourceLocation getTextureResource(RoachEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/" + entity.getTexture() + ".png");
   }
}
