package com.github.artyarticus.ecoregions.client.model;

import com.github.artyarticus.ecoregions.entity.GazelleEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class GazelleModel extends ZawaBaseModel<GazelleEntity> {
    public ModelPart Chest;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Chest);
        }

        return this.parts;
    }

    public static class Adult extends GazelleModel {
        public ModelPart Body;
        public ModelPart ArmBaseLeft;
        public ModelPart Neck;
        public ModelPart ArmBaseRight;
        public ModelPart Hips;
        public ModelPart ThighLeft;
        public ModelPart Tail;
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
        public ModelPart Head;
        public ModelPart Snout;
        public ModelPart EarLeft;
        public ModelPart CuvierHorn1;
        public ModelPart ThomsonHorn1;
        public ModelPart SoemmeringHorn1;
        public ModelPart EarRight;
        public ModelPart ThomsonHorn1_1;
        public ModelPart SoemmeringHorn1_1;
        public ModelPart CuvierHorn1_1;
        public ModelPart TopSnout;
        public ModelPart Mouth;
        public ModelPart part14;
        public ModelPart CuvierHorn2;
        public ModelPart CuvierHorn3;
        public ModelPart ThomsonHorn2;
        public ModelPart ThomsonHorn3;
        public ModelPart SommeringHorn2;
        public ModelPart SommeringHorn3;
        public ModelPart ThomsonHorn2_1;
        public ModelPart ThomsonHorn3_1;
        public ModelPart SommeringHorn2_1;
        public ModelPart SommeringHorn3_1;
        public ModelPart CuvierHorn2_1;
        public ModelPart CuvierHorn3_1;
        public ModelPart UpperArmRight;
        public ModelPart ArmRight;
        public ModelPart HandRight;

        public Adult(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.ArmBaseRight = this.Chest.getChild("ArmBaseRight");
            this.UpperArmRight = this.ArmBaseRight.getChild("UpperArmRight");
            this.ArmRight = this.UpperArmRight.getChild("ArmRight");
            this.HandRight = this.ArmRight.getChild("HandRight");

            this.Neck = this.Chest.getChild("Neck");
            this.Head = this.Neck.getChild("Head");
            this.EarLeft = this.Head.getChild("EarLeft");

            this.Snout = this.Head.getChild("Snout");
            this.TopSnout = this.Snout.getChild("TopSnout");
            this.part14 = this.TopSnout.getChild("part14");

            this.Mouth = this.Snout.getChild("Mouth");

            this.CuvierHorn1_1 = this.Head.getChild("CuvierHorn1_1");
            this.CuvierHorn2_1 = this.CuvierHorn1_1.getChild("CuvierHorn2_1");
            this.CuvierHorn3_1 = this.CuvierHorn2_1.getChild("CuvierHorn3_1");

            this.EarRight = this.Head.getChild("EarRight");

            this.ThomsonHorn1 = this.Head.getChild("ThomsonHorn1");
            this.ThomsonHorn2 = this.ThomsonHorn1.getChild("ThomsonHorn2");
            this.ThomsonHorn3 = this.ThomsonHorn2.getChild("ThomsonHorn3");

            this.SoemmeringHorn1_1 = this.Head.getChild("SoemmeringHorn1_1");
            this.SommeringHorn2_1 = this.SoemmeringHorn1_1.getChild("SommeringHorn2_1");
            this.SommeringHorn3_1 = this.SommeringHorn2_1.getChild("SommeringHorn3_1");

            this.ThomsonHorn1_1 = this.Head.getChild("ThomsonHorn1_1");
            this.ThomsonHorn2_1 = this.ThomsonHorn1_1.getChild("ThomsonHorn2_1");
            this.ThomsonHorn3_1 = this.ThomsonHorn2_1.getChild("ThomsonHorn3_1");

            this.CuvierHorn1 = this.Head.getChild("CuvierHorn1");
            this.CuvierHorn2 = this.CuvierHorn1.getChild("CuvierHorn2");
            this.CuvierHorn3 = this.CuvierHorn2.getChild("CuvierHorn3");

            this.SoemmeringHorn1 = this.Head.getChild("SoemmeringHorn1");
            this.SommeringHorn2 = this.SoemmeringHorn1.getChild("SommeringHorn2");
            this.SommeringHorn3 = this.SommeringHorn2.getChild("SommeringHorn3");

            this.Body = this.Chest.getChild("Body");
            this.Hips = this.Body.getChild("Hips");
            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.UpperLegLeft = this.ThighLeft.getChild("UpperLegLeft");
            this.LowerLegLeft = this.UpperLegLeft.getChild("LowerLegLeft");
            this.FootLeft = this.LowerLegLeft.getChild("FootLeft");

            this.Tail = this.Hips.getChild("Tail");

            this.ThighRight = this.Hips.getChild("ThighRight");
            this.UpperLegRight = this.ThighRight.getChild("UpperLegRight");
            this.LowerLegRight = this.UpperLegRight.getChild("LowerLegRight");
            this.FootRight = this.LowerLegRight.getChild("FootRight");

            this.ArmBaseLeft = this.Chest.getChild("ArmBaseLeft");
            this.UpperArmLeft = this.ArmBaseLeft.getChild("UpperArmLeft");
            this.ArmLeft = this.UpperArmLeft.getChild("ArmLeft");
            this.HandLeft = this.ArmLeft.getChild("HandLeft");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Chest = partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -3.5F, -2.5F, 5.0F, 7.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 11.2F, -5.0F, -0.273493095119092F, 0.0F, 0.0F));
            PartDefinition ArmBaseRight = Chest.addOrReplaceChild("ArmBaseRight", CubeListBuilder.create().texOffs(0, 42).mirror(true).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 6.0F, 4.0F), PartPose.offsetAndRotation(-1.51F, -1.4F, -0.6F, 0.35081118630876296F, 0.0F, 0.0F));
            PartDefinition UpperArmRight = ArmBaseRight.addOrReplaceChild("UpperArmRight", CubeListBuilder.create().texOffs(15, 46).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 5.8F, 1.0F, -0.08726646259971647F, 0.0F, 0.0F));
            PartDefinition ArmRight = UpperArmRight.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(24, 46).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 2.0F), PartPose.offset(0.05F, 3.8F, -2.0F));
            PartDefinition HandRight = ArmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(33, 48).mirror(true).addBox(-0.9F, -0.5F, -1.5F, 2.0F, 2.0F, 2.0F), PartPose.offset(0.0F, 3.5F, 1.0F));

            PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(40, 0).addBox(-1.5F, 0.1F, -5.0F, 3.0F, 4.0F, 9.0F), PartPose.offsetAndRotation(0.0F, -3.3F, -2.0F, -0.7400196294772066F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(23, 5).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 2.8F, -4.1F, 1.1718140491363485F, 0.0F, 0.0F));
            PartDefinition EarLeft = Head.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(36, 0).addBox(-0.5F, -0.6F, -1.0F, 3.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(1.5F, -1.0F, 2.0F, 0.0F, -0.2663372478490763F, -0.913156259317111F));

            PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(37, 14).addBox(-1.5F, 0.0F, -3.6F, 3.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -0.6F, -1.0F, 0.012915436631205606F, 0.0F, 0.0F));
            PartDefinition TopSnout = Snout.addOrReplaceChild("TopSnout", CubeListBuilder.create().texOffs(26, 14).addBox(-1.0F, -0.6F, -3.0F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -0.1F, -0.2F, 0.2275909337942703F, 0.0F, 0.0F));
            PartDefinition part14 = TopSnout.addOrReplaceChild("part14", CubeListBuilder.create().texOffs(27, 0).addBox(-1.0F, -0.9F, -1.4F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-0.01F, 0.0F, -2.0F, -0.11746065899211351F, 0.0F, 0.0F));

            PartDefinition Mouth = Snout.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(50, 15).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 1.6F, -0.5F, -0.09546950642224333F, 0.0F, 0.0F));

            PartDefinition CuvierHorn1_1 = Head.addOrReplaceChild("CuvierHorn1_1", CubeListBuilder.create().texOffs(27, 21).mirror(true).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-1.1F, -1.5F, -0.5F, -0.7054620516981749F, -0.3186971254089062F, 0.2275909337942703F));
            PartDefinition CuvierHorn2_1 = CuvierHorn1_1.addOrReplaceChild("CuvierHorn2_1", CubeListBuilder.create().texOffs(32, 21).mirror(true).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.06F, -1.75F, 0.0F, -0.3186971254089062F, 0.0F, -0.3186971254089062F));
            PartDefinition CuvierHorn3_1 = CuvierHorn2_1.addOrReplaceChild("CuvierHorn3_1", CubeListBuilder.create().texOffs(37, 21).mirror(true).addBox(-0.45F, -1.7F, -0.6F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.27314402127920984F, 0.0F, 0.3642502295386026F));

            PartDefinition EarRight = Head.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(36, 0).mirror(true).addBox(-2.5F, -0.6F, -1.0F, 3.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-1.5F, -1.0F, 2.0F, 0.0F, 0.2663372478490763F, 0.913156259317111F));

            PartDefinition ThomsonHorn1 = Head.addOrReplaceChild("ThomsonHorn1", CubeListBuilder.create().texOffs(27, 30).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(1.1F, -1.5F, -0.5F, -0.7227408405876907F, 0.11728612207217244F, 0.0F));
            PartDefinition ThomsonHorn2 = ThomsonHorn1.addOrReplaceChild("ThomsonHorn2", CubeListBuilder.create().texOffs(32, 30).addBox(-0.55F, -3.2F, -0.65F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -2.5F, 0.0F, -0.38048176361895836F, 0.0F, 0.11414453241463887F));
            PartDefinition ThomsonHorn3 = ThomsonHorn2.addOrReplaceChild("ThomsonHorn3", CubeListBuilder.create().texOffs(37, 30).addBox(-0.55F, -3.1F, -0.55F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -2.95F, 0.0F, 0.38048176361895836F, 0.0F, -0.11414453241463887F));

            PartDefinition SoemmeringHorn1_1 = Head.addOrReplaceChild("SoemmeringHorn1_1", CubeListBuilder.create().texOffs(27, 40).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(-1.1F, -1.5F, -0.5F, -0.9892526253567082F, -0.11728612207217244F, 0.0F));
            PartDefinition SommeringHorn2_1 = SoemmeringHorn1_1.addOrReplaceChild("SommeringHorn2_1", CubeListBuilder.create().texOffs(32, 41).addBox(-2.5F, 0.0F, -0.5F, 3.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -4.3F, 0.0F, 0.19024088180947918F, 0.0F, 0.5707226787179512F));
            PartDefinition SommeringHorn3_1 = SommeringHorn2_1.addOrReplaceChild("SommeringHorn3_1", CubeListBuilder.create().texOffs(41, 41).addBox(-0.9F, -2.3F, -0.5F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(-2.0F, 0.1F, 0.0F, 0.11414453241463887F, -0.07609635771721872F, -0.2658136370892531F));

            PartDefinition ThomsonHorn1_1 = Head.addOrReplaceChild("ThomsonHorn1_1", CubeListBuilder.create().texOffs(27, 30).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(-1.1F, -1.5F, -0.5F, -0.7227408405876907F, -0.11728612207217244F, 0.0F));
            PartDefinition ThomsonHorn2_1 = ThomsonHorn1_1.addOrReplaceChild("ThomsonHorn2_1", CubeListBuilder.create().texOffs(32, 30).addBox(-0.45F, -3.2F, -0.65F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -2.5F, 0.0F, -0.38048176361895836F, 0.0F, -0.11414453241463887F));
            PartDefinition ThomsonHorn3_1 = ThomsonHorn2_1.addOrReplaceChild("ThomsonHorn3_1", CubeListBuilder.create().texOffs(37, 30).addBox(-0.45F, -3.1F, -0.55F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -2.95F, 0.0F, 0.38048176361895836F, 0.0F, 0.11414453241463887F));

            PartDefinition CuvierHorn1 = Head.addOrReplaceChild("CuvierHorn1", CubeListBuilder.create().texOffs(27, 21).mirror(true).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(1.1F, -1.5F, -0.5F, -0.7054620516981749F, 0.3186971254089062F, -0.2275909337942703F));
            PartDefinition CuvierHorn2 = CuvierHorn1.addOrReplaceChild("CuvierHorn2", CubeListBuilder.create().texOffs(32, 21).mirror(true).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-0.06F, -1.75F, 0.0F, -0.3186971254089062F, 0.0F, 0.3186971254089062F));
            PartDefinition CuvierHorn3 = CuvierHorn2.addOrReplaceChild("CuvierHorn3", CubeListBuilder.create().texOffs(37, 21).mirror(true).addBox(-0.55F, -1.7F, -0.6F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.27314402127920984F, 0.0F, -0.3642502295386026F));

            PartDefinition SoemmeringHorn1 = Head.addOrReplaceChild("SoemmeringHorn1", CubeListBuilder.create().texOffs(27, 40).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(1.1F, -1.5F, -0.5F, -0.9892526253567082F, 0.11728612207217244F, 0.0F));
            PartDefinition SommeringHorn2 = SoemmeringHorn1.addOrReplaceChild("SommeringHorn2", CubeListBuilder.create().texOffs(32, 41).addBox(-0.5F, 0.0F, -0.5F, 3.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -4.3F, 0.0F, 0.19024088180947918F, 0.0F, -0.5707226787179512F));
            PartDefinition SommeringHorn3 = SommeringHorn2.addOrReplaceChild("SommeringHorn3", CubeListBuilder.create().texOffs(41, 41).addBox(-0.1F, -2.3F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, -0.0F)), PartPose.offsetAndRotation(2.0F, 0.1F, 0.0F, 0.11414453241463887F, 0.07609635771721872F, 0.2658136370892531F));

            PartDefinition Body = Chest.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 13).addBox(-3.0F, -1.0F, -0.5F, 6.0F, 7.0F, 7.0F, new CubeDeformation(0.0F, 0.0F, 0.1F)), PartPose.offsetAndRotation(0.0F, -2.5F, 1.5F, 0.27401668923415834F, 0.0F, 0.0F));
            PartDefinition Hips = Body.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 28).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 6.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -1.0F, 6.6F, -0.1574287065193718F, 0.0F, 0.0F));
            PartDefinition ThighLeft = Hips.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(0, 53).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 7.0F, 4.0F), PartPose.offsetAndRotation(1.51F, 1.0F, 2.0F, 0.11135200827460905F, 0.0F, 0.0F));
            PartDefinition UpperLegLeft = ThighLeft.addOrReplaceChild("UpperLegLeft", CubeListBuilder.create().texOffs(15, 57).addBox(-1.0F, -0.2F, -0.3F, 2.0F, 5.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 6.3F, -1.3F, 0.7330382858376184F, 0.0F, 0.0F));
            PartDefinition LowerLegLeft = UpperLegLeft.addOrReplaceChild("LowerLegLeft", CubeListBuilder.create().texOffs(24, 57).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 5.0F, 2.0F), PartPose.offsetAndRotation(-0.05F, 4.8F, 1.7F, -0.8203047484373349F, 0.0F, 0.0F));
            PartDefinition FootLeft = LowerLegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(33, 60).addBox(-1.1F, -0.5F, -1.6F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 4.5F, -1.0F, 0.13962634015954636F, 0.0F, 0.0F));

            PartDefinition Tail = Hips.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(19, 33).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, 0.3186971254089062F, 0.0F, 0.0F));

            PartDefinition ThighRight = Hips.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(0, 53).mirror(true).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 7.0F, 4.0F), PartPose.offsetAndRotation(-1.51F, 1.0F, 2.0F, 0.11135200827460905F, 0.0F, 0.0F));
            PartDefinition UpperLegRight = ThighRight.addOrReplaceChild("UpperLegRight", CubeListBuilder.create().texOffs(15, 57).mirror(true).addBox(-1.0F, -0.2F, -0.3F, 2.0F, 5.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 6.3F, -1.3F, 0.7330382858376184F, 0.0F, 0.0F));
            PartDefinition LowerLegRight = UpperLegRight.addOrReplaceChild("LowerLegRight", CubeListBuilder.create().texOffs(24, 57).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 5.0F, 2.0F), PartPose.offsetAndRotation(0.05F, 4.8F, 1.7F, -0.8203047484373349F, 0.0F, 0.0F));
            PartDefinition FootRight = LowerLegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(33, 60).mirror(true).addBox(-0.9F, -0.5F, -1.6F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 4.5F, -1.0F, 0.13962634015954636F, 0.0F, 0.0F));

            PartDefinition ArmBaseLeft = Chest.addOrReplaceChild("ArmBaseLeft", CubeListBuilder.create().texOffs(0, 42).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 6.0F, 4.0F), PartPose.offsetAndRotation(1.51F, -1.4F, -0.6F, 0.35081118630876296F, 0.0F, 0.0F));
            PartDefinition UpperArmLeft = ArmBaseLeft.addOrReplaceChild("UpperArmLeft", CubeListBuilder.create().texOffs(15, 46).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 5.8F, 1.0F, -0.08726646259971647F, 0.0F, 0.0F));
            PartDefinition ArmLeft = UpperArmLeft.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(24, 46).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 2.0F), PartPose.offset(-0.05F, 3.8F, -2.0F));
            PartDefinition HandLeft = ArmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(33, 48).addBox(-1.1F, -0.5F, -1.5F, 2.0F, 2.0F, 2.0F), PartPose.offset(0.0F, 3.5F, 1.0F));

            return LayerDefinition.create(meshDefinition, 64, 64);
        }

        @Override
        public void setupAnim(GazelleEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 1.172F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.74F;
            this.Head.xRot = Mth.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F + 1.172F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (entity.isSprinting()) {
                float speed = 1.0f;
                float degree = 0.5f;
                this.Neck.xRot = Mth.cos(1.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.74F;
                this.Head.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 1.172F;

                this.Chest.y = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -1F) * 0.5F + 11.2F;
                this.Chest.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.1F) * 0.5F - 0.273F;
                this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.274F;
                this.Hips.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.157F;

                this.ArmBaseLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.6F) * 0.5F + 0.351F;
                this.UpperArmLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.087F;
                this.ArmLeft.xRot = Mth.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree) * 0.5F;
                this.HandLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;
                this.ArmBaseRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.6F) * 0.5F + 0.351F;
                this.UpperArmRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.087F;
                this.ArmRight.xRot = Mth.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1F) * 0.5F;
                this.HandRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;

                this.ThighLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.3F) * 0.5F + 0.111F;
                this.UpperLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.733F;
                this.LowerLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.820F;
                this.FootLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.139F;
                this.ThighRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.3F) * 0.5F + 0.111F;
                this.UpperLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.733F;
                this.LowerLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.820F;
                this.FootRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.139F;

            } else {
                float speed = 0.8f;
                float degree = 0.6f;
                this.Neck.xRot = Mth.cos(1.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.74F;
                this.Head.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 1.172F;

                this.Chest.y = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -1F) * 0.5F + 11.2F;
                this.Chest.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.1F) * 0.5F - 0.273F;
                this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.274F;
                this.Hips.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.157F;

                this.ArmBaseLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.6F) * 0.5F + 0.351F;
                this.UpperArmLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.087F;
                this.ArmLeft.xRot = Mth.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree) * 0.5F;
                this.HandLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;
                this.ArmBaseRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.6F) * 0.5F + 0.351F;
                this.UpperArmRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.087F;
                this.ArmRight.xRot = Mth.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1F) * 0.5F;
                this.HandRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;

                this.ThighLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.3F) * 0.5F + 0.111F;
                this.UpperLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.733F;
                this.LowerLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.820F;
                this.FootLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.139F;
                this.ThighRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.3F) * 0.5F + 0.111F;
                this.UpperLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.733F;
                this.LowerLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.820F;
                this.FootRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.139F;
            }
        }
    }

    public static class Child extends GazelleModel {
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
            this.ArmBaseRight = this.Chest.getChild("ArmBaseRight");
            this.UpperArmRight = this.ArmBaseRight.getChild("UpperArmRight");
            this.ArmRight = this.UpperArmRight.getChild("ArmRight");
            this.HandRight = this.ArmRight.getChild("HandRight");

            this.ArmBaseLeft = this.Chest.getChild("ArmBaseLeft");
            this.UpperArmLeft = this.ArmBaseLeft.getChild("UpperArmLeft");
            this.ArmLeft = this.UpperArmLeft.getChild("ArmLeft");
            this.HandLeft = this.ArmLeft.getChild("HandLeft");

            this.Neck = this.Chest.getChild("Neck");
            this.Head = this.Neck.getChild("Head");
            this.Snout = this.Head.getChild("Snout");
            this.TopSnout = this.Snout.getChild("TopSnout");

            this.Mouth = this.Snout.getChild("Mouth");

            this.EarRight = this.Head.getChild("EarRight");

            this.EarLeft = this.Head.getChild("EarLeft");

            this.Body = this.Chest.getChild("Body");
            this.Tail = this.Body.getChild("Tail");

            this.ThighLeft = this.Body.getChild("ThighLeft");
            this.UpperLegLeft = this.ThighLeft.getChild("UpperLegLeft");
            this.LowerLegLeft = this.UpperLegLeft.getChild("LowerLegLeft");
            this.FootLeft = this.LowerLegLeft.getChild("FootLeft");

            this.ThighRight = this.Body.getChild("ThighRight");
            this.UpperLegRight = this.ThighRight.getChild("UpperLegRight");
            this.LowerLegRight = this.UpperLegRight.getChild("LowerLegRight");
            this.FootRight = this.LowerLegRight.getChild("FootRight");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Chest = partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(13, 0).addBox(-1.5F, -2.0F, -2.0F, 3.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 15.9F, -2.5F, -0.2275909337942703F, 0.0F, 0.0F));
            PartDefinition ArmBaseRight = Chest.addOrReplaceChild("ArmBaseRight", CubeListBuilder.create().texOffs(15, 22).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-1.1F, 0.2F, -1.0F, 0.3490658503988659F, 0.0F, 0.0F));
            PartDefinition UpperArmRight = ArmBaseRight.addOrReplaceChild("UpperArmRight", CubeListBuilder.create().texOffs(24, 23).mirror(true).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 2.8F, 0.5F, -0.08726646259971647F, 0.0F, 0.0F));
            PartDefinition ArmRight = UpperArmRight.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(16, 27).mirror(true).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F), PartPose.offset(0.05F, 2.0F, -1.0F));
            PartDefinition HandRight = ArmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(21, 29).mirror(true).addBox(-0.5F, 0.0F, -0.7F, 1.0F, 1.0F, 1.0F), PartPose.offset(0.1F, 2.5F, 0.3F));

            PartDefinition ArmBaseLeft = Chest.addOrReplaceChild("ArmBaseLeft", CubeListBuilder.create().texOffs(15, 22).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(1.1F, 0.2F, -1.0F, 0.3490658503988659F, 0.0F, 0.0F));
            PartDefinition UpperArmLeft = ArmBaseLeft.addOrReplaceChild("UpperArmLeft", CubeListBuilder.create().texOffs(24, 23).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 2.8F, 0.5F, -0.08726646259971647F, 0.0F, 0.0F));
            PartDefinition ArmLeft = UpperArmLeft.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(16, 27).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F), PartPose.offset(-0.05F, 2.0F, -1.0F));
            PartDefinition HandLeft = ArmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(21, 29).addBox(-0.5F, 0.0F, -0.7F, 1.0F, 1.0F, 1.0F), PartPose.offset(-0.1F, 2.5F, 0.3F));

            PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -3.0F, -2.0F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, -0.2F)), PartPose.offsetAndRotation(0.0F, -1.0F, -2.0F, 0.9105382388075086F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(19, 9).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -2.6F, -1.0F, -0.591841146688116F, 0.0F, 0.0F));
            PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(24, 5).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.13962634015954636F, 0.0F, 0.0F));
            PartDefinition TopSnout = Snout.addOrReplaceChild("TopSnout", CubeListBuilder.create().texOffs(24, 1).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -0.7F, -0.1F, 0.4098033003787853F, 0.0F, 0.0F));

            PartDefinition Mouth = Snout.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(0, 13).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.4F, 0.1F, -0.04555309164612875F, 0.0F, 0.0F));

            PartDefinition EarRight = Head.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(26, 28).mirror(true).addBox(-0.5F, -2.5F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.2F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-1.0F, -0.5F, 0.6F, 0.0F, 0.4098033003787853F, -0.7740534966278743F));

            PartDefinition EarLeft = Head.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(26, 28).addBox(-0.5F, -2.5F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.2F, 0.0F, 0.0F)), PartPose.offsetAndRotation(1.0F, -0.5F, 0.6F, 0.0F, -0.4098033003787853F, 0.7740534966278743F));

            PartDefinition Body = Chest.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 9).addBox(-2.0F, -0.5F, -1.0F, 4.0F, 4.0F, 7.0F), PartPose.offsetAndRotation(0.0F, -1.5F, 0.0F, 0.2275909337942703F, 0.0F, 0.0F));
            PartDefinition Tail = Body.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(9, 0).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 5.5F, 0.45535640450848164F, 0.0F, 0.0F));

            PartDefinition ThighLeft = Body.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(0, 21).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(1.4F, 1.3F, 4.5F, -0.05235987755982988F, 0.0F, 0.0F));
            PartDefinition UpperLegLeft = ThighLeft.addOrReplaceChild("UpperLegLeft", CubeListBuilder.create().texOffs(0, 27).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 2.5F, -1.2F, 0.6632251157578453F, 0.0F, 0.0F));
            PartDefinition LowerLegLeft = UpperLegLeft.addOrReplaceChild("LowerLegLeft", CubeListBuilder.create().texOffs(10, 21).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(-0.05F, 3.0F, 1.7F, -0.767944870877505F, 0.0F, 0.0F));
            PartDefinition FootLeft = LowerLegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(6, 30).addBox(-0.5F, 0.0F, -0.7F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.1F, 3.7F, -0.7F, 0.13962634015954636F, 0.0F, 0.0F));

            PartDefinition ThighRight = Body.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(0, 21).mirror(true).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(-1.4F, 1.3F, 4.5F, -0.05235987755982988F, 0.0F, 0.0F));
            PartDefinition UpperLegRight = ThighRight.addOrReplaceChild("UpperLegRight", CubeListBuilder.create().texOffs(0, 27).mirror(true).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 2.5F, -1.2F, 0.6632251157578453F, 0.0F, 0.0F));
            PartDefinition LowerLegRight = UpperLegRight.addOrReplaceChild("LowerLegRight", CubeListBuilder.create().texOffs(10, 21).mirror(true).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(0.05F, 3.0F, 1.7F, -0.767944870877505F, 0.0F, 0.0F));
            PartDefinition FootRight = LowerLegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(6, 30).mirror(true).addBox(-0.5F, 0.0F, -0.7F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.1F, 3.7F, -0.7F, 0.13962634015954636F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 32, 32);
        }

        @Override
        public void setupAnim(GazelleEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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



