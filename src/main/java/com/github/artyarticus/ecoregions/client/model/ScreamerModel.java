package com.github.artyarticus.ecoregions.client.model;

import com.github.artyarticus.ecoregions.entity.ScreamerEntity;
import com.github.artyarticus.ecoregions.entity.ScreamerEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class ScreamerModel extends ZawaBaseModel<ScreamerEntity> {
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

    public static class Adult extends ScreamerModel {

        public ModelRenderer Neck1;
        public ModelRenderer Wing1Left;
        public ModelRenderer ThighLeft;
        public ModelRenderer TailBase;
        public ModelRenderer ThighRight;
        public ModelRenderer Wing1Right;
        public ModelRenderer Neck2;
        public ModelRenderer Head;
        public ModelRenderer Forehead;
        public ModelRenderer Beak;
        public ModelRenderer Crest1;
        public ModelRenderer BeakTip;
        public ModelRenderer BottomBeak;
        public ModelRenderer CrestRight;
        public ModelRenderer CrestLeft;
        public ModelRenderer Wing2Left;
        public ModelRenderer Leg1Left;
        public ModelRenderer Leg2Left;
        public ModelRenderer FootLeft;
        public ModelRenderer Toe1Left;
        public ModelRenderer Toe2Left;
        public ModelRenderer Toe3Left;
        public ModelRenderer TailMiddle;
        public ModelRenderer TailRight;
        public ModelRenderer TailLeft;
        public ModelRenderer Leg1Right;
        public ModelRenderer Leg2Right;
        public ModelRenderer FootRight;
        public ModelRenderer Toe1Right;
        public ModelRenderer Toe2Right;
        public ModelRenderer Toe3Right;
        public ModelRenderer Wing2Right;

        public Adult() {
            this.texWidth = 64;
            this.texHeight = 32;
            this.FootRight = new ModelRenderer(this, 38, 26);
            this.FootRight.mirror = true;
            this.FootRight.setPos(-0.01F, 2.5F, 0.0F);
            this.FootRight.addBox(-0.5F, -1.0F, -3.5F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, 0.1171115934746098F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 56, 28);
            this.ThighLeft.mirror = true;
            this.ThighLeft.setPos(1.45F, 2.0F, 1.0F);
            this.ThighLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.5077162820683115F, 0.0F, 0.04555309164612875F);
            this.ThighRight = new ModelRenderer(this, 56, 28);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-1.45F, 2.0F, 1.0F);
            this.ThighRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.5077162820683115F, 0.0F, -0.04555309164612875F);
            this.TailBase = new ModelRenderer(this, 1, 22);
            this.TailBase.setPos(0.0F, -2.5F, 3.5F);
            this.TailBase.addBox(-2.0F, 0.0F, -4.0F, 4.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailBase, 1.0948450317865597F, 0.0F, 0.0F);
            this.Neck1 = new ModelRenderer(this, 24, 0);
            this.Neck1.setPos(0.0F, 1.5F, -3.8F);
            this.Neck1.addBox(-2.0F, -3.3F, -2.5F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck1, -0.6255260065779288F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 46, 0);
            this.Head.setPos(0.0F, -6.0F, 0.6F);
            this.Head.addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.35185837453889574F, 0.0F, 0.0F);
            this.Toe2Left = new ModelRenderer(this, 38, 26);
            this.Toe2Left.mirror = true;
            this.Toe2Left.setPos(0.2F, 0.1F, 0.0F);
            this.Toe2Left.addBox(-0.5F, -1.0F, -3.5F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, -0.1F);
            this.setRotateAngle(Toe2Left, 0.0F, 0.3122393925291412F, 0.0F);
            this.Leg2Right = new ModelRenderer(this, 46, 25);
            this.Leg2Right.mirror = true;
            this.Leg2Right.setPos(0.0F, 3.0F, 0.5F);
            this.Leg2Right.addBox(-0.5F, -0.5F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, -0.3F, 0.0F);
            this.setRotateAngle(Leg2Right, -0.13020156286456727F, 0.0F, 0.04555309164612875F);
            this.Toe1Right = new ModelRenderer(this, 38, 26);
            this.Toe1Right.mirror = true;
            this.Toe1Right.setPos(-0.2F, 0.1F, 0.0F);
            this.Toe1Right.addBox(-0.5F, -1.0F, -3.5F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, -0.1F);
            this.setRotateAngle(Toe1Right, 0.0F, -0.3122393925291412F, 0.0F);
            this.Wing2Right = new ModelRenderer(this, 35, 16);
            this.Wing2Right.setPos(0.0F, 0.7F, 4.5F);
            this.Wing2Right.addBox(-0.5F, -0.9F, 0.0F, 1.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Wing2Right, 0.03909537541112055F, -0.008377580222319268F, 0.03909537541112055F);
            this.Leg1Right = new ModelRenderer(this, 51, 27);
            this.Leg1Right.mirror = true;
            this.Leg1Right.setPos(-0.1F, 1.5F, 0.0F);
            this.Leg1Right.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Leg1Right, -0.23457224414434488F, 0.0F, 0.0F);
            this.Leg2Left = new ModelRenderer(this, 46, 25);
            this.Leg2Left.mirror = true;
            this.Leg2Left.setPos(0.0F, 3.0F, 0.5F);
            this.Leg2Left.addBox(-0.5F, -0.5F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, -0.3F, 0.0F);
            this.setRotateAngle(Leg2Left, -0.13020156286456727F, 0.0F, -0.04555309164612875F);
            this.Crest1 = new ModelRenderer(this, 59, 0);
            this.Crest1.setPos(0.0F, -0.8F, 1.0F);
            this.Crest1.addBox(-0.5F, -0.5F, -0.5F, 1.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Crest1, -0.31293754020890546F, 0.0F, 0.0F);
            this.Beak = new ModelRenderer(this, 56, 4);
            this.Beak.setPos(0.0F, 0.2F, -1.5F);
            this.Beak.addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Beak, 0.3127630032889644F, 0.0F, 0.0F);
            this.TailLeft = new ModelRenderer(this, 10, 14);
            this.TailLeft.setPos(1.7F, 0.2F, -0.15F);
            this.TailLeft.addBox(-2.0F, -0.6F, -1.0F, 2.0F, 6.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailLeft, -0.04555309164612875F, 0.0911061832922575F, 0.04712389063608474F);
            this.TailRight = new ModelRenderer(this, 10, 14);
            this.TailRight.mirror = true;
            this.TailRight.setPos(-1.7F, 0.2F, -0.15F);
            this.TailRight.addBox(0.0F, -0.6F, -1.0F, 2.0F, 6.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailRight, -0.04555309164612875F, -0.0911061832922575F, -0.04712389063608474F);
            this.FootLeft = new ModelRenderer(this, 38, 26);
            this.FootLeft.mirror = true;
            this.FootLeft.setPos(0.01F, 2.5F, 0.0F);
            this.FootLeft.addBox(-0.5F, -1.0F, -3.5F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 0.1171115934746098F, 0.0F, 0.0F);
            this.CrestLeft = new ModelRenderer(this, 60, 0);
            this.CrestLeft.setPos(0.0F, 0.1F, 0.0F);
            this.CrestLeft.addBox(0.0F, -0.5F, 0.3F, 1.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(CrestLeft, -0.1563815016444822F, 0.1563815016444822F, 0.0F);
            this.CrestRight = new ModelRenderer(this, 60, 0);
            this.CrestRight.mirror = true;
            this.CrestRight.setPos(0.0F, 0.1F, 0.0F);
            this.CrestRight.addBox(-1.0F, -0.5F, 0.3F, 1.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(CrestRight, -0.1563815016444822F, -0.1563815016444822F, 0.0F);
            this.BottomBeak = new ModelRenderer(this, 50, 7);
            this.BottomBeak.setPos(0.0F, 1.0F, 1.0F);
            this.BottomBeak.addBox(-0.5F, -0.4F, -2.0F, 1.0F, 1.0F, 2.0F, -0.11F, 0.0F, 0.0F);
            this.setRotateAngle(BottomBeak, -0.46914448828868976F, 0.0F, 0.0F);
            this.Toe3Left = new ModelRenderer(this, 32, 27);
            this.Toe3Left.mirror = true;
            this.Toe3Left.setPos(-0.01F, 0.0F, -0.1F);
            this.Toe3Left.addBox(-0.5F, -0.9F, -0.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, -0.1F);
            this.setRotateAngle(Toe3Left, -0.1171115934746098F, 0.0F, 0.0F);
            this.BeakTip = new ModelRenderer(this, 58, 8);
            this.BeakTip.setPos(0.0F, -0.2F, -1.1F);
            this.BeakTip.addBox(-0.5F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(BeakTip, -0.46931902520863084F, 0.0F, 0.0F);
            this.Wing1Left = new ModelRenderer(this, 48, 14);
            this.Wing1Left.setPos(2.0F, -2.6F, -2.7F);
            this.Wing1Left.addBox(-1.0F, -0.5F, -1.1F, 2.0F, 5.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Wing1Left, 0.03909537541112055F, 0.03909537541112055F, 0.03909537541112055F);
            this.Wing2Left = new ModelRenderer(this, 35, 16);
            this.Wing2Left.setPos(0.0F, 0.7F, 4.5F);
            this.Wing2Left.addBox(-0.5F, -0.9F, 0.0F, 1.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Wing2Left, 0.03909537541112055F, -0.0781907508222411F, -0.03909537541112055F);
            this.Body = new ModelRenderer(this, 0, 0);
            this.Body.setPos(0.0F, 15.2F, 0.0F);
            this.Body.addBox(-2.5F, -3.0F, -3.5F, 5.0F, 6.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, -0.1956514098143546F, 0.0F, 0.0F);
            this.TailMiddle = new ModelRenderer(this, 1, 14);
            this.TailMiddle.setPos(0.0F, 2.0F, -0.25F);
            this.TailMiddle.addBox(-1.0F, 0.0F, -0.9F, 2.0F, 6.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailMiddle, -0.35238198529871895F, 0.0F, 0.0F);
            this.Toe2Right = new ModelRenderer(this, 38, 26);
            this.Toe2Right.mirror = true;
            this.Toe2Right.setPos(0.2F, 0.1F, 0.0F);
            this.Toe2Right.addBox(-0.5F, -1.0F, -3.5F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, -0.1F);
            this.setRotateAngle(Toe2Right, 0.0F, 0.3122393925291412F, 0.0F);
            this.Wing1Right = new ModelRenderer(this, 48, 14);
            this.Wing1Right.mirror = true;
            this.Wing1Right.setPos(-2.0F, -2.6F, -2.7F);
            this.Wing1Right.addBox(-1.0F, -0.5F, -1.1F, 2.0F, 5.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Wing1Right, 0.03909537541112055F, -0.03909537541112055F, -0.03909537541112055F);
            this.Toe1Left = new ModelRenderer(this, 38, 26);
            this.Toe1Left.mirror = true;
            this.Toe1Left.setPos(-0.2F, 0.1F, 0.0F);
            this.Toe1Left.addBox(-0.5F, -1.0F, -3.5F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, -0.1F);
            this.setRotateAngle(Toe1Left, 0.0F, -0.3122393925291412F, 0.0F);
            this.Toe3Right = new ModelRenderer(this, 32, 27);
            this.Toe3Right.mirror = true;
            this.Toe3Right.setPos(0.01F, 0.0F, -0.1F);
            this.Toe3Right.addBox(-0.5F, -0.9F, -0.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, -0.1F);
            this.setRotateAngle(Toe3Right, -0.1171115934746098F, 0.0F, 0.0F);
            this.Neck2 = new ModelRenderer(this, 27, 8);
            this.Neck2.setPos(0.0F, 0.2F, -2.3F);
            this.Neck2.addBox(-1.0F, -6.5F, 0.0F, 2.0F, 7.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck2, 0.5864306020384839F, 0.0F, 0.0F);
            this.Forehead = new ModelRenderer(this, 48, 2);
            this.Forehead.setPos(0.0F, -0.99F, -1.0F);
            this.Forehead.addBox(-1.5F, -0.5F, -1.0F, 3.0F, 1.0F, 1.0F, -0.01F, 0.0F, 0.0F);
            this.setRotateAngle(Forehead, 0.001745329278001762F, 0.0F, 0.0F);
            this.Leg1Left = new ModelRenderer(this, 51, 27);
            this.Leg1Left.mirror = true;
            this.Leg1Left.setPos(0.1F, 1.5F, 0.0F);
            this.Leg1Left.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Leg1Left, -0.23457224414434488F, 0.0F, 0.0F);
            this.Leg2Right.addChild(this.FootRight);
            this.Body.addChild(this.ThighLeft);
            this.Body.addChild(this.ThighRight);
            this.Body.addChild(this.TailBase);
            this.Body.addChild(this.Neck1);
            this.Neck2.addChild(this.Head);
            this.FootLeft.addChild(this.Toe2Left);
            this.Leg1Right.addChild(this.Leg2Right);
            this.FootRight.addChild(this.Toe1Right);
            this.Wing1Right.addChild(this.Wing2Right);
            this.ThighRight.addChild(this.Leg1Right);
            this.Leg1Left.addChild(this.Leg2Left);
            this.Head.addChild(this.Crest1);
            this.Head.addChild(this.Beak);
            this.TailMiddle.addChild(this.TailLeft);
            this.TailMiddle.addChild(this.TailRight);
            this.Leg2Left.addChild(this.FootLeft);
            this.Crest1.addChild(this.CrestLeft);
            this.Crest1.addChild(this.CrestRight);
            this.Beak.addChild(this.BottomBeak);
            this.FootLeft.addChild(this.Toe3Left);
            this.Beak.addChild(this.BeakTip);
            this.Body.addChild(this.Wing1Left);
            this.Wing1Left.addChild(this.Wing2Left);
            this.TailBase.addChild(this.TailMiddle);
            this.FootRight.addChild(this.Toe2Right);
            this.Body.addChild(this.Wing1Right);
            this.FootLeft.addChild(this.Toe1Left);
            this.FootRight.addChild(this.Toe3Right);
            this.Neck1.addChild(this.Neck2);
            this.Head.addChild(this.Forehead);
            this.ThighLeft.addChild(this.Leg1Left);
            this.saveBase();
        }

        @Override
        public void setupAnim(ScreamerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck2.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.351F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.1F) * 0.5F - 0.625F;
            this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.351F;
        }
        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            }

            if (entity.isSprinting()) {
                float speed = 1.0f;
                float degree = 1.0f;
                this.Body.y = MathHelper.cos(6F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4F) * 0.5F + 15.2F;
                this.Body.xRot = MathHelper.cos(9.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -1F) * 0.5F - 0.195F;
                this.TailBase.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.8F) * 0.5F + 1.094F;
                this.Neck1.xRot = MathHelper.cos(7.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.6F) * 0.5F - 0.625F;
                this.Head.xRot = MathHelper.cos(1F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.6F) * 0.5F + 0.351F;

                this.ThighLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * 5F) * 0.5F + 0.507F;
                this.Leg1Left.xRot = MathHelper.cos(0.5F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * 3F) * 0.5F - 0.234F;
                this.FootLeft.xRot = MathHelper.cos(5.5F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.117F;
                this.ThighRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * -5F) * 0.5F + 0.507F;
                this.Leg1Right.xRot = MathHelper.cos(0.5F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * -3F) * 0.5F - 0.234F;
                this.FootRight.xRot = MathHelper.cos(5.5F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.117F;


            } else {
                float speed = 1.0f;
                float degree = 1.0f;
                this.Body.y = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 15.2F;
                this.Body.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.2F) * 0.5F - 0.195F;
                this.TailBase.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 1.094F;
                this.Neck1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.3F) * 0.5F - 0.625F;
                this.Head.xRot = MathHelper.cos(2.2F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.27F) * 0.5F + 0.351F;

                this.ThighLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.507F;
                this.Leg1Left.xRot = MathHelper.cos(0.5F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F - 0.234F;
                this.FootLeft.xRot = MathHelper.cos(5.5F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.117F;
                this.ThighRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.507F;
                this.Leg1Right.xRot = MathHelper.cos(0.5F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F - 0.234F;
                this.FootRight.xRot = MathHelper.cos(5.5F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.117F;
            }
        }
    }


    public static class Child extends ScreamerModel {

        public ModelRenderer Neck1;
        public ModelRenderer Wing1Left;
        public ModelRenderer ThighLeft;
        public ModelRenderer TailBase;
        public ModelRenderer ThighRight;
        public ModelRenderer Wing1Right;
        public ModelRenderer Neck2;
        public ModelRenderer Head;
        public ModelRenderer Forehead;
        public ModelRenderer Beak;
        public ModelRenderer Crest1;
        public ModelRenderer BeakTip;
        public ModelRenderer BottomBeak;
        public ModelRenderer CrestRight;
        public ModelRenderer CrestLeft;
        public ModelRenderer Wing2Left;
        public ModelRenderer Leg1Left;
        public ModelRenderer Leg2Left;
        public ModelRenderer FootLeft;
        public ModelRenderer Toe1Left;
        public ModelRenderer Toe2Left;
        public ModelRenderer Toe3Left;
        public ModelRenderer TailMiddle;
        public ModelRenderer TailRight;
        public ModelRenderer TailLeft;
        public ModelRenderer Leg1Right;
        public ModelRenderer Leg2Right;
        public ModelRenderer FootRight;
        public ModelRenderer Toe1Right;
        public ModelRenderer Toe2Right;
        public ModelRenderer Toe3Right;
        public ModelRenderer Wing2Right;

        public Child() {
            this.texWidth = 64;
            this.texHeight = 32;
            this.FootRight = new ModelRenderer(this, 38, 26);
            this.FootRight.mirror = true;
            this.FootRight.setPos(-0.01F, 2.5F, 0.0F);
            this.FootRight.addBox(-0.5F, -1.0F, -3.5F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, 0.1171115934746098F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 56, 28);
            this.ThighLeft.mirror = true;
            this.ThighLeft.setPos(1.45F, 2.0F, 1.0F);
            this.ThighLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.5077162820683115F, 0.0F, 0.04555309164612875F);
            this.ThighRight = new ModelRenderer(this, 56, 28);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-1.45F, 2.0F, 1.0F);
            this.ThighRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.5077162820683115F, 0.0F, -0.04555309164612875F);
            this.TailBase = new ModelRenderer(this, 1, 22);
            this.TailBase.setPos(0.0F, -2.5F, 3.5F);
            this.TailBase.addBox(-2.0F, 0.0F, -4.0F, 4.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailBase, 1.0948450317865597F, 0.0F, 0.0F);
            this.Neck1 = new ModelRenderer(this, 24, 0);
            this.Neck1.setPos(0.0F, 1.5F, -3.8F);
            this.Neck1.addBox(-2.0F, -3.3F, -2.5F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck1, -0.6255260065779288F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 46, 0);
            this.Head.setPos(0.0F, -6.0F, 0.6F);
            this.Head.addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.35185837453889574F, 0.0F, 0.0F);
            this.Toe2Left = new ModelRenderer(this, 38, 26);
            this.Toe2Left.mirror = true;
            this.Toe2Left.setPos(0.2F, 0.1F, 0.0F);
            this.Toe2Left.addBox(-0.5F, -1.0F, -3.5F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, -0.1F);
            this.setRotateAngle(Toe2Left, 0.0F, 0.3122393925291412F, 0.0F);
            this.Leg2Right = new ModelRenderer(this, 46, 25);
            this.Leg2Right.mirror = true;
            this.Leg2Right.setPos(0.0F, 3.0F, 0.5F);
            this.Leg2Right.addBox(-0.5F, -0.5F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, -0.3F, 0.0F);
            this.setRotateAngle(Leg2Right, -0.13020156286456727F, 0.0F, 0.04555309164612875F);
            this.Toe1Right = new ModelRenderer(this, 38, 26);
            this.Toe1Right.mirror = true;
            this.Toe1Right.setPos(-0.2F, 0.1F, 0.0F);
            this.Toe1Right.addBox(-0.5F, -1.0F, -3.5F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, -0.1F);
            this.setRotateAngle(Toe1Right, 0.0F, -0.3122393925291412F, 0.0F);
            this.Wing2Right = new ModelRenderer(this, 35, 16);
            this.Wing2Right.setPos(0.0F, 0.7F, 4.5F);
            this.Wing2Right.addBox(-0.5F, -0.9F, 0.0F, 1.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Wing2Right, 0.03909537541112055F, -0.008377580222319268F, 0.03909537541112055F);
            this.Leg1Right = new ModelRenderer(this, 51, 27);
            this.Leg1Right.mirror = true;
            this.Leg1Right.setPos(-0.1F, 1.5F, 0.0F);
            this.Leg1Right.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Leg1Right, -0.23457224414434488F, 0.0F, 0.0F);
            this.Leg2Left = new ModelRenderer(this, 46, 25);
            this.Leg2Left.mirror = true;
            this.Leg2Left.setPos(0.0F, 3.0F, 0.5F);
            this.Leg2Left.addBox(-0.5F, -0.5F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, -0.3F, 0.0F);
            this.setRotateAngle(Leg2Left, -0.13020156286456727F, 0.0F, -0.04555309164612875F);
            this.Crest1 = new ModelRenderer(this, 59, 0);
            this.Crest1.setPos(0.0F, -0.8F, 1.0F);
            this.Crest1.addBox(-0.5F, -0.5F, -0.5F, 1.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Crest1, -0.31293754020890546F, 0.0F, 0.0F);
            this.Beak = new ModelRenderer(this, 56, 4);
            this.Beak.setPos(0.0F, 0.2F, -1.5F);
            this.Beak.addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Beak, 0.3127630032889644F, 0.0F, 0.0F);
            this.TailLeft = new ModelRenderer(this, 10, 14);
            this.TailLeft.setPos(1.7F, 0.2F, -0.15F);
            this.TailLeft.addBox(-2.0F, -0.6F, -1.0F, 2.0F, 6.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailLeft, -0.04555309164612875F, 0.0911061832922575F, 0.04712389063608474F);
            this.TailRight = new ModelRenderer(this, 10, 14);
            this.TailRight.mirror = true;
            this.TailRight.setPos(-1.7F, 0.2F, -0.15F);
            this.TailRight.addBox(0.0F, -0.6F, -1.0F, 2.0F, 6.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailRight, -0.04555309164612875F, -0.0911061832922575F, -0.04712389063608474F);
            this.FootLeft = new ModelRenderer(this, 38, 26);
            this.FootLeft.mirror = true;
            this.FootLeft.setPos(0.01F, 2.5F, 0.0F);
            this.FootLeft.addBox(-0.5F, -1.0F, -3.5F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 0.1171115934746098F, 0.0F, 0.0F);
            this.CrestLeft = new ModelRenderer(this, 60, 0);
            this.CrestLeft.setPos(0.0F, 0.1F, 0.0F);
            this.CrestLeft.addBox(0.0F, -0.5F, 0.3F, 1.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(CrestLeft, -0.1563815016444822F, 0.1563815016444822F, 0.0F);
            this.CrestRight = new ModelRenderer(this, 60, 0);
            this.CrestRight.mirror = true;
            this.CrestRight.setPos(0.0F, 0.1F, 0.0F);
            this.CrestRight.addBox(-1.0F, -0.5F, 0.3F, 1.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(CrestRight, -0.1563815016444822F, -0.1563815016444822F, 0.0F);
            this.BottomBeak = new ModelRenderer(this, 50, 7);
            this.BottomBeak.setPos(0.0F, 1.0F, 1.0F);
            this.BottomBeak.addBox(-0.5F, -0.4F, -2.0F, 1.0F, 1.0F, 2.0F, -0.11F, 0.0F, 0.0F);
            this.setRotateAngle(BottomBeak, -0.46914448828868976F, 0.0F, 0.0F);
            this.Toe3Left = new ModelRenderer(this, 32, 27);
            this.Toe3Left.mirror = true;
            this.Toe3Left.setPos(-0.01F, 0.0F, -0.1F);
            this.Toe3Left.addBox(-0.5F, -0.9F, -0.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, -0.1F);
            this.setRotateAngle(Toe3Left, -0.1171115934746098F, 0.0F, 0.0F);
            this.BeakTip = new ModelRenderer(this, 58, 8);
            this.BeakTip.setPos(0.0F, -0.2F, -1.1F);
            this.BeakTip.addBox(-0.5F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(BeakTip, -0.46931902520863084F, 0.0F, 0.0F);
            this.Wing1Left = new ModelRenderer(this, 48, 14);
            this.Wing1Left.setPos(2.0F, -2.6F, -2.7F);
            this.Wing1Left.addBox(-1.0F, -0.5F, -1.1F, 2.0F, 5.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Wing1Left, 0.03909537541112055F, 0.03909537541112055F, 0.03909537541112055F);
            this.Wing2Left = new ModelRenderer(this, 35, 16);
            this.Wing2Left.setPos(0.0F, 0.7F, 4.5F);
            this.Wing2Left.addBox(-0.5F, -0.9F, 0.0F, 1.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Wing2Left, 0.03909537541112055F, -0.0781907508222411F, -0.03909537541112055F);
            this.Body = new ModelRenderer(this, 0, 0);
            this.Body.setPos(0.0F, 15.2F, 0.0F);
            this.Body.addBox(-2.5F, -3.0F, -3.5F, 5.0F, 6.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, -0.1956514098143546F, 0.0F, 0.0F);
            this.TailMiddle = new ModelRenderer(this, 1, 14);
            this.TailMiddle.setPos(0.0F, 2.0F, -0.25F);
            this.TailMiddle.addBox(-1.0F, 0.0F, -0.9F, 2.0F, 6.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailMiddle, -0.35238198529871895F, 0.0F, 0.0F);
            this.Toe2Right = new ModelRenderer(this, 38, 26);
            this.Toe2Right.mirror = true;
            this.Toe2Right.setPos(0.2F, 0.1F, 0.0F);
            this.Toe2Right.addBox(-0.5F, -1.0F, -3.5F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, -0.1F);
            this.setRotateAngle(Toe2Right, 0.0F, 0.3122393925291412F, 0.0F);
            this.Wing1Right = new ModelRenderer(this, 48, 14);
            this.Wing1Right.mirror = true;
            this.Wing1Right.setPos(-2.0F, -2.6F, -2.7F);
            this.Wing1Right.addBox(-1.0F, -0.5F, -1.1F, 2.0F, 5.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Wing1Right, 0.03909537541112055F, -0.03909537541112055F, -0.03909537541112055F);
            this.Toe1Left = new ModelRenderer(this, 38, 26);
            this.Toe1Left.mirror = true;
            this.Toe1Left.setPos(-0.2F, 0.1F, 0.0F);
            this.Toe1Left.addBox(-0.5F, -1.0F, -3.5F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, -0.1F);
            this.setRotateAngle(Toe1Left, 0.0F, -0.3122393925291412F, 0.0F);
            this.Toe3Right = new ModelRenderer(this, 32, 27);
            this.Toe3Right.mirror = true;
            this.Toe3Right.setPos(0.01F, 0.0F, -0.1F);
            this.Toe3Right.addBox(-0.5F, -0.9F, -0.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, -0.1F);
            this.setRotateAngle(Toe3Right, -0.1171115934746098F, 0.0F, 0.0F);
            this.Neck2 = new ModelRenderer(this, 27, 8);
            this.Neck2.setPos(0.0F, 0.2F, -2.3F);
            this.Neck2.addBox(-1.0F, -6.5F, 0.0F, 2.0F, 7.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck2, 0.5864306020384839F, 0.0F, 0.0F);
            this.Forehead = new ModelRenderer(this, 48, 2);
            this.Forehead.setPos(0.0F, -0.99F, -1.0F);
            this.Forehead.addBox(-1.5F, -0.5F, -1.0F, 3.0F, 1.0F, 1.0F, -0.01F, 0.0F, 0.0F);
            this.setRotateAngle(Forehead, 0.001745329278001762F, 0.0F, 0.0F);
            this.Leg1Left = new ModelRenderer(this, 51, 27);
            this.Leg1Left.mirror = true;
            this.Leg1Left.setPos(0.1F, 1.5F, 0.0F);
            this.Leg1Left.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Leg1Left, -0.23457224414434488F, 0.0F, 0.0F);
            this.Leg2Right.addChild(this.FootRight);
            this.Body.addChild(this.ThighLeft);
            this.Body.addChild(this.ThighRight);
            this.Body.addChild(this.TailBase);
            this.Body.addChild(this.Neck1);
            this.Neck2.addChild(this.Head);
            this.FootLeft.addChild(this.Toe2Left);
            this.Leg1Right.addChild(this.Leg2Right);
            this.FootRight.addChild(this.Toe1Right);
            this.Wing1Right.addChild(this.Wing2Right);
            this.ThighRight.addChild(this.Leg1Right);
            this.Leg1Left.addChild(this.Leg2Left);
            this.Head.addChild(this.Crest1);
            this.Head.addChild(this.Beak);
            this.TailMiddle.addChild(this.TailLeft);
            this.TailMiddle.addChild(this.TailRight);
            this.Leg2Left.addChild(this.FootLeft);
            this.Crest1.addChild(this.CrestLeft);
            this.Crest1.addChild(this.CrestRight);
            this.Beak.addChild(this.BottomBeak);
            this.FootLeft.addChild(this.Toe3Left);
            this.Beak.addChild(this.BeakTip);
            this.Body.addChild(this.Wing1Left);
            this.Wing1Left.addChild(this.Wing2Left);
            this.TailBase.addChild(this.TailMiddle);
            this.FootRight.addChild(this.Toe2Right);
            this.Body.addChild(this.Wing1Right);
            this.FootLeft.addChild(this.Toe1Left);
            this.FootRight.addChild(this.Toe3Right);
            this.Neck1.addChild(this.Neck2);
            this.Head.addChild(this.Forehead);
            this.ThighLeft.addChild(this.Leg1Left);
            this.saveBase();
        }

        @Override
        public void setupAnim(ScreamerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            }
            if (entity.isSprinting()) {
                float speed = 1.0f;
                float degree = 0.5f;
            } else {
                float speed = 1.5f;
                float degree = 1.0f;
            }
        }
    }
}