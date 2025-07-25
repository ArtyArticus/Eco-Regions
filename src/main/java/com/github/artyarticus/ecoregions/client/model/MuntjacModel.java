package com.github.artyarticus.ecoregions.client.model;

import com.github.artyarticus.ecoregions.entity.MuntjacEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class MuntjacModel extends ZawaBaseModel<MuntjacEntity> {
    public ModelRenderer Chest;
    protected Iterable<ModelRenderer> parts;

    @Override
    @MethodsReturnNonnullByDefault
    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Chest);
        }

        return this.parts;
    }

    public static class Adult extends com.github.artyarticus.ecoregions.client.model.MuntjacModel {

        public ModelRenderer Body;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer Neck;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer Hips;
        public ModelRenderer ThighLeft;
        public ModelRenderer Tail;
        public ModelRenderer ThighRight;
        public ModelRenderer UpperLegLeft;
        public ModelRenderer LegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer UpperLegRight;
        public ModelRenderer LegRight;
        public ModelRenderer FootRight;
        public ModelRenderer UpperArmLeft;
        public ModelRenderer ArmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer Head;
        public ModelRenderer Snout;
        public ModelRenderer Tuft;
        public ModelRenderer EarLeft;
        public ModelRenderer EarRight;
        public ModelRenderer Nose;
        public ModelRenderer Mouth;
        public ModelRenderer LeftHorn1;
        public ModelRenderer LeftHorn1_1;
        public ModelRenderer LeftHorn2;
        public ModelRenderer LeftHorn2_1;
        public ModelRenderer UpperArmRight;
        public ModelRenderer ArmRight;
        public ModelRenderer HandRight;

        public Adult() {
            this.texWidth = 64;
            this.texHeight = 64;
            this.FootLeft = new ModelRenderer(this, 4, 44);
            this.FootLeft.setPos(0.1F, 3.8F, -1.2F);
            this.FootLeft.addBox(-1.0F, -0.7F, -1.3F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 0.05235987755982988F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 11, 0);
            this.Body.setPos(0.0F, -3.6F, 1.0F);
            this.Body.addBox(-3.5F, 0.0F, 0.0F, 7.0F, 8.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.1563815016444822F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 20, 30);
            this.UpperLegLeft.setPos(0.0F, 5.8F, -1.5F);
            this.UpperLegLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.38467058311851676F, 0.0F, 0.0F);
            this.LeftHorn1 = new ModelRenderer(this, 30, 52);
            this.LeftHorn1.setPos(1.1F, 0.0F, -0.1F);
            this.LeftHorn1.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftHorn1, 0.30944686838911134F, 0.46914448828868976F, 0.0F);
            this.LeftHorn1_1 = new ModelRenderer(this, 30, 52);
            this.LeftHorn1_1.mirror = true;
            this.LeftHorn1_1.setPos(-1.1F, 0.0F, -0.1F);
            this.LeftHorn1_1.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftHorn1_1, 0.30944686838911134F, -0.46914448828868976F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 1, 21);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-1.8F, 0.7F, -0.3F);
            this.ArmBaseRight.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.25062927459427325F, 0.0F, 0.0F);
            this.LeftHorn2 = new ModelRenderer(this, 32, 48);
            this.LeftHorn2.setPos(0.0F, 0.01F, 1.2F);
            this.LeftHorn2.addBox(-2.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftHorn2, 0.0F, 0.6764895887782301F, 0.0F);
            this.UpperArmRight = new ModelRenderer(this, 3, 30);
            this.UpperArmRight.mirror = true;
            this.UpperArmRight.setPos(0.0F, 4.0F, 1.6F);
            this.UpperArmRight.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmRight, -0.06981317007977318F, 0.0F, 0.0F);
            this.LegLeft = new ModelRenderer(this, 21, 38);
            this.LegLeft.setPos(-0.1F, 4.0F, 2.5F);
            this.LegLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, -0.3141592653589793F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 23, 59);
            this.EarLeft.setPos(2.0F, -0.8F, 1.0F);
            this.EarLeft.addBox(-1.0F, -1.0F, -0.5F, 1.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.27366763203903305F, 0.8600982340775168F, 0.0F);
            this.LegRight = new ModelRenderer(this, 21, 38);
            this.LegRight.mirror = true;
            this.LegRight.setPos(0.1F, 4.0F, 2.5F);
            this.LegRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, -0.3141592653589793F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 0, 53);
            this.Neck.setPos(0.0F, -3.0F, -2.0F);
            this.Neck.addBox(-2.0F, 0.0F, -4.1F, 4.0F, 4.0F, 7.0F, -0.1F, 0.3F, 0.0F);
            this.setRotateAngle(Neck, -0.3560471607489405F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 4, 37);
            this.ArmLeft.setPos(-0.1F, 3.0F, -2.5F);
            this.ArmLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Nose = new ModelRenderer(this, 54, 45);
            this.Nose.setPos(0.0F, -0.5F, -1.4F);
            this.Nose.addBox(-1.0F, -0.6F, -0.3F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Nose, 0.23457224414434488F, 0.0F, 0.0F);
            this.Tuft = new ModelRenderer(this, 32, 59);
            this.Tuft.setPos(0.0F, -2.5F, 0.0F);
            this.Tuft.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tuft, 0.11728612207217244F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 4, 37);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(-0.1F, 3.0F, -2.5F);
            this.ArmRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 40, 51);
            this.Mouth.setPos(0.0F, 1.0F, 0.1F);
            this.Mouth.addBox(-1.0F, -0.5F, -2.0F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.11728612207217244F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 1, 21);
            this.ArmBaseLeft.setPos(1.8F, 0.7F, -0.3F);
            this.ArmBaseLeft.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.25062927459427325F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 17, 18);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-2.2F, 1.5F, 2.5F);
            this.ThighRight.addBox(-1.5F, 0.0F, -2.5F, 3.0F, 6.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.17313666312941803F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 40, 12);
            this.Hips.setPos(0.0F, 0.0F, 8.0F);
            this.Hips.addBox(-3.0F, 0.0F, 0.0F, 6.0F, 6.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.2738421523142173F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 42, 0);
            this.Chest.setPos(0.0F, 12.0F, -6.0F);
            this.Chest.addBox(-3.0F, -3.5F, -2.5F, 6.0F, 7.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.1563815016444822F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 48, 56);
            this.Head.setPos(0.0F, 2.4F, -4.1F);
            this.Head.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.2F, 0.2F, 0.2F);
            this.setRotateAngle(Head, 0.6550220469681831F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 4, 44);
            this.FootRight.mirror = true;
            this.FootRight.setPos(-0.1F, 3.8F, -1.2F);
            this.FootRight.addBox(-1.0F, -0.7F, -1.3F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, 0.05235987755982988F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 17, 18);
            this.ThighLeft.setPos(2.2F, 1.5F, 2.5F);
            this.ThighLeft.addBox(-1.5F, 0.0F, -2.5F, 3.0F, 6.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.17313666312941803F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 52, 50);
            this.Snout.setPos(0.0F, 0.7F, -2.5F);
            this.Snout.addBox(-1.5F, -1.0F, -2.0F, 3.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.19547687289441354F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 4, 44);
            this.HandRight.mirror = true;
            this.HandRight.setPos(-0.1F, 3.8F, 0.8F);
            this.HandRight.addBox(-1.0F, -0.7F, -1.3F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Tail = new ModelRenderer(this, 58, 25);
            this.Tail.setPos(0.0F, 0.3F, 4.0F);
            this.Tail.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail, 0.32009338747892113F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 20, 30);
            this.UpperLegRight.mirror = true;
            this.UpperLegRight.setPos(0.0F, 5.8F, -1.5F);
            this.UpperLegRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.38467058311851676F, 0.0F, 0.0F);
            this.LeftHorn2_1 = new ModelRenderer(this, 32, 48);
            this.LeftHorn2_1.mirror = true;
            this.LeftHorn2_1.setPos(0.0F, 0.01F, 1.2F);
            this.LeftHorn2_1.addBox(0.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftHorn2_1, 0.0F, -0.6764895887782301F, 0.0F);
            this.UpperArmLeft = new ModelRenderer(this, 3, 30);
            this.UpperArmLeft.setPos(0.0F, 4.0F, 1.6F);
            this.UpperArmLeft.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmLeft, -0.06981317007977318F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 23, 59);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-2.0F, -0.8F, 1.0F);
            this.EarRight.addBox(0.0F, -1.0F, -0.5F, 1.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.27366763203903305F, -0.8600982340775168F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 4, 44);
            this.HandLeft.setPos(0.1F, 3.8F, 0.8F);
            this.HandLeft.addBox(-1.0F, -0.7F, -1.3F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.LegLeft.addChild(this.FootLeft);
            this.Chest.addChild(this.Body);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.Tuft.addChild(this.LeftHorn1);
            this.Tuft.addChild(this.LeftHorn1_1);
            this.Chest.addChild(this.ArmBaseRight);
            this.LeftHorn1.addChild(this.LeftHorn2);
            this.ArmBaseRight.addChild(this.UpperArmRight);
            this.UpperLegLeft.addChild(this.LegLeft);
            this.Head.addChild(this.EarLeft);
            this.UpperLegRight.addChild(this.LegRight);
            this.Chest.addChild(this.Neck);
            this.UpperArmLeft.addChild(this.ArmLeft);
            this.Snout.addChild(this.Nose);
            this.Head.addChild(this.Tuft);
            this.UpperArmRight.addChild(this.ArmRight);
            this.Snout.addChild(this.Mouth);
            this.Chest.addChild(this.ArmBaseLeft);
            this.Hips.addChild(this.ThighRight);
            this.Body.addChild(this.Hips);
            this.Neck.addChild(this.Head);
            this.LegRight.addChild(this.FootRight);
            this.Hips.addChild(this.ThighLeft);
            this.Head.addChild(this.Snout);
            this.ArmRight.addChild(this.HandRight);
            this.Hips.addChild(this.Tail);
            this.ThighRight.addChild(this.UpperLegRight);
            this.LeftHorn1_1.addChild(this.LeftHorn2_1);
            this.ArmBaseLeft.addChild(this.UpperArmLeft);
            this.Head.addChild(this.EarRight);
            this.ArmLeft.addChild(this.HandLeft);
            this.saveBase();
        }
        @Override
        public void setupAnim(MuntjacEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.655F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.356F;
            this.Head.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F + 0.655F;
        }
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            }
            if (entity.isSprinting()) {
                float speed = 1.0f;
                float degree = 0.5f;
                this.Neck.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.356F;
                this.Head.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.655F;

                this.Chest.y = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -1F) * 0.5F + 12.0F;
                this.Chest.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.1F) * 0.5F - 0.156F;
                this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.156F;
                this.Hips.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.273F;

                this.ArmBaseLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.6F) * 0.5F + 0.25F;
                this.UpperArmLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.069F;
                this.ArmLeft.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree) * 0.5F;
                this.HandLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;
                this.ArmBaseRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.6F) * 0.5F + 0.25F;
                this.UpperArmRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.069F;
                this.ArmRight.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1F) * 0.5F;
                this.HandRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;

                this.ThighLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.3F) * 0.5F + 0.173F;
                this.UpperLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.384F;
                this.LegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.314F;
                this.FootLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.052F;
                this.ThighRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.3F) * 0.5F + 0.173F;
                this.UpperLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.384F;
                this.LegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.314F;
                this.FootRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.052F;

            } else {
                float speed = 0.8f;
                float degree = 0.6f;
                this.Neck.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.356F;
                this.Head.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.655F;

                this.Chest.y = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -1F) * 0.5F + 12.0F;
                this.Chest.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.1F) * 0.5F - 0.156F;
                this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.156F;
                this.Hips.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.273F;

                this.ArmBaseLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.6F) * 0.5F + 0.25F;
                this.UpperArmLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.069F;
                this.ArmLeft.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree) * 0.5F;
                this.HandLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;
                this.ArmBaseRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.6F) * 0.5F + 0.25F;
                this.UpperArmRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.069F;
                this.ArmRight.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1F) * 0.5F;
                this.HandRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;

                this.ThighLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.3F) * 0.5F + 0.173F;
                this.UpperLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.384F;
                this.LegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.314F;
                this.FootLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.052F;
                this.ThighRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.3F) * 0.5F + 0.173F;
                this.UpperLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.384F;
                this.LegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.314F;
                this.FootRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.052F;
            }
        }
    }

    public static class Child extends com.github.artyarticus.ecoregions.client.model.MuntjacModel {

        public ModelRenderer Body;
        public ModelRenderer Neck;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer Tail;
        public ModelRenderer UpperLegLeft;
        public ModelRenderer LowerLegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer UpperLegRight;
        public ModelRenderer LowerLegRight;
        public ModelRenderer FootRight;
        public ModelRenderer Head;
        public ModelRenderer EarLeft;
        public ModelRenderer EarRight;
        public ModelRenderer Snout;
        public ModelRenderer TopSnout;
        public ModelRenderer Mouth;
        public ModelRenderer UpperArmLeft;
        public ModelRenderer ArmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer UpperArmRight;
        public ModelRenderer ArmRight;
        public ModelRenderer HandRight;

        public Child() {
            this.texWidth = 32;
            this.texHeight = 32;
            this.ArmBaseRight = new ModelRenderer(this, 15, 22);
            this.ArmBaseRight.setPos(-1.1F, -0.5F, -1.0F);
            this.ArmBaseRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.3490658503988659F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 6, 30);
            this.FootLeft.mirror = true;
            this.FootLeft.setPos(-0.1F, 2.7F, -0.7F);
            this.FootLeft.addBox(-0.5F, 0.0F, -0.7F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 0.13962634015954636F, 0.0F, 0.0F);
            this.UpperArmRight = new ModelRenderer(this, 24, 23);
            this.UpperArmRight.setPos(0.0F, 2.8F, 0.5F);
            this.UpperArmRight.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmRight, -0.08726646259971647F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 13, 0);
            this.Chest.setPos(0.0F, 17.5F, -2.5F);
            this.Chest.addBox(-1.5F, -2.0F, -2.0F, 3.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.2275909337942703F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 26, 28);
            this.EarLeft.setPos(1.0F, 0.0F, 0.3F);
            this.EarLeft.addBox(-0.5F, -1.8F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.0F, -0.4098033003787853F, 0.7740534966278743F);
            this.FootRight = new ModelRenderer(this, 6, 30);
            this.FootRight.setPos(0.1F, 2.7F, -0.7F);
            this.FootRight.addBox(-0.5F, 0.0F, -0.7F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, 0.13962634015954636F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 15, 22);
            this.ArmBaseLeft.mirror = true;
            this.ArmBaseLeft.setPos(1.1F, -0.5F, -1.0F);
            this.ArmBaseLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.3490658503988659F, 0.0F, 0.0F);
            this.UpperArmLeft = new ModelRenderer(this, 24, 23);
            this.UpperArmLeft.mirror = true;
            this.UpperArmLeft.setPos(0.0F, 2.8F, 0.5F);
            this.UpperArmLeft.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmLeft, -0.08726646259971647F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 16, 27);
            this.ArmLeft.mirror = true;
            this.ArmLeft.setPos(-0.05F, 2.0F, -1.0F);
            this.ArmLeft.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 24, 5);
            this.Snout.setPos(0.0F, 0.0F, -0.6F);
            this.Snout.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.13962634015954636F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 0, 0);
            this.Neck.setPos(0.0F, -1.0F, -2.0F);
            this.Neck.addBox(-1.0F, -2.5F, -1.5F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, 0.9105382388075086F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 0, 27);
            this.UpperLegRight.setPos(0.0F, 2.5F, -1.2F);
            this.UpperLegRight.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.6632251157578453F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 0, 27);
            this.UpperLegLeft.mirror = true;
            this.UpperLegLeft.setPos(0.0F, 2.5F, -1.2F);
            this.UpperLegLeft.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.6632251157578453F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 24, 1);
            this.TopSnout.setPos(0.0F, -0.7F, -0.6F);
            this.TopSnout.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.4098033003787853F, 0.0F, 0.0F);
            this.Tail = new ModelRenderer(this, 9, 0);
            this.Tail.setPos(0.0F, 0.0F, 4.5F);
            this.Tail.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail, 0.45535640450848164F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 0, 21);
            this.ThighLeft.mirror = true;
            this.ThighLeft.setPos(1.4F, 0.5F, 3.5F);
            this.ThighLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, -0.05235987755982988F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 19, 9);
            this.Head.setPos(0.0F, -2.0F, -1.0F);
            this.Head.addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, -0.591841146688116F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 21, 29);
            this.HandRight.setPos(0.1F, 1.5F, 0.3F);
            this.HandRight.addBox(-0.5F, 0.0F, -0.7F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 16, 27);
            this.ArmRight.setPos(0.05F, 2.0F, -1.0F);
            this.ArmRight.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 0, 13);
            this.Mouth.setPos(0.0F, 0.4F, 0.1F);
            this.Mouth.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.04555309164612875F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 21, 29);
            this.HandLeft.mirror = true;
            this.HandLeft.setPos(-0.1F, 1.5F, 0.3F);
            this.HandLeft.addBox(-0.5F, 0.0F, -0.7F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 0, 21);
            this.ThighRight.setPos(-1.4F, 0.5F, 3.5F);
            this.ThighRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, -0.05235987755982988F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 10);
            this.Body.setPos(0.0F, -1.5F, 0.0F);
            this.Body.addBox(-2.0F, -0.5F, -1.0F, 4.0F, 4.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.2275909337942703F, 0.0F, 0.0F);
            this.LowerLegRight = new ModelRenderer(this, 10, 21);
            this.LowerLegRight.setPos(0.05F, 3.0F, 1.7F);
            this.LowerLegRight.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.767944870877505F, 0.0F, 0.0F);
            this.LowerLegLeft = new ModelRenderer(this, 10, 21);
            this.LowerLegLeft.mirror = true;
            this.LowerLegLeft.setPos(-0.05F, 3.0F, 1.7F);
            this.LowerLegLeft.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.767944870877505F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 26, 28);
            this.EarRight.setPos(-1.0F, 0.0F, 0.3F);
            this.EarRight.addBox(-0.5F, -1.8F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.0F, 0.4098033003787853F, -0.7740534966278743F);
            this.Chest.addChild(this.ArmBaseRight);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.ArmBaseRight.addChild(this.UpperArmRight);
            this.Head.addChild(this.EarLeft);
            this.LowerLegRight.addChild(this.FootRight);
            this.Chest.addChild(this.ArmBaseLeft);
            this.ArmBaseLeft.addChild(this.UpperArmLeft);
            this.UpperArmLeft.addChild(this.ArmLeft);
            this.Head.addChild(this.Snout);
            this.Chest.addChild(this.Neck);
            this.ThighRight.addChild(this.UpperLegRight);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.Snout.addChild(this.TopSnout);
            this.Body.addChild(this.Tail);
            this.Body.addChild(this.ThighLeft);
            this.Neck.addChild(this.Head);
            this.ArmRight.addChild(this.HandRight);
            this.UpperArmRight.addChild(this.ArmRight);
            this.Snout.addChild(this.Mouth);
            this.ArmLeft.addChild(this.HandLeft);
            this.Body.addChild(this.ThighRight);
            this.Chest.addChild(this.Body);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.Head.addChild(this.EarRight);
            this.saveBase();
        }
        @Override
        public void setupAnim(MuntjacEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) - 0.59F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 0.91F;
            this.Head.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F - 0.59F;

            this.Tail.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.46F;
            this.Tail.zRot = MathHelper.cos(1.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.2f;
            float degree = 0.8f;
            this.Neck.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.15F) * 0.5F + 0.91F;
            this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F - 0.59F;
            this.Chest.y = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 17.5F;
            this.Chest.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F - 0.23F;
            this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.23F;
            this.ArmBaseLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -0.9F) * 0.5F + 0.35F;
            this.ArmLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F + 0.0F;
            this.UpperArmLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.09F;
            this.HandLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F + 0.0F;
            this.ArmBaseRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.9F) * 0.5F + 0.35F;
            this.ArmRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F + 0.0F;
            this.UpperArmRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.09F;
            this.HandRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F + 0.0F;
            this.ThighLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.3F) * 0.5F - 0.05F;
            this.UpperLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.66F;
            this.LowerLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.77F;
            this.FootLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F;
            this.ThighRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.3F) * 0.5F - 0.05F;
            this.UpperLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.66F;
            this.LowerLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.77F;
            this.FootRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F;

        }
    }
}


