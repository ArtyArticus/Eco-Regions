package com.github.artyarticus.ecoregions.client.model;

import com.github.artyarticus.ecoregions.entity.RheaEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class RheaModel extends ZawaBaseModel<RheaEntity> {
    public ModelRenderer Body;
    protected Iterable<ModelRenderer> parts;

    @Override
    @MethodsReturnNonnullByDefault
    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Body);
        }

        return this.parts;
    }

    public static class Adult extends RheaModel {

        public ModelRenderer Shoulder;
        public ModelRenderer Tail1;
        public ModelRenderer thighLeft;
        public ModelRenderer thighRight;
        public ModelRenderer Chest;
        public ModelRenderer WingLeft;
        public ModelRenderer WingRight;
        public ModelRenderer Neck1;
        public ModelRenderer Neck2;
        public ModelRenderer Neck3;
        public ModelRenderer Neck4;
        public ModelRenderer Head;
        public ModelRenderer jawUpper1;
        public ModelRenderer Snout;
        public ModelRenderer jawUpper2;
        public ModelRenderer jawLower1;
        public ModelRenderer Tail2;
        public ModelRenderer legLowerLeft;
        public ModelRenderer toeFrontLeft;
        public ModelRenderer toeRightLeft;
        public ModelRenderer toeLeftLeft;
        public ModelRenderer legLowerRight;
        public ModelRenderer toeFrontLeft_1;
        public ModelRenderer toeRightLeft_1;
        public ModelRenderer toeLeftLeft_1;


        public Adult() {
            this.texWidth = 128;
            this.texHeight = 64;
            this.Shoulder = new ModelRenderer(this, 1, 12);
            this.Shoulder.setPos(0.0F, -6.8F, -4.5F);
            this.Shoulder.addBox(-4.0F, 0.0F, -3.0F, 8.0F, 10.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Shoulder, 0.18203784630933073F, 0.0F, 0.0F);
            this.WingRight = new ModelRenderer(this, 70, 44);
            this.WingRight.mirror = true;
            this.WingRight.setPos(-3.5F, 2.0F, -1.4F);
            this.WingRight.addBox(-1.5F, -2.0F, 0.0F, 2.0F, 9.0F, 10.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingRight, -0.18203784630933073F, -0.04555309164612875F, -0.04555309164612875F);
            this.Chest = new ModelRenderer(this, 1, 0);
            this.Chest.setPos(0.0F, 0.7F, -3.0F);
            this.Chest.addBox(-3.5F, -0.5F, -0.5F, 7.0F, 8.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.4098033003787853F, 0.0F, 0.0F);
            this.legLowerLeft = new ModelRenderer(this, 98, 36);
            this.legLowerLeft.setPos(0.0F, 6.0F, -0.5F);
            this.legLowerLeft.addBox(-1.0F, -0.1F, -3.0F, 2.0F, 10.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(legLowerLeft, -0.3944444176086212F, 0.0F, -0.017453292519943295F);
            this.thighLeft = new ModelRenderer(this, 94, 24);
            this.thighLeft.setPos(2.2F, 0.1F, 0.5F);
            this.thighLeft.addBox(-1.5F, -1.0F, -4.0F, 3.0F, 7.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(thighLeft, 0.3642502295386026F, 0.017453292519943295F, 0.017453292519943295F);
            this.WingLeft = new ModelRenderer(this, 70, 44);
            this.WingLeft.setPos(3.5F, 2.0F, -1.4F);
            this.WingLeft.addBox(-0.5F, -2.0F, 0.0F, 2.0F, 9.0F, 10.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingLeft, -0.18203784630933073F, 0.04555309164612875F, 0.04555309164612875F);
            this.toeRightLeft = new ModelRenderer(this, 108, 56);
            this.toeRightLeft.mirror = true;
            this.toeRightLeft.setPos(-0.5F, 0.1F, -0.5F);
            this.toeRightLeft.addBox(-0.5F, 0.0F, -2.4F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(toeRightLeft, 0.0F, 0.27314402127920984F, -0.03490658503988659F);
            this.toeRightLeft_1 = new ModelRenderer(this, 108, 56);
            this.toeRightLeft_1.setPos(-0.5F, 0.1F, -0.5F);
            this.toeRightLeft_1.addBox(-0.5F, 0.0F, -2.4F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(toeRightLeft_1, 0.0F, 0.27314402127920984F, -0.03490658503988659F);
            this.jawUpper2 = new ModelRenderer(this, 90, 6);
            this.jawUpper2.setPos(0.0F, 0.0F, -1.5F);
            this.jawUpper2.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(jawUpper2, 0.001745329278001762F, 0.0F, 0.0F);
            this.jawLower1 = new ModelRenderer(this, 79, 9);
            this.jawLower1.setPos(0.0F, 0.7F, 1.7F);
            this.jawLower1.addBox(-0.5F, 0.0F, -4.0F, 1.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(jawLower1, -0.13665927909957545F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 1, 49);
            this.Tail1.setPos(0.0F, -6.4F, 4.5F);
            this.Tail1.addBox(-4.0F, 0.0F, 0.0F, 8.0F, 8.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -0.500909508638178F, 0.0F, 0.0F);
            this.Neck4 = new ModelRenderer(this, 42, 31);
            this.Neck4.setPos(0.0F, -3.0F, -7.0F);
            this.Neck4.addBox(-1.5F, 0.0F, -3.0F, 3.0F, 3.0F, 3.0F, -0.01F, 0.0F, 0.0F);
            this.setRotateAngle(Neck4, 0.2792526803190927F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 34, 54);
            this.Tail2.setPos(0.0F, 0.5F, 4.5F);
            this.Tail2.addBox(-3.5F, -0.5F, 0.0F, 7.0F, 6.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, -0.45535640450848164F, 0.0F, 0.0F);
            this.toeLeftLeft = new ModelRenderer(this, 108, 56);
            this.toeLeftLeft.mirror = true;
            this.toeLeftLeft.setPos(0.5F, 0.1F, -0.5F);
            this.toeLeftLeft.addBox(-0.5F, 0.0F, -2.4F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(toeLeftLeft, 0.0F, -0.27314402127920984F, 0.03490658503988659F);
            this.toeFrontLeft_1 = new ModelRenderer(this, 97, 56);
            this.toeFrontLeft_1.setPos(0.0F, 9.0F, -2.0F);
            this.toeFrontLeft_1.addBox(-0.5F, 0.0F, -3.5F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(toeFrontLeft_1, 0.10471975511965977F, 0.04555309164612875F, 0.0F);
            this.Body = new ModelRenderer(this, 1, 26);
            this.Body.setPos(0.0F, 8.4F, 0.0F);
            this.Body.addBox(-4.5F, -7.0F, -4.5F, 9.0F, 10.0F, 9.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, -0.03839724437611309F, 0.0F, 0.0F);
            this.Neck1 = new ModelRenderer(this, 42, 0);
            this.Neck1.setPos(0.0F, 2.5F, -0.4F);
            this.Neck1.addBox(-2.5F, -2.0F, -3.0F, 5.0F, 6.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck1, 0.8651597048872669F, 0.0F, 0.0F);
            this.jawUpper1 = new ModelRenderer(this, 79, 5);
            this.jawUpper1.setPos(0.0F, 0.0F, -2.0F);
            this.jawUpper1.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(jawUpper1, 0.03490658503988659F, 0.0F, 0.0F);
            this.Neck2 = new ModelRenderer(this, 61, 19);
            this.Neck2.setPos(0.0F, 1.0F, -3.0F);
            this.Neck2.addBox(-2.0F, -3.0F, -4.0F, 4.0F, 4.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck2, -1.1838568635856868F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 79, 1);
            this.Snout.setPos(0.0F, 0.0F, -1.6F);
            this.Snout.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.4363323129985824F, 0.0F, 0.0F);
            this.legLowerRight = new ModelRenderer(this, 98, 36);
            this.legLowerRight.setPos(0.0F, 6.0F, -0.5F);
            this.legLowerRight.addBox(-1.0F, -0.1F, -3.0F, 2.0F, 10.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(legLowerRight, -0.3944444176086212F, 0.0F, 0.017453292519943295F);
            this.toeLeftLeft_1 = new ModelRenderer(this, 108, 56);
            this.toeLeftLeft_1.setPos(0.5F, 0.1F, -0.5F);
            this.toeLeftLeft_1.addBox(-0.5F, 0.0F, -2.4F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(toeLeftLeft_1, 0.0F, -0.27314402127920984F, 0.03490658503988659F);
            this.Neck3 = new ModelRenderer(this, 41, 20);
            this.Neck3.setPos(0.0F, 1.0F, -4.0F);
            this.Neck3.addBox(-1.5F, -3.0F, -7.0F, 3.0F, 3.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck3, -1.0471975511965976F, 0.0F, 0.0F);
            this.thighRight = new ModelRenderer(this, 94, 24);
            this.thighRight.setPos(-2.2F, 0.1F, 0.5F);
            this.thighRight.addBox(-1.5F, -1.0F, -4.0F, 3.0F, 7.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(thighRight, 0.3642502295386026F, -0.017453292519943295F, -0.017453292519943295F);
            this.Head = new ModelRenderer(this, 62, 1);
            this.Head.setPos(0.0F, 2.0F, -2.0F);
            this.Head.addBox(-1.5F, -1.5F, -2.0F, 3.0F, 3.0F, 4.0F, 0.21F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 1.4032447452350518F, 0.0F, 0.0F);
            this.toeFrontLeft = new ModelRenderer(this, 97, 56);
            this.toeFrontLeft.mirror = true;
            this.toeFrontLeft.setPos(0.0F, 9.0F, -2.0F);
            this.toeFrontLeft.addBox(-0.5F, 0.0F, -3.5F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(toeFrontLeft, 0.10471975511965977F, -0.04555309164612875F, 0.0F);
            this.Body.addChild(this.Shoulder);
            this.Shoulder.addChild(this.WingRight);
            this.Shoulder.addChild(this.Chest);
            this.thighLeft.addChild(this.legLowerLeft);
            this.Body.addChild(this.thighLeft);
            this.Shoulder.addChild(this.WingLeft);
            this.toeFrontLeft.addChild(this.toeRightLeft);
            this.toeFrontLeft_1.addChild(this.toeRightLeft_1);
            this.jawUpper1.addChild(this.jawUpper2);
            this.jawUpper1.addChild(this.jawLower1);
            this.Body.addChild(this.Tail1);
            this.Neck3.addChild(this.Neck4);
            this.Tail1.addChild(this.Tail2);
            this.toeFrontLeft.addChild(this.toeLeftLeft);
            this.legLowerRight.addChild(this.toeFrontLeft_1);
            this.Chest.addChild(this.Neck1);
            this.Head.addChild(this.jawUpper1);
            this.Neck1.addChild(this.Neck2);
            this.jawUpper1.addChild(this.Snout);
            this.thighRight.addChild(this.legLowerRight);
            this.toeFrontLeft_1.addChild(this.toeLeftLeft_1);
            this.Neck2.addChild(this.Neck3);
            this.Body.addChild(this.thighRight);
            this.Neck4.addChild(this.Head);
            this.legLowerLeft.addChild(this.toeFrontLeft);
            this.saveBase();
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
            this.Neck1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.1F) * 0.5F + 0.87F;
            this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 1.4F;
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
                this.Neck1.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.7F) * limbSwingAmount * (degree * 0.7F) * 0.5F + 0.87F;
                this.Head.xRot = MathHelper.cos(5F + limbSwing * speed * 0.7F) * limbSwingAmount * (degree * -0.9F) * 0.5F + 1.4F;
                this.Chest.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.7F) * limbSwingAmount * (degree * 0.6F) * 0.5F - 0.41F;
                this.Tail1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.7F) * limbSwingAmount * (degree * -0.5F) * 0.5F - 0.5F;
                this.Body.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.7F) * limbSwingAmount * (degree * -0.5F) * 0.5F - 0.04F;
                this.Body.y = MathHelper.cos(2F + limbSwing * speed * 0.7F) * limbSwingAmount * (degree * -8F) * 0.5F + 8.4F;
                this.Body.zRot = MathHelper.cos(2F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * -0.3F) * 0.5F;
                this.Body.yRot = MathHelper.cos(2F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * -0.3F) * 0.5F;

                this.thighLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * -4F) * 0.5F + 0.36F;
                this.thighLeft.y = MathHelper.cos(7.0F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * 7F) * 0.5F + 0.1F;
                this.thighLeft.z = MathHelper.cos(3.0F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * -8F) * 0.5F + 0.5F;
                this.legLowerLeft.xRot = MathHelper.cos(0.5F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * 4F) * 0.5F - 0.39F;
                this.toeFrontLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.1F;

                this.thighRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * 4F) * 0.5F + 0.36F;
                this.thighRight.y = MathHelper.cos(7.0F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * -7F) * 0.5F + 0.1F;
                this.thighRight.z = MathHelper.cos(3.0F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * 8F) * 0.5F + 0.5F;
                this.legLowerRight.xRot = MathHelper.cos(0.5F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * -4F) * 0.5F - 0.39F;
                this.toeFrontLeft_1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * -3F) * 0.5F + 0.1F;


            } else {
                float speed = 1.5f;
                float degree = 1.0f;
                this.Neck1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 0.87F;
                this.Head.xRot = MathHelper.cos(2.2F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.5F) * 0.5F + 1.4F;
                this.Chest.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.1F) * 0.5F - 0.41F;
                this.Tail1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.05F) * 0.5F - 0.5F;
                this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.05F) * 0.5F - 0.04F;
                this.Body.y = MathHelper.cos(4.5F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree) * 0.5F + 8.4F;

                this.thighLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.36F;
                this.thighLeft.y = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.1F;
                this.legLowerLeft.xRot = MathHelper.cos(0.5F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 3F) * 0.5F - 0.39F;
                this.toeFrontLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.1F;

                this.thighRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.36F;
                this.thighRight.y = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.1F;
                this.legLowerRight.xRot = MathHelper.cos(0.5F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -3F) * 0.5F - 0.39F;
                this.toeFrontLeft_1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.1F;
            }
        }
    }


    public static class Child extends RheaModel {

        public ModelRenderer Tail;
        public ModelRenderer NeckBase;
        public ModelRenderer WingLeft;
        public ModelRenderer Back1;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer WingRight;
        public ModelRenderer Neck;
        public ModelRenderer Head;
        public ModelRenderer Jaw;
        public ModelRenderer BottomJaw;
        public ModelRenderer Nose;
        public ModelRenderer Back2;
        public ModelRenderer LegUpperLeft;
        public ModelRenderer LegBottomLeft;
        public ModelRenderer MiddleToeLeft;
        public ModelRenderer LeftToeLeft;
        public ModelRenderer RightToeRight;
        public ModelRenderer LegUpperRight;
        public ModelRenderer LegBottomRight;
        public ModelRenderer MiddleToeRight;
        public ModelRenderer LeftToeRight;
        public ModelRenderer RightToeRight_1;

        public Child() {
            this.texWidth = 64;
            this.texHeight = 32;
            this.LeftToeLeft = new ModelRenderer(this, 14, 5);
            this.LeftToeLeft.mirror = true;
            this.LeftToeLeft.setPos(0.0F, 0.1F, 0.0F);
            this.LeftToeLeft.addBox(-0.5F, 0.0F, -1.3F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftToeLeft, 0.0F, -0.45535640450848164F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 0, 14);
            this.ThighRight.setPos(-1.6F, 1.3F, 0.5F);
            this.ThighRight.addBox(-0.5F, -0.5F, -0.5F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.27314402127920984F, 0.0F, 0.0F);
            this.Nose = new ModelRenderer(this, 33, 0);
            this.Nose.setPos(0.0F, 0.0F, 0.0F);
            this.Nose.addBox(-0.5F, -1.0F, -1.9F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Nose, 0.27314402127920984F, 0.0F, 0.0F);
            this.LegBottomRight = new ModelRenderer(this, 13, 14);
            this.LegBottomRight.setPos(0.01F, 2.0F, 0.0F);
            this.LegBottomRight.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegBottomRight, -0.18203784630933073F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 0, 14);
            this.ThighLeft.mirror = true;
            this.ThighLeft.setPos(1.6F, 1.3F, 0.5F);
            this.ThighLeft.addBox(-1.5F, -0.5F, -0.5F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.27314402127920984F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 20, 11);
            this.Neck.setPos(0.0F, 0.0F, -1.0F);
            this.Neck.addBox(-1.0F, -4.0F, -1.5F, 2.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, 0.8651597048872669F, 0.0F, 0.0F);
            this.LegBottomLeft = new ModelRenderer(this, 13, 14);
            this.LegBottomLeft.mirror = true;
            this.LegBottomLeft.setPos(0.01F, 2.0F, 0.0F);
            this.LegBottomLeft.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegBottomLeft, -0.18203784630933073F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 20, 3);
            this.Head.setPos(0.0F, -3.0F, -0.9F);
            this.Head.addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.04555309164612875F, 0.0F, 0.0F);
            this.LegUpperRight = new ModelRenderer(this, 13, 11);
            this.LegUpperRight.setPos(0.5F, 1.5F, 1.0F);
            this.LegUpperRight.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.Back2 = new ModelRenderer(this, 30, 25);
            this.Back2.setPos(-0.01F, 0.0F, 0.0F);
            this.Back2.addBox(-1.5F, -0.9F, -0.5F, 3.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Back2, -0.500909508638178F, 0.0F, 0.0F);
            this.BottomJaw = new ModelRenderer(this, 33, 10);
            this.BottomJaw.setPos(0.0F, 0.9F, -1.0F);
            this.BottomJaw.addBox(-0.5F, -0.5F, -1.7F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(BottomJaw, -0.04555309164612875F, 0.0F, 0.0F);
            this.LegUpperLeft = new ModelRenderer(this, 13, 11);
            this.LegUpperLeft.mirror = true;
            this.LegUpperLeft.setPos(-0.5F, 1.5F, 1.0F);
            this.LegUpperLeft.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.MiddleToeRight = new ModelRenderer(this, 13, 8);
            this.MiddleToeRight.setPos(0.01F, 2.3F, -0.5F);
            this.MiddleToeRight.addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(MiddleToeRight, 0.04555309164612875F, 0.0F, 0.0F);
            this.MiddleToeLeft = new ModelRenderer(this, 13, 8);
            this.MiddleToeLeft.mirror = true;
            this.MiddleToeLeft.setPos(0.01F, 2.3F, -0.5F);
            this.MiddleToeLeft.addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(MiddleToeLeft, 0.04555309164612875F, 0.0F, 0.0F);
            this.RightToeRight_1 = new ModelRenderer(this, 14, 5);
            this.RightToeRight_1.setPos(0.0F, 0.1F, 0.0F);
            this.RightToeRight_1.addBox(-0.5F, 0.0F, -1.3F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightToeRight_1, 0.0F, 0.45535640450848164F, 0.0F);
            this.Tail = new ModelRenderer(this, 20, 27);
            this.Tail.setPos(0.0F, -2.0F, 3.0F);
            this.Tail.addBox(-1.5F, -0.5F, 0.0F, 3.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail, -0.500909508638178F, 0.0F, 0.0F);
            this.WingRight = new ModelRenderer(this, 0, 7);
            this.WingRight.setPos(-1.5F, -1.5F, 0.0F);
            this.WingRight.addBox(-1.0F, -0.5F, -1.5F, 1.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.RightToeRight = new ModelRenderer(this, 14, 5);
            this.RightToeRight.mirror = true;
            this.RightToeRight.setPos(0.0F, 0.1F, 0.0F);
            this.RightToeRight.addBox(-0.5F, 0.0F, -1.3F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightToeRight, 0.0F, 0.45535640450848164F, 0.0F);
            this.LeftToeRight = new ModelRenderer(this, 14, 5);
            this.LeftToeRight.setPos(0.0F, 0.1F, 0.0F);
            this.LeftToeRight.addBox(-0.5F, 0.0F, -1.3F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftToeRight, 0.0F, -0.45535640450848164F, 0.0F);
            this.WingLeft = new ModelRenderer(this, 0, 7);
            this.WingLeft.mirror = true;
            this.WingLeft.setPos(1.5F, -1.5F, 0.0F);
            this.WingLeft.addBox(0.0F, -0.5F, -1.5F, 1.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.Back1 = new ModelRenderer(this, 30, 29);
            this.Back1.setPos(0.01F, -2.1F, 0.3F);
            this.Back1.addBox(-1.5F, -1.0F, -2.0F, 3.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Back1, 0.3186971254089062F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 21);
            this.Body.setPos(0.0F, 16.3F, 0.0F);
            this.Body.addBox(-2.0F, -2.5F, -2.5F, 4.0F, 5.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, -0.13665927909957545F, 0.0F, 0.0F);
            this.NeckBase = new ModelRenderer(this, 15, 20);
            this.NeckBase.setPos(0.0F, -2.0F, -2.0F);
            this.NeckBase.addBox(-1.5F, -0.4F, -1.0F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckBase, -0.7285004590772052F, 0.0F, 0.0F);
            this.Jaw = new ModelRenderer(this, 33, 6);
            this.Jaw.setPos(0.0F, 0.5F, -1.0F);
            this.Jaw.addBox(-1.0F, -0.5F, -2.2F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Jaw, 0.18203784630933073F, 0.0F, 0.0F);
            this.MiddleToeLeft.addChild(this.LeftToeLeft);
            this.Body.addChild(this.ThighRight);
            this.Jaw.addChild(this.Nose);
            this.LegUpperRight.addChild(this.LegBottomRight);
            this.Body.addChild(this.ThighLeft);
            this.NeckBase.addChild(this.Neck);
            this.LegUpperLeft.addChild(this.LegBottomLeft);
            this.Neck.addChild(this.Head);
            this.ThighRight.addChild(this.LegUpperRight);
            this.Back1.addChild(this.Back2);
            this.Head.addChild(this.BottomJaw);
            this.ThighLeft.addChild(this.LegUpperLeft);
            this.LegBottomRight.addChild(this.MiddleToeRight);
            this.LegBottomLeft.addChild(this.MiddleToeLeft);
            this.MiddleToeRight.addChild(this.RightToeRight_1);
            this.Body.addChild(this.Tail);
            this.Body.addChild(this.WingRight);
            this.MiddleToeLeft.addChild(this.RightToeRight);
            this.MiddleToeRight.addChild(this.LeftToeRight);
            this.Body.addChild(this.WingLeft);
            this.Body.addChild(this.Back1);
            this.Body.addChild(this.NeckBase);
            this.Head.addChild(this.Jaw);
            this.saveBase();

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
            this.NeckBase.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.73F;
            this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.05F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.2f;
            float degree = 1.0f;
            this.NeckBase.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.4F) * 0.5F - 0.73F;
            this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.3F) * 0.5F + 0.05F;
            this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.14F;
            this.Body.y = MathHelper.cos(4.5F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree) * 0.5F + 16.3F;

            this.ThighLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.27F;
            this.ThighLeft.y = MathHelper.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 2F) * 0.5F + 1.3F;
            this.LegUpperLeft.xRot = MathHelper.cos(0.5F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 3F) * 0.5F;
            this.MiddleToeLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.05F;
            this.ThighRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.27F;
            this.ThighRight.y = MathHelper.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -2F) * 0.5F + 1.3F;
            this.LegUpperRight.xRot = MathHelper.cos(0.5F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -3F) * 0.5F;
            this.MiddleToeRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.05F;
        }
    }
}



