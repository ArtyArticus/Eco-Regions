package com.github.artyarticus.ecoregions.client.model;

import com.github.artyarticus.ecoregions.entity.MongooseEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
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
            this.HandLeft = new ModelRenderer(this, 20, 16);
            this.HandLeft.mirror = true;
            this.HandLeft.setPos(0.0F, 2.0F, 0.0F);
            this.HandLeft.addBox(-1.0F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.19547687289441354F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 41, 0);
            this.Snout.setPos(0.0F, 0.2F, -1.4F);
            this.Snout.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.VontsiraTail2 = new ModelRenderer(this, 48, 11);
            this.VontsiraTail2.setPos(-0.01F, 0.0F, 3.0F);
            this.VontsiraTail2.addBox(-1.5F, -0.5F, 0.0F, 3.0F, 3.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(VontsiraTail2, 0.19547687289441354F, 0.0F, 0.0F);
            this.LowerLegLeft = new ModelRenderer(this, 10, 9);
            this.LowerLegLeft.mirror = true;
            this.LowerLegLeft.setPos(-0.02F, 0.5F, 2.0F);
            this.LowerLegLeft.addBox(-1.0F, 0.0F, -0.5F, 2.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.6646214111173737F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 12, 13);
            this.FootLeft.mirror = true;
            this.FootLeft.setPos(0.01F, 2.5F, 0.0F);
            this.FootLeft.addBox(-1.0F, -0.1F, -1.7F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 0.11728612207217244F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 32, 0);
            this.Head.setPos(0.0F, 0.65F, -1.5F);
            this.Head.addBox(-1.5F, -1.5F, -2.0F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.8210028961170991F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 9, 6);
            this.UpperLegRight.setPos(0.01F, 3.0F, -1.0F);
            this.UpperLegRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.5082398928281348F, 0.0F, 0.0F);
            this.LowerArmRight = new ModelRenderer(this, 21, 13);
            this.LowerArmRight.setPos(0.01F, 2.0F, 0.5F);
            this.LowerArmRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerArmRight, -0.23457224414434488F, 0.0F, 0.0F);
            this.Tail4 = new ModelRenderer(this, 23, 25);
            this.Tail4.setPos(0.0F, 0.5F, 3.1F);
            this.Tail4.addBox(-0.5F, -0.5F, 0.0F, 1.0F, 2.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail4, 0.27366763203903305F, 0.0F, 0.0F);
            this.UpperArmLeft = new ModelRenderer(this, 20, 9);
            this.UpperArmLeft.mirror = true;
            this.UpperArmLeft.setPos(1.2F, 1.5F, -0.9F);
            this.UpperArmLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 8, 0);
            this.ThighRight.setPos(-1.2F, 1.0F, 2.5F);
            this.ThighRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.1563815016444822F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 50, 4);
            this.Tail1.setPos(0.0F, 0.2F, 4.0F);
            this.Tail1.addBox(-1.5F, -0.5F, -0.5F, 3.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -0.3909537457888271F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 30, 0);
            this.EarRight.setPos(-1.5F, -0.1F, 0.0F);
            this.EarRight.addBox(0.0F, -1.5F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.2340486500292785F, -0.9773843811168246F, 0.0F);
            this.Nose = new ModelRenderer(this, 43, 3);
            this.Nose.setPos(0.0F, -0.2F, 0.0F);
            this.Nose.addBox(-0.5F, -0.9F, -2.2F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Nose, 0.35185837453889574F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 49, 0);
            this.Mouth.setPos(0.0F, 1.0F, -1.4F);
            this.Mouth.addBox(-0.5F, -0.5F, -1.9F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.03909537541112055F, 0.0F, 0.0F);
            this.VontsiraTail3 = new ModelRenderer(this, 50, 19);
            this.VontsiraTail3.setPos(-0.01F, -0.1F, 4.8F);
            this.VontsiraTail3.addBox(-1.5F, -0.5F, -0.5F, 3.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(VontsiraTail3, 0.23474678106428595F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 12, 13);
            this.FootRight.setPos(-0.01F, 2.5F, 0.0F);
            this.FootRight.addBox(-1.0F, -0.1F, -1.7F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, 0.11728612207217244F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 15);
            this.Hips.setPos(0.01F, -1.0F, 2.5F);
            this.Hips.addBox(-2.0F, -0.5F, -0.3F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.1563815016444822F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 8, 0);
            this.ThighLeft.mirror = true;
            this.ThighLeft.setPos(1.2F, 1.0F, 2.5F);
            this.ThighLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.1563815016444822F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 19, 0);
            this.Neck.setPos(0.0F, -1.0F, -2.5F);
            this.Neck.addBox(-1.0F, -1.0F, -2.0F, 2.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.7428121536172364F, 0.0F, 0.0F);
            this.Tail3 = new ModelRenderer(this, 32, 19);
            this.Tail3.setPos(0.0F, -0.1F, 5.0F);
            this.Tail3.addBox(-1.0F, 0.0F, -0.5F, 2.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail3, 0.23474678106428595F, 0.0F, 0.0F);
            this.LowerLegRight = new ModelRenderer(this, 10, 9);
            this.LowerLegRight.setPos(0.02F, 0.5F, 2.0F);
            this.LowerLegRight.addBox(-1.0F, 0.0F, -0.5F, 2.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.6646214111173737F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 9, 6);
            this.UpperLegLeft.mirror = true;
            this.UpperLegLeft.setPos(-0.01F, 3.0F, -1.0F);
            this.UpperLegLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.5082398928281348F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 23);
            this.Body.setPos(0.0F, 18.2F, -3.0F);
            this.Body.addBox(-2.0F, -1.5F, -2.5F, 4.0F, 4.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.03909537541112055F, 0.0F, 0.0F);
            this.UpperArmRight = new ModelRenderer(this, 20, 9);
            this.UpperArmRight.setPos(-1.2F, 1.5F, -0.9F);
            this.UpperArmRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 30, 0);
            this.EarLeft.mirror = true;
            this.EarLeft.setPos(1.5F, -0.1F, 0.0F);
            this.EarLeft.addBox(-1.0F, -1.5F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.2340486500292785F, 0.9773843811168246F, 0.0F);
            this.HandRight = new ModelRenderer(this, 20, 16);
            this.HandRight.setPos(0.0F, 2.0F, 0.0F);
            this.HandRight.addBox(-1.0F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.19547687289441354F, 0.0F, 0.0F);
            this.LowerArmLeft = new ModelRenderer(this, 21, 13);
            this.LowerArmLeft.mirror = true;
            this.LowerArmLeft.setPos(-0.01F, 2.0F, 0.5F);
            this.LowerArmLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerArmLeft, -0.23457224414434488F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 34, 12);
            this.Tail2.setPos(0.0F, 0.0F, 3.0F);
            this.Tail2.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, 0.19547687289441354F, 0.0F, 0.0F);
            this.LowerArmLeft.addChild(this.HandLeft);
            this.Head.addChild(this.Snout);
            this.Tail1.addChild(this.VontsiraTail2);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.Neck.addChild(this.Head);
            this.ThighRight.addChild(this.UpperLegRight);
            this.UpperArmRight.addChild(this.LowerArmRight);
            this.Tail3.addChild(this.Tail4);
            this.Body.addChild(this.UpperArmLeft);
            this.Hips.addChild(this.ThighRight);
            this.Hips.addChild(this.Tail1);
            this.Head.addChild(this.EarRight);
            this.Snout.addChild(this.Nose);
            this.Head.addChild(this.Mouth);
            this.VontsiraTail2.addChild(this.VontsiraTail3);
            this.LowerLegRight.addChild(this.FootRight);
            this.Body.addChild(this.Hips);
            this.Hips.addChild(this.ThighLeft);
            this.Body.addChild(this.Neck);
            this.Tail2.addChild(this.Tail3);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.Body.addChild(this.UpperArmRight);
            this.Head.addChild(this.EarLeft);
            this.LowerArmRight.addChild(this.HandRight);
            this.UpperArmLeft.addChild(this.LowerArmLeft);
            this.Tail1.addChild(this.Tail2); this.HandLeft = new ModelRenderer(this, 20, 16);
            this.HandLeft.mirror = true;
            this.HandLeft.setPos(0.0F, 2.0F, 0.0F);
            this.HandLeft.addBox(-1.0F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.19547687289441354F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 41, 0);
            this.Snout.setPos(0.0F, 0.2F, -1.4F);
            this.Snout.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.VontsiraTail2 = new ModelRenderer(this, 48, 11);
            this.VontsiraTail2.setPos(-0.01F, 0.0F, 3.0F);
            this.VontsiraTail2.addBox(-1.5F, -0.5F, 0.0F, 3.0F, 3.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(VontsiraTail2, 0.19547687289441354F, 0.0F, 0.0F);
            this.LowerLegLeft = new ModelRenderer(this, 10, 9);
            this.LowerLegLeft.mirror = true;
            this.LowerLegLeft.setPos(-0.02F, 0.5F, 2.0F);
            this.LowerLegLeft.addBox(-1.0F, 0.0F, -0.5F, 2.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.6646214111173737F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 12, 13);
            this.FootLeft.mirror = true;
            this.FootLeft.setPos(0.01F, 2.5F, 0.0F);
            this.FootLeft.addBox(-1.0F, -0.1F, -1.7F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 0.11728612207217244F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 32, 0);
            this.Head.setPos(0.0F, 0.65F, -1.5F);
            this.Head.addBox(-1.5F, -1.5F, -2.0F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.8210028961170991F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 9, 6);
            this.UpperLegRight.setPos(0.01F, 3.0F, -1.0F);
            this.UpperLegRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.5082398928281348F, 0.0F, 0.0F);
            this.LowerArmRight = new ModelRenderer(this, 21, 13);
            this.LowerArmRight.setPos(0.01F, 2.0F, 0.5F);
            this.LowerArmRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerArmRight, -0.23457224414434488F, 0.0F, 0.0F);
            this.Tail4 = new ModelRenderer(this, 23, 25);
            this.Tail4.setPos(0.0F, 0.5F, 3.1F);
            this.Tail4.addBox(-0.5F, -0.5F, 0.0F, 1.0F, 2.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail4, 0.27366763203903305F, 0.0F, 0.0F);
            this.UpperArmLeft = new ModelRenderer(this, 20, 9);
            this.UpperArmLeft.mirror = true;
            this.UpperArmLeft.setPos(1.2F, 1.5F, -0.9F);
            this.UpperArmLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 8, 0);
            this.ThighRight.setPos(-1.2F, 1.0F, 2.5F);
            this.ThighRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.1563815016444822F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 50, 4);
            this.Tail1.setPos(0.0F, 0.2F, 4.0F);
            this.Tail1.addBox(-1.5F, -0.5F, -0.5F, 3.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -0.3909537457888271F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 30, 0);
            this.EarRight.setPos(-1.5F, -0.1F, 0.0F);
            this.EarRight.addBox(0.0F, -1.5F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.2340486500292785F, -0.9773843811168246F, 0.0F);
            this.Nose = new ModelRenderer(this, 43, 3);
            this.Nose.setPos(0.0F, -0.2F, 0.0F);
            this.Nose.addBox(-0.5F, -0.9F, -2.2F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Nose, 0.35185837453889574F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 49, 0);
            this.Mouth.setPos(0.0F, 1.0F, -1.4F);
            this.Mouth.addBox(-0.5F, -0.5F, -1.9F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.03909537541112055F, 0.0F, 0.0F);
            this.VontsiraTail3 = new ModelRenderer(this, 50, 19);
            this.VontsiraTail3.setPos(-0.01F, -0.1F, 4.8F);
            this.VontsiraTail3.addBox(-1.5F, -0.5F, -0.5F, 3.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(VontsiraTail3, 0.23474678106428595F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 12, 13);
            this.FootRight.setPos(-0.01F, 2.5F, 0.0F);
            this.FootRight.addBox(-1.0F, -0.1F, -1.7F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, 0.11728612207217244F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 15);
            this.Hips.setPos(0.01F, -1.0F, 2.5F);
            this.Hips.addBox(-2.0F, -0.5F, -0.3F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.1563815016444822F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 8, 0);
            this.ThighLeft.mirror = true;
            this.ThighLeft.setPos(1.2F, 1.0F, 2.5F);
            this.ThighLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.1563815016444822F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 19, 0);
            this.Neck.setPos(0.0F, -1.0F, -2.5F);
            this.Neck.addBox(-1.0F, -1.0F, -2.0F, 2.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.7428121536172364F, 0.0F, 0.0F);
            this.Tail3 = new ModelRenderer(this, 32, 19);
            this.Tail3.setPos(0.0F, -0.1F, 5.0F);
            this.Tail3.addBox(-1.0F, 0.0F, -0.5F, 2.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail3, 0.23474678106428595F, 0.0F, 0.0F);
            this.LowerLegRight = new ModelRenderer(this, 10, 9);
            this.LowerLegRight.setPos(0.02F, 0.5F, 2.0F);
            this.LowerLegRight.addBox(-1.0F, 0.0F, -0.5F, 2.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.6646214111173737F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 9, 6);
            this.UpperLegLeft.mirror = true;
            this.UpperLegLeft.setPos(-0.01F, 3.0F, -1.0F);
            this.UpperLegLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.5082398928281348F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 23);
            this.Body.setPos(0.0F, 18.2F, -3.0F);
            this.Body.addBox(-2.0F, -1.5F, -2.5F, 4.0F, 4.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.03909537541112055F, 0.0F, 0.0F);
            this.UpperArmRight = new ModelRenderer(this, 20, 9);
            this.UpperArmRight.setPos(-1.2F, 1.5F, -0.9F);
            this.UpperArmRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 30, 0);
            this.EarLeft.mirror = true;
            this.EarLeft.setPos(1.5F, -0.1F, 0.0F);
            this.EarLeft.addBox(-1.0F, -1.5F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.2340486500292785F, 0.9773843811168246F, 0.0F);
            this.HandRight = new ModelRenderer(this, 20, 16);
            this.HandRight.setPos(0.0F, 2.0F, 0.0F);
            this.HandRight.addBox(-1.0F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.19547687289441354F, 0.0F, 0.0F);
            this.LowerArmLeft = new ModelRenderer(this, 21, 13);
            this.LowerArmLeft.mirror = true;
            this.LowerArmLeft.setPos(-0.01F, 2.0F, 0.5F);
            this.LowerArmLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerArmLeft, -0.23457224414434488F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 34, 12);
            this.Tail2.setPos(0.0F, 0.0F, 3.0F);
            this.Tail2.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, 0.19547687289441354F, 0.0F, 0.0F);
            this.LowerArmLeft.addChild(this.HandLeft);
            this.Head.addChild(this.Snout);
            this.Tail1.addChild(this.VontsiraTail2);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.Neck.addChild(this.Head);
            this.ThighRight.addChild(this.UpperLegRight);
            this.UpperArmRight.addChild(this.LowerArmRight);
            this.Tail3.addChild(this.Tail4);
            this.Body.addChild(this.UpperArmLeft);
            this.Hips.addChild(this.ThighRight);
            this.Hips.addChild(this.Tail1);
            this.Head.addChild(this.EarRight);
            this.Snout.addChild(this.Nose);
            this.Head.addChild(this.Mouth);
            this.VontsiraTail2.addChild(this.VontsiraTail3);
            this.LowerLegRight.addChild(this.FootRight);
            this.Body.addChild(this.Hips);
            this.Hips.addChild(this.ThighLeft);
            this.Body.addChild(this.Neck);
            this.Tail2.addChild(this.Tail3);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.Body.addChild(this.UpperArmRight);
            this.Head.addChild(this.EarLeft);
            this.LowerArmRight.addChild(this.HandRight);
            this.UpperArmLeft.addChild(this.LowerArmLeft);
            this.Tail1.addChild(this.Tail2);
            this.saveBase();
        }

        @Override
        public void setupAnim(MongooseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
            this.Head.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
        }

        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 1.0F;
            float degree = 1.0F;
            this.Neck.xRot = MathHelper.cos(limbSwing * speed * 0.1F) * degree * 0.1F * limbSwingAmount - 0.742F;
            this.Head.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount + 0.821F;
            this.Tail1.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount - 0.4F;
            this.Tail2.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount + 0.195F;
            this.VontsiraTail2.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount + 0.195F;
            this.VontsiraTail3.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount + 0.234F;
        }

        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 1.5F;
            float degree = 0.5F;
            if (entity.isSprinting()) {
                this.UpperArmRight.xRot = MathHelper.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * 5.0F * limbSwingAmount * 0.5F;
                this.LowerArmRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F - 0.234F;
                this.HandRight.xRot = MathHelper.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.195F;
                this.UpperArmLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 5.0F * limbSwingAmount * 0.5F;
                this.LowerArmLeft.xRot = MathHelper.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F + -0.234F;
                this.HandLeft.xRot = MathHelper.cos(7.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.195F;

                this.ThighLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 3.0F * limbSwingAmount * 0.5F + 0.156F;
                this.UpperLegLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.5F;
                this.ThighRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 3.0F * limbSwingAmount * 0.5F + 0.156F;
                this.UpperLegRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.5F;

                this.Hips.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -0.6F * limbSwingAmount * 0.5F - 0.156F;
                this.Body.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 0.6F * limbSwingAmount * 0.5F + 0.039F;
                this.Neck.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -0.6F * limbSwingAmount * 0.5F - 0.742F;

                this.Tail1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F - 0.4F;
                this.Tail2.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 3.0F * limbSwingAmount * 0.5F + 0.195F;
                this.VontsiraTail2.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.195F;
                this.VontsiraTail3.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 3.0F * limbSwingAmount * 0.5F + 0.234F;

                this.Body.y = MathHelper.cos(2.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 0.5F * limbSwingAmount * 0.5F + -0.02F + 18.2F;

            } else {
                this.UpperArmLeft.xRot = MathHelper.cos(1.5F + limbSwing * speed * 0.2F) * degree * 1.5F * limbSwingAmount + 0.0F;
                this.LowerArmLeft.xRot = MathHelper.cos(5.5F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount - 0.234F;
                this.HandLeft.xRot = MathHelper.cos(1.5F + limbSwing * speed * 0.2F) * degree * -1.5F * limbSwingAmount + 0.195F;
                this.UpperArmRight.xRot = MathHelper.cos(1.5F + limbSwing * speed * 0.2F) * degree * -1.5F * limbSwingAmount + 0.0F;
                this.LowerArmRight.xRot = MathHelper.cos(5.5F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount - 0.234F;
                this.HandRight.xRot = MathHelper.cos(1.5F + limbSwing * speed * 0.2F) * degree * 1.5F * limbSwingAmount + 0.195F;

                this.ThighLeft.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * 1.5F * limbSwingAmount + 0.156F;
                this.UpperLegLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * degree * 1.5F * limbSwingAmount + 0.5F;
                this.FootLeft.xRot = MathHelper.cos(-5.0F + limbSwing * speed * 0.2F) * degree * 0.5F * limbSwingAmount + 0.117F;
                this.ThighRight.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * -1.5F * limbSwingAmount + 0.156F;
                this.UpperLegRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * degree * -1.5F * limbSwingAmount + 0.5F;
                this.FootRight.xRot = MathHelper.cos(-5.0F + limbSwing * speed * 0.2F) * degree * -0.5F * limbSwingAmount + 0.117F;

                this.Hips.xRot = MathHelper.cos(1.5F + limbSwing * speed * 0.4F) * degree * -0.2F * limbSwingAmount - 0.156F;
                this.Body.xRot = MathHelper.cos(1.5F + limbSwing * speed * 0.4F) * degree * 0.2F * limbSwingAmount + 0.039F;
                this.Neck.xRot = MathHelper.cos(limbSwing * speed * 0.4F) * degree * -0.1F * limbSwingAmount - 0.742F;
                this.Head.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.4F) * degree * -0.1F * limbSwingAmount + 0.821F;

                this.Tail2.xRot = MathHelper.cos(limbSwing * speed * 0.4F) * degree * -0.2F * limbSwingAmount + 0.195F;
                this.VontsiraTail2.xRot = MathHelper.cos(limbSwing * speed * 0.4F) * degree * -0.2F * limbSwingAmount + 0.195F;

                this.ThighLeft.y = MathHelper.cos(-2.5F + limbSwing * speed * 0.2F) * degree * 0.1F * limbSwingAmount + 1.0F;
                this.ThighRight.y = MathHelper.cos(-2.5F + limbSwing * speed * 0.2F) * degree * -0.1F * limbSwingAmount + 1.0F;
            }
        }
    }


    public static class Child extends MongooseModel {

        public ModelRenderer Neck;
        public ModelRenderer Hip;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer Head;
        public ModelRenderer EarLeft;
        public ModelRenderer Snout;
        public ModelRenderer EarRight;
        public ModelRenderer Nose;
        public ModelRenderer Mouth;
        public ModelRenderer ThighLeft;
        public ModelRenderer Tail1;
        public ModelRenderer ThighRight;
        public ModelRenderer UpperLegLeft;
        public ModelRenderer LegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer Tail2;
        public ModelRenderer VontsiraTail2;
        public ModelRenderer Tail3;
        public ModelRenderer Tail4;
        public ModelRenderer VontsiraTail3;
        public ModelRenderer UpperLegRight;
        public ModelRenderer LegRight;
        public ModelRenderer FootRight;
        public ModelRenderer ArmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer ArmRight;
        public ModelRenderer HandRight;

        public Child() {
            this.texWidth = 32;
            this.texHeight = 16;
            this.Snout = new ModelRenderer(this, 9, 6);
            this.Snout.setPos(0.0F, 0.2F, -0.5F);
            this.Snout.addBox(-1.0F, 0.0F, -1.8F, 2.0F, 1.0F, 1.0F, -0.1F, 0.0F, 0.2F);
            this.setRotateAngle(Snout, -0.07452555872726274F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 0, 12);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-0.8F, 1.1F, 1.4F);
            this.ThighRight.addBox(-1.0F, -0.3F, -1.0F, 2.0F, 2.0F, 2.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.03909537541112055F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 12, 14);
            this.FootRight.mirror = true;
            this.FootRight.setPos(-0.01F, 1.7F, -0.5F);
            this.FootRight.addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, 0.02F, -0.1F, 0.1F);
            this.setRotateAngle(FootRight, 0.19547687289441354F, 0.0F, 0.0F);
            this.Tail3 = new ModelRenderer(this, 26, 4);
            this.Tail3.setPos(0.0F, 0.0F, 2.0F);
            this.Tail3.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 2.0F, -0.1F, 0.1F, 0.0F);
            this.setRotateAngle(Tail3, 0.23474678106428595F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 5);
            this.Body.setPos(0.0F, 20.6F, 0.0F);
            this.Body.addBox(-1.5F, -1.5F, -1.3F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.04555309164612875F, 0.0F, 0.0F);
            this.Nose = new ModelRenderer(this, 19, 3);
            this.Nose.setPos(0.0F, -0.2F, 0.1F);
            this.Nose.addBox(-0.5F, -0.9F, -2.2F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Nose, 0.35185837453889574F, 0.0F, 0.0F);
            this.VontsiraTail3 = new ModelRenderer(this, 24, 12);
            this.VontsiraTail3.setPos(0.0F, -0.6F, 1.8F);
            this.VontsiraTail3.addBox(-1.0F, 0.0F, -0.5F, 2.0F, 2.0F, 2.0F, 0.1F, 0.1F, 0.0F);
            this.setRotateAngle(VontsiraTail3, 0.23474678106428595F, 0.0F, 0.0F);
            this.Tail4 = new ModelRenderer(this, 24, 8);
            this.Tail4.setPos(0.0F, 0.5F, 1.0F);
            this.Tail4.addBox(-0.5F, -0.4F, 0.0F, 1.0F, 1.0F, 3.0F, -0.2F, 0.0F, 0.0F);
            this.setRotateAngle(Tail4, 0.27366763203903305F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 12, 14);
            this.FootLeft.setPos(-0.01F, 1.7F, -0.5F);
            this.FootLeft.addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, 0.02F, -0.1F, 0.1F);
            this.setRotateAngle(FootLeft, 0.19547687289441354F, 0.0F, 0.0F);
            this.Hip = new ModelRenderer(this, 0, 0);
            this.Hip.setPos(0.0F, -1.0F, 1.6F);
            this.Hip.addBox(-1.5F, -0.5F, 0.3F, 3.0F, 3.0F, 2.0F, 0.1F, 0.0F, 0.3F);
            this.setRotateAngle(Hip, -0.1055924230746083F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 12, 14);
            this.HandLeft.setPos(0.0F, 1.5F, -0.5F);
            this.HandLeft.addBox(-0.5F, -0.6F, -0.7F, 1.0F, 1.0F, 1.0F, 0.01F, -0.1F, 0.0F);
            this.setRotateAngle(HandLeft, 0.3186971254089062F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 12, 5);
            this.Neck.setPos(0.0F, -0.8F, -1.5F);
            this.Neck.addBox(-1.0F, -1.1F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, -0.2F, 0.0F);
            this.setRotateAngle(Neck, -0.4143411604287122F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 12, 14);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.0F, 1.5F, -0.5F);
            this.HandRight.addBox(-0.5F, -0.6F, -0.7F, 1.0F, 1.0F, 1.0F, 0.01F, -0.1F, 0.0F);
            this.setRotateAngle(HandRight, 0.3186971254089062F, 0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 10, 11);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-1.1F, 0.9F, -1.0F);
            this.ArmBaseRight.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.21781708265940905F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 10, 6);
            this.Mouth.setPos(0.0F, 1.0F, 0.0F);
            this.Mouth.addBox(-0.5F, -0.6F, -1.7F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.2F);
            this.setRotateAngle(Mouth, -0.0373500478236019F, 0.0F, 0.0F);
            this.LegLeft = new ModelRenderer(this, 8, 13);
            this.LegLeft.setPos(0.01F, 0.9F, 1.0F);
            this.LegLeft.addBox(-0.5F, 0.0F, -0.7F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, -1.0224139077762113F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 6, 11);
            this.UpperLegLeft.setPos(0.0F, 1.5F, -1.0F);
            this.UpperLegLeft.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.9897762028270176F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 26, 4);
            this.Tail2.setPos(0.0F, 0.0F, 1.0F);
            this.Tail2.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.2F, 0.0F);
            this.setRotateAngle(Tail2, 0.19547687289441354F, 0.0F, 0.0F);
            this.VontsiraTail2 = new ModelRenderer(this, 16, 12);
            this.VontsiraTail2.setPos(0.0F, 0.0F, 1.2F);
            this.VontsiraTail2.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(VontsiraTail2, 0.19547687289441354F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 10, 11);
            this.ArmBaseLeft.setPos(1.1F, 0.9F, -1.0F);
            this.ArmBaseLeft.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.21781708265940905F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 0, 12);
            this.ThighLeft.setPos(0.8F, 1.1F, 1.4F);
            this.ThighLeft.addBox(-1.0F, -0.3F, -1.0F, 2.0F, 2.0F, 2.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.03909537541112055F, 0.0F, 0.0F);
            this.LegRight = new ModelRenderer(this, 8, 13);
            this.LegRight.mirror = true;
            this.LegRight.setPos(-0.01F, 0.9F, 1.0F);
            this.LegRight.addBox(-0.5F, 0.0F, -0.7F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, -1.0224139077762113F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 20, 0);
            this.EarLeft.setPos(1.1F, -0.3F, 0.3F);
            this.EarLeft.addBox(-0.5F, -1.0F, 0.1F, 1.0F, 2.0F, 1.0F, 0.0F, -0.2F, 0.0F);
            this.setRotateAngle(EarLeft, 0.1867502266344419F, 0.7470009065377676F, 0.1494001912944076F);
            this.EarRight = new ModelRenderer(this, 20, 0);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-1.1F, -0.3F, 0.3F);
            this.EarRight.addBox(-0.5F, -1.0F, 0.1F, 1.0F, 2.0F, 1.0F, 0.0F, -0.2F, 0.0F);
            this.setRotateAngle(EarRight, 0.1867502266344419F, -0.7470009065377676F, -0.1494001912944076F);
            this.ArmRight = new ModelRenderer(this, 8, 13);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(0.02F, 1.0F, 0.5F);
            this.ArmRight.addBox(-0.5F, -0.2F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, -0.2F, 0.0F);
            this.setRotateAngle(ArmRight, -0.47123889803846897F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 6, 11);
            this.UpperLegRight.mirror = true;
            this.UpperLegRight.setPos(0.0F, 1.5F, -1.0F);
            this.UpperLegRight.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.9897762028270176F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 8, 13);
            this.ArmLeft.setPos(-0.02F, 1.0F, 0.5F);
            this.ArmLeft.addBox(-0.5F, -0.2F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, -0.2F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.47123889803846897F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 10, 0);
            this.Head.setPos(0.0F, 0.6F, -1.4F);
            this.Head.addBox(-1.5F, -1.5F, -1.3F, 3.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.2F);
            this.setRotateAngle(Head, 0.5602506632585689F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 26, 0);
            this.Tail1.setPos(0.0F, 0.25F, 2.5F);
            this.Tail1.addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 2.0F, 0.1F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -0.7644541990577108F, 0.0F, 0.0F);
            this.Head.addChild(this.Snout);
            this.Hip.addChild(this.ThighRight);
            this.LegRight.addChild(this.FootRight);
            this.Tail2.addChild(this.Tail3);
            this.Snout.addChild(this.Nose);
            this.VontsiraTail2.addChild(this.VontsiraTail3);
            this.Tail3.addChild(this.Tail4);
            this.LegLeft.addChild(this.FootLeft);
            this.Body.addChild(this.Hip);
            this.ArmLeft.addChild(this.HandLeft);
            this.Body.addChild(this.Neck);
            this.ArmRight.addChild(this.HandRight);
            this.Body.addChild(this.ArmBaseRight);
            this.Snout.addChild(this.Mouth);
            this.UpperLegLeft.addChild(this.LegLeft);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.Tail1.addChild(this.Tail2);
            this.Tail1.addChild(this.VontsiraTail2);
            this.Body.addChild(this.ArmBaseLeft);
            this.Hip.addChild(this.ThighLeft);
            this.UpperLegRight.addChild(this.LegRight);
            this.Head.addChild(this.EarLeft);
            this.Head.addChild(this.EarRight);
            this.ArmBaseRight.addChild(this.ArmRight);
            this.ThighRight.addChild(this.UpperLegRight);
            this.ArmBaseLeft.addChild(this.ArmLeft);
            this.Neck.addChild(this.Head);
            this.Hip.addChild(this.Tail1);
            this.saveBase();

        }

        @Override
        public void setupAnim(MongooseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
            this.Head.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
        }

        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 1.0F;
            float degree = 1.0F;
            this.Neck.xRot = MathHelper.cos(limbSwing * speed * 0.1F) * degree * 0.1F * limbSwingAmount - 0.414F;
            this.Head.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount + 0.56F;
            this.Tail1.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount - 0.764F;
            this.Tail2.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount + 0.195F;
            this.VontsiraTail2.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount + 0.195F;
            this.VontsiraTail3.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount + 0.234F;
        }

            public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 1.5F;
            float degree = 0.5F;
            if (entity.isSprinting()) {
            } else {
                this.ArmBaseLeft.xRot = MathHelper.cos(1.5F + limbSwing * speed * 0.2F) * degree * 1.5F * limbSwingAmount + 0.217F;
                this.ArmLeft.xRot = MathHelper.cos(5.5F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount - 0.471F;
                this.HandLeft.xRot = MathHelper.cos(1.5F + limbSwing * speed * 0.2F) * degree * -1.5F * limbSwingAmount + 0.319F;
                this.ArmBaseRight.xRot = MathHelper.cos(1.5F + limbSwing * speed * 0.2F) * degree * -1.5F * limbSwingAmount + 0.217F;
                this.ArmRight.xRot = MathHelper.cos(5.5F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount - 0.471F;
                this.HandRight.xRot = MathHelper.cos(1.5F + limbSwing * speed * 0.2F) * degree * 1.5F * limbSwingAmount + 0.319F;

                this.ThighLeft.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * 1.5F * limbSwingAmount + 0.039F;
                this.UpperLegLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * degree * 1.5F * limbSwingAmount + 0.989F;
                this.FootLeft.xRot = MathHelper.cos(-5.0F + limbSwing * speed * 0.2F) * degree * 0.5F * limbSwingAmount + 0.195F;
                this.ThighRight.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * -1.5F * limbSwingAmount + 0.039F;
                this.UpperLegRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * degree * -1.5F * limbSwingAmount + 0.989F;
                this.FootRight.xRot = MathHelper.cos(-5.0F + limbSwing * speed * 0.2F) * degree * -0.5F * limbSwingAmount + 0.195F;

                this.Hip.xRot = MathHelper.cos(1.5F + limbSwing * speed * 0.4F) * degree * -0.2F * limbSwingAmount - 0.105F;
                this.Body.xRot = MathHelper.cos(1.5F + limbSwing * speed * 0.4F) * degree * 0.2F * limbSwingAmount + 0.045F;
                this.Neck.xRot = MathHelper.cos(limbSwing * speed * 0.4F) * degree * -0.1F * limbSwingAmount - 0.414F;
                this.Head.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.4F) * degree * -0.1F * limbSwingAmount + 0.56F;

                this.Tail2.xRot = MathHelper.cos(limbSwing * speed * 0.4F) * degree * -0.2F * limbSwingAmount + 0.195F;
                this.VontsiraTail2.xRot = MathHelper.cos(limbSwing * speed * 0.4F) * degree * -0.2F * limbSwingAmount + 0.195F;

                this.ThighLeft.y = MathHelper.cos(-2.5F + limbSwing * speed * 0.2F) * degree * 0.1F * limbSwingAmount + 1.1F;
                this.ThighRight.y = MathHelper.cos(-2.5F + limbSwing * speed * 0.2F) * degree * -0.1F * limbSwingAmount + 1.1F;
            }
        }
    }
}
