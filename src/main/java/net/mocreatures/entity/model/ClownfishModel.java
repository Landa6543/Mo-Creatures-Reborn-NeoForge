package net.mocreatures.entity.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.entity.ClownfishEntity;
import software.bernie.geckolib.model.GeoModel;

public class ClownfishModel extends GeoModel<ClownfishEntity> {
   public ResourceLocation getAnimationResource(ClownfishEntity entity) {
      return ResourceLocation.parse("mocreatures:animations/smallfish.animation.json");
   }

   public ResourceLocation getModelResource(ClownfishEntity entity) {
      return ResourceLocation.parse("mocreatures:geo/smallfish.geo.json");
   }

   public ResourceLocation getTextureResource(ClownfishEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/" + entity.getTexture() + ".png");
   }
}
