package net.mocreatures.entity.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.entity.GoldFishEggEntityEntity;
import software.bernie.geckolib.model.GeoModel;

public class GoldFishEggEntityModel extends GeoModel<GoldFishEggEntityEntity> {
   public ResourceLocation getAnimationResource(GoldFishEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:animations/egg.animation.json");
   }

   public ResourceLocation getModelResource(GoldFishEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:geo/egg.geo.json");
   }

   public ResourceLocation getTextureResource(GoldFishEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/" + entity.getTexture() + ".png");
   }
}
