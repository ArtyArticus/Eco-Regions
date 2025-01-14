package com.github.artyarticus.ecoregions.client.model;

import com.github.artyarticus.ecoregions.entity.BushDogEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class BushDogModel extends ZawaBaseModel<BushDogEntity> {
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

    public static class Adult extends BushDogModel {

        public ModelRenderer Neck;
        public ModelRenderer Body;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer Head;
        public ModelRenderer Neck2;
        public ModelRenderer Snout;
        public ModelRenderer Mouth;
        public ModelRenderer EarLeft;
        public ModelRenderer EarRight;
        public ModelRenderer Nose;
        public ModelRenderer Hips;
        public ModelRenderer Tail1;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer Tail2;
        public ModelRenderer UpperLegLeft;
        public ModelRenderer LegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer UpperLegRight;
        public ModelRenderer LegRight;
        public ModelRenderer FootRight;
        public ModelRenderer ArmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer ArmRight;
        public ModelRenderer HandRight;

        public Adult() {
            this.texWidth = 64;
            this.texHeight = 32;
            this.EarRight = new ModelRenderer(this, 0, 21);
            this.EarRight.setPos(-1.6F, -1.0F, 0.5F);
            this.EarRight.addBox(-0.5F, -1.3F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.0911061832922575F, 0.2275909337942703F, -0.18203784630933073F);
            this.FootRight = new ModelRenderer(this, 56, 22);
            this.FootRight.setPos(0.01F, 1.5F, -0.5F);
            this.FootRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 14, 8);
            this.ArmBaseRight.setPos(-1.5F, 1.5F, 0.2F);
            this.ArmBaseRight.addBox(-1.1F, -0.5F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.2275909337942703F, 0.0F, 0.0F);
            this.LegRight = new ModelRenderer(this, 56, 18);
            this.LegRight.setPos(0.01F, 1.5F, 1.5F);
            this.LegRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, -0.3186971254089062F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 14, 8);
            this.ArmBaseLeft.mirror = true;
            this.ArmBaseLeft.setPos(1.5F, 1.5F, 0.2F);
            this.ArmBaseLeft.addBox(-0.9F, -0.5F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.2275909337942703F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 14, 17);
            this.HandLeft.mirror = true;
            this.HandLeft.setPos(-0.01F, 2.1F, -0.5F);
            this.HandLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 10, 0);
            this.Hips.setPos(0.0F, 0.1F, 5.5F);
            this.Hips.addBox(-2.5F, -0.5F, -0.5F, 5.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.04555309164612875F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 50, 0);
            this.Chest.setPos(0.0F, 18.0F, -3.0F);
            this.Chest.addBox(-2.5F, -2.5F, -1.0F, 5.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.04555309164612875F, 0.0F, 0.0F);
            this.Neck2 = new ModelRenderer(this, 16, 27);
            this.Neck2.setPos(0.0F, 1.9F, 0.0F);
            this.Neck2.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck2, -0.2275909337942703F, 0.0F, 0.0F);
            this.LegLeft = new ModelRenderer(this, 56, 18);
            this.LegLeft.mirror = true;
            this.LegLeft.setPos(-0.01F, 1.5F, 1.5F);
            this.LegLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, -0.3186971254089062F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 14, 12);
            this.ArmRight.setPos(0.01F, 1.5F, 0.5F);
            this.ArmRight.addBox(-1.0F, -0.5F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.18203784630933073F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 14, 17);
            this.HandRight.setPos(0.01F, 2.1F, -0.5F);
            this.HandRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 0, 21);
            this.EarLeft.mirror = true;
            this.EarLeft.setPos(1.5F, -1.0F, 0.5F);
            this.EarLeft.addBox(-0.5F, -1.3F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.0911061832922575F, -0.2275909337942703F, 0.18203784630933073F);
            this.Body = new ModelRenderer(this, 26, 0);
            this.Body.setPos(0.0F, -2.1F, 1.0F);
            this.Body.addBox(-3.0F, -0.5F, -0.5F, 6.0F, 5.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.04555309164612875F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 56, 14);
            this.UpperLegRight.setPos(0.5F, 3.5F, -1.0F);
            this.UpperLegRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.3642502295386026F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 52, 7);
            this.ThighLeft.mirror = true;
            this.ThighLeft.setPos(2.0F, 1.0F, 1.1F);
            this.ThighLeft.addBox(-1.9F, 0.0F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 52, 7);
            this.ThighRight.setPos(-2.0F, 1.0F, 1.1F);
            this.ThighRight.addBox(-1.1F, 0.0F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 28, 25);
            this.Neck.setPos(0.0F, -2.0F, -0.5F);
            this.Neck.addBox(-1.5F, -0.79F, -2.0F, 3.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.2275909337942703F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 56, 22);
            this.FootLeft.setPos(-0.01F, 1.5F, -0.5F);
            this.FootLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 0, 24);
            this.Head.setPos(0.0F, 1.5F, -2.4F);
            this.Head.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.3642502295386026F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 4, 20);
            this.Snout.setPos(0.0F, -0.1F, -1.65F);
            this.Snout.addBox(-1.0F, -0.5F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.2275909337942703F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 14, 12);
            this.ArmLeft.mirror = true;
            this.ArmLeft.setPos(-0.01F, 1.5F, 0.5F);
            this.ArmLeft.addBox(-1.0F, -0.5F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.18203784630933073F, 0.0F, 0.0F);
            this.Nose = new ModelRenderer(this, 6, 16);
            this.Nose.setPos(0.0F, 0.0F, 0.0F);
            this.Nose.addBox(-0.5F, -0.9F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Nose, 0.18203784630933073F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 0, 5);
            this.Tail2.setPos(-0.01F, 0.0F, 2.5F);
            this.Tail2.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, 0.27314402127920984F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 0, 0);
            this.Tail1.setPos(0.0F, 0.0F, 2.0F);
            this.Tail1.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -1.1383037594559906F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 0, 16);
            this.Mouth.setPos(0.0F, 1.6F, -1.6F);
            this.Mouth.addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.0911061832922575F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 56, 14);
            this.UpperLegLeft.mirror = true;
            this.UpperLegLeft.setPos(-0.5F, 3.5F, -1.0F);
            this.UpperLegLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.3642502295386026F, 0.0F, 0.0F);
            this.Head.addChild(this.EarRight);
            this.LegRight.addChild(this.FootRight);
            this.Chest.addChild(this.ArmBaseRight);
            this.UpperLegRight.addChild(this.LegRight);
            this.Chest.addChild(this.ArmBaseLeft);
            this.ArmLeft.addChild(this.HandLeft);
            this.Body.addChild(this.Hips);
            this.Neck.addChild(this.Neck2);
            this.UpperLegLeft.addChild(this.LegLeft);
            this.ArmBaseRight.addChild(this.ArmRight);
            this.ArmRight.addChild(this.HandRight);
            this.Head.addChild(this.EarLeft);
            this.Chest.addChild(this.Body);
            this.ThighRight.addChild(this.UpperLegRight);
            this.Hips.addChild(this.ThighLeft);
            this.Hips.addChild(this.ThighRight);
            this.Chest.addChild(this.Neck);
            this.LegLeft.addChild(this.FootLeft);
            this.Neck.addChild(this.Head);
            this.Head.addChild(this.Snout);
            this.ArmBaseLeft.addChild(this.ArmLeft);
            this.Snout.addChild(this.Nose);
            this.Tail1.addChild(this.Tail2);
            this.Hips.addChild(this.Tail1);
            this.Head.addChild(this.Mouth);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.saveBase();
        }

        @Override
        public void setupAnim(BushDogEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
            this.Head.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
        }

        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 1.0F;
            float degree = 1.0F;
            this.Neck.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * -0.1F * limbSwingAmount * 0.5F - 0.227F;
            this.Head.xRot = MathHelper.cos(limbSwing * speed * 0.1F + 3.1415927F) * degree * -0.1F * limbSwingAmount * 0.5F + 0.364F;
            this.Tail1.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * 0.1F * limbSwingAmount * 0.5F - 1.138F;
            this.Tail2.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * 0.4F * limbSwingAmount * 0.5F + 0.273F;
            this.Tail1.zRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * -1.2F * limbSwingAmount * 0.5F;
            this.Tail2.yRot = MathHelper.cos(4.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F;
        }

        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 1.2F;
            float degree = 0.8F;

            if (entity.isSprinting()) {
                speed = 1.9F;
                degree = 0.3F;
                this.ArmBaseLeft.xRot = MathHelper.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * 5.5F * limbSwingAmount * 0.5F + 0.227F;
                this.ArmLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F - 0.182F;
                this.HandLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.0F + 3.1415927F) * degree * -4.0F * limbSwingAmount * 0.5F;
                this.ArmBaseRight.xRot = MathHelper.cos(1.5F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 5.5F * limbSwingAmount * 0.5F + 0.227F;
                this.ArmRight.xRot = MathHelper.cos(5.5F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F - 0.182F;
                this.HandRight.xRot = MathHelper.cos(2.5F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -4.0F * limbSwingAmount * 0.5F;

                this.ThighLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -4.0F * limbSwingAmount * 0.5F;
                this.UpperLegLeft.xRot = MathHelper.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.364F;
                this.LegLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F - 0.318F;
                this.FootLeft.xRot = MathHelper.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * -4.0F * limbSwingAmount * 0.5F + 0.5F;
                this.ThighRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -4.0F * limbSwingAmount * 0.5F;
                this.UpperLegRight.xRot = MathHelper.cos(4.5F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 3.0F * limbSwingAmount * 0.5F + 0.364F;
                this.LegRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F - 0.318F;
                this.FootRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -4.0F * limbSwingAmount * 0.5F + 0.5F;

                this.Chest.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -0.7F * limbSwingAmount * 0.5F - 0.045F;
                this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.0F * limbSwingAmount * 0.5F + 0.045F;
                this.Hips.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F - 0.045F;
                this.Neck.xRot = MathHelper.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.2F * limbSwingAmount * 0.5F - 0.227F;
                this.Head.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -0.5F * limbSwingAmount * 0.5F + 0.364F;
                this.Head.z = MathHelper.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * 4.0F * limbSwingAmount * 0.5F + 0.02F - 2.4F;
                this.Chest.y = MathHelper.cos(6.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -8.0F * limbSwingAmount * 0.5F + 18.0F;

                this.Tail1.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F - 1.138F;
                this.Tail2.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.273F;
                this.Mouth.xRot = MathHelper.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * 0.5F * limbSwingAmount * 0.5F - 0.091F;

            } else {
                this.ArmBaseLeft.xRot = MathHelper.cos(limbSwing * speed * 0.2F + 3.1415927F) * degree * 1.5F * limbSwingAmount * 0.5F + 0.227F;
                this.ArmLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F - 0.182F;
                this.HandLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F;
                this.ArmBaseRight.xRot = MathHelper.cos(limbSwing * speed * 0.2F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F + 0.227F;
                this.ArmRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F - 0.182F;
                this.HandRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F;

                this.Neck.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.4F + 3.1415927F) * degree * -0.1F * limbSwingAmount * 0.5F - 0.227F;
                this.Head.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.4F + 3.1415927F) * degree * -0.1F * limbSwingAmount * 0.5F + (this.isSwimming ? -1.2F : +0.36F);

                this.ThighLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F;
                this.UpperLegLeft.xRot = MathHelper.cos(limbSwing * speed * 0.2F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F + 0.364F;
                this.LegLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F - 0.318F;
                this.FootLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F;
                this.ThighRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F;
                this.UpperLegRight.xRot = MathHelper.cos(limbSwing * speed * 0.2F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.364F;
                this.LegRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F - 0.318F;
                this.FootRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F;

                this.Chest.xRot = MathHelper.cos(limbSwing * speed * 0.4F + 3.1415927F) * degree * 0.1F * limbSwingAmount * 0.5F - 0.045F;
                this.Body.xRot = MathHelper.cos(limbSwing * speed * 0.4F + 3.1415927F) * degree * -0.1F * limbSwingAmount * 0.5F + 0.045F;

                this.Tail1.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.4F + 3.1415927F) * degree * 0.3F * limbSwingAmount * 0.5F - 1.138F;
                this.Tail2.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F + 3.1415927F) * degree * 0.4F * limbSwingAmount * 0.5F + 0.273F;

                this.Chest.y = MathHelper.cos(2.0F + limbSwing * speed * 0.4F + 3.1415927F) * degree * 1.0F * limbSwingAmount * 0.5F + 18.0F;
                this.ThighLeft.z = MathHelper.cos(limbSwing * speed * 0.2F + 3.1415927F) * degree * -1.0F * limbSwingAmount * 0.5F + 0.0155F + 1.1F;
                this.ThighRight.z = MathHelper.cos(limbSwing * speed * 0.2F + 3.1415927F) * degree * 1.0F * limbSwingAmount * 0.5F + 0.0155F + 1.1F;

                this.Tail1.zRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * -1.2F * limbSwingAmount * 0.5F;
                this.Tail2.yRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F;
            }

        }
    }


    public static class Child extends BushDogModel {

        public ModelRenderer Body;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer Neck;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer Tail1;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer Tail2;
        public ModelRenderer UpperLegLeft;
        public ModelRenderer LegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer UpperLegRight;
        public ModelRenderer LegRight;
        public ModelRenderer FootRight;
        public ModelRenderer ArmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer Head;
        public ModelRenderer Snout;
        public ModelRenderer EarLeft;
        public ModelRenderer EarRight;
        public ModelRenderer TopSnout;
        public ModelRenderer Mouth;
        public ModelRenderer ArmRight;
        public ModelRenderer HandRight;

        public Child() {
            this.texWidth = 32;
            this.texHeight = 16;
            this.Head = new ModelRenderer(this, 22, 0);
            this.Head.setPos(0.0F, 0.7F, -1.2F);
            this.Head.addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 2.0F, -0.1F, -0.1F, 0.2F);
            this.setRotateAngle(Head, 0.46914448828868976F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 0);
            this.Body.setPos(0.0F, -1.1F, 1.7F);
            this.Body.addBox(-2.0F, -0.5F, 0.0F, 4.0F, 3.0F, 3.0F, -0.1F, -0.1F, 0.0F);
            this.setRotateAngle(Body, -0.11728612207217244F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 1, 13);
            this.Tail2.setPos(0.0F, 0.0F, 1.2F);
            this.Tail2.addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, 0.2738421523142173F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 24, 14);
            this.FootLeft.setPos(-0.01F, 1.7F, -0.5F);
            this.FootLeft.addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, 0.02F, -0.1F, 0.1F);
            this.setRotateAngle(FootLeft, 0.19547687289441354F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 6);
            this.Chest.setPos(0.0F, 20.7F, 0.0F);
            this.Chest.addBox(-2.0F, -1.5F, -1.0F, 4.0F, 3.0F, 3.0F, -0.3F, -0.1F, 0.0F);
            this.setRotateAngle(Chest, 0.03909537541112055F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 12, 0);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-1.1F, -0.4F, -0.5F);
            this.EarRight.addBox(-0.8F, -1.4F, 0.0F, 1.0F, 2.0F, 1.0F, -0.1F, -0.2F, -0.1F);
            this.setRotateAngle(EarRight, 0.0F, 0.46914448828868976F, -0.27366763203903305F);
            this.ArmBaseRight = new ModelRenderer(this, 14, 11);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-1.4F, 0.9F, -0.4F);
            this.ArmBaseRight.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.21781708265940905F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 14, 11);
            this.ArmBaseLeft.setPos(1.4F, 0.9F, -0.4F);
            this.ArmBaseLeft.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.21781708265940905F, 0.0F, 0.0F);
            this.LegRight = new ModelRenderer(this, 20, 13);
            this.LegRight.mirror = true;
            this.LegRight.setPos(-0.01F, 0.9F, 1.0F);
            this.LegRight.addBox(-0.5F, 0.0F, -0.7F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, -1.0224139077762113F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 10, 14);
            this.HandLeft.setPos(0.0F, 1.5F, -0.5F);
            this.HandLeft.addBox(-0.5F, -0.6F, -0.7F, 1.0F, 1.0F, 1.0F, 0.01F, -0.1F, 0.0F);
            this.setRotateAngle(HandLeft, 0.3186971254089062F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 28, 14);
            this.UpperLegRight.mirror = true;
            this.UpperLegRight.setPos(0.0F, 1.5F, -1.0F);
            this.UpperLegRight.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.9897762028270176F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 12, 0);
            this.EarLeft.setPos(1.1F, -0.4F, -0.5F);
            this.EarLeft.addBox(-0.2F, -1.4F, 0.0F, 1.0F, 2.0F, 1.0F, -0.1F, -0.2F, -0.1F);
            this.setRotateAngle(EarLeft, 0.0F, -0.46914448828868976F, 0.27366763203903305F);
            this.ArmRight = new ModelRenderer(this, 14, 13);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(0.02F, 1.0F, 0.5F);
            this.ArmRight.addBox(-0.5F, -0.2F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, -0.2F, 0.0F);
            this.setRotateAngle(ArmRight, -0.47123889803846897F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 14, 13);
            this.ArmLeft.setPos(-0.02F, 1.0F, 0.5F);
            this.ArmLeft.addBox(-0.5F, -0.2F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, -0.2F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.47123889803846897F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 24, 10);
            this.ThighLeft.setPos(1.2F, 1.2F, 1.7F);
            this.ThighLeft.addBox(-1.0F, -0.3F, -1.0F, 2.0F, 2.0F, 2.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.03909537541112055F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 24, 14);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.01F, 1.7F, -0.5F);
            this.FootRight.addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, 0.02F, -0.1F, 0.1F);
            this.setRotateAngle(FootRight, 0.19547687289441354F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 24, 10);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-1.2F, 1.2F, 1.7F);
            this.ThighRight.addBox(-1.0F, -0.3F, -1.0F, 2.0F, 2.0F, 2.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.03909537541112055F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 20, 5);
            this.Neck.setPos(0.0F, -1.0F, -0.5F);
            this.Neck.addBox(-1.5F, -0.4F, -1.7F, 3.0F, 2.0F, 3.0F, -0.2F, 0.2F, 0.0F);
            this.setRotateAngle(Neck, -0.35185837453889574F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 16, 3);
            this.Snout.setPos(0.0F, 0.1F, -1.1F);
            this.Snout.addBox(-1.0F, 0.0F, -1.3F, 2.0F, 1.0F, 1.0F, -0.3F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, -0.1171115934746098F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 18, 5);
            this.Mouth.setPos(0.0F, 1.0F, 0.0F);
            this.Mouth.addBox(-0.5F, -0.7F, -1.2F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 1, 13);
            this.Tail1.setPos(0.0F, 0.0F, 2.7F);
            this.Tail1.addBox(-0.5F, -0.5F, 0.1F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.3F);
            this.setRotateAngle(Tail1, -0.9773843811168246F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 16, 0);
            this.TopSnout.setPos(0.0F, 0.0F, -0.1F);
            this.TopSnout.addBox(-0.5F, -0.5F, -1.4F, 1.0F, 1.0F, 2.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.39112828270876815F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 28, 14);
            this.UpperLegLeft.setPos(0.0F, 1.5F, -1.0F);
            this.UpperLegLeft.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.9897762028270176F, 0.0F, 0.0F);
            this.LegLeft = new ModelRenderer(this, 20, 13);
            this.LegLeft.setPos(0.01F, 0.9F, 1.0F);
            this.LegLeft.addBox(-0.5F, 0.0F, -0.7F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, -1.0224139077762113F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 10, 14);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.0F, 1.5F, -0.5F);
            this.HandRight.addBox(-0.5F, -0.6F, -0.7F, 1.0F, 1.0F, 1.0F, 0.01F, -0.1F, 0.0F);
            this.setRotateAngle(HandRight, 0.3186971254089062F, 0.0F, 0.0F);
            this.Neck.addChild(this.Head);
            this.Chest.addChild(this.Body);
            this.Tail1.addChild(this.Tail2);
            this.LegLeft.addChild(this.FootLeft);
            this.Head.addChild(this.EarRight);
            this.Chest.addChild(this.ArmBaseRight);
            this.Chest.addChild(this.ArmBaseLeft);
            this.UpperLegRight.addChild(this.LegRight);
            this.ArmLeft.addChild(this.HandLeft);
            this.ThighRight.addChild(this.UpperLegRight);
            this.Head.addChild(this.EarLeft);
            this.ArmBaseRight.addChild(this.ArmRight);
            this.ArmBaseLeft.addChild(this.ArmLeft);
            this.Body.addChild(this.ThighLeft);
            this.LegRight.addChild(this.FootRight);
            this.Body.addChild(this.ThighRight);
            this.Chest.addChild(this.Neck);
            this.Head.addChild(this.Snout);
            this.Snout.addChild(this.Mouth);
            this.Body.addChild(this.Tail1);
            this.Snout.addChild(this.TopSnout);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.UpperLegLeft.addChild(this.LegLeft);
            this.ArmRight.addChild(this.HandRight);
            this.saveBase();
        }

        @Override
        public void setupAnim(BushDogEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
            this.Head.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
        }

        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 1.0F;
            float degree = 1.0F;
            this.Neck.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * -0.1F * limbSwingAmount * 0.5F - 0.352F;
            this.Head.xRot = MathHelper.cos(limbSwing * speed * 0.1F + 3.1415927F) * degree * -0.1F * limbSwingAmount * 0.5F + 0.469F;
            this.Tail1.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * 0.1F * limbSwingAmount * 0.5F - 0.977F;
            this.Tail2.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * 0.4F * limbSwingAmount * 0.5F + 0.273F;
            this.Tail1.zRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * -1.2F * limbSwingAmount * 0.5F;
            this.Tail2.yRot = MathHelper.cos(4.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F;
        }

        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 1.2F;
            float degree = 0.8F;

            if (entity.isSprinting()) {
                speed = 1.9F;
                degree = 0.3F;
            } else {
                this.ArmBaseLeft.xRot = MathHelper.cos(limbSwing * speed * 0.2F + 3.1415927F) * degree * 1.5F * limbSwingAmount * 0.5F + 0.218F;
                this.ArmLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F - 0.471F;
                this.HandLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.318F;
                this.ArmBaseRight.xRot = MathHelper.cos(limbSwing * speed * 0.2F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F + 0.218F;
                this.ArmRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F - 0.471F;
                this.HandRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.318F ;

                this.Neck.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.4F + 3.1415927F) * degree * -0.1F * limbSwingAmount * 0.5F - 0.352F;
                this.Head.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.4F + 3.1415927F) * degree * -0.1F * limbSwingAmount * 0.5F + 0.469F;

                this.ThighLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F + 0.039F;
                this.UpperLegLeft.xRot = MathHelper.cos(limbSwing * speed * 0.2F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F + 0.989F;
                this.LegLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F - 1.022F;
                this.FootLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F + 0.195F;
                this.ThighRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.039F;
                this.UpperLegRight.xRot = MathHelper.cos(limbSwing * speed * 0.2F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.989F;
                this.LegRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F - 1.022F;
                this.FootRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.195F;

                this.Chest.xRot = MathHelper.cos(limbSwing * speed * 0.4F + 3.1415927F) * degree * 0.1F * limbSwingAmount * 0.5F + 0.039F;
                this.Body.xRot = MathHelper.cos(limbSwing * speed * 0.4F + 3.1415927F) * degree * -0.1F * limbSwingAmount * 0.5F - 0.117F;

                this.Tail1.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.4F + 3.1415927F) * degree * 0.3F * limbSwingAmount * 0.5F - 0.977F;
                this.Tail2.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F + 3.1415927F) * degree * 0.4F * limbSwingAmount * 0.5F + 0.273F;

                this.Chest.y = MathHelper.cos(2.0F + limbSwing * speed * 0.4F + 3.1415927F) * degree * 1.0F * limbSwingAmount * 0.5F + 20.7F;
                this.ThighLeft.z = MathHelper.cos(limbSwing * speed * 0.2F + 3.1415927F) * degree * -1.0F * limbSwingAmount * 0.5F + 0.0155F + 1.7F;
                this.ThighRight.z = MathHelper.cos(limbSwing * speed * 0.2F + 3.1415927F) * degree * 1.0F * limbSwingAmount * 0.5F + 0.0155F + 1.7F;

                this.Tail1.zRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * -1.2F * limbSwingAmount * 0.5F;
                this.Tail2.yRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F;
            }
        }
    }
}

