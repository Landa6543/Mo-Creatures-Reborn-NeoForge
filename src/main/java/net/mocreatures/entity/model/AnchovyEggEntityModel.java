package net.mocreatures.entity.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.entity.AnchovyEggEntityEntity;
import software.bernie.geckolib.model.GeoModel;

public class AnchovyEggEntityModel extends GeoModel<AnchovyEggEntityEntity> {
   public ResourceLocation getAnimationResource(AnchovyEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:animations/egg.animation.json");
   }

   public ResourceLocation getModelResource(AnchovyEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:geo/egg.geo.json");
   }

   public ResourceLocation getTextureResource(AnchovyEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/" + entity.getTexture() + ".png");
   }
}
