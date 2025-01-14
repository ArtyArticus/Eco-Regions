package com.github.artyarticus.ecoregions.client.model;

import com.github.artyarticus.ecoregions.entity.TeguEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class TeguModel extends ZawaBaseModel<TeguEntity> {
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

    public static class Adult extends TeguModel {

        public ModelRenderer Hips;
        public ModelRenderer UpperArmLeft;
        public ModelRenderer Neck;
        public ModelRenderer UpperArmRight;
        public ModelRenderer Tail1;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer Tail2;
        public ModelRenderer Tail3;
        public ModelRenderer LegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer ToeLeft1;
        public ModelRenderer ToeLeft2;
        public ModelRenderer LegRight;
        public ModelRenderer FootRight;
        public ModelRenderer ToeRight1;
        public ModelRenderer ToeRight2;
        public ModelRenderer ArmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer FingerLeft1;
        public ModelRenderer FingerLeft2;
        public ModelRenderer Head;
        public ModelRenderer NeckLower;
        public ModelRenderer Snout;
        public ModelRenderer Throat;
        public ModelRenderer TopSnout;
        public ModelRenderer Mouth;
        public ModelRenderer ArmRight;
        public ModelRenderer HandRight;
        public ModelRenderer FingerRight1;
        public ModelRenderer FingerRight2;

        public Adult() {
            this.texWidth = 64;
            this.texHeight = 64;
            this.Body = new ModelRenderer(this, 34, 24);
            this.Body.setPos(0.0F, 19.1F, -6.0F);
            this.Body.addBox(-2.5F, -3.0F, -2.0F, 5.0F, 6.0F, 10.0F, 0.0F, 0.0F, 0.0F);
            this.Tail3 = new ModelRenderer(this, 18, 12);
            this.Tail3.setPos(0.01F, 0.5F, 7.0F);
            this.Tail3.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 10.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail3, 0.2275909337942703F, 0.0F, 0.0F);
            this.LegRight = new ModelRenderer(this, 33, 1);
            this.LegRight.setPos(0.5F, 3.5F, -0.5F);
            this.LegRight.addBox(0.0F, 0.0F, 0.0F, 1.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, 0.8726646259971648F, 0.0F, -0.2617993877991494F);
            this.Hips = new ModelRenderer(this, 48, 15);
            this.Hips.setPos(0.0F, -2.5F, 7.5F);
            this.Hips.addBox(-2.0F, -0.5F, 0.0F, 4.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.20839230536442993F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 51, 0);
            this.FootLeft.mirror = true;
            this.FootLeft.setPos(-0.49F, 3.2F, -0.1F);
            this.FootLeft.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, -0.28658306450904947F, 0.19547687289441354F, 0.3909537457888271F);
            this.FingerLeft2 = new ModelRenderer(this, 6, 8);
            this.FingerLeft2.setPos(-0.5F, 0.0F, 0.5F);
            this.FingerLeft2.addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FingerLeft2, 0.0F, 0.3490658503988659F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 19, 0);
            this.Tail2.setPos(0.0F, 0.0F, 6.5F);
            this.Tail2.addBox(-1.0F, 0.0F, -0.5F, 2.0F, 3.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, 0.18203784630933073F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 44, 4);
            this.Tail1.setPos(0.0F, 0.1F, 3.5F);
            this.Tail1.addBox(-1.5F, -0.5F, 0.0F, 3.0F, 4.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -0.20734511713429715F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 14, 4);
            this.ArmLeft.mirror = true;
            this.ArmLeft.setPos(3.1F, 0.5F, 0.49F);
            this.ArmLeft.addBox(-0.2F, 0.0F, -1.0F, 3.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, 0.0F, 0.3642502295386026F, 0.6981317007977318F);
            this.ToeLeft2 = new ModelRenderer(this, 6, 8);
            this.ToeLeft2.setPos(-0.5F, 0.1F, 0.5F);
            this.ToeLeft2.addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ToeLeft2, -0.05235987755982988F, 0.3490658503988659F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 2, 16);
            this.TopSnout.setPos(0.0F, 0.2F, 0.3F);
            this.TopSnout.addBox(-1.5F, -1.3F, -3.0F, 3.0F, 1.0F, 3.0F, -0.01F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.20839230536442993F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 2, 16);
            this.Snout.setPos(0.0F, -0.8F, -1.7F);
            this.Snout.addBox(-1.5F, -0.5F, -3.0F, 3.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.2275909337942703F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 40, 0);
            this.ThighRight.setPos(-1.5F, 1.0F, 2.0F);
            this.ThighRight.addBox(0.0F, 0.0F, -0.5F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.0F, 0.415388348658845F, 0.8726646259971648F);
            this.Mouth = new ModelRenderer(this, 3, 10);
            this.Mouth.setPos(0.0F, 2.1F, -0.4F);
            this.Mouth.addBox(-1.0F, -0.5F, -2.6F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.13700834461707917F, 0.0F, 0.0F);
            this.ToeRight1 = new ModelRenderer(this, 6, 8);
            this.ToeRight1.setPos(0.5F, 0.0F, 0.5F);
            this.ToeRight1.addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ToeRight1, 0.05235987755982988F, -0.3490658503988659F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 14, 4);
            this.ArmRight.setPos(-3.1F, 0.5F, 0.49F);
            this.ArmRight.addBox(-2.8F, 0.0F, -1.0F, 3.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, 0.0F, -0.3642502295386026F, -0.6981317007977318F);
            this.Throat = new ModelRenderer(this, 15, 32);
            this.Throat.setPos(0.0F, 0.4F, 0.1F);
            this.Throat.addBox(-2.5F, -1.1F, -1.3F, 5.0F, 4.0F, 4.0F, -0.2F, -0.2F, -0.2F);
            this.setRotateAngle(Throat, -0.500909508638178F, 0.0F, 0.0F);
            this.UpperArmLeft = new ModelRenderer(this, 13, 0);
            this.UpperArmLeft.mirror = true;
            this.UpperArmLeft.setPos(2.0F, -0.7F, -1.0F);
            this.UpperArmLeft.addBox(-0.5F, 0.0F, -0.5F, 4.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmLeft, 0.0F, -0.08726646259971647F, 0.8726646259971648F);
            this.Head = new ModelRenderer(this, 0, 21);
            this.Head.setPos(0.0F, 1.5F, -3.2F);
            this.Head.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.3642502295386026F, 0.0F, 0.0F);
            this.UpperArmRight = new ModelRenderer(this, 13, 0);
            this.UpperArmRight.setPos(-2.0F, -0.7F, -1.0F);
            this.UpperArmRight.addBox(-3.5F, 0.0F, -0.5F, 4.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmRight, 0.0F, 0.08726646259971647F, -0.8726646259971648F);
            this.FingerRight2 = new ModelRenderer(this, 6, 8);
            this.FingerRight2.setPos(-0.5F, 0.0F, 0.5F);
            this.FingerRight2.addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FingerRight2, 0.0F, 0.3490658503988659F, 0.0F);
            this.ToeLeft1 = new ModelRenderer(this, 6, 8);
            this.ToeLeft1.setPos(0.5F, 0.0F, 0.5F);
            this.ToeLeft1.addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ToeLeft1, 0.05235987755982988F, -0.3490658503988659F, 0.0F);
            this.Neck = new ModelRenderer(this, 1, 30);
            this.Neck.setPos(0.0F, -2.5F, -2.0F);
            this.Neck.addBox(-1.5F, -1.0F, -2.1F, 3.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.2275909337942703F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 40, 0);
            this.ThighLeft.mirror = true;
            this.ThighLeft.setPos(1.5F, 1.0F, 2.0F);
            this.ThighLeft.addBox(-2.0F, 0.0F, -0.5F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.0F, -0.415388348658845F, -0.8726646259971648F);
            this.HandLeft = new ModelRenderer(this, 0, 8);
            this.HandLeft.mirror = true;
            this.HandLeft.setPos(2.5F, 0.49F, -0.5F);
            this.HandLeft.addBox(-0.5F, -0.01F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.34487706418882114F, -0.04555309164612875F, -1.5481069932557485F);
            this.NeckLower = new ModelRenderer(this, 0, 0);
            this.NeckLower.setPos(0.0F, 3.8F, -1.0F);
            this.NeckLower.addBox(-1.0F, -1.5F, -2.4F, 2.0F, 2.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckLower, -0.3579670335787786F, 0.0F, 0.0F);
            this.FingerLeft1 = new ModelRenderer(this, 6, 8);
            this.FingerLeft1.setPos(0.5F, 0.0F, 0.5F);
            this.FingerLeft1.addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FingerLeft1, 0.0F, -0.3490658503988659F, 0.0F);
            this.FootRight = new ModelRenderer(this, 51, 0);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.49F, 3.2F, -0.1F);
            this.FootRight.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, -0.28658306450904947F, -0.19547687289441354F, -0.3909537457888271F);
            this.LegLeft = new ModelRenderer(this, 33, 1);
            this.LegLeft.mirror = true;
            this.LegLeft.setPos(-0.5F, 3.5F, -0.5F);
            this.LegLeft.addBox(-1.0F, 0.0F, 0.0F, 1.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, 0.8726646259971648F, 0.0F, 0.2617993877991494F);
            this.HandRight = new ModelRenderer(this, 0, 8);
            this.HandRight.mirror = true;
            this.HandRight.setPos(-2.5F, 0.49F, -0.5F);
            this.HandRight.addBox(-0.5F, -0.01F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.34487706418882114F, 0.04555309164612875F, 1.5481069932557485F);
            this.ToeRight2 = new ModelRenderer(this, 6, 8);
            this.ToeRight2.setPos(-0.5F, 0.1F, 0.5F);
            this.ToeRight2.addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ToeRight2, -0.05235987755982988F, 0.3490658503988659F, 0.0F);
            this.FingerRight1 = new ModelRenderer(this, 6, 8);
            this.FingerRight1.setPos(0.5F, 0.0F, 0.5F);
            this.FingerRight1.addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FingerRight1, 0.0F, -0.3490658503988659F, 0.0F);
            this.Tail2.addChild(this.Tail3);
            this.ThighRight.addChild(this.LegRight);
            this.Body.addChild(this.Hips);
            this.LegLeft.addChild(this.FootLeft);
            this.HandLeft.addChild(this.FingerLeft2);
            this.Tail1.addChild(this.Tail2);
            this.Hips.addChild(this.Tail1);
            this.UpperArmLeft.addChild(this.ArmLeft);
            this.FootLeft.addChild(this.ToeLeft2);
            this.Snout.addChild(this.TopSnout);
            this.Head.addChild(this.Snout);
            this.Hips.addChild(this.ThighRight);
            this.Snout.addChild(this.Mouth);
            this.FootRight.addChild(this.ToeRight1);
            this.UpperArmRight.addChild(this.ArmRight);
            this.Head.addChild(this.Throat);
            this.Body.addChild(this.UpperArmLeft);
            this.Neck.addChild(this.Head);
            this.Body.addChild(this.UpperArmRight);
            this.HandRight.addChild(this.FingerRight2);
            this.FootLeft.addChild(this.ToeLeft1);
            this.Body.addChild(this.Neck);
            this.Hips.addChild(this.ThighLeft);
            this.ArmLeft.addChild(this.HandLeft);
            this.Neck.addChild(this.NeckLower);
            this.HandLeft.addChild(this.FingerLeft1);
            this.LegRight.addChild(this.FootRight);
            this.ThighLeft.addChild(this.LegLeft);
            this.ArmRight.addChild(this.HandRight);
            this.FootRight.addChild(this.ToeRight2);
            this.HandRight.addChild(this.FingerRight1);
            this.saveBase();
        }

        @Override
        public void setupAnim(TeguEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.364F;
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 1.0f;
            float degree = 1.0f;
            this.Tail1.yRot = MathHelper.cos(-2.0F + limbSwing * speed * 0.08F) * degree * 0.1F * limbSwingAmount;
            this.Tail2.yRot = MathHelper.cos(-3.0F + limbSwing * speed * 0.08F) * degree * 0.1F * limbSwingAmount;
            this.Tail3.yRot = MathHelper.cos(limbSwing * speed * 0.08F) * degree * 0.1F * limbSwingAmount;
            this.Tail1.xRot = MathHelper.cos(limbSwing * speed * 0.16F) * degree * 0.05F * limbSwingAmount - 0.207F;
            this.Neck.xRot = MathHelper.cos(limbSwing * speed * 0.1F) * degree * 0.1F * limbSwingAmount -0.228F;
            this.Head.xRot = MathHelper.cos(limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount + 0.364F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 4.0f;
            float degree = 0.7f;
            this.UpperArmLeft.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount;
            this.ArmLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount;
            this.HandLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.345F;

            this.ThighLeft.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount;
            this.LegLeft.xRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.873F;
            this.FootLeft.xRot = MathHelper.cos(-2.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount - 0.287F;

            this.UpperArmRight.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount;
            this.ArmRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount;
            this.HandRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.345F;

            this.ThighRight.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount;
            this.LegRight.xRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.873F;
            this.FootRight.xRot = MathHelper.cos(-2.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount - 0.287F;

            this.Body.yRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount;
            this.Neck.yRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * degree * -0.2F * limbSwingAmount - 0.227F;
            this.Head.yRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount + 0.364F;
            this.Hips.yRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount - 0.208F;
            this.Tail1.yRot = MathHelper.cos(-2.0F + limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount;
            this.Tail2.yRot = MathHelper.cos(-3.0F + limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount;
            this.Tail3.yRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount;
        }
    }


    public static class Child extends TeguModel {

        public ModelRenderer Neck;
        public ModelRenderer Tail1;
        public ModelRenderer UpperArmLeft;
        public ModelRenderer ThighLeft;
        public ModelRenderer UpperArmRight;
        public ModelRenderer ThighRight;
        public ModelRenderer Head;
        public ModelRenderer Snout;
        public ModelRenderer SnoutTop;
        public ModelRenderer Mouth;
        public ModelRenderer Tail2;
        public ModelRenderer ArmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer FingerLeft1;
        public ModelRenderer FingerLeft2;
        public ModelRenderer LegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer ToeLeft1;
        public ModelRenderer ToeLeft2;
        public ModelRenderer ArmRight;
        public ModelRenderer HandRight;
        public ModelRenderer FingerLeft1_1;
        public ModelRenderer FingerLeft2_1;
        public ModelRenderer LegRight;
        public ModelRenderer FootRight;
        public ModelRenderer ToeRight1;
        public ModelRenderer ToeRight2;
        public Child() {
            this.texWidth = 32;
            this.texHeight = 32;
            this.UpperArmLeft = new ModelRenderer(this, 13, 14);
            this.UpperArmLeft.mirror = true;
            this.UpperArmLeft.setPos(1.4F, 1.0F, -2.1F);
            this.UpperArmLeft.addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmLeft, 0.2617993877991494F, -0.08726646259971647F, -0.8726646259971648F);
            this.Head = new ModelRenderer(this, 0, 0);
            this.Head.setPos(0.0F, 1.3F, -2.5F);
            this.Head.addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.3186971254089062F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 0, 6);
            this.Neck.setPos(0.0F, -1.2F, -2.5F);
            this.Neck.addBox(-1.0F, -0.5F, -2.0F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, -0.2F);
            this.setRotateAngle(Neck, -0.2275909337942703F, 0.0F, 0.0F);
            this.ToeRight1 = new ModelRenderer(this, 25, 18);
            this.ToeRight1.setPos(0.5F, 0.0F, 0.5F);
            this.ToeRight1.addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ToeRight1, 0.0F, -0.3490658503988659F, 0.0F);
            this.ToeLeft2 = new ModelRenderer(this, 25, 18);
            this.ToeLeft2.setPos(-0.5F, 0.0F, 0.5F);
            this.ToeLeft2.addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ToeLeft2, 0.0F, 0.3490658503988659F, 0.0F);
            this.LegRight = new ModelRenderer(this, 7, 18);
            this.LegRight.mirror = true;
            this.LegRight.setPos(0.0F, 1.1F, 0.0F);
            this.LegRight.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, 0.3490658503988659F, 0.0F, -0.6981317007977318F);
            this.ToeLeft1 = new ModelRenderer(this, 25, 18);
            this.ToeLeft1.setPos(0.5F, 0.0F, 0.5F);
            this.ToeLeft1.addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ToeLeft1, 0.0F, -0.3490658503988659F, 0.0F);
            this.FingerLeft2_1 = new ModelRenderer(this, 25, 18);
            this.FingerLeft2_1.setPos(-0.5F, 0.0F, 0.5F);
            this.FingerLeft2_1.addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FingerLeft2_1, 0.0F, 0.3490658503988659F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 25, 18);
            this.HandLeft.mirror = true;
            this.HandLeft.setPos(0.1F, 0.4F, -0.5F);
            this.HandLeft.addBox(-0.5F, -0.01F, -0.4F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.4F);
            this.setRotateAngle(HandLeft, 0.19198621771937624F, 0.0F, 0.17453292519943295F);
            this.ThighRight = new ModelRenderer(this, 7, 14);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-1.1F, 0.7F, 3.2F);
            this.ThighRight.addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.3790855015489435F, 0.08726646259971647F, 0.8726646259971648F);
            this.LegLeft = new ModelRenderer(this, 7, 18);
            this.LegLeft.mirror = true;
            this.LegLeft.setPos(0.0F, 1.1F, 0.0F);
            this.LegLeft.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, 0.3490658503988659F, 0.0F, 0.6981317007977318F);
            this.FootRight = new ModelRenderer(this, 25, 18);
            this.FootRight.mirror = true;
            this.FootRight.setPos(-0.2F, 0.3F, -0.4F);
            this.FootRight.addBox(-0.5F, -0.01F, -0.4F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.4F);
            this.setRotateAngle(FootRight, -0.47263516010848383F, 0.0F, -0.17453292519943295F);
            this.Body = new ModelRenderer(this, 0, 22);
            this.Body.setPos(0.0F, 21.3F, -2.0F);
            this.Body.addBox(-1.5F, -1.5F, -3.0F, 3.0F, 3.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 13, 18);
            this.ArmRight.setPos(0.0F, 1.1F, 0.0F);
            this.ArmRight.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.3490658503988659F, 0.0F, -0.6981317007977318F);
            this.FootLeft = new ModelRenderer(this, 25, 18);
            this.FootLeft.mirror = true;
            this.FootLeft.setPos(0.2F, 0.3F, -0.4F);
            this.FootLeft.addBox(-0.5F, -0.01F, -0.4F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.4F);
            this.setRotateAngle(FootLeft, -0.47263516010848383F, 0.0F, 0.17453292519943295F);
            this.FingerLeft1 = new ModelRenderer(this, 25, 18);
            this.FingerLeft1.setPos(0.5F, 0.0F, 0.5F);
            this.FingerLeft1.addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FingerLeft1, 0.0F, -0.3490658503988659F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 13, 18);
            this.ArmLeft.mirror = true;
            this.ArmLeft.setPos(0.0F, 1.1F, 0.0F);
            this.ArmLeft.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.3490658503988659F, 0.0F, 0.6981317007977318F);
            this.ToeRight2 = new ModelRenderer(this, 25, 18);
            this.ToeRight2.setPos(-0.5F, 0.0F, 0.5F);
            this.ToeRight2.addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ToeRight2, 0.0F, 0.3490658503988659F, 0.0F);
            this.SnoutTop = new ModelRenderer(this, 11, 7);
            this.SnoutTop.setPos(0.0F, 0.3F, 0.2F);
            this.SnoutTop.addBox(-1.0F, -1.5F, -2.0F, 2.0F, 1.0F, 2.0F, -0.01F, 0.0F, 0.0F);
            this.setRotateAngle(SnoutTop, 0.3380702907586876F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 14, 0);
            this.Mouth.setPos(0.0F, 0.2F, -0.8F);
            this.Mouth.addBox(-1.0F, 0.0F, -1.2F, 2.0F, 1.0F, 2.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.13665927909957545F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 7, 14);
            this.ThighLeft.mirror = true;
            this.ThighLeft.setPos(1.1F, 0.7F, 3.2F);
            this.ThighLeft.addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.3790855015489435F, -0.08726646259971647F, -0.8726646259971648F);
            this.HandRight = new ModelRenderer(this, 25, 18);
            this.HandRight.setPos(0.1F, 0.4F, -0.5F);
            this.HandRight.addBox(-0.5F, -0.01F, -0.4F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.4F);
            this.setRotateAngle(HandRight, 0.19198621771937624F, 0.0F, -0.17453292519943295F);
            this.Tail2 = new ModelRenderer(this, 10, 7);
            this.Tail2.setPos(0.0F, 0.5F, 4.5F);
            this.Tail2.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 10.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, 0.13665927909957545F, 0.0F, 0.0F);
            this.FingerLeft2 = new ModelRenderer(this, 25, 18);
            this.FingerLeft2.setPos(-0.5F, 0.0F, 0.5F);
            this.FingerLeft2.addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FingerLeft2, 0.0F, 0.3490658503988659F, 0.0F);
            this.UpperArmRight = new ModelRenderer(this, 13, 14);
            this.UpperArmRight.setPos(-1.4F, 1.0F, -2.1F);
            this.UpperArmRight.addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmRight, 0.2617993877991494F, 0.08726646259971647F, 0.8726646259971648F);
            this.Snout = new ModelRenderer(this, 0, 19);
            this.Snout.setPos(0.0F, 0.0F, -1.0F);
            this.Snout.addBox(-1.0F, -0.6F, -2.2F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.18901915665940536F, 0.0F, 0.0F);
            this.FingerLeft1_1 = new ModelRenderer(this, 25, 18);
            this.FingerLeft1_1.setPos(0.5F, 0.0F, 0.5F);
            this.FingerLeft1_1.addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FingerLeft1_1, 0.0F, -0.3490658503988659F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 18, 0);
            this.Tail1.setPos(0.0F, -1.0F, 4.0F);
            this.Tail1.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -0.2275909337942703F, 0.0F, 0.0F);
            this.Body.addChild(this.UpperArmLeft);
            this.Neck.addChild(this.Head);
            this.Body.addChild(this.Neck);
            this.FootRight.addChild(this.ToeRight1);
            this.FootLeft.addChild(this.ToeLeft2);
            this.ThighRight.addChild(this.LegRight);
            this.FootLeft.addChild(this.ToeLeft1);
            this.HandRight.addChild(this.FingerLeft2_1);
            this.ArmLeft.addChild(this.HandLeft);
            this.Body.addChild(this.ThighRight);
            this.ThighLeft.addChild(this.LegLeft);
            this.LegRight.addChild(this.FootRight);
            this.UpperArmRight.addChild(this.ArmRight);
            this.LegLeft.addChild(this.FootLeft);
            this.HandLeft.addChild(this.FingerLeft1);
            this.UpperArmLeft.addChild(this.ArmLeft);
            this.FootRight.addChild(this.ToeRight2);
            this.Snout.addChild(this.SnoutTop);
            this.Snout.addChild(this.Mouth);
            this.Body.addChild(this.ThighLeft);
            this.ArmRight.addChild(this.HandRight);
            this.Tail1.addChild(this.Tail2);
            this.HandLeft.addChild(this.FingerLeft2);
            this.Body.addChild(this.UpperArmRight);
            this.Head.addChild(this.Snout);
            this.HandRight.addChild(this.FingerLeft1_1);
            this.Body.addChild(this.Tail1);
            this.saveBase();

        }

        @Override
        public void setupAnim(TeguEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.364F;
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 1.0f;
            float degree = 1.0f;
            this.Tail1.yRot = MathHelper.cos(-2.0F + limbSwing * speed * 0.08F) * degree * 0.1F * limbSwingAmount;
            this.Tail2.yRot = MathHelper.cos(-3.0F + limbSwing * speed * 0.08F) * degree * 0.1F * limbSwingAmount;
            this.Tail1.xRot = MathHelper.cos(limbSwing * speed * 0.16F) * degree * 0.05F * limbSwingAmount - 0.228F;
            this.Neck.xRot = MathHelper.cos(limbSwing * speed * 0.1F) * degree * 0.1F * limbSwingAmount - 0.228F;
            this.Head.xRot = MathHelper.cos(limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount + 0.318F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 4.0f;
            float degree = 0.7f;
            this.UpperArmLeft.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.261F;
            this.ArmLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount - 0.349F;
            this.HandLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.192F;

            this.ThighLeft.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.379F;
            this.LegLeft.xRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.349F;
            this.FootLeft.xRot = MathHelper.cos(-2.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount - 0.472F;

            this.UpperArmRight.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.261F;
            this.ArmRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount - 0.349F;
            this.HandRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.192F;

            this.ThighRight.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.379F;
            this.LegRight.xRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.349F;
            this.FootRight.xRot = MathHelper.cos(-2.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount - 0.472F;

            this.Body.yRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount;
            this.Neck.yRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * degree * -0.2F * limbSwingAmount - 0.228F;
            this.Head.yRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount + 0.318F;
            this.Tail1.yRot = MathHelper.cos(-2.0F + limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount;
            this.Tail2.yRot = MathHelper.cos(-3.0F + limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount;
        }
    }
}
