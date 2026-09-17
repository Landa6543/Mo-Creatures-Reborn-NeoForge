package net.mocreatures.entity.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.entity.SilverSkeletonEntity;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class SilverSkeletonModel extends GeoModel<SilverSkeletonEntity> {
   public ResourceLocation getAnimationResource(SilverSkeletonEntity entity) {
      return ResourceLocation.parse("mocreatures:animations/silverskeleton.animation.json");
   }

   public ResourceLocation getModelResource(SilverSkeletonEntity entity) {
      return ResourceLocation.parse("mocreatures:geo/silverskeleton.geo.json");
   }

   public ResourceLocation getTextureResource(SilverSkeletonEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/" + entity.getTexture() + ".png");
   }

   public void setCustomAnimations(SilverSkeletonEntity animatable, long instanceId, AnimationState animationState) {
      GeoBone head = this.getAnimationProcessor().getBone("Head");
      if (head != null) {
         EntityModelData entityData = (EntityModelData)animationState.getData(DataTickets.ENTITY_MODEL_DATA);
         head.setRotX(entityData.headPitch() * (float) (Math.PI / 180.0));
         head.setRotY(entityData.netHeadYaw() * (float) (Math.PI / 180.0));
      }
   }
}
