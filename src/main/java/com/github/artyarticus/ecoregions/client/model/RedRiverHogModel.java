package com.github.artyarticus.ecoregions.client.model;

import com.github.artyarticus.ecoregions.entity.RedRiverHogEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class RedRiverHogModel extends ZawaBaseModel<RedRiverHogEntity> {
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

    public static class Adult extends RedRiverHogModel {

        public ModelRenderer Body;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer Neck;
        public ModelRenderer Hips;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer Tail1;
        public ModelRenderer UpperLegLeft;
        public ModelRenderer LowerLegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer UpperLegRight;
        public ModelRenderer LowerLegRight;
        public ModelRenderer FootRight;
        public ModelRenderer Tail2;
        public ModelRenderer Tail3;
        public ModelRenderer UpperArmLeft;
        public ModelRenderer LowerArmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer UpperArmRight;
        public ModelRenderer LowerArmRight;
        public ModelRenderer HandRight;
        public ModelRenderer Head;
        public ModelRenderer NeckBottom;
        public ModelRenderer Forehead;
        public ModelRenderer EarLeft;
        public ModelRenderer EarRight;
        public ModelRenderer Cheek;
        public ModelRenderer Nose;
        public ModelRenderer TuftLeft;
        public ModelRenderer TuftRight;
        public ModelRenderer BottomJaw;
        public ModelRenderer TeethLeft;
        public ModelRenderer TeethRight;

        public Adult() {
            this.texWidth = 64;
            this.texHeight = 64;
            this.UpperArmLeft = new ModelRenderer(this, 51, 57);
            this.UpperArmLeft.mirror = true;
            this.UpperArmLeft.setPos(0.0F, 3.9F, 1.0F);
            this.UpperArmLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmLeft, -0.0911061832922575F, 0.0F, 0.0F);
            this.NeckBottom = new ModelRenderer(this, 30, 29);
            this.NeckBottom.mirror = true;
            this.NeckBottom.setPos(0.0F, 4.0F, 0.2F);
            this.NeckBottom.addBox(-1.5F, 0.0F, -4.0F, 3.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckBottom, -0.40142572795869574F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 0);
            this.Chest.mirror = true;
            this.Chest.setPos(0.0F, 14.6F, -5.0F);
            this.Chest.addBox(-3.5F, -4.0F, -2.0F, 7.0F, 8.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, 0.03490658503988659F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 38, 54);
            this.ArmBaseLeft.mirror = true;
            this.ArmBaseLeft.setPos(2.2F, 0.6F, -0.2F);
            this.ArmBaseLeft.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.0911061832922575F, 0.0F, 0.0F);
            this.Cheek = new ModelRenderer(this, 45, 14);
            this.Cheek.mirror = true;
            this.Cheek.setPos(0.0F, -1.3F, -3.8F);
            this.Cheek.addBox(-2.5F, 0.0F, 0.0F, 5.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 29, 60);
            this.FootLeft.setPos(-0.1F, 3.2F, -1.2F);
            this.FootLeft.addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 0.13665927909957545F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 23, 39);
            this.Neck.mirror = true;
            this.Neck.setPos(0.0F, -3.9F, -1.6F);
            this.Neck.addBox(-2.5F, 0.0F, -2.5F, 5.0F, 6.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, 0.17453292519943295F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 43, 49);
            this.HandLeft.setPos(-0.1F, 2.3F, -1.3F);
            this.HandLeft.addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 44, 23);
            this.Head.mirror = true;
            this.Head.setPos(0.0F, 4.4F, -3.0F);
            this.Head.addBox(-2.0F, -3.5F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.05235987755982988F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 14);
            this.Body.mirror = true;
            this.Body.setPos(0.0F, 3.5F, 1.2F);
            this.Body.addBox(-4.0F, -8.0F, 0.0F, 8.0F, 9.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, -0.03490658503988659F, 0.0F, 0.0F);
            this.Tail3 = new ModelRenderer(this, 57, 45);
            this.Tail3.setPos(0.0F, 3.5F, -0.6F);
            this.Tail3.addBox(-1.0F, 0.0F, -0.5F, 2.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail3, 0.06981317007977318F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 0, 49);
            this.ThighLeft.mirror = true;
            this.ThighLeft.setPos(2.7F, 1.6F, 3.1F);
            this.ThighLeft.addBox(-1.5F, 0.0F, -2.5F, 3.0F, 8.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.BottomJaw = new ModelRenderer(this, 39, 13);
            this.BottomJaw.setPos(0.0F, 2.0F, 1.1F);
            this.BottomJaw.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(BottomJaw, -0.22689280275926282F, 0.0F, 0.0F);
            this.LowerLegRight = new ModelRenderer(this, 17, 50);
            this.LowerLegRight.mirror = true;
            this.LowerLegRight.setPos(0.0F, 1.7F, 2.7F);
            this.LowerLegRight.addBox(-0.99F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.3490658503988659F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 29, 60);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.1F, 3.2F, -1.2F);
            this.FootRight.addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, 0.13665927909957545F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 18, 57);
            this.UpperLegLeft.mirror = true;
            this.UpperLegLeft.setPos(-0.1F, 7.6F, -1.5F);
            this.UpperLegLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.4363323129985824F, 0.0F, 0.0F);
            this.Forehead = new ModelRenderer(this, 26, 51);
            this.Forehead.mirror = true;
            this.Forehead.setPos(0.0F, -3.4F, -2.0F);
            this.Forehead.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Forehead, 0.3141592653589793F, 0.0F, 0.0F);
            this.TeethRight = new ModelRenderer(this, 27, 14);
            this.TeethRight.mirror = true;
            this.TeethRight.setPos(-0.7F, 0.5F, -4.0F);
            this.TeethRight.addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TeethRight, -0.7853981633974483F, -0.2617993877991494F, -0.40142572795869574F);
            this.Nose = new ModelRenderer(this, 26, 12);
            this.Nose.setPos(0.0F, -3.4F, -1.8F);
            this.Nose.addBox(-1.5F, 0.0F, -6.0F, 3.0F, 3.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Nose, 0.5410520681182421F, 0.0F, 0.0F);
            this.TuftRight = new ModelRenderer(this, 35, 26);
            this.TuftRight.mirror = true;
            this.TuftRight.setPos(-2.3F, -0.2F, 0.4F);
            this.TuftRight.addBox(-1.5F, -1.0F, 0.0F, 3.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TuftRight, 0.0F, 0.22689280275926282F, -0.45378560551852565F);
            this.LowerArmRight = new ModelRenderer(this, 52, 50);
            this.LowerArmRight.mirror = true;
            this.LowerArmRight.setPos(0.0F, 2.3F, 0.0F);
            this.LowerArmRight.addBox(-0.99F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerArmRight, -0.04363323129985824F, 0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 38, 54);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-2.2F, 0.6F, -0.2F);
            this.ArmBaseRight.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.0911061832922575F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 43, 49);
            this.HandRight.setPos(0.1F, 2.3F, -1.3F);
            this.HandRight.addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 0, 49);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-2.7F, 1.6F, 3.1F);
            this.ThighRight.addBox(-1.5F, 0.0F, -2.5F, 3.0F, 8.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.TeethLeft = new ModelRenderer(this, 27, 14);
            this.TeethLeft.setPos(0.7F, 0.5F, -4.0F);
            this.TeethLeft.addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TeethLeft, -0.7853981633974483F, 0.2617993877991494F, 0.40142572795869574F);
            this.LowerLegLeft = new ModelRenderer(this, 17, 50);
            this.LowerLegLeft.mirror = true;
            this.LowerLegLeft.setPos(0.0F, 1.7F, 2.7F);
            this.LowerLegLeft.addBox(-1.01F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.3490658503988659F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 52, 37);
            this.Tail2.setPos(0.0F, 3.0F, 0.0F);
            this.Tail2.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, -0.3141592653589793F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 34, 22);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-3.2F, -1.6F, 0.1F);
            this.EarRight.addBox(-1.5F, -2.0F, 0.0F, 3.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.3141592653589793F, 0.4886921905584123F, 0.3490658503988659F);
            this.LowerArmLeft = new ModelRenderer(this, 52, 50);
            this.LowerArmLeft.mirror = true;
            this.LowerArmLeft.setPos(0.0F, 2.3F, 0.0F);
            this.LowerArmLeft.addBox(-1.01F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerArmLeft, -0.04363323129985824F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 52, 44);
            this.Tail1.setPos(0.0F, 0.2F, 5.0F);
            this.Tail1.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, 0.4782202083885436F, 0.0F, 0.0F);
            this.UpperArmRight = new ModelRenderer(this, 51, 57);
            this.UpperArmRight.mirror = true;
            this.UpperArmRight.setPos(0.0F, 3.9F, 1.0F);
            this.UpperArmRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmRight, -0.0911061832922575F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 34, 22);
            this.EarLeft.setPos(3.2F, -1.6F, 0.1F);
            this.EarLeft.addBox(-1.5F, -2.0F, 0.0F, 3.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.3141592653589793F, -0.4886921905584123F, -0.3490658503988659F);
            this.UpperLegRight = new ModelRenderer(this, 18, 57);
            this.UpperLegRight.mirror = true;
            this.UpperLegRight.setPos(-0.1F, 7.6F, -1.5F);
            this.UpperLegRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.4363323129985824F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 34);
            this.Hips.mirror = true;
            this.Hips.setPos(0.0F, -8.0F, 8.0F);
            this.Hips.addBox(-3.0F, 0.0F, 0.0F, 6.0F, 9.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.2275909337942703F, 0.0F, 0.0F);
            this.TuftLeft = new ModelRenderer(this, 35, 26);
            this.TuftLeft.setPos(2.3F, -0.2F, 0.4F);
            this.TuftLeft.addBox(-1.5F, -1.0F, 0.0F, 3.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TuftLeft, 0.0F, -0.22689280275926282F, 0.45378560551852565F);
            this.ArmBaseLeft.addChild(this.UpperArmLeft);
            this.Neck.addChild(this.NeckBottom);
            this.Chest.addChild(this.ArmBaseLeft);
            this.Head.addChild(this.Cheek);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.Chest.addChild(this.Neck);
            this.LowerArmLeft.addChild(this.HandLeft);
            this.Neck.addChild(this.Head);
            this.Chest.addChild(this.Body);
            this.Tail2.addChild(this.Tail3);
            this.Hips.addChild(this.ThighLeft);
            this.Cheek.addChild(this.BottomJaw);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.LowerLegRight.addChild(this.FootRight);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.Head.addChild(this.Forehead);
            this.Nose.addChild(this.TeethRight);
            this.Head.addChild(this.Nose);
            this.EarRight.addChild(this.TuftRight);
            this.UpperArmRight.addChild(this.LowerArmRight);
            this.Chest.addChild(this.ArmBaseRight);
            this.LowerArmRight.addChild(this.HandRight);
            this.Hips.addChild(this.ThighRight);
            this.Nose.addChild(this.TeethLeft);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.Tail1.addChild(this.Tail2);
            this.Head.addChild(this.EarRight);
            this.UpperArmLeft.addChild(this.LowerArmLeft);
            this.Hips.addChild(this.Tail1);
            this.ArmBaseRight.addChild(this.UpperArmRight);
            this.Head.addChild(this.EarLeft);
            this.ThighRight.addChild(this.UpperLegRight);
            this.Body.addChild(this.Hips);
            this.EarLeft.addChild(this.TuftLeft);
            this.saveBase();
        }

        @Override
        public void setupAnim(RedRiverHogEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);

        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;

            this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.2F) * 0.2F + 0.175F;
            this.Head.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.2F) * 0.2F + 0.0524F;
            this.Tail1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.2F) * 0.2F + 0.478F;
            this.Tail2.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.2F) * 0.2F - 0.314F;        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            }

        }
    }


    public static class Child extends RedRiverHogModel {

        public ModelRenderer Body;
        public ModelRenderer Neck;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer Hips;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer Tail;
        public ModelRenderer UpperLegLeft;
        public ModelRenderer LowerLegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer UpperLegRight;
        public ModelRenderer LowerLegRight;
        public ModelRenderer FootRight;
        public ModelRenderer Head;
        public ModelRenderer Snout;
        public ModelRenderer Mouth;
        public ModelRenderer EarLeft;
        public ModelRenderer EarRight;
        public ModelRenderer ArmLeft;
        public ModelRenderer ForearmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer ArmRight;
        public ModelRenderer ForearmRight;
        public ModelRenderer HandRight;

        public Child() {
            this.texWidth = 64;
            this.texHeight = 32;
            this.ThighRight = new ModelRenderer(this, 24, 26);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-1.2F, 1.5F, 1.1F);
            this.ThighRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.2617993877991494F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 30, 23);
            this.UpperLegLeft.setPos(0.3F, 3.0F, -0.3F);
            this.UpperLegLeft.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.6981317007977318F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 30, 23);
            this.UpperLegRight.mirror = true;
            this.UpperLegRight.setPos(-0.3F, 3.0F, -0.3F);
            this.UpperLegRight.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.6981317007977318F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 24, 21);
            this.ArmLeft.setPos(-0.01F, 2.0F, 0.3F);
            this.ArmLeft.addBox(-0.5F, -0.5F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.12217304763960307F, 0.0F, 0.0F);
            this.Tail = new ModelRenderer(this, 27, 10);
            this.Tail.setPos(0.0F, 0.7F, 1.5F);
            this.Tail.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail, 0.4300491170387584F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 10, 7);
            this.Neck.setPos(0.0F, -0.6F, -1.0F);
            this.Neck.addBox(-1.0F, -1.0F, -2.0F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.16580627893946132F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 22, 14);
            this.HandLeft.setPos(-0.01F, 1.5F, 0.3F);
            this.HandLeft.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.ForearmRight = new ModelRenderer(this, 24, 17);
            this.ForearmRight.mirror = true;
            this.ForearmRight.setPos(0.01F, 0.9F, -1.0F);
            this.ForearmRight.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmRight, 0.017453292519943295F, 0.0F, 0.0F);
            this.LowerLegRight = new ModelRenderer(this, 29, 19);
            this.LowerLegRight.mirror = true;
            this.LowerLegRight.setPos(0.01F, 1.8F, 1.0F);
            this.LowerLegRight.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.6981317007977318F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 22, 14);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.01F, 1.5F, 0.3F);
            this.HandRight.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 6, 6);
            this.Mouth.setPos(0.0F, 0.4F, -0.9F);
            this.Mouth.addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 13, 16);
            this.Hips.setPos(0.0F, -0.3F, 4.0F);
            this.Hips.addBox(-1.5F, 0.3F, 0.0F, 3.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.3490658503988659F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 18, 23);
            this.ArmBaseLeft.setPos(1.4F, 0.4F, 0.0F);
            this.ArmBaseLeft.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.22689280275926282F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 18, 3);
            this.Head.setPos(0.0F, 0.7F, -2.0F);
            this.Head.addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.40142572795869574F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 1, 20);
            this.Body.setPos(0.0F, -1.5F, 0.1F);
            this.Body.addBox(-2.0F, 0.0F, 0.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.20943951023931953F, 0.0F, 0.0F);
            this.ForearmLeft = new ModelRenderer(this, 24, 17);
            this.ForearmLeft.setPos(-0.01F, 0.9F, -1.0F);
            this.ForearmLeft.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmLeft, 0.017453292519943295F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 12);
            this.Chest.setPos(0.0F, 18.3F, -3.0F);
            this.Chest.addBox(-1.5F, -1.5F, -1.0F, 3.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.12217304763960307F, 0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 18, 23);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-1.4F, 0.4F, 0.0F);
            this.ArmBaseRight.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.22689280275926282F, 0.0F, 0.0F);
            this.LowerLegLeft = new ModelRenderer(this, 29, 19);
            this.LowerLegLeft.setPos(-0.01F, 1.8F, 1.0F);
            this.LowerLegLeft.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.6981317007977318F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 24, 21);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(0.01F, 2.0F, 0.3F);
            this.ArmRight.addBox(-0.5F, -0.5F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.12217304763960307F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 0, 0);
            this.EarLeft.setPos(1.0F, -1.0F, 0.7F);
            this.EarLeft.addBox(-1.0F, -1.2F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.0F, -0.3490658503988659F, 0.5235987755982988F);
            this.Snout = new ModelRenderer(this, 12, 0);
            this.Snout.setPos(0.0F, -1.2F, -1.5F);
            this.Snout.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.4363323129985824F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 0, 0);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-1.0F, -1.0F, 0.7F);
            this.EarRight.addBox(-1.0F, -1.2F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.0F, 0.3490658503988659F, -0.5235987755982988F);
            this.FootRight = new ModelRenderer(this, 29, 16);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.01F, 1.3F, -0.7F);
            this.FootRight.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 24, 26);
            this.ThighLeft.setPos(1.2F, 1.5F, 1.1F);
            this.ThighLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.2617993877991494F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 29, 16);
            this.FootLeft.setPos(-0.01F, 1.3F, -0.7F);
            this.FootLeft.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.Hips.addChild(this.ThighRight);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.ThighRight.addChild(this.UpperLegRight);
            this.ArmBaseLeft.addChild(this.ArmLeft);
            this.Hips.addChild(this.Tail);
            this.Chest.addChild(this.Neck);
            this.ForearmLeft.addChild(this.HandLeft);
            this.ArmRight.addChild(this.ForearmRight);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.ForearmRight.addChild(this.HandRight);
            this.Head.addChild(this.Mouth);
            this.Body.addChild(this.Hips);
            this.Chest.addChild(this.ArmBaseLeft);
            this.Neck.addChild(this.Head);
            this.Chest.addChild(this.Body);
            this.ArmLeft.addChild(this.ForearmLeft);
            this.Chest.addChild(this.ArmBaseRight);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.ArmBaseRight.addChild(this.ArmRight);
            this.Head.addChild(this.EarLeft);
            this.Head.addChild(this.Snout);
            this.Head.addChild(this.EarRight);
            this.LowerLegRight.addChild(this.FootRight);
            this.Hips.addChild(this.ThighLeft);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.saveBase();

        }

        @Override
        public void setupAnim(RedRiverHogEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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
