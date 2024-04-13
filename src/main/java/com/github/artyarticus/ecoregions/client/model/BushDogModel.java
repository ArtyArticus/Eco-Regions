package com.github.artyarticus.ecoregions.client.model;

import com.github.artyarticus.ecoregions.entity.BushDogEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class BushDogModel extends ZawaBaseModel<BushDogEntity> {
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

    public static class Adult extends BushDogModel {

        public ModelRenderer Neck;
        public ModelRenderer Body;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer Head;
        public ModelRenderer Neck2;
        public ModelRenderer Snout;
        public ModelRenderer Mouth;
        public ModelRenderer EarLeft;
        public ModelRenderer EarRight;
        public ModelRenderer Nose;
        public ModelRenderer Hips;
        public ModelRenderer Tail1;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer Tail2;
        public ModelRenderer UpperLegLeft;
        public ModelRenderer LegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer UpperLegRight;
        public ModelRenderer LegRight;
        public ModelRenderer FootRight;
        public ModelRenderer ArmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer ArmRight;
        public ModelRenderer HandRight;

        public Adult() {
            this.texWidth = 64;
            this.texHeight = 32;
            this.EarRight = new ModelRenderer(this, 0, 21);
            this.EarRight.setPos(-1.6F, -1.0F, 0.5F);
            this.EarRight.addBox(-0.5F, -1.3F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.0911061832922575F, 0.2275909337942703F, -0.18203784630933073F);
            this.FootRight = new ModelRenderer(this, 56, 22);
            this.FootRight.setPos(0.01F, 1.5F, -0.5F);
            this.FootRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 14, 8);
            this.ArmBaseRight.setPos(-1.5F, 1.5F, 0.2F);
            this.ArmBaseRight.addBox(-1.1F, -0.5F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.2275909337942703F, 0.0F, 0.0F);
            this.LegRight = new ModelRenderer(this, 56, 18);
            this.LegRight.setPos(0.01F, 1.5F, 1.5F);
            this.LegRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, -0.3186971254089062F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 14, 8);
            this.ArmBaseLeft.mirror = true;
            this.ArmBaseLeft.setPos(1.5F, 1.5F, 0.2F);
            this.ArmBaseLeft.addBox(-0.9F, -0.5F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.2275909337942703F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 14, 17);
            this.HandLeft.mirror = true;
            this.HandLeft.setPos(-0.01F, 2.1F, -0.5F);
            this.HandLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 10, 0);
            this.Hips.setPos(0.0F, 0.1F, 5.5F);
            this.Hips.addBox(-2.5F, -0.5F, -0.5F, 5.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.04555309164612875F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 50, 0);
            this.Chest.setPos(0.0F, 18.0F, -3.0F);
            this.Chest.addBox(-2.5F, -2.5F, -1.0F, 5.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.04555309164612875F, 0.0F, 0.0F);
            this.Neck2 = new ModelRenderer(this, 16, 27);
            this.Neck2.setPos(0.0F, 1.9F, 0.0F);
            this.Neck2.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck2, -0.2275909337942703F, 0.0F, 0.0F);
            this.LegLeft = new ModelRenderer(this, 56, 18);
            this.LegLeft.mirror = true;
            this.LegLeft.setPos(-0.01F, 1.5F, 1.5F);
            this.LegLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, -0.3186971254089062F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 14, 12);
            this.ArmRight.setPos(0.01F, 1.5F, 0.5F);
            this.ArmRight.addBox(-1.0F, -0.5F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.18203784630933073F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 14, 17);
            this.HandRight.setPos(0.01F, 2.1F, -0.5F);
            this.HandRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 0, 21);
            this.EarLeft.mirror = true;
            this.EarLeft.setPos(1.5F, -1.0F, 0.5F);
            this.EarLeft.addBox(-0.5F, -1.3F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.0911061832922575F, -0.2275909337942703F, 0.18203784630933073F);
            this.Body = new ModelRenderer(this, 26, 0);
            this.Body.setPos(0.0F, -2.1F, 1.0F);
            this.Body.addBox(-3.0F, -0.5F, -0.5F, 6.0F, 5.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.04555309164612875F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 56, 14);
            this.UpperLegRight.setPos(0.5F, 3.5F, -1.0F);
            this.UpperLegRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.3642502295386026F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 52, 7);
            this.ThighLeft.mirror = true;
            this.ThighLeft.setPos(2.0F, 1.0F, 1.1F);
            this.ThighLeft.addBox(-1.9F, 0.0F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 52, 7);
            this.ThighRight.setPos(-2.0F, 1.0F, 1.1F);
            this.ThighRight.addBox(-1.1F, 0.0F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 28, 25);
            this.Neck.setPos(0.0F, -2.0F, -0.5F);
            this.Neck.addBox(-1.5F, -0.79F, -2.0F, 3.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.2275909337942703F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 56, 22);
            this.FootLeft.setPos(-0.01F, 1.5F, -0.5F);
            this.FootLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 0, 24);
            this.Head.setPos(0.0F, 1.5F, -2.4F);
            this.Head.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.3642502295386026F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 4, 20);
            this.Snout.setPos(0.0F, -0.1F, -1.65F);
            this.Snout.addBox(-1.0F, -0.5F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.2275909337942703F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 14, 12);
            this.ArmLeft.mirror = true;
            this.ArmLeft.setPos(-0.01F, 1.5F, 0.5F);
            this.ArmLeft.addBox(-1.0F, -0.5F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.18203784630933073F, 0.0F, 0.0F);
            this.Nose = new ModelRenderer(this, 6, 16);
            this.Nose.setPos(0.0F, 0.0F, 0.0F);
            this.Nose.addBox(-0.5F, -0.9F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Nose, 0.18203784630933073F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 0, 5);
            this.Tail2.setPos(-0.01F, 0.0F, 2.5F);
            this.Tail2.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, 0.27314402127920984F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 0, 0);
            this.Tail1.setPos(0.0F, 0.0F, 2.0F);
            this.Tail1.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -1.1383037594559906F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 0, 16);
            this.Mouth.setPos(0.0F, 1.6F, -1.6F);
            this.Mouth.addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.0911061832922575F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 56, 14);
            this.UpperLegLeft.mirror = true;
            this.UpperLegLeft.setPos(-0.5F, 3.5F, -1.0F);
            this.UpperLegLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.3642502295386026F, 0.0F, 0.0F);
            this.Head.addChild(this.EarRight);
            this.LegRight.addChild(this.FootRight);
            this.Chest.addChild(this.ArmBaseRight);
            this.UpperLegRight.addChild(this.LegRight);
            this.Chest.addChild(this.ArmBaseLeft);
            this.ArmLeft.addChild(this.HandLeft);
            this.Body.addChild(this.Hips);
            this.Neck.addChild(this.Neck2);
            this.UpperLegLeft.addChild(this.LegLeft);
            this.ArmBaseRight.addChild(this.ArmRight);
            this.ArmRight.addChild(this.HandRight);
            this.Head.addChild(this.EarLeft);
            this.Chest.addChild(this.Body);
            this.ThighRight.addChild(this.UpperLegRight);
            this.Hips.addChild(this.ThighLeft);
            this.Hips.addChild(this.ThighRight);
            this.Chest.addChild(this.Neck);
            this.LegLeft.addChild(this.FootLeft);
            this.Neck.addChild(this.Head);
            this.Head.addChild(this.Snout);
            this.ArmBaseLeft.addChild(this.ArmLeft);
            this.Snout.addChild(this.Nose);
            this.Tail1.addChild(this.Tail2);
            this.Hips.addChild(this.Tail1);
            this.Head.addChild(this.Mouth);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.saveBase();
        }

        @Override
        public void setupAnim(BushDogEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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


    public static class Child extends BushDogModel {

        public ModelRenderer Neck;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer Tail;
        public ModelRenderer Head;
        public ModelRenderer Snout;
        public ModelRenderer Mouth;
        public ModelRenderer EarLeft;
        public ModelRenderer EarRight;
        public ModelRenderer Nose;
        public ModelRenderer ArmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer ArmRight;
        public ModelRenderer HandRight;
        public ModelRenderer LegRight;
        public ModelRenderer FootRight;
        public ModelRenderer LegRight_1;
        public ModelRenderer FootLeft;

        public Child() {
            this.texWidth = 32;
            this.texHeight = 16;
            this.ThighLeft = new ModelRenderer(this, 19, 5);
            this.ThighLeft.setPos(1.1F, 0.0F, 2.9F);
            this.ThighLeft.addBox(-0.5F, -0.4F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 14, 5);
            this.ArmBaseRight.setPos(-1.1F, 0.5F, -1.3F);
            this.ArmBaseRight.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.18203784630933073F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 12, 0);
            this.Neck.setPos(0.0F, -0.7F, -1.5F);
            this.Neck.addBox(-1.0F, -0.9F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.45535640450848164F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 19, 5);
            this.ThighRight.setPos(-1.1F, 0.0F, 2.9F);
            this.ThighRight.addBox(-0.5F, -0.4F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 8, 0);
            this.EarRight.setPos(-0.9F, -0.25F, -0.4F);
            this.EarRight.addBox(-0.5F, -1.4F, -0.3F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, -0.04555309164612875F, 0.3186971254089062F, -0.591841146688116F);
            this.FootRight = new ModelRenderer(this, 20, 12);
            this.FootRight.setPos(-0.01F, 1.5F, 0.3F);
            this.FootRight.addBox(-0.5F, 0.0F, -1.1F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, 0.18203784630933073F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 14, 10);
            this.HandLeft.setPos(-0.01F, 1.0F, 0.0F);
            this.HandLeft.addBox(-0.5F, 0.0F, -0.8F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.18203784630933073F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 22, 0);
            this.Head.setPos(0.0F, 0.5F, -1.2F);
            this.Head.addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.5462880425584197F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 14, 10);
            this.HandRight.setPos(0.01F, 1.0F, 0.0F);
            this.HandRight.addBox(-0.5F, 0.0F, -0.8F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.18203784630933073F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 14, 5);
            this.ArmBaseLeft.setPos(1.1F, 0.5F, -1.3F);
            this.ArmBaseLeft.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.18203784630933073F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 8, 0);
            this.EarLeft.setPos(0.9F, -0.25F, -0.4F);
            this.EarLeft.addBox(-0.5F, -1.4F, -0.3F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, -0.04555309164612875F, -0.3186971254089062F, 0.591841146688116F);
            this.Nose = new ModelRenderer(this, 0, 0);
            this.Nose.setPos(0.0F, -0.5F, 0.0F);
            this.Nose.addBox(-0.5F, -0.5F, -1.6F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Nose, 0.3186971254089062F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 7);
            this.Chest.setPos(0.0F, 20.5F, 0.0F);
            this.Chest.addBox(-1.5F, -1.5F, -2.0F, 3.0F, 3.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 14, 7);
            this.ArmRight.setPos(0.01F, 1.0F, 0.0F);
            this.ArmRight.addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.3642502295386026F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 5, 3);
            this.Snout.setPos(0.0F, 0.8F, -0.9F);
            this.Snout.addBox(-1.0F, -0.5F, -1.4F, 2.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, -0.04555309164612875F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 14, 7);
            this.ArmLeft.setPos(-0.01F, 1.0F, 0.0F);
            this.ArmLeft.addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.3642502295386026F, 0.0F, 0.0F);
            this.LegRight = new ModelRenderer(this, 19, 9);
            this.LegRight.setPos(-0.01F, 1.1F, 0.5F);
            this.LegRight.addBox(-0.5F, 0.0F, -0.3F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, -0.18203784630933073F, 0.0F, 0.0F);
            this.LegRight_1 = new ModelRenderer(this, 19, 9);
            this.LegRight_1.setPos(0.01F, 1.1F, 0.5F);
            this.LegRight_1.addBox(-0.5F, 0.0F, -0.3F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight_1, -0.18203784630933073F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 0, 3);
            this.Mouth.setPos(0.0F, 1.0F, -1.0F);
            this.Mouth.addBox(-0.5F, -0.5F, -1.3F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.Tail = new ModelRenderer(this, 24, 11);
            this.Tail.setPos(0.0F, -1.0F, 3.5F);
            this.Tail.addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail, -1.2292353975059285F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 20, 12);
            this.FootLeft.setPos(0.01F, 1.5F, 0.3F);
            this.FootLeft.addBox(-0.5F, 0.0F, -1.1F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 0.18203784630933073F, 0.0F, 0.0F);
            this.Chest.addChild(this.ThighLeft);
            this.Chest.addChild(this.ArmBaseRight);
            this.Chest.addChild(this.Neck);
            this.Chest.addChild(this.ThighRight);
            this.Head.addChild(this.EarRight);
            this.LegRight.addChild(this.FootRight);
            this.ArmLeft.addChild(this.HandLeft);
            this.Neck.addChild(this.Head);
            this.ArmRight.addChild(this.HandRight);
            this.Chest.addChild(this.ArmBaseLeft);
            this.Head.addChild(this.EarLeft);
            this.Snout.addChild(this.Nose);
            this.ArmBaseRight.addChild(this.ArmRight);
            this.Head.addChild(this.Snout);
            this.ArmBaseLeft.addChild(this.ArmLeft);
            this.ThighLeft.addChild(this.LegRight);
            this.ThighRight.addChild(this.LegRight_1);
            this.Head.addChild(this.Mouth);
            this.Chest.addChild(this.Tail);
            this.LegRight_1.addChild(this.FootLeft);
            this.saveBase();

        }

        @Override
        public void setupAnim(BushDogEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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


