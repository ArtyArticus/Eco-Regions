package com.github.artyarticus.ecoregions.client.model;

import com.github.artyarticus.ecoregions.entity.TamanduaEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class TamanduaModel extends ZawaBaseModel<TamanduaEntity> {
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

    public static class Adult extends TamanduaModel {

        public ModelRenderer Body;
        public ModelRenderer Neck;
        public ModelRenderer ArmLeft;
        public ModelRenderer ArmRight;
        public ModelRenderer Hips;
        public ModelRenderer Tail1;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer Tail2;
        public ModelRenderer Tail3;
        public ModelRenderer LegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer LegRight;
        public ModelRenderer FootRight;
        public ModelRenderer Head;
        public ModelRenderer BottomNeck;
        public ModelRenderer EarLeft;
        public ModelRenderer EarRight;
        public ModelRenderer Snout;
        public ModelRenderer SnoutBottom;
        public ModelRenderer MouthRight;
        public ModelRenderer Mouth;
        public ModelRenderer MouthLeft;
        public ModelRenderer ForearmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer ClawLeft1;
        public ModelRenderer ClawLeft2;
        public ModelRenderer ForearmRight;
        public ModelRenderer HandRight;
        public ModelRenderer ClawRight1;
        public ModelRenderer ClawRight2;

        public Adult() {
            this.texWidth = 64;
            this.texHeight = 32;
            this.Hips = new ModelRenderer(this, 38, 23);
            this.Hips.setPos(0.0F, -0.6F, 5.9F);
            this.Hips.addBox(-3.0F, 0.0F, 0.0F, 6.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.13665927909957545F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 36, 4);
            this.ThighLeft.mirror = true;
            this.ThighLeft.setPos(2.0F, 2.5F, 2.0F);
            this.ThighLeft.addBox(-1.5F, -1.5F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, -0.1308996938995747F, 0.0F, 0.08726646259971647F);
            this.Mouth = new ModelRenderer(this, 23, 0);
            this.Mouth.setPos(0.0F, 0.0F, -2.5F);
            this.Mouth.addBox(-0.5F, -0.4F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.3642502295386026F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 36, 4);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-2.0F, 2.5F, 2.0F);
            this.ThighRight.addBox(-1.5F, -1.5F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, -0.1308996938995747F, 0.0F, -0.08726646259971647F);
            this.Chest = new ModelRenderer(this, 0, 24);
            this.Chest.setPos(0.0F, 18.1F, -4.5F);
            this.Chest.addBox(-2.0F, -1.9F, -1.5F, 4.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, 0.13665927909957545F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 19, 8);
            this.Head.setPos(0.0F, 1.01F, -3.2F);
            this.Head.addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.13665927909957545F, 0.0F, 0.0F);
            this.LegLeft = new ModelRenderer(this, 39, 12);
            this.LegLeft.mirror = true;
            this.LegLeft.setPos(0.0F, 3.5F, -1.3F);
            this.LegLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, 0.3490658503988659F, 0.0F, -0.08726646259971647F);
            this.FootLeft = new ModelRenderer(this, 30, 16);
            this.FootLeft.mirror = true;
            this.FootLeft.setPos(-0.2F, 2.0F, 1.5F);
            this.FootLeft.addBox(-1.5F, 0.0F, -3.0F, 3.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, -0.08726646259971647F, 0.0F, 0.0F);
            this.ClawRight1 = new ModelRenderer(this, 8, 0);
            this.ClawRight1.mirror = true;
            this.ClawRight1.setPos(0.5F, 1.0F, -1.2F);
            this.ClawRight1.addBox(-0.5F, -0.8F, -0.1F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ClawRight1, -0.05061454997231123F, 0.5602506632585689F, -0.31066859353918524F);
            this.MouthRight = new ModelRenderer(this, 32, 0);
            this.MouthRight.mirror = true;
            this.MouthRight.setPos(-0.01F, -0.7F, -2.6F);
            this.MouthRight.addBox(-0.9F, -0.65F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(MouthRight, 0.0911061832922575F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 14, 0);
            this.Snout.setPos(0.0F, -0.1F, -1.0F);
            this.Snout.addBox(-1.0F, -1.4F, -3.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.27314402127920984F, 0.0F, 0.0F);
            this.ClawLeft1 = new ModelRenderer(this, 8, 0);
            this.ClawLeft1.mirror = true;
            this.ClawLeft1.setPos(-0.5F, 1.0F, -1.2F);
            this.ClawLeft1.addBox(-0.5F, -0.8F, -0.1F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ClawLeft1, -0.05061454997231123F, -0.5602506632585689F, 0.31066859353918524F);
            this.FootRight = new ModelRenderer(this, 30, 16);
            this.FootRight.mirror = true;
            this.FootRight.setPos(-0.2F, 2.0F, 1.5F);
            this.FootRight.addBox(-1.5F, 0.0F, -3.0F, 3.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, -0.08726646259971647F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 0, 17);
            this.Neck.setPos(0.0F, -1.3F, -1.5F);
            this.Neck.addBox(-1.0F, -0.5F, -3.0F, 2.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.LegRight = new ModelRenderer(this, 39, 12);
            this.LegRight.mirror = true;
            this.LegRight.setPos(0.0F, 3.5F, -1.3F);
            this.LegRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, 0.3490658503988659F, 0.0F, 0.08726646259971647F);
            this.HandRight = new ModelRenderer(this, 0, 10);
            this.HandRight.mirror = true;
            this.HandRight.setPos(-0.5F, 2.0F, -0.5F);
            this.HandRight.addBox(-0.5F, -0.7F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, -0.17453292519943295F, 0.0F, -0.008726646259971648F);
            this.ArmRight = new ModelRenderer(this, 0, 0);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(-1.7F, 0.5F, -0.2F);
            this.ArmRight.addBox(-1.0F, -0.5F, -1.0F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, 0.10471975511965977F, -0.10471975511965977F, 0.02967059811614144F);
            this.Tail1 = new ModelRenderer(this, 48, 0);
            this.Tail1.setPos(0.0F, 0.5F, 3.8F);
            this.Tail1.addBox(-1.5F, -0.5F, 0.0F, 3.0F, 3.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -0.3672172905985735F, 0.0F, 0.0F);
            this.Tail3 = new ModelRenderer(this, 51, 17);
            this.Tail3.setPos(0.0F, 0.5F, 5.3F);
            this.Tail3.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail3, 0.13665927909957545F, 0.0F, 0.0F);
            this.BottomNeck = new ModelRenderer(this, 21, 4);
            this.BottomNeck.setPos(0.0F, 2.0F, -0.7F);
            this.BottomNeck.addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(BottomNeck, -0.28605945374922626F, 0.0F, 0.0F);
            this.SnoutBottom = new ModelRenderer(this, 26, 0);
            this.SnoutBottom.setPos(0.0F, 0.6F, 0.2F);
            this.SnoutBottom.addBox(-0.5F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(SnoutBottom, -0.3186971254089062F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 0, 0);
            this.ArmLeft.mirror = true;
            this.ArmLeft.setPos(1.7F, 0.5F, -0.2F);
            this.ArmLeft.addBox(-1.0F, -0.5F, -1.0F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, 0.10471975511965977F, 0.10471975511965977F, -0.02967059811614144F);
            this.MouthLeft = new ModelRenderer(this, 32, 0);
            this.MouthLeft.setPos(0.0F, 0.0F, 0.0F);
            this.MouthLeft.addBox(-0.1F, -0.65F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.ForearmLeft = new ModelRenderer(this, 0, 6);
            this.ForearmLeft.mirror = true;
            this.ForearmLeft.setPos(0.4F, 2.5F, 0.5F);
            this.ForearmLeft.addBox(-1.5F, -0.2F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmLeft, -0.20071286397934787F, 0.0F, 0.03665191262740524F);
            this.HandLeft = new ModelRenderer(this, 0, 10);
            this.HandLeft.mirror = true;
            this.HandLeft.setPos(-0.5F, 2.0F, -0.5F);
            this.HandLeft.addBox(-0.5F, -0.7F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, -0.17453292519943295F, 0.0F, 0.008726646259971648F);
            this.ClawLeft2 = new ModelRenderer(this, 8, 0);
            this.ClawLeft2.mirror = true;
            this.ClawLeft2.setPos(-0.5F, 1.0F, 0.0F);
            this.ClawLeft2.addBox(-0.8F, -0.8F, -0.4F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ClawLeft2, -0.09773843644720677F, 0.3612831684786316F, 0.5131267934284302F);
            this.Tail2 = new ModelRenderer(this, 49, 9);
            this.Tail2.setPos(0.0F, 0.0F, 6.0F);
            this.Tail2.addBox(-1.0F, 0.0F, -0.5F, 2.0F, 2.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, 0.04555309164612875F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 34, 3);
            this.EarRight.setPos(-1.0F, -1.0F, 0.0F);
            this.EarRight.addBox(-1.0F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.0911061832922575F, 0.3186971254089062F, -0.500909508638178F);
            this.EarLeft = new ModelRenderer(this, 34, 3);
            this.EarLeft.mirror = true;
            this.EarLeft.setPos(1.0F, -1.0F, 0.0F);
            this.EarLeft.addBox(0.0F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.0911061832922575F, -0.3186971254089062F, 0.500909508638178F);
            this.ClawRight2 = new ModelRenderer(this, 8, 0);
            this.ClawRight2.mirror = true;
            this.ClawRight2.setPos(0.5F, 1.0F, 0.0F);
            this.ClawRight2.addBox(-0.2F, -0.8F, -0.4F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ClawRight2, -0.09773843644720677F, -0.3612831684786316F, -0.5131267934284302F);
            this.Body = new ModelRenderer(this, 14, 19);
            this.Body.setPos(0.0F, -1.5F, 1.5F);
            this.Body.addBox(-2.5F, -0.6F, 0.0F, 5.0F, 5.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, -0.0911061832922575F, 0.0F, 0.0F);
            this.ForearmRight = new ModelRenderer(this, 0, 6);
            this.ForearmRight.mirror = true;
            this.ForearmRight.setPos(0.6F, 2.5F, 0.5F);
            this.ForearmRight.addBox(-1.5F, -0.2F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmRight, -0.20071286397934787F, 0.0F, -0.03665191262740524F);
            this.Body.addChild(this.Hips);
            this.Hips.addChild(this.ThighLeft);
            this.Snout.addChild(this.Mouth);
            this.Hips.addChild(this.ThighRight);
            this.Neck.addChild(this.Head);
            this.ThighLeft.addChild(this.LegLeft);
            this.LegLeft.addChild(this.FootLeft);
            this.HandRight.addChild(this.ClawRight1);
            this.Snout.addChild(this.MouthRight);
            this.Head.addChild(this.Snout);
            this.HandLeft.addChild(this.ClawLeft1);
            this.LegRight.addChild(this.FootRight);
            this.Chest.addChild(this.Neck);
            this.ThighRight.addChild(this.LegRight);
            this.ForearmRight.addChild(this.HandRight);
            this.Chest.addChild(this.ArmRight);
            this.Hips.addChild(this.Tail1);
            this.Tail2.addChild(this.Tail3);
            this.Neck.addChild(this.BottomNeck);
            this.Snout.addChild(this.SnoutBottom);
            this.Chest.addChild(this.ArmLeft);
            this.MouthRight.addChild(this.MouthLeft);
            this.ArmLeft.addChild(this.ForearmLeft);
            this.ForearmLeft.addChild(this.HandLeft);
            this.HandLeft.addChild(this.ClawLeft2);
            this.Tail1.addChild(this.Tail2);
            this.Head.addChild(this.EarRight);
            this.Head.addChild(this.EarLeft);
            this.HandRight.addChild(this.ClawRight2);
            this.Chest.addChild(this.Body);
            this.ArmRight.addChild(this.ForearmRight);
            this.saveBase();
        }

        @Override
        public void setupAnim(TamanduaEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = (float)Math.toRadians((double)netHeadYaw) * 0.5F;
            this.Head.yRot = (float)Math.toRadians((double)netHeadYaw) * 0.5F;
            this.Head.xRot = (float)Math.toRadians((double)headPitch) * 0.5F + 0.136F;

        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F + (float)Math.PI) * degree * -0.1F * limbSwingAmount * 0.5F;
            this.Tail1.xRot = MathHelper.cos(limbSwing * speed * 0.1F + (float)Math.PI) * degree * -0.2F * limbSwingAmount * 0.5F - 0.367F;
            this.Tail1.yRot = MathHelper.cos(1.0F + limbSwing * speed * 0.1F + (float)Math.PI) * degree * -0.4F * limbSwingAmount * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.2f;
            float degree = 0.8f;
            this.ArmLeft.xRot = MathHelper.cos(limbSwing * speed * 0.2F + (float)Math.PI) * degree * 1.0F * limbSwingAmount * 0.5F + 0.1F;
            this.ForearmLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F + (float)Math.PI) * degree * -2.0F * limbSwingAmount * 0.5F + -0.2F;
            this.HandLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F + (float)Math.PI) * degree * 2.0F * limbSwingAmount * 0.5F + -0.17F;
            this.ArmRight.xRot = MathHelper.cos(limbSwing * speed * 0.2F + (float)Math.PI) * degree * -1.0F * limbSwingAmount * 0.5F + 0.1F;
            this.ForearmRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F + (float)Math.PI) * degree * 2.0F * limbSwingAmount * 0.5F + -0.2F;
            this.HandRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F + (float)Math.PI) * degree * -2.0F * limbSwingAmount * 0.5F + -0.17F;
            this.ThighLeft.xRot = MathHelper.cos(limbSwing * speed * 0.2F + (float)Math.PI) * degree * -2.0F * limbSwingAmount * 0.5F + -0.13F;
            this.LegLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F + (float)Math.PI) * degree * 1.5F * limbSwingAmount * 0.5F + 0.35F;
            this.FootLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F + (float)Math.PI) * degree * -1.0F * limbSwingAmount * 0.5F + -0.09F;
            this.ThighRight.xRot = MathHelper.cos(limbSwing * speed * 0.2F + (float)Math.PI) * degree * 2.0F * limbSwingAmount * 0.5F + -0.13F;
            this.LegRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F + (float)Math.PI) * degree * -1.5F * limbSwingAmount * 0.5F + 0.35F;
            this.FootRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F + (float)Math.PI) * degree * 1.0F * limbSwingAmount * 0.5F + -0.09F;
            this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F + (float)Math.PI) * degree * -0.1F * limbSwingAmount * 0.5F;
            this.Head.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F + (float)Math.PI) * degree * -0.05F * limbSwingAmount * 0.5F + 0.136F;
            this.Tail1.xRot = MathHelper.cos(limbSwing * speed * 0.4F + (float)Math.PI) * degree * -0.2F * limbSwingAmount * 0.5F - 0.367F;
            this.Tail1.yRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F + (float)Math.PI) * degree * -0.4F * limbSwingAmount * 0.5F;
        }
    }


    public static class Child extends TamanduaModel {

        public ModelRenderer Neck;
        public ModelRenderer ArmLeft;
        public ModelRenderer ArmRight;
        public ModelRenderer Hips;
        public ModelRenderer Head;
        public ModelRenderer EarLeft;
        public ModelRenderer EarRight;
        public ModelRenderer Snout;
        public ModelRenderer SnoutBottom;
        public ModelRenderer MouthRight;
        public ModelRenderer Mouth;
        public ModelRenderer Tongue;
        public ModelRenderer MouthLeft;
        public ModelRenderer ForearmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer ClawLeft1;
        public ModelRenderer ClawLeft2;
        public ModelRenderer ForearmRight;
        public ModelRenderer HandRight;
        public ModelRenderer ClawRight1;
        public ModelRenderer ClawRight2;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer Tail1;
        public ModelRenderer LegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer LegRight;
        public ModelRenderer FootRight;
        public ModelRenderer Tail2;

        public Child() {
            this.texWidth = 64;
            this.texHeight = 32;
            this.LegLeft = new ModelRenderer(this, 39, 12);
            this.LegLeft.setPos(0.0F, 2.4F, -1.3F);
            this.LegLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, 0.3490658503988659F, 0.0F, -0.08726646259971647F);
            this.Tail2 = new ModelRenderer(this, 51, 17);
            this.Tail2.setPos(0.0F, 0.5F, 5.3F);
            this.Tail2.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, 0.13665927909957545F, 0.0F, 0.0F);
            this.ForearmRight = new ModelRenderer(this, 0, 6);
            this.ForearmRight.mirror = true;
            this.ForearmRight.setPos(0.6F, 1.5F, 0.5F);
            this.ForearmRight.addBox(-1.0F, -0.2F, -1.5F, 1.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmRight, -0.20071286397934787F, 0.0F, -0.03665191262740524F);
            this.LegRight = new ModelRenderer(this, 39, 12);
            this.LegRight.mirror = true;
            this.LegRight.setPos(0.0F, 2.4F, -1.3F);
            this.LegRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, 0.3490658503988659F, 0.0F, 0.08726646259971647F);
            this.ClawRight1 = new ModelRenderer(this, 8, 0);
            this.ClawRight1.mirror = true;
            this.ClawRight1.setPos(0.5F, 0.0F, -1.2F);
            this.ClawRight1.addBox(-0.5F, -0.8F, -0.1F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ClawRight1, -0.05061454997231123F, 0.5602506632585689F, -0.31066859353918524F);
            this.EarRight = new ModelRenderer(this, 33, 3);
            this.EarRight.setPos(-1.0F, -1.0F, 0.1F);
            this.EarRight.addBox(-1.0F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.0911061832922575F, 0.3186971254089062F, -0.500909508638178F);
            this.Tongue = new ModelRenderer(this, 1, 11);
            this.Tongue.setPos(0.0F, 0.0F, 0.0F);
            this.Tongue.addBox(-0.5F, 0.0F, -3.5F, 1.0F, 0.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 0, 17);
            this.Neck.setPos(0.0F, -1.3F, -2.5F);
            this.Neck.addBox(-1.0F, -0.5F, -2.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 0, 0);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(-1.7F, 0.5F, -1.2F);
            this.ArmRight.addBox(-1.0F, -0.5F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, 0.10471975511965977F, -0.10471975511965977F, 0.02967059811614144F);
            this.ClawLeft1 = new ModelRenderer(this, 8, 0);
            this.ClawLeft1.setPos(-0.5F, 0.0F, -1.2F);
            this.ClawLeft1.addBox(-0.5F, -0.8F, -0.1F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ClawLeft1, -0.05061454997231123F, -0.5602506632585689F, 0.31066859353918524F);
            this.Mouth = new ModelRenderer(this, 23, 0);
            this.Mouth.setPos(0.0F, 0.0F, -2.5F);
            this.Mouth.addBox(-0.5F, -0.4F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.3642502295386026F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 0, 10);
            this.HandRight.mirror = true;
            this.HandRight.setPos(-0.6F, 2.0F, -0.5F);
            this.HandRight.addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, -0.17453292519943295F, 0.0F, -0.008726646259971648F);
            this.EarLeft = new ModelRenderer(this, 33, 3);
            this.EarLeft.mirror = true;
            this.EarLeft.setPos(1.0F, -1.0F, 0.1F);
            this.EarLeft.addBox(0.0F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.0911061832922575F, -0.3186971254089062F, 0.500909508638178F);
            this.ThighLeft = new ModelRenderer(this, 34, 4);
            this.ThighLeft.setPos(2.0F, 2.3F, 2.0F);
            this.ThighLeft.addBox(-1.0F, -1.5F, -1.5F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, -0.20909043639943742F, 0.0F, 0.08726646259971647F);
            this.SnoutBottom = new ModelRenderer(this, 26, 0);
            this.SnoutBottom.setPos(0.0F, 0.6F, 0.2F);
            this.SnoutBottom.addBox(-0.5F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(SnoutBottom, -0.3186971254089062F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 48, 9);
            this.Tail1.setPos(0.0F, 0.5F, 4.0F);
            this.Tail1.addBox(-1.0F, 0.0F, -0.5F, 2.0F, 2.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -0.42359141744850703F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 19, 8);
            this.Head.setPos(0.0F, 1.01F, -2.6F);
            this.Head.addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.13665927909957545F, 0.0F, 0.0F);
            this.MouthRight = new ModelRenderer(this, 32, 0);
            this.MouthRight.mirror = true;
            this.MouthRight.setPos(-0.01F, -0.7F, -2.6F);
            this.MouthRight.addBox(-0.9F, -0.65F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(MouthRight, 0.0911061832922575F, 0.0F, 0.0F);
            this.ClawRight2 = new ModelRenderer(this, 8, 0);
            this.ClawRight2.mirror = true;
            this.ClawRight2.setPos(0.5F, 0.0F, 0.0F);
            this.ClawRight2.addBox(-0.2F, -0.8F, -0.4F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ClawRight2, -0.09773843644720677F, -0.3612831684786316F, -0.5131267934284302F);
            this.Chest = new ModelRenderer(this, 0, 23);
            this.Chest.setPos(0.0F, 19.5F, -1.5F);
            this.Chest.addBox(-2.0F, -1.9F, -2.5F, 4.0F, 4.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, 0.09756390784964411F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 0, 10);
            this.HandLeft.setPos(-0.4F, 2.0F, -0.5F);
            this.HandLeft.addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, -0.17453292519943295F, 0.0F, 0.008726646259971648F);
            this.FootLeft = new ModelRenderer(this, 30, 16);
            this.FootLeft.setPos(-0.2F, 1.5F, 1.5F);
            this.FootLeft.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, -0.08726646259971647F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 30, 16);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.2F, 1.5F, 1.5F);
            this.FootRight.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, -0.08726646259971647F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 34, 4);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-2.0F, 2.3F, 2.0F);
            this.ThighRight.addBox(-1.0F, -1.5F, -1.5F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, -0.20909043639943742F, 0.0F, -0.08726646259971647F);
            this.MouthLeft = new ModelRenderer(this, 32, 0);
            this.MouthLeft.setPos(0.0F, 0.0F, 0.0F);
            this.MouthLeft.addBox(-0.1F, -0.65F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.ClawLeft2 = new ModelRenderer(this, 8, 0);
            this.ClawLeft2.setPos(-0.5F, 0.0F, 0.0F);
            this.ClawLeft2.addBox(-0.8F, -0.8F, -0.4F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ClawLeft2, -0.09773843644720677F, 0.3612831684786316F, 0.5131267934284302F);
            this.ArmLeft = new ModelRenderer(this, 0, 0);
            this.ArmLeft.setPos(1.7F, 0.5F, -1.2F);
            this.ArmLeft.addBox(-1.0F, -0.5F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, 0.10471975511965977F, 0.10471975511965977F, -0.02967059811614144F);
            this.ForearmLeft = new ModelRenderer(this, 0, 6);
            this.ForearmLeft.setPos(0.4F, 1.5F, 0.5F);
            this.ForearmLeft.addBox(-1.0F, -0.2F, -1.5F, 1.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmLeft, -0.20071286397934787F, 0.0F, 0.03665191262740524F);
            this.Hips = new ModelRenderer(this, 18, 24);
            this.Hips.setPos(0.0F, -2.0F, 2.5F);
            this.Hips.addBox(-2.5F, 0.0F, 0.0F, 5.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.13665927909957545F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 14, 0);
            this.Snout.setPos(0.0F, -0.1F, 0.0F);
            this.Snout.addBox(-1.0F, -1.4F, -3.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.27314402127920984F, 0.0F, 0.0F);
            this.ThighLeft.addChild(this.LegLeft);
            this.Tail1.addChild(this.Tail2);
            this.ArmRight.addChild(this.ForearmRight);
            this.ThighRight.addChild(this.LegRight);
            this.HandRight.addChild(this.ClawRight1);
            this.Head.addChild(this.EarRight);
            this.Snout.addChild(this.Tongue);
            this.Chest.addChild(this.Neck);
            this.Chest.addChild(this.ArmRight);
            this.HandLeft.addChild(this.ClawLeft1);
            this.Snout.addChild(this.Mouth);
            this.ForearmRight.addChild(this.HandRight);
            this.Head.addChild(this.EarLeft);
            this.Hips.addChild(this.ThighLeft);
            this.Snout.addChild(this.SnoutBottom);
            this.Hips.addChild(this.Tail1);
            this.Neck.addChild(this.Head);
            this.Snout.addChild(this.MouthRight);
            this.HandRight.addChild(this.ClawRight2);
            this.ForearmLeft.addChild(this.HandLeft);
            this.LegLeft.addChild(this.FootLeft);
            this.LegRight.addChild(this.FootRight);
            this.Hips.addChild(this.ThighRight);
            this.MouthRight.addChild(this.MouthLeft);
            this.HandLeft.addChild(this.ClawLeft2);
            this.Chest.addChild(this.ArmLeft);
            this.ArmLeft.addChild(this.ForearmLeft);
            this.Chest.addChild(this.Hips);
            this.Head.addChild(this.Snout);
            this.saveBase();

        }

        @Override
        public void setupAnim(TamanduaEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = (float)Math.toRadians((double)netHeadYaw) * 0.5F;
            this.Head.yRot = (float)Math.toRadians((double)netHeadYaw) * 0.5F;
            this.Head.xRot = (float)Math.toRadians((double)headPitch) * 0.5F + 0.136F;

        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F + (float)Math.PI) * degree * -0.1F * limbSwingAmount * 0.5F;
            this.Tail1.xRot = MathHelper.cos(limbSwing * speed * 0.1F + (float)Math.PI) * degree * -0.2F * limbSwingAmount * 0.5F - 0.367F;
            this.Tail1.yRot = MathHelper.cos(1.0F + limbSwing * speed * 0.1F + (float)Math.PI) * degree * -0.4F * limbSwingAmount * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.2f;
            float degree = 0.8f;
            this.ArmLeft.xRot = MathHelper.cos(limbSwing * speed * 0.2F + (float)Math.PI) * degree * 1.0F * limbSwingAmount * 0.5F + 0.1F;
            this.ForearmLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F + (float)Math.PI) * degree * -2.0F * limbSwingAmount * 0.5F + -0.2F;
            this.HandLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F + (float)Math.PI) * degree * 2.0F * limbSwingAmount * 0.5F + -0.17F;
            this.ArmRight.xRot = MathHelper.cos(limbSwing * speed * 0.2F + (float)Math.PI) * degree * -1.0F * limbSwingAmount * 0.5F + 0.1F;
            this.ForearmRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F + (float)Math.PI) * degree * 2.0F * limbSwingAmount * 0.5F + -0.2F;
            this.HandRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F + (float)Math.PI) * degree * -2.0F * limbSwingAmount * 0.5F + -0.17F;
            this.ThighLeft.xRot = MathHelper.cos(limbSwing * speed * 0.2F + (float)Math.PI) * degree * -2.0F * limbSwingAmount * 0.5F + -0.13F;
            this.LegLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F + (float)Math.PI) * degree * 1.5F * limbSwingAmount * 0.5F + 0.35F;
            this.FootLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F + (float)Math.PI) * degree * -1.0F * limbSwingAmount * 0.5F + -0.09F;
            this.ThighRight.xRot = MathHelper.cos(limbSwing * speed * 0.2F + (float)Math.PI) * degree * 2.0F * limbSwingAmount * 0.5F + -0.13F;
            this.LegRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F + (float)Math.PI) * degree * -1.5F * limbSwingAmount * 0.5F + 0.35F;
            this.FootRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F + (float)Math.PI) * degree * 1.0F * limbSwingAmount * 0.5F + -0.09F;
            this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F + (float)Math.PI) * degree * -0.1F * limbSwingAmount * 0.5F;
            this.Head.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F + (float)Math.PI) * degree * -0.05F * limbSwingAmount * 0.5F + 0.136F;
            this.Tail1.xRot = MathHelper.cos(limbSwing * speed * 0.4F + (float)Math.PI) * degree * -0.2F * limbSwingAmount * 0.5F - 0.367F;
            this.Tail1.yRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F + (float)Math.PI) * degree * -0.4F * limbSwingAmount * 0.5F;
        }
    }
}

