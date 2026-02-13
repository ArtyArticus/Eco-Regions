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
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.05F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 0.17F;
            this.Head.xRot = Mth.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F + 0.05F;

            this.Tail1.xRot = Mth.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.48F;
            // this.Tail2.xRot = Mth.cos(5.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.6F) * 0.5F - 0.31F;
            this.Tail1.zRot = Mth.cos(1.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
            // this.Tail2.zRot = Mth.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.6F) * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (entity.isSprinting()) {
                float speed = 1.0f;
                float degree = 0.5f;


            } else {
                float speed = 1.25f;
                float degree = 0.6f;
                this.Neck.xRot = Mth.cos(1.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 0.17F;
                this.Head.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.05F;

                //  this.Chest.y = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -1F) * 0.5F + 14.6F;
                //  this.Chest.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.1F) * 0.5F + 0.03F;
                this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F - 0.03F;
                this.Hips.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.23F;

                // this.ArmBaseLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.6F) * 0.5F + 0.09F;
                this.UpperArmLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.09F;
                // this.LowerArmLeft.xRot = Mth.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree) * 0.5F - 0.04F;
                this.HandLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;
                //this.ArmBaseRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.6F) * 0.5F + 0.09F;
                this.UpperArmRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.09F;
                //this.LowerArmRight.xRot = Mth.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1F) * 0.5F - 0.04F;
                this.HandRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;

                this.ThighLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.3F) * 0.5F;
                //  this.UpperLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.44F;
                //  this.LowerLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.35F;
                this.FootLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.14F;
                this.ThighRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.3F) * 0.5F;
                //  this.UpperLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.44F;
                //  this.LowerLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.35F;
                this.FootRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.14F;
            }
        }
    }

    public static class Child extends MarmosetModel {
        public ModelPart Neck;
        public ModelPart ArmBaseLeft;
        public ModelPart ArmBaseRight;
        public ModelPart Hips;
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
        public ModelPart Snout;
        public ModelPart Mouth;
        public ModelPart EarLeft;
        public ModelPart EarRight;
        public ModelPart ArmLeft;
        public ModelPart ForearmLeft;
        public ModelPart HandLeft;
        public ModelPart ArmRight;
        public ModelPart ForearmRight;
        public ModelPart HandRight;

        public Child(ModelPart root) {
            this.Body = root.getChild("Body");
            this.Neck = this.Body.getChild("Neck");
            this.Head = this.Neck.getChild("Head");
            this.Mouth = this.Head.getChild("Mouth");

            this.EarLeft = this.Head.getChild("EarLeft");

            this.Snout = this.Head.getChild("Snout");

            this.EarRight = this.Head.getChild("EarRight");

            this.Hips = this.Body.getChild("Hips");
            this.ThighRight = this.Hips.getChild("ThighRight");
            this.UpperLegRight = this.ThighRight.getChild("UpperLegRight");
            this.LowerLegRight = this.UpperLegRight.getChild("LowerLegRight");
            this.FootRight = this.LowerLegRight.getChild("FootRight");

            this.Tail = this.Hips.getChild("Tail");

            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.UpperLegLeft = this.ThighLeft.getChild("UpperLegLeft");
            this.LowerLegLeft = this.UpperLegLeft.getChild("LowerLegLeft");
            this.FootLeft = this.LowerLegLeft.getChild("FootLeft");

            this.ArmBaseLeft = this.Body.getChild("ArmBaseLeft");
            this.ArmLeft = this.ArmBaseLeft.getChild("ArmLeft");
            this.ForearmLeft = this.ArmLeft.getChild("ForearmLeft");
            this.HandLeft = this.ForearmLeft.getChild("HandLeft");

            this.ArmBaseRight = this.Body.getChild("ArmBaseRight");
            this.ArmRight = this.ArmBaseRight.getChild("ArmRight");
            this.ForearmRight = this.ArmRight.getChild("ForearmRight");
            this.HandRight = this.ForearmRight.getChild("HandRight");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(1, 20).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -1.5F, 0.1F, 0.20943951023931953F, 0.0F, 0.0F));
            PartDefinition Neck = Body.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(10, 7).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -0.6F, -1.0F, -0.16580627893946132F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(18, 3).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.7F, -2.0F, 0.40142572795869574F, 0.0F, 0.0F));
            PartDefinition Mouth = Head.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(6, 6).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F), PartPose.offset(0.0F, 0.4F, -0.9F));

            PartDefinition EarLeft = Head.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.2F, -0.5F, 2.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(1.0F, -1.0F, 0.7F, 0.0F, -0.3490658503988659F, 0.5235987755982988F));

            PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(12, 0).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -1.2F, -1.5F, 0.4363323129985824F, 0.0F, 0.0F));

            PartDefinition EarRight = Head.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(0, 0).mirror(true).addBox(-1.0F, -1.2F, -0.5F, 2.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-1.0F, -1.0F, 0.7F, 0.0F, 0.3490658503988659F, -0.5235987755982988F));

            PartDefinition Hips = Body.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(13, 16).addBox(-1.5F, 0.3F, 0.0F, 3.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -0.3F, 4.0F, -0.3490658503988659F, 0.0F, 0.0F));
            PartDefinition ThighRight = Hips.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(24, 26).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-1.2F, 1.5F, 1.1F, 0.2617993877991494F, 0.0F, 0.0F));
            PartDefinition UpperLegRight = ThighRight.addOrReplaceChild("UpperLegRight", CubeListBuilder.create().texOffs(30, 23).mirror(true).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-0.3F, 3.0F, -0.3F, 0.6981317007977318F, 0.0F, 0.0F));
            PartDefinition LowerLegRight = UpperLegRight.addOrReplaceChild("LowerLegRight", CubeListBuilder.create().texOffs(29, 19).mirror(true).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.01F, 1.8F, 1.0F, -0.6981317007977318F, 0.0F, 0.0F));
            PartDefinition FootRight = LowerLegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(29, 16).mirror(true).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F), PartPose.offset(0.01F, 1.3F, -0.7F));

            PartDefinition Tail = Hips.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(27, 10).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.7F, 1.5F, 0.4300491170387584F, 0.0F, 0.0F));

            PartDefinition ThighLeft = Hips.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(24, 26).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(1.2F, 1.5F, 1.1F, 0.2617993877991494F, 0.0F, 0.0F));
            PartDefinition UpperLegLeft = ThighLeft.addOrReplaceChild("UpperLegLeft", CubeListBuilder.create().texOffs(30, 23).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.3F, 3.0F, -0.3F, 0.6981317007977318F, 0.0F, 0.0F));
            PartDefinition LowerLegLeft = UpperLegLeft.addOrReplaceChild("LowerLegLeft", CubeListBuilder.create().texOffs(29, 19).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-0.01F, 1.8F, 1.0F, -0.6981317007977318F, 0.0F, 0.0F));
            PartDefinition FootLeft = LowerLegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(29, 16).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F), PartPose.offset(-0.01F, 1.3F, -0.7F));

            PartDefinition ArmBaseLeft = Body.addOrReplaceChild("ArmBaseLeft", CubeListBuilder.create().texOffs(18, 23).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(1.4F, 0.4F, 0.0F, 0.22689280275926282F, 0.0F, 0.0F));
            PartDefinition ArmLeft = ArmBaseLeft.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(24, 21).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-0.01F, 2.0F, 0.3F, -0.12217304763960307F, 0.0F, 0.0F));
            PartDefinition ForearmLeft = ArmLeft.addOrReplaceChild("ForearmLeft", CubeListBuilder.create().texOffs(24, 17).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-0.01F, 0.9F, -1.0F, 0.017453292519943295F, 0.0F, 0.0F));
            PartDefinition HandLeft = ForearmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(22, 14).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F), PartPose.offset(-0.01F, 1.5F, 0.3F));

            PartDefinition ArmBaseRight = Body.addOrReplaceChild("ArmBaseRight", CubeListBuilder.create().texOffs(18, 23).mirror(true).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-1.4F, 0.4F, 0.0F, 0.22689280275926282F, 0.0F, 0.0F));
            PartDefinition ArmRight = ArmBaseRight.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(24, 21).mirror(true).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.01F, 2.0F, 0.3F, -0.12217304763960307F, 0.0F, 0.0F));
            PartDefinition ForearmRight = ArmRight.addOrReplaceChild("ForearmRight", CubeListBuilder.create().texOffs(24, 17).mirror(true).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.01F, 0.9F, -1.0F, 0.017453292519943295F, 0.0F, 0.0F));
            PartDefinition HandRight = ForearmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(22, 14).mirror(true).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F), PartPose.offset(0.01F, 1.5F, 0.3F));

            return LayerDefinition.create(meshDefinition, 64, 32);
        }

        @Override
        public void setupAnim(MarmosetEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.4F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.17F;
            this.Head.xRot = Mth.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F + 0.4F;

            this.Tail.xRot = Mth.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.43F;
            this.Tail.zRot = Mth.cos(1.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.2f;
            float degree = 0.8f;
            this.Neck.xRot = Mth.cos(1.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.15F) * 0.5F - 0.17F;
            this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.4F;
            //  this.Chest.y = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 18.3F;
            //  this.Chest.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F - 0.12F;
            this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.21F;
            this.ArmBaseLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -0.9F) * 0.5F + 0.23F;
            this.ArmLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.12F;
            this.ForearmLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F + 0.017F;
            this.HandLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;
            this.ArmBaseRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.9F) * 0.5F + 0.23F;
            this.ArmRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.12F;
            this.ForearmRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F + 0.017F;
            this.HandRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;
            this.ThighLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.3F) * 0.5F + 0.26F;
            this.UpperLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.7F;
            this.LowerLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.7F;
            this.FootLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F;
            this.ThighRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.3F) * 0.5F + 0.26F;
            this.UpperLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.7F;
            this.LowerLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.7F;
            this.FootRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F;
        }
    }
}

