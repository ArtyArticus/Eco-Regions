package com.github.artyarticus.ecoregions.client.model;

import com.github.artyarticus.ecoregions.entity.AoudadEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class AoudadModel extends ZawaBaseModel<AoudadEntity> {
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

    public static class Adult extends AoudadModel {

        public ModelRenderer Body;
        public ModelRenderer Neck;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer Hips;
        public ModelRenderer ThighLeft;
        public ModelRenderer Tail1;
        public ModelRenderer ThighRight;
        public ModelRenderer UpperLegLeft;
        public ModelRenderer LowerLegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer Tail2;
        public ModelRenderer UpperLegRight;
        public ModelRenderer LowerLegRight;
        public ModelRenderer FootRight;
        public ModelRenderer NeckLower;
        public ModelRenderer Head;
        public ModelRenderer Mane1;
        public ModelRenderer Mane2;
        public ModelRenderer Snout;
        public ModelRenderer EarLeft;
        public ModelRenderer HornLeft1;
        public ModelRenderer HornRight1;
        public ModelRenderer EarRight;
        public ModelRenderer shape36;
        public ModelRenderer Nose;
        public ModelRenderer Beard;
        public ModelRenderer HornLeft2;
        public ModelRenderer HornLeftMale3;
        public ModelRenderer HornLeftFemale3;
        public ModelRenderer HornLeftMale4;
        public ModelRenderer HornLeftMale5;
        public ModelRenderer HornLeftFemale4;
        public ModelRenderer HornLeftFemale5;
        public ModelRenderer HornRight2;
        public ModelRenderer HornRightMale3;
        public ModelRenderer HornRightFemale3;
        public ModelRenderer HornRightMale4;
        public ModelRenderer HornRightMale5;
        public ModelRenderer HornRightFemale4;
        public ModelRenderer HornRightFemale5;
        public ModelRenderer UpperArmLeft;
        public ModelRenderer ArmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer UpperArmRight;
        public ModelRenderer ArmRight;
        public ModelRenderer HandRight;

        public Adult() {
            this.texWidth = 64;
            this.texHeight = 128;
            this.HornLeftFemale5 = new ModelRenderer(this, 49, 64);
            this.HornLeftFemale5.mirror = true;
            this.HornLeftFemale5.setPos(0.05F, -3.0F, 0.5F);
            this.HornLeftFemale5.addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HornLeftFemale5, -0.591841146688116F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 46, 35);
            this.ArmRight.setPos(0.05F, 2.8F, -2.0F);
            this.ArmRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Nose = new ModelRenderer(this, 19, 46);
            this.Nose.setPos(0.0F, -1.3F, -0.4F);
            this.Nose.addBox(-1.0F, 0.0F, -4.0F, 2.0F, 2.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Nose, 0.27314402127920984F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 19, 54);
            this.UpperLegLeft.mirror = true;
            this.UpperLegLeft.setPos(0.0F, 7.4F, -0.5F);
            this.UpperLegLeft.addBox(-1.0F, 0.0F, -0.5F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.8196066007575706F, 0.0F, 0.0F);
            this.HornLeftFemale3 = new ModelRenderer(this, 53, 63);
            this.HornLeftFemale3.mirror = true;
            this.HornLeftFemale3.setPos(0.05F, -2.0F, 0.0F);
            this.HornLeftFemale3.addBox(-1.0F, -3.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HornLeftFemale3, -0.591841146688116F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 0, 49);
            this.ThighLeft.mirror = true;
            this.ThighLeft.setPos(2.6F, 0.8F, 3.0F);
            this.ThighLeft.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 8.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.17453292519943295F, 0.0F, 0.0F);
            this.NeckLower = new ModelRenderer(this, 30, 20);
            this.NeckLower.setPos(0.0F, 1.5F, -4.4F);
            this.NeckLower.addBox(-1.5F, -6.0F, 0.0F, 3.0F, 8.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckLower, -0.3186971254089062F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 22, 34);
            this.ArmBaseLeft.mirror = true;
            this.ArmBaseLeft.setPos(2.4F, -0.3F, -0.6F);
            this.ArmBaseLeft.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.2275909337942703F, 0.0F, 0.0F);
            this.HornLeftMale3 = new ModelRenderer(this, 53, 43);
            this.HornLeftMale3.mirror = true;
            this.HornLeftMale3.setPos(0.05F, -2.0F, 0.0F);
            this.HornLeftMale3.addBox(-1.0F, -4.0F, 0.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HornLeftMale3, -0.591841146688116F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 50, 52);
            this.Tail1.setPos(0.0F, 0.3F, 6.0F);
            this.Tail1.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, 0.8136724786376288F, 0.0F, 0.0F);
            this.HornLeftMale4 = new ModelRenderer(this, 40, 48);
            this.HornLeftMale4.mirror = true;
            this.HornLeftMale4.setPos(-0.05F, -4.0F, 0.0F);
            this.HornLeftMale4.addBox(-0.5F, -4.0F, 0.0F, 1.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HornLeftMale4, -0.8196066007575706F, 0.0F, 0.0F);
            this.HornLeft2 = new ModelRenderer(this, 44, 43);
            this.HornLeft2.mirror = true;
            this.HornLeft2.setPos(-0.05F, -1.9F, 0.0F);
            this.HornLeft2.addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HornLeft2, -0.45535640450848164F, 0.0F, 0.0911061832922575F);
            this.HandLeft = new ModelRenderer(this, 55, 37);
            this.HandLeft.mirror = true;
            this.HandLeft.setPos(-0.1F, 2.9F, 0.8F);
            this.HandLeft.addBox(-1.0F, -0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 50, 52);
            this.Tail2.setPos(0.0F, 3.0F, 0.0F);
            this.Tail2.addBox(-1.05F, 0.0F, -3.0F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, -0.5082398928281348F, 0.0F, 0.0F);
            this.HornRightFemale4 = new ModelRenderer(this, 55, 68);
            this.HornRightFemale4.setPos(0.05F, -3.0F, 0.0F);
            this.HornRightFemale4.addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HornRightFemale4, -0.8196066007575706F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 0, 38);
            this.Head.setPos(0.0F, -5.0F, -1.0F);
            this.Head.addBox(-2.5F, -3.0F, -2.0F, 5.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, -0.7604399497676072F, 0.0F, 0.0F);
            this.UpperArmRight = new ModelRenderer(this, 35, 65);
            this.UpperArmRight.setPos(0.0F, 5.8F, 1.0F);
            this.UpperArmRight.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmRight, -0.08726646259971647F, 0.0F, 0.0F);
            this.HornRightFemale3 = new ModelRenderer(this, 53, 63);
            this.HornRightFemale3.setPos(-0.05F, -2.0F, 0.0F);
            this.HornRightFemale3.addBox(-1.0F, -3.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HornRightFemale3, -0.591841146688116F, 0.0F, 0.0F);
            this.Mane2 = new ModelRenderer(this, 19, 64);
            this.Mane2.setPos(-0.0F, 9.0F, -7.0F);
            this.Mane2.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 6.0F, 6.0F, -0.05F, 0.0F, 0.0F);
            this.setRotateAngle(Mane2, 0.8196066007575706F, 0.0F, 0.0F);
            this.HornRightMale3 = new ModelRenderer(this, 53, 43);
            this.HornRightMale3.setPos(-0.05F, -2.0F, 0.0F);
            this.HornRightMale3.addBox(-1.0F, -4.0F, 0.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HornRightMale3, -0.591841146688116F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 16);
            this.Hips.setPos(0.0F, -9.0F, 8.0F);
            this.Hips.addBox(-3.0F, 0.0F, 0.0F, 6.0F, 8.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.3665191429188092F, 0.0F, 0.0F);
            this.Mane1 = new ModelRenderer(this, 0, 63);
            this.Mane1.setPos(0.0F, -2.5F, 7.0F);
            this.Mane1.addBox(-1.0F, 0.0F, -7.0F, 2.0F, 9.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mane1, -0.6829473549475088F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 55, 37);
            this.HandRight.setPos(0.1F, 2.9F, 0.8F);
            this.HandRight.addBox(-1.0F, -0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 15, 37);
            this.EarLeft.mirror = true;
            this.EarLeft.setPos(2.0F, -1.3F, 0.6F);
            this.EarLeft.addBox(-1.0F, -3.0F, 0.0F, 2.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, -0.591841146688116F, -0.0911061832922575F, 1.0016444470669013F);
            this.HornRight1 = new ModelRenderer(this, 35, 43);
            this.HornRight1.setPos(-1.1F, -2.9F, -1.5F);
            this.HornRight1.addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HornRight1, -0.500909508638178F, -0.4098033003787853F, -0.04555309164612875F);
            this.Beard = new ModelRenderer(this, 0, 0);
            this.Beard.setPos(0.0F, 0.5F, -1.2F);
            this.Beard.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Beard, -0.3909537457888271F, 0.0F, 0.0F);
            this.HornRight2 = new ModelRenderer(this, 44, 43);
            this.HornRight2.setPos(0.05F, -1.9F, 0.0F);
            this.HornRight2.addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HornRight2, -0.45535640450848164F, 0.0F, -0.0911061832922575F);
            this.EarRight = new ModelRenderer(this, 15, 37);
            this.EarRight.setPos(-2.0F, -1.3F, 0.6F);
            this.EarRight.addBox(-1.0F, -3.0F, 0.0F, 2.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, -0.591841146688116F, 0.0911061832922575F, -1.0016444470669013F);
            this.FootLeft = new ModelRenderer(this, 41, 58);
            this.FootLeft.mirror = true;
            this.FootLeft.setPos(-0.1F, 6.0F, -1.4F);
            this.FootLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 0.2275909337942703F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 41, 58);
            this.FootRight.setPos(0.1F, 6.0F, -1.4F);
            this.FootRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, 0.2275909337942703F, 0.0F, 0.0F);
            this.LowerLegLeft = new ModelRenderer(this, 32, 53);
            this.LowerLegLeft.mirror = true;
            this.LowerLegLeft.setPos(-0.05F, 4.0F, 1.5F);
            this.LowerLegLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 7.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.956091342937205F, 0.0F, 0.0F);
            this.HornLeft1 = new ModelRenderer(this, 35, 43);
            this.HornLeft1.mirror = true;
            this.HornLeft1.setPos(1.1F, -2.9F, -1.5F);
            this.HornLeft1.addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HornLeft1, -0.500909508638178F, 0.3642502295386026F, 0.04555309164612875F);
            this.LowerLegRight = new ModelRenderer(this, 32, 53);
            this.LowerLegRight.setPos(0.05F, 4.0F, 1.5F);
            this.LowerLegRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 7.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.956091342937205F, 0.0F, 0.0F);
            this.UpperArmLeft = new ModelRenderer(this, 35, 65);
            this.UpperArmLeft.mirror = true;
            this.UpperArmLeft.setPos(0.0F, 5.8F, 1.0F);
            this.UpperArmLeft.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmLeft, -0.08726646259971647F, 0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 22, 34);
            this.ArmBaseRight.setPos(-2.4F, -0.3F, -0.6F);
            this.ArmBaseRight.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.2275909337942703F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 0, 30);
            this.Snout.setPos(0.0F, -0.5F, -1.6F);
            this.Snout.addBox(-1.5F, 0.0F, -4.0F, 3.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.3574434228189554F, 0.0F, 0.0F);
            this.HornRightFemale5 = new ModelRenderer(this, 49, 64);
            this.HornRightFemale5.setPos(-0.05F, -3.0F, 0.5F);
            this.HornRightFemale5.addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HornRightFemale5, -0.591841146688116F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 46, 35);
            this.ArmLeft.mirror = true;
            this.ArmLeft.setPos(-0.05F, 2.8F, -2.0F);
            this.ArmLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 27, 1);
            this.Body.setPos(0.0F, 4.0F, 3.0F);
            this.Body.addBox(-4.0F, -9.0F, 0.0F, 8.0F, 9.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.20943951023931953F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 0, 49);
            this.ThighRight.setPos(-2.6F, 0.8F, 3.0F);
            this.ThighRight.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 8.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.17453292519943295F, 0.0F, 0.0F);
            this.HornRightMale5 = new ModelRenderer(this, 49, 48);
            this.HornRightMale5.setPos(0.01F, -4.0F, 0.5F);
            this.HornRightMale5.addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HornRightMale5, -0.591841146688116F, 0.0F, 0.0F);
            this.shape36 = new ModelRenderer(this, 15, 30);
            this.shape36.setPos(0.0F, 1.9F, -1.7F);
            this.shape36.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(shape36, -0.18203784630933073F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 0);
            this.Chest.setPos(0.0F, 11.0F, -6.1F);
            this.Chest.addBox(-3.5F, -5.0F, -3.0F, 7.0F, 9.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.13962634015954636F, 0.0F, 0.0F);
            this.HornLeftFemale4 = new ModelRenderer(this, 55, 68);
            this.HornLeftFemale4.mirror = true;
            this.HornLeftFemale4.setPos(-0.05F, -3.0F, 0.0F);
            this.HornLeftFemale4.addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HornLeftFemale4, -0.8196066007575706F, 0.0F, 0.0F);
            this.HornRightMale4 = new ModelRenderer(this, 40, 48);
            this.HornRightMale4.setPos(0.05F, -4.0F, 0.0F);
            this.HornRightMale4.addBox(-0.5F, -4.0F, 0.0F, 1.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HornRightMale4, -0.8196066007575706F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 19, 54);
            this.UpperLegRight.setPos(0.0F, 7.4F, -0.5F);
            this.UpperLegRight.addBox(-1.0F, 0.0F, -0.5F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.8196066007575706F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 46, 20);
            this.Neck.setPos(0.0F, -2.5F, -3.2F);
            this.Neck.addBox(-2.0F, -6.5F, -2.0F, 4.0F, 9.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, 1.092750655326294F, 0.0F, 0.0F);
            this.HornLeftMale5 = new ModelRenderer(this, 49, 48);
            this.HornLeftMale5.mirror = true;
            this.HornLeftMale5.setPos(-0.01F, -4.0F, 0.5F);
            this.HornLeftMale5.addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HornLeftMale5, -0.591841146688116F, 0.0F, 0.0F);
            this.HornLeftFemale4.addChild(this.HornLeftFemale5);
            this.UpperArmRight.addChild(this.ArmRight);
            this.Snout.addChild(this.Nose);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.HornLeft2.addChild(this.HornLeftFemale3);
            this.Hips.addChild(this.ThighLeft);
            this.Neck.addChild(this.NeckLower);
            this.Chest.addChild(this.ArmBaseLeft);
            this.HornLeft2.addChild(this.HornLeftMale3);
            this.Hips.addChild(this.Tail1);
            this.HornLeftMale3.addChild(this.HornLeftMale4);
            this.HornLeft1.addChild(this.HornLeft2);
            this.ArmLeft.addChild(this.HandLeft);
            this.Tail1.addChild(this.Tail2);
            this.HornRightFemale3.addChild(this.HornRightFemale4);
            this.Neck.addChild(this.Head);
            this.ArmBaseRight.addChild(this.UpperArmRight);
            this.HornRight2.addChild(this.HornRightFemale3);
            this.Mane1.addChild(this.Mane2);
            this.HornRight2.addChild(this.HornRightMale3);
            this.Body.addChild(this.Hips);
            this.NeckLower.addChild(this.Mane1);
            this.ArmRight.addChild(this.HandRight);
            this.Head.addChild(this.EarLeft);
            this.Head.addChild(this.HornRight1);
            this.shape36.addChild(this.Beard);
            this.HornRight1.addChild(this.HornRight2);
            this.Head.addChild(this.EarRight);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.LowerLegRight.addChild(this.FootRight);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.Head.addChild(this.HornLeft1);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.ArmBaseLeft.addChild(this.UpperArmLeft);
            this.Chest.addChild(this.ArmBaseRight);
            this.Head.addChild(this.Snout);
            this.HornRightFemale4.addChild(this.HornRightFemale5);
            this.UpperArmLeft.addChild(this.ArmLeft);
            this.Chest.addChild(this.Body);
            this.Hips.addChild(this.ThighRight);
            this.HornRightMale4.addChild(this.HornRightMale5);
            this.Snout.addChild(this.shape36);
            this.HornLeftFemale3.addChild(this.HornLeftFemale4);
            this.HornRightMale3.addChild(this.HornRightMale4);
            this.ThighRight.addChild(this.UpperLegRight);
            this.Chest.addChild(this.Neck);
            this.HornLeftMale4.addChild(this.HornLeftMale5);
            this.saveBase();
        }

        @Override
        public void setupAnim(AoudadEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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
            this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 0.17F;
            this.Head.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F + 0.05F;

            this.Tail1.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.48F;
            this.Tail2.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.6F) * 0.5F - 0.31F;
            this.Tail1.zRot = MathHelper.cos(1.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
            this.Tail2.zRot = MathHelper.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.6F) * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (entity.isSprinting()) {
                float speed = 1.0f;
                float degree = 0.5f;


            } else {
                float speed = 1.25f;
                float degree = 0.6f;
                this.Neck.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 0.17F;
                this.Head.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.05F;

                this.Chest.y = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -1F) * 0.5F + 14.6F;
                this.Chest.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.1F) * 0.5F + 0.03F;
                this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F - 0.03F;
                this.Hips.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.23F;

                this.ArmBaseLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.6F) * 0.5F + 0.09F;
                this.UpperArmLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.09F;
               // this.LowerArmLeft.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree) * 0.5F - 0.04F;
                this.HandLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;
                this.ArmBaseRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.6F) * 0.5F + 0.09F;
                this.UpperArmRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.09F;
                //this.LowerArmRight.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1F) * 0.5F - 0.04F;
                this.HandRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;

                this.ThighLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.3F) * 0.5F;
                this.UpperLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.44F;
                this.LowerLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.35F;
                this.FootLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.14F;
                this.ThighRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.3F) * 0.5F;
                this.UpperLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.44F;
                this.LowerLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.35F;
                this.FootRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.14F;
            }
        }
    }


    public static class Child extends AoudadModel {

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
        public void setupAnim(AoudadEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.4F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.17F;
            this.Head.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F + 0.4F;

            this.Tail.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.43F;
            this.Tail.zRot = MathHelper.cos(1.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.2f;
            float degree = 0.8f;
            this.Neck.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.15F) * 0.5F - 0.17F;
            this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.4F;
            this.Chest.y = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 18.3F;
            this.Chest.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F - 0.12F;
            this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.21F;
            this.ArmBaseLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -0.9F) * 0.5F + 0.23F;
            this.ArmLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.12F;
            this.ForearmLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F + 0.017F;
            this.HandLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;
            this.ArmBaseRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.9F) * 0.5F + 0.23F;
            this.ArmRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.12F;
            this.ForearmRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F + 0.017F;
            this.HandRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;
            this.ThighLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.3F) * 0.5F + 0.26F;
            this.UpperLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.7F;
            this.LowerLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.7F;
            this.FootLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F;
            this.ThighRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.3F) * 0.5F + 0.26F;
            this.UpperLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.7F;
            this.LowerLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.7F;
            this.FootRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F;
        }
    }
}

