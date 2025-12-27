package com.github.artyarticus.ecoregions.client.model;

import com.github.artyarticus.ecoregions.entity.MarmosetEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class MarmosetModel extends ZawaBaseModel<MarmosetEntity> {
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

    public static class Adult extends MarmosetModel {

        public ModelRenderer Hips;
        public ModelRenderer Neck;
        public ModelRenderer UpperArmLeft;
        public ModelRenderer UpperArmRight;
        public ModelRenderer ThighLeft;
        public ModelRenderer Tail1;
        public ModelRenderer ThighRight;
        public ModelRenderer Legleft;
        public ModelRenderer FootLeft;
        public ModelRenderer Tail;
        public ModelRenderer Tail_1;
        public ModelRenderer Tail_2;
        public ModelRenderer Tail_3;
        public ModelRenderer Tail_4;
        public ModelRenderer LegRight;
        public ModelRenderer FootRight;
        public ModelRenderer Head;
        public ModelRenderer Neck_1;
        public ModelRenderer Snout;
        public ModelRenderer EarLeft;
        public ModelRenderer Fluff;
        public ModelRenderer Nose;
        public ModelRenderer Mouth;
        public ModelRenderer Forehead;
        public ModelRenderer Fluff1;
        public ModelRenderer Fluff3;
        public ModelRenderer Fluff1_1;
        public ModelRenderer Fluff3_1;
        public ModelRenderer Fluff1_2;
        public ModelRenderer Fluff1_3;
        public ModelRenderer Fluff2;
        public ModelRenderer Fluff2_1;
        public ModelRenderer ArmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer ThumbLeft;
        public ModelRenderer ArmRight;
        public ModelRenderer HandRight;
        public ModelRenderer ThumbRight;

        public Adult() {
            this.texWidth = 64;
            this.texHeight = 32;
            this.Tail = new ModelRenderer(this, 10, 27);
            this.Tail.setPos(0.01F, 0.0F, 2.8F);
            this.Tail.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail, 0.0911061832922575F, 0.0F, 0.0F);
            this.Legleft = new ModelRenderer(this, 56, 7);
            this.Legleft.mirror = true;
            this.Legleft.setPos(-0.5F, 3.5F, -0.8F);
            this.Legleft.addBox(-1.0F, -0.5F, -0.5F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Legleft, 0.591841146688116F, 0.0F, 0.0F);
            this.UpperArmRight = new ModelRenderer(this, 46, 7);
            this.UpperArmRight.setPos(-1.8F, 0.2F, -1.5F);
            this.UpperArmRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmRight, 0.13665927909957545F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 52, 0);
            this.ThighRight.setPos(-2.5F, 1.5F, 2.0F);
            this.ThighRight.addBox(-1.0F, -0.5F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, -0.0911061832922575F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 46, 12);
            this.ArmLeft.mirror = true;
            this.ArmLeft.setPos(-0.01F, 2.6F, 0.0F);
            this.ArmLeft.addBox(-1.0F, 0.2F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.3642502295386026F, 0.0F, 0.0F);
            this.Fluff3 = new ModelRenderer(this, 36, 27);
            this.Fluff3.mirror = true;
            this.Fluff3.setPos(1.2F, -0.01F, -0.01F);
            this.Fluff3.addBox(-0.5F, -1.5F, -1.0F, 3.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Fluff3, 0.13665927909957545F, -0.2275909337942703F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 13);
            this.Hips.setPos(0.0F, -2.0F, 2.5F);
            this.Hips.addBox(-3.0F, -0.6F, 0.0F, 6.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.0911061832922575F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 54, 12);
            this.FootLeft.mirror = true;
            this.FootLeft.setPos(-0.01F, 2.0F, 0.5F);
            this.FootLeft.addBox(-1.0F, -0.2F, -2.4F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, -0.4098033003787853F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 46, 16);
            this.HandRight.setPos(0.01F, 1.6F, -0.5F);
            this.HandRight.addBox(-1.0F, 0.0F, -2.2F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.18203784630933073F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 46, 12);
            this.ArmRight.setPos(-0.01F, 2.6F, 0.0F);
            this.ArmRight.addBox(-1.0F, 0.2F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.3642502295386026F, 0.0F, 0.0F);
            this.Fluff2_1 = new ModelRenderer(this, 36, 9);
            this.Fluff2_1.mirror = true;
            this.Fluff2_1.setPos(-0.5F, -1.0F, 0.0F);
            this.Fluff2_1.addBox(-3.0F, -0.5F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Fluff2_1, 0.0F, 1.133416858855695F, -0.5462880425584197F);
            this.Snout = new ModelRenderer(this, 25, 12);
            this.Snout.setPos(0.0F, 0.1F, -1.7F);
            this.Snout.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.5206317145383279F, 0.0F, 0.0F);
            this.Fluff1_3 = new ModelRenderer(this, 42, 1);
            this.Fluff1_3.mirror = true;
            this.Fluff1_3.setPos(-1.0F, 0.0F, 0.0F);
            this.Fluff1_3.addBox(-1.5F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Fluff1_3, 0.13665927909957545F, 0.2275909337942703F, 0.0F);
            this.Fluff2 = new ModelRenderer(this, 36, 9);
            this.Fluff2.mirror = true;
            this.Fluff2.setPos(0.5F, -1.0F, 0.0F);
            this.Fluff2.addBox(0.0F, -0.5F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Fluff2, 0.0F, -1.133416858855695F, 0.5462880425584197F);
            this.Head = new ModelRenderer(this, 32, 15);
            this.Head.setPos(0.0F, 1.3F, -1.5F);
            this.Head.addBox(-1.5F, -1.5F, -2.0F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.5866051722479385F, 0.0F, 0.0F);
            this.Tail_2 = new ModelRenderer(this, 10, 27);
            this.Tail_2.setPos(0.01F, 0.0F, 2.8F);
            this.Tail_2.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail_2, 0.0911061832922575F, 0.0F, 0.0F);
            this.Tail_3 = new ModelRenderer(this, 10, 27);
            this.Tail_3.setPos(-0.01F, 0.0F, 2.8F);
            this.Tail_3.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail_3, 0.0911061832922575F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 2);
            this.Body.setPos(0.0F, 19.0F, 0.0F);
            this.Body.addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.04555309164612875F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 52, 0);
            this.ThighLeft.mirror = true;
            this.ThighLeft.setPos(2.5F, 1.5F, 2.0F);
            this.ThighLeft.addBox(-2.0F, -0.5F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, -0.0911061832922575F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 0, 27);
            this.Tail1.setPos(0.0F, 0.1F, 3.5F);
            this.Tail1.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -0.5462880425584197F, 0.0F, 0.0F);
            this.Tail_4 = new ModelRenderer(this, 20, 27);
            this.Tail_4.setPos(0.01F, 0.0F, 2.8F);
            this.Tail_4.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail_4, 0.0911061832922575F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 26, 15);
            this.Mouth.setPos(0.01F, 0.7F, 0.2F);
            this.Mouth.addBox(-1.0F, -0.2F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.27314402127920984F, 0.0F, 0.0F);
            this.Fluff1 = new ModelRenderer(this, 36, 4);
            this.Fluff1.mirror = true;
            this.Fluff1.setPos(1.5F, 0.0F, 0.0F);
            this.Fluff1.addBox(-0.5F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Fluff1, 0.13665927909957545F, -0.2275909337942703F, 0.0F);
            this.Neck = new ModelRenderer(this, 23, 21);
            this.Neck.setPos(0.0F, -1.5F, -2.0F);
            this.Neck.addBox(-1.0F, -0.5F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.500909508638178F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 48, 0);
            this.EarLeft.setPos(1.0F, -0.4F, 0.0F);
            this.EarLeft.addBox(0.0F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.0F, -0.37751470255898745F, 0.13665927909957545F);
            this.HandLeft = new ModelRenderer(this, 46, 16);
            this.HandLeft.mirror = true;
            this.HandLeft.setPos(-0.01F, 1.6F, -0.5F);
            this.HandLeft.addBox(-1.0F, 0.0F, -2.2F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.18203784630933073F, 0.0F, 0.0F);
            this.Fluff1_1 = new ModelRenderer(this, 36, 4);
            this.Fluff1_1.mirror = true;
            this.Fluff1_1.setPos(-1.5F, 0.0F, 0.0F);
            this.Fluff1_1.addBox(-1.5F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Fluff1_1, 0.13665927909957545F, 0.2275909337942703F, 0.0F);
            this.UpperArmLeft = new ModelRenderer(this, 46, 7);
            this.UpperArmLeft.mirror = true;
            this.UpperArmLeft.setPos(1.8F, 0.2F, -1.5F);
            this.UpperArmLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmLeft, 0.13665927909957545F, 0.0F, 0.0F);
            this.ThumbRight = new ModelRenderer(this, 46, 20);
            this.ThumbRight.setPos(0.5F, 0.51F, 0.0F);
            this.ThumbRight.addBox(-0.2F, -0.5F, -1.4F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThumbRight, 0.0F, -0.27314402127920984F, 0.0F);
            this.LegRight = new ModelRenderer(this, 56, 7);
            this.LegRight.setPos(0.5F, 3.5F, -0.8F);
            this.LegRight.addBox(-1.0F, -0.5F, -0.5F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, 0.591841146688116F, 0.0F, 0.0F);
            this.Tail_1 = new ModelRenderer(this, 10, 27);
            this.Tail_1.setPos(-0.01F, 0.0F, 2.8F);
            this.Tail_1.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail_1, 0.0911061832922575F, 0.0F, 0.0F);
            this.Forehead = new ModelRenderer(this, 32, 0);
            this.Forehead.setPos(0.0F, -1.1F, -1.8F);
            this.Forehead.addBox(-1.0F, -1.0F, -0.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Forehead, 0.2275909337942703F, 0.0F, 0.0F);
            this.Fluff3_1 = new ModelRenderer(this, 36, 28);
            this.Fluff3_1.setPos(-1.2F, -0.01F, -0.01F);
            this.Fluff3_1.addBox(-2.5F, -1.5F, -1.0F, 3.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Fluff3_1, 0.13665927909957545F, 0.2275909337942703F, 0.0F);
            this.ThumbLeft = new ModelRenderer(this, 46, 20);
            this.ThumbLeft.mirror = true;
            this.ThumbLeft.setPos(-0.5F, 0.51F, 0.0F);
            this.ThumbLeft.addBox(-0.8F, -0.5F, -1.4F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThumbLeft, 0.0F, 0.27314402127920984F, 0.0F);
            this.Fluff1_2 = new ModelRenderer(this, 42, 1);
            this.Fluff1_2.mirror = true;
            this.Fluff1_2.setPos(1.0F, 0.0F, 0.0F);
            this.Fluff1_2.addBox(-0.5F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Fluff1_2, 0.13665927909957545F, -0.2275909337942703F, 0.0F);
            this.FootRight = new ModelRenderer(this, 54, 12);
            this.FootRight.setPos(0.01F, 2.0F, 0.5F);
            this.FootRight.addBox(-1.0F, -0.2F, -2.4F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, -0.4098033003787853F, 0.0F, 0.0F);
            this.Nose = new ModelRenderer(this, 26, 17);
            this.Nose.setPos(0.0F, -0.1F, 0.2F);
            this.Nose.addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Nose, 0.6373942508178124F, 0.0F, 0.0F);
            this.Neck_1 = new ModelRenderer(this, 33, 21);
            this.Neck_1.setPos(0.0F, 3.0F, 0.0F);
            this.Neck_1.addBox(-1.0F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.Fluff = new ModelRenderer(this, 20, 0);
            this.Fluff.setPos(0.0F, 0.0F, 0.1F);
            this.Fluff.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.Tail1.addChild(this.Tail);
            this.ThighLeft.addChild(this.Legleft);
            this.Body.addChild(this.UpperArmRight);
            this.Hips.addChild(this.ThighRight);
            this.UpperArmLeft.addChild(this.ArmLeft);
            this.Fluff.addChild(this.Fluff3);
            this.Body.addChild(this.Hips);
            this.Legleft.addChild(this.FootLeft);
            this.ArmRight.addChild(this.HandRight);
            this.UpperArmRight.addChild(this.ArmRight);
            this.Fluff1_1.addChild(this.Fluff2_1);
            this.Head.addChild(this.Snout);
            this.Fluff.addChild(this.Fluff1_3);
            this.Fluff1.addChild(this.Fluff2);
            this.Neck.addChild(this.Head);
            this.Tail_1.addChild(this.Tail_2);
            this.Tail_2.addChild(this.Tail_3);
            this.Hips.addChild(this.ThighLeft);
            this.Hips.addChild(this.Tail1);
            this.Tail_3.addChild(this.Tail_4);
            this.Snout.addChild(this.Mouth);
            this.Fluff.addChild(this.Fluff1);
            this.Body.addChild(this.Neck);
            this.Head.addChild(this.EarLeft);
            this.ArmLeft.addChild(this.HandLeft);
            this.Fluff.addChild(this.Fluff1_1);
            this.Body.addChild(this.UpperArmLeft);
            this.HandRight.addChild(this.ThumbRight);
            this.ThighRight.addChild(this.LegRight);
            this.Tail.addChild(this.Tail_1);
            this.Fluff.addChild(this.Forehead);
            this.Fluff.addChild(this.Fluff3_1);
            this.HandLeft.addChild(this.ThumbLeft);
            this.Fluff.addChild(this.Fluff1_2);
            this.LegRight.addChild(this.FootRight);
            this.Snout.addChild(this.Nose);
            this.Neck.addChild(this.Neck_1);
            this.Head.addChild(this.Fluff);
            this.saveBase();
        }

        @Override
        public void setupAnim(MarmosetEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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
           // this.Tail2.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.6F) * 0.5F - 0.31F;
            this.Tail1.zRot = MathHelper.cos(1.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
           // this.Tail2.zRot = MathHelper.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.6F) * 0.5F;
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

              //  this.Chest.y = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -1F) * 0.5F + 14.6F;
              //  this.Chest.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.1F) * 0.5F + 0.03F;
                this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F - 0.03F;
                this.Hips.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.23F;

               // this.ArmBaseLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.6F) * 0.5F + 0.09F;
                this.UpperArmLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.09F;
               // this.LowerArmLeft.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree) * 0.5F - 0.04F;
                this.HandLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;
                //this.ArmBaseRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.6F) * 0.5F + 0.09F;
                this.UpperArmRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.09F;
                //this.LowerArmRight.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1F) * 0.5F - 0.04F;
                this.HandRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;

                this.ThighLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.3F) * 0.5F;
              //  this.UpperLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.44F;
              //  this.LowerLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.35F;
                this.FootLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.14F;
                this.ThighRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.3F) * 0.5F;
              //  this.UpperLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.44F;
              //  this.LowerLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.35F;
                this.FootRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.14F;
            }
        }
    }


    public static class Child extends MarmosetModel {

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
           // this.Chest = new ModelRenderer(this, 0, 12);
           // this.Chest.setPos(0.0F, 18.3F, -3.0F);
           // this.Chest.addBox(-1.5F, -1.5F, -1.0F, 3.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
           // this.setRotateAngle(Chest, -0.12217304763960307F, 0.0F, 0.0F);
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
           // this.Chest.addChild(this.Neck);
            this.ForearmLeft.addChild(this.HandLeft);
            this.ArmRight.addChild(this.ForearmRight);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.ForearmRight.addChild(this.HandRight);
            this.Head.addChild(this.Mouth);
            this.Body.addChild(this.Hips);
          //  this.Chest.addChild(this.ArmBaseLeft);
            this.Neck.addChild(this.Head);
           // this.Chest.addChild(this.Body);
            this.ArmLeft.addChild(this.ForearmLeft);
            //this.Chest.addChild(this.ArmBaseRight);
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
        public void setupAnim(MarmosetEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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
          //  this.Chest.y = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 18.3F;
          //  this.Chest.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F - 0.12F;
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

