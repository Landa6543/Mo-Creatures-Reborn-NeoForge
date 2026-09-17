package net.mocreatures.entity.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.entity.BlackWerewolfEntity;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class BlackWerewolfModel extends GeoModel<BlackWerewolfEntity> {
   public ResourceLocation getAnimationResource(BlackWerewolfEntity entity) {
      return ResourceLocation.parse("mocreatures:animations/werewolf.animation.json");
   }

   public ResourceLocation getModelResource(BlackWerewolfEntity entity) {
      return ResourceLocation.parse("mocreatures:geo/werewolf.geo.json");
   }

   public ResourceLocation getTextureResource(BlackWerewolfEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/" + entity.getTexture() + ".png");
   }

   public void setCustomAnimations(BlackWerewolfEntity animatable, long instanceId, AnimationState animationState) {
      GeoBone head = this.getAnimationProcessor().getBone("MainHead");
      if (head != null) {
         EntityModelData entityData = (EntityModelData)animationState.getData(DataTickets.ENTITY_MODEL_DATA);
         head.setRotX(entityData.headPitch() * (float) (Math.PI / 180.0));
         head.setRotY(entityData.netHeadYaw() * (float) (Math.PI / 180.0));
      }
   }
}
