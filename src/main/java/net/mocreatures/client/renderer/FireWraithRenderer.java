package net.mocreatures.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.resources.ResourceLocation;
import net.mocreatures.client.model.Modelwraith;
import net.mocreatures.client.model.animations.wraithAnimation;
import net.mocreatures.entity.FireWraithEntity;

public class FireWraithRenderer extends MobRenderer<FireWraithEntity, Modelwraith<FireWraithEntity>> {
   public FireWraithRenderer(Context context) {
      super(context, new FireWraithRenderer.AnimatedModel(context.bakeLayer(Modelwraith.LAYER_LOCATION)), 0.5F);
      this.addLayer(
         new RenderLayer<FireWraithEntity, Modelwraith<FireWraithEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/wraith_glow.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               FireWraithEntity entity,
               float limbSwing,
               float limbSwingAmount,
               float partialTicks,
               float ageInTicks,
               float netHeadYaw,
               float headPitch
            ) {
               VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(this.LAYER_TEXTURE));
               ((Modelwraith)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
            }
         }
      );
   }

   public ResourceLocation getTextureLocation(FireWraithEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/wraith_flame.png");
   }

   private static final class AnimatedModel extends Modelwraith<FireWraithEntity> {
      private final ModelPart root;
      private final HierarchicalModel animator = new HierarchicalModel<FireWraithEntity>() {
         public ModelPart root() {
            return AnimatedModel.this.root;
         }

         public void setupAnim(FireWraithEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.root().getAllParts().forEach(ModelPart::resetPose);
            this.animate(entity.animationState0, wraithAnimation.idle, ageInTicks, 1.0F);
         }
      };

      public AnimatedModel(ModelPart root) {
         super(root);
         this.root = root;
      }

      public void setupAnim(FireWraithEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
         this.animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
         super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
      }
   }
}
