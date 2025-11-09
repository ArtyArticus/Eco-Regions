package com.github.artyarticus.ecoregions.client.model;

import com.github.artyarticus.ecoregions.entity.BassEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import org.zawamod.zawa.client.model.ZawaBaseAmbientModel;

public class BassModel extends ZawaBaseAmbientModel<BassEntity> {
    public ModelPart Body;
    public ModelPart Tail1;
    public ModelPart DorsalFin;
    public ModelPart AnalFin;
    public ModelPart PectoralFinLeft;
    public ModelPart PectoralFinRight;
    public ModelPart VentralFinLeft;
    public ModelPart VentralFinRight;
    public ModelPart Head;
    public ModelPart Tail2;
    public ModelPart TailFin;
    public ModelPart Mouth;
    public ModelPart Jaw;
    private Iterable<ModelPart> parts;

    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(this.Body);
        }

        return this.parts;
    }

    public BassModel(ModelPart root) {
        this.Body = root.getChild("Body");
        this.Tail1 = this.Body.getChild("Tail1");
        this.Tail2 = this.Tail1.getChild("Tail2");
        this.TailFin = this.Tail2.getChild("TailFin");

        this.DorsalFin = this.Body.getChild("DorsalFin");

        this.AnalFin = this.Body.getChild("AnalFin");

        this.VentralFinRight = this.Body.getChild("VentralFinRight");

        this.Head = this.Body.getChild("Head");
        this.Mouth = this.Head.getChild("Mouth");
        this.Jaw = this.Mouth.getChild("Jaw");

        this.PectoralFinRight = this.Body.getChild("PectoralFinRight");

        this.VentralFinLeft = this.Body.getChild("VentralFinLeft");

        this.PectoralFinLeft = this.Body.getChild("PectoralFinLeft");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshDefinition = new MeshDefinition();
        PartDefinition partDefinition = meshDefinition.getRoot();

        PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -3.0F, 0.0F, 3.0F, 6.0F, 10.0F), PartPose.offset(0.0F, 15.1F, -4.6F));
        PartDefinition Tail1 = Body.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(0, 17).addBox(-1.0F, -2.5F, 0.0F, 2.0F, 5.0F, 2.0F), PartPose.offset(0.0F, 0.1F, 9.8F));
        PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(0, 25).addBox(-1.0F, -1.5F, 0.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.1F, 0.0F, 0.0F)), PartPose.offset(0.0F, 0.0F, 1.8F));
        PartDefinition TailFin = Tail2.addOrReplaceChild("TailFin", CubeListBuilder.create().texOffs(42, 12).addBox(0.0F, -3.5F, 0.0F, 0.0F, 7.0F, 5.0F), PartPose.offset(0.0F, 0.0F, 2.8F));

        PartDefinition DorsalFin = Body.addOrReplaceChild("DorsalFin", CubeListBuilder.create().texOffs(42, -11).addBox(0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 11.0F), PartPose.offset(0.0F, -5.1F, 2.5F));

        PartDefinition AnalFin = Body.addOrReplaceChild("AnalFin", CubeListBuilder.create().texOffs(42, 2).addBox(0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 2.8F, 8.7F, 0.7037167490777915F, 0.0F, 0.0F));

        PartDefinition VentralFinRight = Body.addOrReplaceChild("VentralFinRight", CubeListBuilder.create().texOffs(42, 11).addBox(0.0F, 0.0F, -1.0F, 0.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 2.8F, 1.5F, 0.15707963267948966F, 0.0F, 0.27366763203903305F));

        PartDefinition Head = Body.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 32).addBox(-1.5F, -1.5F, -3.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(-0.2F, 0.2F, 0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, 0.6F, 0.3127630032889644F, 0.0F, 0.0F));
        PartDefinition Mouth = Head.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(0, 41).addBox(-1.5F, 0.0F, -4.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.3F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 1.4F, 0.0F, -0.6981317007977318F, 0.0F, 0.0F));
        PartDefinition Jaw = Mouth.addOrReplaceChild("Jaw", CubeListBuilder.create().texOffs(0, 49).addBox(0.0F, -0.5F, -3.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F, 0.1F, 0.2F)), PartPose.offsetAndRotation(-1.5F, 3.1F, -1.0F, 0.11885692106212843F, 0.0F, 0.0F));

        PartDefinition PectoralFinRight = Body.addOrReplaceChild("PectoralFinRight", CubeListBuilder.create().texOffs(42, 8).addBox(0.0F, -0.9F, 0.0F, 0.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-1.4F, 1.2F, 1.0F, 0.0F, -0.4363323129985824F, 0.0F));

        PartDefinition VentralFinLeft = Body.addOrReplaceChild("VentralFinLeft", CubeListBuilder.create().texOffs(42, 11).addBox(0.0F, 0.0F, -1.0F, 0.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 2.8F, 1.5F, 0.15707963267948966F, 0.0F, -0.27366763203903305F));

        PartDefinition PectoralFinLeft = Body.addOrReplaceChild("PectoralFinLeft", CubeListBuilder.create().texOffs(42, 8).addBox(0.0F, -0.9F, 0.0F, 0.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(1.4F, 1.2F, 1.0F, 0.0F, 0.4363323129985824F, 0.0F));

        return LayerDefinition.create(meshDefinition, 64, 64);
    }

    @Override
    public void setupAnim(BassEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }

    public void setRotateAngle(ModelPart modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
}
