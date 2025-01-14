package com.github.artyarticus.ecoregions.client.model;

import com.github.artyarticus.ecoregions.entity.FoxfaceEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.renderer.entity.model.SegmentedModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class FoxfaceModel extends SegmentedModel<FoxfaceEntity> {
    public ModelRenderer Body;
    public ModelRenderer Head;
    public ModelRenderer Tail;
    public ModelRenderer PectoralFinLeft;
    public ModelRenderer PectoralFinRight;
    public ModelRenderer UnderFinLeft;
    public ModelRenderer UnderFinRight;
    public ModelRenderer BackFin1;
    public ModelRenderer BackFin2;
    public ModelRenderer Mouth;
    public ModelRenderer TailFinTop;
    public ModelRenderer TailFinBottom;

    private Iterable<ModelRenderer> parts;

    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(this.Body);
        }

        return this.parts;
    }

    public FoxfaceModel() {
        this.texWidth = 32;
        this.texHeight = 16;
        this.Head = new ModelRenderer(this, 16, 3);
        this.Head.setPos(0.0F, -0.7F, -2.0F);
        this.Head.addBox(-1.0F, -1.5F, -2.0F, 2.0F, 4.0F, 3.0F, -0.1F, -0.6F, -0.1F);
        this.setRotateAngle(Head, 0.7819074915776542F, 0.0F, 0.0F);
        this.PectoralFinLeft = new ModelRenderer(this, 5, 7);
        this.PectoralFinLeft.setPos(0.5F, 0.6F, -0.6F);
        this.PectoralFinLeft.addBox(0.5F, -1.0F, -0.5F, 0.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(PectoralFinLeft, 0.3909537457888271F, 0.5475098009980072F, 0.0F);
        this.TailFinTop = new ModelRenderer(this, 13, 8);
        this.TailFinTop.setPos(0.0F, -0.1F, 1.4F);
        this.TailFinTop.addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(TailFinTop, 0.4300491170387584F, 0.0F, 0.0F);
        this.Mouth = new ModelRenderer(this, 11, 0);
        this.Mouth.setPos(0.0F, -0.5F, -0.7F);
        this.Mouth.addBox(-0.5F, 0.2F, -3.0F, 1.0F, 2.0F, 3.0F, 0.0F, -0.3F, 0.0F);
        this.setRotateAngle(Mouth, -0.6646214111173737F, 0.0F, 0.0F);
        this.BackFin2 = new ModelRenderer(this, 9, 9);
        this.BackFin2.setPos(0.0F, 0.0F, 2.4F);
        this.BackFin2.addBox(0.0F, -0.3F, -0.7F, 0.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(BackFin2, -0.1563815016444822F, 0.0F, 0.0F);
        this.Tail = new ModelRenderer(this, 0, 0);
        this.Tail.setPos(0.0F, 0.0F, 4.0F);
        this.Tail.addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.UnderFinRight = new ModelRenderer(this, 23, 8);
        this.UnderFinRight.mirror = true;
        this.UnderFinRight.setPos(-0.9F, 2.0F, -2.0F);
        this.UnderFinRight.addBox(0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(UnderFinRight, 0.5084143964585622F, 0.0F, 0.3909537457888271F);
        this.PectoralFinRight = new ModelRenderer(this, 5, 7);
        this.PectoralFinRight.mirror = true;
        this.PectoralFinRight.setPos(-0.5F, 0.6F, -0.6F);
        this.PectoralFinRight.addBox(-0.5F, -1.0F, -0.5F, 0.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(PectoralFinRight, 0.3909537457888271F, -0.5475098009980072F, 0.0F);
        this.BackFin1 = new ModelRenderer(this, 0, 9);
        this.BackFin1.setPos(0.0F, -2.0F, 2.1F);
        this.BackFin1.addBox(0.0F, -0.3F, -0.7F, 0.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(BackFin1, 0.1563815016444822F, 0.0F, 0.0F);
        this.TailFinBottom = new ModelRenderer(this, 18, 8);
        this.TailFinBottom.setPos(0.0F, 0.0F, 1.4F);
        this.TailFinBottom.addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(TailFinBottom, -0.5864306020384839F, 0.0F, 0.0F);
        this.Body = new ModelRenderer(this, 0, 0);
        this.Body.setPos(0.0F, 17.9F, 0.0F);
        this.Body.addBox(-1.0F, -2.0F, -2.0F, 2.0F, 4.0F, 6.0F, 0.0F, 0.0F, 0.0F);
        this.UnderFinLeft = new ModelRenderer(this, 23, 8);
        this.UnderFinLeft.setPos(0.9F, 2.0F, -2.0F);
        this.UnderFinLeft.addBox(0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(UnderFinLeft, 0.5084143964585622F, 0.0F, -0.3909537457888271F);
        this.Body.addChild(this.Head);
        this.Body.addChild(this.PectoralFinLeft);
        this.Tail.addChild(this.TailFinTop);
        this.Head.addChild(this.Mouth);
        this.Body.addChild(this.BackFin2);
        this.Body.addChild(this.Tail);
        this.Body.addChild(this.UnderFinRight);
        this.Body.addChild(this.PectoralFinRight);
        this.Body.addChild(this.BackFin1);
        this.Tail.addChild(this.TailFinBottom);
        this.Body.addChild(this.UnderFinLeft);
    }

    @Override
    public void setupAnim(FoxfaceEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
}
