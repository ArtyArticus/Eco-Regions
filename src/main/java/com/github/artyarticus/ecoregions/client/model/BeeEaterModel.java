package com.github.artyarticus.ecoregions.client.model;

import com.github.artyarticus.ecoregions.entity.BeeEaterEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class BeeEaterModel extends ZawaBaseModel<BeeEaterEntity> {
    public ModelPart Body;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Body);
        }

        return this.parts;
    }

    public static class Adult extends BeeEaterModel {
        public ModelPart Neck1;
        public ModelPart TailBase;
        public ModelPart WingLeft;
        public ModelPart LegLeft;
        public ModelPart WingRight;
        public ModelPart LegRight;
        public ModelPart Neck2;
        public ModelPart Head;
        public ModelPart BeakTop;
        public ModelPart BeakBottom;
        public ModelPart TailMiddle;
        public ModelPart TailLeft;
        public ModelPart TailRight;
        public ModelPart TailEndLeft;
        public ModelPart TailEndRight;
        public ModelPart TailEnd;
        public ModelPart FootLeft;
        public ModelPart ToeLeft2;
        public ModelPart ToeLeft1;
        public ModelPart FootRight;
        public ModelPart ToeRight1;
        public ModelPart ToeRight2;

        public Adult(ModelPart root) {
            this.Body = root.getChild("Body");
            this.WingLeft = this.Body.getChild("WingLeft");

            this.TailBase = this.Body.getChild("TailBase");
            this.TailMiddle = this.TailBase.getChild("TailMiddle");
            this.TailEndRight = this.TailMiddle.getChild("TailEndRight");

            this.TailRight = this.TailMiddle.getChild("TailRight");

            this.TailEndLeft = this.TailMiddle.getChild("TailEndLeft");

            this.TailEnd = this.TailMiddle.getChild("TailEnd");

            this.TailLeft = this.TailMiddle.getChild("TailLeft");

            this.WingRight = this.Body.getChild("WingRight");

            this.Neck1 = this.Body.getChild("Neck1");
            this.Neck2 = this.Neck1.getChild("Neck2");
            this.Head = this.Neck2.getChild("Head");
            this.BeakTop = this.Head.getChild("BeakTop");
            this.BeakBottom = this.BeakTop.getChild("BeakBottom");

            this.LegRight = this.Body.getChild("LegRight");
            this.FootRight = this.LegRight.getChild("FootRight");
            this.ToeRight1 = this.FootRight.getChild("ToeRight1");

            this.ToeRight2 = this.FootRight.getChild("ToeRight2");

            this.LegLeft = this.Body.getChild("LegLeft");
            this.FootLeft = this.LegLeft.getChild("FootLeft");
            this.ToeLeft1 = this.FootLeft.getChild("ToeLeft1");

            this.ToeLeft2 = this.FootLeft.getChild("ToeLeft2");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 24).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 20.0F, 0.0F, -0.5874778235581302F, 0.0F, 0.0F));
            PartDefinition WingLeft = Body.addOrReplaceChild("WingLeft", CubeListBuilder.create().texOffs(0, 7).addBox(0.0F, -1.0F, 0.0F, 1.0F, 3.0F, 5.0F), PartPose.offsetAndRotation(1.7F, -1.1F, -1.9F, 0.0F, -0.0911061832922575F, 0.13665927909957545F));

            PartDefinition TailBase = Body.addOrReplaceChild("TailBase", CubeListBuilder.create().texOffs(17, 28).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -2.0F, 2.0F, 1.622632626884417F, 0.0F, 0.0F));
            PartDefinition TailMiddle = TailBase.addOrReplaceChild("TailMiddle", CubeListBuilder.create().texOffs(23, 22).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, 0.23457224414434488F, 0.0F, 0.0F));
            PartDefinition TailEndRight = TailMiddle.addOrReplaceChild("TailEndRight", CubeListBuilder.create().texOffs(15, 23).mirror(true).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 0.0F), PartPose.offsetAndRotation(-0.1F, 3.9F, 0.0F, 0.11728612207217244F, 0.0F, 0.1563815016444822F));

            PartDefinition TailRight = TailMiddle.addOrReplaceChild("TailRight", CubeListBuilder.create().texOffs(28, 22).mirror(true).addBox(0.0F, -0.2F, -1.0F, 1.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(-1.4F, 0.0F, -0.1F, 0.0F, 0.0F, -0.13665927909957545F));

            PartDefinition TailEndLeft = TailMiddle.addOrReplaceChild("TailEndLeft", CubeListBuilder.create().texOffs(15, 23).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 0.0F), PartPose.offsetAndRotation(0.2F, 3.9F, 0.0F, 0.11728612207217244F, 0.0F, -0.1563815016444822F));

            PartDefinition TailEnd = TailMiddle.addOrReplaceChild("TailEnd", CubeListBuilder.create().texOffs(18, 23).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 3.9F, 0.0F, 0.11728612207217244F, 0.0F, 0.0F));

            PartDefinition TailLeft = TailMiddle.addOrReplaceChild("TailLeft", CubeListBuilder.create().texOffs(28, 22).addBox(-1.0F, -0.2F, -1.0F, 1.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(1.4F, 0.0F, -0.1F, 0.0F, 0.0F, 0.13665927909957545F));

            PartDefinition WingRight = Body.addOrReplaceChild("WingRight", CubeListBuilder.create().texOffs(0, 7).mirror(true).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 3.0F, 5.0F), PartPose.offsetAndRotation(-1.7F, -1.1F, -1.9F, 0.0F, 0.0911061832922575F, -0.13665927909957545F));

            PartDefinition Neck1 = Body.addOrReplaceChild("Neck1", CubeListBuilder.create().texOffs(22, 14).addBox(-1.5F, -3.0F, -2.0F, 3.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 2.0F, -2.0F, -0.6255260065779288F, 0.0F, 0.0F));
            PartDefinition Neck2 = Neck1.addOrReplaceChild("Neck2", CubeListBuilder.create().texOffs(11, 14).addBox(-1.0F, -2.0F, -2.9F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, -0.1F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, -0.5860815947776289F, 0.0F, 0.0F));
            PartDefinition Head = Neck2.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -0.8F, -2.5F, 1.8767525233642137F, 0.0F, 0.0F));
            PartDefinition BeakTop = Head.addOrReplaceChild("BeakTop", CubeListBuilder.create().texOffs(13, 0).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.3F, -1.0F, 0.19582594673429568F, 0.0F, 0.0F));
            PartDefinition BeakBottom = BeakTop.addOrReplaceChild("BeakBottom", CubeListBuilder.create().texOffs(21, 0).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(-0.01F, 0.5F, 0.1F, -0.11728612207217244F, 0.0F, 0.0F));

            PartDefinition LegRight = Body.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(0, 20).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-1.3F, 1.9F, 0.5F, 1.73974420371427F, 0.0F, 0.0F));
            PartDefinition FootRight = LegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(7, 20).addBox(-0.51F, -0.7F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -1.5F, 0.4098033003787853F, 0.0F, 0.0F));
            PartDefinition ToeRight1 = FootRight.addOrReplaceChild("ToeRight1", CubeListBuilder.create().texOffs(6, 17).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.5F, -0.01F, 0.0F, 0.0F, 0.591841146688116F));

            PartDefinition ToeRight2 = FootRight.addOrReplaceChild("ToeRight2", CubeListBuilder.create().texOffs(6, 17).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.5F, -0.01F, 0.0F, 0.0F, -0.591841146688116F));

            PartDefinition LegLeft = Body.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(0, 20).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(1.3F, 1.9F, 0.5F, 1.73974420371427F, 0.0F, 0.0F));
            PartDefinition FootLeft = LegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(7, 20).addBox(-0.51F, -0.7F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -1.5F, 0.4098033003787853F, 0.0F, 0.0F));
            PartDefinition ToeLeft1 = FootLeft.addOrReplaceChild("ToeLeft1", CubeListBuilder.create().texOffs(6, 17).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.5F, -0.01F, 0.0F, 0.0F, -0.591841146688116F));

            PartDefinition ToeLeft2 = FootLeft.addOrReplaceChild("ToeLeft2", CubeListBuilder.create().texOffs(6, 17).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.5F, -0.01F, 0.0F, 0.0F, 0.591841146688116F));

            return LayerDefinition.create(meshDefinition, 32, 32);
        }

        @Override
        public void setupAnim(BeeEaterEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck1.yRot = (float) Math.toRadians((double) netHeadYaw) * 0.25F;
            this.Head.yRot = (float) Math.toRadians((double) netHeadYaw) * 0.25F;
            this.Head.xRot = (float) Math.toRadians((double) headPitch) + 1.877F;
            this.Head.zRot = (float) Math.toRadians((double) headPitch) * 0.05F;
        }

        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        }

        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        }
    }

    public static class Flying extends BeeEaterModel {
        public ModelPart Neck1;
        public ModelPart TailBase;
        public ModelPart LegRight;
        public ModelPart WingRight1;
        public ModelPart WingLeft1;
        public ModelPart LegLeft;
        public ModelPart Neck2;
        public ModelPart Head;
        public ModelPart BeakTop;
        public ModelPart BeakBottom;
        public ModelPart TailMiddle;
        public ModelPart TailLeft;
        public ModelPart TailRight;
        public ModelPart TailEndLeft;
        public ModelPart TailEndRight;
        public ModelPart TailEnd;
        public ModelPart FootRight;
        public ModelPart ToeRight1;
        public ModelPart ToeRight2;
        public ModelPart WingRight2;
        public ModelPart WingFeatherRightBase;
        public ModelPart WingFeatherLeft1;
        public ModelPart WingFeatherLeft2;
        public ModelPart WingFeatherLeft3;
        public ModelPart WingFeatherLeft4;
        public ModelPart WingFeatherLeft5;
        public ModelPart WingFeatherLeft6;
        public ModelPart WingFeatherLeft7;
        public ModelPart WingLeft2;
        public ModelPart WingFeatherLeftBase;
        public ModelPart WingFeatherLeft1_1;
        public ModelPart WingFeatherLeft2_1;
        public ModelPart WingFeatherLeft3_1;
        public ModelPart WingFeatherLeft4_1;
        public ModelPart WingFeatherLeft5_1;
        public ModelPart WingFeatherLeft6_1;
        public ModelPart WingFeatherLeft7_1;
        public ModelPart FootLeft;
        public ModelPart ToeLeft1;
        public ModelPart ToeLeft2;

        public Flying(ModelPart root) {
            this.Body = root.getChild("Body");
            this.LegRight = this.Body.getChild("LegRight");
            this.FootRight = this.LegRight.getChild("FootRight");
            this.ToeRight2 = this.FootRight.getChild("ToeRight2");

            this.ToeRight1 = this.FootRight.getChild("ToeRight1");

            this.LegLeft = this.Body.getChild("LegLeft");
            this.FootLeft = this.LegLeft.getChild("FootLeft");
            this.ToeLeft1 = this.FootLeft.getChild("ToeLeft1");

            this.ToeLeft2 = this.FootLeft.getChild("ToeLeft2");

            this.Neck1 = this.Body.getChild("Neck1");
            this.Neck2 = this.Neck1.getChild("Neck2");
            this.Head = this.Neck2.getChild("Head");
            this.BeakTop = this.Head.getChild("BeakTop");
            this.BeakBottom = this.BeakTop.getChild("BeakBottom");

            this.TailBase = this.Body.getChild("TailBase");
            this.TailMiddle = this.TailBase.getChild("TailMiddle");
            this.TailLeft = this.TailMiddle.getChild("TailLeft");

            this.TailEndLeft = this.TailMiddle.getChild("TailEndLeft");

            this.TailEndRight = this.TailMiddle.getChild("TailEndRight");

            this.TailRight = this.TailMiddle.getChild("TailRight");

            this.TailEnd = this.TailMiddle.getChild("TailEnd");

            this.WingLeft1 = this.Body.getChild("WingLeft1");
            this.WingLeft2 = this.WingLeft1.getChild("WingLeft2");
            this.WingFeatherLeftBase = this.WingLeft2.getChild("WingFeatherLeftBase");
            this.WingFeatherLeft1_1 = this.WingFeatherLeftBase.getChild("WingFeatherLeft1_1");
            this.WingFeatherLeft2_1 = this.WingFeatherLeft1_1.getChild("WingFeatherLeft2_1");
            this.WingFeatherLeft3_1 = this.WingFeatherLeft2_1.getChild("WingFeatherLeft3_1");
            this.WingFeatherLeft4_1 = this.WingFeatherLeft3_1.getChild("WingFeatherLeft4_1");
            this.WingFeatherLeft5_1 = this.WingFeatherLeft4_1.getChild("WingFeatherLeft5_1");
            this.WingFeatherLeft6_1 = this.WingFeatherLeft5_1.getChild("WingFeatherLeft6_1");
            this.WingFeatherLeft7_1 = this.WingFeatherLeft6_1.getChild("WingFeatherLeft7_1");

            this.WingRight1 = this.Body.getChild("WingRight1");
            this.WingRight2 = this.WingRight1.getChild("WingRight2");
            this.WingFeatherRightBase = this.WingRight2.getChild("WingFeatherRightBase");
            this.WingFeatherLeft1 = this.WingFeatherRightBase.getChild("WingFeatherLeft1");
            this.WingFeatherLeft2 = this.WingFeatherLeft1.getChild("WingFeatherLeft2");
            this.WingFeatherLeft3 = this.WingFeatherLeft2.getChild("WingFeatherLeft3");
            this.WingFeatherLeft4 = this.WingFeatherLeft3.getChild("WingFeatherLeft4");
            this.WingFeatherLeft5 = this.WingFeatherLeft4.getChild("WingFeatherLeft5");
            this.WingFeatherLeft6 = this.WingFeatherLeft5.getChild("WingFeatherLeft6");
            this.WingFeatherLeft7 = this.WingFeatherLeft6.getChild("WingFeatherLeft7");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 24).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 15.0F, 0.0F, -0.039968039204879874F, 0.0F, 0.0F));
            PartDefinition LegRight = Body.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(0, 20).addBox(-0.5F, -2.0F, -3.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-1.3F, 1.9F, 1.3F, 0.019547687705560274F, 0.0F, 0.0F));
            PartDefinition FootRight = LegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(7, 20).addBox(-0.51F, -0.7F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -1.5F, 2.325651228282444F, 0.0F, 0.0F));
            PartDefinition ToeRight2 = FootRight.addOrReplaceChild("ToeRight2", CubeListBuilder.create().texOffs(6, 17).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.5F, -0.01F, 0.0F, 0.0F, -0.591841146688116F));

            PartDefinition ToeRight1 = FootRight.addOrReplaceChild("ToeRight1", CubeListBuilder.create().texOffs(6, 17).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.5F, -0.01F, 0.0F, 0.0F, 0.591841146688116F));

            PartDefinition LegLeft = Body.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(0, 20).addBox(-0.5F, -2.0F, -3.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(1.3F, 1.9F, 1.3F, 0.019547687705560274F, 0.0F, 0.0F));
            PartDefinition FootLeft = LegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(7, 20).addBox(-0.51F, -0.7F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -1.5F, 2.325651228282444F, 0.0F, 0.0F));
            PartDefinition ToeLeft1 = FootLeft.addOrReplaceChild("ToeLeft1", CubeListBuilder.create().texOffs(6, 17).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.5F, -0.01F, 0.0F, 0.0F, 0.591841146688116F));

            PartDefinition ToeLeft2 = FootLeft.addOrReplaceChild("ToeLeft2", CubeListBuilder.create().texOffs(6, 17).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.5F, -0.01F, 0.0F, 0.0F, -0.591841146688116F));

            PartDefinition Neck1 = Body.addOrReplaceChild("Neck1", CubeListBuilder.create().texOffs(22, 14).addBox(-1.5F, -3.0F, -2.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, -2.0F, -0.5082398928281348F, 0.0F, 0.0F));
            PartDefinition Neck2 = Neck1.addOrReplaceChild("Neck2", CubeListBuilder.create().texOffs(11, 14).addBox(-1.0F, -2.0F, -2.9F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, -0.1F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, -0.5860815947776289F, 0.0F, 0.0F));
            PartDefinition Head = Neck2.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -1.5F, -2.7F, 1.2512265833653122F, 0.0F, 0.0F));
            PartDefinition BeakTop = Head.addOrReplaceChild("BeakTop", CubeListBuilder.create().texOffs(13, 0).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.3F, -1.0F, 0.19582594673429568F, 0.0F, 0.0F));
            PartDefinition BeakBottom = BeakTop.addOrReplaceChild("BeakBottom", CubeListBuilder.create().texOffs(21, 0).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F, -0.2F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.1F, -0.11728612207217244F, 0.0F, 0.0F));

            PartDefinition TailBase = Body.addOrReplaceChild("TailBase", CubeListBuilder.create().texOffs(17, 28).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -2.0F, 2.0F, 1.622632626884417F, 0.0F, 0.0F));
            PartDefinition TailMiddle = TailBase.addOrReplaceChild("TailMiddle", CubeListBuilder.create().texOffs(23, 22).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, -0.1563815016444822F, 0.0F, 0.0F));
            PartDefinition TailLeft = TailMiddle.addOrReplaceChild("TailLeft", CubeListBuilder.create().texOffs(28, 22).addBox(-1.0F, -0.2F, -1.0F, 1.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(1.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.13700834461707917F));

            PartDefinition TailEndLeft = TailMiddle.addOrReplaceChild("TailEndLeft", CubeListBuilder.create().texOffs(15, 23).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 0.0F, new CubeDeformation(-0.01F, -0.01F, -0.01F)), PartPose.offsetAndRotation(0.2F, 3.9F, 0.0F, 0.11728612207217244F, 0.0F, -0.1563815016444822F));

            PartDefinition TailEndRight = TailMiddle.addOrReplaceChild("TailEndRight", CubeListBuilder.create().texOffs(15, 23).mirror(true).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 0.0F, new CubeDeformation(-0.01F, -0.01F, -0.01F)), PartPose.offsetAndRotation(-0.1F, 3.9F, 0.0F, 0.11728612207217244F, 0.0F, 0.1563815016444822F));

            PartDefinition TailRight = TailMiddle.addOrReplaceChild("TailRight", CubeListBuilder.create().texOffs(28, 22).mirror(true).addBox(0.0F, -0.2F, -1.0F, 1.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(-1.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.13700834461707917F));

            PartDefinition TailEnd = TailMiddle.addOrReplaceChild("TailEnd", CubeListBuilder.create().texOffs(18, 23).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F, -0.01F, -0.01F)), PartPose.offsetAndRotation(0.0F, 3.9F, 0.0F, 0.11728612207217244F, 0.0F, 0.0F));

            PartDefinition WingLeft1 = Body.addOrReplaceChild("WingLeft1", CubeListBuilder.create().texOffs(26, 4).mirror(true).addBox(0.0F, 0.0F, -0.1F, 2.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(1.3F, -1.0F, -2.0F, 1.5266395180247287F, 0.20280725708437025F, -0.18203784630933073F));
            PartDefinition WingLeft2 = WingLeft1.addOrReplaceChild("WingLeft2", CubeListBuilder.create().texOffs(17, 4).mirror(true).addBox(0.0F, -4.0F, -0.1F, 3.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(2.0F, 4.0F, 0.01F, 0.0F, 0.0F, -0.3642502295386026F));
            PartDefinition WingFeatherLeftBase = WingLeft2.addOrReplaceChild("WingFeatherLeftBase", CubeListBuilder.create().texOffs(16, 10).addBox(0.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(3.0F, -4.0F, -0.01F, 0.0F, 0.0F, 0.27314402127920984F));
            PartDefinition WingFeatherLeft1_1 = WingFeatherLeftBase.addOrReplaceChild("WingFeatherLeft1_1", CubeListBuilder.create().texOffs(16, 10).addBox(0.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -0.0F, 0.0F, 0.0F, 0.2275909337942703F));
            PartDefinition WingFeatherLeft2_1 = WingFeatherLeft1_1.addOrReplaceChild("WingFeatherLeft2_1", CubeListBuilder.create().texOffs(16, 10).addBox(0.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -0.0F, 0.0F, 0.0F, 0.2275909337942703F));
            PartDefinition WingFeatherLeft3_1 = WingFeatherLeft2_1.addOrReplaceChild("WingFeatherLeft3_1", CubeListBuilder.create().texOffs(16, 10).addBox(0.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -0.0F, 0.0F, 0.0F, 0.2275909337942703F));
            PartDefinition WingFeatherLeft4_1 = WingFeatherLeft3_1.addOrReplaceChild("WingFeatherLeft4_1", CubeListBuilder.create().texOffs(16, 10).addBox(0.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -0.0F, 0.0F, 0.0F, 0.2275909337942703F));
            PartDefinition WingFeatherLeft5_1 = WingFeatherLeft4_1.addOrReplaceChild("WingFeatherLeft5_1", CubeListBuilder.create().texOffs(16, 10).addBox(0.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -0.0F, 0.0F, 0.0F, 0.2275909337942703F));
            PartDefinition WingFeatherLeft6_1 = WingFeatherLeft5_1.addOrReplaceChild("WingFeatherLeft6_1", CubeListBuilder.create().texOffs(16, 10).addBox(0.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -0.0F, 0.0F, 0.0F, 0.2275909337942703F));
            PartDefinition WingFeatherLeft7_1 = WingFeatherLeft6_1.addOrReplaceChild("WingFeatherLeft7_1", CubeListBuilder.create().texOffs(16, 10).addBox(0.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-0.1F, 0.0F, -0.0F, 0.0F, 0.0F, 0.2275909337942703F));

            PartDefinition WingRight1 = Body.addOrReplaceChild("WingRight1", CubeListBuilder.create().texOffs(26, 4).mirror(true).addBox(-2.0F, 0.0F, -0.1F, 2.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(-1.3F, -1.0F, -2.0F, 1.5266395180247287F, -0.20280725708437025F, 0.18203784630933073F));
            PartDefinition WingRight2 = WingRight1.addOrReplaceChild("WingRight2", CubeListBuilder.create().texOffs(17, 4).mirror(true).addBox(-3.0F, -4.0F, -0.1F, 3.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(-2.0F, 4.0F, 0.01F, 0.0F, 0.0F, 0.3642502295386026F));
            PartDefinition WingFeatherRightBase = WingRight2.addOrReplaceChild("WingFeatherRightBase", CubeListBuilder.create().texOffs(16, 10).mirror(true).addBox(-5.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-3.0F, -4.0F, -0.01F, 0.0F, 0.0F, -0.27314402127920984F));
            PartDefinition WingFeatherLeft1 = WingFeatherRightBase.addOrReplaceChild("WingFeatherLeft1", CubeListBuilder.create().texOffs(16, 10).mirror(true).addBox(-5.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -0.0F, 0.0F, 0.0F, -0.2275909337942703F));
            PartDefinition WingFeatherLeft2 = WingFeatherLeft1.addOrReplaceChild("WingFeatherLeft2", CubeListBuilder.create().texOffs(16, 10).mirror(true).addBox(-5.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -0.0F, 0.0F, 0.0F, -0.2275909337942703F));
            PartDefinition WingFeatherLeft3 = WingFeatherLeft2.addOrReplaceChild("WingFeatherLeft3", CubeListBuilder.create().texOffs(16, 10).mirror(true).addBox(-5.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -0.0F, 0.0F, 0.0F, -0.2275909337942703F));
            PartDefinition WingFeatherLeft4 = WingFeatherLeft3.addOrReplaceChild("WingFeatherLeft4", CubeListBuilder.create().texOffs(16, 10).mirror(true).addBox(-5.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -0.0F, 0.0F, 0.0F, -0.2275909337942703F));
            PartDefinition WingFeatherLeft5 = WingFeatherLeft4.addOrReplaceChild("WingFeatherLeft5", CubeListBuilder.create().texOffs(16, 10).mirror(true).addBox(-5.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -0.0F, 0.0F, 0.0F, -0.2275909337942703F));
            PartDefinition WingFeatherLeft6 = WingFeatherLeft5.addOrReplaceChild("WingFeatherLeft6", CubeListBuilder.create().texOffs(16, 10).mirror(true).addBox(-5.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -0.0F, 0.0F, 0.0F, -0.2275909337942703F));
            PartDefinition WingFeatherLeft7 = WingFeatherLeft6.addOrReplaceChild("WingFeatherLeft7", CubeListBuilder.create().texOffs(16, 10).mirror(true).addBox(-5.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.1F, 0.0F, -0.0F, 0.0F, 0.0F, -0.2275909337942703F));

            return LayerDefinition.create(meshDefinition, 32, 32);
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
            this.Neck1.xRot = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.8F) * 0.5F - 0.508F;
            this.Head.xRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 1.251F;
            this.Body.xRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.1F) * 0.5F - 0.039F;
            this.Body.y = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 5F) * 0.5F + 15.0F;
            this.TailBase.xRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.7F) * 0.5F + 1.622F;
            this.LegLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 0.019F;
            this.LegRight.xRot = Mth.cos(6F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 0.019F;

            this.WingLeft1.yRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.5F) * 0.5F + 0.202F;
            this.WingLeft1.zRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -7F) * 0.5F - 0.182F;
            this.WingLeft2.yRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.5F) * 0.5F;
            this.WingLeft2.zRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 2F) * 0.5F - 0.364F;
            this.WingRight1.yRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F - 0.202F;
            this.WingRight1.zRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 7F) * 0.5F + 0.182F;
            this.WingRight2.yRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F;
            this.WingRight2.zRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.364F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 2.0f;
            float degree = 1.0f;
            this.Neck1.xRot = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.8F) * 0.5F - 0.508F;
            this.Head.xRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 1.251F;
            this.Body.xRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.1F) * 0.5F - 0.039F;
            this.Body.y = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 5F) * 0.5F + 15.0F;
            this.TailBase.xRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.7F) * 0.5F + 1.622F;
            this.LegLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 0.019F;
            this.LegRight.xRot = Mth.cos(6F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 0.019F;

            this.WingLeft1.yRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.5F) * 0.5F + 0.202F;
            this.WingLeft1.zRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -7F) * 0.5F - 0.182F;
            this.WingLeft2.yRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.5F) * 0.5F;
            this.WingLeft2.zRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 2F) * 0.5F - 0.364F;
            this.WingRight1.yRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F - 0.202F;
            this.WingRight1.zRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 7F) * 0.5F + 0.182F;
            this.WingRight2.yRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F;
            this.WingRight2.zRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.364F;
        }
    }

    public static class Child extends BeeEaterModel {
        public ModelPart TailBase;
        public ModelPart LegRight;
        public ModelPart LegLeft;
        public ModelPart WingLeft;
        public ModelPart WingRight;
        public ModelPart Neck1;
        public ModelPart FootRight;
        public ModelPart Toe2Right;
        public ModelPart Toe1Right;
        public ModelPart FootLeft;
        public ModelPart Toe1Left;
        public ModelPart Toe2Left;
        public ModelPart Head;
        public ModelPart UpperBill;
        public ModelPart LowerBill;

        public Child(ModelPart root) {
            this.Body = root.getChild("Body");
            this.TailBase = this.Body.getChild("TailBase");

            this.Neck1 = this.Body.getChild("Neck1");
            this.Head = this.Neck1.getChild("Head");
            this.LowerBill = this.Head.getChild("LowerBill");

            this.UpperBill = this.Head.getChild("UpperBill");

            this.WingLeft = this.Body.getChild("WingLeft");

            this.LegLeft = this.Body.getChild("LegLeft");
            this.FootLeft = this.LegLeft.getChild("FootLeft");
            this.Toe1Left = this.FootLeft.getChild("Toe1Left");

            this.Toe2Left = this.FootLeft.getChild("Toe2Left");

            this.WingRight = this.Body.getChild("WingRight");

            this.LegRight = this.Body.getChild("LegRight");
            this.FootRight = this.LegRight.getChild("FootRight");
            this.Toe2Right = this.FootRight.getChild("Toe2Right");
            this.Toe1Right = this.FootRight.getChild("Toe1Right");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 24).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 20.9F, 0.0F, 1.411447814024714F, 0.0F, 0.0F));
            PartDefinition TailBase = Body.addOrReplaceChild("TailBase", CubeListBuilder.create().texOffs(17, 28).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 2.0F, -1.0F, 0.0911061832922575F, 0.0F, 0.0F));

            PartDefinition Neck1 = Body.addOrReplaceChild("Neck1", CubeListBuilder.create().texOffs(0, 18).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -2.0F, -1.5F, 0.7285004590772052F, 0.0F, 0.0F));
            PartDefinition Head = Neck1.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 5).addBox(-1.5F, -0.7F, 0.0F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.6373942508178124F, 0.0F, 0.0F));
            PartDefinition LowerBill = Head.addOrReplaceChild("LowerBill", CubeListBuilder.create().texOffs(5, 1).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -0.6F, 0.3F, -0.489739378788545F, 0.0F, 0.0F));

            PartDefinition UpperBill = Head.addOrReplaceChild("UpperBill", CubeListBuilder.create().texOffs(0, 1).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -0.5F, 2.0F, 0.5855579507282921F, 0.0F, 0.0F));

            PartDefinition WingLeft = Body.addOrReplaceChild("WingLeft", CubeListBuilder.create().texOffs(29, 0).addBox(-0.2F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(1.9F, -1.9F, 1.1F, -0.2275909337942703F, -0.0911061832922575F, 0.13665927909957545F));

            PartDefinition LegLeft = Body.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(13, 0).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(1.3F, 0.9F, -1.4F, -0.500909508638178F, -0.04555309164612875F, 0.4098033003787853F));
            PartDefinition FootLeft = LegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(13, 4).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -0.9F, 0.6829473549475088F, 0.0F, 0.0F));
            PartDefinition Toe1Left = FootLeft.addOrReplaceChild("Toe1Left", CubeListBuilder.create().texOffs(13, 8).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -0.01F, 0.0F, 0.0F, 0.591841146688116F));

            PartDefinition Toe2Left = FootLeft.addOrReplaceChild("Toe2Left", CubeListBuilder.create().texOffs(13, 8).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -0.01F, 0.0F, 0.0F, -0.591841146688116F));

            PartDefinition WingRight = Body.addOrReplaceChild("WingRight", CubeListBuilder.create().texOffs(38, 0).addBox(-0.8F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-1.9F, -1.9F, 1.1F, -0.2275909337942703F, 0.0911061832922575F, -0.13665927909957545F));

            PartDefinition LegRight = Body.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(20, 0).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-1.3F, 0.9F, -1.4F, -0.500909508638178F, 0.04555309164612875F, -0.4098033003787853F));
            PartDefinition FootRight = LegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(20, 4).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -0.9F, 0.6829473549475088F, 0.0F, 0.0F));
            PartDefinition Toe2Right = FootRight.addOrReplaceChild("Toe2Right", CubeListBuilder.create().texOffs(20, 8).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -0.01F, 0.0F, 0.0F, 0.591841146688116F));
            PartDefinition Toe1Right = FootRight.addOrReplaceChild("Toe1Right", CubeListBuilder.create().texOffs(20, 8).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -0.01F, 0.004537855888737689F, 0.0F, -0.591841146688116F));

            return LayerDefinition.create(meshDefinition, 64, 32);
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
