package com.github.artyarticus.ecoregions.client.model;

import com.github.artyarticus.ecoregions.entity.PorcupineEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class PorcupineModel extends ZawaBaseModel<PorcupineEntity> {
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

    public static class Adult extends PorcupineModel {

        public ModelRenderer Body;
        public ModelRenderer ChestConnectionTop;
        public ModelRenderer Neck;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer Hips;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer TailBase;
        public ModelRenderer QuillHipConnector;
        public ModelRenderer LegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer LegRight;
        public ModelRenderer FootRight;
        public ModelRenderer Tail;
        public ModelRenderer TailSpikeLeft;
        public ModelRenderer TailSpikeRight;
        public ModelRenderer TailSpikeMiddle;
        public ModelRenderer TailSpikeTop;
        public ModelRenderer TailSpikeBottom;
        public ModelRenderer QuillsHipLeft;
        public ModelRenderer QuillsHipRight1;
        public ModelRenderer QuillsHipLeft_1;
        public ModelRenderer QuillsHipRight2;
        public ModelRenderer QuillsHipLeft_2;
        public ModelRenderer QuillsHipLeft_3;
        public ModelRenderer QuillsHipLeft_4;
        public ModelRenderer QuillsHipRight3;
        public ModelRenderer QuillsHipRight4;
        public ModelRenderer QuillsHipRight5;
        public ModelRenderer NeckLower;
        public ModelRenderer Head;
        public ModelRenderer MouthRight;
        public ModelRenderer MouthLeft;
        public ModelRenderer Snout;
        public ModelRenderer Jaw;
        public ModelRenderer EarLeft;
        public ModelRenderer EarRight;
        public ModelRenderer HeadCrestMiddle;
        public ModelRenderer CheekRight;
        public ModelRenderer CheekLeft;
        public ModelRenderer Nose;
        public ModelRenderer HeadCrestLeft;
        public ModelRenderer HeadCrestRight;
        public ModelRenderer ArmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer ArmRight;
        public ModelRenderer HandRight;

        public Adult() {
            this.texWidth = 64;
            this.texHeight = 64;
            this.QuillsHipRight2 = new ModelRenderer(this, 0, 40);
            this.QuillsHipRight2.setPos(-1.0F, 0.0F, 0.0F);
            this.QuillsHipRight2.addBox(-0.5F, -6.0F, -3.0F, 1.0F, 9.0F, 14.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(QuillsHipRight2, 0.3642502295386026F, -0.18203784630933073F, -0.27314402127920984F);
            this.FootLeft = new ModelRenderer(this, 0, 17);
            this.FootLeft.mirror = true;
            this.FootLeft.setPos(-0.01F, 3.5F, 1.5F);
            this.FootLeft.addBox(-1.0F, 0.0F, -3.5F, 2.0F, 1.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, -0.2275909337942703F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 8, 0);
            this.ThighLeft.mirror = true;
            this.ThighLeft.setPos(3.6F, 1.2F, 1.9F);
            this.ThighLeft.addBox(-1.5F, 0.0F, -2.5F, 3.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.0911061832922575F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 29, 8);
            this.ArmRight.setPos(0.6F, 3.5F, 0.5F);
            this.ArmRight.addBox(-1.0F, 0.0F, -2.5F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.13665927909957545F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 42, 0);
            this.Chest.setPos(0.0F, 16.9F, -4.0F);
            this.Chest.addBox(-3.5F, -3.5F, -2.0F, 7.0F, 7.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, 0.13665927909957545F, 0.0F, 0.0F);
            this.QuillHipConnector = new ModelRenderer(this, 0, 0);
            this.QuillHipConnector.setPos(0.0F, 0.5F, 0.0F);
            this.QuillHipConnector.addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(QuillHipConnector, 0.2275909337942703F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 21, 13);
            this.HandLeft.mirror = true;
            this.HandLeft.setPos(-0.01F, 3.5F, -0.5F);
            this.HandLeft.addBox(-1.0F, -0.5F, -3.5F, 2.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.04555309164612875F, 0.0F, 0.0F);
            this.TailSpikeBottom = new ModelRenderer(this, 0, 41);
            this.TailSpikeBottom.setPos(0.0F, 2.0F, 3.0F);
            this.TailSpikeBottom.addBox(-1.5F, -0.5F, 0.0F, 3.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailSpikeBottom, -0.4098033003787853F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 32, 11);
            this.Body.setPos(0.0F, -3.0F, 1.5F);
            this.Body.addBox(-4.0F, -1.0F, 0.0F, 8.0F, 8.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, -0.13665927909957545F, 0.0F, 0.0F);
            this.TailSpikeRight = new ModelRenderer(this, 0, 46);
            this.TailSpikeRight.setPos(0.0F, 0.5F, 3.0F);
            this.TailSpikeRight.addBox(-1.0F, -1.0F, 0.0F, 1.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailSpikeRight, 0.0F, -0.3642502295386026F, 0.0F);
            this.QuillsHipLeft_1 = new ModelRenderer(this, 0, 40);
            this.QuillsHipLeft_1.setPos(1.0F, 0.0F, 0.0F);
            this.QuillsHipLeft_1.addBox(-0.5F, -6.0F, -3.0F, 1.0F, 9.0F, 14.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(QuillsHipLeft_1, 0.3642502295386026F, 0.18203784630933073F, 0.27314402127920984F);
            this.EarLeft = new ModelRenderer(this, 29, 31);
            this.EarLeft.mirror = true;
            this.EarLeft.setPos(2.0F, -0.5F, 1.5F);
            this.EarLeft.addBox(-1.0F, -2.5F, -0.5F, 2.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.18203784630933073F, -0.8651597048872669F, 0.4098033003787853F);
            this.LegRight = new ModelRenderer(this, 8, 10);
            this.LegRight.setPos(0.0F, 5.5F, -2.0F);
            this.LegRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, 0.27314402127920984F, 0.0F, 0.0F);
            this.LegLeft = new ModelRenderer(this, 8, 10);
            this.LegLeft.mirror = true;
            this.LegLeft.setPos(0.0F, 5.5F, -2.0F);
            this.LegLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, 0.27314402127920984F, 0.0F, 0.0F);
            this.QuillsHipRight5 = new ModelRenderer(this, 0, 40);
            this.QuillsHipRight5.setPos(-1.2F, 0.2F, -0.3F);
            this.QuillsHipRight5.addBox(-0.5F, -6.0F, -3.0F, 1.0F, 9.0F, 14.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(QuillsHipRight5, -0.0911061832922575F, -0.04555309164612875F, 0.0F);
            this.QuillsHipRight1 = new ModelRenderer(this, 0, 40);
            this.QuillsHipRight1.setPos(-0.5F, 0.0F, 0.0F);
            this.QuillsHipRight1.addBox(-0.5F, -6.0F, -3.0F, 1.0F, 9.0F, 14.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(QuillsHipRight1, 0.3642502295386026F, -0.0911061832922575F, -0.03710113380784196F);
            this.Head = new ModelRenderer(this, 17, 37);
            this.Head.setPos(0.0F, 2.0F, -5.5F);
            this.Head.addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.QuillsHipRight4 = new ModelRenderer(this, 0, 40);
            this.QuillsHipRight4.setPos(-1.2F, 0.1F, -0.3F);
            this.QuillsHipRight4.addBox(-0.5F, -6.0F, -3.0F, 1.0F, 9.0F, 14.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(QuillsHipRight4, -0.0911061832922575F, -0.04555309164612875F, 0.0F);
            this.ChestConnectionTop = new ModelRenderer(this, 42, 0);
            this.ChestConnectionTop.setPos(0.0F, -2.4F, 1.6F);
            this.ChestConnectionTop.addBox(-3.5F, -1.5F, -3.5F, 7.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ChestConnectionTop, 0.0911061832922575F, 0.0F, 0.0F);
            this.MouthRight = new ModelRenderer(this, 16, 48);
            this.MouthRight.setPos(-0.7F, 0.0F, -2.0F);
            this.MouthRight.addBox(-1.0F, -1.0F, -3.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(MouthRight, 0.2275909337942703F, 0.0F, -0.0911061832922575F);
            this.QuillsHipRight3 = new ModelRenderer(this, 0, 40);
            this.QuillsHipRight3.setPos(-1.0F, 0.1F, -0.1F);
            this.QuillsHipRight3.addBox(-0.5F, -6.0F, -3.0F, 1.0F, 9.0F, 14.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(QuillsHipRight3, -0.04555309164612875F, -0.04555309164612875F, 0.0F);
            this.MouthLeft = new ModelRenderer(this, 16, 48);
            this.MouthLeft.mirror = true;
            this.MouthLeft.setPos(0.7F, 0.0F, -2.0F);
            this.MouthLeft.addBox(-1.0F, -1.0F, -3.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(MouthLeft, 0.2275909337942703F, 0.0F, 0.0911061832922575F);
            this.ArmBaseRight = new ModelRenderer(this, 27, 0);
            this.ArmBaseRight.setPos(-3.0F, -0.2F, 1.0F);
            this.ArmBaseRight.addBox(-0.9F, 0.0F, -2.5F, 3.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, -0.04555309164612875F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 21, 13);
            this.HandRight.setPos(0.01F, 3.5F, -0.5F);
            this.HandRight.addBox(-1.0F, -0.5F, -3.5F, 2.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.04555309164612875F, 0.0F, 0.0F);
            this.Nose = new ModelRenderer(this, 38, 62);
            this.Nose.setPos(0.0F, -0.6F, -1.5F);
            this.Nose.addBox(-1.0F, -0.5F, -1.3F, 2.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Nose, 0.2275909337942703F, 0.0F, 0.0F);
            this.QuillsHipLeft_4 = new ModelRenderer(this, 0, 40);
            this.QuillsHipLeft_4.setPos(1.2F, 0.2F, -0.3F);
            this.QuillsHipLeft_4.addBox(-0.5F, -6.0F, -3.0F, 1.0F, 9.0F, 14.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(QuillsHipLeft_4, -0.0911061832922575F, 0.04555309164612875F, 0.0F);
            this.TailSpikeLeft = new ModelRenderer(this, 0, 46);
            this.TailSpikeLeft.setPos(0.0F, 0.5F, 3.0F);
            this.TailSpikeLeft.addBox(0.0F, -1.0F, 0.0F, 1.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailSpikeLeft, 0.0F, 0.3642502295386026F, 0.0F);
            this.QuillsHipLeft_2 = new ModelRenderer(this, 0, 40);
            this.QuillsHipLeft_2.setPos(1.0F, 0.1F, -0.1F);
            this.QuillsHipLeft_2.addBox(-0.5F, -6.0F, -3.0F, 1.0F, 9.0F, 14.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(QuillsHipLeft_2, -0.04555309164612875F, 0.04555309164612875F, 0.0F);
            this.HeadCrestMiddle = new ModelRenderer(this, 3, 19);
            this.HeadCrestMiddle.setPos(0.0F, 3.0F, 2.5F);
            this.HeadCrestMiddle.addBox(-0.5F, -7.5F, -2.0F, 1.0F, 7.0F, 11.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HeadCrestMiddle, 0.0911061832922575F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 38, 27);
            this.Hips.setPos(0.0F, -0.5F, 7.5F);
            this.Hips.addBox(-4.5F, -0.6F, 0.0F, 9.0F, 8.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.13665927909957545F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 31, 57);
            this.Snout.setPos(0.0F, -1.0F, -2.6F);
            this.Snout.addBox(-1.5F, -1.0F, -2.0F, 3.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.3642502295386026F, 0.0F, 0.0F);
            this.HeadCrestRight = new ModelRenderer(this, 3, 19);
            this.HeadCrestRight.setPos(-0.5F, -0.4F, 0.1F);
            this.HeadCrestRight.addBox(-0.5F, -7.0F, -2.0F, 1.0F, 7.0F, 11.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HeadCrestRight, 0.0F, -0.04555309164612875F, -0.04555309164612875F);
            this.TailBase = new ModelRenderer(this, 37, 39);
            this.TailBase.setPos(0.0F, 0.0F, 3.5F);
            this.TailBase.addBox(-1.5F, -0.5F, 0.0F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailBase, -0.6373942508178124F, 0.0F, 0.0F);
            this.TailSpikeMiddle = new ModelRenderer(this, 0, 46);
            this.TailSpikeMiddle.setPos(0.0F, 0.5F, 3.0F);
            this.TailSpikeMiddle.addBox(-0.5F, -1.0F, 0.0F, 1.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.Tail = new ModelRenderer(this, 51, 39);
            this.Tail.setPos(0.0F, 0.0F, 2.5F);
            this.Tail.addBox(-1.0F, 0.0F, -0.5F, 2.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail, 0.500909508638178F, 0.0F, 0.0F);
            this.TailSpikeTop = new ModelRenderer(this, 0, 41);
            this.TailSpikeTop.setPos(0.0F, 0.0F, 3.0F);
            this.TailSpikeTop.addBox(-1.5F, -0.2F, 0.0F, 3.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailSpikeTop, 0.4098033003787853F, 0.0F, 0.0F);
            this.HeadCrestLeft = new ModelRenderer(this, 3, 19);
            this.HeadCrestLeft.mirror = true;
            this.HeadCrestLeft.setPos(0.5F, -0.4F, 0.1F);
            this.HeadCrestLeft.addBox(-0.5F, -7.0F, -2.0F, 1.0F, 7.0F, 11.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HeadCrestLeft, 0.0F, 0.04555309164612875F, 0.04555309164612875F);
            this.ThighRight = new ModelRenderer(this, 8, 0);
            this.ThighRight.setPos(-3.6F, 1.2F, 1.9F);
            this.ThighRight.addBox(-1.5F, 0.0F, -2.5F, 3.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.0911061832922575F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 0, 17);
            this.FootRight.setPos(-0.01F, 3.5F, 1.5F);
            this.FootRight.addBox(-1.0F, 0.0F, -3.5F, 2.0F, 1.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, -0.2275909337942703F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 29, 8);
            this.ArmLeft.mirror = true;
            this.ArmLeft.setPos(-0.6F, 3.5F, 0.5F);
            this.ArmLeft.addBox(-1.0F, 0.0F, -2.5F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.13665927909957545F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 27, 0);
            this.ArmBaseLeft.mirror = true;
            this.ArmBaseLeft.setPos(3.0F, -0.2F, 1.0F);
            this.ArmBaseLeft.addBox(-2.1F, 0.0F, -2.5F, 3.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, -0.04555309164612875F, 0.0F, 0.0F);
            this.QuillsHipLeft = new ModelRenderer(this, 0, 40);
            this.QuillsHipLeft.setPos(0.5F, 0.0F, 0.0F);
            this.QuillsHipLeft.addBox(-0.5F, -6.0F, -3.0F, 1.0F, 9.0F, 14.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(QuillsHipLeft, 0.3642502295386026F, 0.0911061832922575F, 0.04555309164612875F);
            this.Jaw = new ModelRenderer(this, 25, 47);
            this.Jaw.setPos(0.0F, 1.8F, -2.1F);
            this.Jaw.addBox(-1.5F, -0.5F, -2.5F, 3.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Jaw, -0.13665927909957545F, 0.0F, 0.0F);
            this.CheekLeft = new ModelRenderer(this, 17, 20);
            this.CheekLeft.mirror = true;
            this.CheekLeft.setPos(1.8F, 0.6F, -0.6F);
            this.CheekLeft.addBox(-2.0F, -1.0F, -2.0F, 3.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(CheekLeft, 0.0F, 0.04555309164612875F, -0.13665927909957545F);
            this.CheekRight = new ModelRenderer(this, 17, 20);
            this.CheekRight.setPos(-1.8F, 0.6F, -0.6F);
            this.CheekRight.addBox(-1.0F, -1.0F, -2.0F, 3.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(CheekRight, 0.0F, -0.04555309164612875F, 0.13665927909957545F);
            this.Neck = new ModelRenderer(this, 37, 46);
            this.Neck.setPos(0.0F, -3.0F, -1.0F);
            this.Neck.addBox(-3.0F, -0.5F, -4.0F, 6.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, 0.18203784630933073F, 0.0F, 0.0F);
            this.NeckLower = new ModelRenderer(this, 44, 56);
            this.NeckLower.setPos(0.0F, 5.0F, -1.5F);
            this.NeckLower.addBox(-2.1F, -1.3F, -4.0F, 4.0F, 2.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckLower, -0.3642502295386026F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 29, 31);
            this.EarRight.setPos(-2.0F, -0.5F, 1.5F);
            this.EarRight.addBox(-1.0F, -2.5F, -0.5F, 2.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.18203784630933073F, 0.8651597048872669F, -0.4098033003787853F);
            this.QuillsHipLeft_3 = new ModelRenderer(this, 0, 40);
            this.QuillsHipLeft_3.setPos(1.2F, 0.1F, -0.3F);
            this.QuillsHipLeft_3.addBox(-0.5F, -6.0F, -3.0F, 1.0F, 9.0F, 14.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(QuillsHipLeft_3, -0.0911061832922575F, 0.04555309164612875F, 0.0F);
            this.QuillHipConnector.addChild(this.QuillsHipRight2);
            this.LegLeft.addChild(this.FootLeft);
            this.Hips.addChild(this.ThighLeft);
            this.ArmBaseRight.addChild(this.ArmRight);
            this.Hips.addChild(this.QuillHipConnector);
            this.ArmLeft.addChild(this.HandLeft);
            this.Tail.addChild(this.TailSpikeBottom);
            this.Chest.addChild(this.Body);
            this.Tail.addChild(this.TailSpikeRight);
            this.QuillHipConnector.addChild(this.QuillsHipLeft_1);
            this.Head.addChild(this.EarLeft);
            this.ThighRight.addChild(this.LegRight);
            this.ThighLeft.addChild(this.LegLeft);
            this.QuillsHipRight4.addChild(this.QuillsHipRight5);
            this.QuillHipConnector.addChild(this.QuillsHipRight1);
            this.Neck.addChild(this.Head);
            this.QuillsHipRight3.addChild(this.QuillsHipRight4);
            this.Chest.addChild(this.ChestConnectionTop);
            this.Head.addChild(this.MouthRight);
            this.QuillsHipRight2.addChild(this.QuillsHipRight3);
            this.Head.addChild(this.MouthLeft);
            this.Chest.addChild(this.ArmBaseRight);
            this.ArmRight.addChild(this.HandRight);
            this.Snout.addChild(this.Nose);
            this.QuillsHipLeft_3.addChild(this.QuillsHipLeft_4);
            this.Tail.addChild(this.TailSpikeLeft);
            this.QuillsHipLeft_1.addChild(this.QuillsHipLeft_2);
            this.Head.addChild(this.HeadCrestMiddle);
            this.Body.addChild(this.Hips);
            this.Head.addChild(this.Snout);
            this.HeadCrestMiddle.addChild(this.HeadCrestRight);
            this.Hips.addChild(this.TailBase);
            this.Tail.addChild(this.TailSpikeMiddle);
            this.TailBase.addChild(this.Tail);
            this.Tail.addChild(this.TailSpikeTop);
            this.HeadCrestMiddle.addChild(this.HeadCrestLeft);
            this.Hips.addChild(this.ThighRight);
            this.LegRight.addChild(this.FootRight);
            this.ArmBaseLeft.addChild(this.ArmLeft);
            this.Chest.addChild(this.ArmBaseLeft);
            this.QuillHipConnector.addChild(this.QuillsHipLeft);
            this.Head.addChild(this.Jaw);
            this.Head.addChild(this.CheekLeft);
            this.Head.addChild(this.CheekRight);
            this.Chest.addChild(this.Neck);
            this.Neck.addChild(this.NeckLower);
            this.Head.addChild(this.EarRight);
            this.QuillsHipLeft_2.addChild(this.QuillsHipLeft_3);
            this.saveBase();
        }

        @Override
        public void setupAnim(PorcupineEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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


    public static class Child extends PorcupineModel {

        public ModelRenderer Neck;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer Hip;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer Head;
        public ModelRenderer EarLeft;
        public ModelRenderer EarRight;
        public ModelRenderer Snout;
        public ModelRenderer Mouth;
        public ModelRenderer Crest;
        public ModelRenderer NoseR;
        public ModelRenderer NoseL;
        public ModelRenderer Nose;
        public ModelRenderer ArmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer ThighLeft;
        public ModelRenderer Tail;
        public ModelRenderer ThighRight;
        public ModelRenderer QuillConnection;
        public ModelRenderer LegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer LegRight;
        public ModelRenderer FootRight;
        public ModelRenderer QuillsHipLeft3;
        public ModelRenderer QuillsHipLeft2;
        public ModelRenderer QuillsHipLeft1;
        public ModelRenderer QuillsHipRight3;
        public ModelRenderer QuillsHipRight2;
        public ModelRenderer QuillsHipRight1;
        public ModelRenderer QuillsHipMiddle;
        public ModelRenderer ArmRight;
        public ModelRenderer HandRight;

        public Child() {
            this.texWidth = 23;
            this.texHeight = 32;
            this.Crest = new ModelRenderer(this, 8, 16);
            this.Crest.setPos(0.0F, -1.0F, 0.0F);
            this.Crest.addBox(-0.5F, -0.7F, -0.5F, 1.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Crest, 0.04555309164612875F, 0.0F, 0.0F);
            this.QuillsHipMiddle = new ModelRenderer(this, 0, 15);
            this.QuillsHipMiddle.setPos(0.0F, -0.4F, 0.0F);
            this.QuillsHipMiddle.addBox(-0.5F, -2.0F, 0.0F, 1.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(QuillsHipMiddle, 0.3642502295386026F, 0.0F, 0.0F);
            this.QuillsHipLeft1 = new ModelRenderer(this, 0, 15);
            this.QuillsHipLeft1.setPos(0.4F, -0.3F, -0.1F);
            this.QuillsHipLeft1.addBox(-0.5F, -2.0F, 0.0F, 1.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(QuillsHipLeft1, 0.3642502295386026F, 0.18203784630933073F, 0.0F);
            this.FootRight = new ModelRenderer(this, 17, 5);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.02F, 1.0F, 0.4F);
            this.FootRight.addBox(-0.5F, -0.5F, -1.6F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, -0.3642502295386026F, 0.0F, 0.0F);
            this.QuillsHipRight1 = new ModelRenderer(this, 0, 15);
            this.QuillsHipRight1.setPos(-0.4F, -0.3F, -0.1F);
            this.QuillsHipRight1.addBox(-0.5F, -2.0F, 0.0F, 1.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(QuillsHipRight1, 0.3642502295386026F, -0.18203784630933073F, 0.0F);
            this.Hip = new ModelRenderer(this, 0, 0);
            this.Hip.setPos(0.0F, -1.1F, 0.5F);
            this.Hip.addBox(-1.9F, -0.5F, -0.2F, 4.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hip, -0.18203784630933073F, 0.0F, 0.0F);
            this.LegLeft = new ModelRenderer(this, 19, 9);
            this.LegLeft.mirror = true;
            this.LegLeft.setPos(0.1F, 2.0F, -0.8F);
            this.LegLeft.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, 0.5462880425584197F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 0, 27);
            this.Head.setPos(0.0F, 0.5F, -1.1F);
            this.Head.addBox(-1.5F, -1.5F, -1.0F, 3.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.3186971254089062F, 0.0F, 0.0F);
            this.Nose = new ModelRenderer(this, 11, 25);
            this.Nose.setPos(0.0F, -0.77F, -0.8F);
            this.Nose.addBox(-0.5F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Nose, 0.18203784630933073F, 0.0F, 0.0F);
            this.LegRight = new ModelRenderer(this, 19, 9);
            this.LegRight.mirror = true;
            this.LegRight.setPos(0.1F, 2.0F, -0.8F);
            this.LegRight.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, 0.5462880425584197F, 0.0F, 0.0F);
            this.QuillsHipRight3 = new ModelRenderer(this, 0, 15);
            this.QuillsHipRight3.setPos(-1.7F, 0.2F, -0.3F);
            this.QuillsHipRight3.addBox(-0.5F, -2.0F, 0.0F, 1.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(QuillsHipRight3, 0.3642502295386026F, -0.18203784630933073F, 0.0F);
            this.QuillsHipRight2 = new ModelRenderer(this, 0, 15);
            this.QuillsHipRight2.setPos(-1.0F, -0.1F, -0.2F);
            this.QuillsHipRight2.addBox(-0.5F, -2.0F, 0.0F, 1.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(QuillsHipRight2, 0.3642502295386026F, -0.18203784630933073F, 0.0F);
            this.Tail = new ModelRenderer(this, 0, 22);
            this.Tail.setPos(0.0F, 0.0F, 2.3F);
            this.Tail.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail, -0.5462880425584197F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 10, 14);
            this.HandLeft.mirror = true;
            this.HandLeft.setPos(-0.02F, 1.0F, -0.6F);
            this.HandLeft.addBox(-0.5F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.3186971254089062F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 11, 7);
            this.ThighRight.setPos(-1.5F, 0.5F, 1.5F);
            this.ThighRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.04555309164612875F, 0.0F, 0.0F);
            this.NoseR = new ModelRenderer(this, 10, 29);
            this.NoseR.setPos(0.0F, 0.5F, -0.1F);
            this.NoseR.addBox(-0.9F, -1.3F, -1.3F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NoseR, 0.13665927909957545F, 0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 18, 14);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-1.3F, 0.7F, -0.9F);
            this.ArmBaseRight.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.13962634015954636F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 11, 7);
            this.ThighLeft.setPos(1.5F, 0.5F, 1.5F);
            this.ThighLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.04555309164612875F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 14, 14);
            this.ArmLeft.mirror = true;
            this.ArmLeft.setPos(-0.02F, 1.0F, 0.5F);
            this.ArmLeft.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.47123889803846897F, 0.0F, 0.0F);
            this.QuillConnection = new ModelRenderer(this, 19, 0);
            this.QuillConnection.setPos(0.0F, 0.7F, 0.7F);
            this.QuillConnection.addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(QuillConnection, 0.18203784630933073F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 18, 14);
            this.ArmBaseLeft.mirror = true;
            this.ArmBaseLeft.setPos(1.3F, 0.7F, -0.9F);
            this.ArmBaseLeft.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.13962634015954636F, 0.0F, 0.0F);
            this.NoseL = new ModelRenderer(this, 10, 29);
            this.NoseL.mirror = true;
            this.NoseL.setPos(0.0F, 0.0F, 0.0F);
            this.NoseL.addBox(-0.1F, -1.3F, -1.3F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 7);
            this.Chest.setPos(0.0F, 21.5F, 0.0F);
            this.Chest.addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, 0.04555309164612875F, 0.0F, 0.0F);
            this.QuillsHipLeft3 = new ModelRenderer(this, 0, 15);
            this.QuillsHipLeft3.setPos(1.7F, 0.2F, -0.3F);
            this.QuillsHipLeft3.addBox(-0.5F, -2.0F, 0.0F, 1.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(QuillsHipLeft3, 0.3642502295386026F, 0.18203784630933073F, 0.0F);
            this.Snout = new ModelRenderer(this, 14, 26);
            this.Snout.setPos(0.0F, -0.2F, -0.2F);
            this.Snout.addBox(-1.0F, 0.0F, -1.8F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.2275909337942703F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 14, 14);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(0.02F, 1.0F, 0.5F);
            this.ArmRight.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.47123889803846897F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 10, 14);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.02F, 1.0F, -0.6F);
            this.HandRight.addBox(-0.5F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.3186971254089062F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 17, 30);
            this.EarLeft.mirror = true;
            this.EarLeft.setPos(1.0F, -0.7F, 0.5F);
            this.EarLeft.addBox(-0.2F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, -0.13665927909957545F, -0.3186971254089062F, 0.3642502295386026F);
            this.Mouth = new ModelRenderer(this, 7, 21);
            this.Mouth.setPos(0.0F, 0.9F, -0.3F);
            this.Mouth.addBox(-0.5F, -0.5F, -1.4F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 17, 5);
            this.FootLeft.mirror = true;
            this.FootLeft.setPos(-0.02F, 1.0F, 0.4F);
            this.FootLeft.addBox(-0.5F, -0.5F, -1.6F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, -0.3642502295386026F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 17, 30);
            this.EarRight.setPos(-1.0F, -0.7F, 0.5F);
            this.EarRight.addBox(-0.8F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, -0.13665927909957545F, 0.3186971254089062F, -0.3642502295386026F);
            this.Neck = new ModelRenderer(this, 14, 21);
            this.Neck.setPos(0.0F, -0.8F, -1.5F);
            this.Neck.addBox(-1.0F, -0.7F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.2275909337942703F, 0.0F, 0.0F);
            this.QuillsHipLeft2 = new ModelRenderer(this, 0, 15);
            this.QuillsHipLeft2.setPos(1.0F, -0.1F, -0.2F);
            this.QuillsHipLeft2.addBox(-0.5F, -2.0F, 0.0F, 1.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(QuillsHipLeft2, 0.3642502295386026F, 0.18203784630933073F, 0.0F);
            this.Head.addChild(this.Crest);
            this.QuillConnection.addChild(this.QuillsHipMiddle);
            this.QuillConnection.addChild(this.QuillsHipLeft1);
            this.LegRight.addChild(this.FootRight);
            this.QuillConnection.addChild(this.QuillsHipRight1);
            this.Chest.addChild(this.Hip);
            this.ThighLeft.addChild(this.LegLeft);
            this.Neck.addChild(this.Head);
            this.NoseR.addChild(this.Nose);
            this.ThighRight.addChild(this.LegRight);
            this.QuillConnection.addChild(this.QuillsHipRight3);
            this.QuillConnection.addChild(this.QuillsHipRight2);
            this.Hip.addChild(this.Tail);
            this.ArmLeft.addChild(this.HandLeft);
            this.Hip.addChild(this.ThighRight);
            this.Snout.addChild(this.NoseR);
            this.Chest.addChild(this.ArmBaseRight);
            this.Hip.addChild(this.ThighLeft);
            this.ArmBaseLeft.addChild(this.ArmLeft);
            this.Hip.addChild(this.QuillConnection);
            this.Chest.addChild(this.ArmBaseLeft);
            this.NoseR.addChild(this.NoseL);
            this.QuillConnection.addChild(this.QuillsHipLeft3);
            this.Head.addChild(this.Snout);
            this.ArmBaseRight.addChild(this.ArmRight);
            this.ArmRight.addChild(this.HandRight);
            this.Head.addChild(this.EarLeft);
            this.Head.addChild(this.Mouth);
            this.LegLeft.addChild(this.FootLeft);
            this.Head.addChild(this.EarRight);
            this.Chest.addChild(this.Neck);
            this.QuillConnection.addChild(this.QuillsHipLeft2);
            this.saveBase();

        }

        @Override
        public void setupAnim(PorcupineEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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


