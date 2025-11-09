package com.github.artyarticus.ecoregions.client.model;

import com.github.artyarticus.ecoregions.entity.TeguEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class TeguModel extends ZawaBaseModel<TeguEntity> {
    public ModelPart Body;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Body);
        }

        return this.parts;
    }

    public static class Adult extends TeguModel {

        public ModelPart Hips;
        public ModelPart UpperArmLeft;
        public ModelPart Neck;
        public ModelPart UpperArmRight;
        public ModelPart Tail1;
        public ModelPart ThighLeft;
        public ModelPart ThighRight;
        public ModelPart Tail2;
        public ModelPart Tail3;
        public ModelPart LegLeft;
        public ModelPart FootLeft;
        public ModelPart ToeLeft1;
        public ModelPart ToeLeft2;
        public ModelPart LegRight;
        public ModelPart FootRight;
        public ModelPart ToeRight1;
        public ModelPart ToeRight2;
        public ModelPart ArmLeft;
        public ModelPart HandLeft;
        public ModelPart FingerLeft1;
        public ModelPart FingerLeft2;
        public ModelPart Head;
        public ModelPart NeckLower;
        public ModelPart Snout;
        public ModelPart Throat;
        public ModelPart TopSnout;
        public ModelPart Mouth;
        public ModelPart ArmRight;
        public ModelPart HandRight;
        public ModelPart FingerRight1;
        public ModelPart FingerRight2;

        public Adult(ModelPart root) {
            this.Body = root.getChild("Body");
            this.Neck = this.Body.getChild("Neck");
            this.NeckLower = this.Neck.getChild("NeckLower");

            this.Head = this.Neck.getChild("Head");
            this.Snout = this.Head.getChild("Snout");
            this.TopSnout = this.Snout.getChild("TopSnout");

            this.Mouth = this.Snout.getChild("Mouth");

            this.Throat = this.Head.getChild("Throat");

            this.Hips = this.Body.getChild("Hips");
            this.Tail1 = this.Hips.getChild("Tail1");
            this.Tail2 = this.Tail1.getChild("Tail2");
            this.Tail3 = this.Tail2.getChild("Tail3");

            this.ThighRight = this.Hips.getChild("ThighRight");
            this.LegRight = this.ThighRight.getChild("LegRight");
            this.FootRight = this.LegRight.getChild("FootRight");
            this.ToeRight2 = this.FootRight.getChild("ToeRight2");

            this.ToeRight1 = this.FootRight.getChild("ToeRight1");

            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.LegLeft = this.ThighLeft.getChild("LegLeft");
            this.FootLeft = this.LegLeft.getChild("FootLeft");
            this.ToeLeft2 = this.FootLeft.getChild("ToeLeft2");

            this.ToeLeft1 = this.FootLeft.getChild("ToeLeft1");

            this.UpperArmLeft = this.Body.getChild("UpperArmLeft");
            this.ArmLeft = this.UpperArmLeft.getChild("ArmLeft");
            this.HandLeft = this.ArmLeft.getChild("HandLeft");
            this.FingerLeft1 = this.HandLeft.getChild("FingerLeft1");

            this.FingerLeft2 = this.HandLeft.getChild("FingerLeft2");

            this.UpperArmRight = this.Body.getChild("UpperArmRight");
            this.ArmRight = this.UpperArmRight.getChild("ArmRight");
            this.HandRight = this.ArmRight.getChild("HandRight");
            this.FingerRight2 = this.HandRight.getChild("FingerRight2");

            this.FingerRight1 = this.HandRight.getChild("FingerRight1");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(34, 24).addBox(-2.5F, -3.0F, -2.0F, 5.0F, 6.0F, 10.0F), PartPose.offset(0.0F, 19.1F, -6.0F));
            PartDefinition Neck = Body.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(1, 30).addBox(-1.5F, -1.0F, -2.1F, 3.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -2.5F, -2.0F, -0.2275909337942703F, 0.0F, 0.0F));
            PartDefinition NeckLower = Neck.addOrReplaceChild("NeckLower", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.5F, -2.4F, 2.0F, 2.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 3.8F, -1.0F, -0.3579670335787786F, 0.0F, 0.0F));

            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 21).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 1.5F, -3.2F, 0.3642502295386026F, 0.0F, 0.0F));
            PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(2, 16).addBox(-1.5F, -0.5F, -3.0F, 3.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -0.8F, -1.7F, 0.2275909337942703F, 0.0F, 0.0F));
            PartDefinition TopSnout = Snout.addOrReplaceChild("TopSnout", CubeListBuilder.create().texOffs(2, 16).addBox(-1.5F, -1.3F, -3.0F, 3.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.01F, 0.2F, 0.1F, 0.16929693411449862F, 0.0F, 0.0F));

            PartDefinition Mouth = Snout.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(3, 10).addBox(-1.0F, -0.5F, -2.6F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 2.1F, -0.4F, -0.13700834461707917F, 0.0F, 0.0F));

            PartDefinition Throat = Head.addOrReplaceChild("Throat", CubeListBuilder.create().texOffs(15, 32).addBox(-2.5F, -1.1F, -1.3F, 5.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 0.4F, 0.5F, -0.500909508638178F, 0.0F, 0.0F));

            PartDefinition Hips = Body.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(48, 15).addBox(-2.0F, -0.5F, 0.0F, 4.0F, 5.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -2.5F, 7.5F, -0.20839230536442993F, 0.0F, 0.0F));
            PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(44, 4).addBox(-1.5F, -0.5F, 0.0F, 3.0F, 4.0F, 7.0F), PartPose.offsetAndRotation(0.0F, 0.1F, 3.5F, -0.20734511713429715F, 0.0F, 0.0F));
            PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(19, 0).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 3.0F, 8.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 6.5F, 0.18203784630933073F, 0.0F, 0.0F));
            PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(18, 12).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 10.0F), PartPose.offsetAndRotation(0.01F, 0.5F, 7.0F, 0.2275909337942703F, 0.0F, 0.0F));

            PartDefinition ThighRight = Hips.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(40, 0).addBox(0.0F, 0.0F, -0.5F, 2.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(-1.5F, 1.0F, 2.0F, 0.0F, 0.415388348658845F, 0.8726646259971648F));
            PartDefinition LegRight = ThighRight.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(33, 1).addBox(0.0F, 0.0F, 0.0F, 1.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(0.5F, 3.5F, -0.5F, 0.8726646259971648F, 0.0F, -0.2617993877991494F));
            PartDefinition FootRight = LegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(51, 0).mirror(true).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.49F, 3.2F, -0.1F, -0.28658306450904947F, -0.19547687289441354F, -0.3909537457888271F));
            PartDefinition ToeRight2 = FootRight.addOrReplaceChild("ToeRight2", CubeListBuilder.create().texOffs(6, 8).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.5F, 0.1F, 0.5F, -0.05235987755982988F, 0.3490658503988659F, 0.0F));

            PartDefinition ToeRight1 = FootRight.addOrReplaceChild("ToeRight1", CubeListBuilder.create().texOffs(6, 8).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.5F, 0.0F, 0.5F, 0.05235987755982988F, -0.3490658503988659F, 0.0F));

            PartDefinition ThighLeft = Hips.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(40, 0).mirror(true).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(1.5F, 1.0F, 2.0F, 0.0F, -0.415388348658845F, -0.8726646259971648F));
            PartDefinition LegLeft = ThighLeft.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(33, 1).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(-0.5F, 3.5F, -0.5F, 0.8726646259971648F, 0.0F, 0.2617993877991494F));
            PartDefinition FootLeft = LegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(51, 0).mirror(true).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-0.49F, 3.2F, -0.1F, -0.28658306450904947F, 0.19547687289441354F, 0.3909537457888271F));
            PartDefinition ToeLeft2 = FootLeft.addOrReplaceChild("ToeLeft2", CubeListBuilder.create().texOffs(6, 8).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.5F, 0.1F, 0.5F, -0.05235987755982988F, 0.3490658503988659F, 0.0F));

            PartDefinition ToeLeft1 = FootLeft.addOrReplaceChild("ToeLeft1", CubeListBuilder.create().texOffs(6, 8).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.5F, 0.0F, 0.5F, 0.05235987755982988F, -0.3490658503988659F, 0.0F));

            PartDefinition UpperArmLeft = Body.addOrReplaceChild("UpperArmLeft", CubeListBuilder.create().texOffs(13, 0).mirror(true).addBox(-0.5F, 0.0F, -0.5F, 4.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(2.0F, -0.7F, -1.0F, 0.0F, -0.08726646259971647F, 0.8726646259971648F));
            PartDefinition ArmLeft = UpperArmLeft.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(14, 4).mirror(true).addBox(-0.2F, 0.0F, -1.0F, 3.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(3.1F, 0.5F, 0.49F, 0.0F, 0.3642502295386026F, 0.6981317007977318F));
            PartDefinition HandLeft = ArmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(0, 8).mirror(true).addBox(-0.5F, -0.01F, -1.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(2.5F, 0.49F, -0.5F, 0.34487706418882114F, -0.04555309164612875F, -1.5481069932557485F));
            PartDefinition FingerLeft1 = HandLeft.addOrReplaceChild("FingerLeft1", CubeListBuilder.create().texOffs(6, 8).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.5F, 0.0F, 0.5F, 0.0F, -0.3490658503988659F, 0.0F));

            PartDefinition FingerLeft2 = HandLeft.addOrReplaceChild("FingerLeft2", CubeListBuilder.create().texOffs(6, 8).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.5F, 0.0F, 0.3490658503988659F, 0.0F));

            PartDefinition UpperArmRight = Body.addOrReplaceChild("UpperArmRight", CubeListBuilder.create().texOffs(13, 0).addBox(-3.5F, 0.0F, -0.5F, 4.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-2.0F, -0.7F, -1.0F, 0.0F, 0.08726646259971647F, -0.8726646259971648F));
            PartDefinition ArmRight = UpperArmRight.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(14, 4).addBox(-2.8F, 0.0F, -1.0F, 3.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-3.1F, 0.5F, 0.49F, 0.0F, -0.3642502295386026F, -0.6981317007977318F));
            PartDefinition HandRight = ArmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(0, 8).mirror(true).addBox(-0.5F, -0.01F, -1.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-2.5F, 0.49F, -0.5F, 0.34487706418882114F, 0.04555309164612875F, 1.5481069932557485F));
            PartDefinition FingerRight2 = HandRight.addOrReplaceChild("FingerRight2", CubeListBuilder.create().texOffs(6, 8).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.5F, 0.0F, 0.3490658503988659F, 0.0F));

            PartDefinition FingerRight1 = HandRight.addOrReplaceChild("FingerRight1", CubeListBuilder.create().texOffs(6, 8).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.5F, 0.0F, 0.5F, 0.0F, -0.3490658503988659F, 0.0F));

            return LayerDefinition.create(meshDefinition, 64, 64);
        }

        @Override
        public void setupAnim(TeguEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.364F;
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Tail1.yRot = Mth.cos(-2.0F + limbSwing * speed * 0.08F) * degree * 0.1F * limbSwingAmount;
            this.Tail2.yRot = Mth.cos(-3.0F + limbSwing * speed * 0.08F) * degree * 0.1F * limbSwingAmount;
            this.Tail3.yRot = Mth.cos(limbSwing * speed * 0.08F) * degree * 0.1F * limbSwingAmount;
            this.Tail1.xRot = Mth.cos(limbSwing * speed * 0.16F) * degree * 0.05F * limbSwingAmount - 0.207F;
            this.Neck.xRot = Mth.cos(limbSwing * speed * 0.1F) * degree * 0.1F * limbSwingAmount - 0.228F;
            this.Head.xRot = Mth.cos(limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount + 0.364F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 4.0f;
            float degree = 0.7f;
            this.UpperArmLeft.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount;
            this.ArmLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount;
            this.HandLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.345F;

            this.ThighLeft.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount;
            this.LegLeft.xRot = Mth.cos(-1.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.873F;
            this.FootLeft.xRot = Mth.cos(-2.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount - 0.287F;

            this.UpperArmRight.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount;
            this.ArmRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount;
            this.HandRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.345F;

            this.ThighRight.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount;
            this.LegRight.xRot = Mth.cos(-1.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.873F;
            this.FootRight.xRot = Mth.cos(-2.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount - 0.287F;

            this.Body.yRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount;
            this.Neck.yRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * degree * -0.2F * limbSwingAmount - 0.227F;
            this.Head.yRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount + 0.364F;
            this.Hips.yRot = Mth.cos(-1.0F + limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount - 0.208F;
            this.Tail1.yRot = Mth.cos(-2.0F + limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount;
            this.Tail2.yRot = Mth.cos(-3.0F + limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount;
            this.Tail3.yRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount;
        }
    }

    public static class Child extends TeguModel {

        public ModelPart Neck;
        public ModelPart Tail1;
        public ModelPart UpperArmLeft;
        public ModelPart ThighLeft;
        public ModelPart UpperArmRight;
        public ModelPart ThighRight;
        public ModelPart Head;
        public ModelPart Snout;
        public ModelPart SnoutTop;
        public ModelPart Mouth;
        public ModelPart Tail2;
        public ModelPart ArmLeft;
        public ModelPart HandLeft;
        public ModelPart FingerLeft1;
        public ModelPart FingerLeft2;
        public ModelPart LegLeft;
        public ModelPart FootLeft;
        public ModelPart ToeLeft1;
        public ModelPart ToeLeft2;
        public ModelPart ArmRight;
        public ModelPart HandRight;
        public ModelPart FingerLeft1_1;
        public ModelPart FingerLeft2_1;
        public ModelPart LegRight;
        public ModelPart FootRight;
        public ModelPart ToeRight1;
        public ModelPart ToeRight2;

        public Child(ModelPart root) {
            this.Body = root.getChild("Body");
            this.Neck = this.Body.getChild("Neck");
            this.Head = this.Neck.getChild("Head");
            this.Snout = this.Head.getChild("Snout");
            this.Mouth = this.Snout.getChild("Mouth");

            this.SnoutTop = this.Snout.getChild("SnoutTop");

            this.Tail1 = this.Body.getChild("Tail1");
            this.Tail2 = this.Tail1.getChild("Tail2");

            this.UpperArmLeft = this.Body.getChild("UpperArmLeft");
            this.ArmLeft = this.UpperArmLeft.getChild("ArmLeft");
            this.HandLeft = this.ArmLeft.getChild("HandLeft");
            this.FingerLeft1 = this.HandLeft.getChild("FingerLeft1");

            this.FingerLeft2 = this.HandLeft.getChild("FingerLeft2");

            this.UpperArmRight = this.Body.getChild("UpperArmRight");
            this.ArmRight = this.UpperArmRight.getChild("ArmRight");
            this.HandRight = this.ArmRight.getChild("HandRight");
            this.FingerLeft2_1 = this.HandRight.getChild("FingerLeft2_1");

            this.FingerLeft1_1 = this.HandRight.getChild("FingerLeft1_1");

            this.ThighRight = this.Body.getChild("ThighRight");
            this.LegRight = this.ThighRight.getChild("LegRight");
            this.FootRight = this.LegRight.getChild("FootRight");
            this.ToeRight1 = this.FootRight.getChild("ToeRight1");

            this.ToeRight2 = this.FootRight.getChild("ToeRight2");

            this.ThighLeft = this.Body.getChild("ThighLeft");
            this.LegLeft = this.ThighLeft.getChild("LegLeft");
            this.FootLeft = this.LegLeft.getChild("FootLeft");
            this.ToeLeft1 = this.FootLeft.getChild("ToeLeft1");

            this.ToeLeft2 = this.FootLeft.getChild("ToeLeft2");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 22).addBox(-1.5F, -1.5F, -3.0F, 3.0F, 3.0F, 7.0F), PartPose.offset(0.0F, 21.3F, -2.0F));
            PartDefinition Neck = Body.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 6).addBox(-1.0F, -0.5F, -2.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, -0.2F)), PartPose.offsetAndRotation(0.0F, -1.2F, -2.5F, -0.2275909337942703F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 1.3F, -2.5F, 0.3186971254089062F, 0.0F, 0.0F));
            PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(0, 19).addBox(-1.0F, -0.6F, -2.2F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.18901915665940536F, 0.0F, 0.0F));
            PartDefinition Mouth = Snout.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(14, 0).addBox(-1.0F, 0.0F, -1.2F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.01F, 0.2F, -0.8F, -0.13665927909957545F, 0.0F, 0.0F));

            PartDefinition SnoutTop = Snout.addOrReplaceChild("SnoutTop", CubeListBuilder.create().texOffs(11, 7).addBox(-1.0F, -1.5F, -2.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-0.01F, 0.3F, 0.2F, 0.3380702907586876F, 0.0F, 0.0F));

            PartDefinition Tail1 = Body.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(18, 0).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 5.0F), PartPose.offsetAndRotation(0.0F, -1.0F, 4.0F, -0.2275909337942703F, 0.0F, 0.0F));
            PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(10, 7).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 10.0F), PartPose.offsetAndRotation(0.0F, 0.5F, 4.5F, 0.13665927909957545F, 0.0F, 0.0F));

            PartDefinition UpperArmLeft = Body.addOrReplaceChild("UpperArmLeft", CubeListBuilder.create().texOffs(13, 14).mirror(true).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(1.4F, 1.0F, -2.1F, 0.2617993877991494F, -0.08726646259971647F, -0.8726646259971648F));
            PartDefinition ArmLeft = UpperArmLeft.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(13, 18).mirror(true).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 1.1F, 0.0F, -0.3490658503988659F, 0.0F, 0.6981317007977318F));
            PartDefinition HandLeft = ArmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(25, 18).mirror(true).addBox(-0.5F, -0.01F, -0.8F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.1F, 0.4F, -0.5F, 0.19198621771937624F, 0.0F, 0.17453292519943295F));
            PartDefinition FingerLeft1 = HandLeft.addOrReplaceChild("FingerLeft1", CubeListBuilder.create().texOffs(25, 18).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.5F, 0.0F, 0.5F, 0.0F, -0.3490658503988659F, 0.0F));

            PartDefinition FingerLeft2 = HandLeft.addOrReplaceChild("FingerLeft2", CubeListBuilder.create().texOffs(25, 18).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.5F, 0.0F, 0.3490658503988659F, 0.0F));

            PartDefinition UpperArmRight = Body.addOrReplaceChild("UpperArmRight", CubeListBuilder.create().texOffs(13, 14).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-1.4F, 1.0F, -2.1F, 0.2617993877991494F, 0.08726646259971647F, 0.8726646259971648F));
            PartDefinition ArmRight = UpperArmRight.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(13, 18).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 1.1F, 0.0F, -0.3490658503988659F, 0.0F, -0.6981317007977318F));
            PartDefinition HandRight = ArmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(25, 18).addBox(-0.5F, -0.01F, -0.8F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.1F, 0.4F, -0.5F, 0.19198621771937624F, 0.0F, -0.17453292519943295F));
            PartDefinition FingerLeft2_1 = HandRight.addOrReplaceChild("FingerLeft2_1", CubeListBuilder.create().texOffs(25, 18).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.5F, 0.0F, 0.3490658503988659F, 0.0F));

            PartDefinition FingerLeft1_1 = HandRight.addOrReplaceChild("FingerLeft1_1", CubeListBuilder.create().texOffs(25, 18).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.5F, 0.0F, 0.5F, 0.0F, -0.3490658503988659F, 0.0F));

            PartDefinition ThighRight = Body.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(7, 14).mirror(true).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-1.1F, 0.7F, 3.2F, 0.3790855015489435F, 0.08726646259971647F, 0.8726646259971648F));
            PartDefinition LegRight = ThighRight.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(7, 18).mirror(true).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 1.1F, 0.0F, 0.3490658503988659F, 0.0F, -0.6981317007977318F));
            PartDefinition FootRight = LegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(25, 18).mirror(true).addBox(-0.5F, -0.01F, -0.8F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.2F, 0.3F, -0.4F, -0.47263516010848383F, 0.0F, -0.17453292519943295F));
            PartDefinition ToeRight1 = FootRight.addOrReplaceChild("ToeRight1", CubeListBuilder.create().texOffs(25, 18).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.5F, 0.0F, 0.5F, 0.0F, -0.3490658503988659F, 0.0F));

            PartDefinition ToeRight2 = FootRight.addOrReplaceChild("ToeRight2", CubeListBuilder.create().texOffs(25, 18).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.5F, 0.0F, 0.3490658503988659F, 0.0F));

            PartDefinition ThighLeft = Body.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(7, 14).mirror(true).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(1.1F, 0.7F, 3.2F, 0.3790855015489435F, -0.08726646259971647F, -0.8726646259971648F));
            PartDefinition LegLeft = ThighLeft.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(7, 18).mirror(true).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 1.1F, 0.0F, 0.3490658503988659F, 0.0F, 0.6981317007977318F));
            PartDefinition FootLeft = LegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(25, 18).mirror(true).addBox(-0.5F, -0.01F, -0.8F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.2F, 0.3F, -0.4F, -0.47263516010848383F, 0.0F, 0.17453292519943295F));
            PartDefinition ToeLeft1 = FootLeft.addOrReplaceChild("ToeLeft1", CubeListBuilder.create().texOffs(25, 18).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.5F, 0.0F, 0.5F, 0.0F, -0.3490658503988659F, 0.0F));

            PartDefinition ToeLeft2 = FootLeft.addOrReplaceChild("ToeLeft2", CubeListBuilder.create().texOffs(25, 18).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.5F, 0.0F, 0.3490658503988659F, 0.0F));

            return LayerDefinition.create(meshDefinition, 32, 32);
        }

        @Override
        public void setupAnim(TeguEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.364F;
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Tail1.yRot = Mth.cos(-2.0F + limbSwing * speed * 0.08F) * degree * 0.1F * limbSwingAmount;
            this.Tail2.yRot = Mth.cos(-3.0F + limbSwing * speed * 0.08F) * degree * 0.1F * limbSwingAmount;
            this.Tail1.xRot = Mth.cos(limbSwing * speed * 0.16F) * degree * 0.05F * limbSwingAmount - 0.228F;
            this.Neck.xRot = Mth.cos(limbSwing * speed * 0.1F) * degree * 0.1F * limbSwingAmount - 0.228F;
            this.Head.xRot = Mth.cos(limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount + 0.318F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 4.0f;
            float degree = 0.7f;
            this.UpperArmLeft.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.261F;
            this.ArmLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount - 0.349F;
            this.HandLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.192F;

            this.ThighLeft.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.379F;
            this.LegLeft.xRot = Mth.cos(-1.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.349F;
            this.FootLeft.xRot = Mth.cos(-2.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount - 0.472F;

            this.UpperArmRight.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.261F;
            this.ArmRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount - 0.349F;
            this.HandRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.192F;

            this.ThighRight.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.379F;
            this.LegRight.xRot = Mth.cos(-1.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.349F;
            this.FootRight.xRot = Mth.cos(-2.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount - 0.472F;

            this.Body.yRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount;
            this.Neck.yRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * degree * -0.2F * limbSwingAmount - 0.228F;
            this.Head.yRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount + 0.318F;
            this.Tail1.yRot = Mth.cos(-2.0F + limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount;
            this.Tail2.yRot = Mth.cos(-3.0F + limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount;
        }
    }
}
