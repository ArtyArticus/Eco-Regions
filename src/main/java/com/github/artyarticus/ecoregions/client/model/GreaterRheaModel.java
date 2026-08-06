package com.github.artyarticus.ecoregions.client.model;

import com.github.artyarticus.ecoregions.entity.GreaterRheaEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class GreaterRheaModel extends ZawaBaseModel<GreaterRheaEntity> {
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

    public static class Adult extends GreaterRheaModel {

        public ModelRenderer Chest;
        public ModelRenderer WingLeft;
        public ModelRenderer Tail1;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer WingRight;
        public ModelRenderer NeckBase;
        public ModelRenderer NeckBase_1;
        public ModelRenderer Neck;
        public ModelRenderer Head;
        public ModelRenderer Beak;
        public ModelRenderer Mouth;
        public ModelRenderer UpperBeak;
        public ModelRenderer BeakTip;
        public ModelRenderer Tail2;
        public ModelRenderer LegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer Toe3Left;
        public ModelRenderer Toe2Left_1;
        public ModelRenderer Toe1Left;
        public ModelRenderer LegRight;
        public ModelRenderer FootRight;
        public ModelRenderer Toe3Right;
        public ModelRenderer Toe2LRight_1;
        public ModelRenderer Toe1Right;


        public Adult() {
            this.texWidth = 64;
            this.texHeight = 64;
            this.ThighLeft = new ModelRenderer(this, 48, 17);
            this.ThighLeft.setPos(2.3F, 3.0F, 1.0F);
            this.ThighLeft.addBox(-2.0F, -0.5F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.15603242780460005F, 0.0F, 0.0F);
            this.LegRight = new ModelRenderer(this, 56, 28);
            this.LegRight.mirror = true;
            this.LegRight.setPos(0.0F, 4.0F, 0.0F);
            this.LegRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, -0.350985723228704F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 28, 54);
            this.Tail2.setPos(0.0F, 0.5F, 5.5F);
            this.Tail2.addBox(-3.5F, -0.5F, 0.0F, 7.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, -0.45535640450848164F, 0.0F, 0.0F);
            this.LegLeft = new ModelRenderer(this, 56, 28);
            this.LegLeft.setPos(0.0F, 4.0F, 0.0F);
            this.LegLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, -0.350985723228704F, 0.0F, 0.0F);
            this.Beak = new ModelRenderer(this, 55, 5);
            this.Beak.setPos(0.0F, -0.7F, -2.5F);
            this.Beak.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Beak, 0.07400195628981794F, 0.0F, 0.0F);
            this.UpperBeak = new ModelRenderer(this, 56, 1);
            this.UpperBeak.setPos(-0.01F, 0.0F, -1.6F);
            this.UpperBeak.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperBeak, 0.4363323129985824F, 0.0F, 0.0F);
            this.Toe1Right = new ModelRenderer(this, 56, 46);
            this.Toe1Right.mirror = true;
            this.Toe1Right.setPos(0.5F, 0.1F, -0.5F);
            this.Toe1Right.addBox(-0.5F, 0.0F, -2.4F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe1Right, 0.0F, -0.27314402127920984F, 0.03490658503988659F);
            this.WingRight = new ModelRenderer(this, 30, 17);
            this.WingRight.mirror = true;
            this.WingRight.setPos(-3.5F, -3.0F, -6.0F);
            this.WingRight.addBox(-1.5F, -2.0F, 0.0F, 2.0F, 9.0F, 10.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingRight, -0.10384708716471125F, -0.04555309164612875F, -0.04555309164612875F);
            this.ThighRight = new ModelRenderer(this, 48, 17);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-2.3F, 3.0F, 1.0F);
            this.ThighRight.addBox(-2.0F, -0.5F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.15603242780460005F, 0.0F, 0.0F);
            this.Toe2LRight_1 = new ModelRenderer(this, 56, 46);
            this.Toe2LRight_1.mirror = true;
            this.Toe2LRight_1.setPos(-0.5F, 0.1F, -0.5F);
            this.Toe2LRight_1.addBox(-0.5F, 0.0F, -2.4F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe2LRight_1, 0.0F, 0.27314402127920984F, -0.03490658503988659F);
            this.Body = new ModelRenderer(this, 0, 0);
            this.Body.setPos(0.0F, 6.2F, 0.0F);
            this.Body.addBox(-4.5F, -5.0F, -5.5F, 9.0F, 10.0F, 11.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.11693705655466871F, 0.0F, 0.0F);
            this.Toe3Right = new ModelRenderer(this, 56, 46);
            this.Toe3Right.mirror = true;
            this.Toe3Right.setPos(0.0F, 0.0F, 0.0F);
            this.Toe3Right.addBox(-0.5F, 0.0F, -3.5F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe3Right, 0.10471975511965977F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 54, 43);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.0F, 10.0F, 0.0F);
            this.FootRight.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, 0.11693705655466871F, 0.0F, 0.0F);
            this.NeckBase_1 = new ModelRenderer(this, 20, 37);
            this.NeckBase_1.setPos(0.0F, 1.4F, -4.7F);
            this.NeckBase_1.addBox(-1.5F, -3.0F, -4.5F, 3.0F, 4.0F, 5.0F, -0.02F, 0.0F, 0.0F);
            this.setRotateAngle(NeckBase_1, -0.7819074915776542F, 0.0F, 0.0F);
            this.Toe2Left_1 = new ModelRenderer(this, 56, 46);
            this.Toe2Left_1.mirror = true;
            this.Toe2Left_1.setPos(-0.5F, 0.1F, -0.5F);
            this.Toe2Left_1.addBox(-0.5F, 0.0F, -2.4F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe2Left_1, 0.0F, 0.27314400463445304F, -0.03490658503988659F);
            this.Head = new ModelRenderer(this, 30, 1);
            this.Head.setPos(0.0F, -6.0F, 1.5F);
            this.Head.addBox(-2.0F, -2.0F, -2.5F, 4.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.19512781569928822F, 0.0F, 0.0F);
            this.NeckBase = new ModelRenderer(this, 0, 35);
            this.NeckBase.setPos(0.0F, 4.5F, -4.0F);
            this.NeckBase.addBox(-2.0F, -2.5F, -5.0F, 4.0F, 5.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckBase, -0.7483972018972962F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 54, 43);
            this.FootLeft.setPos(0.0F, 10.0F, 0.0F);
            this.FootLeft.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 0.11693705655466871F, 0.0F, 0.0F);
            this.Toe1Left = new ModelRenderer(this, 56, 46);
            this.Toe1Left.mirror = true;
            this.Toe1Left.setPos(0.5F, 0.1F, -0.5F);
            this.Toe1Left.addBox(-0.5F, 0.0F, -2.4F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe1Left, 0.0F, -0.27314400463445304F, 0.03490658503988659F);
            this.WingLeft = new ModelRenderer(this, 30, 17);
            this.WingLeft.setPos(3.5F, -3.0F, -6.0F);
            this.WingLeft.addBox(-0.5F, -2.0F, 0.0F, 2.0F, 9.0F, 10.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingLeft, -0.10384708716471125F, 0.04555309164612875F, 0.04555309164612875F);
            this.Mouth = new ModelRenderer(this, 56, 12);
            this.Mouth.setPos(0.0F, 0.8F, 0.5F);
            this.Mouth.addBox(-0.5F, 0.0F, -2.5F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.1757546503495068F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 36, 37);
            this.Neck.mirror = true;
            this.Neck.setPos(0.0F, 0.9F, -4.0F);
            this.Neck.addBox(-1.0F, -6.0F, 0.0F, 2.0F, 6.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, 1.0555751236166873F, 0.0F, 0.0F);
            this.Toe3Left = new ModelRenderer(this, 56, 46);
            this.Toe3Left.mirror = true;
            this.Toe3Left.setPos(0.0F, 0.0F, 0.0F);
            this.Toe3Left.addBox(-0.5F, 0.0F, -3.5F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe3Left, 0.10471975511965977F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 0, 50);
            this.Tail1.setPos(0.0F, -5.0F, 5.5F);
            this.Tail1.addBox(-4.0F, 0.0F, 0.0F, 8.0F, 8.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -0.500909508638178F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 21);
            this.Chest.setPos(0.0F, -4.5F, -5.0F);
            this.Chest.addBox(-3.0F, 0.0F, -5.0F, 6.0F, 8.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, 0.3120648556092001F, 0.0F, 0.0F);
            this.BeakTip = new ModelRenderer(this, 58, 9);
            this.BeakTip.setPos(0.0F, 0.0F, -1.5F);
            this.BeakTip.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.05F, 0.0F, 0.0F);
            this.Body.addChild(this.ThighLeft);
            this.ThighRight.addChild(this.LegRight);
            this.Tail1.addChild(this.Tail2);
            this.ThighLeft.addChild(this.LegLeft);
            this.Head.addChild(this.Beak);
            this.Beak.addChild(this.UpperBeak);
            this.Toe3Right.addChild(this.Toe1Right);
            this.Body.addChild(this.WingRight);
            this.Body.addChild(this.ThighRight);
            this.Toe3Right.addChild(this.Toe2LRight_1);
            this.FootRight.addChild(this.Toe3Right);
            this.LegRight.addChild(this.FootRight);
            this.NeckBase.addChild(this.NeckBase_1);
            this.Toe3Left.addChild(this.Toe2Left_1);
            this.Neck.addChild(this.Head);
            this.Chest.addChild(this.NeckBase);
            this.LegLeft.addChild(this.FootLeft);
            this.Toe3Left.addChild(this.Toe1Left);
            this.Body.addChild(this.WingLeft);
            this.Beak.addChild(this.Mouth);
            this.NeckBase_1.addChild(this.Neck);
            this.FootLeft.addChild(this.Toe3Left);
            this.Body.addChild(this.Tail1);
            this.Body.addChild(this.Chest);
            this.Beak.addChild(this.BeakTip);
            this.saveBase();
        }

        @Override
        public void setupAnim(GreaterRheaEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.195F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.NeckBase.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.1F) * 0.5F - 0.748F;
            this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.195F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (entity.isSprinting()) {
                float speed = 1.0f;
                float degree = 0.5f;
                this.NeckBase.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.7F) * limbSwingAmount * (degree * 0.7F) * 0.5F - 0.748F;
                this.Head.xRot = MathHelper.cos(5F + limbSwing * speed * 0.7F) * limbSwingAmount * (degree * -0.9F) * 0.5F + 0.195F;
                this.Chest.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.7F) * limbSwingAmount * (degree * 0.6F) * 0.5F + 0.312F;
                this.Tail1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.7F) * limbSwingAmount * (degree * -0.5F) * 0.5F - 0.5F;
                this.Body.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.7F) * limbSwingAmount * (degree * -0.5F) * 0.5F + 0.117F;
                this.Body.y = MathHelper.cos(2F + limbSwing * speed * 0.7F) * limbSwingAmount * (degree * -8F) * 0.5F + 6.2F;
                this.Body.zRot = MathHelper.cos(2F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * -0.3F) * 0.5F;
                this.Body.yRot = MathHelper.cos(2F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * -0.3F) * 0.5F;

                this.ThighLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * -4F) * 0.5F + 0.156F;
                this.ThighLeft.y = MathHelper.cos(7.0F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * 7F) * 0.5F + 3.0F;
                this.ThighLeft.z = MathHelper.cos(3.0F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * -8F) * 0.5F + 1.0F;
                this.LegLeft.xRot = MathHelper.cos(0.5F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * 4F) * 0.5F - 0.351F;
                this.FootLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.117F;
                this.ThighRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * 4F) * 0.5F + 0.156F;
                this.ThighRight.y = MathHelper.cos(7.0F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * -7F) * 0.5F + 3.0F;
                this.ThighRight.z = MathHelper.cos(3.0F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * 8F) * 0.5F + 1.0F;
                this.LegRight.xRot = MathHelper.cos(0.5F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * -4F) * 0.5F - 0.351F;
                this.FootRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * -3F) * 0.5F + 0.117F;


            } else {
                float speed = 1.5f;
                float degree = 1.0f;
                this.NeckBase.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.748F;
                this.Head.xRot = MathHelper.cos(2.2F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.5F) * 0.5F + 0.195F;
                this.Chest.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.1F) * 0.5F + 0.312F;
                this.Tail1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.05F) * 0.5F - 0.5F;
                this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.05F) * 0.5F + 0.117F;
                this.Body.y = MathHelper.cos(4.5F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree) * 0.5F + 6.2F;

                this.ThighLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.156F;
                this.ThighLeft.y = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 3.0F;
                this.LegLeft.xRot = MathHelper.cos(0.5F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 3F) * 0.5F - 0.351F;
                this.FootLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.117F;
                this.ThighRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.156F;
                this.ThighRight.y = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 3.0F;
                this.LegRight.xRot = MathHelper.cos(0.5F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -3F) * 0.5F - 0.351F;
                this.FootRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.117F;
            }
        }
    }


    public static class Child extends GreaterRheaModel {

        public ModelRenderer Tail;
        public ModelRenderer NeckBase;
        public ModelRenderer WingLeft;
        public ModelRenderer Back1;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer WingRight;
        public ModelRenderer Neck;
        public ModelRenderer Head;
        public ModelRenderer Jaw;
        public ModelRenderer BottomJaw;
        public ModelRenderer Nose;
        public ModelRenderer Back2;
        public ModelRenderer LegUpperLeft;
        public ModelRenderer LegBottomLeft;
        public ModelRenderer MiddleToeLeft;
        public ModelRenderer LeftToeLeft;
        public ModelRenderer RightToeRight;
        public ModelRenderer LegUpperRight;
        public ModelRenderer LegBottomRight;
        public ModelRenderer MiddleToeRight;
        public ModelRenderer LeftToeRight;
        public ModelRenderer RightToeRight_1;

        public Child() {
            this.texWidth = 64;
            this.texHeight = 32;
            this.LeftToeLeft = new ModelRenderer(this, 14, 5);
            this.LeftToeLeft.mirror = true;
            this.LeftToeLeft.setPos(0.0F, 0.1F, 0.0F);
            this.LeftToeLeft.addBox(-0.5F, 0.0F, -1.3F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftToeLeft, 0.0F, -0.45535640450848164F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 0, 14);
            this.ThighRight.setPos(-1.6F, 1.3F, 0.5F);
            this.ThighRight.addBox(-0.5F, -0.5F, -0.5F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.27314402127920984F, 0.0F, 0.0F);
            this.Nose = new ModelRenderer(this, 33, 0);
            this.Nose.setPos(0.0F, 0.0F, 0.0F);
            this.Nose.addBox(-0.5F, -1.0F, -1.9F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Nose, 0.27314402127920984F, 0.0F, 0.0F);
            this.LegBottomRight = new ModelRenderer(this, 13, 14);
            this.LegBottomRight.setPos(0.01F, 2.0F, 0.0F);
            this.LegBottomRight.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegBottomRight, -0.18203784630933073F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 0, 14);
            this.ThighLeft.mirror = true;
            this.ThighLeft.setPos(1.6F, 1.3F, 0.5F);
            this.ThighLeft.addBox(-1.5F, -0.5F, -0.5F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.27314402127920984F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 20, 11);
            this.Neck.setPos(0.0F, 0.0F, -1.0F);
            this.Neck.addBox(-1.0F, -4.0F, -1.5F, 2.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, 0.8651597048872669F, 0.0F, 0.0F);
            this.LegBottomLeft = new ModelRenderer(this, 13, 14);
            this.LegBottomLeft.mirror = true;
            this.LegBottomLeft.setPos(0.01F, 2.0F, 0.0F);
            this.LegBottomLeft.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegBottomLeft, -0.18203784630933073F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 20, 3);
            this.Head.setPos(0.0F, -3.0F, -0.9F);
            this.Head.addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.04555309164612875F, 0.0F, 0.0F);
            this.LegUpperRight = new ModelRenderer(this, 13, 11);
            this.LegUpperRight.setPos(0.5F, 1.5F, 1.0F);
            this.LegUpperRight.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.Back2 = new ModelRenderer(this, 30, 25);
            this.Back2.setPos(-0.01F, 0.0F, 0.0F);
            this.Back2.addBox(-1.5F, -0.9F, -0.5F, 3.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Back2, -0.500909508638178F, 0.0F, 0.0F);
            this.BottomJaw = new ModelRenderer(this, 33, 10);
            this.BottomJaw.setPos(0.0F, 0.9F, -1.0F);
            this.BottomJaw.addBox(-0.5F, -0.5F, -1.7F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(BottomJaw, -0.04555309164612875F, 0.0F, 0.0F);
            this.LegUpperLeft = new ModelRenderer(this, 13, 11);
            this.LegUpperLeft.mirror = true;
            this.LegUpperLeft.setPos(-0.5F, 1.5F, 1.0F);
            this.LegUpperLeft.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.MiddleToeRight = new ModelRenderer(this, 13, 8);
            this.MiddleToeRight.setPos(0.01F, 2.3F, -0.5F);
            this.MiddleToeRight.addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(MiddleToeRight, 0.04555309164612875F, 0.0F, 0.0F);
            this.MiddleToeLeft = new ModelRenderer(this, 13, 8);
            this.MiddleToeLeft.mirror = true;
            this.MiddleToeLeft.setPos(0.01F, 2.3F, -0.5F);
            this.MiddleToeLeft.addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(MiddleToeLeft, 0.04555309164612875F, 0.0F, 0.0F);
            this.RightToeRight_1 = new ModelRenderer(this, 14, 5);
            this.RightToeRight_1.setPos(0.0F, 0.1F, 0.0F);
            this.RightToeRight_1.addBox(-0.5F, 0.0F, -1.3F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightToeRight_1, 0.0F, 0.45535640450848164F, 0.0F);
            this.Tail = new ModelRenderer(this, 20, 27);
            this.Tail.setPos(0.0F, -2.0F, 3.0F);
            this.Tail.addBox(-1.5F, -0.5F, 0.0F, 3.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail, -0.500909508638178F, 0.0F, 0.0F);
            this.WingRight = new ModelRenderer(this, 0, 7);
            this.WingRight.setPos(-1.5F, -1.5F, 0.0F);
            this.WingRight.addBox(-1.0F, -0.5F, -1.5F, 1.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.RightToeRight = new ModelRenderer(this, 14, 5);
            this.RightToeRight.mirror = true;
            this.RightToeRight.setPos(0.0F, 0.1F, 0.0F);
            this.RightToeRight.addBox(-0.5F, 0.0F, -1.3F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightToeRight, 0.0F, 0.45535640450848164F, 0.0F);
            this.LeftToeRight = new ModelRenderer(this, 14, 5);
            this.LeftToeRight.setPos(0.0F, 0.1F, 0.0F);
            this.LeftToeRight.addBox(-0.5F, 0.0F, -1.3F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftToeRight, 0.0F, -0.45535640450848164F, 0.0F);
            this.WingLeft = new ModelRenderer(this, 0, 7);
            this.WingLeft.mirror = true;
            this.WingLeft.setPos(1.5F, -1.5F, 0.0F);
            this.WingLeft.addBox(0.0F, -0.5F, -1.5F, 1.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.Back1 = new ModelRenderer(this, 30, 29);
            this.Back1.setPos(0.01F, -2.1F, 0.3F);
            this.Back1.addBox(-1.5F, -1.0F, -2.0F, 3.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Back1, 0.3186971254089062F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 21);
            this.Body.setPos(0.0F, 16.3F, 0.0F);
            this.Body.addBox(-2.0F, -2.5F, -2.5F, 4.0F, 5.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, -0.13665927909957545F, 0.0F, 0.0F);
            this.NeckBase = new ModelRenderer(this, 15, 20);
            this.NeckBase.setPos(0.0F, -2.0F, -2.0F);
            this.NeckBase.addBox(-1.5F, -0.4F, -1.0F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckBase, -0.7285004590772052F, 0.0F, 0.0F);
            this.Jaw = new ModelRenderer(this, 33, 6);
            this.Jaw.setPos(0.0F, 0.5F, -1.0F);
            this.Jaw.addBox(-1.0F, -0.5F, -2.2F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Jaw, 0.18203784630933073F, 0.0F, 0.0F);
            this.MiddleToeLeft.addChild(this.LeftToeLeft);
            this.Body.addChild(this.ThighRight);
            this.Jaw.addChild(this.Nose);
            this.LegUpperRight.addChild(this.LegBottomRight);
            this.Body.addChild(this.ThighLeft);
            this.NeckBase.addChild(this.Neck);
            this.LegUpperLeft.addChild(this.LegBottomLeft);
            this.Neck.addChild(this.Head);
            this.ThighRight.addChild(this.LegUpperRight);
            this.Back1.addChild(this.Back2);
            this.Head.addChild(this.BottomJaw);
            this.ThighLeft.addChild(this.LegUpperLeft);
            this.LegBottomRight.addChild(this.MiddleToeRight);
            this.LegBottomLeft.addChild(this.MiddleToeLeft);
            this.MiddleToeRight.addChild(this.RightToeRight_1);
            this.Body.addChild(this.Tail);
            this.Body.addChild(this.WingRight);
            this.MiddleToeLeft.addChild(this.RightToeRight);
            this.MiddleToeRight.addChild(this.LeftToeRight);
            this.Body.addChild(this.WingLeft);
            this.Body.addChild(this.Back1);
            this.Body.addChild(this.NeckBase);
            this.Head.addChild(this.Jaw);
            this.saveBase();

        }

        @Override
        public void setupAnim(GreaterRheaEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.05F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.NeckBase.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.73F;
            this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.05F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.2f;
            float degree = 1.0f;
            this.NeckBase.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.4F) * 0.5F - 0.73F;
            this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.3F) * 0.5F + 0.05F;
            this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.14F;
            this.Body.y = MathHelper.cos(4.5F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree) * 0.5F + 16.3F;

            this.ThighLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.27F;
            this.ThighLeft.y = MathHelper.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 2F) * 0.5F + 1.3F;
            this.LegUpperLeft.xRot = MathHelper.cos(0.5F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 3F) * 0.5F;
            this.MiddleToeLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.05F;
            this.ThighRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.27F;
            this.ThighRight.y = MathHelper.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -2F) * 0.5F + 1.3F;
            this.LegUpperRight.xRot = MathHelper.cos(0.5F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -3F) * 0.5F;
            this.MiddleToeRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.05F;
        }
    }
}



