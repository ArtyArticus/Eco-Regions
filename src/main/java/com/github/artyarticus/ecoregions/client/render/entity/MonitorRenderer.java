package com.github.artyarticus.ecoregions.client.render.entity;

import com.github.artyarticus.ecoregions.client.model.MonitorModel;
import com.github.artyarticus.ecoregions.entity.MonitorEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class MonitorRenderer extends ZawaMobRenderer<MonitorEntity, MonitorModel> {
    public MonitorRenderer(EntityRendererManager manager) {
        super(manager, new MonitorModel.Adult(), new MonitorModel.Child(), 0.65F);
    }

    @Override
    protected void scale(MonitorEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.5F : 0.8F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}

