package com.github.artyarticus.ecoregions.client.model;

import com.github.artyarticus.ecoregions.entity.KuduEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class KuduModel extends ZawaBaseModel<KuduEntity> {
    protected ModelPart Chest;
    private Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Chest);
        }

        return this.parts;
    }

    public static class AdultMale extends KuduModel {
        public ModelPart Body;
        public ModelPart ArmBaseLeft;
        public ModelPart BackFur1;
        public ModelPart Neck;
        public ModelPart ArmBaseRight;
        public ModelPart Hips;
        public ModelPart ThighLeft;
        public ModelPart Tail1;
        public ModelPart ThighRight;
        public ModelPart UpperLegLeft;
        public ModelPart LowerLegLeft;
        public ModelPart FootLeft;
        public ModelPart Tail2;
        public ModelPart TailTuft;
        public ModelPart UpperLegRight;
        public ModelPart LowerLegRight;
        public ModelPart FootRight;
        public ModelPart ArmLeft;
        public ModelPart ForearmLeft;
        public ModelPart HandLeft;
        public ModelPart BackFur2;
        public ModelPart Head;
        public ModelPart NeckLower;
        public ModelPart EarLeft;
        public ModelPart Snout;
        public ModelPart Beard;
        public ModelPart Forehead;
        public ModelPart Horn1Left;
        public ModelPart Horn1Right;
        public ModelPart EarRight;
        public ModelPart TopSnout;
        public ModelPart Jaw;
        public ModelPart Horn2Left;
        public ModelPart Horn3Left;
        public ModelPart Horn2Right;
        public ModelPart Horn3Right;
        public ModelPart NeckTuft1;
        public ModelPart NeckTuft2;
        public ModelPart ArmRight;
        public ModelPart ForearmRight;
        public ModelPart HandRight;

        public AdultMale(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.ArmBaseRight = this.Chest.getChild("ArmBaseRight");
            this.ArmRight = this.ArmBaseRight.getChild("ArmRight");
            this.ForearmRight = this.ArmRight.getChild("ForearmRight");
            this.HandRight = this.ForearmRight.getChild("HandRight");

            this.ArmBaseLeft = this.Chest.getChild("ArmBaseLeft");
            this.ArmLeft = this.ArmBaseLeft.getChild("ArmLeft");
            this.ForearmLeft = this.ArmLeft.getChild("ForearmLeft");
            this.HandLeft = this.ForearmLeft.getChild("HandLeft");

            this.Neck = this.Chest.getChild("Neck");
            this.Head = this.Neck.getChild("Head");
            this.Horn1Right = this.Head.getChild("Horn1Right");
            this.Horn2Right = this.Horn1Right.getChild("Horn2Right");
            this.Horn3Right = this.Horn2Right.getChild("Horn3Right");

            this.Horn1Left = this.Head.getChild("Horn1Left");
            this.Horn2Left = this.Horn1Left.getChild("Horn2Left");
            this.Horn3Left = this.Horn2Left.getChild("Horn3Left");

            this.Beard = this.Head.getChild("Beard");

            this.EarLeft = this.Head.getChild("EarLeft");

            this.EarRight = this.Head.getChild("EarRight");

            this.Snout = this.Head.getChild("Snout");
            this.Jaw = this.Snout.getChild("Jaw");

            this.TopSnout = this.Snout.getChild("TopSnout");

            this.Forehead = this.Head.getChild("Forehead");

            this.NeckLower = this.Neck.getChild("NeckLower");
            this.NeckTuft1 = this.NeckLower.getChild("NeckTuft1");
            this.NeckTuft2 = this.NeckTuft1.getChild("NeckTuft2");

            this.Body = this.Chest.getChild("Body");
            this.Hips = this.Body.getChild("Hips");
            this.Tail1 = this.Hips.getChild("Tail1");
            this.Tail2 = this.Tail1.getChild("Tail2");
            this.TailTuft = this.Tail2.getChild("TailTuft");

            this.ThighRight = this.Hips.getChild("ThighRight");
            this.UpperLegRight = this.ThighRight.getChild("UpperLegRight");
            this.LowerLegRight = this.UpperLegRight.getChild("LowerLegRight");
            this.FootRight = this.LowerLegRight.getChild("FootRight");

            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.UpperLegLeft = this.ThighLeft.getChild("UpperLegLeft");
            this.LowerLegLeft = this.UpperLegLeft.getChild("LowerLegLeft");
            this.FootLeft = this.LowerLegLeft.getChild("FootLeft");

            this.BackFur1 = this.Chest.getChild("BackFur1");
            this.BackFur2 = this.BackFur1.getChild("BackFur2");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Chest = partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 57).addBox(-6.0F, -8.5F, -4.0F, 12.0F, 17.0F, 10.0F), PartPose.offsetAndRotation(0.0F, -2.0F, -6.0F, -0.23527037517935237F, 0.0F, 0.0F));
            PartDefinition ArmBaseRight = Chest.addOrReplaceChild("ArmBaseRight", CubeListBuilder.create().texOffs(54, 72).mirror(true).addBox(-2.5F, 0.0F, -3.0F, 5.0F, 10.0F, 6.0F), PartPose.offsetAndRotation(-3.7F, 1.5F, -0.5F, 0.3141592653589793F, 0.0F, 0.0F));
            PartDefinition ArmRight = ArmBaseRight.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(56, 88).mirror(true).addBox(-2.0F, 0.0F, -4.5F, 4.0F, 7.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 9.5F, 2.5F, -0.04555309164612875F, 0.0F, 0.0F));
            PartDefinition ForearmRight = ArmRight.addOrReplaceChild("ForearmRight", CubeListBuilder.create().texOffs(57, 99).mirror(true).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 7.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 6.6F, -4.5F, -0.04555309164612875F, 0.0F, 0.0F));
            PartDefinition HandRight = ForearmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(43, 109).mirror(true).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 3.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 5.7F, 0.5F, 0.03909537541112055F, 0.0F, 0.0F));

            PartDefinition ArmBaseLeft = Chest.addOrReplaceChild("ArmBaseLeft", CubeListBuilder.create().texOffs(54, 72).addBox(-2.5F, 0.0F, -3.0F, 5.0F, 10.0F, 6.0F), PartPose.offsetAndRotation(3.7F, 1.5F, -0.5F, 0.3141592653589793F, 0.0F, 0.0F));
            PartDefinition ArmLeft = ArmBaseLeft.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(56, 88).addBox(-2.0F, 0.0F, -4.5F, 4.0F, 7.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 9.5F, 2.5F, -0.04555309164612875F, 0.0F, 0.0F));
            PartDefinition ForearmLeft = ArmLeft.addOrReplaceChild("ForearmLeft", CubeListBuilder.create().texOffs(57, 99).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 7.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 6.6F, -4.5F, -0.04555309164612875F, 0.0F, 0.0F));
            PartDefinition HandLeft = ForearmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(43, 109).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 3.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 5.7F, 0.5F, 0.03909537541112055F, 0.0F, 0.0F));

            PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(86, 10).addBox(-3.5F, 0.0F, -10.0F, 7.0F, 8.0F, 13.0F), PartPose.offsetAndRotation(0.0F, -8.0F, -3.5F, -0.1563815016444822F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(98, 72).addBox(-4.0F, -4.0F, -3.5F, 8.0F, 8.0F, 7.0F), PartPose.offsetAndRotation(0.0F, 5.1F, -10.5F, 0.6143559100178094F, 0.0F, 0.0F));
            PartDefinition Horn1Right = Head.addOrReplaceChild("Horn1Right", CubeListBuilder.create().texOffs(87, 70).mirror(true).addBox(-1.0F, -6.0F, 0.0F, 2.0F, 6.0F, 2.0F), PartPose.offsetAndRotation(-1.5F, -4.8F, 0.7F, -0.8426449415575736F, -0.5473352640780661F, -0.19547687289441354F));
            PartDefinition Horn2Right = Horn1Right.addOrReplaceChild("Horn2Right", CubeListBuilder.create().texOffs(87, 70).mirror(true).addBox(-1.0F, -5.0F, 0.0F, 2.0F, 5.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -5.51F, 0.0F, 0.0F, 0.0F, -0.4300491170387584F));
            PartDefinition Horn3Right = Horn2Right.addOrReplaceChild("Horn3Right", CubeListBuilder.create().texOffs(87, 70).mirror(true).addBox(-1.0F, -8.5F, 0.0F, 2.0F, 9.0F, 2.0F), PartPose.offsetAndRotation(-0.2F, -4.3F, -0.01F, 0.0F, 0.0F, 1.0164797856562695F));

            PartDefinition Horn1Left = Head.addOrReplaceChild("Horn1Left", CubeListBuilder.create().texOffs(87, 70).addBox(-1.0F, -6.0F, 0.0F, 2.0F, 6.0F, 2.0F), PartPose.offsetAndRotation(1.5F, -4.8F, 0.7F, -0.8426449415575736F, 0.5473352640780661F, 0.19547687289441354F));
            PartDefinition Horn2Left = Horn1Left.addOrReplaceChild("Horn2Left", CubeListBuilder.create().texOffs(87, 70).addBox(-1.0F, -5.0F, 0.0F, 2.0F, 5.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -5.51F, 0.0F, 0.0F, 0.0F, 0.4300491170387584F));
            PartDefinition Horn3Left = Horn2Left.addOrReplaceChild("Horn3Left", CubeListBuilder.create().texOffs(87, 70).addBox(-1.0F, -8.5F, 0.0F, 2.0F, 9.0F, 2.0F), PartPose.offsetAndRotation(0.2F, -4.3F, -0.01F, 0.0F, 0.0F, -1.0164797856562695F));

            PartDefinition Beard = Head.addOrReplaceChild("Beard", CubeListBuilder.create().texOffs(80, 82).addBox(-1.5F, 0.0F, -3.0F, 3.0F, 3.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 3.9F, -2.1F, -0.11833332694706204F, 0.0F, 0.0F));

            PartDefinition EarLeft = Head.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(117, 89).addBox(-2.0F, -4.5F, 0.0F, 4.0F, 5.0F, 1.0F), PartPose.offsetAndRotation(4.0F, -1.5F, 3.0F, -0.46914448828868976F, -0.1563815016444822F, 1.378111961395756F));

            PartDefinition EarRight = Head.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(117, 89).mirror(true).addBox(-2.0F, -4.5F, 0.0F, 4.0F, 5.0F, 1.0F), PartPose.offsetAndRotation(-4.0F, -1.5F, 3.0F, -0.46914448828868976F, 0.1563815016444822F, -1.378111961395756F));

            PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(90, 89).addBox(-2.5F, 0.0F, -6.5F, 5.0F, 3.0F, 7.0F), PartPose.offsetAndRotation(0.0F, -0.5F, -2.5F, 0.23492131798422702F, 0.0F, 0.0F));
            PartDefinition Jaw = Snout.addOrReplaceChild("Jaw", CubeListBuilder.create().texOffs(108, 100).addBox(-2.0F, 0.0F, -5.0F, 4.0F, 2.0F, 6.0F), PartPose.offsetAndRotation(0.0F, 2.4F, -1.0F, -0.11606439692209859F, 0.0F, 0.0F));

            PartDefinition TopSnout = Snout.addOrReplaceChild("TopSnout", CubeListBuilder.create().texOffs(80, 101).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 2.0F, 8.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -6.4F, 0.3513347637790725F, 0.0F, 0.0F));

            PartDefinition Forehead = Head.addOrReplaceChild("Forehead", CubeListBuilder.create().texOffs(55, 63).addBox(-3.5F, 0.0F, 0.0F, 7.0F, 3.0F, 5.0F), PartPose.offsetAndRotation(0.0F, -4.5F, -2.5F, 0.20176006885423747F, 0.0F, 0.0F));

            PartDefinition NeckLower = Neck.addOrReplaceChild("NeckLower", CubeListBuilder.create().texOffs(86, 33).addBox(-2.5F, -0.5F, -7.0F, 5.0F, 4.0F, 13.0F), PartPose.offsetAndRotation(0.0F, 7.7F, -1.3F, -0.3136356545991561F, 0.0F, 0.0F));
            PartDefinition NeckTuft1 = NeckLower.addOrReplaceChild("NeckTuft1", CubeListBuilder.create().texOffs(80, 52).addBox(-1.5F, 2.5F, -1.0F, 3.0F, 5.0F, 8.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -3.3F, -0.07976154981219709F, 0.0F, 0.0F));
            PartDefinition NeckTuft2 = NeckTuft1.addOrReplaceChild("NeckTuft2", CubeListBuilder.create().texOffs(102, 52).addBox(-2.01F, -6.0F, -1.0F, 4.0F, 7.0F, 7.0F), PartPose.offsetAndRotation(0.0F, 8.9F, 7.7F, 0.3504621124688808F, 0.0F, 0.0F));

            PartDefinition Body = Chest.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 27).addBox(-6.5F, -1.0F, 0.0F, 13.0F, 16.0F, 14.0F), PartPose.offsetAndRotation(0.0F, -6.1F, 2.5F, 0.23561944901923448F, 0.0F, 0.0F));
            PartDefinition Hips = Body.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 0).addBox(-5.5F, -0.5F, 0.0F, 11.0F, 16.0F, 11.0F), PartPose.offsetAndRotation(0.0F, -0.5F, 13.9F, -0.37873646099857494F, 0.0F, 0.0F));
            PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(76, 25).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 7.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 11.0F, 0.3968878679087689F, 0.0F, 0.0F));
            PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(76, 35).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 7.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 6.9F, -1.0F, -0.0911061832922575F, 0.0F, 0.0F));
            PartDefinition TailTuft = Tail2.addOrReplaceChild("TailTuft", CubeListBuilder.create().texOffs(73, 50).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, 0.02356194531804237F, 0.0F, 0.0F));

            PartDefinition ThighRight = Hips.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(44, 0).mirror(true).addBox(-3.0F, 0.0F, -5.0F, 6.0F, 13.0F, 9.0F), PartPose.offsetAndRotation(-3.6F, 2.5F, 7.0F, 0.17453292519943295F, 0.0F, 0.0F));
            PartDefinition UpperLegRight = ThighRight.addOrReplaceChild("UpperLegRight", CubeListBuilder.create().texOffs(76, 0).mirror(true).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 6.0F, 5.0F), PartPose.offsetAndRotation(0.3F, 13.0F, -3.0F, 0.3490658503988659F, 0.0F, 0.0F));
            PartDefinition LowerLegRight = UpperLegRight.addOrReplaceChild("LowerLegRight", CubeListBuilder.create().texOffs(79, 11).mirror(true).addBox(-1.5F, 0.0F, -4.0F, 3.0F, 8.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 6.0F, 4.5F, -0.17104227002439565F, 0.0F, 0.0F));
            PartDefinition FootRight = LowerLegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(43, 109).mirror(true).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 3.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 7.0F, -2.9F, 0.03909537541112055F, 0.0F, 0.0F));

            PartDefinition ThighLeft = Hips.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(44, 0).addBox(-3.0F, 0.0F, -5.0F, 6.0F, 13.0F, 9.0F), PartPose.offsetAndRotation(3.6F, 2.5F, 7.0F, 0.17453292519943295F, 0.0F, 0.0F));
            PartDefinition UpperLegLeft = ThighLeft.addOrReplaceChild("UpperLegLeft", CubeListBuilder.create().texOffs(76, 0).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 6.0F, 5.0F), PartPose.offsetAndRotation(0.3F, 13.0F, -3.0F, 0.3490658503988659F, 0.0F, 0.0F));
            PartDefinition LowerLegLeft = UpperLegLeft.addOrReplaceChild("LowerLegLeft", CubeListBuilder.create().texOffs(79, 11).addBox(-1.5F, 0.0F, -4.0F, 3.0F, 8.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 6.0F, 4.5F, -0.17104227002439565F, 0.0F, 0.0F));
            PartDefinition FootLeft = LowerLegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(43, 109).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 3.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 7.0F, -2.9F, 0.03909537541112055F, 0.0F, 0.0F));

            PartDefinition BackFur1 = Chest.addOrReplaceChild("BackFur1", CubeListBuilder.create().texOffs(0, 87).addBox(-1.5F, -2.0F, -4.0F, 3.0F, 3.0F, 10.0F), PartPose.offsetAndRotation(0.0F, -8.5F, 0.5F, 0.15568337060947474F, 0.0F, 0.0F));
            PartDefinition BackFur2 = BackFur1.addOrReplaceChild("BackFur2", CubeListBuilder.create().texOffs(0, 102).addBox(-1.5F, -0.5F, 0.3F, 3.0F, 3.0F, 6.0F, new CubeDeformation(-0.1F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -1.6F, 5.5F, -0.4300491170387584F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 128, 128);
        }

        @Override
        public void setupAnim(KuduEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.614F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.156F;
            this.Head.xRot = Mth.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F + 0.614F;
            this.Tail1.xRot = Mth.cos(limbSwing * speed * 0.1F + 3.1415927F) * degree * 0.8F * limbSwingAmount * 0.5F + 0.396F;
            this.Tail2.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * -1.0F * limbSwingAmount * 0.5F;
            this.Tail1.zRot = Mth.cos(limbSwing * speed * 0.1F + 3.1415927F) * degree * 1.0F * limbSwingAmount * 0.5F;
            this.Tail2.zRot = Mth.cos(1.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F;
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
                this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.3F) * 0.5F - 0.156F;
                this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.614F;
                this.Tail1.xRot = Mth.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -1F) * 0.5F + 0.396F;
                this.Tail2.xRot = Mth.cos(5.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree) * 0.5F - 0.091F;
                this.Tail1.zRot = Mth.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
                this.Tail2.zRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.6F) * 0.5F;

                this.Chest.y = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F - 2.0F;
                this.Chest.xRot = Mth.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.3F) * 0.5F - 0.235F;
                this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.235F;
                this.Hips.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.3F) * 0.5F - 0.378F;

                this.ArmBaseLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4.5F) * 0.5F + 0.314F;
                this.ArmLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3F) * 0.5F - 0.045F;
                this.ForearmLeft.xRot = Mth.cos(2F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4F) * 0.5F - 0.045F;
                this.HandLeft.xRot = Mth.cos(3F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 6F) * 0.5F;
                this.ArmBaseRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4.5F) * 0.5F + 0.314F;
                this.ArmRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3F) * 0.5F - 0.045F;
                this.ForearmRight.xRot = Mth.cos(3F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4F) * 0.5F - 0.045F;
                this.HandRight.xRot = Mth.cos(4F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 6F) * 0.5F;

                this.ThighLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3.3F) * 0.5F + 0.174F;
                this.UpperLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.349F;
                this.LowerLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F - 0.171F;
                this.FootLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F;
                this.ThighRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3.3F) * 0.5F + 0.174F;
                this.UpperLegRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.349F;
                this.LowerLegRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F - 0.171F;
                this.FootRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F;

            } else {
                float speed = 1.7f;
                float degree = 0.6f;
                this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.156F;
                this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.614F;
                this.Tail1.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.396F;
                this.Tail2.xRot = Mth.cos(5.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.7F) * 0.5F - 0.091F;
                this.Tail1.zRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
                this.Tail2.zRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.6F) * 0.5F;

                this.Chest.y = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.7F) * 0.5F - 2.0F;
                this.Chest.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F - 0.235F;
                this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.235F;
                this.Hips.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.378F;

                this.ArmBaseLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.314F;
                this.ArmLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.045F;
                this.ForearmLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F - 0.045F;
                this.HandLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;
                this.ArmBaseRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.314F;
                this.ArmRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.045F;
                this.ForearmRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F - 0.045F;
                this.HandRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;

                this.ThighLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.3F) * 0.5F + 0.174F;
                this.UpperLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.349F;
                this.LowerLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.171F;
                this.FootLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F;
                this.ThighRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.3F) * 0.5F + 0.174F;
                this.UpperLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.349F;
                this.LowerLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.171F;
                this.FootRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F;
            }
        }
    }

    public static class AdultFemale extends KuduModel {
        public ModelPart Body;
        public ModelPart ArmBaseLeft;
        public ModelPart Neck;
        public ModelPart ArmBaseRight;
        public ModelPart Hips;
        public ModelPart ThighLeft;
        public ModelPart Tail1;
        public ModelPart ThighRight;
        public ModelPart UpperLegLeft;
        public ModelPart LowerLegLeft;
        public ModelPart FootLeft;
        public ModelPart Tail2;
        public ModelPart TailTuft;
        public ModelPart UpperLegRight;
        public ModelPart LowerLegRight;
        public ModelPart FootRight;
        public ModelPart ArmLeft;
        public ModelPart ForearmLeft;
        public ModelPart HandLeft;
        public ModelPart Head;
        public ModelPart NeckLower;
        public ModelPart EarLeft;
        public ModelPart Snout;
        public ModelPart EarRight;
        public ModelPart TopSnout;
        public ModelPart Jaw;
        public ModelPart ArmRight;
        public ModelPart ForearmRight;
        public ModelPart HandRight;

        public AdultFemale(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.Neck = this.Chest.getChild("Neck");
            this.NeckLower = this.Neck.getChild("NeckLower");

            this.Head = this.Neck.getChild("Head");
            this.EarRight = this.Head.getChild("EarRight");

            this.EarLeft = this.Head.getChild("EarLeft");

            this.Snout = this.Head.getChild("Snout");
            this.Jaw = this.Snout.getChild("Jaw");

            this.TopSnout = this.Snout.getChild("TopSnout");

            this.ArmBaseLeft = this.Chest.getChild("ArmBaseLeft");
            this.ArmLeft = this.ArmBaseLeft.getChild("ArmLeft");
            this.ForearmLeft = this.ArmLeft.getChild("ForearmLeft");
            this.HandLeft = this.ForearmLeft.getChild("HandLeft");

            this.Body = this.Chest.getChild("Body");
            this.Hips = this.Body.getChild("Hips");
            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.UpperLegLeft = this.ThighLeft.getChild("UpperLegLeft");
            this.LowerLegLeft = this.UpperLegLeft.getChild("LowerLegLeft");
            this.FootLeft = this.LowerLegLeft.getChild("FootLeft");

            this.Tail1 = this.Hips.getChild("Tail1");
            this.Tail2 = this.Tail1.getChild("Tail2");
            this.TailTuft = this.Tail2.getChild("TailTuft");

            this.ThighRight = this.Hips.getChild("ThighRight");
            this.UpperLegRight = this.ThighRight.getChild("UpperLegRight");
            this.LowerLegRight = this.UpperLegRight.getChild("LowerLegRight");
            this.FootRight = this.LowerLegRight.getChild("FootRight");

            this.ArmBaseRight = this.Chest.getChild("ArmBaseRight");
            this.ArmRight = this.ArmBaseRight.getChild("ArmRight");
            this.ForearmRight = this.ArmRight.getChild("ForearmRight");
            this.HandRight = this.ForearmRight.getChild("HandRight");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Chest = partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 57).addBox(-6.0F, -7.0F, -4.0F, 12.0F, 14.0F, 10.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -6.0F, -0.23527037517935237F, 0.0F, 0.0F));
            PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(86, 10).addBox(-2.5F, 0.0F, -9.0F, 5.0F, 7.0F, 13.0F), PartPose.offsetAndRotation(0.0F, -7.0F, -3.5F, -0.1563815016444822F, 0.0F, 0.0F));
            PartDefinition NeckLower = Neck.addOrReplaceChild("NeckLower", CubeListBuilder.create().texOffs(86, 33).addBox(-2.0F, -1.5F, -8.0F, 4.0F, 4.0F, 13.0F), PartPose.offsetAndRotation(0.0F, 6.7F, -1.3F, -0.15725416959943073F, 0.0F, 0.0F));

            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(98, 72).addBox(-4.0F, -4.0F, -3.5F, 8.0F, 8.0F, 7.0F), PartPose.offsetAndRotation(0.0F, 5.1F, -9.5F, 0.6143559100178094F, 0.0F, 0.0F));
            PartDefinition EarRight = Head.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(117, 89).mirror(true).addBox(-2.0F, -4.5F, 0.0F, 4.0F, 5.0F, 1.0F), PartPose.offsetAndRotation(-4.0F, -1.5F, 3.0F, -0.46914448828868976F, 0.1563815016444822F, -1.378111961395756F));

            PartDefinition EarLeft = Head.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(117, 89).addBox(-2.0F, -4.5F, 0.0F, 4.0F, 5.0F, 1.0F), PartPose.offsetAndRotation(4.0F, -1.5F, 3.0F, -0.46914448828868976F, -0.1563815016444822F, 1.378111961395756F));

            PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(90, 89).addBox(-2.5F, 0.0F, -6.5F, 5.0F, 3.0F, 7.0F), PartPose.offsetAndRotation(0.0F, -0.5F, -2.5F, 0.23492131798422702F, 0.0F, 0.0F));
            PartDefinition Jaw = Snout.addOrReplaceChild("Jaw", CubeListBuilder.create().texOffs(108, 100).addBox(-2.0F, 0.0F, -5.0F, 4.0F, 2.0F, 6.0F), PartPose.offsetAndRotation(0.0F, 2.4F, -1.0F, -0.11606439692209859F, 0.0F, 0.0F));

            PartDefinition TopSnout = Snout.addOrReplaceChild("TopSnout", CubeListBuilder.create().texOffs(80, 101).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 2.0F, 8.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -6.4F, 0.3513347637790725F, 0.0F, 0.0F));

            PartDefinition ArmBaseLeft = Chest.addOrReplaceChild("ArmBaseLeft", CubeListBuilder.create().texOffs(54, 72).addBox(-2.5F, 0.0F, -3.0F, 5.0F, 10.0F, 6.0F), PartPose.offsetAndRotation(3.7F, -0.5F, -0.5F, 0.3141592653589793F, 0.0F, 0.0F));
            PartDefinition ArmLeft = ArmBaseLeft.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(56, 88).addBox(-2.0F, 0.0F, -4.5F, 4.0F, 7.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 9.5F, 2.5F, -0.04555309164612875F, 0.0F, 0.0F));
            PartDefinition ForearmLeft = ArmLeft.addOrReplaceChild("ForearmLeft", CubeListBuilder.create().texOffs(57, 99).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 7.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 6.6F, -4.5F, -0.04555309164612875F, 0.0F, 0.0F));
            PartDefinition HandLeft = ForearmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(43, 109).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 3.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 5.7F, 0.5F, 0.03909537541112055F, 0.0F, 0.0F));

            PartDefinition Body = Chest.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 27).addBox(-6.5F, -1.0F, 0.0F, 13.0F, 15.0F, 14.0F), PartPose.offsetAndRotation(0.0F, -6.5F, 2.5F, 0.23561944901923448F, 0.0F, 0.0F));
            PartDefinition Hips = Body.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 0).addBox(-5.5F, -0.5F, 0.0F, 11.0F, 14.0F, 11.0F), PartPose.offsetAndRotation(0.0F, -0.5F, 13.9F, -0.37873646099857494F, 0.0F, 0.0F));
            PartDefinition ThighLeft = Hips.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(44, 0).addBox(-3.0F, 0.0F, -5.0F, 6.0F, 12.0F, 9.0F), PartPose.offsetAndRotation(3.6F, 2.0F, 7.0F, 0.17453292519943295F, 0.0F, 0.0F));
            PartDefinition UpperLegLeft = ThighLeft.addOrReplaceChild("UpperLegLeft", CubeListBuilder.create().texOffs(76, 0).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 6.0F, 5.0F), PartPose.offsetAndRotation(0.3F, 12.0F, -3.0F, 0.3490658503988659F, 0.0F, 0.0F));
            PartDefinition LowerLegLeft = UpperLegLeft.addOrReplaceChild("LowerLegLeft", CubeListBuilder.create().texOffs(79, 11).addBox(-1.5F, 0.0F, -4.0F, 3.0F, 8.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 6.0F, 4.5F, -0.17104227002439565F, 0.0F, 0.0F));
            PartDefinition FootLeft = LowerLegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(43, 109).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 3.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 7.0F, -2.9F, 0.03909537541112055F, 0.0F, 0.0F));

            PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(76, 25).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 7.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 11.0F, 0.3968878679087689F, 0.0F, 0.0F));
            PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(76, 35).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 7.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 6.9F, -1.0F, -0.0911061832922575F, 0.0F, 0.0F));
            PartDefinition TailTuft = Tail2.addOrReplaceChild("TailTuft", CubeListBuilder.create().texOffs(73, 50).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, 0.02356194531804237F, 0.0F, 0.0F));

            PartDefinition ThighRight = Hips.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(44, 0).mirror(true).addBox(-3.0F, 0.0F, -5.0F, 6.0F, 12.0F, 9.0F), PartPose.offsetAndRotation(-3.6F, 2.0F, 7.0F, 0.17453292519943295F, 0.0F, 0.0F));
            PartDefinition UpperLegRight = ThighRight.addOrReplaceChild("UpperLegRight", CubeListBuilder.create().texOffs(76, 0).mirror(true).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 6.0F, 5.0F), PartPose.offsetAndRotation(0.3F, 12.0F, -3.0F, 0.3490658503988659F, 0.0F, 0.0F));
            PartDefinition LowerLegRight = UpperLegRight.addOrReplaceChild("LowerLegRight", CubeListBuilder.create().texOffs(79, 11).mirror(true).addBox(-1.5F, 0.0F, -4.0F, 3.0F, 8.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 6.0F, 4.5F, -0.17104227002439565F, 0.0F, 0.0F));
            PartDefinition FootRight = LowerLegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(43, 109).mirror(true).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 3.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 7.0F, -2.9F, 0.03909537541112055F, 0.0F, 0.0F));

            PartDefinition ArmBaseRight = Chest.addOrReplaceChild("ArmBaseRight", CubeListBuilder.create().texOffs(54, 72).mirror(true).addBox(-2.5F, 0.0F, -3.0F, 5.0F, 10.0F, 6.0F), PartPose.offsetAndRotation(-3.7F, -0.5F, -0.5F, 0.3141592653589793F, 0.0F, 0.0F));
            PartDefinition ArmRight = ArmBaseRight.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(56, 88).mirror(true).addBox(-2.0F, 0.0F, -4.5F, 4.0F, 7.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 9.5F, 2.5F, -0.04555309164612875F, 0.0F, 0.0F));
            PartDefinition ForearmRight = ArmRight.addOrReplaceChild("ForearmRight", CubeListBuilder.create().texOffs(57, 99).mirror(true).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 7.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 6.6F, -4.5F, -0.04555309164612875F, 0.0F, 0.0F));
            PartDefinition HandRight = ForearmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(43, 109).mirror(true).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 3.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 5.7F, 0.5F, 0.03909537541112055F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 128, 128);
        }

        @Override
        public void setupAnim(KuduEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.614F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.156F;
            this.Head.xRot = Mth.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F + 0.614F;
            this.Tail1.xRot = Mth.cos(limbSwing * speed * 0.1F + 3.1415927F) * degree * 0.8F * limbSwingAmount * 0.5F + 0.396F;
            this.Tail2.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * -1.0F * limbSwingAmount * 0.5F;
            this.Tail1.zRot = Mth.cos(limbSwing * speed * 0.1F + 3.1415927F) * degree * 1.0F * limbSwingAmount * 0.5F;
            this.Tail2.zRot = Mth.cos(1.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F;
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
                this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.3F) * 0.5F - 0.156F;
                this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.614F;
                this.Tail1.xRot = Mth.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -1F) * 0.5F + 0.396F;
                this.Tail2.xRot = Mth.cos(5.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree) * 0.5F - 0.091F;
                this.Tail1.zRot = Mth.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
                this.Tail2.zRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.6F) * 0.5F;

                this.Chest.y = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F;
                this.Chest.xRot = Mth.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.3F) * 0.5F - 0.235F;
                this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.235F;
                this.Hips.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.3F) * 0.5F - 0.378F;

                this.ArmBaseLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4.5F) * 0.5F + 0.314F;
                this.ArmLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3F) * 0.5F - 0.045F;
                this.ForearmLeft.xRot = Mth.cos(2F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4F) * 0.5F - 0.045F;
                this.HandLeft.xRot = Mth.cos(3F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 6F) * 0.5F;
                this.ArmBaseRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4.5F) * 0.5F + 0.314F;
                this.ArmRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3F) * 0.5F - 0.045F;
                this.ForearmRight.xRot = Mth.cos(3F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4F) * 0.5F - 0.045F;
                this.HandRight.xRot = Mth.cos(4F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 6F) * 0.5F;

                this.ThighLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3.3F) * 0.5F + 0.174F;
                this.UpperLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.349F;
                this.LowerLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F - 0.171F;
                this.FootLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F;
                this.ThighRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3.3F) * 0.5F + 0.174F;
                this.UpperLegRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.349F;
                this.LowerLegRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F - 0.171F;
                this.FootRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F;

            } else {
                float speed = 1.7f;
                float degree = 0.6f;
                this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.156F;
                this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.614F;
                this.Tail1.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.396F;
                this.Tail2.xRot = Mth.cos(5.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.7F) * 0.5F - 0.091F;
                this.Tail1.zRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
                this.Tail2.zRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.6F) * 0.5F;

                this.Chest.y = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.7F) * 0.5F;
                this.Chest.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F - 0.235F;
                this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.235F;
                this.Hips.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.378F;

                this.ArmBaseLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.314F;
                this.ArmLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.045F;
                this.ForearmLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F - 0.045F;
                this.HandLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;
                this.ArmBaseRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.314F;
                this.ArmRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.045F;
                this.ForearmRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F - 0.045F;
                this.HandRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;

                this.ThighLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.3F) * 0.5F + 0.174F;
                this.UpperLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.349F;
                this.LowerLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.171F;
                this.FootLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F;
                this.ThighRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.3F) * 0.5F + 0.174F;
                this.UpperLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.349F;
                this.LowerLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.171F;
                this.FootRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F;
            }
        }
    }

    public static class Child extends KuduModel {
        public ModelPart Body;
        public ModelPart ArmBaseLeft;
        public ModelPart Neck;
        public ModelPart ArmBaseRight;
        public ModelPart Hips;
        public ModelPart Tail;
        public ModelPart ThighLeft;
        public ModelPart ThighRight;
        public ModelPart UpperLegLeft;
        public ModelPart LowerLegLeft;
        public ModelPart FootLeft;
        public ModelPart UpperLegRight;
        public ModelPart LowerLegRight;
        public ModelPart FootRight;
        public ModelPart UpperArmLeft;
        public ModelPart ArmLeft;
        public ModelPart HandLeft;
        public ModelPart Head;
        public ModelPart EarLeft;
        public ModelPart Snout;
        public ModelPart Forehead;
        public ModelPart EarRight;
        public ModelPart TopSnout;
        public ModelPart Mouth;
        public ModelPart UpperArmRight;
        public ModelPart ArmRight;
        public ModelPart HandRight;

        public Child(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.Body = this.Chest.getChild("Body");
            this.Hips = this.Body.getChild("Hips");
            this.ThighRight = this.Hips.getChild("ThighRight");
            this.UpperLegRight = this.ThighRight.getChild("UpperLegRight");
            this.LowerLegRight = this.UpperLegRight.getChild("LowerLegRight");
            this.FootRight = this.LowerLegRight.getChild("FootRight");

            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.UpperLegLeft = this.ThighLeft.getChild("UpperLegLeft");
            this.LowerLegLeft = this.UpperLegLeft.getChild("LowerLegLeft");
            this.FootLeft = this.LowerLegLeft.getChild("FootLeft");

            this.Tail = this.Hips.getChild("Tail");

            this.ArmBaseLeft = this.Chest.getChild("ArmBaseLeft");
            this.UpperArmLeft = this.ArmBaseLeft.getChild("UpperArmLeft");
            this.ArmLeft = this.UpperArmLeft.getChild("ArmLeft");
            this.HandLeft = this.ArmLeft.getChild("HandLeft");

            this.Neck = this.Chest.getChild("Neck");
            this.Head = this.Neck.getChild("Head");
            this.Forehead = this.Head.getChild("Forehead");

            this.EarRight = this.Head.getChild("EarRight");

            this.Snout = this.Head.getChild("Snout");
            this.Mouth = this.Snout.getChild("Mouth");

            this.TopSnout = this.Snout.getChild("TopSnout");

            this.EarLeft = this.Head.getChild("EarLeft");

            this.ArmBaseRight = this.Chest.getChild("ArmBaseRight");
            this.UpperArmRight = this.ArmBaseRight.getChild("UpperArmRight");
            this.ArmRight = this.UpperArmRight.getChild("ArmRight");
            this.HandRight = this.ArmRight.getChild("HandRight");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Chest = partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(46, 0).addBox(-2.5F, -3.0F, -2.0F, 5.0F, 6.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 12.8F, -2.5F, -0.1563815016444822F, 0.0F, 0.0F));
            PartDefinition Body = Chest.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(40, 20).addBox(-3.0F, 0.0F, 0.0F, 6.0F, 6.0F, 6.0F), PartPose.offsetAndRotation(0.0F, -3.0F, 1.0F, 0.1563815016444822F, 0.0F, 0.0F));
            PartDefinition Hips = Body.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -0.5F, 0.0F, 5.0F, 5.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 0.5F, 5.5F, -0.3127630032889644F, 0.0F, 0.0F));
            PartDefinition ThighRight = Hips.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(0, 16).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 5.0F, 4.0F), PartPose.offsetAndRotation(-1.6F, 0.7F, 1.5F, 0.26040312572913454F, 0.0F, 0.0F));
            PartDefinition UpperLegRight = ThighRight.addOrReplaceChild("UpperLegRight", CubeListBuilder.create().texOffs(0, 25).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.05F, 5.0F, -1.2F, 0.6632251157578453F, 0.0F, 0.0F));
            PartDefinition LowerLegRight = UpperLegRight.addOrReplaceChild("LowerLegRight", CubeListBuilder.create().texOffs(10, 25).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 5.0F, 2.0F), PartPose.offsetAndRotation(0.05F, 3.0F, 1.7F, -0.767944870877505F, 0.0F, 0.0F));
            PartDefinition FootRight = LowerLegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(20, 19).addBox(-1.0F, 0.0F, -1.7F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.1F, 4.5F, -0.7F, 0.13962634015954636F, 0.0F, 0.0F));

            PartDefinition ThighLeft = Hips.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(0, 16).mirror(true).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 5.0F, 4.0F), PartPose.offsetAndRotation(1.6F, 0.7F, 1.5F, 0.26040312572913454F, 0.0F, 0.0F));
            PartDefinition UpperLegLeft = ThighLeft.addOrReplaceChild("UpperLegLeft", CubeListBuilder.create().texOffs(0, 25).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-0.05F, 5.0F, -1.2F, 0.6632251157578453F, 0.0F, 0.0F));
            PartDefinition LowerLegLeft = UpperLegLeft.addOrReplaceChild("LowerLegLeft", CubeListBuilder.create().texOffs(10, 25).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 5.0F, 2.0F), PartPose.offsetAndRotation(-0.05F, 3.0F, 1.7F, -0.767944870877505F, 0.0F, 0.0F));
            PartDefinition FootLeft = LowerLegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(20, 19).mirror(true).addBox(-1.0F, 0.0F, -1.7F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-0.1F, 4.5F, -0.7F, 0.13962634015954636F, 0.0F, 0.0F));

            PartDefinition Tail = Hips.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(17, 0).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 3.5F, 0.5726425515477893F, 0.0F, 0.0F));

            PartDefinition ArmBaseLeft = Chest.addOrReplaceChild("ArmBaseLeft", CubeListBuilder.create().texOffs(35, 12).mirror(true).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(1.6F, 0.5F, -0.5F, 0.23177972000431504F, 0.0F, 0.0F));
            PartDefinition UpperArmLeft = ArmBaseLeft.addOrReplaceChild("UpperArmLeft", CubeListBuilder.create().texOffs(36, 17).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.1F, 2.8F, 1.1F, -0.08726646259971647F, 0.0F, 0.0F));
            PartDefinition ArmLeft = UpperArmLeft.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(28, 17).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 2.0F), PartPose.offset(-0.05F, 3.0F, -2.0F));
            PartDefinition HandLeft = ArmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(20, 19).mirror(true).addBox(-1.0F, 0.0F, -0.7F, 2.0F, 2.0F, 2.0F), PartPose.offset(-0.1F, 3.5F, 0.3F));

            PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(33, 0).addBox(-1.5F, -4.0F, -2.5F, 3.0F, 8.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -2.5F, -2.0F, 0.7150614158473655F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(19, 9).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -3.0F, -2.0F, -0.4354596616883907F, 0.0F, 0.0F));
            PartDefinition Forehead = Head.addOrReplaceChild("Forehead", CubeListBuilder.create().texOffs(6, 10).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -2.1F, -1.5F, 0.19547687289441354F, 0.0F, 0.0F));

            PartDefinition EarRight = Head.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(26, 28).mirror(true).addBox(-1.0F, -2.0F, -0.5F, 2.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(-2.0F, -0.5F, 1.0F, -0.46914448828868976F, 0.4488986716287166F, -1.2041026136666326F));

            PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(24, 5).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, 0.13962634015954636F, 0.0F, 0.0F));
            PartDefinition Mouth = Snout.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(0, 13).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 1.0F, 0.1F, -0.2410299770241099F, 0.0F, 0.0F));

            PartDefinition TopSnout = Snout.addOrReplaceChild("TopSnout", CubeListBuilder.create().texOffs(24, 1).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -0.5F, 0.0F, 0.2534218153790599F, 0.0F, 0.0F));

            PartDefinition EarLeft = Head.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(26, 28).addBox(-1.0F, -2.0F, -0.5F, 2.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(2.0F, -0.5F, 1.0F, -0.46914448828868976F, -0.4488986716287166F, 1.2041026136666326F));

            PartDefinition ArmBaseRight = Chest.addOrReplaceChild("ArmBaseRight", CubeListBuilder.create().texOffs(35, 12).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-1.6F, 0.5F, -0.5F, 0.23177972000431504F, 0.0F, 0.0F));
            PartDefinition UpperArmRight = ArmBaseRight.addOrReplaceChild("UpperArmRight", CubeListBuilder.create().texOffs(36, 17).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-0.1F, 2.8F, 1.1F, -0.08726646259971647F, 0.0F, 0.0F));
            PartDefinition ArmRight = UpperArmRight.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(28, 17).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 2.0F), PartPose.offset(0.05F, 3.0F, -2.0F));
            PartDefinition HandRight = ArmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(20, 19).addBox(-1.0F, 0.0F, -0.7F, 2.0F, 2.0F, 2.0F), PartPose.offset(0.1F, 3.5F, 0.3F));

            return LayerDefinition.create(meshDefinition, 64, 32);
        }

        @Override
        public void setupAnim(KuduEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) - 0.435F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 0.715F;
            this.Head.xRot = Mth.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F - 0.435F;

            this.Tail.xRot = Mth.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.572F;
            this.Tail.zRot = Mth.cos(1.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.2f;
            float degree = 0.8f;
            this.Neck.xRot = Mth.cos(1.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.15F) * 0.5F + 0.715F;
            this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F - 0.435F;
            this.Chest.y = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 12.8F;
            this.Chest.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F - 0.156F;
            this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.156F;
            this.ArmBaseLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -0.9F) * 0.5F + 0.231F;
            this.ArmLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F + 0.0F;
            this.UpperArmLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.087F;
            this.HandLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F + 0.0F;
            this.ArmBaseRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.9F) * 0.5F + 0.231F;
            this.ArmRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F + 0.0F;
            this.UpperArmRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.087F;
            this.HandRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F + 0.0F;
            this.ThighLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.3F) * 0.5F + 0.26F;
            this.UpperLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.663F;
            this.LowerLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.767F;
            this.FootLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F;
            this.ThighRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.3F) * 0.5F + 0.26F;
            this.UpperLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.663F;
            this.LowerLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.767F;
            this.FootRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F;

        }
    }
}
