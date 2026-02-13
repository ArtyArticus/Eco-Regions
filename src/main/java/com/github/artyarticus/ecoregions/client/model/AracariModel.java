package com.github.artyarticus.ecoregions.client.model;

import com.github.artyarticus.ecoregions.entity.AracariEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class AracariModel extends ZawaBaseModel<AracariEntity> {
    public ModelPart Body;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Body);
        }

        return this.parts;
    }

    public static class Adult extends AracariModel {
        public ModelPart TailBase;
        public ModelPart RightLeg;
        public ModelPart Leg;
        public ModelPart Neck1;
        public ModelPart Wing;
        public ModelPart RightWing;
        public ModelPart TailMiddle;
        public ModelPart Tail;
        public ModelPart TailRight;
        public ModelPart RightFoot;
        public ModelPart Toe1RIght;
        public ModelPart Foot;
        public ModelPart Toe1Right;
        public ModelPart Neck2;
        public ModelPart Head;
        public ModelPart UpperBill;
        public ModelPart Crest;
        public ModelPart LowerBill;
        public ModelPart M;

        public Adult(ModelPart root) {
            this.Body = root.getChild("Body");
            this.RightWing = this.Body.getChild("RightWing");

            this.RightLeg = this.Body.getChild("RightLeg");
            this.RightFoot = this.RightLeg.getChild("RightFoot");
            this.Toe1RIght = this.RightFoot.getChild("Toe1RIght");

            this.Neck1 = this.Body.getChild("Neck1");
            this.Neck2 = this.Neck1.getChild("Neck2");
            this.Head = this.Neck2.getChild("Head");
            this.Crest = this.Head.getChild("Crest");

            this.UpperBill = this.Head.getChild("UpperBill");
            this.M = this.UpperBill.getChild("M");

            this.LowerBill = this.UpperBill.getChild("LowerBill");

            this.TailBase = this.Body.getChild("TailBase");
            this.TailMiddle = this.TailBase.getChild("TailMiddle");
            this.TailRight = this.TailMiddle.getChild("TailRight");

            this.Tail = this.TailMiddle.getChild("Tail");

            this.Wing = this.Body.getChild("Wing");

            this.Leg = this.Body.getChild("Leg");
            this.Foot = this.Leg.getChild("Foot");
            this.Toe1Right = this.Foot.getChild("Toe1Right");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 19.8F, 0.0F, 0.9445721725372036F, 0.0F, 0.0F));
            PartDefinition RightWing = Body.addOrReplaceChild("RightWing", CubeListBuilder.create().texOffs(0, 14).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 5.0F, 3.0F), PartPose.offsetAndRotation(-1.7F, -2.0F, 1.1F, 0.0F, 0.0911061832922575F, -0.13665927909957545F));

            PartDefinition RightLeg = Body.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(0, 22).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-1.3F, 0.7F, -1.8F, 0.2539454094941263F, 0.0F, 0.0F));
            PartDefinition RightFoot = RightLeg.addOrReplaceChild("RightFoot", CubeListBuilder.create().texOffs(26, 10).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-0.1F, 0.0F, -1.4F, 0.3707079291288539F, 0.1563815016444822F, -0.39112828270876815F));
            PartDefinition Toe1RIght = RightFoot.addOrReplaceChild("Toe1RIght", CubeListBuilder.create().texOffs(4, 25).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -0.01F, 0.0F, 0.0F, 0.9436995212270118F));

            PartDefinition Neck1 = Body.addOrReplaceChild("Neck1", CubeListBuilder.create().texOffs(8, 16).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -2.0F, -2.0F, 0.8260643669268491F, 0.0F, 0.0F));
            PartDefinition Neck2 = Neck1.addOrReplaceChild("Neck2", CubeListBuilder.create().texOffs(16, 0).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.604756612447646F, 0.0F, 0.0F));
            PartDefinition Head = Neck2.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 8).addBox(-1.5F, -3.0F, -1.2F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 2.0F, 3.0F, 0.494451775758413F, 0.0F, 0.0F));
            PartDefinition Crest = Head.addOrReplaceChild("Crest", CubeListBuilder.create().texOffs(24, 23).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F), PartPose.offset(-0.01F, -1.5F, 1.9F));

            PartDefinition UpperBill = Head.addOrReplaceChild("UpperBill", CubeListBuilder.create().texOffs(20, 5).addBox(-1.0F, -2.3F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -3.2F, 0.3F, 0.11676252795710604F, 0.0F, 0.0F));
            PartDefinition M = UpperBill.addOrReplaceChild("M", CubeListBuilder.create().texOffs(14, 21).addBox(-0.5F, -2.9F, -1.0F, 1.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(0.01F, 0.0F, -0.5F, -0.19547687289441354F, 0.0F, 0.0F));

            PartDefinition LowerBill = UpperBill.addOrReplaceChild("LowerBill", CubeListBuilder.create().texOffs(16, 5).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -1.9F, 0.6F, 0.7426375834077817F, 0.0F, 0.0F));

            PartDefinition TailBase = Body.addOrReplaceChild("TailBase", CubeListBuilder.create().texOffs(18, 16).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 1.4F, 2.0F, 0.3324852091891143F, 0.0F, 0.0F));
            PartDefinition TailMiddle = TailBase.addOrReplaceChild("TailMiddle", CubeListBuilder.create().texOffs(18, 20).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, 0.23457224414434488F, 0.0F, 0.0F));
            PartDefinition TailRight = TailMiddle.addOrReplaceChild("TailRight", CubeListBuilder.create().texOffs(20, 10).mirror(true).addBox(-0.5F, -0.2F, -1.0F, 2.0F, 5.0F, 1.0F), PartPose.offsetAndRotation(-1.2F, -0.2F, -0.1F, 0.0F, 0.0F, 0.09791297336714784F));

            PartDefinition Tail = TailMiddle.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(20, 10).addBox(-1.5F, -0.2F, -1.0F, 2.0F, 5.0F, 1.0F), PartPose.offsetAndRotation(1.2F, -0.2F, -0.1F, 0.0F, 0.0F, -0.09791297336714784F));

            PartDefinition Wing = Body.addOrReplaceChild("Wing", CubeListBuilder.create().texOffs(0, 14).addBox(0.0F, 0.0F, -2.0F, 1.0F, 5.0F, 3.0F), PartPose.offsetAndRotation(1.7F, -2.0F, 1.1F, 0.0F, -0.0911061832922575F, 0.13665927909957545F));

            PartDefinition Leg = Body.addOrReplaceChild("Leg", CubeListBuilder.create().texOffs(0, 22).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(1.3F, 0.7F, -1.8F, 0.2539454094941263F, 0.0F, 0.0F));
            PartDefinition Foot = Leg.addOrReplaceChild("Foot", CubeListBuilder.create().texOffs(24, 20).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.1F, 0.0F, -1.4F, 0.3707079291288539F, -0.1563815016444822F, 0.39112828270876815F));
            PartDefinition Toe1Right = Foot.addOrReplaceChild("Toe1Right", CubeListBuilder.create().texOffs(26, 0).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -0.01F, 0.0F, 0.0F, -0.9436995212270118F));

            return LayerDefinition.create(meshDefinition, 32, 32);
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
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck1.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.4F) * 0.5F + 0.826F;
            this.Neck2.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.604F;
            this.Head.xRot = Mth.cos(4.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.15F) * 0.5F + 0.494F;
            this.TailBase.xRot = Mth.cos(4.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.15F) * 0.5F + 0.332F;
        }

        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        }
    }

    public static class Flying extends AracariModel {
        public ModelPart TailBase;
        public ModelPart RightLeg;
        public ModelPart Leg;
        public ModelPart Neck1;
        public ModelPart Wing1;
        public ModelPart Wing1Right;
        public ModelPart TailMiddle;
        public ModelPart Tail;
        public ModelPart TailRight;
        public ModelPart RightFoot;
        public ModelPart Toe1RIght;
        public ModelPart Foot;
        public ModelPart Toe1Right;
        public ModelPart Neck2;
        public ModelPart Head;
        public ModelPart UpperBill;
        public ModelPart Crest;
        public ModelPart LowerBill;
        public ModelPart M;
        public ModelPart Wing2;
        public ModelPart WingFeather1;
        public ModelPart WingFeather2;
        public ModelPart WingFeather3;
        public ModelPart WingFeather4;
        public ModelPart WingFeather5;
        public ModelPart WingFeather6;
        public ModelPart WingFeather7;
        public ModelPart WingFeather8;
        public ModelPart Wing2Right;
        public ModelPart WingFeather1Right;
        public ModelPart WingFeather2Right;
        public ModelPart WingFeather3Right;
        public ModelPart WingFeather4Right;
        public ModelPart WingFeather5Right;
        public ModelPart WingFeather6Right;
        public ModelPart RightWingFeather7;
        public ModelPart WingFeather8Right;

        public Flying(ModelPart root) {
            this.Body = root.getChild("Body");
            this.RightLeg = this.Body.getChild("RightLeg");
            this.RightFoot = this.RightLeg.getChild("RightFoot");
            this.Toe1RIght = this.RightFoot.getChild("Toe1RIght");

            this.Wing1 = this.Body.getChild("Wing1");
            this.Wing2 = this.Wing1.getChild("Wing2");
            this.WingFeather1 = this.Wing2.getChild("WingFeather1");
            this.WingFeather2 = this.WingFeather1.getChild("WingFeather2");
            this.WingFeather3 = this.WingFeather2.getChild("WingFeather3");
            this.WingFeather4 = this.WingFeather3.getChild("WingFeather4");
            this.WingFeather5 = this.WingFeather4.getChild("WingFeather5");
            this.WingFeather6 = this.WingFeather5.getChild("WingFeather6");
            this.WingFeather7 = this.WingFeather6.getChild("WingFeather7");
            this.WingFeather8 = this.WingFeather7.getChild("WingFeather8");

            this.Wing1Right = this.Body.getChild("Wing1Right");
            this.Wing2Right = this.Wing1Right.getChild("Wing2Right");
            this.WingFeather1Right = this.Wing2Right.getChild("WingFeather1Right");
            this.WingFeather2Right = this.WingFeather1Right.getChild("WingFeather2Right");
            this.WingFeather3Right = this.WingFeather2Right.getChild("WingFeather3Right");
            this.WingFeather4Right = this.WingFeather3Right.getChild("WingFeather4Right");
            this.WingFeather5Right = this.WingFeather4Right.getChild("WingFeather5Right");
            this.WingFeather6Right = this.WingFeather5Right.getChild("WingFeather6Right");
            this.RightWingFeather7 = this.WingFeather6Right.getChild("RightWingFeather7");
            this.WingFeather8Right = this.RightWingFeather7.getChild("WingFeather8Right");

            this.Leg = this.Body.getChild("Leg");
            this.Foot = this.Leg.getChild("Foot");
            this.Toe1Right = this.Foot.getChild("Toe1Right");

            this.TailBase = this.Body.getChild("TailBase");
            this.TailMiddle = this.TailBase.getChild("TailMiddle");
            this.TailRight = this.TailMiddle.getChild("TailRight");

            this.Tail = this.TailMiddle.getChild("Tail");

            this.Neck1 = this.Body.getChild("Neck1");
            this.Neck2 = this.Neck1.getChild("Neck2");
            this.Head = this.Neck2.getChild("Head");
            this.UpperBill = this.Head.getChild("UpperBill");
            this.M = this.UpperBill.getChild("M");

            this.LowerBill = this.UpperBill.getChild("LowerBill");

            this.Crest = this.Head.getChild("Crest");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 20.9F, 0.0F, 1.491907503194297F, 0.0F, 0.0F));
            PartDefinition RightLeg = Body.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(0, 22).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-1.3F, 2.0F, -2.0F, -1.6207127540545787F, 0.0F, 0.0F));
            PartDefinition RightFoot = RightLeg.addOrReplaceChild("RightFoot", CubeListBuilder.create().texOffs(26, 10).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-0.1F, 0.0F, -1.4F, 2.5549874813418545F, 0.1563815016444822F, -0.39112828270876815F));
            PartDefinition Toe1RIght = RightFoot.addOrReplaceChild("Toe1RIght", CubeListBuilder.create().texOffs(4, 25).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -0.01F, 0.0F, 0.0F, 0.9436995212270118F));

            PartDefinition Wing1 = Body.addOrReplaceChild("Wing1", CubeListBuilder.create().texOffs(8, 28).addBox(0.0F, 0.0F, -0.1F, 2.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(1.9F, -1.9F, 1.0F, 0.0F, -0.500909508638178F, 0.18203784630933073F));
            PartDefinition Wing2 = Wing1.addOrReplaceChild("Wing2", CubeListBuilder.create().texOffs(24, 27).addBox(0.0F, -4.0F, -0.1F, 3.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(2.0F, 4.0F, -0.01F, 0.0F, 0.0F, -0.4098033003787853F));
            PartDefinition WingFeather1 = Wing2.addOrReplaceChild("WingFeather1", CubeListBuilder.create().texOffs(8, 14).addBox(0.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(3.0F, -4.0F, -0.01F, 0.0F, 0.0F, 0.27314402127920984F));
            PartDefinition WingFeather2 = WingFeather1.addOrReplaceChild("WingFeather2", CubeListBuilder.create().texOffs(8, 14).addBox(0.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2275909337942703F));
            PartDefinition WingFeather3 = WingFeather2.addOrReplaceChild("WingFeather3", CubeListBuilder.create().texOffs(8, 14).addBox(0.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2275909337942703F));
            PartDefinition WingFeather4 = WingFeather3.addOrReplaceChild("WingFeather4", CubeListBuilder.create().texOffs(8, 14).addBox(0.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2275909337942703F));
            PartDefinition WingFeather5 = WingFeather4.addOrReplaceChild("WingFeather5", CubeListBuilder.create().texOffs(8, 14).addBox(0.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2275909337942703F));
            PartDefinition WingFeather6 = WingFeather5.addOrReplaceChild("WingFeather6", CubeListBuilder.create().texOffs(8, 14).addBox(0.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2275909337942703F));
            PartDefinition WingFeather7 = WingFeather6.addOrReplaceChild("WingFeather7", CubeListBuilder.create().texOffs(8, 14).addBox(0.8F, 0.0F, -0.1F, 4.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2275909337942703F));
            PartDefinition WingFeather8 = WingFeather7.addOrReplaceChild("WingFeather8", CubeListBuilder.create().texOffs(9, 14).addBox(0.8F, 0.0F, -0.1F, 4.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2275909337942703F));

            PartDefinition Wing1Right = Body.addOrReplaceChild("Wing1Right", CubeListBuilder.create().texOffs(8, 28).mirror(true).addBox(-2.0F, 0.0F, -0.1F, 2.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(-1.9F, -1.9F, 1.0F, 0.0F, 0.500909508638178F, -0.18203784630933073F));
            PartDefinition Wing2Right = Wing1Right.addOrReplaceChild("Wing2Right", CubeListBuilder.create().texOffs(24, 27).mirror(true).addBox(-3.0F, -4.0F, -0.1F, 3.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(-2.0F, 4.0F, -0.01F, 0.0F, 0.0F, 0.3642502295386026F));
            PartDefinition WingFeather1Right = Wing2Right.addOrReplaceChild("WingFeather1Right", CubeListBuilder.create().texOffs(8, 14).mirror(true).addBox(-5.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-3.0F, -4.0F, -0.01F, 0.0F, 0.0F, -0.27314402127920984F));
            PartDefinition WingFeather2Right = WingFeather1Right.addOrReplaceChild("WingFeather2Right", CubeListBuilder.create().texOffs(8, 14).mirror(true).addBox(-5.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -0.0F, 0.0F, 0.0F, -0.2275909337942703F));
            PartDefinition WingFeather3Right = WingFeather2Right.addOrReplaceChild("WingFeather3Right", CubeListBuilder.create().texOffs(8, 14).mirror(true).addBox(-5.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2275909337942703F));
            PartDefinition WingFeather4Right = WingFeather3Right.addOrReplaceChild("WingFeather4Right", CubeListBuilder.create().texOffs(8, 14).mirror(true).addBox(-5.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2275909337942703F));
            PartDefinition WingFeather5Right = WingFeather4Right.addOrReplaceChild("WingFeather5Right", CubeListBuilder.create().texOffs(8, 14).mirror(true).addBox(-5.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2275909337942703F));
            PartDefinition WingFeather6Right = WingFeather5Right.addOrReplaceChild("WingFeather6Right", CubeListBuilder.create().texOffs(8, 14).mirror(true).addBox(-5.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2275909337942703F));
            PartDefinition RightWingFeather7 = WingFeather6Right.addOrReplaceChild("RightWingFeather7", CubeListBuilder.create().texOffs(9, 14).mirror(true).addBox(-4.8F, 0.0F, -0.1F, 4.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2275909337942703F));
            PartDefinition WingFeather8Right = RightWingFeather7.addOrReplaceChild("WingFeather8Right", CubeListBuilder.create().texOffs(9, 14).mirror(true).addBox(-4.8F, 0.0F, -0.1F, 4.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2275909337942703F));

            PartDefinition Leg = Body.addOrReplaceChild("Leg", CubeListBuilder.create().texOffs(0, 22).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(1.3F, 2.0F, -2.0F, -1.6207127540545787F, 0.0F, 0.0F));
            PartDefinition Foot = Leg.addOrReplaceChild("Foot", CubeListBuilder.create().texOffs(24, 20).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.1F, 0.0F, -1.4F, 2.5549874813418545F, -0.1563815016444822F, 0.39112828270876815F));
            PartDefinition Toe1Right = Foot.addOrReplaceChild("Toe1Right", CubeListBuilder.create().texOffs(26, 0).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -0.01F, 0.0F, 0.0F, -0.9436995212270118F));

            PartDefinition TailBase = Body.addOrReplaceChild("TailBase", CubeListBuilder.create().texOffs(18, 16).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 1.4F, 2.0F, 0.09791297336714784F, 0.0F, 0.0F));
            PartDefinition TailMiddle = TailBase.addOrReplaceChild("TailMiddle", CubeListBuilder.create().texOffs(18, 20).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, 0.11728612207217244F, 0.0F, 0.0F));
            PartDefinition TailRight = TailMiddle.addOrReplaceChild("TailRight", CubeListBuilder.create().texOffs(20, 10).mirror(true).addBox(-0.5F, -0.2F, -1.0F, 2.0F, 5.0F, 1.0F), PartPose.offsetAndRotation(-1.2F, -0.2F, -0.1F, 0.0F, 0.0F, 0.17645278138451428F));

            PartDefinition Tail = TailMiddle.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(20, 10).addBox(-1.5F, -0.2F, -1.0F, 2.0F, 5.0F, 1.0F), PartPose.offsetAndRotation(1.2F, -0.2F, -0.1F, 0.0F, 0.0F, -0.17645278138451428F));

            PartDefinition Neck1 = Body.addOrReplaceChild("Neck1", CubeListBuilder.create().texOffs(8, 16).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -2.0F, -2.0F, 0.8260643669268491F, 0.0F, 0.0F));
            PartDefinition Neck2 = Neck1.addOrReplaceChild("Neck2", CubeListBuilder.create().texOffs(16, 0).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.604756612447646F, 0.0F, 0.0F));
            PartDefinition Head = Neck2.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 8).addBox(-1.5F, -3.0F, -1.2F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 2.0F, 2.0F, 0.025307274986155617F, 0.0F, 0.0F));
            PartDefinition UpperBill = Head.addOrReplaceChild("UpperBill", CubeListBuilder.create().texOffs(20, 5).addBox(-1.0F, -2.3F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -3.2F, 0.3F, 0.11676252795710604F, 0.0F, 0.0F));
            PartDefinition M = UpperBill.addOrReplaceChild("M", CubeListBuilder.create().texOffs(14, 21).addBox(-0.5F, -2.9F, -1.0F, 1.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(0.01F, 0.0F, -0.5F, -0.19547687289441354F, 0.0F, 0.0F));

            PartDefinition LowerBill = UpperBill.addOrReplaceChild("LowerBill", CubeListBuilder.create().texOffs(16, 5).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -1.9F, 0.6F, 0.7426375834077817F, 0.0F, 0.0F));

            PartDefinition Crest = Head.addOrReplaceChild("Crest", CubeListBuilder.create().texOffs(24, 23).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F), PartPose.offset(-0.01F, -1.5F, 1.9F));

            return LayerDefinition.create(meshDefinition, 32, 32);
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
            this.Neck1.xRot = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.8F) * 0.5F + 0.826F;
            this.Neck2.xRot = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.8F) * 0.5F - 0.604F;
            this.Head.xRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.025F;
            this.Body.xRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.1F) * 0.5F + 1.491F;
            this.Body.y = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 5F) * 0.5F + 20.9F;
            this.TailBase.xRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.7F) * 0.5F + 0.097F;
            this.Leg.xRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F - 1.62F;
            this.RightLeg.xRot = Mth.cos(6F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F - 1.62F;

            this.Wing1.zRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.5F) * 0.5F + 0.182F;
            this.Wing1.yRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -7F) * 0.5F - 0.500F;
            this.Wing2.zRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.5F) * 0.5F - 0.409F;
            this.Wing2.yRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 2F) * 0.5F;
            this.Wing1Right.zRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F - 0.182F;
            this.Wing1Right.yRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 7F) * 0.5F + 0.500F;
            this.Wing2Right.zRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 0.409F;
            this.Wing2Right.yRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -2F) * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 2.0f;
            float degree = 1.0f;
            this.Neck1.xRot = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.8F) * 0.5F + 0.826F;
            this.Neck2.xRot = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.8F) * 0.5F - 0.604F;
            this.Head.xRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.025F;
            this.Body.xRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.1F) * 0.5F + 1.491F;
            this.Body.y = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 5F) * 0.5F + 20.9F;
            this.TailBase.xRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.7F) * 0.5F + 0.097F;
            this.Leg.xRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F - 1.62F;
            this.RightLeg.xRot = Mth.cos(6F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F - 1.62F;

            this.Wing1.zRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.5F) * 0.5F + 0.182F;
            this.Wing1.yRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -7F) * 0.5F - 0.500F;
            this.Wing2.zRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.5F) * 0.5F - 0.409F;
            this.Wing2.yRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 2F) * 0.5F;
            this.Wing1Right.zRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F - 0.182F;
            this.Wing1Right.yRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 7F) * 0.5F + 0.500F;
            this.Wing2Right.zRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 0.409F;
            this.Wing2Right.yRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -2F) * 0.5F;
        }
    }

    public static class Child extends AracariModel {
        public ModelPart TailBase;
        public ModelPart LegRight;
        public ModelPart Leg;
        public ModelPart Wing;
        public ModelPart WingRight;
        public ModelPart Neck1;
        public ModelPart FootRight;
        public ModelPart Toe2Right;
        public ModelPart Toe1Right;
        public ModelPart Foot;
        public ModelPart Toe1;
        public ModelPart Toe2;
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

            this.Wing = this.Body.getChild("Wing");

            this.Leg = this.Body.getChild("Leg");
            this.Foot = this.Leg.getChild("Foot");
            this.Toe1 = this.Foot.getChild("Toe1");

            this.Toe2 = this.Foot.getChild("Toe2");

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

            PartDefinition Wing = Body.addOrReplaceChild("Wing", CubeListBuilder.create().texOffs(29, 0).addBox(-0.2F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(1.9F, -1.9F, 1.1F, -0.2275909337942703F, -0.0911061832922575F, 0.13665927909957545F));

            PartDefinition Leg = Body.addOrReplaceChild("Leg", CubeListBuilder.create().texOffs(13, 0).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(1.3F, 0.9F, -1.4F, -0.500909508638178F, -0.04555309164612875F, 0.4098033003787853F));
            PartDefinition Foot = Leg.addOrReplaceChild("Foot", CubeListBuilder.create().texOffs(13, 4).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -0.9F, 0.6829473549475088F, 0.0F, 0.0F));
            PartDefinition Toe1 = Foot.addOrReplaceChild("Toe1", CubeListBuilder.create().texOffs(13, 8).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -0.01F, 0.0F, 0.0F, 0.591841146688116F));

            PartDefinition Toe2 = Foot.addOrReplaceChild("Toe2", CubeListBuilder.create().texOffs(13, 8).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -0.01F, 0.0F, 0.0F, -0.591841146688116F));

            PartDefinition WingRight = Body.addOrReplaceChild("WingRight", CubeListBuilder.create().texOffs(38, 0).addBox(-0.8F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-1.9F, -1.9F, 1.1F, -0.2275909337942703F, 0.0911061832922575F, -0.13665927909957545F));

            PartDefinition LegRight = Body.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(20, 0).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-1.3F, 0.9F, -1.4F, -0.500909508638178F, 0.04555309164612875F, -0.4098033003787853F));
            PartDefinition FootRight = LegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(20, 4).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -0.9F, 0.6829473549475088F, 0.0F, 0.0F));
            PartDefinition Toe2Right = FootRight.addOrReplaceChild("Toe2Right", CubeListBuilder.create().texOffs(20, 8).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -0.01F, 0.0F, 0.0F, 0.591841146688116F));

            PartDefinition Toe1Right = FootRight.addOrReplaceChild("Toe1Right", CubeListBuilder.create().texOffs(20, 8).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -0.01F, 0.004537855888737689F, 0.0F, -0.591841146688116F));

            return LayerDefinition.create(meshDefinition, 64, 32);
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
            this.Neck1.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.728F;
            this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.3F) * 0.5F - 0.637F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        }
    }
}
