package com.github.artyarticus.ecoregions.client.model;

import com.github.artyarticus.ecoregions.entity.TreeKangarooEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class TreeKangarooModel extends ZawaBaseModel<TreeKangarooEntity> {
    public ModelPart Hips;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Hips);
        }

        return this.parts;
    }

    public static class Adult extends TreeKangarooModel {

        public ModelPart Body;
        public ModelPart ThighLeft;
        public ModelPart Tail2;
        public ModelPart ThighRight;
        public ModelPart Chest;
        public ModelPart ArmBaseLeft;
        public ModelPart Neck;
        public ModelPart ArmBaseRight;
        public ModelPart ArmLeft;
        public ModelPart HandLeft;
        public ModelPart Head;
        public ModelPart NeckBottom;
        public ModelPart EarLeft;
        public ModelPart Snout;
        public ModelPart EarRight;
        public ModelPart part13;
        public ModelPart part13_1;
        public ModelPart Mouth;
        public ModelPart Nose;
        public ModelPart ArmRight;
        public ModelPart HandRight;
        public ModelPart LegLeft;
        public ModelPart FootLeft;
        public ModelPart ToesLeft;
        public ModelPart Tail3;
        public ModelPart Tail4;
        public ModelPart Tail5;
        public ModelPart Tail6;
        public ModelPart Snout_1;
        public ModelPart LegRight;
        public ModelPart FootRight;
        public ModelPart ToesRight;

        public Adult(ModelPart root) {
            this.Hips = root.getChild("Hips");
            this.Body = this.Hips.getChild("Body");
            this.Chest = this.Body.getChild("Chest");
            this.ArmBaseRight = this.Chest.getChild("ArmBaseRight");
            this.ArmRight = this.ArmBaseRight.getChild("ArmRight");
            this.HandRight = this.ArmRight.getChild("HandRight");

            this.Neck = this.Chest.getChild("Neck");
            this.NeckBottom = this.Neck.getChild("NeckBottom");

            this.Head = this.Neck.getChild("Head");
            this.part13 = this.Head.getChild("part13");

            this.Snout_1 = this.Head.getChild("Snout_1");

            this.Snout = this.Head.getChild("Snout");
            this.Mouth = this.Snout.getChild("Mouth");

            this.Nose = this.Snout.getChild("Nose");

            this.EarRight = this.Head.getChild("EarRight");

            this.EarLeft = this.Head.getChild("EarLeft");

            this.part13_1 = this.Head.getChild("part13_1");

            this.ArmBaseLeft = this.Chest.getChild("ArmBaseLeft");
            this.ArmLeft = this.ArmBaseLeft.getChild("ArmLeft");
            this.HandLeft = this.ArmLeft.getChild("HandLeft");

            this.Tail2 = this.Hips.getChild("Tail2");
            this.Tail3 = this.Tail2.getChild("Tail3");
            this.Tail4 = this.Tail3.getChild("Tail4");
            this.Tail5 = this.Tail4.getChild("Tail5");
            this.Tail6 = this.Tail5.getChild("Tail6");

            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.LegLeft = this.ThighLeft.getChild("LegLeft");
            this.FootLeft = this.LegLeft.getChild("FootLeft");
            this.ToesLeft = this.FootLeft.getChild("ToesLeft");

            this.ThighRight = this.Hips.getChild("ThighRight");
            this.LegRight = this.ThighRight.getChild("LegRight");
            this.FootRight = this.LegRight.getChild("FootRight");
            this.ToesRight = this.FootRight.getChild("ToesRight");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Hips = partDefinition.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 0).addBox(-3.5F, -3.5F, -2.5F, 7.0F, 7.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 17.5F, 2.0F, -0.6373942508178124F, 0.0F, 0.0F));
            PartDefinition Body = Hips.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 12).addBox(-3.0F, 0.0F, 0.0F, 6.0F, 6.0F, 6.0F), PartPose.offsetAndRotation(0.0F, -3.5F, -2.5F, -0.8651597048872669F, 0.0F, 0.0F));
            PartDefinition Chest = Body.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(1, 25).addBox(-2.5F, -1.0F, 0.0F, 5.0F, 4.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 5.5F, 0.4F, -0.23387411310933742F, 0.0F, 0.0F));
            PartDefinition ArmBaseRight = Chest.addOrReplaceChild("ArmBaseRight", CubeListBuilder.create().texOffs(54, 20).mirror(true).addBox(0.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-2.9F, 2.0F, 3.5F, 2.0943951023931953F, -0.13665927909957545F, 0.0F));
            PartDefinition ArmRight = ArmBaseRight.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(56, 26).mirror(true).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(1.2F, 3.0F, 0.8F, -0.591841146688116F, -0.18203784630933073F, -0.18203784630933073F));
            PartDefinition HandRight = ArmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(55, 31).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 2.0F, -2.0F, 0.500909508638178F, 0.0F, 0.0F));

            PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(28, 14).addBox(-1.5F, -1.0F, -2.5F, 3.0F, 3.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 3.5F, 0.9F, 1.4856243072344728F, 0.0F, 0.0F));
            PartDefinition NeckBottom = Neck.addOrReplaceChild("NeckBottom", CubeListBuilder.create().texOffs(43, 4).addBox(-1.0F, -0.5F, -2.5F, 2.0F, 1.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 2.4F, 0.0F, -0.19547687289441354F, 0.0F, 0.0F));

            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(30, 0).addBox(-2.0F, -1.5F, -2.0F, 4.0F, 3.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 1.0F, -2.5F, 0.3909537457888271F, 0.0F, 0.0F));
            PartDefinition part13 = Head.addOrReplaceChild("part13", CubeListBuilder.create().texOffs(52, 8).addBox(-1.5F, 0.0F, -2.0F, 2.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(1.8F, 0.0F, -0.1F, 0.0F, 0.03909537541112055F, 0.1563815016444822F));

            PartDefinition Snout_1 = Head.addOrReplaceChild("Snout_1", CubeListBuilder.create().texOffs(41, 10).mirror(true).addBox(-0.9F, -0.5F, -2.5F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -0.5F, -1.2F, 0.03909537541112055F, 0.0F, 0.0F));

            PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(41, 10).addBox(-1.1F, -0.5F, -2.5F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -0.5F, -1.2F, 0.03909537541112055F, 0.0F, 0.0F));
            PartDefinition Mouth = Snout.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(34, 8).addBox(-0.5F, -0.5F, -2.6F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 1.6F, 0.2F, -0.19530233597447247F, 0.0F, 0.0F));

            PartDefinition Nose = Snout.addOrReplaceChild("Nose", CubeListBuilder.create().texOffs(25, 0).addBox(-1.0F, -0.5F, -0.4F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-0.0F, -0.1F, -2.2F, 0.23457224414434488F, 0.0F, 0.001745329278001762F));

            PartDefinition EarRight = Head.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(45, 0).mirror(true).addBox(-1.0F, -1.5F, 0.0F, 2.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-1.5F, -1.0F, 0.5F, 0.2275909337942703F, 0.27314402127920984F, -0.18203784630933073F));

            PartDefinition EarLeft = Head.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(45, 0).addBox(-1.0F, -1.5F, 0.0F, 2.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(1.5F, -1.0F, 0.5F, 0.2275909337942703F, -0.27314402127920984F, 0.18203784630933073F));

            PartDefinition part13_1 = Head.addOrReplaceChild("part13_1", CubeListBuilder.create().texOffs(52, 8).addBox(-0.5F, 0.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, -0.01F)), PartPose.offsetAndRotation(-1.8F, 0.0F, -0.1F, 0.0F, -0.03909537541112055F, -0.1563815016444822F));

            PartDefinition ArmBaseLeft = Chest.addOrReplaceChild("ArmBaseLeft", CubeListBuilder.create().texOffs(54, 20).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(2.9F, 2.0F, 3.5F, 2.0943951023931953F, 0.13665927909957545F, 0.0F));
            PartDefinition ArmLeft = ArmBaseLeft.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(56, 26).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-1.2F, 3.0F, 0.8F, -0.591841146688116F, 0.18203784630933073F, 0.18203784630933073F));
            PartDefinition HandLeft = ArmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(55, 31).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 2.0F, -2.0F, 0.500909508638178F, 0.0F, 0.0F));

            PartDefinition Tail2 = Hips.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(0, 34).addBox(-2.5F, -3.0F, -1.0F, 5.0F, 5.0F, 5.0F), PartPose.offsetAndRotation(0.0F, -0.2F, 2.0F, -0.28012533162928444F, 0.0F, 0.0F));
            PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(0, 44).addBox(-2.0F, -2.5F, -1.0F, 4.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, 0.3642502295386026F, 0.0F, 0.0F));
            PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(0, 52).addBox(-1.5F, -2.0F, -1.0F, 3.0F, 3.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, 0.3642502295386026F, 0.0F, 0.0F));
            PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(18, 51).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 6.0F), PartPose.offsetAndRotation(0.0F, -0.4F, 4.0F, 0.0911061832922575F, 0.0F, 0.0F));
            PartDefinition Tail6 = Tail5.addOrReplaceChild("Tail6", CubeListBuilder.create().texOffs(18, 43).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 5.0F), PartPose.offset(0.01F, 0.0F, 6.0F));

            PartDefinition ThighLeft = Hips.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(26, 29).addBox(0.0F, -3.0F, -5.0F, 3.0F, 4.0F, 5.0F), PartPose.offsetAndRotation(1.4F, 1.5F, 2.0F, 0.7285004590772052F, 0.0F, 0.0F));
            PartDefinition LegLeft = ThighLeft.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(29, 39).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(1.5F, 1.0F, -4.5F, -0.04555309164612875F, 0.04555309164612875F, 0.0F));
            PartDefinition FootLeft = LegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(40, 40).addBox(-1.5F, 0.0F, -5.0F, 3.0F, 1.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 2.0F, 3.0F, -0.04555309164612875F, -0.0911061832922575F, 0.0F));
            PartDefinition ToesLeft = FootLeft.addOrReplaceChild("ToesLeft", CubeListBuilder.create().texOffs(43, 36).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -5.0F, 0.04555309164612875F, 0.0F, 0.0F));

            PartDefinition ThighRight = Hips.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(26, 29).mirror(true).addBox(-3.0F, -3.0F, -5.0F, 3.0F, 4.0F, 5.0F), PartPose.offsetAndRotation(-1.4F, 1.5F, 2.0F, 0.7285004590772052F, 0.0F, 0.0F));
            PartDefinition LegRight = ThighRight.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(29, 39).mirror(true).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(-1.5F, 1.0F, -4.5F, -0.04555309164612875F, 0.04555309164612875F, 0.0F));
            PartDefinition FootRight = LegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(40, 40).mirror(true).addBox(-1.5F, 0.0F, -5.0F, 3.0F, 1.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 2.0F, 3.0F, -0.04555309164612875F, -0.0911061832922575F, 0.0F));
            PartDefinition ToesRight = FootRight.addOrReplaceChild("ToesRight", CubeListBuilder.create().texOffs(43, 36).mirror(true).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -5.0F, 0.04555309164612875F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 64, 64);
        }

        @Override
        public void setupAnim(TreeKangarooEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = (float) Math.toRadians((double) (-netHeadYaw)) * 0.25F;
            this.Head.yRot = (float) Math.toRadians((double) (-netHeadYaw)) * 0.25F;
        }

        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0F;
            float degree = 1.0F;
            this.Neck.xRot = Mth.cos(limbSwing * speed * 0.1F + 3.1415927F) * degree * 0.1F * limbSwingAmount * 0.5F + 1.485F;
            this.Head.xRot = Mth.cos(1.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * -0.1F * limbSwingAmount * 0.5F + 0.39F;
            this.ArmBaseLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * 0.1F * limbSwingAmount * 0.5F + 2.1F;
            this.ArmBaseRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * 0.1F * limbSwingAmount * 0.5F + 2.1F;
        }

        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.2F;
            float degree = 0.8F;
            if (entity.isSprinting()) {
                speed = 1.9F;
                degree = 0.3F;
                this.Hips.xRot = Mth.cos(3.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 0.4F * limbSwingAmount * 0.5F - 0.637F;
                this.Chest.xRot = Mth.cos(0.5F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 0.3F * limbSwingAmount * 0.5F - 0.233F;
                this.Neck.xRot = Mth.cos(limbSwing * speed * 0.0F + 3.1415927F) * degree * 0.0F * limbSwingAmount * 0.5F + 1.485F;
                this.Head.xRot = Mth.cos(limbSwing * speed * 0.0F + 3.1415927F) * degree * 0.0F * limbSwingAmount * 0.5F + 0.39F;
                this.ThighLeft.xRot = Mth.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * 3.0F * limbSwingAmount * 0.5F + 0.728F;
                this.LegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -0.9F * limbSwingAmount * 0.5F - 0.045F;
                this.FootLeft.xRot = Mth.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * 3.0F * limbSwingAmount * 0.5F - 0.045F;
                this.Hips.y = Mth.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -13.0F * limbSwingAmount * 0.5F + 17.5F;

                this.ThighLeft.y = Mth.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * -0.5F * limbSwingAmount * 0.5F + 1.5F;
                this.ThighLeft.z = Mth.cos(0.5F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 0.5F * limbSwingAmount * 0.5F + 2.0F;
                this.ArmBaseLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 0.8F * limbSwingAmount * 0.5F + 2.094F;
                this.ArmBaseRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 0.8F * limbSwingAmount * 0.5F + 2.094F;
                this.Body.xRot = Mth.cos(3.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 0.5F * limbSwingAmount * 0.5F - 0.865F;
                this.ThighRight.xRot = Mth.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * 3.0F * limbSwingAmount * 0.5F + 0.728F;
                this.LegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -0.9F * limbSwingAmount * 0.5F - 0.045F;
                this.FootRight.xRot = Mth.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * 3.0F * limbSwingAmount * 0.5F - 0.045F;
                this.ThighRight.y = Mth.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * -0.5F * limbSwingAmount * 0.5F + 1.5F;
                this.ThighRight.z = Mth.cos(0.5F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 0.5F * limbSwingAmount * 0.5F + 2.0F;
                this.Tail2.xRot = Mth.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 0.8F * limbSwingAmount * 0.5F - 0.28F;

            } else {
                degree = 0.3F;
                this.Hips.xRot = Mth.cos(3.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 0.4F * limbSwingAmount * 0.5F - 0.637F;
                this.Chest.xRot = Mth.cos(0.5F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 0.3F * limbSwingAmount * 0.5F - 0.233F;
                this.Neck.xRot = Mth.cos(limbSwing * speed * 0.0F + 3.1415927F) * degree * 0.0F * limbSwingAmount * 0.5F + 1.485F;
                this.Head.xRot = Mth.cos(limbSwing * speed * 0.0F + 3.1415927F) * degree * 0.0F * limbSwingAmount * 0.5F + 0.39F;
                this.ThighLeft.xRot = Mth.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * 3.0F * limbSwingAmount * 0.5F + 0.728F;
                this.LegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -0.9F * limbSwingAmount * 0.5F - 0.045F;
                this.FootLeft.xRot = Mth.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * 3.0F * limbSwingAmount * 0.5F - 0.045F;
                this.Hips.y = Mth.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -13.0F * limbSwingAmount * 0.5F + 17.5F;

                this.ThighLeft.y = Mth.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * -0.5F * limbSwingAmount * 0.5F + 1.5F;
                this.ThighLeft.z = Mth.cos(0.5F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 0.5F * limbSwingAmount * 0.5F + 0.1F + 2.0F;
                this.ArmBaseLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 0.8F * limbSwingAmount * 0.5F + 2.094F;
                this.ArmBaseRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 0.8F * limbSwingAmount * 0.5F + 2.094F;
                this.Body.xRot = Mth.cos(3.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 0.5F * limbSwingAmount * 0.5F - 0.865F;
                this.ThighRight.xRot = Mth.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * 3.0F * limbSwingAmount * 0.5F + 0.728F;
                this.LegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -0.9F * limbSwingAmount * 0.5F - 0.045F;
                this.FootRight.xRot = Mth.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * 3.0F * limbSwingAmount * 0.5F - 0.045F;
                this.ThighRight.y = Mth.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * -0.5F * limbSwingAmount * 0.5F + 1.5F;
                this.ThighRight.z = Mth.cos(0.5F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 0.5F * limbSwingAmount * 0.5F + 0.1F + 2.0F;
                this.Tail2.xRot = Mth.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 0.8F * limbSwingAmount * 0.5F - 0.28F;
            }
        }
    }

    public static class Child extends TreeKangarooModel {

        public ModelPart Body;
        public ModelPart ThighLeft;
        public ModelPart Tail1;
        public ModelPart ThighRight;
        public ModelPart ArmBaseLeft;
        public ModelPart Neck;
        public ModelPart ArmBaseLeft_1;
        public ModelPart ArmBaseRight;
        public ModelPart ArmLeft;
        public ModelPart HandLeft;
        public ModelPart Head;
        public ModelPart Snout;
        public ModelPart EarLeft;
        public ModelPart EarRight;
        public ModelPart Mouth;
        public ModelPart ArmLeft_1;
        public ModelPart HandLeft_1;
        public ModelPart ArmRight;
        public ModelPart HandRight;
        public ModelPart LegLeft;
        public ModelPart FootLeft;
        public ModelPart Tail2;
        public ModelPart Tail3;
        public ModelPart Tail4;
        public ModelPart LegRight;
        public ModelPart FootRight;

        public Child(ModelPart root) {
            this.Hips = root.getChild("Hips");
            this.Tail1 = this.Hips.getChild("Tail1");
            this.Tail2 = this.Tail1.getChild("Tail2");
            this.Tail3 = this.Tail2.getChild("Tail3");
            this.Tail4 = this.Tail3.getChild("Tail4");

            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.LegLeft = this.ThighLeft.getChild("LegLeft");
            this.FootLeft = this.LegLeft.getChild("FootLeft");

            this.Body = this.Hips.getChild("Body");
            this.ArmBaseRight = this.Body.getChild("ArmBaseRight");
            this.ArmRight = this.ArmBaseRight.getChild("ArmRight");
            this.HandRight = this.ArmRight.getChild("HandRight");

            this.ArmBaseLeft_1 = this.Body.getChild("ArmBaseLeft_1");
            this.ArmLeft_1 = this.ArmBaseLeft_1.getChild("ArmLeft_1");
            this.HandLeft_1 = this.ArmLeft_1.getChild("HandLeft_1");

            this.ArmBaseLeft = this.Body.getChild("ArmBaseLeft");
            this.ArmLeft = this.ArmBaseLeft.getChild("ArmLeft");
            this.HandLeft = this.ArmLeft.getChild("HandLeft");

            this.Neck = this.Body.getChild("Neck");
            this.Head = this.Neck.getChild("Head");
            this.EarLeft = this.Head.getChild("EarLeft");

            this.Snout = this.Head.getChild("Snout");
            this.Mouth = this.Snout.getChild("Mouth");

            this.EarRight = this.Head.getChild("EarRight");

            this.ThighRight = this.Hips.getChild("ThighRight");
            this.LegRight = this.ThighRight.getChild("LegRight");
            this.FootRight = this.LegRight.getChild("FootRight");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Hips = partDefinition.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -3.0F, -3.0F, 4.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 21.0F, 0.0F, -0.591841146688116F, 0.0F, 0.0F));
            PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(16, 0).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -1.0F, 1.5F, -0.5462880425584197F, 0.0F, 0.0F));
            PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(15, 5).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -0.5F, 2.0F, 0.500909508638178F, 0.0F, 0.0F));
            PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(14, 10).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(0.0F, -0.5F, 2.5F, 0.500909508638178F, 0.0F, 0.0F));
            PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(15, 16).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -0.5F, 3.8F, 0.11728612207217244F, 0.0F, 0.0F));

            PartDefinition ThighLeft = Hips.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(18, 21).addBox(0.0F, -1.5F, -3.0F, 2.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.8F, -1.0F, 0.7F, 0.6373942508178124F, 0.0F, 0.0F));
            PartDefinition LegLeft = ThighLeft.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(20, 27).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offset(1.0F, 1.5F, -3.0F));
            PartDefinition FootLeft = LegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(22, 28).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 2.0F, 0.5F, 0.0F, -0.0911061832922575F, 0.0F));

            PartDefinition Body = Hips.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 8).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -3.0F, -3.0F, -0.8651597048872669F, 0.0F, 0.0F));
            PartDefinition ArmBaseRight = Body.addOrReplaceChild("ArmBaseRight", CubeListBuilder.create().texOffs(8, 15).mirror(true).addBox(0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-2.0F, 3.1F, 1.5F, 1.5934856603340446F, -0.13665927909957545F, 0.0F));
            PartDefinition ArmRight = ArmBaseRight.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(8, 19).mirror(true).addBox(0.0F, -2.0F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.5F, 1.5F, 1.0F, 1.0471975511965976F, -0.0911061832922575F, -0.0911061832922575F));
            PartDefinition HandRight = ArmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(9, 22).mirror(true).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.6F, -2.0F, -2.0F, -0.9105382388075086F, -0.4098033003787853F, -0.0911061832922575F));

            PartDefinition ArmBaseLeft_1 = Body.addOrReplaceChild("ArmBaseLeft_1", CubeListBuilder.create().texOffs(8, 15).addBox(-1.5F, 0.0F, -1.0F, 1.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(2.0F, 3.1F, 1.5F, 1.5934856603340446F, 0.13665927909957545F, 0.0F));
            PartDefinition ArmLeft_1 = ArmBaseLeft_1.addOrReplaceChild("ArmLeft_1", CubeListBuilder.create().texOffs(8, 19).addBox(-1.0F, -2.0F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-0.5F, 1.5F, 1.0F, 1.0471975511965976F, 0.0911061832922575F, 0.0911061832922575F));
            PartDefinition HandLeft_1 = ArmLeft_1.addOrReplaceChild("HandLeft_1", CubeListBuilder.create().texOffs(9, 22).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.6F, -2.0F, -2.0F, -0.9105382388075086F, 0.4098033003787853F, 0.0911061832922575F));

            PartDefinition ArmBaseLeft = Body.addOrReplaceChild("ArmBaseLeft", CubeListBuilder.create().texOffs(8, 15).addBox(-1.5F, 0.0F, -1.0F, 1.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(2.0F, 3.0F, 1.5F, 1.5934856603340446F, 0.13665927909957545F, 0.0F));
            PartDefinition ArmLeft = ArmBaseLeft.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(8, 19).addBox(-1.0F, -2.0F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-0.5F, 1.5F, 1.0F, 1.0471975511965976F, 0.0911061832922575F, 0.0911061832922575F));
            PartDefinition HandLeft = ArmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(9, 22).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.6F, -2.0F, -2.0F, -0.9105382388075086F, 0.4098033003787853F, 0.0911061832922575F));

            PartDefinition Neck = Body.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(12, 26).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 3.6F, 1.5F, 2.309594231122029F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 24).addBox(-1.5F, -2.0F, -1.5F, 3.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(-0.01F, -1.5F, -1.4F, -0.7225663369572632F, 0.0F, 0.0F));
            PartDefinition EarLeft = Head.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(15, 21).addBox(-1.0F, -1.5F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(1.6F, -1.0F, 0.5F, 0.2275909337942703F, -0.27314402127920984F, 0.18203784630933073F));

            PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(0, 15).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -2.0F, -1.0F, 0.3642502295386026F, 0.0F, 0.0F));
            PartDefinition Mouth = Snout.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(-1, 20).addBox(-1.0F, 0.0F, -1.75F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.01F, 1.0F, 0.0F, -0.3186971254089062F, 0.0F, 0.0F));

            PartDefinition EarRight = Head.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(15, 21).mirror(true).addBox(0.0F, -1.5F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-1.6F, -1.0F, 0.5F, 0.2275909337942703F, 0.27314402127920984F, -0.18203784630933073F));

            PartDefinition ThighRight = Hips.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(18, 21).mirror(true).addBox(-2.0F, -1.5F, -3.0F, 2.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(-0.8F, -1.0F, 0.7F, 0.6373942508178124F, 0.0F, 0.0F));
            PartDefinition LegRight = ThighRight.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(20, 27).mirror(true).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offset(-1.0F, 1.5F, -3.0F));
            PartDefinition FootRight = LegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(22, 28).mirror(true).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 2.0F, 0.5F, 0.0F, 0.0911061832922575F, 0.0F));

            return LayerDefinition.create(meshDefinition, 32, 32);
        }

        @Override
        public void setupAnim(TreeKangarooEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = (float) Math.toRadians((double) (-netHeadYaw)) * 0.25F;
            this.Head.yRot = (float) Math.toRadians((double) (-netHeadYaw)) * 0.25F;

        }

        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0F;
            float degree = 1.0F;
            this.Neck.xRot = Mth.cos(limbSwing * speed * 0.1F + 3.1415927F) * degree * -0.3F * limbSwingAmount * 0.5F + 2.31F;
            this.Head.xRot = Mth.cos(1.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * 0.3F * limbSwingAmount * 0.5F - 0.722F;
        }

        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.5F;
            float degree = 0.5F;

            if (this.isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            } else if (entity.isSprinting()) {
                degree = 0.3F;
            }
            this.Hips.xRot = Mth.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.0F * limbSwingAmount * 0.5F - 0.591F;
            this.ThighLeft.xRot = Mth.cos(0.2F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F + 0.637F;
            this.ThighLeft.y = Mth.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * -0.2F * limbSwingAmount * 0.5F + 0.05F - 1.0F;
            this.LegLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.0F * limbSwingAmount * 0.5F;
            this.FootLeft.xRot = Mth.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F;
            this.Hips.y = Mth.cos(2.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -7.0F * limbSwingAmount * 0.5F + 21.0F;
            this.ThighRight.xRot = Mth.cos(0.2F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F + 0.637F;
            this.ThighRight.y = Mth.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * -0.2F * limbSwingAmount * 0.5F + 0.05F - 1.0F;
            this.LegRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.0F * limbSwingAmount * 0.5F;
            this.FootRight.xRot = Mth.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F;
            this.Tail1.xRot = Mth.cos(3.5F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F - 0.546F;
            this.Body.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.0F * limbSwingAmount * 0.5F - 0.865F;
            this.Neck.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F + 2.31F;
            this.Head.xRot = Mth.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.0F * limbSwingAmount * 0.5F - 0.722F;
        }
    }
}

