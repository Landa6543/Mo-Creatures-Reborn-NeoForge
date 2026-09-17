package net.mocreatures.entity.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.entity.MoleEntity;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class MoleModel extends GeoModel<MoleEntity> {
   public ResourceLocation getAnimationResource(MoleEntity entity) {
      return ResourceLocation.parse("mocreatures:animations/mole.animation.json");
   }

   public ResourceLocation getModelResource(MoleEntity entity) {
      return ResourceLocation.parse("mocreatures:geo/mole.geo.json");
   }

   public ResourceLocation getTextureResource(MoleEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/" + entity.getTexture() + ".png");
   }

   public void setCustomAnimations(MoleEntity animatable, long instanceId, AnimationState animationState) {
      GeoBone head = this.getAnimationProcessor().getBone("Head");
      if (head != null) {
         EntityModelData entityData = (EntityModelData)animationState.getData(DataTickets.ENTITY_MODEL_DATA);
         head.setRotX(entityData.headPitch() * (float) (Math.PI / 180.0));
         head.setRotY(entityData.netHeadYaw() * (float) (Math.PI / 180.0));
      }
   }
}
