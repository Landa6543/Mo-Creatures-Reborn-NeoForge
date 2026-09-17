package net.mocreatures.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.mocreatures.client.model.ModelBigCat;
import net.mocreatures.client.model.animations.BigCatAnimation;
import net.mocreatures.client.model.animations.ManticoreAnimation;
import net.mocreatures.entity.LionEntity;
import net.mocreatures.procedures.LionBabyDisplayCondition2Procedure;
import net.mocreatures.procedures.LionBabyDisplayConditionProcedure;
import net.mocreatures.procedures.LionChestDisplayConditionProcedure;
import net.mocreatures.procedures.LionFemaleDisplayConditionProcedure;
import net.mocreatures.procedures.LionMaleDisplayConditionProcedure;
import net.mocreatures.procedures.LionMedallionDisplayConditionProcedure;
import net.mocreatures.procedures.LionSaddleDisplayConditionProcedure;
import net.mocreatures.procedures.LionWhiteFemaleDisplayConditionProcedure;
import net.mocreatures.procedures.LionWhiteMaleDisplayConditionProcedure;
import net.mocreatures.procedures.LionWingsDisplayCondition1Procedure;
import net.mocreatures.procedures.LionWingsDisplayCondition2Procedure;

public class LionRenderer extends MobRenderer<LionEntity, ModelBigCat<LionEntity>> {
   public LionRenderer(Context var1) {
      super(var1, new LionRenderer.AnimatedModel(var1.bakeLayer(ModelBigCat.LAYER_LOCATION)), 0.5F);
      this.addLayer(
         new RenderLayer<LionEntity, ModelBigCat<LionEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/big_cat_lion_female.png");

            public void render(
               PoseStack var1, MultiBufferSource var2, int var3, LionEntity var4, float var5, float var6, float var7, float var8, float var9, float var10
            ) {
               Level var11 = var4.level();
               double var12 = var4.getX();
               double var14 = var4.getY();
               double var16 = var4.getZ();
               if (LionFemaleDisplayConditionProcedure.execute(var4)) {
                  VertexConsumer var18 = var2.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((ModelBigCat)this.getParentModel()).renderToBuffer(var1, var18, var3, LivingEntityRenderer.getOverlayCoords(var4, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<LionEntity, ModelBigCat<LionEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/big_cat_lion_male.png");

            public void render(
               PoseStack var1, MultiBufferSource var2, int var3, LionEntity var4, float var5, float var6, float var7, float var8, float var9, float var10
            ) {
               Level var11 = var4.level();
               double var12 = var4.getX();
               double var14 = var4.getY();
               double var16 = var4.getZ();
               if (LionMaleDisplayConditionProcedure.execute(var4)) {
                  VertexConsumer var18 = var2.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((ModelBigCat)this.getParentModel()).renderToBuffer(var1, var18, var3, LivingEntityRenderer.getOverlayCoords(var4, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<LionEntity, ModelBigCat<LionEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/big_cat_lion_male_wings.png");

            public void render(
               PoseStack var1, MultiBufferSource var2, int var3, LionEntity var4, float var5, float var6, float var7, float var8, float var9, float var10
            ) {
               Level var11 = var4.level();
               double var12 = var4.getX();
               double var14 = var4.getY();
               double var16 = var4.getZ();
               if (LionWingsDisplayCondition1Procedure.execute(var4)) {
                  VertexConsumer var18 = var2.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((ModelBigCat)this.getParentModel()).renderToBuffer(var1, var18, var3, LivingEntityRenderer.getOverlayCoords(var4, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<LionEntity, ModelBigCat<LionEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/big_cat_chest.png");

            public void render(
               PoseStack var1, MultiBufferSource var2, int var3, LionEntity var4, float var5, float var6, float var7, float var8, float var9, float var10
            ) {
               Level var11 = var4.level();
               double var12 = var4.getX();
               double var14 = var4.getY();
               double var16 = var4.getZ();
               if (LionChestDisplayConditionProcedure.execute(var4)) {
                  VertexConsumer var18 = var2.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((ModelBigCat)this.getParentModel()).renderToBuffer(var1, var18, var3, LivingEntityRenderer.getOverlayCoords(var4, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<LionEntity, ModelBigCat<LionEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/big_cat_saddle.png");

            public void render(
               PoseStack var1, MultiBufferSource var2, int var3, LionEntity var4, float var5, float var6, float var7, float var8, float var9, float var10
            ) {
               Level var11 = var4.level();
               double var12 = var4.getX();
               double var14 = var4.getY();
               double var16 = var4.getZ();
               if (LionSaddleDisplayConditionProcedure.execute(var4)) {
                  VertexConsumer var18 = var2.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((ModelBigCat)this.getParentModel()).renderToBuffer(var1, var18, var3, LivingEntityRenderer.getOverlayCoords(var4, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<LionEntity, ModelBigCat<LionEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/big_cat_medallion.png");

            public void render(
               PoseStack var1, MultiBufferSource var2, int var3, LionEntity var4, float var5, float var6, float var7, float var8, float var9, float var10
            ) {
               Level var11 = var4.level();
               double var12 = var4.getX();
               double var14 = var4.getY();
               double var16 = var4.getZ();
               if (LionMedallionDisplayConditionProcedure.execute(var4)) {
                  VertexConsumer var18 = var2.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((ModelBigCat)this.getParentModel()).renderToBuffer(var1, var18, var3, LivingEntityRenderer.getOverlayCoords(var4, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<LionEntity, ModelBigCat<LionEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/big_cat_lion_female.png");

            public void render(
               PoseStack var1, MultiBufferSource var2, int var3, LionEntity var4, float var5, float var6, float var7, float var8, float var9, float var10
            ) {
               Level var11 = var4.level();
               double var12 = var4.getX();
               double var14 = var4.getY();
               double var16 = var4.getZ();
               if (LionBabyDisplayConditionProcedure.execute(var4)) {
                  VertexConsumer var18 = var2.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((ModelBigCat)this.getParentModel()).renderToBuffer(var1, var18, var3, LivingEntityRenderer.getOverlayCoords(var4, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<LionEntity, ModelBigCat<LionEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/big_cat_white_lion_male_wings.png");

            public void render(
               PoseStack var1, MultiBufferSource var2, int var3, LionEntity var4, float var5, float var6, float var7, float var8, float var9, float var10
            ) {
               Level var11 = var4.level();
               double var12 = var4.getX();
               double var14 = var4.getY();
               double var16 = var4.getZ();
               if (LionWingsDisplayCondition2Procedure.execute(var4)) {
                  VertexConsumer var18 = var2.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((ModelBigCat)this.getParentModel()).renderToBuffer(var1, var18, var3, LivingEntityRenderer.getOverlayCoords(var4, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<LionEntity, ModelBigCat<LionEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/big_cat_white_lion_male.png");

            public void render(
               PoseStack var1, MultiBufferSource var2, int var3, LionEntity var4, float var5, float var6, float var7, float var8, float var9, float var10
            ) {
               Level var11 = var4.level();
               double var12 = var4.getX();
               double var14 = var4.getY();
               double var16 = var4.getZ();
               if (LionWhiteFemaleDisplayConditionProcedure.execute(var4)) {
                  VertexConsumer var18 = var2.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((ModelBigCat)this.getParentModel()).renderToBuffer(var1, var18, var3, LivingEntityRenderer.getOverlayCoords(var4, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<LionEntity, ModelBigCat<LionEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/big_cat_white_lion_female.png");

            public void render(
               PoseStack var1, MultiBufferSource var2, int var3, LionEntity var4, float var5, float var6, float var7, float var8, float var9, float var10
            ) {
               Level var11 = var4.level();
               double var12 = var4.getX();
               double var14 = var4.getY();
               double var16 = var4.getZ();
               if (LionWhiteMaleDisplayConditionProcedure.execute(var4)) {
                  VertexConsumer var18 = var2.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((ModelBigCat)this.getParentModel()).renderToBuffer(var1, var18, var3, LivingEntityRenderer.getOverlayCoords(var4, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<LionEntity, ModelBigCat<LionEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/big_cat_white_lion_female.png");

            public void render(
               PoseStack var1, MultiBufferSource var2, int var3, LionEntity var4, float var5, float var6, float var7, float var8, float var9, float var10
            ) {
               Level var11 = var4.level();
               double var12 = var4.getX();
               double var14 = var4.getY();
               double var16 = var4.getZ();
               if (LionBabyDisplayCondition2Procedure.execute(var4)) {
                  VertexConsumer var18 = var2.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((ModelBigCat)this.getParentModel()).renderToBuffer(var1, var18, var3, LivingEntityRenderer.getOverlayCoords(var4, 0.0F));
               }
            }
         }
      );
   }

   protected void scale(LionEntity var1, PoseStack var2, float var3) {
      var2.scale(1.2F, 1.2F, 1.2F);
   }

   public ResourceLocation getTextureLocation(LionEntity var1) {
      return ResourceLocation.parse("mocreatures:textures/entities/big_cat_lion_female.png");
   }

   private static final class AnimatedModel extends ModelBigCat<LionEntity> {
      private final ModelPart root;
      private final HierarchicalModel animator = new HierarchicalModel<LionEntity>() {
         public ModelPart root() {
            return AnimatedModel.this.root;
         }

         public void setupAnim(LionEntity var1, float var2, float var3, float var4, float var5, float var6) {
            this.root().getAllParts().forEach(ModelPart::resetPose);
            this.animateWalk(BigCatAnimation.walk2, var2, var3, 1.0F, 1.0F);
            this.animate(var1.animationState1, ManticoreAnimation.flight, var4, 1.0F);
            this.animate(var1.animationState2, ManticoreAnimation.idle, var4, 1.0F);
         }
      };

      public AnimatedModel(ModelPart var1) {
         super(var1);
         this.root = var1;
      }

      public void setupAnim(LionEntity var1, float var2, float var3, float var4, float var5, float var6) {
         this.animator.setupAnim(var1, var2, var3, var4, var5, var6);
         super.setupAnim(var1, var2, var3, var4, var5, var6);
      }
   }
}
