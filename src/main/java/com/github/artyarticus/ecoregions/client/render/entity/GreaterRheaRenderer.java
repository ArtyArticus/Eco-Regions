package com.github.artyarticus.ecoregions.client.render.entity;

import com.github.artyarticus.ecoregions.client.model.GreaterRheaModel;
import com.github.artyarticus.ecoregions.entity.GreaterRheaEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class GreaterRheaRenderer extends ZawaMobRenderer<GreaterRheaEntity, GreaterRheaModel> {
    public GreaterRheaRenderer(EntityRendererManager manager) {
        super(manager, new GreaterRheaModel.Adult(), new GreaterRheaModel.Child(), 0.25F);
    }

    @Override
    protected void scale(GreaterRheaEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.8F : 1.0F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}
