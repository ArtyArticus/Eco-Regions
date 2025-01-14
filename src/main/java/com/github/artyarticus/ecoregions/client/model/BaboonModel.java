package com.github.artyarticus.ecoregions.client.model;

import com.github.artyarticus.ecoregions.entity.BaboonEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;
import org.zawamod.zawa.client.model.ZawaModelRenderer;

public abstract class BaboonModel extends ZawaBaseModel<BaboonEntity> {
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

    public static class Adult extends BaboonModel {

        public ModelRenderer Neck;
        public ModelRenderer Body;
        public ModelRenderer MaleShoulderRight;
        public ModelRenderer ArmLeft;
        public ModelRenderer ArmRight;
        public ModelRenderer Head;
        public ModelRenderer Face;
        public ModelRenderer TuftLeft;
        public ModelRenderer TuftRight;
        public ModelRenderer EarLeft;
        public ModelRenderer EarRight;
        public ModelRenderer Hair;
        public ModelRenderer Snout;
        public ModelRenderer TopSnout;
        public ModelRenderer Lips;
        public ModelRenderer Mouth;
        public ModelRenderer Hips;
        public ModelRenderer TailBase;
        public ModelRenderer ThightLeft;
        public ModelRenderer ThightRight;
        public ModelRenderer Tail1;
        public ModelRenderer Tail2;
        public ModelRenderer Tail3;
        public ModelRenderer LegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer LegRight;
        public ModelRenderer FootRight;
        public ModelRenderer MaleBack;
        public ModelRenderer MaleShoulderLeft;
        public ModelRenderer ForearmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer ThumbLeft;
        public ModelRenderer ForearmRight;
        public ModelRenderer HandRight;
        public ModelRenderer ThumbRight;

