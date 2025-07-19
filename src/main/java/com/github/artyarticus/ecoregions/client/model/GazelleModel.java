package com.github.artyarticus.ecoregions.client.model;

import com.github.artyarticus.ecoregions.entity.GazelleEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class GazelleModel extends ZawaBaseModel<GazelleEntity> {
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

    public static class Adult extends GazelleModel {

        public ModelRenderer Body;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer Neck;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer Hips;
        public ModelRenderer ThighLeft;
        public ModelRenderer Tail;
        public ModelRenderer ThighRight;
        public ModelRenderer UpperLegLeft;
        public ModelRenderer LowerLegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer UpperLegRight;
        public ModelRenderer LowerLegRight;
        public ModelRenderer FootRight;
        public ModelRenderer UpperArmLeft;
        public ModelRenderer ArmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer Head;
        public ModelRenderer Snout;
        public ModelRenderer EarLeft;
        public ModelRenderer CuvierHorn1;
        public ModelRenderer ThomsonHorn1;
        public ModelRenderer SoemmeringHorn1;
        public ModelRenderer EarRight;
        public ModelRenderer ThomsonHorn1_1;
        public ModelRenderer SoemmeringHorn1_1;
        public ModelRenderer CuvierHorn1_1;
        public ModelRenderer TopSnout;
        public ModelRenderer Mouth;
        public ModelRenderer part14;
        public ModelRenderer CuvierHorn2;
        public ModelRenderer CuvierHorn3;
        public ModelRenderer ThomsonHorn2;
        public ModelRenderer ThomsonHorn3;
        public ModelRenderer SommeringHorn2;
        public ModelRenderer SommeringHorn3;
        public ModelRenderer ThomsonHorn2_1;
        public ModelRenderer ThomsonHorn3_1;
        public ModelRenderer SommeringHorn2_1;
        public ModelRenderer SommeringHorn3_1;
        public ModelRenderer CuvierHorn2_1;
        public ModelRenderer CuvierHorn3_1;
        public ModelRenderer UpperArmRight;
        public ModelRenderer ArmRight;
        public ModelRenderer HandRight;

        public Adult() {
            this.texWidth = 64;
            this.texHeight = 64;
            this.UpperArmLeft = new ModelRenderer(this, 15, 46);
            this.UpperArmLeft.setPos(0.0F, 5.8F, 1.0F);
            this.UpperArmLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmLeft, -0.08726646259971647F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 23, 5);
            this.Head.setPos(0.0F, 2.8F, -4.1F);
            this.Head.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 1.1718140491363485F, 0.0F, 0.0F);
            this.CuvierHorn2_1 = new ModelRenderer(this, 32, 21);
            this.CuvierHorn2_1.mirror = true;
            this.CuvierHorn2_1.setPos(0.06F, -1.75F, 0.0F);
            this.CuvierHorn2_1.addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(CuvierHorn2_1, -0.3186971254089062F, 0.0F, -0.3186971254089062F);
            this.CuvierHorn2 = new ModelRenderer(this, 32, 21);
            this.CuvierHorn2.mirror = true;
            this.CuvierHorn2.setPos(-0.06F, -1.75F, 0.0F);
            this.CuvierHorn2.addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(CuvierHorn2, -0.3186971254089062F, 0.0F, 0.3186971254089062F);
            this.HandRight = new ModelRenderer(this, 33, 48);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.0F, 3.5F, 1.0F);
            this.HandRight.addBox(-0.9F, -0.5F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 15, 57);
            this.UpperLegRight.mirror = true;
            this.UpperLegRight.setPos(0.0F, 6.3F, -1.3F);
            this.UpperLegRight.addBox(-1.0F, -0.2F, -0.3F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.7330382858376184F, 0.0F, 0.0F);
            this.CuvierHorn3 = new ModelRenderer(this, 37, 21);
            this.CuvierHorn3.mirror = true;
            this.CuvierHorn3.setPos(0.0F, -2.0F, 0.0F);
            this.CuvierHorn3.addBox(-0.55F, -1.7F, -0.6F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(CuvierHorn3, 0.27314402127920984F, 0.0F, -0.3642502295386026F);
            this.LowerLegLeft = new ModelRenderer(this, 24, 57);
            this.LowerLegLeft.setPos(-0.05F, 4.8F, 1.7F);
            this.LowerLegLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.8203047484373349F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 15, 57);
            this.UpperLegLeft.setPos(0.0F, 6.3F, -1.3F);
            this.UpperLegLeft.addBox(-1.0F, -0.2F, -0.3F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.7330382858376184F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 33, 60);
            this.FootLeft.setPos(0.0F, 4.5F, -1.0F);
            this.FootLeft.addBox(-1.1F, -0.5F, -1.6F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 0.13962634015954636F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 24, 46);
            this.ArmLeft.setPos(-0.05F, 3.8F, -2.0F);
            this.ArmLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.ThomsonHorn3_1 = new ModelRenderer(this, 37, 30);
            this.ThomsonHorn3_1.setPos(0.0F, -2.95F, 0.0F);
            this.ThomsonHorn3_1.addBox(-0.45F, -3.1F, -0.55F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThomsonHorn3_1, 0.38048176361895836F, 0.0F, 0.11414453241463887F);
            this.ThomsonHorn2 = new ModelRenderer(this, 32, 30);
            this.ThomsonHorn2.setPos(0.0F, -2.5F, 0.0F);
            this.ThomsonHorn2.addBox(-0.55F, -3.2F, -0.65F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThomsonHorn2, -0.38048176361895836F, 0.0F, 0.11414453241463887F);
            this.SommeringHorn2 = new ModelRenderer(this, 32, 41);
            this.SommeringHorn2.setPos(0.0F, -4.3F, 0.0F);
            this.SommeringHorn2.addBox(-0.5F, 0.0F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(SommeringHorn2, 0.19024088180947918F, 0.0F, -0.5707226787179512F);
            this.EarLeft = new ModelRenderer(this, 36, 0);
            this.EarLeft.setPos(1.5F, -1.0F, 2.0F);
            this.EarLeft.addBox(-0.5F, -0.6F, -1.0F, 3.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.0F, -0.2663372478490763F, -0.913156259317111F);
            this.Hips = new ModelRenderer(this, 0, 28);
            this.Hips.setPos(0.0F, -1.0F, 6.6F);
            this.Hips.addBox(-2.5F, 0.0F, 0.0F, 5.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.1574287065193718F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 0, 53);
            this.ThighLeft.setPos(1.51F, 1.0F, 2.0F);
            this.ThighLeft.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 7.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.11135200827460905F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 0);
            this.Chest.setPos(0.0F, 11.2F, -5.0F);
            this.Chest.addBox(-2.5F, -3.5F, -2.5F, 5.0F, 7.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.273493095119092F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 26, 14);
            this.TopSnout.setPos(0.0F, -0.1F, -0.2F);
            this.TopSnout.addBox(-1.0F, -0.6F, -3.0F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.2275909337942703F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 50, 15);
            this.Mouth.setPos(0.0F, 1.6F, -0.5F);
            this.Mouth.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.09546950642224333F, 0.0F, 0.0F);
            this.Tail = new ModelRenderer(this, 19, 33);
            this.Tail.setPos(0.0F, 0.0F, 4.0F);
            this.Tail.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail, 0.3186971254089062F, 0.0F, 0.0F);
            this.CuvierHorn3_1 = new ModelRenderer(this, 37, 21);
            this.CuvierHorn3_1.mirror = true;
            this.CuvierHorn3_1.setPos(0.0F, -2.0F, 0.0F);
            this.CuvierHorn3_1.addBox(-0.45F, -1.7F, -0.6F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(CuvierHorn3_1, 0.27314402127920984F, 0.0F, 0.3642502295386026F);
            this.ArmRight = new ModelRenderer(this, 24, 46);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(0.05F, 3.8F, -2.0F);
            this.ArmRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 0, 42);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-1.51F, -1.4F, -0.6F);
            this.ArmBaseRight.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.35081118630876296F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 0, 53);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-1.51F, 1.0F, 2.0F);
            this.ThighRight.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 7.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.11135200827460905F, 0.0F, 0.0F);
            this.SommeringHorn3 = new ModelRenderer(this, 41, 41);
            this.SommeringHorn3.setPos(2.0F, 0.1F, 0.0F);
            this.SommeringHorn3.addBox(-0.1F, -2.3F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, -0.0F);
            this.setRotateAngle(SommeringHorn3, 0.11414453241463887F, 0.07609635771721872F, 0.2658136370892531F);
            this.Snout = new ModelRenderer(this, 37, 14);
            this.Snout.setPos(0.0F, -0.6F, -1.0F);
            this.Snout.addBox(-1.5F, 0.0F, -3.6F, 3.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.012915436631205606F, 0.0F, 0.0F);
            this.CuvierHorn1_1 = new ModelRenderer(this, 27, 21);
            this.CuvierHorn1_1.mirror = true;
            this.CuvierHorn1_1.setPos(-1.1F, -1.5F, -0.5F);
            this.CuvierHorn1_1.addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(CuvierHorn1_1, -0.7054620516981749F, -0.3186971254089062F, 0.2275909337942703F);
            this.EarRight = new ModelRenderer(this, 36, 0);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-1.5F, -1.0F, 2.0F);
            this.EarRight.addBox(-2.5F, -0.6F, -1.0F, 3.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.0F, 0.2663372478490763F, 0.913156259317111F);
            this.SommeringHorn2_1 = new ModelRenderer(this, 32, 41);
            this.SommeringHorn2_1.setPos(0.0F, -4.3F, 0.0F);
            this.SommeringHorn2_1.addBox(-2.5F, 0.0F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(SommeringHorn2_1, 0.19024088180947918F, 0.0F, 0.5707226787179512F);
            this.LowerLegRight = new ModelRenderer(this, 24, 57);
            this.LowerLegRight.mirror = true;
            this.LowerLegRight.setPos(0.05F, 4.8F, 1.7F);
            this.LowerLegRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.8203047484373349F, 0.0F, 0.0F);
            this.SommeringHorn3_1 = new ModelRenderer(this, 41, 41);
            this.SommeringHorn3_1.setPos(-2.0F, 0.1F, 0.0F);
            this.SommeringHorn3_1.addBox(-0.9F, -2.3F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(SommeringHorn3_1, 0.11414453241463887F, -0.07609635771721872F, -0.2658136370892531F);
            this.ThomsonHorn3 = new ModelRenderer(this, 37, 30);
            this.ThomsonHorn3.setPos(0.0F, -2.95F, 0.0F);
            this.ThomsonHorn3.addBox(-0.55F, -3.1F, -0.55F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThomsonHorn3, 0.38048176361895836F, 0.0F, -0.11414453241463887F);
            this.Neck = new ModelRenderer(this, 40, 0);
            this.Neck.setPos(0.0F, -3.3F, -2.0F);
            this.Neck.addBox(-1.5F, 0.1F, -5.0F, 3.0F, 4.0F, 9.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.7400196294772066F, 0.0F, 0.0F);
            this.ThomsonHorn1 = new ModelRenderer(this, 27, 30);
            this.ThomsonHorn1.setPos(1.1F, -1.5F, -0.5F);
            this.ThomsonHorn1.addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThomsonHorn1, -0.7227408405876907F, 0.11728612207217244F, 0.0F);
            this.ThomsonHorn2_1 = new ModelRenderer(this, 32, 30);
            this.ThomsonHorn2_1.setPos(0.0F, -2.5F, 0.0F);
            this.ThomsonHorn2_1.addBox(-0.45F, -3.2F, -0.65F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThomsonHorn2_1, -0.38048176361895836F, 0.0F, -0.11414453241463887F);
            this.Body = new ModelRenderer(this, 0, 13);
            this.Body.setPos(0.0F, -2.5F, 1.5F);
            this.Body.addBox(-3.0F, -1.0F, -0.5F, 6.0F, 7.0F, 7.0F, 0.0F, 0.0F, 0.1F);
            this.setRotateAngle(Body, 0.27401668923415834F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 33, 60);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.0F, 4.5F, -1.0F);
            this.FootRight.addBox(-0.9F, -0.5F, -1.6F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, 0.13962634015954636F, 0.0F, 0.0F);
            this.part14 = new ModelRenderer(this, 27, 0);
            this.part14.setPos(-0.01F, 0.0F, -2.0F);
            this.part14.addBox(-1.0F, -0.9F, -1.4F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(part14, -0.11746065899211351F, 0.0F, 0.0F);
            this.UpperArmRight = new ModelRenderer(this, 15, 46);
            this.UpperArmRight.mirror = true;
            this.UpperArmRight.setPos(0.0F, 5.8F, 1.0F);
            this.UpperArmRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmRight, -0.08726646259971647F, 0.0F, 0.0F);
            this.SoemmeringHorn1_1 = new ModelRenderer(this, 27, 40);
            this.SoemmeringHorn1_1.setPos(-1.1F, -1.5F, -0.5F);
            this.SoemmeringHorn1_1.addBox(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(SoemmeringHorn1_1, -0.9892526253567082F, -0.11728612207217244F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 0, 42);
            this.ArmBaseLeft.setPos(1.51F, -1.4F, -0.6F);
            this.ArmBaseLeft.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.35081118630876296F, 0.0F, 0.0F);
            this.ThomsonHorn1_1 = new ModelRenderer(this, 27, 30);
            this.ThomsonHorn1_1.setPos(-1.1F, -1.5F, -0.5F);
            this.ThomsonHorn1_1.addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThomsonHorn1_1, -0.7227408405876907F, -0.11728612207217244F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 33, 48);
            this.HandLeft.setPos(0.0F, 3.5F, 1.0F);
            this.HandLeft.addBox(-1.1F, -0.5F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.CuvierHorn1 = new ModelRenderer(this, 27, 21);
            this.CuvierHorn1.mirror = true;
            this.CuvierHorn1.setPos(1.1F, -1.5F, -0.5F);
            this.CuvierHorn1.addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(CuvierHorn1, -0.7054620516981749F, 0.3186971254089062F, -0.2275909337942703F);
            this.SoemmeringHorn1 = new ModelRenderer(this, 27, 40);
            this.SoemmeringHorn1.setPos(1.1F, -1.5F, -0.5F);
            this.SoemmeringHorn1.addBox(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(SoemmeringHorn1, -0.9892526253567082F, 0.11728612207217244F, 0.0F);
            this.ArmBaseLeft.addChild(this.UpperArmLeft);
            this.Neck.addChild(this.Head);
            this.CuvierHorn1_1.addChild(this.CuvierHorn2_1);
            this.CuvierHorn1.addChild(this.CuvierHorn2);
            this.ArmRight.addChild(this.HandRight);
            this.ThighRight.addChild(this.UpperLegRight);
            this.CuvierHorn2.addChild(this.CuvierHorn3);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.UpperArmLeft.addChild(this.ArmLeft);
            this.ThomsonHorn2_1.addChild(this.ThomsonHorn3_1);
            this.ThomsonHorn1.addChild(this.ThomsonHorn2);
            this.SoemmeringHorn1.addChild(this.SommeringHorn2);
            this.Head.addChild(this.EarLeft);
            this.Body.addChild(this.Hips);
            this.Hips.addChild(this.ThighLeft);
            this.Snout.addChild(this.TopSnout);
            this.Snout.addChild(this.Mouth);
            this.Hips.addChild(this.Tail);
            this.CuvierHorn2_1.addChild(this.CuvierHorn3_1);
            this.UpperArmRight.addChild(this.ArmRight);
            this.Chest.addChild(this.ArmBaseRight);
            this.Hips.addChild(this.ThighRight);
            this.SommeringHorn2.addChild(this.SommeringHorn3);
            this.Head.addChild(this.Snout);
            this.Head.addChild(this.CuvierHorn1_1);
            this.Head.addChild(this.EarRight);
            this.SoemmeringHorn1_1.addChild(this.SommeringHorn2_1);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.SommeringHorn2_1.addChild(this.SommeringHorn3_1);
            this.ThomsonHorn2.addChild(this.ThomsonHorn3);
            this.Chest.addChild(this.Neck);
            this.Head.addChild(this.ThomsonHorn1);
            this.ThomsonHorn1_1.addChild(this.ThomsonHorn2_1);
            this.Chest.addChild(this.Body);
            this.LowerLegRight.addChild(this.FootRight);
            this.TopSnout.addChild(this.part14);
            this.ArmBaseRight.addChild(this.UpperArmRight);
            this.Head.addChild(this.SoemmeringHorn1_1);
            this.Chest.addChild(this.ArmBaseLeft);
            this.Head.addChild(this.ThomsonHorn1_1);
            this.ArmLeft.addChild(this.HandLeft);
            this.Head.addChild(this.CuvierHorn1);
            this.Head.addChild(this.SoemmeringHorn1);
            this.saveBase();
        }

        @Override
        public void setupAnim(GazelleEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 1.172F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.74F;
            this.Head.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F + 1.172F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (entity.isSprinting()) {
                float speed = 1.0f;
                float degree = 0.5f;
                this.Neck.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.74F;
                this.Head.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 1.172F;

                this.Chest.y = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -1F) * 0.5F + 11.2F;
                this.Chest.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.1F) * 0.5F - 0.273F;
                this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.274F;
                this.Hips.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.157F;

                this.ArmBaseLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.6F) * 0.5F + 0.351F;
                this.UpperArmLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.087F;
                this.ArmLeft.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree) * 0.5F;
                this.HandLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;
                this.ArmBaseRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.6F) * 0.5F + 0.351F;
                this.UpperArmRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.087F;
                this.ArmRight.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1F) * 0.5F;
                this.HandRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;

                this.ThighLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.3F) * 0.5F + 0.111F;
                this.UpperLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.733F;
                this.LowerLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.820F;
                this.FootLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.139F;
                this.ThighRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.3F) * 0.5F + 0.111F;
                this.UpperLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.733F;
                this.LowerLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.820F;
                this.FootRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.139F;

            } else {
                float speed = 0.8f;
                float degree = 0.6f;
                this.Neck.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.74F;
                this.Head.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 1.172F;

                this.Chest.y = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -1F) * 0.5F + 11.2F;
                this.Chest.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.1F) * 0.5F - 0.273F;
                this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.274F;
                this.Hips.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.157F;

                this.ArmBaseLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.6F) * 0.5F + 0.351F;
                this.UpperArmLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.087F;
                this.ArmLeft.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree) * 0.5F;
                this.HandLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;
                this.ArmBaseRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.6F) * 0.5F + 0.351F;
                this.UpperArmRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.087F;
                this.ArmRight.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1F) * 0.5F;
                this.HandRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;

                this.ThighLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.3F) * 0.5F + 0.111F;
                this.UpperLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.733F;
                this.LowerLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.820F;
                this.FootLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.139F;
                this.ThighRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.3F) * 0.5F + 0.111F;
                this.UpperLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.733F;
                this.LowerLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.820F;
                this.FootRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.139F;
            }
        }
    }


    public static class Child extends GazelleModel {

        public ModelRenderer Body;
        public ModelRenderer Neck;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer ArmBaseRight;
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
        public ModelRenderer EarLeft;
        public ModelRenderer EarRight;
        public ModelRenderer Snout;
        public ModelRenderer TopSnout;
        public ModelRenderer Mouth;
        public ModelRenderer UpperArmLeft;
        public ModelRenderer ArmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer UpperArmRight;
        public ModelRenderer ArmRight;
        public ModelRenderer HandRight;

        public Child() {
            this.texWidth = 32;
            this.texHeight = 32;
            this.Snout = new ModelRenderer(this, 24, 5);
            this.Snout.setPos(0.0F, 0.0F, -1.0F);
            this.Snout.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.13962634015954636F, 0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 15, 22);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-1.1F, 0.2F, -1.0F);
            this.ArmBaseRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.3490658503988659F, 0.0F, 0.0F);
            this.Tail = new ModelRenderer(this, 9, 0);
            this.Tail.setPos(0.0F, 0.0F, 5.5F);
            this.Tail.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail, 0.45535640450848164F, 0.0F, 0.0F);
            this.LowerLegLeft = new ModelRenderer(this, 10, 21);
            this.LowerLegLeft.setPos(-0.05F, 3.0F, 1.7F);
            this.LowerLegLeft.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.767944870877505F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 15, 22);
            this.ArmBaseLeft.setPos(1.1F, 0.2F, -1.0F);
            this.ArmBaseLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.3490658503988659F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 0, 21);
            this.ThighLeft.setPos(1.4F, 1.3F, 4.5F);
            this.ThighLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, -0.05235987755982988F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 0, 27);
            this.UpperLegRight.mirror = true;
            this.UpperLegRight.setPos(0.0F, 2.5F, -1.2F);
            this.UpperLegRight.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.6632251157578453F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 21, 29);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.1F, 2.5F, 0.3F);
            this.HandRight.addBox(-0.5F, 0.0F, -0.7F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 6, 30);
            this.FootLeft.setPos(-0.1F, 3.7F, -0.7F);
            this.FootLeft.addBox(-0.5F, 0.0F, -0.7F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 0.13962634015954636F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 0, 0);
            this.Neck.setPos(0.0F, -1.0F, -2.0F);
            this.Neck.addBox(-1.0F, -3.0F, -2.0F, 2.0F, 5.0F, 3.0F, 0.0F, 0.0F, -0.2F);
            this.setRotateAngle(Neck, 0.9105382388075086F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 26, 28);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-1.0F, -0.5F, 0.6F);
            this.EarRight.addBox(-0.5F, -2.5F, 0.0F, 1.0F, 3.0F, 1.0F, 0.2F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.0F, 0.4098033003787853F, -0.7740534966278743F);
            this.FootRight = new ModelRenderer(this, 6, 30);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.1F, 3.7F, -0.7F);
            this.FootRight.addBox(-0.5F, 0.0F, -0.7F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, 0.13962634015954636F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 21, 29);
            this.HandLeft.setPos(-0.1F, 2.5F, 0.3F);
            this.HandLeft.addBox(-0.5F, 0.0F, -0.7F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 16, 27);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(0.05F, 2.0F, -1.0F);
            this.ArmRight.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 13, 0);
            this.Chest.setPos(0.0F, 15.9F, -2.5F);
            this.Chest.addBox(-1.5F, -2.0F, -2.0F, 3.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.2275909337942703F, 0.0F, 0.0F);
            this.UpperArmLeft = new ModelRenderer(this, 24, 23);
            this.UpperArmLeft.setPos(0.0F, 2.8F, 0.5F);
            this.UpperArmLeft.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmLeft, -0.08726646259971647F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 19, 9);
            this.Head.setPos(0.0F, -2.6F, -1.0F);
            this.Head.addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, -0.591841146688116F, 0.0F, 0.0F);
            this.UpperArmRight = new ModelRenderer(this, 24, 23);
            this.UpperArmRight.mirror = true;
            this.UpperArmRight.setPos(0.0F, 2.8F, 0.5F);
            this.UpperArmRight.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmRight, -0.08726646259971647F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 0, 21);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-1.4F, 1.3F, 4.5F);
            this.ThighRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, -0.05235987755982988F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 24, 1);
            this.TopSnout.setPos(0.0F, -0.7F, -0.1F);
            this.TopSnout.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.4098033003787853F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 0, 27);
            this.UpperLegLeft.setPos(0.0F, 2.5F, -1.2F);
            this.UpperLegLeft.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.6632251157578453F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 0, 13);
            this.Mouth.setPos(0.0F, 0.4F, 0.1F);
            this.Mouth.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.04555309164612875F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 26, 28);
            this.EarLeft.setPos(1.0F, -0.5F, 0.6F);
            this.EarLeft.addBox(-0.5F, -2.5F, 0.0F, 1.0F, 3.0F, 1.0F, 0.2F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.0F, -0.4098033003787853F, 0.7740534966278743F);
            this.ArmLeft = new ModelRenderer(this, 16, 27);
            this.ArmLeft.setPos(-0.05F, 2.0F, -1.0F);
            this.ArmLeft.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 9);
            this.Body.setPos(0.0F, -1.5F, 0.0F);
            this.Body.addBox(-2.0F, -0.5F, -1.0F, 4.0F, 4.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.2275909337942703F, 0.0F, 0.0F);
            this.LowerLegRight = new ModelRenderer(this, 10, 21);
            this.LowerLegRight.mirror = true;
            this.LowerLegRight.setPos(0.05F, 3.0F, 1.7F);
            this.LowerLegRight.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.767944870877505F, 0.0F, 0.0F);
            this.Head.addChild(this.Snout);
            this.Chest.addChild(this.ArmBaseRight);
            this.Body.addChild(this.Tail);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.Chest.addChild(this.ArmBaseLeft);
            this.Body.addChild(this.ThighLeft);
            this.ThighRight.addChild(this.UpperLegRight);
            this.ArmRight.addChild(this.HandRight);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.Chest.addChild(this.Neck);
            this.Head.addChild(this.EarRight);
            this.LowerLegRight.addChild(this.FootRight);
            this.ArmLeft.addChild(this.HandLeft);
            this.UpperArmRight.addChild(this.ArmRight);
            this.ArmBaseLeft.addChild(this.UpperArmLeft);
            this.Neck.addChild(this.Head);
            this.ArmBaseRight.addChild(this.UpperArmRight);
            this.Body.addChild(this.ThighRight);
            this.Snout.addChild(this.TopSnout);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.Snout.addChild(this.Mouth);
            this.Head.addChild(this.EarLeft);
            this.UpperArmLeft.addChild(this.ArmLeft);
            this.Chest.addChild(this.Body);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.saveBase();

        }

        @Override
        public void setupAnim(GazelleEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) - 0.59F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 0.91F;
            this.Head.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F - 0.59F;

            this.Tail.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.46F;
            this.Tail.zRot = MathHelper.cos(1.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.2f;
            float degree = 0.8f;
            this.Neck.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.15F) * 0.5F + 0.91F;
            this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F - 0.59F;
            this.Chest.y = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 15.9F;
            this.Chest.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F - 0.23F;
            this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.23F;
            this.ArmBaseLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -0.9F) * 0.5F + 0.35F;
            this.ArmLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F + 0.0F;
            this.UpperArmLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.09F;
            this.HandLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F + 0.0F;
            this.ArmBaseRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.9F) * 0.5F + 0.35F;
            this.ArmRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F + 0.0F;
            this.UpperArmRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.09F;
            this.HandRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F + 0.0F;
            this.ThighLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.3F) * 0.5F - 0.05F;
            this.UpperLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.66F;
            this.LowerLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.77F;
            this.FootLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F;
            this.ThighRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.3F) * 0.5F - 0.05F;
            this.UpperLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.66F;
            this.LowerLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.77F;
            this.FootRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F;

        }
    }
}



