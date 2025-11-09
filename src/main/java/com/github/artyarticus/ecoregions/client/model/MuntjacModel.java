package com.github.artyarticus.ecoregions.client.model;

import com.github.artyarticus.ecoregions.entity.MuntjacEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class MuntjacModel extends ZawaBaseModel<MuntjacEntity> {
    public ModelPart Chest;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Chest);
        }

        return this.parts;
    }

    public static class Adult extends MuntjacModel {
        public ModelPart Body;
        public ModelPart ArmBaseLeft;
        public ModelPart Neck;
        public ModelPart ArmBaseRight;
        public ModelPart Hips;
        public ModelPart ThighLeft;
        public ModelPart Tail;
        public ModelPart ThighRight;
        public ModelPart UpperLegLeft;
        public ModelPart LegLeft;
        public ModelPart FootLeft;
        public ModelPart UpperLegRight;
        public ModelPart LegRight;
        public ModelPart FootRight;
        public ModelPart UpperArmLeft;
        public ModelPart ArmLeft;
        public ModelPart HandLeft;
        public ModelPart Head;
        public ModelPart Snout;
        public ModelPart Tuft;
        public ModelPart EarLeft;
        public ModelPart EarRight;
        public ModelPart Nose;
        public ModelPart Mouth;
        public ModelPart LeftHorn1;
        public ModelPart LeftHorn1_1;
        public ModelPart LeftHorn2;
        public ModelPart LeftHorn2_1;
        public ModelPart UpperArmRight;
        public ModelPart ArmRight;
        public ModelPart HandRight;

        public Adult(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.Body = this.Chest.getChild("Body");
            this.Hips = this.Body.getChild("Hips");
            this.ThighRight = this.Hips.getChild("ThighRight");
            this.UpperLegRight = this.ThighRight.getChild("UpperLegRight");
            this.LegRight = this.UpperLegRight.getChild("LegRight");
            this.FootRight = this.LegRight.getChild("FootRight");

            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.UpperLegLeft = this.ThighLeft.getChild("UpperLegLeft");
            this.LegLeft = this.UpperLegLeft.getChild("LegLeft");
            this.FootLeft = this.LegLeft.getChild("FootLeft");

            this.Tail = this.Hips.getChild("Tail");

            this.ArmBaseRight = this.Chest.getChild("ArmBaseRight");
            this.UpperArmRight = this.ArmBaseRight.getChild("UpperArmRight");
            this.ArmRight = this.UpperArmRight.getChild("ArmRight");
            this.HandRight = this.ArmRight.getChild("HandRight");

            this.Neck = this.Chest.getChild("Neck");
            this.Head = this.Neck.getChild("Head");
            this.EarLeft = this.Head.getChild("EarLeft");

            this.Tuft = this.Head.getChild("Tuft");
            this.LeftHorn1 = this.Tuft.getChild("LeftHorn1");
            this.LeftHorn2 = this.LeftHorn1.getChild("LeftHorn2");

            this.LeftHorn1_1 = this.Tuft.getChild("LeftHorn1_1");
            this.LeftHorn2_1 = this.LeftHorn1_1.getChild("LeftHorn2_1");

            this.Snout = this.Head.getChild("Snout");
            this.Nose = this.Snout.getChild("Nose");

            this.Mouth = this.Snout.getChild("Mouth");

            this.EarRight = this.Head.getChild("EarRight");

            this.ArmBaseLeft = this.Chest.getChild("ArmBaseLeft");
            this.UpperArmLeft = this.ArmBaseLeft.getChild("UpperArmLeft");
            this.ArmLeft = this.UpperArmLeft.getChild("ArmLeft");
            this.HandLeft = this.ArmLeft.getChild("HandLeft");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Chest = partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(42, 0).addBox(-3.0F, -3.5F, -2.5F, 6.0F, 7.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 12.0F, -6.0F, -0.1563815016444822F, 0.0F, 0.0F));
            PartDefinition Body = Chest.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(11, 0).addBox(-3.5F, 0.0F, 0.0F, 7.0F, 8.0F, 8.0F), PartPose.offsetAndRotation(0.0F, -3.6F, 1.0F, 0.1563815016444822F, 0.0F, 0.0F));
            PartDefinition Hips = Body.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(40, 12).addBox(-3.0F, 0.0F, 0.0F, 6.0F, 6.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 8.0F, -0.2738421523142173F, 0.0F, 0.0F));
            PartDefinition ThighRight = Hips.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(17, 18).mirror(true).addBox(-1.5F, 0.0F, -2.5F, 3.0F, 6.0F, 5.0F), PartPose.offsetAndRotation(-2.2F, 1.5F, 2.5F, 0.17313666312941803F, 0.0F, 0.0F));
            PartDefinition UpperLegRight = ThighRight.addOrReplaceChild("UpperLegRight", CubeListBuilder.create().texOffs(20, 30).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 5.8F, -1.5F, 0.38467058311851676F, 0.0F, 0.0F));
            PartDefinition LegRight = UpperLegRight.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(21, 38).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(0.1F, 4.0F, 2.5F, -0.3141592653589793F, 0.0F, 0.0F));
            PartDefinition FootRight = LegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(4, 44).mirror(true).addBox(-1.0F, -0.7F, -1.3F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-0.1F, 3.8F, -1.2F, 0.05235987755982988F, 0.0F, 0.0F));

            PartDefinition ThighLeft = Hips.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(17, 18).addBox(-1.5F, 0.0F, -2.5F, 3.0F, 6.0F, 5.0F), PartPose.offsetAndRotation(2.2F, 1.5F, 2.5F, 0.17313666312941803F, 0.0F, 0.0F));
            PartDefinition UpperLegLeft = ThighLeft.addOrReplaceChild("UpperLegLeft", CubeListBuilder.create().texOffs(20, 30).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 5.8F, -1.5F, 0.38467058311851676F, 0.0F, 0.0F));
            PartDefinition LegLeft = UpperLegLeft.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(21, 38).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(-0.1F, 4.0F, 2.5F, -0.3141592653589793F, 0.0F, 0.0F));
            PartDefinition FootLeft = LegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(4, 44).addBox(-1.0F, -0.7F, -1.3F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.1F, 3.8F, -1.2F, 0.05235987755982988F, 0.0F, 0.0F));

            PartDefinition Tail = Hips.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(58, 25).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.3F, 4.0F, 0.32009338747892113F, 0.0F, 0.0F));

            PartDefinition ArmBaseRight = Chest.addOrReplaceChild("ArmBaseRight", CubeListBuilder.create().texOffs(1, 21).mirror(true).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(-1.8F, 0.7F, -0.3F, 0.25062927459427325F, 0.0F, 0.0F));
            PartDefinition UpperArmRight = ArmBaseRight.addOrReplaceChild("UpperArmRight", CubeListBuilder.create().texOffs(3, 30).mirror(true).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 4.0F, 1.6F, -0.06981317007977318F, 0.0F, 0.0F));
            PartDefinition ArmRight = UpperArmRight.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(4, 37).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 2.0F), PartPose.offset(-0.1F, 3.0F, -2.5F));
            PartDefinition HandRight = ArmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(4, 44).mirror(true).addBox(-1.0F, -0.7F, -1.3F, 2.0F, 2.0F, 2.0F), PartPose.offset(-0.1F, 3.8F, 0.8F));

            PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 53).addBox(-2.0F, 0.0F, -4.1F, 4.0F, 4.0F, 7.0F, new CubeDeformation(-0.1F, 0.3F, 0.0F)), PartPose.offsetAndRotation(0.0F, -3.0F, -2.0F, -0.3560471607489405F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(48, 56).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.2F, 0.2F, 0.2F)), PartPose.offsetAndRotation(0.0F, 2.4F, -4.1F, 0.6550220469681831F, 0.0F, 0.0F));
            PartDefinition EarLeft = Head.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(23, 59).addBox(-1.0F, -1.0F, -0.5F, 1.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(2.0F, -0.8F, 1.0F, 0.27366763203903305F, 0.8600982340775168F, 0.0F));

            PartDefinition Tuft = Head.addOrReplaceChild("Tuft", CubeListBuilder.create().texOffs(32, 59).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 1.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -2.5F, 0.0F, 0.11728612207217244F, 0.0F, 0.0F));
            PartDefinition LeftHorn1 = Tuft.addOrReplaceChild("LeftHorn1", CubeListBuilder.create().texOffs(30, 52).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 4.0F), PartPose.offsetAndRotation(1.1F, 0.0F, -0.1F, 0.30944686838911134F, 0.46914448828868976F, 0.0F));
            PartDefinition LeftHorn2 = LeftHorn1.addOrReplaceChild("LeftHorn2", CubeListBuilder.create().texOffs(32, 48).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.01F, 1.2F, 0.0F, 0.6764895887782301F, 0.0F));

            PartDefinition LeftHorn1_1 = Tuft.addOrReplaceChild("LeftHorn1_1", CubeListBuilder.create().texOffs(30, 52).mirror(true).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 4.0F), PartPose.offsetAndRotation(-1.1F, 0.0F, -0.1F, 0.30944686838911134F, -0.46914448828868976F, 0.0F));
            PartDefinition LeftHorn2_1 = LeftHorn1_1.addOrReplaceChild("LeftHorn2_1", CubeListBuilder.create().texOffs(32, 48).mirror(true).addBox(0.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.01F, 1.2F, 0.0F, -0.6764895887782301F, 0.0F));

            PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(52, 50).addBox(-1.5F, -1.0F, -2.0F, 3.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.7F, -2.5F, 0.19547687289441354F, 0.0F, 0.0F));
            PartDefinition Nose = Snout.addOrReplaceChild("Nose", CubeListBuilder.create().texOffs(54, 45).addBox(-1.0F, -0.6F, -0.3F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -0.5F, -1.4F, 0.23457224414434488F, 0.0F, 0.0F));

            PartDefinition Mouth = Snout.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(40, 51).addBox(-1.0F, -0.5F, -2.0F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 1.0F, 0.1F, -0.11728612207217244F, 0.0F, 0.0F));

            PartDefinition EarRight = Head.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(23, 59).mirror(true).addBox(0.0F, -1.0F, -0.5F, 1.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(-2.0F, -0.8F, 1.0F, 0.27366763203903305F, -0.8600982340775168F, 0.0F));

            PartDefinition ArmBaseLeft = Chest.addOrReplaceChild("ArmBaseLeft", CubeListBuilder.create().texOffs(1, 21).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(1.8F, 0.7F, -0.3F, 0.25062927459427325F, 0.0F, 0.0F));
            PartDefinition UpperArmLeft = ArmBaseLeft.addOrReplaceChild("UpperArmLeft", CubeListBuilder.create().texOffs(3, 30).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 4.0F, 1.6F, -0.06981317007977318F, 0.0F, 0.0F));
            PartDefinition ArmLeft = UpperArmLeft.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(4, 37).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 2.0F), PartPose.offset(-0.1F, 3.0F, -2.5F));
            PartDefinition HandLeft = ArmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(4, 44).addBox(-1.0F, -0.7F, -1.3F, 2.0F, 2.0F, 2.0F), PartPose.offset(0.1F, 3.8F, 0.8F));

            return LayerDefinition.create(meshDefinition, 64, 64);
        }

        @Override
        public void setupAnim(MuntjacEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.655F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.356F;
            this.Head.xRot = Mth.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F + 0.655F;
        }

        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            }
            if (entity.isSprinting()) {
                float speed = 1.0f;
                float degree = 0.5f;
                this.Neck.xRot = Mth.cos(1.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.356F;
                this.Head.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.655F;

                this.Chest.y = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -1F) * 0.5F + 12.0F;
                this.Chest.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.1F) * 0.5F - 0.156F;
                this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.156F;
                this.Hips.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.273F;

                this.ArmBaseLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.6F) * 0.5F + 0.25F;
                this.UpperArmLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.069F;
                this.ArmLeft.xRot = Mth.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree) * 0.5F;
                this.HandLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;
                this.ArmBaseRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.6F) * 0.5F + 0.25F;
                this.UpperArmRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.069F;
                this.ArmRight.xRot = Mth.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1F) * 0.5F;
                this.HandRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;

                this.ThighLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.3F) * 0.5F + 0.173F;
                this.UpperLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.384F;
                this.LegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.314F;
                this.FootLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.052F;
                this.ThighRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.3F) * 0.5F + 0.173F;
                this.UpperLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.384F;
                this.LegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.314F;
                this.FootRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.052F;

            } else {
                float speed = 0.8f;
                float degree = 0.6f;
                this.Neck.xRot = Mth.cos(1.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.356F;
                this.Head.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.655F;

                this.Chest.y = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -1F) * 0.5F + 12.0F;
                this.Chest.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.1F) * 0.5F - 0.156F;
                this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.156F;
                this.Hips.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.273F;

                this.ArmBaseLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.6F) * 0.5F + 0.25F;
                this.UpperArmLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.069F;
                this.ArmLeft.xRot = Mth.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree) * 0.5F;
                this.HandLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;
                this.ArmBaseRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.6F) * 0.5F + 0.25F;
                this.UpperArmRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.069F;
                this.ArmRight.xRot = Mth.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1F) * 0.5F;
                this.HandRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;

                this.ThighLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.3F) * 0.5F + 0.173F;
                this.UpperLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.384F;
                this.LegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.314F;
                this.FootLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.052F;
                this.ThighRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.3F) * 0.5F + 0.173F;
                this.UpperLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.384F;
                this.LegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.314F;
                this.FootRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.052F;
            }
        }
    }

    public static class Child extends MuntjacModel {
        public ModelPart Body;
        public ModelPart Neck;
        public ModelPart ArmBaseLeft;
        public ModelPart ArmBaseRight;
        public ModelPart ThighLeft;
        public ModelPart ThighRight;
        public ModelPart Tail;
        public ModelPart UpperLegLeft;
        public ModelPart LowerLegLeft;
        public ModelPart FootLeft;
        public ModelPart UpperLegRight;
        public ModelPart LowerLegRight;
        public ModelPart FootRight;
        public ModelPart Head;
        public ModelPart EarLeft;
        public ModelPart EarRight;
        public ModelPart Snout;
        public ModelPart TopSnout;
        public ModelPart Mouth;
        public ModelPart UpperArmLeft;
        public ModelPart ArmLeft;
        public ModelPart HandLeft;
        public ModelPart UpperArmRight;
        public ModelPart ArmRight;
        public ModelPart HandRight;

        public Child(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.ArmBaseRight = this.Chest.getChild("ArmBaseRight");
            this.UpperArmRight = this.ArmBaseRight.getChild("UpperArmRight");
            this.ArmRight = this.UpperArmRight.getChild("ArmRight");
            this.HandRight = this.ArmRight.getChild("HandRight");

            this.ArmBaseLeft = this.Chest.getChild("ArmBaseLeft");
            this.UpperArmLeft = this.ArmBaseLeft.getChild("UpperArmLeft");
            this.ArmLeft = this.UpperArmLeft.getChild("ArmLeft");
            this.HandLeft = this.ArmLeft.getChild("HandLeft");

            this.Neck = this.Chest.getChild("Neck");
            this.Head = this.Neck.getChild("Head");
            this.EarLeft = this.Head.getChild("EarLeft");

            this.Snout = this.Head.getChild("Snout");
            this.TopSnout = this.Snout.getChild("TopSnout");

            this.Mouth = this.Snout.getChild("Mouth");

            this.EarRight = this.Head.getChild("EarRight");

            this.Body = this.Chest.getChild("Body");
            this.Tail = this.Body.getChild("Tail");

            this.ThighLeft = this.Body.getChild("ThighLeft");
            this.UpperLegLeft = this.ThighLeft.getChild("UpperLegLeft");
            this.LowerLegLeft = this.UpperLegLeft.getChild("LowerLegLeft");
            this.FootLeft = this.LowerLegLeft.getChild("FootLeft");

            this.ThighRight = this.Body.getChild("ThighRight");
            this.UpperLegRight = this.ThighRight.getChild("UpperLegRight");
            this.LowerLegRight = this.UpperLegRight.getChild("LowerLegRight");
            this.FootRight = this.LowerLegRight.getChild("FootRight");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Chest = partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(13, 0).addBox(-1.5F, -2.0F, -2.0F, 3.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 17.5F, -2.5F, -0.2275909337942703F, 0.0F, 0.0F));
            PartDefinition ArmBaseRight = Chest.addOrReplaceChild("ArmBaseRight", CubeListBuilder.create().texOffs(15, 22).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-1.1F, -0.5F, -1.0F, 0.3490658503988659F, 0.0F, 0.0F));
            PartDefinition UpperArmRight = ArmBaseRight.addOrReplaceChild("UpperArmRight", CubeListBuilder.create().texOffs(24, 23).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 2.8F, 0.5F, -0.08726646259971647F, 0.0F, 0.0F));
            PartDefinition ArmRight = UpperArmRight.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(16, 27).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offset(0.05F, 2.0F, -1.0F));
            PartDefinition HandRight = ArmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(21, 29).addBox(-0.5F, 0.0F, -0.7F, 1.0F, 1.0F, 1.0F), PartPose.offset(0.1F, 1.5F, 0.3F));

            PartDefinition ArmBaseLeft = Chest.addOrReplaceChild("ArmBaseLeft", CubeListBuilder.create().texOffs(15, 22).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(1.1F, -0.5F, -1.0F, 0.3490658503988659F, 0.0F, 0.0F));
            PartDefinition UpperArmLeft = ArmBaseLeft.addOrReplaceChild("UpperArmLeft", CubeListBuilder.create().texOffs(24, 23).mirror(true).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 2.8F, 0.5F, -0.08726646259971647F, 0.0F, 0.0F));
            PartDefinition ArmLeft = UpperArmLeft.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(16, 27).mirror(true).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offset(-0.05F, 2.0F, -1.0F));
            PartDefinition HandLeft = ArmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(21, 29).mirror(true).addBox(-0.5F, 0.0F, -0.7F, 1.0F, 1.0F, 1.0F), PartPose.offset(-0.1F, 1.5F, 0.3F));

            PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -2.5F, -1.5F, 2.0F, 5.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -1.0F, -2.0F, 0.9105382388075086F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(19, 9).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -2.0F, -1.0F, -0.591841146688116F, 0.0F, 0.0F));
            PartDefinition EarLeft = Head.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(26, 28).addBox(-0.5F, -1.8F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(1.0F, 0.0F, 0.3F, 0.0F, -0.4098033003787853F, 0.7740534966278743F));

            PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(24, 5).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -0.6F, 0.13962634015954636F, 0.0F, 0.0F));
            PartDefinition TopSnout = Snout.addOrReplaceChild("TopSnout", CubeListBuilder.create().texOffs(24, 1).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -0.7F, -0.6F, 0.4098033003787853F, 0.0F, 0.0F));

            PartDefinition Mouth = Snout.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(0, 13).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.4F, 0.1F, -0.04555309164612875F, 0.0F, 0.0F));

            PartDefinition EarRight = Head.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(26, 28).addBox(-0.5F, -1.8F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.3F, 0.0F, 0.4098033003787853F, -0.7740534966278743F));

            PartDefinition Body = Chest.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 10).addBox(-2.0F, -0.5F, -1.0F, 4.0F, 4.0F, 6.0F), PartPose.offsetAndRotation(0.0F, -1.5F, 0.0F, 0.2275909337942703F, 0.0F, 0.0F));
            PartDefinition Tail = Body.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(9, 0).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 4.5F, 0.45535640450848164F, 0.0F, 0.0F));

            PartDefinition ThighLeft = Body.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(0, 21).mirror(true).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(1.4F, 0.5F, 3.5F, -0.05235987755982988F, 0.0F, 0.0F));
            PartDefinition UpperLegLeft = ThighLeft.addOrReplaceChild("UpperLegLeft", CubeListBuilder.create().texOffs(0, 27).mirror(true).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 2.5F, -1.2F, 0.6632251157578453F, 0.0F, 0.0F));
            PartDefinition LowerLegLeft = UpperLegLeft.addOrReplaceChild("LowerLegLeft", CubeListBuilder.create().texOffs(10, 21).mirror(true).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(-0.05F, 3.0F, 1.7F, -0.767944870877505F, 0.0F, 0.0F));
            PartDefinition FootLeft = LowerLegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(6, 30).mirror(true).addBox(-0.5F, 0.0F, -0.7F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.1F, 2.7F, -0.7F, 0.13962634015954636F, 0.0F, 0.0F));

            PartDefinition ThighRight = Body.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(0, 21).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(-1.4F, 0.5F, 3.5F, -0.05235987755982988F, 0.0F, 0.0F));
            PartDefinition UpperLegRight = ThighRight.addOrReplaceChild("UpperLegRight", CubeListBuilder.create().texOffs(0, 27).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 2.5F, -1.2F, 0.6632251157578453F, 0.0F, 0.0F));
            PartDefinition LowerLegRight = UpperLegRight.addOrReplaceChild("LowerLegRight", CubeListBuilder.create().texOffs(10, 21).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.05F, 3.0F, 1.7F, -0.767944870877505F, 0.0F, 0.0F));
            PartDefinition FootRight = LowerLegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(6, 30).addBox(-0.5F, 0.0F, -0.7F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.1F, 2.7F, -0.7F, 0.13962634015954636F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 32, 32);
        }

        @Override
        public void setupAnim(MuntjacEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) - 0.59F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 0.91F;
            this.Head.xRot = Mth.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F - 0.59F;

            this.Tail.xRot = Mth.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.46F;
            this.Tail.zRot = Mth.cos(1.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.2f;
            float degree = 0.8f;
            this.Neck.xRot = Mth.cos(1.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.15F) * 0.5F + 0.91F;
            this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F - 0.59F;
            this.Chest.y = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 17.5F;
            this.Chest.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F - 0.23F;
            this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.23F;
            this.ArmBaseLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -0.9F) * 0.5F + 0.35F;
            this.ArmLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F + 0.0F;
            this.UpperArmLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.09F;
            this.HandLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F + 0.0F;
            this.ArmBaseRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.9F) * 0.5F + 0.35F;
            this.ArmRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F + 0.0F;
            this.UpperArmRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.09F;
            this.HandRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F + 0.0F;
            this.ThighLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.3F) * 0.5F - 0.05F;
            this.UpperLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.66F;
            this.LowerLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.77F;
            this.FootLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F;
            this.ThighRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.3F) * 0.5F - 0.05F;
            this.UpperLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.66F;
            this.LowerLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.77F;
            this.FootRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F;

        }
    }
}


