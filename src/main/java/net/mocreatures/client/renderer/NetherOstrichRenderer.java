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
import net.mocreatures.entity.NetherOstrichEntity;
import net.mocreatures.procedures.NetherOstrichBlackFlagDisplayConditionProcedure;
import net.mocreatures.procedures.NetherOstrichBlueFlagDisplayConditionProcedure;
import net.mocreatures.procedures.NetherOstrichCaveScorpionHelmetDisplayConditionProcedure;
import net.mocreatures.procedures.NetherOstrichChestDisplayConditionProcedure;
import net.mocreatures.procedures.NetherOstrichCyanFlagDisplayConditionProcedure;
import net.mocreatures.procedures.NetherOstrichDiamondHelmetDisplayConditionProcedure;
import net.mocreatures.procedures.NetherOstrichEarthScorpionHelmetDisplayConditionProcedure;
import net.mocreatures.procedures.NetherOstrichFireScorpionHelmetDisplayConditionProcedure;
import net.mocreatures.procedures.NetherOstrichFlagBrownDisplayConditionProcedure;
import net.mocreatures.procedures.NetherOstrichFrostScorpionHelmetDisplayConditionProcedure;
import net.mocreatures.procedures.NetherOstrichFurHelmetDisplayConditionProcedure;
import net.mocreatures.procedures.NetherOstrichGoldHelmetDisplayConditionProcedure;
import net.mocreatures.procedures.NetherOstrichGreenFlagDisplayConditionProcedure;
import net.mocreatures.procedures.NetherOstrichGreyFlagDisplayConditionProcedure;
import net.mocreatures.procedures.NetherOstrichHideHelmetDisplayConditionProcedure;
import net.mocreatures.procedures.NetherOstrichIronHelmetDisplayConditionProcedure;
import net.mocreatures.procedures.NetherOstrichLeatherHelmetDisplayConditionProcedure;
import net.mocreatures.procedures.NetherOstrichLightBlueFlagDisplayConditionProcedure;
import net.mocreatures.procedures.NetherOstrichLightGreenFlagDisplayConditionProcedure;
import net.mocreatures.procedures.NetherOstrichLightGreyFlagDisplayConditionProcedure;
import net.mocreatures.procedures.NetherOstrichMagentaFlagDisplayConditionProcedure;
import net.mocreatures.procedures.NetherOstrichNetheriteHelmetDisplayConditionProcedure;
import net.mocreatures.procedures.NetherOstrichOrangeFlagDisplayConditionProcedure;
import net.mocreatures.procedures.NetherOstrichPinkFlagDisplayConditionProcedure;
import net.mocreatures.procedures.NetherOstrichPurpleFlagDisplayConditionProcedure;
import net.mocreatures.procedures.NetherOstrichRedFlagDisplayConditionProcedure;
import net.mocreatures.procedures.NetherOstrichReptileDisplayConditionProcedure;
import net.mocreatures.procedures.NetherOstrichSaddleDisplayConditionProcedure;
import net.mocreatures.procedures.NetherOstrichUndeadScorpionHelmetDisplayConditionProcedure;
import net.mocreatures.procedures.NetherOstrichWhiteFlagDisplayConditionProcedure;
import net.mocreatures.procedures.NetherOstrichYellowFlagDisplayConditionProcedure;

