package com.github.artyarticus.ecoregions.client.model;

import com.github.artyarticus.ecoregions.entity.AracariEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class AracariModel extends ZawaBaseModel<AracariEntity> {
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

    public static class Adult extends AracariModel {
        public ModelRenderer TailBase;
        public ModelRenderer RightLeg;
        public ModelRenderer Leg;
        public ModelRenderer Neck1;
        public ModelRenderer Wing;
        public ModelRenderer RightWing;
        public ModelRenderer TailMiddle;
        public ModelRenderer Tail;
        public ModelRenderer TailRight;
        public ModelRenderer RightFoot;
        public ModelRenderer Toe1RIght;
        public ModelRenderer Foot;
        public ModelRenderer Toe1Right;
        public ModelRenderer Neck2;
        public ModelRenderer Head;
        public ModelRenderer UpperBill;
        public ModelRenderer Crest;
        public ModelRenderer LowerBill;
        public ModelRenderer M;

        public Adult() {
            texWidth = 32;
            texHeight = 32;
            this.RightFoot = new ModelRenderer(this, 26, 10);
            this.RightFoot.setPos(-0.1F, 0.0F, -1.4F);
            this.RightFoot.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightFoot, 0.3707079291288539F, 0.1563815016444822F, -0.39112828270876815F);
            this.Neck2 = new ModelRenderer(this, 16, 0);
            this.Neck2.setPos(0.0F, 0.0F, 2.0F);
            this.Neck2.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck2, -0.604756612447646F, 0.0F, 0.0F);
            this.RightWing = new ModelRenderer(this, 0, 14);
            this.RightWing.mirror = true;
            this.RightWing.setPos(-1.7F, -2.0F, 1.1F);
            this.RightWing.addBox(-1.0F, 0.0F, -2.0F, 1.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightWing, 0.0F, 0.0911061832922575F, -0.13665927909957545F);
            this.Toe1Right = new ModelRenderer(this, 26, 0);
            this.Toe1Right.setPos(0.0F, 0.2F, -0.01F);
            this.Toe1Right.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe1Right, 0.0F, 0.0F, -0.9436995212270118F);
            this.Foot = new ModelRenderer(this, 24, 20);
            this.Foot.setPos(0.1F, 0.0F, -1.4F);
            this.Foot.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Foot, 0.3707079291288539F, -0.1563815016444822F, 0.39112828270876815F);
            this.RightLeg = new ModelRenderer(this, 0, 22);
            this.RightLeg.setPos(-1.3F, 0.7F, -1.8F);
            this.RightLeg.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightLeg, 0.2539454094941263F, 0.0F, 0.0F);
            this.Crest = new ModelRenderer(this, 24, 23);
            this.Crest.setPos(-0.01F, -1.5F, 1.9F);
            this.Crest.addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.TailRight = new ModelRenderer(this, 20, 10);
            this.TailRight.mirror = true;
            this.TailRight.setPos(-1.2F, -0.2F, -0.1F);
            this.TailRight.addBox(-0.5F, -0.2F, -1.0F, 2.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailRight, 0.0F, 0.0F, 0.09791297336714784F);
            this.UpperBill = new ModelRenderer(this, 20, 5);
            this.UpperBill.setPos(0.0F, -3.2F, 0.3F);
            this.UpperBill.addBox(-1.0F, -2.3F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperBill, 0.11676252795710604F, 0.0F, 0.0F);
            this.M = new ModelRenderer(this, 14, 21);
            this.M.setPos(0.01F, 0.0F, -0.5F);
            this.M.addBox(-0.5F, -2.9F, -1.0F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(M, -0.19547687289441354F, 0.0F, 0.0F);
            this.Neck1 = new ModelRenderer(this, 8, 16);
            this.Neck1.setPos(0.0F, -2.0F, -2.0F);
            this.Neck1.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck1, 0.8260643669268491F, 0.0F, 0.0F);
            this.Toe1RIght = new ModelRenderer(this, 4, 25);
            this.Toe1RIght.setPos(0.0F, 0.2F, -0.01F);
            this.Toe1RIght.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe1RIght, 0.0F, 0.0F, 0.9436995212270118F);
            this.Head = new ModelRenderer(this, 0, 8);
            this.Head.setPos(0.0F, 2.0F, 3.0F);
            this.Head.addBox(-1.5F, -3.0F, -1.2F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.494451775758413F, 0.0F, 0.0F);
            this.Tail = new ModelRenderer(this, 20, 10);
            this.Tail.setPos(1.2F, -0.2F, -0.1F);
            this.Tail.addBox(-1.5F, -0.2F, -1.0F, 2.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail, 0.0F, 0.0F, -0.09791297336714784F);
            this.TailBase = new ModelRenderer(this, 18, 16);
            this.TailBase.setPos(0.0F, 1.4F, 2.0F);
            this.TailBase.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailBase, 0.3324852091891143F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 0);
            this.Body.setPos(0.0F, 19.8F, 0.0F);
            this.Body.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.9445721725372036F, 0.0F, 0.0F);
            this.Wing = new ModelRenderer(this, 0, 14);
            this.Wing.setPos(1.7F, -2.0F, 1.1F);
            this.Wing.addBox(0.0F, 0.0F, -2.0F, 1.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Wing, 0.0F, -0.0911061832922575F, 0.13665927909957545F);
            this.TailMiddle = new ModelRenderer(this, 18, 20);
            this.TailMiddle.setPos(0.0F, 2.0F, 0.0F);
            this.TailMiddle.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailMiddle, 0.23457224414434488F, 0.0F, 0.0F);
            this.Leg = new ModelRenderer(this, 0, 22);
            this.Leg.setPos(1.3F, 0.7F, -1.8F);
            this.Leg.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Leg, 0.2539454094941263F, 0.0F, 0.0F);
            this.LowerBill = new ModelRenderer(this, 16, 5);
            this.LowerBill.setPos(0.0F, -1.9F, 0.6F);
            this.LowerBill.addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerBill, 0.7426375834077817F, 0.0F, 0.0F);
            this.RightLeg.addChild(this.RightFoot);
            this.Neck1.addChild(this.Neck2);
            this.Body.addChild(this.RightWing);
            this.Foot.addChild(this.Toe1Right);
            this.Leg.addChild(this.Foot);
            this.Body.addChild(this.RightLeg);
            this.Head.addChild(this.Crest);
            this.TailMiddle.addChild(this.TailRight);
            this.Head.addChild(this.UpperBill);
            this.UpperBill.addChild(this.M);
            this.Body.addChild(this.Neck1);
            this.RightFoot.addChild(this.Toe1RIght);
            this.Neck2.addChild(this.Head);
            this.TailMiddle.addChild(this.Tail);
            this.Body.addChild(this.TailBase);
            this.Body.addChild(this.Wing);
            this.TailBase.addChild(this.TailMiddle);
            this.Body.addChild(this.Leg);
            this.UpperBill.addChild(this.LowerBill);
            this.saveBase();
        }

        @Override
        public void setupAnim(AracariEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck1.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.494F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.4F) * 0.5F + 0.826F;
            this.Neck2.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.604F;
            this.Head.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.15F) * 0.5F + 0.494F;
            this.TailBase.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.15F) * 0.5F + 0.332F;
        }

        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
        }
    }

    public static class Flying extends AracariModel {
        public ModelRenderer TailBase;
        public ModelRenderer RightLeg;
        public ModelRenderer Leg;
        public ModelRenderer Neck1;
        public ModelRenderer Wing1;
        public ModelRenderer Wing1Right;
        public ModelRenderer TailMiddle;
        public ModelRenderer Tail;
        public ModelRenderer TailRight;
        public ModelRenderer RightFoot;
        public ModelRenderer Toe1RIght;
        public ModelRenderer Foot;
        public ModelRenderer Toe1Right;
        public ModelRenderer Neck2;
        public ModelRenderer Head;
        public ModelRenderer UpperBill;
        public ModelRenderer Crest;
        public ModelRenderer LowerBill;
        public ModelRenderer M;
        public ModelRenderer Wing2;
        public ModelRenderer WingFeather1;
        public ModelRenderer WingFeather2;
        public ModelRenderer WingFeather3;
        public ModelRenderer WingFeather4;
        public ModelRenderer WingFeather5;
        public ModelRenderer WingFeather6;
        public ModelRenderer WingFeather7;
        public ModelRenderer WingFeather8;
        public ModelRenderer Wing2Right;
        public ModelRenderer WingFeather1Right;
        public ModelRenderer WingFeather2Right;
        public ModelRenderer WingFeather3Right;
        public ModelRenderer WingFeather4Right;
        public ModelRenderer WingFeather5Right;
        public ModelRenderer WingFeather6Right;
        public ModelRenderer RightWingFeather7;
        public ModelRenderer WingFeather8Right;

        public Flying() {

            texWidth = 32;
            texHeight = 32;
            this.Neck2 = new ModelRenderer(this, 16, 0);
            this.Neck2.setPos(0.0F, 0.0F, 2.0F);
            this.Neck2.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck2, -0.604756612447646F, 0.0F, 0.0F);
            this.WingFeather4 = new ModelRenderer(this, 8, 14);
            this.WingFeather4.setPos(0.0F, 0.0F, 0.0F);
            this.WingFeather4.addBox(0.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingFeather4, 0.0F, 0.0F, 0.2275909337942703F);
            this.WingFeather5Right = new ModelRenderer(this, 8, 14);
            this.WingFeather5Right.mirror = true;
            this.WingFeather5Right.setPos(0.0F, 0.0F, 0.0F);
            this.WingFeather5Right.addBox(-5.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingFeather5Right, 0.0F, 0.0F, -0.2275909337942703F);
            this.WingFeather2 = new ModelRenderer(this, 8, 14);
            this.WingFeather2.setPos(0.0F, 0.0F, 0.0F);
            this.WingFeather2.addBox(0.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingFeather2, 0.0F, 0.0F, 0.2275909337942703F);
            this.WingFeather6 = new ModelRenderer(this, 8, 14);
            this.WingFeather6.setPos(0.0F, 0.0F, 0.0F);
            this.WingFeather6.addBox(0.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingFeather6, 0.0F, 0.0F, 0.2275909337942703F);
            this.TailRight = new ModelRenderer(this, 20, 10);
            this.TailRight.mirror = true;
            this.TailRight.setPos(-1.2F, -0.2F, -0.1F);
            this.TailRight.addBox(-0.5F, -0.2F, -1.0F, 2.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailRight, 0.0F, 0.0F, 0.17645278138451428F);
            this.Toe1RIght = new ModelRenderer(this, 4, 25);
            this.Toe1RIght.setPos(0.0F, 0.2F, -0.01F);
            this.Toe1RIght.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe1RIght, 0.0F, 0.0F, 0.9436995212270118F);
            this.WingFeather8 = new ModelRenderer(this, 9, 14);
            this.WingFeather8.setPos(0.0F, 0.0F, 0.0F);
            this.WingFeather8.addBox(0.8F, 0.0F, -0.1F, 4.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingFeather8, 0.0F, 0.0F, 0.2275909337942703F);
            this.UpperBill = new ModelRenderer(this, 20, 5);
            this.UpperBill.setPos(0.0F, -3.2F, 0.3F);
            this.UpperBill.addBox(-1.0F, -2.3F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperBill, 0.11676252795710604F, 0.0F, 0.0F);
            this.WingFeather3Right = new ModelRenderer(this, 8, 14);
            this.WingFeather3Right.mirror = true;
            this.WingFeather3Right.setPos(0.0F, 0.0F, 0.0F);
            this.WingFeather3Right.addBox(-5.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingFeather3Right, 0.0F, 0.0F, -0.2275909337942703F);
            this.M = new ModelRenderer(this, 14, 21);
            this.M.setPos(0.01F, 0.0F, -0.5F);
            this.M.addBox(-0.5F, -2.9F, -1.0F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(M, -0.19547687289441354F, 0.0F, 0.0F);
            this.Crest = new ModelRenderer(this, 24, 23);
            this.Crest.setPos(-0.01F, -1.5F, 1.9F);
            this.Crest.addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.RightLeg = new ModelRenderer(this, 0, 22);
            this.RightLeg.setPos(-1.3F, 2.0F, -2.0F);
            this.RightLeg.addBox(-0.5F, -2.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightLeg, -1.6207127540545787F, 0.0F, 0.0F);
            this.RightWingFeather7 = new ModelRenderer(this, 9, 14);
            this.RightWingFeather7.mirror = true;
            this.RightWingFeather7.setPos(0.0F, 0.0F, 0.0F);
            this.RightWingFeather7.addBox(-4.8F, 0.0F, -0.1F, 4.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightWingFeather7, 0.0F, 0.0F, -0.2275909337942703F);
            this.WingFeather3 = new ModelRenderer(this, 8, 14);
            this.WingFeather3.setPos(0.0F, 0.0F, 0.0F);
            this.WingFeather3.addBox(0.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingFeather3, 0.0F, 0.0F, 0.2275909337942703F);
            this.Wing1 = new ModelRenderer(this, 8, 28);
            this.Wing1.setPos(1.9F, -1.9F, 1.0F);
            this.Wing1.addBox(0.0F, 0.0F, -0.1F, 2.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Wing1, 0.0F, -0.500909508638178F, 0.18203784630933073F);
            this.Body = new ModelRenderer(this, 0, 0);
            this.Body.setPos(0.0F, 20.9F, 0.0F);
            this.Body.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 1.491907503194297F, 0.0F, 0.0F);
            this.WingFeather1 = new ModelRenderer(this, 8, 14);
            this.WingFeather1.setPos(3.0F, -4.0F, -0.01F);
            this.WingFeather1.addBox(0.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingFeather1, 0.0F, 0.0F, 0.27314402127920984F);
            this.RightFoot = new ModelRenderer(this, 26, 10);
            this.RightFoot.setPos(-0.1F, 0.0F, -1.4F);
            this.RightFoot.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightFoot, 2.5549874813418545F, 0.1563815016444822F, -0.39112828270876815F);
            this.Head = new ModelRenderer(this, 0, 8);
            this.Head.setPos(0.0F, 2.0F, 2.0F);
            this.Head.addBox(-1.5F, -3.0F, -1.2F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.025307274986155617F, 0.0F, 0.0F);
            this.Wing1Right = new ModelRenderer(this, 8, 28);
            this.Wing1Right.mirror = true;
            this.Wing1Right.setPos(-1.9F, -1.9F, 1.0F);
            this.Wing1Right.addBox(-2.0F, 0.0F, -0.1F, 2.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Wing1Right, 0.0F, 0.500909508638178F, -0.18203784630933073F);
            this.WingFeather4Right = new ModelRenderer(this, 8, 14);
            this.WingFeather4Right.mirror = true;
            this.WingFeather4Right.setPos(0.0F, 0.0F, 0.0F);
            this.WingFeather4Right.addBox(-5.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingFeather4Right, 0.0F, 0.0F, -0.2275909337942703F);
            this.Tail = new ModelRenderer(this, 20, 10);
            this.Tail.setPos(1.2F, -0.2F, -0.1F);
            this.Tail.addBox(-1.5F, -0.2F, -1.0F, 2.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail, 0.0F, 0.0F, -0.17645278138451428F);
            this.WingFeather1Right = new ModelRenderer(this, 8, 14);
            this.WingFeather1Right.mirror = true;
            this.WingFeather1Right.setPos(-3.0F, -4.0F, -0.01F);
            this.WingFeather1Right.addBox(-5.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingFeather1Right, 0.0F, 0.0F, -0.27314402127920984F);
            this.Foot = new ModelRenderer(this, 24, 20);
            this.Foot.setPos(0.1F, 0.0F, -1.4F);
            this.Foot.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Foot, 2.5549874813418545F, -0.1563815016444822F, 0.39112828270876815F);
            this.Leg = new ModelRenderer(this, 0, 22);
            this.Leg.setPos(1.3F, 2.0F, -2.0F);
            this.Leg.addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Leg, -1.6207127540545787F, 0.0F, 0.0F);
            this.Wing2 = new ModelRenderer(this, 24, 27);
            this.Wing2.setPos(2.0F, 4.0F, -0.01F);
            this.Wing2.addBox(0.0F, -4.0F, -0.1F, 3.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Wing2, 0.0F, 0.0F, -0.4098033003787853F);
            this.WingFeather5 = new ModelRenderer(this, 8, 14);
            this.WingFeather5.setPos(0.0F, 0.0F, 0.0F);
            this.WingFeather5.addBox(0.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingFeather5, 0.0F, 0.0F, 0.2275909337942703F);
            this.WingFeather2Right = new ModelRenderer(this, 8, 14);
            this.WingFeather2Right.mirror = true;
            this.WingFeather2Right.setPos(0.0F, 0.0F, -0.0F);
            this.WingFeather2Right.addBox(-5.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingFeather2Right, 0.0F, 0.0F, -0.2275909337942703F);
            this.LowerBill = new ModelRenderer(this, 16, 5);
            this.LowerBill.setPos(0.0F, -1.9F, 0.6F);
            this.LowerBill.addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerBill, 0.7426375834077817F, 0.0F, 0.0F);
            this.Wing2Right = new ModelRenderer(this, 24, 27);
            this.Wing2Right.mirror = true;
            this.Wing2Right.setPos(-2.0F, 4.0F, -0.01F);
            this.Wing2Right.addBox(-3.0F, -4.0F, -0.1F, 3.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Wing2Right, 0.0F, 0.0F, 0.3642502295386026F);
            this.WingFeather8Right = new ModelRenderer(this, 9, 14);
            this.WingFeather8Right.mirror = true;
            this.WingFeather8Right.setPos(0.0F, 0.0F, 0.0F);
            this.WingFeather8Right.addBox(-4.8F, 0.0F, -0.1F, 4.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingFeather8Right, 0.0F, 0.0F, -0.2275909337942703F);
            this.TailBase = new ModelRenderer(this, 18, 16);
            this.TailBase.setPos(0.0F, 1.4F, 2.0F);
            this.TailBase.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailBase, 0.09791297336714784F, 0.0F, 0.0F);
            this.Toe1Right = new ModelRenderer(this, 26, 0);
            this.Toe1Right.setPos(0.0F, 0.2F, -0.01F);
            this.Toe1Right.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe1Right, 0.0F, 0.0F, -0.9436995212270118F);
            this.WingFeather7 = new ModelRenderer(this, 8, 14);
            this.WingFeather7.setPos(0.0F, 0.0F, 0.0F);
            this.WingFeather7.addBox(0.8F, 0.0F, -0.1F, 4.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingFeather7, 0.0F, 0.0F, 0.2275909337942703F);
            this.WingFeather6Right = new ModelRenderer(this, 8, 14);
            this.WingFeather6Right.mirror = true;
            this.WingFeather6Right.setPos(0.0F, 0.0F, 0.0F);
            this.WingFeather6Right.addBox(-5.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingFeather6Right, 0.0F, 0.0F, -0.2275909337942703F);
            this.Neck1 = new ModelRenderer(this, 8, 16);
            this.Neck1.setPos(0.0F, -2.0F, -2.0F);
            this.Neck1.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck1, 0.8260643669268491F, 0.0F, 0.0F);
            this.TailMiddle = new ModelRenderer(this, 18, 20);
            this.TailMiddle.setPos(0.0F, 2.0F, 0.0F);
            this.TailMiddle.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailMiddle, 0.11728612207217244F, 0.0F, 0.0F);
            this.Neck1.addChild(this.Neck2);
            this.WingFeather3.addChild(this.WingFeather4);
            this.WingFeather4Right.addChild(this.WingFeather5Right);
            this.WingFeather1.addChild(this.WingFeather2);
            this.WingFeather5.addChild(this.WingFeather6);
            this.TailMiddle.addChild(this.TailRight);
            this.RightFoot.addChild(this.Toe1RIght);
            this.WingFeather7.addChild(this.WingFeather8);
            this.Head.addChild(this.UpperBill);
            this.WingFeather2Right.addChild(this.WingFeather3Right);
            this.UpperBill.addChild(this.M);
            this.Head.addChild(this.Crest);
            this.Body.addChild(this.RightLeg);
            this.WingFeather6Right.addChild(this.RightWingFeather7);
            this.WingFeather2.addChild(this.WingFeather3);
            this.Body.addChild(this.Wing1);
            this.Wing2.addChild(this.WingFeather1);
            this.RightLeg.addChild(this.RightFoot);
            this.Neck2.addChild(this.Head);
            this.Body.addChild(this.Wing1Right);
            this.WingFeather3Right.addChild(this.WingFeather4Right);
            this.TailMiddle.addChild(this.Tail);
            this.Wing2Right.addChild(this.WingFeather1Right);
            this.Leg.addChild(this.Foot);
            this.Body.addChild(this.Leg);
            this.Wing1.addChild(this.Wing2);
            this.WingFeather4.addChild(this.WingFeather5);
            this.WingFeather1Right.addChild(this.WingFeather2Right);
            this.UpperBill.addChild(this.LowerBill);
            this.Wing1Right.addChild(this.Wing2Right);
            this.RightWingFeather7.addChild(this.WingFeather8Right);
            this.Body.addChild(this.TailBase);
            this.Foot.addChild(this.Toe1Right);
            this.WingFeather6.addChild(this.WingFeather7);
            this.WingFeather5Right.addChild(this.WingFeather6Right);
            this.Body.addChild(this.Neck1);
            this.TailBase.addChild(this.TailMiddle);
            this.saveBase();
        }

        @Override
        public void setupAnim(AracariEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck1.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.025F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
           }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.8F) * 0.5F + 0.826F;
            this.Neck2.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.8F) * 0.5F - 0.604F;
            this.Head.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.025F;
            this.Body.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.1F) * 0.5F + 1.491F;
            this.Body.y = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 5F) * 0.5F + 20.9F;
            this.TailBase.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.7F) * 0.5F + 0.097F;
            this.Leg.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F - 1.62F;
            this.RightLeg.xRot = MathHelper.cos(6F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F - 1.62F;

            this.Wing1.zRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.5F) * 0.5F + 0.182F;
            this.Wing1.yRot = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -7F) * 0.5F - 0.500F;
            this.Wing2.zRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.5F) * 0.5F - 0.409F;
            this.Wing2.yRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 2F) * 0.5F;
            this.Wing1Right.zRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F - 0.182F;
            this.Wing1Right.yRot = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 7F) * 0.5F + 0.500F;
            this.Wing2Right.zRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 0.409F;
            this.Wing2Right.yRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -2F) * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 2.0f;
            float degree = 1.0f;
            this.Neck1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.8F) * 0.5F + 0.826F;
            this.Neck2.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.8F) * 0.5F - 0.604F;
            this.Head.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.025F;
            this.Body.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.1F) * 0.5F + 1.491F;
            this.Body.y = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 5F) * 0.5F + 20.9F;
            this.TailBase.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.7F) * 0.5F + 0.097F;
            this.Leg.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F - 1.62F;
            this.RightLeg.xRot = MathHelper.cos(6F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F - 1.62F;

            this.Wing1.zRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.5F) * 0.5F + 0.182F;
            this.Wing1.yRot = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -7F) * 0.5F - 0.500F;
            this.Wing2.zRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.5F) * 0.5F - 0.409F;
            this.Wing2.yRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 2F) * 0.5F;
            this.Wing1Right.zRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F - 0.182F;
            this.Wing1Right.yRot = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 7F) * 0.5F + 0.500F;
            this.Wing2Right.zRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 0.409F;
            this.Wing2Right.yRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -2F) * 0.5F;
        }
    }

    public static class Child extends AracariModel {
        public ModelRenderer TailBase;
        public ModelRenderer LegRight;
        public ModelRenderer Leg;
        public ModelRenderer Wing;
        public ModelRenderer WingRight;
        public ModelRenderer Neck1;
        public ModelRenderer FootRight;
        public ModelRenderer Toe2Right;
        public ModelRenderer Toe1Right;
        public ModelRenderer Foot;
        public ModelRenderer Toe1;
        public ModelRenderer Toe2;
        public ModelRenderer Head;
        public ModelRenderer UpperBill;
        public ModelRenderer LowerBill;

        public Child() {
            texWidth = 64;
            texHeight = 32;
            this.TailBase = new ModelRenderer(this, 17, 28);
            this.TailBase.setPos(0.0F, 2.0F, -1.0F);
            this.TailBase.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailBase, 0.0911061832922575F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 24);
            this.Body.setPos(0.0F, 20.9F, 0.0F);
            this.Body.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 1.411447814024714F, 0.0F, 0.0F);
            this.LowerBill = new ModelRenderer(this, 5, 1);
            this.LowerBill.setPos(0.0F, -0.6F, 0.3F);
            this.LowerBill.addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerBill, -0.489739378788545F, 0.0F, 0.0F);
            this.Neck1 = new ModelRenderer(this, 0, 18);
            this.Neck1.setPos(0.0F, -2.0F, -1.5F);
            this.Neck1.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck1, 0.7285004590772052F, 0.0F, 0.0F);
            this.Foot = new ModelRenderer(this, 13, 4);
            this.Foot.setPos(0.0F, 0.0F, -0.9F);
            this.Foot.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Foot, 0.6829473549475088F, 0.0F, 0.0F);
            this.Wing = new ModelRenderer(this, 29, 0);
            this.Wing.setPos(1.9F, -1.9F, 1.1F);
            this.Wing.addBox(-0.2F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Wing, -0.2275909337942703F, -0.0911061832922575F, 0.13665927909957545F);
            this.UpperBill = new ModelRenderer(this, 0, 1);
            this.UpperBill.setPos(0.0F, -0.5F, 2.0F);
            this.UpperBill.addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperBill, 0.5855579507282921F, 0.0F, 0.0F);
            this.Toe1 = new ModelRenderer(this, 13, 8);
            this.Toe1.setPos(0.0F, 0.2F, -0.01F);
            this.Toe1.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe1, 0.0F, 0.0F, 0.591841146688116F);
            this.Leg = new ModelRenderer(this, 13, 0);
            this.Leg.setPos(1.3F, 0.9F, -1.4F);
            this.Leg.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Leg, -0.500909508638178F, -0.04555309164612875F, 0.4098033003787853F);
            this.FootRight = new ModelRenderer(this, 20, 4);
            this.FootRight.setPos(0.0F, 0.0F, -0.9F);
            this.FootRight.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, 0.6829473549475088F, 0.0F, 0.0F);
            this.WingRight = new ModelRenderer(this, 38, 0);
            this.WingRight.setPos(-1.9F, -1.9F, 1.1F);
            this.WingRight.addBox(-0.8F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingRight, -0.2275909337942703F, 0.0911061832922575F, -0.13665927909957545F);
            this.Toe2Right = new ModelRenderer(this, 20, 8);
            this.Toe2Right.setPos(0.0F, 0.2F, -0.01F);
            this.Toe2Right.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe2Right, 0.0F, 0.0F, 0.591841146688116F);
            this.Toe2 = new ModelRenderer(this, 13, 8);
            this.Toe2.setPos(0.0F, 0.2F, -0.01F);
            this.Toe2.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe2, 0.0F, 0.0F, -0.591841146688116F);
            this.Head = new ModelRenderer(this, 0, 5);
            this.Head.setPos(0.0F, 0.0F, 2.0F);
            this.Head.addBox(-1.5F, -0.7F, 0.0F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, -0.6373942508178124F, 0.0F, 0.0F);
            this.Toe1Right = new ModelRenderer(this, 20, 8);
            this.Toe1Right.setPos(0.0F, 0.2F, -0.01F);
            this.Toe1Right.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe1Right, 0.004537855888737689F, 0.0F, -0.591841146688116F);
            this.LegRight = new ModelRenderer(this, 20, 0);
            this.LegRight.setPos(-1.3F, 0.9F, -1.4F);
            this.LegRight.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, -0.500909508638178F, 0.04555309164612875F, -0.4098033003787853F);
            this.Body.addChild(this.TailBase);
            this.Head.addChild(this.LowerBill);
            this.Body.addChild(this.Neck1);
            this.Leg.addChild(this.Foot);
            this.Body.addChild(this.Wing);
            this.Head.addChild(this.UpperBill);
            this.Foot.addChild(this.Toe1);
            this.Body.addChild(this.Leg);
            this.LegRight.addChild(this.FootRight);
            this.Body.addChild(this.WingRight);
            this.FootRight.addChild(this.Toe2Right);
            this.Foot.addChild(this.Toe2);
            this.Neck1.addChild(this.Head);
            this.FootRight.addChild(this.Toe1Right);
            this.Body.addChild(this.LegRight);
            this.saveBase();
        }

        @Override
        public void setupAnim(AracariEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck1.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) - 0.637F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float degree = 1.0F;
            float speed = 1.0F;
            this.Neck1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.728F;
            this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.3F) * 0.5F - 0.637F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        }
    }
}
