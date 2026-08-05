package com.github.artyarticus.ecoregions.client.render.entity;

import com.github.artyarticus.ecoregions.client.model.AsianWaterMonitorModel;
import com.github.artyarticus.ecoregions.entity.AsianWaterMonitorEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class AsianWaterMonitorRenderer extends ZawaMobRenderer<AsianWaterMonitorEntity, AsianWaterMonitorModel> {
    public AsianWaterMonitorRenderer(EntityRendererManager manager) {
        super(manager, new AsianWaterMonitorModel.Adult(), new AsianWaterMonitorModel.Child(), 0.4F);
    }

    @Override
    protected void scale(AsianWaterMonitorEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.4F : 0.65F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}

