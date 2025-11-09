package com.github.artyarticus.ecoregions.client.model;

import com.github.artyarticus.ecoregions.entity.RedRiverHogEntity;
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

public abstract class RedRiverHogModel extends ZawaBaseModel<RedRiverHogEntity> {
    public ModelPart Chest;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Chest);
        }

        return this.parts;
    }

    public static class Adult extends RedRiverHogModel {

        public ModelPart Body;
        public ModelPart ArmBaseLeft;
        public ModelPart ArmBaseRight;
        public ModelPart Neck;
        public ModelPart Hips;
        public ModelPart ThighLeft;
        public ModelPart ThighRight;
        public ModelPart Tail1;
        public ModelPart UpperLegLeft;
        public ModelPart LowerLegLeft;
        public ModelPart FootLeft;
        public ModelPart UpperLegRight;
        public ModelPart LowerLegRight;
        public ModelPart FootRight;
        public ModelPart Tail2;
        public ModelPart Tail3;
        public ModelPart UpperArmLeft;
        public ModelPart LowerArmLeft;
        public ModelPart HandLeft;
        public ModelPart UpperArmRight;
        public ModelPart LowerArmRight;
        public ModelPart HandRight;
        public ModelPart Head;
        public ModelPart NeckBottom;
        public ModelPart Forehead;
        public ModelPart EarLeft;
        public ModelPart EarRight;
        public ModelPart Cheek;
        public ModelPart Nose;
        public ModelPart TuftLeft;
        public ModelPart TuftRight;
        public ModelPart BottomJaw;
        public ModelPart TeethLeft;
        public ModelPart TeethRight;

        public Adult(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.ArmBaseLeft = this.Chest.getChild("ArmBaseLeft");
            this.UpperArmLeft = this.ArmBaseLeft.getChild("UpperArmLeft");
            this.LowerArmLeft = this.UpperArmLeft.getChild("LowerArmLeft");
            this.HandLeft = this.LowerArmLeft.getChild("HandLeft");

            this.Neck = this.Chest.getChild("Neck");
            this.NeckBottom = this.Neck.getChild("NeckBottom");

            this.Head = this.Neck.getChild("Head");
            this.Cheek = this.Head.getChild("Cheek");
            this.BottomJaw = this.Cheek.getChild("BottomJaw");

            this.Forehead = this.Head.getChild("Forehead");

            this.Nose = this.Head.getChild("Nose");
            this.TeethRight = this.Nose.getChild("TeethRight");

            this.TeethLeft = this.Nose.getChild("TeethLeft");

            this.EarRight = this.Head.getChild("EarRight");
            this.TuftRight = this.EarRight.getChild("TuftRight");

            this.EarLeft = this.Head.getChild("EarLeft");
            this.TuftLeft = this.EarLeft.getChild("TuftLeft");

            this.Body = this.Chest.getChild("Body");
            this.Hips = this.Body.getChild("Hips");
            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.UpperLegLeft = this.ThighLeft.getChild("UpperLegLeft");
            this.LowerLegLeft = this.UpperLegLeft.getChild("LowerLegLeft");
            this.FootLeft = this.LowerLegLeft.getChild("FootLeft");

            this.ThighRight = this.Hips.getChild("ThighRight");
            this.UpperLegRight = this.ThighRight.getChild("UpperLegRight");
            this.LowerLegRight = this.UpperLegRight.getChild("LowerLegRight");
            this.FootRight = this.LowerLegRight.getChild("FootRight");

            this.Tail1 = this.Hips.getChild("Tail1");
            this.Tail2 = this.Tail1.getChild("Tail2");
            this.Tail3 = this.Tail2.getChild("Tail3");

            this.ArmBaseRight = this.Chest.getChild("ArmBaseRight");
            this.UpperArmRight = this.ArmBaseRight.getChild("UpperArmRight");
            this.LowerArmRight = this.UpperArmRight.getChild("LowerArmRight");
            this.HandRight = this.LowerArmRight.getChild("HandRight");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Chest = partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 0).mirror(true).addBox(-3.5F, -4.0F, -2.0F, 7.0F, 8.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 14.6F, -5.0F, 0.03490658503988659F, 0.0F, 0.0F));
            PartDefinition ArmBaseLeft = Chest.addOrReplaceChild("ArmBaseLeft", CubeListBuilder.create().texOffs(38, 54).mirror(true).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F), PartPose.offsetAndRotation(2.2F, 0.6F, -0.2F, 0.0911061832922575F, 0.0F, 0.0F));
            PartDefinition UpperArmLeft = ArmBaseLeft.addOrReplaceChild("UpperArmLeft", CubeListBuilder.create().texOffs(51, 57).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 3.9F, 1.0F, -0.0911061832922575F, 0.0F, 0.0F));
            PartDefinition LowerArmLeft = UpperArmLeft.addOrReplaceChild("LowerArmLeft", CubeListBuilder.create().texOffs(52, 50).mirror(true).addBox(-1.01F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 2.3F, 0.0F, -0.04363323129985824F, 0.0F, 0.0F));
            PartDefinition HandLeft = LowerArmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(43, 49).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F), PartPose.offset(-0.1F, 2.3F, -1.3F));

            PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(23, 39).mirror(true).addBox(-2.5F, 0.0F, -2.5F, 5.0F, 6.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -3.9F, -1.6F, 0.17453292519943295F, 0.0F, 0.0F));
            PartDefinition NeckBottom = Neck.addOrReplaceChild("NeckBottom", CubeListBuilder.create().texOffs(30, 29).mirror(true).addBox(-1.5F, 0.0F, -4.0F, 3.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 4.0F, 0.2F, -0.40142572795869574F, 0.0F, 0.0F));

            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(44, 23).mirror(true).addBox(-2.0F, -3.5F, -2.0F, 4.0F, 6.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 4.4F, -3.0F, 0.05235987755982988F, 0.0F, 0.0F));
            PartDefinition Cheek = Head.addOrReplaceChild("Cheek", CubeListBuilder.create().texOffs(45, 14).mirror(true).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 4.0F, 4.0F), PartPose.offset(0.0F, -1.3F, -3.8F));
            PartDefinition BottomJaw = Cheek.addOrReplaceChild("BottomJaw", CubeListBuilder.create().texOffs(39, 13).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 2.0F, 1.1F, -0.22689280275926282F, 0.0F, 0.0F));

            PartDefinition Forehead = Head.addOrReplaceChild("Forehead", CubeListBuilder.create().texOffs(26, 51).mirror(true).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -3.4F, -2.0F, 0.3141592653589793F, 0.0F, 0.0F));

            PartDefinition Nose = Head.addOrReplaceChild("Nose", CubeListBuilder.create().texOffs(26, 12).addBox(-1.5F, 0.0F, -6.0F, 3.0F, 3.0F, 6.0F), PartPose.offsetAndRotation(0.0F, -3.4F, -1.8F, 0.5410520681182421F, 0.0F, 0.0F));
            PartDefinition TeethRight = Nose.addOrReplaceChild("TeethRight", CubeListBuilder.create().texOffs(27, 14).mirror(true).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-0.7F, 0.5F, -4.0F, -0.7853981633974483F, -0.2617993877991494F, -0.40142572795869574F));

            PartDefinition TeethLeft = Nose.addOrReplaceChild("TeethLeft", CubeListBuilder.create().texOffs(27, 14).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.7F, 0.5F, -4.0F, -0.7853981633974483F, 0.2617993877991494F, 0.40142572795869574F));

            PartDefinition EarRight = Head.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(34, 22).mirror(true).addBox(-1.5F, -2.0F, 0.0F, 3.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-3.2F, -1.6F, 0.1F, 0.3141592653589793F, 0.4886921905584123F, 0.3490658503988659F));
            PartDefinition TuftRight = EarRight.addOrReplaceChild("TuftRight", CubeListBuilder.create().texOffs(35, 26).mirror(true).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-2.3F, -0.2F, 0.4F, 0.0F, 0.22689280275926282F, -0.45378560551852565F));

            PartDefinition EarLeft = Head.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(34, 22).addBox(-1.5F, -2.0F, 0.0F, 3.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(3.2F, -1.6F, 0.1F, 0.3141592653589793F, -0.4886921905584123F, -0.3490658503988659F));
            PartDefinition TuftLeft = EarLeft.addOrReplaceChild("TuftLeft", CubeListBuilder.create().texOffs(35, 26).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(2.3F, -0.2F, 0.4F, 0.0F, -0.22689280275926282F, 0.45378560551852565F));

            PartDefinition Body = Chest.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 14).mirror(true).addBox(-4.0F, -8.0F, 0.0F, 8.0F, 9.0F, 8.0F), PartPose.offsetAndRotation(0.0F, 3.5F, 1.2F, -0.03490658503988659F, 0.0F, 0.0F));
            PartDefinition Hips = Body.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 34).mirror(true).addBox(-3.0F, 0.0F, 0.0F, 6.0F, 9.0F, 5.0F), PartPose.offsetAndRotation(0.0F, -8.0F, 8.0F, -0.2275909337942703F, 0.0F, 0.0F));
            PartDefinition ThighLeft = Hips.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(0, 49).mirror(true).addBox(-1.5F, 0.0F, -2.5F, 3.0F, 8.0F, 5.0F), PartPose.offset(2.7F, 1.6F, 3.1F));
            PartDefinition UpperLegLeft = ThighLeft.addOrReplaceChild("UpperLegLeft", CubeListBuilder.create().texOffs(18, 57).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(-0.1F, 7.6F, -1.5F, 0.4363323129985824F, 0.0F, 0.0F));
            PartDefinition LowerLegLeft = UpperLegLeft.addOrReplaceChild("LowerLegLeft", CubeListBuilder.create().texOffs(17, 50).mirror(true).addBox(-1.01F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 1.7F, 2.7F, -0.3490658503988659F, 0.0F, 0.0F));
            PartDefinition FootLeft = LowerLegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(29, 60).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-0.1F, 3.2F, -1.2F, 0.13665927909957545F, 0.0F, 0.0F));

            PartDefinition ThighRight = Hips.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(0, 49).mirror(true).addBox(-1.5F, 0.0F, -2.5F, 3.0F, 8.0F, 5.0F), PartPose.offset(-2.7F, 1.6F, 3.1F));
            PartDefinition UpperLegRight = ThighRight.addOrReplaceChild("UpperLegRight", CubeListBuilder.create().texOffs(18, 57).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(-0.1F, 7.6F, -1.5F, 0.4363323129985824F, 0.0F, 0.0F));
            PartDefinition LowerLegRight = UpperLegRight.addOrReplaceChild("LowerLegRight", CubeListBuilder.create().texOffs(17, 50).mirror(true).addBox(-0.99F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 1.7F, 2.7F, -0.3490658503988659F, 0.0F, 0.0F));
            PartDefinition FootRight = LowerLegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(29, 60).mirror(true).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.1F, 3.2F, -1.2F, 0.13665927909957545F, 0.0F, 0.0F));

            PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(52, 44).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.2F, 5.0F, 0.4782202083885436F, 0.0F, 0.0F));
            PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(52, 37).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 5.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, -0.3141592653589793F, 0.0F, 0.0F));
            PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(57, 45).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 3.5F, -0.6F, 0.06981317007977318F, 0.0F, 0.0F));

            PartDefinition ArmBaseRight = Chest.addOrReplaceChild("ArmBaseRight", CubeListBuilder.create().texOffs(38, 54).mirror(true).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F), PartPose.offsetAndRotation(-2.2F, 0.6F, -0.2F, 0.0911061832922575F, 0.0F, 0.0F));
            PartDefinition UpperArmRight = ArmBaseRight.addOrReplaceChild("UpperArmRight", CubeListBuilder.create().texOffs(51, 57).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 3.9F, 1.0F, -0.0911061832922575F, 0.0F, 0.0F));
            PartDefinition LowerArmRight = UpperArmRight.addOrReplaceChild("LowerArmRight", CubeListBuilder.create().texOffs(52, 50).mirror(true).addBox(-0.99F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 2.3F, 0.0F, -0.04363323129985824F, 0.0F, 0.0F));
            PartDefinition HandRight = LowerArmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(43, 49).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F), PartPose.offset(0.1F, 2.3F, -1.3F));

            return LayerDefinition.create(meshDefinition, 64, 64);
        }

        @Override
        public void setupAnim(RedRiverHogEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 0.17F;
            this.Head.xRot = Mth.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F + 0.05F;

            this.Tail1.xRot = Mth.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.48F;
            this.Tail2.xRot = Mth.cos(5.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.6F) * 0.5F - 0.31F;
            this.Tail1.zRot = Mth.cos(1.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
            this.Tail2.zRot = Mth.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.6F) * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (entity.isSprinting()) {
                float speed = 1.0f;
                float degree = 0.5f;


            } else {
                float speed = 1.25f;
                float degree = 0.6f;
                this.Neck.xRot = Mth.cos(1.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 0.17F;
                this.Head.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.05F;

                this.Chest.y = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -1F) * 0.5F + 14.6F;
                this.Chest.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.1F) * 0.5F + 0.03F;
                this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F - 0.03F;
                this.Hips.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.23F;

                this.ArmBaseLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.6F) * 0.5F + 0.09F;
                this.UpperArmLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.09F;
                this.LowerArmLeft.xRot = Mth.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree) * 0.5F - 0.04F;
                this.HandLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;
                this.ArmBaseRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.6F) * 0.5F + 0.09F;
                this.UpperArmRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.09F;
                this.LowerArmRight.xRot = Mth.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1F) * 0.5F - 0.04F;
                this.HandRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;

                this.ThighLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.3F) * 0.5F;
                this.UpperLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.44F;
                this.LowerLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.35F;
                this.FootLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.14F;
                this.ThighRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.3F) * 0.5F;
                this.UpperLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.44F;
                this.LowerLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.35F;
                this.FootRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.14F;
            }
        }
    }

    public static class Child extends RedRiverHogModel {

        public ModelPart Body;
        public ModelPart Neck;
        public ModelPart ArmBaseLeft;
        public ModelPart ArmBaseRight;
        public ModelPart Hips;
        public ModelPart ThighLeft;
        public ModelPart ThighRight;
        public ModelPart Tail;
        public ModelPart UpperLegLeft;
        public ModelPart LowerLegLeft;
        public ModelPart FootLeft;
        public ModelPart UpperLegRight;
        public ModelPart LowerLegRight;
        public ModelPart FootRight;
        public ModelPart Head;
        public ModelPart Snout;
        public ModelPart Mouth;
        public ModelPart EarLeft;
        public ModelPart EarRight;
        public ModelPart ArmLeft;
        public ModelPart ForearmLeft;
        public ModelPart HandLeft;
        public ModelPart ArmRight;
        public ModelPart ForearmRight;
        public ModelPart HandRight;

        public Child(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.Neck = this.Chest.getChild("Neck");
            this.Head = this.Neck.getChild("Head");
            this.Mouth = this.Head.getChild("Mouth");

            this.EarLeft = this.Head.getChild("EarLeft");

            this.Snout = this.Head.getChild("Snout");

            this.EarRight = this.Head.getChild("EarRight");

            this.ArmBaseLeft = this.Chest.getChild("ArmBaseLeft");
            this.ArmLeft = this.ArmBaseLeft.getChild("ArmLeft");
            this.ForearmLeft = this.ArmLeft.getChild("ForearmLeft");
            this.HandLeft = this.ForearmLeft.getChild("HandLeft");

            this.Body = this.Chest.getChild("Body");
            this.Hips = this.Body.getChild("Hips");
            this.ThighRight = this.Hips.getChild("ThighRight");
            this.UpperLegRight = this.ThighRight.getChild("UpperLegRight");
            this.LowerLegRight = this.UpperLegRight.getChild("LowerLegRight");
            this.FootRight = this.LowerLegRight.getChild("FootRight");

            this.Tail = this.Hips.getChild("Tail");

            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.UpperLegLeft = this.ThighLeft.getChild("UpperLegLeft");
            this.LowerLegLeft = this.UpperLegLeft.getChild("LowerLegLeft");
            this.FootLeft = this.LowerLegLeft.getChild("FootLeft");

            this.ArmBaseRight = this.Chest.getChild("ArmBaseRight");
            this.ArmRight = this.ArmBaseRight.getChild("ArmRight");
            this.ForearmRight = this.ArmRight.getChild("ForearmRight");
            this.HandRight = this.ForearmRight.getChild("HandRight");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Chest = partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 12).addBox(-1.5F, -1.5F, -1.0F, 3.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 18.3F, -3.0F, -0.12217304763960307F, 0.0F, 0.0F));
            PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(10, 7).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -0.6F, -1.0F, -0.16580627893946132F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(18, 3).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.7F, -2.0F, 0.40142572795869574F, 0.0F, 0.0F));
            PartDefinition Mouth = Head.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(6, 6).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F), PartPose.offset(0.0F, 0.4F, -0.9F));

            PartDefinition EarLeft = Head.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.2F, -0.5F, 2.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(1.0F, -1.0F, 0.7F, 0.0F, -0.3490658503988659F, 0.5235987755982988F));

            PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(12, 0).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -1.2F, -1.5F, 0.4363323129985824F, 0.0F, 0.0F));

            PartDefinition EarRight = Head.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(0, 0).mirror(true).addBox(-1.0F, -1.2F, -0.5F, 2.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-1.0F, -1.0F, 0.7F, 0.0F, 0.3490658503988659F, -0.5235987755982988F));

            PartDefinition ArmBaseLeft = Chest.addOrReplaceChild("ArmBaseLeft", CubeListBuilder.create().texOffs(18, 23).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(1.4F, 0.4F, 0.0F, 0.22689280275926282F, 0.0F, 0.0F));
            PartDefinition ArmLeft = ArmBaseLeft.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(24, 21).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-0.01F, 2.0F, 0.3F, -0.12217304763960307F, 0.0F, 0.0F));
            PartDefinition ForearmLeft = ArmLeft.addOrReplaceChild("ForearmLeft", CubeListBuilder.create().texOffs(24, 17).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-0.01F, 0.9F, -1.0F, 0.017453292519943295F, 0.0F, 0.0F));
            PartDefinition HandLeft = ForearmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(22, 14).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F), PartPose.offset(-0.01F, 1.5F, 0.3F));

            PartDefinition Body = Chest.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(1, 20).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -1.5F, 0.1F, 0.20943951023931953F, 0.0F, 0.0F));
            PartDefinition Hips = Body.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(13, 16).addBox(-1.5F, 0.3F, 0.0F, 3.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -0.3F, 4.0F, -0.3490658503988659F, 0.0F, 0.0F));
            PartDefinition ThighRight = Hips.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(24, 26).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-1.2F, 1.5F, 1.1F, 0.2617993877991494F, 0.0F, 0.0F));
            PartDefinition UpperLegRight = ThighRight.addOrReplaceChild("UpperLegRight", CubeListBuilder.create().texOffs(30, 23).mirror(true).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-0.3F, 3.0F, -0.3F, 0.6981317007977318F, 0.0F, 0.0F));
            PartDefinition LowerLegRight = UpperLegRight.addOrReplaceChild("LowerLegRight", CubeListBuilder.create().texOffs(29, 19).mirror(true).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.01F, 1.8F, 1.0F, -0.6981317007977318F, 0.0F, 0.0F));
            PartDefinition FootRight = LowerLegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(29, 16).mirror(true).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F), PartPose.offset(0.01F, 1.3F, -0.7F));

            PartDefinition Tail = Hips.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(27, 10).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.7F, 1.5F, 0.4300491170387584F, 0.0F, 0.0F));

            PartDefinition ThighLeft = Hips.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(24, 26).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(1.2F, 1.5F, 1.1F, 0.2617993877991494F, 0.0F, 0.0F));
            PartDefinition UpperLegLeft = ThighLeft.addOrReplaceChild("UpperLegLeft", CubeListBuilder.create().texOffs(30, 23).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.3F, 3.0F, -0.3F, 0.6981317007977318F, 0.0F, 0.0F));
            PartDefinition LowerLegLeft = UpperLegLeft.addOrReplaceChild("LowerLegLeft", CubeListBuilder.create().texOffs(29, 19).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-0.01F, 1.8F, 1.0F, -0.6981317007977318F, 0.0F, 0.0F));
            PartDefinition FootLeft = LowerLegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(29, 16).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F), PartPose.offset(-0.01F, 1.3F, -0.7F));

            PartDefinition ArmBaseRight = Chest.addOrReplaceChild("ArmBaseRight", CubeListBuilder.create().texOffs(18, 23).mirror(true).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-1.4F, 0.4F, 0.0F, 0.22689280275926282F, 0.0F, 0.0F));
            PartDefinition ArmRight = ArmBaseRight.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(24, 21).mirror(true).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.01F, 2.0F, 0.3F, -0.12217304763960307F, 0.0F, 0.0F));
            PartDefinition ForearmRight = ArmRight.addOrReplaceChild("ForearmRight", CubeListBuilder.create().texOffs(24, 17).mirror(true).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.01F, 0.9F, -1.0F, 0.017453292519943295F, 0.0F, 0.0F));
            PartDefinition HandRight = ForearmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(22, 14).mirror(true).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F), PartPose.offset(0.01F, 1.5F, 0.3F));

            return LayerDefinition.create(meshDefinition, 64, 32);
        }

        @Override
        public void setupAnim(RedRiverHogEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.17F;
            this.Head.xRot = Mth.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F + 0.4F;

            this.Tail.xRot = Mth.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.43F;
            this.Tail.zRot = Mth.cos(1.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.2f;
            float degree = 0.8f;
            this.Neck.xRot = Mth.cos(1.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.15F) * 0.5F - 0.17F;
            this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.4F;
            this.Chest.y = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 18.3F;
            this.Chest.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F - 0.12F;
            this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.21F;
            this.ArmBaseLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -0.9F) * 0.5F + 0.23F;
            this.ArmLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.12F;
            this.ForearmLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F + 0.017F;
            this.HandLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;
            this.ArmBaseRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.9F) * 0.5F + 0.23F;
            this.ArmRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.12F;
            this.ForearmRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F + 0.017F;
            this.HandRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;
            this.ThighLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.3F) * 0.5F + 0.26F;
            this.UpperLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.7F;
            this.LowerLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.7F;
            this.FootLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F;
            this.ThighRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.3F) * 0.5F + 0.26F;
            this.UpperLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.7F;
            this.LowerLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.7F;
            this.FootRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F;
        }
    }
}
