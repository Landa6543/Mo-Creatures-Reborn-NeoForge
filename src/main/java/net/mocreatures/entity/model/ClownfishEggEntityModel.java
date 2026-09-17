package net.mocreatures.entity.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.entity.ClownfishEggEntityEntity;
import software.bernie.geckolib.model.GeoModel;

public class ClownfishEggEntityModel extends GeoModel<ClownfishEggEntityEntity> {
   public ResourceLocation getAnimationResource(ClownfishEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:animations/egg.animation.json");
   }

   public ResourceLocation getModelResource(ClownfishEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:geo/egg.geo.json");
   }

   public ResourceLocation getTextureResource(ClownfishEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/" + entity.getTexture() + ".png");
   }
}
