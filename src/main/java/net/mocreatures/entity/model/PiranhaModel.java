package net.mocreatures.entity.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.entity.PiranhaEntity;
import software.bernie.geckolib.model.GeoModel;

public class PiranhaModel extends GeoModel<PiranhaEntity> {
   public ResourceLocation getAnimationResource(PiranhaEntity entity) {
      return ResourceLocation.parse("mocreatures:animations/smallfish.animation.json");
   }

   public ResourceLocation getModelResource(PiranhaEntity entity) {
      return ResourceLocation.parse("mocreatures:geo/smallfish.geo.json");
   }

   public ResourceLocation getTextureResource(PiranhaEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/" + entity.getTexture() + ".png");
   }
}
