package com.github.artyarticus.ecoregions.client.model;

import com.github.artyarticus.ecoregions.entity.KuduEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class KuduModel extends ZawaBaseModel<KuduEntity> {
    protected ModelRenderer Chest;
    private Iterable<ModelRenderer> parts;
    @Override
    @MethodsReturnNonnullByDefault
    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Chest);
        }

        return this.parts;
    }

    public static class AdultMale extends KuduModel {
        public ModelRenderer Body;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer BackFur1;
        public ModelRenderer Neck;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer Hips;
        public ModelRenderer ThighLeft;
        public ModelRenderer Tail1;
        public ModelRenderer ThighRight;
        public ModelRenderer UpperLegLeft;
        public ModelRenderer LowerLegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer Tail2;
        public ModelRenderer TailTuft;
        public ModelRenderer UpperLegRight;
        public ModelRenderer LowerLegRight;
        public ModelRenderer FootRight;
        public ModelRenderer ArmLeft;
        public ModelRenderer ForearmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer BackFur2;
        public ModelRenderer Head;
        public ModelRenderer NeckLower;
        public ModelRenderer EarLeft;
        public ModelRenderer Snout;
        public ModelRenderer Beard;
        public ModelRenderer Forehead;
        public ModelRenderer Horn1Left;
        public ModelRenderer Horn1Right;
        public ModelRenderer EarRight;
        public ModelRenderer TopSnout;
        public ModelRenderer Jaw;
        public ModelRenderer Horn2Left;
        public ModelRenderer Horn3Left;
        public ModelRenderer Horn2Right;
        public ModelRenderer Horn3Right;
        public ModelRenderer NeckTuft1;
        public ModelRenderer NeckTuft2;
        public ModelRenderer ArmRight;
        public ModelRenderer ForearmRight;
        public ModelRenderer HandRight;

        public AdultMale() {
            this.texWidth = 128;
            this.texHeight = 128;
            this.Horn3Left = new ModelRenderer(this, 87, 70);
            this.Horn3Left.setPos(0.2F, -4.3F, -0.01F);
            this.Horn3Left.addBox(-1.0F, -8.5F, 0.0F, 2.0F, 9.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn3Left, 0.0F, 0.0F, -1.0164797856562695F);
            this.Horn1Right = new ModelRenderer(this, 87, 70);
            this.Horn1Right.mirror = true;
            this.Horn1Right.setPos(-1.5F, -4.8F, 0.7F);
            this.Horn1Right.addBox(-1.0F, -6.0F, 0.0F, 2.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn1Right, -0.8426449415575736F, -0.5473352640780661F, -0.19547687289441354F);
            this.Horn3Right = new ModelRenderer(this, 87, 70);
            this.Horn3Right.mirror = true;
            this.Horn3Right.setPos(-0.2F, -4.3F, -0.01F);
            this.Horn3Right.addBox(-1.0F, -8.5F, 0.0F, 2.0F, 9.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn3Right, 0.0F, 0.0F, 1.0164797856562695F);
            this.Tail1 = new ModelRenderer(this, 76, 25);
            this.Tail1.setPos(0.0F, 0.0F, 11.0F);
            this.Tail1.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 7.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, 0.3968878679087689F, 0.0F, 0.0F);
            this.ForearmRight = new ModelRenderer(this, 57, 99);
            this.ForearmRight.mirror = true;
            this.ForearmRight.setPos(0.0F, 6.6F, -4.5F);
            this.ForearmRight.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 7.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmRight, -0.04555309164612875F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 98, 72);
            this.Head.setPos(0.0F, 5.1F, -10.5F);
            this.Head.addBox(-4.0F, -4.0F, -3.5F, 8.0F, 8.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.6143559100178094F, 0.0F, 0.0F);
            this.Horn1Left = new ModelRenderer(this, 87, 70);
            this.Horn1Left.setPos(1.5F, -4.8F, 0.7F);
            this.Horn1Left.addBox(-1.0F, -6.0F, 0.0F, 2.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn1Left, -0.8426449415575736F, 0.5473352640780661F, 0.19547687289441354F);
            this.Chest = new ModelRenderer(this, 0, 57);
            this.Chest.setPos(0.0F, -2.0F, -6.0F);
            this.Chest.addBox(-6.0F, -8.5F, -4.0F, 12.0F, 17.0F, 10.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.23527037517935237F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 43, 109);
            this.FootLeft.setPos(0.0F, 7.0F, -2.9F);
            this.FootLeft.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 0.03909537541112055F, 0.0F, 0.0F);
            this.Jaw = new ModelRenderer(this, 108, 100);
            this.Jaw.setPos(0.0F, 2.4F, -1.0F);
            this.Jaw.addBox(-2.0F, 0.0F, -5.0F, 4.0F, 2.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Jaw, -0.11606439692209859F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 43, 109);
            this.HandLeft.setPos(0.0F, 5.7F, 0.5F);
            this.HandLeft.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.03909537541112055F, 0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 54, 72);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-3.7F, 1.5F, -0.5F);
            this.ArmBaseRight.addBox(-2.5F, 0.0F, -3.0F, 5.0F, 10.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.3141592653589793F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 54, 72);
            this.ArmBaseLeft.setPos(3.7F, 1.5F, -0.5F);
            this.ArmBaseLeft.addBox(-2.5F, 0.0F, -3.0F, 5.0F, 10.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.3141592653589793F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 86, 10);
            this.Neck.setPos(0.0F, -8.0F, -3.5F);
            this.Neck.addBox(-3.5F, 0.0F, -10.0F, 7.0F, 8.0F, 13.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.1563815016444822F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 76, 0);
            this.UpperLegLeft.setPos(0.3F, 13.0F, -3.0F);
            this.UpperLegLeft.addBox(-2.5F, 0.0F, 0.0F, 5.0F, 6.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.3490658503988659F, 0.0F, 0.0F);
            this.Beard = new ModelRenderer(this, 80, 82);
            this.Beard.setPos(0.0F, 3.9F, -2.1F);
            this.Beard.addBox(-1.5F, 0.0F, -3.0F, 3.0F, 3.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Beard, -0.11833332694706204F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 76, 0);
            this.UpperLegRight.mirror = true;
            this.UpperLegRight.setPos(0.3F, 13.0F, -3.0F);
            this.UpperLegRight.addBox(-2.5F, 0.0F, 0.0F, 5.0F, 6.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.3490658503988659F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 43, 109);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.0F, 7.0F, -2.9F);
            this.FootRight.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, 0.03909537541112055F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 117, 89);
            this.EarLeft.setPos(4.0F, -1.5F, 3.0F);
            this.EarLeft.addBox(-2.0F, -4.5F, 0.0F, 4.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, -0.46914448828868976F, -0.1563815016444822F, 1.378111961395756F);
            this.Body = new ModelRenderer(this, 0, 27);
            this.Body.setPos(0.0F, -6.1F, 2.5F);
            this.Body.addBox(-6.5F, -1.0F, 0.0F, 13.0F, 16.0F, 14.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.23561944901923448F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 56, 88);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(0.0F, 9.5F, 2.5F);
            this.ArmRight.addBox(-2.0F, 0.0F, -4.5F, 4.0F, 7.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.04555309164612875F, 0.0F, 0.0F);
            this.NeckLower = new ModelRenderer(this, 86, 33);
            this.NeckLower.setPos(0.0F, 7.7F, -1.3F);
            this.NeckLower.addBox(-2.5F, -0.5F, -7.0F, 5.0F, 4.0F, 13.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckLower, -0.3136356545991561F, 0.0F, 0.0F);
            this.BackFur2 = new ModelRenderer(this, 0, 102);
            this.BackFur2.setPos(0.0F, -1.6F, 5.5F);
            this.BackFur2.addBox(-1.5F, -0.5F, 0.3F, 3.0F, 3.0F, 6.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(BackFur2, -0.4300491170387584F, 0.0F, 0.0F);
            this.ForearmLeft = new ModelRenderer(this, 57, 99);
            this.ForearmLeft.setPos(0.0F, 6.6F, -4.5F);
            this.ForearmLeft.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 7.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmLeft, -0.04555309164612875F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 43, 109);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.0F, 5.7F, 0.5F);
            this.HandRight.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.03909537541112055F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 44, 0);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-3.6F, 2.5F, 7.0F);
            this.ThighRight.addBox(-3.0F, 0.0F, -5.0F, 6.0F, 13.0F, 9.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.17453292519943295F, 0.0F, 0.0F);
            this.TailTuft = new ModelRenderer(this, 73, 50);
            this.TailTuft.setPos(0.0F, 2.0F, 0.0F);
            this.TailTuft.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailTuft, 0.02356194531804237F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 0);
            this.Hips.setPos(0.0F, -0.5F, 13.9F);
            this.Hips.addBox(-5.5F, -0.5F, 0.0F, 11.0F, 16.0F, 11.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.37873646099857494F, 0.0F, 0.0F);
            this.Horn2Right = new ModelRenderer(this, 87, 70);
            this.Horn2Right.mirror = true;
            this.Horn2Right.setPos(0.0F, -5.51F, 0.0F);
            this.Horn2Right.addBox(-1.0F, -5.0F, 0.0F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn2Right, 0.0F, 0.0F, -0.4300491170387584F);
            this.ArmLeft = new ModelRenderer(this, 56, 88);
            this.ArmLeft.setPos(0.0F, 9.5F, 2.5F);
            this.ArmLeft.addBox(-2.0F, 0.0F, -4.5F, 4.0F, 7.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.04555309164612875F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 117, 89);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-4.0F, -1.5F, 3.0F);
            this.EarRight.addBox(-2.0F, -4.5F, 0.0F, 4.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, -0.46914448828868976F, 0.1563815016444822F, -1.378111961395756F);
            this.Horn2Left = new ModelRenderer(this, 87, 70);
            this.Horn2Left.setPos(0.0F, -5.51F, 0.0F);
            this.Horn2Left.addBox(-1.0F, -5.0F, 0.0F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn2Left, 0.0F, 0.0F, 0.4300491170387584F);
            this.ThighLeft = new ModelRenderer(this, 44, 0);
            this.ThighLeft.setPos(3.6F, 2.5F, 7.0F);
            this.ThighLeft.addBox(-3.0F, 0.0F, -5.0F, 6.0F, 13.0F, 9.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.17453292519943295F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 76, 35);
            this.Tail2.setPos(0.0F, 6.9F, -1.0F);
            this.Tail2.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 7.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, -0.0911061832922575F, 0.0F, 0.0F);
            this.NeckTuft2 = new ModelRenderer(this, 102, 52);
            this.NeckTuft2.setPos(0.0F, 8.9F, 7.7F);
            this.NeckTuft2.addBox(-2.01F, -6.0F, -1.0F, 4.0F, 7.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckTuft2, 0.3504621124688808F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 90, 89);
            this.Snout.setPos(0.0F, -0.5F, -2.5F);
            this.Snout.addBox(-2.5F, 0.0F, -6.5F, 5.0F, 3.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.23492131798422702F, 0.0F, 0.0F);
            this.LowerLegLeft = new ModelRenderer(this, 79, 11);
            this.LowerLegLeft.setPos(0.0F, 6.0F, 4.5F);
            this.LowerLegLeft.addBox(-1.5F, 0.0F, -4.0F, 3.0F, 8.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.17104227002439565F, 0.0F, 0.0F);
            this.LowerLegRight = new ModelRenderer(this, 79, 11);
            this.LowerLegRight.mirror = true;
            this.LowerLegRight.setPos(0.0F, 6.0F, 4.5F);
            this.LowerLegRight.addBox(-1.5F, 0.0F, -4.0F, 3.0F, 8.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.17104227002439565F, 0.0F, 0.0F);
            this.NeckTuft1 = new ModelRenderer(this, 80, 52);
            this.NeckTuft1.setPos(0.0F, 0.0F, -3.3F);
            this.NeckTuft1.addBox(-1.5F, 2.5F, -1.0F, 3.0F, 5.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckTuft1, -0.07976154981219709F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 80, 101);
            this.TopSnout.setPos(0.0F, 0.2F, -6.4F);
            this.TopSnout.addBox(-2.0F, 0.0F, 0.0F, 4.0F, 2.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.3513347637790725F, 0.0F, 0.0F);
            this.Forehead = new ModelRenderer(this, 55, 63);
            this.Forehead.setPos(0.0F, -4.5F, -2.5F);
            this.Forehead.addBox(-3.5F, 0.0F, 0.0F, 7.0F, 3.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Forehead, 0.20176006885423747F, 0.0F, 0.0F);
            this.BackFur1 = new ModelRenderer(this, 0, 87);
            this.BackFur1.setPos(0.0F, -8.5F, 0.5F);
            this.BackFur1.addBox(-1.5F, -2.0F, -4.0F, 3.0F, 3.0F, 10.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(BackFur1, 0.15568337060947474F, 0.0F, 0.0F);
            this.Horn2Left.addChild(this.Horn3Left);
            this.Head.addChild(this.Horn1Right);
            this.Horn2Right.addChild(this.Horn3Right);
            this.Hips.addChild(this.Tail1);
            this.ArmRight.addChild(this.ForearmRight);
            this.Neck.addChild(this.Head);
            this.Head.addChild(this.Horn1Left);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.Snout.addChild(this.Jaw);
            this.ForearmLeft.addChild(this.HandLeft);
            this.Chest.addChild(this.ArmBaseRight);
            this.Chest.addChild(this.ArmBaseLeft);
            this.Chest.addChild(this.Neck);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.Head.addChild(this.Beard);
            this.ThighRight.addChild(this.UpperLegRight);
            this.LowerLegRight.addChild(this.FootRight);
            this.Head.addChild(this.EarLeft);
            this.Chest.addChild(this.Body);
            this.ArmBaseRight.addChild(this.ArmRight);
            this.Neck.addChild(this.NeckLower);
            this.BackFur1.addChild(this.BackFur2);
            this.ArmLeft.addChild(this.ForearmLeft);
            this.ForearmRight.addChild(this.HandRight);
            this.Hips.addChild(this.ThighRight);
            this.Tail2.addChild(this.TailTuft);
            this.Body.addChild(this.Hips);
            this.Horn1Right.addChild(this.Horn2Right);
            this.ArmBaseLeft.addChild(this.ArmLeft);
            this.Head.addChild(this.EarRight);
            this.Horn1Left.addChild(this.Horn2Left);
            this.Hips.addChild(this.ThighLeft);
            this.Tail1.addChild(this.Tail2);
            this.NeckTuft1.addChild(this.NeckTuft2);
            this.Head.addChild(this.Snout);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.NeckLower.addChild(this.NeckTuft1);
            this.Snout.addChild(this.TopSnout);
            this.Head.addChild(this.Forehead);
            this.Chest.addChild(this.BackFur1);
            this.saveBase();
        }
        @Override
        public void setupAnim(KuduEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
         }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
         }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            }

            if (entity.isSprinting()) {
                float speed = 0.8f;
                float degree = 0.5f;
         } else {
                float speed = 1.7f;
                float degree = 0.6f;
          }
        }
    }

    public static class AdultFemale extends KuduModel {
        public ModelRenderer Body;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer Neck;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer Hips;
        public ModelRenderer ThighLeft;
        public ModelRenderer Tail1;
        public ModelRenderer ThighRight;
        public ModelRenderer UpperLegLeft;
        public ModelRenderer LowerLegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer Tail2;
        public ModelRenderer TailTuft;
        public ModelRenderer UpperLegRight;
        public ModelRenderer LowerLegRight;
        public ModelRenderer FootRight;
        public ModelRenderer ArmLeft;
        public ModelRenderer ForearmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer Head;
        public ModelRenderer NeckLower;
        public ModelRenderer EarLeft;
        public ModelRenderer Snout;
        public ModelRenderer EarRight;
        public ModelRenderer TopSnout;
        public ModelRenderer Jaw;
        public ModelRenderer ArmRight;
        public ModelRenderer ForearmRight;
        public ModelRenderer HandRight;

        public AdultFemale() {
            this.texWidth = 128;
            this.texHeight = 128;
            this.NeckLower = new ModelRenderer(this, 86, 33);
            this.NeckLower.setPos(0.0F, 6.7F, -1.3F);
            this.NeckLower.addBox(-2.0F, -1.5F, -8.0F, 4.0F, 4.0F, 13.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckLower, -0.15725416959943073F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 117, 89);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-4.0F, -1.5F, 3.0F);
            this.EarRight.addBox(-2.0F, -4.5F, 0.0F, 4.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, -0.46914448828868976F, 0.1563815016444822F, -1.378111961395756F);
            this.ArmRight = new ModelRenderer(this, 56, 88);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(0.0F, 9.5F, 2.5F);
            this.ArmRight.addBox(-2.0F, 0.0F, -4.5F, 4.0F, 7.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.04555309164612875F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 76, 35);
            this.Tail2.setPos(0.0F, 6.9F, -1.0F);
            this.Tail2.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 7.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, -0.0911061832922575F, 0.0F, 0.0F);
            this.ForearmLeft = new ModelRenderer(this, 57, 99);
            this.ForearmLeft.setPos(0.0F, 6.6F, -4.5F);
            this.ForearmLeft.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 7.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmLeft, -0.04555309164612875F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 98, 72);
            this.Head.setPos(0.0F, 5.1F, -9.5F);
            this.Head.addBox(-4.0F, -4.0F, -3.5F, 8.0F, 8.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.6143559100178094F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 44, 0);
            this.ThighLeft.setPos(3.6F, 2.0F, 7.0F);
            this.ThighLeft.addBox(-3.0F, 0.0F, -5.0F, 6.0F, 12.0F, 9.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.17453292519943295F, 0.0F, 0.0F);
            this.TailTuft = new ModelRenderer(this, 73, 50);
            this.TailTuft.setPos(0.0F, 2.0F, 0.0F);
            this.TailTuft.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailTuft, 0.02356194531804237F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 117, 89);
            this.EarLeft.setPos(4.0F, -1.5F, 3.0F);
            this.EarLeft.addBox(-2.0F, -4.5F, 0.0F, 4.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, -0.46914448828868976F, -0.1563815016444822F, 1.378111961395756F);
            this.Jaw = new ModelRenderer(this, 108, 100);
            this.Jaw.setPos(0.0F, 2.4F, -1.0F);
            this.Jaw.addBox(-2.0F, 0.0F, -5.0F, 4.0F, 2.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Jaw, -0.11606439692209859F, 0.0F, 0.0F);
            this.LowerLegRight = new ModelRenderer(this, 79, 11);
            this.LowerLegRight.mirror = true;
            this.LowerLegRight.setPos(0.0F, 6.0F, 4.5F);
            this.LowerLegRight.addBox(-1.5F, 0.0F, -4.0F, 3.0F, 8.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.17104227002439565F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 80, 101);
            this.TopSnout.setPos(0.0F, 0.2F, -6.4F);
            this.TopSnout.addBox(-2.0F, 0.0F, 0.0F, 4.0F, 2.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.3513347637790725F, 0.0F, 0.0F);
            this.ForearmRight = new ModelRenderer(this, 57, 99);
            this.ForearmRight.mirror = true;
            this.ForearmRight.setPos(0.0F, 6.6F, -4.5F);
            this.ForearmRight.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 7.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmRight, -0.04555309164612875F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 86, 10);
            this.Neck.setPos(0.0F, -7.0F, -3.5F);
            this.Neck.addBox(-2.5F, 0.0F, -9.0F, 5.0F, 7.0F, 13.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.1563815016444822F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 0);
            this.Hips.setPos(0.0F, -0.5F, 13.9F);
            this.Hips.addBox(-5.5F, -0.5F, 0.0F, 11.0F, 14.0F, 11.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.37873646099857494F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 54, 72);
            this.ArmBaseLeft.setPos(3.7F, -0.5F, -0.5F);
            this.ArmBaseLeft.addBox(-2.5F, 0.0F, -3.0F, 5.0F, 10.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.3141592653589793F, 0.0F, 0.0F);
            this.LowerLegLeft = new ModelRenderer(this, 79, 11);
            this.LowerLegLeft.setPos(0.0F, 6.0F, 4.5F);
            this.LowerLegLeft.addBox(-1.5F, 0.0F, -4.0F, 3.0F, 8.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.17104227002439565F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 43, 109);
            this.FootLeft.setPos(0.0F, 7.0F, -2.9F);
            this.FootLeft.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 0.03909537541112055F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 56, 88);
            this.ArmLeft.setPos(0.0F, 9.5F, 2.5F);
            this.ArmLeft.addBox(-2.0F, 0.0F, -4.5F, 4.0F, 7.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.04555309164612875F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 90, 89);
            this.Snout.setPos(0.0F, -0.5F, -2.5F);
            this.Snout.addBox(-2.5F, 0.0F, -6.5F, 5.0F, 3.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.23492131798422702F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 76, 25);
            this.Tail1.setPos(0.0F, 0.0F, 11.0F);
            this.Tail1.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 7.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, 0.3968878679087689F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 43, 109);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.0F, 5.7F, 0.5F);
            this.HandRight.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.03909537541112055F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 27);
            this.Body.setPos(0.0F, -6.5F, 2.5F);
            this.Body.addBox(-6.5F, -1.0F, 0.0F, 13.0F, 15.0F, 14.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.23561944901923448F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 43, 109);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.0F, 7.0F, -2.9F);
            this.FootRight.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, 0.03909537541112055F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 44, 0);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-3.6F, 2.0F, 7.0F);
            this.ThighRight.addBox(-3.0F, 0.0F, -5.0F, 6.0F, 12.0F, 9.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.17453292519943295F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 76, 0);
            this.UpperLegLeft.setPos(0.3F, 12.0F, -3.0F);
            this.UpperLegLeft.addBox(-2.5F, 0.0F, 0.0F, 5.0F, 6.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.3490658503988659F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 76, 0);
            this.UpperLegRight.mirror = true;
            this.UpperLegRight.setPos(0.3F, 12.0F, -3.0F);
            this.UpperLegRight.addBox(-2.5F, 0.0F, 0.0F, 5.0F, 6.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.3490658503988659F, 0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 54, 72);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-3.7F, -0.5F, -0.5F);
            this.ArmBaseRight.addBox(-2.5F, 0.0F, -3.0F, 5.0F, 10.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.3141592653589793F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 43, 109);
            this.HandLeft.setPos(0.0F, 5.7F, 0.5F);
            this.HandLeft.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.03909537541112055F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 57);
            this.Chest.setPos(0.0F, 0.0F, -6.0F);
            this.Chest.addBox(-6.0F, -7.0F, -4.0F, 12.0F, 14.0F, 10.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.23527037517935237F, 0.0F, 0.0F);
            this.Neck.addChild(this.NeckLower);
            this.Head.addChild(this.EarRight);
            this.ArmBaseRight.addChild(this.ArmRight);
            this.Tail1.addChild(this.Tail2);
            this.ArmLeft.addChild(this.ForearmLeft);
            this.Neck.addChild(this.Head);
            this.Hips.addChild(this.ThighLeft);
            this.Tail2.addChild(this.TailTuft);
            this.Head.addChild(this.EarLeft);
            this.Snout.addChild(this.Jaw);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.Snout.addChild(this.TopSnout);
            this.ArmRight.addChild(this.ForearmRight);
            this.Chest.addChild(this.Neck);
            this.Body.addChild(this.Hips);
            this.Chest.addChild(this.ArmBaseLeft);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.ArmBaseLeft.addChild(this.ArmLeft);
            this.Head.addChild(this.Snout);
            this.Hips.addChild(this.Tail1);
            this.ForearmRight.addChild(this.HandRight);
            this.Chest.addChild(this.Body);
            this.LowerLegRight.addChild(this.FootRight);
            this.Hips.addChild(this.ThighRight);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.ThighRight.addChild(this.UpperLegRight);
            this.Chest.addChild(this.ArmBaseRight);
            this.ForearmLeft.addChild(this.HandLeft);
            this.saveBase();
        }
        @Override
        public void setupAnim(KuduEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
           }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
          }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            }

            if (entity.isSprinting()) {
                float speed = 0.8f;
                float degree = 0.5f;

            } else {
                float speed = 1.7f;
                float degree = 0.6f;
         }
        }
    }

    public static class Child extends KuduModel {
        public ModelRenderer Body;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer Neck;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer Hips;
        public ModelRenderer ThighLeft;
        public ModelRenderer Tail1;
        public ModelRenderer ThighRight;
        public ModelRenderer UpperLegLeft;
        public ModelRenderer LowerLegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer Tail2;
        public ModelRenderer TailTuft;
        public ModelRenderer UpperLegRight;
        public ModelRenderer LowerLegRight;
        public ModelRenderer FootRight;
        public ModelRenderer ArmLeft;
        public ModelRenderer ForearmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer Head;
        public ModelRenderer NeckLower;
        public ModelRenderer EarLeft;
        public ModelRenderer Snout;
        public ModelRenderer EarRight;
        public ModelRenderer TopSnout;
        public ModelRenderer Jaw;
        public ModelRenderer ArmRight;
        public ModelRenderer ForearmRight;
        public ModelRenderer HandRight;

        public Child() {
            this.texWidth = 128;
            this.texHeight = 128;
            this.NeckLower = new ModelRenderer(this, 86, 33);
            this.NeckLower.setPos(0.0F, 6.7F, -1.3F);
            this.NeckLower.addBox(-2.0F, -1.5F, -8.0F, 4.0F, 4.0F, 13.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckLower, -0.15725416959943073F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 117, 89);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-4.0F, -1.5F, 3.0F);
            this.EarRight.addBox(-2.0F, -4.5F, 0.0F, 4.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, -0.46914448828868976F, 0.1563815016444822F, -1.378111961395756F);
            this.ArmRight = new ModelRenderer(this, 56, 88);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(0.0F, 9.5F, 2.5F);
            this.ArmRight.addBox(-2.0F, 0.0F, -4.5F, 4.0F, 7.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.04555309164612875F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 76, 35);
            this.Tail2.setPos(0.0F, 6.9F, -1.0F);
            this.Tail2.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 7.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, -0.0911061832922575F, 0.0F, 0.0F);
            this.ForearmLeft = new ModelRenderer(this, 57, 99);
            this.ForearmLeft.setPos(0.0F, 6.6F, -4.5F);
            this.ForearmLeft.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 7.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmLeft, -0.04555309164612875F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 98, 72);
            this.Head.setPos(0.0F, 5.1F, -9.5F);
            this.Head.addBox(-4.0F, -4.0F, -3.5F, 8.0F, 8.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.6143559100178094F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 44, 0);
            this.ThighLeft.setPos(3.6F, 2.0F, 7.0F);
            this.ThighLeft.addBox(-3.0F, 0.0F, -5.0F, 6.0F, 12.0F, 9.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.17453292519943295F, 0.0F, 0.0F);
            this.TailTuft = new ModelRenderer(this, 73, 50);
            this.TailTuft.setPos(0.0F, 2.0F, 0.0F);
            this.TailTuft.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailTuft, 0.02356194531804237F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 117, 89);
            this.EarLeft.setPos(4.0F, -1.5F, 3.0F);
            this.EarLeft.addBox(-2.0F, -4.5F, 0.0F, 4.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, -0.46914448828868976F, -0.1563815016444822F, 1.378111961395756F);
            this.Jaw = new ModelRenderer(this, 108, 100);
            this.Jaw.setPos(0.0F, 2.4F, -1.0F);
            this.Jaw.addBox(-2.0F, 0.0F, -5.0F, 4.0F, 2.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Jaw, -0.11606439692209859F, 0.0F, 0.0F);
            this.LowerLegRight = new ModelRenderer(this, 79, 11);
            this.LowerLegRight.mirror = true;
            this.LowerLegRight.setPos(0.0F, 6.0F, 4.5F);
            this.LowerLegRight.addBox(-1.5F, 0.0F, -4.0F, 3.0F, 8.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.17104227002439565F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 80, 101);
            this.TopSnout.setPos(0.0F, 0.2F, -6.4F);
            this.TopSnout.addBox(-2.0F, 0.0F, 0.0F, 4.0F, 2.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.3513347637790725F, 0.0F, 0.0F);
            this.ForearmRight = new ModelRenderer(this, 57, 99);
            this.ForearmRight.mirror = true;
            this.ForearmRight.setPos(0.0F, 6.6F, -4.5F);
            this.ForearmRight.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 7.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmRight, -0.04555309164612875F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 86, 10);
            this.Neck.setPos(0.0F, -7.0F, -3.5F);
            this.Neck.addBox(-2.5F, 0.0F, -9.0F, 5.0F, 7.0F, 13.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.1563815016444822F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 0);
            this.Hips.setPos(0.0F, -0.5F, 13.9F);
            this.Hips.addBox(-5.5F, -0.5F, 0.0F, 11.0F, 14.0F, 11.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.37873646099857494F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 54, 72);
            this.ArmBaseLeft.setPos(3.7F, -0.5F, -0.5F);
            this.ArmBaseLeft.addBox(-2.5F, 0.0F, -3.0F, 5.0F, 10.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.3141592653589793F, 0.0F, 0.0F);
            this.LowerLegLeft = new ModelRenderer(this, 79, 11);
            this.LowerLegLeft.setPos(0.0F, 6.0F, 4.5F);
            this.LowerLegLeft.addBox(-1.5F, 0.0F, -4.0F, 3.0F, 8.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.17104227002439565F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 43, 109);
            this.FootLeft.setPos(0.0F, 7.0F, -2.9F);
            this.FootLeft.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 0.03909537541112055F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 56, 88);
            this.ArmLeft.setPos(0.0F, 9.5F, 2.5F);
            this.ArmLeft.addBox(-2.0F, 0.0F, -4.5F, 4.0F, 7.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.04555309164612875F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 90, 89);
            this.Snout.setPos(0.0F, -0.5F, -2.5F);
            this.Snout.addBox(-2.5F, 0.0F, -6.5F, 5.0F, 3.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.23492131798422702F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 76, 25);
            this.Tail1.setPos(0.0F, 0.0F, 11.0F);
            this.Tail1.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 7.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, 0.3968878679087689F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 43, 109);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.0F, 5.7F, 0.5F);
            this.HandRight.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.03909537541112055F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 27);
            this.Body.setPos(0.0F, -6.5F, 2.5F);
            this.Body.addBox(-6.5F, -1.0F, 0.0F, 13.0F, 15.0F, 14.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.23561944901923448F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 43, 109);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.0F, 7.0F, -2.9F);
            this.FootRight.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, 0.03909537541112055F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 44, 0);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-3.6F, 2.0F, 7.0F);
            this.ThighRight.addBox(-3.0F, 0.0F, -5.0F, 6.0F, 12.0F, 9.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.17453292519943295F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 76, 0);
            this.UpperLegLeft.setPos(0.3F, 12.0F, -3.0F);
            this.UpperLegLeft.addBox(-2.5F, 0.0F, 0.0F, 5.0F, 6.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.3490658503988659F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 76, 0);
            this.UpperLegRight.mirror = true;
            this.UpperLegRight.setPos(0.3F, 12.0F, -3.0F);
            this.UpperLegRight.addBox(-2.5F, 0.0F, 0.0F, 5.0F, 6.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.3490658503988659F, 0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 54, 72);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-3.7F, -0.5F, -0.5F);
            this.ArmBaseRight.addBox(-2.5F, 0.0F, -3.0F, 5.0F, 10.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.3141592653589793F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 43, 109);
            this.HandLeft.setPos(0.0F, 5.7F, 0.5F);
            this.HandLeft.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.03909537541112055F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 57);
            this.Chest.setPos(0.0F, 0.0F, -6.0F);
            this.Chest.addBox(-6.0F, -7.0F, -4.0F, 12.0F, 14.0F, 10.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.23527037517935237F, 0.0F, 0.0F);
            this.Neck.addChild(this.NeckLower);
            this.Head.addChild(this.EarRight);
            this.ArmBaseRight.addChild(this.ArmRight);
            this.Tail1.addChild(this.Tail2);
            this.ArmLeft.addChild(this.ForearmLeft);
            this.Neck.addChild(this.Head);
            this.Hips.addChild(this.ThighLeft);
            this.Tail2.addChild(this.TailTuft);
            this.Head.addChild(this.EarLeft);
            this.Snout.addChild(this.Jaw);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.Snout.addChild(this.TopSnout);
            this.ArmRight.addChild(this.ForearmRight);
            this.Chest.addChild(this.Neck);
            this.Body.addChild(this.Hips);
            this.Chest.addChild(this.ArmBaseLeft);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.ArmBaseLeft.addChild(this.ArmLeft);
            this.Head.addChild(this.Snout);
            this.Hips.addChild(this.Tail1);
            this.ForearmRight.addChild(this.HandRight);
            this.Chest.addChild(this.Body);
            this.LowerLegRight.addChild(this.FootRight);
            this.Hips.addChild(this.ThighRight);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.ThighRight.addChild(this.UpperLegRight);
            this.Chest.addChild(this.ArmBaseRight);
            this.ForearmLeft.addChild(this.HandLeft);
            this.saveBase();
        }
        @Override
        public void setupAnim(KuduEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            }

            if (entity.isSprinting()) {
                float speed = 0.8f;
                float degree = 0.5f;

            } else {
                float speed = 1.7f;
                float degree = 0.6f;
            }
        }
    }
}
