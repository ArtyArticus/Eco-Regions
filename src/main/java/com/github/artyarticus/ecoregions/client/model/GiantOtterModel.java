package com.github.artyarticus.ecoregions.client.model;

import com.github.artyarticus.ecoregions.entity.GiantOtterEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class GiantOtterModel extends ZawaBaseModel<GiantOtterEntity> {
    public ModelPart Body;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Body);
        }

        return this.parts;
    }

    public static class Adult extends GiantOtterModel {

        public ModelPart Back;
        public ModelPart Chest;
        public ModelPart Hips;
        public ModelPart ThighLeft;
        public ModelPart ThighRight;
        public ModelPart Tail1;
        public ModelPart LegLeft;
        public ModelPart FootLeft;
        public ModelPart LegRight;
        public ModelPart FootRight;
        public ModelPart Tail2;
        public ModelPart Tail3;
        public ModelPart ArmBaseLeft;
        public ModelPart ArmBaseRight;
        public ModelPart Neck;
        public ModelPart ArmLeft;
        public ModelPart HandLeft;
        public ModelPart ArmRight;
        public ModelPart HandRight;
        public ModelPart NeckBase;
        public ModelPart Head;
        public ModelPart Snout;
        public ModelPart EarRight;
        public ModelPart EarLeft;
        public ModelPart Mouth;
        public ModelPart TopSnout;

        public Adult(ModelPart root) {
            this.Body = root.getChild("Body");
            this.Chest = this.Body.getChild("Chest");
            this.Neck = this.Chest.getChild("Neck");
            this.Head = this.Neck.getChild("Head");
            this.Snout = this.Head.getChild("Snout");
            this.Mouth = this.Snout.getChild("Mouth");

            this.TopSnout = this.Snout.getChild("TopSnout");

            this.EarLeft = this.Head.getChild("EarLeft");

            this.EarRight = this.Head.getChild("EarRight");

            this.NeckBase = this.Neck.getChild("NeckBase");

            this.ArmBaseLeft = this.Chest.getChild("ArmBaseLeft");
            this.ArmLeft = this.ArmBaseLeft.getChild("ArmLeft");
            this.HandLeft = this.ArmLeft.getChild("HandLeft");

            this.ArmBaseRight = this.Chest.getChild("ArmBaseRight");
            this.ArmRight = this.ArmBaseRight.getChild("ArmRight");
            this.HandRight = this.ArmRight.getChild("HandRight");

            this.Back = this.Body.getChild("Back");
            this.Hips = this.Back.getChild("Hips");
            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.LegLeft = this.ThighLeft.getChild("LegLeft");
            this.FootLeft = this.LegLeft.getChild("FootLeft");

            this.ThighRight = this.Hips.getChild("ThighRight");
            this.LegRight = this.ThighRight.getChild("LegRight");
            this.FootRight = this.LegRight.getChild("FootRight");

            this.Tail1 = this.Hips.getChild("Tail1");
            this.Tail2 = this.Tail1.getChild("Tail2");
            this.Tail3 = this.Tail2.getChild("Tail3");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 2).addBox(-3.5F, -3.5F, -5.0F, 7.0F, 7.0F, 8.0F), PartPose.offsetAndRotation(0.0F, 17.0F, 2.2F, 0.13962634015954636F, 0.0F, 0.0F));
            PartDefinition Chest = Body.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(25, 39).addBox(-3.0F, -0.2F, -3.0F, 6.0F, 6.0F, 6.0F), PartPose.offsetAndRotation(0.0F, -3.0F, -4.7F, -0.33161255787892263F, 0.0F, 0.0F));
            PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 49).addBox(-1.5F, -0.5F, -4.3F, 3.0F, 4.0F, 6.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -2.5F, -0.2275909337942703F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(46, 21).addBox(-2.0F, -2.5F, -2.5F, 4.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 2.2F, -3.9F, 0.591841146688116F, 0.0F, 0.0F));
            PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(37, 31).addBox(-1.5F, -0.5F, -2.0F, 3.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -0.4F, -1.7F, -0.06981317007977318F, 0.0F, 0.0F));
            PartDefinition Mouth = Snout.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(51, 33).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.85F, 0.2F, -0.13665927909957545F, 0.0F, 0.0F));

            PartDefinition TopSnout = Snout.addOrReplaceChild("TopSnout", CubeListBuilder.create().texOffs(44, 36).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -1.5F, -0.5F, 0.45535640450848164F, 0.0F, 0.0F));

            PartDefinition EarLeft = Head.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(54, 38).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-1.5F, -2.0F, 0.2F, 0.2617993877991494F, -0.7330382858376184F, 0.0F));

            PartDefinition EarRight = Head.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(54, 38).mirror(true).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(1.5F, -2.0F, 0.2F, 0.2617993877991494F, 0.7330382858376184F, 0.0F));

            PartDefinition NeckBase = Neck.addOrReplaceChild("NeckBase", CubeListBuilder.create().texOffs(45, 48).addBox(-1.0F, -1.5F, -3.3F, 2.0F, 3.0F, 6.0F), PartPose.offsetAndRotation(0.0F, 3.0F, -0.5F, -0.27314402127920984F, 0.0F, 0.0F));

            PartDefinition ArmBaseLeft = Chest.addOrReplaceChild("ArmBaseLeft", CubeListBuilder.create().texOffs(37, 58).mirror(true).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(2.2F, 4.0F, -1.5F, 0.500909508638178F, 0.0F, 0.0F));
            PartDefinition ArmLeft = ArmBaseLeft.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(27, 59).mirror(true).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-0.1F, 2.5F, 0.2F, -0.47123889803846897F, 0.0F, 0.0F));
            PartDefinition HandLeft = ArmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(13, 59).mirror(true).addBox(-1.5F, 0.0F, -3.2F, 3.0F, 1.0F, 4.0F), PartPose.offsetAndRotation(-0.1F, 2.5F, 0.0F, 0.16667894689440982F, 0.0F, 0.0F));

            PartDefinition ArmBaseRight = Chest.addOrReplaceChild("ArmBaseRight", CubeListBuilder.create().texOffs(37, 58).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(-2.2F, 4.0F, -1.5F, 0.500909508638178F, 0.0F, 0.0F));
            PartDefinition ArmRight = ArmBaseRight.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(27, 59).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.1F, 2.5F, 0.2F, -0.47123889803846897F, 0.0F, 0.0F));
            PartDefinition HandRight = ArmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(13, 59).mirror(true).addBox(-1.5F, 0.0F, -3.2F, 3.0F, 1.0F, 4.0F), PartPose.offsetAndRotation(0.1F, 2.5F, 0.0F, 0.16667894689440982F, 0.0F, 0.0F));

            PartDefinition Back = Body.addOrReplaceChild("Back", CubeListBuilder.create().texOffs(0, 18).addBox(-3.0F, -0.5F, 0.0F, 6.0F, 7.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -3.0F, 2.6F, -0.45535640450848164F, 0.0F, 0.0F));
            PartDefinition Hips = Back.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(21, 19).addBox(-3.5F, -0.5F, 0.0F, 7.0F, 7.0F, 5.0F), PartPose.offsetAndRotation(0.0F, -0.1F, 3.8F, -0.2275909337942703F, 0.0F, 0.0F));
            PartDefinition ThighLeft = Hips.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(28, 0).mirror(true).addBox(-2.0F, 0.0F, -2.5F, 4.0F, 5.0F, 5.0F), PartPose.offsetAndRotation(2.3F, 0.8F, 1.6F, 0.18203784630933073F, 0.0F, 0.0F));
            PartDefinition LegLeft = ThighLeft.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(37, 11).mirror(true).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 5.0F, -2.0F, 0.6981317007977318F, 0.0F, 0.0F));
            PartDefinition FootLeft = LegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(46, 1).addBox(-1.5F, -0.2F, -4.0F, 3.0F, 1.0F, 6.0F), PartPose.offsetAndRotation(-0.1F, 3.5F, 1.0F, -0.3186971254089062F, 0.0F, 0.0F));

            PartDefinition ThighRight = Hips.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(28, 0).addBox(-2.0F, 0.0F, -2.5F, 4.0F, 5.0F, 5.0F), PartPose.offsetAndRotation(-2.3F, 0.8F, 1.6F, 0.18203784630933073F, 0.0F, 0.0F));
            PartDefinition LegRight = ThighRight.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(37, 11).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 5.0F, -2.0F, 0.6981317007977318F, 0.0F, 0.0F));
            PartDefinition FootRight = LegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(46, 1).addBox(-1.5F, -0.2F, -4.0F, 3.0F, 1.0F, 6.0F), PartPose.offsetAndRotation(0.1F, 3.5F, 1.0F, -0.3186971254089062F, 0.0F, 0.0F));

            PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(0, 29).addBox(-2.5F, -0.5F, 0.0F, 5.0F, 3.0F, 5.0F), PartPose.offsetAndRotation(-0.01F, 1.0F, 4.5F, -0.13665927909957545F, 0.0F, 0.0F));
            PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(0, 39).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 2.0F, 8.0F), PartPose.offsetAndRotation(0.0F, 0.2F, 4.1F, 0.3642502295386026F, 0.0F, 0.0F));
            PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(14, 31).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 1.0F, 7.0F), PartPose.offsetAndRotation(0.0F, 0.6F, 7.1F, 0.27314402127920984F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 64, 64);
        }

        @Override
        public void setupAnim(GiantOtterEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + (float) (24 / (180 / Math.PI));
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0F;
            float degree = 1.0F;
            this.Neck.xRot = Mth.cos((limbSwing * speed * 0.05F) + (float) Math.PI) * (degree * 0.1F) * limbSwingAmount * 0.5F - 0.23F;
            this.EarLeft.zRot = Mth.cos((limbSwing * speed * 0.1F) + (float) Math.PI) * (degree * 0.4F) * limbSwingAmount * 0.5F;
            this.EarRight.zRot = Mth.cos((limbSwing * speed * 0.1F) + (float) Math.PI) * (degree * -0.4F) * limbSwingAmount * 0.5F;
            this.Tail1.xRot = Mth.cos((limbSwing * speed * 0.05F) + (float) Math.PI) * (degree * 0.05F) * limbSwingAmount * 0.5F - 0.14F;
            this.Tail2.xRot = Mth.cos((limbSwing * speed * 0.05F) + (float) Math.PI) * (degree * 0.05F) * limbSwingAmount * 0.5F + 0.36F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed, degree;

            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.2F;
                speed = 0.6F;
                degree = 0.3F;
                this.Body.xRot = Mth.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 3.0F) * limbSwingAmount * 0.5F + 0.14F;
                this.Back.xRot = Mth.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 0.8F) * limbSwingAmount * 0.5F - 0.46F;
                this.Neck.xRot = Mth.cos(1.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * limbSwingAmount * 0.5F - 0.23F;
                this.Head.xRot = Mth.cos(2.5F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * limbSwingAmount * 0.5F + 0.59F;
                this.Tail1.xRot = Mth.cos(-1.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * limbSwingAmount * 0.5F;
                this.Tail2.xRot = Mth.cos(-2.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * limbSwingAmount * 0.5F;
                this.Tail3.xRot = Mth.cos(-3.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * limbSwingAmount * 0.5F;
                this.Body.y = Mth.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 1.4F) * limbSwingAmount * 0.5F + 17.0F;
                this.ThighLeft.xRot = Mth.cos((limbSwing * speed * 0.0F) + (float) Math.PI) * (degree * 0.0F) * limbSwingAmount * 0.5F + 0.18F;
                this.ArmLeft.xRot = Mth.cos((limbSwing * speed * 0.0F) + (float) Math.PI) * (degree * 0.0F) * limbSwingAmount * 0.5F - 0.47F;
                this.HandLeft.xRot = Mth.cos((limbSwing * speed * 0.0F) + (float) Math.PI) * (degree * 0.0F) * limbSwingAmount * 0.5F + 0.17F;
                this.ArmBaseLeft.z = Mth.cos((limbSwing * speed * 0.0F) + (float) Math.PI) * (degree * 0.0F) * limbSwingAmount * 0.5F - 1.5F;
                this.ArmBaseRight.xRot = Mth.cos((limbSwing * speed * 0.0F) + (float) Math.PI) * (degree * 0.0F) * limbSwingAmount * 0.5F + 0.5F;
                this.ArmRight.xRot = Mth.cos((limbSwing * speed * 0.0F) + (float) Math.PI) * (degree * 0.0F) * limbSwingAmount * 0.5F - 0.47F;
                this.HandRight.xRot = Mth.cos((limbSwing * speed * 0.0F) + (float) Math.PI) * (degree * 0.0F) * limbSwingAmount * 0.5F + 0.17F;
                this.ArmBaseRight.z = Mth.cos((limbSwing * speed * 0.0F) + (float) Math.PI) * (degree * 0.0F) * limbSwingAmount * 0.5F + -1.5F;
                this.ArmBaseLeft.xRot = Mth.cos((limbSwing * speed * 0.0F) + (float) Math.PI) * (degree * 0.0F) * limbSwingAmount * 0.5F + 0.5F;
                this.LegLeft.xRot = Mth.cos((limbSwing * speed * 0.0F) + (float) Math.PI) * (degree * 0.0F) * limbSwingAmount * 0.5F + 0.7F;
                this.FootLeft.xRot = Mth.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -2.0F) * limbSwingAmount * 0.5F - 0.32F;
                this.ThighLeft.z = Mth.cos((limbSwing * speed * 0.0F) + (float) Math.PI) * (degree * 0.0F) * limbSwingAmount * 0.5F + 1.6F;
                this.ThighRight.xRot = Mth.cos((limbSwing * speed * 0.0F) + (float) Math.PI) * (degree * 0.0F) * limbSwingAmount * 0.5F + 0.18F;
                this.LegRight.xRot = Mth.cos((limbSwing * speed * 0.0F) + (float) Math.PI) * (degree * 0.0F) * limbSwingAmount * 0.5F + 0.7F;
                this.FootRight.xRot = Mth.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -2.0F) * limbSwingAmount * 0.5F - 0.32F;
                this.ThighRight.z = Mth.cos((limbSwing * speed * 0.0F) + (float) Math.PI) * (degree * 0.0F) * limbSwingAmount * 0.5F + 1.6F;

            } else {
                speed = ((GiantOtterEntity) entity).isBaby() ? 2.0F : 1.0F;
                degree = ((GiantOtterEntity) entity).isBaby() ? 0.4F : 0.5F;
                this.ArmBaseLeft.xRot = Mth.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 3.0F) * limbSwingAmount * 0.5F + 0.5F;
                this.ArmLeft.xRot = Mth.cos(0.6F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * limbSwingAmount * 0.5F - 0.47F;
                this.HandLeft.xRot = Mth.cos(3.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 3.0F) * limbSwingAmount * 0.5F + 0.17F;
                this.ArmBaseRight.xRot = Mth.cos(-0.6F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 3.0F) * limbSwingAmount * 0.5F + 0.5F;
                this.ArmRight.xRot = Mth.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * limbSwingAmount * 0.5F - 0.47F;
                this.HandRight.xRot = Mth.cos(2.4F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 3.0F) * limbSwingAmount * 0.5F + 0.17F;
                this.ThighLeft.xRot = Mth.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -3.0F) * limbSwingAmount * 0.5F + 0.18F;
                this.LegLeft.xRot = Mth.cos(1.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 2.6F) * limbSwingAmount * 0.5F + 0.7F;
                this.FootLeft.xRot = Mth.cos(-1.6F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * limbSwingAmount * 0.5F - 0.32F;
                this.ThighRight.xRot = Mth.cos(-0.6F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -3.0F) * limbSwingAmount * 0.5F + 0.18F;
                this.LegRight.xRot = Mth.cos(0.4F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 2.6F) * limbSwingAmount * 0.5F + 0.7F;
                this.FootRight.xRot = Mth.cos(-2.2F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * limbSwingAmount * 0.5F - 0.32F;
                this.Body.xRot = Mth.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 1.6F) * limbSwingAmount * 0.5F + 0.14F;
                this.Back.xRot = Mth.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -2.4F) * limbSwingAmount * 0.5F - 0.46F;
                this.Neck.xRot = Mth.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -1.0F) * limbSwingAmount * 0.5F - 0.23F;
                this.Head.xRot = Mth.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -1.0F) * limbSwingAmount * 0.5F + 0.59F;
                this.Tail1.xRot = Mth.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -1.4F) * limbSwingAmount * 0.5F - 0.14F;
                this.Tail2.xRot = Mth.cos(-0.5F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -1.8F) * limbSwingAmount * 0.5F + 0.36F;
                this.Tail3.xRot = Mth.cos(-1.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -2.0F) * limbSwingAmount * 0.5F + 0.3F;
            }
        }
    }

    public static class Child extends GiantOtterModel {

        public ModelPart Back;
        public ModelPart Neck;
        public ModelPart ArmLeft;
        public ModelPart ArmRight;
        public ModelPart Tail1;
        public ModelPart ThighLeft;
        public ModelPart ThighRight;
        public ModelPart Tail2;
        public ModelPart LegLeft;
        public ModelPart FootLeft;
        public ModelPart LegRight;
        public ModelPart FootRight;
        public ModelPart Head;
        public ModelPart EarLeft;
        public ModelPart Snout;
        public ModelPart Mouth;
        public ModelPart EarRight;
        public ModelPart TopSnout;
        public ModelPart ForeArmLeft;
        public ModelPart HandLeft;
        public ModelPart ForeArmRight;
        public ModelPart HandRight;

        public Child(ModelPart root) {
            this.Body = root.getChild("Body");
            this.Back = this.Body.getChild("Back");
            this.ThighLeft = this.Back.getChild("ThighLeft");
            this.LegLeft = this.ThighLeft.getChild("LegLeft");
            this.FootLeft = this.LegLeft.getChild("FootLeft");

            this.ThighRight = this.Back.getChild("ThighRight");
            this.LegRight = this.ThighRight.getChild("LegRight");
            this.FootRight = this.LegRight.getChild("FootRight");

            this.Tail1 = this.Back.getChild("Tail1");
            this.Tail2 = this.Tail1.getChild("Tail2");

            this.Neck = this.Body.getChild("Neck");
            this.Head = this.Neck.getChild("Head");
            this.EarLeft = this.Head.getChild("EarLeft");

            this.Snout = this.Head.getChild("Snout");
            this.TopSnout = this.Snout.getChild("TopSnout");

            this.Mouth = this.Head.getChild("Mouth");

            this.EarRight = this.Head.getChild("EarRight");

            this.ArmRight = this.Body.getChild("ArmRight");
            this.ForeArmRight = this.ArmRight.getChild("ForeArmRight");
            this.HandRight = this.ForeArmRight.getChild("HandRight");

            this.ArmLeft = this.Body.getChild("ArmLeft");
            this.ForeArmLeft = this.ArmLeft.getChild("ForeArmLeft");
            this.HandLeft = this.ForeArmLeft.getChild("HandLeft");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 6).addBox(-1.5F, -1.5F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(-0.01F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 21.1F, 0.0F, 0.0911061832922575F, 0.0F, 0.0F));
            PartDefinition Back = Body.addOrReplaceChild("Back", CubeListBuilder.create().texOffs(0, 13).addBox(-2.0F, -0.5F, 0.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(-0.1F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, 1.5F, -0.18203784630933073F, 0.0F, 0.0F));
            PartDefinition ThighLeft = Back.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(14, 15).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(1.5F, 0.7F, 1.5F, -0.13665927909957545F, 0.0F, 0.0F));
            PartDefinition LegLeft = ThighLeft.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(22, 15).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 1.5F, -0.5F, 0.6829473549475088F, 0.0F, 0.0F));
            PartDefinition FootLeft = LegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(20, 18).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 1.5F, 0.5F, -0.4098033003787853F, 0.0F, 0.0F));

            PartDefinition ThighRight = Back.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(14, 15).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-1.5F, 0.7F, 1.5F, -0.13665927909957545F, 0.0F, 0.0F));
            PartDefinition LegRight = ThighRight.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(22, 15).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 1.5F, -0.5F, 0.6829473549475088F, 0.0F, 0.0F));
            PartDefinition FootRight = LegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(20, 18).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 1.5F, 0.5F, -0.4098033003787853F, 0.0F, 0.0F));

            PartDefinition Tail1 = Back.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(0, 19).addBox(-1.5F, -0.5F, 0.0F, 3.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 2.5F, -0.591841146688116F, 0.0F, 0.0F));
            PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(0, 24).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F, 0.0F, 0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.5F, 0.3186971254089062F, 0.0F, 0.0F));

            PartDefinition Neck = Body.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(1, 0).addBox(-1.0F, -1.0F, -1.7F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F, -0.2F, 0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -1.5F, -0.500909508638178F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(11, 0).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 1.0F, -2.0F, 0.500909508638178F, 0.0F, 0.0F));
            PartDefinition EarLeft = Head.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(10, 6).mirror(true).addBox(0.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(1.0F, -0.5F, 0.5F, 0.18203784630933073F, -0.500909508638178F, 0.0F));

            PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(23, 4).addBox(-1.0F, -0.5F, -1.5F, 2.0F, 1.0F, 1.0F), PartPose.offset(0.0F, 0.7F, -0.6F));
            PartDefinition TopSnout = Snout.addOrReplaceChild("TopSnout", CubeListBuilder.create().texOffs(28, 3).addBox(-0.5F, -1.0F, -1.5F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.27314402127920984F, 0.0F, 0.0F));

            PartDefinition Mouth = Head.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(24, 2).addBox(-0.5F, -0.4F, -1.5F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 1.0F, -0.5F, -0.18901915665940536F, 0.0F, 0.0F));

            PartDefinition EarRight = Head.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(10, 6).mirror(true).addBox(-1.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-1.0F, -0.5F, 0.5F, 0.18203784630933073F, 0.500909508638178F, 0.0F));

            PartDefinition ArmRight = Body.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(15, 8).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offset(-0.6F, -0.5F, -1.0F));
            PartDefinition ForeArmRight = ArmRight.addOrReplaceChild("ForeArmRight", CubeListBuilder.create().texOffs(19, 8).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-0.49F, 1.6F, 0.0F, -0.3642502295386026F, 0.0F, 0.0F));
            PartDefinition HandRight = ForeArmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(23, 9).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 1.3F, 0.0F, 0.27314402127920984F, 0.0F, 0.0F));

            PartDefinition ArmLeft = Body.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(15, 8).addBox(0.0F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offset(0.6F, -0.5F, -1.0F));
            PartDefinition ForeArmLeft = ArmLeft.addOrReplaceChild("ForeArmLeft", CubeListBuilder.create().texOffs(19, 8).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.49F, 1.6F, 0.0F, -0.3642502295386026F, 0.0F, 0.0F));
            PartDefinition HandLeft = ForeArmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(23, 9).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 1.3F, 0.0F, 0.27314402127920984F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 32, 32);
        }

        @Override
        public void setupAnim(GiantOtterEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + (float) (24 / (180 / Math.PI));
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0F;
            float degree = 1.0F;
            this.Neck.xRot = Mth.cos((limbSwing * speed * 0.05F) + (float) Math.PI) * (degree * 0.1F) * limbSwingAmount * 0.5F - 0.5F;
            this.EarLeft.zRot = Mth.cos((limbSwing * speed * 0.1F) + (float) Math.PI) * (degree * 0.4F) * limbSwingAmount * 0.5F;
            this.EarRight.zRot = Mth.cos((limbSwing * speed * 0.1F) + (float) Math.PI) * (degree * -0.4F) * limbSwingAmount * 0.5F;
            this.Tail1.xRot = Mth.cos((limbSwing * speed * 0.05F) + (float) Math.PI) * (degree * 0.05F) * limbSwingAmount * 0.5F - 0.591F;
            this.Tail2.xRot = Mth.cos((limbSwing * speed * 0.05F) + (float) Math.PI) * (degree * 0.05F) * limbSwingAmount * 0.5F + 0.319F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed, degree;

            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.2F;
                speed = 0.6F;
                degree = 0.3F;

            } else {
                speed = ((GiantOtterEntity) entity).isBaby() ? 1.0F : 0.8F;
                degree = ((GiantOtterEntity) entity).isBaby() ? 0.4F : 0.5F;
                this.ArmLeft.xRot = Mth.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 3.0F) * limbSwingAmount * 0.5F;
                this.ForeArmLeft.xRot = Mth.cos(0.6F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * limbSwingAmount * 0.5F - 0.364F;
                this.HandLeft.xRot = Mth.cos(3.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 3.0F) * limbSwingAmount * 0.5F + 0.273F;
                this.ArmRight.xRot = Mth.cos(-0.6F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 3.0F) * limbSwingAmount * 0.5F;
                this.ForeArmRight.xRot = Mth.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * limbSwingAmount * 0.5F - 0.364F;
                this.HandRight.xRot = Mth.cos(2.4F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 3.0F) * limbSwingAmount * 0.5F + 0.273F;
                this.ThighLeft.xRot = Mth.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -3.0F) * limbSwingAmount * 0.5F - 0.137F;
                this.LegLeft.xRot = Mth.cos(1.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 2.6F) * limbSwingAmount * 0.5F + 0.683F;
                this.FootLeft.xRot = Mth.cos(-1.6F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * limbSwingAmount * 0.5F - 0.409F;
                this.ThighRight.xRot = Mth.cos(-0.6F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -3.0F) * limbSwingAmount * 0.5F - 0.137F;
                this.LegRight.xRot = Mth.cos(0.4F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 2.6F) * limbSwingAmount * 0.5F + 0.683F;
                this.FootRight.xRot = Mth.cos(-2.2F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * limbSwingAmount * 0.5F - 0.409F;
                this.Body.xRot = Mth.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 1.6F) * limbSwingAmount * 0.5F + 0.091F;
                this.Back.xRot = Mth.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -2.4F) * limbSwingAmount * 0.5F - 0.182F;
                this.Neck.xRot = Mth.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -1.0F) * limbSwingAmount * 0.5F - 0.5F;
                this.Head.xRot = Mth.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -1.0F) * limbSwingAmount * 0.5F + 0.5F;
                this.Tail1.xRot = Mth.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -1.4F) * limbSwingAmount * 0.5F - 0.59F;
                this.Tail2.xRot = Mth.cos(-0.5F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -1.8F) * limbSwingAmount * 0.5F + 0.318F;
            }
        }
    }
}
