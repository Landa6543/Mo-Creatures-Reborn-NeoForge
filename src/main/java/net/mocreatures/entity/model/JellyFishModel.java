package net.mocreatures.entity.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.entity.JellyFishEntity;
import software.bernie.geckolib.model.GeoModel;

public class JellyFishModel extends GeoModel<JellyFishEntity> {
   public ResourceLocation getAnimationResource(JellyFishEntity entity) {
      return ResourceLocation.parse("mocreatures:animations/jellyfish.animation.json");
   }

   public ResourceLocation getModelResource(JellyFishEntity entity) {
      return ResourceLocation.parse("mocreatures:geo/jellyfish.geo.json");
   }

   public ResourceLocation getTextureResource(JellyFishEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/" + entity.getTexture() + ".png");
   }
}
