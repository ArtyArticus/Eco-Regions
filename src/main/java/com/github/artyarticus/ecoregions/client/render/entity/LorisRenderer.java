package com.github.artyarticus.ecoregions.client.render.entity;

import com.github.artyarticus.ecoregions.client.model.LorisModel;
import com.github.artyarticus.ecoregions.entity.LorisEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class LorisRenderer extends ZawaMobRenderer<LorisEntity, LorisModel> {
    public LorisRenderer(EntityRendererManager manager) {
        super(manager, new LorisModel.Adult(), new LorisModel.Child(), 0.35F);
    }

    @Override
    protected void scale(LorisEntity entity, MatrixStack matrixStack, float partialTickTime) {
        if (entity.isBaby()) matrixStack.scale(0.65F, 0.65F, 0.65F);
        else {
            int variant = entity.getVariant();
            if (variant == 0) matrixStack.scale(0.7F, 0.7F, 0.7F);
            if (variant == 1) matrixStack.scale(0.65F, 0.65F, 0.65F);
        }
        super.scale(entity, matrixStack, partialTickTime);
    }
}
