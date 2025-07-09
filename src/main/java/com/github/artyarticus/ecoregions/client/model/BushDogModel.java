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

        public ModelRenderer Body;
        public ModelRenderer Neck;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer ArmBaseRight;
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
        public ModelRenderer Head;
        public ModelRenderer Snout;
        public ModelRenderer Mouth;
        public ModelRenderer part2;
        public ModelRenderer EarLeft;
        public ModelRenderer part2_1;
        public ModelRenderer EarRight;
        public ModelRenderer Nose;
        public ModelRenderer UpperArmLeft;
        public ModelRenderer ForearmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer UpperArmRight;
        public ModelRenderer ForearmRight;
        public ModelRenderer HandRight;

        public Adult() {
            this.texWidth = 64;
            this.texHeight = 64;
            this.Chest = new ModelRenderer(this, 0, 0);
            this.Chest.setPos(0.0F, 18.1F, -4.0F);
            this.Chest.addBox(-2.5F, -2.5F, -2.0F, 5.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.11728612207217244F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 32, 23);
            this.UpperLegRight.mirror = true;
            this.UpperLegRight.setPos(0.0F, 4.0F, -1.5F);
            this.UpperLegRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.6829473549475088F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 19, 35);
            this.ArmBaseLeft.setPos(1.7F, -1.1F, -0.5F);
            this.ArmBaseLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.162315623764424F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 9);
            this.Body.setPos(0.0F, -2.5F, 0.2F);
            this.Body.addBox(-3.0F, 0.0F, 0.0F, 6.0F, 5.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.11728612207217244F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 32, 23);
            this.UpperLegLeft.setPos(0.0F, 4.0F, -1.5F);
            this.UpperLegLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.6829473549475088F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 22);
            this.Hips.setPos(0.0F, 0.0F, 6.0F);
            this.Hips.addBox(-2.5F, 0.0F, 0.0F, 5.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.23457224414434488F, 0.0F, 0.0F);
            this.UpperArmLeft = new ModelRenderer(this, 31, 38);
            this.UpperArmLeft.setPos(0.0F, 3.0F, 1.0F);
            this.UpperArmLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmLeft, -0.06475171591477989F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 40, 38);
            this.HandRight.setPos(0.0F, 2.0F, 0.8F);
            this.HandRight.addBox(-1.0F, -0.5F, -1.4F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.0781907508222411F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 22, 30);
            this.FootLeft.setPos(0.0F, 2.7F, -1.4F);
            this.FootLeft.addBox(-1.0F, 0.0F, -1.3F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 27, 14);
            this.ThighLeft.setPos(1.6F, 0.6F, 1.2F);
            this.ThighLeft.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.2275909337942703F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 40, 38);
            this.HandLeft.setPos(0.0F, 2.0F, 0.8F);
            this.HandLeft.addBox(-1.0F, -0.5F, -1.4F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.0781907508222411F, 0.0F, 0.0F);
            this.UpperArmRight = new ModelRenderer(this, 31, 38);
            this.UpperArmRight.setPos(0.0F, 3.0F, 1.0F);
            this.UpperArmRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmRight, -0.06475171591477989F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 54, 17);
            this.Tail1.setPos(0.0F, 0.5F, 2.5F);
            this.Tail1.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -0.9424777960769379F, 0.0F, 0.0F);
            this.part2 = new ModelRenderer(this, 36, 0);
            this.part2.mirror = true;
            this.part2.setPos(1.4F, 0.0F, 0.3F);
            this.part2.addBox(-1.0F, 0.0F, -2.5F, 2.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(part2, 0.0781907508222411F, 0.0F, 0.11728612207217244F);
            this.EarLeft = new ModelRenderer(this, 40, 9);
            this.EarLeft.setPos(1.8F, -0.7F, 1.2F);
            this.EarLeft.addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.0911061832922575F, -0.46216317793861517F, 0.18203784630933073F);
            this.LowerLegLeft = new ModelRenderer(this, 22, 23);
            this.LowerLegLeft.setPos(0.0F, 1.6F, 2.3F);
            this.LowerLegLeft.addBox(-1.0F, 0.5F, -2.0F, 2.0F, 3.0F, 2.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.6829473549475088F, 0.0F, 0.0F);
            this.ForearmRight = new ModelRenderer(this, 31, 33);
            this.ForearmRight.setPos(0.01F, 1.6F, -2.0F);
            this.ForearmRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmRight, -0.05235987755982988F, 0.0F, 0.0F);
            this.LowerLegRight = new ModelRenderer(this, 22, 23);
            this.LowerLegRight.mirror = true;
            this.LowerLegRight.setPos(0.0F, 1.6F, 2.3F);
            this.LowerLegRight.addBox(-1.0F, 0.5F, -2.0F, 2.0F, 3.0F, 2.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.6829473549475088F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 56, 11);
            this.Snout.setPos(0.0F, 0.3F, -1.3F);
            this.Snout.addBox(-1.0F, -0.1F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.11728612207217244F, 0.0F, 0.0F);
            this.Nose = new ModelRenderer(this, 49, 8);
            this.Nose.setPos(0.0F, 0.1F, -0.1F);
            this.Nose.addBox(-0.5F, -0.9F, -2.0F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Nose, 0.18203784630933073F, 0.0F, 0.0F);
            this.ForearmLeft = new ModelRenderer(this, 31, 33);
            this.ForearmLeft.setPos(-0.01F, 1.6F, -2.0F);
            this.ForearmLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmLeft, -0.05235987755982988F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 40, 9);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-1.8F, -0.7F, 1.2F);
            this.EarRight.addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.0911061832922575F, 0.46216317793861517F, -0.18203784630933073F);
            this.ThighRight = new ModelRenderer(this, 27, 14);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-1.6F, 0.6F, 1.2F);
            this.ThighRight.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.2275909337942703F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 17, 0);
            this.Neck.setPos(0.0F, -2.5F, -2.0F);
            this.Neck.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.35185837453889574F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 22, 30);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.0F, 2.7F, -1.5F);
            this.FootRight.addBox(-1.0F, 0.0F, -1.3F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 56, 25);
            this.Tail2.setPos(-0.01F, 0.0F, 2.5F);
            this.Tail2.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, 0.27314402127920984F, 0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 19, 35);
            this.ArmBaseRight.setPos(-1.7F, -1.0F, -0.5F);
            this.ArmBaseRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.162315623764424F, 0.0F, 0.0F);
            this.part2_1 = new ModelRenderer(this, 36, 0);
            this.part2_1.setPos(-1.4F, 0.0F, 0.3F);
            this.part2_1.addBox(-1.0F, 0.0F, -2.5F, 2.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(part2_1, 0.0781907508222411F, 0.0F, -0.11728612207217244F);
            this.Head = new ModelRenderer(this, 48, 0);
            this.Head.setPos(0.0F, 2.5F, -2.0F);
            this.Head.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.5864306020384839F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 50, 13);
            this.Mouth.setPos(0.0F, 1.5F, -1.4F);
            this.Mouth.addBox(-0.5F, -0.5F, -1.7F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.11728612207217244F, 0.0F, 0.0F);
            this.ThighRight.addChild(this.UpperLegRight);
            this.Chest.addChild(this.ArmBaseLeft);
            this.Chest.addChild(this.Body);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.Body.addChild(this.Hips);
            this.ArmBaseLeft.addChild(this.UpperArmLeft);
            this.ForearmRight.addChild(this.HandRight);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.Hips.addChild(this.ThighLeft);
            this.ForearmLeft.addChild(this.HandLeft);
            this.ArmBaseRight.addChild(this.UpperArmRight);
            this.Hips.addChild(this.Tail1);
            this.Head.addChild(this.part2);
            this.Head.addChild(this.EarLeft);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.UpperArmRight.addChild(this.ForearmRight);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.Head.addChild(this.Snout);
            this.Snout.addChild(this.Nose);
            this.UpperArmLeft.addChild(this.ForearmLeft);
            this.Head.addChild(this.EarRight);
            this.Hips.addChild(this.ThighRight);
            this.Chest.addChild(this.Neck);
            this.LowerLegRight.addChild(this.FootRight);
            this.Tail1.addChild(this.Tail2);
            this.Chest.addChild(this.ArmBaseRight);
            this.Head.addChild(this.part2_1);
            this.Neck.addChild(this.Head);
            this.Head.addChild(this.Mouth); this.Chest = new ModelRenderer(this, 0, 0);
            this.Chest.setPos(0.0F, 18.1F, -4.0F);
            this.Chest.addBox(-2.5F, -2.5F, -2.0F, 5.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.11728612207217244F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 32, 23);
            this.UpperLegRight.mirror = true;
            this.UpperLegRight.setPos(0.0F, 4.0F, -1.5F);
            this.UpperLegRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.6829473549475088F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 19, 35);
            this.ArmBaseLeft.setPos(1.7F, -1.1F, -0.5F);
            this.ArmBaseLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.162315623764424F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 9);
            this.Body.setPos(0.0F, -2.5F, 0.2F);
            this.Body.addBox(-3.0F, 0.0F, 0.0F, 6.0F, 5.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.11728612207217244F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 32, 23);
            this.UpperLegLeft.setPos(0.0F, 4.0F, -1.5F);
            this.UpperLegLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.6829473549475088F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 22);
            this.Hips.setPos(0.0F, 0.0F, 6.0F);
            this.Hips.addBox(-2.5F, 0.0F, 0.0F, 5.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.23457224414434488F, 0.0F, 0.0F);
            this.UpperArmLeft = new ModelRenderer(this, 31, 38);
            this.UpperArmLeft.setPos(0.0F, 3.0F, 1.0F);
            this.UpperArmLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmLeft, -0.06475171591477989F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 40, 38);
            this.HandRight.setPos(0.0F, 2.0F, 0.8F);
            this.HandRight.addBox(-1.0F, -0.5F, -1.4F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.0781907508222411F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 22, 30);
            this.FootLeft.setPos(0.0F, 2.7F, -1.4F);
            this.FootLeft.addBox(-1.0F, 0.0F, -1.3F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 27, 14);
            this.ThighLeft.setPos(1.6F, 0.6F, 1.2F);
            this.ThighLeft.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.2275909337942703F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 40, 38);
            this.HandLeft.setPos(0.0F, 2.0F, 0.8F);
            this.HandLeft.addBox(-1.0F, -0.5F, -1.4F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.0781907508222411F, 0.0F, 0.0F);
            this.UpperArmRight = new ModelRenderer(this, 31, 38);
            this.UpperArmRight.setPos(0.0F, 3.0F, 1.0F);
            this.UpperArmRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmRight, -0.06475171591477989F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 54, 17);
            this.Tail1.setPos(0.0F, 0.5F, 2.5F);
            this.Tail1.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -0.9424777960769379F, 0.0F, 0.0F);
            this.part2 = new ModelRenderer(this, 36, 0);
            this.part2.mirror = true;
            this.part2.setPos(1.4F, 0.0F, 0.3F);
            this.part2.addBox(-1.0F, 0.0F, -2.5F, 2.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(part2, 0.0781907508222411F, 0.0F, 0.11728612207217244F);
            this.EarLeft = new ModelRenderer(this, 40, 9);
            this.EarLeft.setPos(1.8F, -0.7F, 1.2F);
            this.EarLeft.addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.0911061832922575F, -0.46216317793861517F, 0.18203784630933073F);
            this.LowerLegLeft = new ModelRenderer(this, 22, 23);
            this.LowerLegLeft.setPos(0.0F, 1.6F, 2.3F);
            this.LowerLegLeft.addBox(-1.0F, 0.5F, -2.0F, 2.0F, 3.0F, 2.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.6829473549475088F, 0.0F, 0.0F);
            this.ForearmRight = new ModelRenderer(this, 31, 33);
            this.ForearmRight.setPos(0.01F, 1.6F, -2.0F);
            this.ForearmRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmRight, -0.05235987755982988F, 0.0F, 0.0F);
            this.LowerLegRight = new ModelRenderer(this, 22, 23);
            this.LowerLegRight.mirror = true;
            this.LowerLegRight.setPos(0.0F, 1.6F, 2.3F);
            this.LowerLegRight.addBox(-1.0F, 0.5F, -2.0F, 2.0F, 3.0F, 2.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.6829473549475088F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 56, 11);
            this.Snout.setPos(0.0F, 0.3F, -1.3F);
            this.Snout.addBox(-1.0F, -0.1F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.11728612207217244F, 0.0F, 0.0F);
            this.Nose = new ModelRenderer(this, 49, 8);
            this.Nose.setPos(0.0F, 0.1F, -0.1F);
            this.Nose.addBox(-0.5F, -0.9F, -2.0F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Nose, 0.18203784630933073F, 0.0F, 0.0F);
            this.ForearmLeft = new ModelRenderer(this, 31, 33);
            this.ForearmLeft.setPos(-0.01F, 1.6F, -2.0F);
            this.ForearmLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmLeft, -0.05235987755982988F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 40, 9);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-1.8F, -0.7F, 1.2F);
            this.EarRight.addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.0911061832922575F, 0.46216317793861517F, -0.18203784630933073F);
            this.ThighRight = new ModelRenderer(this, 27, 14);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-1.6F, 0.6F, 1.2F);
            this.ThighRight.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.2275909337942703F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 17, 0);
            this.Neck.setPos(0.0F, -2.5F, -2.0F);
            this.Neck.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.35185837453889574F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 22, 30);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.0F, 2.7F, -1.5F);
            this.FootRight.addBox(-1.0F, 0.0F, -1.3F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 56, 25);
            this.Tail2.setPos(-0.01F, 0.0F, 2.5F);
            this.Tail2.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, 0.27314402127920984F, 0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 19, 35);
            this.ArmBaseRight.setPos(-1.7F, -1.0F, -0.5F);
            this.ArmBaseRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.162315623764424F, 0.0F, 0.0F);
            this.part2_1 = new ModelRenderer(this, 36, 0);
            this.part2_1.setPos(-1.4F, 0.0F, 0.3F);
            this.part2_1.addBox(-1.0F, 0.0F, -2.5F, 2.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(part2_1, 0.0781907508222411F, 0.0F, -0.11728612207217244F);
            this.Head = new ModelRenderer(this, 48, 0);
            this.Head.setPos(0.0F, 2.5F, -2.0F);
            this.Head.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.5864306020384839F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 50, 13);
            this.Mouth.setPos(0.0F, 1.5F, -1.4F);
            this.Mouth.addBox(-0.5F, -0.5F, -1.7F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.11728612207217244F, 0.0F, 0.0F);
            this.ThighRight.addChild(this.UpperLegRight);
            this.Chest.addChild(this.ArmBaseLeft);
            this.Chest.addChild(this.Body);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.Body.addChild(this.Hips);
            this.ArmBaseLeft.addChild(this.UpperArmLeft);
            this.ForearmRight.addChild(this.HandRight);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.Hips.addChild(this.ThighLeft);
            this.ForearmLeft.addChild(this.HandLeft);
            this.ArmBaseRight.addChild(this.UpperArmRight);
            this.Hips.addChild(this.Tail1);
            this.Head.addChild(this.part2);
            this.Head.addChild(this.EarLeft);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.UpperArmRight.addChild(this.ForearmRight);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.Head.addChild(this.Snout);
            this.Snout.addChild(this.Nose);
            this.UpperArmLeft.addChild(this.ForearmLeft);
            this.Head.addChild(this.EarRight);
            this.Hips.addChild(this.ThighRight);
            this.Chest.addChild(this.Neck);
            this.LowerLegRight.addChild(this.FootRight);
            this.Tail1.addChild(this.Tail2);
            this.Chest.addChild(this.ArmBaseRight);
            this.Head.addChild(this.part2_1);
            this.Neck.addChild(this.Head);
            this.Head.addChild(this.Mouth);
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
            this.Neck.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * -0.1F * limbSwingAmount * 0.5F - 0.351F;
            this.Head.xRot = MathHelper.cos(limbSwing * speed * 0.1F + 3.1415927F) * degree * -0.1F * limbSwingAmount * 0.5F + 0.586F;
            this.Tail1.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * 0.1F * limbSwingAmount * 0.5F - 0.942F;
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
                this.ArmBaseLeft.xRot = MathHelper.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * 5.5F * limbSwingAmount * 0.5F + 0.162F;
                this.ForearmLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F - 0.052F;
                this.HandLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.0F + 3.1415927F) * degree * -4.0F * limbSwingAmount * 0.5F + 0.078F;
                this.ArmBaseRight.xRot = MathHelper.cos(1.5F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 5.5F * limbSwingAmount * 0.5F + 0.162F;
                this.ForearmRight.xRot = MathHelper.cos(5.5F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F - 0.052F;
                this.HandRight.xRot = MathHelper.cos(2.5F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -4.0F * limbSwingAmount * 0.5F + 0.078F;

                this.ThighLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -4.0F * limbSwingAmount * 0.5F + 0.227F;
                this.UpperLegLeft.xRot = MathHelper.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.683F;
                this.LowerLegLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F - 0.683F;
                this.FootLeft.xRot = MathHelper.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * -4.0F * limbSwingAmount * 0.5F + 0.5F;
                this.ThighRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -4.0F * limbSwingAmount * 0.5F + 0.227F;
                this.UpperLegRight.xRot = MathHelper.cos(4.5F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 3.0F * limbSwingAmount * 0.5F + 0.683F;
                this.LowerLegRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F - 0.683F;
                this.FootRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -4.0F * limbSwingAmount * 0.5F;

                this.Chest.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -0.7F * limbSwingAmount * 0.5F - 0.117F;
                this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.0F * limbSwingAmount * 0.5F + 0.117F;
                this.Hips.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F - 0.235F;
                this.Neck.xRot = MathHelper.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.2F * limbSwingAmount * 0.5F - 0.351F;
                this.Head.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -0.5F * limbSwingAmount * 0.5F + 0.586F;
                this.Head.z = MathHelper.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * 4.0F * limbSwingAmount * 0.5F + 0.02F;
                this.Chest.y = MathHelper.cos(6.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -8.0F * limbSwingAmount * 0.5F + 18.1F;

                this.Tail1.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F - 0.942F;
                this.Tail2.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.273F;
                this.Mouth.xRot = MathHelper.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * 0.5F * limbSwingAmount * 0.5F - 0.117F;

            } else {
                this.ArmBaseLeft.xRot = MathHelper.cos(limbSwing * speed * 0.2F + 3.1415927F) * degree * 1.5F * limbSwingAmount * 0.5F + 0.162F;
                this.ForearmLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F - 0.052F;
                this.HandLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.078F;
                this.ArmBaseRight.xRot = MathHelper.cos(limbSwing * speed * 0.2F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F + 0.162F;
                this.ForearmRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F - 0.052F;
                this.HandRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.078F;

                this.Neck.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.4F + 3.1415927F) * degree * -0.1F * limbSwingAmount * 0.5F - 0.351F;
                this.Head.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.4F + 3.1415927F) * degree * -0.1F * limbSwingAmount * 0.5F + (this.isSwimming ? -1.2F : + 0.586F);

                this.ThighLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F + 0.227F;
                this.UpperLegLeft.xRot = MathHelper.cos(limbSwing * speed * 0.2F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F + 0.683F;
                this.LowerLegLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F - 0.683F;
                this.FootLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F;
                this.ThighRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.227F;
                this.UpperLegRight.xRot = MathHelper.cos(limbSwing * speed * 0.2F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.683F;
                this.LowerLegRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F - 0.683F;
                this.FootRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F;

                this.Chest.xRot = MathHelper.cos(limbSwing * speed * 0.4F + 3.1415927F) * degree * 0.1F * limbSwingAmount * 0.5F - 0.117F;
                this.Body.xRot = MathHelper.cos(limbSwing * speed * 0.4F + 3.1415927F) * degree * -0.1F * limbSwingAmount * 0.5F + 0.117F;

                this.Tail1.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.4F + 3.1415927F) * degree * 0.3F * limbSwingAmount * 0.5F - 0.942F;
                this.Tail2.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F + 3.1415927F) * degree * 0.4F * limbSwingAmount * 0.5F + 0.273F;

                this.Chest.y = MathHelper.cos(2.0F + limbSwing * speed * 0.4F + 3.1415927F) * degree * 1.0F * limbSwingAmount * 0.5F + 18.1F;
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

