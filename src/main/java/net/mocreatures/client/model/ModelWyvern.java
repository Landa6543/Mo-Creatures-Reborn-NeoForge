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

public class ModelWyvern<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("mocreatures", "model_wyvern"), "main");
   public final ModelPart back1;
   public final ModelPart Tail;
   public final ModelPart tail1;
   public final ModelPart back2;
   public final ModelPart tail2;
   public final ModelPart back3;
   public final ModelPart tail3;
   public final ModelPart back4;
   public final ModelPart tail4;
   public final ModelPart tail5;
   public final ModelPart chest;
   public final ModelPart ironchestarmor;
   public final ModelPart goldchestarmor;
   public final ModelPart diamondchestarmor;
   public final ModelPart neckplate3;
   public final ModelPart neck3;
   public final ModelPart rightupleg;
   public final ModelPart rightmidleg;
   public final ModelPart rightlowleg;
   public final ModelPart rightfoot;
   public final ModelPart righttoe1;
   public final ModelPart rightclaw1;
   public final ModelPart righttoe3;
   public final ModelPart rightclaw3;
   public final ModelPart righttoe2;
   public final ModelPart rightclaw2;
   public final ModelPart ironrightlegarmor;
   public final ModelPart goldrightlegarmor;
   public final ModelPart diamondrightlegarmor;
   public final ModelPart leftupleg;
   public final ModelPart leftmidleg;
   public final ModelPart leftlowleg;
   public final ModelPart leftfoot;
   public final ModelPart lefttoe1;
   public final ModelPart leftclaw1;
   public final ModelPart lefttoe3;
   public final ModelPart leftclaw3;
   public final ModelPart lefttoe2;
   public final ModelPart leftclaw2;
   public final ModelPart ironleftlegarmor;
   public final ModelPart goldleftlegarmor;
   public final ModelPart diamondleftlegarmor;
   public final ModelPart torso;
   public final ModelPart rightshoulder;
   public final ModelPart goldrightshoulder;
   public final ModelPart ironrightshoulderpad;
   public final ModelPart diamondrightshoulder;
   public final ModelPart leftshoulder;
   public final ModelPart goldleftshoulder;
   public final ModelPart ironleftshoulderpad;
   public final ModelPart diamondleftshoulder;
   public final ModelPart saddle;
   public final ModelPart storage;
   public final ModelPart chestbelt;
   public final ModelPart stomachbelt;
   public final ModelPart LeftWing;
   public final ModelPart leftuparm;
   public final ModelPart leftlowarm;
   public final ModelPart leftfing1a;
   public final ModelPart leftfing1b;
   public final ModelPart leftwingflap1;
   public final ModelPart leftfing2a;
   public final ModelPart leftfing2b;
   public final ModelPart leftwingflap2;
   public final ModelPart leftfing3a;
   public final ModelPart leftfing3b;
   public final ModelPart leftwingflap3;
   public final ModelPart leftfing1a2;
   public final ModelPart leftfing1b2;
   public final ModelPart RightWing;
   public final ModelPart rightuparm;
   public final ModelPart rightlowarm;
   public final ModelPart rightfing1a;
   public final ModelPart rightfing1b;
   public final ModelPart rightwingflap1;
   public final ModelPart rightfing2a;
   public final ModelPart rightfing2b;
   public final ModelPart rightwingflap2;
   public final ModelPart rightfing3a;
   public final ModelPart rightfing3b;
   public final ModelPart rightwingflap3;
   public final ModelPart MainHead;
   public final ModelPart neck2;
   public final ModelPart neckplate2;
   public final ModelPart neck1;
   public final ModelPart neckplate1;
   public final ModelPart head;
   public final ModelPart snout;
   public final ModelPart beak;
   public final ModelPart ironhelmetsnout;
   public final ModelPart goldhelmetsnout;
   public final ModelPart diamondhelmetsnout;
   public final ModelPart headplate;
   public final ModelPart righteyesock;
   public final ModelPart lefteyesock;
   public final ModelPart Jaw;
   public final ModelPart leftupjaw;
   public final ModelPart rightupjaw;
   public final ModelPart mouthrod;
   public final ModelPart controlrope1;
   public final ModelPart controlrope2;
   public final ModelPart helmetstrap1;
   public final ModelPart helmetstrap2;
   public final ModelPart rightearskin;
   public final ModelPart rightspine1;
   public final ModelPart ironhelmethorn2;
   public final ModelPart goldhelmethorn2;
   public final ModelPart diamondhelmethorn2;
   public final ModelPart rightspine2;
   public final ModelPart rightspine3;
   public final ModelPart leftearskin;
   public final ModelPart leftspine1;
   public final ModelPart ironhelmethorn1;
   public final ModelPart goldhelmethorn1;
   public final ModelPart diamondhelmethorn1;
   public final ModelPart leftspine2;
   public final ModelPart leftspine3;
   public final ModelPart ironhelmet;
   public final ModelPart goldhelmet;
   public final ModelPart diamondhelmet;

   public ModelWyvern(ModelPart root) {
      this.back1 = root.getChild("back1");
      this.Tail = root.getChild("Tail");
      this.tail1 = this.Tail.getChild("tail1");
      this.back2 = this.tail1.getChild("back2");
      this.tail2 = this.tail1.getChild("tail2");
      this.back3 = this.tail2.getChild("back3");
      this.tail3 = this.tail2.getChild("tail3");
      this.back4 = this.tail3.getChild("back4");
      this.tail4 = this.tail3.getChild("tail4");
      this.tail5 = this.tail4.getChild("tail5");
      this.chest = root.getChild("chest");
      this.ironchestarmor = this.chest.getChild("ironchestarmor");
      this.goldchestarmor = this.chest.getChild("goldchestarmor");
      this.diamondchestarmor = this.chest.getChild("diamondchestarmor");
      this.neckplate3 = root.getChild("neckplate3");
      this.neck3 = root.getChild("neck3");
      this.rightupleg = root.getChild("rightupleg");
      this.rightmidleg = this.rightupleg.getChild("rightmidleg");
      this.rightlowleg = this.rightmidleg.getChild("rightlowleg");
      this.rightfoot = this.rightlowleg.getChild("rightfoot");
      this.righttoe1 = this.rightfoot.getChild("righttoe1");
      this.rightclaw1 = this.righttoe1.getChild("rightclaw1");
      this.righttoe3 = this.rightfoot.getChild("righttoe3");
      this.rightclaw3 = this.righttoe3.getChild("rightclaw3");
      this.righttoe2 = this.rightfoot.getChild("righttoe2");
      this.rightclaw2 = this.righttoe2.getChild("rightclaw2");
      this.ironrightlegarmor = this.rightlowleg.getChild("ironrightlegarmor");
      this.goldrightlegarmor = this.rightlowleg.getChild("goldrightlegarmor");
      this.diamondrightlegarmor = this.rightlowleg.getChild("diamondrightlegarmor");
      this.leftupleg = root.getChild("leftupleg");
      this.leftmidleg = this.leftupleg.getChild("leftmidleg");
      this.leftlowleg = this.leftmidleg.getChild("leftlowleg");
      this.leftfoot = this.leftlowleg.getChild("leftfoot");
      this.lefttoe1 = this.leftfoot.getChild("lefttoe1");
      this.leftclaw1 = this.lefttoe1.getChild("leftclaw1");
      this.lefttoe3 = this.leftfoot.getChild("lefttoe3");
      this.leftclaw3 = this.lefttoe3.getChild("leftclaw3");
      this.lefttoe2 = this.leftfoot.getChild("lefttoe2");
      this.leftclaw2 = this.lefttoe2.getChild("leftclaw2");
      this.ironleftlegarmor = this.leftlowleg.getChild("ironleftlegarmor");
      this.goldleftlegarmor = this.leftlowleg.getChild("goldleftlegarmor");
      this.diamondleftlegarmor = this.leftlowleg.getChild("diamondleftlegarmor");
      this.torso = root.getChild("torso");
      this.rightshoulder = root.getChild("rightshoulder");
      this.goldrightshoulder = this.rightshoulder.getChild("goldrightshoulder");
      this.ironrightshoulderpad = this.rightshoulder.getChild("ironrightshoulderpad");
      this.diamondrightshoulder = this.rightshoulder.getChild("diamondrightshoulder");
      this.leftshoulder = root.getChild("leftshoulder");
      this.goldleftshoulder = this.leftshoulder.getChild("goldleftshoulder");
      this.ironleftshoulderpad = this.leftshoulder.getChild("ironleftshoulderpad");
      this.diamondleftshoulder = this.leftshoulder.getChild("diamondleftshoulder");
      this.saddle = root.getChild("saddle");
      this.storage = root.getChild("storage");
      this.chestbelt = root.getChild("chestbelt");
      this.stomachbelt = root.getChild("stomachbelt");
      this.LeftWing = root.getChild("LeftWing");
      this.leftuparm = this.LeftWing.getChild("leftuparm");
      this.leftlowarm = this.leftuparm.getChild("leftlowarm");
      this.leftfing1a = this.leftlowarm.getChild("leftfing1a");
      this.leftfing1b = this.leftfing1a.getChild("leftfing1b");
      this.leftwingflap1 = this.leftfing1a.getChild("leftwingflap1");
      this.leftfing2a = this.leftlowarm.getChild("leftfing2a");
      this.leftfing2b = this.leftfing2a.getChild("leftfing2b");
      this.leftwingflap2 = this.leftfing2a.getChild("leftwingflap2");
      this.leftfing3a = this.leftlowarm.getChild("leftfing3a");
      this.leftfing3b = this.leftfing3a.getChild("leftfing3b");
      this.leftwingflap3 = this.leftfing3a.getChild("leftwingflap3");
      this.leftfing1a2 = this.leftlowarm.getChild("leftfing1a2");
      this.leftfing1b2 = this.leftfing1a2.getChild("leftfing1b2");
      this.RightWing = root.getChild("RightWing");
      this.rightuparm = this.RightWing.getChild("rightuparm");
      this.rightlowarm = this.rightuparm.getChild("rightlowarm");
      this.rightfing1a = this.rightlowarm.getChild("rightfing1a");
      this.rightfing1b = this.rightfing1a.getChild("rightfing1b");
      this.rightwingflap1 = this.rightfing1a.getChild("rightwingflap1");
      this.rightfing2a = this.rightlowarm.getChild("rightfing2a");
      this.rightfing2b = this.rightfing2a.getChild("rightfing2b");
      this.rightwingflap2 = this.rightfing2a.getChild("rightwingflap2");
      this.rightfing3a = this.rightlowarm.getChild("rightfing3a");
      this.rightfing3b = this.rightfing3a.getChild("rightfing3b");
      this.rightwingflap3 = this.rightfing3a.getChild("rightwingflap3");
      this.MainHead = root.getChild("MainHead");
      this.neck2 = this.MainHead.getChild("neck2");
      this.neckplate2 = this.neck2.getChild("neckplate2");
      this.neck1 = this.neck2.getChild("neck1");
      this.neckplate1 = this.neck1.getChild("neckplate1");
      this.head = this.neck1.getChild("head");
      this.snout = this.head.getChild("snout");
      this.beak = this.snout.getChild("beak");
      this.ironhelmetsnout = this.snout.getChild("ironhelmetsnout");
      this.goldhelmetsnout = this.snout.getChild("goldhelmetsnout");
      this.diamondhelmetsnout = this.snout.getChild("diamondhelmetsnout");
      this.headplate = this.head.getChild("headplate");
      this.righteyesock = this.head.getChild("righteyesock");
      this.lefteyesock = this.head.getChild("lefteyesock");
      this.Jaw = this.head.getChild("Jaw");
      this.leftupjaw = this.head.getChild("leftupjaw");
      this.rightupjaw = this.head.getChild("rightupjaw");
      this.mouthrod = this.head.getChild("mouthrod");
      this.controlrope1 = this.mouthrod.getChild("controlrope1");
      this.controlrope2 = this.mouthrod.getChild("controlrope2");
      this.helmetstrap1 = this.head.getChild("helmetstrap1");
      this.helmetstrap2 = this.head.getChild("helmetstrap2");
      this.rightearskin = this.head.getChild("rightearskin");
      this.rightspine1 = this.rightearskin.getChild("rightspine1");
      this.ironhelmethorn2 = this.rightspine1.getChild("ironhelmethorn2");
      this.goldhelmethorn2 = this.rightspine1.getChild("goldhelmethorn2");
      this.diamondhelmethorn2 = this.rightspine1.getChild("diamondhelmethorn2");
      this.rightspine2 = this.rightearskin.getChild("rightspine2");
      this.rightspine3 = this.rightearskin.getChild("rightspine3");
      this.leftearskin = this.head.getChild("leftearskin");
      this.leftspine1 = this.leftearskin.getChild("leftspine1");
      this.ironhelmethorn1 = this.leftspine1.getChild("ironhelmethorn1");
      this.goldhelmethorn1 = this.leftspine1.getChild("goldhelmethorn1");
      this.diamondhelmethorn1 = this.leftspine1.getChild("diamondhelmethorn1");
      this.leftspine2 = this.leftearskin.getChild("leftspine2");
      this.leftspine3 = this.leftearskin.getChild("leftspine3");
      this.ironhelmet = this.head.getChild("ironhelmet");
      this.goldhelmet = this.head.getChild("goldhelmet");
      this.diamondhelmet = this.head.getChild("diamondhelmet");
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.getRoot();
      PartDefinition back1 = partdefinition.addOrReplaceChild(
         "back1",
         CubeListBuilder.create().texOffs(92, 0).addBox(-3.0F, -2.0F, -12.0F, 6.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 3.0F)
      );
      PartDefinition Tail = partdefinition.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 3.0F));
      PartDefinition tail1 = Tail.addOrReplaceChild(
         "tail1",
         CubeListBuilder.create().texOffs(0, 22).addBox(-4.0F, 0.0F, 0.0F, 8.0F, 8.0F, 10.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3491F, 0.0F, 0.0F)
      );
      PartDefinition back2 = tail1.addOrReplaceChild(
         "back2",
         CubeListBuilder.create().texOffs(100, 14).addBox(-2.0F, -2.0F, 0.0F, 4.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition tail2 = tail1.addOrReplaceChild(
         "tail2",
         CubeListBuilder.create().texOffs(0, 40).addBox(-3.0F, 0.0F, 0.0F, 6.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 10.0F, -0.3491F, 0.0F, 0.0F)
      );
      PartDefinition back3 = tail2.addOrReplaceChild(
         "back3",
         CubeListBuilder.create().texOffs(104, 26).addBox(-1.5F, -2.0F, 0.0F, 3.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition tail3 = tail2.addOrReplaceChild(
         "tail3",
         CubeListBuilder.create().texOffs(0, 55).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 8.0F, 0.0876F, -0.0869F, -0.0076F)
      );
      PartDefinition back4 = tail3.addOrReplaceChild(
         "back4",
         CubeListBuilder.create().texOffs(108, 37).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition tail4 = tail3.addOrReplaceChild(
         "tail4",
         CubeListBuilder.create().texOffs(0, 68).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, -1.0F, 7.0F, 0.1309F, -0.1309F, 0.0F)
      );
      PartDefinition tail5 = tail4.addOrReplaceChild(
         "tail5",
         CubeListBuilder.create().texOffs(0, 80).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 1.0F, 6.0F, 0.0873F, -0.0873F, 0.0F)
      );
      PartDefinition chest = partdefinition.addOrReplaceChild(
         "chest",
         CubeListBuilder.create().texOffs(44, 0).addBox(-4.5F, 2.7F, -13.0F, 9.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, -0.2618F, 0.0F, 0.0F)
      );
      PartDefinition ironchestarmor = chest.addOrReplaceChild(
         "ironchestarmor",
         CubeListBuilder.create().texOffs(0, 128).addBox(-5.5F, 2.2F, -13.5F, 11.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition goldchestarmor = chest.addOrReplaceChild(
         "goldchestarmor",
         CubeListBuilder.create().texOffs(71, 219).addBox(-5.5F, 2.2F, -13.5F, 11.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition diamondchestarmor = chest.addOrReplaceChild(
         "diamondchestarmor",
         CubeListBuilder.create().texOffs(0, 219).addBox(-5.5F, 2.2F, -13.5F, 11.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition neckplate3 = partdefinition.addOrReplaceChild(
         "neckplate3",
         CubeListBuilder.create().texOffs(112, 64).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, -9.0F, 1.0036F, 0.0F, 0.0F)
      );
      PartDefinition neck3 = partdefinition.addOrReplaceChild(
         "neck3",
         CubeListBuilder.create().texOffs(100, 113).addBox(-3.0F, 0.0F, -2.0F, 6.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, -9.0F, -0.6545F, 0.0F, 0.0F)
      );
      PartDefinition rightupleg = partdefinition.addOrReplaceChild(
         "rightupleg",
         CubeListBuilder.create().texOffs(0, 111).addBox(-2.0F, -3.0F, -3.0F, 4.0F, 10.0F, 7.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-5.0F, 6.0F, -2.0F, -0.3927F, 0.0F, 0.0F)
      );
      PartDefinition rightmidleg = rightupleg.addOrReplaceChild(
         "rightmidleg",
         CubeListBuilder.create().texOffs(0, 102).addBox(-1.5F, -2.0F, 0.0F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 5.0F, 4.0F)
      );
      PartDefinition rightlowleg = rightmidleg.addOrReplaceChild(
         "rightlowleg",
         CubeListBuilder.create().texOffs(0, 91).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 2.0F, 3.5F)
      );
      PartDefinition rightfoot = rightlowleg.addOrReplaceChild(
         "rightfoot",
         CubeListBuilder.create().texOffs(44, 121).addBox(-2.0F, -1.0F, -3.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 7.0F, 0.5F, 0.3927F, 0.0F, 0.0F)
      );
      PartDefinition righttoe1 = rightfoot.addOrReplaceChild(
         "righttoe1",
         CubeListBuilder.create().texOffs(96, 35).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-1.5F, 1.0F, -3.0F)
      );
      PartDefinition rightclaw1 = righttoe1.addOrReplaceChild(
         "rightclaw1",
         CubeListBuilder.create().texOffs(100, 26).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.5F, -0.5F, -2.5F, -0.48F, 0.0F, 0.0F)
      );
      PartDefinition righttoe3 = rightfoot.addOrReplaceChild(
         "righttoe3",
         CubeListBuilder.create().texOffs(96, 30).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offset(1.5F, 1.0F, -3.0F)
      );
      PartDefinition rightclaw3 = righttoe3.addOrReplaceChild(
         "rightclaw3",
         CubeListBuilder.create().texOffs(100, 26).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-0.5F, -0.5F, -2.5F, -0.48F, 0.0F, 0.0F)
      );
      PartDefinition righttoe2 = rightfoot.addOrReplaceChild(
         "righttoe2",
         CubeListBuilder.create().texOffs(84, 30).addBox(-1.0F, -1.5F, -4.0F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.5F, -3.0F)
      );
      PartDefinition rightclaw2 = righttoe2.addOrReplaceChild(
         "rightclaw2",
         CubeListBuilder.create().texOffs(100, 26).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.48F, 0.0F, 0.0F)
      );
      PartDefinition ironrightlegarmor = rightlowleg.addOrReplaceChild(
         "ironrightlegarmor",
         CubeListBuilder.create().texOffs(39, 97).addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 2.5F, 0.0F)
      );
      PartDefinition goldrightlegarmor = rightlowleg.addOrReplaceChild(
         "goldrightlegarmor",
         CubeListBuilder.create().texOffs(112, 181).addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 2.5F, 0.0F)
      );
      PartDefinition diamondrightlegarmor = rightlowleg.addOrReplaceChild(
         "diamondrightlegarmor",
         CubeListBuilder.create().texOffs(43, 215).addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 2.5F, 0.0F)
      );
      PartDefinition leftupleg = partdefinition.addOrReplaceChild(
         "leftupleg",
         CubeListBuilder.create().texOffs(0, 111).addBox(-2.0F, -3.0F, -3.0F, 4.0F, 10.0F, 7.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(5.0F, 6.0F, -2.0F, -0.3927F, 0.0F, 0.0F)
      );
      PartDefinition leftmidleg = leftupleg.addOrReplaceChild(
         "leftmidleg",
         CubeListBuilder.create().texOffs(0, 102).addBox(-1.5F, -2.0F, 0.0F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 5.0F, 4.0F)
      );
      PartDefinition leftlowleg = leftmidleg.addOrReplaceChild(
         "leftlowleg",
         CubeListBuilder.create().texOffs(0, 91).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 2.0F, 3.5F)
      );
      PartDefinition leftfoot = leftlowleg.addOrReplaceChild(
         "leftfoot",
         CubeListBuilder.create().texOffs(44, 121).addBox(-2.0F, -1.0F, -3.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 7.0F, 0.5F, 0.3927F, 0.0F, 0.0F)
      );
      PartDefinition lefttoe1 = leftfoot.addOrReplaceChild(
         "lefttoe1",
         CubeListBuilder.create().texOffs(96, 35).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-1.5F, 1.0F, -3.0F)
      );
      PartDefinition leftclaw1 = lefttoe1.addOrReplaceChild(
         "leftclaw1",
         CubeListBuilder.create().texOffs(100, 26).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.5F, -0.5F, -2.5F, -0.48F, 0.0F, 0.0F)
      );
      PartDefinition lefttoe3 = leftfoot.addOrReplaceChild(
         "lefttoe3",
         CubeListBuilder.create().texOffs(96, 30).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offset(1.5F, 1.0F, -3.0F)
      );
      PartDefinition leftclaw3 = lefttoe3.addOrReplaceChild(
         "leftclaw3",
         CubeListBuilder.create().texOffs(100, 26).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-0.5F, -0.5F, -2.5F, -0.48F, 0.0F, 0.0F)
      );
      PartDefinition lefttoe2 = leftfoot.addOrReplaceChild(
         "lefttoe2",
         CubeListBuilder.create().texOffs(84, 30).addBox(-1.0F, -1.5F, -4.0F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.5F, -3.0F)
      );
      PartDefinition leftclaw2 = lefttoe2.addOrReplaceChild(
         "leftclaw2",
         CubeListBuilder.create().texOffs(100, 26).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.48F, 0.0F, 0.0F)
      );
      PartDefinition ironleftlegarmor = leftlowleg.addOrReplaceChild(
         "ironleftlegarmor",
         CubeListBuilder.create().texOffs(39, 97).addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 2.5F, 0.0F)
      );
      PartDefinition goldleftlegarmor = leftlowleg.addOrReplaceChild(
         "goldleftlegarmor",
         CubeListBuilder.create().texOffs(112, 181).addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 2.5F, 0.0F)
      );
      PartDefinition diamondleftlegarmor = leftlowleg.addOrReplaceChild(
         "diamondleftlegarmor",
         CubeListBuilder.create().texOffs(43, 215).addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 2.5F, 0.0F)
      );
      PartDefinition torso = partdefinition.addOrReplaceChild(
         "torso",
         CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, 0.0F, -12.0F, 10.0F, 10.0F, 12.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 3.0F)
      );
      PartDefinition rightshoulder = partdefinition.addOrReplaceChild(
         "rightshoulder",
         CubeListBuilder.create().texOffs(42, 83).addBox(-6.0F, 1.0F, -12.5F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, -0.2618F, 0.0F, 0.0F)
      );
      PartDefinition goldrightshoulder = rightshoulder.addOrReplaceChild(
         "goldrightshoulder",
         CubeListBuilder.create().texOffs(93, 244).addBox(-6.5F, 0.5F, -13.0F, 5.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition ironrightshoulderpad = rightshoulder.addOrReplaceChild(
         "ironrightshoulderpad",
         CubeListBuilder.create().texOffs(74, 201).addBox(-6.5F, 0.5F, -13.0F, 5.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition diamondrightshoulder = rightshoulder.addOrReplaceChild(
         "diamondrightshoulder",
         CubeListBuilder.create().texOffs(22, 244).addBox(-6.5F, 0.5F, -13.0F, 5.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition leftshoulder = partdefinition.addOrReplaceChild(
         "leftshoulder",
         CubeListBuilder.create().texOffs(24, 83).addBox(2.0F, 1.0F, -12.5F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, -0.2618F, 0.0F, 0.0F)
      );
      PartDefinition goldleftshoulder = leftshoulder.addOrReplaceChild(
         "goldleftshoulder",
         CubeListBuilder.create().texOffs(71, 244).addBox(1.5F, 0.5F, -13.0F, 5.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition ironleftshoulderpad = leftshoulder.addOrReplaceChild(
         "ironleftshoulderpad",
         CubeListBuilder.create().texOffs(26, 201).addBox(1.5F, 0.5F, -13.0F, 5.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition diamondleftshoulder = leftshoulder.addOrReplaceChild(
         "diamondleftshoulder",
         CubeListBuilder.create().texOffs(0, 244).addBox(1.5F, 0.5F, -13.0F, 5.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition saddle = partdefinition.addOrReplaceChild(
         "saddle",
         CubeListBuilder.create().texOffs(38, 70).addBox(-3.5F, -2.5F, -8.0F, 7.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 3.0F)
      );
      PartDefinition storage = partdefinition.addOrReplaceChild(
         "storage",
         CubeListBuilder.create().texOffs(28, 59).addBox(-5.0F, -4.5F, 1.5F, 10.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, -0.2182F, 0.0F, 0.0F)
      );
      PartDefinition chestbelt = partdefinition.addOrReplaceChild(
         "chestbelt",
         CubeListBuilder.create().texOffs(0, 201).addBox(-5.5F, -0.5F, -9.0F, 11.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 3.0F)
      );
      PartDefinition stomachbelt = partdefinition.addOrReplaceChild(
         "stomachbelt",
         CubeListBuilder.create().texOffs(0, 201).addBox(-5.5F, -0.5F, -3.0F, 11.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 3.0F)
      );
      PartDefinition LeftWing = partdefinition.addOrReplaceChild(
         "LeftWing", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0F, 1.0F, -8.0F, 0.0574F, -0.8483F, 0.4793F)
      );
      PartDefinition leftuparm = LeftWing.addOrReplaceChild(
         "leftuparm",
         CubeListBuilder.create().texOffs(44, 14).addBox(0.0F, -2.0F, -2.0F, 10.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition leftlowarm = leftuparm.addOrReplaceChild(
         "leftlowarm",
         CubeListBuilder.create().texOffs(72, 14).addBox(0.0F, -2.0F, -2.0F, 10.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(9.0F, 0.0F, 0.0F, 0.0F, 1.3526F, 0.0F)
      );
      PartDefinition leftfing1a = leftlowarm.addOrReplaceChild(
         "leftfing1a",
         CubeListBuilder.create().texOffs(52, 30).addBox(0.0F, 0.0F, -1.0F, 2.0F, 15.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(8.0F, 1.0F, 0.0F, 1.5708F, -0.3054F, 0.0F)
      );
      PartDefinition leftfing1b = leftfing1a.addOrReplaceChild(
         "leftfing1b",
         CubeListBuilder.create().texOffs(52, 47).addBox(0.0F, 0.0F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 13.5F, 0.0F, 0.0F, 0.0F, 0.5236F)
      );
      PartDefinition leftwingflap1 = leftfing1a.addOrReplaceChild(
         "leftwingflap1",
         CubeListBuilder.create()
            .texOffs(74, 153)
            .addBox(3.5F, -3.0F, 0.95F, 14.0F, 24.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(36, 177)
            .mirror()
            .addBox(0.0F, 1.05F, 1.05F, 19.0F, 24.0F, 0.0F, new CubeDeformation(0.0F))
            .mirror(false),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.1781F)
      );
      PartDefinition leftfing2a = leftlowarm.addOrReplaceChild(
         "leftfing2a",
         CubeListBuilder.create().texOffs(44, 30).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 15.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(9.0F, 1.0F, 0.0F, 1.5708F, -0.4363F, 0.0F)
      );
      PartDefinition leftfing2b = leftfing2a.addOrReplaceChild(
         "leftfing2b",
         CubeListBuilder.create().texOffs(44, 47).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 14.0F, 0.0F, 0.0F, 0.0F, 0.5236F)
      );
      PartDefinition leftwingflap2 = leftfing2a.addOrReplaceChild(
         "leftwingflap2",
         CubeListBuilder.create().texOffs(36, 153).addBox(-7.0F, 1.05F, 1.05F, 19.0F, 24.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0908F)
      );
      PartDefinition leftfing3a = leftlowarm.addOrReplaceChild(
         "leftfing3a",
         CubeListBuilder.create().texOffs(36, 30).addBox(-1.0F, 0.0F, 1.0F, 2.0F, 15.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(9.0F, 1.0F, 0.0F, 1.5708F, -0.5236F, 0.0F)
      );
      PartDefinition leftfing3b = leftfing3a.addOrReplaceChild(
         "leftfing3b",
         CubeListBuilder.create().texOffs(36, 47).addBox(-1.0F, 0.0F, 1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 14.0F, 0.0F, 0.0F, 0.0F, 0.5236F)
      );
      PartDefinition leftwingflap3 = leftfing3a.addOrReplaceChild(
         "leftwingflap3",
         CubeListBuilder.create().texOffs(0, 153).addBox(-17.5F, 1.0F, 1.1F, 18.0F, 24.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition leftfing1a2 = leftlowarm.addOrReplaceChild(
         "leftfing1a2", CubeListBuilder.create(), PartPose.offsetAndRotation(9.0F, 1.0F, -1.0F, 1.5708F, -0.0436F, -3.1416F)
      );
      PartDefinition leftfing1b2 = leftfing1a2.addOrReplaceChild("leftfing1b2", CubeListBuilder.create(), PartPose.offset(0.0F, 14.0F, 0.0F));
      PartDefinition RightWing = partdefinition.addOrReplaceChild(
         "RightWing", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0F, 1.0F, -8.0F, 0.0574F, 0.8483F, -0.4793F)
      );
      PartDefinition rightuparm = RightWing.addOrReplaceChild(
         "rightuparm",
         CubeListBuilder.create().texOffs(44, 22).addBox(-10.0F, -2.0F, -2.0F, 10.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition rightlowarm = rightuparm.addOrReplaceChild(
         "rightlowarm",
         CubeListBuilder.create().texOffs(72, 22).addBox(-10.0F, -2.0F, -2.0F, 10.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-9.0F, 0.0F, 0.0F, 0.0F, -1.3526F, 0.0F)
      );
      PartDefinition rightfing1a = rightlowarm.addOrReplaceChild(
         "rightfing1a",
         CubeListBuilder.create().texOffs(36, 30).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 15.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-9.0F, 1.0F, -1.0F, 1.5708F, -0.2618F, -3.1416F)
      );
      PartDefinition rightfing1b = rightfing1a.addOrReplaceChild(
         "rightfing1b",
         CubeListBuilder.create().texOffs(36, 47).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 14.0F, 0.0F, 0.0F, 0.0F, 0.5236F)
      );
      PartDefinition rightwingflap1 = rightfing1a.addOrReplaceChild(
         "rightwingflap1",
         CubeListBuilder.create().texOffs(74, 177).addBox(-17.5F, -3.0F, 0.95F, 14.0F, 24.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 3.1416F, 0.0F, -1.789F)
      );
      PartDefinition rightfing2a = rightlowarm.addOrReplaceChild(
         "rightfing2a",
         CubeListBuilder.create().texOffs(44, 30).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 15.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-9.0F, 1.0F, 0.0F, 1.5708F, 0.4363F, 0.0F)
      );
      PartDefinition rightfing2b = rightfing2a.addOrReplaceChild(
         "rightfing2b",
         CubeListBuilder.create().texOffs(44, 47).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 14.0F, 0.0F, 0.0F, 0.0F, -0.5236F)
      );
      PartDefinition rightwingflap2 = rightfing2a.addOrReplaceChild(
         "rightwingflap2",
         CubeListBuilder.create()
            .texOffs(36, 177)
            .addBox(-19.0F, 1.05F, 1.05F, 19.0F, 24.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(74, 153)
            .mirror()
            .addBox(-17.5F, -3.0F, 0.95F, 14.0F, 24.0F, 0.0F, new CubeDeformation(0.0F))
            .mirror(false)
            .texOffs(36, 153)
            .mirror()
            .addBox(-12.0F, 1.05F, 1.05F, 19.0F, 24.0F, 0.0F, new CubeDeformation(0.0F))
            .mirror(false),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0908F)
      );
      PartDefinition rightfing3a = rightlowarm.addOrReplaceChild(
         "rightfing3a",
         CubeListBuilder.create().texOffs(52, 30).addBox(-1.0F, 0.0F, 1.0F, 2.0F, 15.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-9.0F, 1.0F, 0.0F, 1.5708F, 0.5236F, 0.0F)
      );
      PartDefinition rightfing3b = rightfing3a.addOrReplaceChild(
         "rightfing3b",
         CubeListBuilder.create().texOffs(52, 47).addBox(-1.0F, 0.0F, 1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 14.0F, 0.0F, 0.0F, 0.0F, -0.5236F)
      );
      PartDefinition rightwingflap3 = rightfing3a.addOrReplaceChild(
         "rightwingflap3",
         CubeListBuilder.create().texOffs(0, 177).addBox(-0.5F, 1.0F, 1.1F, 18.0F, 24.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition MainHead = partdefinition.addOrReplaceChild(
         "MainHead", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.0F, -12.0F, -1.0908F, 0.0F, 0.0F)
      );
      PartDefinition neck2 = MainHead.addOrReplaceChild(
         "neck2",
         CubeListBuilder.create().texOffs(102, 99).addBox(-2.5F, -3.0F, -8.0F, 5.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition neckplate2 = neck2.addOrReplaceChild(
         "neckplate2",
         CubeListBuilder.create().texOffs(106, 54).addBox(-1.5F, -2.0F, -8.0F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, -3.0F, 0.0F)
      );
      PartDefinition neck1 = neck2.addOrReplaceChild(
         "neck1",
         CubeListBuilder.create().texOffs(104, 85).addBox(-2.0F, -3.0F, -8.0F, 4.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, -0.5F, -5.5F, 0.5236F, 0.0F, 0.0F)
      );
      PartDefinition neckplate1 = neck1.addOrReplaceChild(
         "neckplate1",
         CubeListBuilder.create().texOffs(80, 108).addBox(-1.0F, -2.0F, -8.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, -3.0F, 0.0F)
      );
      PartDefinition head = neck1.addOrReplaceChild(
         "head",
         CubeListBuilder.create().texOffs(98, 70).addBox(-3.5F, -3.5F, -8.0F, 7.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, -7.0F, 0.7854F, 0.0F, 0.0F)
      );
      PartDefinition snout = head.addOrReplaceChild(
         "snout",
         CubeListBuilder.create().texOffs(72, 70).addBox(-2.0F, -1.5F, -9.0F, 4.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, -1.5F, -8.0F)
      );
      PartDefinition beak = snout.addOrReplaceChild(
         "beak",
         CubeListBuilder.create().texOffs(60, 85).addBox(-1.5F, -2.5F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.8F, -8.0F, 0.0F, 0.7854F, 0.0F)
      );
      PartDefinition ironhelmetsnout = snout.addOrReplaceChild(
         "ironhelmetsnout",
         CubeListBuilder.create().texOffs(0, 144).addBox(-2.5F, -2.0F, -7.0F, 5.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, -1.0F)
      );
      PartDefinition goldhelmetsnout = snout.addOrReplaceChild(
         "goldhelmetsnout",
         CubeListBuilder.create().texOffs(71, 235).addBox(-2.5F, -2.0F, -7.0F, 5.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, -1.0F)
      );
      PartDefinition diamondhelmetsnout = snout.addOrReplaceChild(
         "diamondhelmetsnout",
         CubeListBuilder.create().texOffs(0, 235).addBox(-2.5F, -2.0F, -7.0F, 5.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, -1.0F)
      );
      PartDefinition headplate = head.addOrReplaceChild(
         "headplate",
         CubeListBuilder.create().texOffs(80, 118).addBox(-1.0F, -1.0F, -4.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, -3.0F, -1.0F, 0.0873F, 0.0F, 0.0F)
      );
      PartDefinition righteyesock = head.addOrReplaceChild(
         "righteyesock",
         CubeListBuilder.create().texOffs(70, 108).addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-3.5F, -2.5F, -8.0F)
      );
      PartDefinition lefteyesock = head.addOrReplaceChild(
         "lefteyesock",
         CubeListBuilder.create().texOffs(70, 114).addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offset(2.5F, -2.5F, -8.0F)
      );
      PartDefinition Jaw = head.addOrReplaceChild(
         "Jaw",
         CubeListBuilder.create().texOffs(72, 82).addBox(-2.0F, -1.0F, -9.0F, 4.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 2.5F, -7.5F, -0.1745F, 0.0F, 0.0F)
      );
      PartDefinition leftupjaw = head.addOrReplaceChild(
         "leftupjaw",
         CubeListBuilder.create().texOffs(42, 93).addBox(-1.0F, -1.0F, -6.5F, 2.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(2.0F, 0.0F, -10.5F, -0.1745F, 0.1745F, 0.0F)
      );
      PartDefinition rightupjaw = head.addOrReplaceChild(
         "rightupjaw",
         CubeListBuilder.create().texOffs(72, 93).addBox(-1.0F, -1.0F, -6.5F, 2.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-2.0F, 0.0F, -10.5F, -0.1745F, -0.1745F, 0.0F)
      );
      PartDefinition mouthrod = head.addOrReplaceChild(
         "mouthrod",
         CubeListBuilder.create().texOffs(104, 50).addBox(-5.0F, -1.0F, -1.0F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 1.0F, -8.0F)
      );
      PartDefinition controlrope1 = mouthrod.addOrReplaceChild(
         "controlrope1",
         CubeListBuilder.create().texOffs(66, 43).addBox(0.0F, -2.0F, 0.0F, 0.0F, 4.0F, 23.0F, new CubeDeformation(0.0F)),
         PartPose.offset(4.5F, 1.0F, 0.0F)
      );
      PartDefinition controlrope2 = mouthrod.addOrReplaceChild(
         "controlrope2",
         CubeListBuilder.create().texOffs(66, 43).addBox(0.0F, -2.0F, 0.0F, 0.0F, 4.0F, 23.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-4.5F, 1.0F, 0.0F)
      );
      PartDefinition helmetstrap1 = head.addOrReplaceChild(
         "helmetstrap1",
         CubeListBuilder.create().texOffs(32, 146).addBox(-4.0F, -2.0F, 0.0F, 8.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 2.0F, -7.5F)
      );
      PartDefinition helmetstrap2 = head.addOrReplaceChild(
         "helmetstrap2",
         CubeListBuilder.create().texOffs(32, 141).addBox(-4.0F, -2.0F, 0.0F, 8.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 2.0F, -3.5F)
      );
      PartDefinition rightearskin = head.addOrReplaceChild(
         "rightearskin",
         CubeListBuilder.create().texOffs(112, 201).addBox(0.0F, -4.0F, 0.0F, 0.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-3.0F, -0.5F, 0.0F)
      );
      PartDefinition rightspine1 = rightearskin.addOrReplaceChild(
         "rightspine1",
         CubeListBuilder.create().texOffs(50, 141).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.2618F, 0.0F, 0.0F)
      );
      PartDefinition ironhelmethorn2 = rightspine1.addOrReplaceChild(
         "ironhelmethorn2",
         CubeListBuilder.create().texOffs(106, 128).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.5F, 0.0F, 0.1F)
      );
      PartDefinition goldhelmethorn2 = rightspine1.addOrReplaceChild(
         "goldhelmethorn2",
         CubeListBuilder.create().texOffs(106, 150).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.5F, 0.0F, 0.1F)
      );
      PartDefinition diamondhelmethorn2 = rightspine1.addOrReplaceChild(
         "diamondhelmethorn2",
         CubeListBuilder.create().texOffs(49, 234).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.5F, 0.0F, 0.1F)
      );
      PartDefinition rightspine2 = rightearskin.addOrReplaceChild(
         "rightspine2",
         CubeListBuilder.create().texOffs(50, 141).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition rightspine3 = rightearskin.addOrReplaceChild(
         "rightspine3",
         CubeListBuilder.create().texOffs(50, 141).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, -0.2618F, 0.0F, 0.0F)
      );
      PartDefinition leftearskin = head.addOrReplaceChild(
         "leftearskin",
         CubeListBuilder.create().texOffs(96, 201).addBox(0.0F, -4.0F, 0.0F, 0.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
         PartPose.offset(3.0F, -0.5F, 0.0F)
      );
      PartDefinition leftspine1 = leftearskin.addOrReplaceChild(
         "leftspine1",
         CubeListBuilder.create().texOffs(68, 141).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.2618F, 0.0F, 0.0F)
      );
      PartDefinition ironhelmethorn1 = leftspine1.addOrReplaceChild(
         "ironhelmethorn1",
         CubeListBuilder.create().texOffs(106, 139).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-0.5F, 0.0F, 0.1F)
      );
      PartDefinition goldhelmethorn1 = leftspine1.addOrReplaceChild(
         "goldhelmethorn1",
         CubeListBuilder.create().texOffs(106, 161).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-0.5F, 0.0F, 0.1F)
      );
      PartDefinition diamondhelmethorn1 = leftspine1.addOrReplaceChild(
         "diamondhelmethorn1",
         CubeListBuilder.create().texOffs(49, 245).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-0.5F, 0.0F, 0.1F)
      );
      PartDefinition leftspine2 = leftearskin.addOrReplaceChild(
         "leftspine2",
         CubeListBuilder.create().texOffs(68, 141).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition leftspine3 = leftearskin.addOrReplaceChild(
         "leftspine3",
         CubeListBuilder.create().texOffs(68, 141).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, -0.2618F, 0.0F, 0.0F)
      );
      PartDefinition ironhelmet = head.addOrReplaceChild(
         "ironhelmet",
         CubeListBuilder.create().texOffs(32, 128).addBox(-4.0F, -4.0F, -9.0F, 8.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition goldhelmet = head.addOrReplaceChild(
         "goldhelmet",
         CubeListBuilder.create().texOffs(94, 226).addBox(-4.0F, -4.0F, -9.0F, 8.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition diamondhelmet = head.addOrReplaceChild(
         "diamondhelmet",
         CubeListBuilder.create().texOffs(23, 226).addBox(-4.0F, -4.0F, -9.0F, 8.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      return LayerDefinition.create(meshdefinition, 128, 256);
   }

   public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
      this.back1.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
      this.Tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
      this.chest.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
      this.neckplate3.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
      this.neck3.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
      this.rightupleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
      this.leftupleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
      this.torso.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
      this.rightshoulder.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
      this.leftshoulder.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
      this.saddle.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
      this.storage.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
      this.chestbelt.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
      this.stomachbelt.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
      this.LeftWing.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
      this.RightWing.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
      this.MainHead.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
   }

   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
   }
}
