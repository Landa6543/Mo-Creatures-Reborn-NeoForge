package net.mocreatures.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class Modelquillprojectile<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
      ResourceLocation.fromNamespaceAndPath("mocreatures", "modelquillprojectile"), "main"
   );
   public final ModelPart All;
   public final ModelPart Head;

   public Modelquillprojectile(ModelPart root) {
      this.All = root.getChild("All");
      this.Head = this.All.getChild("Head");
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.getRoot();
      PartDefinition All = partdefinition.addOrReplaceChild("All", CubeListBuilder.create(), PartPose.offset(8.0F, 39.0F, -8.5F));
      PartDefinition Head = All.addOrReplaceChild(
         "Head",
         CubeListBuilder.create()
            .texOffs(0, 5)
            .addBox(0.0F, -0.5093F, -3.8691F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-0.4907F, 0.0F, -3.8691F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-8.0F, -35.15F, 8.5F, 0.0F, 1.5708F, 1.5708F)
      );
      return LayerDefinition.create(meshdefinition, 16, 16);
   }

   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
   }

   public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
      this.All.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
   }
}
