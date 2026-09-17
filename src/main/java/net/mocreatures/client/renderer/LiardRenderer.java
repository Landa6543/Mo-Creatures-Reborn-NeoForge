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
import net.minecraft.world.level.Level;
import net.mocreatures.client.model.ModelBigCat;
import net.mocreatures.client.model.animations.BigCatAnimation;
import net.mocreatures.client.model.animations.ManticoreAnimation;
import net.mocreatures.entity.LiardEntity;
import net.mocreatures.procedures.LiardChestDisplayConditionProcedure;
import net.mocreatures.procedures.LiardMedallionDisplayConditionProcedure;
import net.mocreatures.procedures.LiardSaddleDisplayConditionProcedure;

public class LiardRenderer extends MobRenderer<LiardEntity, ModelBigCat<LiardEntity>> {
   public LiardRenderer(Context context) {
      super(context, new LiardRenderer.AnimatedModel(context.bakeLayer(ModelBigCat.LAYER_LOCATION)), 0.5F);
      this.addLayer(
         new RenderLayer<LiardEntity, ModelBigCat<LiardEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/big_cat_chest_light.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               LiardEntity entity,
               float limbSwing,
               float limbSwingAmount,
               float partialTicks,
               float ageInTicks,
               float netHeadYaw,
               float headPitch
            ) {
               Level world = entity.level();
               double x = entity.getX();
               double y = entity.getY();
               double z = entity.getZ();
               if (LiardChestDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((ModelBigCat)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<LiardEntity, ModelBigCat<LiardEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/big_cat_saddle_light.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               LiardEntity entity,
               float limbSwing,
               float limbSwingAmount,
               float partialTicks,
               float ageInTicks,
               float netHeadYaw,
               float headPitch
            ) {
               Level world = entity.level();
               double x = entity.getX();
               double y = entity.getY();
               double z = entity.getZ();
               if (LiardSaddleDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((ModelBigCat)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<LiardEntity, ModelBigCat<LiardEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/big_cat_medallion_light.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               LiardEntity entity,
               float limbSwing,
               float limbSwingAmount,
               float partialTicks,
               float ageInTicks,
               float netHeadYaw,
               float headPitch
            ) {
               Level world = entity.level();
               double x = entity.getX();
               double y = entity.getY();
               double z = entity.getZ();
               if (LiardMedallionDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((ModelBigCat)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
   }

   public ResourceLocation getTextureLocation(LiardEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/big_cat_liard.png");
   }

   private static final class AnimatedModel extends ModelBigCat<LiardEntity> {
      private final ModelPart root;
      private final HierarchicalModel animator = new HierarchicalModel<LiardEntity>() {
         public ModelPart root() {
            return AnimatedModel.this.root;
         }

         public void setupAnim(LiardEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.root().getAllParts().forEach(ModelPart::resetPose);
            this.animateWalk(BigCatAnimation.walk2, limbSwing, limbSwingAmount, 1.0F, 1.0F);
            this.animate(entity.animationState1, ManticoreAnimation.flight, ageInTicks, 1.0F);
            this.animate(entity.animationState2, ManticoreAnimation.idle, ageInTicks, 1.0F);
         }
      };

      public AnimatedModel(ModelPart root) {
         super(root);
         this.root = root;
      }

      public void setupAnim(LiardEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
         this.animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
         super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
      }
   }
}
