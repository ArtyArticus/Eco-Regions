package com.github.artyarticus.ecoregions.client.model;

import com.github.artyarticus.ecoregions.entity.MongooseEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class MongooseModel extends ZawaBaseModel<MongooseEntity> {
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

    public static class Adult extends MongooseModel {

        public ModelRenderer Neck;
        public ModelRenderer Hips;
        public ModelRenderer UpperArmLeft;
        public ModelRenderer UpperArmRight;
        public ModelRenderer Head;
        public ModelRenderer EarRight;
        public ModelRenderer Snout;
        public ModelRenderer Mouth;
        public ModelRenderer EarLeft;
        public ModelRenderer Nose;
        public ModelRenderer Tail1;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer Tail2;
        public ModelRenderer VontsiraTail2;
        public ModelRenderer Tail3;
        public ModelRenderer Tail4;
        public ModelRenderer VontsiraTail3;
        public ModelRenderer UpperLegLeft;
        public ModelRenderer LowerLegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer UpperLegRight;
        public ModelRenderer LowerLegRight;
        public ModelRenderer FootRight;
        public ModelRenderer LowerArmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer LowerArmRight;
        public ModelRenderer HandRight;

        public Adult() {
            this.texWidth = 64;
            this.texHeight = 32;
            this.Tail1 = new ModelRenderer(this, 50, 4);
            this.Tail1.setPos(0.0F, 0.2F, 4.0F);
            this.Tail1.addBox(-1.5F, -0.5F, -0.5F, 3.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -0.3909537457888271F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 49, 0);
            this.Mouth.setPos(0.0F, 1.0F, -1.4F);
            this.Mouth.addBox(-0.5F, -0.5F, -1.9F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.03909537541112055F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 15);
            this.Hips.setPos(0.0F, -1.0F, 2.5F);
            this.Hips.addBox(-2.0F, -0.5F, -0.3F, 4.0F, 4.0F, 4.0F, 0.01F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.1563815016444822F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 30, 0);
            this.EarLeft.mirror = true;
            this.EarLeft.setPos(1.5F, -0.1F, 0.0F);
            this.EarLeft.addBox(-1.0F, -1.5F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, -0.2F, 0.0F);
            this.setRotateAngle(EarLeft, 0.2340486500292785F, 0.9773843811168246F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 20, 16);
            this.HandLeft.mirror = true;
            this.HandLeft.setPos(0.0F, 2.0F, 0.0F);
            this.HandLeft.addBox(-1.0F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.19547687289441354F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 8, 0);
            this.ThighRight.setPos(-1.2F, 1.0F, 2.5F);
            this.ThighRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.1563815016444822F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 8, 0);
            this.ThighLeft.mirror = true;
            this.ThighLeft.setPos(1.2F, 1.0F, 2.5F);
            this.ThighLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.1563815016444822F, 0.0F, 0.0F);
            this.Nose = new ModelRenderer(this, 43, 3);
            this.Nose.setPos(0.0F, -0.2F, 0.0F);
            this.Nose.addBox(-0.5F, -0.9F, -2.2F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Nose, 0.35185837453889574F, 0.0F, 0.0F);
            this.Tail3 = new ModelRenderer(this, 32, 19);
            this.Tail3.setPos(0.0F, -0.1F, 5.0F);
            this.Tail3.addBox(-1.0F, 0.0F, -0.5F, 2.0F, 2.0F, 4.0F, -0.1F, 0.1F, 0.0F);
            this.setRotateAngle(Tail3, 0.23474678106428595F, 0.0F, 0.0F);
            this.LowerArmRight = new ModelRenderer(this, 21, 13);
            this.LowerArmRight.setPos(0.0F, 2.0F, 0.5F);
            this.LowerArmRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 1.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(LowerArmRight, -0.23457224414434488F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 12, 13);
            this.FootRight.setPos(0.0F, 2.5F, 0.0F);
            this.FootRight.addBox(-1.0F, -0.1F, -1.7F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, 0.11728612207217244F, 0.0F, 0.0F);
            this.VontsiraTail2 = new ModelRenderer(this, 48, 11);
            this.VontsiraTail2.setPos(0.0F, 0.0F, 3.0F);
            this.VontsiraTail2.addBox(-1.5F, -0.5F, 0.0F, 3.0F, 3.0F, 5.0F, 0.1F, 0.1F, 0.0F);
            this.setRotateAngle(VontsiraTail2, 0.19547687289441354F, 0.0F, 0.0F);
            this.LowerArmLeft = new ModelRenderer(this, 21, 13);
            this.LowerArmLeft.mirror = true;
            this.LowerArmLeft.setPos(0.0F, 2.0F, 0.5F);
            this.LowerArmLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 1.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(LowerArmLeft, -0.23457224414434488F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 23);
            this.Body.setPos(0.0F, 18.2F, -3.0F);
            this.Body.addBox(-2.0F, -1.5F, -2.5F, 4.0F, 4.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.03909537541112055F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 30, 0);
            this.EarRight.setPos(-1.5F, -0.1F, 0.0F);
            this.EarRight.addBox(0.0F, -1.5F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, -0.2F, 0.0F);
            this.setRotateAngle(EarRight, 0.2340486500292785F, -0.9773843811168246F, 0.0F);
            this.LowerLegLeft = new ModelRenderer(this, 10, 9);
            this.LowerLegLeft.mirror = true;
            this.LowerLegLeft.setPos(0.0F, 0.5F, 2.0F);
            this.LowerLegLeft.addBox(-1.0F, 0.0F, -0.5F, 2.0F, 3.0F, 1.0F, -0.02F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.6646214111173737F, 0.0F, 0.0F);
            this.LowerLegRight = new ModelRenderer(this, 10, 9);
            this.LowerLegRight.setPos(0.0F, 0.5F, 2.0F);
            this.LowerLegRight.addBox(-1.0F, 0.0F, -0.5F, 2.0F, 3.0F, 1.0F, -0.02F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.6646214111173737F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 41, 0);
            this.Snout.setPos(0.0F, 0.2F, -1.4F);
            this.Snout.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, -0.1F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 18, 0);
            this.Neck.setPos(0.0F, -1.0F, -2.5F);
            this.Neck.addBox(-1.5F, -1.0F, -2.0F, 3.0F, 3.0F, 4.0F, -0.01F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.7428121536172364F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 20, 16);
            this.HandRight.setPos(0.0F, 2.0F, 0.0F);
            this.HandRight.addBox(-1.0F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.19547687289441354F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 9, 6);
            this.UpperLegRight.setPos(0.0F, 3.0F, -1.0F);
            this.UpperLegRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, -0.01F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.5082398928281348F, 0.0F, 0.0F);
            this.Tail4 = new ModelRenderer(this, 26, 25);
            this.Tail4.setPos(0.0F, 0.5F, 3.1F);
            this.Tail4.addBox(-0.5F, -0.5F, 0.0F, 1.0F, 2.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail4, 0.27366763203903305F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 32, 0);
            this.Head.setPos(0.0F, 0.65F, -1.5F);
            this.Head.addBox(-1.5F, -1.5F, -2.0F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.8210028961170991F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 34, 12);
            this.Tail2.setPos(0.0F, 0.0F, 3.0F);
            this.Tail2.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 5.0F, 0.0F, 0.2F, 0.0F);
            this.setRotateAngle(Tail2, 0.19547687289441354F, 0.0F, 0.0F);
            this.UpperArmRight = new ModelRenderer(this, 20, 9);
            this.UpperArmRight.setPos(-1.2F, 1.5F, -0.9F);
            this.UpperArmRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 9, 6);
            this.UpperLegLeft.mirror = true;
            this.UpperLegLeft.setPos(0.0F, 3.0F, -1.0F);
            this.UpperLegLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, -0.01F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.5082398928281348F, 0.0F, 0.0F);
            this.VontsiraTail3 = new ModelRenderer(this, 50, 19);
            this.VontsiraTail3.setPos(0.0F, -0.1F, 4.8F);
            this.VontsiraTail3.addBox(-1.5F, -0.5F, -0.5F, 3.0F, 3.0F, 4.0F, 0.2F, 0.2F, 0.0F);
            this.setRotateAngle(VontsiraTail3, 0.23474678106428595F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 12, 13);
            this.FootLeft.mirror = true;
            this.FootLeft.setPos(0.0F, 2.5F, 0.0F);
            this.FootLeft.addBox(-1.0F, -0.1F, -1.7F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 0.11728612207217244F, 0.0F, 0.0F);
            this.UpperArmLeft = new ModelRenderer(this, 20, 9);
            this.UpperArmLeft.mirror = true;
            this.UpperArmLeft.setPos(1.2F, 1.5F, -0.9F);
            this.UpperArmLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Hips.addChild(this.Tail1);
            this.Head.addChild(this.Mouth);
            this.Body.addChild(this.Hips);
            this.Head.addChild(this.EarLeft);
            this.LowerArmLeft.addChild(this.HandLeft);
            this.Hips.addChild(this.ThighRight);
            this.Hips.addChild(this.ThighLeft);
            this.Snout.addChild(this.Nose);
            this.Tail2.addChild(this.Tail3);
            this.UpperArmRight.addChild(this.LowerArmRight);
            this.LowerLegRight.addChild(this.FootRight);
            this.Tail1.addChild(this.VontsiraTail2);
            this.UpperArmLeft.addChild(this.LowerArmLeft);
            this.Head.addChild(this.EarRight);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.Head.addChild(this.Snout);
            this.Body.addChild(this.Neck);
            this.LowerArmRight.addChild(this.HandRight);
            this.ThighRight.addChild(this.UpperLegRight);
            this.Tail3.addChild(this.Tail4);
            this.Neck.addChild(this.Head);
            this.Tail1.addChild(this.Tail2);
            this.Body.addChild(this.UpperArmRight);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.VontsiraTail2.addChild(this.VontsiraTail3);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.Body.addChild(this.UpperArmLeft);
            this.saveBase();
        }

        @Override
        public void setupAnim(MongooseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);

        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            }

        }
    }


    public static class Child extends MongooseModel {

        public ModelRenderer Neck;
        public ModelRenderer Hips;
        public ModelRenderer UpperArmLeft;
        public ModelRenderer UpperArmRight;
        public ModelRenderer Head;
        public ModelRenderer EarRight;
        public ModelRenderer Snout;
        public ModelRenderer Mouth;
        public ModelRenderer EarLeft;
        public ModelRenderer Nose;
        public ModelRenderer Tail1;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer Tail2;
        public ModelRenderer VontsiraTail2;
        public ModelRenderer Tail3;
        public ModelRenderer Tail4;
        public ModelRenderer VontsiraTail3;
        public ModelRenderer UpperLegLeft;
        public ModelRenderer LowerLegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer UpperLegRight;
        public ModelRenderer LowerLegRight;
        public ModelRenderer FootRight;
        public ModelRenderer LowerArmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer LowerArmRight;
        public ModelRenderer HandRight;

        public Child() {
            this.texWidth = 64;
            this.texHeight = 32;
            this.Tail1 = new ModelRenderer(this, 50, 4);
            this.Tail1.setPos(0.0F, 0.2F, 4.0F);
            this.Tail1.addBox(-1.5F, -0.5F, -0.5F, 3.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -0.3909537457888271F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 49, 0);
            this.Mouth.setPos(0.0F, 1.0F, -1.4F);
            this.Mouth.addBox(-0.5F, -0.5F, -1.9F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.03909537541112055F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 15);
            this.Hips.setPos(0.0F, -1.0F, 2.5F);
            this.Hips.addBox(-2.0F, -0.5F, -0.3F, 4.0F, 4.0F, 4.0F, 0.01F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.1563815016444822F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 30, 0);
            this.EarLeft.mirror = true;
            this.EarLeft.setPos(1.5F, -0.1F, 0.0F);
            this.EarLeft.addBox(-1.0F, -1.5F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, -0.2F, 0.0F);
            this.setRotateAngle(EarLeft, 0.2340486500292785F, 0.9773843811168246F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 20, 16);
            this.HandLeft.mirror = true;
            this.HandLeft.setPos(0.0F, 2.0F, 0.0F);
            this.HandLeft.addBox(-1.0F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.19547687289441354F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 8, 0);
            this.ThighRight.setPos(-1.2F, 1.0F, 2.5F);
            this.ThighRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.1563815016444822F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 8, 0);
            this.ThighLeft.mirror = true;
            this.ThighLeft.setPos(1.2F, 1.0F, 2.5F);
            this.ThighLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.1563815016444822F, 0.0F, 0.0F);
            this.Nose = new ModelRenderer(this, 43, 3);
            this.Nose.setPos(0.0F, -0.2F, 0.0F);
            this.Nose.addBox(-0.5F, -0.9F, -2.2F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Nose, 0.35185837453889574F, 0.0F, 0.0F);
            this.Tail3 = new ModelRenderer(this, 32, 19);
            this.Tail3.setPos(0.0F, -0.1F, 5.0F);
            this.Tail3.addBox(-1.0F, 0.0F, -0.5F, 2.0F, 2.0F, 4.0F, -0.1F, 0.1F, 0.0F);
            this.setRotateAngle(Tail3, 0.23474678106428595F, 0.0F, 0.0F);
            this.LowerArmRight = new ModelRenderer(this, 21, 13);
            this.LowerArmRight.setPos(0.0F, 2.0F, 0.5F);
            this.LowerArmRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 1.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(LowerArmRight, -0.23457224414434488F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 12, 13);
            this.FootRight.setPos(0.0F, 2.5F, 0.0F);
            this.FootRight.addBox(-1.0F, -0.1F, -1.7F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, 0.11728612207217244F, 0.0F, 0.0F);
            this.VontsiraTail2 = new ModelRenderer(this, 48, 11);
            this.VontsiraTail2.setPos(0.0F, 0.0F, 3.0F);
            this.VontsiraTail2.addBox(-1.5F, -0.5F, 0.0F, 3.0F, 3.0F, 5.0F, 0.1F, 0.1F, 0.0F);
            this.setRotateAngle(VontsiraTail2, 0.19547687289441354F, 0.0F, 0.0F);
            this.LowerArmLeft = new ModelRenderer(this, 21, 13);
            this.LowerArmLeft.mirror = true;
            this.LowerArmLeft.setPos(0.0F, 2.0F, 0.5F);
            this.LowerArmLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 1.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(LowerArmLeft, -0.23457224414434488F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 23);
            this.Body.setPos(0.0F, 18.2F, -3.0F);
            this.Body.addBox(-2.0F, -1.5F, -2.5F, 4.0F, 4.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.03909537541112055F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 30, 0);
            this.EarRight.setPos(-1.5F, -0.1F, 0.0F);
            this.EarRight.addBox(0.0F, -1.5F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, -0.2F, 0.0F);
            this.setRotateAngle(EarRight, 0.2340486500292785F, -0.9773843811168246F, 0.0F);
            this.LowerLegLeft = new ModelRenderer(this, 10, 9);
            this.LowerLegLeft.mirror = true;
            this.LowerLegLeft.setPos(0.0F, 0.5F, 2.0F);
            this.LowerLegLeft.addBox(-1.0F, 0.0F, -0.5F, 2.0F, 3.0F, 1.0F, -0.02F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.6646214111173737F, 0.0F, 0.0F);
            this.LowerLegRight = new ModelRenderer(this, 10, 9);
            this.LowerLegRight.setPos(0.0F, 0.5F, 2.0F);
            this.LowerLegRight.addBox(-1.0F, 0.0F, -0.5F, 2.0F, 3.0F, 1.0F, -0.02F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.6646214111173737F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 41, 0);
            this.Snout.setPos(0.0F, 0.2F, -1.4F);
            this.Snout.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, -0.1F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 18, 0);
            this.Neck.setPos(0.0F, -1.0F, -2.5F);
            this.Neck.addBox(-1.5F, -1.0F, -2.0F, 3.0F, 3.0F, 4.0F, -0.01F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.7428121536172364F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 20, 16);
            this.HandRight.setPos(0.0F, 2.0F, 0.0F);
            this.HandRight.addBox(-1.0F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.19547687289441354F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 9, 6);
            this.UpperLegRight.setPos(0.0F, 3.0F, -1.0F);
            this.UpperLegRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, -0.01F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.5082398928281348F, 0.0F, 0.0F);
            this.Tail4 = new ModelRenderer(this, 26, 25);
            this.Tail4.setPos(0.0F, 0.5F, 3.1F);
            this.Tail4.addBox(-0.5F, -0.5F, 0.0F, 1.0F, 2.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail4, 0.27366763203903305F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 32, 0);
            this.Head.setPos(0.0F, 0.65F, -1.5F);
            this.Head.addBox(-1.5F, -1.5F, -2.0F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.8210028961170991F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 34, 12);
            this.Tail2.setPos(0.0F, 0.0F, 3.0F);
            this.Tail2.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 5.0F, 0.0F, 0.2F, 0.0F);
            this.setRotateAngle(Tail2, 0.19547687289441354F, 0.0F, 0.0F);
            this.UpperArmRight = new ModelRenderer(this, 20, 9);
            this.UpperArmRight.setPos(-1.2F, 1.5F, -0.9F);
            this.UpperArmRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 9, 6);
            this.UpperLegLeft.mirror = true;
            this.UpperLegLeft.setPos(0.0F, 3.0F, -1.0F);
            this.UpperLegLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, -0.01F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.5082398928281348F, 0.0F, 0.0F);
            this.VontsiraTail3 = new ModelRenderer(this, 50, 19);
            this.VontsiraTail3.setPos(0.0F, -0.1F, 4.8F);
            this.VontsiraTail3.addBox(-1.5F, -0.5F, -0.5F, 3.0F, 3.0F, 4.0F, 0.2F, 0.2F, 0.0F);
            this.setRotateAngle(VontsiraTail3, 0.23474678106428595F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 12, 13);
            this.FootLeft.mirror = true;
            this.FootLeft.setPos(0.0F, 2.5F, 0.0F);
            this.FootLeft.addBox(-1.0F, -0.1F, -1.7F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 0.11728612207217244F, 0.0F, 0.0F);
            this.UpperArmLeft = new ModelRenderer(this, 20, 9);
            this.UpperArmLeft.mirror = true;
            this.UpperArmLeft.setPos(1.2F, 1.5F, -0.9F);
            this.UpperArmLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Hips.addChild(this.Tail1);
            this.Head.addChild(this.Mouth);
            this.Body.addChild(this.Hips);
            this.Head.addChild(this.EarLeft);
            this.LowerArmLeft.addChild(this.HandLeft);
            this.Hips.addChild(this.ThighRight);
            this.Hips.addChild(this.ThighLeft);
            this.Snout.addChild(this.Nose);
            this.Tail2.addChild(this.Tail3);
            this.UpperArmRight.addChild(this.LowerArmRight);
            this.LowerLegRight.addChild(this.FootRight);
            this.Tail1.addChild(this.VontsiraTail2);
            this.UpperArmLeft.addChild(this.LowerArmLeft);
            this.Head.addChild(this.EarRight);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.Head.addChild(this.Snout);
            this.Body.addChild(this.Neck);
            this.LowerArmRight.addChild(this.HandRight);
            this.ThighRight.addChild(this.UpperLegRight);
            this.Tail3.addChild(this.Tail4);
            this.Neck.addChild(this.Head);
            this.Tail1.addChild(this.Tail2);
            this.Body.addChild(this.UpperArmRight);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.VontsiraTail2.addChild(this.VontsiraTail3);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.Body.addChild(this.UpperArmLeft);
            this.saveBase();

        }

        @Override
        public void setupAnim(MongooseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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
