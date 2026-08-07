package com.github.artyarticus.ecoregions.client.render.entity;

import com.github.artyarticus.ecoregions.client.model.SlowLorisModel;
import com.github.artyarticus.ecoregions.entity.SlowLorisEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class SlowLorisRenderer extends ZawaMobRenderer<SlowLorisEntity, SlowLorisModel> {
    public SlowLorisRenderer(EntityRendererManager manager) {
        super(manager, new SlowLorisModel.Adult(), new SlowLorisModel.Child(), 0.2F);
    }

    @Override
    protected void scale(SlowLorisEntity entity, MatrixStack matrixStack, float partialTickTime) {
        if (entity.isBaby()) matrixStack.scale(0.65F, 0.65F, 0.65F);
        else {
            int variant = entity.getVariant();
            if (variant == 0) matrixStack.scale(0.7F, 0.7F, 0.7F);
            if (variant == 1) matrixStack.scale(0.65F, 0.65F, 0.65F);
        }
        super.scale(entity, matrixStack, partialTickTime);
    }
}
