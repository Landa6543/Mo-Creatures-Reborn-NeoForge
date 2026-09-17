package net.mocreatures.entity.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.entity.DragonflyEntity;
import software.bernie.geckolib.model.GeoModel;

public class DragonflyModel extends GeoModel<DragonflyEntity> {
   public ResourceLocation getAnimationResource(DragonflyEntity entity) {
      return ResourceLocation.parse("mocreatures:animations/dragonfly.animation.json");
   }

   public ResourceLocation getModelResource(DragonflyEntity entity) {
      return ResourceLocation.parse("mocreatures:geo/dragonfly.geo.json");
   }

   public ResourceLocation getTextureResource(DragonflyEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/" + entity.getTexture() + ".png");
   }
}
