package com.github.artyarticus.ecoregions.client.model;

import com.github.artyarticus.ecoregions.entity.BlackbuckEntity;
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

public abstract class BlackbuckModel extends ZawaBaseModel<BlackbuckEntity> {
    public ModelPart Chest;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Chest);
        }

        return this.parts;
    }

    public static class Adult extends BlackbuckModel {

        public ModelPart Body;
        public ModelPart ArmBaseLeft;
        public ModelPart ArmBaseRight;
        public ModelPart Neck;
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
        public ModelPart UpperArmRight;
        public ModelPart ArmRight;
        public ModelPart HandRight;
        public ModelPart NeckBase;
        public ModelPart Head;
        public ModelPart EarLeft;
        public ModelPart Snout;
        public ModelPart EarRight;
        public ModelPart Horn1Left;
        public ModelPart Horn1Right;
        public ModelPart TopSnout;
        public ModelPart Mouth;
        public ModelPart Horn2Left;
        public ModelPart Horn3Left;
        public ModelPart Horn4Left;
        public ModelPart Horn5Left;
        public ModelPart Horn6Left;
        public ModelPart Horn2Right;
        public ModelPart Horn3Right;
        public ModelPart Horn4Right;
        public ModelPart Horn5Right;
        public ModelPart Horn6Right;

        public Adult(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.Body = this.Chest.getChild("Body");
            this.Hips = this.Body.getChild("Hips");
            this.Tail = this.Hips.getChild("Tail");

            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.UpperLegLeft = this.ThighLeft.getChild("UpperLegLeft");
            this.LowerLegLeft = this.UpperLegLeft.getChild("LowerLegLeft");
            this.FootLeft = this.LowerLegLeft.getChild("FootLeft");

            this.ThighRight = this.Hips.getChild("ThighRight");
            this.UpperLegRight = this.ThighRight.getChild("UpperLegRight");
            this.LowerLegRight = this.UpperLegRight.getChild("LowerLegRight");
            this.FootRight = this.LowerLegRight.getChild("FootRight");

            this.ArmBaseLeft = this.Chest.getChild("ArmBaseLeft");
            this.UpperArmLeft = this.ArmBaseLeft.getChild("UpperArmLeft");
            this.ArmLeft = this.UpperArmLeft.getChild("ArmLeft");
            this.HandLeft = this.ArmLeft.getChild("HandLeft");

            this.Neck = this.Chest.getChild("Neck");
            this.Head = this.Neck.getChild("Head");
            this.Snout = this.Head.getChild("Snout");
            this.Mouth = this.Snout.getChild("Mouth");

            this.TopSnout = this.Snout.getChild("TopSnout");

            this.EarRight = this.Head.getChild("EarRight");

            this.Horn1Right = this.Head.getChild("Horn1Right");
            this.Horn2Right = this.Horn1Right.getChild("Horn2Right");
            this.Horn3Right = this.Horn2Right.getChild("Horn3Right");
            this.Horn4Right = this.Horn3Right.getChild("Horn4Right");
            this.Horn5Right = this.Horn4Right.getChild("Horn5Right");
            this.Horn6Right = this.Horn5Right.getChild("Horn6Right");

            this.Horn1Left = this.Head.getChild("Horn1Left");
            this.Horn2Left = this.Horn1Left.getChild("Horn2Left");
            this.Horn3Left = this.Horn2Left.getChild("Horn3Left");
            this.Horn4Left = this.Horn3Left.getChild("Horn4Left");
            this.Horn5Left = this.Horn4Left.getChild("Horn5Left");
            this.Horn6Left = this.Horn5Left.getChild("Horn6Left");

            this.EarLeft = this.Head.getChild("EarLeft");

            this.NeckBase = this.Neck.getChild("NeckBase");

            this.ArmBaseRight = this.Chest.getChild("ArmBaseRight");
            this.UpperArmRight = this.ArmBaseRight.getChild("UpperArmRight");
            this.ArmRight = this.UpperArmRight.getChild("ArmRight");
            this.HandRight = this.ArmRight.getChild("HandRight");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Chest = partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -3.0F, -2.5F, 5.0F, 6.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 11.4F, -6.0F, -0.45378560551852565F, 0.0F, 0.0F));
            PartDefinition Body = Chest.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 13).addBox(-3.0F, -7.0F, 0.0F, 6.0F, 7.0F, 8.0F), PartPose.offsetAndRotation(0.0F, 3.0F, 2.5F, 0.47123889803846897F, 0.0F, 0.0F));
            PartDefinition Hips = Body.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 37).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 6.0F, 5.0F), PartPose.offsetAndRotation(0.0F, -7.0F, 8.0F, -0.2617993877991494F, 0.0F, 0.0F));
            PartDefinition Tail = Hips.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(22, 46).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, 0.3186971254089062F, 0.0F, 0.0F));

            PartDefinition ThighLeft = Hips.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(0, 49).mirror(true).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 7.0F, 4.0F), PartPose.offsetAndRotation(2.0F, 1.0F, 2.0F, 0.2275909337942703F, 0.0F, 0.0F));
            PartDefinition UpperLegLeft = ThighLeft.addOrReplaceChild("UpperLegLeft", CubeListBuilder.create().texOffs(19, 54).mirror(true).addBox(-1.0F, -0.2F, -0.3F, 2.0F, 5.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 6.3F, -1.3F, 0.7330382858376184F, 0.0F, 0.0F));
            PartDefinition LowerLegLeft = UpperLegLeft.addOrReplaceChild("LowerLegLeft", CubeListBuilder.create().texOffs(32, 53).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 5.0F, 2.0F), PartPose.offsetAndRotation(-0.05F, 4.8F, 1.7F, -0.8203047484373349F, 0.0F, 0.0F));
            PartDefinition FootLeft = LowerLegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(41, 58).mirror(true).addBox(-1.1F, -0.5F, -1.6F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 4.5F, -1.0F, 0.13962634015954636F, 0.0F, 0.0F));

            PartDefinition ThighRight = Hips.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(0, 49).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 7.0F, 4.0F), PartPose.offsetAndRotation(-2.0F, 1.0F, 2.0F, 0.2275909337942703F, 0.0F, 0.0F));
            PartDefinition UpperLegRight = ThighRight.addOrReplaceChild("UpperLegRight", CubeListBuilder.create().texOffs(19, 54).addBox(-1.0F, -0.2F, -0.3F, 2.0F, 5.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 6.3F, -1.5F, 0.7330382858376184F, 0.0F, 0.0F));
            PartDefinition LowerLegRight = UpperLegRight.addOrReplaceChild("LowerLegRight", CubeListBuilder.create().texOffs(32, 53).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 5.0F, 2.0F), PartPose.offsetAndRotation(0.05F, 4.8F, 1.7F, -0.8203047484373349F, 0.0F, 0.0F));
            PartDefinition FootRight = LowerLegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(41, 58).addBox(-0.9F, -0.5F, -1.6F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 4.5F, -1.0F, 0.13962634015954636F, 0.0F, 0.0F));

            PartDefinition ArmBaseLeft = Chest.addOrReplaceChild("ArmBaseLeft", CubeListBuilder.create().texOffs(22, 34).mirror(true).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 6.0F, 4.0F), PartPose.offsetAndRotation(1.9F, -1.5F, -0.6F, 0.5462880425584197F, 0.0F, 0.0F));
            PartDefinition UpperArmLeft = ArmBaseLeft.addOrReplaceChild("UpperArmLeft", CubeListBuilder.create().texOffs(37, 35).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 5.8F, 1.0F, -0.08726646259971647F, 0.0F, 0.0F));
            PartDefinition ArmLeft = UpperArmLeft.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(46, 35).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 2.0F), PartPose.offset(-0.05F, 3.8F, -2.0F));
            PartDefinition HandLeft = ArmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(55, 37).mirror(true).addBox(-1.1F, -0.5F, -1.5F, 2.0F, 2.0F, 2.0F), PartPose.offset(0.0F, 3.5F, 1.0F));

            PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(21, 1).addBox(-1.5F, -0.5F, -5.4F, 3.0F, 3.0F, 7.0F), PartPose.offsetAndRotation(0.0F, -2.5F, -2.0F, -0.4098033003787853F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(47, 2).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 1.5F, -4.5F, 1.0471975511965976F, 0.0F, 0.0F));
            PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(50, 18).addBox(-1.5F, 0.0F, -3.5F, 3.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -1.0F, -1.4F, 0.0911061832922575F, 0.0F, 0.0F));
            PartDefinition Mouth = Snout.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(52, 25).addBox(-1.0F, 0.0F, -2.9F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 1.9F, -0.5F, -0.13665927909957545F, 0.0F, 0.0F));

            PartDefinition TopSnout = Snout.addOrReplaceChild("TopSnout", CubeListBuilder.create().texOffs(52, 12).addBox(-1.0F, -0.6F, -3.0F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2275909337942703F, 0.0F, 0.0F));

            PartDefinition EarRight = Head.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(44, 1).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(-1.8F, -0.8F, 0.6F, -0.7285004590772052F, 0.3186971254089062F, -0.7285004590772052F));

            PartDefinition Horn1Right = Head.addOrReplaceChild("Horn1Right", CubeListBuilder.create().texOffs(0, 30).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(-0.9F, -1.5F, -0.5F, -0.8196066007575706F, 0.0F, -0.500909508638178F));
            PartDefinition Horn2Right = Horn1Right.addOrReplaceChild("Horn2Right", CubeListBuilder.create().texOffs(5, 31).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-0.6F, -1.8F, 0.1F, 0.0F, 0.0F, 0.5462880425584197F));
            PartDefinition Horn3Right = Horn2Right.addOrReplaceChild("Horn3Right", CubeListBuilder.create().texOffs(10, 30).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.1F, -2.69F, -0.1F, 0.0F, 0.0F, -0.5462880425584197F));
            PartDefinition Horn4Right = Horn3Right.addOrReplaceChild("Horn4Right", CubeListBuilder.create().texOffs(15, 31).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-0.7F, -1.9F, 0.1F, 0.0F, 0.0F, 0.6373942508178124F));
            PartDefinition Horn5Right = Horn4Right.addOrReplaceChild("Horn5Right", CubeListBuilder.create().texOffs(10, 30).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.1F, -2.7F, -0.1F, 0.0F, 0.0F, -0.5462880425584197F));
            PartDefinition Horn6Right = Horn5Right.addOrReplaceChild("Horn6Right", CubeListBuilder.create().texOffs(15, 31).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.6F, -0.9F, 0.1F, 0.0F, 0.0F, 0.6373942508178124F));

            PartDefinition Horn1Left = Head.addOrReplaceChild("Horn1Left", CubeListBuilder.create().texOffs(0, 30).mirror(true).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.9F, -1.5F, -0.5F, -0.8196066007575706F, 0.0F, 0.500909508638178F));
            PartDefinition Horn2Left = Horn1Left.addOrReplaceChild("Horn2Left", CubeListBuilder.create().texOffs(5, 31).mirror(true).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.6F, -1.8F, 0.1F, 0.0F, 0.0F, -0.5462880425584197F));
            PartDefinition Horn3Left = Horn2Left.addOrReplaceChild("Horn3Left", CubeListBuilder.create().texOffs(10, 30).mirror(true).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(-0.1F, -2.68F, -0.1F, 0.0F, 0.0F, 0.5462880425584197F));
            PartDefinition Horn4Left = Horn3Left.addOrReplaceChild("Horn4Left", CubeListBuilder.create().texOffs(15, 31).mirror(true).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.7F, -1.9F, 0.1F, 0.0F, 0.0F, -0.6373942508178124F));
            PartDefinition Horn5Left = Horn4Left.addOrReplaceChild("Horn5Left", CubeListBuilder.create().texOffs(10, 30).mirror(true).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-0.1F, -2.7F, -0.1F, 0.0F, 0.0F, 0.5462880425584197F));
            PartDefinition Horn6Left = Horn5Left.addOrReplaceChild("Horn6Left", CubeListBuilder.create().texOffs(15, 31).mirror(true).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.6F, -0.9F, 0.1F, 0.0F, 0.0F, -0.6373942508178124F));

            PartDefinition EarLeft = Head.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(44, 1).mirror(true).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(1.8F, -0.8F, 0.6F, -0.7285004590772052F, -0.3186971254089062F, 0.7285004590772052F));

            PartDefinition NeckBase = Neck.addOrReplaceChild("NeckBase", CubeListBuilder.create().texOffs(36, 8).addBox(-1.0F, 0.0F, -5.5F, 2.0F, 2.0F, 6.0F), PartPose.offsetAndRotation(0.0F, 2.2F, 1.5F, -0.18203784630933073F, 0.0F, 0.0F));

            PartDefinition ArmBaseRight = Chest.addOrReplaceChild("ArmBaseRight", CubeListBuilder.create().texOffs(22, 34).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 6.0F, 4.0F), PartPose.offsetAndRotation(-1.9F, -1.5F, -0.6F, 0.5462880425584197F, 0.0F, 0.0F));
            PartDefinition UpperArmRight = ArmBaseRight.addOrReplaceChild("UpperArmRight", CubeListBuilder.create().texOffs(37, 35).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 5.8F, 1.0F, -0.08726646259971647F, 0.0F, 0.0F));
            PartDefinition ArmRight = UpperArmRight.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(46, 35).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 2.0F), PartPose.offset(0.05F, 3.8F, -2.0F));
            PartDefinition HandRight = ArmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(55, 37).addBox(-0.9F, -0.5F, -1.5F, 2.0F, 2.0F, 2.0F), PartPose.offset(0.0F, 3.5F, 1.0F));

            return LayerDefinition.create(meshDefinition, 64, 64);
        }

        @Override
        public void setupAnim(BlackbuckEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 1.047F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.409F;
            this.Head.xRot = Mth.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F + 1.047F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (entity.isSprinting()) {
                float speed = 1.0f;
                float degree = 0.5f;
                this.Neck.xRot = Mth.cos(1.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.409F;
                this.Head.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 1.047F;

                this.Chest.y = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -1F) * 0.5F + 11.4F;
                this.Chest.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.1F) * 0.5F - 0.453F;
                this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.471F;
                this.Hips.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.261F;

                this.ArmBaseLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.6F) * 0.5F + 0.546F;
                this.UpperArmLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.087F;
                this.ArmLeft.xRot = Mth.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree) * 0.5F;
                this.HandLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;
                this.ArmBaseRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.6F) * 0.5F + 0.546F;
                this.UpperArmRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.087F;
                this.ArmRight.xRot = Mth.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1F) * 0.5F;
                this.HandRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;

                this.ThighLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.3F) * 0.5F + 0.227F;
                this.UpperLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.733F;
                this.LowerLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.820F;
                this.FootLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.139F;
                this.ThighRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.3F) * 0.5F + 0.227F;
                this.UpperLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.733F;
                this.LowerLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.820F;
                this.FootRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.139F;

            } else {
                float speed = 0.8f;
                float degree = 0.6f;
                this.Neck.xRot = Mth.cos(1.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.409F;
                this.Head.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 1.047F;

                this.Chest.y = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -1F) * 0.5F + 11.4F;
                this.Chest.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.1F) * 0.5F - 0.453F;
                this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.471F;
                this.Hips.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.261F;

                this.ArmBaseLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.6F) * 0.5F + 0.546F;
                this.UpperArmLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.087F;
                this.ArmLeft.xRot = Mth.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree) * 0.5F;
                this.HandLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;
                this.ArmBaseRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.6F) * 0.5F + 0.546F;
                this.UpperArmRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.087F;
                this.ArmRight.xRot = Mth.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1F) * 0.5F;
                this.HandRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;

                this.ThighLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.3F) * 0.5F + 0.227F;
                this.UpperLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.733F;
                this.LowerLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.820F;
                this.FootLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.139F;
                this.ThighRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.3F) * 0.5F + 0.227F;
                this.UpperLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.733F;
                this.LowerLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.820F;
                this.FootRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.139F;
            }
        }
    }

    public static class Child extends BlackbuckModel {

        public ModelPart Body;
        public ModelPart Neck;
        public ModelPart ArmBaseLeft;
        public ModelPart ArmBaseRight;
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
        public ModelPart NeckBottom;
        public ModelPart EarLeft;
        public ModelPart EarRight;
        public ModelPart Snout;
        public ModelPart TopSnout;
        public ModelPart Mouth;
        public ModelPart UpperArmLeft;
        public ModelPart ArmLeft;
        public ModelPart HandLeft;
        public ModelPart UpperArmRight;
        public ModelPart ArmRight;
        public ModelPart HandRight;

        public Child(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.ArmBaseLeft = this.Chest.getChild("ArmBaseLeft");
            this.UpperArmLeft = this.ArmBaseLeft.getChild("UpperArmLeft");
            this.ArmLeft = this.UpperArmLeft.getChild("ArmLeft");
            this.HandLeft = this.ArmLeft.getChild("HandLeft");

            this.Neck = this.Chest.getChild("Neck");
            this.NeckBottom = this.Neck.getChild("NeckBottom");

            this.Head = this.Neck.getChild("Head");
            this.EarLeft = this.Head.getChild("EarLeft");

            this.Snout = this.Head.getChild("Snout");
            this.TopSnout = this.Snout.getChild("TopSnout");

            this.Mouth = this.Snout.getChild("Mouth");

            this.EarRight = this.Head.getChild("EarRight");

            this.ArmBaseRight = this.Chest.getChild("ArmBaseRight");
            this.UpperArmRight = this.ArmBaseRight.getChild("UpperArmRight");
            this.ArmRight = this.UpperArmRight.getChild("ArmRight");
            this.HandRight = this.ArmRight.getChild("HandRight");

            this.Body = this.Chest.getChild("Body");
            this.Tail = this.Body.getChild("Tail");

            this.ThighRight = this.Body.getChild("ThighRight");
            this.UpperLegRight = this.ThighRight.getChild("UpperLegRight");
            this.LowerLegRight = this.UpperLegRight.getChild("LowerLegRight");
            this.FootRight = this.LowerLegRight.getChild("FootRight");

            this.ThighLeft = this.Body.getChild("ThighLeft");
            this.UpperLegLeft = this.ThighLeft.getChild("UpperLegLeft");
            this.LowerLegLeft = this.UpperLegLeft.getChild("LowerLegLeft");
            this.FootLeft = this.LowerLegLeft.getChild("FootLeft");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Chest = partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(13, 0).addBox(-1.5F, -2.0F, -2.0F, 3.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 15.9F, -2.5F, -0.2275909337942703F, 0.0F, 0.0F));
            PartDefinition ArmBaseLeft = Chest.addOrReplaceChild("ArmBaseLeft", CubeListBuilder.create().texOffs(15, 22).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(1.1F, 0.2F, -1.0F, 0.3490658503988659F, 0.0F, 0.0F));
            PartDefinition UpperArmLeft = ArmBaseLeft.addOrReplaceChild("UpperArmLeft", CubeListBuilder.create().texOffs(24, 23).mirror(true).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 2.8F, 0.5F, -0.08726646259971647F, 0.0F, 0.0F));
            PartDefinition ArmLeft = UpperArmLeft.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(16, 27).mirror(true).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F), PartPose.offset(-0.05F, 2.0F, -1.0F));
            PartDefinition HandLeft = ArmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(21, 29).mirror(true).addBox(-0.5F, 0.0F, -0.7F, 1.0F, 1.0F, 1.0F), PartPose.offset(-0.1F, 2.5F, 0.3F));

            PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 5.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -1.0F, -2.0F, 0.9105382388075086F, 0.0F, 0.0F));
            PartDefinition NeckBottom = Neck.addOrReplaceChild("NeckBottom", CubeListBuilder.create().texOffs(0, 8).addBox(-0.5F, -2.0F, -1.3F, 1.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -0.5F, -0.0911061832922575F, 0.0F, 0.0F));

            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(19, 9).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -2.6F, -1.0F, -0.591841146688116F, 0.0F, 0.0F));
            PartDefinition EarLeft = Head.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(26, 28).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(1.0F, -0.5F, 0.6F, 0.0F, -0.4098033003787853F, 0.7740534966278743F));

            PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(24, 5).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.13962634015954636F, 0.0F, 0.0F));
            PartDefinition TopSnout = Snout.addOrReplaceChild("TopSnout", CubeListBuilder.create().texOffs(24, 1).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -0.7F, -0.1F, 0.4098033003787853F, 0.0F, 0.0F));

            PartDefinition Mouth = Snout.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(0, 13).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.4F, 0.1F, -0.04555309164612875F, 0.0F, 0.0F));

            PartDefinition EarRight = Head.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(26, 28).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(-1.0F, -0.5F, 0.6F, 0.0F, 0.4098033003787853F, -0.7740534966278743F));

            PartDefinition ArmBaseRight = Chest.addOrReplaceChild("ArmBaseRight", CubeListBuilder.create().texOffs(15, 22).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-1.1F, 0.2F, -1.0F, 0.3490658503988659F, 0.0F, 0.0F));
            PartDefinition UpperArmRight = ArmBaseRight.addOrReplaceChild("UpperArmRight", CubeListBuilder.create().texOffs(24, 23).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 2.8F, 0.5F, -0.08726646259971647F, 0.0F, 0.0F));
            PartDefinition ArmRight = UpperArmRight.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(16, 27).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F), PartPose.offset(0.05F, 2.0F, -1.0F));
            PartDefinition HandRight = ArmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(21, 29).addBox(-0.5F, 0.0F, -0.7F, 1.0F, 1.0F, 1.0F), PartPose.offset(0.1F, 2.5F, 0.3F));

            PartDefinition Body = Chest.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 9).addBox(-2.0F, -0.5F, -1.0F, 4.0F, 4.0F, 7.0F), PartPose.offsetAndRotation(0.0F, -1.5F, 0.0F, 0.2275909337942703F, 0.0F, 0.0F));
            PartDefinition Tail = Body.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(9, 0).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 5.5F, 0.45535640450848164F, 0.0F, 0.0F));

            PartDefinition ThighRight = Body.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(0, 21).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(-1.4F, 1.3F, 4.5F, -0.05235987755982988F, 0.0F, 0.0F));
            PartDefinition UpperLegRight = ThighRight.addOrReplaceChild("UpperLegRight", CubeListBuilder.create().texOffs(0, 27).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 2.5F, -1.2F, 0.6632251157578453F, 0.0F, 0.0F));
            PartDefinition LowerLegRight = UpperLegRight.addOrReplaceChild("LowerLegRight", CubeListBuilder.create().texOffs(10, 21).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(0.05F, 3.0F, 1.7F, -0.767944870877505F, 0.0F, 0.0F));
            PartDefinition FootRight = LowerLegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(6, 30).addBox(-0.5F, 0.0F, -0.7F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.1F, 3.7F, -0.7F, 0.13962634015954636F, 0.0F, 0.0F));

            PartDefinition ThighLeft = Body.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(0, 21).mirror(true).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(1.4F, 1.3F, 4.5F, -0.05235987755982988F, 0.0F, 0.0F));
            PartDefinition UpperLegLeft = ThighLeft.addOrReplaceChild("UpperLegLeft", CubeListBuilder.create().texOffs(0, 27).mirror(true).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 2.5F, -1.2F, 0.6632251157578453F, 0.0F, 0.0F));
            PartDefinition LowerLegLeft = UpperLegLeft.addOrReplaceChild("LowerLegLeft", CubeListBuilder.create().texOffs(10, 21).mirror(true).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(-0.05F, 3.0F, 1.7F, -0.767944870877505F, 0.0F, 0.0F));
            PartDefinition FootLeft = LowerLegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(6, 30).mirror(true).addBox(-0.5F, 0.0F, -0.7F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.1F, 3.7F, -0.7F, 0.13962634015954636F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 32, 32);
        }

        @Override
        public void setupAnim(BlackbuckEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) - 0.59F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 0.91F;
            this.Head.xRot = Mth.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F - 0.59F;

            this.Tail.xRot = Mth.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.46F;
            this.Tail.zRot = Mth.cos(1.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.2f;
            float degree = 0.8f;
            this.Neck.xRot = Mth.cos(1.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.15F) * 0.5F + 0.91F;
            this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F - 0.59F;
            this.Chest.y = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 15.9F;
            this.Chest.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F - 0.23F;
            this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.23F;
            this.ArmBaseLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -0.9F) * 0.5F + 0.35F;
            this.ArmLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F + 0.0F;
            this.UpperArmLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.09F;
            this.HandLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F + 0.0F;
            this.ArmBaseRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.9F) * 0.5F + 0.35F;
            this.ArmRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F + 0.0F;
            this.UpperArmRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.09F;
            this.HandRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F + 0.0F;
            this.ThighLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.3F) * 0.5F - 0.05F;
            this.UpperLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.66F;
            this.LowerLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.77F;
            this.FootLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F;
            this.ThighRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.3F) * 0.5F - 0.05F;
            this.UpperLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.66F;
            this.LowerLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.77F;
            this.FootRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F;

        }
    }
}

