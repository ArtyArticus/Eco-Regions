package com.github.artyarticus.ecoregions.client.render.entity;

import com.github.artyarticus.ecoregions.client.model.EcoRegionsModelLayers;
import com.github.artyarticus.ecoregions.client.model.MonitorModel;
import com.github.artyarticus.ecoregions.entity.MonitorEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class MonitorRenderer extends ZawaMobRenderer<MonitorEntity, MonitorModel> {
    public MonitorRenderer(EntityRendererProvider.Context context) {
        super(context, new MonitorModel.Adult(context.bakeLayer(EcoRegionsModelLayers.MONITOR_ADULT)), new MonitorModel.Child(context.bakeLayer(EcoRegionsModelLayers.MONITOR_CHILD)), 0.4F);
    }

    @Override
    protected void scale(MonitorEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.4F : 0.65F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}

