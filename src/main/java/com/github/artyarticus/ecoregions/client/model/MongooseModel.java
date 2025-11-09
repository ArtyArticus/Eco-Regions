package com.github.artyarticus.ecoregions.client.model;

import com.github.artyarticus.ecoregions.entity.MongooseEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class MongooseModel extends ZawaBaseModel<MongooseEntity> {
    public ModelPart Body;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Body);
        }

        return this.parts;
    }

    public static class Adult extends MongooseModel {
        public ModelPart Neck;
        public ModelPart Hips;
        public ModelPart UpperArmLeft;
        public ModelPart UpperArmRight;
        public ModelPart Head;
        public ModelPart EarRight;
        public ModelPart Snout;
        public ModelPart Mouth;
        public ModelPart EarLeft;
        public ModelPart Nose;
        public ModelPart Tail1;
        public ModelPart ThighLeft;
        public ModelPart ThighRight;
        public ModelPart Tail2;
        public ModelPart VontsiraTail2;
        public ModelPart Tail3;
        public ModelPart Tail4;
        public ModelPart VontsiraTail3;
        public ModelPart UpperLegLeft;
        public ModelPart LowerLegLeft;
        public ModelPart FootLeft;
        public ModelPart UpperLegRight;
        public ModelPart LowerLegRight;
        public ModelPart FootRight;
        public ModelPart LowerArmLeft;
        public ModelPart HandLeft;
        public ModelPart LowerArmRight;
        public ModelPart HandRight;

        public Adult(ModelPart root) {
            this.Body = root.getChild("Body");
            this.UpperArmLeft = this.Body.getChild("UpperArmLeft");
            this.LowerArmLeft = this.UpperArmLeft.getChild("LowerArmLeft");
            this.HandLeft = this.LowerArmLeft.getChild("HandLeft");

            this.Hips = this.Body.getChild("Hips");
            this.ThighRight = this.Hips.getChild("ThighRight");
            this.UpperLegRight = this.ThighRight.getChild("UpperLegRight");
            this.LowerLegRight = this.UpperLegRight.getChild("LowerLegRight");
            this.FootRight = this.LowerLegRight.getChild("FootRight");

            this.Tail1 = this.Hips.getChild("Tail1");
            this.VontsiraTail2 = this.Tail1.getChild("VontsiraTail2");
            this.VontsiraTail3 = this.VontsiraTail2.getChild("VontsiraTail3");

            this.Tail2 = this.Tail1.getChild("Tail2");
            this.Tail3 = this.Tail2.getChild("Tail3");
            this.Tail4 = this.Tail3.getChild("Tail4");

            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.UpperLegLeft = this.ThighLeft.getChild("UpperLegLeft");
            this.LowerLegLeft = this.UpperLegLeft.getChild("LowerLegLeft");
            this.FootLeft = this.LowerLegLeft.getChild("FootLeft");

            this.Neck = this.Body.getChild("Neck");
            this.Head = this.Neck.getChild("Head");
            this.Snout = this.Head.getChild("Snout");
            this.Nose = this.Snout.getChild("Nose");

            this.EarRight = this.Head.getChild("EarRight");

            this.Mouth = this.Head.getChild("Mouth");

            this.EarLeft = this.Head.getChild("EarLeft");

            this.UpperArmRight = this.Body.getChild("UpperArmRight");
            this.LowerArmRight = this.UpperArmRight.getChild("LowerArmRight");
            this.HandRight = this.LowerArmRight.getChild("HandRight");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 23).addBox(-2.0F, -1.5F, -2.5F, 4.0F, 4.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 18.2F, -3.0F, 0.03909537541112055F, 0.0F, 0.0F));
            PartDefinition UpperArmLeft = Body.addOrReplaceChild("UpperArmLeft", CubeListBuilder.create().texOffs(20, 9).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offset(1.2F, 1.5F, -0.9F));
            PartDefinition LowerArmLeft = UpperArmLeft.addOrReplaceChild("LowerArmLeft", CubeListBuilder.create().texOffs(21, 13).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-0.01F, 2.0F, 0.5F, -0.23457224414434488F, 0.0F, 0.0F));
            PartDefinition HandLeft = LowerArmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(20, 16).mirror(true).addBox(-1.0F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, 0.19547687289441354F, 0.0F, 0.0F));

            PartDefinition Hips = Body.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 15).addBox(-2.0F, -0.5F, -0.3F, 4.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.01F, -1.0F, 2.5F, -0.1563815016444822F, 0.0F, 0.0F));
            PartDefinition ThighRight = Hips.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(8, 0).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(-1.2F, 1.0F, 2.5F, 0.1563815016444822F, 0.0F, 0.0F));
            PartDefinition UpperLegRight = ThighRight.addOrReplaceChild("UpperLegRight", CubeListBuilder.create().texOffs(9, 6).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.01F, 3.0F, -1.0F, 0.5082398928281348F, 0.0F, 0.0F));
            PartDefinition LowerLegRight = UpperLegRight.addOrReplaceChild("LowerLegRight", CubeListBuilder.create().texOffs(10, 9).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.02F, 0.5F, 2.0F, -0.6646214111173737F, 0.0F, 0.0F));
            PartDefinition FootRight = LowerLegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(12, 13).addBox(-1.0F, -0.1F, -1.7F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-0.01F, 2.5F, 0.0F, 0.11728612207217244F, 0.0F, 0.0F));

            PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(50, 4).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 3.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 0.2F, 4.0F, -0.3909537457888271F, 0.0F, 0.0F));
            PartDefinition VontsiraTail2 = Tail1.addOrReplaceChild("VontsiraTail2", CubeListBuilder.create().texOffs(48, 11).addBox(-1.5F, -0.5F, 0.0F, 3.0F, 3.0F, 5.0F), PartPose.offsetAndRotation(-0.01F, 0.0F, 3.0F, 0.19547687289441354F, 0.0F, 0.0F));
            PartDefinition VontsiraTail3 = VontsiraTail2.addOrReplaceChild("VontsiraTail3", CubeListBuilder.create().texOffs(50, 19).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 3.0F, 4.0F), PartPose.offsetAndRotation(-0.01F, -0.1F, 4.8F, 0.23474678106428595F, 0.0F, 0.0F));

            PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(34, 12).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, 0.19547687289441354F, 0.0F, 0.0F));
            PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(32, 19).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -0.1F, 5.0F, 0.23474678106428595F, 0.0F, 0.0F));
            PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(23, 25).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 2.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 0.5F, 3.1F, 0.27366763203903305F, 0.0F, 0.0F));

            PartDefinition ThighLeft = Hips.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(8, 0).mirror(true).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(1.2F, 1.0F, 2.5F, 0.1563815016444822F, 0.0F, 0.0F));
            PartDefinition UpperLegLeft = ThighLeft.addOrReplaceChild("UpperLegLeft", CubeListBuilder.create().texOffs(9, 6).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-0.01F, 3.0F, -1.0F, 0.5082398928281348F, 0.0F, 0.0F));
            PartDefinition LowerLegLeft = UpperLegLeft.addOrReplaceChild("LowerLegLeft", CubeListBuilder.create().texOffs(10, 9).mirror(true).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(-0.02F, 0.5F, 2.0F, -0.6646214111173737F, 0.0F, 0.0F));
            PartDefinition FootLeft = LowerLegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(12, 13).mirror(true).addBox(-1.0F, -0.1F, -1.7F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.01F, 2.5F, 0.0F, 0.11728612207217244F, 0.0F, 0.0F));

            PartDefinition Neck = Body.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(19, 0).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 3.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -1.0F, -2.5F, -0.7428121536172364F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(32, 0).addBox(-1.5F, -1.5F, -2.0F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.65F, -1.5F, 0.8210028961170991F, 0.0F, 0.0F));
            PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(41, 0).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F), PartPose.offset(0.0F, 0.2F, -1.4F));
            PartDefinition Nose = Snout.addOrReplaceChild("Nose", CubeListBuilder.create().texOffs(43, 3).addBox(-0.5F, -0.9F, -2.2F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -0.2F, 0.0F, 0.35185837453889574F, 0.0F, 0.0F));

            PartDefinition EarRight = Head.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(30, 0).addBox(0.0F, -1.5F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-1.5F, -0.1F, 0.0F, 0.2340486500292785F, -0.9773843811168246F, 0.0F));

            PartDefinition Mouth = Head.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(49, 0).addBox(-0.5F, -0.5F, -1.9F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 1.0F, -1.4F, -0.03909537541112055F, 0.0F, 0.0F));

            PartDefinition EarLeft = Head.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(30, 0).mirror(true).addBox(-1.0F, -1.5F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(1.5F, -0.1F, 0.0F, 0.2340486500292785F, 0.9773843811168246F, 0.0F));

            PartDefinition UpperArmRight = Body.addOrReplaceChild("UpperArmRight", CubeListBuilder.create().texOffs(20, 9).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offset(-1.2F, 1.5F, -0.9F));
            PartDefinition LowerArmRight = UpperArmRight.addOrReplaceChild("LowerArmRight", CubeListBuilder.create().texOffs(21, 13).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.01F, 2.0F, 0.5F, -0.23457224414434488F, 0.0F, 0.0F));
            PartDefinition HandRight = LowerArmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(20, 16).addBox(-1.0F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, 0.19547687289441354F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 64, 32);
        }

        @Override
        public void setupAnim(MongooseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
            this.Head.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
        }

        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0F;
            float degree = 1.0F;
            this.Neck.xRot = Mth.cos(limbSwing * speed * 0.1F) * degree * 0.1F * limbSwingAmount - 0.742F;
            this.Head.xRot = Mth.cos(1.0F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount + 0.821F;
            this.Tail1.xRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount - 0.4F;
            this.Tail2.xRot = Mth.cos(1.0F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount + 0.195F;
            this.VontsiraTail2.xRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount + 0.195F;
            this.VontsiraTail3.xRot = Mth.cos(1.0F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount + 0.234F;
        }

        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.5F;
            float degree = 0.5F;
            if (entity.isSprinting()) {
                this.UpperArmRight.xRot = Mth.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * 5.0F * limbSwingAmount * 0.5F;
                this.LowerArmRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F - 0.234F;
                this.HandRight.xRot = Mth.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.195F;
                this.UpperArmLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 5.0F * limbSwingAmount * 0.5F;
                this.LowerArmLeft.xRot = Mth.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F + -0.234F;
                this.HandLeft.xRot = Mth.cos(7.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.195F;

                this.ThighLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 3.0F * limbSwingAmount * 0.5F + 0.156F;
                this.UpperLegLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.5F;
                this.ThighRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 3.0F * limbSwingAmount * 0.5F + 0.156F;
                this.UpperLegRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.5F;

                this.Hips.xRot = Mth.cos(6.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -0.6F * limbSwingAmount * 0.5F - 0.156F;
                this.Body.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 0.6F * limbSwingAmount * 0.5F + 0.039F;
                this.Neck.xRot = Mth.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -0.6F * limbSwingAmount * 0.5F - 0.742F;

                this.Tail1.xRot = Mth.cos(2.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F - 0.4F;
                this.Tail2.xRot = Mth.cos(6.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 3.0F * limbSwingAmount * 0.5F + 0.195F;
                this.VontsiraTail2.xRot = Mth.cos(2.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.195F;
                this.VontsiraTail3.xRot = Mth.cos(6.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 3.0F * limbSwingAmount * 0.5F + 0.234F;

                this.Body.y = Mth.cos(2.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 0.5F * limbSwingAmount * 0.5F + -0.02F + 18.2F;

            } else {
                this.UpperArmLeft.xRot = Mth.cos(1.5F + limbSwing * speed * 0.2F) * degree * 1.5F * limbSwingAmount + 0.0F;
                this.LowerArmLeft.xRot = Mth.cos(5.5F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount - 0.234F;
                this.HandLeft.xRot = Mth.cos(1.5F + limbSwing * speed * 0.2F) * degree * -1.5F * limbSwingAmount + 0.195F;
                this.UpperArmRight.xRot = Mth.cos(1.5F + limbSwing * speed * 0.2F) * degree * -1.5F * limbSwingAmount + 0.0F;
                this.LowerArmRight.xRot = Mth.cos(5.5F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount - 0.234F;
                this.HandRight.xRot = Mth.cos(1.5F + limbSwing * speed * 0.2F) * degree * 1.5F * limbSwingAmount + 0.195F;

                this.ThighLeft.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 1.5F * limbSwingAmount + 0.156F;
                this.UpperLegLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * degree * 1.5F * limbSwingAmount + 0.5F;
                this.FootLeft.xRot = Mth.cos(-5.0F + limbSwing * speed * 0.2F) * degree * 0.5F * limbSwingAmount + 0.117F;
                this.ThighRight.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * -1.5F * limbSwingAmount + 0.156F;
                this.UpperLegRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * degree * -1.5F * limbSwingAmount + 0.5F;
                this.FootRight.xRot = Mth.cos(-5.0F + limbSwing * speed * 0.2F) * degree * -0.5F * limbSwingAmount + 0.117F;

                this.Hips.xRot = Mth.cos(1.5F + limbSwing * speed * 0.4F) * degree * -0.2F * limbSwingAmount - 0.156F;
                this.Body.xRot = Mth.cos(1.5F + limbSwing * speed * 0.4F) * degree * 0.2F * limbSwingAmount + 0.039F;
                this.Neck.xRot = Mth.cos(limbSwing * speed * 0.4F) * degree * -0.1F * limbSwingAmount - 0.742F;
                this.Head.xRot = Mth.cos(4.0F + limbSwing * speed * 0.4F) * degree * -0.1F * limbSwingAmount + 0.821F;

                this.Tail2.xRot = Mth.cos(limbSwing * speed * 0.4F) * degree * -0.2F * limbSwingAmount + 0.195F;
                this.VontsiraTail2.xRot = Mth.cos(limbSwing * speed * 0.4F) * degree * -0.2F * limbSwingAmount + 0.195F;

                this.ThighLeft.y = Mth.cos(-2.5F + limbSwing * speed * 0.2F) * degree * 0.1F * limbSwingAmount + 1.0F;
                this.ThighRight.y = Mth.cos(-2.5F + limbSwing * speed * 0.2F) * degree * -0.1F * limbSwingAmount + 1.0F;
            }
        }
    }

    public static class Child extends MongooseModel {
        public ModelPart Neck;
        public ModelPart Hip;
        public ModelPart ArmBaseLeft;
        public ModelPart ArmBaseRight;
        public ModelPart Head;
        public ModelPart EarLeft;
        public ModelPart Snout;
        public ModelPart EarRight;
        public ModelPart Nose;
        public ModelPart Mouth;
        public ModelPart ThighLeft;
        public ModelPart Tail1;
        public ModelPart ThighRight;
        public ModelPart UpperLegLeft;
        public ModelPart LegLeft;
        public ModelPart FootLeft;
        public ModelPart Tail2;
        public ModelPart VontsiraTail2;
        public ModelPart Tail3;
        public ModelPart Tail4;
        public ModelPart VontsiraTail3;
        public ModelPart UpperLegRight;
        public ModelPart LegRight;
        public ModelPart FootRight;
        public ModelPart ArmLeft;
        public ModelPart HandLeft;
        public ModelPart ArmRight;
        public ModelPart HandRight;

        public Child(ModelPart root) {
            this.Body = root.getChild("Body");
            this.Hip = this.Body.getChild("Hip");
            this.ThighRight = this.Hip.getChild("ThighRight");
            this.UpperLegRight = this.ThighRight.getChild("UpperLegRight");
            this.LegRight = this.UpperLegRight.getChild("LegRight");
            this.FootRight = this.LegRight.getChild("FootRight");

            this.ThighLeft = this.Hip.getChild("ThighLeft");
            this.UpperLegLeft = this.ThighLeft.getChild("UpperLegLeft");
            this.LegLeft = this.UpperLegLeft.getChild("LegLeft");
            this.FootLeft = this.LegLeft.getChild("FootLeft");

            this.Tail1 = this.Hip.getChild("Tail1");
            this.Tail2 = this.Tail1.getChild("Tail2");
            this.Tail3 = this.Tail2.getChild("Tail3");
            this.Tail4 = this.Tail3.getChild("Tail4");

            this.VontsiraTail2 = this.Tail1.getChild("VontsiraTail2");
            this.VontsiraTail3 = this.VontsiraTail2.getChild("VontsiraTail3");

            this.Neck = this.Body.getChild("Neck");
            this.Head = this.Neck.getChild("Head");
            this.Snout = this.Head.getChild("Snout");
            this.Nose = this.Snout.getChild("Nose");

            this.Mouth = this.Snout.getChild("Mouth");

            this.EarLeft = this.Head.getChild("EarLeft");

            this.EarRight = this.Head.getChild("EarRight");

            this.ArmBaseRight = this.Body.getChild("ArmBaseRight");
            this.ArmRight = this.ArmBaseRight.getChild("ArmRight");
            this.HandRight = this.ArmRight.getChild("HandRight");

            this.ArmBaseLeft = this.Body.getChild("ArmBaseLeft");
            this.ArmLeft = this.ArmBaseLeft.getChild("ArmLeft");
            this.HandLeft = this.ArmLeft.getChild("HandLeft");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 5).addBox(-1.5F, -1.5F, -1.3F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 20.6F, 0.0F, 0.04555309164612875F, 0.0F, 0.0F));
            PartDefinition Hip = Body.addOrReplaceChild("Hip", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -0.5F, 0.3F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.1F, 0.0F, 0.3F)), PartPose.offsetAndRotation(0.0F, -1.0F, 1.6F, -0.1055924230746083F, 0.0F, 0.0F));
            PartDefinition ThighRight = Hip.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(0, 12).mirror(true).addBox(-1.0F, -0.3F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-0.8F, 1.1F, 1.4F, 0.03909537541112055F, 0.0F, 0.0F));
            PartDefinition UpperLegRight = ThighRight.addOrReplaceChild("UpperLegRight", CubeListBuilder.create().texOffs(6, 11).mirror(true).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 1.5F, -1.0F, 0.9897762028270176F, 0.0F, 0.0F));
            PartDefinition LegRight = UpperLegRight.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(8, 13).mirror(true).addBox(-0.5F, 0.0F, -0.7F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-0.01F, 0.9F, 1.0F, -1.0224139077762113F, 0.0F, 0.0F));
            PartDefinition FootRight = LegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(12, 14).mirror(true).addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F, -0.1F, 0.1F)), PartPose.offsetAndRotation(-0.01F, 1.7F, -0.5F, 0.19547687289441354F, 0.0F, 0.0F));

            PartDefinition ThighLeft = Hip.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(0, 12).addBox(-1.0F, -0.3F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.8F, 1.1F, 1.4F, 0.03909537541112055F, 0.0F, 0.0F));
            PartDefinition UpperLegLeft = ThighLeft.addOrReplaceChild("UpperLegLeft", CubeListBuilder.create().texOffs(6, 11).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 1.5F, -1.0F, 0.9897762028270176F, 0.0F, 0.0F));
            PartDefinition LegLeft = UpperLegLeft.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(8, 13).addBox(-0.5F, 0.0F, -0.7F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.01F, 0.9F, 1.0F, -1.0224139077762113F, 0.0F, 0.0F));
            PartDefinition FootLeft = LegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(12, 14).addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F, -0.1F, 0.1F)), PartPose.offsetAndRotation(-0.01F, 1.7F, -0.5F, 0.19547687289441354F, 0.0F, 0.0F));

            PartDefinition Tail1 = Hip.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(26, 0).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.1F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.25F, 2.5F, -0.7644541990577108F, 0.0F, 0.0F));
            PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(26, 4).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F, 0.2F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.19547687289441354F, 0.0F, 0.0F));
            PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(26, 4).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F, 0.1F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.23474678106428595F, 0.0F, 0.0F));
            PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(24, 8).addBox(-0.5F, -0.4F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 1.0F, 0.27366763203903305F, 0.0F, 0.0F));

            PartDefinition VontsiraTail2 = Tail1.addOrReplaceChild("VontsiraTail2", CubeListBuilder.create().texOffs(16, 12).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 1.2F, 0.19547687289441354F, 0.0F, 0.0F));
            PartDefinition VontsiraTail3 = VontsiraTail2.addOrReplaceChild("VontsiraTail3", CubeListBuilder.create().texOffs(24, 12).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.1F, 0.1F, 0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 1.8F, 0.23474678106428595F, 0.0F, 0.0F));

            PartDefinition Neck = Body.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(12, 5).addBox(-1.0F, -1.1F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F, -0.2F, 0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, -1.5F, -0.4143411604287122F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(10, 0).addBox(-1.5F, -1.5F, -1.3F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, 0.2F)), PartPose.offsetAndRotation(0.0F, 0.6F, -1.4F, 0.5602506632585689F, 0.0F, 0.0F));
            PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(9, 6).addBox(-1.0F, 0.0F, -1.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F, 0.0F, 0.2F)), PartPose.offsetAndRotation(0.0F, 0.2F, -0.5F, -0.07452555872726274F, 0.0F, 0.0F));
            PartDefinition Nose = Snout.addOrReplaceChild("Nose", CubeListBuilder.create().texOffs(19, 3).addBox(-0.5F, -0.9F, -2.2F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -0.2F, 0.1F, 0.35185837453889574F, 0.0F, 0.0F));

            PartDefinition Mouth = Snout.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(10, 6).addBox(-0.5F, -0.6F, -1.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.2F)), PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, -0.0373500478236019F, 0.0F, 0.0F));

            PartDefinition EarLeft = Head.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(20, 0).addBox(-0.5F, -1.0F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F, -0.2F, 0.0F)), PartPose.offsetAndRotation(1.1F, -0.3F, 0.3F, 0.1867502266344419F, 0.7470009065377676F, 0.1494001912944076F));

            PartDefinition EarRight = Head.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(20, 0).mirror(true).addBox(-0.5F, -1.0F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F, -0.2F, 0.0F)), PartPose.offsetAndRotation(-1.1F, -0.3F, 0.3F, 0.1867502266344419F, -0.7470009065377676F, -0.1494001912944076F));

            PartDefinition ArmBaseRight = Body.addOrReplaceChild("ArmBaseRight", CubeListBuilder.create().texOffs(10, 11).mirror(true).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-1.1F, 0.9F, -1.0F, 0.21781708265940905F, 0.0F, 0.0F));
            PartDefinition ArmRight = ArmBaseRight.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(8, 13).mirror(true).addBox(-0.5F, -0.2F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F, -0.2F, 0.0F)), PartPose.offsetAndRotation(0.02F, 1.0F, 0.5F, -0.47123889803846897F, 0.0F, 0.0F));
            PartDefinition HandRight = ArmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(12, 14).mirror(true).addBox(-0.5F, -0.6F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F, -0.1F, 0.0F)), PartPose.offsetAndRotation(0.0F, 1.5F, -0.5F, 0.3186971254089062F, 0.0F, 0.0F));

            PartDefinition ArmBaseLeft = Body.addOrReplaceChild("ArmBaseLeft", CubeListBuilder.create().texOffs(10, 11).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(1.1F, 0.9F, -1.0F, 0.21781708265940905F, 0.0F, 0.0F));
            PartDefinition ArmLeft = ArmBaseLeft.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(8, 13).addBox(-0.5F, -0.2F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F, -0.2F, 0.0F)), PartPose.offsetAndRotation(-0.02F, 1.0F, 0.5F, -0.47123889803846897F, 0.0F, 0.0F));
            PartDefinition HandLeft = ArmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(12, 14).addBox(-0.5F, -0.6F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F, -0.1F, 0.0F)), PartPose.offsetAndRotation(0.0F, 1.5F, -0.5F, 0.3186971254089062F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 32, 16);
        }

        @Override
        public void setupAnim(MongooseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
            this.Head.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
        }

        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0F;
            float degree = 1.0F;
            this.Neck.xRot = Mth.cos(limbSwing * speed * 0.1F) * degree * 0.1F * limbSwingAmount - 0.414F;
            this.Head.xRot = Mth.cos(1.0F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount + 0.56F;
            this.Tail1.xRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount - 0.764F;
            this.Tail2.xRot = Mth.cos(1.0F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount + 0.195F;
            this.VontsiraTail2.xRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount + 0.195F;
            this.VontsiraTail3.xRot = Mth.cos(1.0F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount + 0.234F;
        }

        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.5F;
            float degree = 0.5F;
            if (entity.isSprinting()) {
            } else {
                this.ArmBaseLeft.xRot = Mth.cos(1.5F + limbSwing * speed * 0.2F) * degree * 1.5F * limbSwingAmount + 0.217F;
                this.ArmLeft.xRot = Mth.cos(5.5F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount - 0.471F;
                this.HandLeft.xRot = Mth.cos(1.5F + limbSwing * speed * 0.2F) * degree * -1.5F * limbSwingAmount + 0.319F;
                this.ArmBaseRight.xRot = Mth.cos(1.5F + limbSwing * speed * 0.2F) * degree * -1.5F * limbSwingAmount + 0.217F;
                this.ArmRight.xRot = Mth.cos(5.5F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount - 0.471F;
                this.HandRight.xRot = Mth.cos(1.5F + limbSwing * speed * 0.2F) * degree * 1.5F * limbSwingAmount + 0.319F;

                this.ThighLeft.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 1.5F * limbSwingAmount + 0.039F;
                this.UpperLegLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * degree * 1.5F * limbSwingAmount + 0.989F;
                this.FootLeft.xRot = Mth.cos(-5.0F + limbSwing * speed * 0.2F) * degree * 0.5F * limbSwingAmount + 0.195F;
                this.ThighRight.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * -1.5F * limbSwingAmount + 0.039F;
                this.UpperLegRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * degree * -1.5F * limbSwingAmount + 0.989F;
                this.FootRight.xRot = Mth.cos(-5.0F + limbSwing * speed * 0.2F) * degree * -0.5F * limbSwingAmount + 0.195F;

                this.Hip.xRot = Mth.cos(1.5F + limbSwing * speed * 0.4F) * degree * -0.2F * limbSwingAmount - 0.105F;
                this.Body.xRot = Mth.cos(1.5F + limbSwing * speed * 0.4F) * degree * 0.2F * limbSwingAmount + 0.045F;
                this.Neck.xRot = Mth.cos(limbSwing * speed * 0.4F) * degree * -0.1F * limbSwingAmount - 0.414F;
                this.Head.xRot = Mth.cos(4.0F + limbSwing * speed * 0.4F) * degree * -0.1F * limbSwingAmount + 0.56F;

                this.Tail2.xRot = Mth.cos(limbSwing * speed * 0.4F) * degree * -0.2F * limbSwingAmount + 0.195F;
                this.VontsiraTail2.xRot = Mth.cos(limbSwing * speed * 0.4F) * degree * -0.2F * limbSwingAmount + 0.195F;

                this.ThighLeft.y = Mth.cos(-2.5F + limbSwing * speed * 0.2F) * degree * 0.1F * limbSwingAmount + 1.1F;
                this.ThighRight.y = Mth.cos(-2.5F + limbSwing * speed * 0.2F) * degree * -0.1F * limbSwingAmount + 1.1F;
            }
        }
    }
}
