package com.github.artyarticus.ecoregions.client.model;

import com.github.artyarticus.ecoregions.entity.MarmosetEntity;
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

public abstract class MarmosetModel extends ZawaBaseModel<MarmosetEntity> {
    public ModelPart Body;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Body);
        }

        return this.parts;
    }

    public static class Adult extends MarmosetModel {
        public ModelPart Hips;
        public ModelPart Neck;
        public ModelPart UpperArmLeft;
        public ModelPart UpperArmRight;
        public ModelPart ThighLeft;
        public ModelPart Tail1;
        public ModelPart ThighRight;
        public ModelPart Legleft;
        public ModelPart FootLeft;
        public ModelPart Tail;
        public ModelPart Tail_1;
        public ModelPart Tail_2;
        public ModelPart Tail_3;
        public ModelPart Tail_4;
        public ModelPart LegRight;
        public ModelPart FootRight;
        public ModelPart Head;
        public ModelPart Neck_1;
        public ModelPart Snout;
        public ModelPart EarLeft;
        public ModelPart Fluff;
        public ModelPart Nose;
        public ModelPart Mouth;
        public ModelPart Forehead;
        public ModelPart Fluff1;
        public ModelPart Fluff3;
        public ModelPart Fluff1_1;
        public ModelPart Fluff3_1;
        public ModelPart Fluff1_2;
        public ModelPart Fluff1_3;
        public ModelPart Fluff2;
        public ModelPart Fluff2_1;
        public ModelPart ArmLeft;
        public ModelPart HandLeft;
        public ModelPart ThumbLeft;
        public ModelPart ArmRight;
        public ModelPart HandRight;
        public ModelPart ThumbRight;

        public Adult(ModelPart root) {
            this.Body = root.getChild("Body");
            this.UpperArmRight = this.Body.getChild("UpperArmRight");
            this.ArmRight = this.UpperArmRight.getChild("ArmRight");
            this.HandRight = this.ArmRight.getChild("HandRight");
            this.ThumbRight = this.HandRight.getChild("ThumbRight");

            this.Hips = this.Body.getChild("Hips");
            this.ThighRight = this.Hips.getChild("ThighRight");
            this.LegRight = this.ThighRight.getChild("LegRight");
            this.FootRight = this.LegRight.getChild("FootRight");

            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.Legleft = this.ThighLeft.getChild("Legleft");
            this.FootLeft = this.Legleft.getChild("FootLeft");

            this.Tail1 = this.Hips.getChild("Tail1");
            this.Tail = this.Tail1.getChild("Tail");
            this.Tail_1 = this.Tail.getChild("Tail_1");
            this.Tail_2 = this.Tail_1.getChild("Tail_2");
            this.Tail_3 = this.Tail_2.getChild("Tail_3");
            this.Tail_4 = this.Tail_3.getChild("Tail_4");

            this.Neck = this.Body.getChild("Neck");
            this.Head = this.Neck.getChild("Head");
            this.Snout = this.Head.getChild("Snout");
            this.Mouth = this.Snout.getChild("Mouth");

            this.Nose = this.Snout.getChild("Nose");

            this.EarLeft = this.Head.getChild("EarLeft");

            this.Fluff = this.Head.getChild("Fluff");
            this.Fluff3 = this.Fluff.getChild("Fluff3");

            this.Fluff1_3 = this.Fluff.getChild("Fluff1_3");

            this.Fluff1 = this.Fluff.getChild("Fluff1");
            this.Fluff2 = this.Fluff1.getChild("Fluff2");

            this.Fluff1_1 = this.Fluff.getChild("Fluff1_1");
            this.Fluff2_1 = this.Fluff1_1.getChild("Fluff2_1");

            this.Forehead = this.Fluff.getChild("Forehead");

            this.Fluff3_1 = this.Fluff.getChild("Fluff3_1");

            this.Fluff1_2 = this.Fluff.getChild("Fluff1_2");

            this.Neck_1 = this.Neck.getChild("Neck_1");

            this.UpperArmLeft = this.Body.getChild("UpperArmLeft");
            this.ArmLeft = this.UpperArmLeft.getChild("ArmLeft");
            this.HandLeft = this.ArmLeft.getChild("HandLeft");
            this.ThumbLeft = this.HandLeft.getChild("ThumbLeft");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 2).addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 6.0F), PartPose.offsetAndRotation(0.0F, 19.0F, 0.0F, 0.04555309164612875F, 0.0F, 0.0F));
            PartDefinition UpperArmRight = Body.addOrReplaceChild("UpperArmRight", CubeListBuilder.create().texOffs(46, 7).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-1.8F, 0.2F, -1.5F, 0.13665927909957545F, 0.0F, 0.0F));
            PartDefinition ArmRight = UpperArmRight.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(46, 12).addBox(-1.0F, 0.2F, -1.5F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-0.01F, 2.6F, 0.0F, -0.3642502295386026F, 0.0F, 0.0F));
            PartDefinition HandRight = ArmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(46, 16).addBox(-1.0F, 0.0F, -2.2F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.01F, 1.6F, -0.5F, 0.18203784630933073F, 0.0F, 0.0F));
            PartDefinition ThumbRight = HandRight.addOrReplaceChild("ThumbRight", CubeListBuilder.create().texOffs(46, 20).addBox(-0.2F, -0.5F, -1.4F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.5F, 0.51F, 0.0F, 0.0F, -0.27314402127920984F, 0.0F));

            PartDefinition Hips = Body.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 13).addBox(-3.0F, -0.6F, 0.0F, 6.0F, 5.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -2.0F, 2.5F, -0.0911061832922575F, 0.0F, 0.0F));
            PartDefinition ThighRight = Hips.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(52, 0).addBox(-1.0F, -0.5F, -1.5F, 3.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(-2.5F, 1.5F, 2.0F, -0.0911061832922575F, 0.0F, 0.0F));
            PartDefinition LegRight = ThighRight.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(56, 7).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.5F, 3.5F, -0.8F, 0.591841146688116F, 0.0F, 0.0F));
            PartDefinition FootRight = LegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(54, 12).addBox(-1.0F, -0.2F, -2.4F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.01F, 2.0F, 0.5F, -0.4098033003787853F, 0.0F, 0.0F));

            PartDefinition ThighLeft = Hips.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(52, 0).mirror(true).addBox(-2.0F, -0.5F, -1.5F, 3.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(2.5F, 1.5F, 2.0F, -0.0911061832922575F, 0.0F, 0.0F));
            PartDefinition Legleft = ThighLeft.addOrReplaceChild("Legleft", CubeListBuilder.create().texOffs(56, 7).mirror(true).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-0.5F, 3.5F, -0.8F, 0.591841146688116F, 0.0F, 0.0F));
            PartDefinition FootLeft = Legleft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(54, 12).mirror(true).addBox(-1.0F, -0.2F, -2.4F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(-0.01F, 2.0F, 0.5F, -0.4098033003787853F, 0.0F, 0.0F));

            PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(0, 27).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.1F, 3.5F, -0.5462880425584197F, 0.0F, 0.0F));
            PartDefinition Tail = Tail1.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(10, 27).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.01F, 0.0F, 2.8F, 0.0911061832922575F, 0.0F, 0.0F));
            PartDefinition Tail_1 = Tail.addOrReplaceChild("Tail_1", CubeListBuilder.create().texOffs(10, 27).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(-0.01F, 0.0F, 2.8F, 0.0911061832922575F, 0.0F, 0.0F));
            PartDefinition Tail_2 = Tail_1.addOrReplaceChild("Tail_2", CubeListBuilder.create().texOffs(10, 27).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.01F, 0.0F, 2.8F, 0.0911061832922575F, 0.0F, 0.0F));
            PartDefinition Tail_3 = Tail_2.addOrReplaceChild("Tail_3", CubeListBuilder.create().texOffs(10, 27).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(-0.01F, 0.0F, 2.8F, 0.0911061832922575F, 0.0F, 0.0F));
            PartDefinition Tail_4 = Tail_3.addOrReplaceChild("Tail_4", CubeListBuilder.create().texOffs(20, 27).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.01F, 0.0F, 2.8F, 0.0911061832922575F, 0.0F, 0.0F));

            PartDefinition Neck = Body.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(23, 21).addBox(-1.0F, -0.5F, -1.5F, 2.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -1.5F, -2.0F, -0.500909508638178F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(32, 15).addBox(-1.5F, -1.5F, -2.0F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 1.3F, -1.5F, 0.5866051722479385F, 0.0F, 0.0F));
            PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(25, 12).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.1F, -1.7F, 0.5206317145383279F, 0.0F, 0.0F));
            PartDefinition Mouth = Snout.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(26, 15).addBox(-1.0F, -0.2F, -1.0F, 2.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.01F, 0.7F, 0.2F, -0.27314402127920984F, 0.0F, 0.0F));

            PartDefinition Nose = Snout.addOrReplaceChild("Nose", CubeListBuilder.create().texOffs(26, 17).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -0.1F, 0.2F, 0.6373942508178124F, 0.0F, 0.0F));

            PartDefinition EarLeft = Head.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(48, 0).addBox(0.0F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(1.0F, -0.4F, 0.0F, 0.0F, -0.37751470255898745F, 0.13665927909957545F));

            PartDefinition Fluff = Head.addOrReplaceChild("Fluff", CubeListBuilder.create().texOffs(20, 0).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F), PartPose.offset(0.0F, 0.0F, 0.1F));
            PartDefinition Fluff3 = Fluff.addOrReplaceChild("Fluff3", CubeListBuilder.create().texOffs(36, 27).mirror(true).addBox(-0.5F, -1.5F, -1.0F, 3.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(1.2F, -0.01F, -0.01F, 0.13665927909957545F, -0.2275909337942703F, 0.0F));

            PartDefinition Fluff1_3 = Fluff.addOrReplaceChild("Fluff1_3", CubeListBuilder.create().texOffs(42, 1).mirror(true).addBox(-1.5F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 0.13665927909957545F, 0.2275909337942703F, 0.0F));

            PartDefinition Fluff1 = Fluff.addOrReplaceChild("Fluff1", CubeListBuilder.create().texOffs(36, 4).mirror(true).addBox(-0.5F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(1.5F, 0.0F, 0.0F, 0.13665927909957545F, -0.2275909337942703F, 0.0F));
            PartDefinition Fluff2 = Fluff1.addOrReplaceChild("Fluff2", CubeListBuilder.create().texOffs(36, 9).mirror(true).addBox(0.0F, -0.5F, -1.0F, 3.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.5F, -1.0F, 0.0F, 0.0F, -1.133416858855695F, 0.5462880425584197F));

            PartDefinition Fluff1_1 = Fluff.addOrReplaceChild("Fluff1_1", CubeListBuilder.create().texOffs(36, 4).mirror(true).addBox(-1.5F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-1.5F, 0.0F, 0.0F, 0.13665927909957545F, 0.2275909337942703F, 0.0F));
            PartDefinition Fluff2_1 = Fluff1_1.addOrReplaceChild("Fluff2_1", CubeListBuilder.create().texOffs(36, 9).mirror(true).addBox(-3.0F, -0.5F, -1.0F, 3.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-0.5F, -1.0F, 0.0F, 0.0F, 1.133416858855695F, -0.5462880425584197F));

            PartDefinition Forehead = Fluff.addOrReplaceChild("Forehead", CubeListBuilder.create().texOffs(32, 0).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -1.1F, -1.8F, 0.2275909337942703F, 0.0F, 0.0F));

            PartDefinition Fluff3_1 = Fluff.addOrReplaceChild("Fluff3_1", CubeListBuilder.create().texOffs(36, 28).addBox(-2.5F, -1.5F, -1.0F, 3.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-1.2F, -0.01F, -0.01F, 0.13665927909957545F, 0.2275909337942703F, 0.0F));

            PartDefinition Fluff1_2 = Fluff.addOrReplaceChild("Fluff1_2", CubeListBuilder.create().texOffs(42, 1).mirror(true).addBox(-0.5F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, 0.13665927909957545F, -0.2275909337942703F, 0.0F));

            PartDefinition Neck_1 = Neck.addOrReplaceChild("Neck_1", CubeListBuilder.create().texOffs(33, 21).addBox(-1.0F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F), PartPose.offset(0.0F, 3.0F, 0.0F));

            PartDefinition UpperArmLeft = Body.addOrReplaceChild("UpperArmLeft", CubeListBuilder.create().texOffs(46, 7).mirror(true).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(1.8F, 0.2F, -1.5F, 0.13665927909957545F, 0.0F, 0.0F));
            PartDefinition ArmLeft = UpperArmLeft.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(46, 12).mirror(true).addBox(-1.0F, 0.2F, -1.5F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-0.01F, 2.6F, 0.0F, -0.3642502295386026F, 0.0F, 0.0F));
            PartDefinition HandLeft = ArmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(46, 16).mirror(true).addBox(-1.0F, 0.0F, -2.2F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(-0.01F, 1.6F, -0.5F, 0.18203784630933073F, 0.0F, 0.0F));
            PartDefinition ThumbLeft = HandLeft.addOrReplaceChild("ThumbLeft", CubeListBuilder.create().texOffs(46, 20).mirror(true).addBox(-0.8F, -0.5F, -1.4F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-0.5F, 0.51F, 0.0F, 0.0F, 0.27314402127920984F, 0.0F));

            return LayerDefinition.create(meshDefinition, 64, 32);
        }

        @Override
        public void setupAnim(MarmosetEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
            this.Head.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Tail1.xRot = Mth.cos(5.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * 0.3F * limbSwingAmount * 0.5F - 0.546F;
            this.Tail_2.xRot = Mth.cos(1.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * 0.1F * limbSwingAmount * 0.5F + 0.092F;
            this.Neck.xRot = Mth.cos(limbSwing * speed * 0.1F + 3.1415927F) * degree * 0.2F * limbSwingAmount * 0.5F - 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.25f;
            float degree = 0.6f;
            this.ArmLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F - 0.364F;
            this.HandLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F + 0.182F;
            this.ArmRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.5F * limbSwingAmount * 0.5F - 0.364F;
            this.HandRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.182F;

            this.ThighLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F - 0.091F;
            this.Legleft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.591F;
            this.FootLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.5F * limbSwingAmount * 0.5F - 0.409F;
            this.ThighRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F - 0.091F;
            this.LegRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 3.0F * limbSwingAmount * 0.5F + 0.591F;
            this.FootRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F - 0.409F;

            this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * 0.15F * limbSwingAmount * 0.5F + 0.045F;
            this.Hips.xRot = Mth.cos(1.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * -0.17F * limbSwingAmount * 0.5F - 0.091F;
            this.Neck.xRot = Mth.cos(limbSwing * speed * 0.0F + 3.1415927F) * degree * 0.0F * limbSwingAmount * 0.5F - 0.5F;

            this.Tail1.xRot = Mth.cos(5.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * 0.3F * limbSwingAmount * 0.5F + -0.546F;
            this.Tail_2.xRot = Mth.cos(1.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * 0.1F * limbSwingAmount * 0.5F + 0.092F;
        }
    }

    public static class Child extends MarmosetModel {
        public ModelPart Hips;
        public ModelPart Neck;
        public ModelPart UpperArmLeft;
        public ModelPart UpperArmRight;
        public ModelPart ThighLeft;
        public ModelPart Tail1;
        public ModelPart ThighRight;
        public ModelPart Legleft;
        public ModelPart FootLeft;
        public ModelPart Tail;
        public ModelPart Tail_1;
        public ModelPart Tail_2;
        public ModelPart Tail_3;
        public ModelPart Tail_4;
        public ModelPart LegRight;
        public ModelPart FootRight;
        public ModelPart Head;
        public ModelPart Neck_1;
        public ModelPart Snout;
        public ModelPart EarLeft;
        public ModelPart Fluff;
        public ModelPart Nose;
        public ModelPart Mouth;
        public ModelPart Forehead;
        public ModelPart Fluff1;
        public ModelPart Fluff3;
        public ModelPart Fluff1_1;
        public ModelPart Fluff3_1;
        public ModelPart Fluff1_2;
        public ModelPart Fluff1_3;
        public ModelPart Fluff2;
        public ModelPart Fluff2_1;
        public ModelPart ArmLeft;
        public ModelPart HandLeft;
        public ModelPart ThumbLeft;
        public ModelPart ArmRight;
        public ModelPart HandRight;
        public ModelPart ThumbRight;

        public Child(ModelPart root) {
            this.Body = root.getChild("Body");
            this.UpperArmRight = this.Body.getChild("UpperArmRight");
            this.ArmRight = this.UpperArmRight.getChild("ArmRight");
            this.HandRight = this.ArmRight.getChild("HandRight");
            this.ThumbRight = this.HandRight.getChild("ThumbRight");

            this.Hips = this.Body.getChild("Hips");
            this.ThighRight = this.Hips.getChild("ThighRight");
            this.LegRight = this.ThighRight.getChild("LegRight");
            this.FootRight = this.LegRight.getChild("FootRight");

            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.Legleft = this.ThighLeft.getChild("Legleft");
            this.FootLeft = this.Legleft.getChild("FootLeft");

            this.Tail1 = this.Hips.getChild("Tail1");
            this.Tail = this.Tail1.getChild("Tail");
            this.Tail_1 = this.Tail.getChild("Tail_1");
            this.Tail_2 = this.Tail_1.getChild("Tail_2");
            this.Tail_3 = this.Tail_2.getChild("Tail_3");
            this.Tail_4 = this.Tail_3.getChild("Tail_4");

            this.Neck = this.Body.getChild("Neck");
            this.Head = this.Neck.getChild("Head");
            this.Snout = this.Head.getChild("Snout");
            this.Mouth = this.Snout.getChild("Mouth");

            this.Nose = this.Snout.getChild("Nose");

            this.EarLeft = this.Head.getChild("EarLeft");

            this.Fluff = this.Head.getChild("Fluff");
            this.Fluff3 = this.Fluff.getChild("Fluff3");

            this.Fluff1_3 = this.Fluff.getChild("Fluff1_3");

            this.Fluff1 = this.Fluff.getChild("Fluff1");
            this.Fluff2 = this.Fluff1.getChild("Fluff2");

            this.Fluff1_1 = this.Fluff.getChild("Fluff1_1");
            this.Fluff2_1 = this.Fluff1_1.getChild("Fluff2_1");

            this.Forehead = this.Fluff.getChild("Forehead");

            this.Fluff3_1 = this.Fluff.getChild("Fluff3_1");

            this.Fluff1_2 = this.Fluff.getChild("Fluff1_2");

            this.Neck_1 = this.Neck.getChild("Neck_1");

            this.UpperArmLeft = this.Body.getChild("UpperArmLeft");
            this.ArmLeft = this.UpperArmLeft.getChild("ArmLeft");
            this.HandLeft = this.ArmLeft.getChild("HandLeft");
            this.ThumbLeft = this.HandLeft.getChild("ThumbLeft");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 2).addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 6.0F), PartPose.offsetAndRotation(0.0F, 19.0F, 0.0F, 0.04555309164612875F, 0.0F, 0.0F));
            PartDefinition UpperArmRight = Body.addOrReplaceChild("UpperArmRight", CubeListBuilder.create().texOffs(46, 7).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-1.8F, 0.2F, -1.5F, 0.13665927909957545F, 0.0F, 0.0F));
            PartDefinition ArmRight = UpperArmRight.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(46, 12).addBox(-1.0F, 0.2F, -1.5F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-0.01F, 2.6F, 0.0F, -0.3642502295386026F, 0.0F, 0.0F));
            PartDefinition HandRight = ArmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(46, 16).addBox(-1.0F, 0.0F, -2.2F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.01F, 1.6F, -0.5F, 0.18203784630933073F, 0.0F, 0.0F));
            PartDefinition ThumbRight = HandRight.addOrReplaceChild("ThumbRight", CubeListBuilder.create().texOffs(46, 20).addBox(-0.2F, -0.5F, -1.4F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.5F, 0.51F, 0.0F, 0.0F, -0.27314402127920984F, 0.0F));

            PartDefinition Hips = Body.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 13).addBox(-3.0F, -0.6F, 0.0F, 6.0F, 5.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -2.0F, 2.5F, -0.0911061832922575F, 0.0F, 0.0F));
            PartDefinition ThighRight = Hips.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(52, 0).addBox(-1.0F, -0.5F, -1.5F, 3.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(-2.5F, 1.5F, 2.0F, -0.0911061832922575F, 0.0F, 0.0F));
            PartDefinition LegRight = ThighRight.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(56, 7).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.5F, 3.5F, -0.8F, 0.591841146688116F, 0.0F, 0.0F));
            PartDefinition FootRight = LegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(54, 12).addBox(-1.0F, -0.2F, -2.4F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.01F, 2.0F, 0.5F, -0.4098033003787853F, 0.0F, 0.0F));

            PartDefinition ThighLeft = Hips.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(52, 0).mirror(true).addBox(-2.0F, -0.5F, -1.5F, 3.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(2.5F, 1.5F, 2.0F, -0.0911061832922575F, 0.0F, 0.0F));
            PartDefinition Legleft = ThighLeft.addOrReplaceChild("Legleft", CubeListBuilder.create().texOffs(56, 7).mirror(true).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-0.5F, 3.5F, -0.8F, 0.591841146688116F, 0.0F, 0.0F));
            PartDefinition FootLeft = Legleft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(54, 12).mirror(true).addBox(-1.0F, -0.2F, -2.4F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(-0.01F, 2.0F, 0.5F, -0.4098033003787853F, 0.0F, 0.0F));

            PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(0, 27).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.1F, 3.5F, -0.5462880425584197F, 0.0F, 0.0F));
            PartDefinition Tail = Tail1.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(10, 27).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.01F, 0.0F, 2.8F, 0.0911061832922575F, 0.0F, 0.0F));
            PartDefinition Tail_1 = Tail.addOrReplaceChild("Tail_1", CubeListBuilder.create().texOffs(10, 27).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(-0.01F, 0.0F, 2.8F, 0.0911061832922575F, 0.0F, 0.0F));
            PartDefinition Tail_2 = Tail_1.addOrReplaceChild("Tail_2", CubeListBuilder.create().texOffs(10, 27).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.01F, 0.0F, 2.8F, 0.0911061832922575F, 0.0F, 0.0F));
            PartDefinition Tail_3 = Tail_2.addOrReplaceChild("Tail_3", CubeListBuilder.create().texOffs(10, 27).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(-0.01F, 0.0F, 2.8F, 0.0911061832922575F, 0.0F, 0.0F));
            PartDefinition Tail_4 = Tail_3.addOrReplaceChild("Tail_4", CubeListBuilder.create().texOffs(20, 27).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.01F, 0.0F, 2.8F, 0.0911061832922575F, 0.0F, 0.0F));

            PartDefinition Neck = Body.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(23, 21).addBox(-1.0F, -0.5F, -1.5F, 2.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -1.5F, -2.0F, -0.500909508638178F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(32, 15).addBox(-1.5F, -1.5F, -2.0F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 1.3F, -1.5F, 0.5866051722479385F, 0.0F, 0.0F));
            PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(25, 12).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.1F, -1.7F, 0.5206317145383279F, 0.0F, 0.0F));
            PartDefinition Mouth = Snout.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(26, 15).addBox(-1.0F, -0.2F, -1.0F, 2.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.01F, 0.7F, 0.2F, -0.27314402127920984F, 0.0F, 0.0F));

            PartDefinition Nose = Snout.addOrReplaceChild("Nose", CubeListBuilder.create().texOffs(26, 17).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -0.1F, 0.2F, 0.6373942508178124F, 0.0F, 0.0F));

            PartDefinition EarLeft = Head.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(48, 0).addBox(0.0F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(1.0F, -0.4F, 0.0F, 0.0F, -0.37751470255898745F, 0.13665927909957545F));

            PartDefinition Fluff = Head.addOrReplaceChild("Fluff", CubeListBuilder.create().texOffs(20, 0).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F), PartPose.offset(0.0F, 0.0F, 0.1F));
            PartDefinition Fluff3 = Fluff.addOrReplaceChild("Fluff3", CubeListBuilder.create().texOffs(36, 27).mirror(true).addBox(-0.5F, -1.5F, -1.0F, 3.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(1.2F, -0.01F, -0.01F, 0.13665927909957545F, -0.2275909337942703F, 0.0F));

            PartDefinition Fluff1_3 = Fluff.addOrReplaceChild("Fluff1_3", CubeListBuilder.create().texOffs(42, 1).mirror(true).addBox(-1.5F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 0.13665927909957545F, 0.2275909337942703F, 0.0F));

            PartDefinition Fluff1 = Fluff.addOrReplaceChild("Fluff1", CubeListBuilder.create().texOffs(36, 4).mirror(true).addBox(-0.5F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(1.5F, 0.0F, 0.0F, 0.13665927909957545F, -0.2275909337942703F, 0.0F));
            PartDefinition Fluff2 = Fluff1.addOrReplaceChild("Fluff2", CubeListBuilder.create().texOffs(36, 9).mirror(true).addBox(0.0F, -0.5F, -1.0F, 3.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.5F, -1.0F, 0.0F, 0.0F, -1.133416858855695F, 0.5462880425584197F));

            PartDefinition Fluff1_1 = Fluff.addOrReplaceChild("Fluff1_1", CubeListBuilder.create().texOffs(36, 4).mirror(true).addBox(-1.5F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-1.5F, 0.0F, 0.0F, 0.13665927909957545F, 0.2275909337942703F, 0.0F));
            PartDefinition Fluff2_1 = Fluff1_1.addOrReplaceChild("Fluff2_1", CubeListBuilder.create().texOffs(36, 9).mirror(true).addBox(-3.0F, -0.5F, -1.0F, 3.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-0.5F, -1.0F, 0.0F, 0.0F, 1.133416858855695F, -0.5462880425584197F));

            PartDefinition Forehead = Fluff.addOrReplaceChild("Forehead", CubeListBuilder.create().texOffs(32, 0).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -1.1F, -1.8F, 0.2275909337942703F, 0.0F, 0.0F));

            PartDefinition Fluff3_1 = Fluff.addOrReplaceChild("Fluff3_1", CubeListBuilder.create().texOffs(36, 28).addBox(-2.5F, -1.5F, -1.0F, 3.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-1.2F, -0.01F, -0.01F, 0.13665927909957545F, 0.2275909337942703F, 0.0F));

            PartDefinition Fluff1_2 = Fluff.addOrReplaceChild("Fluff1_2", CubeListBuilder.create().texOffs(42, 1).mirror(true).addBox(-0.5F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, 0.13665927909957545F, -0.2275909337942703F, 0.0F));

            PartDefinition Neck_1 = Neck.addOrReplaceChild("Neck_1", CubeListBuilder.create().texOffs(33, 21).addBox(-1.0F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F), PartPose.offset(0.0F, 3.0F, 0.0F));

            PartDefinition UpperArmLeft = Body.addOrReplaceChild("UpperArmLeft", CubeListBuilder.create().texOffs(46, 7).mirror(true).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(1.8F, 0.2F, -1.5F, 0.13665927909957545F, 0.0F, 0.0F));
            PartDefinition ArmLeft = UpperArmLeft.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(46, 12).mirror(true).addBox(-1.0F, 0.2F, -1.5F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-0.01F, 2.6F, 0.0F, -0.3642502295386026F, 0.0F, 0.0F));
            PartDefinition HandLeft = ArmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(46, 16).mirror(true).addBox(-1.0F, 0.0F, -2.2F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(-0.01F, 1.6F, -0.5F, 0.18203784630933073F, 0.0F, 0.0F));
            PartDefinition ThumbLeft = HandLeft.addOrReplaceChild("ThumbLeft", CubeListBuilder.create().texOffs(46, 20).mirror(true).addBox(-0.8F, -0.5F, -1.4F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-0.5F, 0.51F, 0.0F, 0.0F, 0.27314402127920984F, 0.0F));

            return LayerDefinition.create(meshDefinition, 64, 32);
        }

        @Override
        public void setupAnim(MarmosetEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
            this.Head.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Tail1.xRot = Mth.cos(5.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * 0.3F * limbSwingAmount * 0.5F - 0.546F;
            this.Tail_2.xRot = Mth.cos(1.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * 0.1F * limbSwingAmount * 0.5F + 0.092F;
            this.Neck.xRot = Mth.cos(limbSwing * speed * 0.1F + 3.1415927F) * degree * 0.2F * limbSwingAmount * 0.5F - 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.25f;
            float degree = 0.6f;
            this.ArmLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F - 0.364F;
            this.HandLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F + 0.182F;
            this.ArmRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.5F * limbSwingAmount * 0.5F - 0.364F;
            this.HandRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.182F;

            this.ThighLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F - 0.091F;
            this.Legleft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.591F;
            this.FootLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.5F * limbSwingAmount * 0.5F - 0.409F;
            this.ThighRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F - 0.091F;
            this.LegRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 3.0F * limbSwingAmount * 0.5F + 0.591F;
            this.FootRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F - 0.409F;

            this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * 0.15F * limbSwingAmount * 0.5F + 0.045F;
            this.Hips.xRot = Mth.cos(1.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * -0.17F * limbSwingAmount * 0.5F - 0.091F;
            this.Neck.xRot = Mth.cos(limbSwing * speed * 0.0F + 3.1415927F) * degree * 0.0F * limbSwingAmount * 0.5F - 0.5F;

            this.Tail1.xRot = Mth.cos(5.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * 0.3F * limbSwingAmount * 0.5F + -0.546F;
            this.Tail_2.xRot = Mth.cos(1.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * 0.1F * limbSwingAmount * 0.5F + 0.092F;
        }
    }
}

