package com.github.artyarticus.ecoregions.client.model;

import com.github.artyarticus.ecoregions.entity.LorisEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class LorisModel extends ZawaBaseModel<LorisEntity> {
    public ModelPart Chest;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Chest);
        }

        return this.parts;
    }

    public static class Adult extends LorisModel {
        public ModelPart Body;
        public ModelPart Neck;
        public ModelPart UpperArmLeft;
        public ModelPart UpperArmRight;
        public ModelPart Hips;
        public ModelPart ThighLeft;
        public ModelPart Tail;
        public ModelPart ThighRight;
        public ModelPart LegLeft;
        public ModelPart FootLeft;
        public ModelPart LegRight;
        public ModelPart FootRight;
        public ModelPart Head;
        public ModelPart Snout;
        public ModelPart PygmyEarLeft;
        public ModelPart EarRight;
        public ModelPart PygmyEarRight;
        public ModelPart CheekLeft;
        public ModelPart CheekRight;
        public ModelPart Nose;
        public ModelPart Mouth;
        public ModelPart LowerArmLeft;
        public ModelPart HandLeft;
        public ModelPart ThumbLeft;
        public ModelPart LowerArmRight;
        public ModelPart HandRight;
        public ModelPart ThumbRight;
        public ModelPart EarLeft;

        public Adult(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.Body = this.Chest.getChild("Body");
            this.Hips = this.Body.getChild("Hips");
            this.Tail = this.Hips.getChild("Tail");

            this.ThighRight = this.Hips.getChild("ThighRight");
            this.LegRight = this.ThighRight.getChild("LegRight");
            this.FootRight = this.LegRight.getChild("FootRight");

            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.LegLeft = this.ThighLeft.getChild("LegLeft");
            this.FootLeft = this.LegLeft.getChild("FootLeft");

            this.Neck = this.Chest.getChild("Neck");
            this.Head = this.Neck.getChild("Head");
            this.EarLeft = this.Head.getChild("EarLeft");

            this.Snout = this.Head.getChild("Snout");
            this.Nose = this.Snout.getChild("Nose");

            this.Mouth = this.Snout.getChild("Mouth");

            this.PygmyEarLeft = this.Head.getChild("PygmyEarLeft");

            this.CheekRight = this.Head.getChild("CheekRight");

            this.PygmyEarRight = this.Head.getChild("PygmyEarRight");

            this.CheekLeft = this.Head.getChild("CheekLeft");

            this.EarRight = this.Head.getChild("EarRight");

            this.UpperArmLeft = this.Chest.getChild("UpperArmLeft");
            this.LowerArmLeft = this.UpperArmLeft.getChild("LowerArmLeft");
            this.HandLeft = this.LowerArmLeft.getChild("HandLeft");
            this.ThumbLeft = this.HandLeft.getChild("ThumbLeft");

            this.UpperArmRight = this.Chest.getChild("UpperArmRight");
            this.LowerArmRight = this.UpperArmRight.getChild("LowerArmRight");
            this.HandRight = this.LowerArmRight.getChild("HandRight");
            this.ThumbRight = this.HandRight.getChild("ThumbRight");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Chest = partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 10).addBox(-2.5F, -2.5F, -1.0F, 5.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 17.7F, 0.0F, 0.03909537541112055F, 0.0F, 0.0F));
            PartDefinition Body = Chest.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(34, 0).addBox(-3.0F, -1.0F, 0.0F, 6.0F, 5.0F, 6.0F), PartPose.offsetAndRotation(0.0F, -1.6F, 0.5F, -0.0781907508222411F, 0.0F, 0.0F));
            PartDefinition Hips = Body.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(14, 10).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -1.0F, 6.0F, -0.5866051722479385F, 0.0F, 0.0F));
            PartDefinition Tail = Hips.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(17, 0).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.5F, 2.0F, 0.39112828270876815F, 0.0F, 0.0F));

            PartDefinition ThighRight = Hips.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(20, 0).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(-2.1F, 1.0F, 1.1F, 0.42987458011881735F, 0.0F, 0.0F));
            PartDefinition LegRight = ThighRight.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(28, 6).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 3.5F, -1.0F, 0.43127084218883227F, 0.0F, 0.0F));
            PartDefinition FootRight = LegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(30, 12).addBox(-1.0F, -0.5F, -3.1F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 4.0F, 1.0F, -0.23457224414434488F, 0.0F, 0.0F));

            PartDefinition ThighLeft = Hips.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(20, 0).mirror(true).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(2.1F, 1.0F, 1.1F, 0.42987458011881735F, 0.0F, 0.0F));
            PartDefinition LegLeft = ThighLeft.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(28, 6).mirror(true).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 3.5F, -1.0F, 0.43127084218883227F, 0.0F, 0.0F));
            PartDefinition FootLeft = LegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(30, 12).mirror(true).addBox(-1.0F, -0.5F, -3.1F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 4.0F, 1.0F, -0.23457224414434488F, 0.0F, 0.0F));

            PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(10, 17).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(-0.05F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -2.2F, -0.5F, -0.27366763203903305F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(17, 25).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 1.9F, -1.5F, 0.27366763203903305F, 0.0F, 0.0F));
            PartDefinition EarLeft = Head.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(0, 30).mirror(true).addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(1.8F, -0.5F, -0.5F, 0.0F, -0.4300491170387584F, -0.3127630032889644F));

            PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(28, 25).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.5F, -3.0F, 0.3522074483787779F, 0.0F, 0.0F));
            PartDefinition Nose = Snout.addOrReplaceChild("Nose", CubeListBuilder.create().texOffs(26, 22).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -0.3F, 0.27366763203903305F, 0.0F, 0.0F));

            PartDefinition Mouth = Snout.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(26, 20).addBox(-1.0F, -0.2F, -0.95F, 2.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.01F, 1.0F, 1.0F, -0.1563815016444822F, 0.0F, 0.0F));

            PartDefinition PygmyEarLeft = Head.addOrReplaceChild("PygmyEarLeft", CubeListBuilder.create().texOffs(29, 16).mirror(true).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(2.0F, -1.5F, -1.0F, 0.0F, -0.35185837453889574F, 0.3909537457888271F));

            PartDefinition CheekRight = Head.addOrReplaceChild("CheekRight", CubeListBuilder.create().texOffs(7, 25).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(-1.2F, 1.2F, -0.1F, 0.0F, 0.0F, 0.19547687289441354F));

            PartDefinition PygmyEarRight = Head.addOrReplaceChild("PygmyEarRight", CubeListBuilder.create().texOffs(29, 16).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-2.0F, -1.5F, -1.0F, 0.0F, 0.35185837453889574F, -0.3909537457888271F));

            PartDefinition CheekLeft = Head.addOrReplaceChild("CheekLeft", CubeListBuilder.create().texOffs(7, 25).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(1.2F, 1.2F, -0.1F, 0.0F, 0.0F, -0.19547687289441354F));

            PartDefinition EarRight = Head.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(0, 30).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-1.8F, -0.5F, -0.5F, 0.0F, 0.4300491170387584F, 0.3127630032889644F));

            PartDefinition UpperArmLeft = Chest.addOrReplaceChild("UpperArmLeft", CubeListBuilder.create().texOffs(0, 16).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(2.1F, -0.1F, -0.5F, 0.1563815016444822F, -0.11728612207217244F, 0.0781907508222411F));
            PartDefinition LowerArmLeft = UpperArmLeft.addOrReplaceChild("LowerArmLeft", CubeListBuilder.create().texOffs(0, 22).mirror(true).addBox(-1.1F, 0.0F, -0.5F, 2.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 3.5F, 0.5F, -0.6255260065779288F, 0.0F, 0.0F));
            PartDefinition HandLeft = LowerArmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(0, 26).mirror(true).addBox(-1.1F, -0.5F, -2.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.02F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.46914448828868976F, 0.0F, 0.0F));
            PartDefinition ThumbLeft = HandLeft.addOrReplaceChild("ThumbLeft", CubeListBuilder.create().texOffs(8, 16).mirror(true).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-1.0F, 0.1F, 0.0F, 0.0F, 0.3909537457888271F, 0.0F));

            PartDefinition UpperArmRight = Chest.addOrReplaceChild("UpperArmRight", CubeListBuilder.create().texOffs(0, 16).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(-2.1F, -0.1F, -0.5F, 0.1563815016444822F, 0.11728612207217244F, -0.0781907508222411F));
            PartDefinition LowerArmRight = UpperArmRight.addOrReplaceChild("LowerArmRight", CubeListBuilder.create().texOffs(0, 22).addBox(-0.9F, 0.0F, -0.5F, 2.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 3.5F, 0.5F, -0.6255260065779288F, 0.0F, 0.0F));
            PartDefinition HandRight = LowerArmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(0, 26).addBox(-0.9F, -0.5F, -2.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.02F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.46914448828868976F, 0.0F, 0.0F));
            PartDefinition ThumbRight = HandRight.addOrReplaceChild("ThumbRight", CubeListBuilder.create().texOffs(8, 16).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(1.0F, 0.1F, 0.0F, 0.0F, -0.3909537457888271F, 0.0F));

            return LayerDefinition.create(meshDefinition, 64, 32);
        }

        @Override
        public void setupAnim(LorisEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
            this.Head.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos(limbSwing * speed * 0.1F + 3.1415927F) * degree * 0.2F * limbSwingAmount * 0.5F - 0.27F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (entity.isSprinting()) {
                float speed = 1.5f;
                float degree = 0.4f;

                this.ThighLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -4.5F * limbSwingAmount * 0.5F + 0.43F;
                this.LegLeft.xRot = Mth.cos(6.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.43F;
                this.FootLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.0F * limbSwingAmount * 0.5F - 0.23F;
                this.ThighRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -4.5F * limbSwingAmount * 0.5F + 0.43F;
                this.LegRight.xRot = Mth.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.43F;
                this.FootRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.0F * limbSwingAmount * 0.5F - 0.23F;

                this.Chest.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -0.7F * limbSwingAmount * 0.5F + 0.04F;
                this.Body.xRot = Mth.cos(6.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -0.8F * limbSwingAmount * 0.5F - 0.08F;
                this.Chest.y = Mth.cos(2.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F + -0.15F + 17.7F;
                this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 0.8F * limbSwingAmount * 0.5F - 0.27F;
                this.Head.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 0.4F * limbSwingAmount * 0.5F + 0.27F;

                this.Tail.xRot = Mth.cos(6.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 3.0F * limbSwingAmount * 0.5F + 0.39F;

                this.UpperArmLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -4.0F * limbSwingAmount * 0.5F + 0.16F;
                this.LowerArmLeft.xRot = Mth.cos(6.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F - 0.63F;
                this.HandLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -5.0F * limbSwingAmount * 0.5F + 0.47F;
                this.UpperArmRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 4.0F * limbSwingAmount * 0.5F + 0.16F;
                this.LowerArmRight.xRot = Mth.cos(6.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F - 0.63F;
                this.HandRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 5.0F * limbSwingAmount * 0.5F + 0.47F;

            } else {
                float speed = 0.9f;
                float degree = 0.6f;
                this.UpperArmLeft.xRot = Mth.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.16F;
                this.LowerArmLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F - 0.63F;
                this.HandLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F + 0.47F;
                this.UpperArmRight.xRot = Mth.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F + 0.16F;
                this.LowerArmRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.5F * limbSwingAmount * 0.5F - 0.63F;
                this.HandRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.47F;

                this.ThighLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F + 0.43F;
                this.LegLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.43F;
                this.FootLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.5F * limbSwingAmount * 0.5F - 0.23F;
                this.ThighRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.43F;
                this.LegRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 3.0F * limbSwingAmount * 0.5F + 0.43F;
                this.FootRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F - 0.23F;

                this.Chest.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * 0.15F * limbSwingAmount * 0.5F + (this.isSwimming ? -0.2F : +0.04F);
                this.Body.xRot = Mth.cos(1.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * -0.17F * limbSwingAmount * 0.5F - 0.08F;
                this.Neck.xRot = Mth.cos(limbSwing * speed * 0.0F + 3.1415927F) * degree * 0.0F * limbSwingAmount * 0.5F - 0.27F;

                this.Tail.xRot = Mth.cos(5.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * 0.3F * limbSwingAmount * 0.5F + (this.isSwimming ? 0.2F : +0.39F);
            }
        }
    }

    public static class Child extends LorisModel {

        public ModelPart Neck;
        public ModelPart Hip;
        public ModelPart UpperArmLeft;
        public ModelPart UpperArmRight;
        public ModelPart Head;
        public ModelPart Snout;
        public ModelPart PygmyEarLeft;
        public ModelPart EarLeft;
        public ModelPart CheekLeft;
        public ModelPart PygmyEarRight;
        public ModelPart CheekRight;
        public ModelPart EarRight;
        public ModelPart Nose;
        public ModelPart Mouth;
        public ModelPart Tail;
        public ModelPart ThighLeft;
        public ModelPart ThighRight;
        public ModelPart LegLeft;
        public ModelPart FootLeft;
        public ModelPart LegRight;
        public ModelPart FootRight;
        public ModelPart ArmLeft;
        public ModelPart HandLeft;
        public ModelPart ArmRight;
        public ModelPart HandRight;

        public Child(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.UpperArmRight = this.Chest.getChild("UpperArmRight");
            this.ArmRight = this.UpperArmRight.getChild("ArmRight");
            this.HandRight = this.ArmRight.getChild("HandRight");

            this.Neck = this.Chest.getChild("Neck");
            this.Head = this.Neck.getChild("Head");
            this.Snout = this.Head.getChild("Snout");
            this.Mouth = this.Snout.getChild("Mouth");

            this.Nose = this.Snout.getChild("Nose");

            this.EarRight = this.Head.getChild("EarRight");

            this.CheekRight = this.Head.getChild("CheekRight");

            this.PygmyEarLeft = this.Head.getChild("PygmyEarLeft");

            this.PygmyEarRight = this.Head.getChild("PygmyEarRight");

            this.EarLeft = this.Head.getChild("EarLeft");

            this.CheekLeft = this.Head.getChild("CheekLeft");

            this.UpperArmLeft = this.Chest.getChild("UpperArmLeft");
            this.ArmLeft = this.UpperArmLeft.getChild("ArmLeft");
            this.HandLeft = this.ArmLeft.getChild("HandLeft");

            this.Hip = this.Chest.getChild("Hip");
            this.Tail = this.Hip.getChild("Tail");

            this.ThighLeft = this.Hip.getChild("ThighLeft");
            this.LegLeft = this.ThighLeft.getChild("LegLeft");
            this.FootLeft = this.LegLeft.getChild("FootLeft");

            this.ThighRight = this.Hip.getChild("ThighRight");
            this.LegRight = this.ThighRight.getChild("LegRight");
            this.FootRight = this.LegRight.getChild("FootRight");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Chest = partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 5).addBox(-1.5F, -1.5F, -1.3F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, 0.3F)), PartPose.offsetAndRotation(0.0F, 20.6F, 0.0F, 0.04555309164612875F, 0.0F, 0.0F));
            PartDefinition UpperArmRight = Chest.addOrReplaceChild("UpperArmRight", CubeListBuilder.create().texOffs(9, 10).mirror(true).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-1.1F, 0.4F, -1.25F, 0.11728612207217244F, 0.0F, 0.0F));
            PartDefinition ArmRight = UpperArmRight.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(5, 10).mirror(true).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 1.8F, 0.0F, -0.35185837453889574F, 0.0F, 0.0F));
            PartDefinition HandRight = ArmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(0, 12).mirror(true).addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.1F, 0.9F, 0.0F, 0.22410027861923298F, 0.0F, 0.0F));

            PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(10, 5).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -0.7F, -1.5F, -0.2275909337942703F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(10, 0).addBox(-1.5F, -1.5F, -1.0F, 3.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.6F, -1.3F, 0.27366763203903305F, 0.0F, 0.0F));
            PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(22, 3).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.4F, -1.7F, 0.3522074483787779F, 0.0F, 0.0F));
            PartDefinition Mouth = Snout.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(28, 3).addBox(-0.5F, -0.4F, -0.95F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 1.0F, 1.0F, -0.1563815016444822F, 0.0F, 0.0F));

            PartDefinition Nose = Snout.addOrReplaceChild("Nose", CubeListBuilder.create().texOffs(24, 5).addBox(-0.5F, 0.0F, -0.2F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.27366763203903305F, 0.0F, 0.0F));

            PartDefinition EarRight = Head.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(24, 0).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-1.0F, 0.0F, -0.2F, 0.0F, 0.4300491170387584F, 0.3127630032889644F));

            PartDefinition CheekRight = Head.addOrReplaceChild("CheekRight", CubeListBuilder.create().texOffs(18, 5).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-1.0F, 0.6F, -0.05F, 0.0F, 0.0F, 0.19547687289441354F));

            PartDefinition PygmyEarLeft = Head.addOrReplaceChild("PygmyEarLeft", CubeListBuilder.create().texOffs(20, 0).mirror(true).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(1.4F, -0.5F, -0.2F, 0.0F, -0.35185837453889574F, 0.3909537457888271F));

            PartDefinition PygmyEarRight = Head.addOrReplaceChild("PygmyEarRight", CubeListBuilder.create().texOffs(20, 0).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F, 0.1F, 0.0F)), PartPose.offsetAndRotation(-1.4F, -0.5F, -0.2F, 0.0F, 0.35185837453889574F, -0.3909537457888271F));

            PartDefinition EarLeft = Head.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(24, 0).mirror(true).addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(1.0F, 0.0F, -0.2F, 0.0F, -0.4300491170387584F, -0.3127630032889644F));

            PartDefinition CheekLeft = Head.addOrReplaceChild("CheekLeft", CubeListBuilder.create().texOffs(18, 5).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(1.0F, 0.6F, -0.05F, 0.0F, 0.0F, -0.19547687289441354F));

            PartDefinition UpperArmLeft = Chest.addOrReplaceChild("UpperArmLeft", CubeListBuilder.create().texOffs(9, 10).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(1.1F, 0.5F, -1.25F, 0.11728612207217244F, 0.0F, 0.0F));
            PartDefinition ArmLeft = UpperArmLeft.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(5, 10).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 1.8F, 0.0F, -0.35185837453889574F, 0.0F, 0.0F));
            PartDefinition HandLeft = ArmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(0, 12).addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.1F, 0.9F, 0.0F, 0.22410027861923298F, 0.0F, 0.0F));

            PartDefinition Hip = Chest.addOrReplaceChild("Hip", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -0.5F, -0.2F, 3.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-0.01F, -1.0F, 1.0F, -0.2923426497090502F, 0.0F, 0.0F));
            PartDefinition Tail = Hip.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(0, 10).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -0.5F, 1.8F, -0.5462880425584197F, 0.0F, 0.0F));

            PartDefinition ThighLeft = Hip.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(24, 8).addBox(-1.0F, -0.4F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(1.0F, 1.0F, 0.55F, 0.1494001912944076F, 0.0F, 0.0F));
            PartDefinition LegLeft = ThighLeft.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(19, 9).addBox(-0.5F, 0.2F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 1.1F, -0.5F, 0.4855505925785003F, 0.0F, 0.0F));
            PartDefinition FootLeft = LegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(13, 10).addBox(-0.5F, -0.5F, -1.3F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.01F, 2.3F, 0.3F, -0.2988003825888152F, 0.0F, 0.0F));

            PartDefinition ThighRight = Hip.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(24, 8).mirror(true).addBox(-1.0F, -0.4F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-1.0F, 1.0F, 0.55F, 0.1494001912944076F, 0.0F, 0.0F));
            PartDefinition LegRight = ThighRight.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(19, 9).mirror(true).addBox(-0.5F, 0.2F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 1.1F, -0.5F, 0.4855505925785003F, 0.0F, 0.0F));
            PartDefinition FootRight = LegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(13, 10).mirror(true).addBox(-0.5F, -0.5F, -1.3F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-0.01F, 2.3F, 0.3F, -0.2988003825888152F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 32, 16);
        }

        @Override
        public void setupAnim(LorisEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
            this.Head.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos(limbSwing * speed * 0.1F + 3.1415927F) * degree * 0.2F * limbSwingAmount * 0.5F - 0.228F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (entity.isSprinting()) {
                float speed = 1.5f;
                float degree = 0.4f;
            } else {
                float speed = 0.9f;
                float degree = 0.6f;
                this.UpperArmLeft.xRot = Mth.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.117F;
                this.ArmLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F - 0.352F;
                this.HandLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F + 0.224F;
                this.UpperArmRight.xRot = Mth.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F + 0.117F;
                this.ArmRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.5F * limbSwingAmount * 0.5F - 0.352F;
                this.HandRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.224F;

                this.ThighLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F + 0.149F;
                this.LegLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.485F;
                this.FootLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.5F * limbSwingAmount * 0.5F - 0.299F;
                this.ThighRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.149F;
                this.LegRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 3.0F * limbSwingAmount * 0.5F + 0.485F;
                this.FootRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F - 0.299F;

                this.Chest.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * 0.15F * limbSwingAmount * 0.5F + (this.isSwimming ? -0.2F : +0.046F);
                this.Hip.xRot = Mth.cos(1.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * -0.17F * limbSwingAmount * 0.5F - 0.292F;
                this.Neck.xRot = Mth.cos(limbSwing * speed * 0.0F + 3.1415927F) * degree * 0.0F * limbSwingAmount * 0.5F - 0.227F;

                this.Tail.xRot = Mth.cos(5.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * 0.3F * limbSwingAmount * 0.5F + (this.isSwimming ? 0.2F : -0.546F);
            }
        }
    }
}
