package com.github.artyarticus.ecoregions.client.model;

import com.github.artyarticus.ecoregions.entity.SkinkEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class SkinkModel extends ZawaBaseModel<SkinkEntity> {
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

    public static class Adult extends SkinkModel {

        public ModelRenderer Body;
        public ModelRenderer UpperArmLeft;
        public ModelRenderer Neck;
        public ModelRenderer UpperArmRight;
        public ModelRenderer Hips;
        public ModelRenderer ThighLeft;
        public ModelRenderer Tail1;
        public ModelRenderer ThighRight;
        public ModelRenderer LegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer ToeLeft1;
        public ModelRenderer ToeLeft2;
        public ModelRenderer Tail2;
        public ModelRenderer Tail3;
        public ModelRenderer LegRight;
        public ModelRenderer FootRight;
        public ModelRenderer ToeLeft1_1;
        public ModelRenderer ToeLeft2_1;
        public ModelRenderer ArmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer FingerLeft1;
        public ModelRenderer FingerLeft2;
        public ModelRenderer Head;
        public ModelRenderer Jaw;
        public ModelRenderer Snout;
        public ModelRenderer Mouth;
        public ModelRenderer Tongue;
        public ModelRenderer MouthLeft;
        public ModelRenderer MouthRight;
        public ModelRenderer SnoutTop;
        public ModelRenderer SnoutLeft;
        public ModelRenderer SnoutRight;
        public ModelRenderer ArmRight;
        public ModelRenderer HandRight;
        public ModelRenderer FingerLeft1_1;
        public ModelRenderer FingerLeft2_1;

        public Adult() {
            this.texWidth = 64;
            this.texHeight = 32;
            this.HandLeft = new ModelRenderer(this, 25, 16);
            this.HandLeft.mirror = true;
            this.HandLeft.setPos(0.1F, 0.4F, -0.5F);
            this.HandLeft.addBox(-0.5F, -0.01F, -0.8F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.19198621771937624F, 0.0F, 0.17453292519943295F);
            this.MouthRight = new ModelRenderer(this, 34, 15);
            this.MouthRight.mirror = true;
            this.MouthRight.setPos(-0.45F, 0.0F, -1.4F);
            this.MouthRight.addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(MouthRight, 0.0F, -0.35185837453889574F, 0.0F);
            this.FingerLeft2_1 = new ModelRenderer(this, 25, 14);
            this.FingerLeft2_1.setPos(-0.5F, 0.0F, 0.5F);
            this.FingerLeft2_1.addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FingerLeft2_1, 0.0F, 0.3490658503988659F, 0.0F);
            this.Hips = new ModelRenderer(this, 38, 26);
            this.Hips.setPos(0.0F, 0.0F, 6.0F);
            this.Hips.addBox(-2.0F, 0.0F, 0.0F, 4.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.11728612207217244F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 13, 18);
            this.ArmLeft.mirror = true;
            this.ArmLeft.setPos(0.0F, 1.1F, 0.0F);
            this.ArmLeft.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.3490658503988659F, 0.0F, 0.6981317007977318F);
            this.SnoutLeft = new ModelRenderer(this, 34, 11);
            this.SnoutLeft.setPos(0.53F, 0.5F, -1.4F);
            this.SnoutLeft.addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(SnoutLeft, 0.0F, 0.27366763203903305F, 0.0F);
            this.Jaw = new ModelRenderer(this, 31, 6);
            this.Jaw.setPos(0.01F, 0.7F, 0.0F);
            this.Jaw.addBox(-1.5F, 0.0F, -2.5F, 3.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 31, 0);
            this.Head.setPos(0.0F, 0.45F, -1.9F);
            this.Head.addBox(-1.5F, -1.0F, -2.5F, 3.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.31241392944908225F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 23);
            this.Body.setPos(0.0F, -1.0F, 1.5F);
            this.Body.addBox(-2.5F, 0.0F, 0.0F, 5.0F, 3.0F, 6.0F, 0.0F, 0.1F, 0.0F);
            this.setRotateAngle(Body, -0.0781907508222411F, 0.0F, 0.0F);
            this.Tail3 = new ModelRenderer(this, 52, 6);
            this.Tail3.setPos(0.0F, 0.0F, 4.7F);
            this.Tail3.addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail3, 0.08726646259971647F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 13, 18);
            this.ArmRight.setPos(0.0F, 1.1F, 0.0F);
            this.ArmRight.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.3490658503988659F, 0.0F, -0.6981317007977318F);
            this.UpperArmLeft = new ModelRenderer(this, 13, 14);
            this.UpperArmLeft.mirror = true;
            this.UpperArmLeft.setPos(1.9F, 1.0F, -0.1F);
            this.UpperArmLeft.addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmLeft, 0.2617993877991494F, -0.08726646259971647F, -0.8726646259971648F);
            this.ToeLeft2 = new ModelRenderer(this, 25, 14);
            this.ToeLeft2.setPos(-0.5F, 0.0F, 0.5F);
            this.ToeLeft2.addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ToeLeft2, 0.0F, 0.3490658503988659F, 0.0F);
            this.Mouth = new ModelRenderer(this, 44, 11);
            this.Mouth.setPos(0.0F, 0.5F, -2.1F);
            this.Mouth.addBox(-1.0F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.19547687289441354F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 50, 13);
            this.Tail2.setPos(0.0F, 0.0F, 3.7F);
            this.Tail2.addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, 0.06981317007977318F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 25, 16);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.2F, 0.3F, -0.4F);
            this.FootRight.addBox(-0.5F, -0.01F, -0.8F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, -0.47263516010848383F, 0.0F, -0.17453292519943295F);
            this.MouthLeft = new ModelRenderer(this, 34, 15);
            this.MouthLeft.setPos(0.45F, 0.0F, -1.4F);
            this.MouthLeft.addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(MouthLeft, 0.0F, 0.35185837453889574F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 7, 14);
            this.ThighLeft.mirror = true;
            this.ThighLeft.setPos(1.8F, 1.8F, 1.5F);
            this.ThighLeft.addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.5354670198381825F, -0.08726646259971647F, -0.8726646259971648F);
            this.Tail1 = new ModelRenderer(this, 50, 21);
            this.Tail1.setPos(0.0F, 1.6F, 2.7F);
            this.Tail1.addBox(-1.5F, -1.6F, 0.0F, 3.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -0.06981317007977318F, 0.0F, 0.0F);
            this.ToeLeft1_1 = new ModelRenderer(this, 25, 14);
            this.ToeLeft1_1.setPos(0.5F, 0.0F, 0.5F);
            this.ToeLeft1_1.addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ToeLeft1_1, 0.0F, -0.3490658503988659F, 0.0F);
            this.FingerLeft2 = new ModelRenderer(this, 25, 14);
            this.FingerLeft2.setPos(-0.5F, 0.0F, 0.5F);
            this.FingerLeft2.addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FingerLeft2, 0.0F, 0.3490658503988659F, 0.0F);
            this.LegLeft = new ModelRenderer(this, 7, 18);
            this.LegLeft.mirror = true;
            this.LegLeft.setPos(0.0F, 1.1F, 0.0F);
            this.LegLeft.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, 0.3490658503988659F, 0.0F, 0.6981317007977318F);
            this.LegRight = new ModelRenderer(this, 7, 18);
            this.LegRight.mirror = true;
            this.LegRight.setPos(0.0F, 1.1F, 0.0F);
            this.LegRight.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, 0.3490658503988659F, 0.0F, -0.6981317007977318F);
            this.UpperArmRight = new ModelRenderer(this, 13, 14);
            this.UpperArmRight.setPos(-1.9F, 1.0F, -0.1F);
            this.UpperArmRight.addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmRight, 0.2617993877991494F, 0.08726646259971647F, 0.8726646259971648F);
            this.FingerLeft1_1 = new ModelRenderer(this, 25, 14);
            this.FingerLeft1_1.setPos(0.5F, 0.0F, 0.5F);
            this.FingerLeft1_1.addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FingerLeft1_1, 0.0F, -0.3490658503988659F, 0.0F);
            this.HandRight = new ModelRenderer(this, 25, 16);
            this.HandRight.setPos(0.1F, 0.4F, -0.5F);
            this.HandRight.addBox(-0.5F, -0.01F, -0.8F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.19198621771937624F, 0.0F, -0.17453292519943295F);
            this.ToeLeft1 = new ModelRenderer(this, 25, 14);
            this.ToeLeft1.setPos(0.5F, 0.0F, 0.5F);
            this.ToeLeft1.addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ToeLeft1, 0.0F, -0.3490658503988659F, 0.0F);
            this.SnoutTop = new ModelRenderer(this, 33, 19);
            this.SnoutTop.setPos(0.0F, -0.67F, 0.1F);
            this.SnoutTop.addBox(-1.0F, -0.4F, -2.1F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(SnoutTop, 0.5473352640780661F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 7, 14);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-1.8F, 1.8F, 1.5F);
            this.ThighRight.addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.5354670198381825F, 0.08726646259971647F, 0.8726646259971648F);
            this.Snout = new ModelRenderer(this, 44, 7);
            this.Snout.setPos(0.0F, 0.07F, -2.0F);
            this.Snout.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, -0.1563815016444822F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 44, 0);
            this.Neck.setPos(0.0F, -0.6F, -0.8F);
            this.Neck.addBox(-1.5F, -0.6F, -1.9F, 3.0F, 3.0F, 3.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.23457224414434488F, 0.0F, 0.0F);
            this.ToeLeft2_1 = new ModelRenderer(this, 25, 14);
            this.ToeLeft2_1.setPos(-0.5F, 0.0F, 0.5F);
            this.ToeLeft2_1.addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ToeLeft2_1, 0.0F, 0.3490658503988659F, 0.0F);
            this.Tongue = new ModelRenderer(this, 17, 0);
            this.Tongue.setPos(0.0F, 0.1F, 0.6F);
            this.Tongue.addBox(-1.5F, -0.5F, -3.0F, 3.0F, 1.0F, 3.0F, -0.4F, -0.3F, 0.0F);
            this.setRotateAngle(Tongue, -0.0781907508222411F, 0.0F, 0.0F);
            this.SnoutRight = new ModelRenderer(this, 34, 11);
            this.SnoutRight.mirror = true;
            this.SnoutRight.setPos(-0.53F, 0.5F, -1.4F);
            this.SnoutRight.addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(SnoutRight, 0.0F, -0.3127630032889644F, 0.0F);
            this.Chest = new ModelRenderer(this, 23, 26);
            this.Chest.setPos(0.0F, 21.5F, -3.0F);
            this.Chest.addBox(-2.0F, -1.0F, -1.5F, 4.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, 0.0781907508222411F, 0.0F, 0.0F);
            this.FingerLeft1 = new ModelRenderer(this, 25, 14);
            this.FingerLeft1.setPos(0.5F, 0.0F, 0.5F);
            this.FingerLeft1.addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FingerLeft1, 0.0F, -0.3490658503988659F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 25, 16);
            this.FootLeft.mirror = true;
            this.FootLeft.setPos(0.2F, 0.3F, -0.4F);
            this.FootLeft.addBox(-0.5F, -0.01F, -0.8F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, -0.47263516010848383F, 0.0F, 0.17453292519943295F);
            this.ArmLeft.addChild(this.HandLeft);
            this.Mouth.addChild(this.MouthRight);
            this.HandRight.addChild(this.FingerLeft2_1);
            this.Body.addChild(this.Hips);
            this.UpperArmLeft.addChild(this.ArmLeft);
            this.Snout.addChild(this.SnoutLeft);
            this.Head.addChild(this.Jaw);
            this.Neck.addChild(this.Head);
            this.Chest.addChild(this.Body);
            this.Tail2.addChild(this.Tail3);
            this.UpperArmRight.addChild(this.ArmRight);
            this.Chest.addChild(this.UpperArmLeft);
            this.FootLeft.addChild(this.ToeLeft2);
            this.Jaw.addChild(this.Mouth);
            this.Tail1.addChild(this.Tail2);
            this.LegRight.addChild(this.FootRight);
            this.Mouth.addChild(this.MouthLeft);
            this.Hips.addChild(this.ThighLeft);
            this.Hips.addChild(this.Tail1);
            this.FootRight.addChild(this.ToeLeft1_1);
            this.HandLeft.addChild(this.FingerLeft2);
            this.ThighLeft.addChild(this.LegLeft);
            this.ThighRight.addChild(this.LegRight);
            this.Chest.addChild(this.UpperArmRight);
            this.HandRight.addChild(this.FingerLeft1_1);
            this.ArmRight.addChild(this.HandRight);
            this.FootLeft.addChild(this.ToeLeft1);
            this.Snout.addChild(this.SnoutTop);
            this.Hips.addChild(this.ThighRight);
            this.Head.addChild(this.Snout);
            this.Chest.addChild(this.Neck);
            this.FootRight.addChild(this.ToeLeft2_1);
            this.Jaw.addChild(this.Tongue);
            this.Snout.addChild(this.SnoutRight);
            this.HandLeft.addChild(this.FingerLeft1);
            this.LegLeft.addChild(this.FootLeft);
            this.saveBase();
        }

        @Override
        public void setupAnim(SkinkEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.312F;
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
            this.Tail1.xRot = MathHelper.cos(limbSwing * speed * 0.16F) * degree * 0.05F * limbSwingAmount -0.069F;
            this.Neck.xRot = MathHelper.cos(limbSwing * speed * 0.1F) * degree * 0.1F * limbSwingAmount -0.234F;
            this.Head.xRot = MathHelper.cos(limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount + 0.312F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 4.0f;
            float degree = 0.7f;
            this.UpperArmLeft.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.262F;
            this.ArmLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount - 0.349F;
            this.HandLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.191F;

            this.ThighLeft.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.535F;
            this.LegLeft.xRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.349F;
            this.FootLeft.xRot = MathHelper.cos(-2.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount -0.472F;

            this.UpperArmRight.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.262F;
            this.ArmRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount - 0.349F;
            this.HandRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.191F;

            this.ThighRight.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.535F;
            this.LegRight.xRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.349F;
            this.FootRight.xRot = MathHelper.cos(-2.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount -0.472F;

            this.Body.yRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount - 0.078F;
            this.Neck.yRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * degree * -0.2F * limbSwingAmount - 0.234F;
            this.Head.yRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount + 0.312F;
            this.Hips.yRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount - 0.117F;
            this.Tail1.yRot = MathHelper.cos(-2.0F + limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount;
            this.Tail2.yRot = MathHelper.cos(-3.0F + limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount;
            this.Tail3.yRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount;
        }
    }


    public static class Child extends SkinkModel {
        public ModelRenderer Body;
        public ModelRenderer UpperArmLeft;
        public ModelRenderer Neck;
        public ModelRenderer UpperArmRight;
        public ModelRenderer Hips;
        public ModelRenderer ThighLeft;
        public ModelRenderer Tail1;
        public ModelRenderer ThighRight;
        public ModelRenderer LegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer ToeLeft1;
        public ModelRenderer ToeLeft2;
        public ModelRenderer Tail2;
        public ModelRenderer Tail3;
        public ModelRenderer LegRight;
        public ModelRenderer FootRight;
        public ModelRenderer ToeLeft1_1;
        public ModelRenderer ToeLeft2_1;
        public ModelRenderer ArmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer FingerLeft1;
        public ModelRenderer FingerLeft2;
        public ModelRenderer Head;
        public ModelRenderer Jaw;
        public ModelRenderer Snout;
        public ModelRenderer Mouth;
        public ModelRenderer SnoutTop;
        public ModelRenderer ArmRight;
        public ModelRenderer HandRight;
        public ModelRenderer FingerLeft1_1;
        public ModelRenderer FingerLeft2_1;

        public Child() {
            this.texWidth = 64;
            this.texHeight = 32;
            this.SnoutTop = new ModelRenderer(this, 33, 7);
            this.SnoutTop.setPos(0.0F, -0.67F, 0.1F);
            this.SnoutTop.addBox(-1.0F, -0.4F, -2.1F, 2.0F, 1.0F, 2.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(SnoutTop, 0.5473352640780661F, 0.0F, 0.0F);
            this.FingerLeft2_1 = new ModelRenderer(this, 25, 14);
            this.FingerLeft2_1.setPos(-0.5F, 0.0F, 0.5F);
            this.FingerLeft2_1.addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FingerLeft2_1, 0.0F, 0.3490658503988659F, 0.0F);
            this.ToeLeft1_1 = new ModelRenderer(this, 25, 14);
            this.ToeLeft1_1.setPos(0.5F, 0.0F, 0.5F);
            this.ToeLeft1_1.addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ToeLeft1_1, 0.0F, -0.3490658503988659F, 0.0F);
            this.UpperArmLeft = new ModelRenderer(this, 13, 14);
            this.UpperArmLeft.mirror = true;
            this.UpperArmLeft.setPos(1.5F, 1.0F, -0.1F);
            this.UpperArmLeft.addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmLeft, 0.2617993877991494F, -0.08726646259971647F, -0.8726646259971648F);
            this.Hips = new ModelRenderer(this, 0, 12);
            this.Hips.setPos(0.0F, 0.0F, 4.0F);
            this.Hips.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.11728612207217244F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 13, 18);
            this.ArmLeft.mirror = true;
            this.ArmLeft.setPos(0.0F, 1.1F, 0.0F);
            this.ArmLeft.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.3490658503988659F, 0.0F, 0.6981317007977318F);
            this.ToeLeft2 = new ModelRenderer(this, 25, 14);
            this.ToeLeft2.setPos(-0.5F, 0.0F, 0.5F);
            this.ToeLeft2.addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ToeLeft2, 0.0F, 0.3490658503988659F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 5);
            this.Body.setPos(0.0F, -1.0F, 0.5F);
            this.Body.addBox(-2.0F, 0.0F, 0.0F, 4.0F, 3.0F, 4.0F, 0.0F, 0.1F, 0.0F);
            this.setRotateAngle(Body, -0.0781907508222411F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 25, 16);
            this.HandRight.setPos(0.1F, 0.4F, -0.5F);
            this.HandRight.addBox(-0.5F, -0.01F, -0.8F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.19198621771937624F, 0.0F, -0.17453292519943295F);
            this.Chest = new ModelRenderer(this, 0, 0);
            this.Chest.setPos(0.0F, 21.5F, -3.0F);
            this.Chest.addBox(-1.5F, -1.0F, -1.5F, 3.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, 0.0781907508222411F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 13, 18);
            this.ArmRight.setPos(0.0F, 1.1F, 0.0F);
            this.ArmRight.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.3490658503988659F, 0.0F, -0.6981317007977318F);
            this.Neck = new ModelRenderer(this, 26, 0);
            this.Neck.setPos(0.0F, -0.3F, -0.8F);
            this.Neck.addBox(-1.5F, -0.4F, -1.9F, 3.0F, 2.0F, 3.0F, -0.1F, 0.2F, 0.0F);
            this.setRotateAngle(Neck, -0.23457224414434488F, 0.0F, 0.0F);
            this.FingerLeft2 = new ModelRenderer(this, 25, 14);
            this.FingerLeft2.setPos(-0.5F, 0.0F, 0.5F);
            this.FingerLeft2.addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FingerLeft2, 0.0F, 0.3490658503988659F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 16, 6);
            this.Tail2.setPos(0.01F, 0.0F, 2.7F);
            this.Tail2.addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, 0.06981317007977318F, 0.0F, 0.0F);
            this.FingerLeft1_1 = new ModelRenderer(this, 25, 14);
            this.FingerLeft1_1.setPos(0.5F, 0.0F, 0.5F);
            this.FingerLeft1_1.addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FingerLeft1_1, 0.0F, -0.3490658503988659F, 0.0F);
            this.Snout = new ModelRenderer(this, 34, 10);
            this.Snout.setPos(0.0F, 0.07F, -1.0F);
            this.Snout.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, -0.1563815016444822F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 16, 0);
            this.Tail1.setPos(0.0F, 1.6F, 1.7F);
            this.Tail1.addBox(-1.0F, -1.5F, 0.0F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -0.06981317007977318F, 0.0F, 0.0F);
            this.ToeLeft2_1 = new ModelRenderer(this, 25, 14);
            this.ToeLeft2_1.setPos(-0.5F, 0.0F, 0.5F);
            this.ToeLeft2_1.addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ToeLeft2_1, 0.0F, 0.3490658503988659F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 0, 17);
            this.ThighLeft.mirror = true;
            this.ThighLeft.setPos(1.2F, 1.8F, 0.9F);
            this.ThighLeft.addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.5354670198381825F, -0.08726646259971647F, -0.8726646259971648F);
            this.LegRight = new ModelRenderer(this, 0, 20);
            this.LegRight.mirror = true;
            this.LegRight.setPos(0.0F, 1.1F, 0.0F);
            this.LegRight.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, 0.3490658503988659F, 0.0F, -0.6981317007977318F);
            this.UpperArmRight = new ModelRenderer(this, 13, 14);
            this.UpperArmRight.setPos(-1.4F, 1.0F, -0.1F);
            this.UpperArmRight.addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmRight, 0.2617993877991494F, 0.08726646259971647F, 0.8726646259971648F);
            this.FootLeft = new ModelRenderer(this, 25, 16);
            this.FootLeft.mirror = true;
            this.FootLeft.setPos(0.2F, 0.3F, -0.4F);
            this.FootLeft.addBox(-0.5F, -0.01F, -0.8F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, -0.47263516010848383F, 0.0F, 0.17453292519943295F);
            this.ThighRight = new ModelRenderer(this, 0, 17);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-1.2F, 1.8F, 1.5F);
            this.ThighRight.addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.5354670198381825F, 0.08726646259971647F, 0.8726646259971648F);
            this.Head = new ModelRenderer(this, 24, 5);
            this.Head.setPos(0.0F, 0.35F, -1.8F);
            this.Head.addBox(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.31241392944908225F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 25, 16);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.2F, 0.3F, -0.4F);
            this.FootRight.addBox(-0.5F, -0.01F, -0.8F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, -0.47263516010848383F, 0.0F, -0.17453292519943295F);
            this.ToeLeft1 = new ModelRenderer(this, 25, 14);
            this.ToeLeft1.setPos(0.5F, 0.0F, 0.5F);
            this.ToeLeft1.addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ToeLeft1, 0.0F, -0.3490658503988659F, 0.0F);
            this.FingerLeft1 = new ModelRenderer(this, 25, 14);
            this.FingerLeft1.setPos(0.5F, 0.0F, 0.5F);
            this.FingerLeft1.addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FingerLeft1, 0.0F, -0.3490658503988659F, 0.0F);
            this.Jaw = new ModelRenderer(this, 25, 9);
            this.Jaw.setPos(0.0F, 0.7F, 0.0F);
            this.Jaw.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 1.0F, 2.0F, -0.01F, 0.0F, 0.0F);
            this.setRotateAngle(Jaw, -0.038571777134864954F, 0.0F, 0.0F);
            this.LegLeft = new ModelRenderer(this, 0, 20);
            this.LegLeft.mirror = true;
            this.LegLeft.setPos(0.0F, 1.1F, 0.0F);
            this.LegLeft.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, 0.3490658503988659F, 0.0F, 0.6981317007977318F);
            this.HandLeft = new ModelRenderer(this, 25, 16);
            this.HandLeft.mirror = true;
            this.HandLeft.setPos(0.1F, 0.4F, -0.5F);
            this.HandLeft.addBox(-0.5F, -0.01F, -0.8F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.19198621771937624F, 0.0F, 0.17453292519943295F);
            this.Mouth = new ModelRenderer(this, 32, 13);
            this.Mouth.setPos(-0.01F, 0.5F, -1.1F);
            this.Mouth.addBox(-1.0F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.19547687289441354F, 0.0F, 0.0F);
            this.Tail3 = new ModelRenderer(this, 17, 11);
            this.Tail3.setPos(0.0F, 0.0F, 2.7F);
            this.Tail3.addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail3, 0.08726646259971647F, 0.0F, 0.0F);
            this.Snout.addChild(this.SnoutTop);
            this.HandRight.addChild(this.FingerLeft2_1);
            this.FootRight.addChild(this.ToeLeft1_1);
            this.Chest.addChild(this.UpperArmLeft);
            this.Body.addChild(this.Hips);
            this.UpperArmLeft.addChild(this.ArmLeft);
            this.FootLeft.addChild(this.ToeLeft2);
            this.Chest.addChild(this.Body);
            this.ArmRight.addChild(this.HandRight);
            this.UpperArmRight.addChild(this.ArmRight);
            this.Chest.addChild(this.Neck);
            this.HandLeft.addChild(this.FingerLeft2);
            this.Tail1.addChild(this.Tail2);
            this.HandRight.addChild(this.FingerLeft1_1);
            this.Head.addChild(this.Snout);
            this.Hips.addChild(this.Tail1);
            this.FootRight.addChild(this.ToeLeft2_1);
            this.Hips.addChild(this.ThighLeft);
            this.ThighRight.addChild(this.LegRight);
            this.Chest.addChild(this.UpperArmRight);
            this.LegLeft.addChild(this.FootLeft);
            this.Hips.addChild(this.ThighRight);
            this.Neck.addChild(this.Head);
            this.LegRight.addChild(this.FootRight);
            this.FootLeft.addChild(this.ToeLeft1);
            this.HandLeft.addChild(this.FingerLeft1);
            this.Head.addChild(this.Jaw);
            this.ThighLeft.addChild(this.LegLeft);
            this.ArmLeft.addChild(this.HandLeft);
            this.Jaw.addChild(this.Mouth);
            this.Tail2.addChild(this.Tail3);
            this.saveBase();

        }

        @Override
        public void setupAnim(SkinkEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.312F;
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
            this.Tail1.xRot = MathHelper.cos(limbSwing * speed * 0.16F) * degree * 0.05F * limbSwingAmount -0.069F;
            this.Neck.xRot = MathHelper.cos(limbSwing * speed * 0.1F) * degree * 0.1F * limbSwingAmount -0.234F;
            this.Head.xRot = MathHelper.cos(limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount + 0.312F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 4.0f;
            float degree = 0.7f;
            this.UpperArmLeft.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.262F;
            this.ArmLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount - 0.349F;
            this.HandLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.191F;

            this.ThighLeft.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.535F;
            this.LegLeft.xRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.349F;
            this.FootLeft.xRot = MathHelper.cos(-2.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount -0.472F;

            this.UpperArmRight.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.262F;
            this.ArmRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount - 0.349F;
            this.HandRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.191F;

            this.ThighRight.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.535F;
            this.LegRight.xRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.349F;
            this.FootRight.xRot = MathHelper.cos(-2.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount -0.472F;

            this.Body.yRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount - 0.078F;
            this.Neck.yRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * degree * -0.2F * limbSwingAmount - 0.234F;
            this.Head.yRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount + 0.312F;
            this.Hips.yRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount - 0.117F;
            this.Tail1.yRot = MathHelper.cos(-2.0F + limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount;
            this.Tail2.yRot = MathHelper.cos(-3.0F + limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount;
            this.Tail3.yRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount;
        }
    }
}

