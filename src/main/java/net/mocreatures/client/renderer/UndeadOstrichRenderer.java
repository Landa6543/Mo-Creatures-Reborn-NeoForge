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
import net.mocreatures.client.model.Modelostrich2;
import net.mocreatures.client.model.animations.ostrich2Animation;
import net.mocreatures.entity.UndeadOstrichEntity;
import net.mocreatures.procedures.UndeadOstrichBlackFlagDisplayConditionProcedure;
import net.mocreatures.procedures.UndeadOstrichBlueFlagDisplayConditionProcedure;
import net.mocreatures.procedures.UndeadOstrichBrownFlagDisplayConditionProcedure;
import net.mocreatures.procedures.UndeadOstrichCaveScorpionHelmetDisplayConditionProcedure;
import net.mocreatures.procedures.UndeadOstrichChestDisplayConditionProcedure;
import net.mocreatures.procedures.UndeadOstrichCyanFlagDisplayConditionProcedure;
import net.mocreatures.procedures.UndeadOstrichDiamondHelmetDisplayConditionProcedure;
import net.mocreatures.procedures.UndeadOstrichEarthScorpionDisplayConditionProcedure;
import net.mocreatures.procedures.UndeadOstrichFireScorpionHelmetDisplayConditionProcedure;
import net.mocreatures.procedures.UndeadOstrichFrostScorpionDisplayConditionProcedure;
import net.mocreatures.procedures.UndeadOstrichFurHelmetDisplayConditionProcedure;
import net.mocreatures.procedures.UndeadOstrichGoldHelmetDisplayConditionProcedure;
import net.mocreatures.procedures.UndeadOstrichGreenFlagDisplayConditionProcedure;
import net.mocreatures.procedures.UndeadOstrichGreyFlagDisplayConditionProcedure;
import net.mocreatures.procedures.UndeadOstrichHideHelmetDisplayConditionProcedure;
import net.mocreatures.procedures.UndeadOstrichIronHelmetDisplayConditionProcedure;
import net.mocreatures.procedures.UndeadOstrichLeatherHelmetDisplayConditionProcedure;
import net.mocreatures.procedures.UndeadOstrichLightBlueFlagDisplayConditionProcedure;
import net.mocreatures.procedures.UndeadOstrichLightGreenFlagDisplayConditionProcedure;
import net.mocreatures.procedures.UndeadOstrichLightGreyFlagDisplayConditionProcedure;
import net.mocreatures.procedures.UndeadOstrichMagentaFlagDisplayConditionProcedure;
import net.mocreatures.procedures.UndeadOstrichNetheriteHelmetDisplayConditionProcedure;
import net.mocreatures.procedures.UndeadOstrichOrangeFlagDisplayConditionProcedure;
import net.mocreatures.procedures.UndeadOstrichPinkFlagDisplayConditionProcedure;
import net.mocreatures.procedures.UndeadOstrichPurpleFlagDisplayConditionProcedure;
import net.mocreatures.procedures.UndeadOstrichRedFlagDisplayConditionProcedure;
import net.mocreatures.procedures.UndeadOstrichReptileHelmetDisplayConditionProcedure;
import net.mocreatures.procedures.UndeadOstrichSaddleDisplayConditionProcedure;
import net.mocreatures.procedures.UndeadOstrichUndeadScorpionHelmetDisplayConditionProcedure;
import net.mocreatures.procedures.UndeadOstrichWhiteFlagDisplayConditionProcedure;
import net.mocreatures.procedures.UndeadOstrichYellowFlagDisplayConditionProcedure;

