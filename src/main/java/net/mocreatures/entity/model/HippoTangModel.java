package net.mocreatures.entity.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.entity.HippoTangEntity;
import software.bernie.geckolib.model.GeoModel;

public class HippoTangModel extends GeoModel<HippoTangEntity> {
   public ResourceLocation getAnimationResource(HippoTangEntity entity) {
      return ResourceLocation.parse("mocreatures:animations/smallfish.animation.json");
   }

   public ResourceLocation getModelResource(HippoTangEntity entity) {
      return ResourceLocation.parse("mocreatures:geo/smallfish.geo.json");
   }

   public ResourceLocation getTextureResource(HippoTangEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/" + entity.getTexture() + ".png");
   }
}
