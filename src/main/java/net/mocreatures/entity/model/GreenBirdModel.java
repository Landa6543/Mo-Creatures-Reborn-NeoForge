package net.mocreatures.entity.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.entity.GreenBirdEntity;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class GreenBirdModel extends GeoModel<GreenBirdEntity> {
   public ResourceLocation getAnimationResource(GreenBirdEntity entity) {
      return ResourceLocation.parse("mocreatures:animations/bird.animation.json");
   }

   public ResourceLocation getModelResource(GreenBirdEntity entity) {
      return ResourceLocation.parse("mocreatures:geo/bird.geo.json");
   }

   public ResourceLocation getTextureResource(GreenBirdEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/" + entity.getTexture() + ".png");
   }

   public void setCustomAnimations(GreenBirdEntity animatable, long instanceId, AnimationState animationState) {
      GeoBone head = this.getAnimationProcessor().getBone("Head");
      if (head != null) {
         EntityModelData entityData = (EntityModelData)animationState.getData(DataTickets.ENTITY_MODEL_DATA);
         head.setRotX(entityData.headPitch() * (float) (Math.PI / 180.0));
         head.setRotY(entityData.netHeadYaw() * (float) (Math.PI / 180.0));
      }
   }
}
