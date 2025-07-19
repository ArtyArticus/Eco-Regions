package com.github.artyarticus.ecoregions.client.model;

import com.github.artyarticus.ecoregions.entity.TreeKangarooEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;
import org.zawamod.zawa.client.model.ZawaModelRenderer;

public abstract class TreeKangarooModel extends ZawaBaseModel<TreeKangarooEntity> {
    public ModelRenderer Hips;
    protected Iterable<ModelRenderer> parts;

    @Override
    @MethodsReturnNonnullByDefault
    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Hips);
        }

        return this.parts;
    }

    public static class Adult extends com.github.artyarticus.ecoregions.client.model.TreeKangarooModel {

        public ModelRenderer Body;
        public ModelRenderer ThighLeft;
        public ModelRenderer Tail2;
        public ModelRenderer ThighRight;
        public ModelRenderer Chest;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer Neck;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer ArmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer Head;
        public ModelRenderer NeckBottom;
        public ModelRenderer EarLeft;
        public ModelRenderer Snout;
        public ModelRenderer EarRight;
        public ModelRenderer part13;
        public ModelRenderer part13_1;
        public ModelRenderer Mouth;
        public ModelRenderer Nose;
        public ModelRenderer ArmRight;
        public ModelRenderer HandRight;
        public ModelRenderer LegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer ToesLeft;
        public ModelRenderer Tail3;
        public ModelRenderer Tail4;
        public ModelRenderer Tail5;
        public ModelRenderer Tail6;
        public ModelRenderer Snout_1;
        public ModelRenderer LegRight;
        public ModelRenderer FootRight;
        public ModelRenderer ToesRight;

        public Adult() {
            this.texWidth = 64;
            this.texHeight = 64;
            this.part13 = new ModelRenderer(this, 52, 8);
            this.part13.setPos(1.8F, 0.0F, -0.1F);
            this.part13.addBox(-1.5F, 0.0F, -2.0F, 2.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(part13, 0.0F, 0.03909537541112055F, 0.1563815016444822F);
            this.HandRight = new ModelRenderer(this, 55, 31);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.0F, 2.0F, -2.0F);
            this.HandRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.500909508638178F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 56, 26);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(1.2F, 3.0F, 0.8F);
            this.ArmRight.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.591841146688116F, -0.18203784630933073F, -0.18203784630933073F);
            this.ArmBaseRight = new ModelRenderer(this, 54, 20);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-2.9F, 2.0F, 3.5F);
            this.ArmBaseRight.addBox(0.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 2.0943951023931953F, -0.13665927909957545F, 0.0F);
            this.Snout_1 = new ModelRenderer(this, 41, 10);
            this.Snout_1.mirror = true;
            this.Snout_1.setPos(0.0F, -0.5F, -1.2F);
            this.Snout_1.addBox(-0.9F, -0.5F, -2.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout_1, 0.03909537541112055F, 0.0F, 0.0F);
            this.ToesRight = new ModelRenderer(this, 43, 36);
            this.ToesRight.mirror = true;
            this.ToesRight.setPos(0.0F, 0.0F, -5.0F);
            this.ToesRight.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ToesRight, 0.04555309164612875F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 41, 10);
            this.Snout.setPos(0.0F, -0.5F, -1.2F);
            this.Snout.addBox(-1.1F, -0.5F, -2.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.03909537541112055F, 0.0F, 0.0F);
            this.LegLeft = new ModelRenderer(this, 29, 39);
            this.LegLeft.setPos(1.5F, 1.0F, -4.5F);
            this.LegLeft.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, -0.04555309164612875F, 0.04555309164612875F, 0.0F);
            this.EarRight = new ModelRenderer(this, 45, 0);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-1.5F, -1.0F, 0.5F);
            this.EarRight.addBox(-1.0F, -1.5F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.2275909337942703F, 0.27314402127920984F, -0.18203784630933073F);
            this.EarLeft = new ModelRenderer(this, 45, 0);
            this.EarLeft.setPos(1.5F, -1.0F, 0.5F);
            this.EarLeft.addBox(-1.0F, -1.5F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.2275909337942703F, -0.27314402127920984F, 0.18203784630933073F);
            this.Body = new ModelRenderer(this, 0, 12);
            this.Body.setPos(0.0F, -3.5F, -2.5F);
            this.Body.addBox(-3.0F, 0.0F, 0.0F, 6.0F, 6.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, -0.8651597048872669F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 28, 14);
            this.Neck.setPos(0.0F, 3.5F, 0.9F);
            this.Neck.addBox(-1.5F, -1.0F, -2.5F, 3.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, 1.4856243072344728F, 0.0F, 0.0F);
            this.part13_1 = new ModelRenderer(this, 52, 8);
            this.part13_1.setPos(-1.8F, 0.0F, -0.1F);
            this.part13_1.addBox(-0.5F, 0.0F, -2.0F, 2.0F, 2.0F, 4.0F, 0.0F, 0.0F, -0.01F);
            this.setRotateAngle(part13_1, 0.0F, -0.03909537541112055F, -0.1563815016444822F);
            this.Tail2 = new ModelRenderer(this, 0, 34);
            this.Tail2.setPos(0.0F, -0.2F, 2.0F);
            this.Tail2.addBox(-2.5F, -3.0F, -1.0F, 5.0F, 5.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, -0.28012533162928444F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 34, 8);
            this.Mouth.setPos(0.0F, 1.6F, 0.2F);
            this.Mouth.addBox(-0.5F, -0.5F, -2.6F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.19530233597447247F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 40, 40);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.0F, 2.0F, 3.0F);
            this.FootRight.addBox(-1.5F, 0.0F, -5.0F, 3.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, -0.04555309164612875F, -0.0911061832922575F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 56, 26);
            this.ArmLeft.setPos(-1.2F, 3.0F, 0.8F);
            this.ArmLeft.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.591841146688116F, 0.18203784630933073F, 0.18203784630933073F);
            this.FootLeft = new ModelRenderer(this, 40, 40);
            this.FootLeft.setPos(0.0F, 2.0F, 3.0F);
            this.FootLeft.addBox(-1.5F, 0.0F, -5.0F, 3.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, -0.04555309164612875F, -0.0911061832922575F, 0.0F);
            this.NeckBottom = new ModelRenderer(this, 43, 4);
            this.NeckBottom.setPos(0.0F, 2.4F, 0.0F);
            this.NeckBottom.addBox(-1.0F, -0.5F, -2.5F, 2.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckBottom, -0.19547687289441354F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 0);
            this.Hips.setPos(0.0F, 17.5F, 2.0F);
            this.Hips.addBox(-3.5F, -3.5F, -2.5F, 7.0F, 7.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.6373942508178124F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 26, 29);
            this.ThighLeft.setPos(1.4F, 1.5F, 2.0F);
            this.ThighLeft.addBox(0.0F, -3.0F, -5.0F, 3.0F, 4.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.7285004590772052F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 1, 25);
            this.Chest.setPos(0.0F, 5.5F, 0.4F);
            this.Chest.addBox(-2.5F, -1.0F, 0.0F, 5.0F, 4.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.23387411310933742F, 0.0F, 0.0F);
            this.Tail4 = new ModelRenderer(this, 0, 52);
            this.Tail4.setPos(0.0F, 0.0F, 3.0F);
            this.Tail4.addBox(-1.5F, -2.0F, -1.0F, 3.0F, 3.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail4, 0.3642502295386026F, 0.0F, 0.0F);
            this.Tail3 = new ModelRenderer(this, 0, 44);
            this.Tail3.setPos(0.0F, 0.0F, 4.0F);
            this.Tail3.addBox(-2.0F, -2.5F, -1.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail3, 0.3642502295386026F, 0.0F, 0.0F);
            this.Tail6 = new ModelRenderer(this, 18, 43);
            this.Tail6.setPos(0.01F, 0.0F, 6.0F);
            this.Tail6.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 55, 31);
            this.HandLeft.setPos(0.0F, 2.0F, -2.0F);
            this.HandLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.500909508638178F, 0.0F, 0.0F);
            this.Tail5 = new ModelRenderer(this, 18, 51);
            this.Tail5.setPos(0.0F, -0.4F, 4.0F);
            this.Tail5.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail5, 0.0911061832922575F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 54, 20);
            this.ArmBaseLeft.setPos(2.9F, 2.0F, 3.5F);
            this.ArmBaseLeft.addBox(-2.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 2.0943951023931953F, 0.13665927909957545F, 0.0F);
            this.ToesLeft = new ModelRenderer(this, 43, 36);
            this.ToesLeft.setPos(0.0F, 0.0F, -5.0F);
            this.ToesLeft.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ToesLeft, 0.04555309164612875F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 30, 0);
            this.Head.setPos(0.0F, 1.0F, -2.5F);
            this.Head.addBox(-2.0F, -1.5F, -2.0F, 4.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.3909537457888271F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 26, 29);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-1.4F, 1.5F, 2.0F);
            this.ThighRight.addBox(-3.0F, -3.0F, -5.0F, 3.0F, 4.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.7285004590772052F, 0.0F, 0.0F);
            this.LegRight = new ModelRenderer(this, 29, 39);
            this.LegRight.mirror = true;
            this.LegRight.setPos(-1.5F, 1.0F, -4.5F);
            this.LegRight.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, -0.04555309164612875F, 0.04555309164612875F, 0.0F);
            this.Nose = new ModelRenderer(this, 25, 0);
            this.Nose.setPos(-0.0F, -0.1F, -2.2F);
            this.Nose.addBox(-1.0F, -0.5F, -0.4F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Nose, 0.23457224414434488F, 0.0F, 0.001745329278001762F);
            this.Head.addChild(this.part13);
            this.ArmRight.addChild(this.HandRight);
            this.ArmBaseRight.addChild(this.ArmRight);
            this.Chest.addChild(this.ArmBaseRight);
            this.Head.addChild(this.Snout_1);
            this.FootRight.addChild(this.ToesRight);
            this.Head.addChild(this.Snout);
            this.ThighLeft.addChild(this.LegLeft);
            this.Head.addChild(this.EarRight);
            this.Head.addChild(this.EarLeft);
            this.Hips.addChild(this.Body);
            this.Chest.addChild(this.Neck);
            this.Head.addChild(this.part13_1);
            this.Hips.addChild(this.Tail2);
            this.Snout.addChild(this.Mouth);
            this.LegRight.addChild(this.FootRight);
            this.ArmBaseLeft.addChild(this.ArmLeft);
            this.LegLeft.addChild(this.FootLeft);
            this.Neck.addChild(this.NeckBottom);
            this.Hips.addChild(this.ThighLeft);
            this.Body.addChild(this.Chest);
            this.Tail3.addChild(this.Tail4);
            this.Tail2.addChild(this.Tail3);
            this.Tail5.addChild(this.Tail6);
            this.ArmLeft.addChild(this.HandLeft);
            this.Tail4.addChild(this.Tail5);
            this.Chest.addChild(this.ArmBaseLeft);
            this.FootLeft.addChild(this.ToesLeft);
            this.Neck.addChild(this.Head);
            this.Hips.addChild(this.ThighRight);
            this.ThighRight.addChild(this.LegRight);
            this.Snout.addChild(this.Nose);
            this.saveBase();
        }

        @Override
        public void setupAnim(TreeKangarooEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = (float) Math.toRadians((double) (-netHeadYaw)) * 0.25F;
            this.Head.yRot = (float) Math.toRadians((double) (-netHeadYaw)) * 0.25F;
        }

        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 1.0F;
            float degree = 1.0F;
            this.Neck.xRot = MathHelper.cos(limbSwing * speed * 0.1F + 3.1415927F) * degree * 0.1F * limbSwingAmount * 0.5F + 1.485F;
            this.Head.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * -0.1F * limbSwingAmount * 0.5F + 0.39F;
            this.ArmBaseLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * 0.1F * limbSwingAmount * 0.5F + 2.1F;
            this.ArmBaseRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * 0.1F * limbSwingAmount * 0.5F + 2.1F;
        }

        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 1.2F;
            float degree = 0.8F;
            if (entity.isSprinting()) {
                speed = 1.9F;
                degree = 0.3F;
            } else {
                degree = 0.3F;
                this.Hips.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 0.4F * limbSwingAmount * 0.5F - 0.637F;
                this.Chest.xRot = MathHelper.cos(0.5F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 0.3F * limbSwingAmount * 0.5F - 0.233F;
                this.Neck.xRot = MathHelper.cos(limbSwing * speed * 0.0F + 3.1415927F) * degree * 0.0F * limbSwingAmount * 0.5F + 1.485F;
                this.Head.xRot = MathHelper.cos(limbSwing * speed * 0.0F + 3.1415927F) * degree * 0.0F * limbSwingAmount * 0.5F + 0.39F;
                this.ThighLeft.xRot = MathHelper.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * 3.0F * limbSwingAmount * 0.5F + 0.728F;
                this.LegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -0.9F * limbSwingAmount * 0.5F - 0.045F;
                this.FootLeft.xRot = MathHelper.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * 3.0F * limbSwingAmount * 0.5F - 0.045F;
                this.Hips.y = MathHelper.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -13.0F * limbSwingAmount * 0.5F + 17.5F;

                this.ThighLeft.y = MathHelper.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * -0.5F * limbSwingAmount * 0.5F + 1.5F;
                this.ThighLeft.z = MathHelper.cos(0.5F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 0.5F * limbSwingAmount * 0.5F + 0.1F + 2.0F;
                this.ArmBaseLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 0.8F * limbSwingAmount * 0.5F + 2.094F;
                this.ArmBaseRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 0.8F * limbSwingAmount * 0.5F + 2.094F;
                this.Body.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 0.5F * limbSwingAmount * 0.5F - 0.865F;
                this.ThighRight.xRot = MathHelper.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * 3.0F * limbSwingAmount * 0.5F + 0.728F;
                this.LegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -0.9F * limbSwingAmount * 0.5F - 0.045F;
                this.FootRight.xRot = MathHelper.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * 3.0F * limbSwingAmount * 0.5F - 0.045F;
                this.ThighRight.y = MathHelper.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * -0.5F * limbSwingAmount * 0.5F + 1.5F;
                this.ThighRight.z = MathHelper.cos(0.5F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 0.5F * limbSwingAmount * 0.5F + 0.1F + 2.0F;
                this.Tail2.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 0.8F * limbSwingAmount * 0.5F - 0.28F;
            }
        }
    }


    public static class Child extends com.github.artyarticus.ecoregions.client.model.TreeKangarooModel {

        public ModelRenderer Body;
        public ModelRenderer ThighLeft;
        public ModelRenderer Tail1;
        public ModelRenderer ThighRight;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer Neck;
        public ModelRenderer ArmBaseLeft_1;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer ArmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer Head;
        public ModelRenderer Snout;
        public ModelRenderer EarLeft;
        public ModelRenderer EarRight;
        public ModelRenderer Mouth;
        public ModelRenderer ArmLeft_1;
        public ModelRenderer HandLeft_1;
        public ModelRenderer ArmRight;
        public ModelRenderer HandRight;
        public ModelRenderer LegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer Tail2;
        public ModelRenderer Tail3;
        public ModelRenderer Tail4;
        public ModelRenderer LegRight;
        public ModelRenderer FootRight;

        public Child() {
            this.texWidth = 32;
            this.texHeight = 32;
            this.HandLeft = new ModelRenderer(this, 9, 22);
            this.HandLeft.setPos(-0.6F, -2.0F, -2.0F);
            this.HandLeft.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, -0.9105382388075086F, 0.4098033003787853F, 0.0911061832922575F);
            this.HandLeft_1 = new ModelRenderer(this, 9, 22);
            this.HandLeft_1.setPos(-0.6F, -2.0F, -2.0F);
            this.HandLeft_1.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft_1, -0.9105382388075086F, 0.4098033003787853F, 0.0911061832922575F);
            this.Tail3 = new ModelRenderer(this, 14, 10);
            this.Tail3.setPos(0.0F, -0.5F, 2.5F);
            this.Tail3.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail3, 0.500909508638178F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 16, 0);
            this.Tail1.setPos(0.0F, -1.0F, 1.5F);
            this.Tail1.addBox(-1.5F, -1.5F, -1.5F, 3.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -0.5462880425584197F, 0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 8, 15);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-2.0F, 3.1F, 1.5F);
            this.ArmBaseRight.addBox(0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 1.5934856603340446F, -0.13665927909957545F, 0.0F);
            this.ArmBaseLeft_1 = new ModelRenderer(this, 8, 15);
            this.ArmBaseLeft_1.setPos(2.0F, 3.1F, 1.5F);
            this.ArmBaseLeft_1.addBox(-1.5F, 0.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft_1, 1.5934856603340446F, 0.13665927909957545F, 0.0F);
            this.Head = new ModelRenderer(this, 0, 24);
            this.Head.setPos(-0.01F, -1.5F, -1.4F);
            this.Head.addBox(-1.5F, -2.0F, -1.5F, 3.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, -0.7225663369572632F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 22, 28);
            this.FootLeft.setPos(0.0F, 2.0F, 0.5F);
            this.FootLeft.addBox(-1.0F, -1.0F, -3.0F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 0.0F, -0.0911061832922575F, 0.0F);
            this.ArmLeft_1 = new ModelRenderer(this, 8, 19);
            this.ArmLeft_1.setPos(-0.5F, 1.5F, 1.0F);
            this.ArmLeft_1.addBox(-1.0F, -2.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft_1, 1.0471975511965976F, 0.0911061832922575F, 0.0911061832922575F);
            this.ThighLeft = new ModelRenderer(this, 18, 21);
            this.ThighLeft.setPos(0.8F, -1.0F, 0.7F);
            this.ThighLeft.addBox(0.0F, -1.5F, -3.0F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.6373942508178124F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 8, 15);
            this.ArmBaseLeft.setPos(2.0F, 3.0F, 1.5F);
            this.ArmBaseLeft.addBox(-1.5F, 0.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 1.5934856603340446F, 0.13665927909957545F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 15, 21);
            this.EarLeft.setPos(1.6F, -1.0F, 0.5F);
            this.EarLeft.addBox(-1.0F, -1.5F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.2275909337942703F, -0.27314402127920984F, 0.18203784630933073F);
            this.Mouth = new ModelRenderer(this, -1, 20);
            this.Mouth.setPos(0.01F, 1.0F, 0.0F);
            this.Mouth.addBox(-1.0F, 0.0F, -1.75F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.3186971254089062F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 8, 19);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(0.5F, 1.5F, 1.0F);
            this.ArmRight.addBox(0.0F, -2.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, 1.0471975511965976F, -0.0911061832922575F, -0.0911061832922575F);
            this.Snout = new ModelRenderer(this, 0, 15);
            this.Snout.setPos(0.0F, -2.0F, -1.0F);
            this.Snout.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.3642502295386026F, 0.0F, 0.0F);
            this.LegLeft = new ModelRenderer(this, 20, 27);
            this.LegLeft.setPos(1.0F, 1.5F, -3.0F);
            this.LegLeft.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 15, 21);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-1.6F, -1.0F, 0.5F);
            this.EarRight.addBox(0.0F, -1.5F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.2275909337942703F, 0.27314402127920984F, -0.18203784630933073F);
            this.LegRight = new ModelRenderer(this, 20, 27);
            this.LegRight.mirror = true;
            this.LegRight.setPos(-1.0F, 1.5F, -3.0F);
            this.LegRight.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 22, 28);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.0F, 2.0F, 0.5F);
            this.FootRight.addBox(-1.0F, -1.0F, -3.0F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, 0.0F, 0.0911061832922575F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 8);
            this.Body.setPos(0.0F, -3.0F, -3.0F);
            this.Body.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, -0.8651597048872669F, 0.0F, 0.0F);
            this.Tail4 = new ModelRenderer(this, 15, 16);
            this.Tail4.setPos(0.0F, -0.5F, 3.8F);
            this.Tail4.addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail4, 0.11728612207217244F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 9, 22);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.6F, -2.0F, -2.0F);
            this.HandRight.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, -0.9105382388075086F, -0.4098033003787853F, -0.0911061832922575F);
            this.ThighRight = new ModelRenderer(this, 18, 21);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-0.8F, -1.0F, 0.7F);
            this.ThighRight.addBox(-2.0F, -1.5F, -3.0F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.6373942508178124F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 8, 19);
            this.ArmLeft.setPos(-0.5F, 1.5F, 1.0F);
            this.ArmLeft.addBox(-1.0F, -2.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, 1.0471975511965976F, 0.0911061832922575F, 0.0911061832922575F);
            this.Hips = new ModelRenderer(this, 0, 0);
            this.Hips.setPos(0.0F, 21.0F, 0.0F);
            this.Hips.addBox(-2.0F, -3.0F, -3.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.591841146688116F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 12, 26);
            this.Neck.setPos(0.0F, 3.6F, 1.5F);
            this.Neck.addBox(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, 2.309594231122029F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 15, 5);
            this.Tail2.setPos(0.0F, -0.5F, 2.0F);
            this.Tail2.addBox(-1.0F, -1.5F, -1.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, 0.500909508638178F, 0.0F, 0.0F);
            this.ArmLeft.addChild(this.HandLeft);
            this.ArmLeft_1.addChild(this.HandLeft_1);
            this.Tail2.addChild(this.Tail3);
            this.Hips.addChild(this.Tail1);
            this.Body.addChild(this.ArmBaseRight);
            this.Body.addChild(this.ArmBaseLeft_1);
            this.Neck.addChild(this.Head);
            this.LegLeft.addChild(this.FootLeft);
            this.ArmBaseLeft_1.addChild(this.ArmLeft_1);
            this.Hips.addChild(this.ThighLeft);
            this.Body.addChild(this.ArmBaseLeft);
            this.Head.addChild(this.EarLeft);
            this.Snout.addChild(this.Mouth);
            this.ArmBaseRight.addChild(this.ArmRight);
            this.Head.addChild(this.Snout);
            this.ThighLeft.addChild(this.LegLeft);
            this.Head.addChild(this.EarRight);
            this.ThighRight.addChild(this.LegRight);
            this.LegRight.addChild(this.FootRight);
            this.Hips.addChild(this.Body);
            this.Tail3.addChild(this.Tail4);
            this.ArmRight.addChild(this.HandRight);
            this.Hips.addChild(this.ThighRight);
            this.ArmBaseLeft.addChild(this.ArmLeft);
            this.Body.addChild(this.Neck);
            this.Tail1.addChild(this.Tail2);
            this.saveBase();
        }

        @Override
        public void setupAnim(TreeKangarooEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = (float)Math.toRadians((double)(-netHeadYaw)) * 0.25F;
            this.Head.yRot = (float)Math.toRadians((double)(-netHeadYaw)) * 0.25F;

        }

        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 1.0F;
            float degree = 1.0F;
            this.Neck.xRot = MathHelper.cos(limbSwing * speed * 0.1F + 3.1415927F) * degree * -0.3F * limbSwingAmount * 0.5F + 2.31F;
            this.Head.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * 0.3F * limbSwingAmount * 0.5F - 0.722F;
        }

        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 1.5F;
            float degree = 0.5F;

            if (this.isSwimming) {
                limbSwing = (float)entity.tickCount;
                limbSwingAmount = 0.3F;
            } else if (entity.isSprinting()) {
                degree = 0.3F;
            }
            this.Hips.xRot = MathHelper.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.0F * limbSwingAmount * 0.5F - 0.591F;
            this.ThighLeft.xRot = MathHelper.cos(0.2F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F + 0.637F;
            this.ThighLeft.y = MathHelper.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * -0.2F * limbSwingAmount * 0.5F + 0.05F - 1.0F;
            this.LegLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.0F * limbSwingAmount * 0.5F;
            this.FootLeft.xRot = MathHelper.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F;
            this.Hips.y = MathHelper.cos(2.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -7.0F * limbSwingAmount * 0.5F + 21.0F;
            this.ThighRight.xRot = MathHelper.cos(0.2F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F + 0.637F;
            this.ThighRight.y = MathHelper.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * -0.2F * limbSwingAmount * 0.5F + 0.05F - 1.0F;
            this.LegRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.0F * limbSwingAmount * 0.5F;
            this.FootRight.xRot = MathHelper.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F;
            this.Tail1.xRot = MathHelper.cos(3.5F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F - 0.546F;
            this.Body.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.0F * limbSwingAmount * 0.5F - 0.865F;
            this.Neck.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F + 2.31F;
            this.Head.xRot = MathHelper.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.0F * limbSwingAmount * 0.5F - 0.722F;
        }
    }
}

