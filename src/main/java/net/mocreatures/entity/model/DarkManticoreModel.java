package net.mocreatures.entity.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.entity.DarkManticoreEntity;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class DarkManticoreModel extends GeoModel<DarkManticoreEntity> {
   public ResourceLocation getAnimationResource(DarkManticoreEntity var1) {
      return ResourceLocation.parse("mocreatures:animations/manticore.animation.json");
   }

   public ResourceLocation getModelResource(DarkManticoreEntity var1) {
      return ResourceLocation.parse("mocreatures:geo/manticore.geo.json");
   }

   public ResourceLocation getTextureResource(DarkManticoreEntity var1) {
      return ResourceLocation.parse("mocreatures:textures/entities/" + var1.getTexture() + ".png");
   }

   public void setCustomAnimations(DarkManticoreEntity var1, long var2, AnimationState var4) {
      EntityModelData var5 = (EntityModelData)var4.getData(DataTickets.ENTITY_MODEL_DATA);
      if (var5 != null) {
         float var6 = var5.headPitch() * (float) (Math.PI / 180.0);
         float var7 = var5.netHeadYaw() * (float) (Math.PI / 180.0);
         GeoBone var8 = this.getAnimationProcessor().getBone("NeckBase");
         GeoBone var9 = this.getAnimationProcessor().getBone("HeadBack");
         GeoBone var10 = this.getAnimationProcessor().getBone("Head");
         if (var8 != null) {
            var8.setRotX(var6 * 0.35F);
            var8.setRotY(var7 * 0.35F);
         }

         if (var9 != null) {
            var9.setRotX(var6 * 0.65F);
            var9.setRotY(var7 * 0.65F);
         }

         if (var10 != null) {
            var10.setRotX(0.0F);
            var10.setRotY(0.0F);
         }
      }
   }
}
