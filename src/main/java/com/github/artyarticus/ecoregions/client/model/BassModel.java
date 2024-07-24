package com.github.artyarticus.ecoregions.client.model;

import com.github.artyarticus.ecoregions.entity.BassEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.renderer.entity.model.SegmentedModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class BassModel extends SegmentedModel<BassEntity> {
    public ModelRenderer Body;
    public ModelRenderer Tail1;
    public ModelRenderer DorsalFin;
    public ModelRenderer AnalFin;
    public ModelRenderer PectoralFinLeft;
    public ModelRenderer PectoralFinRight;
    public ModelRenderer VentralFinLeft;
    public ModelRenderer VentralFinRight;
    public ModelRenderer Head;
    public ModelRenderer Tail2;
    public ModelRenderer TailFin;
    public ModelRenderer Mouth;
    public ModelRenderer Jaw;
    private Iterable<ModelRenderer> parts;

    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(this.Body);
        }

        return this.parts;
    }

    public BassModel() {
        this.texWidth = 64;
        this.texHeight = 64;
        this.Tail1 = new ModelRenderer(this, 0, 17);
        this.Tail1.setPos(0.0F, 0.1F, 9.8F);
        this.Tail1.addBox(-1.0F, -2.5F, 0.0F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.DorsalFin = new ModelRenderer(this, 42, -11);
        this.DorsalFin.setPos(0.0F, -5.1F, 2.5F);
        this.DorsalFin.addBox(0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 11.0F, 0.0F, 0.0F, 0.0F);
        this.AnalFin = new ModelRenderer(this, 42, 2);
        this.AnalFin.setPos(0.0F, 2.8F, 8.7F);
        this.AnalFin.addBox(0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(AnalFin, 0.7037167490777915F, 0.0F, 0.0F);
        this.VentralFinRight = new ModelRenderer(this, 42, 11);
        this.VentralFinRight.setPos(0.0F, 2.8F, 1.5F);
        this.VentralFinRight.addBox(0.0F, 0.0F, -1.0F, 0.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(VentralFinRight, 0.15707963267948966F, 0.0F, 0.27366763203903305F);
        this.Jaw = new ModelRenderer(this, 0, 49);
        this.Jaw.setPos(-1.5F, 3.1F, -1.0F);
        this.Jaw.addBox(0.0F, -0.5F, -3.0F, 3.0F, 1.0F, 3.0F, -0.1F, 0.1F, 0.2F);
        this.setRotateAngle(Jaw, 0.11885692106212843F, 0.0F, 0.0F);
        this.Head = new ModelRenderer(this, 0, 32);
        this.Head.setPos(0.0F, -1.1F, 0.6F);
        this.Head.addBox(-1.5F, -1.5F, -3.0F, 3.0F, 5.0F, 3.0F, -0.2F, 0.2F, 0.0F);
        this.setRotateAngle(Head, 0.3127630032889644F, 0.0F, 0.0F);
        this.PectoralFinRight = new ModelRenderer(this, 42, 8);
        this.PectoralFinRight.setPos(-1.4F, 1.2F, 1.0F);
        this.PectoralFinRight.addBox(0.0F, -0.9F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(PectoralFinRight, 0.0F, -0.4363323129985824F, 0.0F);
        this.Tail2 = new ModelRenderer(this, 0, 25);
        this.Tail2.setPos(0.0F, 0.0F, 1.8F);
        this.Tail2.addBox(-1.0F, -1.5F, 0.0F, 2.0F, 3.0F, 3.0F, -0.1F, 0.0F, 0.0F);
        this.VentralFinLeft = new ModelRenderer(this, 42, 11);
        this.VentralFinLeft.setPos(0.0F, 2.8F, 1.5F);
        this.VentralFinLeft.addBox(0.0F, 0.0F, -1.0F, 0.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(VentralFinLeft, 0.15707963267948966F, 0.0F, -0.27366763203903305F);
        this.Body = new ModelRenderer(this, 0, 0);
        this.Body.setPos(0.0F, 15.1F, -4.6F);
        this.Body.addBox(-1.5F, -3.0F, 0.0F, 3.0F, 6.0F, 10.0F, 0.0F, 0.0F, 0.0F);
        this.Mouth = new ModelRenderer(this, 0, 41);
        this.Mouth.setPos(0.0F, 1.4F, 0.0F);
        this.Mouth.addBox(-1.5F, 0.0F, -4.0F, 3.0F, 3.0F, 3.0F, -0.3F, 0.0F, 0.0F);
        this.setRotateAngle(Mouth, -0.6981317007977318F, 0.0F, 0.0F);
        this.TailFin = new ModelRenderer(this, 42, 12);
        this.TailFin.setPos(0.0F, 0.0F, 2.8F);
        this.TailFin.addBox(0.0F, -3.5F, 0.0F, 0.0F, 7.0F, 5.0F, 0.0F, 0.0F, 0.0F);
        this.PectoralFinLeft = new ModelRenderer(this, 42, 8);
        this.PectoralFinLeft.setPos(1.4F, 1.2F, 1.0F);
        this.PectoralFinLeft.addBox(0.0F, -0.9F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(PectoralFinLeft, 0.0F, 0.4363323129985824F, 0.0F);
        this.Body.addChild(this.Tail1);
        this.Body.addChild(this.DorsalFin);
        this.Body.addChild(this.AnalFin);
        this.Body.addChild(this.VentralFinRight);
        this.Mouth.addChild(this.Jaw);
        this.Body.addChild(this.Head);
        this.Body.addChild(this.PectoralFinRight);
        this.Tail1.addChild(this.Tail2);
        this.Body.addChild(this.VentralFinLeft);
        this.Head.addChild(this.Mouth);
        this.Tail2.addChild(this.TailFin);
        this.Body.addChild(this.PectoralFinLeft);
    }

    @Override
    public void setupAnim(BassEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
}
