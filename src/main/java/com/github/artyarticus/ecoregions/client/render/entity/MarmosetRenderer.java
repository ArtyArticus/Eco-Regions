package com.github.artyarticus.ecoregions.client.render.entity;

import com.github.artyarticus.ecoregions.client.model.MarmosetModel;
import com.github.artyarticus.ecoregions.entity.MarmosetEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class MarmosetRenderer extends ZawaMobRenderer<MarmosetEntity, MarmosetModel> {
    public MarmosetRenderer(EntityRendererManager manager) {
        super(manager, new MarmosetModel.Adult(), new MarmosetModel.Child(), 0.4F);
    }

    @Override
    protected void scale(MarmosetEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.4F : 0.65F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}

