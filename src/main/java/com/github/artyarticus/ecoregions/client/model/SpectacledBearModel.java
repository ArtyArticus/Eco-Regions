package com.github.artyarticus.ecoregions.client.model;

import com.github.artyarticus.ecoregions.entity.SpectacledBearEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class SpectacledBearModel extends ZawaBaseModel<SpectacledBearEntity> {
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

    public static class Adult extends SpectacledBearModel {

        public ModelRenderer Chest;
        public ModelRenderer Hips;
        public ModelRenderer Neck;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer NeckBase;
        public ModelRenderer Head;
        public ModelRenderer Snout;
        public ModelRenderer EarRight;
        public ModelRenderer EarLeft;
        public ModelRenderer Forehead;
        public ModelRenderer Mouth;
        public ModelRenderer Nose;
        public ModelRenderer InwardJointLeft;
        public ModelRenderer ArmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer InwardJointRight;
        public ModelRenderer ArmRight;
        public ModelRenderer HandRight;
        public ModelRenderer Tail;
        public ModelRenderer ThighRight;
        public ModelRenderer ThighLeft;
        public ModelRenderer UpperLegRight;
        public ModelRenderer FootRight;
        public ModelRenderer UpperLegLeft;
        public ModelRenderer FootRight_1;

        public Adult() {
            this.texWidth = 96;
            this.texHeight = 64;
            this.ThighRight = new ModelRenderer(this, 24, 35);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-3.0F, -1.1F, 2.5F);
            this.ThighRight.addBox(-2.5F, 0.0F, -3.0F, 5.0F, 7.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, -0.06981317007977318F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 67, 16);
            this.Chest.setPos(0.0F, 0.0F, 1.7F);
            this.Chest.addBox(-4.5F, -5.0F, -6.0F, 9.0F, 10.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.13962634015954636F, 0.0F, 0.0F);
            this.Tail = new ModelRenderer(this, 0, 42);
            this.Tail.setPos(0.0F, -4.0F, 5.0F);
            this.Tail.addBox(-1.5F, -1.0F, 0.0F, 3.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail, -1.2217304763960306F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 42, 44);
            this.ArmLeft.setPos(-1.2F, 0.0F, -0.5F);
            this.ArmLeft.addBox(-1.5F, 0.0F, -4.0F, 3.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.20943951023931953F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 66, 32);
            this.HandLeft.setPos(0.01F, 6.0F, -2.0F);
            this.HandLeft.addBox(-1.5F, -1.0F, -3.2F, 3.0F, 2.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.06981317007977318F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 63, 39);
            this.ArmBaseLeft.setPos(3.5F, -0.4F, -3.0F);
            this.ArmBaseLeft.addBox(-2.0F, 0.0F, -2.5F, 4.0F, 7.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.3141592653589793F, 0.03490658503988659F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 63, 39);
            this.ArmBaseRight.setPos(-3.5F, -0.4F, -3.0F);
            this.ArmBaseRight.addBox(-2.0F, 0.0F, -2.5F, 4.0F, 7.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.3141592653589793F, -0.03490658503988659F, 0.0F);
            this.FootRight = new ModelRenderer(this, 18, 48);
            this.FootRight.mirror = true;
            this.FootRight.setPos(-0.01F, 7.3F, 3.8F);
            this.FootRight.addBox(-2.0F, -1.0F, -6.0F, 4.0F, 2.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, -0.20943951023931953F, 0.0F, 0.0F);
            this.InwardJointLeft = new ModelRenderer(this, 0, 0);
            this.InwardJointLeft.setPos(1.5F, 7.0F, 2.5F);
            this.InwardJointLeft.addBox(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(InwardJointLeft, 0.0F, 0.08726646259971647F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 0, 47);
            this.UpperLegRight.setPos(0.0F, 7.0F, -3.0F);
            this.UpperLegRight.addBox(-2.0F, 0.0F, 0.0F, 4.0F, 7.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.4886921905584123F, 0.0F, 0.0F);
            this.FootRight_1 = new ModelRenderer(this, 18, 48);
            this.FootRight_1.setPos(0.01F, 7.3F, 3.8F);
            this.FootRight_1.addBox(-2.0F, -1.0F, -6.0F, 4.0F, 2.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight_1, -0.20943951023931953F, 0.0F, 0.0F);
            this.InwardJointRight = new ModelRenderer(this, 0, 0);
            this.InwardJointRight.setPos(-1.5F, 7.0F, 2.5F);
            this.InwardJointRight.addBox(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(InwardJointRight, 0.0F, -0.08726646259971647F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 42, 44);
            this.ArmRight.setPos(1.2F, 0.0F, -0.5F);
            this.ArmRight.addBox(-1.5F, 0.0F, -4.0F, 3.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.20943951023931953F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 24, 35);
            this.ThighLeft.setPos(3.0F, -1.1F, 2.5F);
            this.ThighLeft.addBox(-2.5F, 0.0F, -3.0F, 5.0F, 7.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, -0.06981317007977318F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 66, 32);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.01F, 6.0F, -2.0F);
            this.HandRight.addBox(-1.5F, -1.0F, -3.2F, 3.0F, 2.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.06981317007977318F, 0.0F, 0.0F);
            this.Nose = new ModelRenderer(this, 72, 0);
            this.Nose.setPos(0.0F, -2.8F, 1.2F);
            this.Nose.addBox(-1.5F, 0.0F, -3.6F, 3.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Nose, 0.2792526803190927F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 34, 0);
            this.Snout.setPos(0.0F, -0.9F, -4.2F);
            this.Snout.addBox(-2.0F, -1.5F, -2.0F, 4.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.3642502295386026F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 0, 30);
            this.Head.setPos(0.0F, 0.4F, -3.2F);
            this.Head.addBox(-3.5F, -5.0F, -4.0F, 7.0F, 7.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.13665927909957545F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 18, 48);
            this.EarLeft.setPos(2.0F, -4.2F, -0.3F);
            this.EarLeft.addBox(0.0F, -2.3F, -0.5F, 2.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, -0.3141592653589793F, -0.20943951023931953F, 0.6108652381980153F);
            this.UpperLegLeft = new ModelRenderer(this, 0, 47);
            this.UpperLegLeft.setPos(0.0F, 7.0F, -3.0F);
            this.UpperLegLeft.addBox(-2.0F, 0.0F, 0.0F, 4.0F, 7.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.4886921905584123F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 42, 18);
            this.Neck.setPos(0.0F, 0.8F, -5.4F);
            this.Neck.addBox(-3.0F, -5.5F, -4.0F, 6.0F, 5.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, 0.13665927909957545F, 0.0F, 0.0F);
            this.Forehead = new ModelRenderer(this, 23, 25);
            this.Forehead.setPos(0.0F, -6.0F, 0.0F);
            this.Forehead.addBox(-2.5F, 0.0F, -4.0F, 5.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Forehead, 0.2617993877991494F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 46, 0);
            this.Hips.setPos(0.0F, -0.4F, 11.5F);
            this.Hips.addBox(-4.5F, -5.0F, 0.0F, 9.0F, 10.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.17453292519943295F, 0.0F, 0.0F);
            this.NeckBase = new ModelRenderer(this, 44, 30);
            this.NeckBase.setPos(0.0F, 2.5F, 0.0F);
            this.NeckBase.addBox(-2.5F, -3.0F, -6.0F, 5.0F, 4.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckBase, -0.3839724354387525F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 18, 48);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-2.0F, -4.2F, -0.3F);
            this.EarRight.addBox(-2.0F, -2.3F, -0.5F, 2.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, -0.3141592653589793F, 0.20943951023931953F, -0.6108652381980153F);
            this.Body = new ModelRenderer(this, 0, 0);
            this.Body.setPos(0.0F, 11.4F, -5.5F);
            this.Body.addBox(-5.0F, -5.5F, 0.0F, 10.0F, 11.0F, 13.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, -0.03490658503988659F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 12, 43);
            this.Mouth.setPos(0.0F, 1.5F, 0.8F);
            this.Mouth.addBox(-1.5F, 0.0F, -2.5F, 3.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.10471975511965977F, 0.0F, 0.0F);
            this.Hips.addChild(this.ThighRight);
            this.Body.addChild(this.Chest);
            this.Hips.addChild(this.Tail);
            this.InwardJointLeft.addChild(this.ArmLeft);
            this.ArmLeft.addChild(this.HandLeft);
            this.Chest.addChild(this.ArmBaseLeft);
            this.Chest.addChild(this.ArmBaseRight);
            this.UpperLegRight.addChild(this.FootRight);
            this.ArmBaseLeft.addChild(this.InwardJointLeft);
            this.ThighRight.addChild(this.UpperLegRight);
            this.UpperLegLeft.addChild(this.FootRight_1);
            this.ArmBaseRight.addChild(this.InwardJointRight);
            this.InwardJointRight.addChild(this.ArmRight);
            this.Hips.addChild(this.ThighLeft);
            this.ArmRight.addChild(this.HandRight);
            this.Snout.addChild(this.Nose);
            this.Head.addChild(this.Snout);
            this.Neck.addChild(this.Head);
            this.Head.addChild(this.EarLeft);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.Chest.addChild(this.Neck);
            this.Head.addChild(this.Forehead);
            this.Body.addChild(this.Hips);
            this.Neck.addChild(this.NeckBase);
            this.Head.addChild(this.EarRight);
            this.Snout.addChild(this.Mouth);
            this.saveBase();
        }

        @Override
        public void setupAnim(SpectacledBearEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = (float) Math.toRadians((double) netHeadYaw) * 0.5F;
            this.Head.yRot = (float) Math.toRadians((double) netHeadYaw) * 0.5F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = MathHelper.cos(limbSwing * 0.1F) * 0.2F * limbSwingAmount + 0.136F;
            this.Head.xRot = MathHelper.cos(1.0F + limbSwing * 0.1F) * -0.4F * limbSwingAmount + 0.136F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            } else {
                float speed = 0.8f;
                float degree = 0.7f;

                this.Body.xRot = MathHelper.cos(limbSwing * speed * 0.4F) * degree * -0.05F * limbSwingAmount -0.034F;
                this.Chest.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.4F) * degree * 0.1F * limbSwingAmount - 0.139F;
                this.Hips.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.4F) * degree * 0.1F * limbSwingAmount - 0.174F;
                this.Head.zRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * degree * -0.2F * limbSwingAmount;
                this.Head.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * degree * 0.2F * limbSwingAmount + 0.136F;

                this.ThighLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * degree * -1.5F * limbSwingAmount - 0.069F;
                this.UpperLegLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * degree * -0.5F * limbSwingAmount + 0.488F;
                this.FootRight_1.xRot = MathHelper.cos(-4.0F + limbSwing * speed * 0.2F) * degree * -1.5F * limbSwingAmount - 0.209F;
                this.ThighRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * degree * 1.5F * limbSwingAmount - 0.069F;
                this.UpperLegRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * degree * 0.5F * limbSwingAmount + 0.488F;
                this.FootRight.xRot = MathHelper.cos(-4.0F + limbSwing * speed * 0.2F) * degree * 1.5F * limbSwingAmount - 0.209F;

                this.ArmBaseLeft.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * 1.5F * limbSwingAmount + 0.314F;
                this.ArmLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount - 0.209F;
                this.HandLeft.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * -1.5F * limbSwingAmount + 0.069F;
                this.ArmBaseRight.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * -1.5F * limbSwingAmount + 0.314F;
                this.ArmRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount - 0.209F;
                this.HandRight.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * 1.5F * limbSwingAmount + 0.069F;
            }
        }
    }


    public static class Child extends SpectacledBearModel {

        public ModelRenderer Chest;
        public ModelRenderer Hips;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer Neck;
        public ModelRenderer ArmRight;
        public ModelRenderer HandRight;
        public ModelRenderer ArmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer head;
        public ModelRenderer Neck2;
        public ModelRenderer Snout;
        public ModelRenderer EarRight;
        public ModelRenderer EarLeft;
        public ModelRenderer Mouth;
        public ModelRenderer Nose;
        public ModelRenderer Tail1;
        public ModelRenderer ThighRight;
        public ModelRenderer ThighLeft;
        public ModelRenderer UpperLegRight;
        public ModelRenderer FootRight;
        public ModelRenderer UpperLegLeft;
        public ModelRenderer FootLeft;

        public Child() {
            this.texWidth = 48;
            this.texHeight = 32;
            this.Snout = new ModelRenderer(this, 20, 3);
            this.Snout.setPos(0.0F, 0.2F, -1.2F);
            this.Snout.addBox(-1.5F, -1.0F, -2.0F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.2792526803190927F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 0, 0);
            this.EarLeft.setPos(1.3F, -3.1F, -0.4F);
            this.EarLeft.addBox(0.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, -0.45378560551852565F, -0.2617993877991494F, 0.8726646259971648F);
            this.Body = new ModelRenderer(this, 0, 0);
            this.Body.setPos(0.0F, 17.5F, -3.5F);
            this.Body.addBox(-3.0F, -3.0F, 0.0F, 6.0F, 6.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, -0.03490658503988659F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 29, 25);
            this.HandLeft.setPos(0.02F, 3.0F, -1.3F);
            this.HandLeft.addBox(-1.0F, -0.5F, -1.3F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.06981317007977318F, 0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 32, 17);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-2.4F, -0.2F, -1.2F);
            this.ArmBaseRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.2617993877991494F, -0.03490658503988659F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 0, 24);
            this.Tail1.setPos(0.0F, -2.0F, 2.0F);
            this.Tail1.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -1.2217304763960306F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 30, 0);
            this.Hips.setPos(0.0F, 0.3F, 7.0F);
            this.Hips.addBox(-2.5F, -3.0F, 0.0F, 5.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.17453292519943295F, -0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 0, 14);
            this.Neck.setPos(0.0F, -2.1F, -2.5F);
            this.Neck.addBox(-2.0F, -0.5F, -2.5F, 4.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 29, 25);
            this.HandRight.mirror = true;
            this.HandRight.setPos(-0.02F, 3.0F, -1.3F);
            this.HandRight.addBox(-1.0F, -0.5F, -1.3F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.06981317007977318F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 8, 28);
            this.FootLeft.setPos(0.02F, 2.8F, 0.7F);
            this.FootLeft.addBox(-1.0F, -0.5F, -1.8F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, -0.20943951023931953F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 30, 7);
            this.Chest.setPos(0.0F, 0.2F, 1.2F);
            this.Chest.addBox(-2.5F, -3.0F, -3.0F, 5.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.13665927909957545F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 0, 27);
            this.UpperLegRight.mirror = true;
            this.UpperLegRight.setPos(0.02F, 4.0F, -1.3F);
            this.UpperLegRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.4886921905584123F, 0.0F, 0.0F);
            this.Nose = new ModelRenderer(this, 20, 0);
            this.Nose.setPos(0.0F, -1.6F, -0.3F);
            this.Nose.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Nose, 0.2792526803190927F, 0.0F, 0.0F);
            this.Neck2 = new ModelRenderer(this, 35, 26);
            this.Neck2.setPos(0.0F, 2.2F, 0.0F);
            this.Neck2.addBox(-1.5F, -1.0F, -3.0F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck2, -0.20943951023931953F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 9, 21);
            this.ThighLeft.setPos(2.5F, -0.6F, 0.3F);
            this.ThighLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, -0.06981317007977318F, 0.0F, 0.0F);
            this.head = new ModelRenderer(this, 16, 14);
            this.head.setPos(0.0F, 2.0F, -2.3F);
            this.head.addBox(-2.5F, -2.5F, -2.0F, 5.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(head, 0.22689280275926282F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 0, 27);
            this.UpperLegLeft.setPos(-0.02F, 4.0F, -1.3F);
            this.UpperLegLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.4886921905584123F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 19, 22);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(0.02F, 3.5F, 1.0F);
            this.ArmRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.20943951023931953F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 32, 17);
            this.ArmBaseLeft.setPos(2.4F, -0.2F, -1.2F);
            this.ArmBaseLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.27314402127920984F, 0.03490658503988659F, 0.0F);
            this.Mouth = new ModelRenderer(this, 0, 3);
            this.Mouth.setPos(0.0F, 1.0F, 0.1F);
            this.Mouth.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.10471975511965977F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 0, 0);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-1.4F, -3.1F, -0.4F);
            this.EarRight.addBox(-2.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, -0.45378560551852565F, 0.2617993877991494F, -0.8726646259971648F);
            this.ThighRight = new ModelRenderer(this, 9, 21);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-2.5F, -0.6F, 0.3F);
            this.ThighRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, -0.06981317007977318F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 19, 22);
            this.ArmLeft.setPos(-0.02F, 3.5F, 1.0F);
            this.ArmLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.20943951023931953F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 8, 28);
            this.FootRight.mirror = true;
            this.FootRight.setPos(-0.02F, 2.8F, 0.7F);
            this.FootRight.addBox(-1.0F, -0.5F, -1.8F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, -0.20943951023931953F, 0.0F, 0.0F);
            this.head.addChild(this.Snout);
            this.head.addChild(this.EarLeft);
            this.ArmLeft.addChild(this.HandLeft);
            this.Chest.addChild(this.ArmBaseRight);
            this.Hips.addChild(this.Tail1);
            this.Body.addChild(this.Hips);
            this.Chest.addChild(this.Neck);
            this.ArmRight.addChild(this.HandRight);
            this.UpperLegLeft.addChild(this.FootLeft);
            this.Body.addChild(this.Chest);
            this.ThighRight.addChild(this.UpperLegRight);
            this.Snout.addChild(this.Nose);
            this.Neck.addChild(this.Neck2);
            this.Hips.addChild(this.ThighLeft);
            this.Neck.addChild(this.head);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.ArmBaseRight.addChild(this.ArmRight);
            this.Chest.addChild(this.ArmBaseLeft);
            this.Snout.addChild(this.Mouth);
            this.head.addChild(this.EarRight);
            this.Hips.addChild(this.ThighRight);
            this.ArmBaseLeft.addChild(this.ArmLeft);
            this.UpperLegRight.addChild(this.FootRight);
            this.saveBase();

        }

        @Override
        public void setupAnim(SpectacledBearEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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

