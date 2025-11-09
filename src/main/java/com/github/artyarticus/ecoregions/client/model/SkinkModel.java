package com.github.artyarticus.ecoregions.client.model;

import com.github.artyarticus.ecoregions.entity.SkinkEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class SkinkModel extends ZawaBaseModel<SkinkEntity> {
    public ModelPart Chest;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Chest);
        }

        return this.parts;
    }

    public static class Adult extends SkinkModel {

        public ModelPart Body;
        public ModelPart UpperArmLeft;
        public ModelPart Neck;
        public ModelPart UpperArmRight;
        public ModelPart Hips;
        public ModelPart ThighLeft;
        public ModelPart Tail1;
        public ModelPart ThighRight;
        public ModelPart LegLeft;
        public ModelPart FootLeft;
        public ModelPart ToeLeft1;
        public ModelPart ToeLeft2;
        public ModelPart Tail2;
        public ModelPart Tail3;
        public ModelPart LegRight;
        public ModelPart FootRight;
        public ModelPart ToeLeft1_1;
        public ModelPart ToeLeft2_1;
        public ModelPart ArmLeft;
        public ModelPart HandLeft;
        public ModelPart FingerLeft1;
        public ModelPart FingerLeft2;
        public ModelPart Head;
        public ModelPart Jaw;
        public ModelPart Snout;
        public ModelPart Mouth;
        public ModelPart Tongue;
        public ModelPart MouthLeft;
        public ModelPart MouthRight;
        public ModelPart SnoutTop;
        public ModelPart SnoutLeft;
        public ModelPart SnoutRight;
        public ModelPart ArmRight;
        public ModelPart HandRight;
        public ModelPart FingerLeft1_1;
        public ModelPart FingerLeft2_1;

        public Adult(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.Body = this.Chest.getChild("Body");
            this.Hips = this.Body.getChild("Hips");
            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.LegLeft = this.ThighLeft.getChild("LegLeft");
            this.FootLeft = this.LegLeft.getChild("FootLeft");
            this.ToeLeft2 = this.FootLeft.getChild("ToeLeft2");

            this.ToeLeft1 = this.FootLeft.getChild("ToeLeft1");

            this.Tail1 = this.Hips.getChild("Tail1");
            this.Tail2 = this.Tail1.getChild("Tail2");
            this.Tail3 = this.Tail2.getChild("Tail3");

            this.ThighRight = this.Hips.getChild("ThighRight");
            this.LegRight = this.ThighRight.getChild("LegRight");
            this.FootRight = this.LegRight.getChild("FootRight");
            this.ToeLeft1_1 = this.FootRight.getChild("ToeLeft1_1");

            this.ToeLeft2_1 = this.FootRight.getChild("ToeLeft2_1");

            this.UpperArmLeft = this.Chest.getChild("UpperArmLeft");
            this.ArmLeft = this.UpperArmLeft.getChild("ArmLeft");
            this.HandLeft = this.ArmLeft.getChild("HandLeft");
            this.FingerLeft2 = this.HandLeft.getChild("FingerLeft2");

            this.FingerLeft1 = this.HandLeft.getChild("FingerLeft1");

            this.UpperArmRight = this.Chest.getChild("UpperArmRight");
            this.ArmRight = this.UpperArmRight.getChild("ArmRight");
            this.HandRight = this.ArmRight.getChild("HandRight");
            this.FingerLeft2_1 = this.HandRight.getChild("FingerLeft2_1");

            this.FingerLeft1_1 = this.HandRight.getChild("FingerLeft1_1");

            this.Neck = this.Chest.getChild("Neck");
            this.Head = this.Neck.getChild("Head");
            this.Jaw = this.Head.getChild("Jaw");
            this.Mouth = this.Jaw.getChild("Mouth");
            this.MouthRight = this.Mouth.getChild("MouthRight");

            this.MouthLeft = this.Mouth.getChild("MouthLeft");

            this.Tongue = this.Jaw.getChild("Tongue");

            this.Snout = this.Head.getChild("Snout");
            this.SnoutLeft = this.Snout.getChild("SnoutLeft");

            this.SnoutTop = this.Snout.getChild("SnoutTop");

            this.SnoutRight = this.Snout.getChild("SnoutRight");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Chest = partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(23, 26).addBox(-2.0F, -1.0F, -1.5F, 4.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 21.5F, -3.0F, 0.0781907508222411F, 0.0F, 0.0F));
            PartDefinition Body = Chest.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 23).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 3.0F, 6.0F, new CubeDeformation(0.0F, 0.1F, 0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 1.5F, -0.0781907508222411F, 0.0F, 0.0F));
            PartDefinition Hips = Body.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(38, 26).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, -0.11728612207217244F, 0.0F, 0.0F));
            PartDefinition ThighLeft = Hips.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(7, 14).mirror(true).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(1.8F, 1.8F, 1.5F, 0.5354670198381825F, -0.08726646259971647F, -0.8726646259971648F));
            PartDefinition LegLeft = ThighLeft.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(7, 18).mirror(true).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 1.1F, 0.0F, 0.3490658503988659F, 0.0F, 0.6981317007977318F));
            PartDefinition FootLeft = LegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(25, 16).mirror(true).addBox(-0.5F, -0.01F, -0.8F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.2F, 0.3F, -0.4F, -0.47263516010848383F, 0.0F, 0.17453292519943295F));
            PartDefinition ToeLeft2 = FootLeft.addOrReplaceChild("ToeLeft2", CubeListBuilder.create().texOffs(25, 14).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.5F, 0.0F, 0.3490658503988659F, 0.0F));

            PartDefinition ToeLeft1 = FootLeft.addOrReplaceChild("ToeLeft1", CubeListBuilder.create().texOffs(25, 14).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.5F, 0.0F, 0.5F, 0.0F, -0.3490658503988659F, 0.0F));

            PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(50, 21).addBox(-1.5F, -1.6F, 0.0F, 3.0F, 3.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 1.6F, 2.7F, -0.06981317007977318F, 0.0F, 0.0F));
            PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(50, 13).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 3.7F, 0.06981317007977318F, 0.0F, 0.0F));
            PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(52, 6).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 4.7F, 0.08726646259971647F, 0.0F, 0.0F));

            PartDefinition ThighRight = Hips.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(7, 14).mirror(true).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-1.8F, 1.8F, 1.5F, 0.5354670198381825F, 0.08726646259971647F, 0.8726646259971648F));
            PartDefinition LegRight = ThighRight.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(7, 18).mirror(true).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 1.1F, 0.0F, 0.3490658503988659F, 0.0F, -0.6981317007977318F));
            PartDefinition FootRight = LegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(25, 16).mirror(true).addBox(-0.5F, -0.01F, -0.8F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.2F, 0.3F, -0.4F, -0.47263516010848383F, 0.0F, -0.17453292519943295F));
            PartDefinition ToeLeft1_1 = FootRight.addOrReplaceChild("ToeLeft1_1", CubeListBuilder.create().texOffs(25, 14).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.5F, 0.0F, 0.5F, 0.0F, -0.3490658503988659F, 0.0F));

            PartDefinition ToeLeft2_1 = FootRight.addOrReplaceChild("ToeLeft2_1", CubeListBuilder.create().texOffs(25, 14).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.5F, 0.0F, 0.3490658503988659F, 0.0F));

            PartDefinition UpperArmLeft = Chest.addOrReplaceChild("UpperArmLeft", CubeListBuilder.create().texOffs(13, 14).mirror(true).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(1.9F, 1.0F, -0.1F, 0.2617993877991494F, -0.08726646259971647F, -0.8726646259971648F));
            PartDefinition ArmLeft = UpperArmLeft.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(13, 18).mirror(true).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 1.1F, 0.0F, -0.3490658503988659F, 0.0F, 0.6981317007977318F));
            PartDefinition HandLeft = ArmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(25, 16).mirror(true).addBox(-0.5F, -0.01F, -0.8F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.1F, 0.4F, -0.5F, 0.19198621771937624F, 0.0F, 0.17453292519943295F));
            PartDefinition FingerLeft2 = HandLeft.addOrReplaceChild("FingerLeft2", CubeListBuilder.create().texOffs(25, 14).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.5F, 0.0F, 0.3490658503988659F, 0.0F));

            PartDefinition FingerLeft1 = HandLeft.addOrReplaceChild("FingerLeft1", CubeListBuilder.create().texOffs(25, 14).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.5F, 0.0F, 0.5F, 0.0F, -0.3490658503988659F, 0.0F));

            PartDefinition UpperArmRight = Chest.addOrReplaceChild("UpperArmRight", CubeListBuilder.create().texOffs(13, 14).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-1.9F, 1.0F, -0.1F, 0.2617993877991494F, 0.08726646259971647F, 0.8726646259971648F));
            PartDefinition ArmRight = UpperArmRight.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(13, 18).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 1.1F, 0.0F, -0.3490658503988659F, 0.0F, -0.6981317007977318F));
            PartDefinition HandRight = ArmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(25, 16).addBox(-0.5F, -0.01F, -0.8F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.1F, 0.4F, -0.5F, 0.19198621771937624F, 0.0F, -0.17453292519943295F));
            PartDefinition FingerLeft2_1 = HandRight.addOrReplaceChild("FingerLeft2_1", CubeListBuilder.create().texOffs(25, 14).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.5F, 0.0F, 0.3490658503988659F, 0.0F));

            PartDefinition FingerLeft1_1 = HandRight.addOrReplaceChild("FingerLeft1_1", CubeListBuilder.create().texOffs(25, 14).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.5F, 0.0F, 0.5F, 0.0F, -0.3490658503988659F, 0.0F));

            PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(44, 0).addBox(-1.5F, -0.6F, -1.9F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.1F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -0.8F, -0.23457224414434488F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(31, 0).addBox(-1.5F, -1.0F, -2.5F, 3.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.45F, -1.9F, 0.31241392944908225F, 0.0F, 0.0F));
            PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create().texOffs(31, 6).addBox(-1.5F, 0.0F, -2.5F, 3.0F, 1.0F, 3.0F), PartPose.offset(0.01F, 0.7F, 0.0F));
            PartDefinition Mouth = Jaw.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(44, 11).addBox(-1.0F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -2.1F, -0.19547687289441354F, 0.0F, 0.0F));
            PartDefinition MouthRight = Mouth.addOrReplaceChild("MouthRight", CubeListBuilder.create().texOffs(34, 15).mirror(true).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-0.45F, 0.0F, -1.4F, 0.0F, -0.35185837453889574F, 0.0F));

            PartDefinition MouthLeft = Mouth.addOrReplaceChild("MouthLeft", CubeListBuilder.create().texOffs(34, 15).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.45F, 0.0F, -1.4F, 0.0F, 0.35185837453889574F, 0.0F));

            PartDefinition Tongue = Jaw.addOrReplaceChild("Tongue", CubeListBuilder.create().texOffs(17, 0).addBox(-1.5F, -0.5F, -3.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.4F, -0.3F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, 0.6F, -0.0781907508222411F, 0.0F, 0.0F));

            PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(44, 7).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.07F, -2.0F, -0.1563815016444822F, 0.0F, 0.0F));
            PartDefinition SnoutLeft = Snout.addOrReplaceChild("SnoutLeft", CubeListBuilder.create().texOffs(34, 11).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.53F, 0.5F, -1.4F, 0.0F, 0.27366763203903305F, 0.0F));

            PartDefinition SnoutTop = Snout.addOrReplaceChild("SnoutTop", CubeListBuilder.create().texOffs(33, 19).addBox(-1.0F, -0.4F, -2.1F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -0.67F, 0.1F, 0.5473352640780661F, 0.0F, 0.0F));

            PartDefinition SnoutRight = Snout.addOrReplaceChild("SnoutRight", CubeListBuilder.create().texOffs(34, 11).mirror(true).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-0.53F, 0.5F, -1.4F, 0.0F, -0.3127630032889644F, 0.0F));

            return LayerDefinition.create(meshDefinition, 64, 32);
        }

        @Override
        public void setupAnim(SkinkEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.312F;
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Tail1.yRot = Mth.cos(-2.0F + limbSwing * speed * 0.08F) * degree * 0.1F * limbSwingAmount;
            this.Tail2.yRot = Mth.cos(-3.0F + limbSwing * speed * 0.08F) * degree * 0.1F * limbSwingAmount;
            this.Tail3.yRot = Mth.cos(limbSwing * speed * 0.08F) * degree * 0.1F * limbSwingAmount;
            this.Tail1.xRot = Mth.cos(limbSwing * speed * 0.16F) * degree * 0.05F * limbSwingAmount - 0.069F;
            this.Neck.xRot = Mth.cos(limbSwing * speed * 0.1F) * degree * 0.1F * limbSwingAmount - 0.234F;
            this.Head.xRot = Mth.cos(limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount + 0.312F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 4.0f;
            float degree = 0.7f;
            this.UpperArmLeft.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.262F;
            this.ArmLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount - 0.349F;
            this.HandLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.191F;

            this.ThighLeft.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.535F;
            this.LegLeft.xRot = Mth.cos(-1.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.349F;
            this.FootLeft.xRot = Mth.cos(-2.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount - 0.472F;

            this.UpperArmRight.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.262F;
            this.ArmRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount - 0.349F;
            this.HandRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.191F;

            this.ThighRight.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.535F;
            this.LegRight.xRot = Mth.cos(-1.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.349F;
            this.FootRight.xRot = Mth.cos(-2.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount - 0.472F;

            this.Body.yRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount - 0.078F;
            this.Neck.yRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * degree * -0.2F * limbSwingAmount - 0.234F;
            this.Head.yRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount + 0.312F;
            this.Hips.yRot = Mth.cos(-1.0F + limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount - 0.117F;
            this.Tail1.yRot = Mth.cos(-2.0F + limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount;
            this.Tail2.yRot = Mth.cos(-3.0F + limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount;
            this.Tail3.yRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount;
        }
    }

    public static class Child extends SkinkModel {
        public ModelPart Body;
        public ModelPart UpperArmLeft;
        public ModelPart Neck;
        public ModelPart UpperArmRight;
        public ModelPart Hips;
        public ModelPart ThighLeft;
        public ModelPart Tail1;
        public ModelPart ThighRight;
        public ModelPart LegLeft;
        public ModelPart FootLeft;
        public ModelPart ToeLeft1;
        public ModelPart ToeLeft2;
        public ModelPart Tail2;
        public ModelPart Tail3;
        public ModelPart LegRight;
        public ModelPart FootRight;
        public ModelPart ToeLeft1_1;
        public ModelPart ToeLeft2_1;
        public ModelPart ArmLeft;
        public ModelPart HandLeft;
        public ModelPart FingerLeft1;
        public ModelPart FingerLeft2;
        public ModelPart Head;
        public ModelPart Jaw;
        public ModelPart Snout;
        public ModelPart Mouth;
        public ModelPart SnoutTop;
        public ModelPart ArmRight;
        public ModelPart HandRight;
        public ModelPart FingerLeft1_1;
        public ModelPart FingerLeft2_1;

        public Child(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.UpperArmLeft = this.Chest.getChild("UpperArmLeft");
            this.ArmLeft = this.UpperArmLeft.getChild("ArmLeft");
            this.HandLeft = this.ArmLeft.getChild("HandLeft");
            this.FingerLeft2 = this.HandLeft.getChild("FingerLeft2");

            this.FingerLeft1 = this.HandLeft.getChild("FingerLeft1");

            this.Body = this.Chest.getChild("Body");
            this.Hips = this.Body.getChild("Hips");
            this.Tail1 = this.Hips.getChild("Tail1");
            this.Tail2 = this.Tail1.getChild("Tail2");
            this.Tail3 = this.Tail2.getChild("Tail3");

            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.LegLeft = this.ThighLeft.getChild("LegLeft");
            this.FootLeft = this.LegLeft.getChild("FootLeft");
            this.ToeLeft2 = this.FootLeft.getChild("ToeLeft2");

            this.ToeLeft1 = this.FootLeft.getChild("ToeLeft1");

            this.ThighRight = this.Hips.getChild("ThighRight");
            this.LegRight = this.ThighRight.getChild("LegRight");
            this.FootRight = this.LegRight.getChild("FootRight");
            this.ToeLeft1_1 = this.FootRight.getChild("ToeLeft1_1");

            this.ToeLeft2_1 = this.FootRight.getChild("ToeLeft2_1");

            this.Neck = this.Chest.getChild("Neck");
            this.Head = this.Neck.getChild("Head");
            this.Snout = this.Head.getChild("Snout");
            this.SnoutTop = this.Snout.getChild("SnoutTop");

            this.Jaw = this.Head.getChild("Jaw");
            this.Mouth = this.Jaw.getChild("Mouth");

            this.UpperArmRight = this.Chest.getChild("UpperArmRight");
            this.ArmRight = this.UpperArmRight.getChild("ArmRight");
            this.HandRight = this.ArmRight.getChild("HandRight");
            this.FingerLeft2_1 = this.HandRight.getChild("FingerLeft2_1");

            this.FingerLeft1_1 = this.HandRight.getChild("FingerLeft1_1");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Chest = partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 21.5F, -3.0F, 0.0781907508222411F, 0.0F, 0.0F));
            PartDefinition UpperArmLeft = Chest.addOrReplaceChild("UpperArmLeft", CubeListBuilder.create().texOffs(13, 14).mirror(true).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(1.5F, 1.0F, -0.1F, 0.2617993877991494F, -0.08726646259971647F, -0.8726646259971648F));
            PartDefinition ArmLeft = UpperArmLeft.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(13, 18).mirror(true).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 1.1F, 0.0F, -0.3490658503988659F, 0.0F, 0.6981317007977318F));
            PartDefinition HandLeft = ArmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(25, 16).mirror(true).addBox(-0.5F, -0.01F, -0.8F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.1F, 0.4F, -0.5F, 0.19198621771937624F, 0.0F, 0.17453292519943295F));
            PartDefinition FingerLeft2 = HandLeft.addOrReplaceChild("FingerLeft2", CubeListBuilder.create().texOffs(25, 14).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.5F, 0.0F, 0.3490658503988659F, 0.0F));

            PartDefinition FingerLeft1 = HandLeft.addOrReplaceChild("FingerLeft1", CubeListBuilder.create().texOffs(25, 14).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.5F, 0.0F, 0.5F, 0.0F, -0.3490658503988659F, 0.0F));

            PartDefinition Body = Chest.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 5).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F, 0.1F, 0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 0.5F, -0.0781907508222411F, 0.0F, 0.0F));
            PartDefinition Hips = Body.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 12).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, -0.11728612207217244F, 0.0F, 0.0F));
            PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(16, 0).addBox(-1.0F, -1.5F, 0.0F, 2.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 1.6F, 1.7F, -0.06981317007977318F, 0.0F, 0.0F));
            PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(16, 6).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.01F, 0.0F, 2.7F, 0.06981317007977318F, 0.0F, 0.0F));
            PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(17, 11).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 2.7F, 0.08726646259971647F, 0.0F, 0.0F));

            PartDefinition ThighLeft = Hips.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(0, 17).mirror(true).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(1.2F, 1.8F, 0.9F, 0.5354670198381825F, -0.08726646259971647F, -0.8726646259971648F));
            PartDefinition LegLeft = ThighLeft.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(0, 20).mirror(true).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 1.1F, 0.0F, 0.3490658503988659F, 0.0F, 0.6981317007977318F));
            PartDefinition FootLeft = LegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(25, 16).mirror(true).addBox(-0.5F, -0.01F, -0.8F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.2F, 0.3F, -0.4F, -0.47263516010848383F, 0.0F, 0.17453292519943295F));
            PartDefinition ToeLeft2 = FootLeft.addOrReplaceChild("ToeLeft2", CubeListBuilder.create().texOffs(25, 14).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.5F, 0.0F, 0.3490658503988659F, 0.0F));

            PartDefinition ToeLeft1 = FootLeft.addOrReplaceChild("ToeLeft1", CubeListBuilder.create().texOffs(25, 14).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.5F, 0.0F, 0.5F, 0.0F, -0.3490658503988659F, 0.0F));

            PartDefinition ThighRight = Hips.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(0, 17).mirror(true).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-1.2F, 1.8F, 1.5F, 0.5354670198381825F, 0.08726646259971647F, 0.8726646259971648F));
            PartDefinition LegRight = ThighRight.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(0, 20).mirror(true).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 1.1F, 0.0F, 0.3490658503988659F, 0.0F, -0.6981317007977318F));
            PartDefinition FootRight = LegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(25, 16).mirror(true).addBox(-0.5F, -0.01F, -0.8F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.2F, 0.3F, -0.4F, -0.47263516010848383F, 0.0F, -0.17453292519943295F));
            PartDefinition ToeLeft1_1 = FootRight.addOrReplaceChild("ToeLeft1_1", CubeListBuilder.create().texOffs(25, 14).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.5F, 0.0F, 0.5F, 0.0F, -0.3490658503988659F, 0.0F));

            PartDefinition ToeLeft2_1 = FootRight.addOrReplaceChild("ToeLeft2_1", CubeListBuilder.create().texOffs(25, 14).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.5F, 0.0F, 0.3490658503988659F, 0.0F));

            PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(26, 0).addBox(-1.5F, -0.4F, -1.9F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.1F, 0.2F, 0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, -0.8F, -0.23457224414434488F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(24, 5).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.35F, -1.8F, 0.31241392944908225F, 0.0F, 0.0F));
            PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(34, 10).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.07F, -1.0F, -0.1563815016444822F, 0.0F, 0.0F));
            PartDefinition SnoutTop = Snout.addOrReplaceChild("SnoutTop", CubeListBuilder.create().texOffs(33, 7).addBox(-1.0F, -0.4F, -2.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -0.67F, 0.1F, 0.5473352640780661F, 0.0F, 0.0F));

            PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create().texOffs(25, 9).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.7F, 0.0F, -0.038571777134864954F, 0.0F, 0.0F));
            PartDefinition Mouth = Jaw.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(32, 13).addBox(-1.0F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-0.01F, 0.5F, -1.1F, -0.19547687289441354F, 0.0F, 0.0F));

            PartDefinition UpperArmRight = Chest.addOrReplaceChild("UpperArmRight", CubeListBuilder.create().texOffs(13, 14).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-1.4F, 1.0F, -0.1F, 0.2617993877991494F, 0.08726646259971647F, 0.8726646259971648F));
            PartDefinition ArmRight = UpperArmRight.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(13, 18).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 1.1F, 0.0F, -0.3490658503988659F, 0.0F, -0.6981317007977318F));
            PartDefinition HandRight = ArmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(25, 16).addBox(-0.5F, -0.01F, -0.8F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.1F, 0.4F, -0.5F, 0.19198621771937624F, 0.0F, -0.17453292519943295F));
            PartDefinition FingerLeft2_1 = HandRight.addOrReplaceChild("FingerLeft2_1", CubeListBuilder.create().texOffs(25, 14).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.5F, 0.0F, 0.3490658503988659F, 0.0F));

            PartDefinition FingerLeft1_1 = HandRight.addOrReplaceChild("FingerLeft1_1", CubeListBuilder.create().texOffs(25, 14).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.5F, 0.0F, 0.5F, 0.0F, -0.3490658503988659F, 0.0F));

            return LayerDefinition.create(meshDefinition, 64, 32);
        }

        @Override
        public void setupAnim(SkinkEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.312F;
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Tail1.yRot = Mth.cos(-2.0F + limbSwing * speed * 0.08F) * degree * 0.1F * limbSwingAmount;
            this.Tail2.yRot = Mth.cos(-3.0F + limbSwing * speed * 0.08F) * degree * 0.1F * limbSwingAmount;
            this.Tail3.yRot = Mth.cos(limbSwing * speed * 0.08F) * degree * 0.1F * limbSwingAmount;
            this.Tail1.xRot = Mth.cos(limbSwing * speed * 0.16F) * degree * 0.05F * limbSwingAmount - 0.069F;
            this.Neck.xRot = Mth.cos(limbSwing * speed * 0.1F) * degree * 0.1F * limbSwingAmount - 0.234F;
            this.Head.xRot = Mth.cos(limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount + 0.312F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 4.0f;
            float degree = 0.7f;
            this.UpperArmLeft.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.262F;
            this.ArmLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount - 0.349F;
            this.HandLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.191F;

            this.ThighLeft.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.535F;
            this.LegLeft.xRot = Mth.cos(-1.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.349F;
            this.FootLeft.xRot = Mth.cos(-2.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount - 0.472F;

            this.UpperArmRight.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.262F;
            this.ArmRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount - 0.349F;
            this.HandRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.191F;

            this.ThighRight.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.535F;
            this.LegRight.xRot = Mth.cos(-1.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.349F;
            this.FootRight.xRot = Mth.cos(-2.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount - 0.472F;

            this.Body.yRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount - 0.078F;
            this.Neck.yRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * degree * -0.2F * limbSwingAmount - 0.234F;
            this.Head.yRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount + 0.312F;
            this.Hips.yRot = Mth.cos(-1.0F + limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount - 0.117F;
            this.Tail1.yRot = Mth.cos(-2.0F + limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount;
            this.Tail2.yRot = Mth.cos(-3.0F + limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount;
            this.Tail3.yRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount;
        }
    }
}

