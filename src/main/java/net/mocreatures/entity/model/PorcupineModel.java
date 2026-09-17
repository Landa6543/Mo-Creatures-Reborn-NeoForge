package net.mocreatures.entity.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.entity.PorcupineEntity;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class PorcupineModel extends GeoModel<PorcupineEntity> {
   public ResourceLocation getAnimationResource(PorcupineEntity entity) {
      return ResourceLocation.parse("mocreatures:animations/porcupine.animation.json");
   }

   public ResourceLocation getModelResource(PorcupineEntity entity) {
      return ResourceLocation.parse("mocreatures:geo/porcupine.geo.json");
   }

   public ResourceLocation getTextureResource(PorcupineEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/" + entity.getTexture() + ".png");
   }

   public void setCustomAnimations(PorcupineEntity animatable, long instanceId, AnimationState animationState) {
      GeoBone head = this.getAnimationProcessor().getBone("Head");
      if (head != null) {
         EntityModelData entityData = (EntityModelData)animationState.getData(DataTickets.ENTITY_MODEL_DATA);
         head.setRotX(entityData.headPitch() * (float) (Math.PI / 180.0));
         head.setRotY(entityData.netHeadYaw() * (float) (Math.PI / 180.0));
      }
   }
}
