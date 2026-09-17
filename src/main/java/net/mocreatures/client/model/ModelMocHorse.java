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

public class ModelMocHorse<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
      ResourceLocation.fromNamespaceAndPath("mocreatures", "model_moc_horse"), "main"
   );
   public final ModelPart All;
   public final ModelPart MuleEarL;
   public final ModelPart MuleEarR;
   public final ModelPart Neck;
   public final ModelPart Head;
   public final ModelPart Ear1;
   public final ModelPart Ear2;
   public final ModelPart HeadSaddle;
   public final ModelPart UMouth;
   public final ModelPart LMouth;
   public final ModelPart SaddleMouthL;
   public final ModelPart SaddleMouthR;
   public final ModelPart Unicorn;
   public final ModelPart SaddleMouthLineL;
   public final ModelPart SaddleMouthLineR;
   public final ModelPart Mane;
   public final ModelPart Body;
   public final ModelPart TailA;
   public final ModelPart TailB;
   public final ModelPart TailC;
   public final ModelPart Leg1A;
   public final ModelPart Leg1B;
   public final ModelPart Leg1C;
   public final ModelPart Leg2A;
   public final ModelPart Leg2B;
   public final ModelPart Leg2C;
   public final ModelPart Leg3A;
   public final ModelPart Leg3B;
   public final ModelPart Leg3C;
   public final ModelPart Leg4A;
   public final ModelPart Leg4B;
   public final ModelPart Leg4C;
   public final ModelPart Bag1;
   public final ModelPart Bag2;
   public final ModelPart Saddle;
   public final ModelPart SaddleC;
   public final ModelPart SaddleB;
   public final ModelPart SaddleL;
   public final ModelPart SaddleL2;
   public final ModelPart SaddleR;
   public final ModelPart SaddleR2;
   public final ModelPart InnerWing;
   public final ModelPart MidWing;
   public final ModelPart OuterWing;
   public final ModelPart InnerWingR;
   public final ModelPart MidWingR;
   public final ModelPart OuterWingR;
   public final ModelPart ButterflyL;
   public final ModelPart ButterflyR;

   public ModelMocHorse(ModelPart root) {
      this.All = root.getChild("All");
      this.MuleEarL = this.All.getChild("MuleEarL");
      this.MuleEarR = this.All.getChild("MuleEarR");
      this.Neck = this.All.getChild("Neck");
      this.Head = this.Neck.getChild("Head");
      this.Ear1 = this.Head.getChild("Ear1");
      this.Ear2 = this.Head.getChild("Ear2");
      this.HeadSaddle = this.Head.getChild("HeadSaddle");
      this.UMouth = this.Head.getChild("UMouth");
      this.LMouth = this.Head.getChild("LMouth");
      this.SaddleMouthL = this.Head.getChild("SaddleMouthL");
      this.SaddleMouthR = this.Head.getChild("SaddleMouthR");
      this.Unicorn = this.Head.getChild("Unicorn");
      this.SaddleMouthLineL = this.Neck.getChild("SaddleMouthLineL");
      this.SaddleMouthLineR = this.Neck.getChild("SaddleMouthLineR");
      this.Mane = this.Neck.getChild("Mane");
      this.Body = this.All.getChild("Body");
      this.TailA = this.Body.getChild("TailA");
      this.TailB = this.TailA.getChild("TailB");
      this.TailC = this.TailB.getChild("TailC");
      this.Leg1A = this.Body.getChild("Leg1A");
      this.Leg1B = this.Leg1A.getChild("Leg1B");
      this.Leg1C = this.Leg1B.getChild("Leg1C");
      this.Leg2A = this.Body.getChild("Leg2A");
      this.Leg2B = this.Leg2A.getChild("Leg2B");
      this.Leg2C = this.Leg2B.getChild("Leg2C");
      this.Leg3A = this.Body.getChild("Leg3A");
      this.Leg3B = this.Leg3A.getChild("Leg3B");
      this.Leg3C = this.Leg3B.getChild("Leg3C");
      this.Leg4A = this.Body.getChild("Leg4A");
      this.Leg4B = this.Leg4A.getChild("Leg4B");
      this.Leg4C = this.Leg4B.getChild("Leg4C");
      this.Bag1 = this.All.getChild("Bag1");
      this.Bag2 = this.All.getChild("Bag2");
      this.Saddle = this.All.getChild("Saddle");
      this.SaddleC = this.Saddle.getChild("SaddleC");
      this.SaddleB = this.Saddle.getChild("SaddleB");
      this.SaddleL = this.Saddle.getChild("SaddleL");
      this.SaddleL2 = this.SaddleL.getChild("SaddleL2");
      this.SaddleR = this.Saddle.getChild("SaddleR");
      this.SaddleR2 = this.SaddleR.getChild("SaddleR2");
      this.InnerWing = this.All.getChild("InnerWing");
      this.MidWing = this.InnerWing.getChild("MidWing");
      this.OuterWing = this.MidWing.getChild("OuterWing");
      this.InnerWingR = this.All.getChild("InnerWingR");
      this.MidWingR = this.InnerWingR.getChild("MidWingR");
      this.OuterWingR = this.MidWingR.getChild("OuterWingR");
      this.ButterflyL = this.All.getChild("ButterflyL");
      this.ButterflyR = this.All.getChild("ButterflyR");
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.getRoot();
      PartDefinition All = partdefinition.addOrReplaceChild("All", CubeListBuilder.create(), PartPose.offset(0.0F, 4.0F, -10.0F));
      PartDefinition MuleEarL = All.addOrReplaceChild(
         "MuleEarL",
         CubeListBuilder.create().texOffs(0, 12).addBox(-2.0F, -16.0F, 4.0F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition MuleEarR = All.addOrReplaceChild(
         "MuleEarR",
         CubeListBuilder.create().texOffs(0, 12).addBox(0.0F, -16.0F, 4.0F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition Neck = All.addOrReplaceChild(
         "Neck",
         CubeListBuilder.create().texOffs(0, 12).addBox(-2.05F, -9.8F, -2.0F, 4.0F, 14.0F, 8.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5236F, 0.0F, 0.0F)
      );
      PartDefinition Head = Neck.addOrReplaceChild(
         "Head",
         CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -10.0F, -1.5F, 5.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition Ear1 = Head.addOrReplaceChild(
         "Ear1",
         CubeListBuilder.create().texOffs(0, 0).addBox(0.45F, -12.0F, 4.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition Ear2 = Head.addOrReplaceChild(
         "Ear2",
         CubeListBuilder.create().texOffs(0, 0).addBox(-2.45F, -12.0F, 4.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition HeadSaddle = Head.addOrReplaceChild(
         "HeadSaddle",
         CubeListBuilder.create().texOffs(80, 12).addBox(-2.5F, -10.1F, -7.0F, 5.0F, 5.0F, 12.0F, new CubeDeformation(0.2F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition UMouth = Head.addOrReplaceChild(
         "UMouth",
         CubeListBuilder.create().texOffs(24, 18).addBox(-2.0F, -1.25F, -5.0F, 4.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, -8.75F, -2.0F)
      );
      PartDefinition LMouth = Head.addOrReplaceChild(
         "LMouth",
         CubeListBuilder.create().texOffs(24, 27).addBox(-2.0F, -1.25F, -5.5F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, -5.75F, -1.0F)
      );
      PartDefinition SaddleMouthL = Head.addOrReplaceChild(
         "SaddleMouthL",
         CubeListBuilder.create().texOffs(74, 13).addBox(1.5F, -8.0F, -4.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition SaddleMouthR = Head.addOrReplaceChild(
         "SaddleMouthR",
         CubeListBuilder.create().texOffs(74, 13).addBox(-2.5F, -8.0F, -4.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition Unicorn = Head.addOrReplaceChild(
         "Unicorn",
         CubeListBuilder.create().texOffs(24, 0).addBox(-0.5F, -18.0F, 2.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition SaddleMouthLineL = Neck.addOrReplaceChild(
         "SaddleMouthLineL",
         CubeListBuilder.create().texOffs(44, 10).addBox(2.6F, -6.0F, -6.0F, 0.0F, 3.0F, 16.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.134F, 2.2321F)
      );
      PartDefinition SaddleMouthLineR = Neck.addOrReplaceChild(
         "SaddleMouthLineR",
         CubeListBuilder.create().texOffs(44, 5).addBox(-2.6F, -6.0F, -6.0F, 0.0F, 3.0F, 16.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.134F, 2.2321F)
      );
      PartDefinition Mane = Neck.addOrReplaceChild(
         "Mane",
         CubeListBuilder.create().texOffs(58, 0).addBox(-1.0F, -11.5F, 5.0F, 2.0F, 16.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition Body = All.addOrReplaceChild(
         "Body",
         CubeListBuilder.create().texOffs(0, 34).addBox(-5.0F, -8.0F, -19.0F, 10.0F, 10.0F, 24.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 7.0F, 19.0F)
      );
      PartDefinition TailA = Body.addOrReplaceChild(
         "TailA",
         CubeListBuilder.create().texOffs(44, 0).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, -8.0F, 5.0F, -1.309F, 0.0F, 0.0F)
      );
      PartDefinition TailB = TailA.addOrReplaceChild(
         "TailB",
         CubeListBuilder.create().texOffs(38, 7).addBox(-1.5F, -2.0F, 3.0F, 3.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition TailC = TailB.addOrReplaceChild(
         "TailC",
         CubeListBuilder.create().texOffs(24, 3).addBox(-1.5F, -4.5F, 9.0F, 3.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.0F)
      );
      PartDefinition Leg1A = Body.addOrReplaceChild(
         "Leg1A",
         CubeListBuilder.create().texOffs(78, 29).addBox(-2.5F, -2.0F, -2.5F, 4.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)),
         PartPose.offset(4.0F, -2.0F, 2.0F)
      );
      PartDefinition Leg1B = Leg1A.addOrReplaceChild(
         "Leg1B",
         CubeListBuilder.create().texOffs(78, 43).addBox(-2.0F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 7.0F, 0.0F)
      );
      PartDefinition Leg1C = Leg1B.addOrReplaceChild(
         "Leg1C",
         CubeListBuilder.create().texOffs(78, 51).addBox(-2.5F, 5.1F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition Leg2A = Body.addOrReplaceChild(
         "Leg2A",
         CubeListBuilder.create().texOffs(96, 29).addBox(-1.5F, -2.0F, -2.5F, 4.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-4.0F, -2.0F, 2.0F)
      );
      PartDefinition Leg2B = Leg2A.addOrReplaceChild(
         "Leg2B",
         CubeListBuilder.create().texOffs(96, 43).addBox(-1.0F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 7.0F, 0.0F)
      );
      PartDefinition Leg2C = Leg2B.addOrReplaceChild(
         "Leg2C",
         CubeListBuilder.create().texOffs(96, 51).addBox(-1.5F, 5.1F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition Leg3A = Body.addOrReplaceChild(
         "Leg3A",
         CubeListBuilder.create().texOffs(44, 29).addBox(-1.9F, -1.0F, -2.1F, 3.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offset(4.0F, -2.0F, -17.0F)
      );
      PartDefinition Leg3B = Leg3A.addOrReplaceChild(
         "Leg3B",
         CubeListBuilder.create().texOffs(44, 41).addBox(-1.9F, 0.0F, -1.6F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 7.0F, 0.0F)
      );
      PartDefinition Leg3C = Leg3B.addOrReplaceChild(
         "Leg3C",
         CubeListBuilder.create().texOffs(44, 51).addBox(-2.4F, 5.1F, -2.1F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition Leg4A = Body.addOrReplaceChild(
         "Leg4A",
         CubeListBuilder.create().texOffs(60, 29).addBox(-1.1F, -1.0F, -2.1F, 3.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-4.0F, -2.0F, -17.0F)
      );
      PartDefinition Leg4B = Leg4A.addOrReplaceChild(
         "Leg4B",
         CubeListBuilder.create().texOffs(60, 41).addBox(-1.1F, 0.0F, -1.6F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 7.0F, 0.0F)
      );
      PartDefinition Leg4C = Leg4B.addOrReplaceChild(
         "Leg4C",
         CubeListBuilder.create().texOffs(60, 51).addBox(-1.6F, 5.1F, -2.1F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition Bag1 = All.addOrReplaceChild(
         "Bag1",
         CubeListBuilder.create().texOffs(0, 34).addBox(-3.0F, 0.0F, -3.0F, 8.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-4.5F, -1.0F, 20.0F, 0.0F, 1.5708F, -0.0436F)
      );
      PartDefinition Bag2 = All.addOrReplaceChild(
         "Bag2",
         CubeListBuilder.create().texOffs(0, 47).addBox(-3.0F, 0.0F, 0.0F, 8.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(4.5F, -1.0F, 20.0F, 0.0F, 1.5708F, 0.0436F)
      );
      PartDefinition Saddle = All.addOrReplaceChild(
         "Saddle",
         CubeListBuilder.create().texOffs(80, 0).addBox(-5.0F, 0.0F, -3.0F, 10.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, -2.0F, 12.0F)
      );
      PartDefinition SaddleC = Saddle.addOrReplaceChild(
         "SaddleC",
         CubeListBuilder.create().texOffs(80, 9).addBox(-4.0F, -1.0F, 3.0F, 8.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition SaddleB = Saddle.addOrReplaceChild(
         "SaddleB",
         CubeListBuilder.create().texOffs(106, 9).addBox(-1.5F, -1.0F, -3.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition SaddleL = Saddle.addOrReplaceChild(
         "SaddleL",
         CubeListBuilder.create().texOffs(70, 0).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(5.0F, 0.0F, 0.0F)
      );
      PartDefinition SaddleL2 = SaddleL.addOrReplaceChild(
         "SaddleL2",
         CubeListBuilder.create().texOffs(74, 0).addBox(-0.5F, 6.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition SaddleR = Saddle.addOrReplaceChild(
         "SaddleR",
         CubeListBuilder.create().texOffs(80, 0).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-5.0F, 0.0F, 0.0F)
      );
      PartDefinition SaddleR2 = SaddleR.addOrReplaceChild(
         "SaddleR2",
         CubeListBuilder.create().texOffs(74, 4).addBox(-0.5F, 6.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition InnerWing = All.addOrReplaceChild(
         "InnerWing",
         CubeListBuilder.create().texOffs(0, 96).addBox(0.0F, 0.0F, 0.0F, 7.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(5.0F, -1.0F, 4.0F, 0.0F, 0.0F, 1.2217F)
      );
      PartDefinition MidWing = InnerWing.addOrReplaceChild(
         "MidWing",
         CubeListBuilder.create().texOffs(82, 68).addBox(1.0F, 0.1F, 1.0F, 12.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition OuterWing = MidWing.addOrReplaceChild(
         "OuterWing",
         CubeListBuilder.create().texOffs(0, 68).addBox(0.0F, 0.0F, 0.0F, 22.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(12.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0436F)
      );
      PartDefinition InnerWingR = All.addOrReplaceChild(
         "InnerWingR",
         CubeListBuilder.create().texOffs(0, 110).addBox(-7.0F, 0.0F, 0.0F, 7.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-5.0F, -1.0F, 4.0F, 0.0F, 0.0F, -1.2217F)
      );
      PartDefinition MidWingR = InnerWingR.addOrReplaceChild(
         "MidWingR",
         CubeListBuilder.create().texOffs(82, 82).addBox(-13.0F, 0.1F, 1.0F, 12.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition OuterWingR = MidWingR.addOrReplaceChild(
         "OuterWingR",
         CubeListBuilder.create().texOffs(0, 82).addBox(-22.0F, 0.0F, 0.0F, 22.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-12.0F, 0.0F, 0.0F, 0.0F, 1.5708F, -0.0436F)
      );
      PartDefinition ButterflyL = All.addOrReplaceChild(
         "ButterflyL",
         CubeListBuilder.create().texOffs(46, 98).addBox(-1.0F, 0.0F, -14.0F, 26.0F, 0.0F, 30.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(4.5F, -1.0F, 8.0F, 0.0F, 0.0F, -0.4363F)
      );
      PartDefinition ButterflyR = All.addOrReplaceChild(
         "ButterflyR",
         CubeListBuilder.create().texOffs(46, 98).mirror().addBox(-25.0F, 0.0F, -14.0F, 26.0F, 0.0F, 30.0F, new CubeDeformation(0.0F)).mirror(false),
         PartPose.offsetAndRotation(-4.5F, -1.0F, 8.0F, 0.0F, 0.0F, 0.4363F)
      );
      return LayerDefinition.create(meshdefinition, 128, 128);
   }

   public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
      this.All.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
   }

   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
   }
}
