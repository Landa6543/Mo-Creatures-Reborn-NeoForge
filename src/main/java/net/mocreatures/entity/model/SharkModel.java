package net.mocreatures.entity.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.entity.SharkEntity;
import software.bernie.geckolib.model.GeoModel;

public class SharkModel extends GeoModel<SharkEntity> {
   public ResourceLocation getAnimationResource(SharkEntity entity) {
      return ResourceLocation.parse("mocreatures:animations/shark.animation.json");
   }

   public ResourceLocation getModelResource(SharkEntity entity) {
      return ResourceLocation.parse("mocreatures:geo/shark.geo.json");
   }

   public ResourceLocation getTextureResource(SharkEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/" + entity.getTexture() + ".png");
   }
}
