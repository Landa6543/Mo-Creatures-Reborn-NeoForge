package net.mocreatures.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.resources.ResourceLocation;
import net.mocreatures.client.model.Modeldeer;
import net.mocreatures.client.model.animations.deerAnimation;
import net.mocreatures.entity.DeerDoeEntity;

public class DeerDoeRenderer extends MobRenderer<DeerDoeEntity, Modeldeer<DeerDoeEntity>> {
   public DeerDoeRenderer(Context context) {
      super(context, new DeerDoeRenderer.AnimatedModel(context.bakeLayer(Modeldeer.LAYER_LOCATION)), 0.5F);
   }

   protected void scale(DeerDoeEntity entity, PoseStack poseStack, float f) {
      poseStack.scale(1.1F, 1.1F, 1.1F);
   }

   public ResourceLocation getTextureLocation(DeerDoeEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/deer_doe.png");
   }

   private static final class AnimatedModel extends Modeldeer<DeerDoeEntity> {
      private final ModelPart root;
      private final HierarchicalModel animator = new HierarchicalModel<DeerDoeEntity>() {
         public ModelPart root() {
            return AnimatedModel.this.root;
         }

         public void setupAnim(DeerDoeEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.root().getAllParts().forEach(ModelPart::resetPose);
            this.animateWalk(deerAnimation.walk, limbSwing, limbSwingAmount, 1.0F, 1.0F);
            this.animate(entity.animationState1, deerAnimation.idle, ageInTicks, 1.0F);
         }
      };

      public AnimatedModel(ModelPart root) {
         super(root);
         this.root = root;
      }

      public void setupAnim(DeerDoeEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
         this.animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
         super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
      }
   }
}