public class NetherOstrichRenderer extends MobRenderer<NetherOstrichEntity, Modelostrich2<NetherOstrichEntity>> {
   public NetherOstrichRenderer(Context context) {
      super(context, new NetherOstrichRenderer.AnimatedModel(context.bakeLayer(Modelostrich2.LAYER_LOCATION)), 0.5F);
      this.addLayer(
         new RenderLayer<NetherOstrichEntity, Modelostrich2<NetherOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_saddled.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               NetherOstrichEntity entity,
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
               if (NetherOstrichSaddleDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<NetherOstrichEntity, Modelostrich2<NetherOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_chest.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               NetherOstrichEntity entity,
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
               if (NetherOstrichChestDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<NetherOstrichEntity, Modelostrich2<NetherOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_diamond_helmet.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               NetherOstrichEntity entity,
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
               if (NetherOstrichDiamondHelmetDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<NetherOstrichEntity, Modelostrich2<NetherOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_golden_helmet.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               NetherOstrichEntity entity,
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
               if (NetherOstrichGoldHelmetDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<NetherOstrichEntity, Modelostrich2<NetherOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_fur_helmet.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               NetherOstrichEntity entity,
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
               if (NetherOstrichFurHelmetDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<NetherOstrichEntity, Modelostrich2<NetherOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_leather_helmet.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               NetherOstrichEntity entity,
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
               if (NetherOstrichLeatherHelmetDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<NetherOstrichEntity, Modelostrich2<NetherOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_hide_helmet.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               NetherOstrichEntity entity,
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
               if (NetherOstrichHideHelmetDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<NetherOstrichEntity, Modelostrich2<NetherOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_iron_helmet.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               NetherOstrichEntity entity,
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
               if (NetherOstrichIronHelmetDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<NetherOstrichEntity, Modelostrich2<NetherOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_reptile_helmet.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               NetherOstrichEntity entity,
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
               if (NetherOstrichReptileDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<NetherOstrichEntity, Modelostrich2<NetherOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_blackflag.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               NetherOstrichEntity entity,
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
               if (NetherOstrichBlackFlagDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<NetherOstrichEntity, Modelostrich2<NetherOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_blueflag.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               NetherOstrichEntity entity,
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
               if (NetherOstrichBlueFlagDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<NetherOstrichEntity, Modelostrich2<NetherOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_brownflag.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               NetherOstrichEntity entity,
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
               if (NetherOstrichFlagBrownDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<NetherOstrichEntity, Modelostrich2<NetherOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_cyanflag.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               NetherOstrichEntity entity,
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
               if (NetherOstrichCyanFlagDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<NetherOstrichEntity, Modelostrich2<NetherOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_greenflag.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               NetherOstrichEntity entity,
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
               if (NetherOstrichGreenFlagDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<NetherOstrichEntity, Modelostrich2<NetherOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_greyflag.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               NetherOstrichEntity entity,
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
               if (NetherOstrichGreyFlagDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<NetherOstrichEntity, Modelostrich2<NetherOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_lightblueflag.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               NetherOstrichEntity entity,
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
               if (NetherOstrichLightBlueFlagDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<NetherOstrichEntity, Modelostrich2<NetherOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_lightgreenflag.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               NetherOstrichEntity entity,
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
               if (NetherOstrichLightGreenFlagDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<NetherOstrichEntity, Modelostrich2<NetherOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_lightgreyflag.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               NetherOstrichEntity entity,
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
               if (NetherOstrichLightGreyFlagDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<NetherOstrichEntity, Modelostrich2<NetherOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_magentaflag.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               NetherOstrichEntity entity,
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
               if (NetherOstrichMagentaFlagDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<NetherOstrichEntity, Modelostrich2<NetherOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_orangeflag.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               NetherOstrichEntity entity,
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
               if (NetherOstrichOrangeFlagDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<NetherOstrichEntity, Modelostrich2<NetherOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_pinkflag.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               NetherOstrichEntity entity,
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
               if (NetherOstrichPinkFlagDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<NetherOstrichEntity, Modelostrich2<NetherOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_purpleflag.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               NetherOstrichEntity entity,
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
               if (NetherOstrichPurpleFlagDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<NetherOstrichEntity, Modelostrich2<NetherOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_redflag.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               NetherOstrichEntity entity,
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
               if (NetherOstrichRedFlagDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<NetherOstrichEntity, Modelostrich2<NetherOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_whiteflag.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               NetherOstrichEntity entity,
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
               if (NetherOstrichWhiteFlagDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<NetherOstrichEntity, Modelostrich2<NetherOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_yellowflag.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               NetherOstrichEntity entity,
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
               if (NetherOstrichYellowFlagDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<NetherOstrichEntity, Modelostrich2<NetherOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_earth_scorpion_helmet.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               NetherOstrichEntity entity,
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
               if (NetherOstrichEarthScorpionHelmetDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<NetherOstrichEntity, Modelostrich2<NetherOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_fire_scorpion_helmet.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               NetherOstrichEntity entity,
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
               if (NetherOstrichFireScorpionHelmetDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<NetherOstrichEntity, Modelostrich2<NetherOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_cave_scorpion_helmet.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               NetherOstrichEntity entity,
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
               if (NetherOstrichCaveScorpionHelmetDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<NetherOstrichEntity, Modelostrich2<NetherOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_frost_scorpion_helmet.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               NetherOstrichEntity entity,
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
               if (NetherOstrichFrostScorpionHelmetDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<NetherOstrichEntity, Modelostrich2<NetherOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_undead_scorpion_helmet.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               NetherOstrichEntity entity,
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
               if (NetherOstrichUndeadScorpionHelmetDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<NetherOstrichEntity, Modelostrich2<NetherOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_netherite_helmet.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               NetherOstrichEntity entity,
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
               if (NetherOstrichNetheriteHelmetDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
   }

   public ResourceLocation getTextureLocation(NetherOstrichEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/ostrich_fire_bare.png");
   }

   private static final class AnimatedModel extends Modelostrich2<NetherOstrichEntity> {
      private final ModelPart root;
      private final HierarchicalModel animator = new HierarchicalModel<NetherOstrichEntity>() {
         public ModelPart root() {
            return AnimatedModel.this.root;
         }

         public void setupAnim(NetherOstrichEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.root().getAllParts().forEach(ModelPart::resetPose);
            this.animateWalk(ostrich2Animation.walk, limbSwing, limbSwingAmount, 1.0F, 1.3F);
            this.animate(entity.animationState1, ostrich2Animation.idle, ageInTicks, 1.0F);
         }
      };

      public AnimatedModel(ModelPart root) {
         super(root);
         this.root = root;
      }

      public void setupAnim(NetherOstrichEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
         this.animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
         super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
      }
   }
}
