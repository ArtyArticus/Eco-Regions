package com.github.artyarticus.ecoregions.client.render.entity;

import com.github.artyarticus.ecoregions.client.model.EcoRegionsModelLayers;
import com.github.artyarticus.ecoregions.client.model.AsianWaterMonitorModel;
import com.github.artyarticus.ecoregions.entity.AsianWaterMonitorEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class AsianWaterMonitorRenderer extends ZawaMobRenderer<AsianWaterMonitorEntity, AsianWaterMonitorModel> {
    public AsianWaterMonitorRenderer(EntityRendererProvider.Context context) {
        super(context, new AsianWaterMonitorModel.Adult(context.bakeLayer(EcoRegionsModelLayers.ASIAN_WATER_MONITOR_ADULT)), new AsianWaterMonitorModel.Child(context.bakeLayer(EcoRegionsModelLayers.ASIAN_WATER_MONITOR_CHILD)), 0.4F);
    }

    @Override
    protected void scale(AsianWaterMonitorEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.5F : 0.8F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}

