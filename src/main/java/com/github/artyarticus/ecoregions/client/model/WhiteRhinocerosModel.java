package com.github.artyarticus.ecoregions.client.model;

import com.github.artyarticus.ecoregions.entity.WhiteRhinocerosEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class WhiteRhinocerosModel extends ZawaBaseModel<WhiteRhinocerosEntity> {
    public ModelPart Chest;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Chest);
        }

        return this.parts;
    }

    public static class Adult extends WhiteRhinocerosModel {

        public ModelPart Body;
        public ModelPart ArmBaseLeft;
        public ModelPart Neck;
        public ModelPart ArmBaseRight;
        public ModelPart Hips;
        public ModelPart ThighLeft;
        public ModelPart ThighRight;
        public ModelPart Tail;
        public ModelPart UpperLegLeft;
        public ModelPart LegLeft;
        public ModelPart FootLeft;
        public ModelPart UpperLegRight;
        public ModelPart LegRight;
        public ModelPart FootRight;
        public ModelPart ArmLeft;
        public ModelPart HandLeft;
        public ModelPart HandLeft_1;
        public ModelPart Head;
        public ModelPart NeckBottom;
        public ModelPart SnoutBack;
        public ModelPart Forehead;
        public ModelPart Nose;
        public ModelPart Mouth;
        public ModelPart HornBack;
        public ModelPart SnoutFront;
        public ModelPart HornBottom;
        public ModelPart HornMiddle;
        public ModelPart Horn1;
        public ModelPart Horn2;
        public ModelPart HornTopBack;
        public ModelPart EarLeft;
        public ModelPart EarRight;
        public ModelPart ArmRight;
        public ModelPart HandRight;
        public ModelPart FootRight_1;

        public Adult(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.ArmBaseLeft = this.Chest.getChild("ArmBaseLeft");
            this.ArmLeft = this.ArmBaseLeft.getChild("ArmLeft");
            this.HandLeft = this.ArmLeft.getChild("HandLeft");
            this.HandLeft_1 = this.HandLeft.getChild("HandLeft_1");

            this.ArmBaseRight = this.Chest.getChild("ArmBaseRight");
            this.ArmRight = this.ArmBaseRight.getChild("ArmRight");
            this.HandRight = this.ArmRight.getChild("HandRight");
            this.FootRight_1 = this.HandRight.getChild("FootRight_1");

            this.Neck = this.Chest.getChild("Neck");
            this.NeckBottom = this.Neck.getChild("NeckBottom");

            this.Head = this.Neck.getChild("Head");
            this.SnoutBack = this.Head.getChild("SnoutBack");
            this.Mouth = this.SnoutBack.getChild("Mouth");

            this.HornBack = this.SnoutBack.getChild("HornBack");
            this.HornTopBack = this.HornBack.getChild("HornTopBack");

            this.Nose = this.SnoutBack.getChild("Nose");
            this.HornBottom = this.Nose.getChild("HornBottom");
            this.HornMiddle = this.HornBottom.getChild("HornMiddle");
            this.Horn1 = this.HornMiddle.getChild("Horn1");
            this.Horn2 = this.Horn1.getChild("Horn2");

            this.SnoutFront = this.Nose.getChild("SnoutFront");

            this.Forehead = this.Head.getChild("Forehead");
            this.EarLeft = this.Forehead.getChild("EarLeft");

            this.EarRight = this.Forehead.getChild("EarRight");

            this.Body = this.Chest.getChild("Body");
            this.Hips = this.Body.getChild("Hips");
            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.UpperLegLeft = this.ThighLeft.getChild("UpperLegLeft");
            this.LegLeft = this.UpperLegLeft.getChild("LegLeft");
            this.FootLeft = this.LegLeft.getChild("FootLeft");

            this.Tail = this.Hips.getChild("Tail");

            this.ThighRight = this.Hips.getChild("ThighRight");
            this.UpperLegRight = this.ThighRight.getChild("UpperLegRight");
            this.LegRight = this.UpperLegRight.getChild("LegRight");
            this.FootRight = this.LegRight.getChild("FootRight");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Chest = partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 35).addBox(-7.5F, -9.0F, -5.0F, 15.0F, 19.0F, 10.0F), PartPose.offsetAndRotation(0.0F, 4.0F, -3.1F, -0.19547687289441354F, 0.0F, 0.0F));
            PartDefinition ArmBaseLeft = Chest.addOrReplaceChild("ArmBaseLeft", CubeListBuilder.create().texOffs(88, 72).addBox(-5.5F, 0.0F, -3.5F, 7.0F, 9.0F, 7.0F), PartPose.offsetAndRotation(6.3F, 2.0F, -1.0F, 0.2485348814892509F, 0.0F, 0.0F));
            PartDefinition ArmLeft = ArmBaseLeft.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(86, 88).addBox(-2.5F, -0.5F, -2.5F, 5.0F, 5.0F, 5.0F), PartPose.offsetAndRotation(-2.0F, 8.5F, 0.0F, -0.08726646259971647F, -0.0F, 0.0F));
            PartDefinition HandLeft = ArmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(72, 95).addBox(-2.0F, -0.5F, 0.0F, 4.0F, 5.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 4.0F, -2.0F, -0.08726646259971647F, 0.0F, 0.0F));
            PartDefinition HandLeft_1 = HandLeft.addOrReplaceChild("HandLeft_1", CubeListBuilder.create().texOffs(106, 96).addBox(-2.5F, 0.0F, -2.8F, 5.0F, 2.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 4.0F, 2.1F, 0.10890854132970453F, 0.0F, 0.0F));

            PartDefinition ArmBaseRight = Chest.addOrReplaceChild("ArmBaseRight", CubeListBuilder.create().texOffs(88, 72).mirror(true).addBox(-1.5F, 0.0F, -3.5F, 7.0F, 9.0F, 7.0F), PartPose.offsetAndRotation(-6.3F, 2.0F, -1.0F, 0.2485348814892509F, 0.0F, 0.0F));
            PartDefinition ArmRight = ArmBaseRight.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(86, 88).mirror(true).addBox(-2.5F, -0.5F, -2.5F, 5.0F, 5.0F, 5.0F), PartPose.offsetAndRotation(2.0F, 8.5F, 0.0F, -0.08726646259971647F, -0.0F, 0.0F));
            PartDefinition HandRight = ArmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(72, 95).mirror(true).addBox(-2.0F, -0.5F, 0.0F, 4.0F, 5.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 4.0F, -2.0F, -0.08726646259971647F, 0.0F, 0.0F));
            PartDefinition FootRight_1 = HandRight.addOrReplaceChild("FootRight_1", CubeListBuilder.create().texOffs(106, 96).mirror(true).addBox(-2.5F, 0.0F, -2.8F, 5.0F, 2.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 4.0F, 2.0F, 0.10890854132970453F, 0.0F, 0.0F));

            PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(51, 53).addBox(-5.0F, -0.8F, -10.1F, 10.0F, 11.0F, 11.0F), PartPose.offsetAndRotation(0.0F, -7.6F, -5.0F, 0.5864306020384839F, 0.0F, 0.0F));
            PartDefinition NeckBottom = Neck.addOrReplaceChild("NeckBottom", CubeListBuilder.create().texOffs(53, 38).addBox(-4.0F, -3.5F, -9.5F, 8.0F, 5.0F, 8.0F), PartPose.offsetAndRotation(0.0F, 15.0F, -4.0F, -0.6255260065779288F, 0.0F, 0.0F));

            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(24, 92).addBox(-4.5F, -0.5F, -6.5F, 9.0F, 10.0F, 7.0F), PartPose.offsetAndRotation(0.0F, 1.3F, -10.5F, 0.1558579075294158F, 0.0F, 0.0F));
            PartDefinition SnoutBack = Head.addOrReplaceChild("SnoutBack", CubeListBuilder.create().texOffs(0, 103).addBox(-4.0F, 0.0F, -4.0F, 8.0F, 9.0F, 6.0F, new CubeDeformation(-0.1F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -5.0F, -0.35185837453889574F, 0.0F, 0.0F));
            PartDefinition Mouth = SnoutBack.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(30, 110).addBox(-3.0F, -1.5F, -4.0F, 6.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 8.5F, -4.0F, -0.1563815016444822F, 0.0F, 0.0F));

            PartDefinition HornBack = SnoutBack.addOrReplaceChild("HornBack", CubeListBuilder.create().texOffs(50, 112).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 3.0F, -1.5F, 0.28274335213888685F, -0.0F, 0.0F));
            PartDefinition HornTopBack = HornBack.addOrReplaceChild("HornTopBack", CubeListBuilder.create().texOffs(60, 113).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -4.0F, 0.5F, 0.7853981633974483F, 0.0F, 0.0F));

            PartDefinition Nose = SnoutBack.addOrReplaceChild("Nose", CubeListBuilder.create().texOffs(24, 117).addBox(-3.5F, -0.5F, -5.0F, 7.0F, 6.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 0.5F, -3.0F, 0.4300491170387584F, 0.0F, 0.0F));
            PartDefinition HornBottom = Nose.addOrReplaceChild("HornBottom", CubeListBuilder.create().texOffs(0, 94).addBox(-2.0F, -1.5F, -2.5F, 4.0F, 3.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -1.1F, -2.5F, 0.20891591612425317F, 0.0F, 0.0F));
            PartDefinition HornMiddle = HornBottom.addOrReplaceChild("HornMiddle", CubeListBuilder.create().texOffs(55, 121).addBox(-1.5F, -2.0F, -3.0F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -1.2F, 1.0F, -0.3707079291288539F, 0.0F, 0.0F));
            PartDefinition Horn1 = HornMiddle.addOrReplaceChild("Horn1", CubeListBuilder.create().texOffs(17, 95).addBox(-1.0F, -3.9F, -0.5F, 2.0F, 5.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -2.0F, -2.0F, -0.39165189346859136F, 0.0F, 0.0F));
            PartDefinition Horn2 = Horn1.addOrReplaceChild("Horn2", CubeListBuilder.create().texOffs(17, 95).addBox(-1.0F, -4.0F, -1.4F, 2.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(-0.01F, -0.1F, 2.0F, 0.27366763203903305F, 0.0F, 0.0F));

            PartDefinition SnoutFront = Nose.addOrReplaceChild("SnoutFront", CubeListBuilder.create().texOffs(0, 118).addBox(-4.0F, -1.0F, -0.9F, 8.0F, 6.0F, 4.0F, new CubeDeformation(0.1F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, -5.0F, -0.4300491170387584F, 0.0F, 0.0F));

            PartDefinition Forehead = Head.addOrReplaceChild("Forehead", CubeListBuilder.create().texOffs(57, 80).addBox(-4.0F, 0.0F, 0.0F, 8.0F, 3.0F, 6.0F), PartPose.offsetAndRotation(0.0F, -0.5F, -5.0F, 0.23457224414434488F, 0.0F, 0.0F));
            PartDefinition EarLeft = Forehead.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(50, 120).mirror(true).addBox(-0.7F, -3.0F, -0.5F, 2.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(4.0F, 1.0F, 4.1F, -0.443488160268598F, 0.0F, 0.39112828270876815F));

            PartDefinition EarRight = Forehead.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(50, 120).addBox(-1.3F, -3.0F, -0.5F, 2.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(-4.0F, 1.0F, 4.1F, -0.443488160268598F, 0.0F, -0.39112828270876815F));

            PartDefinition Body = Chest.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-9.0F, -1.5F, -4.0F, 18.0F, 18.0F, 17.0F), PartPose.offsetAndRotation(0.0F, -6.5F, 3.5F, 0.19582594673429568F, 0.0F, 0.0F));
            PartDefinition Hips = Body.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 64).addBox(-8.0F, 0.0F, 0.0F, 16.0F, 16.0F, 12.0F), PartPose.offsetAndRotation(0.0F, -1.0F, 12.5F, -0.19547687289441354F, 0.0F, 0.0F));
            PartDefinition ThighLeft = Hips.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(68, 105).addBox(-4.0F, -4.0F, -5.0F, 8.0F, 13.0F, 10.0F), PartPose.offsetAndRotation(5.1F, 7.5F, 7.5F, 0.09634217437719185F, 0.0F, 0.0F));
            PartDefinition UpperLegLeft = ThighLeft.addOrReplaceChild("UpperLegLeft", CubeListBuilder.create().texOffs(104, 115).addBox(-3.0F, 0.0F, 0.0F, 5.0F, 7.0F, 6.0F), PartPose.offsetAndRotation(0.5F, 9.0F, -4.0F, 0.6108652381980153F, 0.0F, 0.0F));
            PartDefinition LegLeft = UpperLegLeft.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(108, 104).addBox(-2.0F, 0.0F, -4.0F, 4.0F, 6.0F, 4.0F), PartPose.offsetAndRotation(-0.5F, 6.9F, 5.0F, -0.6108652381980153F, -0.0F, 0.0F));
            PartDefinition FootLeft = LegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(106, 96).addBox(-2.5F, 0.0F, -2.5F, 5.0F, 2.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 5.0F, -2.0F, 0.0781907508222411F, 0.0F, 0.0F));

            PartDefinition Tail = Hips.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(74, 23).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 10.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.8F, 12.0F, 0.21362829644936432F, -0.0F, 0.0F));

            PartDefinition ThighRight = Hips.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(68, 105).mirror(true).addBox(-4.0F, -4.0F, -5.0F, 8.0F, 13.0F, 10.0F), PartPose.offsetAndRotation(-5.1F, 7.5F, 7.5F, 0.09634217437719185F, 0.0F, 0.0F));
            PartDefinition UpperLegRight = ThighRight.addOrReplaceChild("UpperLegRight", CubeListBuilder.create().texOffs(104, 115).mirror(true).addBox(-3.0F, 0.0F, 0.0F, 5.0F, 7.0F, 6.0F), PartPose.offsetAndRotation(0.5F, 9.0F, -4.0F, 0.6108652381980153F, 0.0F, 0.0F));
            PartDefinition LegRight = UpperLegRight.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(108, 104).mirror(true).addBox(-2.0F, 0.0F, -4.0F, 4.0F, 6.0F, 4.0F), PartPose.offsetAndRotation(-0.5F, 6.9F, 5.0F, -0.6108652381980153F, -0.0F, 0.0F));
            PartDefinition FootRight = LegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(106, 96).mirror(true).addBox(-2.5F, 0.0F, -2.5F, 5.0F, 2.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 5.0F, -2.0F, 0.0781907508222411F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 128, 128);
        }

        @Override
        public void setupAnim(WhiteRhinocerosEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.16F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 0.59F;
            this.Head.xRot = Mth.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F + 0.16F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (entity.isSprinting()) {
                float speed = 1.0f;
                float degree = 0.5f;
            } else {
                float speed = 0.6f;
                float degree = 0.6f;
                this.Neck.xRot = Mth.cos(1.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 0.59F;
                this.Head.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.16F;

                this.Chest.y = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -1F) * 0.5F + 4.0F;
                this.Chest.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.1F) * 0.5F - 0.19F;
                this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.19F;
                this.Hips.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.19F;

                this.ArmBaseLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.6F) * 0.5F + 0.25F;
                this.ArmLeft.xRot = Mth.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree) * 0.5F - 0.09F;
                this.HandLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F - 0.09F;
                this.ArmBaseRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.6F) * 0.5F + 0.25F;
                this.ArmRight.xRot = Mth.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1F) * 0.5F - 0.09F;
                this.HandRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F - 0.09F;

                this.ThighLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.3F) * 0.5F + 0.09F;
                this.UpperLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.61F;
                this.LegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.61F;
                this.FootLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.139F;
                this.ThighRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.3F) * 0.5F + 0.09F;
                this.UpperLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.61F;
                this.LegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.61F;
                this.FootRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.078F;
            }
        }
    }

    public static class Child extends WhiteRhinocerosModel {

        public ModelPart Body;
        public ModelPart ArmBaseLeft;
        public ModelPart ArmBaseRight;
        public ModelPart Neck;
        public ModelPart Hips;
        public ModelPart ThighLeft;
        public ModelPart ThighRight;
        public ModelPart Tail;
        public ModelPart UpperLegLeft;
        public ModelPart LegLeft;
        public ModelPart HandLeft;
        public ModelPart UpperLegRight;
        public ModelPart LegRight;
        public ModelPart HandRight;
        public ModelPart ArmLeft;
        public ModelPart HandLeft_1;
        public ModelPart HandLeft_2;
        public ModelPart ArmRight;
        public ModelPart HandRight_1;
        public ModelPart HandRight_2;
        public ModelPart Head;
        public ModelPart EarLeft;
        public ModelPart EarRight;
        public ModelPart Snout;
        public ModelPart Mouth;
        public ModelPart Nose;
        public ModelPart Horn;

        public Child(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.ArmBaseLeft = this.Chest.getChild("ArmBaseLeft");
            this.ArmLeft = this.ArmBaseLeft.getChild("ArmLeft");
            this.HandLeft_1 = this.ArmLeft.getChild("HandLeft_1");
            this.HandLeft_2 = this.HandLeft_1.getChild("HandLeft_2");

            this.Neck = this.Chest.getChild("Neck");
            this.Head = this.Neck.getChild("Head");
            this.Snout = this.Head.getChild("Snout");
            this.Nose = this.Snout.getChild("Nose");
            this.Horn = this.Nose.getChild("Horn");

            this.EarRight = this.Head.getChild("EarRight");

            this.Mouth = this.Head.getChild("Mouth");

            this.EarLeft = this.Head.getChild("EarLeft");

            this.Body = this.Chest.getChild("Body");
            this.Hips = this.Body.getChild("Hips");
            this.ThighRight = this.Hips.getChild("ThighRight");
            this.UpperLegRight = this.ThighRight.getChild("UpperLegRight");
            this.LegRight = this.UpperLegRight.getChild("LegRight");
            this.HandRight = this.LegRight.getChild("HandRight");

            this.Tail = this.Hips.getChild("Tail");

            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.UpperLegLeft = this.ThighLeft.getChild("UpperLegLeft");
            this.LegLeft = this.UpperLegLeft.getChild("LegLeft");
            this.HandLeft = this.LegLeft.getChild("HandLeft");

            this.ArmBaseRight = this.Chest.getChild("ArmBaseRight");
            this.ArmRight = this.ArmBaseRight.getChild("ArmRight");
            this.HandRight_1 = this.ArmRight.getChild("HandRight_1");
            this.HandRight_2 = this.HandRight_1.getChild("HandRight_2");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Chest = partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(42, 0).addBox(-3.5F, -3.5F, -2.0F, 7.0F, 7.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 13.6F, -4.0F, -0.15655603856442327F, 0.0F, 0.0F));
            PartDefinition ArmBaseLeft = Chest.addOrReplaceChild("ArmBaseLeft", CubeListBuilder.create().texOffs(20, 0).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(2.1F, 2.0F, -0.2F, 0.2485348814892509F, 0.0F, 0.0F));
            PartDefinition ArmLeft = ArmBaseLeft.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(20, 7).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 4.3F, 0.0F, -0.08726646259971647F, -0.0F, 0.0F));
            PartDefinition HandLeft_1 = ArmLeft.addOrReplaceChild("HandLeft_1", CubeListBuilder.create().texOffs(20, 11).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 1.2F, -1.0F, -0.08726646259971647F, 0.0F, 0.0F));
            PartDefinition HandLeft_2 = HandLeft_1.addOrReplaceChild("HandLeft_2", CubeListBuilder.create().texOffs(20, 15).addBox(-1.5F, 0.0F, -1.3F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F, 0.0F, 0.2F)), PartPose.offsetAndRotation(0.0F, 1.9F, 1.1F, 0.10890854132970453F, 0.0F, 0.0F));

            PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(40, 45).mirror(true).addBox(-2.0F, -0.5F, -2.7F, 4.0F, 5.0F, 6.0F), PartPose.offsetAndRotation(0.0F, -3.0F, -2.0F, -0.3127630032889644F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 54).addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(-0.2F, 0.0F, 0.1F)), PartPose.offsetAndRotation(0.0F, 3.0F, -2.8F, 0.7819074915776542F, 0.0F, 0.0F));
            PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(0, 46).addBox(-2.0F, -0.2F, -2.4F, 4.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -1.8F, -3.1F, -0.07836527941980377F, 0.0F, 0.0F));
            PartDefinition Nose = Snout.addOrReplaceChild("Nose", CubeListBuilder.create().texOffs(0, 41).addBox(-1.5F, -0.4F, -2.8F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, -0.2F)), PartPose.offsetAndRotation(0.0F, -0.2F, 0.3F, 0.19547687289441354F, 0.0F, 0.0F));
            PartDefinition Horn = Nose.addOrReplaceChild("Horn", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -1.1F, 0.6646214111173737F, 0.0F, 0.0F));

            PartDefinition EarRight = Head.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(0, 33).mirror(true).addBox(-1.3F, -3.0F, -0.5F, 2.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(-2.0F, -1.7F, 2.0F, 0.443488160268598F, 0.0F, -0.39112828270876815F));

            PartDefinition Mouth = Head.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(0, 37).addBox(-1.5F, -0.8F, -3.4F, 3.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 2.3F, -2.2F, -0.11728612207217244F, 0.0F, 0.0F));

            PartDefinition EarLeft = Head.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(0, 33).mirror(true).addBox(-0.7F, -3.0F, -0.5F, 2.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(2.0F, -1.7F, 2.0F, 0.443488160268598F, 0.0F, 0.39112828270876815F));

            PartDefinition Body = Chest.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(36, 11).addBox(-4.0F, -0.3F, -0.3F, 8.0F, 8.0F, 6.0F, new CubeDeformation(0.0F, -0.3F, 0.3F)), PartPose.offsetAndRotation(0.0F, -3.5F, 1.4F, 0.1563815016444822F, 0.0F, 0.0F));
            PartDefinition Hips = Body.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(40, 25).addBox(-3.5F, 0.0F, 0.0F, 7.0F, 6.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, -0.31293754020890546F, 0.0F, 0.0F));
            PartDefinition ThighRight = Hips.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(4, 0).mirror(true).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(-0.2F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-1.9F, 1.9F, 3.0F, 0.21362829644936432F, 0.0F, 0.0F));
            PartDefinition UpperLegRight = ThighRight.addOrReplaceChild("UpperLegRight", CubeListBuilder.create().texOffs(4, 10).mirror(true).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(-0.0F, 6.0F, -2.0F, 0.6108652381980153F, 0.0F, 0.0F));
            PartDefinition LegRight = UpperLegRight.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(4, 15).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(-0.2F, 1.9F, 2.5F, -0.6108652381980153F, -0.0F, 0.0F));
            PartDefinition HandRight = LegRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(4, 21).mirror(true).addBox(-1.5F, 0.0F, -1.3F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F, 0.0F, 0.2F)), PartPose.offsetAndRotation(0.0F, 3.9F, -0.9F, 0.10890854132970453F, 0.0F, 0.0F));

            PartDefinition Tail = Hips.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(54, 36).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.2F, 4.6F, 0.3700098147386033F, -0.0F, 0.0F));

            PartDefinition ThighLeft = Hips.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(4, 0).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(-0.2F, 0.0F, 0.0F)), PartPose.offsetAndRotation(1.9F, 1.9F, 3.0F, 0.21362829644936432F, 0.0F, 0.0F));
            PartDefinition UpperLegLeft = ThighLeft.addOrReplaceChild("UpperLegLeft", CubeListBuilder.create().texOffs(4, 10).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 6.0F, -2.0F, 0.6108652381980153F, 0.0F, 0.0F));
            PartDefinition LegLeft = UpperLegLeft.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(4, 15).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(-0.2F, 1.9F, 2.5F, -0.6108652381980153F, -0.0F, 0.0F));
            PartDefinition HandLeft = LegLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(4, 21).addBox(-1.5F, 0.0F, -1.3F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F, 0.0F, 0.2F)), PartPose.offsetAndRotation(0.0F, 3.9F, -0.9F, 0.10890854132970453F, 0.0F, 0.0F));

            PartDefinition ArmBaseRight = Chest.addOrReplaceChild("ArmBaseRight", CubeListBuilder.create().texOffs(20, 0).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(-2.1F, 2.0F, -0.2F, 0.2485348814892509F, 0.0F, 0.0F));
            PartDefinition ArmRight = ArmBaseRight.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(20, 7).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 4.3F, 0.0F, -0.08726646259971647F, -0.0F, 0.0F));
            PartDefinition HandRight_1 = ArmRight.addOrReplaceChild("HandRight_1", CubeListBuilder.create().texOffs(20, 11).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 1.2F, -1.0F, -0.08726646259971647F, 0.0F, 0.0F));
            PartDefinition HandRight_2 = HandRight_1.addOrReplaceChild("HandRight_2", CubeListBuilder.create().texOffs(20, 15).mirror(true).addBox(-1.5F, 0.0F, -1.3F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F, 0.0F, 0.2F)), PartPose.offsetAndRotation(0.0F, 1.9F, 1.1F, 0.10890854132970453F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 64, 64);
        }

        @Override
        public void setupAnim(WhiteRhinocerosEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.78F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.31F;
            this.Head.xRot = Mth.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F + 0.78F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (entity.isSprinting()) {
                float speed = 1.0f;
                float degree = 0.5f;
            } else {
                float speed = 0.6f;
                float degree = 0.6f;
                this.Neck.xRot = Mth.cos(1.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.31F;
                this.Head.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.78F;

                this.Chest.y = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -1F) * 0.5F + 13.6F;
                this.Chest.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.1F) * 0.5F - 0.16F;
                this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.16F;
                this.Hips.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.31F;

                this.ArmBaseLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.6F) * 0.5F + 0.25F;
                this.ArmLeft.xRot = Mth.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree) * 0.5F - 0.09F;
                this.HandLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F + 0.11F;
                this.ArmBaseRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.6F) * 0.5F + 0.25F;
                this.ArmRight.xRot = Mth.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1F) * 0.5F - 0.09F;
                this.HandRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F + 0.11F;

                this.ThighLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.3F) * 0.5F + 0.21F;
                this.UpperLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.61F;
                this.LegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.61F;
                this.HandLeft_2.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.11F;
                this.ThighRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.3F) * 0.5F + 0.21F;
                this.UpperLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.61F;
                this.LegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.61F;
                this.HandRight_2.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.11F;
            }
        }
    }
}

