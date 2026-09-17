package net.mocreatures.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.resources.ResourceLocation;
import net.mocreatures.client.model.ModelRay;
import net.mocreatures.client.model.animations.RayAnimation;
import net.mocreatures.entity.StingRayEntity;

public class StingRayRenderer extends MobRenderer<StingRayEntity, ModelRay<StingRayEntity>> {
   public StingRayRenderer(Context context) {
      super(context, new StingRayRenderer.AnimatedModel(context.bakeLayer(ModelRay.LAYER_LOCATION)), 0.5F);
   }

   protected void scale(StingRayEntity entity, PoseStack poseStack, float f) {
      poseStack.scale(0.5F, 0.5F, 0.5F);
   }

   public ResourceLocation getTextureLocation(StingRayEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/ray_sting.png");
   }

   private static final class AnimatedModel extends ModelRay<StingRayEntity> {
      private final ModelPart root;
      private final HierarchicalModel animator = new HierarchicalModel<StingRayEntity>() {
         public ModelPart root() {
            return AnimatedModel.this.root;
         }

         public void setupAnim(StingRayEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.root().getAllParts().forEach(ModelPart::resetPose);
            this.animate(entity.animationState0, RayAnimation.walk, ageInTicks, 1.0F);
         }
      };

      public AnimatedModel(ModelPart root) {
         super(root);
         this.root = root;
      }

      public void setupAnim(StingRayEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
         this.animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
         super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
      }
   }
}
