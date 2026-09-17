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

public class Modelostrich2<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
      ResourceLocation.fromNamespaceAndPath("mocreatures", "modelostrich_2"), "main"
   );
   public final ModelPart UBeak;
   public final ModelPart Body;
   public final ModelPart LLegA;
   public final ModelPart LLegC;
   public final ModelPart RLegA;
   public final ModelPart RLegC;
   public final ModelPart Tail1;
   public final ModelPart Tail2;
   public final ModelPart Tail3;
   public final ModelPart LWingC;
   public final ModelPart LWingB;
   public final ModelPart LWingD;
   public final ModelPart LWingE;
   public final ModelPart RWingC;
   public final ModelPart RWingB;
   public final ModelPart RWingD;
   public final ModelPart RWingE;
   public final ModelPart SaddleA;
   public final ModelPart SaddleB;
   public final ModelPart SaddleL;
   public final ModelPart SaddleR;
   public final ModelPart SaddleL2;
   public final ModelPart SaddleR2;
   public final ModelPart SaddleC;
   public final ModelPart NeckLFeather;
   public final ModelPart NeckUFeather;
   public final ModelPart NeckD;
   public final ModelPart Neck1;
   public final ModelPart Neck2;
   public final ModelPart Saddlebag;
   public final ModelPart Flagpole;
   public final ModelPart FlagBlack;
   public final ModelPart Head;
   public final ModelPart UpperBeak;
   public final ModelPart LowerBeak;
   public final ModelPart Wyvern1;
   public final ModelPart Wyvern6;
   public final ModelPart Wyvern2;
   public final ModelPart Wyvern3;
   public final ModelPart Wyvern4;
   public final ModelPart Wyvern5;

   public Modelostrich2(ModelPart root) {
      this.UBeak = root.getChild("UBeak");
      this.Body = root.getChild("Body");
      this.LLegA = root.getChild("LLegA");
      this.LLegC = this.LLegA.getChild("LLegC");
      this.RLegA = root.getChild("RLegA");
      this.RLegC = this.RLegA.getChild("RLegC");
      this.Tail1 = root.getChild("Tail1");
      this.Tail2 = root.getChild("Tail2");
      this.Tail3 = root.getChild("Tail3");
      this.LWingC = root.getChild("LWingC");
      this.LWingB = this.LWingC.getChild("LWingB");
      this.LWingD = root.getChild("LWingD");
      this.LWingE = root.getChild("LWingE");
      this.RWingC = root.getChild("RWingC");
      this.RWingB = this.RWingC.getChild("RWingB");
      this.RWingD = root.getChild("RWingD");
      this.RWingE = this.RWingD.getChild("RWingE");
      this.SaddleA = root.getChild("SaddleA");
      this.SaddleB = root.getChild("SaddleB");
      this.SaddleL = root.getChild("SaddleL");
      this.SaddleR = root.getChild("SaddleR");
      this.SaddleL2 = root.getChild("SaddleL2");
      this.SaddleR2 = root.getChild("SaddleR2");
      this.SaddleC = root.getChild("SaddleC");
      this.NeckLFeather = root.getChild("NeckLFeather");
      this.NeckUFeather = root.getChild("NeckUFeather");
      this.NeckD = root.getChild("NeckD");
      this.Neck1 = this.NeckD.getChild("Neck1");
      this.Neck2 = this.Neck1.getChild("Neck2");
      this.Saddlebag = root.getChild("Saddlebag");
      this.Flagpole = root.getChild("Flagpole");
      this.FlagBlack = root.getChild("FlagBlack");
      this.Head = root.getChild("Head");
      this.UpperBeak = this.Head.getChild("UpperBeak");
      this.LowerBeak = this.Head.getChild("LowerBeak");
      this.Wyvern1 = root.getChild("Wyvern1");
      this.Wyvern6 = this.Wyvern1.getChild("Wyvern6");
      this.Wyvern2 = this.Wyvern6.getChild("Wyvern2");
      this.Wyvern3 = this.Wyvern2.getChild("Wyvern3");
      this.Wyvern4 = this.Wyvern3.getChild("Wyvern4");
      this.Wyvern5 = this.Wyvern4.getChild("Wyvern5");
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.getRoot();
      PartDefinition UBeak = partdefinition.addOrReplaceChild("UBeak", CubeListBuilder.create(), PartPose.offset(0.0F, 3.0F, -6.0F));
      PartDefinition Body = partdefinition.addOrReplaceChild(
         "Body",
         CubeListBuilder.create().texOffs(0, 38).addBox(-4.0F, 1.0F, 0.0F, 8.0F, 10.0F, 16.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, -6.0F)
      );
      PartDefinition LLegA = partdefinition.addOrReplaceChild(
         "LLegA",
         CubeListBuilder.create()
            .texOffs(50, 28)
            .addBox(-2.0F, -1.0F, -2.5F, 4.0F, 6.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(50, 39)
            .addBox(-1.5F, 5.0F, -1.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
            .texOffs(32, 42)
            .addBox(-1.0F, 17.0F, -9.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(4.0F, 5.0F, 4.0F, 0.1745F, 0.0F, 0.0F)
      );
      PartDefinition LLegC = LLegA.addOrReplaceChild(
         "LLegC",
         CubeListBuilder.create().texOffs(8, 38).addBox(-1.0F, 8.0F, 2.5F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.4363F, 0.0F, 0.0F)
      );
      PartDefinition RLegA = partdefinition.addOrReplaceChild(
         "RLegA",
         CubeListBuilder.create()
            .texOffs(0, 27)
            .addBox(-2.0F, -1.0F, -2.5F, 4.0F, 6.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(18, 27)
            .addBox(-1.5F, 5.0F, -1.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
            .texOffs(32, 48)
            .addBox(-1.0F, 17.0F, -9.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-4.0F, 5.0F, 4.0F, 0.1745F, 0.0F, 0.0F)
      );
      PartDefinition RLegC = RLegA.addOrReplaceChild(
         "RLegC",
         CubeListBuilder.create().texOffs(0, 38).addBox(-1.0F, 8.0F, 2.5F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.4363F, 0.0F, 0.0F)
      );
      PartDefinition Tail1 = partdefinition.addOrReplaceChild(
         "Tail1",
         CubeListBuilder.create().texOffs(44, 18).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 4.0F, 15.0F, 0.3491F, 0.0F, 0.0F)
      );
      PartDefinition Tail2 = partdefinition.addOrReplaceChild(
         "Tail2",
         CubeListBuilder.create().texOffs(58, 18).addBox(-2.6F, -2.0F, -2.0F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 4.0F, 15.0F, 0.3491F, -0.2618F, 0.0F)
      );
      PartDefinition Tail3 = partdefinition.addOrReplaceChild(
         "Tail3",
         CubeListBuilder.create().texOffs(30, 18).addBox(1.6F, -2.0F, -2.0F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 4.0F, 15.0F, 0.3491F, 0.2618F, 0.0F)
      );
      PartDefinition LWingC = partdefinition.addOrReplaceChild(
         "LWingC",
         CubeListBuilder.create().texOffs(98, 46).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 4.0F, 14.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(4.0F, 4.0F, -3.0F, 0.0F, 0.0873F, 0.0F)
      );
      PartDefinition LWingB = LWingC.addOrReplaceChild("LWingB", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0873F, 0.0F));
      PartDefinition LWingB_r1 = LWingB.addOrReplaceChild(
         "LWingB_r1",
         CubeListBuilder.create().texOffs(68, 46).addBox(3.5F, -23.0F, -3.0F, 1.0F, 4.0F, 14.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-4.0F, 20.0F, 3.0F, 0.0F, -0.0436F, 0.0F)
      );
      PartDefinition LWingD = partdefinition.addOrReplaceChild(
         "LWingD",
         CubeListBuilder.create()
            .texOffs(26, 84)
            .addBox(0.0F, -1.0F, -1.0F, 15.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(0, 103)
            .addBox(0.0F, 0.0F, 1.0F, 15.0F, 0.0F, 15.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(4.0F, 3.0F, -3.0F, 0.0F, 0.0F, -0.3491F)
      );
      PartDefinition LWingE = partdefinition.addOrReplaceChild(
         "LWingE", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0F, 3.0F, -3.0F, 0.0F, 0.0F, -0.3491F)
      );
      PartDefinition RWingC = partdefinition.addOrReplaceChild(
         "RWingC",
         CubeListBuilder.create().texOffs(98, 0).addBox(0.0F, 0.0F, 0.0F, 1.0F, 4.0F, 14.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-4.0F, 4.0F, -3.0F, 0.0F, -0.0873F, 0.0F)
      );
      PartDefinition RWingB = RWingC.addOrReplaceChild(
         "RWingB",
         CubeListBuilder.create().texOffs(68, 0).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 4.0F, 14.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.087F, -0.0438F, 0.0038F)
      );
      PartDefinition RWingD = partdefinition.addOrReplaceChild(
         "RWingD",
         CubeListBuilder.create()
            .texOffs(26, 80)
            .addBox(-15.0F, -1.0F, -1.0F, 15.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(0, 88)
            .addBox(-15.0F, 0.0F, 1.0F, 15.0F, 0.0F, 15.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-4.0F, 3.0F, -3.0F, 0.0F, 0.0F, 0.3491F)
      );
      PartDefinition RWingE = RWingD.addOrReplaceChild("RWingE", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3491F));
      PartDefinition SaddleA = partdefinition.addOrReplaceChild(
         "SaddleA",
         CubeListBuilder.create().texOffs(72, 18).addBox(-4.0F, 0.5F, -3.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition SaddleB = partdefinition.addOrReplaceChild(
         "SaddleB",
         CubeListBuilder.create().texOffs(72, 27).addBox(-1.5F, 0.0F, -3.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition SaddleL = partdefinition.addOrReplaceChild(
         "SaddleL",
         CubeListBuilder.create().texOffs(72, 30).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(4.0F, 1.0F, 0.0F)
      );
      PartDefinition SaddleR = partdefinition.addOrReplaceChild(
         "SaddleR",
         CubeListBuilder.create().texOffs(84, 30).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-4.0F, 1.0F, 0.0F)
      );
      PartDefinition SaddleL2 = partdefinition.addOrReplaceChild(
         "SaddleL2",
         CubeListBuilder.create().texOffs(76, 30).addBox(-0.5F, 6.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(4.0F, 1.0F, 0.0F)
      );
      PartDefinition SaddleR2 = partdefinition.addOrReplaceChild(
         "SaddleR2",
         CubeListBuilder.create().texOffs(88, 30).addBox(-0.5F, 6.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-4.0F, 1.0F, 0.0F)
      );
      PartDefinition SaddleC = partdefinition.addOrReplaceChild(
         "SaddleC",
         CubeListBuilder.create().texOffs(84, 27).addBox(-4.0F, 0.0F, 3.0F, 8.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition NeckLFeather = partdefinition.addOrReplaceChild(
         "NeckLFeather",
         CubeListBuilder.create().texOffs(8, 73).addBox(0.0F, -8.0F, -0.5F, 0.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 3.0F, -6.0F, 0.2007F, 0.0F, 0.0F)
      );
      PartDefinition NeckUFeather = partdefinition.addOrReplaceChild(
         "NeckUFeather",
         CubeListBuilder.create().texOffs(0, 73).addBox(0.0F, -16.0F, -2.0F, 0.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 3.0F, -6.0F)
      );
      PartDefinition NeckD = partdefinition.addOrReplaceChild(
         "NeckD",
         CubeListBuilder.create()
            .texOffs(0, 16)
            .addBox(-1.5F, -4.0F, -2.0F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F))
            .texOffs(0, 11)
            .addBox(-2.0F, -3.0F, -2.5F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 3.0F, -6.0F, 0.4363F, 0.0F, 0.0F)
      );
      PartDefinition cube_r1 = NeckD.addOrReplaceChild(
         "cube_r1",
         CubeListBuilder.create().texOffs(84, 55).addBox(-3.0F, -1.0F, 0.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, -2.2F, -1.025F, -0.4363F, 0.0F, 0.0F)
      );
      PartDefinition Neck1 = NeckD.addOrReplaceChild("Neck1", CubeListBuilder.create(), PartPose.offset(0.0F, -4.0F, -0.5F));
      PartDefinition cube_r2 = Neck1.addOrReplaceChild(
         "cube_r2",
         CubeListBuilder.create().texOffs(20, 7).addBox(-1.0F, -5.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.5F, -0.05F, -0.2531F, 0.0F, 0.0F)
      );
      PartDefinition Neck2 = Neck1.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offset(0.0F, -4.225F, 1.225F));
      PartDefinition cube_r3 = Neck2.addOrReplaceChild(
         "cube_r3",
         CubeListBuilder.create().texOffs(20, 0).addBox(-1.0F, -5.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, -0.025F, -0.025F, -0.3491F, 0.0F, 0.0F)
      );
      PartDefinition Saddlebag = partdefinition.addOrReplaceChild(
         "Saddlebag",
         CubeListBuilder.create().texOffs(32, 7).addBox(-4.5F, -3.0F, 5.0F, 9.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2603F, 0.0F, 0.0F)
      );
      PartDefinition Flagpole = partdefinition.addOrReplaceChild(
         "Flagpole",
         CubeListBuilder.create().texOffs(28, 0).addBox(-0.5F, -15.0F, -0.5F, 1.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, -0.2603F, 0.0F, 0.0F)
      );
      PartDefinition FlagBlack = partdefinition.addOrReplaceChild(
         "FlagBlack",
         CubeListBuilder.create().texOffs(108, 8).addBox(0.0F, -2.1F, 0.0F, 0.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, -12.0F, 8.0F, -0.2603F, 0.0F, 0.0F)
      );
      PartDefinition Head = partdefinition.addOrReplaceChild(
         "Head",
         CubeListBuilder.create()
            .texOffs(0, 0)
            .addBox(-1.5F, -3.75F, -1.625F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
            .texOffs(96, 64)
            .addBox(-2.0F, -4.0F, -2.125F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(96, 0)
            .addBox(-1.5F, 0.5F, -1.375F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
            .texOffs(66, 9)
            .addBox(-2.5F, -5.5F, -0.125F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(76, 9)
            .addBox(0.5F, -5.5F, -0.125F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, -9.95F, -9.25F)
      );
      PartDefinition cube_r4 = Head.addOrReplaceChild(
         "cube_r4",
         CubeListBuilder.create().texOffs(114, 51).addBox(2.0F, -5.0F, -1.0F, 0.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-3.75F, 1.0F, 0.875F, 0.0F, -0.4363F, 0.0F)
      );
      PartDefinition cube_r5 = Head.addOrReplaceChild(
         "cube_r5",
         CubeListBuilder.create().texOffs(114, 51).addBox(2.0F, -5.0F, -1.0F, 0.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.25F, 1.0F, 2.375F, 0.0F, 0.4363F, 0.0F)
      );
      PartDefinition cube_r6 = Head.addOrReplaceChild(
         "cube_r6",
         CubeListBuilder.create().texOffs(0, 7).addBox(0.0F, -8.5F, -0.275F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-0.5F, 0.25F, -0.625F, 0.2182F, 0.0F, 0.0F)
      );
      PartDefinition UpperBeak = Head.addOrReplaceChild(
         "UpperBeak",
         CubeListBuilder.create()
            .texOffs(12, 16)
            .addBox(-1.5F, -0.75F, -0.875F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(20, 16)
            .addBox(-1.0F, -0.75F, -2.875F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, -2.0F, -1.75F)
      );
      PartDefinition LowerBeak = Head.addOrReplaceChild(
         "LowerBeak",
         CubeListBuilder.create()
            .texOffs(12, 22)
            .addBox(-1.5F, -0.5F, -0.875F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(20, 22)
            .addBox(-1.0F, -0.5F, -2.875F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, -1.25F, -1.75F)
      );
      PartDefinition Wyvern1 = partdefinition.addOrReplaceChild(
         "Wyvern1",
         CubeListBuilder.create().texOffs(30, 28).addBox(-2.5F, -2.45F, 0.0F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 5.5F, 10.0F)
      );
      PartDefinition Wyvern6 = Wyvern1.addOrReplaceChild(
         "Wyvern6",
         CubeListBuilder.create().texOffs(63, 76).addBox(-2.5F, -2.5F, 0.0F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.05F, 5.0F, -0.1745F, 0.0F, 0.0F)
      );
      PartDefinition Wyvern2 = Wyvern6.addOrReplaceChild(
         "Wyvern2",
         CubeListBuilder.create().texOffs(60, 73).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, -2.5F, 5.0F, -0.3491F, 0.0F, 0.0F)
      );
      PartDefinition Wyvern3 = Wyvern2.addOrReplaceChild(
         "Wyvern3",
         CubeListBuilder.create().texOffs(60, 86).addBox(-2.0F, -3.5F, 0.0F, 4.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 4.0F, 7.75F, 0.3054F, 0.0F, 0.0F)
      );
      PartDefinition Wyvern4 = Wyvern3.addOrReplaceChild(
         "Wyvern4",
         CubeListBuilder.create().texOffs(60, 97).addBox(-1.5F, -1.75F, 0.0F, 3.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, -1.0F, 6.5F, 0.3054F, 0.0F, 0.0F)
      );
      PartDefinition Wyvern5 = Wyvern4.addOrReplaceChild("Wyvern5", CubeListBuilder.create(), PartPose.offset(0.0F, 0.25F, 7.0F));
      PartDefinition cube_r7 = Wyvern5.addOrReplaceChild(
         "cube_r7",
         CubeListBuilder.create().texOffs(60, 107).addBox(1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-2.0F, 0.5F, 0.0F, 0.3491F, 0.0F, 0.0F)
      );
      return LayerDefinition.create(meshdefinition, 128, 128);
   }

   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
   }

   public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
      this.UBeak.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
      this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
      this.LLegA.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
      this.RLegA.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
      this.Tail1.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
      this.Tail2.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
      this.Tail3.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
      this.LWingC.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
      this.LWingD.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
      this.LWingE.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
      this.RWingC.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
      this.RWingD.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
      this.SaddleA.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
      this.SaddleB.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
      this.SaddleL.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
      this.SaddleR.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
      this.SaddleL2.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
      this.SaddleR2.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
      this.SaddleC.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
      this.NeckLFeather.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
      this.NeckUFeather.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
      this.NeckD.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
      this.Saddlebag.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
      this.Flagpole.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
      this.FlagBlack.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
      this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
      this.Wyvern1.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
   }
}
