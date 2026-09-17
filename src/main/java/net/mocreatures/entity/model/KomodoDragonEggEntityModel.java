package net.mocreatures.entity.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.entity.KomodoDragonEggEntityEntity;
import software.bernie.geckolib.model.GeoModel;

public class KomodoDragonEggEntityModel extends GeoModel<KomodoDragonEggEntityEntity> {
   public ResourceLocation getAnimationResource(KomodoDragonEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:animations/egg.animation.json");
   }

   public ResourceLocation getModelResource(KomodoDragonEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:geo/egg.geo.json");
   }

   public ResourceLocation getTextureResource(KomodoDragonEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/" + entity.getTexture() + ".png");
   }
}
