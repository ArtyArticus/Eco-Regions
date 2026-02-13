package com.github.artyarticus.ecoregions.client.model;

import com.github.artyarticus.ecoregions.entity.WombatEntity;
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

public abstract class CommonWombatModel extends ZawaBaseModel<WombatEntity> {
    public ModelPart Chest;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Chest);
        }

        return this.parts;
    }

    public static class Adult extends CommonWombatModel {
        public ModelPart Body;
        public ModelPart ArmLeft;
        public ModelPart ArmRight;
        public ModelPart Neck;
        public ModelPart Hips;
        public ModelPart Tail1;
        public ModelPart ThighLeft;
        public ModelPart ThighRight;
        public ModelPart LegLeft;
        public ModelPart FootLeft;
        public ModelPart LegRight;
        public ModelPart FootRight;
        public ModelPart ForearmLeft;
        public ModelPart HandLeft;
        public ModelPart ForearmRight;
        public ModelPart HandRight;
        public ModelPart Head;
        public ModelPart NeckUnder;
        public ModelPart ear1;
        public ModelPart ear1_1;
        public ModelPart snout;
        public ModelPart shape38;
        public ModelPart shape38_1;
        public ModelPart nose;
        public ModelPart mouth;
        public ModelPart shape37;

        public Adult(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.Body = this.Chest.getChild("Body");
            this.Hips = this.Body.getChild("Hips");
            this.ThighRight = this.Hips.getChild("ThighRight");
            this.LegRight = this.ThighRight.getChild("LegRight");
            this.FootRight = this.LegRight.getChild("FootRight");

            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.LegLeft = this.ThighLeft.getChild("LegLeft");
            this.FootLeft = this.LegLeft.getChild("FootLeft");

            this.Tail1 = this.Hips.getChild("Tail1");

            this.ArmRight = this.Chest.getChild("ArmRight");
            this.ForearmRight = this.ArmRight.getChild("ForearmRight");
            this.HandRight = this.ForearmRight.getChild("HandRight");

            this.Neck = this.Chest.getChild("Neck");
            this.Head = this.Neck.getChild("Head");
            this.shape38_1 = this.Head.getChild("shape38_1");

            this.shape38 = this.Head.getChild("shape38");

            this.snout = this.Head.getChild("snout");
            this.shape37 = this.snout.getChild("shape37");

            this.mouth = this.snout.getChild("mouth");

            this.nose = this.snout.getChild("nose");

            this.ear1_1 = this.Head.getChild("ear1_1");

            this.ear1 = this.Head.getChild("ear1");

            this.NeckUnder = this.Neck.getChild("NeckUnder");

            this.ArmLeft = this.Chest.getChild("ArmLeft");
            this.ForearmLeft = this.ArmLeft.getChild("ForearmLeft");
            this.HandLeft = this.ForearmLeft.getChild("HandLeft");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Chest = partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 0).addBox(-4.5F, -4.0F, -2.5F, 9.0F, 8.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 15.8F, -4.0F, 0.23474678106428595F, 0.0F, 0.0F));
            PartDefinition Body = Chest.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 13).addBox(-5.0F, 0.0F, 0.0F, 10.0F, 9.0F, 8.0F), PartPose.offsetAndRotation(0.0F, -4.0F, 2.5F, -0.23492131798422702F, 0.0F, 0.0F));
            PartDefinition Hips = Body.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 30).addBox(-4.5F, 0.0F, 0.0F, 9.0F, 8.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 8.0F, -0.3909537457888271F, 0.0F, 0.0F));
            PartDefinition ThighRight = Hips.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(44, 17).mirror(true).addBox(-2.0F, 0.0F, -2.5F, 5.0F, 7.0F, 5.0F), PartPose.offsetAndRotation(-3.5F, 2.0F, 2.7F, 0.23457224414434488F, 0.0F, 0.0F));
            PartDefinition LegRight = ThighRight.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(52, 30).addBox(-1.5F, -0.5F, 0.0F, 3.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.5F, 7.0F, -2.0F, 0.6255260065779288F, 0.0F, 0.0F));
            PartDefinition FootRight = LegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(38, 32).mirror(true).addBox(-1.5F, 0.0F, -3.0F, 3.0F, 1.0F, 4.0F), PartPose.offsetAndRotation(-0.2F, 3.0F, 1.0F, -0.46914448828868976F, 0.0F, 0.0F));

            PartDefinition ThighLeft = Hips.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(44, 17).addBox(-3.0F, 0.0F, -2.5F, 5.0F, 7.0F, 5.0F), PartPose.offsetAndRotation(3.5F, 2.0F, 2.7F, 0.23457224414434488F, 0.0F, 0.0F));
            PartDefinition LegLeft = ThighLeft.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(52, 30).addBox(-1.5F, -0.5F, 0.0F, 3.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(-0.5F, 7.0F, -2.0F, 0.6255260065779288F, 0.0F, 0.0F));
            PartDefinition FootLeft = LegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(38, 32).addBox(-1.5F, 0.0F, -3.0F, 3.0F, 1.0F, 4.0F), PartPose.offsetAndRotation(0.2F, 3.0F, 1.0F, -0.46914448828868976F, 0.0F, 0.0F));

            PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(24, 31).addBox(-1.1F, -0.5F, 0.0F, 2.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 1.5F, 4.2F, 0.7431612274571185F, 0.0F, 0.0F));

            PartDefinition ArmRight = Chest.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(48, 0).mirror(true).addBox(-1.9F, 0.0F, -2.0F, 4.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(-3.0F, 1.5F, -0.4F, 0.03909537541112055F, 0.0F, 0.0F));
            PartDefinition ForearmRight = ArmRight.addOrReplaceChild("ForearmRight", CubeListBuilder.create().texOffs(52, 8).mirror(true).addBox(-1.5F, -0.1F, -3.0F, 3.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 3.5F, 1.5F, -0.46914448828868976F, 0.0F, -0.27366763203903305F));
            PartDefinition HandRight = ForearmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(40, 11).mirror(true).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.3F, 3.2F, -1.9F, 0.27366763203903305F, -0.0781907508222411F, 0.19547687289441354F));

            PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 43).addBox(-2.5F, -0.5F, -2.5F, 5.0F, 5.0F, 5.0F), PartPose.offsetAndRotation(0.0F, -3.2F, -2.5F, -0.17610372418938894F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(20, 48).addBox(-3.0F, -3.0F, -2.5F, 6.0F, 6.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 2.5F, -3.0F, 0.08726646259971647F, 0.0F, 0.0F));
            PartDefinition shape38_1 = Head.addOrReplaceChild("shape38_1", CubeListBuilder.create().texOffs(28, 40).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 5.0F), PartPose.offsetAndRotation(-2.5F, 0.0F, -2.5F, -0.13665927909957545F, 0.0F, -0.13665927909957545F));

            PartDefinition shape38 = Head.addOrReplaceChild("shape38", CubeListBuilder.create().texOffs(28, 40).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 5.0F), PartPose.offsetAndRotation(2.5F, 0.0F, -2.5F, -0.13665927909957545F, 0.0F, 0.13665927909957545F));

            PartDefinition snout = Head.addOrReplaceChild("snout", CubeListBuilder.create().texOffs(47, 50).addBox(-2.0F, -1.5F, -2.0F, 4.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -0.2F, -2.5F, 0.296705972839036F, -0.0F, 0.0F));
            PartDefinition shape37 = snout.addOrReplaceChild("shape37", CubeListBuilder.create().texOffs(40, 45).addBox(-1.5F, -0.3F, -2.1F, 3.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -2.0F, 0.1F, 0.27314402127920984F, 0.0F, 0.0F));

            PartDefinition mouth = snout.addOrReplaceChild("mouth", CubeListBuilder.create().texOffs(50, 58).addBox(-1.0F, 0.0F, -1.1F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 1.4F, -0.8F, -0.42184608153861F, 0.0F, 0.0F));

            PartDefinition nose = snout.addOrReplaceChild("nose", CubeListBuilder.create().texOffs(41, 51).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -1.3F, -1.5F, 0.7037167490777915F, -0.0F, 0.0F));

            PartDefinition ear1_1 = Head.addOrReplaceChild("ear1_1", CubeListBuilder.create().texOffs(50, 43).mirror(true).addBox(-1.5F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-2.0F, -2.8F, 1.6F, 0.06981317007977318F, 0.03490658503988659F, -0.13962634015954636F));

            PartDefinition ear1 = Head.addOrReplaceChild("ear1", CubeListBuilder.create().texOffs(50, 43).addBox(-0.5F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(2.0F, -2.8F, 1.6F, 0.06981317007977318F, -0.03490658503988659F, 0.13962634015954636F));

            PartDefinition NeckUnder = Neck.addOrReplaceChild("NeckUnder", CubeListBuilder.create().texOffs(0, 53).addBox(-2.0F, -1.0F, 0.0F, 4.0F, 2.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 4.5F, -3.3F, -0.15655603856442327F, 0.0F, 0.0F));

            PartDefinition ArmLeft = Chest.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(48, 0).addBox(-1.9F, 0.0F, -2.0F, 4.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(3.0F, 1.5F, -0.4F, 0.0781907508222411F, 0.0F, 0.0F));
            PartDefinition ForearmLeft = ArmLeft.addOrReplaceChild("ForearmLeft", CubeListBuilder.create().texOffs(52, 8).addBox(-1.5F, -0.1F, -3.0F, 3.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 3.5F, 1.5F, -0.46914448828868976F, 0.0F, 0.27366763203903305F));
            PartDefinition HandLeft = ForearmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(40, 11).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(-0.3F, 3.2F, -1.9F, 0.27366763203903305F, 0.0781907508222411F, -0.19547687289441354F));

            return LayerDefinition.create(meshDefinition, 64, 64);
        }

        @Override
        public void setupAnim(WombatEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.087F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos(limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount - 0.176F;
            this.Head.xRot = Mth.cos(1.0F + limbSwing * speed * 0.1F) * degree * -0.05F * limbSwingAmount + 0.087F;
            this.ear1.zRot = Mth.cos(limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount + 0.139F;
            this.ear1_1.zRot = Mth.cos(limbSwing * speed * 0.1F) * degree * 0.1F * limbSwingAmount - 0.139F;
            this.Tail1.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount - 0.743F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 4.0f;
            float degree = 0.3f;
            this.Chest.y = Mth.sin(limbSwing * speed * 0.4F) * degree * 0.4F * limbSwingAmount + 15.8F;
            this.Chest.xRot = Mth.cos(limbSwing * speed * 0.4F) * degree * 0.05F * limbSwingAmount + 0.234F;
            this.Chest.zRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 0.4F * limbSwingAmount;
            this.Neck.xRot = Mth.cos(limbSwing * speed * 0.4F) * degree * 0.2F * limbSwingAmount - 0.176F;
            this.Head.xRot = Mth.cos(limbSwing * speed * 0.4F) * degree * -0.2F * limbSwingAmount + 0.087F;
            this.ArmLeft.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 2.0F * limbSwingAmount + 0.078F;
            this.ForearmLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * degree * 1.5F * limbSwingAmount + -0.469F;
            this.HandLeft.xRot = Mth.cos(0.5F + limbSwing * speed * 0.2F) * degree * -1.5F * limbSwingAmount + 0.273F;
            this.ArmRight.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * -2.0F * limbSwingAmount + 0.078F;
            this.ForearmRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * degree * -1.5F * limbSwingAmount + -0.469F;
            this.HandRight.xRot = Mth.cos(0.5F + limbSwing * speed * 0.2F) * degree * 1.5F * limbSwingAmount + 0.273F;
            this.ThighLeft.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.234F;
            this.LegLeft.xRot = Mth.cos(1.5F + limbSwing * speed * 0.2F) * degree * 2.0F * limbSwingAmount + 0.625F;
//        this.LegLeft.xRot = Mth.cos(3.5F + limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount + 0.625F;
            this.FootLeft.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + -0.469F;
            this.ThighRight.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.234F;
            this.LegRight.xRot = Mth.cos(1.5F + limbSwing * speed * 0.2F) * degree * -2.0F * limbSwingAmount + 0.625F;
//        this.LegRight.xRot = Mth.cos(3.5F + limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount + 0.625F;
            this.FootRight.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + -0.469F;
            this.Tail1.xRot = Mth.cos(1.0F + limbSwing * speed * 0.4F) * degree * 0.4F * limbSwingAmount - 0.312F;
//        this.Tail2.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * degree * 0.4F * limbSwingAmount + 0.273F;
        }
    }

    public static class Child extends CommonWombatModel {
        public ModelPart Body;
        public ModelPart Neck;
        public ModelPart ArmLeft;
        public ModelPart ArmRight;
        public ModelPart Hips;
        public ModelPart Tail1;
        public ModelPart ThighLeft;
        public ModelPart ThighRight;
        public ModelPart LegLeft;
        public ModelPart FootLeft;
        public ModelPart LegRight;
        public ModelPart FootRight;
        public ModelPart NeckUnder;
        public ModelPart Head;
        public ModelPart CheekLeft;
        public ModelPart CheekRight;
        public ModelPart Snout;
        public ModelPart EarLeft;
        public ModelPart EarRight;
        public ModelPart Nose;
        public ModelPart Mouth;
        public ModelPart Bridge;
        public ModelPart ForearmLeft;
        public ModelPart HandLeft;
        public ModelPart ForearmRight;
        public ModelPart HandRight;

        public Child(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.ArmRight = this.Chest.getChild("ArmRight");
            this.ForearmRight = this.ArmRight.getChild("ForearmRight");
            this.HandRight = this.ForearmRight.getChild("HandRight");

            this.ArmLeft = this.Chest.getChild("ArmLeft");
            this.ForearmLeft = this.ArmLeft.getChild("ForearmLeft");
            this.HandLeft = this.ForearmLeft.getChild("HandLeft");

            this.Body = this.Chest.getChild("Body");
            this.Hips = this.Body.getChild("Hips");
            this.Tail1 = this.Hips.getChild("Tail1");

            this.ThighRight = this.Hips.getChild("ThighRight");
            this.LegRight = this.ThighRight.getChild("LegRight");
            this.FootRight = this.LegRight.getChild("FootRight");

            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.LegLeft = this.ThighLeft.getChild("LegLeft");
            this.FootLeft = this.LegLeft.getChild("FootLeft");

            this.Neck = this.Chest.getChild("Neck");
            this.Head = this.Neck.getChild("Head");
            this.CheekLeft = this.Head.getChild("CheekLeft");

            this.CheekRight = this.Head.getChild("CheekRight");

            this.EarLeft = this.Head.getChild("EarLeft");

            this.Snout = this.Head.getChild("Snout");
            this.Mouth = this.Snout.getChild("Mouth");

            this.Nose = this.Snout.getChild("Nose");

            this.Bridge = this.Snout.getChild("Bridge");

            this.EarRight = this.Head.getChild("EarRight");

            this.NeckUnder = this.Neck.getChild("NeckUnder");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Chest = partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -2.0F, -1.5F, 5.0F, 5.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 18.3F, -2.8F, 0.19198621771937624F, 0.0F, 0.0F));
            PartDefinition ArmRight = Chest.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(0, 18).mirror(true).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(-1.7F, 0.6F, 0.1F, 0.0781907508222411F, 0.0F, 0.0F));
            PartDefinition ForearmRight = ArmRight.addOrReplaceChild("ForearmRight", CubeListBuilder.create().texOffs(12, 20).mirror(true).addBox(-1.0F, -0.1F, -2.0F, 2.0F, 2.9F, 2.0F), PartPose.offsetAndRotation(0.0F, 2.5F, 1.3F, -0.46914448828868976F, 0.0F, -0.27366763203903305F));
            PartDefinition HandRight = ForearmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(31, 19).mirror(true).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.2F, 2.5F, -1.2F, 0.19198621771937624F, 0.0781907508222411F, 0.19547687289441354F));

            PartDefinition ArmLeft = Chest.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(0, 18).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(1.7F, 0.6F, 0.1F, 0.0781907508222411F, 0.0F, 0.0F));
            PartDefinition ForearmLeft = ArmLeft.addOrReplaceChild("ForearmLeft", CubeListBuilder.create().texOffs(12, 20).addBox(-1.0F, -0.1F, -2.0F, 2.0F, 2.9F, 2.0F), PartPose.offsetAndRotation(0.0F, 2.5F, 1.3F, -0.46914448828868976F, 0.0F, 0.27366763203903305F));
            PartDefinition HandLeft = ForearmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(31, 19).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-0.2F, 2.5F, -1.2F, 0.19198621771937624F, 0.0781907508222411F, -0.19547687289441354F));

            PartDefinition Body = Chest.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(16, 0).addBox(-3.0F, 0.0F, 0.0F, 6.0F, 6.0F, 5.0F), PartPose.offsetAndRotation(0.0F, -2.1F, 1.3F, -0.19198621771937624F, 0.0F, 0.0F));
            PartDefinition Hips = Body.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(38, 0).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 5.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, -0.2792526803190927F, 0.0F, 0.0F));
            PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(13, 0).addBox(-1.1F, -0.5F, 0.0F, 2.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 1.0F, 2.3F, 0.5235987755982988F, 0.0F, 0.0F));

            PartDefinition ThighRight = Hips.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(35, 8).mirror(true).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F), PartPose.offsetAndRotation(-2.0F, 0.5F, 1.4F, 0.23457224414434488F, 0.0F, 0.0F));
            PartDefinition LegRight = ThighRight.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(54, 0).mirror(true).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 5.0F, -1.0F, 0.6255260065779288F, 0.0F, 0.0F));
            PartDefinition FootRight = LegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(0, 8).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(-0.1F, 2.0F, 0.5F, -0.5759586531581287F, 0.0F, 0.0F));

            PartDefinition ThighLeft = Hips.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(35, 8).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F), PartPose.offsetAndRotation(2.0F, 0.5F, 1.4F, 0.23457224414434488F, 0.0F, 0.0F));
            PartDefinition LegLeft = ThighLeft.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(54, 0).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 5.0F, -1.0F, 0.6255260065779288F, 0.0F, 0.0F));
            PartDefinition FootLeft = LegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(0, 8).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.1F, 2.0F, 0.5F, -0.5759586531581287F, 0.0F, 0.0F));

            PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 12).addBox(-1.5F, -0.5F, -1.5F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -1.2F, -1.6F, -0.02617993877991494F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(44, 13).addBox(-2.0F, -2.0F, -1.5F, 4.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 1.0F, -2.0F, -0.15707963267948966F, 0.0F, 0.0F));
            PartDefinition CheekLeft = Head.addOrReplaceChild("CheekLeft", CubeListBuilder.create().texOffs(9, 15).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(1.8F, 0.0F, -1.5F, -0.13665927909957545F, 0.0F, 0.13665927909957545F));

            PartDefinition CheekRight = Head.addOrReplaceChild("CheekRight", CubeListBuilder.create().texOffs(9, 15).mirror(true).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(-1.8F, 0.0F, -1.5F, -0.13665927909957545F, 0.0F, -0.13665927909957545F));

            PartDefinition EarLeft = Head.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(22, 11).addBox(-0.5F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(1.0F, -1.4F, 0.7F, 0.06981317007977318F, -0.03490658503988659F, 0.13962634015954636F));

            PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(25, 15).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.8F, -1.1F, 0.296705972839036F, -0.0F, 0.0F));
            PartDefinition Mouth = Snout.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(55, 13).addBox(-1.0F, 0.0F, -1.1F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.6F, 0.3F, -0.42184608153861F, 0.0F, 0.0F));

            PartDefinition Nose = Snout.addOrReplaceChild("Nose", CubeListBuilder.create().texOffs(33, 0).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -0.6F, -0.5F, 0.7037167490777915F, -0.0F, 0.0F));

            PartDefinition Bridge = Snout.addOrReplaceChild("Bridge", CubeListBuilder.create().texOffs(35, 16).addBox(-1.0F, -0.3F, -1.1F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -1.0F, 0.1F, 0.27314402127920984F, 0.0F, 0.0F));

            PartDefinition EarRight = Head.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(22, 11).mirror(true).addBox(-1.5F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-1.0F, -1.4F, 0.7F, 0.06981317007977318F, -0.03490658503988659F, -0.13962634015954636F));

            PartDefinition NeckUnder = Neck.addOrReplaceChild("NeckUnder", CubeListBuilder.create().texOffs(25, 11).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 2.5F, -1.5F, -0.23457224414434488F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 64, 32);
        }

        @Override
        public void setupAnim(WombatEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) - 0.157F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos(limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount - 0.026F;
            this.Head.xRot = Mth.cos(1.0F + limbSwing * speed * 0.1F) * degree * -0.05F * limbSwingAmount - 0.157F;
            this.EarLeft.zRot = Mth.cos(limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount + 0.139F;
            this.EarRight.zRot = Mth.cos(limbSwing * speed * 0.1F) * degree * 0.1F * limbSwingAmount - 0.139F;
            this.Tail1.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount + 0.523F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 4.0f;
            float degree = 0.3f;
            this.Chest.y = Mth.sin(limbSwing * speed * 0.4F) * degree * 0.4F * limbSwingAmount + 18.3F;
            this.Chest.xRot = Mth.cos(limbSwing * speed * 0.4F) * degree * 0.05F * limbSwingAmount + 0.191F;
            this.Chest.zRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 0.4F * limbSwingAmount;
            this.Neck.xRot = Mth.cos(limbSwing * speed * 0.4F) * degree * 0.2F * limbSwingAmount - 0.026F;
            this.Head.xRot = Mth.cos(limbSwing * speed * 0.4F) * degree * -0.2F * limbSwingAmount - 0.157F;
            this.ArmLeft.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 2.0F * limbSwingAmount + 0.078F;
            this.ForearmLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * degree * 1.5F * limbSwingAmount + -0.469F;
            this.HandLeft.xRot = Mth.cos(0.5F + limbSwing * speed * 0.2F) * degree * -1.5F * limbSwingAmount + 0.273F;
            this.ArmRight.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * -2.0F * limbSwingAmount + 0.078F;
            this.ForearmRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * degree * -1.5F * limbSwingAmount + -0.469F;
            this.HandRight.xRot = Mth.cos(0.5F + limbSwing * speed * 0.2F) * degree * 1.5F * limbSwingAmount + 0.273F;
            this.ThighLeft.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.234F;
            this.LegLeft.xRot = Mth.cos(1.5F + limbSwing * speed * 0.2F) * degree * 2.0F * limbSwingAmount + 0.625F;
//        this.LegLeft.xRot = Mth.cos(3.5F + limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount + 0.625F;
            this.FootLeft.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + -0.469F;
            this.ThighRight.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.234F;
            this.LegRight.xRot = Mth.cos(1.5F + limbSwing * speed * 0.2F) * degree * -2.0F * limbSwingAmount + 0.625F;
//        this.LegRight.xRot = Mth.cos(3.5F + limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount + 0.625F;
            this.FootRight.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + -0.469F;
            this.Tail1.xRot = Mth.cos(1.0F + limbSwing * speed * 0.4F) * degree * 0.4F * limbSwingAmount - 0.312F;
//        this.Tail2.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * degree * 0.4F * limbSwingAmount + 0.273F;
        }
    }
}

