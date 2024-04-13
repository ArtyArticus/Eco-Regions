package com.github.artyarticus.ecoregions.client.render.entity;

import com.github.artyarticus.ecoregions.client.model.RedRiverHogModel;
import com.github.artyarticus.ecoregions.entity.RedRiverHogEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class RedRiverHogRenderer extends ZawaMobRenderer<RedRiverHogEntity, RedRiverHogModel> {
    public RedRiverHogRenderer(EntityRendererManager manager) {
        super(manager, new RedRiverHogModel.Adult(), new RedRiverHogModel.Child(), 0.65F);
    }

    @Override
    protected void scale(RedRiverHogEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.8F : 1.0F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}
