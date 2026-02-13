package com.github.artyarticus.ecoregions.client.model;

import com.github.artyarticus.ecoregions.entity.MonitorEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class AsianWaterMonitorModel extends ZawaBaseModel<MonitorEntity> {
    public ModelPart Chest;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Chest);
        }

        return this.parts;
    }

    public static class Adult extends AsianWaterMonitorModel {
        public ModelPart Neck;
        public ModelPart Body;
        public ModelPart UpperArmLeft;
        public ModelPart UpperArmRight;
        public ModelPart Head;
        public ModelPart Throat;
        public ModelPart Snout;
        public ModelPart Mouth;
        public ModelPart SnoutTop;
        public ModelPart SnoutLeft;
        public ModelPart SnoutRight;
        public ModelPart EyeLeft;
        public ModelPart EyeRight;
        public ModelPart Hips;
        public ModelPart Tail1;
        public ModelPart ThighLeft;
        public ModelPart ThighRight;
        public ModelPart Tail2;
        public ModelPart Tail3;
        public ModelPart Tail4;
        public ModelPart LegLeft;
        public ModelPart FootLeft;
        public ModelPart ToeLeft1;
        public ModelPart ToeLeft2;
        public ModelPart LegRight;
        public ModelPart FootRight;
        public ModelPart ToeRight1;
        public ModelPart ToeRight2;
        public ModelPart ArmLeft;
        public ModelPart HandLeft;
        public ModelPart FingerLeft1;
        public ModelPart FingerLeft2;
        public ModelPart ArmRight;
        public ModelPart HandRight;
        public ModelPart FingerRight1;
        public ModelPart FingerRight2;

        public Adult(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.UpperArmLeft = this.Chest.getChild("UpperArmLeft");
            this.ArmLeft = this.UpperArmLeft.getChild("ArmLeft");
            this.HandLeft = this.ArmLeft.getChild("HandLeft");
            this.FingerLeft1 = this.HandLeft.getChild("FingerLeft1");

            this.FingerLeft2 = this.HandLeft.getChild("FingerLeft2");

            this.Body = this.Chest.getChild("Body");
            this.Hips = this.Body.getChild("Hips");
            this.ThighRight = this.Hips.getChild("ThighRight");
            this.LegRight = this.ThighRight.getChild("LegRight");
            this.FootRight = this.LegRight.getChild("FootRight");
            this.ToeRight1 = this.FootRight.getChild("ToeRight1");

            this.ToeRight2 = this.FootRight.getChild("ToeRight2");

            this.Tail1 = this.Hips.getChild("Tail1");
            this.Tail2 = this.Tail1.getChild("Tail2");
            this.Tail3 = this.Tail2.getChild("Tail3");
            this.Tail4 = this.Tail3.getChild("Tail4");

            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.LegLeft = this.ThighLeft.getChild("LegLeft");
            this.FootLeft = this.LegLeft.getChild("FootLeft");
            this.ToeLeft2 = this.FootLeft.getChild("ToeLeft2");

            this.ToeLeft1 = this.FootLeft.getChild("ToeLeft1");

            this.Neck = this.Chest.getChild("Neck");
            this.Head = this.Neck.getChild("Head");
            this.Snout = this.Head.getChild("Snout");
            this.SnoutTop = this.Snout.getChild("SnoutTop");

            this.SnoutRight = this.Snout.getChild("SnoutRight");
            this.EyeRight = this.SnoutRight.getChild("EyeRight");

            this.SnoutLeft = this.Snout.getChild("SnoutLeft");
            this.EyeLeft = this.SnoutLeft.getChild("EyeLeft");

            this.Mouth = this.Head.getChild("Mouth");

            this.Throat = this.Neck.getChild("Throat");

            this.UpperArmRight = this.Chest.getChild("UpperArmRight");
            this.ArmRight = this.UpperArmRight.getChild("ArmRight");
            this.HandRight = this.ArmRight.getChild("HandRight");
            this.FingerRight2 = this.HandRight.getChild("FingerRight2");

            this.FingerRight1 = this.HandRight.getChild("FingerRight1");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Chest = partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 39).addBox(-3.5F, -3.0F, -2.0F, 7.0F, 6.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 18.0F, -8.5F, -0.04555309164612875F, 0.0F, 0.0F));
            PartDefinition UpperArmLeft = Chest.addOrReplaceChild("UpperArmLeft", CubeListBuilder.create().texOffs(35, 10).mirror(true).addBox(-1.5F, 0.0F, -1.5F, 2.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(3.0F, -0.5F, 0.1F, 0.2617993877991494F, -0.08726646259971647F, -0.8726646259971648F));
            PartDefinition ArmLeft = UpperArmLeft.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(29, 17).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(-0.7F, 3.4F, 1.5F, -0.3490658503988659F, 0.0F, 0.6981317007977318F));
            PartDefinition HandLeft = ArmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(26, 8).mirror(true).addBox(-1.0F, -0.01F, -3.5F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 3.5F, -1.0F, 0.23108158896930758F, 0.0F, 0.17453292519943295F));
            PartDefinition FingerLeft1 = HandLeft.addOrReplaceChild("FingerLeft1", CubeListBuilder.create().texOffs(25, 13).mirror(true).addBox(-1.0F, 0.0F, -2.5F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.9F, 0.0F, 0.5F, 0.0F, -0.3899065575586943F, 0.0F));

            PartDefinition FingerLeft2 = HandLeft.addOrReplaceChild("FingerLeft2", CubeListBuilder.create().texOffs(25, 13).mirror(true).addBox(0.0F, 0.0F, -2.5F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(-0.9F, 0.0F, 0.5F, 0.0F, 0.3899065575586943F, 0.0F));

            PartDefinition Body = Chest.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 18).addBox(-4.0F, -1.0F, -1.0F, 8.0F, 7.0F, 13.0F), PartPose.offset(0.0F, -2.5F, 3.0F));
            PartDefinition Hips = Body.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(22, 39).addBox(-3.5F, 0.0F, 0.0F, 7.0F, 6.0F, 5.0F), PartPose.offsetAndRotation(0.0F, -0.5F, 12.0F, -0.13665927909957545F, 0.0F, 0.0F));
            PartDefinition ThighRight = Hips.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(50, 0).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(-2.0F, 1.5F, 2.5F, 0.03490658503988659F, 0.6108652381980153F, 0.8726646259971648F));
            PartDefinition LegRight = ThighRight.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(40, 2).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 5.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 3.5F, -1.0F, 0.8726646259971648F, 0.0F, -0.2617993877991494F));
            PartDefinition FootRight = LegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(26, 0).addBox(-1.0F, -0.01F, -3.5F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 4.5F, 0.5F, -0.22689280275926282F, 0.0F, -0.3490658503988659F));
            PartDefinition ToeRight1 = FootRight.addOrReplaceChild("ToeRight1", CubeListBuilder.create().texOffs(26, 4).mirror(true).addBox(-1.0F, 0.0F, -2.5F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.9F, 0.0F, 0.5F, 0.0F, -0.3899065575586943F, 0.0F));

            PartDefinition ToeRight2 = FootRight.addOrReplaceChild("ToeRight2", CubeListBuilder.create().texOffs(26, 4).addBox(0.0F, 0.0F, -2.5F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(-0.9F, 0.0F, 0.5F, 0.0F, 0.3899065575586943F, 0.0F));

            PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(64, 0).addBox(-2.5F, -0.5F, 0.0F, 5.0F, 5.0F, 8.0F), PartPose.offsetAndRotation(0.0F, 0.5F, 4.5F, -0.1494001912944076F, 0.0F, 0.0F));
            PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(66, 13).addBox(-2.0F, 0.0F, -0.5F, 4.0F, 4.0F, 8.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 7.5F, 0.18203784630933073F, 0.0F, 0.0F));
            PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(66, 25).addBox(-1.5F, 0.0F, -0.5F, 3.0F, 3.0F, 9.0F), PartPose.offsetAndRotation(0.0F, 0.5F, 7.0F, 0.1429424584146426F, 0.0F, 0.0F));
            PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(66, 37).addBox(-1.0F, -0.1F, 0.0F, 2.0F, 2.0F, 10.0F), PartPose.offset(0.0F, 0.9F, 8.0F));

            PartDefinition ThighLeft = Hips.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(50, 0).mirror(true).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(2.0F, 1.5F, 2.5F, 0.03490658503988659F, -0.6108652381980153F, -0.8726646259971648F));
            PartDefinition LegLeft = ThighLeft.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(40, 2).mirror(true).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 5.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 3.5F, -1.0F, 0.8726646259971648F, 0.0F, 0.2617993877991494F));
            PartDefinition FootLeft = LegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(26, 0).mirror(true).addBox(-1.0F, -0.01F, -3.5F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 4.5F, 0.5F, -0.22689280275926282F, 0.0F, 0.3490658503988659F));
            PartDefinition ToeLeft2 = FootLeft.addOrReplaceChild("ToeLeft2", CubeListBuilder.create().texOffs(26, 4).mirror(true).addBox(0.0F, 0.0F, -2.5F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(-0.9F, 0.0F, 0.5F, 0.0F, 0.3899065575586943F, 0.0F));

            PartDefinition ToeLeft1 = FootLeft.addOrReplaceChild("ToeLeft1", CubeListBuilder.create().texOffs(26, 4).mirror(true).addBox(-1.0F, 0.0F, -2.5F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.9F, 0.0F, 0.5F, 0.0F, -0.3899065575586943F, 0.0F));

            PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(42, 25).addBox(-3.0F, -1.5F, -4.5F, 6.0F, 4.0F, 6.0F), PartPose.offsetAndRotation(0.0F, -1.2F, -2.0F, -0.09058258917719111F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(43, 35).addBox(-2.5F, -2.0F, -1.5F, 5.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 1.0F, -5.0F, 0.344527990348939F, 0.0F, 0.0F));
            PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(48, 42).addBox(-1.5F, 0.0F, -4.4F, 3.0F, 2.0F, 5.0F), PartPose.offsetAndRotation(0.0F, -1.0F, -1.4F, -0.05934119623228288F, 0.0F, 0.0F));
            PartDefinition SnoutTop = Snout.addOrReplaceChild("SnoutTop", CubeListBuilder.create().texOffs(54, 21).addBox(-1.0F, -1.0F, -2.6F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.2F, 0.0F, 0.28605945374922626F, 0.0F, 0.0F));

            PartDefinition SnoutRight = Snout.addOrReplaceChild("SnoutRight", CubeListBuilder.create().texOffs(60, 39).mirror(true).addBox(-0.5F, -0.5F, -4.3F, 1.0F, 2.0F, 5.0F), PartPose.offsetAndRotation(-1.5F, 0.49F, 0.0F, 0.0F, -0.11344640137963141F, 0.0F));
            PartDefinition EyeRight = SnoutRight.addOrReplaceChild("EyeRight", CubeListBuilder.create().texOffs(46, 42).mirror(true).addBox(-0.8F, -0.8F, -0.8F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.4F, -0.5F, -0.5F, 0.1494001912944076F, -0.2275909337942703F, 0.0F));

            PartDefinition SnoutLeft = Snout.addOrReplaceChild("SnoutLeft", CubeListBuilder.create().texOffs(60, 39).addBox(-0.5F, -0.5F, -4.3F, 1.0F, 2.0F, 5.0F), PartPose.offsetAndRotation(1.5F, 0.49F, 0.0F, 0.0F, 0.11344640137963141F, 0.0F));
            PartDefinition EyeLeft = SnoutLeft.addOrReplaceChild("EyeLeft", CubeListBuilder.create().texOffs(46, 42).addBox(-0.2F, -0.8F, -0.8F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-0.4F, -0.5F, -0.5F, 0.1494001912944076F, 0.2275909337942703F, 0.0F));

            PartDefinition Mouth = Head.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(30, 23).addBox(-1.5F, -0.4F, -4.5F, 3.0F, 1.0F, 5.0F, new CubeDeformation(-0.01F, -0.01F, -0.01F)), PartPose.offsetAndRotation(0.0F, 1.3F, -1.3F, -0.11728612207217244F, 0.0F, 0.0F));

            PartDefinition Throat = Neck.addOrReplaceChild("Throat", CubeListBuilder.create().texOffs(39, 11).addBox(-2.5F, 0.0F, -6.8F, 5.0F, 2.0F, 8.0F, new CubeDeformation(-0.1F, -0.1F, -0.1F)), PartPose.offsetAndRotation(0.0F, 1.6F, 2.0F, -0.09756390784964411F, 0.0F, 0.0F));

            PartDefinition UpperArmRight = Chest.addOrReplaceChild("UpperArmRight", CubeListBuilder.create().texOffs(35, 10).addBox(-0.5F, 0.0F, -1.5F, 2.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(-3.0F, -0.5F, 0.1F, 0.2617993877991494F, 0.08726646259971647F, 0.8726646259971648F));
            PartDefinition ArmRight = UpperArmRight.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(29, 17).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(0.7F, 3.4F, 1.5F, -0.3490658503988659F, 0.0F, -0.6981317007977318F));
            PartDefinition HandRight = ArmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(26, 8).addBox(-1.0F, -0.01F, -3.5F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 3.5F, -1.0F, 0.23108158896930758F, 0.0F, -0.17453292519943295F));
            PartDefinition FingerRight2 = HandRight.addOrReplaceChild("FingerRight2", CubeListBuilder.create().texOffs(25, 13).addBox(0.0F, 0.0F, -2.5F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(-0.9F, 0.0F, 0.5F, 0.0F, 0.3899065575586943F, 0.0F));

            PartDefinition FingerRight1 = HandRight.addOrReplaceChild("FingerRight1", CubeListBuilder.create().texOffs(25, 13).addBox(-1.0F, 0.0F, -2.5F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.9F, 0.0F, 0.5F, 0.0F, -0.3899065575586943F, 0.0F));

            return LayerDefinition.create(meshDefinition, 128, 64);
        }

        @Override
        public void setupAnim(MonitorEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.344F;
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Tail1.yRot = Mth.cos(-2.0F + limbSwing * speed * 0.08F) * degree * 0.1F * limbSwingAmount;
            this.Tail2.yRot = Mth.cos(-3.0F + limbSwing * speed * 0.08F) * degree * 0.1F * limbSwingAmount;
            this.Tail3.yRot = Mth.cos(limbSwing * speed * 0.08F) * degree * 0.1F * limbSwingAmount;
            this.Tail1.xRot = Mth.cos(limbSwing * speed * 0.16F) * degree * 0.05F * limbSwingAmount - 0.149F;
            this.Neck.xRot = Mth.cos(limbSwing * speed * 0.1F) * degree * 0.1F * limbSwingAmount - -0.09F;
            this.Head.xRot = Mth.cos(limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount + 0.344F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 4.0f;
            float degree = 0.7f;
            this.UpperArmLeft.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.261F;
            this.ArmLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount - 0.35F;
            this.HandLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.2F;
            this.ThighLeft.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.03F;
            this.LegLeft.xRot = Mth.cos(-1.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.87F;
            this.FootLeft.xRot = Mth.cos(-2.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount - 0.23F;
            this.UpperArmRight.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.26F;
            this.ArmRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount - 0.35F;
            this.HandRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.2F;
            this.ThighRight.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.03F;
            this.LegRight.xRot = Mth.cos(-1.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.87F;
            this.FootRight.xRot = Mth.cos(-2.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount - 0.23F;
            this.Body.yRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount;
            this.Neck.yRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * degree * -0.2F * limbSwingAmount;
            this.Head.yRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount;
            this.Hips.yRot = Mth.cos(-1.0F + limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount;
            this.Tail1.yRot = Mth.cos(-2.0F + limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount;
            this.Tail2.yRot = Mth.cos(-3.0F + limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount;
            this.Tail3.yRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount;
        }
    }

    public static class Child extends AsianWaterMonitorModel {
        public ModelPart Neck;
        public ModelPart Tail1;
        public ModelPart UpperArmLeft;
        public ModelPart ThighLeft;
        public ModelPart UpperArmRight;
        public ModelPart ThighRight;
        public ModelPart Head;
        public ModelPart Snout;
        public ModelPart SnoutTop;
        public ModelPart Mouth;
        public ModelPart Tail2;
        public ModelPart ArmLeft;
        public ModelPart HandLeft;
        public ModelPart FingerLeft1;
        public ModelPart FingerLeft2;
        public ModelPart LegLeft;
        public ModelPart FootLeft;
        public ModelPart ToeLeft1;
        public ModelPart ToeLeft2;
        public ModelPart ArmRight;
        public ModelPart HandRight;
        public ModelPart FingerLeft1_1;
        public ModelPart FingerLeft2_1;
        public ModelPart LegRight;
        public ModelPart FootRight;
        public ModelPart ToeRight1;
        public ModelPart ToeRight2;

        public Child(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.UpperArmRight = this.Chest.getChild("UpperArmRight");
            this.ArmRight = this.UpperArmRight.getChild("ArmRight");
            this.HandRight = this.ArmRight.getChild("HandRight");
            this.FingerLeft1_1 = this.HandRight.getChild("FingerLeft1_1");

            this.FingerLeft2_1 = this.HandRight.getChild("FingerLeft2_1");

            this.ThighRight = this.Chest.getChild("ThighRight");
            this.LegRight = this.ThighRight.getChild("LegRight");
            this.FootRight = this.LegRight.getChild("FootRight");
            this.ToeRight1 = this.FootRight.getChild("ToeRight1");

            this.ToeRight2 = this.FootRight.getChild("ToeRight2");

            this.Neck = this.Chest.getChild("Neck");
            this.Head = this.Neck.getChild("Head");
            this.Snout = this.Head.getChild("Snout");
            this.Mouth = this.Snout.getChild("Mouth");

            this.SnoutTop = this.Snout.getChild("SnoutTop");

            this.Tail1 = this.Chest.getChild("Tail1");
            this.Tail2 = this.Tail1.getChild("Tail2");

            this.ThighLeft = this.Chest.getChild("ThighLeft");
            this.LegLeft = this.ThighLeft.getChild("LegLeft");
            this.FootLeft = this.LegLeft.getChild("FootLeft");
            this.ToeLeft2 = this.FootLeft.getChild("ToeLeft2");

            this.ToeLeft1 = this.FootLeft.getChild("ToeLeft1");

            this.UpperArmLeft = this.Chest.getChild("UpperArmLeft");
            this.ArmLeft = this.UpperArmLeft.getChild("ArmLeft");
            this.HandLeft = this.ArmLeft.getChild("HandLeft");
            this.FingerLeft2 = this.HandLeft.getChild("FingerLeft2");

            this.FingerLeft1 = this.HandLeft.getChild("FingerLeft1");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Chest = partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 21).addBox(-1.5F, -1.5F, -3.0F, 3.0F, 3.0F, 8.0F), PartPose.offset(0.0F, 21.3F, -2.0F));
            PartDefinition UpperArmRight = Chest.addOrReplaceChild("UpperArmRight", CubeListBuilder.create().texOffs(13, 14).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-1.4F, 1.0F, -2.1F, 0.2617993877991494F, 0.08726646259971647F, 0.8726646259971648F));
            PartDefinition ArmRight = UpperArmRight.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(13, 18).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 1.1F, 0.0F, -0.3490658503988659F, 0.0F, -0.6981317007977318F));
            PartDefinition HandRight = ArmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(25, 18).addBox(-0.5F, -0.01F, -0.8F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.1F, 0.4F, -0.5F, 0.19198621771937624F, 0.0F, -0.17453292519943295F));
            PartDefinition FingerLeft1_1 = HandRight.addOrReplaceChild("FingerLeft1_1", CubeListBuilder.create().texOffs(25, 18).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.5F, 0.0F, 0.5F, 0.0F, -0.3490658503988659F, 0.0F));

            PartDefinition FingerLeft2_1 = HandRight.addOrReplaceChild("FingerLeft2_1", CubeListBuilder.create().texOffs(25, 18).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.5F, 0.0F, 0.3490658503988659F, 0.0F));

            PartDefinition ThighRight = Chest.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(7, 14).mirror(true).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-1.1F, 0.7F, 3.2F, 0.3790855015489435F, 0.08726646259971647F, 0.8726646259971648F));
            PartDefinition LegRight = ThighRight.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(7, 18).mirror(true).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 1.1F, 0.0F, 0.3490658503988659F, 0.0F, -0.6981317007977318F));
            PartDefinition FootRight = LegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(25, 18).mirror(true).addBox(-0.5F, -0.01F, -0.8F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.2F, 0.3F, -0.4F, -0.47263516010848383F, 0.0F, -0.17453292519943295F));
            PartDefinition ToeRight1 = FootRight.addOrReplaceChild("ToeRight1", CubeListBuilder.create().texOffs(25, 18).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.5F, 0.0F, 0.5F, 0.0F, -0.3490658503988659F, 0.0F));

            PartDefinition ToeRight2 = FootRight.addOrReplaceChild("ToeRight2", CubeListBuilder.create().texOffs(25, 18).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.5F, 0.0F, 0.3490658503988659F, 0.0F));

            PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 6).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, -0.2F)), PartPose.offsetAndRotation(0.0F, -1.2F, -2.5F, -0.2275909337942703F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 1.3F, -2.5F, 0.3186971254089062F, 0.0F, 0.0F));
            PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(0, 19).addBox(-1.0F, -0.6F, -2.2F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -1.0F, 0.18901915665940536F, 0.0F, 0.0F));
            PartDefinition Mouth = Snout.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(14, 0).addBox(-0.5F, 0.0F, -1.2F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-0.0F, 0.2F, -0.8F, -0.13665927909957545F, 0.0F, 0.0F));

            PartDefinition SnoutTop = Snout.addOrReplaceChild("SnoutTop", CubeListBuilder.create().texOffs(11, 7).addBox(-0.5F, -1.5F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.3F, 0.2F, 0.3380702907586876F, 0.0F, 0.0F));

            PartDefinition Tail1 = Chest.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(16, 0).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 6.0F), PartPose.offsetAndRotation(0.0F, -1.0F, 5.0F, -0.2275909337942703F, 0.0F, 0.0F));
            PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(10, 10).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 10.0F), PartPose.offsetAndRotation(0.0F, 0.5F, 5.5F, 0.13665927909957545F, 0.0F, 0.0F));

            PartDefinition ThighLeft = Chest.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(7, 14).mirror(true).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(1.1F, 0.7F, 4.2F, 0.3790855015489435F, -0.08726646259971647F, -0.8726646259971648F));
            PartDefinition LegLeft = ThighLeft.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(7, 18).mirror(true).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 1.1F, 0.0F, 0.3490658503988659F, 0.0F, 0.6981317007977318F));
            PartDefinition FootLeft = LegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(25, 18).mirror(true).addBox(-0.5F, -0.01F, -0.8F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.2F, 0.3F, -0.4F, -0.47263516010848383F, 0.0F, 0.17453292519943295F));
            PartDefinition ToeLeft2 = FootLeft.addOrReplaceChild("ToeLeft2", CubeListBuilder.create().texOffs(25, 18).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.5F, 0.0F, 0.3490658503988659F, 0.0F));

            PartDefinition ToeLeft1 = FootLeft.addOrReplaceChild("ToeLeft1", CubeListBuilder.create().texOffs(25, 18).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.5F, 0.0F, 0.5F, 0.0F, -0.3490658503988659F, 0.0F));

            PartDefinition UpperArmLeft = Chest.addOrReplaceChild("UpperArmLeft", CubeListBuilder.create().texOffs(13, 14).mirror(true).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(1.4F, 1.0F, -2.1F, 0.2617993877991494F, -0.08726646259971647F, -0.8726646259971648F));
            PartDefinition ArmLeft = UpperArmLeft.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(13, 18).mirror(true).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 1.1F, 0.0F, -0.3490658503988659F, 0.0F, 0.6981317007977318F));
            PartDefinition HandLeft = ArmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(25, 18).mirror(true).addBox(-0.5F, -0.01F, -0.8F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.1F, 0.4F, -0.5F, 0.19198621771937624F, 0.0F, 0.17453292519943295F));
            PartDefinition FingerLeft2 = HandLeft.addOrReplaceChild("FingerLeft2", CubeListBuilder.create().texOffs(25, 18).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.5F, 0.0F, 0.3490658503988659F, 0.0F));

            PartDefinition FingerLeft1 = HandLeft.addOrReplaceChild("FingerLeft1", CubeListBuilder.create().texOffs(25, 18).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.5F, 0.0F, 0.5F, 0.0F, -0.3490658503988659F, 0.0F));

            return LayerDefinition.create(meshDefinition, 32, 32);
        }

        @Override
        public void setupAnim(MonitorEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.318F;
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Tail1.yRot = Mth.cos(-2.0F + limbSwing * speed * 0.08F) * degree * 0.1F * limbSwingAmount;
            this.Tail2.yRot = Mth.cos(-3.0F + limbSwing * speed * 0.08F) * degree * 0.1F * limbSwingAmount;
            this.Tail1.xRot = Mth.cos(limbSwing * speed * 0.16F) * degree * 0.05F * limbSwingAmount - 0.227F;
            this.Neck.xRot = Mth.cos(limbSwing * speed * 0.1F) * degree * 0.1F * limbSwingAmount - 0.227F;
            this.Head.xRot = Mth.cos(limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount + 0.318F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 4.0f;
            float degree = 0.7f;
            this.UpperArmLeft.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.261F;
            this.ArmLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount - 0.35F;
            this.HandLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.2F;
            this.ThighLeft.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.379F;
            this.LegLeft.xRot = Mth.cos(-1.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.349F;
            this.FootLeft.xRot = Mth.cos(-2.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount - -0.472F;
            this.UpperArmRight.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.26F;
            this.ArmRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount - 0.35F;
            this.HandRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.2F;
            this.ThighRight.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.379F;
            this.LegRight.xRot = Mth.cos(-1.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.349F;
            this.FootRight.xRot = Mth.cos(-2.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount - 0.472F;
            this.Neck.yRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * degree * -0.2F * limbSwingAmount;
            this.Head.yRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount;
            this.Tail1.yRot = Mth.cos(-2.0F + limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount;
            this.Tail2.yRot = Mth.cos(-3.0F + limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount;
        }
    }
}