public class UndeadOstrichRenderer extends MobRenderer<UndeadOstrichEntity, Modelostrich2<UndeadOstrichEntity>> {
   public UndeadOstrichRenderer(Context context) {
      super(context, new UndeadOstrichRenderer.AnimatedModel(context.bakeLayer(Modelostrich2.LAYER_LOCATION)), 0.5F);
      this.addLayer(
         new RenderLayer<UndeadOstrichEntity, Modelostrich2<UndeadOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_saddled.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               UndeadOstrichEntity entity,
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
               if (UndeadOstrichSaddleDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<UndeadOstrichEntity, Modelostrich2<UndeadOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_chest.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               UndeadOstrichEntity entity,
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
               if (UndeadOstrichChestDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<UndeadOstrichEntity, Modelostrich2<UndeadOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_diamond_helmet.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               UndeadOstrichEntity entity,
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
               if (UndeadOstrichDiamondHelmetDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<UndeadOstrichEntity, Modelostrich2<UndeadOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_golden_helmet.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               UndeadOstrichEntity entity,
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
               if (UndeadOstrichGoldHelmetDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<UndeadOstrichEntity, Modelostrich2<UndeadOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_fur_helmet.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               UndeadOstrichEntity entity,
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
               if (UndeadOstrichFurHelmetDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<UndeadOstrichEntity, Modelostrich2<UndeadOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_leather_helmet.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               UndeadOstrichEntity entity,
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
               if (UndeadOstrichLeatherHelmetDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<UndeadOstrichEntity, Modelostrich2<UndeadOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_hide_helmet.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               UndeadOstrichEntity entity,
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
               if (UndeadOstrichHideHelmetDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<UndeadOstrichEntity, Modelostrich2<UndeadOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_iron_helmet.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               UndeadOstrichEntity entity,
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
               if (UndeadOstrichIronHelmetDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<UndeadOstrichEntity, Modelostrich2<UndeadOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_reptile_helmet.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               UndeadOstrichEntity entity,
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
               if (UndeadOstrichReptileHelmetDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<UndeadOstrichEntity, Modelostrich2<UndeadOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_blackflag.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               UndeadOstrichEntity entity,
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
               if (UndeadOstrichBlackFlagDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<UndeadOstrichEntity, Modelostrich2<UndeadOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_blueflag.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               UndeadOstrichEntity entity,
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
               if (UndeadOstrichBlueFlagDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<UndeadOstrichEntity, Modelostrich2<UndeadOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_brownflag.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               UndeadOstrichEntity entity,
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
               if (UndeadOstrichBrownFlagDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<UndeadOstrichEntity, Modelostrich2<UndeadOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_cyanflag.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               UndeadOstrichEntity entity,
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
               if (UndeadOstrichCyanFlagDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<UndeadOstrichEntity, Modelostrich2<UndeadOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_greenflag.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               UndeadOstrichEntity entity,
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
               if (UndeadOstrichGreenFlagDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<UndeadOstrichEntity, Modelostrich2<UndeadOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_greyflag.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               UndeadOstrichEntity entity,
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
               if (UndeadOstrichGreyFlagDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<UndeadOstrichEntity, Modelostrich2<UndeadOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_lightblueflag.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               UndeadOstrichEntity entity,
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
               if (UndeadOstrichLightBlueFlagDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<UndeadOstrichEntity, Modelostrich2<UndeadOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_lightgreenflag.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               UndeadOstrichEntity entity,
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
               if (UndeadOstrichLightGreenFlagDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<UndeadOstrichEntity, Modelostrich2<UndeadOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_lightgreyflag.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               UndeadOstrichEntity entity,
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
               if (UndeadOstrichLightGreyFlagDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<UndeadOstrichEntity, Modelostrich2<UndeadOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_magentaflag.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               UndeadOstrichEntity entity,
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
               if (UndeadOstrichMagentaFlagDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<UndeadOstrichEntity, Modelostrich2<UndeadOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_orangeflag.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               UndeadOstrichEntity entity,
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
               if (UndeadOstrichOrangeFlagDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<UndeadOstrichEntity, Modelostrich2<UndeadOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_pinkflag.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               UndeadOstrichEntity entity,
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
               if (UndeadOstrichPinkFlagDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<UndeadOstrichEntity, Modelostrich2<UndeadOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_purpleflag.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               UndeadOstrichEntity entity,
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
               if (UndeadOstrichPurpleFlagDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<UndeadOstrichEntity, Modelostrich2<UndeadOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_redflag.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               UndeadOstrichEntity entity,
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
               if (UndeadOstrichRedFlagDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<UndeadOstrichEntity, Modelostrich2<UndeadOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_whiteflag.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               UndeadOstrichEntity entity,
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
               if (UndeadOstrichWhiteFlagDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<UndeadOstrichEntity, Modelostrich2<UndeadOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_yellowflag.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               UndeadOstrichEntity entity,
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
               if (UndeadOstrichYellowFlagDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<UndeadOstrichEntity, Modelostrich2<UndeadOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_earth_scorpion_helmet.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               UndeadOstrichEntity entity,
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
               if (UndeadOstrichEarthScorpionDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<UndeadOstrichEntity, Modelostrich2<UndeadOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_fire_scorpion_helmet.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               UndeadOstrichEntity entity,
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
               if (UndeadOstrichFireScorpionHelmetDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<UndeadOstrichEntity, Modelostrich2<UndeadOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_cave_scorpion_helmet.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               UndeadOstrichEntity entity,
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
               if (UndeadOstrichCaveScorpionHelmetDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<UndeadOstrichEntity, Modelostrich2<UndeadOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_frost_scorpion_helmet.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               UndeadOstrichEntity entity,
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
               if (UndeadOstrichFrostScorpionDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<UndeadOstrichEntity, Modelostrich2<UndeadOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_undead_scorpion_helmet.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               UndeadOstrichEntity entity,
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
               if (UndeadOstrichUndeadScorpionHelmetDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<UndeadOstrichEntity, Modelostrich2<UndeadOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_netherite_helmet.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               UndeadOstrichEntity entity,
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
               if (UndeadOstrichNetheriteHelmetDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
   }

   public ResourceLocation getTextureLocation(UndeadOstrichEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/ostrich_undead_bare.png");
   }

   private static final class AnimatedModel extends Modelostrich2<UndeadOstrichEntity> {
      private final ModelPart root;
      private final HierarchicalModel animator = new HierarchicalModel<UndeadOstrichEntity>() {
         public ModelPart root() {
            return AnimatedModel.this.root;
         }

         public void setupAnim(UndeadOstrichEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.root().getAllParts().forEach(ModelPart::resetPose);
            this.animateWalk(ostrich2Animation.walk, limbSwing, limbSwingAmount, 1.0F, 1.3F);
            this.animate(entity.animationState1, ostrich2Animation.idle, ageInTicks, 1.0F);
         }
      };

      public AnimatedModel(ModelPart root) {
         super(root);
         this.root = root;
      }

      public void setupAnim(UndeadOstrichEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
         this.animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
         super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
      }
   }
}
