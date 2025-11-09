package com.github.artyarticus.ecoregions.client.model;

import com.github.artyarticus.ecoregions.entity.SpectacledBearEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class SpectacledBearModel extends ZawaBaseModel<SpectacledBearEntity> {
    public ModelPart Body;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Body);
        }

        return this.parts;
    }

    public static class Adult extends SpectacledBearModel {

        public ModelPart Chest;
        public ModelPart Hips;
        public ModelPart Neck;
        public ModelPart ArmBaseLeft;
        public ModelPart ArmBaseRight;
        public ModelPart NeckBase;
        public ModelPart Head;
        public ModelPart Snout;
        public ModelPart EarRight;
        public ModelPart EarLeft;
        public ModelPart Forehead;
        public ModelPart Mouth;
        public ModelPart Nose;
        public ModelPart InwardJointLeft;
        public ModelPart ArmLeft;
        public ModelPart HandLeft;
        public ModelPart InwardJointRight;
        public ModelPart ArmRight;
        public ModelPart HandRight;
        public ModelPart Tail;
        public ModelPart ThighRight;
        public ModelPart ThighLeft;
        public ModelPart UpperLegRight;
        public ModelPart FootRight;
        public ModelPart UpperLegLeft;
        public ModelPart FootRight_1;

        public Adult(ModelPart root) {
            this.Body = root.getChild("Body");
            this.Chest = this.Body.getChild("Chest");
            this.ArmBaseLeft = this.Chest.getChild("ArmBaseLeft");
            this.InwardJointLeft = this.ArmBaseLeft.getChild("InwardJointLeft");
            this.ArmLeft = this.InwardJointLeft.getChild("ArmLeft");
            this.HandLeft = this.ArmLeft.getChild("HandLeft");

            this.ArmBaseRight = this.Chest.getChild("ArmBaseRight");
            this.InwardJointRight = this.ArmBaseRight.getChild("InwardJointRight");
            this.ArmRight = this.InwardJointRight.getChild("ArmRight");
            this.HandRight = this.ArmRight.getChild("HandRight");

            this.Neck = this.Chest.getChild("Neck");
            this.Head = this.Neck.getChild("Head");
            this.Snout = this.Head.getChild("Snout");
            this.Nose = this.Snout.getChild("Nose");

            this.Mouth = this.Snout.getChild("Mouth");

            this.EarLeft = this.Head.getChild("EarLeft");

            this.Forehead = this.Head.getChild("Forehead");

            this.EarRight = this.Head.getChild("EarRight");

            this.NeckBase = this.Neck.getChild("NeckBase");

            this.Hips = this.Body.getChild("Hips");
            this.ThighRight = this.Hips.getChild("ThighRight");
            this.UpperLegRight = this.ThighRight.getChild("UpperLegRight");
            this.FootRight = this.UpperLegRight.getChild("FootRight");

            this.Tail = this.Hips.getChild("Tail");

            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.UpperLegLeft = this.ThighLeft.getChild("UpperLegLeft");
            this.FootRight_1 = this.UpperLegLeft.getChild("FootRight_1");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -5.5F, 0.0F, 10.0F, 11.0F, 13.0F), PartPose.offsetAndRotation(0.0F, 11.4F, -5.5F, -0.03490658503988659F, 0.0F, 0.0F));
            PartDefinition Chest = Body.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(67, 16).addBox(-4.5F, -5.0F, -6.0F, 9.0F, 10.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 1.7F, -0.13962634015954636F, 0.0F, 0.0F));
            PartDefinition ArmBaseLeft = Chest.addOrReplaceChild("ArmBaseLeft", CubeListBuilder.create().texOffs(63, 39).addBox(-2.0F, 0.0F, -2.5F, 4.0F, 7.0F, 5.0F), PartPose.offsetAndRotation(3.5F, -0.4F, -3.0F, 0.3141592653589793F, 0.03490658503988659F, 0.0F));
            PartDefinition InwardJointLeft = ArmBaseLeft.addOrReplaceChild("InwardJointLeft", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(1.5F, 7.0F, 2.5F, 0.0F, 0.08726646259971647F, 0.0F));
            PartDefinition ArmLeft = InwardJointLeft.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(42, 44).addBox(-1.5F, 0.0F, -4.0F, 3.0F, 6.0F, 4.0F), PartPose.offsetAndRotation(-1.2F, 0.0F, -0.5F, -0.20943951023931953F, 0.0F, 0.0F));
            PartDefinition HandLeft = ArmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(66, 32).addBox(-1.5F, -1.0F, -3.2F, 3.0F, 2.0F, 5.0F), PartPose.offsetAndRotation(0.01F, 6.0F, -2.0F, 0.06981317007977318F, 0.0F, 0.0F));

            PartDefinition ArmBaseRight = Chest.addOrReplaceChild("ArmBaseRight", CubeListBuilder.create().texOffs(63, 39).addBox(-2.0F, 0.0F, -2.5F, 4.0F, 7.0F, 5.0F), PartPose.offsetAndRotation(-3.5F, -0.4F, -3.0F, 0.3141592653589793F, -0.03490658503988659F, 0.0F));
            PartDefinition InwardJointRight = ArmBaseRight.addOrReplaceChild("InwardJointRight", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(-1.5F, 7.0F, 2.5F, 0.0F, -0.08726646259971647F, 0.0F));
            PartDefinition ArmRight = InwardJointRight.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(42, 44).addBox(-1.5F, 0.0F, -4.0F, 3.0F, 6.0F, 4.0F), PartPose.offsetAndRotation(1.2F, 0.0F, -0.5F, -0.20943951023931953F, 0.0F, 0.0F));
            PartDefinition HandRight = ArmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(66, 32).mirror(true).addBox(-1.5F, -1.0F, -3.2F, 3.0F, 2.0F, 5.0F), PartPose.offsetAndRotation(0.01F, 6.0F, -2.0F, 0.06981317007977318F, 0.0F, 0.0F));

            PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(42, 18).addBox(-3.0F, -5.5F, -4.0F, 6.0F, 5.0F, 6.0F), PartPose.offsetAndRotation(0.0F, 0.8F, -5.4F, 0.13665927909957545F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 30).addBox(-3.5F, -5.0F, -4.0F, 7.0F, 7.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 0.4F, -3.2F, 0.13665927909957545F, 0.0F, 0.0F));
            PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(34, 0).addBox(-2.0F, -1.5F, -2.0F, 4.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -0.9F, -4.2F, 0.3642502295386026F, 0.0F, 0.0F));
            PartDefinition Nose = Snout.addOrReplaceChild("Nose", CubeListBuilder.create().texOffs(72, 0).addBox(-1.5F, 0.0F, -3.6F, 3.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -2.8F, 1.2F, 0.2792526803190927F, 0.0F, 0.0F));

            PartDefinition Mouth = Snout.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(12, 43).addBox(-1.5F, 0.0F, -2.5F, 3.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 1.5F, 0.8F, -0.10471975511965977F, 0.0F, 0.0F));

            PartDefinition EarLeft = Head.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(18, 48).addBox(0.0F, -2.3F, -0.5F, 2.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(2.0F, -4.2F, -0.3F, -0.3141592653589793F, -0.20943951023931953F, 0.6108652381980153F));

            PartDefinition Forehead = Head.addOrReplaceChild("Forehead", CubeListBuilder.create().texOffs(23, 25).addBox(-2.5F, 0.0F, -4.0F, 5.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -6.0F, 0.0F, 0.2617993877991494F, 0.0F, 0.0F));

            PartDefinition EarRight = Head.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(18, 48).mirror(true).addBox(-2.0F, -2.3F, -0.5F, 2.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(-2.0F, -4.2F, -0.3F, -0.3141592653589793F, 0.20943951023931953F, -0.6108652381980153F));

            PartDefinition NeckBase = Neck.addOrReplaceChild("NeckBase", CubeListBuilder.create().texOffs(44, 30).addBox(-2.5F, -3.0F, -6.0F, 5.0F, 4.0F, 6.0F), PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.3839724354387525F, 0.0F, 0.0F));

            PartDefinition Hips = Body.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(46, 0).addBox(-4.5F, -5.0F, 0.0F, 9.0F, 10.0F, 6.0F), PartPose.offsetAndRotation(0.0F, -0.4F, 11.5F, -0.17453292519943295F, 0.0F, 0.0F));
            PartDefinition ThighRight = Hips.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(24, 35).mirror(true).addBox(-2.5F, 0.0F, -3.0F, 5.0F, 7.0F, 6.0F), PartPose.offsetAndRotation(-3.0F, -1.1F, 2.5F, -0.06981317007977318F, 0.0F, 0.0F));
            PartDefinition UpperLegRight = ThighRight.addOrReplaceChild("UpperLegRight", CubeListBuilder.create().texOffs(0, 47).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 7.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 7.0F, -3.0F, 0.4886921905584123F, 0.0F, 0.0F));
            PartDefinition FootRight = UpperLegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(18, 48).mirror(true).addBox(-2.0F, -1.0F, -6.0F, 4.0F, 2.0F, 7.0F), PartPose.offsetAndRotation(-0.01F, 7.3F, 3.8F, -0.20943951023931953F, 0.0F, 0.0F));

            PartDefinition Tail = Hips.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(0, 42).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -4.0F, 5.0F, -1.2217304763960306F, 0.0F, 0.0F));

            PartDefinition ThighLeft = Hips.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(24, 35).addBox(-2.5F, 0.0F, -3.0F, 5.0F, 7.0F, 6.0F), PartPose.offsetAndRotation(3.0F, -1.1F, 2.5F, -0.06981317007977318F, 0.0F, 0.0F));
            PartDefinition UpperLegLeft = ThighLeft.addOrReplaceChild("UpperLegLeft", CubeListBuilder.create().texOffs(0, 47).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 7.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 7.0F, -3.0F, 0.4886921905584123F, 0.0F, 0.0F));
            PartDefinition FootRight_1 = UpperLegLeft.addOrReplaceChild("FootRight_1", CubeListBuilder.create().texOffs(18, 48).addBox(-2.0F, -1.0F, -6.0F, 4.0F, 2.0F, 7.0F), PartPose.offsetAndRotation(0.01F, 7.3F, 3.8F, -0.20943951023931953F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 96, 64);
        }

        @Override
        public void setupAnim(SpectacledBearEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
            this.Head.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 0.5f;
            float degree = 0.5f;
            this.Neck.xRot = Mth.cos(limbSwing * 0.1F) * 0.05F * limbSwingAmount + 0.136F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (entity.isSprinting()) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;

            } else {
                float speed = 1.1f;
                float degree = 0.7f;

                this.Body.xRot = Mth.cos(limbSwing * speed * 0.4F) * degree * -0.05F * limbSwingAmount - 0.034F;
                this.Chest.xRot = Mth.cos(6.0F + limbSwing * speed * 0.4F) * degree * 0.1F * limbSwingAmount - 0.139F;
                this.Hips.xRot = Mth.cos(4.0F + limbSwing * speed * 0.4F) * degree * 0.1F * limbSwingAmount - 0.174F;
                this.Head.zRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * degree * -0.2F * limbSwingAmount;
                this.Head.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * degree * 0.2F * limbSwingAmount + 0.136F;

                this.ThighLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * degree * -1.5F * limbSwingAmount - 0.069F;
                this.UpperLegLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * degree * -0.5F * limbSwingAmount + 0.488F;
                this.FootRight_1.xRot = Mth.cos(-4.0F + limbSwing * speed * 0.2F) * degree * -1.5F * limbSwingAmount - 0.209F;
                this.ThighRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * degree * 1.5F * limbSwingAmount - 0.069F;
                this.UpperLegRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * degree * 0.5F * limbSwingAmount + 0.488F;
                this.FootRight.xRot = Mth.cos(-4.0F + limbSwing * speed * 0.2F) * degree * 1.5F * limbSwingAmount - 0.209F;

                this.ArmBaseLeft.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 1.5F * limbSwingAmount + 0.314F;
                this.ArmLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount - 0.209F;
                this.HandLeft.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * -1.5F * limbSwingAmount + 0.069F;
                this.ArmBaseRight.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * -1.5F * limbSwingAmount + 0.314F;
                this.ArmRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount - 0.209F;
                this.HandRight.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 1.5F * limbSwingAmount + 0.069F;
            }
        }
    }

    public static class Child extends SpectacledBearModel {

        public ModelPart Chest;
        public ModelPart Hips;
        public ModelPart ArmBaseRight;
        public ModelPart ArmBaseLeft;
        public ModelPart Neck;
        public ModelPart ArmRight;
        public ModelPart HandRight;
        public ModelPart ArmLeft;
        public ModelPart HandLeft;
        public ModelPart head;
        public ModelPart Neck2;
        public ModelPart Snout;
        public ModelPart EarRight;
        public ModelPart EarLeft;
        public ModelPart Mouth;
        public ModelPart Nose;
        public ModelPart Tail1;
        public ModelPart ThighRight;
        public ModelPart ThighLeft;
        public ModelPart UpperLegRight;
        public ModelPart FootRight;
        public ModelPart UpperLegLeft;
        public ModelPart FootLeft;

        public Child(ModelPart root) {
            this.Body = root.getChild("Body");
            this.Hips = this.Body.getChild("Hips");
            this.Tail1 = this.Hips.getChild("Tail1");

            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.UpperLegLeft = this.ThighLeft.getChild("UpperLegLeft");
            this.FootLeft = this.UpperLegLeft.getChild("FootLeft");

            this.ThighRight = this.Hips.getChild("ThighRight");
            this.UpperLegRight = this.ThighRight.getChild("UpperLegRight");
            this.FootRight = this.UpperLegRight.getChild("FootRight");

            this.Chest = this.Body.getChild("Chest");
            this.ArmBaseRight = this.Chest.getChild("ArmBaseRight");
            this.ArmRight = this.ArmBaseRight.getChild("ArmRight");
            this.HandRight = this.ArmRight.getChild("HandRight");

            this.Neck = this.Chest.getChild("Neck");
            this.Neck2 = this.Neck.getChild("Neck2");

            this.head = this.Neck.getChild("head");
            this.Snout = this.head.getChild("Snout");
            this.Nose = this.Snout.getChild("Nose");

            this.Mouth = this.Snout.getChild("Mouth");

            this.EarLeft = this.head.getChild("EarLeft");

            this.EarRight = this.head.getChild("EarRight");

            this.ArmBaseLeft = this.Chest.getChild("ArmBaseLeft");
            this.ArmLeft = this.ArmBaseLeft.getChild("ArmLeft");
            this.HandLeft = this.ArmLeft.getChild("HandLeft");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -3.0F, 0.0F, 6.0F, 6.0F, 8.0F), PartPose.offsetAndRotation(0.0F, 17.5F, -3.5F, -0.03490658503988659F, 0.0F, 0.0F));
            PartDefinition Hips = Body.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(30, 0).addBox(-2.5F, -3.0F, 0.0F, 5.0F, 5.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.3F, 7.0F, -0.17453292519943295F, -0.0F, 0.0F));
            PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(0, 24).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -2.0F, 2.0F, -1.2217304763960306F, 0.0F, 0.0F));

            PartDefinition ThighLeft = Hips.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(9, 21).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(2.5F, -0.6F, 0.3F, -0.06981317007977318F, 0.0F, 0.0F));
            PartDefinition UpperLegLeft = ThighLeft.addOrReplaceChild("UpperLegLeft", CubeListBuilder.create().texOffs(0, 27).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-0.02F, 4.0F, -1.3F, 0.4886921905584123F, 0.0F, 0.0F));
            PartDefinition FootLeft = UpperLegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(8, 28).addBox(-1.0F, -0.5F, -1.8F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.02F, 2.8F, 0.7F, -0.20943951023931953F, 0.0F, 0.0F));

            PartDefinition ThighRight = Hips.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(9, 21).mirror(true).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(-2.5F, -0.6F, 0.3F, -0.06981317007977318F, 0.0F, 0.0F));
            PartDefinition UpperLegRight = ThighRight.addOrReplaceChild("UpperLegRight", CubeListBuilder.create().texOffs(0, 27).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.02F, 4.0F, -1.3F, 0.4886921905584123F, 0.0F, 0.0F));
            PartDefinition FootRight = UpperLegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(8, 28).mirror(true).addBox(-1.0F, -0.5F, -1.8F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(-0.02F, 2.8F, 0.7F, -0.20943951023931953F, 0.0F, 0.0F));

            PartDefinition Chest = Body.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(30, 7).addBox(-2.5F, -3.0F, -3.0F, 5.0F, 6.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.2F, 1.2F, -0.13665927909957545F, 0.0F, 0.0F));
            PartDefinition ArmBaseRight = Chest.addOrReplaceChild("ArmBaseRight", CubeListBuilder.create().texOffs(32, 17).mirror(true).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(-2.4F, -0.2F, -1.2F, 0.2617993877991494F, -0.03490658503988659F, 0.0F));
            PartDefinition ArmRight = ArmBaseRight.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(19, 22).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.02F, 3.5F, 1.0F, -0.20943951023931953F, 0.0F, 0.0F));
            PartDefinition HandRight = ArmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(29, 25).mirror(true).addBox(-1.0F, -0.5F, -1.3F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-0.02F, 3.0F, -1.3F, 0.06981317007977318F, 0.0F, 0.0F));

            PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 14).addBox(-2.0F, -0.5F, -2.5F, 4.0F, 3.0F, 3.0F), PartPose.offset(0.0F, -2.1F, -2.5F));
            PartDefinition Neck2 = Neck.addOrReplaceChild("Neck2", CubeListBuilder.create().texOffs(35, 26).addBox(-1.5F, -1.0F, -3.0F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 2.2F, 0.0F, -0.20943951023931953F, 0.0F, 0.0F));

            PartDefinition head = Neck.addOrReplaceChild("head", CubeListBuilder.create().texOffs(16, 14).addBox(-2.5F, -2.5F, -2.0F, 5.0F, 5.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 2.0F, -2.3F, 0.22689280275926282F, 0.0F, 0.0F));
            PartDefinition Snout = head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(20, 3).addBox(-1.5F, -1.0F, -2.0F, 3.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -1.2F, 0.2792526803190927F, 0.0F, 0.0F));
            PartDefinition Nose = Snout.addOrReplaceChild("Nose", CubeListBuilder.create().texOffs(20, 0).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -1.6F, -0.3F, 0.2792526803190927F, 0.0F, 0.0F));

            PartDefinition Mouth = Snout.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(0, 3).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 1.0F, 0.1F, -0.10471975511965977F, 0.0F, 0.0F));

            PartDefinition EarLeft = head.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(1.3F, -3.1F, -0.4F, -0.45378560551852565F, -0.2617993877991494F, 0.8726646259971648F));

            PartDefinition EarRight = head.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(0, 0).mirror(true).addBox(-2.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-1.4F, -3.1F, -0.4F, -0.45378560551852565F, 0.2617993877991494F, -0.8726646259971648F));

            PartDefinition ArmBaseLeft = Chest.addOrReplaceChild("ArmBaseLeft", CubeListBuilder.create().texOffs(32, 17).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(2.4F, -0.2F, -1.2F, 0.27314402127920984F, 0.03490658503988659F, 0.0F));
            PartDefinition ArmLeft = ArmBaseLeft.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(19, 22).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-0.02F, 3.5F, 1.0F, -0.20943951023931953F, 0.0F, 0.0F));
            PartDefinition HandLeft = ArmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(29, 25).addBox(-1.0F, -0.5F, -1.3F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.02F, 3.0F, -1.3F, 0.06981317007977318F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 48, 32);
        }

        @Override
        public void setupAnim(SpectacledBearEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
            this.head.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
        }

        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.Neck.xRot = Mth.cos(limbSwing * 0.1F) * 0.1F * limbSwingAmount + 0.0F;
            this.head.xRot = Mth.cos(1.0F + limbSwing * 0.1F) * -0.2F * limbSwingAmount + 0.23F;
        }

        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0F;
            float degree = 0.8F;
            this.ArmBaseLeft.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.27F;
            this.ArmLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount - 0.21F;
            this.HandLeft.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * -1.5F * limbSwingAmount + 0.07F;
            this.ArmBaseRight.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.27F;
            this.ArmRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount - 0.21F;
            this.HandRight.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 1.5F * limbSwingAmount + 0.07F;
            this.ThighLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * degree * -1.5F * limbSwingAmount - 0.07F;
            this.UpperLegLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * degree * -0.5F * limbSwingAmount + 0.49F;
            this.FootLeft.xRot = Mth.cos(-4.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount - 0.21F;
            this.ThighRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * degree * 1.5F * limbSwingAmount - 0.07F;
            this.UpperLegRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * degree * 0.5F * limbSwingAmount + 0.49F;
            this.FootRight.xRot = Mth.cos(-4.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount - 0.21F;
            this.Body.xRot = Mth.cos(limbSwing * speed * 0.4F) * degree * -0.05F * limbSwingAmount - 0.03F;
            this.Chest.xRot = Mth.cos(6.0F + limbSwing * speed * 0.4F) * degree * 0.1F * limbSwingAmount - 0.14F;
            this.Hips.xRot = Mth.cos(4.0F + limbSwing * speed * 0.4F) * degree * 0.1F * limbSwingAmount - 0.17F;
            this.Body.y = Mth.cos(2.0F + limbSwing * speed * 0.4F) * degree * 0.05F * limbSwingAmount + 17.5F;
            this.head.zRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * degree * -0.2F * limbSwingAmount;
            this.head.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * degree * 0.2F * limbSwingAmount + 0.23F;
            this.Neck.xRot = this.isSwimming ? -0.2F : 0.2443461F;
        }
    }
}
