package com.github.artyarticus.ecoregions.client.model;

import com.github.artyarticus.ecoregions.entity.AoudadEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class AoudadModel extends ZawaBaseModel<AoudadEntity> {
    public ModelPart Chest;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Chest);
        }

        return this.parts;
    }

    public static class Adult extends AoudadModel {
        public ModelPart Body;
        public ModelPart Neck;
        public ModelPart ArmBaseLeft;
        public ModelPart ArmBaseRight;
        public ModelPart Hips;
        public ModelPart ThighLeft;
        public ModelPart Tail1;
        public ModelPart ThighRight;
        public ModelPart UpperLegLeft;
        public ModelPart LowerLegLeft;
        public ModelPart FootLeft;
        public ModelPart Tail2;
        public ModelPart UpperLegRight;
        public ModelPart LowerLegRight;
        public ModelPart FootRight;
        public ModelPart NeckLower;
        public ModelPart Head;
        public ModelPart Mane1;
        public ModelPart Mane2;
        public ModelPart Snout;
        public ModelPart EarLeft;
        public ModelPart HornLeft1;
        public ModelPart HornRight1;
        public ModelPart EarRight;
        public ModelPart shape36;
        public ModelPart Nose;
        public ModelPart Beard;
        public ModelPart HornLeft2;
        public ModelPart HornLeftMale3;
        public ModelPart HornLeftFemale3;
        public ModelPart HornLeftMale4;
        public ModelPart HornLeftMale5;
        public ModelPart HornLeftFemale4;
        public ModelPart HornLeftFemale5;
        public ModelPart HornRight2;
        public ModelPart HornRightMale3;
        public ModelPart HornRightFemale3;
        public ModelPart HornRightMale4;
        public ModelPart HornRightMale5;
        public ModelPart HornRightFemale4;
        public ModelPart HornRightFemale5;
        public ModelPart UpperArmLeft;
        public ModelPart ArmLeft;
        public ModelPart HandLeft;
        public ModelPart UpperArmRight;
        public ModelPart ArmRight;
        public ModelPart HandRight;

        public Adult(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.ArmBaseLeft = this.Chest.getChild("ArmBaseLeft");
            this.UpperArmLeft = this.ArmBaseLeft.getChild("UpperArmLeft");
            this.ArmLeft = this.UpperArmLeft.getChild("ArmLeft");
            this.HandLeft = this.ArmLeft.getChild("HandLeft");

            this.ArmBaseRight = this.Chest.getChild("ArmBaseRight");
            this.UpperArmRight = this.ArmBaseRight.getChild("UpperArmRight");
            this.ArmRight = this.UpperArmRight.getChild("ArmRight");
            this.HandRight = this.ArmRight.getChild("HandRight");

            this.Body = this.Chest.getChild("Body");
            this.Hips = this.Body.getChild("Hips");
            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.UpperLegLeft = this.ThighLeft.getChild("UpperLegLeft");
            this.LowerLegLeft = this.UpperLegLeft.getChild("LowerLegLeft");
            this.FootLeft = this.LowerLegLeft.getChild("FootLeft");

            this.Tail1 = this.Hips.getChild("Tail1");
            this.Tail2 = this.Tail1.getChild("Tail2");

            this.ThighRight = this.Hips.getChild("ThighRight");
            this.UpperLegRight = this.ThighRight.getChild("UpperLegRight");
            this.LowerLegRight = this.UpperLegRight.getChild("LowerLegRight");
            this.FootRight = this.LowerLegRight.getChild("FootRight");

            this.Neck = this.Chest.getChild("Neck");
            this.NeckLower = this.Neck.getChild("NeckLower");
            this.Mane1 = this.NeckLower.getChild("Mane1");
            this.Mane2 = this.Mane1.getChild("Mane2");

            this.Head = this.Neck.getChild("Head");
            this.EarLeft = this.Head.getChild("EarLeft");

            this.HornRight1 = this.Head.getChild("HornRight1");
            this.HornRight2 = this.HornRight1.getChild("HornRight2");
            this.HornRightFemale3 = this.HornRight2.getChild("HornRightFemale3");
            this.HornRightFemale4 = this.HornRightFemale3.getChild("HornRightFemale4");
            this.HornRightFemale5 = this.HornRightFemale4.getChild("HornRightFemale5");

            this.HornRightMale3 = this.HornRight2.getChild("HornRightMale3");
            this.HornRightMale4 = this.HornRightMale3.getChild("HornRightMale4");
            this.HornRightMale5 = this.HornRightMale4.getChild("HornRightMale5");

            this.EarRight = this.Head.getChild("EarRight");

            this.HornLeft1 = this.Head.getChild("HornLeft1");
            this.HornLeft2 = this.HornLeft1.getChild("HornLeft2");
            this.HornLeftFemale3 = this.HornLeft2.getChild("HornLeftFemale3");
            this.HornLeftFemale4 = this.HornLeftFemale3.getChild("HornLeftFemale4");
            this.HornLeftFemale5 = this.HornLeftFemale4.getChild("HornLeftFemale5");

            this.HornLeftMale3 = this.HornLeft2.getChild("HornLeftMale3");
            this.HornLeftMale4 = this.HornLeftMale3.getChild("HornLeftMale4");
            this.HornLeftMale5 = this.HornLeftMale4.getChild("HornLeftMale5");

            this.Snout = this.Head.getChild("Snout");
            this.Nose = this.Snout.getChild("Nose");

            this.shape36 = this.Snout.getChild("shape36");
            this.Beard = this.shape36.getChild("Beard");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Chest = partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 0).addBox(-3.5F, -5.0F, -3.0F, 7.0F, 9.0F, 6.0F), PartPose.offsetAndRotation(0.0F, 11.0F, -6.1F, -0.13962634015954636F, 0.0F, 0.0F));
            PartDefinition ArmBaseLeft = Chest.addOrReplaceChild("ArmBaseLeft", CubeListBuilder.create().texOffs(22, 34).mirror(true).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 6.0F, 4.0F), PartPose.offsetAndRotation(2.4F, -0.3F, -0.6F, 0.2275909337942703F, 0.0F, 0.0F));
            PartDefinition UpperArmLeft = ArmBaseLeft.addOrReplaceChild("UpperArmLeft", CubeListBuilder.create().texOffs(35, 65).mirror(true).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 3.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 5.8F, 1.0F, -0.08726646259971647F, 0.0F, 0.0F));
            PartDefinition ArmLeft = UpperArmLeft.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(46, 35).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 2.0F), PartPose.offset(-0.05F, 2.8F, -2.0F));
            PartDefinition HandLeft = ArmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(55, 37).mirror(true).addBox(-1.0F, -0.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offset(-0.1F, 2.9F, 0.8F));

            PartDefinition ArmBaseRight = Chest.addOrReplaceChild("ArmBaseRight", CubeListBuilder.create().texOffs(22, 34).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 6.0F, 4.0F), PartPose.offsetAndRotation(-2.4F, -0.3F, -0.6F, 0.2275909337942703F, 0.0F, 0.0F));
            PartDefinition UpperArmRight = ArmBaseRight.addOrReplaceChild("UpperArmRight", CubeListBuilder.create().texOffs(35, 65).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 3.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 5.8F, 1.0F, -0.08726646259971647F, 0.0F, 0.0F));
            PartDefinition ArmRight = UpperArmRight.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(46, 35).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 2.0F), PartPose.offset(0.05F, 2.8F, -2.0F));
            PartDefinition HandRight = ArmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(55, 37).addBox(-1.0F, -0.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offset(0.1F, 2.9F, 0.8F));

            PartDefinition Body = Chest.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(27, 1).addBox(-4.0F, -9.0F, 0.0F, 8.0F, 9.0F, 8.0F), PartPose.offsetAndRotation(0.0F, 4.0F, 3.0F, 0.20943951023931953F, 0.0F, 0.0F));
            PartDefinition Hips = Body.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 16).addBox(-3.0F, 0.0F, 0.0F, 6.0F, 8.0F, 6.0F), PartPose.offsetAndRotation(0.0F, -9.0F, 8.0F, -0.3665191429188092F, 0.0F, 0.0F));
            PartDefinition ThighLeft = Hips.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(0, 49).mirror(true).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 8.0F, 5.0F), PartPose.offsetAndRotation(2.6F, 0.8F, 3.0F, 0.17453292519943295F, 0.0F, 0.0F));
            PartDefinition UpperLegLeft = ThighLeft.addOrReplaceChild("UpperLegLeft", CubeListBuilder.create().texOffs(19, 54).mirror(true).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 7.4F, -0.5F, 0.8196066007575706F, 0.0F, 0.0F));
            PartDefinition LowerLegLeft = UpperLegLeft.addOrReplaceChild("LowerLegLeft", CubeListBuilder.create().texOffs(32, 53).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 7.0F, 2.0F), PartPose.offsetAndRotation(-0.05F, 4.0F, 1.5F, -0.956091342937205F, 0.0F, 0.0F));
            PartDefinition FootLeft = LowerLegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(41, 58).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-0.1F, 6.0F, -1.4F, 0.2275909337942703F, 0.0F, 0.0F));

            PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(50, 52).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.3F, 6.0F, 0.8136724786376288F, 0.0F, 0.0F));
            PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(50, 52).addBox(-1.05F, 0.0F, -3.0F, 2.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, -0.5082398928281348F, 0.0F, 0.0F));

            PartDefinition ThighRight = Hips.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(0, 49).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 8.0F, 5.0F), PartPose.offsetAndRotation(-2.6F, 0.8F, 3.0F, 0.17453292519943295F, 0.0F, 0.0F));
            PartDefinition UpperLegRight = ThighRight.addOrReplaceChild("UpperLegRight", CubeListBuilder.create().texOffs(19, 54).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 7.4F, -0.5F, 0.8196066007575706F, 0.0F, 0.0F));
            PartDefinition LowerLegRight = UpperLegRight.addOrReplaceChild("LowerLegRight", CubeListBuilder.create().texOffs(32, 53).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 7.0F, 2.0F), PartPose.offsetAndRotation(0.05F, 4.0F, 1.5F, -0.956091342937205F, 0.0F, 0.0F));
            PartDefinition FootRight = LowerLegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(41, 58).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.1F, 6.0F, -1.4F, 0.2275909337942703F, 0.0F, 0.0F));

            PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(46, 20).addBox(-2.0F, -6.5F, -2.0F, 4.0F, 9.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -2.5F, -3.2F, 1.092750655326294F, 0.0F, 0.0F));
            PartDefinition NeckLower = Neck.addOrReplaceChild("NeckLower", CubeListBuilder.create().texOffs(30, 20).addBox(-1.5F, -6.0F, 0.0F, 3.0F, 8.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 1.5F, -4.4F, -0.3186971254089062F, 0.0F, 0.0F));
            PartDefinition Mane1 = NeckLower.addOrReplaceChild("Mane1", CubeListBuilder.create().texOffs(0, 63).addBox(-1.0F, 0.0F, -7.0F, 2.0F, 9.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -2.5F, 7.0F, -0.6829473549475088F, 0.0F, 0.0F));
            PartDefinition Mane2 = Mane1.addOrReplaceChild("Mane2", CubeListBuilder.create().texOffs(19, 64).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 6.0F, 6.0F, new CubeDeformation(-0.05F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-0.0F, 9.0F, -7.0F, 0.8196066007575706F, 0.0F, 0.0F));

            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 38).addBox(-2.5F, -3.0F, -2.0F, 5.0F, 6.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -5.0F, -1.0F, -0.7604399497676072F, 0.0F, 0.0F));
            PartDefinition EarLeft = Head.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(15, 37).mirror(true).addBox(-1.0F, -3.0F, 0.0F, 2.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(2.0F, -1.3F, 0.6F, -0.591841146688116F, -0.0911061832922575F, 1.0016444470669013F));

            PartDefinition HornRight1 = Head.addOrReplaceChild("HornRight1", CubeListBuilder.create().texOffs(35, 43).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-1.1F, -2.9F, -1.5F, -0.500909508638178F, -0.4098033003787853F, -0.04555309164612875F));
            PartDefinition HornRight2 = HornRight1.addOrReplaceChild("HornRight2", CubeListBuilder.create().texOffs(44, 43).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.05F, -1.9F, 0.0F, -0.45535640450848164F, 0.0F, -0.0911061832922575F));
            PartDefinition HornRightFemale3 = HornRight2.addOrReplaceChild("HornRightFemale3", CubeListBuilder.create().texOffs(53, 63).addBox(-1.0F, -3.0F, 0.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-0.05F, -2.0F, 0.0F, -0.591841146688116F, 0.0F, 0.0F));
            PartDefinition HornRightFemale4 = HornRightFemale3.addOrReplaceChild("HornRightFemale4", CubeListBuilder.create().texOffs(55, 68).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.05F, -3.0F, 0.0F, -0.8196066007575706F, 0.0F, 0.0F));
            PartDefinition HornRightFemale5 = HornRightFemale4.addOrReplaceChild("HornRightFemale5", CubeListBuilder.create().texOffs(49, 64).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-0.05F, -3.0F, 0.5F, -0.591841146688116F, 0.0F, 0.0F));

            PartDefinition HornRightMale3 = HornRight2.addOrReplaceChild("HornRightMale3", CubeListBuilder.create().texOffs(53, 43).addBox(-1.0F, -4.0F, 0.0F, 2.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(-0.05F, -2.0F, 0.0F, -0.591841146688116F, 0.0F, 0.0F));
            PartDefinition HornRightMale4 = HornRightMale3.addOrReplaceChild("HornRightMale4", CubeListBuilder.create().texOffs(40, 48).addBox(-0.5F, -4.0F, 0.0F, 1.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(0.05F, -4.0F, 0.0F, -0.8196066007575706F, 0.0F, 0.0F));
            PartDefinition HornRightMale5 = HornRightMale4.addOrReplaceChild("HornRightMale5", CubeListBuilder.create().texOffs(49, 48).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.01F, -4.0F, 0.5F, -0.591841146688116F, 0.0F, 0.0F));

            PartDefinition EarRight = Head.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(15, 37).addBox(-1.0F, -3.0F, 0.0F, 2.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(-2.0F, -1.3F, 0.6F, -0.591841146688116F, 0.0911061832922575F, -1.0016444470669013F));

            PartDefinition HornLeft1 = Head.addOrReplaceChild("HornLeft1", CubeListBuilder.create().texOffs(35, 43).mirror(true).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(1.1F, -2.9F, -1.5F, -0.500909508638178F, 0.3642502295386026F, 0.04555309164612875F));
            PartDefinition HornLeft2 = HornLeft1.addOrReplaceChild("HornLeft2", CubeListBuilder.create().texOffs(44, 43).mirror(true).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-0.05F, -1.9F, 0.0F, -0.45535640450848164F, 0.0F, 0.0911061832922575F));
            PartDefinition HornLeftFemale3 = HornLeft2.addOrReplaceChild("HornLeftFemale3", CubeListBuilder.create().texOffs(53, 63).mirror(true).addBox(-1.0F, -3.0F, 0.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.05F, -2.0F, 0.0F, -0.591841146688116F, 0.0F, 0.0F));
            PartDefinition HornLeftFemale4 = HornLeftFemale3.addOrReplaceChild("HornLeftFemale4", CubeListBuilder.create().texOffs(55, 68).mirror(true).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-0.05F, -3.0F, 0.0F, -0.8196066007575706F, 0.0F, 0.0F));
            PartDefinition HornLeftFemale5 = HornLeftFemale4.addOrReplaceChild("HornLeftFemale5", CubeListBuilder.create().texOffs(49, 64).mirror(true).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.05F, -3.0F, 0.5F, -0.591841146688116F, 0.0F, 0.0F));

            PartDefinition HornLeftMale3 = HornLeft2.addOrReplaceChild("HornLeftMale3", CubeListBuilder.create().texOffs(53, 43).mirror(true).addBox(-1.0F, -4.0F, 0.0F, 2.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(0.05F, -2.0F, 0.0F, -0.591841146688116F, 0.0F, 0.0F));
            PartDefinition HornLeftMale4 = HornLeftMale3.addOrReplaceChild("HornLeftMale4", CubeListBuilder.create().texOffs(40, 48).mirror(true).addBox(-0.5F, -4.0F, 0.0F, 1.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(-0.05F, -4.0F, 0.0F, -0.8196066007575706F, 0.0F, 0.0F));
            PartDefinition HornLeftMale5 = HornLeftMale4.addOrReplaceChild("HornLeftMale5", CubeListBuilder.create().texOffs(49, 48).mirror(true).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-0.01F, -4.0F, 0.5F, -0.591841146688116F, 0.0F, 0.0F));

            PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(0, 30).addBox(-1.5F, 0.0F, -4.0F, 3.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -0.5F, -1.6F, 0.3574434228189554F, 0.0F, 0.0F));
            PartDefinition Nose = Snout.addOrReplaceChild("Nose", CubeListBuilder.create().texOffs(19, 46).addBox(-1.0F, 0.0F, -4.0F, 2.0F, 2.0F, 5.0F), PartPose.offsetAndRotation(0.0F, -1.3F, -0.4F, 0.27314402127920984F, 0.0F, 0.0F));

            PartDefinition shape36 = Snout.addOrReplaceChild("shape36", CubeListBuilder.create().texOffs(15, 30).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 1.9F, -1.7F, -0.18203784630933073F, 0.0F, 0.0F));
            PartDefinition Beard = shape36.addOrReplaceChild("Beard", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.5F, -1.2F, -0.3909537457888271F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 64, 128);
        }

        @Override
        public void setupAnim(AoudadEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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
                // this.LowerArmLeft.xRot = Mth.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree) * 0.5F - 0.04F;
                this.HandLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;
                this.ArmBaseRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.6F) * 0.5F + 0.09F;
                this.UpperArmRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.09F;
                //this.LowerArmRight.xRot = Mth.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1F) * 0.5F - 0.04F;
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

    public static class Child extends AoudadModel {
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
        public void setupAnim(AoudadEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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

