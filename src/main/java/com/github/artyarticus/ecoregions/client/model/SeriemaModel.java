package com.github.artyarticus.ecoregions.client.model;

import com.github.artyarticus.ecoregions.entity.RheaEntity;
import com.github.artyarticus.ecoregions.entity.SeriemaEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class SeriemaModel extends ZawaBaseModel<SeriemaEntity> {
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

    public static class Adult extends SeriemaModel {

        public ModelRenderer Neck1;
        public ModelRenderer TailBase;
        public ModelRenderer Wing1Right;
        public ModelRenderer Wing1Left;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer Neck2;
        public ModelRenderer part2;
        public ModelRenderer TopBeak1;
        public ModelRenderer Tuft;
        public ModelRenderer BeakTip1;
        public ModelRenderer BeakBottom;
        public ModelRenderer HairMiddle;
        public ModelRenderer Hair1Left;
        public ModelRenderer Hair1Right;
        public ModelRenderer Hair2Left;
        public ModelRenderer Hair3Left;
        public ModelRenderer Hair2Right;
        public ModelRenderer Hair3Right;
        public ModelRenderer TailMiddle;
        public ModelRenderer TailRight;
        public ModelRenderer TailLeft;
        public ModelRenderer Wing2Right;
        public ModelRenderer Wing2Left;
        public ModelRenderer Leg1Left;
        public ModelRenderer Leg2Left;
        public ModelRenderer FootLeft;
        public ModelRenderer Toe1Left;
        public ModelRenderer Toe2Left;
        public ModelRenderer Leg1Right;
        public ModelRenderer Leg2Right;
        public ModelRenderer FootRight;
        public ModelRenderer Toe1R;
        public ModelRenderer Toe2R;

        public Adult() {
            this.texWidth = 64;
            this.texHeight = 32;
            this.Hair2Right = new ModelRenderer(this, 0, 0);
            this.Hair2Right.setPos(0.0F, 0.0F, 0.0F);
            this.Hair2Right.addBox(-0.2F, -3.0F, -2.0F, 0.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hair2Right, -0.1563815016444822F, 0.0F, -0.1563815016444822F);
            this.Toe1Left = new ModelRenderer(this, 38, 26);
            this.Toe1Left.mirror = true;
            this.Toe1Left.setPos(0.0F, 0.1F, 0.0F);
            this.Toe1Left.addBox(-0.5F, -1.0F, -3.0F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, -0.1F);
            this.setRotateAngle(Toe1Left, 0.0F, -0.19495327877934715F, 0.0F);
            this.Toe1R = new ModelRenderer(this, 38, 26);
            this.Toe1R.mirror = true;
            this.Toe1R.setPos(0.0F, 0.1F, 0.0F);
            this.Toe1R.addBox(-0.5F, -1.0F, -3.0F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, -0.1F);
            this.setRotateAngle(Toe1R, 0.0F, -0.19495327877934715F, 0.0F);
            this.Hair2Left = new ModelRenderer(this, 0, 0);
            this.Hair2Left.setPos(0.0F, 0.0F, 0.0F);
            this.Hair2Left.addBox(0.2F, -3.0F, -2.0F, 0.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hair2Left, -0.1563815016444822F, 0.0F, 0.1563815016444822F);
            this.Leg2Right = new ModelRenderer(this, 46, 25);
            this.Leg2Right.mirror = true;
            this.Leg2Right.setPos(0.0F, 4.0F, 0.5F);
            this.Leg2Right.addBox(-0.5F, -0.5F, -1.0F, 1.0F, 6.0F, 1.0F, 0.0F, -0.3F, 0.0F);
            this.setRotateAngle(Leg2Right, -0.13020156286456727F, 0.0F, 0.04555309164612875F);
            this.BeakTip1 = new ModelRenderer(this, 16, 28);
            this.BeakTip1.setPos(0.0F, 0.2F, -2.5F);
            this.BeakTip1.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(BeakTip1, -0.9105382388075086F, 0.0F, 0.0F);
            this.Hair3Right = new ModelRenderer(this, 0, 0);
            this.Hair3Right.setPos(0.0F, 0.0F, 0.2F);
            this.Hair3Right.addBox(-0.2F, -3.0F, -2.0F, 0.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hair3Right, -0.11728612207217244F, 0.0F, -0.1563815016444822F);
            this.Neck2 = new ModelRenderer(this, 12, 3);
            this.Neck2.setPos(0.0F, 0.2F, -2.3F);
            this.Neck2.addBox(-1.0F, -6.7F, -0.4F, 2.0F, 7.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck2, 0.46914448828868976F, 0.0F, 0.0F);
            this.Wing2Right = new ModelRenderer(this, 35, 16);
            this.Wing2Right.mirror = true;
            this.Wing2Right.setPos(0.0F, 0.9F, 4.5F);
            this.Wing2Right.addBox(-0.5F, -0.9F, 0.0F, 1.0F, 4.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Wing2Right, -0.27366763203903305F, 0.0781907508222411F, -0.03909537541112055F);
            this.Leg2Left = new ModelRenderer(this, 46, 25);
            this.Leg2Left.mirror = true;
            this.Leg2Left.setPos(0.0F, 4.0F, 0.5F);
            this.Leg2Left.addBox(-0.5F, -0.5F, -1.0F, 1.0F, 6.0F, 1.0F, 0.0F, -0.3F, 0.0F);
            this.setRotateAngle(Leg2Left, -0.13020156286456727F, 0.0F, -0.04555309164612875F);
            this.Wing1Left = new ModelRenderer(this, 48, 14);
            this.Wing1Left.setPos(2.0F, -3.4F, -3.0F);
            this.Wing1Left.addBox(-1.0F, 0.0F, -1.1F, 2.0F, 5.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Wing1Left, 0.03909537541112055F, 0.03909537541112055F, 0.03909537541112055F);
            this.HairMiddle = new ModelRenderer(this, 0, 0);
            this.HairMiddle.setPos(0.0F, 0.8F, 0.3F);
            this.HairMiddle.addBox(0.0F, -3.0F, -2.0F, 0.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HairMiddle, 0.5082398928281348F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 56, 28);
            this.ThighLeft.mirror = true;
            this.ThighLeft.setPos(1.4F, 1.7F, 0.0F);
            this.ThighLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.5077162820683115F, 0.0F, 0.04555309164612875F);
            this.Wing1Right = new ModelRenderer(this, 48, 14);
            this.Wing1Right.mirror = true;
            this.Wing1Right.setPos(-2.0F, -3.4F, -3.0F);
            this.Wing1Right.addBox(-1.0F, 0.0F, -1.1F, 2.0F, 5.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Wing1Right, 0.03909537541112055F, -0.03909537541112055F, 0.03909537541112055F);
            this.ThighRight = new ModelRenderer(this, 56, 28);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-1.4F, 1.7F, 0.0F);
            this.ThighRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.5077162820683115F, 0.0F, -0.04555309164612875F);
            this.TailLeft = new ModelRenderer(this, 10, 14);
            this.TailLeft.setPos(1.7F, 0.2F, -0.15F);
            this.TailLeft.addBox(-2.0F, -0.6F, -1.0F, 2.0F, 8.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailLeft, -0.04555309164612875F, 0.0911061832922575F, 0.04712389063608474F);
            this.Wing2Left = new ModelRenderer(this, 35, 16);
            this.Wing2Left.setPos(0.0F, 0.9F, 4.5F);
            this.Wing2Left.addBox(-0.5F, -0.9F, 0.0F, 1.0F, 4.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Wing2Left, -0.27366763203903305F, -0.0781907508222411F, -0.03909537541112055F);
            this.TailRight = new ModelRenderer(this, 10, 14);
            this.TailRight.setPos(-1.7F, 0.2F, -0.15F);
            this.TailRight.addBox(0.0F, -0.6F, -1.0F, 2.0F, 8.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailRight, -0.04555309164612875F, -0.0911061832922575F, -0.04712389063608474F);
            this.Leg1Right = new ModelRenderer(this, 51, 27);
            this.Leg1Right.mirror = true;
            this.Leg1Right.setPos(0.0F, 1.5F, 0.0F);
            this.Leg1Right.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Leg1Right, -0.23457224414434488F, 0.0F, 0.0F);
            this.TailBase = new ModelRenderer(this, 22, 24);
            this.TailBase.setPos(0.0F, -3.0F, 3.0F);
            this.TailBase.addBox(-2.0F, 0.0F, -4.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailBase, 1.2512265833653122F, 0.0F, 0.0F);
            this.BeakBottom = new ModelRenderer(this, 15, 27);
            this.BeakBottom.setPos(0.0F, 2.0F, 0.0F);
            this.BeakBottom.addBox(-0.5F, -0.6F, -2.4F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(BeakBottom, -0.39112828270876815F, 0.0F, 0.0F);
            this.Toe2Left = new ModelRenderer(this, 38, 26);
            this.Toe2Left.mirror = true;
            this.Toe2Left.setPos(0.0F, 0.1F, 0.0F);
            this.Toe2Left.addBox(-0.5F, -1.0F, -3.0F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, -0.1F);
            this.setRotateAngle(Toe2Left, 0.0F, 0.19495327877934715F, 0.0F);
            this.Toe2R = new ModelRenderer(this, 38, 26);
            this.Toe2R.mirror = true;
            this.Toe2R.setPos(0.0F, 0.1F, 0.0F);
            this.Toe2R.addBox(-0.5F, -1.0F, -3.0F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, -0.1F);
            this.setRotateAngle(Toe2R, 0.0F, 0.19495327877934715F, 0.0F);
            this.Neck1 = new ModelRenderer(this, 23, 5);
            this.Neck1.setPos(0.0F, 1.9F, -3.5F);
            this.Neck1.addBox(-2.0F, -4.3F, -2.5F, 4.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck1, -0.3909537457888271F, 0.0F, 0.0F);
            this.TailMiddle = new ModelRenderer(this, 1, 14);
            this.TailMiddle.setPos(0.0F, 4.0F, -0.15F);
            this.TailMiddle.addBox(-1.0F, 0.0F, -0.9F, 2.0F, 8.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailMiddle, -0.11746065899211351F, 0.0F, 0.0F);
            this.Hair1Right = new ModelRenderer(this, 0, 0);
            this.Hair1Right.setPos(0.0F, 0.0F, 0.0F);
            this.Hair1Right.addBox(-0.2F, -3.0F, -2.0F, 0.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hair1Right, 0.0F, 0.0F, -0.1563815016444822F);
            this.Hair3Left = new ModelRenderer(this, 0, 0);
            this.Hair3Left.setPos(0.0F, 0.0F, 0.2F);
            this.Hair3Left.addBox(0.2F, -3.0F, -2.0F, 0.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hair3Left, -0.11728612207217244F, 0.0F, 0.1563815016444822F);
            this.Body = new ModelRenderer(this, 38, 0);
            this.Body.setPos(0.0F, 11.7F, 0.0F);
            this.Body.addBox(-2.5F, -3.0F, -3.5F, 5.0F, 6.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, -0.1563815016444822F, 0.0F, 0.0F);
            this.Tuft = new ModelRenderer(this, 0, 23);
            this.Tuft.setPos(0.0F, -1.0F, -2.0F);
            this.Tuft.addBox(-1.5F, -0.5F, -0.7F, 3.0F, 1.0F, 1.0F, -0.01F, 0.0F, -0.2F);
            this.Hair1Left = new ModelRenderer(this, 0, 0);
            this.Hair1Left.setPos(0.0F, 0.0F, 0.0F);
            this.Hair1Left.addBox(0.2F, -3.0F, -2.0F, 0.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hair1Left, 0.0F, 0.0F, 0.1563815016444822F);
            this.part2 = new ModelRenderer(this, 0, 25);
            this.part2.setPos(0.0F, -7.4F, 0.5F);
            this.part2.addBox(-1.5F, -1.5F, -2.0F, 3.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(part2, 0.2733185581991509F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 38, 26);
            this.FootLeft.mirror = true;
            this.FootLeft.setPos(0.0F, 5.4F, 0.0F);
            this.FootLeft.addBox(-0.5F, -1.0F, -3.0F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 0.1171115934746098F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 38, 26);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.0F, 5.4F, 0.0F);
            this.FootRight.addBox(-0.5F, -1.0F, -3.0F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, 0.1171115934746098F, 0.0F, 0.0F);
            this.TopBeak1 = new ModelRenderer(this, 14, 26);
            this.TopBeak1.setPos(0.0F, -0.8F, -2.2F);
            this.TopBeak1.addBox(-0.5F, 0.3F, -2.5F, 1.0F, 1.0F, 3.0F, 0.1F, 0.2F, 0.0F);
            this.setRotateAngle(TopBeak1, 0.32567843575898076F, 0.0F, 0.0F);
            this.Leg1Left = new ModelRenderer(this, 51, 27);
            this.Leg1Left.mirror = true;
            this.Leg1Left.setPos(0.0F, 1.5F, 0.0F);
            this.Leg1Left.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Leg1Left, -0.23457224414434488F, 0.0F, 0.0F);
            this.Hair1Right.addChild(this.Hair2Right);
            this.FootLeft.addChild(this.Toe1Left);
            this.FootRight.addChild(this.Toe1R);
            this.Hair1Left.addChild(this.Hair2Left);
            this.Leg1Right.addChild(this.Leg2Right);
            this.TopBeak1.addChild(this.BeakTip1);
            this.Hair2Right.addChild(this.Hair3Right);
            this.Neck1.addChild(this.Neck2);
            this.Wing1Right.addChild(this.Wing2Right);
            this.Leg1Left.addChild(this.Leg2Left);
            this.Body.addChild(this.Wing1Left);
            this.Tuft.addChild(this.HairMiddle);
            this.Body.addChild(this.ThighLeft);
            this.Body.addChild(this.Wing1Right);
            this.Body.addChild(this.ThighRight);
            this.TailMiddle.addChild(this.TailLeft);
            this.Wing1Left.addChild(this.Wing2Left);
            this.TailMiddle.addChild(this.TailRight);
            this.ThighRight.addChild(this.Leg1Right);
            this.Body.addChild(this.TailBase);
            this.TopBeak1.addChild(this.BeakBottom);
            this.FootLeft.addChild(this.Toe2Left);
            this.FootRight.addChild(this.Toe2R);
            this.Body.addChild(this.Neck1);
            this.TailBase.addChild(this.TailMiddle);
            this.HairMiddle.addChild(this.Hair1Right);
            this.Hair2Left.addChild(this.Hair3Left);
            this.part2.addChild(this.Tuft);
            this.HairMiddle.addChild(this.Hair1Left);
            this.Neck2.addChild(this.part2);
            this.Leg2Left.addChild(this.FootLeft);
            this.Leg2Right.addChild(this.FootRight);
            this.part2.addChild(this.TopBeak1);
            this.ThighLeft.addChild(this.Leg1Left);
            this.saveBase();
        }

        @Override
        public void setupAnim(SeriemaEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck2.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.part2.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.part2.xRot = (headPitch / (180F / (float) Math.PI)) + 0.27F;
            this.part2.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.1F) * 0.5F - 0.39F;
            this.part2.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.27F;
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
                this.Neck2.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.7F) * limbSwingAmount * (degree * 0.7F) * 0.5F + 0.47F;
                this.part2.xRot = MathHelper.cos(5F + limbSwing * speed * 0.7F) * limbSwingAmount * (degree * -0.9F) * 0.5F + 0.27F;
                this.Neck1.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.7F) * limbSwingAmount * (degree * 0.6F) * 0.5F - 0.39F;
                this.TailBase.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.7F) * limbSwingAmount * (degree * -0.5F) * 0.5F + 1.25F;
                this.Body.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.7F) * limbSwingAmount * (degree * -0.5F) * 0.5F - 0.16F;
                this.Body.y = MathHelper.cos(2F + limbSwing * speed * 0.7F) * limbSwingAmount * (degree * -8F) * 0.5F + 11.7F;
                this.Body.zRot = MathHelper.cos(2F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * -0.3F) * 0.5F;
                this.Body.yRot = MathHelper.cos(2F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * -0.3F) * 0.5F;

                this.ThighLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * -4F) * 0.5F + 0.51F;
                this.ThighLeft.y = MathHelper.cos(7.0F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * 7F) * 0.5F + 1.7F;
                this.ThighLeft.z = MathHelper.cos(3.0F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * -8F) * 0.5F;
                this.Leg1Left.xRot = MathHelper.cos(0.5F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * 4F) * 0.5F - 0.23F;
                this.Toe1Left.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * 3F) * 0.5F;

                this.ThighRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * 4F) * 0.5F + 0.51F;
                this.ThighRight.y = MathHelper.cos(7.0F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * -7F) * 0.5F + 1.7F;
                this.ThighRight.z = MathHelper.cos(3.0F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * 8F) * 0.5F;
                this.Leg1Right.xRot = MathHelper.cos(0.5F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * -4F) * 0.5F - 0.23F;
                this.Toe1R.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * -3F) * 0.5F;


            } else {
                float speed = 1.5f;
                float degree = 1.0f;
                this.Neck2.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 0.47F;
                this.part2.xRot = MathHelper.cos(2.2F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.5F) * 0.5F + 0.27F;
                this.Neck1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.1F) * 0.5F - 0.39F;
                this.TailBase.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.05F) * 0.5F + 1.25F;
                this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.05F) * 0.5F - 0.16F;
                this.Body.y = MathHelper.cos(4.5F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree) * 0.5F + 11.7F;

                this.ThighLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.51F;
                this.ThighLeft.y = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 1.7F;
                this.Leg1Left.xRot = MathHelper.cos(0.5F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 3F) * 0.5F - 0.23F;
                this.Toe1Left.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F;

                this.ThighRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.51F;
                this.ThighRight.y = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 1.7F;
                this.Leg1Right.xRot = MathHelper.cos(0.5F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -3F) * 0.5F - 0.23F;
                this.Toe1R.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F;
            }
        }
    }


    public static class Child extends SeriemaModel {

        public ModelRenderer Tail;
        public ModelRenderer Neck;
        public ModelRenderer ThighLeft;
        public ModelRenderer WingLeft;
        public ModelRenderer WingRight;
        public ModelRenderer ThighRight;
        public ModelRenderer Head;
        public ModelRenderer TopBeak;
        public ModelRenderer HairMiddle;
        public ModelRenderer Beak;
        public ModelRenderer BeakTip;
        public ModelRenderer Hair1Left;
        public ModelRenderer Hair1Right;
        public ModelRenderer Hair2Left;
        public ModelRenderer Hair2Right;
        public ModelRenderer Leg1Left;
        public ModelRenderer Leg2Left;
        public ModelRenderer FootLeft;
        public ModelRenderer Toe1Left;
        public ModelRenderer Toe2Left;
        public ModelRenderer Leg1Right;
        public ModelRenderer Leg2Right;
        public ModelRenderer FootRight;
        public ModelRenderer Toe1Right;
        public ModelRenderer Toe2Right;

        public Child() {
            this.texWidth = 32;
            this.texHeight = 32;
            this.ThighLeft = new ModelRenderer(this, 20, 8);
            this.ThighLeft.setPos(1.0F, 1.7F, 1.4F);
            this.ThighLeft.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, -0.2F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.6250024291076193F, 0.0F, 0.04555309164612875F);
            this.FootRight = new ModelRenderer(this, 21, 13);
            this.FootRight.setPos(0.0F, 1.8F, 0.0F);
            this.FootRight.addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, 0.1171115934746098F, 0.0F, 0.0F);
            this.Toe1Left = new ModelRenderer(this, 21, 13);
            this.Toe1Left.setPos(0.0F, 0.1F, 0.0F);
            this.Toe1Left.addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, -0.1F);
            this.setRotateAngle(Toe1Left, 0.0F, -0.19495327877934715F, 0.0F);
            this.Beak = new ModelRenderer(this, 6, 15);
            this.Beak.setPos(0.0F, 1.4F, -0.8F);
            this.Beak.addBox(-0.5F, -0.5F, -1.6F, 1.0F, 1.0F, 2.0F, -0.1F, -0.1F, 0.0F);
            this.setRotateAngle(Beak, -0.5082398928281348F, 0.0F, 0.0F);
            this.Hair1Left = new ModelRenderer(this, 0, 0);
            this.Hair1Left.setPos(0.2F, 0.0F, 0.0F);
            this.Hair1Left.addBox(0.0F, -0.6F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hair1Left, 0.0F, -0.19547687289441354F, 0.19547687289441354F);
            this.Neck = new ModelRenderer(this, 12, 9);
            this.Neck.setPos(0.0F, 0.0F, -1.5F);
            this.Neck.addBox(-1.0F, -3.5F, -1.2F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.1F);
            this.setRotateAngle(Neck, 0.5084143964585622F, 0.0F, 0.0F);
            this.Leg1Left = new ModelRenderer(this, 28, 9);
            this.Leg1Left.setPos(0.0F, 0.5F, 0.0F);
            this.Leg1Left.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Leg1Left, -0.23457224414434488F, 0.0F, 0.0F);
            this.Leg2Right = new ModelRenderer(this, 28, 12);
            this.Leg2Right.mirror = true;
            this.Leg2Right.setPos(0.0F, 2.0F, 0.5F);
            this.Leg2Right.addBox(-0.5F, -0.5F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, -0.3F, 0.0F);
            this.setRotateAngle(Leg2Right, -0.13020156286456727F, 0.0F, -0.04555309164612875F);
            this.Toe1Right = new ModelRenderer(this, 21, 13);
            this.Toe1Right.setPos(0.0F, 0.1F, 0.0F);
            this.Toe1Right.addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, -0.1F);
            this.setRotateAngle(Toe1Right, 0.0F, -0.19495327877934715F, 0.0F);
            this.Head = new ModelRenderer(this, 0, 9);
            this.Head.setPos(0.0F, -3.0F, -1.0F);
            this.Head.addBox(-1.5F, -1.5F, -1.2F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.2F);
            this.setRotateAngle(Head, -1.7453292129831807E-4F, 0.0F, 0.0F);
            this.Tail = new ModelRenderer(this, 13, 0);
            this.Tail.setPos(0.0F, 0.0F, 2.5F);
            this.Tail.addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail, -0.3127630032889644F, 0.0F, 0.0F);
            this.Hair1Right = new ModelRenderer(this, 0, 0);
            this.Hair1Right.setPos(-0.2F, 0.0F, 0.0F);
            this.Hair1Right.addBox(0.0F, -0.6F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hair1Right, 0.0F, 0.19547687289441354F, -0.19547687289441354F);
            this.Body = new ModelRenderer(this, 0, 0);
            this.Body.setPos(0.0F, 17.4F, 0.0F);
            this.Body.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, -0.3522074483787779F, 0.0F, 0.0F);
            this.Hair2Left = new ModelRenderer(this, 0, 0);
            this.Hair2Left.setPos(0.2F, 0.0F, 0.0F);
            this.Hair2Left.addBox(0.0F, -0.6F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hair2Left, 0.0F, -0.19547687289441354F, 0.19547687289441354F);
            this.BeakTip = new ModelRenderer(this, 12, 16);
            this.BeakTip.setPos(0.0F, 0.5F, -1.9F);
            this.BeakTip.addBox(-0.5F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(BeakTip, 0.3127630032889644F, 0.0F, 0.0F);
            this.Toe2Right = new ModelRenderer(this, 21, 13);
            this.Toe2Right.setPos(0.0F, 0.1F, 0.0F);
            this.Toe2Right.addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, -0.1F);
            this.setRotateAngle(Toe2Right, 0.0F, 0.19495327877934715F, 0.0F);
            this.TopBeak = new ModelRenderer(this, 0, 15);
            this.TopBeak.setPos(0.0F, -0.6F, -1.1F);
            this.TopBeak.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.1F, 0.1F, 0.0F);
            this.setRotateAngle(TopBeak, 0.43022365395869955F, 0.0F, 0.0F);
            this.Toe2Left = new ModelRenderer(this, 21, 13);
            this.Toe2Left.setPos(0.0F, 0.1F, 0.0F);
            this.Toe2Left.addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, -0.1F);
            this.setRotateAngle(Toe2Left, 0.0F, 0.19495327877934715F, 0.0F);
            this.HairMiddle = new ModelRenderer(this, 0, 0);
            this.HairMiddle.setPos(0.0F, -0.7F, -1.5F);
            this.HairMiddle.addBox(0.0F, -0.6F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HairMiddle, 0.7037167490777915F, 0.0F, 0.0F);
            this.WingRight = new ModelRenderer(this, 22, 1);
            this.WingRight.mirror = true;
            this.WingRight.setPos(-1.6F, 0.0F, -2.0F);
            this.WingRight.addBox(-1.0F, -1.5F, 0.2F, 1.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingRight, 0.11728612207217244F, 0.03909537541112055F, 0.0F);
            this.Leg1Right = new ModelRenderer(this, 28, 9);
            this.Leg1Right.mirror = true;
            this.Leg1Right.setPos(0.0F, 0.5F, 0.0F);
            this.Leg1Right.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Leg1Right, -0.23457224414434488F, 0.0F, 0.0F);
            this.Hair2Right = new ModelRenderer(this, 0, 0);
            this.Hair2Right.setPos(-0.2F, 0.0F, 0.0F);
            this.Hair2Right.addBox(0.0F, -0.6F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hair2Right, 0.0F, 0.19547687289441354F, -0.19547687289441354F);
            this.FootLeft = new ModelRenderer(this, 21, 13);
            this.FootLeft.setPos(0.0F, 1.8F, 0.0F);
            this.FootLeft.addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 0.1171115934746098F, 0.0F, 0.0F);
            this.Leg2Left = new ModelRenderer(this, 28, 12);
            this.Leg2Left.setPos(0.0F, 2.0F, 0.5F);
            this.Leg2Left.addBox(-0.5F, -0.5F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, -0.3F, 0.0F);
            this.setRotateAngle(Leg2Left, -0.13020156286456727F, 0.0F, -0.04555309164612875F);
            this.WingLeft = new ModelRenderer(this, 22, 1);
            this.WingLeft.setPos(1.6F, 0.0F, -2.0F);
            this.WingLeft.addBox(0.0F, -1.5F, 0.2F, 1.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingLeft, 0.11728612207217244F, -0.03909537541112055F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 20, 8);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-1.0F, 1.7F, 1.4F);
            this.ThighRight.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, -0.2F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.6250024291076193F, 0.0F, 0.04555309164612875F);
            this.Body.addChild(this.ThighLeft);
            this.Leg2Right.addChild(this.FootRight);
            this.FootLeft.addChild(this.Toe1Left);
            this.TopBeak.addChild(this.Beak);
            this.HairMiddle.addChild(this.Hair1Left);
            this.Body.addChild(this.Neck);
            this.ThighLeft.addChild(this.Leg1Left);
            this.Leg1Right.addChild(this.Leg2Right);
            this.FootRight.addChild(this.Toe1Right);
            this.Neck.addChild(this.Head);
            this.Body.addChild(this.Tail);
            this.HairMiddle.addChild(this.Hair1Right);
            this.Hair1Left.addChild(this.Hair2Left);
            this.TopBeak.addChild(this.BeakTip);
            this.FootRight.addChild(this.Toe2Right);
            this.Head.addChild(this.TopBeak);
            this.FootLeft.addChild(this.Toe2Left);
            this.Head.addChild(this.HairMiddle);
            this.Body.addChild(this.WingRight);
            this.ThighRight.addChild(this.Leg1Right);
            this.Hair1Right.addChild(this.Hair2Right);
            this.Leg2Left.addChild(this.FootLeft);
            this.Leg1Left.addChild(this.Leg2Left);
            this.Body.addChild(this.WingLeft);
            this.Body.addChild(this.ThighRight);
            this.saveBase();
        }

        @Override
        public void setupAnim(SeriemaEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
          }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
           }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.2f;
            float degree = 1.0f;
            this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.352F;
            this.Body.y = MathHelper.cos(4.5F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree) * 0.5F + 17.4F;

            this.ThighLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.625F;
            this.ThighLeft.y = MathHelper.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 2F) * 0.5F + 1.7F;
            this.Leg1Left.xRot = MathHelper.cos(0.5F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 3F) * 0.5F - 0.234F;
            this.FootLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.117F;
            this.ThighRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.625F;
            this.ThighRight.y = MathHelper.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -2F) * 0.5F + 1.7F;
            this.Leg1Right.xRot = MathHelper.cos(0.5F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -3F) * 0.5F - 0.234F;
            this.FootRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.117F;

        }
    }
}



