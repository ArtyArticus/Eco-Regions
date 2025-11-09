package com.github.artyarticus.ecoregions.client.model;

import com.github.artyarticus.ecoregions.entity.BaboonEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class BaboonModel extends ZawaBaseModel<BaboonEntity> {
    public ModelPart Chest;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Chest);
        }

        return this.parts;
    }

    public static class Adult extends BaboonModel {
        public ModelPart Neck;
        public ModelPart Body;
        public ModelPart MaleShoulderRight;
        public ModelPart ArmLeft;
        public ModelPart ArmRight;
        public ModelPart Head;
        public ModelPart Face;
        public ModelPart TuftLeft;
        public ModelPart TuftRight;
        public ModelPart EarLeft;
        public ModelPart EarRight;
        public ModelPart Hair;
        public ModelPart Snout;
        public ModelPart TopSnout;
        public ModelPart Lips;
        public ModelPart Mouth;
        public ModelPart Hips;
        public ModelPart TailBase;
        public ModelPart ThightLeft;
        public ModelPart ThightRight;
        public ModelPart Tail1;
        public ModelPart Tail2;
        public ModelPart Tail3;
        public ModelPart LegLeft;
        public ModelPart FootLeft;
        public ModelPart LegRight;
        public ModelPart FootRight;
        public ModelPart MaleBack;
        public ModelPart MaleShoulderLeft;
        public ModelPart ForearmLeft;
        public ModelPart HandLeft;
        public ModelPart ThumbLeft;
        public ModelPart ForearmRight;
        public ModelPart HandRight;
        public ModelPart ThumbRight;

        public Adult(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.Neck = this.Chest.getChild("Neck");
            this.Head = this.Neck.getChild("Head");
            this.Face = this.Head.getChild("Face");
            this.Hair = this.Face.getChild("Hair");

            this.Snout = this.Face.getChild("Snout");
            this.TopSnout = this.Snout.getChild("TopSnout");

            this.Lips = this.Snout.getChild("Lips");
            this.Mouth = this.Lips.getChild("Mouth");

            this.EarRight = this.Head.getChild("EarRight");

            this.TuftRight = this.Head.getChild("TuftRight");

            this.EarLeft = this.Head.getChild("EarLeft");

            this.TuftLeft = this.Head.getChild("TuftLeft");

            this.ArmLeft = this.Chest.getChild("ArmLeft");
            this.ForearmLeft = this.ArmLeft.getChild("ForearmLeft");
            this.HandLeft = this.ForearmLeft.getChild("HandLeft");
            this.ThumbLeft = this.HandLeft.getChild("ThumbLeft");

            this.MaleShoulderRight = this.Chest.getChild("MaleShoulderRight");
            this.MaleBack = this.MaleShoulderRight.getChild("MaleBack");

            this.MaleShoulderLeft = this.MaleShoulderRight.getChild("MaleShoulderLeft");

            this.Body = this.Chest.getChild("Body");
            this.Hips = this.Body.getChild("Hips");
            this.ThightLeft = this.Hips.getChild("ThightLeft");
            this.LegLeft = this.ThightLeft.getChild("LegLeft");
            this.FootLeft = this.LegLeft.getChild("FootLeft");

            this.ThightRight = this.Hips.getChild("ThightRight");
            this.LegRight = this.ThightRight.getChild("LegRight");
            this.FootRight = this.LegRight.getChild("FootRight");

            this.TailBase = this.Hips.getChild("TailBase");
            this.Tail1 = this.TailBase.getChild("Tail1");
            this.Tail2 = this.Tail1.getChild("Tail2");
            this.Tail3 = this.Tail2.getChild("Tail3");

            this.ArmRight = this.Chest.getChild("ArmRight");
            this.ForearmRight = this.ArmRight.getChild("ForearmRight");
            this.HandRight = this.ForearmRight.getChild("HandRight");
            this.ThumbRight = this.HandRight.getChild("ThumbRight");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Chest = partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(98, 0).addBox(-3.5F, -5.0F, -4.0F, 7.0F, 10.0F, 8.0F), PartPose.offsetAndRotation(0.0F, 10.5F, 0.0F, -0.04555309164612875F, 0.0F, 0.0F));
            PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -1.7F, -3.1F, 4.0F, 7.0F, 7.0F), PartPose.offsetAndRotation(0.0F, -5.0F, -4.0F, -0.591841146688116F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(24, 0).addBox(-3.0F, -3.5F, -3.0F, 6.0F, 7.0F, 6.0F), PartPose.offsetAndRotation(0.0F, 2.0F, -2.0F, 0.7611380974473714F, 0.0F, 0.0F));
            PartDefinition Face = Head.addOrReplaceChild("Face", CubeListBuilder.create().texOffs(49, 5).addBox(-2.5F, -1.0F, -0.5F, 5.0F, 5.0F, 1.0F), PartPose.offset(0.0F, -1.7F, -3.0F));
            PartDefinition Hair = Face.addOrReplaceChild("Hair", CubeListBuilder.create().texOffs(25, 42).addBox(-2.0F, -1.5F, -1.0F, 4.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -0.6F, 0.0F, -0.0911061832922575F, 0.0F, 0.0F));

            PartDefinition Snout = Face.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(22, 18).addBox(-1.5F, 0.0F, -3.6F, 3.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 2.4F, 0.5F, 0.45535640450848164F, 0.0F, 0.0F));
            PartDefinition TopSnout = Snout.addOrReplaceChild("TopSnout", CubeListBuilder.create().texOffs(34, 20).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -0.3F, -4.0F, 0.2275909337942703F, 0.0F, 0.0F));

            PartDefinition Lips = Snout.addOrReplaceChild("Lips", CubeListBuilder.create().texOffs(21, 23).addBox(-1.5F, 0.0F, -3.2F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.1F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 1.8F, -0.6F, -0.27314402127920984F, 0.0F, 0.0F));
            PartDefinition Mouth = Lips.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(23, 28).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.5F, -3.0F, -0.21537363235926135F, 0.0F, 0.0F));

            PartDefinition EarRight = Head.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(0, 0).mirror(true).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-2.0F, 0.0F, 0.0F, 0.1563815016444822F, -0.3909537457888271F, 0.0F));

            PartDefinition TuftRight = Head.addOrReplaceChild("TuftRight", CubeListBuilder.create().texOffs(73, 1).addBox(-3.0F, -3.0F, -2.5F, 5.0F, 9.0F, 5.0F), PartPose.offsetAndRotation(-2.2F, -1.5F, 0.3F, 0.0F, 0.18203784630933073F, 0.0712094321497881F));

            PartDefinition EarLeft = Head.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -2.0F, 0.0F, 1.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(2.0F, 0.0F, 0.0F, 0.1563815016444822F, 0.3909537457888271F, 0.0F));

            PartDefinition TuftLeft = Head.addOrReplaceChild("TuftLeft", CubeListBuilder.create().texOffs(73, 1).mirror(true).addBox(-2.0F, -3.0F, -2.5F, 5.0F, 9.0F, 5.0F), PartPose.offsetAndRotation(2.2F, -1.5F, 0.3F, 0.0F, -0.18203784630933073F, -0.0712094321497881F));

            PartDefinition ArmLeft = Chest.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(0, 55).addBox(-2.0F, 0.0F, -2.0F, 3.0F, 7.0F, 4.0F), PartPose.offsetAndRotation(3.6F, 0.0F, -2.0F, 0.37716566200861895F, 0.0F, 0.0F));
            PartDefinition ForearmLeft = ArmLeft.addOrReplaceChild("ForearmLeft", CubeListBuilder.create().texOffs(0, 67).addBox(-1.5F, 0.0F, -3.0F, 3.0F, 7.0F, 3.0F), PartPose.offsetAndRotation(-0.6F, 6.5F, 1.5F, -0.3186971254089062F, 0.0F, 0.13665927909957545F));
            PartDefinition HandLeft = ForearmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(0, 79).addBox(-1.5F, -1.0F, -5.0F, 3.0F, 2.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 7.0F, -0.5F, 0.0F, 0.0F, -0.13665927909957545F));
            PartDefinition ThumbLeft = HandLeft.addOrReplaceChild("ThumbLeft", CubeListBuilder.create().texOffs(0, 86).addBox(0.0F, 0.0F, -3.0F, 1.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(-1.5F, -0.9F, -0.5F, 0.0F, 0.2275909337942703F, 0.0F));

            PartDefinition MaleShoulderRight = Chest.addOrReplaceChild("MaleShoulderRight", CubeListBuilder.create().texOffs(98, 48).mirror(true).addBox(-6.0F, -1.2F, -2.5F, 7.0F, 13.0F, 8.0F), PartPose.offsetAndRotation(0.0F, -4.8F, -1.7F, -0.01972222046431214F, 0.0F, 0.1563815016444822F));
            PartDefinition MaleBack = MaleShoulderRight.addOrReplaceChild("MaleBack", CubeListBuilder.create().texOffs(90, 69).addBox(-6.0F, 0.0F, -1.5F, 11.0F, 9.0F, 8.0F), PartPose.offsetAndRotation(0.0F, -1.3F, 6.0F, -0.058468528277334356F, 0.0F, -0.1563815016444822F));

            PartDefinition MaleShoulderLeft = MaleShoulderRight.addOrReplaceChild("MaleShoulderLeft", CubeListBuilder.create().texOffs(98, 48).addBox(-1.0F, -1.2F, -2.5F, 7.0F, 13.0F, 8.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3127630032889644F));

            PartDefinition Body = Chest.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(102, 18).addBox(-3.0F, 0.0F, -1.0F, 6.0F, 9.0F, 6.0F), PartPose.offsetAndRotation(0.0F, -5.0F, 4.1F, 0.0911061832922575F, 0.0F, 0.0F));
            PartDefinition Hips = Body.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(101, 33).addBox(-3.5F, 0.0F, 0.0F, 7.0F, 8.0F, 6.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, -0.1429424584146426F, 0.0F, 0.0F));
            PartDefinition ThightLeft = Hips.addOrReplaceChild("ThightLeft", CubeListBuilder.create().texOffs(79, 16).addBox(-2.0F, 0.0F, -4.0F, 4.0F, 9.0F, 6.0F), PartPose.offsetAndRotation(2.1F, 2.0F, 4.3F, -0.03909537541112055F, 0.0F, 0.0F));
            PartDefinition LegLeft = ThightLeft.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(82, 32).addBox(-1.5F, 0.0F, -0.5F, 3.0F, 8.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 8.5F, -3.5F, 0.3642502295386026F, 0.0F, 0.0F));
            PartDefinition FootLeft = LegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(79, 45).addBox(-2.0F, -0.2F, -4.5F, 4.0F, 2.0F, 6.0F), PartPose.offsetAndRotation(0.0F, 7.0F, 1.5F, -0.18203784630933073F, 0.0F, 0.0F));

            PartDefinition ThightRight = Hips.addOrReplaceChild("ThightRight", CubeListBuilder.create().texOffs(79, 16).mirror(true).addBox(-2.0F, 0.0F, -4.0F, 4.0F, 9.0F, 6.0F), PartPose.offsetAndRotation(-2.1F, 2.0F, 4.3F, -0.03909537541112055F, 0.0F, 0.0F));
            PartDefinition LegRight = ThightRight.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(82, 32).mirror(true).addBox(-1.5F, 0.0F, -0.5F, 3.0F, 8.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 8.5F, -3.5F, 0.3642502295386026F, 0.0F, 0.0F));
            PartDefinition FootRight = LegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(79, 45).mirror(true).addBox(-2.0F, -0.2F, -4.5F, 4.0F, 2.0F, 6.0F), PartPose.offsetAndRotation(0.0F, 7.0F, 1.5F, -0.18203784630933073F, 0.0F, 0.0F));

            PartDefinition TailBase = Hips.addOrReplaceChild("TailBase", CubeListBuilder.create().texOffs(0, 18).addBox(-1.5F, -1.8F, -1.5F, 3.0F, 3.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 0.7F, 6.0F, 0.6829473549475088F, 0.0F, 0.0F));
            PartDefinition Tail1 = TailBase.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(0, 26).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 5.0F), PartPose.offsetAndRotation(0.0F, -1.4F, 2.2F, -0.9169960049767872F, 0.0F, 0.0F));
            PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(0, 34).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 5.0F), PartPose.offsetAndRotation(0.01F, -0.15F, 4.65F, -0.8784242444866791F, 0.0F, 0.0F));
            PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(0, 42).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 8.0F), PartPose.offsetAndRotation(0.01F, 0.0F, 4.8F, -0.37716566200861895F, 0.0F, 0.0F));

            PartDefinition ArmRight = Chest.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(0, 55).mirror(true).addBox(-2.0F, 0.0F, -2.0F, 3.0F, 7.0F, 4.0F), PartPose.offsetAndRotation(-2.6F, 0.0F, -2.0F, 0.37716566200861895F, 0.0F, 0.0F));
            PartDefinition ForearmRight = ArmRight.addOrReplaceChild("ForearmRight", CubeListBuilder.create().texOffs(0, 67).mirror(true).addBox(-1.5F, 0.0F, -3.0F, 3.0F, 7.0F, 3.0F), PartPose.offsetAndRotation(-0.4F, 6.5F, 1.5F, -0.3186971254089062F, 0.0F, -0.13665927909957545F));
            PartDefinition HandRight = ForearmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(0, 79).mirror(true).addBox(-1.5F, -1.0F, -5.0F, 3.0F, 2.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 7.0F, -0.5F, 0.0F, 0.0F, 0.13665927909957545F));
            PartDefinition ThumbRight = HandRight.addOrReplaceChild("ThumbRight", CubeListBuilder.create().texOffs(0, 86).mirror(true).addBox(-1.0F, 0.0F, -3.0F, 1.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(1.5F, -0.9F, -0.5F, 0.0F, -0.2275909337942703F, 0.0F));

            return LayerDefinition.create(meshDefinition, 128, 128);
        }

        @Override
        public void setupAnim(BaboonEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
            this.Head.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
        }

        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0F;
            float degree = 1.0F;
            this.Neck.xRot = Mth.cos(6.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * -0.1F * limbSwingAmount * 0.5F - 0.591F;
            this.Head.xRot = Mth.cos(1.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * 0.1F * limbSwingAmount * 0.5F + 0.761F;
        }

        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 3.0F;
            float degree = 1.0F;
            if (this.isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
                speed = 2.0F;
            }

            if (entity.isSprinting() && !this.isSwimming) {
                degree = 0.3F;
                this.ArmLeft.xRot = Mth.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * 6.0F * limbSwingAmount * 0.5F + 0.377F;
                this.ForearmLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F - 0.318F;
                this.HandLeft.xRot = Mth.cos(6.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -4.0F * limbSwingAmount * 0.5F;
                this.ArmRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 6.0F * limbSwingAmount * 0.5F + 0.377F;
                this.ForearmRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F - 0.318F;
                this.HandRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -4.0F * limbSwingAmount * 0.5F;
                this.ThightLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -4.5F * limbSwingAmount * 0.5F - 0.039F;
                this.LegLeft.xRot = Mth.cos(6.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.364F;
                this.FootLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.0F * limbSwingAmount * 0.5F - 0.182F;
                this.ThightRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -4.5F * limbSwingAmount * 0.5F - 0.039F;
                this.LegRight.xRot = Mth.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.364F;
                this.FootRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.0F * limbSwingAmount * 0.5F - 0.182F;
                this.Chest.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.7F * limbSwingAmount * 0.5F - 0.045F;
                this.Body.xRot = Mth.cos(6.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.0F * limbSwingAmount * 0.5F + 0.091F;
                this.Hips.xRot = Mth.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F - 0.142F;
                this.Chest.y = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -7.0F * limbSwingAmount * 0.5F + 10.5F;
                this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 0.8F * limbSwingAmount * 0.5F - 0.591F;
                this.Head.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 0.4F * limbSwingAmount * 0.5F + 0.761F;
                this.Mouth.xRot = Mth.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * -0.5F * limbSwingAmount * 0.5F - 0.215F;
            } else {
                this.ArmLeft.xRot = Mth.cos(limbSwing * speed * 0.2F + 3.1415927F) * degree * 2.5F * limbSwingAmount * 0.5F + 0.377F;
                this.ForearmLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * 1.7F * limbSwingAmount * 0.5F - 0.318F;
                this.HandLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F;
                this.ArmRight.xRot = Mth.cos(limbSwing * speed * 0.2F + 3.1415927F) * degree * -2.5F * limbSwingAmount * 0.5F + 0.377F;
                this.ForearmRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * -1.7F * limbSwingAmount * 0.5F - 0.318F;
                this.HandRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F;
                this.ThightLeft.xRot = Mth.cos(limbSwing * speed * 0.2F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F - 0.039F;
                this.LegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * 1.5F * limbSwingAmount * 0.5F + 0.364F;
                this.FootLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F - 0.182F;
                this.ThightRight.xRot = Mth.cos(limbSwing * speed * 0.2F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F - 0.039F;
                this.LegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F + 0.364F;
                this.FootRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F - 0.182F;
                this.Chest.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F + 3.1415927F) * degree * -0.05F * limbSwingAmount * 0.5F - 0.045F;
                this.Neck.xRot = Mth.cos(6.0F + limbSwing * speed * 0.4F + 3.1415927F) * degree * -0.2F * limbSwingAmount * 0.5F + (this.isSwimming ? 1.0F : -0.591F);
                this.Head.xRot = Mth.cos(1.0F + limbSwing * speed * 0.4F + 3.1415927F) * degree * 0.1F * limbSwingAmount * 0.5F + (this.isSwimming ? -1.6F : +0.761F);
                this.Body.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F + 3.1415927F) * degree * -0.1F * limbSwingAmount * 0.5F + 0.091F;
            }

        }
    }

    public static class Child extends BaboonModel {
        public ModelPart Neck;
        public ModelPart Body;
        public ModelPart ArmLeft;
        public ModelPart ArmRight;
        public ModelPart Head;
        public ModelPart Snout;
        public ModelPart Tuft;
        public ModelPart EarLeft;
        public ModelPart EarRight;
        public ModelPart TopSnout;
        public ModelPart Mouth;
        public ModelPart TailBase;
        public ModelPart ThightLeft;
        public ModelPart ThightRight;
        public ModelPart Tail1;
        public ModelPart Tail2;
        public ModelPart Tail3;
        public ModelPart LegLeft;
        public ModelPart FootLeft;
        public ModelPart LegRight;
        public ModelPart FootRight;
        public ModelPart ForearmLeft;
        public ModelPart HandLeft;
        public ModelPart ForearmRight;
        public ModelPart HandRight;

        public Child(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.ArmRight = this.Chest.getChild("ArmRight");
            this.ForearmRight = this.ArmRight.getChild("ForearmRight");
            this.HandRight = this.ForearmRight.getChild("HandRight");

            this.Neck = this.Chest.getChild("Neck");
            this.Head = this.Neck.getChild("Head");
            this.EarRight = this.Head.getChild("EarRight");

            this.Tuft = this.Head.getChild("Tuft");

            this.Snout = this.Head.getChild("Snout");
            this.TopSnout = this.Snout.getChild("TopSnout");

            this.Mouth = this.Snout.getChild("Mouth");

            this.EarLeft = this.Head.getChild("EarLeft");

            this.ArmLeft = this.Chest.getChild("ArmLeft");
            this.ForearmLeft = this.ArmLeft.getChild("ForearmLeft");
            this.HandLeft = this.ForearmLeft.getChild("HandLeft");

            this.Body = this.Chest.getChild("Body");
            this.ThightLeft = this.Body.getChild("ThightLeft");
            this.LegLeft = this.ThightLeft.getChild("LegLeft");
            this.FootLeft = this.LegLeft.getChild("FootLeft");

            this.ThightRight = this.Body.getChild("ThightRight");
            this.LegRight = this.ThightRight.getChild("LegRight");
            this.FootRight = this.LegRight.getChild("FootRight");

            this.TailBase = this.Body.getChild("TailBase");
            this.Tail1 = this.TailBase.getChild("Tail1");
            this.Tail2 = this.Tail1.getChild("Tail2");
            this.Tail3 = this.Tail2.getChild("Tail3");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Chest = partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(14, 0).addBox(-2.0F, -2.0F, -3.0F, 4.0F, 4.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 17.0F, -1.0F, -0.03909537541112055F, 0.0F, 0.0F));
            PartDefinition ArmRight = Chest.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(11, 0).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-1.5F, 1.3F, -2.0F, 0.37716566200861895F, 0.0F, 0.0F));
            PartDefinition ForearmRight = ArmRight.addOrReplaceChild("ForearmRight", CubeListBuilder.create().texOffs(6, 5).mirror(true).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.1F, 2.7F, 0.5F, -0.3186971254089062F, 0.0F, -0.13665927909957545F));
            PartDefinition HandRight = ForearmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(8, 10).mirror(true).addBox(-1.0F, -0.5F, -2.5F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 3.0F, -0.3F, 0.0F, 0.0F, 0.13665927909957545F));

            PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 18).addBox(-1.5F, -1.0F, -2.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F, 0.2F, 0.2F)), PartPose.offsetAndRotation(0.0F, -1.6F, -2.9F, -0.5082398928281348F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 24).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.01F, 1.2F, -1.6F, 0.7428121536172364F, 0.0F, 0.0F));
            PartDefinition EarRight = Head.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(28, 29).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-1.2F, 0.0F, 0.0F, 0.1563815016444822F, -0.5473352640780661F, -0.15655603856442327F));

            PartDefinition Tuft = Head.addOrReplaceChild("Tuft", CubeListBuilder.create().texOffs(16, 27).addBox(-1.5F, -1.0F, -0.6F, 3.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -1.5F, -1.5F, 0.11728612207217244F, 0.0F, 0.0F));

            PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(12, 24).addBox(-1.0F, 0.0F, -2.8F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -0.7F, 0.37716566200861895F, 0.0F, 0.0F));
            PartDefinition TopSnout = Snout.addOrReplaceChild("TopSnout", CubeListBuilder.create().texOffs(24, 23).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -0.3F, -3.0F, 0.2275909337942703F, 0.0F, 0.0F));

            PartDefinition Mouth = Snout.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(18, 23).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.3F, -2.5F, -0.41067598497849067F, 0.0F, 0.0F));

            PartDefinition EarLeft = Head.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(28, 29).addBox(0.0F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(1.2F, 0.0F, 0.0F, 0.1563815016444822F, 0.5473352640780661F, 0.15655603856442327F));

            PartDefinition ArmLeft = Chest.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(11, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(1.5F, 1.3F, -2.0F, 0.37716566200861895F, 0.0F, 0.0F));
            PartDefinition ForearmLeft = ArmLeft.addOrReplaceChild("ForearmLeft", CubeListBuilder.create().texOffs(6, 5).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-0.1F, 2.7F, 0.5F, -0.3186971254089062F, 0.0F, 0.13665927909957545F));
            PartDefinition HandLeft = ForearmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(8, 10).addBox(-1.0F, -0.5F, -2.5F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 3.0F, -0.3F, 0.0F, 0.0F, -0.13665927909957545F));

            PartDefinition Body = Chest.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(18, 9).addBox(-1.5F, -0.3F, -0.2F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.2F)), PartPose.offsetAndRotation(0.0F, -1.7F, 2.0F, -0.03909537541112055F, 0.0F, 0.0F));
            PartDefinition ThightLeft = Body.addOrReplaceChild("ThightLeft", CubeListBuilder.create().texOffs(0, 11).addBox(-1.0F, 0.2F, -2.0F, 2.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(1.2F, 1.0F, 3.4F, -0.11728612207217244F, 0.0F, 0.0F));
            PartDefinition LegLeft = ThightLeft.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(0, 6).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 4.3F, -1.5F, 0.3642502295386026F, 0.0F, 0.0F));
            PartDefinition FootLeft = LegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(0, 1).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 2.8F, 1.0F, -0.1429424584146426F, 0.0F, 0.0F));

            PartDefinition ThightRight = Body.addOrReplaceChild("ThightRight", CubeListBuilder.create().texOffs(0, 11).mirror(true).addBox(-1.0F, 0.2F, -2.0F, 2.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(-1.2F, 1.0F, 3.4F, -0.11728612207217244F, 0.0F, 0.0F));
            PartDefinition LegRight = ThightRight.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(0, 6).mirror(true).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 4.3F, -1.5F, 0.3642502295386026F, 0.0F, 0.0F));
            PartDefinition FootRight = LegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(0, 1).mirror(true).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 2.8F, 1.0F, -0.1429424584146426F, 0.0F, 0.0F));

            PartDefinition TailBase = Body.addOrReplaceChild("TailBase", CubeListBuilder.create().texOffs(24, 17).addBox(-1.0F, -0.8F, -1.5F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -0.1F, 4.4F, 0.6829473549475088F, 0.0F, 0.0F));
            PartDefinition Tail1 = TailBase.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(18, 17).addBox(-0.5F, -0.5F, 0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, 0.2F)), PartPose.offsetAndRotation(-0.01F, -0.5F, 0.0F, -0.9169960049767872F, 0.0F, 0.0F));
            PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(10, 16).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.3F)), PartPose.offsetAndRotation(0.0F, 0.05F, 2.25F, -0.8784242444866791F, 0.0F, 0.0F));
            PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(12, 20).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-0.01F, 0.0F, 3.0F, -0.37716566200861895F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 32, 32);
        }

        @Override
        public void setupAnim(BaboonEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
            this.Head.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;

        }

        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0F;
            float degree = 1.0F;
            this.Neck.xRot = Mth.cos(6.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * -0.2F * limbSwingAmount * 0.5F - 0.508F;
            this.Head.xRot = Mth.cos(1.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * 0.15F * limbSwingAmount * 0.5F + 0.743F;
        }

        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0F;
            float degree = 1.0F;
            if (entity.isSprinting()) {
                degree = 0.3F;
            }
            this.ArmLeft.xRot = Mth.cos(limbSwing * speed * 0.2F + 3.1415927F) * degree * 2.5F * limbSwingAmount * 0.5F + 0.377F;
            this.ForearmLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * 1.7F * limbSwingAmount * 0.5F - 0.319F;
            this.HandLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F;
            this.ArmRight.xRot = Mth.cos(limbSwing * speed * 0.2F + 3.1415927F) * degree * -2.5F * limbSwingAmount * 0.5F + 0.377F;
            this.ForearmRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * -1.7F * limbSwingAmount * 0.5F - 0.319F;
            this.HandRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F;
            this.ThightLeft.xRot = Mth.cos(limbSwing * speed * 0.2F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F - 0.117F;
            this.LegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * 3.0F * limbSwingAmount * 0.5F + 0.364F;
            this.FootLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F - 0.221F;
            this.ThightRight.xRot = Mth.cos(limbSwing * speed * 0.2F + 3.1415927F) * degree * 3.0F * limbSwingAmount * 0.5F - 0.117F;
            this.LegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.364F;
            this.FootRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F - 0.221F;
            this.Chest.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F + 3.1415927F) * degree * -0.05F * limbSwingAmount * 0.5F - 0.039F;
            this.Neck.xRot = Mth.cos(6.0F + limbSwing * speed * 0.4F + 3.1415927F) * degree * -0.2F * limbSwingAmount * 0.5F - 0.508F;
            this.Head.xRot = Mth.cos(1.0F + limbSwing * speed * 0.4F + 3.1415927F) * degree * 0.1F * limbSwingAmount * 0.5F + 0.742F;
            this.Body.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F + 3.1415927F) * degree * -0.2F * limbSwingAmount * 0.5F + 0.039F;
        }
    }
}