package com.github.artyarticus.ecoregions.client.render.entity;

import com.github.artyarticus.ecoregions.client.model.TeguModel;
import com.github.artyarticus.ecoregions.entity.TeguEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class TeguRenderer extends ZawaMobRenderer<TeguEntity, TeguModel> {
    public TeguRenderer(EntityRendererManager manager) {
        super(manager, new TeguModel.Adult(), new TeguModel.Child(), 0.4F);
    }

    @Override
    protected void scale(TeguEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.55F : 0.7F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}
