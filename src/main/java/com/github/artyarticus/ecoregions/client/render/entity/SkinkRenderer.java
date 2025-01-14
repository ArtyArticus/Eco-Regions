package com.github.artyarticus.ecoregions.client.render.entity;

import com.github.artyarticus.ecoregions.client.model.SkinkModel;
import com.github.artyarticus.ecoregions.entity.SkinkEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class SkinkRenderer extends ZawaMobRenderer<SkinkEntity, SkinkModel> {
    public SkinkRenderer(EntityRendererManager manager) {
        super(manager, new SkinkModel.Adult(), new SkinkModel.Child(), 0.3F);
    }

    @Override
    protected void scale(SkinkEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.5F : 0.55F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}