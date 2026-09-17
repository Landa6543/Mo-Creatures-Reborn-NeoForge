package net.mocreatures.entity.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.entity.PiranhaEggEntityEntity;
import software.bernie.geckolib.model.GeoModel;

public class PiranhaEggEntityModel extends GeoModel<PiranhaEggEntityEntity> {
   public ResourceLocation getAnimationResource(PiranhaEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:animations/egg.animation.json");
   }

   public ResourceLocation getModelResource(PiranhaEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:geo/egg.geo.json");
   }

   public ResourceLocation getTextureResource(PiranhaEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/" + entity.getTexture() + ".png");
   }
}
