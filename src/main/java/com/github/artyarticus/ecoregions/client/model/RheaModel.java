package com.github.artyarticus.ecoregions.client.model;

import com.github.artyarticus.ecoregions.entity.RheaEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class RheaModel extends ZawaBaseModel<RheaEntity> {
    public ModelPart Body;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Body);
        }

        return this.parts;
    }

    public static class Adult extends RheaModel {

        public ModelPart Shoulder;
        public ModelPart Tail1;
        public ModelPart thighLeft;
        public ModelPart thighRight;
        public ModelPart Chest;
        public ModelPart WingLeft;
        public ModelPart WingRight;
        public ModelPart Neck1;
        public ModelPart Neck2;
        public ModelPart Neck3;
        public ModelPart Neck4;
        public ModelPart Head;
        public ModelPart jawUpper1;
        public ModelPart Snout;
        public ModelPart jawUpper2;
        public ModelPart jawLower1;
        public ModelPart Tail2;
        public ModelPart legLowerLeft;
        public ModelPart toeFrontLeft;
        public ModelPart toeRightLeft;
        public ModelPart toeLeftLeft;
        public ModelPart legLowerRight;
        public ModelPart toeFrontLeft_1;
        public ModelPart toeRightLeft_1;
        public ModelPart toeLeftLeft_1;

        public Adult(ModelPart root) {
            this.Body = root.getChild("Body");
            this.Shoulder = this.Body.getChild("Shoulder");
            this.WingRight = this.Shoulder.getChild("WingRight");

            this.Chest = this.Shoulder.getChild("Chest");
            this.Neck1 = this.Chest.getChild("Neck1");
            this.Neck2 = this.Neck1.getChild("Neck2");
            this.Neck3 = this.Neck2.getChild("Neck3");
            this.Neck4 = this.Neck3.getChild("Neck4");
            this.Head = this.Neck4.getChild("Head");
            this.jawUpper1 = this.Head.getChild("jawUpper1");
            this.jawUpper2 = this.jawUpper1.getChild("jawUpper2");

            this.jawLower1 = this.jawUpper1.getChild("jawLower1");

            this.Snout = this.jawUpper1.getChild("Snout");

            this.WingLeft = this.Shoulder.getChild("WingLeft");

            this.thighLeft = this.Body.getChild("thighLeft");
            this.legLowerLeft = this.thighLeft.getChild("legLowerLeft");
            this.toeFrontLeft = this.legLowerLeft.getChild("toeFrontLeft");
            this.toeRightLeft = this.toeFrontLeft.getChild("toeRightLeft");

            this.toeLeftLeft = this.toeFrontLeft.getChild("toeLeftLeft");

            this.Tail1 = this.Body.getChild("Tail1");
            this.Tail2 = this.Tail1.getChild("Tail2");

            this.thighRight = this.Body.getChild("thighRight");
            this.legLowerRight = this.thighRight.getChild("legLowerRight");
            this.toeFrontLeft_1 = this.legLowerRight.getChild("toeFrontLeft_1");
            this.toeRightLeft_1 = this.toeFrontLeft_1.getChild("toeRightLeft_1");

            this.toeLeftLeft_1 = this.toeFrontLeft_1.getChild("toeLeftLeft_1");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(1, 26).addBox(-4.5F, -7.0F, -4.5F, 9.0F, 10.0F, 9.0F), PartPose.offsetAndRotation(0.0F, 8.4F, 0.0F, -0.03839724437611309F, 0.0F, 0.0F));
            PartDefinition Shoulder = Body.addOrReplaceChild("Shoulder", CubeListBuilder.create().texOffs(1, 12).addBox(-4.0F, 0.0F, -3.0F, 8.0F, 10.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -6.8F, -4.5F, 0.18203784630933073F, 0.0F, 0.0F));
            PartDefinition WingRight = Shoulder.addOrReplaceChild("WingRight", CubeListBuilder.create().texOffs(70, 44).mirror(true).addBox(-1.5F, -2.0F, 0.0F, 2.0F, 9.0F, 10.0F), PartPose.offsetAndRotation(-3.5F, 2.0F, -1.4F, -0.18203784630933073F, -0.04555309164612875F, -0.04555309164612875F));

            PartDefinition Chest = Shoulder.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(1, 0).addBox(-3.5F, -0.5F, -0.5F, 7.0F, 8.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 0.7F, -3.0F, -0.4098033003787853F, 0.0F, 0.0F));
            PartDefinition Neck1 = Chest.addOrReplaceChild("Neck1", CubeListBuilder.create().texOffs(42, 0).addBox(-2.5F, -2.0F, -3.0F, 5.0F, 6.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 2.5F, -0.4F, 0.8651597048872669F, 0.0F, 0.0F));
            PartDefinition Neck2 = Neck1.addOrReplaceChild("Neck2", CubeListBuilder.create().texOffs(61, 19).addBox(-2.0F, -3.0F, -4.0F, 4.0F, 4.0F, 7.0F), PartPose.offsetAndRotation(0.0F, 1.0F, -3.0F, -1.1838568635856868F, 0.0F, 0.0F));
            PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create().texOffs(41, 20).addBox(-1.5F, -3.0F, -7.0F, 3.0F, 3.0F, 7.0F), PartPose.offsetAndRotation(0.0F, 1.0F, -4.0F, -1.0471975511965976F, 0.0F, 0.0F));
            PartDefinition Neck4 = Neck3.addOrReplaceChild("Neck4", CubeListBuilder.create().texOffs(42, 31).addBox(-1.5F, 0.0F, -3.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.01F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -3.0F, -7.0F, 0.2792526803190927F, 0.0F, 0.0F));
            PartDefinition Head = Neck4.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(62, 1).addBox(-1.5F, -1.5F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.21F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, -2.0F, 1.4032447452350518F, 0.0F, 0.0F));
            PartDefinition jawUpper1 = Head.addOrReplaceChild("jawUpper1", CubeListBuilder.create().texOffs(79, 5).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, 0.03490658503988659F, 0.0F, 0.0F));
            PartDefinition jawUpper2 = jawUpper1.addOrReplaceChild("jawUpper2", CubeListBuilder.create().texOffs(90, 6).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -1.5F, 0.001745329278001762F, 0.0F, 0.0F));

            PartDefinition jawLower1 = jawUpper1.addOrReplaceChild("jawLower1", CubeListBuilder.create().texOffs(79, 9).addBox(-0.5F, 0.0F, -4.0F, 1.0F, 1.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 0.7F, 1.7F, -0.13665927909957545F, 0.0F, 0.0F));

            PartDefinition Snout = jawUpper1.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(79, 1).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -1.6F, 0.4363323129985824F, 0.0F, 0.0F));

            PartDefinition WingLeft = Shoulder.addOrReplaceChild("WingLeft", CubeListBuilder.create().texOffs(70, 44).addBox(-0.5F, -2.0F, 0.0F, 2.0F, 9.0F, 10.0F), PartPose.offsetAndRotation(3.5F, 2.0F, -1.4F, -0.18203784630933073F, 0.04555309164612875F, 0.04555309164612875F));

            PartDefinition thighLeft = Body.addOrReplaceChild("thighLeft", CubeListBuilder.create().texOffs(94, 24).addBox(-1.5F, -1.0F, -4.0F, 3.0F, 7.0F, 4.0F), PartPose.offsetAndRotation(2.2F, 0.1F, 0.5F, 0.3642502295386026F, 0.017453292519943295F, 0.017453292519943295F));
            PartDefinition legLowerLeft = thighLeft.addOrReplaceChild("legLowerLeft", CubeListBuilder.create().texOffs(98, 36).addBox(-1.0F, -0.1F, -3.0F, 2.0F, 10.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 6.0F, -0.5F, -0.3944444176086212F, 0.0F, -0.017453292519943295F));
            PartDefinition toeFrontLeft = legLowerLeft.addOrReplaceChild("toeFrontLeft", CubeListBuilder.create().texOffs(97, 56).mirror(true).addBox(-0.5F, 0.0F, -3.5F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 9.0F, -2.0F, 0.10471975511965977F, -0.04555309164612875F, 0.0F));
            PartDefinition toeRightLeft = toeFrontLeft.addOrReplaceChild("toeRightLeft", CubeListBuilder.create().texOffs(108, 56).mirror(true).addBox(-0.5F, 0.0F, -2.4F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(-0.5F, 0.1F, -0.5F, 0.0F, 0.27314402127920984F, -0.03490658503988659F));

            PartDefinition toeLeftLeft = toeFrontLeft.addOrReplaceChild("toeLeftLeft", CubeListBuilder.create().texOffs(108, 56).mirror(true).addBox(-0.5F, 0.0F, -2.4F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.5F, 0.1F, -0.5F, 0.0F, -0.27314402127920984F, 0.03490658503988659F));

            PartDefinition Tail1 = Body.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(1, 49).addBox(-4.0F, 0.0F, 0.0F, 8.0F, 8.0F, 5.0F), PartPose.offsetAndRotation(0.0F, -6.4F, 4.5F, -0.500909508638178F, 0.0F, 0.0F));
            PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(34, 54).addBox(-3.5F, -0.5F, 0.0F, 7.0F, 6.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.5F, 4.5F, -0.45535640450848164F, 0.0F, 0.0F));

            PartDefinition thighRight = Body.addOrReplaceChild("thighRight", CubeListBuilder.create().texOffs(94, 24).addBox(-1.5F, -1.0F, -4.0F, 3.0F, 7.0F, 4.0F), PartPose.offsetAndRotation(-2.2F, 0.1F, 0.5F, 0.3642502295386026F, -0.017453292519943295F, -0.017453292519943295F));
            PartDefinition legLowerRight = thighRight.addOrReplaceChild("legLowerRight", CubeListBuilder.create().texOffs(98, 36).addBox(-1.0F, -0.1F, -3.0F, 2.0F, 10.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 6.0F, -0.5F, -0.3944444176086212F, 0.0F, 0.017453292519943295F));
            PartDefinition toeFrontLeft_1 = legLowerRight.addOrReplaceChild("toeFrontLeft_1", CubeListBuilder.create().texOffs(97, 56).addBox(-0.5F, 0.0F, -3.5F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 9.0F, -2.0F, 0.10471975511965977F, 0.04555309164612875F, 0.0F));
            PartDefinition toeRightLeft_1 = toeFrontLeft_1.addOrReplaceChild("toeRightLeft_1", CubeListBuilder.create().texOffs(108, 56).addBox(-0.5F, 0.0F, -2.4F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(-0.5F, 0.1F, -0.5F, 0.0F, 0.27314402127920984F, -0.03490658503988659F));

            PartDefinition toeLeftLeft_1 = toeFrontLeft_1.addOrReplaceChild("toeLeftLeft_1", CubeListBuilder.create().texOffs(108, 56).addBox(-0.5F, 0.0F, -2.4F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.5F, 0.1F, -0.5F, 0.0F, -0.27314402127920984F, 0.03490658503988659F));

            return LayerDefinition.create(meshDefinition, 128, 64);
        }

        @Override
        public void setupAnim(RheaEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck2.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 1.4F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck1.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.1F) * 0.5F + 0.87F;
            this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 1.4F;
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
                this.Neck1.xRot = Mth.cos(6.0F + limbSwing * speed * 0.7F) * limbSwingAmount * (degree * 0.7F) * 0.5F + 0.87F;
                this.Head.xRot = Mth.cos(5F + limbSwing * speed * 0.7F) * limbSwingAmount * (degree * -0.9F) * 0.5F + 1.4F;
                this.Chest.xRot = Mth.cos(3.0F + limbSwing * speed * 0.7F) * limbSwingAmount * (degree * 0.6F) * 0.5F - 0.41F;
                this.Tail1.xRot = Mth.cos(2.0F + limbSwing * speed * 0.7F) * limbSwingAmount * (degree * -0.5F) * 0.5F - 0.5F;
                this.Body.xRot = Mth.cos(1.0F + limbSwing * speed * 0.7F) * limbSwingAmount * (degree * -0.5F) * 0.5F - 0.04F;
                this.Body.y = Mth.cos(2F + limbSwing * speed * 0.7F) * limbSwingAmount * (degree * -8F) * 0.5F + 8.4F;
                this.Body.zRot = Mth.cos(2F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * -0.3F) * 0.5F;
                this.Body.yRot = Mth.cos(2F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * -0.3F) * 0.5F;

                this.thighLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * -4F) * 0.5F + 0.36F;
                this.thighLeft.y = Mth.cos(7.0F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * 7F) * 0.5F + 0.1F;
                this.thighLeft.z = Mth.cos(3.0F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * -8F) * 0.5F + 0.5F;
                this.legLowerLeft.xRot = Mth.cos(0.5F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * 4F) * 0.5F - 0.39F;
                this.toeFrontLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.1F;

                this.thighRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * 4F) * 0.5F + 0.36F;
                this.thighRight.y = Mth.cos(7.0F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * -7F) * 0.5F + 0.1F;
                this.thighRight.z = Mth.cos(3.0F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * 8F) * 0.5F + 0.5F;
                this.legLowerRight.xRot = Mth.cos(0.5F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * -4F) * 0.5F - 0.39F;
                this.toeFrontLeft_1.xRot = Mth.cos(2.0F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * -3F) * 0.5F + 0.1F;


            } else {
                float speed = 1.5f;
                float degree = 1.0f;
                this.Neck1.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 0.87F;
                this.Head.xRot = Mth.cos(2.2F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.5F) * 0.5F + 1.4F;
                this.Chest.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.1F) * 0.5F - 0.41F;
                this.Tail1.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.05F) * 0.5F - 0.5F;
                this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.05F) * 0.5F - 0.04F;
                this.Body.y = Mth.cos(4.5F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree) * 0.5F + 8.4F;

                this.thighLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.36F;
                this.thighLeft.y = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.1F;
                this.legLowerLeft.xRot = Mth.cos(0.5F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 3F) * 0.5F - 0.39F;
                this.toeFrontLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.1F;

                this.thighRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.36F;
                this.thighRight.y = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.1F;
                this.legLowerRight.xRot = Mth.cos(0.5F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -3F) * 0.5F - 0.39F;
                this.toeFrontLeft_1.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.1F;
            }
        }
    }

    public static class Child extends RheaModel {

        public ModelPart Tail;
        public ModelPart NeckBase;
        public ModelPart WingLeft;
        public ModelPart Back1;
        public ModelPart ThighLeft;
        public ModelPart ThighRight;
        public ModelPart WingRight;
        public ModelPart Neck;
        public ModelPart Head;
        public ModelPart Jaw;
        public ModelPart BottomJaw;
        public ModelPart Nose;
        public ModelPart Back2;
        public ModelPart LegUpperLeft;
        public ModelPart LegBottomLeft;
        public ModelPart MiddleToeLeft;
        public ModelPart LeftToeLeft;
        public ModelPart RightToeRight;
        public ModelPart LegUpperRight;
        public ModelPart LegBottomRight;
        public ModelPart MiddleToeRight;
        public ModelPart LeftToeRight;
        public ModelPart RightToeRight_1;

        public Child(ModelPart root) {
            this.Body = root.getChild("Body");
            this.ThighRight = this.Body.getChild("ThighRight");
            this.LegUpperRight = this.ThighRight.getChild("LegUpperRight");
            this.LegBottomRight = this.LegUpperRight.getChild("LegBottomRight");
            this.MiddleToeRight = this.LegBottomRight.getChild("MiddleToeRight");
            this.RightToeRight_1 = this.MiddleToeRight.getChild("RightToeRight_1");

            this.LeftToeRight = this.MiddleToeRight.getChild("LeftToeRight");

            this.ThighLeft = this.Body.getChild("ThighLeft");
            this.LegUpperLeft = this.ThighLeft.getChild("LegUpperLeft");
            this.LegBottomLeft = this.LegUpperLeft.getChild("LegBottomLeft");
            this.MiddleToeLeft = this.LegBottomLeft.getChild("MiddleToeLeft");
            this.LeftToeLeft = this.MiddleToeLeft.getChild("LeftToeLeft");

            this.RightToeRight = this.MiddleToeLeft.getChild("RightToeRight");

            this.Tail = this.Body.getChild("Tail");

            this.WingRight = this.Body.getChild("WingRight");

            this.WingLeft = this.Body.getChild("WingLeft");

            this.Back1 = this.Body.getChild("Back1");
            this.Back2 = this.Back1.getChild("Back2");

            this.NeckBase = this.Body.getChild("NeckBase");
            this.Neck = this.NeckBase.getChild("Neck");
            this.Head = this.Neck.getChild("Head");
            this.BottomJaw = this.Head.getChild("BottomJaw");

            this.Jaw = this.Head.getChild("Jaw");
            this.Nose = this.Jaw.getChild("Nose");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 21).addBox(-2.0F, -2.5F, -2.5F, 4.0F, 5.0F, 6.0F), PartPose.offsetAndRotation(0.0F, 16.3F, 0.0F, -0.13665927909957545F, 0.0F, 0.0F));
            PartDefinition ThighRight = Body.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(0, 14).addBox(-0.5F, -0.5F, -0.5F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-1.6F, 1.3F, 0.5F, 0.27314402127920984F, 0.0F, 0.0F));
            PartDefinition LegUpperRight = ThighRight.addOrReplaceChild("LegUpperRight", CubeListBuilder.create().texOffs(13, 11).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offset(0.5F, 1.5F, 1.0F));
            PartDefinition LegBottomRight = LegUpperRight.addOrReplaceChild("LegBottomRight", CubeListBuilder.create().texOffs(13, 14).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.01F, 2.0F, 0.0F, -0.18203784630933073F, 0.0F, 0.0F));
            PartDefinition MiddleToeRight = LegBottomRight.addOrReplaceChild("MiddleToeRight", CubeListBuilder.create().texOffs(13, 8).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.01F, 2.3F, -0.5F, 0.04555309164612875F, 0.0F, 0.0F));
            PartDefinition RightToeRight_1 = MiddleToeRight.addOrReplaceChild("RightToeRight_1", CubeListBuilder.create().texOffs(14, 5).addBox(-0.5F, 0.0F, -1.3F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.1F, 0.0F, 0.0F, 0.45535640450848164F, 0.0F));

            PartDefinition LeftToeRight = MiddleToeRight.addOrReplaceChild("LeftToeRight", CubeListBuilder.create().texOffs(14, 5).addBox(-0.5F, 0.0F, -1.3F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.1F, 0.0F, 0.0F, -0.45535640450848164F, 0.0F));

            PartDefinition ThighLeft = Body.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(0, 14).mirror(true).addBox(-1.5F, -0.5F, -0.5F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(1.6F, 1.3F, 0.5F, 0.27314402127920984F, 0.0F, 0.0F));
            PartDefinition LegUpperLeft = ThighLeft.addOrReplaceChild("LegUpperLeft", CubeListBuilder.create().texOffs(13, 11).mirror(true).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offset(-0.5F, 1.5F, 1.0F));
            PartDefinition LegBottomLeft = LegUpperLeft.addOrReplaceChild("LegBottomLeft", CubeListBuilder.create().texOffs(13, 14).mirror(true).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.01F, 2.0F, 0.0F, -0.18203784630933073F, 0.0F, 0.0F));
            PartDefinition MiddleToeLeft = LegBottomLeft.addOrReplaceChild("MiddleToeLeft", CubeListBuilder.create().texOffs(13, 8).mirror(true).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.01F, 2.3F, -0.5F, 0.04555309164612875F, 0.0F, 0.0F));
            PartDefinition LeftToeLeft = MiddleToeLeft.addOrReplaceChild("LeftToeLeft", CubeListBuilder.create().texOffs(14, 5).mirror(true).addBox(-0.5F, 0.0F, -1.3F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.1F, 0.0F, 0.0F, -0.45535640450848164F, 0.0F));

            PartDefinition RightToeRight = MiddleToeLeft.addOrReplaceChild("RightToeRight", CubeListBuilder.create().texOffs(14, 5).mirror(true).addBox(-0.5F, 0.0F, -1.3F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.1F, 0.0F, 0.0F, 0.45535640450848164F, 0.0F));

            PartDefinition Tail = Body.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(20, 27).addBox(-1.5F, -0.5F, 0.0F, 3.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -2.0F, 3.0F, -0.500909508638178F, 0.0F, 0.0F));

            PartDefinition WingRight = Body.addOrReplaceChild("WingRight", CubeListBuilder.create().texOffs(0, 7).addBox(-1.0F, -0.5F, -1.5F, 1.0F, 3.0F, 4.0F), PartPose.offset(-1.5F, -1.5F, 0.0F));

            PartDefinition WingLeft = Body.addOrReplaceChild("WingLeft", CubeListBuilder.create().texOffs(0, 7).mirror(true).addBox(0.0F, -0.5F, -1.5F, 1.0F, 3.0F, 4.0F), PartPose.offset(1.5F, -1.5F, 0.0F));

            PartDefinition Back1 = Body.addOrReplaceChild("Back1", CubeListBuilder.create().texOffs(30, 29).addBox(-1.5F, -1.0F, -2.0F, 3.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.01F, -2.1F, 0.3F, 0.3186971254089062F, 0.0F, 0.0F));
            PartDefinition Back2 = Back1.addOrReplaceChild("Back2", CubeListBuilder.create().texOffs(30, 25).addBox(-1.5F, -0.9F, -0.5F, 3.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(-0.01F, 0.0F, 0.0F, -0.500909508638178F, 0.0F, 0.0F));

            PartDefinition NeckBase = Body.addOrReplaceChild("NeckBase", CubeListBuilder.create().texOffs(15, 20).addBox(-1.5F, -0.4F, -1.0F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -2.0F, -2.0F, -0.7285004590772052F, 0.0F, 0.0F));
            PartDefinition Neck = NeckBase.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(20, 11).addBox(-1.0F, -4.0F, -1.5F, 2.0F, 6.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.8651597048872669F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(20, 3).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -3.0F, -0.9F, 0.04555309164612875F, 0.0F, 0.0F));
            PartDefinition BottomJaw = Head.addOrReplaceChild("BottomJaw", CubeListBuilder.create().texOffs(33, 10).addBox(-0.5F, -0.5F, -1.7F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.9F, -1.0F, -0.04555309164612875F, 0.0F, 0.0F));

            PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create().texOffs(33, 6).addBox(-1.0F, -0.5F, -2.2F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.5F, -1.0F, 0.18203784630933073F, 0.0F, 0.0F));
            PartDefinition Nose = Jaw.addOrReplaceChild("Nose", CubeListBuilder.create().texOffs(33, 0).addBox(-0.5F, -1.0F, -1.9F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.27314402127920984F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 64, 32);
        }

        @Override
        public void setupAnim(RheaEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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
            this.NeckBase.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.73F;
            this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.05F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.2f;
            float degree = 1.0f;
            this.NeckBase.xRot = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.4F) * 0.5F - 0.73F;
            this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.3F) * 0.5F + 0.05F;
            this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.14F;
            this.Body.y = Mth.cos(4.5F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree) * 0.5F + 16.3F;

            this.ThighLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.27F;
            this.ThighLeft.y = Mth.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 2F) * 0.5F + 1.3F;
            this.LegUpperLeft.xRot = Mth.cos(0.5F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 3F) * 0.5F;
            this.MiddleToeLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.05F;
            this.ThighRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.27F;
            this.ThighRight.y = Mth.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -2F) * 0.5F + 1.3F;
            this.LegUpperRight.xRot = Mth.cos(0.5F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -3F) * 0.5F;
            this.MiddleToeRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.05F;
        }
    }
}



