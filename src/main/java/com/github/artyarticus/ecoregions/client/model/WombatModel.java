package com.github.artyarticus.ecoregions.client.model;

import com.github.artyarticus.ecoregions.entity.WombatEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class WombatModel extends ZawaBaseModel<WombatEntity> {
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

    public static class Adult extends WombatModel {

        public ModelRenderer Body;
        public ModelRenderer ArmLeft;
        public ModelRenderer ArmRight;
        public ModelRenderer Neck;
        public ModelRenderer Hips;
        public ModelRenderer Tail1;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer LegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer LegRight;
        public ModelRenderer FootRight;
        public ModelRenderer ForearmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer ForearmRight;
        public ModelRenderer HandRight;
        public ModelRenderer Head;
        public ModelRenderer NeckUnder;
        public ModelRenderer ear1;
        public ModelRenderer ear1_1;
        public ModelRenderer snout;
        public ModelRenderer shape38;
        public ModelRenderer shape38_1;
        public ModelRenderer nose;
        public ModelRenderer mouth;
        public ModelRenderer shape37;

        public Adult() {
            this.texWidth = 64;
            this.texHeight = 64;
            this.shape38_1 = new ModelRenderer(this, 28, 40);
            this.shape38_1.mirror = true;
            this.shape38_1.setPos(-2.5F, 0.0F, -2.5F);
            this.shape38_1.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(shape38_1, -0.13665927909957545F, 0.0F, -0.13665927909957545F);
            this.LegRight = new ModelRenderer(this, 52, 30);
            this.LegRight.setPos(0.5F, 7.0F, -2.0F);
            this.LegRight.addBox(-1.5F, -0.5F, 0.0F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, 0.6255260065779288F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 30);
            this.Hips.setPos(0.0F, 0.0F, 8.0F);
            this.Hips.addBox(-4.5F, 0.0F, 0.0F, 9.0F, 8.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.3909537457888271F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 40, 11);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.3F, 3.2F, -1.9F);
            this.HandRight.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.27366763203903305F, -0.0781907508222411F, 0.19547687289441354F);
            this.shape38 = new ModelRenderer(this, 28, 40);
            this.shape38.setPos(2.5F, 0.0F, -2.5F);
            this.shape38.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(shape38, -0.13665927909957545F, 0.0F, 0.13665927909957545F);
            this.LegLeft = new ModelRenderer(this, 52, 30);
            this.LegLeft.setPos(-0.5F, 7.0F, -2.0F);
            this.LegLeft.addBox(-1.5F, -0.5F, 0.0F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, 0.6255260065779288F, 0.0F, 0.0F);
            this.shape37 = new ModelRenderer(this, 40, 45);
            this.shape37.setPos(0.0F, -2.0F, 0.1F);
            this.shape37.addBox(-1.5F, -0.3F, -2.1F, 3.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(shape37, 0.27314402127920984F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 0);
            this.Chest.setPos(0.0F, 15.8F, -4.0F);
            this.Chest.addBox(-4.5F, -4.0F, -2.5F, 9.0F, 8.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, 0.23474678106428595F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 40, 11);
            this.HandLeft.setPos(-0.3F, 3.2F, -1.9F);
            this.HandLeft.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.27366763203903305F, 0.0781907508222411F, -0.19547687289441354F);
            this.mouth = new ModelRenderer(this, 50, 58);
            this.mouth.setPos(0.0F, 1.4F, -0.8F);
            this.mouth.addBox(-1.0F, 0.0F, -1.1F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(mouth, -0.42184608153861F, 0.0F, 0.0F);
            this.ForearmRight = new ModelRenderer(this, 52, 8);
            this.ForearmRight.mirror = true;
            this.ForearmRight.setPos(0.0F, 3.5F, 1.5F);
            this.ForearmRight.addBox(-1.5F, -0.1F, -3.0F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmRight, -0.46914448828868976F, 0.0F, -0.27366763203903305F);
            this.Head = new ModelRenderer(this, 20, 48);
            this.Head.setPos(0.0F, 2.5F, -3.0F);
            this.Head.addBox(-3.0F, -3.0F, -2.5F, 6.0F, 6.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.08726646259971647F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 44, 17);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-3.5F, 2.0F, 2.7F);
            this.ThighRight.addBox(-2.0F, 0.0F, -2.5F, 5.0F, 7.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.23457224414434488F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 38, 32);
            this.FootLeft.setPos(0.2F, 3.0F, 1.0F);
            this.FootLeft.addBox(-1.5F, 0.0F, -3.0F, 3.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, -0.46914448828868976F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 13);
            this.Body.setPos(0.0F, -4.0F, 2.5F);
            this.Body.addBox(-5.0F, 0.0F, 0.0F, 10.0F, 9.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, -0.23492131798422702F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 48, 0);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(-3.0F, 1.5F, -0.4F);
            this.ArmRight.addBox(-1.9F, 0.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, 0.03909537541112055F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 0, 43);
            this.Neck.setPos(0.0F, -3.2F, -2.5F);
            this.Neck.addBox(-2.5F, -0.5F, -2.5F, 5.0F, 5.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.17610372418938894F, 0.0F, 0.0F);
            this.snout = new ModelRenderer(this, 47, 50);
            this.snout.setPos(0.0F, -0.2F, -2.5F);
            this.snout.addBox(-2.0F, -1.5F, -2.0F, 4.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(snout, 0.296705972839036F, -0.0F, 0.0F);
            this.ForearmLeft = new ModelRenderer(this, 52, 8);
            this.ForearmLeft.setPos(0.0F, 3.5F, 1.5F);
            this.ForearmLeft.addBox(-1.5F, -0.1F, -3.0F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmLeft, -0.46914448828868976F, 0.0F, 0.27366763203903305F);
            this.ear1_1 = new ModelRenderer(this, 50, 43);
            this.ear1_1.mirror = true;
            this.ear1_1.setPos(-2.0F, -2.8F, 1.6F);
            this.ear1_1.addBox(-1.5F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ear1_1, 0.06981317007977318F, 0.03490658503988659F, -0.13962634015954636F);
            this.ThighLeft = new ModelRenderer(this, 44, 17);
            this.ThighLeft.setPos(3.5F, 2.0F, 2.7F);
            this.ThighLeft.addBox(-3.0F, 0.0F, -2.5F, 5.0F, 7.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.23457224414434488F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 48, 0);
            this.ArmLeft.setPos(3.0F, 1.5F, -0.4F);
            this.ArmLeft.addBox(-1.9F, 0.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, 0.0781907508222411F, 0.0F, 0.0F);
            this.NeckUnder = new ModelRenderer(this, 0, 53);
            this.NeckUnder.setPos(0.0F, 4.5F, -3.3F);
            this.NeckUnder.addBox(-2.0F, -1.0F, 0.0F, 4.0F, 2.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckUnder, -0.15655603856442327F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 24, 31);
            this.Tail1.setPos(0.0F, 1.5F, 4.2F);
            this.Tail1.addBox(-1.1F, -0.5F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, 0.7431612274571185F, 0.0F, 0.0F);
            this.nose = new ModelRenderer(this, 41, 51);
            this.nose.setPos(0.0F, -1.3F, -1.5F);
            this.nose.addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(nose, 0.7037167490777915F, -0.0F, 0.0F);
            this.ear1 = new ModelRenderer(this, 50, 43);
            this.ear1.setPos(2.0F, -2.8F, 1.6F);
            this.ear1.addBox(-0.5F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ear1, 0.06981317007977318F, -0.03490658503988659F, 0.13962634015954636F);
            this.FootRight = new ModelRenderer(this, 38, 32);
            this.FootRight.mirror = true;
            this.FootRight.setPos(-0.2F, 3.0F, 1.0F);
            this.FootRight.addBox(-1.5F, 0.0F, -3.0F, 3.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, -0.46914448828868976F, 0.0F, 0.0F);
            this.Head.addChild(this.shape38_1);
            this.ThighRight.addChild(this.LegRight);
            this.Body.addChild(this.Hips);
            this.ForearmRight.addChild(this.HandRight);
            this.Head.addChild(this.shape38);
            this.ThighLeft.addChild(this.LegLeft);
            this.snout.addChild(this.shape37);
            this.ForearmLeft.addChild(this.HandLeft);
            this.snout.addChild(this.mouth);
            this.ArmRight.addChild(this.ForearmRight);
            this.Neck.addChild(this.Head);
            this.Hips.addChild(this.ThighRight);
            this.LegLeft.addChild(this.FootLeft);
            this.Chest.addChild(this.Body);
            this.Chest.addChild(this.ArmRight);
            this.Chest.addChild(this.Neck);
            this.Head.addChild(this.snout);
            this.ArmLeft.addChild(this.ForearmLeft);
            this.Head.addChild(this.ear1_1);
            this.Hips.addChild(this.ThighLeft);
            this.Chest.addChild(this.ArmLeft);
            this.Neck.addChild(this.NeckUnder);
            this.Hips.addChild(this.Tail1);
            this.snout.addChild(this.nose);
            this.Head.addChild(this.ear1);
            this.LegRight.addChild(this.FootRight);
            this.saveBase();
        }

        @Override
        public void setupAnim(WombatEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Head.xRot = (headPitch / (180F / (float)Math.PI)) + 0.087F;
            this.Head.yRot = netHeadYaw / (180F / (float)Math.PI);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = MathHelper.cos(limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount - 0.176F;
            this.Head.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.1F) * degree * -0.05F * limbSwingAmount + 0.087F;
            this.ear1.zRot = MathHelper.cos(limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount + 0.139F;
            this.ear1_1.zRot = MathHelper.cos(limbSwing * speed * 0.1F) * degree * 0.1F * limbSwingAmount - 0.139F;
            this.Tail1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount - 0.743F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 4.0f;
            float degree = 0.3f;
            this.Chest.y = MathHelper.sin(limbSwing * speed * 0.4F) * degree * 0.4F * limbSwingAmount + 15.8F;
            this.Chest.xRot = MathHelper.cos(limbSwing * speed * 0.4F) * degree * 0.05F * limbSwingAmount + 0.234F;
            this.Chest.zRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * 0.4F * limbSwingAmount;
            this.Neck.xRot = MathHelper.cos(limbSwing * speed * 0.4F) * degree * 0.2F * limbSwingAmount - 0.176F;
            this.Head.xRot = MathHelper.cos(limbSwing * speed * 0.4F) * degree * -0.2F * limbSwingAmount + 0.087F;
            this.ArmLeft.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * 2.0F * limbSwingAmount + 0.078F;
            this.ForearmLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * degree * 1.5F * limbSwingAmount + -0.469F;
            this.HandLeft.xRot = MathHelper.cos(0.5F + limbSwing * speed * 0.2F) * degree * -1.5F * limbSwingAmount + 0.273F;
            this.ArmRight.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * -2.0F * limbSwingAmount + 0.078F;
            this.ForearmRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * degree * -1.5F * limbSwingAmount + -0.469F;
            this.HandRight.xRot = MathHelper.cos(0.5F + limbSwing * speed * 0.2F) * degree * 1.5F * limbSwingAmount + 0.273F;
            this.ThighLeft.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.234F;
            this.LegLeft.xRot = MathHelper.cos(1.5F + limbSwing * speed * 0.2F) * degree * 2.0F * limbSwingAmount + 0.625F;
//        this.LegLeft.xRot = MathHelper.cos(3.5F + limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount + 0.625F;
            this.FootLeft.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + -0.469F;
            this.ThighRight.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.234F;
            this.LegRight.xRot = MathHelper.cos(1.5F + limbSwing * speed * 0.2F) * degree * -2.0F * limbSwingAmount + 0.625F;
//        this.LegRight.xRot = MathHelper.cos(3.5F + limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount + 0.625F;
            this.FootRight.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + -0.469F;
            this.Tail1.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.4F) * degree * 0.4F * limbSwingAmount - 0.312F;
//        this.Tail2.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * degree * 0.4F * limbSwingAmount + 0.273F;
        }
    }


    public static class Child extends WombatModel {

        public ModelRenderer Body;
        public ModelRenderer Neck;
        public ModelRenderer ArmLeft;
        public ModelRenderer ArmRight;
        public ModelRenderer Hips;
        public ModelRenderer Tail1;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer LegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer LegRight;
        public ModelRenderer FootRight;
        public ModelRenderer NeckUnder;
        public ModelRenderer Head;
        public ModelRenderer CheekLeft;
        public ModelRenderer CheekRight;
        public ModelRenderer Snout;
        public ModelRenderer EarLeft;
        public ModelRenderer EarRight;
        public ModelRenderer Nose;
        public ModelRenderer Mouth;
        public ModelRenderer Bridge;
        public ModelRenderer ForearmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer ForearmRight;
        public ModelRenderer HandRight;

        public Child() {
            this.texWidth = 64;
            this.texHeight = 32;
            this.ForearmRight = new ModelRenderer(this, 12, 20);
            this.ForearmRight.mirror = true;
            this.ForearmRight.setPos(0.0F, 2.5F, 1.3F);
            this.ForearmRight.addBox(-1.0F, -0.1F, -2.0F, 2.0F, 2.9F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmRight, -0.46914448828868976F, 0.0F, -0.27366763203903305F);
            this.HandRight = new ModelRenderer(this, 31, 19);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.2F, 2.5F, -1.2F);
            this.HandRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.19198621771937624F, 0.0781907508222411F, 0.19547687289441354F);
            this.ArmRight = new ModelRenderer(this, 0, 18);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(-1.7F, 0.6F, 0.1F);
            this.ArmRight.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, 0.0781907508222411F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 0);
            this.Chest.setPos(0.0F, 18.3F, -2.8F);
            this.Chest.addBox(-2.5F, -2.0F, -1.5F, 5.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, 0.19198621771937624F, 0.0F, 0.0F);
            this.CheekLeft = new ModelRenderer(this, 9, 15);
            this.CheekLeft.setPos(1.8F, 0.0F, -1.5F);
            this.CheekLeft.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(CheekLeft, -0.13665927909957545F, 0.0F, 0.13665927909957545F);
            this.CheekRight = new ModelRenderer(this, 9, 15);
            this.CheekRight.mirror = true;
            this.CheekRight.setPos(-1.8F, 0.0F, -1.5F);
            this.CheekRight.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(CheekRight, -0.13665927909957545F, 0.0F, -0.13665927909957545F);
            this.FootRight = new ModelRenderer(this, 0, 8);
            this.FootRight.mirror = true;
            this.FootRight.setPos(-0.1F, 2.0F, 0.5F);
            this.FootRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, -0.5759586531581287F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 0, 18);
            this.ArmLeft.setPos(1.7F, 0.6F, 0.1F);
            this.ArmLeft.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, 0.0781907508222411F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 0, 8);
            this.FootLeft.setPos(0.1F, 2.0F, 0.5F);
            this.FootLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, -0.5759586531581287F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 16, 0);
            this.Body.setPos(0.0F, -2.1F, 1.3F);
            this.Body.addBox(-3.0F, 0.0F, 0.0F, 6.0F, 6.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, -0.19198621771937624F, 0.0F, 0.0F);
            this.LegRight = new ModelRenderer(this, 54, 0);
            this.LegRight.mirror = true;
            this.LegRight.setPos(0.0F, 5.0F, -1.0F);
            this.LegRight.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, 0.6255260065779288F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 13, 0);
            this.Tail1.setPos(0.0F, 1.0F, 2.3F);
            this.Tail1.addBox(-1.1F, -0.5F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, 0.5235987755982988F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 31, 19);
            this.HandLeft.setPos(-0.2F, 2.5F, -1.2F);
            this.HandLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.19198621771937624F, 0.0781907508222411F, -0.19547687289441354F);
            this.ForearmLeft = new ModelRenderer(this, 12, 20);
            this.ForearmLeft.setPos(0.0F, 2.5F, 1.3F);
            this.ForearmLeft.addBox(-1.0F, -0.1F, -2.0F, 2.0F, 2.9F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmLeft, -0.46914448828868976F, 0.0F, 0.27366763203903305F);
            this.Mouth = new ModelRenderer(this, 55, 13);
            this.Mouth.setPos(0.0F, 0.6F, 0.3F);
            this.Mouth.addBox(-1.0F, 0.0F, -1.1F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.42184608153861F, 0.0F, 0.0F);
            this.Nose = new ModelRenderer(this, 33, 0);
            this.Nose.setPos(0.0F, -0.6F, -0.5F);
            this.Nose.addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Nose, 0.7037167490777915F, -0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 38, 0);
            this.Hips.setPos(0.0F, 0.0F, 5.0F);
            this.Hips.addBox(-2.5F, 0.0F, 0.0F, 5.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.2792526803190927F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 22, 11);
            this.EarLeft.setPos(1.0F, -1.4F, 0.7F);
            this.EarLeft.addBox(-0.5F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.06981317007977318F, -0.03490658503988659F, 0.13962634015954636F);
            this.Bridge = new ModelRenderer(this, 35, 16);
            this.Bridge.setPos(0.0F, -1.0F, 0.1F);
            this.Bridge.addBox(-1.0F, -0.3F, -1.1F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Bridge, 0.27314402127920984F, 0.0F, 0.0F);
            this.LegLeft = new ModelRenderer(this, 54, 0);
            this.LegLeft.setPos(0.0F, 5.0F, -1.0F);
            this.LegLeft.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, 0.6255260065779288F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 0, 12);
            this.Neck.setPos(0.0F, -1.2F, -1.6F);
            this.Neck.addBox(-1.5F, -0.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.02617993877991494F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 44, 13);
            this.Head.setPos(0.0F, 1.0F, -2.0F);
            this.Head.addBox(-2.0F, -2.0F, -1.5F, 4.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, -0.15707963267948966F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 35, 8);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-2.0F, 0.5F, 1.4F);
            this.ThighRight.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.23457224414434488F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 25, 15);
            this.Snout.setPos(0.0F, 0.8F, -1.1F);
            this.Snout.addBox(-1.5F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.296705972839036F, -0.0F, 0.0F);
            this.NeckUnder = new ModelRenderer(this, 25, 11);
            this.NeckUnder.setPos(0.0F, 2.5F, -1.5F);
            this.NeckUnder.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckUnder, -0.23457224414434488F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 35, 8);
            this.ThighLeft.setPos(2.0F, 0.5F, 1.4F);
            this.ThighLeft.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.23457224414434488F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 22, 11);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-1.0F, -1.4F, 0.7F);
            this.EarRight.addBox(-1.5F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.06981317007977318F, -0.03490658503988659F, -0.13962634015954636F);
            this.ArmRight.addChild(this.ForearmRight);
            this.ForearmRight.addChild(this.HandRight);
            this.Chest.addChild(this.ArmRight);
            this.Head.addChild(this.CheekLeft);
            this.Head.addChild(this.CheekRight);
            this.LegRight.addChild(this.FootRight);
            this.Chest.addChild(this.ArmLeft);
            this.LegLeft.addChild(this.FootLeft);
            this.Chest.addChild(this.Body);
            this.ThighRight.addChild(this.LegRight);
            this.Hips.addChild(this.Tail1);
            this.ForearmLeft.addChild(this.HandLeft);
            this.ArmLeft.addChild(this.ForearmLeft);
            this.Snout.addChild(this.Mouth);
            this.Snout.addChild(this.Nose);
            this.Body.addChild(this.Hips);
            this.Head.addChild(this.EarLeft);
            this.Snout.addChild(this.Bridge);
            this.ThighLeft.addChild(this.LegLeft);
            this.Chest.addChild(this.Neck);
            this.Neck.addChild(this.Head);
            this.Hips.addChild(this.ThighRight);
            this.Head.addChild(this.Snout);
            this.Neck.addChild(this.NeckUnder);
            this.Hips.addChild(this.ThighLeft);
            this.Head.addChild(this.EarRight);
            this.saveBase();

        }

        @Override
        public void setupAnim(WombatEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Head.xRot = (headPitch / (180F / (float)Math.PI)) - 0.157F;
            this.Head.yRot = netHeadYaw / (180F / (float)Math.PI);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = MathHelper.cos(limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount - 0.026F;
            this.Head.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.1F) * degree * -0.05F * limbSwingAmount - 0.157F;
            this.EarLeft.zRot = MathHelper.cos(limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount + 0.139F;
            this.EarRight.zRot = MathHelper.cos(limbSwing * speed * 0.1F) * degree * 0.1F * limbSwingAmount - 0.139F;
            this.Tail1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount + 0.523F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 4.0f;
            float degree = 0.3f;
            this.Chest.y = MathHelper.sin(limbSwing * speed * 0.4F) * degree * 0.4F * limbSwingAmount + 18.3F;
            this.Chest.xRot = MathHelper.cos(limbSwing * speed * 0.4F) * degree * 0.05F * limbSwingAmount + 0.191F;
            this.Chest.zRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * 0.4F * limbSwingAmount;
            this.Neck.xRot = MathHelper.cos(limbSwing * speed * 0.4F) * degree * 0.2F * limbSwingAmount - 0.026F;
            this.Head.xRot = MathHelper.cos(limbSwing * speed * 0.4F) * degree * -0.2F * limbSwingAmount - 0.157F;
            this.ArmLeft.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * 2.0F * limbSwingAmount + 0.078F;
            this.ForearmLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * degree * 1.5F * limbSwingAmount + -0.469F;
            this.HandLeft.xRot = MathHelper.cos(0.5F + limbSwing * speed * 0.2F) * degree * -1.5F * limbSwingAmount + 0.273F;
            this.ArmRight.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * -2.0F * limbSwingAmount + 0.078F;
            this.ForearmRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * degree * -1.5F * limbSwingAmount + -0.469F;
            this.HandRight.xRot = MathHelper.cos(0.5F + limbSwing * speed * 0.2F) * degree * 1.5F * limbSwingAmount + 0.273F;
            this.ThighLeft.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.234F;
            this.LegLeft.xRot = MathHelper.cos(1.5F + limbSwing * speed * 0.2F) * degree * 2.0F * limbSwingAmount + 0.625F;
//        this.LegLeft.xRot = MathHelper.cos(3.5F + limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount + 0.625F;
            this.FootLeft.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + -0.469F;
            this.ThighRight.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.234F;
            this.LegRight.xRot = MathHelper.cos(1.5F + limbSwing * speed * 0.2F) * degree * -2.0F * limbSwingAmount + 0.625F;
//        this.LegRight.xRot = MathHelper.cos(3.5F + limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount + 0.625F;
            this.FootRight.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + -0.469F;
            this.Tail1.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.4F) * degree * 0.4F * limbSwingAmount - 0.312F;
//        this.Tail2.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * degree * 0.4F * limbSwingAmount + 0.273F;
        }
    }
}

