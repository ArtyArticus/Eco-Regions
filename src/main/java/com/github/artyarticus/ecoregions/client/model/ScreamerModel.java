package com.github.artyarticus.ecoregions.client.model;

import com.github.artyarticus.ecoregions.entity.ScreamerEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class ScreamerModel extends ZawaBaseModel<ScreamerEntity> {
    public ModelPart Body;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Body);
        }

        return this.parts;
    }

    public static class Adult extends ScreamerModel {

        public ModelPart Neck1;
        public ModelPart Wing1Left;
        public ModelPart ThighLeft;
        public ModelPart TailBase;
        public ModelPart ThighRight;
        public ModelPart Wing1Right;
        public ModelPart Neck2;
        public ModelPart Head;
        public ModelPart Forehead;
        public ModelPart Beak;
        public ModelPart Crest1;
        public ModelPart BeakTip;
        public ModelPart BottomBeak;
        public ModelPart CrestRight;
        public ModelPart CrestLeft;
        public ModelPart Wing2Left;
        public ModelPart Leg1Left;
        public ModelPart Leg2Left;
        public ModelPart FootLeft;
        public ModelPart Toe1Left;
        public ModelPart Toe2Left;
        public ModelPart Toe3Left;
        public ModelPart TailMiddle;
        public ModelPart TailRight;
        public ModelPart TailLeft;
        public ModelPart Leg1Right;
        public ModelPart Leg2Right;
        public ModelPart FootRight;
        public ModelPart Toe1Right;
        public ModelPart Toe2Right;
        public ModelPart Toe3Right;
        public ModelPart Wing2Right;

        public Adult(ModelPart root) {
            this.Body = root.getChild("Body");
            this.TailBase = this.Body.getChild("TailBase");
            this.TailMiddle = this.TailBase.getChild("TailMiddle");
            this.TailLeft = this.TailMiddle.getChild("TailLeft");

            this.TailRight = this.TailMiddle.getChild("TailRight");

            this.ThighLeft = this.Body.getChild("ThighLeft");
            this.Leg1Left = this.ThighLeft.getChild("Leg1Left");
            this.Leg2Left = this.Leg1Left.getChild("Leg2Left");
            this.FootLeft = this.Leg2Left.getChild("FootLeft");
            this.Toe2Left = this.FootLeft.getChild("Toe2Left");

            this.Toe3Left = this.FootLeft.getChild("Toe3Left");

            this.Toe1Left = this.FootLeft.getChild("Toe1Left");

            this.Wing1Left = this.Body.getChild("Wing1Left");
            this.Wing2Left = this.Wing1Left.getChild("Wing2Left");

            this.Wing1Right = this.Body.getChild("Wing1Right");
            this.Wing2Right = this.Wing1Right.getChild("Wing2Right");

            this.Neck1 = this.Body.getChild("Neck1");
            this.Neck2 = this.Neck1.getChild("Neck2");
            this.Head = this.Neck2.getChild("Head");
            this.Crest1 = this.Head.getChild("Crest1");
            this.CrestRight = this.Crest1.getChild("CrestRight");

            this.CrestLeft = this.Crest1.getChild("CrestLeft");

            this.Forehead = this.Head.getChild("Forehead");

            this.Beak = this.Head.getChild("Beak");
            this.BeakTip = this.Beak.getChild("BeakTip");

            this.BottomBeak = this.Beak.getChild("BottomBeak");

            this.ThighRight = this.Body.getChild("ThighRight");
            this.Leg1Right = this.ThighRight.getChild("Leg1Right");
            this.Leg2Right = this.Leg1Right.getChild("Leg2Right");
            this.FootRight = this.Leg2Right.getChild("FootRight");
            this.Toe1Right = this.FootRight.getChild("Toe1Right");

            this.Toe2Right = this.FootRight.getChild("Toe2Right");

            this.Toe3Right = this.FootRight.getChild("Toe3Right");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -3.0F, -3.5F, 5.0F, 6.0F, 7.0F), PartPose.offsetAndRotation(0.0F, 15.2F, 0.0F, -0.1956514098143546F, 0.0F, 0.0F));
            PartDefinition TailBase = Body.addOrReplaceChild("TailBase", CubeListBuilder.create().texOffs(1, 22).addBox(-2.0F, 0.0F, -4.0F, 4.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -2.5F, 3.5F, 1.0948450317865597F, 0.0F, 0.0F));
            PartDefinition TailMiddle = TailBase.addOrReplaceChild("TailMiddle", CubeListBuilder.create().texOffs(1, 14).addBox(-1.0F, 0.0F, -0.9F, 2.0F, 6.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 2.0F, -0.25F, -0.35238198529871895F, 0.0F, 0.0F));
            PartDefinition TailLeft = TailMiddle.addOrReplaceChild("TailLeft", CubeListBuilder.create().texOffs(10, 14).addBox(-2.0F, -0.6F, -1.0F, 2.0F, 6.0F, 1.0F), PartPose.offsetAndRotation(1.7F, 0.2F, -0.15F, -0.04555309164612875F, 0.0911061832922575F, 0.04712389063608474F));

            PartDefinition TailRight = TailMiddle.addOrReplaceChild("TailRight", CubeListBuilder.create().texOffs(10, 14).mirror(true).addBox(0.0F, -0.6F, -1.0F, 2.0F, 6.0F, 1.0F), PartPose.offsetAndRotation(-1.7F, 0.2F, -0.15F, -0.04555309164612875F, -0.0911061832922575F, -0.04712389063608474F));

            PartDefinition ThighLeft = Body.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(56, 28).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(1.45F, 2.0F, 1.0F, 0.5077162820683115F, 0.0F, 0.04555309164612875F));
            PartDefinition Leg1Left = ThighLeft.addOrReplaceChild("Leg1Left", CubeListBuilder.create().texOffs(51, 27).mirror(true).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.1F, 1.5F, 0.0F, -0.23457224414434488F, 0.0F, 0.0F));
            PartDefinition Leg2Left = Leg1Left.addOrReplaceChild("Leg2Left", CubeListBuilder.create().texOffs(46, 25).mirror(true).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 3.4F, 0.4F, -0.13020156286456727F, 0.0F, -0.04555309164612875F));
            PartDefinition FootLeft = Leg2Left.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(38, 26).mirror(true).addBox(-0.5F, -1.0F, -3.5F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.01F, 2.0F, 0.0F, 0.1171115934746098F, 0.0F, 0.0F));
            PartDefinition Toe2Left = FootLeft.addOrReplaceChild("Toe2Left", CubeListBuilder.create().texOffs(38, 26).mirror(true).addBox(-0.5F, -1.0F, -3.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, -0.1F)), PartPose.offsetAndRotation(0.2F, 0.1F, 0.0F, 0.0F, 0.3122393925291412F, 0.0F));

            PartDefinition Toe3Left = FootLeft.addOrReplaceChild("Toe3Left", CubeListBuilder.create().texOffs(32, 27).mirror(true).addBox(-0.5F, -0.9F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.1F)), PartPose.offsetAndRotation(0.02F, 0.0F, -0.1F, -0.1171115934746098F, 0.0F, 0.0F));

            PartDefinition Toe1Left = FootLeft.addOrReplaceChild("Toe1Left", CubeListBuilder.create().texOffs(38, 26).mirror(true).addBox(-0.5F, -1.0F, -3.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, -0.1F)), PartPose.offsetAndRotation(-0.2F, 0.1F, 0.0F, 0.0F, -0.3122393925291412F, 0.0F));

            PartDefinition Wing1Left = Body.addOrReplaceChild("Wing1Left", CubeListBuilder.create().texOffs(48, 14).addBox(-1.0F, -0.5F, -1.1F, 2.0F, 5.0F, 6.0F), PartPose.offsetAndRotation(2.0F, -2.6F, -2.7F, 0.03909537541112055F, 0.03909537541112055F, 0.03909537541112055F));
            PartDefinition Wing2Left = Wing1Left.addOrReplaceChild("Wing2Left", CubeListBuilder.create().texOffs(35, 16).addBox(-0.5F, -0.9F, 0.0F, 1.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 0.7F, 4.5F, 0.03909537541112055F, -0.0781907508222411F, -0.03909537541112055F));

            PartDefinition Wing1Right = Body.addOrReplaceChild("Wing1Right", CubeListBuilder.create().texOffs(48, 14).mirror(true).addBox(-1.0F, -0.5F, -1.1F, 2.0F, 5.0F, 6.0F), PartPose.offsetAndRotation(-2.0F, -2.6F, -2.7F, 0.03909537541112055F, -0.03909537541112055F, -0.03909537541112055F));
            PartDefinition Wing2Right = Wing1Right.addOrReplaceChild("Wing2Right", CubeListBuilder.create().texOffs(35, 16).addBox(-0.5F, -0.9F, 0.0F, 1.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 0.7F, 4.5F, 0.03909537541112055F, -0.008377580222319268F, 0.03909537541112055F));

            PartDefinition Neck1 = Body.addOrReplaceChild("Neck1", CubeListBuilder.create().texOffs(24, 0).addBox(-2.0F, -3.3F, -2.5F, 4.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 1.5F, -3.8F, -0.6255260065779288F, 0.0F, 0.0F));
            PartDefinition Neck2 = Neck1.addOrReplaceChild("Neck2", CubeListBuilder.create().texOffs(27, 8).addBox(-1.0F, -6.5F, 0.0F, 2.0F, 7.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -2.3F, 0.5864306020384839F, 0.0F, 0.0F));
            PartDefinition Head = Neck2.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(46, 0).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -6.0F, 0.6F, 0.35185837453889574F, 0.0F, 0.0F));
            PartDefinition Crest1 = Head.addOrReplaceChild("Crest1", CubeListBuilder.create().texOffs(59, 0).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 0.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -0.8F, 1.0F, -0.31293754020890546F, 0.0F, 0.0F));
            PartDefinition CrestRight = Crest1.addOrReplaceChild("CrestRight", CubeListBuilder.create().texOffs(60, 0).mirror(true).addBox(-1.0F, -0.5F, 0.3F, 1.0F, 0.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.1F, 0.0F, -0.1563815016444822F, -0.1563815016444822F, 0.0F));

            PartDefinition CrestLeft = Crest1.addOrReplaceChild("CrestLeft", CubeListBuilder.create().texOffs(60, 0).addBox(0.0F, -0.5F, 0.3F, 1.0F, 0.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.1F, 0.0F, -0.1563815016444822F, 0.1563815016444822F, 0.0F));

            PartDefinition Forehead = Head.addOrReplaceChild("Forehead", CubeListBuilder.create().texOffs(48, 2).addBox(-1.5F, -0.5F, -1.0F, 3.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.01F, -0.99F, -1.0F, 0.001745329278001762F, 0.0F, 0.0F));

            PartDefinition Beak = Head.addOrReplaceChild("Beak", CubeListBuilder.create().texOffs(56, 4).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -1.5F, 0.3127630032889644F, 0.0F, 0.0F));
            PartDefinition BeakTip = Beak.addOrReplaceChild("BeakTip", CubeListBuilder.create().texOffs(58, 8).addBox(-0.5F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.01F, -0.2F, -1.1F, -0.46931902520863084F, 0.0F, 0.0F));

            PartDefinition BottomBeak = Beak.addOrReplaceChild("BottomBeak", CubeListBuilder.create().texOffs(50, 7).addBox(-0.5F, -0.4F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.01F, 1.0F, 1.0F, -0.46914448828868976F, 0.0F, 0.0F));

            PartDefinition ThighRight = Body.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(56, 28).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-1.45F, 2.0F, 1.0F, 0.5077162820683115F, 0.0F, -0.04555309164612875F));
            PartDefinition Leg1Right = ThighRight.addOrReplaceChild("Leg1Right", CubeListBuilder.create().texOffs(51, 27).mirror(true).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(-0.1F, 1.5F, 0.0F, -0.23457224414434488F, 0.0F, 0.0F));
            PartDefinition Leg2Right = Leg1Right.addOrReplaceChild("Leg2Right", CubeListBuilder.create().texOffs(46, 25).mirror(true).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 3.4F, 0.4F, -0.13020156286456727F, 0.0F, 0.04555309164612875F));
            PartDefinition FootRight = Leg2Right.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(38, 26).mirror(true).addBox(-0.5F, -1.0F, -3.5F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(-0.01F, 1.9F, 0.0F, 0.1171115934746098F, 0.0F, 0.0F));
            PartDefinition Toe1Right = FootRight.addOrReplaceChild("Toe1Right", CubeListBuilder.create().texOffs(38, 26).mirror(true).addBox(-0.5F, -1.0F, -3.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, -0.1F)), PartPose.offsetAndRotation(-0.2F, 0.1F, 0.0F, 0.0F, -0.3122393925291412F, 0.0F));

            PartDefinition Toe2Right = FootRight.addOrReplaceChild("Toe2Right", CubeListBuilder.create().texOffs(38, 26).mirror(true).addBox(-0.5F, -1.0F, -3.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, -0.1F)), PartPose.offsetAndRotation(0.2F, 0.1F, 0.0F, 0.0F, 0.3122393925291412F, 0.0F));

            PartDefinition Toe3Right = FootRight.addOrReplaceChild("Toe3Right", CubeListBuilder.create().texOffs(32, 27).mirror(true).addBox(-0.5F, -0.9F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.1F)), PartPose.offsetAndRotation(-0.02F, 0.0F, -0.1F, -0.1171115934746098F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 64, 32);
        }

        @Override
        public void setupAnim(ScreamerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck2.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.351F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck1.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.1F) * 0.5F - 0.625F;
            this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.351F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            }

            if (entity.isSprinting()) {
                float speed = 1.0f;
                float degree = 1.0f;
                this.Body.y = Mth.cos(6F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4F) * 0.5F + 15.2F;
                this.Body.xRot = Mth.cos(9.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -1F) * 0.5F - 0.195F;
                this.TailBase.xRot = Mth.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.8F) * 0.5F + 1.094F;
                this.Neck1.xRot = Mth.cos(7.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.6F) * 0.5F - 0.625F;
                this.Head.xRot = Mth.cos(1F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.6F) * 0.5F + 0.351F;

                this.ThighLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * 5F) * 0.5F + 0.507F;
                this.Leg1Left.xRot = Mth.cos(0.5F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * 3F) * 0.5F - 0.234F;
                this.FootLeft.xRot = Mth.cos(5.5F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.117F;
                this.ThighRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * -5F) * 0.5F + 0.507F;
                this.Leg1Right.xRot = Mth.cos(0.5F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * -3F) * 0.5F - 0.234F;
                this.FootRight.xRot = Mth.cos(5.5F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.117F;


            } else {
                float speed = 1.0f;
                float degree = 1.0f;
                this.Body.y = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 15.2F;
                this.Body.xRot = Mth.cos(1.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.2F) * 0.5F - 0.195F;
                this.TailBase.xRot = Mth.cos(1.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 1.094F;
                this.Neck1.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.3F) * 0.5F - 0.625F;
                this.Head.xRot = Mth.cos(2.2F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.27F) * 0.5F + 0.351F;

                this.ThighLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.507F;
                this.Leg1Left.xRot = Mth.cos(0.5F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F - 0.234F;
                this.FootLeft.xRot = Mth.cos(5.5F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.117F;
                this.ThighRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.507F;
                this.Leg1Right.xRot = Mth.cos(0.5F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F - 0.234F;
                this.FootRight.xRot = Mth.cos(5.5F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.117F;
            }
        }
    }

    public static class Child extends ScreamerModel {

        public ModelPart Neck;
        public ModelPart WingLeft;
        public ModelPart Tail;
        public ModelPart ThighLeft;
        public ModelPart ThighRight;
        public ModelPart WingRight;
        public ModelPart Head;
        public ModelPart Beak;
        public ModelPart BeakTip;
        public ModelPart BottomBeak;
        public ModelPart Leg1Left;
        public ModelPart Leg2Left;
        public ModelPart FootLeft;
        public ModelPart Toe1Left;
        public ModelPart Toe2Left;
        public ModelPart Leg1Right;
        public ModelPart Leg2Right;
        public ModelPart FootRight;
        public ModelPart Toe1Right;
        public ModelPart Toe2Right;

        public Child(ModelPart root) {
            this.Body = root.getChild("Body");
            this.Tail = this.Body.getChild("Tail");

            this.WingLeft = this.Body.getChild("WingLeft");

            this.ThighRight = this.Body.getChild("ThighRight");
            this.Leg1Right = this.ThighRight.getChild("Leg1Right");
            this.Leg2Right = this.Leg1Right.getChild("Leg2Right");
            this.FootRight = this.Leg2Right.getChild("FootRight");
            this.Toe1Right = this.FootRight.getChild("Toe1Right");

            this.Toe2Right = this.FootRight.getChild("Toe2Right");

            this.Neck = this.Body.getChild("Neck");
            this.Head = this.Neck.getChild("Head");
            this.Beak = this.Head.getChild("Beak");
            this.BottomBeak = this.Beak.getChild("BottomBeak");

            this.BeakTip = this.Beak.getChild("BeakTip");

            this.WingRight = this.Body.getChild("WingRight");

            this.ThighLeft = this.Body.getChild("ThighLeft");
            this.Leg1Left = this.ThighLeft.getChild("Leg1Left");
            this.Leg2Left = this.Leg1Left.getChild("Leg2Left");
            this.FootLeft = this.Leg2Left.getChild("FootLeft");
            this.Toe1Left = this.FootLeft.getChild("Toe1Left");

            this.Toe2Left = this.FootLeft.getChild("Toe2Left");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -2.0F, -2.5F, 4.0F, 4.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 18.9F, 0.0F, -0.19547687289441354F, 0.0F, 0.0F));
            PartDefinition Tail = Body.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(0, 9).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -2.0F, 2.5F, -0.5869542460878207F, 0.0F, 0.0F));

            PartDefinition WingLeft = Body.addOrReplaceChild("WingLeft", CubeListBuilder.create().texOffs(13, 0).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(2.0F, -0.5F, -2.0F, -0.03909537541112055F, -0.0781907508222411F, 0.1563815016444822F));

            PartDefinition ThighRight = Body.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(20, 8).mirror(true).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-1.1F, 0.4F, 0.4F, 0.4686209108183802F, 0.0F, 0.04555309164612875F));
            PartDefinition Leg1Right = ThighRight.addOrReplaceChild("Leg1Right", CubeListBuilder.create().texOffs(28, 9).mirror(true).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, -0.23457224414434488F, 0.0F, 0.0F));
            PartDefinition Leg2Right = Leg1Right.addOrReplaceChild("Leg2Right", CubeListBuilder.create().texOffs(28, 12).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 2.0F, 0.5F, -0.13020156286456727F, 0.0F, -0.04555309164612875F));
            PartDefinition FootRight = Leg2Right.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(20, 12).mirror(true).addBox(-0.5F, -0.5F, -2.3F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, 0.1171115934746098F, 0.0F, 0.0F));
            PartDefinition Toe1Right = FootRight.addOrReplaceChild("Toe1Right", CubeListBuilder.create().texOffs(21, 13).mirror(true).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.1F)), PartPose.offsetAndRotation(0.0F, 0.1F, -0.1F, 0.0F, -0.3513347637790725F, 0.0F));

            PartDefinition Toe2Right = FootRight.addOrReplaceChild("Toe2Right", CubeListBuilder.create().texOffs(21, 13).mirror(true).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.1F)), PartPose.offsetAndRotation(0.0F, 0.1F, 0.0F, 0.0F, 0.3513347637790725F, 0.0F));

            PartDefinition Neck = Body.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 14).addBox(-1.0F, -2.5F, -1.5F, 2.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -0.5F, -2.3F, -0.27366763203903305F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(20, 0).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -2.6F, -1.5F, 0.7429866572476639F, 0.0F, 0.0F));
            PartDefinition Beak = Head.addOrReplaceChild("Beak", CubeListBuilder.create().texOffs(26, 24).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -1.1F, 0.3127630032889644F, 0.0F, 0.0F));
            PartDefinition BottomBeak = Beak.addOrReplaceChild("BottomBeak", CubeListBuilder.create().texOffs(20, 27).addBox(-0.5F, -0.4F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.01F, 1.0F, 1.0F, -0.46914448828868976F, 0.0F, 0.0F));

            PartDefinition BeakTip = Beak.addOrReplaceChild("BeakTip", CubeListBuilder.create().texOffs(28, 28).addBox(-0.5F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.01F, -0.2F, -1.1F, -0.46931902520863084F, 0.0F, 0.0F));

            PartDefinition WingRight = Body.addOrReplaceChild("WingRight", CubeListBuilder.create().texOffs(13, 0).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-2.0F, -0.5F, -2.0F, -0.03909537541112055F, 0.0781907508222411F, -0.1563815016444822F));

            PartDefinition ThighLeft = Body.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(20, 8).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F, 0.0F, 0.0F)), PartPose.offsetAndRotation(1.1F, 0.4F, 0.4F, 0.4686209108183802F, 0.0F, -0.04555309164612875F));
            PartDefinition Leg1Left = ThighLeft.addOrReplaceChild("Leg1Left", CubeListBuilder.create().texOffs(28, 9).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, -0.23457224414434488F, 0.0F, 0.0F));
            PartDefinition Leg2Left = Leg1Left.addOrReplaceChild("Leg2Left", CubeListBuilder.create().texOffs(28, 12).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 2.0F, 0.5F, -0.13020156286456727F, 0.0F, 0.04555309164612875F));
            PartDefinition FootLeft = Leg2Left.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(20, 12).addBox(-0.5F, -0.5F, -2.3F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, 0.1171115934746098F, 0.0F, 0.0F));
            PartDefinition Toe1Left = FootLeft.addOrReplaceChild("Toe1Left", CubeListBuilder.create().texOffs(21, 13).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.1F)), PartPose.offsetAndRotation(0.0F, 0.1F, -0.1F, 0.0F, -0.3513347637790725F, 0.0F));

            PartDefinition Toe2Left = FootLeft.addOrReplaceChild("Toe2Left", CubeListBuilder.create().texOffs(21, 13).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.1F)), PartPose.offsetAndRotation(0.0F, 0.1F, 0.0F, 0.0F, 0.3513347637790725F, 0.0F));

            return LayerDefinition.create(meshDefinition, 32, 32);
        }

        @Override
        public void setupAnim(ScreamerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.742F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.273F;
            this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.742F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.2f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.4F) * 0.5F - 0.273F;
            this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.3F) * 0.5F + 0.742F;
            this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.195F;
            this.Body.y = Mth.cos(4.5F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree) * 0.5F + 18.9F;

            this.ThighLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.468F;
            this.ThighLeft.y = Mth.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.4F;
            this.Leg1Left.xRot = Mth.cos(0.5F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 3F) * 0.5F - 0.234F;
            this.FootLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.117F;
            this.ThighRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.468F;
            this.ThighRight.y = Mth.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.4F;
            this.Leg1Right.xRot = Mth.cos(0.5F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -3F) * 0.5F - 0.234F;
            this.FootRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.117F;
        }
    }
}