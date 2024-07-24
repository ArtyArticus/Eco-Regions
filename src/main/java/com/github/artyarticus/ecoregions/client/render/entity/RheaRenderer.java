package com.github.artyarticus.ecoregions.client.render.entity;

import com.github.artyarticus.ecoregions.client.model.RheaModel;
import com.github.artyarticus.ecoregions.entity.RheaEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class RheaRenderer extends ZawaMobRenderer<RheaEntity, RheaModel> {
    public RheaRenderer(EntityRendererManager manager) {
        super(manager, new RheaModel.Adult(), new RheaModel.Child(), 0.25F);
    }

    @Override
    protected void scale(RheaEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.8F : 1.0F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}
