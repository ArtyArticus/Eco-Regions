package com.github.artyarticus.ecoregions.client.model;

import com.github.artyarticus.ecoregions.entity.BushDogEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class BushDogModel extends ZawaBaseModel<BushDogEntity> {
    public ModelPart Chest;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Chest);
        }

        return this.parts;
    }

    public static class Adult extends BushDogModel {
        public ModelPart Body;
        public ModelPart Neck;
        public ModelPart ArmBaseLeft;
        public ModelPart ArmBaseRight;
        public ModelPart Hips;
        public ModelPart ThighLeft;
        public ModelPart ThighRight;
        public ModelPart Tail1;
        public ModelPart UpperLegLeft;
        public ModelPart LowerLegLeft;
        public ModelPart FootLeft;
        public ModelPart UpperLegRight;
        public ModelPart LowerLegRight;
        public ModelPart FootRight;
        public ModelPart Tail2;
        public ModelPart Head;
        public ModelPart Snout;
        public ModelPart Mouth;
        public ModelPart part2;
        public ModelPart EarLeft;
        public ModelPart part2_1;
        public ModelPart EarRight;
        public ModelPart Nose;
        public ModelPart UpperArmLeft;
        public ModelPart ForearmLeft;
        public ModelPart HandLeft;
        public ModelPart UpperArmRight;
        public ModelPart ForearmRight;
        public ModelPart HandRight;

        public Adult(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.ArmBaseLeft = this.Chest.getChild("ArmBaseLeft");
            this.UpperArmLeft = this.ArmBaseLeft.getChild("UpperArmLeft");
            this.ForearmLeft = this.UpperArmLeft.getChild("ForearmLeft");
            this.HandLeft = this.ForearmLeft.getChild("HandLeft");

            this.Body = this.Chest.getChild("Body");
            this.Hips = this.Body.getChild("Hips");
            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.UpperLegLeft = this.ThighLeft.getChild("UpperLegLeft");
            this.LowerLegLeft = this.UpperLegLeft.getChild("LowerLegLeft");
            this.FootLeft = this.LowerLegLeft.getChild("FootLeft");

            this.Tail1 = this.Hips.getChild("Tail1");
            this.Tail2 = this.Tail1.getChild("Tail2");

            this.ThighRight = this.Hips.getChild("ThighRight");
            this.UpperLegRight = this.ThighRight.getChild("UpperLegRight");
            this.LowerLegRight = this.UpperLegRight.getChild("LowerLegRight");
            this.FootRight = this.LowerLegRight.getChild("FootRight");

            this.Neck = this.Chest.getChild("Neck");
            this.Head = this.Neck.getChild("Head");
            this.part2 = this.Head.getChild("part2");

            this.EarLeft = this.Head.getChild("EarLeft");

            this.Snout = this.Head.getChild("Snout");
            this.Nose = this.Snout.getChild("Nose");

            this.EarRight = this.Head.getChild("EarRight");

            this.part2_1 = this.Head.getChild("part2_1");

            this.Mouth = this.Head.getChild("Mouth");

            this.ArmBaseRight = this.Chest.getChild("ArmBaseRight");
            this.UpperArmRight = this.ArmBaseRight.getChild("UpperArmRight");
            this.ForearmRight = this.UpperArmRight.getChild("ForearmRight");
            this.HandRight = this.ForearmRight.getChild("HandRight");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Chest = partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -2.5F, -2.0F, 5.0F, 5.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 18.1F, -4.0F, -0.11728612207217244F, 0.0F, 0.0F));
            PartDefinition ArmBaseLeft = Chest.addOrReplaceChild("ArmBaseLeft", CubeListBuilder.create().texOffs(19, 35).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(1.7F, -1.1F, -0.5F, 0.162315623764424F, 0.0F, 0.0F));
            PartDefinition UpperArmLeft = ArmBaseLeft.addOrReplaceChild("UpperArmLeft", CubeListBuilder.create().texOffs(31, 38).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 3.0F, 1.0F, -0.06475171591477989F, 0.0F, 0.0F));
            PartDefinition ForearmLeft = UpperArmLeft.addOrReplaceChild("ForearmLeft", CubeListBuilder.create().texOffs(31, 33).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-0.01F, 1.6F, -2.0F, -0.05235987755982988F, 0.0F, 0.0F));
            PartDefinition HandLeft = ForearmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(40, 38).addBox(-1.0F, -0.5F, -1.4F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 2.0F, 0.8F, 0.0781907508222411F, 0.0F, 0.0F));

            PartDefinition Body = Chest.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 9).addBox(-3.0F, 0.0F, 0.0F, 6.0F, 5.0F, 6.0F), PartPose.offsetAndRotation(0.0F, -2.5F, 0.2F, 0.11728612207217244F, 0.0F, 0.0F));
            PartDefinition Hips = Body.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 22).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, -0.23457224414434488F, 0.0F, 0.0F));
            PartDefinition ThighLeft = Hips.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(27, 14).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(1.6F, 0.6F, 1.2F, 0.2275909337942703F, 0.0F, 0.0F));
            PartDefinition UpperLegLeft = ThighLeft.addOrReplaceChild("UpperLegLeft", CubeListBuilder.create().texOffs(32, 23).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 4.0F, -1.5F, 0.6829473549475088F, 0.0F, 0.0F));
            PartDefinition LowerLegLeft = UpperLegLeft.addOrReplaceChild("LowerLegLeft", CubeListBuilder.create().texOffs(22, 23).addBox(-1.0F, 0.5F, -2.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 1.6F, 2.3F, -0.6829473549475088F, 0.0F, 0.0F));
            PartDefinition FootLeft = LowerLegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(22, 30).addBox(-1.0F, 0.0F, -1.3F, 2.0F, 1.0F, 2.0F), PartPose.offset(0.0F, 2.7F, -1.4F));

            PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(54, 17).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.5F, 2.5F, -0.9424777960769379F, 0.0F, 0.0F));
            PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(56, 25).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-0.01F, 0.0F, 2.5F, 0.27314402127920984F, 0.0F, 0.0F));

            PartDefinition ThighRight = Hips.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(27, 14).mirror(true).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(-1.6F, 0.6F, 1.2F, 0.2275909337942703F, 0.0F, 0.0F));
            PartDefinition UpperLegRight = ThighRight.addOrReplaceChild("UpperLegRight", CubeListBuilder.create().texOffs(32, 23).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 4.0F, -1.5F, 0.6829473549475088F, 0.0F, 0.0F));
            PartDefinition LowerLegRight = UpperLegRight.addOrReplaceChild("LowerLegRight", CubeListBuilder.create().texOffs(22, 23).mirror(true).addBox(-1.0F, 0.5F, -2.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 1.6F, 2.3F, -0.6829473549475088F, 0.0F, 0.0F));
            PartDefinition FootRight = LowerLegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(22, 30).mirror(true).addBox(-1.0F, 0.0F, -1.3F, 2.0F, 1.0F, 2.0F), PartPose.offset(0.0F, 2.7F, -1.5F));

            PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(17, 0).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -2.5F, -2.0F, -0.35185837453889574F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(48, 0).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 2.5F, -2.0F, 0.5864306020384839F, 0.0F, 0.0F));
            PartDefinition part2 = Head.addOrReplaceChild("part2", CubeListBuilder.create().texOffs(36, 0).mirror(true).addBox(-1.0F, 0.0F, -2.5F, 2.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(1.4F, 0.0F, 0.3F, 0.0781907508222411F, 0.0F, 0.11728612207217244F));

            PartDefinition EarLeft = Head.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(40, 9).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(1.8F, -0.7F, 1.2F, 0.0911061832922575F, -0.46216317793861517F, 0.18203784630933073F));

            PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(56, 11).addBox(-1.0F, -0.1F, -2.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.3F, -1.3F, 0.11728612207217244F, 0.0F, 0.0F));
            PartDefinition Nose = Snout.addOrReplaceChild("Nose", CubeListBuilder.create().texOffs(49, 8).addBox(-0.5F, -0.9F, -2.0F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.1F, -0.1F, 0.18203784630933073F, 0.0F, 0.0F));

            PartDefinition EarRight = Head.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(40, 9).mirror(true).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-1.8F, -0.7F, 1.2F, 0.0911061832922575F, 0.46216317793861517F, -0.18203784630933073F));

            PartDefinition part2_1 = Head.addOrReplaceChild("part2_1", CubeListBuilder.create().texOffs(36, 0).addBox(-1.0F, 0.0F, -2.5F, 2.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(-1.4F, 0.0F, 0.3F, 0.0781907508222411F, 0.0F, -0.11728612207217244F));

            PartDefinition Mouth = Head.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(50, 13).addBox(-0.5F, -0.5F, -1.7F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 1.5F, -1.4F, -0.11728612207217244F, 0.0F, 0.0F));

            PartDefinition ArmBaseRight = Chest.addOrReplaceChild("ArmBaseRight", CubeListBuilder.create().texOffs(19, 35).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(-1.7F, -1.0F, -0.5F, 0.162315623764424F, 0.0F, 0.0F));
            PartDefinition UpperArmRight = ArmBaseRight.addOrReplaceChild("UpperArmRight", CubeListBuilder.create().texOffs(31, 38).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 3.0F, 1.0F, -0.06475171591477989F, 0.0F, 0.0F));
            PartDefinition ForearmRight = UpperArmRight.addOrReplaceChild("ForearmRight", CubeListBuilder.create().texOffs(31, 33).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.01F, 1.6F, -2.0F, -0.05235987755982988F, 0.0F, 0.0F));
            PartDefinition HandRight = ForearmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(40, 38).addBox(-1.0F, -0.5F, -1.4F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 2.0F, 0.8F, 0.0781907508222411F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 64, 64);
        }

        @Override
        public void setupAnim(BushDogEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
            this.Head.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
        }

        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0F;
            float degree = 1.0F;
            this.Neck.xRot = Mth.cos(1.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * -0.1F * limbSwingAmount * 0.5F - 0.351F;
            this.Head.xRot = Mth.cos(limbSwing * speed * 0.1F + 3.1415927F) * degree * -0.1F * limbSwingAmount * 0.5F + 0.586F;
            this.Tail1.xRot = Mth.cos(1.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * 0.1F * limbSwingAmount * 0.5F - 0.942F;
            this.Tail2.xRot = Mth.cos(3.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * 0.4F * limbSwingAmount * 0.5F + 0.273F;
            this.Tail1.zRot = Mth.cos(3.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * -1.2F * limbSwingAmount * 0.5F;
            this.Tail2.yRot = Mth.cos(4.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F;
        }

        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.2F;
            float degree = 0.8F;

            if (entity.isSprinting()) {
                speed = 1.9F;
                degree = 0.3F;
                this.ArmBaseLeft.xRot = Mth.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * 5.5F * limbSwingAmount * 0.5F + 0.162F;
                this.ForearmLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F - 0.052F;
                this.HandLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.0F + 3.1415927F) * degree * -4.0F * limbSwingAmount * 0.5F + 0.078F;
                this.ArmBaseRight.xRot = Mth.cos(1.5F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 5.5F * limbSwingAmount * 0.5F + 0.162F;
                this.ForearmRight.xRot = Mth.cos(5.5F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F - 0.052F;
                this.HandRight.xRot = Mth.cos(2.5F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -4.0F * limbSwingAmount * 0.5F + 0.078F;

                this.ThighLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -4.0F * limbSwingAmount * 0.5F + 0.227F;
                this.UpperLegLeft.xRot = Mth.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.683F;
                this.LowerLegLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F - 0.683F;
                this.FootLeft.xRot = Mth.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * -4.0F * limbSwingAmount * 0.5F + 0.5F;
                this.ThighRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -4.0F * limbSwingAmount * 0.5F + 0.227F;
                this.UpperLegRight.xRot = Mth.cos(4.5F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 3.0F * limbSwingAmount * 0.5F + 0.683F;
                this.LowerLegRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F - 0.683F;
                this.FootRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -4.0F * limbSwingAmount * 0.5F;

                this.Chest.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -0.7F * limbSwingAmount * 0.5F - 0.117F;
                this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.0F * limbSwingAmount * 0.5F + 0.117F;
                this.Hips.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F - 0.235F;
                this.Neck.xRot = Mth.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.2F * limbSwingAmount * 0.5F - 0.351F;
                this.Head.xRot = Mth.cos(6.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -0.5F * limbSwingAmount * 0.5F + 0.586F;
                this.Head.z = Mth.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * 4.0F * limbSwingAmount * 0.5F + 0.02F;
                this.Chest.y = Mth.cos(6.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -8.0F * limbSwingAmount * 0.5F + 18.1F;

                this.Tail1.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F - 0.942F;
                this.Tail2.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.273F;
                this.Mouth.xRot = Mth.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * 0.5F * limbSwingAmount * 0.5F - 0.117F;

            } else {
                this.ArmBaseLeft.xRot = Mth.cos(limbSwing * speed * 0.2F + 3.1415927F) * degree * 1.5F * limbSwingAmount * 0.5F + 0.162F;
                this.ForearmLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F - 0.052F;
                this.HandLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.078F;
                this.ArmBaseRight.xRot = Mth.cos(limbSwing * speed * 0.2F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F + 0.162F;
                this.ForearmRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F - 0.052F;
                this.HandRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.078F;

                this.Neck.xRot = Mth.cos(1.0F + limbSwing * speed * 0.4F + 3.1415927F) * degree * -0.1F * limbSwingAmount * 0.5F - 0.351F;
                this.Head.xRot = Mth.cos(6.0F + limbSwing * speed * 0.4F + 3.1415927F) * degree * -0.1F * limbSwingAmount * 0.5F + (this.isSwimming ? -1.2F : +0.586F);

                this.ThighLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F + 0.227F;
                this.UpperLegLeft.xRot = Mth.cos(limbSwing * speed * 0.2F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F + 0.683F;
                this.LowerLegLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F - 0.683F;
                this.FootLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F;
                this.ThighRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.227F;
                this.UpperLegRight.xRot = Mth.cos(limbSwing * speed * 0.2F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.683F;
                this.LowerLegRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F - 0.683F;
                this.FootRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F;

                this.Chest.xRot = Mth.cos(limbSwing * speed * 0.4F + 3.1415927F) * degree * 0.1F * limbSwingAmount * 0.5F - 0.117F;
                this.Body.xRot = Mth.cos(limbSwing * speed * 0.4F + 3.1415927F) * degree * -0.1F * limbSwingAmount * 0.5F + 0.117F;

                this.Tail1.xRot = Mth.cos(1.0F + limbSwing * speed * 0.4F + 3.1415927F) * degree * 0.3F * limbSwingAmount * 0.5F - 0.942F;
                this.Tail2.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F + 3.1415927F) * degree * 0.4F * limbSwingAmount * 0.5F + 0.273F;

                this.Chest.y = Mth.cos(2.0F + limbSwing * speed * 0.4F + 3.1415927F) * degree * 1.0F * limbSwingAmount * 0.5F + 18.1F;
                this.ThighLeft.z = Mth.cos(limbSwing * speed * 0.2F + 3.1415927F) * degree * -1.0F * limbSwingAmount * 0.5F + 0.0155F + 1.1F;
                this.ThighRight.z = Mth.cos(limbSwing * speed * 0.2F + 3.1415927F) * degree * 1.0F * limbSwingAmount * 0.5F + 0.0155F + 1.1F;

                this.Tail1.zRot = Mth.cos(3.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * -1.2F * limbSwingAmount * 0.5F;
                this.Tail2.yRot = Mth.cos(4.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F;
            }

        }
    }

    public static class Child extends BushDogModel {
        public ModelPart Body;
        public ModelPart ArmBaseLeft;
        public ModelPart Neck;
        public ModelPart ArmBaseRight;
        public ModelPart Tail1;
        public ModelPart ThighLeft;
        public ModelPart ThighRight;
        public ModelPart Tail2;
        public ModelPart UpperLegLeft;
        public ModelPart LegLeft;
        public ModelPart FootLeft;
        public ModelPart UpperLegRight;
        public ModelPart LegRight;
        public ModelPart FootRight;
        public ModelPart ArmLeft;
        public ModelPart HandLeft;
        public ModelPart Head;
        public ModelPart Snout;
        public ModelPart EarLeft;
        public ModelPart EarRight;
        public ModelPart TopSnout;
        public ModelPart Mouth;
        public ModelPart ArmRight;
        public ModelPart HandRight;

        public Child(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.ArmBaseLeft = this.Chest.getChild("ArmBaseLeft");
            this.ArmLeft = this.ArmBaseLeft.getChild("ArmLeft");
            this.HandLeft = this.ArmLeft.getChild("HandLeft");

            this.Body = this.Chest.getChild("Body");
            this.Tail1 = this.Body.getChild("Tail1");
            this.Tail2 = this.Tail1.getChild("Tail2");

            this.ThighLeft = this.Body.getChild("ThighLeft");
            this.UpperLegLeft = this.ThighLeft.getChild("UpperLegLeft");
            this.LegLeft = this.UpperLegLeft.getChild("LegLeft");
            this.FootLeft = this.LegLeft.getChild("FootLeft");

            this.ThighRight = this.Body.getChild("ThighRight");
            this.UpperLegRight = this.ThighRight.getChild("UpperLegRight");
            this.LegRight = this.UpperLegRight.getChild("LegRight");
            this.FootRight = this.LegRight.getChild("FootRight");

            this.Neck = this.Chest.getChild("Neck");
            this.Head = this.Neck.getChild("Head");
            this.EarRight = this.Head.getChild("EarRight");

            this.Snout = this.Head.getChild("Snout");
            this.Mouth = this.Snout.getChild("Mouth");

            this.TopSnout = this.Snout.getChild("TopSnout");

            this.EarLeft = this.Head.getChild("EarLeft");

            this.ArmBaseRight = this.Chest.getChild("ArmBaseRight");
            this.ArmRight = this.ArmBaseRight.getChild("ArmRight");
            this.HandRight = this.ArmRight.getChild("HandRight");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Chest = partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 6).addBox(-2.0F, -1.5F, -1.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(-0.3F, -0.1F, 0.0F)), PartPose.offsetAndRotation(0.0F, 20.7F, 0.0F, 0.03909537541112055F, 0.0F, 0.0F));
            PartDefinition ArmBaseLeft = Chest.addOrReplaceChild("ArmBaseLeft", CubeListBuilder.create().texOffs(14, 11).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(1.4F, 0.9F, -0.4F, 0.21781708265940905F, 0.0F, 0.0F));
            PartDefinition ArmLeft = ArmBaseLeft.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(14, 13).addBox(-0.5F, -0.2F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F, -0.2F, 0.0F)), PartPose.offsetAndRotation(-0.02F, 1.0F, 0.5F, -0.47123889803846897F, 0.0F, 0.0F));
            PartDefinition HandLeft = ArmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(10, 14).addBox(-0.51F, -0.6F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 1.5F, -0.5F, 0.3186971254089062F, 0.0F, 0.0F));

            PartDefinition Body = Chest.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -0.5F, 0.0F, 4.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -1.1F, 1.7F, -0.11728612207217244F, 0.0F, 0.0F));
            PartDefinition Tail1 = Body.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(1, 13).addBox(-0.5F, -0.5F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.3F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.7F, -0.9773843811168246F, 0.0F, 0.0F));
            PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(1, 13).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 1.2F, 0.2738421523142173F, 0.0F, 0.0F));

            PartDefinition ThighLeft = Body.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(24, 10).addBox(-1.0F, -0.3F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(1.2F, 1.2F, 1.7F, 0.03909537541112055F, 0.0F, 0.0F));
            PartDefinition UpperLegLeft = ThighLeft.addOrReplaceChild("UpperLegLeft", CubeListBuilder.create().texOffs(28, 14).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 1.5F, -1.0F, 0.9897762028270176F, 0.0F, 0.0F));
            PartDefinition LegLeft = UpperLegLeft.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(20, 13).addBox(-0.5F, 0.0F, -0.7F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.01F, 0.9F, 1.0F, -1.0224139077762113F, 0.0F, 0.0F));
            PartDefinition FootLeft = LegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(24, 14).addBox(-0.51F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0F, 0.0F, 0.2F)), PartPose.offsetAndRotation(-0.01F, 1.7F, -0.5F, 0.19547687289441354F, 0.0F, 0.0F));

            PartDefinition ThighRight = Body.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(24, 10).mirror(true).addBox(-1.0F, -0.3F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-1.2F, 1.2F, 1.7F, 0.03909537541112055F, 0.0F, 0.0F));
            PartDefinition UpperLegRight = ThighRight.addOrReplaceChild("UpperLegRight", CubeListBuilder.create().texOffs(28, 14).mirror(true).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 1.5F, -1.0F, 0.9897762028270176F, 0.0F, 0.0F));
            PartDefinition LegRight = UpperLegRight.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(20, 13).mirror(true).addBox(-0.5F, 0.0F, -0.7F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-0.01F, 0.9F, 1.0F, -1.0224139077762113F, 0.0F, 0.0F));
            PartDefinition FootRight = LegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(24, 14).mirror(true).addBox(-0.49F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.01F, 1.7F, -0.5F, 0.19547687289441354F, 0.0F, 0.0F));

            PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(21, 5).addBox(-1.0F, -0.4F, -1.7F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F, 0.2F, 0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -0.5F, -0.35185837453889574F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(22, 0).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.7F, -1.0F, 0.46914448828868976F, 0.0F, 0.0F));
            PartDefinition EarRight = Head.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(12, 0).mirror(true).addBox(-0.8F, -1.4F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-1.1F, 0.2F, -0.5F, 0.0F, 0.46914448828868976F, -0.27366763203903305F));

            PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(16, 3).addBox(-1.0F, 0.0F, -1.3F, 2.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -1.1F, -0.1171115934746098F, 0.0F, 0.0F));
            PartDefinition Mouth = Snout.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(18, 5).addBox(-0.5F, -0.7F, -1.2F, 1.0F, 1.0F, 1.0F), PartPose.offset(0.0F, 1.0F, 0.0F));

            PartDefinition TopSnout = Snout.addOrReplaceChild("TopSnout", CubeListBuilder.create().texOffs(16, 0).addBox(-0.5F, -0.5F, -1.4F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -0.1F, 0.39112828270876815F, 0.0F, 0.0F));

            PartDefinition EarLeft = Head.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(12, 0).addBox(-0.2F, -1.4F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(1.1F, 0.2F, -0.5F, 0.0F, -0.46914448828868976F, 0.27366763203903305F));

            PartDefinition ArmBaseRight = Chest.addOrReplaceChild("ArmBaseRight", CubeListBuilder.create().texOffs(14, 11).mirror(true).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-1.4F, 0.9F, -0.4F, 0.21781708265940905F, 0.0F, 0.0F));
            PartDefinition ArmRight = ArmBaseRight.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(14, 13).mirror(true).addBox(-0.5F, -0.2F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F, -0.2F, 0.0F)), PartPose.offsetAndRotation(0.02F, 1.0F, 0.5F, -0.47123889803846897F, 0.0F, 0.0F));
            PartDefinition HandRight = ArmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(10, 14).mirror(true).addBox(-0.49F, -0.6F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 1.5F, -0.5F, 0.3186971254089062F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 32, 16);
        }

        @Override
        public void setupAnim(BushDogEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
            this.Head.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
        }

        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0F;
            float degree = 1.0F;
            this.Neck.xRot = Mth.cos(1.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * -0.1F * limbSwingAmount * 0.5F - 0.352F;
            this.Head.xRot = Mth.cos(limbSwing * speed * 0.1F + 3.1415927F) * degree * -0.1F * limbSwingAmount * 0.5F + 0.469F;
            this.Tail1.xRot = Mth.cos(1.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * 0.1F * limbSwingAmount * 0.5F - 0.977F;
            this.Tail2.xRot = Mth.cos(3.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * 0.4F * limbSwingAmount * 0.5F + 0.273F;
            this.Tail1.zRot = Mth.cos(3.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * -1.2F * limbSwingAmount * 0.5F;
            this.Tail2.yRot = Mth.cos(4.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F;
        }

        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.2F;
            float degree = 0.8F;

            if (entity.isSprinting()) {
                speed = 1.9F;
                degree = 0.3F;
            } else {
                this.ArmBaseLeft.xRot = Mth.cos(limbSwing * speed * 0.2F + 3.1415927F) * degree * 1.5F * limbSwingAmount * 0.5F + 0.218F;
                this.ArmLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F - 0.471F;
                this.HandLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.318F;
                this.ArmBaseRight.xRot = Mth.cos(limbSwing * speed * 0.2F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F + 0.218F;
                this.ArmRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F - 0.471F;
                this.HandRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.318F;

                this.Neck.xRot = Mth.cos(1.0F + limbSwing * speed * 0.4F + 3.1415927F) * degree * -0.1F * limbSwingAmount * 0.5F - 0.352F;
                this.Head.xRot = Mth.cos(6.0F + limbSwing * speed * 0.4F + 3.1415927F) * degree * -0.1F * limbSwingAmount * 0.5F + 0.469F;

                this.ThighLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F + 0.039F;
                this.UpperLegLeft.xRot = Mth.cos(limbSwing * speed * 0.2F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F + 0.989F;
                this.LegLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F - 1.022F;
                this.FootLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F + 0.195F;
                this.ThighRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.039F;
                this.UpperLegRight.xRot = Mth.cos(limbSwing * speed * 0.2F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.989F;
                this.LegRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F - 1.022F;
                this.FootRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.195F;

                this.Chest.xRot = Mth.cos(limbSwing * speed * 0.4F + 3.1415927F) * degree * 0.1F * limbSwingAmount * 0.5F + 0.039F;
                this.Body.xRot = Mth.cos(limbSwing * speed * 0.4F + 3.1415927F) * degree * -0.1F * limbSwingAmount * 0.5F - 0.117F;

                this.Tail1.xRot = Mth.cos(1.0F + limbSwing * speed * 0.4F + 3.1415927F) * degree * 0.3F * limbSwingAmount * 0.5F - 0.977F;
                this.Tail2.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F + 3.1415927F) * degree * 0.4F * limbSwingAmount * 0.5F + 0.273F;

                this.Chest.y = Mth.cos(2.0F + limbSwing * speed * 0.4F + 3.1415927F) * degree * 1.0F * limbSwingAmount * 0.5F + 20.7F;
                this.ThighLeft.z = Mth.cos(limbSwing * speed * 0.2F + 3.1415927F) * degree * -1.0F * limbSwingAmount * 0.5F + 0.0155F + 1.7F;
                this.ThighRight.z = Mth.cos(limbSwing * speed * 0.2F + 3.1415927F) * degree * 1.0F * limbSwingAmount * 0.5F + 0.0155F + 1.7F;

                this.Tail1.zRot = Mth.cos(3.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * -1.2F * limbSwingAmount * 0.5F;
                this.Tail2.yRot = Mth.cos(4.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F;
            }
        }
    }
}

