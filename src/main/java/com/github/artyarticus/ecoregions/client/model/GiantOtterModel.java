package com.github.artyarticus.ecoregions.client.model;

import com.github.artyarticus.ecoregions.entity.GiantOtterEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
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
        public ModelRenderer ThighLeft_1;
        public ModelRenderer Tail1;
        public ModelRenderer LegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer LegLeft_1;
        public ModelRenderer FootLeft_1;
        public ModelRenderer Tail2;
        public ModelRenderer Tail3;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer ArmBaseLeft_1;
        public ModelRenderer Neck;
        public ModelRenderer ArmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer ArmLeft_1;
        public ModelRenderer HandLeft_1;
        public ModelRenderer NeckBottom;
        public ModelRenderer Head;
        public ModelRenderer Snout;
        public ModelRenderer Ear;
        public ModelRenderer Ear_1;
        public ModelRenderer Mouth;
        public ModelRenderer TopSnout;

        public Adult() {
            this.texWidth = 64;
            this.texHeight = 64;
            this.NeckBottom = new ModelRenderer(this, 45, 48);
            this.NeckBottom.setPos(0.0F, -1.2F, -2.3F);
            this.NeckBottom.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckBottom, -0.27314402127920984F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 44, 36);
            this.TopSnout.setPos(0.0F, -1.5F, -0.5F);
            this.TopSnout.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.45535640450848164F, 0.0F, 0.0F);
            this.Tail3 = new ModelRenderer(this, 14, 31);
            this.Tail3.setPos(0.0F, 0.6F, 7.1F);
            this.Tail3.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 1.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail3, 0.27314402127920984F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 0, 49);
            this.Neck.setPos(0.0F, -1.0F, -7.1F);
            this.Neck.addBox(-1.5F, -2.5F, -3.0F, 3.0F, 4.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.2275909337942703F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 0, 39);
            this.Tail2.setPos(0.0F, 0.2F, 4.1F);
            this.Tail2.addBox(-2.0F, 0.0F, 0.0F, 4.0F, 2.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, 0.3642502295386026F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 21, 19);
            this.Hips.setPos(0.0F, 0.0F, 4.0F);
            this.Hips.addBox(-3.5F, 0.0F, 0.0F, 7.0F, 7.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.2275909337942703F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 25, 39);
            this.Chest.setPos(0.0F, 0.5F, -3.5F);
            this.Chest.addBox(-3.0F, -3.0F, -6.0F, 6.0F, 6.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.33161255787892263F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 37, 58);
            this.ArmBaseLeft.mirror = true;
            this.ArmBaseLeft.setPos(2.2F, 1.5F, -3.5F);
            this.ArmBaseLeft.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.500909508638178F, 0.0F, 0.0F);
            this.Back = new ModelRenderer(this, 0, 18);
            this.Back.setPos(0.0F, -3.5F, 3.0F);
            this.Back.addBox(-3.0F, 0.0F, 0.0F, 6.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Back, -0.45535640450848164F, 0.0F, 0.0F);
            this.ThighLeft_1 = new ModelRenderer(this, 28, 0);
            this.ThighLeft_1.setPos(-2.3F, 1.9F, 1.6F);
            this.ThighLeft_1.addBox(-2.0F, 0.0F, -2.5F, 4.0F, 5.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft_1, 0.15707963267948966F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 27, 59);
            this.ArmLeft.mirror = true;
            this.ArmLeft.setPos(-0.1F, 2.5F, 0.2F);
            this.ArmLeft.addBox(-1.5F, 0.0F, -1.0F, 3.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.47123889803846897F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 46, 21);
            this.Head.setPos(0.0F, 0.2F, -2.7F);
            this.Head.addBox(-2.0F, -2.5F, -2.5F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.591841146688116F, 0.0F, 0.0F);
            this.LegLeft = new ModelRenderer(this, 37, 11);
            this.LegLeft.mirror = true;
            this.LegLeft.setPos(0.0F, 5.0F, -2.0F);
            this.LegLeft.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, 0.6981317007977318F, 0.0F, 0.0F);
            this.LegLeft_1 = new ModelRenderer(this, 37, 11);
            this.LegLeft_1.setPos(0.0F, 5.0F, -2.0F);
            this.LegLeft_1.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft_1, 0.6981317007977318F, 0.0F, 0.0F);
            this.ArmLeft_1 = new ModelRenderer(this, 27, 59);
            this.ArmLeft_1.setPos(0.1F, 2.5F, 0.2F);
            this.ArmLeft_1.addBox(-1.5F, 0.0F, -1.0F, 3.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft_1, -0.47123889803846897F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 51, 33);
            this.Mouth.setPos(0.0F, 0.95F, 0.2F);
            this.Mouth.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.13665927909957545F, 0.0F, 0.0F);
            this.ArmBaseLeft_1 = new ModelRenderer(this, 37, 58);
            this.ArmBaseLeft_1.setPos(-2.2F, 1.5F, -3.5F);
            this.ArmBaseLeft_1.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft_1, 0.500909508638178F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 13, 59);
            this.HandLeft.mirror = true;
            this.HandLeft.setPos(-0.1F, 2.3F, 0.8F);
            this.HandLeft.addBox(-1.5F, 0.0F, -4.0F, 3.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.17453292519943295F, 0.0F, 0.0F);
            this.Ear_1 = new ModelRenderer(this, 54, 38);
            this.Ear_1.setPos(-1.9F, -2.0F, 0.2F);
            this.Ear_1.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Ear_1, 0.2617993877991494F, -0.7330382858376184F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 2);
            this.Body.setPos(0.0F, 16.5F, 0.0F);
            this.Body.addBox(-3.5F, -3.5F, -5.0F, 7.0F, 7.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.13962634015954636F, 0.0F, 0.0F);
            this.FootLeft_1 = new ModelRenderer(this, 47, 1);
            this.FootLeft_1.setPos(0.1F, 4.0F, 3.0F);
            this.FootLeft_1.addBox(-1.5F, 0.0F, -6.0F, 3.0F, 1.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft_1, -0.3186971254089062F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 0, 29);
            this.Tail1.setPos(-0.01F, 1.0F, 4.5F);
            this.Tail1.addBox(-2.5F, -0.5F, 0.0F, 5.0F, 3.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -0.3186971254089062F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 47, 1);
            this.FootLeft.mirror = true;
            this.FootLeft.setPos(-0.1F, 4.0F, 3.0F);
            this.FootLeft.addBox(-1.5F, 0.0F, -6.0F, 3.0F, 1.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, -0.3186971254089062F, 0.0F, 0.0F);
            this.HandLeft_1 = new ModelRenderer(this, 13, 59);
            this.HandLeft_1.setPos(0.1F, 2.3F, 0.8F);
            this.HandLeft_1.addBox(-1.5F, 0.0F, -4.0F, 3.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft_1, 0.17453292519943295F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 37, 31);
            this.Snout.setPos(0.0F, -0.4F, -1.7F);
            this.Snout.addBox(-1.5F, -0.5F, -2.0F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, -0.06981317007977318F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 28, 0);
            this.ThighLeft.mirror = true;
            this.ThighLeft.setPos(2.3F, 1.7F, 1.6F);
            this.ThighLeft.addBox(-2.0F, 0.0F, -2.5F, 4.0F, 5.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.15707963267948966F, 0.0F, 0.0F);
            this.Ear = new ModelRenderer(this, 54, 38);
            this.Ear.setPos(1.9F, -2.0F, 0.2F);
            this.Ear.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Ear, 0.2617993877991494F, 0.7330382858376184F, 0.0F);
            this.Neck.addChild(this.NeckBottom);
            this.Snout.addChild(this.TopSnout);
            this.Tail2.addChild(this.Tail3);
            this.Chest.addChild(this.Neck);
            this.Tail1.addChild(this.Tail2);
            this.Back.addChild(this.Hips);
            this.Body.addChild(this.Chest);
            this.Chest.addChild(this.ArmBaseLeft);
            this.Body.addChild(this.Back);
            this.Hips.addChild(this.ThighLeft_1);
            this.ArmBaseLeft.addChild(this.ArmLeft);
            this.Neck.addChild(this.Head);
            this.ThighLeft.addChild(this.LegLeft);
            this.ThighLeft_1.addChild(this.LegLeft_1);
            this.ArmBaseLeft_1.addChild(this.ArmLeft_1);
            this.Snout.addChild(this.Mouth);
            this.Chest.addChild(this.ArmBaseLeft_1);
            this.ArmLeft.addChild(this.HandLeft);
            this.Head.addChild(this.Ear_1);
            this.LegLeft_1.addChild(this.FootLeft_1);
            this.Hips.addChild(this.Tail1);
            this.LegLeft.addChild(this.FootLeft);
            this.ArmLeft_1.addChild(this.HandLeft_1);
            this.Head.addChild(this.Snout);
            this.Hips.addChild(this.ThighLeft);
            this.Head.addChild(this.Ear);
            this.saveBase();
        }

        @Override
        public void setupAnim(GiantOtterEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);

        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            }

        }
    }


    public static class Child extends GiantOtterModel {

        public ModelRenderer Hips;
        public ModelRenderer Neck;
        public ModelRenderer UpperArmLeft;
        public ModelRenderer UpperArmRight;
        public ModelRenderer Tail1;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer Tail2;
        public ModelRenderer LegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer LegRight;
        public ModelRenderer FootRight;
        public ModelRenderer Head;
        public ModelRenderer EarLeft;
        public ModelRenderer EarRight;
        public ModelRenderer Snout;
        public ModelRenderer Mouth;
        public ModelRenderer Nose;
        public ModelRenderer LowerArmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer LowerArmRight;
        public ModelRenderer HandRight;

        public Child() {
            this.texWidth = 64;
            this.texHeight = 32;
            this.UpperArmLeft = new ModelRenderer(this, 43, 0);
            this.UpperArmLeft.setPos(1.0F, -0.5F, -1.0F);
            this.UpperArmLeft.addBox(0.0F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 0, 21);
            this.Tail1.setPos(0.0F, 0.0F, 2.5F);
            this.Tail1.addBox(-1.5F, -0.5F, 0.0F, 3.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -0.591841146688116F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 14);
            this.Hips.setPos(0.0F, -1.1F, 0.5F);
            this.Hips.addBox(-2.0F, -0.5F, 0.0F, 4.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.18203784630933073F, 0.0F, 0.0F);
            this.LegLeft = new ModelRenderer(this, 33, 5);
            this.LegLeft.mirror = true;
            this.LegLeft.setPos(0.0F, 1.5F, -0.5F);
            this.LegLeft.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, 0.6829473549475088F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 60, 8);
            this.EarRight.setPos(-1.0F, -0.5F, 0.5F);
            this.EarRight.addBox(-1.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.18203784630933073F, 0.500909508638178F, 0.0F);
            this.Snout = new ModelRenderer(this, 51, 7);
            this.Snout.setPos(0.0F, 0.5F, -0.5F);
            this.Snout.addBox(-1.0F, -0.5F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 7);
            this.Body.setPos(0.0F, 21.1F, 0.0F);
            this.Body.addBox(-1.5F, -1.5F, -2.0F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.0911061832922575F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 1, 0);
            this.Neck.setPos(0.0F, -1.0F, -1.5F);
            this.Neck.addBox(-1.0F, -0.8F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.500909508638178F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 41, 8);
            this.HandRight.setPos(0.0F, 1.3F, 0.0F);
            this.HandRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.27314402127920984F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 31, 9);
            this.FootRight.setPos(0.0F, 1.5F, 0.5F);
            this.FootRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, -0.4098033003787853F, 0.0F, 0.0F);
            this.UpperArmRight = new ModelRenderer(this, 43, 0);
            this.UpperArmRight.setPos(-1.0F, -0.5F, -1.0F);
            this.UpperArmRight.addBox(-1.0F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 60, 8);
            this.EarLeft.mirror = true;
            this.EarLeft.setPos(1.0F, -0.5F, 0.5F);
            this.EarLeft.addBox(0.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.18203784630933073F, -0.500909508638178F, 0.0F);
            this.LegRight = new ModelRenderer(this, 33, 5);
            this.LegRight.setPos(0.0F, 1.5F, -0.5F);
            this.LegRight.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, 0.6829473549475088F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 52, 0);
            this.Head.setPos(0.0F, 1.0F, -1.8F);
            this.Head.addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.500909508638178F, 0.0F, 0.0F);
            this.Nose = new ModelRenderer(this, 51, 11);
            this.Nose.setPos(0.0F, 0.0F, 0.0F);
            this.Nose.addBox(-0.5F, -1.0F, -1.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Nose, 0.27314402127920984F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 31, 0);
            this.ThighLeft.mirror = true;
            this.ThighLeft.setPos(1.5F, 0.7F, 1.5F);
            this.ThighLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, -0.13665927909957545F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 58, 11);
            this.Mouth.setPos(0.0F, 1.0F, -0.4F);
            this.Mouth.addBox(-0.5F, -0.6F, -1.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, 0.04555309164612875F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 41, 8);
            this.HandLeft.setPos(0.0F, 1.3F, 0.0F);
            this.HandLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.27314402127920984F, 0.0F, 0.0F);
            this.LowerArmLeft = new ModelRenderer(this, 43, 4);
            this.LowerArmLeft.setPos(0.49F, 1.6F, 0.0F);
            this.LowerArmLeft.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerArmLeft, -0.3642502295386026F, 0.0F, 0.0F);
            this.LowerArmRight = new ModelRenderer(this, 43, 4);
            this.LowerArmRight.setPos(-0.49F, 1.5F, 0.0F);
            this.LowerArmRight.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerArmRight, -0.3642502295386026F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 8, 22);
            this.Tail2.setPos(0.0F, 0.0F, 2.5F);
            this.Tail2.addBox(-1.0F, 0.0F, -0.5F, 2.0F, 1.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, 0.3186971254089062F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 31, 0);
            this.ThighRight.setPos(-1.5F, 0.7F, 1.5F);
            this.ThighRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, -0.13665927909957545F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 31, 9);
            this.FootLeft.mirror = true;
            this.FootLeft.setPos(0.0F, 1.5F, 0.5F);
            this.FootLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, -0.4098033003787853F, 0.0F, 0.0F);
            this.Body.addChild(this.UpperArmLeft);
            this.Hips.addChild(this.Tail1);
            this.Body.addChild(this.Hips);
            this.ThighLeft.addChild(this.LegLeft);
            this.Head.addChild(this.EarRight);
            this.Head.addChild(this.Snout);
            this.Body.addChild(this.Neck);
            this.LowerArmRight.addChild(this.HandRight);
            this.LegRight.addChild(this.FootRight);
            this.Body.addChild(this.UpperArmRight);
            this.Head.addChild(this.EarLeft);
            this.ThighRight.addChild(this.LegRight);
            this.Neck.addChild(this.Head);
            this.Snout.addChild(this.Nose);
            this.Hips.addChild(this.ThighLeft);
            this.Head.addChild(this.Mouth);
            this.LowerArmLeft.addChild(this.HandLeft);
            this.UpperArmLeft.addChild(this.LowerArmLeft);
            this.UpperArmRight.addChild(this.LowerArmRight);
            this.Tail1.addChild(this.Tail2);
            this.Hips.addChild(this.ThighRight);
            this.LegLeft.addChild(this.FootLeft);
            this.saveBase();

        }

        @Override
        public void setupAnim(GiantOtterEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);

        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

        }
    }
}
