package net.mocreatures.entity.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.entity.MiniGolemEntity;
import software.bernie.geckolib.model.GeoModel;

public class MiniGolemModel extends GeoModel<MiniGolemEntity> {
   public ResourceLocation getAnimationResource(MiniGolemEntity entity) {
      return ResourceLocation.parse("mocreatures:animations/minigolem.animation.json");
   }

   public ResourceLocation getModelResource(MiniGolemEntity entity) {
      return ResourceLocation.parse("mocreatures:geo/minigolem.geo.json");
   }

   public ResourceLocation getTextureResource(MiniGolemEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/" + entity.getTexture() + ".png");
   }
}
