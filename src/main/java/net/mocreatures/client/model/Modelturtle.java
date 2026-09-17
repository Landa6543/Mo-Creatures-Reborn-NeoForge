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

public class Modelturtle<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("mocreatures", "modelturtle"), "main");
   public final ModelPart full;
   public final ModelPart Shell;
   public final ModelPart ShellUp;
   public final ModelPart ShellTop;
   public final ModelPart Belly;
   public final ModelPart Leg1;
   public final ModelPart Leg2;
   public final ModelPart Leg3;
   public final ModelPart Leg4;
   public final ModelPart Head;
   public final ModelPart Tail;

   public Modelturtle(ModelPart root) {
      this.full = root.getChild("full");
      this.Shell = this.full.getChild("Shell");
      this.ShellUp = this.full.getChild("ShellUp");
      this.ShellTop = this.full.getChild("ShellTop");
      this.Belly = this.full.getChild("Belly");
      this.Leg1 = this.full.getChild("Leg1");
      this.Leg2 = this.full.getChild("Leg2");
      this.Leg3 = this.full.getChild("Leg3");
      this.Leg4 = this.full.getChild("Leg4");
      this.Head = this.full.getChild("Head");
      this.Tail = this.full.getChild("Tail");
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.getRoot();
      PartDefinition full = partdefinition.addOrReplaceChild("full", CubeListBuilder.create(), PartPose.offset(-4.5F, 20.0F, -4.5F));
      PartDefinition Shell = full.addOrReplaceChild(
         "Shell",
         CubeListBuilder.create().texOffs(28, 0).addBox(0.0F, 0.0F, 0.0F, 9.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition ShellUp = full.addOrReplaceChild(
         "ShellUp",
         CubeListBuilder.create().texOffs(0, 22).addBox(0.0F, 0.0F, 0.0F, 8.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.5F, -2.0F, 0.5F)
      );
      PartDefinition ShellTop = full.addOrReplaceChild(
         "ShellTop",
         CubeListBuilder.create().texOffs(40, 10).addBox(0.0F, 0.0F, 0.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
         PartPose.offset(1.5F, -3.0F, 1.5F)
      );
      PartDefinition Belly = full.addOrReplaceChild(
         "Belly",
         CubeListBuilder.create().texOffs(0, 12).addBox(0.0F, 0.0F, 0.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.5F, 1.0F, 0.5F)
      );
      PartDefinition Leg1 = full.addOrReplaceChild(
         "Leg1",
         CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(8.0F, 1.0F, 1.0F)
      );
      PartDefinition Leg2 = full.addOrReplaceChild(
         "Leg2",
         CubeListBuilder.create().texOffs(0, 9).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(1.0F, 1.0F, 1.0F)
      );
      PartDefinition Leg3 = full.addOrReplaceChild(
         "Leg3",
         CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(8.0F, 1.0F, 8.0F)
      );
      PartDefinition Leg4 = full.addOrReplaceChild(
         "Leg4",
         CubeListBuilder.create().texOffs(0, 9).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(1.0F, 1.0F, 8.0F)
      );
      PartDefinition Head = full.addOrReplaceChild(
         "Head",
         CubeListBuilder.create().texOffs(10, 0).addBox(-1.5F, -1.0F, -4.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offset(4.5F, 1.0F, 0.0F)
      );
      PartDefinition Tail = full.addOrReplaceChild(
         "Tail",
         CubeListBuilder.create().texOffs(0, 5).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offset(4.5F, 2.0F, 8.5F)
      );
      return LayerDefinition.create(meshdefinition, 64, 32);
   }

   public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
      this.full.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
   }

   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
      this.Head.yRot = netHeadYaw / (180.0F / (float)Math.PI);
      this.Head.xRot = headPitch / (180.0F / (float)Math.PI);
   }
}