        public Adult() {
            this.texWidth = 128;
            this.texHeight = 128;
            this.ForearmLeft = new ModelRenderer(this, 0, 67);
            this.ForearmLeft.setPos(-0.6F, 6.5F, 1.5F);
            this.ForearmLeft.addBox(-1.5F, 0.0F, -3.0F, 3.0F, 7.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmLeft, -0.3186971254089062F, 0.0F, 0.13665927909957545F);
            this.ThightLeft = new ModelRenderer(this, 79, 16);
            this.ThightLeft.setPos(2.1F, 2.0F, 4.3F);
            this.ThightLeft.addBox(-2.0F, 0.0F, -4.0F, 4.0F, 9.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThightLeft, -0.03909537541112055F, 0.0F, 0.0F);
            this.MaleShoulderLeft = new ModelRenderer(this, 98, 48);
            this.MaleShoulderLeft.setPos(0.0F, 0.0F, 0.0F);
            this.MaleShoulderLeft.addBox(-1.0F, -1.2F, -2.5F, 7.0F, 13.0F, 8.0F, 0.1F, 0.0F, 0.0F);
            this.setRotateAngle(MaleShoulderLeft, 0.0F, 0.0F, -0.3127630032889644F);
            this.EarRight = new ModelRenderer(this, 0, 0);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-2.0F, 0.0F, 0.0F);
            this.EarRight.addBox(-1.0F, -2.0F, 0.0F, 1.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.1563815016444822F, -0.3909537457888271F, 0.0F);
            this.Hair = new ModelRenderer(this, 25, 42);
            this.Hair.setPos(0.0F, -0.6F, 0.0F);
            this.Hair.addBox(-2.0F, -1.5F, -1.0F, 4.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hair, -0.0911061832922575F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 101, 33);
            this.Hips.setPos(0.0F, 0.0F, 5.0F);
            this.Hips.addBox(-3.5F, 0.0F, 0.0F, 7.0F, 8.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.1429424584146426F, 0.0F, 0.0F);
            this.Lips = new ModelRenderer(this, 21, 23);
            this.Lips.setPos(0.0F, 1.8F, -0.6F);
            this.Lips.addBox(-1.5F, 0.0F, -3.2F, 3.0F, 1.0F, 4.0F, 0.1F, 0.0F, 0.0F);
            this.setRotateAngle(Lips, -0.27314402127920984F, 0.0F, 0.0F);
            this.ThumbLeft = new ModelRenderer(this, 0, 86);
            this.ThumbLeft.setPos(-1.5F, -0.9F, -0.5F);
            this.ThumbLeft.addBox(0.0F, 0.0F, -3.0F, 1.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThumbLeft, 0.0F, 0.2275909337942703F, 0.0F);
            this.ForearmRight = new ModelRenderer(this, 0, 67);
            this.ForearmRight.mirror = true;
            this.ForearmRight.setPos(-0.4F, 6.5F, 1.5F);
            this.ForearmRight.addBox(-1.5F, 0.0F, -3.0F, 3.0F, 7.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmRight, -0.3186971254089062F, 0.0F, -0.13665927909957545F);
            this.MaleBack = new ModelRenderer(this, 90, 69);
            this.MaleBack.setPos(0.0F, -1.3F, 6.0F);
            this.MaleBack.addBox(-6.0F, 0.0F, -1.5F, 11.0F, 9.0F, 8.0F, -0.01F, 0.0F, 0.0F);
            this.setRotateAngle(MaleBack, -0.058468528277334356F, 0.0F, -0.1563815016444822F);
            this.HandLeft = new ModelRenderer(this, 0, 79);
            this.HandLeft.setPos(0.0F, 7.0F, -0.5F);
            this.HandLeft.addBox(-1.5F, -1.0F, -5.0F, 3.0F, 2.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.0F, 0.0F, -0.13665927909957545F);
            this.TopSnout = new ModelRenderer(this, 34, 20);
            this.TopSnout.setPos(0.0F, -0.3F, -4.0F);
            this.TopSnout.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 4.0F, -0.2F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.2275909337942703F, 0.0F, 0.0F);
            this.LegLeft = new ModelRenderer(this, 82, 32);
            this.LegLeft.setPos(0.0F, 8.5F, -3.5F);
            this.LegLeft.addBox(-1.5F, 0.0F, -0.5F, 3.0F, 8.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, 0.3642502295386026F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 98, 0);
            this.Chest.setPos(0.0F, 10.5F, 0.0F);
            this.Chest.addBox(-3.5F, -5.0F, -4.0F, 7.0F, 10.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.04555309164612875F, 0.0F, 0.0F);
            this.TuftLeft = new ModelRenderer(this, 73, 1);
            this.TuftLeft.mirror = true;
            this.TuftLeft.setPos(2.2F, -1.5F, 0.3F);
            this.TuftLeft.addBox(-2.0F, -3.0F, -2.5F, 5.0F, 9.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TuftLeft, 0.0F, -0.18203784630933073F, -0.0712094321497881F);
            this.ThightRight = new ModelRenderer(this, 79, 16);
            this.ThightRight.mirror = true;
            this.ThightRight.setPos(-2.1F, 2.0F, 4.3F);
            this.ThightRight.addBox(-2.0F, 0.0F, -4.0F, 4.0F, 9.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThightRight, -0.03909537541112055F, 0.0F, 0.0F);
            this.Face = new ModelRenderer(this, 49, 5);
            this.Face.setPos(0.0F, -1.7F, -3.0F);
            this.Face.addBox(-2.5F, -1.0F, -0.5F, 5.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 22, 18);
            this.Snout.setPos(0.0F, 2.4F, 0.5F);
            this.Snout.addBox(-1.5F, 0.0F, -3.6F, 3.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.45535640450848164F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 0, 0);
            this.EarLeft.setPos(2.0F, 0.0F, 0.0F);
            this.EarLeft.addBox(0.0F, -2.0F, 0.0F, 1.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.1563815016444822F, 0.3909537457888271F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 0, 34);
            this.Tail2.setPos(0.0F, 0.05F, 4.95F);
            this.Tail2.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 5.0F, 0.0F, 0.0F, 0.3F);
            this.setRotateAngle(Tail2, -0.8784242444866791F, 0.0F, 0.0F);
            this.TuftRight = new ModelRenderer(this, 73, 1);
            this.TuftRight.setPos(-2.2F, -1.5F, 0.3F);
            this.TuftRight.addBox(-3.0F, -3.0F, -2.5F, 5.0F, 9.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TuftRight, 0.0F, 0.18203784630933073F, 0.0712094321497881F);
            this.MaleShoulderRight = new ModelRenderer(this, 98, 48);
            this.MaleShoulderRight.mirror = true;
            this.MaleShoulderRight.setPos(0.0F, -4.8F, -1.7F);
            this.MaleShoulderRight.addBox(-6.0F, -1.2F, -2.5F, 7.0F, 13.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(MaleShoulderRight, -0.01972222046431214F, 0.0F, 0.1563815016444822F);
            this.FootRight = new ModelRenderer(this, 79, 45);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.0F, 7.0F, 1.5F);
            this.FootRight.addBox(-2.0F, -0.2F, -4.5F, 4.0F, 2.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, -0.18203784630933073F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 0, 79);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.0F, 7.0F, -0.5F);
            this.HandRight.addBox(-1.5F, -1.0F, -5.0F, 3.0F, 2.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.0F, 0.0F, 0.13665927909957545F);
            this.Body = new ModelRenderer(this, 102, 18);
            this.Body.setPos(0.0F, -5.0F, 4.1F);
            this.Body.addBox(-3.0F, 0.0F, -1.0F, 6.0F, 9.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.0911061832922575F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 23, 28);
            this.Mouth.setPos(0.0F, 0.5F, -3.0F);
            this.Mouth.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 3.0F, 0.1F, 0.3F, 0.0F);
            this.setRotateAngle(Mouth, -0.21537363235926135F, 0.0F, 0.0F);
            this.TailBase = new ModelRenderer(this, 0, 18);
            this.TailBase.setPos(0.0F, 0.7F, 6.0F);
            this.TailBase.addBox(-1.5F, -1.8F, -1.5F, 3.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailBase, 0.6829473549475088F, 0.0F, 0.0F);
            this.ThumbRight = new ModelRenderer(this, 0, 86);
            this.ThumbRight.mirror = true;
            this.ThumbRight.setPos(1.5F, -0.9F, -0.5F);
            this.ThumbRight.addBox(-1.0F, 0.0F, -3.0F, 1.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThumbRight, 0.0F, -0.2275909337942703F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 0, 55);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(-2.5F, 0.0F, -2.0F);
            this.ArmRight.addBox(-2.0F, 0.0F, -2.0F, 3.0F, 7.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, 0.37716566200861895F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 0, 26);
            this.Tail1.setPos(0.0F, -1.4F, 2.2F);
            this.Tail1.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 5.0F, 0.01F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -0.9169960049767872F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 79, 45);
            this.FootLeft.setPos(0.0F, 7.0F, 1.5F);
            this.FootLeft.addBox(-2.0F, -0.2F, -4.5F, 4.0F, 2.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, -0.18203784630933073F, 0.0F, 0.0F);
            this.LegRight = new ModelRenderer(this, 82, 32);
            this.LegRight.mirror = true;
            this.LegRight.setPos(0.0F, 8.5F, -3.5F);
            this.LegRight.addBox(-1.5F, 0.0F, -0.5F, 3.0F, 8.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, 0.3642502295386026F, 0.0F, 0.0F);
            this.Tail3 = new ModelRenderer(this, 0, 42);
            this.Tail3.setPos(0.0F, 0.0F, 5.0F);
            this.Tail3.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 8.0F, 0.1F, 0.1F, 0.0F);
            this.setRotateAngle(Tail3, -0.37716566200861895F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 24, 0);
            this.Head.setPos(0.0F, 2.0F, -2.0F);
            this.Head.addBox(-3.0F, -3.5F, -3.0F, 6.0F, 7.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.7611380974473714F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 0, 55);
            this.ArmLeft.setPos(3.5F, 0.0F, -2.0F);
            this.ArmLeft.addBox(-2.0F, 0.0F, -2.0F, 3.0F, 7.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, 0.37716566200861895F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 0, 0);
            this.Neck.setPos(0.0F, -5.0F, -4.0F);
            this.Neck.addBox(-2.0F, -1.7F, -3.1F, 4.0F, 7.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.591841146688116F, 0.0F, 0.0F);
            this.ArmLeft.addChild(this.ForearmLeft);
            this.Hips.addChild(this.ThightLeft);
            this.MaleShoulderRight.addChild(this.MaleShoulderLeft);
            this.Head.addChild(this.EarRight);
            this.Face.addChild(this.Hair);
            this.Body.addChild(this.Hips);
            this.Snout.addChild(this.Lips);
            this.HandLeft.addChild(this.ThumbLeft);
            this.ArmRight.addChild(this.ForearmRight);
            this.MaleShoulderRight.addChild(this.MaleBack);
            this.ForearmLeft.addChild(this.HandLeft);
            this.Snout.addChild(this.TopSnout);
            this.ThightLeft.addChild(this.LegLeft);
            this.Head.addChild(this.TuftLeft);
            this.Hips.addChild(this.ThightRight);
            this.Head.addChild(this.Face);
            this.Face.addChild(this.Snout);
            this.Head.addChild(this.EarLeft);
            this.Tail1.addChild(this.Tail2);
            this.Head.addChild(this.TuftRight);
            this.Chest.addChild(this.MaleShoulderRight);
            this.LegRight.addChild(this.FootRight);
            this.ForearmRight.addChild(this.HandRight);
            this.Chest.addChild(this.Body);
            this.Lips.addChild(this.Mouth);
            this.Hips.addChild(this.TailBase);
            this.HandRight.addChild(this.ThumbRight);
            this.Chest.addChild(this.ArmRight);
            this.TailBase.addChild(this.Tail1);
            this.LegLeft.addChild(this.FootLeft);
            this.ThightRight.addChild(this.LegRight);
            this.Tail2.addChild(this.Tail3);
            this.Neck.addChild(this.Head);
            this.Chest.addChild(this.ArmLeft);
            this.Chest.addChild(this.Neck);
            this.saveBase();
        }

        @Override
        public void setupAnim(BaboonEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = (float) Math.toRadians((double) netHeadYaw) * 0.5F;
            this.Head.yRot = (float) Math.toRadians((double) netHeadYaw) * 0.5F;
        }

        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 1.0F;
            float degree = 1.0F;
            this.Neck.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * -0.1F * limbSwingAmount * 0.5F - 0.591F;
            this.Head.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * 0.1F * limbSwingAmount * 0.5F + 0.761F;
        }

        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 3.0F;
            float degree = 1.0F;
            if (this.isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
                speed = 2.0F;
            }

            if (entity.isSprinting() && !this.isSwimming) {
                degree = 0.3F;
                this.ArmLeft.xRot = MathHelper.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * 6.0F * limbSwingAmount * 0.5F + 0.377F;
                this.ForearmLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F - 0.318F;
                this.HandLeft.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -4.0F * limbSwingAmount * 0.5F;
                this.ArmRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 6.0F * limbSwingAmount * 0.5F + 0.377F;
                this.ForearmRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F - 0.318F;
                this.HandRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -4.0F * limbSwingAmount * 0.5F;
                this.ThightLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -4.5F * limbSwingAmount * 0.5F - 0.039F;
                this.LegLeft.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.364F;
                this.FootLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.0F * limbSwingAmount * 0.5F - 0.182F;
                this.ThightRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -4.5F * limbSwingAmount * 0.5F - 0.039F;
                this.LegRight.xRot = MathHelper.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.364F;
                this.FootRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.0F * limbSwingAmount * 0.5F - 0.182F;
                this.Chest.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.7F * limbSwingAmount * 0.5F - 0.045F;
                this.Body.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.0F * limbSwingAmount * 0.5F + 0.091F;
                this.Hips.xRot = MathHelper.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F - 0.142F;
                this.Chest.y = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -7.0F * limbSwingAmount * 0.5F + 10.5F;
                this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 0.8F * limbSwingAmount * 0.5F - 0.591F;
                this.Head.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 0.4F * limbSwingAmount * 0.5F + 0.761F;
                this.Mouth.xRot = MathHelper.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * -0.5F * limbSwingAmount * 0.5F - 0.215F;
            } else {
                this.ArmLeft.xRot = MathHelper.cos(limbSwing * speed * 0.2F + 3.1415927F) * degree * 2.5F * limbSwingAmount * 0.5F + 0.377F;
                this.ForearmLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * 1.7F * limbSwingAmount * 0.5F - 0.318F;
                this.HandLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F;
                this.ArmRight.xRot = MathHelper.cos(limbSwing * speed * 0.2F + 3.1415927F) * degree * -2.5F * limbSwingAmount * 0.5F + 0.377F;
                this.ForearmRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * -1.7F * limbSwingAmount * 0.5F - 0.318F;
                this.HandRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F;
                this.ThightLeft.xRot = MathHelper.cos(limbSwing * speed * 0.2F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F - 0.039F;
                this.LegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * 1.5F * limbSwingAmount * 0.5F + 0.364F;
                this.FootLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F - 0.182F;
                this.ThightRight.xRot = MathHelper.cos(limbSwing * speed * 0.2F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F - 0.039F;
                this.LegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F + 0.364F;
                this.FootRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F - 0.182F;
                this.Chest.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F + 3.1415927F) * degree * -0.05F * limbSwingAmount * 0.5F - 0.045F;
                this.Neck.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.4F + 3.1415927F) * degree * -0.2F * limbSwingAmount * 0.5F + (this.isSwimming ? 1.0F : -0.591F);
                this.Head.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.4F + 3.1415927F) * degree * 0.1F * limbSwingAmount * 0.5F + (this.isSwimming ? -1.6F : +0.761F);
                this.Body.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F + 3.1415927F) * degree * -0.1F * limbSwingAmount * 0.5F + 0.091F;
            }

        }
    }


    public static class Child extends BaboonModel {

        public ModelRenderer Neck;
        public ModelRenderer Body;
        public ModelRenderer ArmLeft;
        public ModelRenderer ArmRight;
        public ModelRenderer Head;
        public ModelRenderer Snout;
        public ModelRenderer Tuft;
        public ModelRenderer EarLeft;
        public ModelRenderer EarRight;
        public ModelRenderer TopSnout;
        public ModelRenderer Mouth;
        public ModelRenderer TailBase;
        public ModelRenderer ThightLeft;
        public ModelRenderer ThightRight;
        public ModelRenderer Tail1;
        public ModelRenderer Tail2;
        public ModelRenderer Tail3;
        public ModelRenderer LegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer LegRight;
        public ModelRenderer FootRight;
        public ModelRenderer ForearmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer ForearmRight;
        public ModelRenderer HandRight;

        public Child() {
            this.texWidth = 32;
            this.texHeight = 32;
            this.Neck = new ModelRenderer(this, 0, 18);
            this.Neck.setPos(0.0F, -1.6F, -2.7F);
            this.Neck.addBox(-1.5F, -1.0F, -2.0F, 3.0F, 3.0F, 3.0F, 0.0F, 0.2F, 0.2F);
            this.setRotateAngle(Neck, -0.5082398928281348F, 0.0F, 0.0F);
            this.ThightLeft = new ModelRenderer(this, 0, 11);
            this.ThightLeft.setPos(1.2F, 1.4F, 3.3F);
            this.ThightLeft.addBox(-1.0F, 0.2F, -2.0F, 2.0F, 4.0F, 3.0F, 0.0F, 0.3F, 0.0F);
            this.setRotateAngle(ThightLeft, -0.11728612207217244F, 0.0F, 0.0F);
            this.ThightRight = new ModelRenderer(this, 0, 11);
            this.ThightRight.mirror = true;
            this.ThightRight.setPos(-1.2F, 1.4F, 3.3F);
            this.ThightRight.addBox(-1.0F, 0.2F, -2.0F, 2.0F, 4.0F, 3.0F, 0.0F, 0.3F, 0.0F);
            this.setRotateAngle(ThightRight, -0.11728612207217244F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 10, 16);
            this.Tail2.setPos(0.0F, 0.05F, 2.25F);
            this.Tail2.addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.3F);
            this.setRotateAngle(Tail2, -0.8784242444866791F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 8, 10);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.0F, 3.0F, -0.3F);
            this.HandRight.addBox(-1.0F, -0.5F, -2.5F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.0F, 0.0F, 0.13665927909957545F);
            this.ForearmLeft = new ModelRenderer(this, 6, 5);
            this.ForearmLeft.setPos(-0.1F, 2.7F, 0.5F);
            this.ForearmLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmLeft, -0.3186971254089062F, 0.0F, 0.13665927909957545F);
            this.Tuft = new ModelRenderer(this, 16, 27);
            this.Tuft.setPos(0.0F, -1.5F, -1.5F);
            this.Tuft.addBox(-1.5F, -1.3F, -0.3F, 3.0F, 2.0F, 3.0F, 0.0F, -0.2F, 0.3F);
            this.setRotateAngle(Tuft, 0.11728612207217244F, 0.0F, 0.0F);
            this.Tail3 = new ModelRenderer(this, 12, 20);
            this.Tail3.setPos(0.0F, 0.0F, 3.0F);
            this.Tail3.addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, 0.1F, 0.1F, 0.0F);
            this.setRotateAngle(Tail3, -0.37716566200861895F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 0, 1);
            this.FootLeft.setPos(0.0F, 2.8F, 1.0F);
            this.FootLeft.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, -0.2211332175592621F, 0.0F, 0.0F);
            this.ForearmRight = new ModelRenderer(this, 6, 5);
            this.ForearmRight.mirror = true;
            this.ForearmRight.setPos(0.1F, 2.7F, 0.5F);
            this.ForearmRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmRight, -0.3186971254089062F, 0.0F, -0.13665927909957545F);
            this.ArmLeft = new ModelRenderer(this, 11, 0);
            this.ArmLeft.setPos(1.5F, 1.3F, -2.0F);
            this.ArmLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, 0.37716566200861895F, 0.0F, 0.0F);
            this.LegLeft = new ModelRenderer(this, 0, 6);
            this.LegLeft.setPos(0.0F, 4.3F, -1.5F);
            this.LegLeft.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, 0.3642502295386026F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 8, 10);
            this.HandLeft.setPos(0.0F, 3.0F, -0.3F);
            this.HandLeft.addBox(-1.0F, -0.5F, -2.5F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.0F, 0.0F, -0.13665927909957545F);
            this.TailBase = new ModelRenderer(this, 24, 17);
            this.TailBase.setPos(0.0F, -0.1F, 3.8F);
            this.TailBase.addBox(-1.0F, -0.8F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailBase, 0.6829473549475088F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 0, 24);
            this.Head.setPos(0.0F, 1.0F, -2.0F);
            this.Head.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.7428121536172364F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 28, 29);
            this.EarRight.setPos(-1.2F, 0.0F, 0.0F);
            this.EarRight.addBox(-1.0F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.1563815016444822F, -0.5473352640780661F, -0.15655603856442327F);
            this.Mouth = new ModelRenderer(this, 18, 23);
            this.Mouth.setPos(0.0F, 0.3F, -2.5F);
            this.Mouth.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.41067598497849067F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 18, 9);
            this.Body.setPos(0.0F, -2.0F, 2.0F);
            this.Body.addBox(-1.5F, -0.3F, -0.2F, 3.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.2F);
            this.setRotateAngle(Body, 0.03909537541112055F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 24, 23);
            this.TopSnout.setPos(0.0F, -0.3F, -3.0F);
            this.TopSnout.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, 0.1F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.2275909337942703F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 18, 17);
            this.Tail1.setPos(0.0F, -0.5F, 0.0F);
            this.Tail1.addBox(-0.5F, -0.5F, 0.2F, 1.0F, 1.0F, 2.0F, 0.01F, 0.0F, 0.2F);
            this.setRotateAngle(Tail1, -0.9169960049767872F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 0, 1);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.0F, 2.8F, 1.0F);
            this.FootRight.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, -0.2211332175592621F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 14, 0);
            this.Chest.setPos(0.0F, 17.0F, -1.0F);
            this.Chest.addBox(-2.0F, -2.0F, -3.0F, 4.0F, 4.0F, 5.0F, 0.1F, 0.3F, 0.0F);
            this.setRotateAngle(Chest, -0.03909537541112055F, 0.0F, 0.0F);
            this.LegRight = new ModelRenderer(this, 0, 6);
            this.LegRight.mirror = true;
            this.LegRight.setPos(0.0F, 4.3F, -1.5F);
            this.LegRight.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, 0.3642502295386026F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 12, 24);
            this.Snout.setPos(0.0F, 0.2F, -0.7F);
            this.Snout.addBox(-1.0F, 0.0F, -2.8F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.37716566200861895F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 11, 0);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(-1.5F, 1.3F, -2.0F);
            this.ArmRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, 0.37716566200861895F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 28, 29);
            this.EarLeft.setPos(1.2F, 0.0F, 0.0F);
            this.EarLeft.addBox(0.0F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.1563815016444822F, 0.5473352640780661F, 0.15655603856442327F);
            this.Chest.addChild(this.Neck);
            this.Body.addChild(this.ThightLeft);
            this.Body.addChild(this.ThightRight);
            this.Tail1.addChild(this.Tail2);
            this.ForearmRight.addChild(this.HandRight);
            this.ArmLeft.addChild(this.ForearmLeft);
            this.Head.addChild(this.Tuft);
            this.Tail2.addChild(this.Tail3);
            this.LegLeft.addChild(this.FootLeft);
            this.ArmRight.addChild(this.ForearmRight);
            this.Chest.addChild(this.ArmLeft);
            this.ThightLeft.addChild(this.LegLeft);
            this.ForearmLeft.addChild(this.HandLeft);
            this.Body.addChild(this.TailBase);
            this.Neck.addChild(this.Head);
            this.Head.addChild(this.EarRight);
            this.Snout.addChild(this.Mouth);
            this.Chest.addChild(this.Body);
            this.Snout.addChild(this.TopSnout);
            this.TailBase.addChild(this.Tail1);
            this.LegRight.addChild(this.FootRight);
            this.ThightRight.addChild(this.LegRight);
            this.Head.addChild(this.Snout);
            this.Chest.addChild(this.ArmRight);
            this.Head.addChild(this.EarLeft);
            this.saveBase();

        }

        @Override
        public void setupAnim(BaboonEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = (float) Math.toRadians((double) netHeadYaw) * 0.5F;
            this.Head.yRot = (float) Math.toRadians((double) netHeadYaw) * 0.5F;

        }

        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 1.0F;
            float degree = 1.0F;
            this.Neck.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * -0.2F * limbSwingAmount * 0.5F - 0.508F;
            this.Head.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * 0.15F * limbSwingAmount * 0.5F + 0.743F;
        }

        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 1.0F;
            float degree = 1.0F;
            if (entity.isSprinting()) {
                degree = 0.3F;
            }
            this.ArmLeft.xRot = MathHelper.cos(limbSwing * speed * 0.2F + 3.1415927F) * degree * 2.5F * limbSwingAmount * 0.5F + 0.377F;
            this.ForearmLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * 1.7F * limbSwingAmount * 0.5F - 0.319F;
            this.HandLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F;
            this.ArmRight.xRot = MathHelper.cos(limbSwing * speed * 0.2F + 3.1415927F) * degree * -2.5F * limbSwingAmount * 0.5F + 0.377F;
            this.ForearmRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * -1.7F * limbSwingAmount * 0.5F - 0.319F;
            this.HandRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F;
            this.ThightLeft.xRot = MathHelper.cos(limbSwing * speed * 0.2F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F - 0.117F;
            this.LegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * 3.0F * limbSwingAmount * 0.5F + 0.364F;
            this.FootLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F - 0.221F;
            this.ThightRight.xRot = MathHelper.cos(limbSwing * speed * 0.2F + 3.1415927F) * degree * 3.0F * limbSwingAmount * 0.5F - 0.117F;
            this.LegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.364F;
            this.FootRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F - 0.221F;
            this.Chest.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F + 3.1415927F) * degree * -0.05F * limbSwingAmount * 0.5F - 0.039F;
            this.Neck.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.4F + 3.1415927F) * degree * -0.2F * limbSwingAmount * 0.5F - 0.508F;
            this.Head.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.4F + 3.1415927F) * degree * 0.1F * limbSwingAmount * 0.5F + 0.742F;
            this.Body.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F + 3.1415927F) * degree * -0.2F * limbSwingAmount * 0.5F + 0.039F;
        }
    }
}