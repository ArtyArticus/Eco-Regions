package com.github.artyarticus.ecoregions.client.model;

import com.github.artyarticus.ecoregions.entity.GibbonEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class GibbonModel extends ZawaBaseModel<GibbonEntity> {
    public ModelPart Chest;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Chest);
        }

        return this.parts;
    }

    public static class Adult extends GibbonModel {

        public ModelPart Body;
        public ModelPart ArmLeft;
        public ModelPart ArmRight;
        public ModelPart Neck;
        public ModelPart Hips;
        public ModelPart ThighLeft;
        public ModelPart ThighRight;
        public ModelPart LegLeft;
        public ModelPart FootLeft;
        public ModelPart ToesLeft;
        public ModelPart LegRight;
        public ModelPart FootRight;
        public ModelPart ToesRight;
        public ModelPart ForearmLeft;
        public ModelPart HandLeft;
        public ModelPart FingersLeft;
        public ModelPart ThumbLeft;
        public ModelPart ForearmRight;
        public ModelPart HandRight;
        public ModelPart FingersRight;
        public ModelPart ThumbRight;
        public ModelPart Head;
        public ModelPart SiamangThroat;
        public ModelPart Face;
        public ModelPart ManeLeft;
        public ModelPart ManeRight;
        public ModelPart EarLeft;
        public ModelPart EarRight;
        public ModelPart HairTopLeft;
        public ModelPart HairTopRight;
        public ModelPart Snout;
        public ModelPart Hair;
        public ModelPart Mouth;
        public ModelPart TopSnout;
        public ModelPart Lips;

        public Adult(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.Body = this.Chest.getChild("Body");
            this.Hips = this.Body.getChild("Hips");
            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.LegLeft = this.ThighLeft.getChild("LegLeft");
            this.FootLeft = this.LegLeft.getChild("FootLeft");
            this.ToesLeft = this.FootLeft.getChild("ToesLeft");

            this.ThighRight = this.Hips.getChild("ThighRight");
            this.LegRight = this.ThighRight.getChild("LegRight");
            this.FootRight = this.LegRight.getChild("FootRight");
            this.ToesRight = this.FootRight.getChild("ToesRight");

            this.Neck = this.Chest.getChild("Neck");
            this.Head = this.Neck.getChild("Head");
            this.ManeLeft = this.Head.getChild("ManeLeft");

            this.HairTopLeft = this.Head.getChild("HairTopLeft");

            this.HairTopRight = this.Head.getChild("HairTopRight");

            this.Face = this.Head.getChild("Face");
            this.Hair = this.Face.getChild("Hair");

            this.Snout = this.Face.getChild("Snout");
            this.TopSnout = this.Snout.getChild("TopSnout");

            this.Mouth = this.Snout.getChild("Mouth");

            this.Lips = this.Snout.getChild("Lips");

            this.EarRight = this.Head.getChild("EarRight");

            this.ManeRight = this.Head.getChild("ManeRight");

            this.EarLeft = this.Head.getChild("EarLeft");

            this.SiamangThroat = this.Neck.getChild("SiamangThroat");

            this.ArmRight = this.Chest.getChild("ArmRight");
            this.ForearmRight = this.ArmRight.getChild("ForearmRight");
            this.HandRight = this.ForearmRight.getChild("HandRight");
            this.ThumbRight = this.HandRight.getChild("ThumbRight");

            this.FingersRight = this.HandRight.getChild("FingersRight");

            this.ArmLeft = this.Chest.getChild("ArmLeft");
            this.ForearmLeft = this.ArmLeft.getChild("ForearmLeft");
            this.HandLeft = this.ForearmLeft.getChild("HandLeft");
            this.FingersLeft = this.HandLeft.getChild("FingersLeft");

            this.ThumbLeft = this.HandLeft.getChild("ThumbLeft");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Chest = partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -4.5F, -2.5F, 8.0F, 7.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 7.6F, -2.5F, -0.3616322090290002F, 0.0F, 0.0F));
            PartDefinition Body = Chest.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 16).addBox(-3.5F, 0.0F, 0.0F, 7.0F, 7.0F, 7.0F), PartPose.offsetAndRotation(0.0F, -4.0F, 2.5F, -0.3574434228189554F, 0.0F, 0.0F));
            PartDefinition Hips = Body.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 36).addBox(-3.0F, 0.0F, 0.0F, 6.0F, 5.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 0.5F, 7.1F, -0.45535640450848164F, 0.0F, 0.0F));
            PartDefinition ThighLeft = Hips.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(30, 39).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 6.0F, 4.0F), PartPose.offsetAndRotation(2.5F, 2.9F, 2.4F, 0.8527678831770739F, 0.0F, -0.13665927909957545F));
            PartDefinition LegLeft = ThighLeft.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(32, 50).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 6.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 5.5F, -2.0F, 0.4098033003787853F, 0.0F, 0.0911061832922575F));
            PartDefinition FootLeft = LegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(48, 44).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(-0.1F, 6.9F, 2.5F, -0.18849556254433897F, 0.0F, 0.0F));
            PartDefinition ToesLeft = FootLeft.addOrReplaceChild("ToesLeft", CubeListBuilder.create().texOffs(48, 50).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -1.0F, -3.0F, 0.2275909337942703F, 0.0F, 0.0F));

            PartDefinition ThighRight = Hips.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(30, 39).mirror(true).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 6.0F, 4.0F), PartPose.offsetAndRotation(-2.5F, 2.9F, 2.4F, 0.8527678831770739F, 0.0F, 0.13665927909957545F));
            PartDefinition LegRight = ThighRight.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(32, 50).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 6.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 5.5F, -2.0F, 0.4098033003787853F, 0.0F, -0.0911061832922575F));
            PartDefinition FootRight = LegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(48, 44).mirror(true).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(-0.1F, 6.9F, 2.5F, -0.18849556254433897F, 0.0F, 0.0F));
            PartDefinition ToesRight = FootRight.addOrReplaceChild("ToesRight", CubeListBuilder.create().texOffs(48, 50).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -1.0F, -3.0F, 0.2275909337942703F, 0.0F, 0.0F));

            PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 50).addBox(-2.0F, -1.5F, -1.5F, 4.0F, 5.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -3.1F, -2.5F, -0.3186971254089062F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(34, 11).addBox(-3.0F, -3.5F, -1.5F, 6.0F, 7.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 1.8F, -2.4F, 0.8072147790473774F, 0.0F, 0.0F));
            PartDefinition ManeLeft = Head.addOrReplaceChild("ManeLeft", CubeListBuilder.create().texOffs(35, 70).addBox(-3.0F, -2.0F, 0.0F, 3.0F, 6.0F, 4.0F), PartPose.offsetAndRotation(3.8F, 0.0F, -1.8F, -0.013962634224014095F, 0.0F, 0.21223203437934937F));

            PartDefinition HairTopLeft = Head.addOrReplaceChild("HairTopLeft", CubeListBuilder.create().texOffs(0, 80).addBox(0.0F, -2.0F, 0.0F, 4.0F, 2.0F, 5.0F), PartPose.offsetAndRotation(-0.51F, -2.3F, -1.6F, 0.0F, 0.0F, 0.23457224414434488F));

            PartDefinition HairTopRight = Head.addOrReplaceChild("HairTopRight", CubeListBuilder.create().texOffs(0, 80).mirror(true).addBox(-4.0F, -2.0F, 0.0F, 4.0F, 2.0F, 5.0F), PartPose.offsetAndRotation(0.51F, -2.3F, -1.6F, 0.0F, 0.0F, -0.23457224414434488F));

            PartDefinition Face = Head.addOrReplaceChild("Face", CubeListBuilder.create().texOffs(50, 0).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 5.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -3.0F, -2.0F, -0.0911061832922575F, 0.0F, 0.0F));
            PartDefinition Hair = Face.addOrReplaceChild("Hair", CubeListBuilder.create().texOffs(30, 0).addBox(-1.5F, -1.5F, -0.3F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.2F, 0.0F, 0.27366763203903305F, 0.0F, 0.0F));

            PartDefinition Snout = Face.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(44, 26).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 3.7F, 1.2F, 0.058468528277334356F, 0.0F, 0.0F));
            PartDefinition TopSnout = Snout.addOrReplaceChild("TopSnout", CubeListBuilder.create().texOffs(54, 6).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -1.9F, 0.9175195824470969F, 0.0F, 0.0F));

            PartDefinition Mouth = Snout.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(44, 34).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, -0.13665927909957545F, 0.0F, 0.0F));

            PartDefinition Lips = Snout.addOrReplaceChild("Lips", CubeListBuilder.create().texOffs(44, 40).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.1F, 0.0F, 0.0F)), PartPose.offset(0.0F, 1.1F, -2.1F));

            PartDefinition EarRight = Head.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(25, 54).mirror(true).addBox(-1.0F, -2.0F, -0.5F, 2.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-3.0F, -0.5F, 1.0F, 0.0781907508222411F, 0.0F, 0.3914773565486503F));

            PartDefinition ManeRight = Head.addOrReplaceChild("ManeRight", CubeListBuilder.create().texOffs(35, 70).mirror(true).addBox(0.0F, -2.0F, 0.0F, 3.0F, 6.0F, 4.0F), PartPose.offsetAndRotation(-3.8F, 0.0F, -1.8F, -0.013962634224014095F, 0.0F, -0.21223203437934937F));

            PartDefinition EarLeft = Head.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(25, 54).addBox(-1.0F, -2.0F, -0.5F, 2.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(2.9F, -0.5F, 1.0F, 0.0781907508222411F, 0.0F, -0.3914773565486503F));

            PartDefinition SiamangThroat = Neck.addOrReplaceChild("SiamangThroat", CubeListBuilder.create().texOffs(30, 83).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 4.0F, 4.0F), PartPose.offset(0.0F, 2.0F, -1.0F));

            PartDefinition ArmRight = Chest.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(0, 61).mirror(true).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 7.0F, 4.0F), PartPose.offsetAndRotation(-3.5F, -2.0F, -0.6F, 0.32567843575898076F, 0.0F, 0.0F));
            PartDefinition ForearmRight = ArmRight.addOrReplaceChild("ForearmRight", CubeListBuilder.create().texOffs(18, 63).mirror(true).addBox(-1.5F, 0.0F, -3.0F, 3.0F, 11.0F, 3.0F), PartPose.offsetAndRotation(0.1F, 6.0F, 1.5F, -0.0911061832922575F, 0.0F, -0.0911061832922575F));
            PartDefinition HandRight = ForearmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(46, 55).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 9.9F, -2.5F, 0.0911061832922575F, 0.0F, 0.0911061832922575F));
            PartDefinition ThumbRight = HandRight.addOrReplaceChild("ThumbRight", CubeListBuilder.create().texOffs(42, 62).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(1.0F, 0.4F, 0.5F, 0.0F, 0.0F, -0.27314402127920984F));

            PartDefinition FingersRight = HandRight.addOrReplaceChild("FingersRight", CubeListBuilder.create().texOffs(32, 62).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F), PartPose.offset(0.0F, 2.0F, 2.0F));

            PartDefinition ArmLeft = Chest.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(0, 61).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 7.0F, 4.0F), PartPose.offsetAndRotation(3.5F, -2.0F, -0.6F, 0.32567843575898076F, 0.0F, 0.0F));
            PartDefinition ForearmLeft = ArmLeft.addOrReplaceChild("ForearmLeft", CubeListBuilder.create().texOffs(18, 63).addBox(-1.5F, 0.0F, -3.0F, 3.0F, 11.0F, 3.0F), PartPose.offsetAndRotation(-0.1F, 6.0F, 1.5F, -0.0911061832922575F, 0.0F, 0.0911061832922575F));
            PartDefinition HandLeft = ForearmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(46, 55).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-0.0F, 9.9F, -2.5F, 0.0911061832922575F, 0.0F, -0.0911061832922575F));
            PartDefinition FingersLeft = HandLeft.addOrReplaceChild("FingersLeft", CubeListBuilder.create().texOffs(32, 62).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F), PartPose.offset(0.0F, 2.0F, 2.0F));

            PartDefinition ThumbLeft = HandLeft.addOrReplaceChild("ThumbLeft", CubeListBuilder.create().texOffs(42, 62).addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-1.0F, 0.4F, 0.5F, 0.0F, 0.0F, 0.27314402127920984F));

            return LayerDefinition.create(meshDefinition, 64, 96);
        }

        @Override
        public void setupAnim(GibbonEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = (float) Math.toRadians((double) netHeadYaw) * 0.5F;
            this.Head.yRot = (float) Math.toRadians((double) netHeadYaw) * 0.5F;
        }

        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0F;
            float degree = 1.0F;
            this.Neck.xRot = Mth.cos(1.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * -0.1F * limbSwingAmount * 0.5F - 0.3F;
            this.Head.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * 0.2F * limbSwingAmount * 0.5F + 0.455F;
        }

        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.9F;
            float degree = 0.7F;
            if (this.isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            }

            this.Neck.xRot = Mth.cos(1.0F + limbSwing * speed * 0.5F + 3.1415927F) * degree * -0.2F * limbSwingAmount * 0.5F - 0.3F;
            this.Head.xRot = Mth.cos(2.0F + limbSwing * speed * 0.5F + 3.1415927F) * degree * 0.2F * limbSwingAmount * 0.5F + 0.455F;
            this.Chest.xRot = Mth.cos(2.0F + limbSwing * speed * 0.5F + 3.1415927F) * degree * -0.1F * limbSwingAmount * 0.5F - 0.361F;
            this.Body.xRot = Mth.cos(4.0F + limbSwing * speed * 0.5F + 3.1415927F) * degree * 0.2F * limbSwingAmount * 0.5F - 0.357F;
            this.Chest.y = Mth.cos(2.0F + limbSwing * speed * 0.5F + 3.1415927F) * degree * -0.5F * limbSwingAmount * 0.5F + 7.6F;
            this.Hips.xRot = Mth.cos(1.0F + limbSwing * speed * 0.5F + 3.1415927F) * degree * 0.5F * limbSwingAmount * 0.5F - 0.455F;
            this.ArmLeft.z = Mth.cos(7.0F + limbSwing * speed * 0.25F + 3.1415927F) * degree * 4.0F * limbSwingAmount * 0.5F - 0.6F;
            this.ArmLeft.xRot = Mth.cos(limbSwing * speed * 0.25F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.325F;
            this.ForearmLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.25F + 3.1415927F) * degree * 2.2F * limbSwingAmount * 0.5F - 0.091F;
            this.HandLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.25F + 3.1415927F) * degree * -1.0F * limbSwingAmount * 0.5F + 0.091F;
            this.ArmRight.z = Mth.cos(7.0F + limbSwing * speed * 0.25F + 3.1415927F) * degree * -4.0F * limbSwingAmount * 0.5F - 0.6F;
            this.ArmRight.xRot = Mth.cos(limbSwing * speed * 0.25F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F + 0.325F;
            this.ForearmRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.25F + 3.1415927F) * degree * -2.2F * limbSwingAmount * 0.5F - 0.091F;
            this.HandRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.25F + 3.1415927F) * degree * 1.0F * limbSwingAmount * 0.5F + 0.091F;
            this.ThighLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.25F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F + 0.853F;
            this.LegLeft.xRot = Mth.cos(0.0F + limbSwing * speed * 0.25F + 3.1415927F) * degree * 3.0F * limbSwingAmount * 0.5F + 0.409F;
            this.FootLeft.xRot = Mth.cos(6.0F + limbSwing * speed * 0.25F + 3.1415927F) * degree * -1.0F * limbSwingAmount * 0.5F - 0.188F;
            this.ThighRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.25F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.853F;
            this.LegRight.xRot = Mth.cos(0.0F + limbSwing * speed * 0.25F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.409F;
            this.FootRight.xRot = Mth.cos(6.0F + limbSwing * speed * 0.25F + 3.1415927F) * degree * 1.0F * limbSwingAmount * 0.5F - 0.188F;
        }
    }

    public static class Child extends GibbonModel {

        public ModelPart Body;
        public ModelPart ArmLeft;
        public ModelPart Neck;
        public ModelPart ArmRight;
        public ModelPart Hips;
        public ModelPart ThighLeft;
        public ModelPart ThighRight;
        public ModelPart LegLeft;
        public ModelPart FootLeft;
        public ModelPart LegRight;
        public ModelPart FootRight;
        public ModelPart ForearmLeft;
        public ModelPart HandLeft;
        public ModelPart FingersLeft;
        public ModelPart ThumbLeft;
        public ModelPart Head;
        public ModelPart Face;
        public ModelPart ManeLeft;
        public ModelPart EarLeft;
        public ModelPart HairTopLeft;
        public ModelPart ManeRight;
        public ModelPart HairTopRight;
        public ModelPart EarRight;
        public ModelPart Snout;
        public ModelPart Mouth;
        public ModelPart TopSnout;
        public ModelPart ForearmRight;
        public ModelPart HandRight;
        public ModelPart FingersRight;
        public ModelPart ThumbRight;

        public Child(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.Body = this.Chest.getChild("Body");
            this.Hips = this.Body.getChild("Hips");
            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.LegLeft = this.ThighLeft.getChild("LegLeft");
            this.FootLeft = this.LegLeft.getChild("FootLeft");

            this.ThighRight = this.Hips.getChild("ThighRight");
            this.LegRight = this.ThighRight.getChild("LegRight");
            this.FootRight = this.LegRight.getChild("FootRight");

            this.ArmRight = this.Chest.getChild("ArmRight");
            this.ForearmRight = this.ArmRight.getChild("ForearmRight");
            this.HandRight = this.ForearmRight.getChild("HandRight");
            this.ThumbRight = this.HandRight.getChild("ThumbRight");

            this.FingersRight = this.HandRight.getChild("FingersRight");

            this.ArmLeft = this.Chest.getChild("ArmLeft");
            this.ForearmLeft = this.ArmLeft.getChild("ForearmLeft");
            this.HandLeft = this.ForearmLeft.getChild("HandLeft");
            this.ThumbLeft = this.HandLeft.getChild("ThumbLeft");

            this.FingersLeft = this.HandLeft.getChild("FingersLeft");

            this.Neck = this.Chest.getChild("Neck");
            this.Head = this.Neck.getChild("Head");
            this.ManeLeft = this.Head.getChild("ManeLeft");

            this.Face = this.Head.getChild("Face");
            this.Snout = this.Face.getChild("Snout");
            this.Mouth = this.Snout.getChild("Mouth");

            this.TopSnout = this.Snout.getChild("TopSnout");

            this.HairTopLeft = this.Head.getChild("HairTopLeft");

            this.ManeRight = this.Head.getChild("ManeRight");

            this.EarRight = this.Head.getChild("EarRight");

            this.HairTopRight = this.Head.getChild("HairTopRight");

            this.EarLeft = this.Head.getChild("EarLeft");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Chest = partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -2.0F, -1.5F, 4.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 14.9F, -2.5F, -0.3616322090290002F, 0.0F, 0.0F));
            PartDefinition Body = Chest.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 7).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(-0.01F, -2.0F, 1.5F, -0.3574434228189554F, 0.0F, 0.0F));
            PartDefinition Hips = Body.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 14).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.1F, 3.0F, -0.45535640450848164F, 0.0F, 0.0F));
            PartDefinition ThighLeft = Hips.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(14, 12).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, 0.2F)), PartPose.offsetAndRotation(1.2F, 1.4F, 1.9F, 0.9700540302163814F, 0.0F, 0.0F));
            PartDefinition LegLeft = ThighLeft.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(14, 18).addBox(-1.0F, 0.0F, -0.2F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-0.01F, 3.0F, -1.0F, 0.4098033003787853F, 0.0F, 0.0F));
            PartDefinition FootLeft = LegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(13, 23).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(-0.01F, 3.0F, 1.5F, -0.1494001912944076F, 0.0F, 0.0F));

            PartDefinition ThighRight = Hips.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(14, 12).mirror(true).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, 0.2F)), PartPose.offsetAndRotation(-1.2F, 1.4F, 1.9F, 0.9700540302163814F, 0.0F, 0.0F));
            PartDefinition LegRight = ThighRight.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(14, 18).mirror(true).addBox(-1.0F, 0.0F, -0.2F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.01F, 3.0F, -1.0F, 0.4098033003787853F, 0.0F, 0.0F));
            PartDefinition FootRight = LegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(13, 23).mirror(true).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.01F, 3.0F, 1.5F, -0.1494001912944076F, 0.0F, 0.0F));

            PartDefinition ArmRight = Chest.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(24, 12).mirror(true).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-1.7F, 0.9F, 0.2F, 0.32567843575898076F, 0.0F, 0.0F));
            PartDefinition ForearmRight = ArmRight.addOrReplaceChild("ForearmRight", CubeListBuilder.create().texOffs(24, 17).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(0.01F, 2.9F, 0.5F, -0.0911061832922575F, 0.0F, -0.0911061832922575F));
            PartDefinition HandRight = ForearmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(25, 23).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.01F, 3.9F, -1.9F, 0.0911061832922575F, 0.0F, 0.0911061832922575F));
            PartDefinition ThumbRight = HandRight.addOrReplaceChild("ThumbRight", CubeListBuilder.create().texOffs(32, 22).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(1.0F, 0.2F, 0.01F, 0.0F, 0.0F, -0.27314402127920984F));

            PartDefinition FingersRight = HandRight.addOrReplaceChild("FingersRight", CubeListBuilder.create().texOffs(31, 24).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F), PartPose.offset(0.0F, 1.0F, 1.0F));

            PartDefinition ArmLeft = Chest.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(24, 12).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(1.7F, 0.9F, 0.2F, 0.32567843575898076F, 0.0F, 0.0F));
            PartDefinition ForearmLeft = ArmLeft.addOrReplaceChild("ForearmLeft", CubeListBuilder.create().texOffs(24, 17).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(-0.01F, 2.9F, 0.5F, -0.0911061832922575F, 0.0F, 0.0911061832922575F));
            PartDefinition HandLeft = ForearmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(25, 23).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-0.01F, 3.9F, -1.9F, 0.0911061832922575F, 0.0F, -0.0911061832922575F));
            PartDefinition ThumbLeft = HandLeft.addOrReplaceChild("ThumbLeft", CubeListBuilder.create().texOffs(32, 22).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-1.0F, 0.2F, 0.01F, 0.0F, 0.0F, 0.27314402127920984F));

            PartDefinition FingersLeft = HandLeft.addOrReplaceChild("FingersLeft", CubeListBuilder.create().texOffs(31, 24).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F), PartPose.offset(0.0F, 1.0F, 1.0F));

            PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 20).addBox(-1.5F, -0.4F, -1.9F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F, 0.3F, 0.0F)), PartPose.offsetAndRotation(0.0F, -1.5F, -1.5F, -0.3186971254089062F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(14, 0).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 1.1F, -1.3F, 0.8072147790473774F, 0.0F, 0.0F));
            PartDefinition ManeLeft = Head.addOrReplaceChild("ManeLeft", CubeListBuilder.create().texOffs(28, 1).addBox(-1.8F, -1.0F, -0.5F, 2.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(2.2F, 0.5F, -1.7F, -0.013962634224014095F, 0.0781907508222411F, 0.21223203437934937F));

            PartDefinition Face = Head.addOrReplaceChild("Face", CubeListBuilder.create().texOffs(27, 7).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -1.8F, -2.2F, -0.0911061832922575F, 0.0F, 0.0F));
            PartDefinition Snout = Face.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(35, 8).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 2.5F, 1.5F, 0.058468528277334356F, 0.0F, 0.0F));
            PartDefinition Mouth = Snout.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(35, 1).addBox(-1.0F, 0.0F, -1.9F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-0.01F, 1.0F, 0.0F, -0.13665927909957545F, 0.0F, 0.0F));

            PartDefinition TopSnout = Snout.addOrReplaceChild("TopSnout", CubeListBuilder.create().texOffs(36, 5).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -1.9F, 0.9175195824470969F, 0.0F, 0.0F));

            PartDefinition HairTopLeft = Head.addOrReplaceChild("HairTopLeft", CubeListBuilder.create().texOffs(14, 7).addBox(0.0F, -1.5F, -0.3F, 3.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(-0.51F, -1.3F, -1.6F, 0.0F, 0.0F, 0.23457224414434488F));

            PartDefinition ManeRight = Head.addOrReplaceChild("ManeRight", CubeListBuilder.create().texOffs(28, 1).mirror(true).addBox(-0.2F, -1.0F, -0.5F, 2.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(-2.2F, 0.5F, -1.7F, -0.013962634224014095F, -0.0781907508222411F, -0.21223203437934937F));

            PartDefinition EarRight = Head.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(35, 11).mirror(true).addBox(-1.0F, -1.3F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-1.37F, -0.2F, -0.4F, 0.0781907508222411F, 0.0F, 0.2741912261540994F));

            PartDefinition HairTopRight = Head.addOrReplaceChild("HairTopRight", CubeListBuilder.create().texOffs(14, 7).mirror(true).addBox(-3.0F, -1.5F, -0.3F, 3.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.51F, -1.3F, -1.6F, 0.0F, 0.0F, -0.23457224414434488F));

            PartDefinition EarLeft = Head.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(35, 11).addBox(0.0F, -1.3F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(1.37F, -0.2F, -0.4F, 0.0781907508222411F, 0.0F, -0.2741912261540994F));

            return LayerDefinition.create(meshDefinition, 64, 32);
        }

        @Override
        public void setupAnim(GibbonEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = (float) Math.toRadians((double) netHeadYaw) * 0.5F;
            this.Head.yRot = (float) Math.toRadians((double) netHeadYaw) * 0.5F;
        }

        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0F;
            float degree = 1.0F;
            this.Neck.xRot = Mth.cos(1.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * -0.1F * limbSwingAmount * 0.5F - 0.318F;
        }

        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0F;
            float degree = 1.0F;
            if (this.isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            }

            this.ThighLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.25F + 3.1415927F) * degree * -2.5F * limbSwingAmount * 0.5F + 0.97F;
            this.LegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.25F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F + 0.409F;
            this.FootLeft.xRot = Mth.cos(limbSwing * speed * 0.25F + 3.1415927F) * degree * -2.5F * limbSwingAmount * 0.5F - 0.149F;
            this.ThighRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.25F + 3.1415927F) * degree * 2.5F * limbSwingAmount * 0.5F + 0.97F;
            this.LegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.25F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.409F;
            this.FootRight.xRot = Mth.cos(limbSwing * speed * 0.25F + 3.1415927F) * degree * 2.5F * limbSwingAmount * 0.5F - 0.149F;
            this.Chest.xRot = Mth.cos(2.0F + limbSwing * speed * 0.5F + 3.1415927F) * degree * -0.05F * limbSwingAmount * 0.5F - 0.361F;
            this.Body.xRot = Mth.cos(limbSwing * speed * 0.5F + 3.1415927F) * degree * -0.1F * limbSwingAmount * 0.5F - 0.357F;
            this.Hips.xRot = Mth.cos(5.0F + limbSwing * speed * 0.5F + 3.1415927F) * degree * -0.2F * limbSwingAmount * 0.5F - 0.455F;
            this.Neck.xRot = Mth.cos(1.0F + limbSwing * speed * 0.5F + 3.1415927F) * degree * -0.1F * limbSwingAmount * 0.5F - 0.318F;
            this.ArmLeft.xRot = Mth.cos(limbSwing * speed * 0.25F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F + 0.326F;
            this.ForearmLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.25F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F - 0.091F;
            this.ArmRight.xRot = Mth.cos(limbSwing * speed * 0.25F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.326F;
            this.ForearmRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.25F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F - 0.091F;
        }
    }
}
