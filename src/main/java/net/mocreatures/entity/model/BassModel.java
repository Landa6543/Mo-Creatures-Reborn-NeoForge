package net.mocreatures.entity.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.entity.BassEntity;
import software.bernie.geckolib.model.GeoModel;

public class BassModel extends GeoModel<BassEntity> {
   public ResourceLocation getAnimationResource(BassEntity entity) {
      return ResourceLocation.parse("mocreatures:animations/mediumfish.animation.json");
   }

   public ResourceLocation getModelResource(BassEntity entity) {
      return ResourceLocation.parse("mocreatures:geo/mediumfish.geo.json");
   }

   public ResourceLocation getTextureResource(BassEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/" + entity.getTexture() + ".png");
   }
}
