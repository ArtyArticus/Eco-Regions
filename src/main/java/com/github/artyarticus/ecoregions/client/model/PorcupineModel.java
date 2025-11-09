package com.github.artyarticus.ecoregions.client.model;

import com.github.artyarticus.ecoregions.entity.PorcupineEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class PorcupineModel extends ZawaBaseModel<PorcupineEntity> {
    public ModelPart Chest;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Chest);
        }

        return this.parts;
    }

    public static class Adult extends PorcupineModel {

        public ModelPart Body;
        public ModelPart ChestConnectionTop;
        public ModelPart Neck;
        public ModelPart ArmBaseLeft;
        public ModelPart ArmBaseRight;
        public ModelPart Hips;
        public ModelPart ThighLeft;
        public ModelPart ThighRight;
        public ModelPart TailBase;
        public ModelPart QuillHipConnector;
        public ModelPart LegLeft;
        public ModelPart FootLeft;
        public ModelPart LegRight;
        public ModelPart FootRight;
        public ModelPart Tail;
        public ModelPart TailSpikeLeft;
        public ModelPart TailSpikeRight;
        public ModelPart TailSpikeMiddle;
        public ModelPart TailSpikeTop;
        public ModelPart TailSpikeBottom;
        public ModelPart QuillsHipLeft;
        public ModelPart QuillsHipRight1;
        public ModelPart QuillsHipLeft_1;
        public ModelPart QuillsHipRight2;
        public ModelPart QuillsHipLeft_2;
        public ModelPart QuillsHipLeft_3;
        public ModelPart QuillsHipLeft_4;
        public ModelPart QuillsHipRight3;
        public ModelPart QuillsHipRight4;
        public ModelPart QuillsHipRight5;
        public ModelPart NeckLower;
        public ModelPart Head;
        public ModelPart MouthRight;
        public ModelPart MouthLeft;
        public ModelPart Snout;
        public ModelPart Jaw;
        public ModelPart EarLeft;
        public ModelPart EarRight;
        public ModelPart HeadCrestMiddle;
        public ModelPart CheekRight;
        public ModelPart CheekLeft;
        public ModelPart Nose;
        public ModelPart HeadCrestLeft;
        public ModelPart HeadCrestRight;
        public ModelPart ArmLeft;
        public ModelPart HandLeft;
        public ModelPart ArmRight;
        public ModelPart HandRight;

        public Adult(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.Body = this.Chest.getChild("Body");
            this.Hips = this.Body.getChild("Hips");
            this.QuillHipConnector = this.Hips.getChild("QuillHipConnector");
            this.QuillsHipRight1 = this.QuillHipConnector.getChild("QuillsHipRight1");

            this.QuillsHipRight2 = this.QuillHipConnector.getChild("QuillsHipRight2");
            this.QuillsHipRight3 = this.QuillsHipRight2.getChild("QuillsHipRight3");
            this.QuillsHipRight4 = this.QuillsHipRight3.getChild("QuillsHipRight4");
            this.QuillsHipRight5 = this.QuillsHipRight4.getChild("QuillsHipRight5");

            this.QuillsHipLeft = this.QuillHipConnector.getChild("QuillsHipLeft");

            this.QuillsHipLeft_1 = this.QuillHipConnector.getChild("QuillsHipLeft_1");
            this.QuillsHipLeft_2 = this.QuillsHipLeft_1.getChild("QuillsHipLeft_2");
            this.QuillsHipLeft_3 = this.QuillsHipLeft_2.getChild("QuillsHipLeft_3");
            this.QuillsHipLeft_4 = this.QuillsHipLeft_3.getChild("QuillsHipLeft_4");

            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.LegLeft = this.ThighLeft.getChild("LegLeft");
            this.FootLeft = this.LegLeft.getChild("FootLeft");

            this.ThighRight = this.Hips.getChild("ThighRight");
            this.LegRight = this.ThighRight.getChild("LegRight");
            this.FootRight = this.LegRight.getChild("FootRight");

            this.TailBase = this.Hips.getChild("TailBase");
            this.Tail = this.TailBase.getChild("Tail");
            this.TailSpikeTop = this.Tail.getChild("TailSpikeTop");

            this.TailSpikeBottom = this.Tail.getChild("TailSpikeBottom");

            this.TailSpikeRight = this.Tail.getChild("TailSpikeRight");

            this.TailSpikeLeft = this.Tail.getChild("TailSpikeLeft");

            this.TailSpikeMiddle = this.Tail.getChild("TailSpikeMiddle");

            this.ArmBaseRight = this.Chest.getChild("ArmBaseRight");
            this.ArmRight = this.ArmBaseRight.getChild("ArmRight");
            this.HandRight = this.ArmRight.getChild("HandRight");

            this.ArmBaseLeft = this.Chest.getChild("ArmBaseLeft");
            this.ArmLeft = this.ArmBaseLeft.getChild("ArmLeft");
            this.HandLeft = this.ArmLeft.getChild("HandLeft");

            this.Neck = this.Chest.getChild("Neck");
            this.NeckLower = this.Neck.getChild("NeckLower");

            this.Head = this.Neck.getChild("Head");
            this.MouthLeft = this.Head.getChild("MouthLeft");

            this.Snout = this.Head.getChild("Snout");
            this.Nose = this.Snout.getChild("Nose");

            this.EarLeft = this.Head.getChild("EarLeft");

            this.HeadCrestMiddle = this.Head.getChild("HeadCrestMiddle");
            this.HeadCrestRight = this.HeadCrestMiddle.getChild("HeadCrestRight");

            this.HeadCrestLeft = this.HeadCrestMiddle.getChild("HeadCrestLeft");

            this.EarRight = this.Head.getChild("EarRight");

            this.Jaw = this.Head.getChild("Jaw");

            this.CheekRight = this.Head.getChild("CheekRight");

            this.MouthRight = this.Head.getChild("MouthRight");

            this.CheekLeft = this.Head.getChild("CheekLeft");

            this.ChestConnectionTop = this.Chest.getChild("ChestConnectionTop");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Chest = partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(42, 0).addBox(-3.5F, -3.5F, -2.0F, 7.0F, 7.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 16.9F, -4.0F, 0.13665927909957545F, 0.0F, 0.0F));
            PartDefinition Body = Chest.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(32, 11).addBox(-4.0F, -1.0F, 0.0F, 8.0F, 8.0F, 8.0F), PartPose.offsetAndRotation(0.0F, -3.0F, 1.5F, -0.13665927909957545F, 0.0F, 0.0F));
            PartDefinition Hips = Body.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(38, 27).addBox(-4.5F, -0.6F, 0.0F, 9.0F, 8.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -0.5F, 7.5F, -0.13665927909957545F, 0.0F, 0.0F));
            PartDefinition QuillHipConnector = Hips.addOrReplaceChild("QuillHipConnector", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 0.2275909337942703F, 0.0F, 0.0F));
            PartDefinition QuillsHipRight1 = QuillHipConnector.addOrReplaceChild("QuillsHipRight1", CubeListBuilder.create().texOffs(0, 40).addBox(-0.5F, -6.0F, -3.0F, 1.0F, 9.0F, 14.0F), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, 0.3642502295386026F, -0.0911061832922575F, -0.03710113380784196F));

            PartDefinition QuillsHipRight2 = QuillHipConnector.addOrReplaceChild("QuillsHipRight2", CubeListBuilder.create().texOffs(0, 40).addBox(-0.5F, -6.0F, -3.0F, 1.0F, 9.0F, 14.0F), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 0.3642502295386026F, -0.18203784630933073F, -0.27314402127920984F));
            PartDefinition QuillsHipRight3 = QuillsHipRight2.addOrReplaceChild("QuillsHipRight3", CubeListBuilder.create().texOffs(0, 40).addBox(-0.5F, -6.0F, -3.0F, 1.0F, 9.0F, 14.0F), PartPose.offsetAndRotation(-1.0F, 0.1F, -0.1F, -0.04555309164612875F, -0.04555309164612875F, 0.0F));
            PartDefinition QuillsHipRight4 = QuillsHipRight3.addOrReplaceChild("QuillsHipRight4", CubeListBuilder.create().texOffs(0, 40).addBox(-0.5F, -6.0F, -3.0F, 1.0F, 9.0F, 14.0F), PartPose.offsetAndRotation(-1.2F, 0.1F, -0.3F, -0.0911061832922575F, -0.04555309164612875F, 0.0F));
            PartDefinition QuillsHipRight5 = QuillsHipRight4.addOrReplaceChild("QuillsHipRight5", CubeListBuilder.create().texOffs(0, 40).addBox(-0.5F, -6.0F, -3.0F, 1.0F, 9.0F, 14.0F), PartPose.offsetAndRotation(-1.2F, 0.2F, -0.3F, -0.0911061832922575F, -0.04555309164612875F, 0.0F));

            PartDefinition QuillsHipLeft = QuillHipConnector.addOrReplaceChild("QuillsHipLeft", CubeListBuilder.create().texOffs(0, 40).addBox(-0.5F, -6.0F, -3.0F, 1.0F, 9.0F, 14.0F), PartPose.offsetAndRotation(0.5F, 0.0F, 0.0F, 0.3642502295386026F, 0.0911061832922575F, 0.04555309164612875F));

            PartDefinition QuillsHipLeft_1 = QuillHipConnector.addOrReplaceChild("QuillsHipLeft_1", CubeListBuilder.create().texOffs(0, 40).addBox(-0.5F, -6.0F, -3.0F, 1.0F, 9.0F, 14.0F), PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, 0.3642502295386026F, 0.18203784630933073F, 0.27314402127920984F));
            PartDefinition QuillsHipLeft_2 = QuillsHipLeft_1.addOrReplaceChild("QuillsHipLeft_2", CubeListBuilder.create().texOffs(0, 40).addBox(-0.5F, -6.0F, -3.0F, 1.0F, 9.0F, 14.0F), PartPose.offsetAndRotation(1.0F, 0.1F, -0.1F, -0.04555309164612875F, 0.04555309164612875F, 0.0F));
            PartDefinition QuillsHipLeft_3 = QuillsHipLeft_2.addOrReplaceChild("QuillsHipLeft_3", CubeListBuilder.create().texOffs(0, 40).addBox(-0.5F, -6.0F, -3.0F, 1.0F, 9.0F, 14.0F), PartPose.offsetAndRotation(1.2F, 0.1F, -0.3F, -0.0911061832922575F, 0.04555309164612875F, 0.0F));
            PartDefinition QuillsHipLeft_4 = QuillsHipLeft_3.addOrReplaceChild("QuillsHipLeft_4", CubeListBuilder.create().texOffs(0, 40).addBox(-0.5F, -6.0F, -3.0F, 1.0F, 9.0F, 14.0F), PartPose.offsetAndRotation(1.2F, 0.2F, -0.3F, -0.0911061832922575F, 0.04555309164612875F, 0.0F));

            PartDefinition ThighLeft = Hips.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(8, 0).mirror(true).addBox(-1.5F, 0.0F, -2.5F, 3.0F, 6.0F, 4.0F), PartPose.offsetAndRotation(3.6F, 1.2F, 1.9F, 0.0911061832922575F, 0.0F, 0.0F));
            PartDefinition LegLeft = ThighLeft.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(8, 10).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 5.5F, -2.0F, 0.27314402127920984F, 0.0F, 0.0F));
            PartDefinition FootLeft = LegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(0, 17).mirror(true).addBox(-1.0F, 0.0F, -3.5F, 2.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(-0.01F, 3.5F, 1.5F, -0.2275909337942703F, 0.0F, 0.0F));

            PartDefinition ThighRight = Hips.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(8, 0).addBox(-1.5F, 0.0F, -2.5F, 3.0F, 6.0F, 4.0F), PartPose.offsetAndRotation(-3.6F, 1.2F, 1.9F, 0.0911061832922575F, 0.0F, 0.0F));
            PartDefinition LegRight = ThighRight.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(8, 10).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 5.5F, -2.0F, 0.27314402127920984F, 0.0F, 0.0F));
            PartDefinition FootRight = LegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(0, 17).addBox(-1.0F, 0.0F, -3.5F, 2.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(-0.01F, 3.5F, 1.5F, -0.2275909337942703F, 0.0F, 0.0F));

            PartDefinition TailBase = Hips.addOrReplaceChild("TailBase", CubeListBuilder.create().texOffs(37, 39).addBox(-1.5F, -0.5F, 0.0F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 3.5F, -0.6373942508178124F, 0.0F, 0.0F));
            PartDefinition Tail = TailBase.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(51, 39).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 2.5F, 0.500909508638178F, 0.0F, 0.0F));
            PartDefinition TailSpikeTop = Tail.addOrReplaceChild("TailSpikeTop", CubeListBuilder.create().texOffs(0, 41).addBox(-1.5F, -0.2F, 0.0F, 3.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, 0.4098033003787853F, 0.0F, 0.0F));

            PartDefinition TailSpikeBottom = Tail.addOrReplaceChild("TailSpikeBottom", CubeListBuilder.create().texOffs(0, 41).addBox(-1.5F, -0.5F, 0.0F, 3.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 2.0F, 3.0F, -0.4098033003787853F, 0.0F, 0.0F));

            PartDefinition TailSpikeRight = Tail.addOrReplaceChild("TailSpikeRight", CubeListBuilder.create().texOffs(0, 46).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.5F, 3.0F, 0.0F, -0.3642502295386026F, 0.0F));

            PartDefinition TailSpikeLeft = Tail.addOrReplaceChild("TailSpikeLeft", CubeListBuilder.create().texOffs(0, 46).addBox(0.0F, -1.0F, 0.0F, 1.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.5F, 3.0F, 0.0F, 0.3642502295386026F, 0.0F));

            PartDefinition TailSpikeMiddle = Tail.addOrReplaceChild("TailSpikeMiddle", CubeListBuilder.create().texOffs(0, 46).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 3.0F, 3.0F), PartPose.offset(0.0F, 0.5F, 3.0F));

            PartDefinition ArmBaseRight = Chest.addOrReplaceChild("ArmBaseRight", CubeListBuilder.create().texOffs(27, 0).addBox(-0.9F, 0.0F, -2.5F, 3.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(-3.0F, -0.2F, 1.0F, -0.04555309164612875F, 0.0F, 0.0F));
            PartDefinition ArmRight = ArmBaseRight.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(29, 8).addBox(-1.0F, 0.0F, -2.5F, 2.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.6F, 3.5F, 0.5F, -0.13665927909957545F, 0.0F, 0.0F));
            PartDefinition HandRight = ArmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(21, 13).addBox(-1.0F, -0.5F, -3.5F, 2.0F, 1.0F, 4.0F), PartPose.offsetAndRotation(0.01F, 3.5F, -0.5F, 0.04555309164612875F, 0.0F, 0.0F));

            PartDefinition ArmBaseLeft = Chest.addOrReplaceChild("ArmBaseLeft", CubeListBuilder.create().texOffs(27, 0).mirror(true).addBox(-2.1F, 0.0F, -2.5F, 3.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(3.0F, -0.2F, 1.0F, -0.04555309164612875F, 0.0F, 0.0F));
            PartDefinition ArmLeft = ArmBaseLeft.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(29, 8).mirror(true).addBox(-1.0F, 0.0F, -2.5F, 2.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(-0.6F, 3.5F, 0.5F, -0.13665927909957545F, 0.0F, 0.0F));
            PartDefinition HandLeft = ArmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(21, 13).mirror(true).addBox(-1.0F, -0.5F, -3.5F, 2.0F, 1.0F, 4.0F), PartPose.offsetAndRotation(-0.01F, 3.5F, -0.5F, 0.04555309164612875F, 0.0F, 0.0F));

            PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(37, 46).addBox(-3.0F, -0.5F, -3.8F, 6.0F, 5.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -3.0F, -1.0F, 0.18203784630933073F, 0.0F, 0.0F));
            PartDefinition NeckLower = Neck.addOrReplaceChild("NeckLower", CubeListBuilder.create().texOffs(44, 56).addBox(-2.1F, -1.3F, -4.0F, 4.0F, 2.0F, 6.0F), PartPose.offsetAndRotation(0.0F, 5.0F, -1.5F, -0.3642502295386026F, 0.0F, 0.0F));

            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(17, 37).addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F), PartPose.offset(0.0F, 2.1F, -5.3F));
            PartDefinition MouthLeft = Head.addOrReplaceChild("MouthLeft", CubeListBuilder.create().texOffs(16, 48).mirror(true).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.7F, 0.0F, -2.0F, 0.2275909337942703F, 0.0F, 0.0911061832922575F));

            PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(31, 57).addBox(-1.5F, -1.0F, -2.0F, 3.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -1.0F, -2.6F, 0.3642502295386026F, 0.0F, 0.0F));
            PartDefinition Nose = Snout.addOrReplaceChild("Nose", CubeListBuilder.create().texOffs(38, 62).addBox(-1.0F, -0.5F, -1.3F, 2.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -0.6F, -1.5F, 0.2275909337942703F, 0.0F, 0.0F));

            PartDefinition EarLeft = Head.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(29, 31).mirror(true).addBox(-1.0F, -2.5F, -0.5F, 2.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(2.0F, -0.5F, 1.5F, 0.18203784630933073F, -0.8651597048872669F, 0.4098033003787853F));

            PartDefinition HeadCrestMiddle = Head.addOrReplaceChild("HeadCrestMiddle", CubeListBuilder.create().texOffs(3, 19).addBox(-0.5F, -7.5F, -2.0F, 1.0F, 7.0F, 11.0F), PartPose.offsetAndRotation(0.0F, 3.0F, 2.5F, 0.0911061832922575F, 0.0F, 0.0F));
            PartDefinition HeadCrestRight = HeadCrestMiddle.addOrReplaceChild("HeadCrestRight", CubeListBuilder.create().texOffs(3, 19).addBox(-0.5F, -7.0F, -2.0F, 1.0F, 7.0F, 11.0F), PartPose.offsetAndRotation(-0.5F, -0.4F, 0.1F, 0.0F, -0.04555309164612875F, -0.04555309164612875F));

            PartDefinition HeadCrestLeft = HeadCrestMiddle.addOrReplaceChild("HeadCrestLeft", CubeListBuilder.create().texOffs(3, 19).mirror(true).addBox(-0.5F, -7.0F, -2.0F, 1.0F, 7.0F, 11.0F), PartPose.offsetAndRotation(0.5F, -0.4F, 0.1F, 0.0F, 0.04555309164612875F, 0.04555309164612875F));

            PartDefinition EarRight = Head.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(29, 31).addBox(-1.0F, -2.5F, -0.5F, 2.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(-2.0F, -0.5F, 1.5F, 0.18203784630933073F, 0.8651597048872669F, -0.4098033003787853F));

            PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create().texOffs(25, 47).addBox(-1.5F, -0.5F, -2.5F, 3.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 1.8F, -2.1F, -0.13665927909957545F, 0.0F, 0.0F));

            PartDefinition CheekRight = Head.addOrReplaceChild("CheekRight", CubeListBuilder.create().texOffs(17, 20).addBox(-1.0F, -1.0F, -2.0F, 3.0F, 3.0F, 4.0F), PartPose.offsetAndRotation(-1.8F, 0.6F, -0.6F, 0.0F, -0.04555309164612875F, 0.13665927909957545F));

            PartDefinition MouthRight = Head.addOrReplaceChild("MouthRight", CubeListBuilder.create().texOffs(16, 48).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(-0.7F, 0.0F, -2.0F, 0.2275909337942703F, 0.0F, -0.0911061832922575F));

            PartDefinition CheekLeft = Head.addOrReplaceChild("CheekLeft", CubeListBuilder.create().texOffs(17, 20).mirror(true).addBox(-2.0F, -1.0F, -2.0F, 3.0F, 3.0F, 4.0F), PartPose.offsetAndRotation(1.8F, 0.6F, -0.6F, 0.0F, 0.04555309164612875F, -0.13665927909957545F));

            PartDefinition ChestConnectionTop = Chest.addOrReplaceChild("ChestConnectionTop", CubeListBuilder.create().texOffs(42, 0).addBox(-3.5F, -1.5F, -3.5F, 7.0F, 1.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -2.4F, 1.6F, 0.0911061832922575F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 64, 64);
        }

        @Override
        public void setupAnim(PorcupineEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
            this.Head.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
        }

        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0F;
            float degree = 1.0F;
            this.Head.xRot = Mth.cos(7.0F + limbSwing * speed * 0.05F + 3.1415927F) * degree * 0.3F * limbSwingAmount * 0.5F;
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.05F + 3.1415927F) * degree * -0.3F * limbSwingAmount * 0.5F + 0.18F;
            this.Tail.xRot = Mth.cos(6.5F + limbSwing * speed * 0.1F + 3.1415927F) * degree * 0.2F * limbSwingAmount * 0.5F + 0.5F;
            this.Tail.yRot = Mth.cos(4.0F + limbSwing * speed * 0.05F + 3.1415927F) * degree * -0.3F * limbSwingAmount * 0.5F;
        }

        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 0.8F;
            float degree = 0.8F;
            this.Head.xRot = Mth.cos(6.0F + limbSwing * speed * 0.5F + 3.1415927F) * degree * -0.3F * limbSwingAmount * 0.5F;
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.5F + 3.1415927F) * degree * -0.3F * limbSwingAmount * 0.5F + 0.18F;
            this.Chest.xRot = Mth.cos(2.0F + limbSwing * speed * 0.5F + 3.1415927F) * degree * 0.2F * limbSwingAmount * 0.5F + 0.14F;
            this.Body.xRot = Mth.cos(3.0F + limbSwing * speed * 0.5F + 3.1415927F) * degree * 0.1F * limbSwingAmount * 0.5F - 0.14F;
            this.Hips.xRot = Mth.cos(3.0F + limbSwing * speed * 0.5F + 3.1415927F) * degree * -0.3F * limbSwingAmount * 0.5F - 0.14F;
            this.Tail.xRot = Mth.cos(6.5F + limbSwing * speed * 0.5F + 3.1415927F) * degree * 0.2F * limbSwingAmount * 0.5F + 0.5F;
            this.Tail.yRot = Mth.cos(4.0F + limbSwing * speed * 0.25F + 3.1415927F) * degree * -0.5F * limbSwingAmount * 0.5F;

            this.ArmBaseLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.25F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F - 0.05F;
            this.ArmLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.25F + 3.1415927F) * degree * 1.2F * limbSwingAmount * 0.5F - 0.14F;
            this.HandLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.25F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F + 0.05F;
            this.ArmBaseRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.25F + 3.1415927F) * degree * 1.5F * limbSwingAmount * 0.5F - 0.05F;
            this.ArmRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.25F + 3.1415927F) * degree * -1.2F * limbSwingAmount * 0.5F - 0.14F;
            this.HandRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.25F + 3.1415927F) * degree * 1.5F * limbSwingAmount * 0.5F + 0.05F;

            this.ThighLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.25F + 3.1415927F) * degree * 3.0F * limbSwingAmount * 0.5F + 0.09F;
            this.ThighLeft.y = Mth.cos(1.0F + limbSwing * speed * 0.25F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F + 1.2F;
            this.LegLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.25F + 3.1415927F) * degree * 3.0F * limbSwingAmount * 0.5F + 0.27F;
            this.FootLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.25F + 3.1415927F) * degree * -1.0F * limbSwingAmount * 0.5F - 0.23F;
            this.ThighRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.25F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.09F;
            this.ThighRight.y = Mth.cos(1.0F + limbSwing * speed * 0.25F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 1.2F;
            this.LegRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.25F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.27F;
            this.FootRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.25F + 3.1415927F) * degree * 1.0F * limbSwingAmount * 0.5F - 0.23F;
        }
    }

    public static class Child extends PorcupineModel {

        public ModelPart Neck;
        public ModelPart ArmBaseLeft;
        public ModelPart Hip;
        public ModelPart ArmBaseRight;
        public ModelPart Head;
        public ModelPart EarLeft;
        public ModelPart EarRight;
        public ModelPart Snout;
        public ModelPart Mouth;
        public ModelPart Crest;
        public ModelPart NoseR;
        public ModelPart NoseL;
        public ModelPart Nose;
        public ModelPart ArmLeft;
        public ModelPart HandLeft;
        public ModelPart ThighLeft;
        public ModelPart Tail;
        public ModelPart ThighRight;
        public ModelPart QuillConnection;
        public ModelPart LegLeft;
        public ModelPart FootLeft;
        public ModelPart LegRight;
        public ModelPart FootRight;
        public ModelPart QuillsHipLeft3;
        public ModelPart QuillsHipLeft2;
        public ModelPart QuillsHipLeft1;
        public ModelPart QuillsHipRight3;
        public ModelPart QuillsHipRight2;
        public ModelPart QuillsHipRight1;
        public ModelPart QuillsHipMiddle;
        public ModelPart ArmRight;
        public ModelPart HandRight;

        public Child(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.Hip = this.Chest.getChild("Hip");
            this.Tail = this.Hip.getChild("Tail");

            this.ThighRight = this.Hip.getChild("ThighRight");
            this.LegRight = this.ThighRight.getChild("LegRight");
            this.FootRight = this.LegRight.getChild("FootRight");

            this.ThighLeft = this.Hip.getChild("ThighLeft");
            this.LegLeft = this.ThighLeft.getChild("LegLeft");
            this.FootLeft = this.LegLeft.getChild("FootLeft");

            this.QuillConnection = this.Hip.getChild("QuillConnection");
            this.QuillsHipMiddle = this.QuillConnection.getChild("QuillsHipMiddle");

            this.QuillsHipLeft1 = this.QuillConnection.getChild("QuillsHipLeft1");

            this.QuillsHipRight1 = this.QuillConnection.getChild("QuillsHipRight1");

            this.QuillsHipRight3 = this.QuillConnection.getChild("QuillsHipRight3");

            this.QuillsHipRight2 = this.QuillConnection.getChild("QuillsHipRight2");

            this.QuillsHipLeft3 = this.QuillConnection.getChild("QuillsHipLeft3");

            this.QuillsHipLeft2 = this.QuillConnection.getChild("QuillsHipLeft2");

            this.ArmBaseRight = this.Chest.getChild("ArmBaseRight");
            this.ArmRight = this.ArmBaseRight.getChild("ArmRight");
            this.HandRight = this.ArmRight.getChild("HandRight");

            this.ArmBaseLeft = this.Chest.getChild("ArmBaseLeft");
            this.ArmLeft = this.ArmBaseLeft.getChild("ArmLeft");
            this.HandLeft = this.ArmLeft.getChild("HandLeft");

            this.Neck = this.Chest.getChild("Neck");
            this.Head = this.Neck.getChild("Head");
            this.Crest = this.Head.getChild("Crest");

            this.Snout = this.Head.getChild("Snout");
            this.NoseR = this.Snout.getChild("NoseR");
            this.Nose = this.NoseR.getChild("Nose");

            this.NoseL = this.NoseR.getChild("NoseL");

            this.EarLeft = this.Head.getChild("EarLeft");

            this.Mouth = this.Head.getChild("Mouth");

            this.EarRight = this.Head.getChild("EarRight");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Chest = partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 7).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 21.5F, 0.0F, 0.04555309164612875F, 0.0F, 0.0F));
            PartDefinition Hip = Chest.addOrReplaceChild("Hip", CubeListBuilder.create().texOffs(0, 0).addBox(-1.9F, -0.5F, -0.2F, 4.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -1.1F, 0.5F, -0.18203784630933073F, 0.0F, 0.0F));
            PartDefinition Tail = Hip.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(0, 22).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 2.3F, -0.5462880425584197F, 0.0F, 0.0F));

            PartDefinition ThighRight = Hip.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(11, 7).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-1.5F, 0.5F, 1.5F, 0.04555309164612875F, 0.0F, 0.0F));
            PartDefinition LegRight = ThighRight.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(19, 9).mirror(true).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.1F, 2.0F, -0.8F, 0.5462880425584197F, 0.0F, 0.0F));
            PartDefinition FootRight = LegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(17, 5).mirror(true).addBox(-0.5F, -0.5F, -1.6F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.02F, 1.0F, 0.4F, -0.3642502295386026F, 0.0F, 0.0F));

            PartDefinition ThighLeft = Hip.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(11, 7).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(1.5F, 0.5F, 1.5F, 0.04555309164612875F, 0.0F, 0.0F));
            PartDefinition LegLeft = ThighLeft.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(19, 9).mirror(true).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.1F, 2.0F, -0.8F, 0.5462880425584197F, 0.0F, 0.0F));
            PartDefinition FootLeft = LegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(17, 5).mirror(true).addBox(-0.5F, -0.5F, -1.6F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-0.02F, 1.0F, 0.4F, -0.3642502295386026F, 0.0F, 0.0F));

            PartDefinition QuillConnection = Hip.addOrReplaceChild("QuillConnection", CubeListBuilder.create().texOffs(19, 0).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.7F, 0.7F, 0.18203784630933073F, 0.0F, 0.0F));
            PartDefinition QuillsHipMiddle = QuillConnection.addOrReplaceChild("QuillsHipMiddle", CubeListBuilder.create().texOffs(0, 15).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -0.4F, 0.0F, 0.3642502295386026F, 0.0F, 0.0F));

            PartDefinition QuillsHipLeft1 = QuillConnection.addOrReplaceChild("QuillsHipLeft1", CubeListBuilder.create().texOffs(0, 15).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.4F, -0.3F, -0.1F, 0.3642502295386026F, 0.18203784630933073F, 0.0F));

            PartDefinition QuillsHipRight1 = QuillConnection.addOrReplaceChild("QuillsHipRight1", CubeListBuilder.create().texOffs(0, 15).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(-0.4F, -0.3F, -0.1F, 0.3642502295386026F, -0.18203784630933073F, 0.0F));

            PartDefinition QuillsHipRight3 = QuillConnection.addOrReplaceChild("QuillsHipRight3", CubeListBuilder.create().texOffs(0, 15).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(-1.7F, 0.2F, -0.3F, 0.3642502295386026F, -0.18203784630933073F, 0.0F));

            PartDefinition QuillsHipRight2 = QuillConnection.addOrReplaceChild("QuillsHipRight2", CubeListBuilder.create().texOffs(0, 15).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(-1.0F, -0.1F, -0.2F, 0.3642502295386026F, -0.18203784630933073F, 0.0F));

            PartDefinition QuillsHipLeft3 = QuillConnection.addOrReplaceChild("QuillsHipLeft3", CubeListBuilder.create().texOffs(0, 15).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(1.7F, 0.2F, -0.3F, 0.3642502295386026F, 0.18203784630933073F, 0.0F));

            PartDefinition QuillsHipLeft2 = QuillConnection.addOrReplaceChild("QuillsHipLeft2", CubeListBuilder.create().texOffs(0, 15).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(1.0F, -0.1F, -0.2F, 0.3642502295386026F, 0.18203784630933073F, 0.0F));

            PartDefinition ArmBaseRight = Chest.addOrReplaceChild("ArmBaseRight", CubeListBuilder.create().texOffs(18, 14).mirror(true).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-1.3F, 0.7F, -0.9F, 0.13962634015954636F, 0.0F, 0.0F));
            PartDefinition ArmRight = ArmBaseRight.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(14, 14).mirror(true).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.02F, 1.0F, 0.5F, -0.47123889803846897F, 0.0F, 0.0F));
            PartDefinition HandRight = ArmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(10, 14).mirror(true).addBox(-0.5F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.02F, 1.0F, -0.6F, 0.3186971254089062F, 0.0F, 0.0F));

            PartDefinition ArmBaseLeft = Chest.addOrReplaceChild("ArmBaseLeft", CubeListBuilder.create().texOffs(18, 14).mirror(true).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(1.3F, 0.7F, -0.9F, 0.13962634015954636F, 0.0F, 0.0F));
            PartDefinition ArmLeft = ArmBaseLeft.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(14, 14).mirror(true).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.02F, 1.0F, 0.5F, -0.47123889803846897F, 0.0F, 0.0F));
            PartDefinition HandLeft = ArmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(10, 14).mirror(true).addBox(-0.5F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.02F, 1.0F, -0.6F, 0.3186971254089062F, 0.0F, 0.0F));

            PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(14, 21).addBox(-1.0F, -0.7F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -0.8F, -1.5F, -0.2275909337942703F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 27).addBox(-1.5F, -1.5F, -1.0F, 3.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.5F, -1.1F, 0.3186971254089062F, 0.0F, 0.0F));
            PartDefinition Crest = Head.addOrReplaceChild("Crest", CubeListBuilder.create().texOffs(8, 16).addBox(-0.5F, -0.7F, -0.5F, 1.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.04555309164612875F, 0.0F, 0.0F));

            PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(14, 26).addBox(-1.0F, 0.0F, -1.8F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -0.2F, -0.2F, 0.2275909337942703F, 0.0F, 0.0F));
            PartDefinition NoseR = Snout.addOrReplaceChild("NoseR", CubeListBuilder.create().texOffs(10, 29).addBox(-0.9F, -1.3F, -1.3F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.5F, -0.1F, 0.13665927909957545F, 0.0F, 0.0F));
            PartDefinition Nose = NoseR.addOrReplaceChild("Nose", CubeListBuilder.create().texOffs(11, 25).addBox(-0.5F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -0.77F, -0.8F, 0.18203784630933073F, 0.0F, 0.0F));

            PartDefinition NoseL = NoseR.addOrReplaceChild("NoseL", CubeListBuilder.create().texOffs(10, 29).mirror(true).addBox(-0.1F, -1.3F, -1.3F, 1.0F, 1.0F, 2.0F), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition EarLeft = Head.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(17, 30).mirror(true).addBox(-0.2F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(1.0F, -0.7F, 0.5F, -0.13665927909957545F, -0.3186971254089062F, 0.3642502295386026F));

            PartDefinition Mouth = Head.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(7, 21).addBox(-0.5F, -0.5F, -1.4F, 1.0F, 1.0F, 2.0F), PartPose.offset(0.0F, 0.9F, -0.3F));

            PartDefinition EarRight = Head.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(17, 30).addBox(-0.8F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-1.0F, -0.7F, 0.5F, -0.13665927909957545F, 0.3186971254089062F, -0.3642502295386026F));

            return LayerDefinition.create(meshDefinition, 23, 32);
        }

        @Override
        public void setupAnim(PorcupineEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
            this.Head.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
        }

        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0F;
            float degree = 1.0F;
            this.Head.xRot = Mth.cos(7.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * 0.3F * limbSwingAmount * 0.5F + 0.32F;
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * -0.3F * limbSwingAmount * 0.5F - 0.23F;
            this.Tail.xRot = Mth.cos(6.5F + limbSwing * speed * 0.1F + 3.1415927F) * degree * 0.2F * limbSwingAmount * 0.5F - 0.55F;
            this.Tail.yRot = Mth.cos(4.0F + limbSwing * speed * 0.05F + 3.1415927F) * degree * -0.3F * limbSwingAmount * 0.5F;
        }

        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0F;
            float degree = 1.0F;
            this.Head.xRot = Mth.cos(6.0F + limbSwing * speed * 0.5F + 3.1415927F) * degree * -0.3F * limbSwingAmount * 0.5F + 0.32F;
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.5F + 3.1415927F) * degree * -0.3F * limbSwingAmount * 0.5F - 0.23F;
            this.Tail.xRot = Mth.cos(6.5F + limbSwing * speed * 0.5F + 3.1415927F) * degree * 0.2F * limbSwingAmount * 0.5F - 0.55F;
            this.Tail.yRot = Mth.cos(4.0F + limbSwing * speed * 0.25F + 3.1415927F) * degree * -0.5F * limbSwingAmount * 0.5F;

            this.ArmBaseLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.25F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F + 0.14F;
            this.ArmLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.25F + 3.1415927F) * degree * 1.2F * limbSwingAmount * 0.5F - 0.47F;
            this.HandLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.25F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F + 0.32F;
            this.ArmBaseRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.25F + 3.1415927F) * degree * 1.5F * limbSwingAmount * 0.5F + 0.14F;
            this.ArmRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.25F + 3.1415927F) * degree * -1.2F * limbSwingAmount * 0.5F - 0.47F;
            this.HandRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.25F + 3.1415927F) * degree * 1.5F * limbSwingAmount * 0.5F + 0.32F;

            this.ThighLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.25F + 3.1415927F) * degree * 3.0F * limbSwingAmount * 0.5F + 0.05F;
            this.LegLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.25F + 3.1415927F) * degree * 3.0F * limbSwingAmount * 0.5F + 0.55F;
            this.FootLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.25F + 3.1415927F) * degree * -1.0F * limbSwingAmount * 0.5F - 0.36F;
            this.ThighRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.25F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.05F;
            this.LegRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.25F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F + +0.55F;
            this.FootRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.25F + 3.1415927F) * degree * 1.0F * limbSwingAmount * 0.5F - 0.36F;
        }
    }
}


