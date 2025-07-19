package com.github.artyarticus.ecoregions.client.model;

import com.github.artyarticus.ecoregions.entity.GibbonEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;
import org.zawamod.zawa.client.model.ZawaModelRenderer;

public abstract class GibbonModel extends ZawaBaseModel<GibbonEntity> {
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

    public static class Adult extends GibbonModel {

        public ModelRenderer Body;
        public ModelRenderer ArmLeft;
        public ModelRenderer ArmRight;
        public ModelRenderer Neck;
        public ModelRenderer Hips;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer LegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer ToesLeft;
        public ModelRenderer LegRight;
        public ModelRenderer FootRight;
        public ModelRenderer ToesRight;
        public ModelRenderer ForearmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer FingersLeft;
        public ModelRenderer ThumbLeft;
        public ModelRenderer ForearmRight;
        public ModelRenderer HandRight;
        public ModelRenderer FingersRight;
        public ModelRenderer ThumbRight;
        public ModelRenderer Head;
        public ModelRenderer SiamangThroat;
        public ModelRenderer Face;
        public ModelRenderer ManeLeft;
        public ModelRenderer ManeRight;
        public ModelRenderer EarLeft;
        public ModelRenderer EarRight;
        public ModelRenderer HairTopLeft;
        public ModelRenderer HairTopRight;
        public ModelRenderer Snout;
        public ModelRenderer Hair;
        public ModelRenderer Mouth;
        public ModelRenderer TopSnout;
        public ModelRenderer Lips;

