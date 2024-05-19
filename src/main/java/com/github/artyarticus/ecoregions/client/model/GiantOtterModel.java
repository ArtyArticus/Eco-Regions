package com.github.artyarticus.ecoregions.client.model;

import com.github.artyarticus.ecoregions.entity.GiantOtterEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class GiantOtterModel extends ZawaBaseModel<GiantOtterEntity> {
    public ModelRenderer Body;
    protected Iterable<ModelRenderer> parts;

    @Override
    @MethodsReturnNonnullByDefault
    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Body);
        }

        return this.parts;
    }

    public static class Adult extends GiantOtterModel {

        public ModelRenderer Back;
        public ModelRenderer Chest;
        public ModelRenderer Hips;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer Tail1;
        public ModelRenderer LegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer LegRight;
        public ModelRenderer FootRight;
        public ModelRenderer Tail2;
        public ModelRenderer Tail3;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer Neck;
        public ModelRenderer ArmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer ArmRight;
        public ModelRenderer HandRight;
        public ModelRenderer NeckBase;
        public ModelRenderer Head;
        public ModelRenderer Snout;
        public ModelRenderer EarRight;
        public ModelRenderer EarLeft;
        public ModelRenderer Mouth;
        public ModelRenderer TopSnout;

        public Adult() {
            this.texWidth = 64;
            this.texHeight = 64;
            this.Tail2 = new ModelRenderer(this, 0, 39);
            this.Tail2.setPos(0.0F, 0.2F, 4.1F);
            this.Tail2.addBox(-2.0F, 0.0F, 0.0F, 4.0F, 2.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, 0.3642502295386026F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 51, 33);
            this.Mouth.setPos(0.0F, 0.85F, 0.2F);
            this.Mouth.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.13665927909957545F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 13, 59);
            this.HandLeft.mirror = true;
            this.HandLeft.setPos(-0.1F, 2.5F, 0.0F);
            this.HandLeft.addBox(-1.5F, 0.0F, -3.2F, 3.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.16667894689440982F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 27, 59);
            this.ArmRight.setPos(0.1F, 2.5F, 0.2F);
            this.ArmRight.addBox(-1.5F, 0.0F, -1.0F, 3.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.47123889803846897F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 46, 21);
            this.Head.setPos(0.0F, 2.2F, -3.9F);
            this.Head.addBox(-2.0F, -2.5F, -2.5F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.591841146688116F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 13, 59);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.1F, 2.5F, 0.0F);
            this.HandRight.addBox(-1.5F, 0.0F, -3.2F, 3.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.16667894689440982F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 25, 39);
            this.Chest.setPos(0.0F, -3.0F, -4.7F);
            this.Chest.addBox(-3.0F, -0.2F, -3.0F, 6.0F, 6.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.33161255787892263F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 46, 1);
            this.FootRight.setPos(0.1F, 3.5F, 1.0F);
            this.FootRight.addBox(-1.5F, -0.2F, -4.0F, 3.0F, 1.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, -0.3186971254089062F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 44, 36);
            this.TopSnout.setPos(0.0F, -1.5F, -0.5F);
            this.TopSnout.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.45535640450848164F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 0, 49);
            this.Neck.setPos(0.0F, 0.2F, -2.5F);
            this.Neck.addBox(-1.5F, -0.5F, -4.3F, 3.0F, 4.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.2275909337942703F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 37, 31);
            this.Snout.setPos(0.0F, -0.4F, -1.7F);
            this.Snout.addBox(-1.5F, -0.5F, -2.0F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, -0.06981317007977318F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 28, 0);
            this.ThighLeft.mirror = true;
            this.ThighLeft.setPos(2.3F, 0.8F, 1.6F);
            this.ThighLeft.addBox(-2.0F, 0.0F, -2.5F, 4.0F, 5.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.18203784630933073F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 27, 59);
            this.ArmLeft.mirror = true;
            this.ArmLeft.setPos(-0.1F, 2.5F, 0.2F);
            this.ArmLeft.addBox(-1.5F, 0.0F, -1.0F, 3.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.47123889803846897F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 2);
            this.Body.setPos(0.0F, 17.0F, 2.2F);
            this.Body.addBox(-3.5F, -3.5F, -5.0F, 7.0F, 7.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.13962634015954636F, 0.0F, 0.0F);
            this.LegRight = new ModelRenderer(this, 37, 11);
            this.LegRight.setPos(0.0F, 5.0F, -2.0F);
            this.LegRight.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, 0.6981317007977318F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 54, 38);
            this.EarLeft.setPos(-1.5F, -2.0F, 0.2F);
            this.EarLeft.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.2617993877991494F, -0.7330382858376184F, 0.0F);
            this.LegLeft = new ModelRenderer(this, 37, 11);
            this.LegLeft.mirror = true;
            this.LegLeft.setPos(0.0F, 5.0F, -2.0F);
            this.LegLeft.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, 0.6981317007977318F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 28, 0);
            this.ThighRight.setPos(-2.3F, 0.8F, 1.6F);
            this.ThighRight.addBox(-2.0F, 0.0F, -2.5F, 4.0F, 5.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.18203784630933073F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 0, 29);
            this.Tail1.setPos(-0.01F, 1.0F, 4.5F);
            this.Tail1.addBox(-2.5F, -0.5F, 0.0F, 5.0F, 3.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -0.13665927909957545F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 21, 19);
            this.Hips.setPos(0.0F, -0.1F, 3.8F);
            this.Hips.addBox(-3.5F, -0.5F, 0.0F, 7.0F, 7.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.2275909337942703F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 46, 1);
            this.FootLeft.setPos(-0.1F, 3.5F, 1.0F);
            this.FootLeft.addBox(-1.5F, -0.2F, -4.0F, 3.0F, 1.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, -0.3186971254089062F, 0.0F, 0.0F);
            this.NeckBase = new ModelRenderer(this, 45, 48);
            this.NeckBase.setPos(0.0F, 3.0F, -0.5F);
            this.NeckBase.addBox(-1.0F, -1.5F, -3.3F, 2.0F, 3.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckBase, -0.27314402127920984F, 0.0F, 0.0F);
            this.Tail3 = new ModelRenderer(this, 14, 31);
            this.Tail3.setPos(0.0F, 0.6F, 7.1F);
            this.Tail3.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 1.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail3, 0.27314402127920984F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 37, 58);
            this.ArmBaseLeft.mirror = true;
            this.ArmBaseLeft.setPos(2.2F, 4.0F, -1.5F);
            this.ArmBaseLeft.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.500909508638178F, 0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 37, 58);
            this.ArmBaseRight.setPos(-2.2F, 4.0F, -1.5F);
            this.ArmBaseRight.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.500909508638178F, 0.0F, 0.0F);
            this.Back = new ModelRenderer(this, 0, 18);
            this.Back.setPos(0.0F, -3.0F, 2.6F);
            this.Back.addBox(-3.0F, -0.5F, 0.0F, 6.0F, 7.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Back, -0.45535640450848164F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 54, 38);
            this.EarRight.mirror = true;
            this.EarRight.setPos(1.5F, -2.0F, 0.2F);
            this.EarRight.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.2617993877991494F, 0.7330382858376184F, 0.0F);
            this.Tail1.addChild(this.Tail2);
            this.Snout.addChild(this.Mouth);
            this.ArmLeft.addChild(this.HandLeft);
            this.ArmBaseRight.addChild(this.ArmRight);
            this.Neck.addChild(this.Head);
            this.ArmRight.addChild(this.HandRight);
            this.Body.addChild(this.Chest);
            this.LegRight.addChild(this.FootRight);
            this.Snout.addChild(this.TopSnout);
            this.Chest.addChild(this.Neck);
            this.Head.addChild(this.Snout);
            this.Hips.addChild(this.ThighLeft);
            this.ArmBaseLeft.addChild(this.ArmLeft);
            this.ThighRight.addChild(this.LegRight);
            this.Head.addChild(this.EarLeft);
            this.ThighLeft.addChild(this.LegLeft);
            this.Hips.addChild(this.ThighRight);
            this.Hips.addChild(this.Tail1);
            this.Back.addChild(this.Hips);
            this.LegLeft.addChild(this.FootLeft);
            this.Neck.addChild(this.NeckBase);
            this.Tail2.addChild(this.Tail3);
            this.Chest.addChild(this.ArmBaseLeft);
            this.Chest.addChild(this.ArmBaseRight);
            this.Body.addChild(this.Back);
            this.Head.addChild(this.EarRight);
            this.saveBase();
        }

        @Override
        public void setupAnim(GiantOtterEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;

            this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.2F) * 0.2F - 0.227F;
            this.Head.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.2F) * 0.2F + 0.592F;
            this.Tail1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.2F) * 0.2F - 0.162F;
            this.Tail2.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.2F) * 0.2F + 0.364F;        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            }

        }
    }


    public static class Child extends GiantOtterModel {

        public ModelRenderer Back;
        public ModelRenderer Chest;
        public ModelRenderer Hips;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer Tail1;
        public ModelRenderer LegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer LegRight;
        public ModelRenderer FootRight;
        public ModelRenderer Tail2;
        public ModelRenderer Tail3;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer Neck;
        public ModelRenderer ArmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer ArmRight;
        public ModelRenderer HandRight;
        public ModelRenderer NeckBase;
        public ModelRenderer Head;
        public ModelRenderer Snout;
        public ModelRenderer EarRight;
        public ModelRenderer EarLeft;
        public ModelRenderer Mouth;
        public ModelRenderer TopSnout;

        public Child() {
            this.texWidth = 64;
            this.texHeight = 64;
            this.Tail2 = new ModelRenderer(this, 0, 39);
            this.Tail2.setPos(0.0F, 0.2F, 4.1F);
            this.Tail2.addBox(-2.0F, 0.0F, 0.0F, 4.0F, 2.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, 0.3642502295386026F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 51, 33);
            this.Mouth.setPos(0.0F, 0.85F, 0.2F);
            this.Mouth.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.13665927909957545F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 13, 59);
            this.HandLeft.mirror = true;
            this.HandLeft.setPos(-0.1F, 2.5F, 0.0F);
            this.HandLeft.addBox(-1.5F, 0.0F, -3.2F, 3.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.16667894689440982F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 27, 59);
            this.ArmRight.setPos(0.1F, 2.5F, 0.2F);
            this.ArmRight.addBox(-1.5F, 0.0F, -1.0F, 3.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.47123889803846897F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 46, 21);
            this.Head.setPos(0.0F, 2.2F, -3.9F);
            this.Head.addBox(-2.0F, -2.5F, -2.5F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.591841146688116F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 13, 59);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.1F, 2.5F, 0.0F);
            this.HandRight.addBox(-1.5F, 0.0F, -3.2F, 3.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.16667894689440982F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 25, 39);
            this.Chest.setPos(0.0F, -3.0F, -4.7F);
            this.Chest.addBox(-3.0F, -0.2F, -3.0F, 6.0F, 6.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.33161255787892263F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 46, 1);
            this.FootRight.setPos(0.1F, 3.5F, 1.0F);
            this.FootRight.addBox(-1.5F, -0.2F, -4.0F, 3.0F, 1.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, -0.3186971254089062F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 44, 36);
            this.TopSnout.setPos(0.0F, -1.5F, -0.5F);
            this.TopSnout.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.45535640450848164F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 0, 49);
            this.Neck.setPos(0.0F, 0.2F, -2.5F);
            this.Neck.addBox(-1.5F, -0.5F, -4.3F, 3.0F, 4.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.2275909337942703F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 37, 31);
            this.Snout.setPos(0.0F, -0.4F, -1.7F);
            this.Snout.addBox(-1.5F, -0.5F, -2.0F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, -0.06981317007977318F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 28, 0);
            this.ThighLeft.mirror = true;
            this.ThighLeft.setPos(2.3F, 0.8F, 1.6F);
            this.ThighLeft.addBox(-2.0F, 0.0F, -2.5F, 4.0F, 5.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.18203784630933073F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 27, 59);
            this.ArmLeft.mirror = true;
            this.ArmLeft.setPos(-0.1F, 2.5F, 0.2F);
            this.ArmLeft.addBox(-1.5F, 0.0F, -1.0F, 3.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.47123889803846897F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 2);
            this.Body.setPos(0.0F, 17.0F, 2.2F);
            this.Body.addBox(-3.5F, -3.5F, -5.0F, 7.0F, 7.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.13962634015954636F, 0.0F, 0.0F);
            this.LegRight = new ModelRenderer(this, 37, 11);
            this.LegRight.setPos(0.0F, 5.0F, -2.0F);
            this.LegRight.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, 0.6981317007977318F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 54, 38);
            this.EarLeft.setPos(-1.5F, -2.0F, 0.2F);
            this.EarLeft.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.2617993877991494F, -0.7330382858376184F, 0.0F);
            this.LegLeft = new ModelRenderer(this, 37, 11);
            this.LegLeft.mirror = true;
            this.LegLeft.setPos(0.0F, 5.0F, -2.0F);
            this.LegLeft.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, 0.6981317007977318F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 28, 0);
            this.ThighRight.setPos(-2.3F, 0.8F, 1.6F);
            this.ThighRight.addBox(-2.0F, 0.0F, -2.5F, 4.0F, 5.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.18203784630933073F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 0, 29);
            this.Tail1.setPos(-0.01F, 1.0F, 4.5F);
            this.Tail1.addBox(-2.5F, -0.5F, 0.0F, 5.0F, 3.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -0.13665927909957545F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 21, 19);
            this.Hips.setPos(0.0F, -0.1F, 3.8F);
            this.Hips.addBox(-3.5F, -0.5F, 0.0F, 7.0F, 7.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.2275909337942703F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 46, 1);
            this.FootLeft.setPos(-0.1F, 3.5F, 1.0F);
            this.FootLeft.addBox(-1.5F, -0.2F, -4.0F, 3.0F, 1.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, -0.3186971254089062F, 0.0F, 0.0F);
            this.NeckBase = new ModelRenderer(this, 45, 48);
            this.NeckBase.setPos(0.0F, 3.0F, -0.5F);
            this.NeckBase.addBox(-1.0F, -1.5F, -3.3F, 2.0F, 3.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckBase, -0.27314402127920984F, 0.0F, 0.0F);
            this.Tail3 = new ModelRenderer(this, 14, 31);
            this.Tail3.setPos(0.0F, 0.6F, 7.1F);
            this.Tail3.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 1.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail3, 0.27314402127920984F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 37, 58);
            this.ArmBaseLeft.mirror = true;
            this.ArmBaseLeft.setPos(2.2F, 4.0F, -1.5F);
            this.ArmBaseLeft.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.500909508638178F, 0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 37, 58);
            this.ArmBaseRight.setPos(-2.2F, 4.0F, -1.5F);
            this.ArmBaseRight.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.500909508638178F, 0.0F, 0.0F);
            this.Back = new ModelRenderer(this, 0, 18);
            this.Back.setPos(0.0F, -3.0F, 2.6F);
            this.Back.addBox(-3.0F, -0.5F, 0.0F, 6.0F, 7.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Back, -0.45535640450848164F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 54, 38);
            this.EarRight.mirror = true;
            this.EarRight.setPos(1.5F, -2.0F, 0.2F);
            this.EarRight.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.2617993877991494F, 0.7330382858376184F, 0.0F);
            this.Tail1.addChild(this.Tail2);
            this.Snout.addChild(this.Mouth);
            this.ArmLeft.addChild(this.HandLeft);
            this.ArmBaseRight.addChild(this.ArmRight);
            this.Neck.addChild(this.Head);
            this.ArmRight.addChild(this.HandRight);
            this.Body.addChild(this.Chest);
            this.LegRight.addChild(this.FootRight);
            this.Snout.addChild(this.TopSnout);
            this.Chest.addChild(this.Neck);
            this.Head.addChild(this.Snout);
            this.Hips.addChild(this.ThighLeft);
            this.ArmBaseLeft.addChild(this.ArmLeft);
            this.ThighRight.addChild(this.LegRight);
            this.Head.addChild(this.EarLeft);
            this.ThighLeft.addChild(this.LegLeft);
            this.Hips.addChild(this.ThighRight);
            this.Hips.addChild(this.Tail1);
            this.Back.addChild(this.Hips);
            this.LegLeft.addChild(this.FootLeft);
            this.Neck.addChild(this.NeckBase);
            this.Tail2.addChild(this.Tail3);
            this.Chest.addChild(this.ArmBaseLeft);
            this.Chest.addChild(this.ArmBaseRight);
            this.Body.addChild(this.Back);
            this.Head.addChild(this.EarRight);
            this.saveBase();

        }

        @Override
        public void setupAnim(GiantOtterEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.592F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.740F;
            this.Head.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 0.592F;
            this.Tail1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.34F) * 0.5F + 0.462F;
            this.Tail1.zRot = MathHelper.cos(3.0F + limbSwing * speed * 0.05F) * limbSwingAmount * (degree * 0.6F) * 0.5F;
            this.Tail2.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 0.392F;        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

        }
    }
}
