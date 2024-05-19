package com.github.artyarticus.ecoregions.client.model;

import com.github.artyarticus.ecoregions.entity.BlackbuckEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class BlackbuckModel extends ZawaBaseModel<BlackbuckEntity> {
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

    public static class Adult extends BlackbuckModel {

        public ModelRenderer Body;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer Neck;
        public ModelRenderer Hips;
        public ModelRenderer Tail;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer UpperLegLeft;
        public ModelRenderer LowerLegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer UpperLegLeft_1;
        public ModelRenderer LowerLegLeft_1;
        public ModelRenderer FootRight;
        public ModelRenderer UpperArmLeft;
        public ModelRenderer ArmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer UpperArmRight;
        public ModelRenderer ArmRight;
        public ModelRenderer HandRight;
        public ModelRenderer NeckBase;
        public ModelRenderer Head;
        public ModelRenderer EarLeft;
        public ModelRenderer Snout;
        public ModelRenderer EarRight;
        public ModelRenderer Horn1Left;
        public ModelRenderer Horn1Right;
        public ModelRenderer TopSnout;
        public ModelRenderer Mouth;
        public ModelRenderer Horn2Left;
        public ModelRenderer Horn3Left;
        public ModelRenderer Horn4Left;
        public ModelRenderer Horn5Left;
        public ModelRenderer Horn6Left;
        public ModelRenderer Horn2Right;
        public ModelRenderer Horn3Right;
        public ModelRenderer Horn4Right;
        public ModelRenderer Horn5Right;
        public ModelRenderer Horn6Right;

        public Adult() {
            this.texWidth = 64;
            this.texHeight = 64;
            this.UpperLegLeft = new ModelRenderer(this, 19, 54);
            this.UpperLegLeft.mirror = true;
            this.UpperLegLeft.setPos(0.0F, 6.3F, -1.3F);
            this.UpperLegLeft.addBox(-1.0F, -0.2F, -0.3F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.7330382858376184F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 50, 18);
            this.Snout.setPos(0.0F, -1.0F, -1.4F);
            this.Snout.addBox(-1.5F, 0.0F, -3.5F, 3.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.0911061832922575F, 0.0F, 0.0F);
            this.LowerLegLeft_1 = new ModelRenderer(this, 32, 53);
            this.LowerLegLeft_1.setPos(0.05F, 4.8F, 1.7F);
            this.LowerLegLeft_1.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft_1, -0.8203047484373349F, 0.0F, 0.0F);
            this.Horn5Left = new ModelRenderer(this, 10, 30);
            this.Horn5Left.mirror = true;
            this.Horn5Left.setPos(-0.1F, -2.7F, -0.1F);
            this.Horn5Left.addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn5Left, 0.0F, 0.0F, 0.5462880425584197F);
            this.Body = new ModelRenderer(this, 0, 13);
            this.Body.setPos(0.0F, 3.0F, 2.5F);
            this.Body.addBox(-3.0F, -7.0F, 0.0F, 6.0F, 7.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.47123889803846897F, 0.0F, 0.0F);
            this.Horn4Left = new ModelRenderer(this, 15, 31);
            this.Horn4Left.mirror = true;
            this.Horn4Left.setPos(0.7F, -1.9F, 0.1F);
            this.Horn4Left.addBox(-0.5F, -3.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn4Left, 0.0F, 0.0F, -0.6373942508178124F);
            this.FootRight = new ModelRenderer(this, 41, 58);
            this.FootRight.setPos(0.0F, 4.5F, -1.0F);
            this.FootRight.addBox(-0.9F, -0.5F, -1.6F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, 0.13962634015954636F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 55, 37);
            this.HandLeft.mirror = true;
            this.HandLeft.setPos(0.0F, 3.5F, 1.0F);
            this.HandLeft.addBox(-1.1F, -0.5F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Tail = new ModelRenderer(this, 22, 46);
            this.Tail.setPos(0.0F, 0.0F, 5.0F);
            this.Tail.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail, 0.3186971254089062F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 47, 2);
            this.Head.setPos(0.0F, 1.5F, -4.5F);
            this.Head.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 1.0471975511965976F, 0.0F, 0.0F);
            this.UpperArmRight = new ModelRenderer(this, 37, 35);
            this.UpperArmRight.setPos(0.0F, 5.8F, 1.0F);
            this.UpperArmRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmRight, -0.08726646259971647F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 44, 1);
            this.EarRight.setPos(-1.8F, -0.8F, 0.6F);
            this.EarRight.addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, -0.7285004590772052F, 0.3186971254089062F, -0.7285004590772052F);
            this.Horn5Right = new ModelRenderer(this, 10, 30);
            this.Horn5Right.setPos(0.1F, -2.7F, -0.1F);
            this.Horn5Right.addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn5Right, 0.0F, 0.0F, -0.5462880425584197F);
            this.UpperLegLeft_1 = new ModelRenderer(this, 19, 54);
            this.UpperLegLeft_1.setPos(0.0F, 6.3F, -1.5F);
            this.UpperLegLeft_1.addBox(-1.0F, -0.2F, -0.3F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft_1, 0.7330382858376184F, 0.0F, 0.0F);
            this.Horn3Left = new ModelRenderer(this, 10, 30);
            this.Horn3Left.mirror = true;
            this.Horn3Left.setPos(-0.1F, -2.68F, -0.1F);
            this.Horn3Left.addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn3Left, 0.0F, 0.0F, 0.5462880425584197F);
            this.NeckBase = new ModelRenderer(this, 36, 8);
            this.NeckBase.setPos(0.0F, 2.2F, 1.5F);
            this.NeckBase.addBox(-1.0F, 0.0F, -5.5F, 2.0F, 2.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckBase, -0.18203784630933073F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 0, 49);
            this.ThighLeft.mirror = true;
            this.ThighLeft.setPos(2.0F, 1.0F, 2.0F);
            this.ThighLeft.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 7.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.2275909337942703F, 0.0F, 0.0F);
            this.Horn3Right = new ModelRenderer(this, 10, 30);
            this.Horn3Right.setPos(0.1F, -2.69F, -0.1F);
            this.Horn3Right.addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn3Right, 0.0F, 0.0F, -0.5462880425584197F);
            this.Horn6Right = new ModelRenderer(this, 15, 31);
            this.Horn6Right.setPos(-0.6F, -0.9F, 0.1F);
            this.Horn6Right.addBox(-0.5F, -2.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn6Right, 0.0F, 0.0F, 0.6373942508178124F);
            this.Horn1Right = new ModelRenderer(this, 0, 30);
            this.Horn1Right.setPos(-0.9F, -1.5F, -0.5F);
            this.Horn1Right.addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn1Right, -0.8196066007575706F, 0.0F, -0.500909508638178F);
            this.ArmBaseLeft = new ModelRenderer(this, 22, 34);
            this.ArmBaseLeft.mirror = true;
            this.ArmBaseLeft.setPos(1.9F, -1.5F, -0.6F);
            this.ArmBaseLeft.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.5462880425584197F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 21, 1);
            this.Neck.setPos(0.0F, -2.5F, -2.0F);
            this.Neck.addBox(-1.5F, -0.5F, -5.4F, 3.0F, 3.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.4098033003787853F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 46, 35);
            this.ArmRight.setPos(0.05F, 3.8F, -2.0F);
            this.ArmRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 52, 25);
            this.Mouth.setPos(0.0F, 1.9F, -0.5F);
            this.Mouth.addBox(-1.0F, 0.0F, -2.9F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.13665927909957545F, 0.0F, 0.0F);
            this.LowerLegLeft = new ModelRenderer(this, 32, 53);
            this.LowerLegLeft.mirror = true;
            this.LowerLegLeft.setPos(-0.05F, 4.8F, 1.7F);
            this.LowerLegLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.8203047484373349F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 52, 12);
            this.TopSnout.setPos(0.0F, 0.0F, 0.0F);
            this.TopSnout.addBox(-1.0F, -0.6F, -3.0F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.2275909337942703F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 0);
            this.Chest.setPos(0.0F, 11.4F, -6.0F);
            this.Chest.addBox(-2.5F, -3.0F, -2.5F, 5.0F, 6.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.45378560551852565F, 0.0F, 0.0F);
            this.Horn1Left = new ModelRenderer(this, 0, 30);
            this.Horn1Left.mirror = true;
            this.Horn1Left.setPos(0.9F, -1.5F, -0.5F);
            this.Horn1Left.addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn1Left, -0.8196066007575706F, 0.0F, 0.500909508638178F);
            this.Hips = new ModelRenderer(this, 0, 37);
            this.Hips.setPos(0.0F, -7.0F, 8.0F);
            this.Hips.addBox(-2.5F, 0.0F, 0.0F, 5.0F, 6.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.2617993877991494F, 0.0F, 0.0F);
            this.Horn6Left = new ModelRenderer(this, 15, 31);
            this.Horn6Left.mirror = true;
            this.Horn6Left.setPos(0.6F, -0.9F, 0.1F);
            this.Horn6Left.addBox(-0.5F, -2.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn6Left, 0.0F, 0.0F, -0.6373942508178124F);
            this.EarLeft = new ModelRenderer(this, 44, 1);
            this.EarLeft.mirror = true;
            this.EarLeft.setPos(1.8F, -0.8F, 0.6F);
            this.EarLeft.addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, -0.7285004590772052F, -0.3186971254089062F, 0.7285004590772052F);
            this.Horn4Right = new ModelRenderer(this, 15, 31);
            this.Horn4Right.setPos(-0.7F, -1.9F, 0.1F);
            this.Horn4Right.addBox(-0.5F, -3.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn4Right, 0.0F, 0.0F, 0.6373942508178124F);
            this.ArmBaseRight = new ModelRenderer(this, 22, 34);
            this.ArmBaseRight.setPos(-1.9F, -1.5F, -0.6F);
            this.ArmBaseRight.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.5462880425584197F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 46, 35);
            this.ArmLeft.mirror = true;
            this.ArmLeft.setPos(-0.05F, 3.8F, -2.0F);
            this.ArmLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 55, 37);
            this.HandRight.setPos(0.0F, 3.5F, 1.0F);
            this.HandRight.addBox(-0.9F, -0.5F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 41, 58);
            this.FootLeft.mirror = true;
            this.FootLeft.setPos(0.0F, 4.5F, -1.0F);
            this.FootLeft.addBox(-1.1F, -0.5F, -1.6F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 0.13962634015954636F, 0.0F, 0.0F);
            this.Horn2Right = new ModelRenderer(this, 5, 31);
            this.Horn2Right.setPos(-0.6F, -1.8F, 0.1F);
            this.Horn2Right.addBox(-0.5F, -3.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn2Right, 0.0F, 0.0F, 0.5462880425584197F);
            this.ThighRight = new ModelRenderer(this, 0, 49);
            this.ThighRight.setPos(-2.0F, 1.0F, 2.0F);
            this.ThighRight.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 7.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.2275909337942703F, 0.0F, 0.0F);
            this.UpperArmLeft = new ModelRenderer(this, 37, 35);
            this.UpperArmLeft.mirror = true;
            this.UpperArmLeft.setPos(0.0F, 5.8F, 1.0F);
            this.UpperArmLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmLeft, -0.08726646259971647F, 0.0F, 0.0F);
            this.Horn2Left = new ModelRenderer(this, 5, 31);
            this.Horn2Left.mirror = true;
            this.Horn2Left.setPos(0.6F, -1.8F, 0.1F);
            this.Horn2Left.addBox(-0.5F, -3.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn2Left, 0.0F, 0.0F, -0.5462880425584197F);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.Head.addChild(this.Snout);
            this.UpperLegLeft_1.addChild(this.LowerLegLeft_1);
            this.Horn4Left.addChild(this.Horn5Left);
            this.Chest.addChild(this.Body);
            this.Horn3Left.addChild(this.Horn4Left);
            this.LowerLegLeft_1.addChild(this.FootRight);
            this.ArmLeft.addChild(this.HandLeft);
            this.Hips.addChild(this.Tail);
            this.Neck.addChild(this.Head);
            this.ArmBaseRight.addChild(this.UpperArmRight);
            this.Head.addChild(this.EarRight);
            this.Horn4Right.addChild(this.Horn5Right);
            this.ThighRight.addChild(this.UpperLegLeft_1);
            this.Horn2Left.addChild(this.Horn3Left);
            this.Neck.addChild(this.NeckBase);
            this.Hips.addChild(this.ThighLeft);
            this.Horn2Right.addChild(this.Horn3Right);
            this.Horn5Right.addChild(this.Horn6Right);
            this.Head.addChild(this.Horn1Right);
            this.Chest.addChild(this.ArmBaseLeft);
            this.Chest.addChild(this.Neck);
            this.UpperArmRight.addChild(this.ArmRight);
            this.Snout.addChild(this.Mouth);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.Snout.addChild(this.TopSnout);
            this.Head.addChild(this.Horn1Left);
            this.Body.addChild(this.Hips);
            this.Horn5Left.addChild(this.Horn6Left);
            this.Head.addChild(this.EarLeft);
            this.Horn3Right.addChild(this.Horn4Right);
            this.Chest.addChild(this.ArmBaseRight);
            this.UpperArmLeft.addChild(this.ArmLeft);
            this.ArmRight.addChild(this.HandRight);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.Horn1Right.addChild(this.Horn2Right);
            this.Hips.addChild(this.ThighRight);
            this.ArmBaseLeft.addChild(this.UpperArmLeft);
            this.Horn1Left.addChild(this.Horn2Left);
            this.saveBase();
        }

        @Override
        public void setupAnim(BlackbuckEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);

        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;

            this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.2F) * 0.2F - 0.182F;
            this.Head.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.2F) * 0.2F + 1.047F;
            this.Tail.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.2F) * 0.2F - 0.319F;}

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            }

        }
    }


    public static class Child extends BlackbuckModel {

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
        public ModelRenderer BottomNeck;
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
            this.BottomNeck = new ModelRenderer(this, 19, 9);
            this.BottomNeck.setPos(0.0F, -2.6F, -1.0F);
            this.BottomNeck.addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(BottomNeck, -0.591841146688116F, 0.0F, 0.0F);
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
            this.BottomNeck.addChild(this.EarLeft);
            this.UpperArmLeft.addChild(this.ArmLeft);
            this.ThighRight.addChild(this.UpperLegRight);
            this.ArmLeft.addChild(this.HandLeft);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.Chest.addChild(this.Neck);
            this.Chest.addChild(this.ArmBaseRight);
            this.LowerLegRight.addChild(this.FootRight);
            this.ArmBaseRight.addChild(this.UpperArmRight);
            this.Body.addChild(this.Tail);
            this.BottomNeck.addChild(this.Snout);
            this.Body.addChild(this.ThighRight);
            this.Chest.addChild(this.Body);
            this.ArmBaseLeft.addChild(this.UpperArmLeft);
            this.BottomNeck.addChild(this.EarRight);
            this.ArmRight.addChild(this.HandRight);
            this.Body.addChild(this.ThighLeft);
            this.Neck.addChild(this.BottomNeck);
            this.UpperArmRight.addChild(this.ArmRight);
            this.saveBase();

        }

        @Override
        public void setupAnim(BlackbuckEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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
