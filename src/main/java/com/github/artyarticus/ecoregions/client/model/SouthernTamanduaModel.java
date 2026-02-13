package com.github.artyarticus.ecoregions.client.model;

import com.github.artyarticus.ecoregions.entity.SouthernTamanduaEntity;
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

public abstract class SouthernTamanduaModel extends ZawaBaseModel<SouthernTamanduaEntity> {
    public ModelPart Chest;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Chest);
        }

        return this.parts;
    }

    public static class Adult extends SouthernTamanduaModel {
        public ModelPart Body;
        public ModelPart Neck;
        public ModelPart ArmLeft;
        public ModelPart ArmRight;
        public ModelPart Hips;
        public ModelPart Tail1;
        public ModelPart ThighLeft;
        public ModelPart ThighRight;
        public ModelPart Tail2;
        public ModelPart Tail3;
        public ModelPart LegLeft;
        public ModelPart FootLeft;
        public ModelPart LegRight;
        public ModelPart FootRight;
        public ModelPart Head;
        public ModelPart BottomNeck;
        public ModelPart EarLeft;
        public ModelPart EarRight;
        public ModelPart Snout;
        public ModelPart SnoutBottom;
        public ModelPart MouthRight;
        public ModelPart Mouth;
        public ModelPart MouthLeft;
        public ModelPart ForearmLeft;
        public ModelPart HandLeft;
        public ModelPart ClawLeft1;
        public ModelPart ClawLeft2;
        public ModelPart ForearmRight;
        public ModelPart HandRight;
        public ModelPart ClawRight1;
        public ModelPart ClawRight2;

        public Adult(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.Neck = this.Chest.getChild("Neck");
            this.Head = this.Neck.getChild("Head");
            this.Snout = this.Head.getChild("Snout");
            this.Mouth = this.Snout.getChild("Mouth");

            this.MouthRight = this.Snout.getChild("MouthRight");
            this.MouthLeft = this.MouthRight.getChild("MouthLeft");

            this.SnoutBottom = this.Snout.getChild("SnoutBottom");

            this.EarRight = this.Head.getChild("EarRight");

            this.EarLeft = this.Head.getChild("EarLeft");

            this.BottomNeck = this.Neck.getChild("BottomNeck");

            this.ArmRight = this.Chest.getChild("ArmRight");
            this.ForearmRight = this.ArmRight.getChild("ForearmRight");
            this.HandRight = this.ForearmRight.getChild("HandRight");
            this.ClawRight1 = this.HandRight.getChild("ClawRight1");

            this.ClawRight2 = this.HandRight.getChild("ClawRight2");

            this.ArmLeft = this.Chest.getChild("ArmLeft");
            this.ForearmLeft = this.ArmLeft.getChild("ForearmLeft");
            this.HandLeft = this.ForearmLeft.getChild("HandLeft");
            this.ClawLeft1 = this.HandLeft.getChild("ClawLeft1");

            this.ClawLeft2 = this.HandLeft.getChild("ClawLeft2");

            this.Body = this.Chest.getChild("Body");
            this.Hips = this.Body.getChild("Hips");
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

            PartDefinition Chest = partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 24).addBox(-2.0F, -1.9F, -1.5F, 4.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 18.1F, -4.5F, 0.13665927909957545F, 0.0F, 0.0F));
            PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 17).addBox(-1.0F, -0.5F, -3.0F, 2.0F, 3.0F, 4.0F), PartPose.offset(0.0F, -1.3F, -1.5F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(19, 8).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 1.01F, -3.2F, 0.13665927909957545F, 0.0F, 0.0F));
            PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(14, 0).addBox(-1.0F, -1.4F, -3.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -0.1F, -1.0F, 0.27314402127920984F, 0.0F, 0.0F));
            PartDefinition Mouth = Snout.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(23, 0).addBox(-0.5F, -0.4F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -2.5F, -0.3642502295386026F, 0.0F, 0.0F));

            PartDefinition MouthRight = Snout.addOrReplaceChild("MouthRight", CubeListBuilder.create().texOffs(32, 0).mirror(true).addBox(-0.9F, -0.65F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.01F, -0.7F, -2.6F, 0.0911061832922575F, 0.0F, 0.0F));
            PartDefinition MouthLeft = MouthRight.addOrReplaceChild("MouthLeft", CubeListBuilder.create().texOffs(32, 0).addBox(-0.1F, -0.65F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition SnoutBottom = Snout.addOrReplaceChild("SnoutBottom", CubeListBuilder.create().texOffs(26, 0).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.6F, 0.2F, -0.3186971254089062F, 0.0F, 0.0F));

            PartDefinition EarRight = Head.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(34, 3).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-1.0F, -1.0F, 0.0F, 0.0911061832922575F, 0.3186971254089062F, -0.500909508638178F));

            PartDefinition EarLeft = Head.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(34, 3).mirror(true).addBox(0.0F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(1.0F, -1.0F, 0.0F, 0.0911061832922575F, -0.3186971254089062F, 0.500909508638178F));

            PartDefinition BottomNeck = Neck.addOrReplaceChild("BottomNeck", CubeListBuilder.create().texOffs(21, 4).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 2.0F, -0.7F, -0.28605945374922626F, 0.0F, 0.0F));

            PartDefinition ArmRight = Chest.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(0, 0).mirror(true).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(-1.7F, 0.5F, -0.2F, 0.10471975511965977F, -0.10471975511965977F, 0.02967059811614144F));
            PartDefinition ForearmRight = ArmRight.addOrReplaceChild("ForearmRight", CubeListBuilder.create().texOffs(0, 6).mirror(true).addBox(-1.5F, -0.2F, -1.5F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.6F, 2.5F, 0.5F, -0.20071286397934787F, 0.0F, -0.03665191262740524F));
            PartDefinition HandRight = ForearmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(0, 10).mirror(true).addBox(-0.5F, -0.7F, -1.0F, 1.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-0.5F, 2.0F, -0.5F, -0.17453292519943295F, 0.0F, -0.008726646259971648F));
            PartDefinition ClawRight1 = HandRight.addOrReplaceChild("ClawRight1", CubeListBuilder.create().texOffs(8, 0).mirror(true).addBox(-0.5F, -0.8F, -0.1F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.5F, 1.0F, -1.2F, -0.05061454997231123F, 0.5602506632585689F, -0.31066859353918524F));

            PartDefinition ClawRight2 = HandRight.addOrReplaceChild("ClawRight2", CubeListBuilder.create().texOffs(8, 0).mirror(true).addBox(-0.2F, -0.8F, -0.4F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.5F, 1.0F, 0.0F, -0.09773843644720677F, -0.3612831684786316F, -0.5131267934284302F));

            PartDefinition ArmLeft = Chest.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(0, 0).mirror(true).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(1.7F, 0.5F, -0.2F, 0.10471975511965977F, 0.10471975511965977F, -0.02967059811614144F));
            PartDefinition ForearmLeft = ArmLeft.addOrReplaceChild("ForearmLeft", CubeListBuilder.create().texOffs(0, 6).mirror(true).addBox(-1.5F, -0.2F, -1.5F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.4F, 2.5F, 0.5F, -0.20071286397934787F, 0.0F, 0.03665191262740524F));
            PartDefinition HandLeft = ForearmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(0, 10).mirror(true).addBox(-0.5F, -0.7F, -1.0F, 1.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-0.5F, 2.0F, -0.5F, -0.17453292519943295F, 0.0F, 0.008726646259971648F));
            PartDefinition ClawLeft1 = HandLeft.addOrReplaceChild("ClawLeft1", CubeListBuilder.create().texOffs(8, 0).mirror(true).addBox(-0.5F, -0.8F, -0.1F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.5F, 1.0F, -1.2F, -0.05061454997231123F, -0.5602506632585689F, 0.31066859353918524F));

            PartDefinition ClawLeft2 = HandLeft.addOrReplaceChild("ClawLeft2", CubeListBuilder.create().texOffs(8, 0).mirror(true).addBox(-0.8F, -0.8F, -0.4F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.5F, 1.0F, 0.0F, -0.09773843644720677F, 0.3612831684786316F, 0.5131267934284302F));

            PartDefinition Body = Chest.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(14, 19).addBox(-2.5F, -0.6F, 0.0F, 5.0F, 5.0F, 6.0F), PartPose.offsetAndRotation(0.0F, -1.5F, 1.5F, -0.0911061832922575F, 0.0F, 0.0F));
            PartDefinition Hips = Body.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(38, 23).addBox(-3.0F, 0.0F, 0.0F, 6.0F, 5.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -0.6F, 5.9F, -0.13665927909957545F, 0.0F, 0.0F));
            PartDefinition ThighLeft = Hips.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(36, 4).mirror(true).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 5.0F, 3.0F), PartPose.offsetAndRotation(2.0F, 2.5F, 2.0F, -0.1308996938995747F, 0.0F, 0.08726646259971647F));
            PartDefinition LegLeft = ThighLeft.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(39, 12).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 3.5F, -1.3F, 0.3490658503988659F, 0.0F, -0.08726646259971647F));
            PartDefinition FootLeft = LegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(30, 16).mirror(true).addBox(-1.5F, 0.0F, -3.0F, 3.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(-0.2F, 2.0F, 1.5F, -0.08726646259971647F, 0.0F, 0.0F));

            PartDefinition ThighRight = Hips.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(36, 4).mirror(true).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 5.0F, 3.0F), PartPose.offsetAndRotation(-2.0F, 2.5F, 2.0F, -0.1308996938995747F, 0.0F, -0.08726646259971647F));
            PartDefinition LegRight = ThighRight.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(39, 12).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 3.5F, -1.3F, 0.3490658503988659F, 0.0F, 0.08726646259971647F));
            PartDefinition FootRight = LegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(30, 16).mirror(true).addBox(-1.5F, 0.0F, -3.0F, 3.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(-0.2F, 2.0F, 1.5F, -0.08726646259971647F, 0.0F, 0.0F));

            PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(48, 0).addBox(-1.5F, -0.5F, 0.0F, 3.0F, 3.0F, 6.0F), PartPose.offsetAndRotation(0.0F, 0.5F, 3.8F, -0.3672172905985735F, 0.0F, 0.0F));
            PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(49, 9).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 2.0F, 6.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, 0.04555309164612875F, 0.0F, 0.0F));
            PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(51, 17).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 0.5F, 5.3F, 0.13665927909957545F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 64, 32);
        }

        @Override
        public void setupAnim(SouthernTamanduaEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = (float) Math.toRadians((double) netHeadYaw) * 0.5F;
            this.Head.yRot = (float) Math.toRadians((double) netHeadYaw) * 0.5F;
            this.Head.xRot = (float) Math.toRadians((double) headPitch) * 0.5F + 0.136F;

        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F + (float) Math.PI) * degree * -0.1F * limbSwingAmount * 0.5F;
            this.Tail1.xRot = Mth.cos(limbSwing * speed * 0.1F + (float) Math.PI) * degree * -0.2F * limbSwingAmount * 0.5F - 0.367F;
            this.Tail1.yRot = Mth.cos(1.0F + limbSwing * speed * 0.1F + (float) Math.PI) * degree * -0.4F * limbSwingAmount * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.2f;
            float degree = 0.8f;
            this.ArmLeft.xRot = Mth.cos(limbSwing * speed * 0.2F + (float) Math.PI) * degree * 1.0F * limbSwingAmount * 0.5F + 0.1F;
            this.ForearmLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F + (float) Math.PI) * degree * -2.0F * limbSwingAmount * 0.5F + -0.2F;
            this.HandLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F + (float) Math.PI) * degree * 2.0F * limbSwingAmount * 0.5F + -0.17F;
            this.ArmRight.xRot = Mth.cos(limbSwing * speed * 0.2F + (float) Math.PI) * degree * -1.0F * limbSwingAmount * 0.5F + 0.1F;
            this.ForearmRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F + (float) Math.PI) * degree * 2.0F * limbSwingAmount * 0.5F + -0.2F;
            this.HandRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F + (float) Math.PI) * degree * -2.0F * limbSwingAmount * 0.5F + -0.17F;
            this.ThighLeft.xRot = Mth.cos(limbSwing * speed * 0.2F + (float) Math.PI) * degree * -2.0F * limbSwingAmount * 0.5F + -0.13F;
            this.LegLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F + (float) Math.PI) * degree * 1.5F * limbSwingAmount * 0.5F + 0.35F;
            this.FootLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F + (float) Math.PI) * degree * -1.0F * limbSwingAmount * 0.5F + -0.09F;
            this.ThighRight.xRot = Mth.cos(limbSwing * speed * 0.2F + (float) Math.PI) * degree * 2.0F * limbSwingAmount * 0.5F + -0.13F;
            this.LegRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F + (float) Math.PI) * degree * -1.5F * limbSwingAmount * 0.5F + 0.35F;
            this.FootRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F + (float) Math.PI) * degree * 1.0F * limbSwingAmount * 0.5F + -0.09F;
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F + (float) Math.PI) * degree * -0.1F * limbSwingAmount * 0.5F;
            this.Head.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F + (float) Math.PI) * degree * -0.05F * limbSwingAmount * 0.5F + 0.136F;
            this.Tail1.xRot = Mth.cos(limbSwing * speed * 0.4F + (float) Math.PI) * degree * -0.2F * limbSwingAmount * 0.5F - 0.367F;
            this.Tail1.yRot = Mth.cos(1.0F + limbSwing * speed * 0.2F + (float) Math.PI) * degree * -0.4F * limbSwingAmount * 0.5F;
        }
    }

    public static class Child extends SouthernTamanduaModel {
        public ModelPart Neck;
        public ModelPart ArmLeft;
        public ModelPart ArmRight;
        public ModelPart Hips;
        public ModelPart Head;
        public ModelPart EarLeft;
        public ModelPart EarRight;
        public ModelPart Snout;
        public ModelPart SnoutBottom;
        public ModelPart MouthRight;
        public ModelPart Mouth;
        public ModelPart Tongue;
        public ModelPart MouthLeft;
        public ModelPart ForearmLeft;
        public ModelPart HandLeft;
        public ModelPart ClawLeft1;
        public ModelPart ClawLeft2;
        public ModelPart ForearmRight;
        public ModelPart HandRight;
        public ModelPart ClawRight1;
        public ModelPart ClawRight2;
        public ModelPart ThighLeft;
        public ModelPart ThighRight;
        public ModelPart Tail1;
        public ModelPart LegLeft;
        public ModelPart FootLeft;
        public ModelPart LegRight;
        public ModelPart FootRight;
        public ModelPart Tail2;

        public Child(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.Neck = this.Chest.getChild("Neck");
            this.Head = this.Neck.getChild("Head");
            this.EarRight = this.Head.getChild("EarRight");

            this.EarLeft = this.Head.getChild("EarLeft");

            this.Snout = this.Head.getChild("Snout");
            this.Tongue = this.Snout.getChild("Tongue");

            this.Mouth = this.Snout.getChild("Mouth");

            this.SnoutBottom = this.Snout.getChild("SnoutBottom");

            this.MouthRight = this.Snout.getChild("MouthRight");
            this.MouthLeft = this.MouthRight.getChild("MouthLeft");

            this.ArmRight = this.Chest.getChild("ArmRight");
            this.ForearmRight = this.ArmRight.getChild("ForearmRight");
            this.HandRight = this.ForearmRight.getChild("HandRight");
            this.ClawRight1 = this.HandRight.getChild("ClawRight1");

            this.ClawRight2 = this.HandRight.getChild("ClawRight2");

            this.ArmLeft = this.Chest.getChild("ArmLeft");
            this.ForearmLeft = this.ArmLeft.getChild("ForearmLeft");
            this.HandLeft = this.ForearmLeft.getChild("HandLeft");
            this.ClawLeft1 = this.HandLeft.getChild("ClawLeft1");

            this.ClawLeft2 = this.HandLeft.getChild("ClawLeft2");

            this.Hips = this.Chest.getChild("Hips");
            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.LegLeft = this.ThighLeft.getChild("LegLeft");
            this.FootLeft = this.LegLeft.getChild("FootLeft");

            this.Tail1 = this.Hips.getChild("Tail1");
            this.Tail2 = this.Tail1.getChild("Tail2");

            this.ThighRight = this.Hips.getChild("ThighRight");
            this.LegRight = this.ThighRight.getChild("LegRight");
            this.FootRight = this.LegRight.getChild("FootRight");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Chest = partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 23).addBox(-2.0F, -1.9F, -2.5F, 4.0F, 4.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 19.5F, -1.5F, 0.09756390784964411F, 0.0F, 0.0F));
            PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 17).addBox(-1.0F, -0.5F, -2.5F, 2.0F, 3.0F, 3.0F), PartPose.offset(0.0F, -1.3F, -2.5F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(19, 8).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 1.01F, -2.6F, 0.13665927909957545F, 0.0F, 0.0F));
            PartDefinition EarRight = Head.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(33, 3).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-1.0F, -1.0F, 0.1F, 0.0911061832922575F, 0.3186971254089062F, -0.500909508638178F));

            PartDefinition EarLeft = Head.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(33, 3).mirror(true).addBox(0.0F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(1.0F, -1.0F, 0.1F, 0.0911061832922575F, -0.3186971254089062F, 0.500909508638178F));

            PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(14, 0).addBox(-1.0F, -1.4F, -3.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -0.1F, 0.0F, 0.27314402127920984F, 0.0F, 0.0F));
            PartDefinition Tongue = Snout.addOrReplaceChild("Tongue", CubeListBuilder.create().texOffs(1, 11).addBox(-0.5F, 0.0F, -3.5F, 1.0F, 0.0F, 7.0F), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition Mouth = Snout.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(23, 0).addBox(-0.5F, -0.4F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -2.5F, -0.3642502295386026F, 0.0F, 0.0F));

            PartDefinition SnoutBottom = Snout.addOrReplaceChild("SnoutBottom", CubeListBuilder.create().texOffs(26, 0).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.6F, 0.2F, -0.3186971254089062F, 0.0F, 0.0F));

            PartDefinition MouthRight = Snout.addOrReplaceChild("MouthRight", CubeListBuilder.create().texOffs(32, 0).mirror(true).addBox(-0.9F, -0.65F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.01F, -0.7F, -2.6F, 0.0911061832922575F, 0.0F, 0.0F));
            PartDefinition MouthLeft = MouthRight.addOrReplaceChild("MouthLeft", CubeListBuilder.create().texOffs(32, 0).addBox(-0.1F, -0.65F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition ArmRight = Chest.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(0, 0).mirror(true).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-1.7F, 0.5F, -1.2F, 0.10471975511965977F, -0.10471975511965977F, 0.02967059811614144F));
            PartDefinition ForearmRight = ArmRight.addOrReplaceChild("ForearmRight", CubeListBuilder.create().texOffs(0, 6).mirror(true).addBox(-1.0F, -0.2F, -1.5F, 1.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.6F, 1.5F, 0.5F, -0.20071286397934787F, 0.0F, -0.03665191262740524F));
            PartDefinition HandRight = ForearmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(0, 10).mirror(true).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-0.6F, 2.0F, -0.5F, -0.17453292519943295F, 0.0F, -0.008726646259971648F));
            PartDefinition ClawRight1 = HandRight.addOrReplaceChild("ClawRight1", CubeListBuilder.create().texOffs(8, 0).mirror(true).addBox(-0.5F, -0.8F, -0.1F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.5F, 0.0F, -1.2F, -0.05061454997231123F, 0.5602506632585689F, -0.31066859353918524F));

            PartDefinition ClawRight2 = HandRight.addOrReplaceChild("ClawRight2", CubeListBuilder.create().texOffs(8, 0).mirror(true).addBox(-0.2F, -0.8F, -0.4F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.5F, 0.0F, 0.0F, -0.09773843644720677F, -0.3612831684786316F, -0.5131267934284302F));

            PartDefinition ArmLeft = Chest.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(1.7F, 0.5F, -1.2F, 0.10471975511965977F, 0.10471975511965977F, -0.02967059811614144F));
            PartDefinition ForearmLeft = ArmLeft.addOrReplaceChild("ForearmLeft", CubeListBuilder.create().texOffs(0, 6).addBox(-1.0F, -0.2F, -1.5F, 1.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.4F, 1.5F, 0.5F, -0.20071286397934787F, 0.0F, 0.03665191262740524F));
            PartDefinition HandLeft = ForearmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(0, 10).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-0.4F, 2.0F, -0.5F, -0.17453292519943295F, 0.0F, 0.008726646259971648F));
            PartDefinition ClawLeft1 = HandLeft.addOrReplaceChild("ClawLeft1", CubeListBuilder.create().texOffs(8, 0).addBox(-0.5F, -0.8F, -0.1F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.5F, 0.0F, -1.2F, -0.05061454997231123F, -0.5602506632585689F, 0.31066859353918524F));

            PartDefinition ClawLeft2 = HandLeft.addOrReplaceChild("ClawLeft2", CubeListBuilder.create().texOffs(8, 0).addBox(-0.8F, -0.8F, -0.4F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, -0.09773843644720677F, 0.3612831684786316F, 0.5131267934284302F));

            PartDefinition Hips = Chest.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(18, 24).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -2.0F, 2.5F, -0.13665927909957545F, 0.0F, 0.0F));
            PartDefinition ThighLeft = Hips.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(34, 4).addBox(-1.0F, -1.5F, -1.5F, 2.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(2.0F, 2.3F, 2.0F, -0.20909043639943742F, 0.0F, 0.08726646259971647F));
            PartDefinition LegLeft = ThighLeft.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(39, 12).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 2.4F, -1.3F, 0.3490658503988659F, 0.0F, -0.08726646259971647F));
            PartDefinition FootLeft = LegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(30, 16).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(-0.2F, 1.5F, 1.5F, -0.08726646259971647F, 0.0F, 0.0F));

            PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(48, 9).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 2.0F, 6.0F), PartPose.offsetAndRotation(0.0F, 0.5F, 4.0F, -0.42359141744850703F, 0.0F, 0.0F));
            PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(51, 17).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 0.5F, 5.3F, 0.13665927909957545F, 0.0F, 0.0F));

            PartDefinition ThighRight = Hips.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(34, 4).mirror(true).addBox(-1.0F, -1.5F, -1.5F, 2.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(-2.0F, 2.3F, 2.0F, -0.20909043639943742F, 0.0F, -0.08726646259971647F));
            PartDefinition LegRight = ThighRight.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(39, 12).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 2.4F, -1.3F, 0.3490658503988659F, 0.0F, 0.08726646259971647F));
            PartDefinition FootRight = LegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(30, 16).mirror(true).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.2F, 1.5F, 1.5F, -0.08726646259971647F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 64, 32);
        }

        @Override
        public void setupAnim(SouthernTamanduaEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = (float) Math.toRadians((double) netHeadYaw) * 0.5F;
            this.Head.yRot = (float) Math.toRadians((double) netHeadYaw) * 0.5F;
            this.Head.xRot = (float) Math.toRadians((double) headPitch) * 0.5F + 0.136F;

        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F + (float) Math.PI) * degree * -0.1F * limbSwingAmount * 0.5F;
            this.Tail1.xRot = Mth.cos(limbSwing * speed * 0.1F + (float) Math.PI) * degree * -0.2F * limbSwingAmount * 0.5F - 0.367F;
            this.Tail1.yRot = Mth.cos(1.0F + limbSwing * speed * 0.1F + (float) Math.PI) * degree * -0.4F * limbSwingAmount * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.2f;
            float degree = 0.8f;
            this.ArmLeft.xRot = Mth.cos(limbSwing * speed * 0.2F + (float) Math.PI) * degree * 1.0F * limbSwingAmount * 0.5F + 0.1F;
            this.ForearmLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F + (float) Math.PI) * degree * -2.0F * limbSwingAmount * 0.5F + -0.2F;
            this.HandLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F + (float) Math.PI) * degree * 2.0F * limbSwingAmount * 0.5F + -0.17F;
            this.ArmRight.xRot = Mth.cos(limbSwing * speed * 0.2F + (float) Math.PI) * degree * -1.0F * limbSwingAmount * 0.5F + 0.1F;
            this.ForearmRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F + (float) Math.PI) * degree * 2.0F * limbSwingAmount * 0.5F + -0.2F;
            this.HandRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F + (float) Math.PI) * degree * -2.0F * limbSwingAmount * 0.5F + -0.17F;
            this.ThighLeft.xRot = Mth.cos(limbSwing * speed * 0.2F + (float) Math.PI) * degree * -2.0F * limbSwingAmount * 0.5F + -0.13F;
            this.LegLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F + (float) Math.PI) * degree * 1.5F * limbSwingAmount * 0.5F + 0.35F;
            this.FootLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F + (float) Math.PI) * degree * -1.0F * limbSwingAmount * 0.5F + -0.09F;
            this.ThighRight.xRot = Mth.cos(limbSwing * speed * 0.2F + (float) Math.PI) * degree * 2.0F * limbSwingAmount * 0.5F + -0.13F;
            this.LegRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F + (float) Math.PI) * degree * -1.5F * limbSwingAmount * 0.5F + 0.35F;
            this.FootRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F + (float) Math.PI) * degree * 1.0F * limbSwingAmount * 0.5F + -0.09F;
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F + (float) Math.PI) * degree * -0.1F * limbSwingAmount * 0.5F;
            this.Head.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F + (float) Math.PI) * degree * -0.05F * limbSwingAmount * 0.5F + 0.136F;
            this.Tail1.xRot = Mth.cos(limbSwing * speed * 0.4F + (float) Math.PI) * degree * -0.2F * limbSwingAmount * 0.5F - 0.367F;
            this.Tail1.yRot = Mth.cos(1.0F + limbSwing * speed * 0.2F + (float) Math.PI) * degree * -0.4F * limbSwingAmount * 0.5F;
        }
    }
}

