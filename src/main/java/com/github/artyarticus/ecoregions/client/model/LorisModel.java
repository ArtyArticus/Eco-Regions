package com.github.artyarticus.ecoregions.client.model;

import com.github.artyarticus.ecoregions.entity.LorisEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class LorisModel extends ZawaBaseModel<LorisEntity> {
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

    public static class Adult extends LorisModel {

        public ModelRenderer Body;
        public ModelRenderer Neck;
        public ModelRenderer UpperArmLeft;
        public ModelRenderer UpperArmRight;
        public ModelRenderer Hips;
        public ModelRenderer ThighLeft;
        public ModelRenderer Tail;
        public ModelRenderer ThighRight;
        public ModelRenderer LegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer LegRight;
        public ModelRenderer FootRight;
        public ModelRenderer Head;
        public ModelRenderer Snout;
        public ModelRenderer PygmyEarLeft;
        public ModelRenderer EarRight;
        public ModelRenderer PygmyEarRight;
        public ModelRenderer CheekLeft;
        public ModelRenderer CheekRight;
        public ModelRenderer Nose;
        public ModelRenderer Mouth;
        public ModelRenderer LowerArmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer ThumbLeft;
        public ModelRenderer LowerArmRight;
        public ModelRenderer HandRight;
        public ModelRenderer ThumbRight;
        public ModelRenderer EarLeft;

        public Adult() {
            this.texWidth = 64;
            this.texHeight = 32;
            this.ThumbRight = new ModelRenderer(this, 8, 16);
            this.ThumbRight.setPos(1.0F, 0.1F, 0.0F);
            this.ThumbRight.addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThumbRight, 0.0F, -0.3909537457888271F, 0.0F);
            this.Tail = new ModelRenderer(this, 17, 0);
            this.Tail.setPos(0.0F, 0.5F, 2.0F);
            this.Tail.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail, 0.39112828270876815F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 0, 26);
            this.HandRight.setPos(0.0F, 3.0F, 0.0F);
            this.HandRight.addBox(-0.9F, -0.5F, -2.0F, 2.0F, 1.0F, 3.0F, 0.02F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.46914448828868976F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 10);
            this.Chest.setPos(0.0F, 17.7F, 0.0F);
            this.Chest.addBox(-2.5F, -2.5F, -1.0F, 5.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, 0.03909537541112055F, 0.0F, 0.0F);
            this.LegRight = new ModelRenderer(this, 28, 6);
            this.LegRight.setPos(0.0F, 3.5F, -1.0F);
            this.LegRight.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, 0.43127084218883227F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 0, 30);
            this.EarLeft.mirror = true;
            this.EarLeft.setPos(1.8F, -0.5F, -0.5F);
            this.EarLeft.addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.0F, -0.4300491170387584F, -0.3127630032889644F);
            this.Body = new ModelRenderer(this, 34, 0);
            this.Body.setPos(0.0F, -1.6F, 0.5F);
            this.Body.addBox(-3.0F, -1.0F, 0.0F, 6.0F, 5.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, -0.0781907508222411F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 10, 17);
            this.Neck.setPos(0.0F, -2.2F, -0.5F);
            this.Neck.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 4.0F, 4.0F, -0.05F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.27366763203903305F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 28, 25);
            this.Snout.setPos(0.0F, 0.5F, -3.0F);
            this.Snout.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.3522074483787779F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 20, 0);
            this.ThighRight.setPos(-2.1F, 1.0F, 1.1F);
            this.ThighRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.42987458011881735F, 0.0F, 0.0F);
            this.LowerArmRight = new ModelRenderer(this, 0, 22);
            this.LowerArmRight.setPos(0.0F, 3.5F, 0.5F);
            this.LowerArmRight.addBox(-0.9F, 0.0F, -0.5F, 2.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerArmRight, -0.6255260065779288F, 0.0F, 0.0F);
            this.PygmyEarLeft = new ModelRenderer(this, 29, 16);
            this.PygmyEarLeft.mirror = true;
            this.PygmyEarLeft.setPos(2.0F, -1.5F, -1.0F);
            this.PygmyEarLeft.addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(PygmyEarLeft, 0.0F, -0.35185837453889574F, 0.3909537457888271F);
            this.FootLeft = new ModelRenderer(this, 30, 12);
            this.FootLeft.mirror = true;
            this.FootLeft.setPos(0.0F, 4.0F, 1.0F);
            this.FootLeft.addBox(-1.0F, -0.5F, -3.1F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, -0.23457224414434488F, 0.0F, 0.0F);
            this.LegLeft = new ModelRenderer(this, 28, 6);
            this.LegLeft.mirror = true;
            this.LegLeft.setPos(0.0F, 3.5F, -1.0F);
            this.LegLeft.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, 0.43127084218883227F, 0.0F, 0.0F);
            this.Nose = new ModelRenderer(this, 26, 22);
            this.Nose.setPos(0.0F, 0.0F, -0.3F);
            this.Nose.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Nose, 0.27366763203903305F, 0.0F, 0.0F);
            this.LowerArmLeft = new ModelRenderer(this, 0, 22);
            this.LowerArmLeft.mirror = true;
            this.LowerArmLeft.setPos(0.0F, 3.5F, 0.5F);
            this.LowerArmLeft.addBox(-1.1F, 0.0F, -0.5F, 2.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerArmLeft, -0.6255260065779288F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 26, 20);
            this.Mouth.setPos(-0.01F, 1.0F, 1.0F);
            this.Mouth.addBox(-1.0F, -0.2F, -0.95F, 2.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.1563815016444822F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 30, 12);
            this.FootRight.setPos(0.0F, 4.0F, 1.0F);
            this.FootRight.addBox(-1.0F, -0.5F, -3.1F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, -0.23457224414434488F, 0.0F, 0.0F);
            this.CheekRight = new ModelRenderer(this, 7, 25);
            this.CheekRight.setPos(-1.2F, 1.2F, -0.1F);
            this.CheekRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(CheekRight, 0.0F, 0.0F, 0.19547687289441354F);
            this.PygmyEarRight = new ModelRenderer(this, 29, 16);
            this.PygmyEarRight.setPos(-2.0F, -1.5F, -1.0F);
            this.PygmyEarRight.addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(PygmyEarRight, 0.0F, 0.35185837453889574F, -0.3909537457888271F);
            this.HandLeft = new ModelRenderer(this, 0, 26);
            this.HandLeft.mirror = true;
            this.HandLeft.setPos(0.0F, 3.0F, 0.0F);
            this.HandLeft.addBox(-1.1F, -0.5F, -2.0F, 2.0F, 1.0F, 3.0F, 0.02F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.46914448828868976F, 0.0F, 0.0F);
            this.CheekLeft = new ModelRenderer(this, 7, 25);
            this.CheekLeft.setPos(1.2F, 1.2F, -0.1F);
            this.CheekLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(CheekLeft, 0.0F, 0.0F, -0.19547687289441354F);
            this.EarRight = new ModelRenderer(this, 0, 30);
            this.EarRight.setPos(-1.8F, -0.5F, -0.5F);
            this.EarRight.addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.0F, 0.4300491170387584F, 0.3127630032889644F);
            this.ThighLeft = new ModelRenderer(this, 20, 0);
            this.ThighLeft.mirror = true;
            this.ThighLeft.setPos(2.1F, 1.0F, 1.1F);
            this.ThighLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.42987458011881735F, 0.0F, 0.0F);
            this.UpperArmLeft = new ModelRenderer(this, 0, 16);
            this.UpperArmLeft.mirror = true;
            this.UpperArmLeft.setPos(2.1F, -0.1F, -0.5F);
            this.UpperArmLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmLeft, 0.1563815016444822F, -0.11728612207217244F, 0.0781907508222411F);
            this.ThumbLeft = new ModelRenderer(this, 8, 16);
            this.ThumbLeft.mirror = true;
            this.ThumbLeft.setPos(-1.0F, 0.1F, 0.0F);
            this.ThumbLeft.addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThumbLeft, 0.0F, 0.3909537457888271F, 0.0F);
            this.Hips = new ModelRenderer(this, 14, 10);
            this.Hips.setPos(0.0F, -1.0F, 6.0F);
            this.Hips.addBox(-2.5F, 0.0F, 0.0F, 5.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.5866051722479385F, 0.0F, 0.0F);
            this.UpperArmRight = new ModelRenderer(this, 0, 16);
            this.UpperArmRight.setPos(-2.1F, -0.1F, -0.5F);
            this.UpperArmRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmRight, 0.1563815016444822F, 0.11728612207217244F, -0.0781907508222411F);
            this.Head = new ModelRenderer(this, 17, 25);
            this.Head.setPos(0.0F, 1.9F, -1.5F);
            this.Head.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.27366763203903305F, 0.0F, 0.0F);
            this.HandRight.addChild(this.ThumbRight);
            this.Hips.addChild(this.Tail);
            this.LowerArmRight.addChild(this.HandRight);
            this.ThighRight.addChild(this.LegRight);
            this.Head.addChild(this.EarLeft);
            this.Chest.addChild(this.Body);
            this.Chest.addChild(this.Neck);
            this.Head.addChild(this.Snout);
            this.Hips.addChild(this.ThighRight);
            this.UpperArmRight.addChild(this.LowerArmRight);
            this.Head.addChild(this.PygmyEarLeft);
            this.LegLeft.addChild(this.FootLeft);
            this.ThighLeft.addChild(this.LegLeft);
            this.Snout.addChild(this.Nose);
            this.UpperArmLeft.addChild(this.LowerArmLeft);
            this.Snout.addChild(this.Mouth);
            this.LegRight.addChild(this.FootRight);
            this.Head.addChild(this.CheekRight);
            this.Head.addChild(this.PygmyEarRight);
            this.LowerArmLeft.addChild(this.HandLeft);
            this.Head.addChild(this.CheekLeft);
            this.Head.addChild(this.EarRight);
            this.Hips.addChild(this.ThighLeft);
            this.Chest.addChild(this.UpperArmLeft);
            this.HandLeft.addChild(this.ThumbLeft);
            this.Body.addChild(this.Hips);
            this.Chest.addChild(this.UpperArmRight);
            this.Neck.addChild(this.Head);
            this.saveBase();
        }

        @Override
        public void setupAnim(LorisEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
            this.Head.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = MathHelper.cos(limbSwing * speed * 0.1F + 3.1415927F) * degree * 0.2F * limbSwingAmount * 0.5F - 0.27F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (entity.isSprinting()) {
                float speed = 1.5f;
                float degree = 0.4f;

                this.ThighLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -4.5F * limbSwingAmount * 0.5F + 0.43F;
                this.LegLeft.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.43F;
                this.FootLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.0F * limbSwingAmount * 0.5F - 0.23F;
                this.ThighRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -4.5F * limbSwingAmount * 0.5F + 0.43F;
                this.LegRight.xRot = MathHelper.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.43F;
                this.FootRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.0F * limbSwingAmount * 0.5F - 0.23F;

                this.Chest.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -0.7F * limbSwingAmount * 0.5F + 0.04F;
                this.Body.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -0.8F * limbSwingAmount * 0.5F - 0.08F;
                this.Chest.y = MathHelper.cos(2.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F + -0.15F + 17.7F;
                this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 0.8F * limbSwingAmount * 0.5F - 0.27F;
                this.Head.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 0.4F * limbSwingAmount * 0.5F + 0.27F;

                this.Tail.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 3.0F * limbSwingAmount * 0.5F + 0.39F;

                this.UpperArmLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -4.0F * limbSwingAmount * 0.5F + 0.16F;
                this.LowerArmLeft.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F - 0.63F;
                this.HandLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -5.0F * limbSwingAmount * 0.5F + 0.47F;
                this.UpperArmRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 4.0F * limbSwingAmount * 0.5F + 0.16F;
                this.LowerArmRight.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F - 0.63F;
                this.HandRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 5.0F * limbSwingAmount * 0.5F + 0.47F;

            } else {
                float speed = 0.9f;
                float degree = 0.6f;
                this.UpperArmLeft.xRot = MathHelper.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.16F;
                this.LowerArmLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F - 0.63F;
                this.HandLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F + 0.47F;
                this.UpperArmRight.xRot = MathHelper.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F + 0.16F;
                this.LowerArmRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.5F * limbSwingAmount * 0.5F - 0.63F;
                this.HandRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.47F;

                this.ThighLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F + 0.43F;
                this.LegLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.43F;
                this.FootLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.5F * limbSwingAmount * 0.5F - 0.23F;
                this.ThighRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.43F;
                this.LegRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 3.0F * limbSwingAmount * 0.5F + 0.43F;
                this.FootRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F - 0.23F;

                this.Chest.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * 0.15F * limbSwingAmount * 0.5F + (this.isSwimming ? -0.2F : +0.04F);
                this.Body.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * -0.17F * limbSwingAmount * 0.5F - 0.08F;
                this.Neck.xRot = MathHelper.cos(limbSwing * speed * 0.0F + 3.1415927F) * degree * 0.0F * limbSwingAmount * 0.5F - 0.27F;

                this.Tail.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * 0.3F * limbSwingAmount * 0.5F + (this.isSwimming ? 0.2F : +0.39F);
            }
        }
    }


    public static class Child extends LorisModel {

        public ModelRenderer Neck;
        public ModelRenderer Hip;
        public ModelRenderer UpperArmLeft;
        public ModelRenderer UpperArmRight;
        public ModelRenderer Head;
        public ModelRenderer Snout;
        public ModelRenderer PygmyEarLeft;
        public ModelRenderer EarLeft;
        public ModelRenderer CheekLeft;
        public ModelRenderer PygmyEarRight;
        public ModelRenderer CheekRight;
        public ModelRenderer EarRight;
        public ModelRenderer Nose;
        public ModelRenderer Mouth;
        public ModelRenderer Tail;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer LegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer LegRight;
        public ModelRenderer FootRight;
        public ModelRenderer ArmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer ArmRight;
        public ModelRenderer HandRight;

        public Child() {
            this.texWidth = 32;
            this.texHeight = 16;
            this.Snout = new ModelRenderer(this, 22, 3);
            this.Snout.setPos(0.0F, 0.4F, -1.7F);
            this.Snout.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.3522074483787779F, 0.0F, 0.0F);
            this.UpperArmRight = new ModelRenderer(this, 9, 10);
            this.UpperArmRight.mirror = true;
            this.UpperArmRight.setPos(-1.1F, 0.4F, -1.25F);
            this.UpperArmRight.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmRight, 0.11728612207217244F, 0.0F, 0.0F);
            this.Tail = new ModelRenderer(this, 0, 10);
            this.Tail.setPos(0.0F, -0.5F, 1.8F);
            this.Tail.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail, -0.5462880425584197F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 5, 10);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(0.0F, 1.8F, 0.0F);
            this.ArmRight.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.35185837453889574F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 10, 5);
            this.Neck.setPos(0.0F, -0.7F, -1.5F);
            this.Neck.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.2275909337942703F, 0.0F, 0.0F);
            this.UpperArmLeft = new ModelRenderer(this, 9, 10);
            this.UpperArmLeft.setPos(1.1F, 0.5F, -1.25F);
            this.UpperArmLeft.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmLeft, 0.11728612207217244F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 24, 8);
            this.ThighLeft.setPos(1.0F, 1.0F, 0.55F);
            this.ThighLeft.addBox(-1.0F, -0.4F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.1494001912944076F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 0, 12);
            this.HandRight.mirror = true;
            this.HandRight.setPos(-0.1F, 0.9F, 0.0F);
            this.HandRight.addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.22410027861923298F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 24, 8);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-1.0F, 1.0F, 0.55F);
            this.ThighRight.addBox(-1.0F, -0.4F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.1494001912944076F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 24, 0);
            this.EarRight.setPos(-1.0F, 0.0F, -0.2F);
            this.EarRight.addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.0F, 0.4300491170387584F, 0.3127630032889644F);
            this.Hip = new ModelRenderer(this, 0, 0);
            this.Hip.setPos(-0.01F, -1.0F, 1.0F);
            this.Hip.addBox(-1.5F, -0.5F, -0.2F, 3.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hip, -0.2923426497090502F, 0.0F, 0.0F);
            this.CheekRight = new ModelRenderer(this, 18, 5);
            this.CheekRight.setPos(-1.0F, 0.6F, -0.05F);
            this.CheekRight.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(CheekRight, 0.0F, 0.0F, 0.19547687289441354F);
            this.HandLeft = new ModelRenderer(this, 0, 12);
            this.HandLeft.setPos(0.1F, 0.9F, 0.0F);
            this.HandLeft.addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.22410027861923298F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 28, 3);
            this.Mouth.setPos(0.0F, 1.0F, 1.0F);
            this.Mouth.addBox(-0.5F, -0.4F, -0.95F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.1563815016444822F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 10, 0);
            this.Head.setPos(0.0F, 0.6F, -1.3F);
            this.Head.addBox(-1.5F, -1.5F, -1.0F, 3.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.27366763203903305F, 0.0F, 0.0F);
            this.Nose = new ModelRenderer(this, 24, 5);
            this.Nose.setPos(0.0F, 0.0F, 0.0F);
            this.Nose.addBox(-0.5F, 0.0F, -0.2F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Nose, 0.27366763203903305F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 13, 10);
            this.FootLeft.setPos(0.01F, 2.3F, 0.3F);
            this.FootLeft.addBox(-0.5F, -0.5F, -1.3F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, -0.2988003825888152F, 0.0F, 0.0F);
            this.PygmyEarLeft = new ModelRenderer(this, 20, 0);
            this.PygmyEarLeft.mirror = true;
            this.PygmyEarLeft.setPos(1.4F, -0.5F, -0.2F);
            this.PygmyEarLeft.addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(PygmyEarLeft, 0.0F, -0.35185837453889574F, 0.3909537457888271F);
            this.LegRight = new ModelRenderer(this, 19, 9);
            this.LegRight.mirror = true;
            this.LegRight.setPos(0.0F, 1.1F, -0.5F);
            this.LegRight.addBox(-0.5F, 0.2F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, 0.4855505925785003F, 0.0F, 0.0F);
            this.PygmyEarRight = new ModelRenderer(this, 20, 0);
            this.PygmyEarRight.setPos(-1.4F, -0.5F, -0.2F);
            this.PygmyEarRight.addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.1F, 0.0F);
            this.setRotateAngle(PygmyEarRight, 0.0F, 0.35185837453889574F, -0.3909537457888271F);
            this.LegLeft = new ModelRenderer(this, 19, 9);
            this.LegLeft.setPos(0.0F, 1.1F, -0.5F);
            this.LegLeft.addBox(-0.5F, 0.2F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, 0.4855505925785003F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 24, 0);
            this.EarLeft.mirror = true;
            this.EarLeft.setPos(1.0F, 0.0F, -0.2F);
            this.EarLeft.addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.0F, -0.4300491170387584F, -0.3127630032889644F);
            this.CheekLeft = new ModelRenderer(this, 18, 5);
            this.CheekLeft.setPos(1.0F, 0.6F, -0.05F);
            this.CheekLeft.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(CheekLeft, 0.0F, 0.0F, -0.19547687289441354F);
            this.ArmLeft = new ModelRenderer(this, 5, 10);
            this.ArmLeft.setPos(0.0F, 1.8F, 0.0F);
            this.ArmLeft.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.35185837453889574F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 13, 10);
            this.FootRight.mirror = true;
            this.FootRight.setPos(-0.01F, 2.3F, 0.3F);
            this.FootRight.addBox(-0.5F, -0.5F, -1.3F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, -0.2988003825888152F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 5);
            this.Chest.setPos(0.0F, 20.6F, 0.0F);
            this.Chest.addBox(-1.5F, -1.5F, -1.3F, 3.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.3F);
            this.setRotateAngle(Chest, 0.04555309164612875F, 0.0F, 0.0F);
            this.Head.addChild(this.Snout);
            this.Chest.addChild(this.UpperArmRight);
            this.Hip.addChild(this.Tail);
            this.UpperArmRight.addChild(this.ArmRight);
            this.Chest.addChild(this.Neck);
            this.Chest.addChild(this.UpperArmLeft);
            this.Hip.addChild(this.ThighLeft);
            this.ArmRight.addChild(this.HandRight);
            this.Hip.addChild(this.ThighRight);
            this.Head.addChild(this.EarRight);
            this.Chest.addChild(this.Hip);
            this.Head.addChild(this.CheekRight);
            this.ArmLeft.addChild(this.HandLeft);
            this.Snout.addChild(this.Mouth);
            this.Neck.addChild(this.Head);
            this.Snout.addChild(this.Nose);
            this.LegLeft.addChild(this.FootLeft);
            this.Head.addChild(this.PygmyEarLeft);
            this.ThighRight.addChild(this.LegRight);
            this.Head.addChild(this.PygmyEarRight);
            this.ThighLeft.addChild(this.LegLeft);
            this.Head.addChild(this.EarLeft);
            this.Head.addChild(this.CheekLeft);
            this.UpperArmLeft.addChild(this.ArmLeft);
            this.LegRight.addChild(this.FootRight);
            this.saveBase();

        }

        @Override
        public void setupAnim(LorisEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
            this.Head.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = MathHelper.cos(limbSwing * speed * 0.1F + 3.1415927F) * degree * 0.2F * limbSwingAmount * 0.5F -0.228F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (entity.isSprinting()) {
                float speed = 1.5f;
                float degree = 0.4f;
            } else {
                float speed = 0.9f;
                float degree = 0.6f;
                this.UpperArmLeft.xRot = MathHelper.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.117F;
                this.ArmLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F - 0.352F;
                this.HandLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F + 0.224F;
                this.UpperArmRight.xRot = MathHelper.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F + 0.117F;
                this.ArmRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.5F * limbSwingAmount * 0.5F - 0.352F;
                this.HandRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.224F;

                this.ThighLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F + 0.149F;
                this.LegLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.485F;
                this.FootLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.5F * limbSwingAmount * 0.5F - 0.299F;
                this.ThighRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.149F;
                this.LegRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 3.0F * limbSwingAmount * 0.5F + 0.485F;
                this.FootRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F - 0.299F;

                this.Chest.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * 0.15F * limbSwingAmount * 0.5F + (this.isSwimming ? -0.2F : + 0.046F);
                this.Hip.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * -0.17F * limbSwingAmount * 0.5F - 0.292F;
                this.Neck.xRot = MathHelper.cos(limbSwing * speed * 0.0F + 3.1415927F) * degree * 0.0F * limbSwingAmount * 0.5F - 0.227F;

                this.Tail.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * 0.3F * limbSwingAmount * 0.5F + (this.isSwimming ? 0.2F : - 0.546F);
            }
        }
    }
}
