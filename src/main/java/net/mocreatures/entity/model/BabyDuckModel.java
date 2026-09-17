package net.mocreatures.entity.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.entity.BabyDuckEntity;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class BabyDuckModel extends GeoModel<BabyDuckEntity> {
   public ResourceLocation getAnimationResource(BabyDuckEntity entity) {
      return ResourceLocation.parse("mocreatures:animations/babyduck.animation.json");
   }

   public ResourceLocation getModelResource(BabyDuckEntity entity) {
      return ResourceLocation.parse("mocreatures:geo/babyduck.geo.json");
   }

   public ResourceLocation getTextureResource(BabyDuckEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/" + entity.getTexture() + ".png");
   }

   public void setCustomAnimations(BabyDuckEntity animatable, long instanceId, AnimationState animationState) {
      GeoBone head = this.getAnimationProcessor().getBone("head");
      if (head != null) {
         EntityModelData entityData = (EntityModelData)animationState.getData(DataTickets.ENTITY_MODEL_DATA);
         head.setRotX(entityData.headPitch() * (float) (Math.PI / 180.0));
         head.setRotY(entityData.netHeadYaw() * (float) (Math.PI / 180.0));
      }
   }
}
