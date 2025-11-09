package com.github.artyarticus.ecoregions.client.model;

import com.github.artyarticus.ecoregions.entity.SeriemaEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class SeriemaModel extends ZawaBaseModel<SeriemaEntity> {
    public ModelPart Body;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Body);
        }

        return this.parts;
    }

    public static class Adult extends SeriemaModel {

        public ModelPart Neck1;
        public ModelPart TailBase;
        public ModelPart Wing1Right;
        public ModelPart Wing1Left;
        public ModelPart ThighLeft;
        public ModelPart ThighRight;
        public ModelPart Neck2;
        public ModelPart part2;
        public ModelPart TopBeak1;
        public ModelPart Tuft;
        public ModelPart BeakTip1;
        public ModelPart BeakBottom;
        public ModelPart HairMiddle;
        public ModelPart Hair1Left;
        public ModelPart Hair1Right;
        public ModelPart Hair2Left;
        public ModelPart Hair3Left;
        public ModelPart Hair2Right;
        public ModelPart Hair3Right;
        public ModelPart TailMiddle;
        public ModelPart TailRight;
        public ModelPart TailLeft;
        public ModelPart Wing2Right;
        public ModelPart Wing2Left;
        public ModelPart Leg1Left;
        public ModelPart Leg2Left;
        public ModelPart FootLeft;
        public ModelPart Toe1Left;
        public ModelPart Toe2Left;
        public ModelPart Leg1Right;
        public ModelPart Leg2Right;
        public ModelPart FootRight;
        public ModelPart Toe1R;
        public ModelPart Toe2R;

        public Adult(ModelPart root) {
            this.Body = root.getChild("Body");
            this.ThighLeft = this.Body.getChild("ThighLeft");
            this.Leg1Left = this.ThighLeft.getChild("Leg1Left");
            this.Leg2Left = this.Leg1Left.getChild("Leg2Left");
            this.FootLeft = this.Leg2Left.getChild("FootLeft");
            this.Toe1Left = this.FootLeft.getChild("Toe1Left");

            this.Toe2Left = this.FootLeft.getChild("Toe2Left");

            this.Wing1Left = this.Body.getChild("Wing1Left");
            this.Wing2Left = this.Wing1Left.getChild("Wing2Left");

            this.Neck1 = this.Body.getChild("Neck1");
            this.Neck2 = this.Neck1.getChild("Neck2");
            this.part2 = this.Neck2.getChild("part2");
            this.TopBeak1 = this.part2.getChild("TopBeak1");
            this.BeakBottom = this.TopBeak1.getChild("BeakBottom");

            this.BeakTip1 = this.TopBeak1.getChild("BeakTip1");

            this.Tuft = this.part2.getChild("Tuft");
            this.HairMiddle = this.Tuft.getChild("HairMiddle");
            this.Hair1Left = this.HairMiddle.getChild("Hair1Left");
            this.Hair2Left = this.Hair1Left.getChild("Hair2Left");
            this.Hair3Left = this.Hair2Left.getChild("Hair3Left");

            this.Hair1Right = this.HairMiddle.getChild("Hair1Right");
            this.Hair2Right = this.Hair1Right.getChild("Hair2Right");
            this.Hair3Right = this.Hair2Right.getChild("Hair3Right");

            this.TailBase = this.Body.getChild("TailBase");
            this.TailMiddle = this.TailBase.getChild("TailMiddle");
            this.TailRight = this.TailMiddle.getChild("TailRight");

            this.TailLeft = this.TailMiddle.getChild("TailLeft");

            this.Wing1Right = this.Body.getChild("Wing1Right");
            this.Wing2Right = this.Wing1Right.getChild("Wing2Right");

            this.ThighRight = this.Body.getChild("ThighRight");
            this.Leg1Right = this.ThighRight.getChild("Leg1Right");
            this.Leg2Right = this.Leg1Right.getChild("Leg2Right");
            this.FootRight = this.Leg2Right.getChild("FootRight");
            this.Toe2R = this.FootRight.getChild("Toe2R");

            this.Toe1R = this.FootRight.getChild("Toe1R");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(38, 0).addBox(-2.5F, -3.0F, -3.5F, 5.0F, 6.0F, 7.0F), PartPose.offsetAndRotation(0.0F, 11.7F, 0.0F, -0.1563815016444822F, 0.0F, 0.0F));
            PartDefinition ThighLeft = Body.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(56, 28).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(1.4F, 1.7F, 0.0F, 0.5077162820683115F, 0.0F, 0.04555309164612875F));
            PartDefinition Leg1Left = ThighLeft.addOrReplaceChild("Leg1Left", CubeListBuilder.create().texOffs(51, 27).mirror(true).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 1.5F, 0.0F, -0.23457224414434488F, 0.0F, 0.0F));
            PartDefinition Leg2Left = Leg1Left.addOrReplaceChild("Leg2Left", CubeListBuilder.create().texOffs(46, 25).mirror(true).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 6.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 4.0F, 0.5F, -0.13020156286456727F, 0.0F, -0.04555309164612875F));
            PartDefinition FootLeft = Leg2Left.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(38, 26).mirror(true).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 5.4F, 0.0F, 0.1171115934746098F, 0.0F, 0.0F));
            PartDefinition Toe1Left = FootLeft.addOrReplaceChild("Toe1Left", CubeListBuilder.create().texOffs(38, 26).mirror(true).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, -0.1F)), PartPose.offsetAndRotation(0.0F, 0.1F, 0.0F, 0.0F, -0.19495327877934715F, 0.0F));

            PartDefinition Toe2Left = FootLeft.addOrReplaceChild("Toe2Left", CubeListBuilder.create().texOffs(38, 26).mirror(true).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, -0.1F)), PartPose.offsetAndRotation(0.0F, 0.1F, 0.0F, 0.0F, 0.19495327877934715F, 0.0F));

            PartDefinition Wing1Left = Body.addOrReplaceChild("Wing1Left", CubeListBuilder.create().texOffs(48, 14).addBox(-1.0F, 0.0F, -1.1F, 2.0F, 5.0F, 6.0F), PartPose.offsetAndRotation(2.0F, -3.4F, -3.0F, 0.03909537541112055F, 0.03909537541112055F, 0.03909537541112055F));
            PartDefinition Wing2Left = Wing1Left.addOrReplaceChild("Wing2Left", CubeListBuilder.create().texOffs(35, 16).addBox(-0.5F, -0.9F, 0.0F, 1.0F, 4.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 0.9F, 4.5F, -0.27366763203903305F, -0.0781907508222411F, -0.03909537541112055F));

            PartDefinition Neck1 = Body.addOrReplaceChild("Neck1", CubeListBuilder.create().texOffs(23, 5).addBox(-2.0F, -4.3F, -2.5F, 4.0F, 5.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 1.9F, -3.5F, -0.3909537457888271F, 0.0F, 0.0F));
            PartDefinition Neck2 = Neck1.addOrReplaceChild("Neck2", CubeListBuilder.create().texOffs(12, 3).addBox(-1.0F, -6.7F, -0.4F, 2.0F, 7.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -2.3F, 0.46914448828868976F, 0.0F, 0.0F));
            PartDefinition part2 = Neck2.addOrReplaceChild("part2", CubeListBuilder.create().texOffs(0, 25).addBox(-1.5F, -1.5F, -2.0F, 3.0F, 3.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -7.4F, 0.5F, 0.2733185581991509F, 0.0F, 0.0F));
            PartDefinition TopBeak1 = part2.addOrReplaceChild("TopBeak1", CubeListBuilder.create().texOffs(14, 26).addBox(-0.5F, 0.3F, -2.5F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -0.8F, -2.2F, 0.32567843575898076F, 0.0F, 0.0F));
            PartDefinition BeakBottom = TopBeak1.addOrReplaceChild("BeakBottom", CubeListBuilder.create().texOffs(15, 27).addBox(-0.5F, -0.6F, -2.4F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.01F, 2.0F, 0.0F, -0.39112828270876815F, 0.0F, 0.0F));

            PartDefinition BeakTip1 = TopBeak1.addOrReplaceChild("BeakTip1", CubeListBuilder.create().texOffs(16, 28).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.01F, 0.3F, -2.5F, -0.9105382388075086F, 0.0F, 0.0F));

            PartDefinition Tuft = part2.addOrReplaceChild("Tuft", CubeListBuilder.create().texOffs(0, 23).addBox(-1.5F, -0.5F, -0.7F, 3.0F, 1.0F, 1.0F), PartPose.offset(-0.01F, -1.0F, -1.8F));
            PartDefinition HairMiddle = Tuft.addOrReplaceChild("HairMiddle", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -3.0F, -2.0F, 0.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.8F, 0.3F, 0.5082398928281348F, 0.0F, 0.0F));
            PartDefinition Hair1Left = HairMiddle.addOrReplaceChild("Hair1Left", CubeListBuilder.create().texOffs(0, 0).addBox(0.2F, -3.0F, -2.0F, 0.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1563815016444822F));
            PartDefinition Hair2Left = Hair1Left.addOrReplaceChild("Hair2Left", CubeListBuilder.create().texOffs(0, 0).addBox(0.2F, -3.0F, -2.0F, 0.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1563815016444822F, 0.0F, 0.1563815016444822F));
            PartDefinition Hair3Left = Hair2Left.addOrReplaceChild("Hair3Left", CubeListBuilder.create().texOffs(0, 0).addBox(0.2F, -3.0F, -2.0F, 0.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.2F, -0.11728612207217244F, 0.0F, 0.1563815016444822F));

            PartDefinition Hair1Right = HairMiddle.addOrReplaceChild("Hair1Right", CubeListBuilder.create().texOffs(0, 0).addBox(-0.2F, -3.0F, -2.0F, 0.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1563815016444822F));
            PartDefinition Hair2Right = Hair1Right.addOrReplaceChild("Hair2Right", CubeListBuilder.create().texOffs(0, 0).addBox(-0.2F, -3.0F, -2.0F, 0.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1563815016444822F, 0.0F, -0.1563815016444822F));
            PartDefinition Hair3Right = Hair2Right.addOrReplaceChild("Hair3Right", CubeListBuilder.create().texOffs(0, 0).addBox(-0.2F, -3.0F, -2.0F, 0.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.2F, -0.11728612207217244F, 0.0F, -0.1563815016444822F));

            PartDefinition TailBase = Body.addOrReplaceChild("TailBase", CubeListBuilder.create().texOffs(22, 24).addBox(-2.0F, 0.0F, -4.0F, 4.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -3.0F, 3.0F, 1.2512265833653122F, 0.0F, 0.0F));
            PartDefinition TailMiddle = TailBase.addOrReplaceChild("TailMiddle", CubeListBuilder.create().texOffs(1, 14).addBox(-1.0F, 0.0F, -0.9F, 2.0F, 8.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 4.0F, -0.15F, -0.11746065899211351F, 0.0F, 0.0F));
            PartDefinition TailRight = TailMiddle.addOrReplaceChild("TailRight", CubeListBuilder.create().texOffs(10, 14).addBox(0.0F, -0.6F, -1.0F, 2.0F, 8.0F, 1.0F), PartPose.offsetAndRotation(-1.7F, 0.2F, -0.15F, -0.04555309164612875F, -0.0911061832922575F, -0.04712389063608474F));

            PartDefinition TailLeft = TailMiddle.addOrReplaceChild("TailLeft", CubeListBuilder.create().texOffs(10, 14).addBox(-2.0F, -0.6F, -1.0F, 2.0F, 8.0F, 1.0F), PartPose.offsetAndRotation(1.7F, 0.2F, -0.15F, -0.04555309164612875F, 0.0911061832922575F, 0.04712389063608474F));

            PartDefinition Wing1Right = Body.addOrReplaceChild("Wing1Right", CubeListBuilder.create().texOffs(48, 14).mirror(true).addBox(-1.0F, 0.0F, -1.1F, 2.0F, 5.0F, 6.0F), PartPose.offsetAndRotation(-2.0F, -3.4F, -3.0F, 0.03909537541112055F, -0.03909537541112055F, 0.03909537541112055F));
            PartDefinition Wing2Right = Wing1Right.addOrReplaceChild("Wing2Right", CubeListBuilder.create().texOffs(35, 16).mirror(true).addBox(-0.5F, -0.9F, 0.0F, 1.0F, 4.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 0.9F, 4.5F, -0.27366763203903305F, 0.0781907508222411F, -0.03909537541112055F));

            PartDefinition ThighRight = Body.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(56, 28).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-1.4F, 1.7F, 0.0F, 0.5077162820683115F, 0.0F, -0.04555309164612875F));
            PartDefinition Leg1Right = ThighRight.addOrReplaceChild("Leg1Right", CubeListBuilder.create().texOffs(51, 27).mirror(true).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 1.5F, 0.0F, -0.23457224414434488F, 0.0F, 0.0F));
            PartDefinition Leg2Right = Leg1Right.addOrReplaceChild("Leg2Right", CubeListBuilder.create().texOffs(46, 25).mirror(true).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 6.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 4.0F, 0.5F, -0.13020156286456727F, 0.0F, 0.04555309164612875F));
            PartDefinition FootRight = Leg2Right.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(38, 26).mirror(true).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 5.4F, 0.0F, 0.1171115934746098F, 0.0F, 0.0F));
            PartDefinition Toe2R = FootRight.addOrReplaceChild("Toe2R", CubeListBuilder.create().texOffs(38, 26).mirror(true).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, -0.1F)), PartPose.offsetAndRotation(0.0F, 0.1F, 0.0F, 0.0F, 0.19495327877934715F, 0.0F));

            PartDefinition Toe1R = FootRight.addOrReplaceChild("Toe1R", CubeListBuilder.create().texOffs(38, 26).mirror(true).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, -0.1F)), PartPose.offsetAndRotation(0.0F, 0.1F, 0.0F, 0.0F, -0.19495327877934715F, 0.0F));

            return LayerDefinition.create(meshDefinition, 64, 32);
        }

        @Override
        public void setupAnim(SeriemaEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck2.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.part2.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.part2.xRot = (headPitch / (180F / (float) Math.PI)) + 0.27F;
            this.part2.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck1.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.1F) * 0.5F - 0.39F;
            this.part2.xRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.27F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            }

            if (entity.isSprinting()) {
                float speed = 1.0f;
                float degree = 0.5f;
                this.Neck2.xRot = Mth.cos(6.0F + limbSwing * speed * 0.7F) * limbSwingAmount * (degree * 0.7F) * 0.5F + 0.47F;
                this.part2.xRot = Mth.cos(5F + limbSwing * speed * 0.7F) * limbSwingAmount * (degree * -0.9F) * 0.5F + 0.27F;
                this.Neck1.xRot = Mth.cos(3.0F + limbSwing * speed * 0.7F) * limbSwingAmount * (degree * 0.6F) * 0.5F - 0.39F;
                this.TailBase.xRot = Mth.cos(2.0F + limbSwing * speed * 0.7F) * limbSwingAmount * (degree * -0.5F) * 0.5F + 1.25F;
                this.Body.xRot = Mth.cos(1.0F + limbSwing * speed * 0.7F) * limbSwingAmount * (degree * -0.5F) * 0.5F - 0.16F;
                this.Body.y = Mth.cos(2F + limbSwing * speed * 0.7F) * limbSwingAmount * (degree * -8F) * 0.5F + 11.7F;
                this.Body.zRot = Mth.cos(2F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * -0.3F) * 0.5F;
                this.Body.yRot = Mth.cos(2F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * -0.3F) * 0.5F;

                this.ThighLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * -4F) * 0.5F + 0.51F;
                this.ThighLeft.y = Mth.cos(7.0F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * 7F) * 0.5F + 1.7F;
                this.ThighLeft.z = Mth.cos(3.0F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * -8F) * 0.5F;
                this.Leg1Left.xRot = Mth.cos(0.5F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * 4F) * 0.5F - 0.23F;
                this.Toe1Left.xRot = Mth.cos(2.0F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * 3F) * 0.5F;

                this.ThighRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * 4F) * 0.5F + 0.51F;
                this.ThighRight.y = Mth.cos(7.0F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * -7F) * 0.5F + 1.7F;
                this.ThighRight.z = Mth.cos(3.0F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * 8F) * 0.5F;
                this.Leg1Right.xRot = Mth.cos(0.5F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * -4F) * 0.5F - 0.23F;
                this.Toe1R.xRot = Mth.cos(2.0F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * -3F) * 0.5F;


            } else {
                float speed = 1.5f;
                float degree = 1.0f;
                this.Neck2.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 0.47F;
                this.part2.xRot = Mth.cos(2.2F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.5F) * 0.5F + 0.27F;
                this.Neck1.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.1F) * 0.5F - 0.39F;
                this.TailBase.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.05F) * 0.5F + 1.25F;
                this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.05F) * 0.5F - 0.16F;
                this.Body.y = Mth.cos(4.5F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree) * 0.5F + 11.7F;

                this.ThighLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.51F;
                this.ThighLeft.y = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 1.7F;
                this.Leg1Left.xRot = Mth.cos(0.5F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 3F) * 0.5F - 0.23F;
                this.Toe1Left.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F;

                this.ThighRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.51F;
                this.ThighRight.y = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 1.7F;
                this.Leg1Right.xRot = Mth.cos(0.5F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -3F) * 0.5F - 0.23F;
                this.Toe1R.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F;
            }
        }
    }

    public static class Child extends SeriemaModel {

        public ModelPart Tail;
        public ModelPart Neck;
        public ModelPart ThighLeft;
        public ModelPart WingLeft;
        public ModelPart WingRight;
        public ModelPart ThighRight;
        public ModelPart Head;
        public ModelPart TopBeak;
        public ModelPart HairMiddle;
        public ModelPart Beak;
        public ModelPart BeakTip;
        public ModelPart Hair1Left;
        public ModelPart Hair1Right;
        public ModelPart Hair2Left;
        public ModelPart Hair2Right;
        public ModelPart Leg1Left;
        public ModelPart Leg2Left;
        public ModelPart FootLeft;
        public ModelPart Toe1Left;
        public ModelPart Toe2Left;
        public ModelPart Leg1Right;
        public ModelPart Leg2Right;
        public ModelPart FootRight;
        public ModelPart Toe1Right;
        public ModelPart Toe2Right;

        public Child(ModelPart root) {
            this.Body = root.getChild("Body");
            this.ThighLeft = this.Body.getChild("ThighLeft");
            this.Leg1Left = this.ThighLeft.getChild("Leg1Left");
            this.Leg2Left = this.Leg1Left.getChild("Leg2Left");
            this.FootLeft = this.Leg2Left.getChild("FootLeft");
            this.Toe1Left = this.FootLeft.getChild("Toe1Left");

            this.Toe2Left = this.FootLeft.getChild("Toe2Left");

            this.Tail = this.Body.getChild("Tail");

            this.WingLeft = this.Body.getChild("WingLeft");

            this.ThighRight = this.Body.getChild("ThighRight");
            this.Leg1Right = this.ThighRight.getChild("Leg1Right");
            this.Leg2Right = this.Leg1Right.getChild("Leg2Right");
            this.FootRight = this.Leg2Right.getChild("FootRight");
            this.Toe2Right = this.FootRight.getChild("Toe2Right");

            this.Toe1Right = this.FootRight.getChild("Toe1Right");

            this.Neck = this.Body.getChild("Neck");
            this.Head = this.Neck.getChild("Head");
            this.HairMiddle = this.Head.getChild("HairMiddle");
            this.Hair1Right = this.HairMiddle.getChild("Hair1Right");
            this.Hair2Right = this.Hair1Right.getChild("Hair2Right");

            this.Hair1Left = this.HairMiddle.getChild("Hair1Left");
            this.Hair2Left = this.Hair1Left.getChild("Hair2Left");

            this.TopBeak = this.Head.getChild("TopBeak");
            this.Beak = this.TopBeak.getChild("Beak");

            this.BeakTip = this.TopBeak.getChild("BeakTip");

            this.WingRight = this.Body.getChild("WingRight");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 17.4F, 0.0F, -0.3522074483787779F, 0.0F, 0.0F));
            PartDefinition ThighLeft = Body.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(20, 8).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F, 0.0F, 0.0F)), PartPose.offsetAndRotation(1.0F, 1.7F, 1.4F, 0.6250024291076193F, 0.0F, -0.04555309164612875F));
            PartDefinition Leg1Left = ThighLeft.addOrReplaceChild("Leg1Left", CubeListBuilder.create().texOffs(28, 9).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, -0.23457224414434488F, 0.0F, 0.0F));
            PartDefinition Leg2Left = Leg1Left.addOrReplaceChild("Leg2Left", CubeListBuilder.create().texOffs(28, 12).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 2.0F, 0.5F, -0.13020156286456727F, 0.0F, 0.04555309164612875F));
            PartDefinition FootLeft = Leg2Left.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(21, 13).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 1.8F, 0.0F, 0.1171115934746098F, 0.0F, 0.0F));
            PartDefinition Toe1Left = FootLeft.addOrReplaceChild("Toe1Left", CubeListBuilder.create().texOffs(21, 13).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.1F)), PartPose.offsetAndRotation(0.0F, 0.1F, 0.0F, 0.0F, -0.19495327877934715F, 0.0F));

            PartDefinition Toe2Left = FootLeft.addOrReplaceChild("Toe2Left", CubeListBuilder.create().texOffs(21, 13).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.1F)), PartPose.offsetAndRotation(0.0F, 0.1F, 0.0F, 0.0F, 0.19495327877934715F, 0.0F));

            PartDefinition Tail = Body.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(13, 0).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 2.5F, -0.3127630032889644F, 0.0F, 0.0F));

            PartDefinition WingLeft = Body.addOrReplaceChild("WingLeft", CubeListBuilder.create().texOffs(22, 1).addBox(0.0F, -1.5F, 0.2F, 1.0F, 3.0F, 4.0F), PartPose.offsetAndRotation(1.6F, 0.0F, -2.0F, 0.11728612207217244F, -0.03909537541112055F, 0.0F));

            PartDefinition ThighRight = Body.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(20, 8).mirror(true).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-1.0F, 1.7F, 1.4F, 0.6250024291076193F, 0.0F, 0.04555309164612875F));
            PartDefinition Leg1Right = ThighRight.addOrReplaceChild("Leg1Right", CubeListBuilder.create().texOffs(28, 9).mirror(true).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, -0.23457224414434488F, 0.0F, 0.0F));
            PartDefinition Leg2Right = Leg1Right.addOrReplaceChild("Leg2Right", CubeListBuilder.create().texOffs(28, 12).mirror(true).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 2.0F, 0.5F, -0.13020156286456727F, 0.0F, -0.04555309164612875F));
            PartDefinition FootRight = Leg2Right.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(21, 13).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 1.8F, 0.0F, 0.1171115934746098F, 0.0F, 0.0F));
            PartDefinition Toe2Right = FootRight.addOrReplaceChild("Toe2Right", CubeListBuilder.create().texOffs(21, 13).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.1F)), PartPose.offsetAndRotation(0.0F, 0.1F, 0.0F, 0.0F, 0.19495327877934715F, 0.0F));

            PartDefinition Toe1Right = FootRight.addOrReplaceChild("Toe1Right", CubeListBuilder.create().texOffs(21, 13).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.1F)), PartPose.offsetAndRotation(0.0F, 0.1F, 0.0F, 0.0F, -0.19495327877934715F, 0.0F));

            PartDefinition Neck = Body.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(12, 9).addBox(-1.0F, -3.5F, -1.2F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, 0.1F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.5F, 0.5084143964585622F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 9).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.2F)), PartPose.offsetAndRotation(0.0F, -3.0F, -0.5F, -1.7453292129831807E-4F, 0.0F, 0.0F));
            PartDefinition HairMiddle = Head.addOrReplaceChild("HairMiddle", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -0.6F, -0.5F, 0.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -0.7F, -1.5F, 0.7037167490777915F, 0.0F, 0.0F));
            PartDefinition Hair1Right = HairMiddle.addOrReplaceChild("Hair1Right", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -0.6F, -0.5F, 0.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-0.2F, 0.0F, 0.0F, 0.0F, 0.19547687289441354F, -0.19547687289441354F));
            PartDefinition Hair2Right = Hair1Right.addOrReplaceChild("Hair2Right", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -0.6F, -0.5F, 0.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-0.2F, 0.0F, 0.0F, 0.0F, 0.19547687289441354F, -0.19547687289441354F));

            PartDefinition Hair1Left = HairMiddle.addOrReplaceChild("Hair1Left", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -0.6F, -0.5F, 0.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.2F, 0.0F, 0.0F, 0.0F, -0.19547687289441354F, 0.19547687289441354F));
            PartDefinition Hair2Left = Hair1Left.addOrReplaceChild("Hair2Left", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -0.6F, -0.5F, 0.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.2F, 0.0F, 0.0F, 0.0F, -0.19547687289441354F, 0.19547687289441354F));

            PartDefinition TopBeak = Head.addOrReplaceChild("TopBeak", CubeListBuilder.create().texOffs(0, 15).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -0.6F, -1.3F, 0.43022365395869955F, 0.0F, 0.0F));
            PartDefinition Beak = TopBeak.addOrReplaceChild("Beak", CubeListBuilder.create().texOffs(6, 15).addBox(-0.5F, -0.5F, -1.6F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.01F, 1.3F, -0.8F, -0.5082398928281348F, 0.0F, 0.0F));

            PartDefinition BeakTip = TopBeak.addOrReplaceChild("BeakTip", CubeListBuilder.create().texOffs(12, 16).addBox(-0.5F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.01F, 0.49F, -1.9F, 0.3127630032889644F, 0.0F, 0.0F));

            PartDefinition WingRight = Body.addOrReplaceChild("WingRight", CubeListBuilder.create().texOffs(22, 1).mirror(true).addBox(-1.0F, -1.5F, 0.2F, 1.0F, 3.0F, 4.0F), PartPose.offsetAndRotation(-1.6F, 0.0F, -2.0F, 0.11728612207217244F, 0.03909537541112055F, 0.0F));

            return LayerDefinition.create(meshDefinition, 32, 32);
        }

        @Override
        public void setupAnim(SeriemaEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.2f;
            float degree = 1.0f;
            this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.352F;
            this.Body.y = Mth.cos(4.5F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree) * 0.5F + 17.4F;

            this.ThighLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.625F;
            this.ThighLeft.y = Mth.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 2F) * 0.5F + 1.7F;
            this.Leg1Left.xRot = Mth.cos(0.5F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 3F) * 0.5F - 0.234F;
            this.FootLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.117F;
            this.ThighRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.625F;
            this.ThighRight.y = Mth.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -2F) * 0.5F + 1.7F;
            this.Leg1Right.xRot = Mth.cos(0.5F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -3F) * 0.5F - 0.234F;
            this.FootRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.117F;

        }
    }
}