        public Adult() {
            this.texWidth = 64;
            this.texHeight = 96;
            this.Body = new ModelRenderer(this, 0, 16);
            this.Body.setPos(0.0F, -4.0F, 2.5F);
            this.Body.addBox(-3.5F, 0.0F, 0.0F, 7.0F, 7.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, -0.3574434228189554F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 48, 44);
            this.FootLeft.setPos(-0.1F, 6.9F, 2.5F);
            this.FootLeft.addBox(-1.0F, -1.0F, -3.0F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, -0.18849556254433897F, 0.0F, 0.0F);
            this.ForearmLeft = new ModelRenderer(this, 18, 63);
            this.ForearmLeft.setPos(-0.1F, 6.0F, 1.5F);
            this.ForearmLeft.addBox(-1.5F, 0.0F, -3.0F, 3.0F, 11.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmLeft, -0.0911061832922575F, 0.0F, 0.0911061832922575F);
            this.ThumbRight = new ModelRenderer(this, 42, 62);
            this.ThumbRight.setPos(1.0F, 0.4F, 0.5F);
            this.ThumbRight.addBox(-1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThumbRight, 0.0F, 0.0F, -0.27314402127920984F);
            this.FingersRight = new ModelRenderer(this, 32, 62);
            this.FingersRight.mirror = true;
            this.FingersRight.setPos(0.0F, 2.0F, 2.0F);
            this.FingersRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 30, 39);
            this.ThighLeft.setPos(2.5F, 2.9F, 2.4F);
            this.ThighLeft.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.8527678831770739F, 0.0F, -0.13665927909957545F);
            this.ForearmRight = new ModelRenderer(this, 18, 63);
            this.ForearmRight.mirror = true;
            this.ForearmRight.setPos(0.1F, 6.0F, 1.5F);
            this.ForearmRight.addBox(-1.5F, 0.0F, -3.0F, 3.0F, 11.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmRight, -0.0911061832922575F, 0.0F, -0.0911061832922575F);
            this.Hips = new ModelRenderer(this, 0, 36);
            this.Hips.setPos(0.0F, 0.5F, 7.1F);
            this.Hips.addBox(-3.0F, 0.0F, 0.0F, 6.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.45535640450848164F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 0, 50);
            this.Neck.setPos(0.0F, -3.1F, -2.5F);
            this.Neck.addBox(-2.0F, -1.5F, -1.5F, 4.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.3186971254089062F, 0.0F, 0.0F);
            this.ToesRight = new ModelRenderer(this, 48, 50);
            this.ToesRight.mirror = true;
            this.ToesRight.setPos(0.0F, -1.0F, -3.0F);
            this.ToesRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ToesRight, 0.2275909337942703F, 0.0F, 0.0F);
            this.ManeLeft = new ModelRenderer(this, 35, 70);
            this.ManeLeft.setPos(3.8F, 0.0F, -1.8F);
            this.ManeLeft.addBox(-3.0F, -2.0F, 0.0F, 3.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ManeLeft, -0.013962634224014095F, 0.0F, 0.21223203437934937F);
            this.FingersLeft = new ModelRenderer(this, 32, 62);
            this.FingersLeft.setPos(0.0F, 2.0F, 2.0F);
            this.FingersLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.LegLeft = new ModelRenderer(this, 32, 50);
            this.LegLeft.setPos(0.0F, 5.5F, -2.0F);
            this.LegLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 6.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, 0.4098033003787853F, 0.0F, 0.0911061832922575F);
            this.HairTopLeft = new ModelRenderer(this, 0, 80);
            this.HairTopLeft.setPos(-0.51F, -2.3F, -1.6F);
            this.HairTopLeft.addBox(0.0F, -2.0F, 0.0F, 4.0F, 2.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HairTopLeft, 0.0F, 0.0F, 0.23457224414434488F);
            this.Head = new ModelRenderer(this, 34, 11);
            this.Head.setPos(0.0F, 1.8F, -2.4F);
            this.Head.addBox(-3.0F, -3.5F, -1.5F, 6.0F, 7.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.8072147790473774F, 0.0F, 0.0F);
            this.HairTopRight = new ModelRenderer(this, 0, 80);
            this.HairTopRight.mirror = true;
            this.HairTopRight.setPos(0.51F, -2.3F, -1.6F);
            this.HairTopRight.addBox(-4.0F, -2.0F, 0.0F, 4.0F, 2.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HairTopRight, 0.0F, 0.0F, -0.23457224414434488F);
            this.Face = new ModelRenderer(this, 50, 0);
            this.Face.setPos(0.0F, -3.0F, -2.0F);
            this.Face.addBox(-2.5F, 0.0F, 0.0F, 5.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Face, -0.0911061832922575F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 0, 61);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(-3.5F, -2.0F, -0.6F);
            this.ArmRight.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 7.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, 0.32567843575898076F, 0.0F, 0.0F);
            this.ToesLeft = new ModelRenderer(this, 48, 50);
            this.ToesLeft.setPos(0.0F, -1.0F, -3.0F);
            this.ToesLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ToesLeft, 0.2275909337942703F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 46, 55);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.0F, 9.9F, -2.5F);
            this.HandRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.0911061832922575F, 0.0F, 0.0911061832922575F);
            this.Hair = new ModelRenderer(this, 30, 0);
            this.Hair.setPos(0.0F, 0.2F, 0.0F);
            this.Hair.addBox(-1.5F, -1.5F, -0.3F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hair, 0.27366763203903305F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 48, 44);
            this.FootRight.mirror = true;
            this.FootRight.setPos(-0.1F, 6.9F, 2.5F);
            this.FootRight.addBox(-1.0F, -1.0F, -3.0F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, -0.18849556254433897F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 0, 61);
            this.ArmLeft.setPos(3.5F, -2.0F, -0.6F);
            this.ArmLeft.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 7.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, 0.32567843575898076F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 25, 54);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-3.0F, -0.5F, 1.0F);
            this.EarRight.addBox(-1.0F, -2.0F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.0781907508222411F, 0.0F, 0.3914773565486503F);
            this.TopSnout = new ModelRenderer(this, 54, 6);
            this.TopSnout.setPos(0.0F, 0.0F, -1.9F);
            this.TopSnout.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.9175195824470969F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 46, 55);
            this.HandLeft.setPos(-0.0F, 9.9F, -2.5F);
            this.HandLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.0911061832922575F, 0.0F, -0.0911061832922575F);
            this.ThighRight = new ModelRenderer(this, 30, 39);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-2.5F, 2.9F, 2.4F);
            this.ThighRight.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.8527678831770739F, 0.0F, 0.13665927909957545F);
            this.Mouth = new ModelRenderer(this, 44, 34);
            this.Mouth.setPos(0.0F, 2.0F, 0.0F);
            this.Mouth.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.13665927909957545F, 0.0F, 0.0F);
            this.ManeRight = new ModelRenderer(this, 35, 70);
            this.ManeRight.mirror = true;
            this.ManeRight.setPos(-3.8F, 0.0F, -1.8F);
            this.ManeRight.addBox(0.0F, -2.0F, 0.0F, 3.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ManeRight, -0.013962634224014095F, 0.0F, -0.21223203437934937F);
            this.ThumbLeft = new ModelRenderer(this, 42, 62);
            this.ThumbLeft.setPos(-1.0F, 0.4F, 0.5F);
            this.ThumbLeft.addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThumbLeft, 0.0F, 0.0F, 0.27314402127920984F);
            this.Snout = new ModelRenderer(this, 44, 26);
            this.Snout.setPos(0.0F, 3.7F, 1.2F);
            this.Snout.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.058468528277334356F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 25, 54);
            this.EarLeft.setPos(2.9F, -0.5F, 1.0F);
            this.EarLeft.addBox(-1.0F, -2.0F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.0781907508222411F, 0.0F, -0.3914773565486503F);
            this.SiamangThroat = new ModelRenderer(this, 30, 83);
            this.SiamangThroat.setPos(0.0F, 2.0F, -1.0F);
            this.SiamangThroat.addBox(-2.0F, 0.0F, 0.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.LegRight = new ModelRenderer(this, 32, 50);
            this.LegRight.mirror = true;
            this.LegRight.setPos(0.0F, 5.5F, -2.0F);
            this.LegRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 6.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, 0.4098033003787853F, 0.0F, -0.0911061832922575F);
            this.Chest = new ModelRenderer(this, 0, 0);
            this.Chest.setPos(0.0F, 7.6F, -2.5F);
            this.Chest.addBox(-4.0F, -4.5F, -2.5F, 8.0F, 7.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.3616322090290002F, 0.0F, 0.0F);
            this.Lips = new ModelRenderer(this, 44, 40);
            this.Lips.setPos(0.0F, 1.1F, -2.1F);
            this.Lips.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 1.0F, 2.0F, 0.1F, 0.0F, 0.0F);
            this.Chest.addChild(this.Body);
            this.LegLeft.addChild(this.FootLeft);
            this.ArmLeft.addChild(this.ForearmLeft);
            this.HandRight.addChild(this.ThumbRight);
            this.HandRight.addChild(this.FingersRight);
            this.Hips.addChild(this.ThighLeft);
            this.ArmRight.addChild(this.ForearmRight);
            this.Body.addChild(this.Hips);
            this.Chest.addChild(this.Neck);
            this.FootRight.addChild(this.ToesRight);
            this.Head.addChild(this.ManeLeft);
            this.HandLeft.addChild(this.FingersLeft);
            this.ThighLeft.addChild(this.LegLeft);
            this.Head.addChild(this.HairTopLeft);
            this.Neck.addChild(this.Head);
            this.Head.addChild(this.HairTopRight);
            this.Head.addChild(this.Face);
            this.Chest.addChild(this.ArmRight);
            this.FootLeft.addChild(this.ToesLeft);
            this.ForearmRight.addChild(this.HandRight);
            this.Face.addChild(this.Hair);
            this.LegRight.addChild(this.FootRight);
            this.Chest.addChild(this.ArmLeft);
            this.Head.addChild(this.EarRight);
            this.Snout.addChild(this.TopSnout);
            this.ForearmLeft.addChild(this.HandLeft);
            this.Hips.addChild(this.ThighRight);
            this.Snout.addChild(this.Mouth);
            this.Head.addChild(this.ManeRight);
            this.HandLeft.addChild(this.ThumbLeft);
            this.Face.addChild(this.Snout);
            this.Head.addChild(this.EarLeft);
            this.Neck.addChild(this.SiamangThroat);
            this.ThighRight.addChild(this.LegRight);
            this.Snout.addChild(this.Lips);
            this.saveBase();
        }

        @Override
        public void setupAnim(GibbonEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = (float) Math.toRadians((double) netHeadYaw) * 0.5F;
            this.Head.yRot = (float) Math.toRadians((double) netHeadYaw) * 0.5F;
        }

        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 1.0F;
            float degree = 1.0F;
            this.Neck.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * -0.1F * limbSwingAmount * 0.5F - 0.3F;
            this.Head.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * 0.2F * limbSwingAmount * 0.5F + 0.455F;
        }

        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 1.9F;
            float degree = 0.7F;
            if (this.isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            }

            this.Neck.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.5F + 3.1415927F) * degree * -0.2F * limbSwingAmount * 0.5F - 0.3F;
            this.Head.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.5F + 3.1415927F) * degree * 0.2F * limbSwingAmount * 0.5F + 0.455F;
            this.Chest.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.5F + 3.1415927F) * degree * -0.1F * limbSwingAmount * 0.5F - 0.361F;
            this.Body.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.5F + 3.1415927F) * degree * 0.2F * limbSwingAmount * 0.5F - 0.357F;
            this.Chest.y = MathHelper.cos(2.0F + limbSwing * speed * 0.5F + 3.1415927F) * degree * -0.5F * limbSwingAmount * 0.5F + 7.6F;
            this.Hips.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.5F + 3.1415927F) * degree * 0.5F * limbSwingAmount * 0.5F - 0.455F;
            this.ArmLeft.z = MathHelper.cos(7.0F + limbSwing * speed * 0.25F + 3.1415927F) * degree * 4.0F * limbSwingAmount * 0.5F - 0.6F;
            this.ArmLeft.xRot = MathHelper.cos(limbSwing * speed * 0.25F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.325F;
            this.ForearmLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.25F + 3.1415927F) * degree * 2.2F * limbSwingAmount * 0.5F - 0.091F;
            this.HandLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.25F + 3.1415927F) * degree * -1.0F * limbSwingAmount * 0.5F + 0.091F;
            this.ArmRight.z = MathHelper.cos(7.0F + limbSwing * speed * 0.25F + 3.1415927F) * degree * -4.0F * limbSwingAmount * 0.5F - 0.6F;
            this.ArmRight.xRot = MathHelper.cos(limbSwing * speed * 0.25F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F + 0.325F;
            this.ForearmRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.25F + 3.1415927F) * degree * -2.2F * limbSwingAmount * 0.5F - 0.091F;
            this.HandRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.25F + 3.1415927F) * degree * 1.0F * limbSwingAmount * 0.5F + 0.091F;
            this.ThighLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.25F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F + 0.853F;
            this.LegLeft.xRot = MathHelper.cos(0.0F + limbSwing * speed * 0.25F + 3.1415927F) * degree * 3.0F * limbSwingAmount * 0.5F + 0.409F;
            this.FootLeft.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.25F + 3.1415927F) * degree * -1.0F * limbSwingAmount * 0.5F - 0.188F;
            this.ThighRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.25F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.853F;
            this.LegRight.xRot = MathHelper.cos(0.0F + limbSwing * speed * 0.25F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.409F;
            this.FootRight.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.25F + 3.1415927F) * degree * 1.0F * limbSwingAmount * 0.5F - 0.188F;
        }
    }


        public static class Child extends GibbonModel {

            public ModelRenderer Body;
            public ModelRenderer ArmLeft;
            public ModelRenderer Neck;
            public ModelRenderer ArmRight;
            public ModelRenderer Hips;
            public ModelRenderer ThighLeft;
            public ModelRenderer ThighRight;
            public ModelRenderer LegLeft;
            public ModelRenderer FootLeft;
            public ModelRenderer LegRight;
            public ModelRenderer FootRight;
            public ModelRenderer ForearmLeft;
            public ModelRenderer HandLeft;
            public ModelRenderer FingersLeft;
            public ModelRenderer ThumbLeft;
            public ModelRenderer Head;
            public ModelRenderer Face;
            public ModelRenderer ManeLeft;
            public ModelRenderer EarLeft;
            public ModelRenderer HairTopLeft;
            public ModelRenderer ManeRight;
            public ModelRenderer HairTopRight;
            public ModelRenderer EarRight;
            public ModelRenderer Snout;
            public ModelRenderer Mouth;
            public ModelRenderer TopSnout;
            public ModelRenderer ForearmRight;
            public ModelRenderer HandRight;
            public ModelRenderer FingersRight;
            public ModelRenderer ThumbRight;

            public Child() {
                this.texWidth = 64;
                this.texHeight = 32;
                this.ManeLeft = new ModelRenderer(this, 28, 1);
                this.ManeLeft.setPos(2.2F, 0.5F, -1.7F);
                this.ManeLeft.addBox(-1.8F, -1.0F, -0.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(ManeLeft, -0.013962634224014095F, 0.0781907508222411F, 0.21223203437934937F);
                this.ForearmLeft = new ModelRenderer(this, 24, 17);
                this.ForearmLeft.setPos(-0.01F, 2.9F, 0.5F);
                this.ForearmLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(ForearmLeft, -0.0911061832922575F, 0.0F, 0.0911061832922575F);
                this.Face = new ModelRenderer(this, 27, 7);
                this.Face.setPos(0.0F, -1.8F, -2.2F);
                this.Face.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(Face, -0.0911061832922575F, 0.0F, 0.0F);
                this.Chest = new ModelRenderer(this, 0, 0);
                this.Chest.setPos(0.0F, 14.9F, -2.5F);
                this.Chest.addBox(-2.0F, -2.0F, -1.5F, 4.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(Chest, -0.3616322090290002F, 0.0F, 0.0F);
                this.LegRight = new ModelRenderer(this, 14, 18);
                this.LegRight.mirror = true;
                this.LegRight.setPos(0.01F, 3.0F, -1.0F);
                this.LegRight.addBox(-1.0F, 0.0F, -0.2F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(LegRight, 0.4098033003787853F, 0.0F, 0.0F);
                this.ForearmRight = new ModelRenderer(this, 24, 17);
                this.ForearmRight.mirror = true;
                this.ForearmRight.setPos(0.01F, 2.9F, 0.5F);
                this.ForearmRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(ForearmRight, -0.0911061832922575F, 0.0F, -0.0911061832922575F);
                this.HairTopLeft = new ModelRenderer(this, 14, 7);
                this.HairTopLeft.setPos(-0.51F, -1.3F, -1.6F);
                this.HairTopLeft.addBox(0.0F, -1.5F, -0.3F, 3.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(HairTopLeft, 0.0F, 0.0F, 0.23457224414434488F);
                this.Hips = new ModelRenderer(this, 0, 14);
                this.Hips.setPos(0.0F, 0.1F, 3.0F);
                this.Hips.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(Hips, -0.45535640450848164F, 0.0F, 0.0F);
                this.LegLeft = new ModelRenderer(this, 14, 18);
                this.LegLeft.setPos(-0.01F, 3.0F, -1.0F);
                this.LegLeft.addBox(-1.0F, 0.0F, -0.2F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(LegLeft, 0.4098033003787853F, 0.0F, 0.0F);
                this.FootLeft = new ModelRenderer(this, 13, 23);
                this.FootLeft.setPos(-0.01F, 3.0F, 1.5F);
                this.FootLeft.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(FootLeft, -0.1494001912944076F, 0.0F, 0.0F);
                this.ThumbRight = new ModelRenderer(this, 32, 22);
                this.ThumbRight.mirror = true;
                this.ThumbRight.setPos(1.0F, 0.2F, 0.01F);
                this.ThumbRight.addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(ThumbRight, 0.0F, 0.0F, -0.27314402127920984F);
                this.Head = new ModelRenderer(this, 14, 0);
                this.Head.setPos(0.0F, 1.1F, -1.3F);
                this.Head.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(Head, 0.8072147790473774F, 0.0F, 0.0F);
                this.Mouth = new ModelRenderer(this, 35, 1);
                this.Mouth.setPos(-0.01F, 1.0F, 0.0F);
                this.Mouth.addBox(-1.0F, 0.0F, -1.9F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(Mouth, -0.13665927909957545F, 0.0F, 0.0F);
                this.Body = new ModelRenderer(this, 0, 7);
                this.Body.setPos(-0.01F, -2.0F, 1.5F);
                this.Body.addBox(-2.0F, 0.0F, 0.0F, 4.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(Body, -0.3574434228189554F, 0.0F, 0.0F);
                this.ManeRight = new ModelRenderer(this, 28, 1);
                this.ManeRight.mirror = true;
                this.ManeRight.setPos(-2.2F, 0.5F, -1.7F);
                this.ManeRight.addBox(-0.2F, -1.0F, -0.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(ManeRight, -0.013962634224014095F, -0.0781907508222411F, -0.21223203437934937F);
                this.TopSnout = new ModelRenderer(this, 36, 5);
                this.TopSnout.setPos(0.0F, 0.0F, -1.9F);
                this.TopSnout.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(TopSnout, 0.9175195824470969F, 0.0F, 0.0F);
                this.ThighLeft = new ModelRenderer(this, 14, 12);
                this.ThighLeft.setPos(1.2F, 1.4F, 1.9F);
                this.ThighLeft.addBox(-1.0F, -0.5F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.2F);
                this.setRotateAngle(ThighLeft, 0.9700540302163814F, 0.0F, 0.0F);
                this.Snout = new ModelRenderer(this, 35, 8);
                this.Snout.setPos(0.0F, 2.5F, 1.5F);
                this.Snout.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(Snout, 0.058468528277334356F, 0.0F, 0.0F);
                this.ThighRight = new ModelRenderer(this, 14, 12);
                this.ThighRight.mirror = true;
                this.ThighRight.setPos(-1.2F, 1.4F, 1.9F);
                this.ThighRight.addBox(-1.0F, -0.5F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.2F);
                this.setRotateAngle(ThighRight, 0.9700540302163814F, 0.0F, 0.0F);
                this.HandRight = new ModelRenderer(this, 25, 23);
                this.HandRight.mirror = true;
                this.HandRight.setPos(0.01F, 3.9F, -1.9F);
                this.HandRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(HandRight, 0.0911061832922575F, 0.0F, 0.0911061832922575F);
                this.ArmRight = new ModelRenderer(this, 24, 12);
                this.ArmRight.mirror = true;
                this.ArmRight.setPos(-1.7F, 0.9F, 0.2F);
                this.ArmRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(ArmRight, 0.32567843575898076F, 0.0F, 0.0F);
                this.EarRight = new ModelRenderer(this, 35, 11);
                this.EarRight.mirror = true;
                this.EarRight.setPos(-1.37F, -0.2F, -0.4F);
                this.EarRight.addBox(-1.0F, -1.3F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(EarRight, 0.0781907508222411F, 0.0F, 0.2741912261540994F);
                this.ThumbLeft = new ModelRenderer(this, 32, 22);
                this.ThumbLeft.setPos(-1.0F, 0.2F, 0.01F);
                this.ThumbLeft.addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(ThumbLeft, 0.0F, 0.0F, 0.27314402127920984F);
                this.FingersLeft = new ModelRenderer(this, 31, 24);
                this.FingersLeft.setPos(0.0F, 1.0F, 1.0F);
                this.FingersLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
                this.FingersRight = new ModelRenderer(this, 31, 24);
                this.FingersRight.mirror = true;
                this.FingersRight.setPos(0.0F, 1.0F, 1.0F);
                this.FingersRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
                this.HairTopRight = new ModelRenderer(this, 14, 7);
                this.HairTopRight.mirror = true;
                this.HairTopRight.setPos(0.51F, -1.3F, -1.6F);
                this.HairTopRight.addBox(-3.0F, -1.5F, -0.3F, 3.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(HairTopRight, 0.0F, 0.0F, -0.23457224414434488F);
                this.ArmLeft = new ModelRenderer(this, 24, 12);
                this.ArmLeft.setPos(1.7F, 0.9F, 0.2F);
                this.ArmLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(ArmLeft, 0.32567843575898076F, 0.0F, 0.0F);
                this.FootRight = new ModelRenderer(this, 13, 23);
                this.FootRight.mirror = true;
                this.FootRight.setPos(0.01F, 3.0F, 1.5F);
                this.FootRight.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(FootRight, -0.1494001912944076F, 0.0F, 0.0F);
                this.HandLeft = new ModelRenderer(this, 25, 23);
                this.HandLeft.setPos(-0.01F, 3.9F, -1.9F);
                this.HandLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(HandLeft, 0.0911061832922575F, 0.0F, -0.0911061832922575F);
                this.Neck = new ModelRenderer(this, 0, 20);
                this.Neck.setPos(0.0F, -1.5F, -1.5F);
                this.Neck.addBox(-1.5F, -0.4F, -1.9F, 3.0F, 3.0F, 3.0F, 0.0F, 0.3F, 0.0F);
                this.setRotateAngle(Neck, -0.3186971254089062F, 0.0F, 0.0F);
                this.EarLeft = new ModelRenderer(this, 35, 11);
                this.EarLeft.setPos(1.37F, -0.2F, -0.4F);
                this.EarLeft.addBox(0.0F, -1.3F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(EarLeft, 0.0781907508222411F, 0.0F, -0.2741912261540994F);
                this.Head.addChild(this.ManeLeft);
                this.ArmLeft.addChild(this.ForearmLeft);
                this.Head.addChild(this.Face);
                this.ThighRight.addChild(this.LegRight);
                this.ArmRight.addChild(this.ForearmRight);
                this.Head.addChild(this.HairTopLeft);
                this.Body.addChild(this.Hips);
                this.ThighLeft.addChild(this.LegLeft);
                this.LegLeft.addChild(this.FootLeft);
                this.HandRight.addChild(this.ThumbRight);
                this.Neck.addChild(this.Head);
                this.Snout.addChild(this.Mouth);
                this.Chest.addChild(this.Body);
                this.Head.addChild(this.ManeRight);
                this.Snout.addChild(this.TopSnout);
                this.Hips.addChild(this.ThighLeft);
                this.Face.addChild(this.Snout);
                this.Hips.addChild(this.ThighRight);
                this.ForearmRight.addChild(this.HandRight);
                this.Chest.addChild(this.ArmRight);
                this.Head.addChild(this.EarRight);
                this.HandLeft.addChild(this.ThumbLeft);
                this.HandLeft.addChild(this.FingersLeft);
                this.HandRight.addChild(this.FingersRight);
                this.Head.addChild(this.HairTopRight);
                this.Chest.addChild(this.ArmLeft);
                this.LegRight.addChild(this.FootRight);
                this.ForearmLeft.addChild(this.HandLeft);
                this.Chest.addChild(this.Neck);
                this.Head.addChild(this.EarLeft);
                this.saveBase();

            }

            @Override
            public void setupAnim(GibbonEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
                super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
                this.Neck.yRot = (float)Math.toRadians((double)netHeadYaw) * 0.5F;
                this.Head.yRot = (float)Math.toRadians((double)netHeadYaw) * 0.5F;
            }

            public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
                this.loadBase();
                float speed = 1.0F;
                float degree = 1.0F;
                this.Neck.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * -0.1F * limbSwingAmount * 0.5F - 0.318F;
            }

            public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
                this.loadBase();
                float speed = 1.0F;
                float degree = 1.0F;
                if (this.isSwimming) {
                    limbSwing = (float)entity.tickCount;
                    limbSwingAmount = 0.3F;
                }

                this.ThighLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.25F + 3.1415927F) * degree * -2.5F * limbSwingAmount * 0.5F + 0.97F;
                this.LegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.25F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F + 0.409F;
                this.FootLeft.xRot = MathHelper.cos(limbSwing * speed * 0.25F + 3.1415927F) * degree * -2.5F * limbSwingAmount * 0.5F - 0.149F;
                this.ThighRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.25F + 3.1415927F) * degree * 2.5F * limbSwingAmount * 0.5F + 0.97F;
                this.LegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.25F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.409F;
                this.FootRight.xRot = MathHelper.cos(limbSwing * speed * 0.25F + 3.1415927F) * degree * 2.5F * limbSwingAmount * 0.5F - 0.149F;
                this.Chest.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.5F + 3.1415927F) * degree * -0.05F * limbSwingAmount * 0.5F -0.361F;
                this.Body.xRot = MathHelper.cos(limbSwing * speed * 0.5F + 3.1415927F) * degree * -0.1F * limbSwingAmount * 0.5F - 0.357F;
                this.Hips.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F + 3.1415927F) * degree * -0.2F * limbSwingAmount * 0.5F -0.455F;
                this.Neck.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.5F + 3.1415927F) * degree * -0.1F * limbSwingAmount * 0.5F - 0.318F;
                this.ArmLeft.xRot = MathHelper.cos(limbSwing * speed * 0.25F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F + 0.326F;
                this.ForearmLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.25F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F - 0.091F;
                this.ArmRight.xRot = MathHelper.cos(limbSwing * speed * 0.25F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.326F;
                this.ForearmRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.25F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F - 0.091F;
            }
        }
    }
