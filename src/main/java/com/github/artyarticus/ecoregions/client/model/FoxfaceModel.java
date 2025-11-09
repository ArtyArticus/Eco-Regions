package com.github.artyarticus.ecoregions.client.model;

import com.github.artyarticus.ecoregions.entity.FoxfaceEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import org.zawamod.zawa.client.model.ZawaBaseAmbientModel;

public class FoxfaceModel extends ZawaBaseAmbientModel<FoxfaceEntity> {
    public ModelPart Body;
    public ModelPart Head;
    public ModelPart Tail;
    public ModelPart PectoralFinLeft;
    public ModelPart PectoralFinRight;
    public ModelPart UnderFinLeft;
    public ModelPart UnderFinRight;
    public ModelPart BackFin1;
    public ModelPart BackFin2;
    public ModelPart Mouth;
    public ModelPart TailFinTop;
    public ModelPart TailFinBottom;

    private Iterable<ModelPart> parts;

    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(this.Body);
        }

        return this.parts;
    }

    public FoxfaceModel(ModelPart root) {
        this.Body = root.getChild("Body");
        this.Head = this.Body.getChild("Head");
        this.Mouth = this.Head.getChild("Mouth");
        this.PectoralFinLeft = this.Body.getChild("PectoralFinLeft");
        this.BackFin2 = this.Body.getChild("BackFin2");
        this.Tail = this.Body.getChild("Tail");
        this.TailFinTop = this.Tail.getChild("TailFinTop");
        this.TailFinBottom = this.Tail.getChild("TailFinBottom");
        this.UnderFinRight = this.Body.getChild("UnderFinRight");
        this.PectoralFinRight = this.Body.getChild("PectoralFinRight");
        this.BackFin1 = this.Body.getChild("BackFin1");
        this.UnderFinLeft = this.Body.getChild("UnderFinLeft");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshDefinition = new MeshDefinition();
        PartDefinition partDefinition = meshDefinition.getRoot();

        PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -2.0F, -2.0F, 2.0F, 4.0F, 6.0F), PartPose.offset(0.0F, 17.9F, 0.0F));
        PartDefinition Head = Body.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(16, 3).addBox(-1.0F, -1.5F, -2.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(-0.1F, -0.6F, -0.1F)), PartPose.offsetAndRotation(0.0F, -0.7F, -2.0F, 0.7819074915776542F, 0.0F, 0.0F));
        PartDefinition Mouth = Head.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(11, 0).addBox(-0.5F, 0.2F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F, -0.3F, 0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -0.7F, -0.6646214111173737F, 0.0F, 0.0F));
        PartDefinition PectoralFinLeft = Body.addOrReplaceChild("PectoralFinLeft", CubeListBuilder.create().texOffs(5, 7).addBox(0.5F, -1.0F, -0.5F, 0.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.5F, 0.6F, -0.6F, 0.3909537457888271F, 0.5475098009980072F, 0.0F));
        PartDefinition BackFin2 = Body.addOrReplaceChild("BackFin2", CubeListBuilder.create().texOffs(9, 9).addBox(0.0F, -0.3F, -0.7F, 0.0F, 3.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 2.4F, -0.1563815016444822F, 0.0F, 0.0F));
        PartDefinition Tail = Body.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 2.0F), PartPose.offset(0.0F, 0.0F, 4.0F));
        PartDefinition TailFinTop = Tail.addOrReplaceChild("TailFinTop", CubeListBuilder.create().texOffs(13, 8).addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -0.1F, 1.4F, 0.4300491170387584F, 0.0F, 0.0F));
        PartDefinition TailFinBottom = Tail.addOrReplaceChild("TailFinBottom", CubeListBuilder.create().texOffs(18, 8).addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 1.4F, -0.5864306020384839F, 0.0F, 0.0F));
        PartDefinition UnderFinRight = Body.addOrReplaceChild("UnderFinRight", CubeListBuilder.create().texOffs(23, 8).mirror(true).addBox(0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-0.9F, 2.0F, -2.0F, 0.5084143964585622F, 0.0F, 0.3909537457888271F));
        PartDefinition PectoralFinRight = Body.addOrReplaceChild("PectoralFinRight", CubeListBuilder.create().texOffs(5, 7).mirror(true).addBox(-0.5F, -1.0F, -0.5F, 0.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(-0.5F, 0.6F, -0.6F, 0.3909537457888271F, -0.5475098009980072F, 0.0F));
        PartDefinition BackFin1 = Body.addOrReplaceChild("BackFin1", CubeListBuilder.create().texOffs(0, 9).addBox(0.0F, -0.3F, -0.7F, 0.0F, 3.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -2.0F, 2.1F, 0.1563815016444822F, 0.0F, 0.0F));
        PartDefinition UnderFinLeft = Body.addOrReplaceChild("UnderFinLeft", CubeListBuilder.create().texOffs(23, 8).addBox(0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.9F, 2.0F, -2.0F, 0.5084143964585622F, 0.0F, -0.3909537457888271F));

        return LayerDefinition.create(meshDefinition, 32, 16);
    }

    @Override
    public void setupAnim(FoxfaceEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }

    public void setRotateAngle(ModelPart modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
}
