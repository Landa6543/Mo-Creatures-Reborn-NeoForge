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
import net.mocreatures.entity.TigerEntity;
import net.mocreatures.procedures.TigerChestDisplayConditionProcedure;
import net.mocreatures.procedures.TigerMedallionDisplayConditionProcedure;
import net.mocreatures.procedures.TigerOrangeDisplayConditionProcedure;
import net.mocreatures.procedures.TigerSaddleDisplayConditionProcedure;
import net.mocreatures.procedures.TigerWhiteDisplayConditionProcedure;
import net.mocreatures.procedures.WhiteTigerWingsDisplayConditionProcedure;

public class TigerRenderer extends MobRenderer<TigerEntity, ModelBigCat<TigerEntity>> {
   public TigerRenderer(Context context) {
      super(context, new TigerRenderer.AnimatedModel(context.bakeLayer(ModelBigCat.LAYER_LOCATION)), 0.5F);
      this.addLayer(
         new RenderLayer<TigerEntity, ModelBigCat<TigerEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/big_cat_tiger.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               TigerEntity entity,
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
               if (TigerOrangeDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((ModelBigCat)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<TigerEntity, ModelBigCat<TigerEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/big_cat_white_tiger.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               TigerEntity entity,
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
               if (TigerWhiteDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((ModelBigCat)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<TigerEntity, ModelBigCat<TigerEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/big_cat_chest.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               TigerEntity entity,
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
               if (TigerChestDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((ModelBigCat)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<TigerEntity, ModelBigCat<TigerEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/big_cat_saddle.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               TigerEntity entity,
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
               if (TigerSaddleDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((ModelBigCat)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<TigerEntity, ModelBigCat<TigerEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/big_cat_medallion.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               TigerEntity entity,
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
               if (TigerMedallionDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((ModelBigCat)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<TigerEntity, ModelBigCat<TigerEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/big_cat_white_tiger_wings.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               TigerEntity entity,
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
               if (WhiteTigerWingsDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((ModelBigCat)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
   }

   protected void scale(TigerEntity entity, PoseStack poseStack, float f) {
      poseStack.scale(1.2F, 1.2F, 1.2F);
   }

   public ResourceLocation getTextureLocation(TigerEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/big_cat_tiger.png");
   }

   private static final class AnimatedModel extends ModelBigCat<TigerEntity> {
      private final ModelPart root;
      private final HierarchicalModel animator = new HierarchicalModel<TigerEntity>() {
         public ModelPart root() {
            return AnimatedModel.this.root;
         }

         public void setupAnim(TigerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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

      public void setupAnim(TigerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
         this.animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
         super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
      }
   }
}
