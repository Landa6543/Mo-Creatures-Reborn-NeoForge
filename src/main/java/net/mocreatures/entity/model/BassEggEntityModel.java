package net.mocreatures.entity.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.entity.BassEggEntityEntity;
import software.bernie.geckolib.model.GeoModel;

public class BassEggEntityModel extends GeoModel<BassEggEntityEntity> {
   public ResourceLocation getAnimationResource(BassEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:animations/egg.animation.json");
   }

   public ResourceLocation getModelResource(BassEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:geo/egg.geo.json");
   }

   public ResourceLocation getTextureResource(BassEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/" + entity.getTexture() + ".png");
   }
}
