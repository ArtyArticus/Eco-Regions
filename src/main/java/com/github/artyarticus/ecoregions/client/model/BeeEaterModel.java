package com.github.artyarticus.ecoregions.client.model;

import com.github.artyarticus.ecoregions.entity.BeeEaterEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class BeeEaterModel extends ZawaBaseModel<BeeEaterEntity> {
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

    public static class Adult extends BeeEaterModel {
        public ModelRenderer Neck1;
        public ModelRenderer TailBase;
        public ModelRenderer WingLeft;
        public ModelRenderer LegLeft;
        public ModelRenderer WingRight;
        public ModelRenderer LegRight;
        public ModelRenderer Neck2;
        public ModelRenderer Head;
        public ModelRenderer BeakTop;
        public ModelRenderer BeakBottom;
        public ModelRenderer TailMiddle;
        public ModelRenderer TailLeft;
        public ModelRenderer TailRight;
        public ModelRenderer TailEndLeft;
        public ModelRenderer TailEndRight;
        public ModelRenderer TailEnd;
        public ModelRenderer FootLeft;
        public ModelRenderer ToeLeft2;
        public ModelRenderer ToeLeft1;
        public ModelRenderer FootRight;
        public ModelRenderer ToeRight1;
        public ModelRenderer ToeRight2;

        public Adult() {
            texWidth = 32;
            texHeight = 32;
            this.WingLeft = new ModelRenderer(this, 0, 7);
            this.WingLeft.setPos(1.7F, -1.1F, -1.9F);
            this.WingLeft.addBox(0.0F, -1.0F, 0.0F, 1.0F, 3.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingLeft, 0.0F, -0.0911061832922575F, 0.13665927909957545F);
            this.BeakTop = new ModelRenderer(this, 13, 0);
            this.BeakTop.setPos(0.0F, 0.3F, -1.0F);
            this.BeakTop.addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(BeakTop, 0.19582594673429568F, 0.0F, 0.0F);
            this.LegLeft = new ModelRenderer(this, 0, 20);
            this.LegLeft.setPos(1.3F, 1.9F, 0.5F);
            this.LegLeft.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, 1.73974420371427F, 0.0F, 0.0F);
            this.TailEndRight = new ModelRenderer(this, 15, 23);
            this.TailEndRight.mirror = true;
            this.TailEndRight.setPos(-0.1F, 3.9F, 0.0F);
            this.TailEndRight.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 0.0F, -0.01F, -0.01F, -0.01F);
            this.setRotateAngle(TailEndRight, 0.11728612207217244F, 0.0F, 0.1563815016444822F);
            this.TailBase = new ModelRenderer(this, 17, 28);
            this.TailBase.setPos(0.0F, -2.0F, 2.0F);
            this.TailBase.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailBase, 1.622632626884417F, 0.0F, 0.0F);
            this.ToeLeft1 = new ModelRenderer(this, 6, 17);
            this.ToeLeft1.setPos(0.0F, 0.5F, -0.01F);
            this.ToeLeft1.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ToeLeft1, 0.0F, 0.0F, -0.591841146688116F);
            this.WingRight = new ModelRenderer(this, 0, 7);
            this.WingRight.mirror = true;
            this.WingRight.setPos(-1.7F, -1.1F, -1.9F);
            this.WingRight.addBox(-1.0F, -1.0F, 0.0F, 1.0F, 3.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingRight, 0.0F, 0.0911061832922575F, -0.13665927909957545F);
            this.BeakBottom = new ModelRenderer(this, 21, 0);
            this.BeakBottom.setPos(0.0F, 0.5F, 0.1F);
            this.BeakBottom.addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 3.0F, -0.01F, -0.2F, 0.0F);
            this.setRotateAngle(BeakBottom, -0.11728612207217244F, 0.0F, 0.0F);
            this.TailEndLeft = new ModelRenderer(this, 15, 23);
            this.TailEndLeft.setPos(0.2F, 3.9F, 0.0F);
            this.TailEndLeft.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 0.0F, -0.01F, -0.01F, -0.01F);
            this.setRotateAngle(TailEndLeft, 0.11728612207217244F, 0.0F, -0.1563815016444822F);
            this.Neck2 = new ModelRenderer(this, 11, 14);
            this.Neck2.setPos(0.0F, 0.0F, -2.0F);
            this.Neck2.addBox(-1.0F, -2.0F, -2.9F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, -0.1F);
            this.setRotateAngle(Neck2, -0.5860815947776289F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 0, 0);
            this.Head.setPos(0.0F, -0.8F, -2.5F);
            this.Head.addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 1.8767525233642137F, 0.0F, 0.0F);
            this.TailRight = new ModelRenderer(this, 28, 22);
            this.TailRight.mirror = true;
            this.TailRight.setPos(-1.4F, 0.0F, -0.1F);
            this.TailRight.addBox(0.0F, -0.2F, -1.0F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailRight, 0.0F, 0.0F, -0.13665927909957545F);
            this.TailLeft = new ModelRenderer(this, 28, 22);
            this.TailLeft.setPos(1.4F, 0.0F, -0.1F);
            this.TailLeft.addBox(-1.0F, -0.2F, -1.0F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailLeft, 0.0F, 0.0F, 0.13665927909957545F);
            this.ToeLeft2 = new ModelRenderer(this, 6, 17);
            this.ToeLeft2.setPos(0.0F, 0.5F, -0.01F);
            this.ToeLeft2.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ToeLeft2, 0.0F, 0.0F, 0.591841146688116F);
            this.TailMiddle = new ModelRenderer(this, 23, 22);
            this.TailMiddle.setPos(0.0F, 2.0F, 0.0F);
            this.TailMiddle.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailMiddle, 0.23457224414434488F, 0.0F, 0.0F);
            this.ToeRight2 = new ModelRenderer(this, 6, 17);
            this.ToeRight2.setPos(0.0F, 0.5F, -0.01F);
            this.ToeRight2.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ToeRight2, 0.0F, 0.0F, -0.591841146688116F);
            this.ToeRight1 = new ModelRenderer(this, 6, 17);
            this.ToeRight1.setPos(0.0F, 0.5F, -0.01F);
            this.ToeRight1.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ToeRight1, 0.0F, 0.0F, 0.591841146688116F);
            this.FootRight = new ModelRenderer(this, 7, 20);
            this.FootRight.setPos(0.0F, 0.0F, -1.5F);
            this.FootRight.addBox(-0.51F, -0.7F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, 0.4098033003787853F, 0.0F, 0.0F);
            this.LegRight = new ModelRenderer(this, 0, 20);
            this.LegRight.setPos(-1.3F, 1.9F, 0.5F);
            this.LegRight.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, 1.73974420371427F, 0.0F, 0.0F);
            this.TailEnd = new ModelRenderer(this, 18, 23);
            this.TailEnd.setPos(0.0F, 3.9F, 0.0F);
            this.TailEnd.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, -0.01F, -0.01F, -0.01F);
            this.setRotateAngle(TailEnd, 0.11728612207217244F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 7, 20);
            this.FootLeft.setPos(0.0F, 0.0F, -1.5F);
            this.FootLeft.addBox(-0.51F, -0.7F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 0.4098033003787853F, 0.0F, 0.0F);
            this.Neck1 = new ModelRenderer(this, 22, 14);
            this.Neck1.setPos(0.0F, 2.0F, -2.0F);
            this.Neck1.addBox(-1.5F, -3.0F, -2.0F, 3.0F, 3.0F, 2.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(Neck1, -0.6255260065779288F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 24);
            this.Body.setPos(0.0F, 20.0F, 0.0F);
            this.Body.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, -0.5874778235581302F, 0.0F, 0.0F);
            this.Body.addChild(this.WingLeft);
            this.Head.addChild(this.BeakTop);
            this.Body.addChild(this.LegLeft);
            this.TailMiddle.addChild(this.TailEndRight);
            this.Body.addChild(this.TailBase);
            this.FootLeft.addChild(this.ToeLeft1);
            this.Body.addChild(this.WingRight);
            this.BeakTop.addChild(this.BeakBottom);
            this.TailMiddle.addChild(this.TailEndLeft);
            this.Neck1.addChild(this.Neck2);
            this.Neck2.addChild(this.Head);
            this.TailMiddle.addChild(this.TailRight);
            this.TailMiddle.addChild(this.TailLeft);
            this.FootLeft.addChild(this.ToeLeft2);
            this.TailBase.addChild(this.TailMiddle);
            this.FootRight.addChild(this.ToeRight2);
            this.FootRight.addChild(this.ToeRight1);
            this.LegRight.addChild(this.FootRight);
            this.Body.addChild(this.LegRight);
            this.TailMiddle.addChild(this.TailEnd);
            this.LegLeft.addChild(this.FootLeft);
            this.Body.addChild(this.Neck1);
            this.saveBase();
        }

        @Override
        public void setupAnim(BeeEaterEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck1.yRot = (float)Math.toRadians((double)netHeadYaw) * 0.25F;
            this.Head.yRot = (float)Math.toRadians((double)netHeadYaw) * 0.25F;
            this.Head.xRot = (float)Math.toRadians((double)headPitch) + 1.877F;
            this.Head.zRot = (float)Math.toRadians((double)headPitch) * 0.05F;
        }

        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
        }

        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
        }
    }
    public static class Flying extends BeeEaterModel {
        public ModelRenderer Neck1;
        public ModelRenderer TailBase;
        public ModelRenderer LegRight;
        public ModelRenderer WingRight1;
        public ModelRenderer WingLeft1;
        public ModelRenderer LegLeft;
        public ModelRenderer Neck2;
        public ModelRenderer Head;
        public ModelRenderer BeakTop;
        public ModelRenderer BeakBottom;
        public ModelRenderer TailMiddle;
        public ModelRenderer TailLeft;
        public ModelRenderer TailRight;
        public ModelRenderer TailEndLeft;
        public ModelRenderer TailEndRight;
        public ModelRenderer TailEnd;
        public ModelRenderer FootRight;
        public ModelRenderer ToeRight1;
        public ModelRenderer ToeRight2;
        public ModelRenderer WingRight2;
        public ModelRenderer WingFeatherRightBase;
        public ModelRenderer WingFeatherLeft1;
        public ModelRenderer WingFeatherLeft2;
        public ModelRenderer WingFeatherLeft3;
        public ModelRenderer WingFeatherLeft4;
        public ModelRenderer WingFeatherLeft5;
        public ModelRenderer WingFeatherLeft6;
        public ModelRenderer WingFeatherLeft7;
        public ModelRenderer WingLeft2;
        public ModelRenderer WingFeatherLeftBase;
        public ModelRenderer WingFeatherLeft1_1;
        public ModelRenderer WingFeatherLeft2_1;
        public ModelRenderer WingFeatherLeft3_1;
        public ModelRenderer WingFeatherLeft4_1;
        public ModelRenderer WingFeatherLeft5_1;
        public ModelRenderer WingFeatherLeft6_1;
        public ModelRenderer WingFeatherLeft7_1;
        public ModelRenderer FootLeft;
        public ModelRenderer ToeLeft1;
        public ModelRenderer ToeLeft2;

        public Flying() {

            texWidth = 32;
            texHeight = 32;
            this.TailLeft = new ModelRenderer(this, 28, 22);
            this.TailLeft.setPos(1.0F, 0.0F, -0.1F);
            this.TailLeft.addBox(-1.0F, -0.2F, -1.0F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailLeft, 0.0F, 0.0F, -0.13700834461707917F);
            this.WingFeatherLeft2 = new ModelRenderer(this, 16, 10);
            this.WingFeatherLeft2.mirror = true;
            this.WingFeatherLeft2.setPos(0.0F, 0.0F, -0.0F);
            this.WingFeatherLeft2.addBox(-5.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingFeatherLeft2, 0.0F, 0.0F, -0.2275909337942703F);
            this.LegRight = new ModelRenderer(this, 0, 20);
            this.LegRight.setPos(-1.3F, 1.9F, 1.3F);
            this.LegRight.addBox(-0.5F, -2.0F, -3.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, 0.019547687705560274F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 0, 0);
            this.Head.setPos(0.0F, -1.5F, -2.7F);
            this.Head.addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 1.2512265833653122F, 0.0F, 0.0F);
            this.WingFeatherLeft5_1 = new ModelRenderer(this, 16, 10);
            this.WingFeatherLeft5_1.setPos(0.0F, 0.0F, -0.0F);
            this.WingFeatherLeft5_1.addBox(0.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingFeatherLeft5_1, 0.0F, 0.0F, 0.2275909337942703F);
            this.LegLeft = new ModelRenderer(this, 0, 20);
            this.LegLeft.setPos(1.3F, 1.9F, 1.3F);
            this.LegLeft.addBox(-0.5F, -2.0F, -3.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, 0.019547687705560274F, 0.0F, 0.0F);
            this.Neck2 = new ModelRenderer(this, 11, 14);
            this.Neck2.setPos(0.0F, 0.0F, -2.0F);
            this.Neck2.addBox(-1.0F, -2.0F, -2.9F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, -0.1F);
            this.setRotateAngle(Neck2, -0.5860815947776289F, 0.0F, 0.0F);
            this.TailEndLeft = new ModelRenderer(this, 15, 23);
            this.TailEndLeft.setPos(0.2F, 3.9F, 0.0F);
            this.TailEndLeft.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 0.0F, -0.01F, -0.01F, -0.01F);
            this.setRotateAngle(TailEndLeft, 0.11728612207217244F, 0.0F, -0.1563815016444822F);
            this.WingFeatherLeft3_1 = new ModelRenderer(this, 16, 10);
            this.WingFeatherLeft3_1.setPos(0.0F, 0.0F, -0.0F);
            this.WingFeatherLeft3_1.addBox(0.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingFeatherLeft3_1, 0.0F, 0.0F, 0.2275909337942703F);
            this.TailMiddle = new ModelRenderer(this, 23, 22);
            this.TailMiddle.setPos(0.0F, 2.0F, 0.0F);
            this.TailMiddle.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailMiddle, -0.1563815016444822F, 0.0F, 0.0F);
            this.WingFeatherRightBase = new ModelRenderer(this, 16, 10);
            this.WingFeatherRightBase.mirror = true;
            this.WingFeatherRightBase.setPos(-3.0F, -4.0F, -0.01F);
            this.WingFeatherRightBase.addBox(-5.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingFeatherRightBase, 0.0F, 0.0F, -0.27314402127920984F);
            this.WingFeatherLeft5 = new ModelRenderer(this, 16, 10);
            this.WingFeatherLeft5.mirror = true;
            this.WingFeatherLeft5.setPos(0.0F, 0.0F, -0.0F);
            this.WingFeatherLeft5.addBox(-5.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingFeatherLeft5, 0.0F, 0.0F, -0.2275909337942703F);
            this.Neck1 = new ModelRenderer(this, 22, 14);
            this.Neck1.setPos(0.0F, 2.0F, -2.0F);
            this.Neck1.addBox(-1.5F, -3.0F, -2.0F, 3.0F, 3.0F, 2.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(Neck1, -0.5082398928281348F, 0.0F, 0.0F);
            this.WingFeatherLeft4 = new ModelRenderer(this, 16, 10);
            this.WingFeatherLeft4.mirror = true;
            this.WingFeatherLeft4.setPos(0.0F, 0.0F, -0.0F);
            this.WingFeatherLeft4.addBox(-5.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingFeatherLeft4, 0.0F, 0.0F, -0.2275909337942703F);
            this.WingFeatherLeft2_1 = new ModelRenderer(this, 16, 10);
            this.WingFeatherLeft2_1.setPos(0.0F, 0.0F, -0.0F);
            this.WingFeatherLeft2_1.addBox(0.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingFeatherLeft2_1, 0.0F, 0.0F, 0.2275909337942703F);
            this.WingFeatherLeft7 = new ModelRenderer(this, 16, 10);
            this.WingFeatherLeft7.mirror = true;
            this.WingFeatherLeft7.setPos(0.1F, 0.0F, -0.0F);
            this.WingFeatherLeft7.addBox(-5.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, -0.2F, 0.0F, 0.0F);
            this.setRotateAngle(WingFeatherLeft7, 0.0F, 0.0F, -0.2275909337942703F);
            this.TailEndRight = new ModelRenderer(this, 15, 23);
            this.TailEndRight.mirror = true;
            this.TailEndRight.setPos(-0.1F, 3.9F, 0.0F);
            this.TailEndRight.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 0.0F, -0.01F, -0.01F, -0.01F);
            this.setRotateAngle(TailEndRight, 0.11728612207217244F, 0.0F, 0.1563815016444822F);
            this.WingFeatherLeft1 = new ModelRenderer(this, 16, 10);
            this.WingFeatherLeft1.mirror = true;
            this.WingFeatherLeft1.setPos(0.0F, 0.0F, -0.0F);
            this.WingFeatherLeft1.addBox(-5.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingFeatherLeft1, 0.0F, 0.0F, -0.2275909337942703F);
            this.WingFeatherLeft6 = new ModelRenderer(this, 16, 10);
            this.WingFeatherLeft6.mirror = true;
            this.WingFeatherLeft6.setPos(0.0F, 0.0F, -0.0F);
            this.WingFeatherLeft6.addBox(-5.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingFeatherLeft6, 0.0F, 0.0F, -0.2275909337942703F);
            this.TailBase = new ModelRenderer(this, 17, 28);
            this.TailBase.setPos(0.0F, -2.0F, 2.0F);
            this.TailBase.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailBase, 1.622632626884417F, 0.0F, 0.0F);
            this.ToeLeft1 = new ModelRenderer(this, 6, 17);
            this.ToeLeft1.setPos(0.0F, 0.5F, -0.01F);
            this.ToeLeft1.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ToeLeft1, 0.0F, 0.0F, 0.591841146688116F);
            this.FootLeft = new ModelRenderer(this, 7, 20);
            this.FootLeft.setPos(0.0F, 0.0F, -1.5F);
            this.FootLeft.addBox(-0.51F, -0.7F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 2.325651228282444F, 0.0F, 0.0F);
            this.WingLeft2 = new ModelRenderer(this, 17, 4);
            this.WingLeft2.mirror = true;
            this.WingLeft2.setPos(2.0F, 4.0F, 0.01F);
            this.WingLeft2.addBox(0.0F, -4.0F, -0.1F, 3.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingLeft2, 0.0F, 0.0F, -0.3642502295386026F);
            this.ToeRight2 = new ModelRenderer(this, 6, 17);
            this.ToeRight2.setPos(0.0F, 0.5F, -0.01F);
            this.ToeRight2.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ToeRight2, 0.0F, 0.0F, -0.591841146688116F);
            this.BeakBottom = new ModelRenderer(this, 21, 0);
            this.BeakBottom.setPos(0.0F, 0.5F, 0.1F);
            this.BeakBottom.addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 3.0F, -0.01F, -0.2F, 0.0F);
            this.setRotateAngle(BeakBottom, -0.11728612207217244F, 0.0F, 0.0F);
            this.WingFeatherLeft7_1 = new ModelRenderer(this, 16, 10);
            this.WingFeatherLeft7_1.setPos(-0.1F, 0.0F, -0.0F);
            this.WingFeatherLeft7_1.addBox(0.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, -0.2F, 0.0F, 0.0F);
            this.setRotateAngle(WingFeatherLeft7_1, 0.0F, 0.0F, 0.2275909337942703F);
            this.WingFeatherLeft4_1 = new ModelRenderer(this, 16, 10);
            this.WingFeatherLeft4_1.setPos(0.0F, 0.0F, -0.0F);
            this.WingFeatherLeft4_1.addBox(0.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingFeatherLeft4_1, 0.0F, 0.0F, 0.2275909337942703F);
            this.ToeLeft2 = new ModelRenderer(this, 6, 17);
            this.ToeLeft2.setPos(0.0F, 0.5F, -0.01F);
            this.ToeLeft2.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ToeLeft2, 0.0F, 0.0F, -0.591841146688116F);
            this.FootRight = new ModelRenderer(this, 7, 20);
            this.FootRight.setPos(0.0F, 0.0F, -1.5F);
            this.FootRight.addBox(-0.51F, -0.7F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, 2.325651228282444F, 0.0F, 0.0F);
            this.ToeRight1 = new ModelRenderer(this, 6, 17);
            this.ToeRight1.setPos(0.0F, 0.5F, -0.01F);
            this.ToeRight1.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ToeRight1, 0.0F, 0.0F, 0.591841146688116F);
            this.WingRight2 = new ModelRenderer(this, 17, 4);
            this.WingRight2.mirror = true;
            this.WingRight2.setPos(-2.0F, 4.0F, 0.01F);
            this.WingRight2.addBox(-3.0F, -4.0F, -0.1F, 3.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingRight2, 0.0F, 0.0F, 0.3642502295386026F);
            this.Body = new ModelRenderer(this, 0, 24);
            this.Body.setPos(0.0F, 15.0F, 0.0F);
            this.Body.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, -0.039968039204879874F, 0.0F, 0.0F);
            this.WingLeft1 = new ModelRenderer(this, 26, 4);
            this.WingLeft1.mirror = true;
            this.WingLeft1.setPos(1.3F, -1.0F, -2.0F);
            this.WingLeft1.addBox(0.0F, 0.0F, -0.1F, 2.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingLeft1, 1.5266395180247287F, 0.20280725708437025F, -0.18203784630933073F);
            this.WingRight1 = new ModelRenderer(this, 26, 4);
            this.WingRight1.mirror = true;
            this.WingRight1.setPos(-1.3F, -1.0F, -2.0F);
            this.WingRight1.addBox(-2.0F, 0.0F, -0.1F, 2.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingRight1, 1.5266395180247287F, -0.20280725708437025F, 0.18203784630933073F);
            this.WingFeatherLeft3 = new ModelRenderer(this, 16, 10);
            this.WingFeatherLeft3.mirror = true;
            this.WingFeatherLeft3.setPos(0.0F, 0.0F, -0.0F);
            this.WingFeatherLeft3.addBox(-5.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingFeatherLeft3, 0.0F, 0.0F, -0.2275909337942703F);
            this.BeakTop = new ModelRenderer(this, 13, 0);
            this.BeakTop.setPos(0.0F, 0.3F, -1.0F);
            this.BeakTop.addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(BeakTop, 0.19582594673429568F, 0.0F, 0.0F);
            this.WingFeatherLeft1_1 = new ModelRenderer(this, 16, 10);
            this.WingFeatherLeft1_1.setPos(0.0F, 0.0F, -0.0F);
            this.WingFeatherLeft1_1.addBox(0.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingFeatherLeft1_1, 0.0F, 0.0F, 0.2275909337942703F);
            this.TailRight = new ModelRenderer(this, 28, 22);
            this.TailRight.mirror = true;
            this.TailRight.setPos(-1.0F, 0.0F, -0.1F);
            this.TailRight.addBox(0.0F, -0.2F, -1.0F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailRight, 0.0F, 0.0F, 0.13700834461707917F);
            this.TailEnd = new ModelRenderer(this, 18, 23);
            this.TailEnd.setPos(0.0F, 3.9F, 0.0F);
            this.TailEnd.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, -0.01F, -0.01F, -0.01F);
            this.setRotateAngle(TailEnd, 0.11728612207217244F, 0.0F, 0.0F);
            this.WingFeatherLeft6_1 = new ModelRenderer(this, 16, 10);
            this.WingFeatherLeft6_1.setPos(0.0F, 0.0F, -0.0F);
            this.WingFeatherLeft6_1.addBox(0.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingFeatherLeft6_1, 0.0F, 0.0F, 0.2275909337942703F);
            this.WingFeatherLeftBase = new ModelRenderer(this, 16, 10);
            this.WingFeatherLeftBase.setPos(3.0F, -4.0F, -0.01F);
            this.WingFeatherLeftBase.addBox(0.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingFeatherLeftBase, 0.0F, 0.0F, 0.27314402127920984F);
            this.TailMiddle.addChild(this.TailLeft);
            this.WingFeatherLeft1.addChild(this.WingFeatherLeft2);
            this.Body.addChild(this.LegRight);
            this.Neck2.addChild(this.Head);
            this.WingFeatherLeft4_1.addChild(this.WingFeatherLeft5_1);
            this.Body.addChild(this.LegLeft);
            this.Neck1.addChild(this.Neck2);
            this.TailMiddle.addChild(this.TailEndLeft);
            this.WingFeatherLeft2_1.addChild(this.WingFeatherLeft3_1);
            this.TailBase.addChild(this.TailMiddle);
            this.WingRight2.addChild(this.WingFeatherRightBase);
            this.WingFeatherLeft4.addChild(this.WingFeatherLeft5);
            this.Body.addChild(this.Neck1);
            this.WingFeatherLeft3.addChild(this.WingFeatherLeft4);
            this.WingFeatherLeft1_1.addChild(this.WingFeatherLeft2_1);
            this.WingFeatherLeft6.addChild(this.WingFeatherLeft7);
            this.TailMiddle.addChild(this.TailEndRight);
            this.WingFeatherRightBase.addChild(this.WingFeatherLeft1);
            this.WingFeatherLeft5.addChild(this.WingFeatherLeft6);
            this.Body.addChild(this.TailBase);
            this.FootLeft.addChild(this.ToeLeft1);
            this.LegLeft.addChild(this.FootLeft);
            this.WingLeft1.addChild(this.WingLeft2);
            this.FootRight.addChild(this.ToeRight2);
            this.BeakTop.addChild(this.BeakBottom);
            this.WingFeatherLeft6_1.addChild(this.WingFeatherLeft7_1);
            this.WingFeatherLeft3_1.addChild(this.WingFeatherLeft4_1);
            this.FootLeft.addChild(this.ToeLeft2);
            this.LegRight.addChild(this.FootRight);
            this.FootRight.addChild(this.ToeRight1);
            this.WingRight1.addChild(this.WingRight2);
            this.Body.addChild(this.WingLeft1);
            this.Body.addChild(this.WingRight1);
            this.WingFeatherLeft2.addChild(this.WingFeatherLeft3);
            this.Head.addChild(this.BeakTop);
            this.WingFeatherLeftBase.addChild(this.WingFeatherLeft1_1);
            this.TailMiddle.addChild(this.TailRight);
            this.TailMiddle.addChild(this.TailEnd);
            this.WingFeatherLeft5_1.addChild(this.WingFeatherLeft6_1);
            this.WingLeft2.addChild(this.WingFeatherLeftBase);
            this.saveBase();
        }

        @Override
        public void setupAnim(BeeEaterEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck1.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 1.251F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.8F) * 0.5F - 0.508F;
            this.Head.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 1.251F;
            this.Body.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.1F) * 0.5F - 0.039F;
            this.Body.y = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 5F) * 0.5F + 15.0F;
            this.TailBase.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.7F) * 0.5F + 1.622F;
            this.LegLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 0.019F;
            this.LegRight.xRot = MathHelper.cos(6F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 0.019F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 2.0f;
            float degree = 1.0f;
            this.Neck1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.8F) * 0.5F - 0.508F;
            this.Head.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 1.251F;
            this.Body.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.1F) * 0.5F - 0.039F;
            this.Body.y = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 5F) * 0.5F + 15.0F;
            this.TailBase.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.7F) * 0.5F + 1.622F;
            this.LegLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 0.019F;
            this.LegRight.xRot = MathHelper.cos(6F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 0.019F;
        }
    }

    public static class Child extends BeeEaterModel {
        public ModelRenderer TailBase;
        public ModelRenderer LegRight;
        public ModelRenderer LegLeft;
        public ModelRenderer WingLeft;
        public ModelRenderer WingRight;
        public ModelRenderer Neck1;
        public ModelRenderer FootRight;
        public ModelRenderer Toe2Right;
        public ModelRenderer Toe1Right;
        public ModelRenderer FootLeft;
        public ModelRenderer Toe1Left;
        public ModelRenderer Toe2Left;
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
            this.FootLeft = new ModelRenderer(this, 13, 4);
            this.FootLeft.setPos(0.0F, 0.0F, -0.9F);
            this.FootLeft.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 0.6829473549475088F, 0.0F, 0.0F);
            this.WingLeft = new ModelRenderer(this, 29, 0);
            this.WingLeft.setPos(1.9F, -1.9F, 1.1F);
            this.WingLeft.addBox(-0.2F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingLeft, -0.2275909337942703F, -0.0911061832922575F, 0.13665927909957545F);
            this.UpperBill = new ModelRenderer(this, 0, 1);
            this.UpperBill.setPos(0.0F, -0.5F, 2.0F);
            this.UpperBill.addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperBill, 0.5855579507282921F, 0.0F, 0.0F);
            this.Toe1Left = new ModelRenderer(this, 13, 8);
            this.Toe1Left.setPos(0.0F, 0.2F, -0.01F);
            this.Toe1Left.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe1Left, 0.0F, 0.0F, 0.591841146688116F);
            this.LegLeft = new ModelRenderer(this, 13, 0);
            this.LegLeft.setPos(1.3F, 0.9F, -1.4F);
            this.LegLeft.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, -0.500909508638178F, -0.04555309164612875F, 0.4098033003787853F);
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
            this.Toe2Left = new ModelRenderer(this, 13, 8);
            this.Toe2Left.setPos(0.0F, 0.2F, -0.01F);
            this.Toe2Left.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe2Left, 0.0F, 0.0F, -0.591841146688116F);
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
            this.LegLeft.addChild(this.FootLeft);
            this.Body.addChild(this.WingLeft);
            this.Head.addChild(this.UpperBill);
            this.FootLeft.addChild(this.Toe1Left);
            this.Body.addChild(this.LegLeft);
            this.LegRight.addChild(this.FootRight);
            this.Body.addChild(this.WingRight);
            this.FootRight.addChild(this.Toe2Right);
            this.FootLeft.addChild(this.Toe2Left);
            this.Neck1.addChild(this.Head);
            this.FootRight.addChild(this.Toe1Right);
            this.Body.addChild(this.LegRight);
            this.saveBase();
        }

        @Override
        public void setupAnim(BeeEaterEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float degree = 1.0F;
            float speed = 1.0F;
                }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        }
    }
}
