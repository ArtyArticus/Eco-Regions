package com.github.artyarticus.ecoregions.client.model;

import com.github.artyarticus.ecoregions.entity.WhiteRhinocerosEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class WhiteRhinocerosModel extends ZawaBaseModel<WhiteRhinocerosEntity> {
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

    public static class Adult extends WhiteRhinocerosModel {

        public ModelRenderer Body;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer Neck;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer Hips;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer Tail;
        public ModelRenderer UpperLegLeft;
        public ModelRenderer LegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer UpperLegRight;
        public ModelRenderer LegRight;
        public ModelRenderer FootRight;
        public ModelRenderer ArmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer HandLeft_1;
        public ModelRenderer Head;
        public ModelRenderer NeckBottom;
        public ModelRenderer SnoutBack;
        public ModelRenderer Forehead;
        public ModelRenderer Nose;
        public ModelRenderer Mouth;
        public ModelRenderer HornBack;
        public ModelRenderer SnoutFront;
        public ModelRenderer HornBottom;
        public ModelRenderer HornMiddle;
        public ModelRenderer Horn1;
        public ModelRenderer Horn2;
        public ModelRenderer HornTopBack;
        public ModelRenderer EarLeft;
        public ModelRenderer EarRight;
        public ModelRenderer ArmRight;
        public ModelRenderer HandRight;
        public ModelRenderer FootRight_1;

        public Adult() {
            this.texWidth = 128;
            this.texHeight = 128;
            this.HornMiddle = new ModelRenderer(this, 55, 121);
            this.HornMiddle.setPos(0.0F, -1.2F, 1.0F);
            this.HornMiddle.addBox(-1.5F, -2.0F, -3.0F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HornMiddle, -0.3707079291288539F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 72, 95);
            this.HandLeft.setPos(0.0F, 4.0F, -2.0F);
            this.HandLeft.addBox(-2.0F, -0.5F, 0.0F, 4.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, -0.08726646259971647F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 104, 115);
            this.UpperLegRight.mirror = true;
            this.UpperLegRight.setPos(0.5F, 9.0F, -4.0F);
            this.UpperLegRight.addBox(-3.0F, 0.0F, 0.0F, 5.0F, 7.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.6108652381980153F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 68, 105);
            this.ThighLeft.setPos(5.1F, 7.5F, 7.5F);
            this.ThighLeft.addBox(-4.0F, -4.0F, -5.0F, 8.0F, 13.0F, 10.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.09634217437719185F, 0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 88, 72);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-6.3F, 2.0F, -1.0F);
            this.ArmBaseRight.addBox(-1.5F, 0.0F, -3.5F, 7.0F, 9.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.2485348814892509F, 0.0F, 0.0F);
            this.Tail = new ModelRenderer(this, 74, 23);
            this.Tail.setPos(0.0F, 0.8F, 12.0F);
            this.Tail.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 10.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail, 0.21362829644936432F, -0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 72, 95);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.0F, 4.0F, -2.0F);
            this.HandRight.addBox(-2.0F, -0.5F, 0.0F, 4.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, -0.08726646259971647F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 64);
            this.Hips.setPos(0.0F, -1.0F, 12.5F);
            this.Hips.addBox(-8.0F, 0.0F, 0.0F, 16.0F, 16.0F, 12.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.19547687289441354F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 30, 110);
            this.Mouth.setPos(0.0F, 8.5F, -4.0F);
            this.Mouth.addBox(-3.0F, -1.5F, -4.0F, 6.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.1563815016444822F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 86, 88);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(2.0F, 8.5F, 0.0F);
            this.ArmRight.addBox(-2.5F, -0.5F, -2.5F, 5.0F, 5.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.08726646259971647F, -0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 0);
            this.Body.setPos(0.0F, -6.5F, 3.5F);
            this.Body.addBox(-9.0F, -1.5F, -4.0F, 18.0F, 18.0F, 17.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.19582594673429568F, 0.0F, 0.0F);
            this.LegLeft = new ModelRenderer(this, 108, 104);
            this.LegLeft.setPos(-0.5F, 6.9F, 5.0F);
            this.LegLeft.addBox(-2.0F, 0.0F, -4.0F, 4.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, -0.6108652381980153F, -0.0F, 0.0F);
            this.HornTopBack = new ModelRenderer(this, 60, 113);
            this.HornTopBack.setPos(0.0F, -4.0F, 0.5F);
            this.HornTopBack.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HornTopBack, 0.7853981633974483F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 106, 96);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.0F, 5.0F, -2.0F);
            this.FootRight.addBox(-2.5F, 0.0F, -2.5F, 5.0F, 2.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, 0.0781907508222411F, 0.0F, 0.0F);
            this.HornBack = new ModelRenderer(this, 50, 112);
            this.HornBack.setPos(0.0F, 3.0F, -1.5F);
            this.HornBack.addBox(-1.0F, -4.0F, -1.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HornBack, 0.28274335213888685F, -0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 104, 115);
            this.UpperLegLeft.setPos(0.5F, 9.0F, -4.0F);
            this.UpperLegLeft.addBox(-3.0F, 0.0F, 0.0F, 5.0F, 7.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.6108652381980153F, 0.0F, 0.0F);
            this.SnoutFront = new ModelRenderer(this, 0, 118);
            this.SnoutFront.setPos(0.0F, 0.3F, -5.0F);
            this.SnoutFront.addBox(-4.0F, -1.0F, -0.9F, 8.0F, 6.0F, 4.0F, 0.1F, 0.0F, 0.0F);
            this.setRotateAngle(SnoutFront, -0.4300491170387584F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 50, 120);
            this.EarRight.setPos(-4.0F, 1.0F, 4.1F);
            this.EarRight.addBox(-1.3F, -3.0F, -0.5F, 2.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, -0.443488160268598F, 0.0F, -0.39112828270876815F);
            this.ArmLeft = new ModelRenderer(this, 86, 88);
            this.ArmLeft.setPos(-2.0F, 8.5F, 0.0F);
            this.ArmLeft.addBox(-2.5F, -0.5F, -2.5F, 5.0F, 5.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.08726646259971647F, -0.0F, 0.0F);
            this.SnoutBack = new ModelRenderer(this, 0, 103);
            this.SnoutBack.setPos(0.0F, 0.0F, -5.0F);
            this.SnoutBack.addBox(-4.0F, 0.0F, -4.0F, 8.0F, 9.0F, 6.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(SnoutBack, -0.35185837453889574F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 51, 53);
            this.Neck.setPos(0.0F, -7.6F, -5.0F);
            this.Neck.addBox(-5.0F, -0.8F, -10.1F, 10.0F, 11.0F, 11.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, 0.5864306020384839F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 106, 96);
            this.FootLeft.setPos(0.0F, 5.0F, -2.0F);
            this.FootLeft.addBox(-2.5F, 0.0F, -2.5F, 5.0F, 2.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 0.0781907508222411F, 0.0F, 0.0F);
            this.FootRight_1 = new ModelRenderer(this, 106, 96);
            this.FootRight_1.mirror = true;
            this.FootRight_1.setPos(0.0F, 4.0F, 2.0F);
            this.FootRight_1.addBox(-2.5F, 0.0F, -2.8F, 5.0F, 2.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight_1, 0.10890854132970453F, 0.0F, 0.0F);
            this.NeckBottom = new ModelRenderer(this, 53, 38);
            this.NeckBottom.setPos(0.0F, 15.0F, -4.0F);
            this.NeckBottom.addBox(-4.0F, -3.5F, -9.5F, 8.0F, 5.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckBottom, -0.6255260065779288F, 0.0F, 0.0F);
            this.HornBottom = new ModelRenderer(this, 0, 94);
            this.HornBottom.setPos(0.0F, -1.1F, -2.5F);
            this.HornBottom.addBox(-2.0F, -1.5F, -2.5F, 4.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HornBottom, 0.20891591612425317F, 0.0F, 0.0F);
            this.Horn1 = new ModelRenderer(this, 17, 95);
            this.Horn1.setPos(0.0F, -2.0F, -2.0F);
            this.Horn1.addBox(-1.0F, -3.9F, -0.5F, 2.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn1, -0.39165189346859136F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 35);
            this.Chest.setPos(0.0F, 4.0F, -3.1F);
            this.Chest.addBox(-7.5F, -9.0F, -5.0F, 15.0F, 19.0F, 10.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.19547687289441354F, 0.0F, 0.0F);
            this.Forehead = new ModelRenderer(this, 57, 80);
            this.Forehead.setPos(0.0F, -0.5F, -5.0F);
            this.Forehead.addBox(-4.0F, 0.0F, 0.0F, 8.0F, 3.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Forehead, 0.23457224414434488F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 88, 72);
            this.ArmBaseLeft.setPos(6.3F, 2.0F, -1.0F);
            this.ArmBaseLeft.addBox(-5.5F, 0.0F, -3.5F, 7.0F, 9.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.2485348814892509F, 0.0F, 0.0F);
            this.Nose = new ModelRenderer(this, 24, 117);
            this.Nose.setPos(0.0F, 0.5F, -3.0F);
            this.Nose.addBox(-3.5F, -0.5F, -5.0F, 7.0F, 6.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Nose, 0.4300491170387584F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 50, 120);
            this.EarLeft.mirror = true;
            this.EarLeft.setPos(4.0F, 1.0F, 4.1F);
            this.EarLeft.addBox(-0.7F, -3.0F, -0.5F, 2.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, -0.443488160268598F, 0.0F, 0.39112828270876815F);
            this.ThighRight = new ModelRenderer(this, 68, 105);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-5.1F, 7.5F, 7.5F);
            this.ThighRight.addBox(-4.0F, -4.0F, -5.0F, 8.0F, 13.0F, 10.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.09634217437719185F, 0.0F, 0.0F);
            this.HandLeft_1 = new ModelRenderer(this, 106, 96);
            this.HandLeft_1.setPos(0.0F, 4.0F, 2.1F);
            this.HandLeft_1.addBox(-2.5F, 0.0F, -2.8F, 5.0F, 2.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft_1, 0.10890854132970453F, 0.0F, 0.0F);
            this.LegRight = new ModelRenderer(this, 108, 104);
            this.LegRight.mirror = true;
            this.LegRight.setPos(-0.5F, 6.9F, 5.0F);
            this.LegRight.addBox(-2.0F, 0.0F, -4.0F, 4.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, -0.6108652381980153F, -0.0F, 0.0F);
            this.Horn2 = new ModelRenderer(this, 17, 95);
            this.Horn2.setPos(0.0F, -0.1F, 2.0F);
            this.Horn2.addBox(-1.0F, -4.0F, -1.4F, 2.0F, 4.0F, 1.0F, -0.01F, 0.0F, 0.0F);
            this.setRotateAngle(Horn2, 0.27366763203903305F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 24, 92);
            this.Head.setPos(0.0F, 1.3F, -10.5F);
            this.Head.addBox(-4.5F, -0.5F, -6.5F, 9.0F, 10.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.1558579075294158F, 0.0F, 0.0F);
            this.HornBottom.addChild(this.HornMiddle);
            this.ArmLeft.addChild(this.HandLeft);
            this.ThighRight.addChild(this.UpperLegRight);
            this.Hips.addChild(this.ThighLeft);
            this.Chest.addChild(this.ArmBaseRight);
            this.Hips.addChild(this.Tail);
            this.ArmRight.addChild(this.HandRight);
            this.Body.addChild(this.Hips);
            this.SnoutBack.addChild(this.Mouth);
            this.ArmBaseRight.addChild(this.ArmRight);
            this.Chest.addChild(this.Body);
            this.UpperLegLeft.addChild(this.LegLeft);
            this.HornBack.addChild(this.HornTopBack);
            this.LegRight.addChild(this.FootRight);
            this.SnoutBack.addChild(this.HornBack);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.Nose.addChild(this.SnoutFront);
            this.Forehead.addChild(this.EarRight);
            this.ArmBaseLeft.addChild(this.ArmLeft);
            this.Head.addChild(this.SnoutBack);
            this.Chest.addChild(this.Neck);
            this.LegLeft.addChild(this.FootLeft);
            this.HandRight.addChild(this.FootRight_1);
            this.Neck.addChild(this.NeckBottom);
            this.Nose.addChild(this.HornBottom);
            this.HornMiddle.addChild(this.Horn1);
            this.Head.addChild(this.Forehead);
            this.Chest.addChild(this.ArmBaseLeft);
            this.SnoutBack.addChild(this.Nose);
            this.Forehead.addChild(this.EarLeft);
            this.Hips.addChild(this.ThighRight);
            this.HandLeft.addChild(this.HandLeft_1);
            this.UpperLegRight.addChild(this.LegRight);
            this.Horn1.addChild(this.Horn2);
            this.Neck.addChild(this.Head);
            this.saveBase();
        }

        @Override
        public void setupAnim(WhiteRhinocerosEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.16F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 0.59F;
            this.Head.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F + 0.16F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (entity.isSprinting()) {
                float speed = 1.0f;
                float degree = 0.5f;
            } else {
                float speed = 0.6f;
                float degree = 0.6f;
                this.Neck.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 0.59F;
                this.Head.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.16F;

                this.Chest.y = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -1F) * 0.5F + 4.0F;
                this.Chest.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.1F) * 0.5F - 0.19F;
                this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.19F;
                this.Hips.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.19F;

                this.ArmBaseLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.6F) * 0.5F + 0.25F;
                this.ArmLeft.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree) * 0.5F - 0.09F;
                this.HandLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F -0.09F;
                this.ArmBaseRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.6F) * 0.5F + 0.25F;
                this.ArmRight.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1F) * 0.5F - 0.09F;
                this.HandRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F -0.09F;

                this.ThighLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.3F) * 0.5F + 0.09F;
                this.UpperLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.61F;
                this.LegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.61F;
                this.FootLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.139F;
                this.ThighRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.3F) * 0.5F + 0.09F;
                this.UpperLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.61F;
                this.LegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.61F;
                this.FootRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.078F;
            }
        }
    }


    public static class Child extends WhiteRhinocerosModel {

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
        public ModelRenderer NeckBottom;
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
            this.TopSnout = new ModelRenderer(this, 24, 1);
            this.TopSnout.setPos(0.0F, -0.7F, -0.1F);
            this.TopSnout.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.4098033003787853F, 0.0F, 0.0F);
            this.LowerLegRight = new ModelRenderer(this, 10, 21);
            this.LowerLegRight.setPos(0.05F, 3.0F, 1.7F);
            this.LowerLegRight.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.767944870877505F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 6, 30);
            this.FootLeft.mirror = true;
            this.FootLeft.setPos(-0.1F, 3.7F, -0.7F);
            this.FootLeft.addBox(-0.5F, 0.0F, -0.7F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 0.13962634015954636F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 15, 22);
            this.ArmBaseLeft.mirror = true;
            this.ArmBaseLeft.setPos(1.1F, 0.2F, -1.0F);
            this.ArmBaseLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.3490658503988659F, 0.0F, 0.0F);
            this.NeckBottom = new ModelRenderer(this, 0, 8);
            this.NeckBottom.setPos(0.0F, 0.0F, -0.5F);
            this.NeckBottom.addBox(-0.5F, -2.0F, -1.3F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckBottom, -0.0911061832922575F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 0, 13);
            this.Mouth.setPos(0.0F, 0.4F, 0.1F);
            this.Mouth.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.04555309164612875F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 0, 27);
            this.UpperLegLeft.mirror = true;
            this.UpperLegLeft.setPos(0.0F, 2.5F, -1.2F);
            this.UpperLegLeft.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.6632251157578453F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 26, 28);
            this.EarLeft.setPos(1.0F, -0.5F, 0.6F);
            this.EarLeft.addBox(-0.5F, -2.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.0F, -0.4098033003787853F, 0.7740534966278743F);
            this.ArmLeft = new ModelRenderer(this, 16, 27);
            this.ArmLeft.mirror = true;
            this.ArmLeft.setPos(-0.05F, 2.0F, -1.0F);
            this.ArmLeft.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 0, 27);
            this.UpperLegRight.setPos(0.0F, 2.5F, -1.2F);
            this.UpperLegRight.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.6632251157578453F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 21, 29);
            this.HandLeft.mirror = true;
            this.HandLeft.setPos(-0.1F, 2.5F, 0.3F);
            this.HandLeft.addBox(-0.5F, 0.0F, -0.7F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.LowerLegLeft = new ModelRenderer(this, 10, 21);
            this.LowerLegLeft.mirror = true;
            this.LowerLegLeft.setPos(-0.05F, 3.0F, 1.7F);
            this.LowerLegLeft.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.767944870877505F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 0, 0);
            this.Neck.setPos(0.0F, -1.0F, -2.0F);
            this.Neck.addBox(-1.0F, -3.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, 0.9105382388075086F, 0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 15, 22);
            this.ArmBaseRight.setPos(-1.1F, 0.2F, -1.0F);
            this.ArmBaseRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.3490658503988659F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 6, 30);
            this.FootRight.setPos(0.1F, 3.7F, -0.7F);
            this.FootRight.addBox(-0.5F, 0.0F, -0.7F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, 0.13962634015954636F, 0.0F, 0.0F);
            this.UpperArmRight = new ModelRenderer(this, 24, 23);
            this.UpperArmRight.setPos(0.0F, 2.8F, 0.5F);
            this.UpperArmRight.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmRight, -0.08726646259971647F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 13, 0);
            this.Chest.setPos(0.0F, 15.9F, -2.5F);
            this.Chest.addBox(-1.5F, -2.0F, -2.0F, 3.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.2275909337942703F, 0.0F, 0.0F);
            this.Tail = new ModelRenderer(this, 9, 0);
            this.Tail.setPos(0.0F, 0.0F, 5.5F);
            this.Tail.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail, 0.45535640450848164F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 24, 5);
            this.Snout.setPos(0.0F, 0.0F, -1.0F);
            this.Snout.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.13962634015954636F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 0, 21);
            this.ThighRight.setPos(-1.4F, 1.3F, 4.5F);
            this.ThighRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, -0.05235987755982988F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 9);
            this.Body.setPos(0.0F, -1.5F, 0.0F);
            this.Body.addBox(-2.0F, -0.5F, -1.0F, 4.0F, 4.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.2275909337942703F, 0.0F, 0.0F);
            this.UpperArmLeft = new ModelRenderer(this, 24, 23);
            this.UpperArmLeft.mirror = true;
            this.UpperArmLeft.setPos(0.0F, 2.8F, 0.5F);
            this.UpperArmLeft.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmLeft, -0.08726646259971647F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 26, 28);
            this.EarRight.setPos(-1.0F, -0.5F, 0.6F);
            this.EarRight.addBox(-0.5F, -2.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.0F, 0.4098033003787853F, -0.7740534966278743F);
            this.HandRight = new ModelRenderer(this, 21, 29);
            this.HandRight.setPos(0.1F, 2.5F, 0.3F);
            this.HandRight.addBox(-0.5F, 0.0F, -0.7F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 0, 21);
            this.ThighLeft.mirror = true;
            this.ThighLeft.setPos(1.4F, 1.3F, 4.5F);
            this.ThighLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, -0.05235987755982988F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 19, 9);
            this.Head.setPos(0.0F, -2.6F, -1.0F);
            this.Head.addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, -0.591841146688116F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 16, 27);
            this.ArmRight.setPos(0.05F, 2.0F, -1.0F);
            this.ArmRight.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.Snout.addChild(this.TopSnout);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.Chest.addChild(this.ArmBaseLeft);
            this.Neck.addChild(this.NeckBottom);
            this.Snout.addChild(this.Mouth);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.Head.addChild(this.EarLeft);
            this.UpperArmLeft.addChild(this.ArmLeft);
            this.ThighRight.addChild(this.UpperLegRight);
            this.ArmLeft.addChild(this.HandLeft);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.Chest.addChild(this.Neck);
            this.Chest.addChild(this.ArmBaseRight);
            this.LowerLegRight.addChild(this.FootRight);
            this.ArmBaseRight.addChild(this.UpperArmRight);
            this.Body.addChild(this.Tail);
            this.Head.addChild(this.Snout);
            this.Body.addChild(this.ThighRight);
            this.Chest.addChild(this.Body);
            this.ArmBaseLeft.addChild(this.UpperArmLeft);
            this.Head.addChild(this.EarRight);
            this.ArmRight.addChild(this.HandRight);
            this.Body.addChild(this.ThighLeft);
            this.Neck.addChild(this.Head);
            this.UpperArmRight.addChild(this.ArmRight);
            this.saveBase();

        }

        @Override
        public void setupAnim(WhiteRhinocerosEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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
            this.Chest.y = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 15.9F;
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

