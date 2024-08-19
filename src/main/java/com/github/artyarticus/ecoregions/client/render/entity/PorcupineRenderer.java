package com.github.artyarticus.ecoregions.client.render.entity;

import com.github.artyarticus.ecoregions.client.model.PorcupineModel;
import com.github.artyarticus.ecoregions.entity.PorcupineEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class PorcupineRenderer extends ZawaMobRenderer<PorcupineEntity, PorcupineModel> {
    public PorcupineRenderer(EntityRendererManager manager) {
        super(manager, new PorcupineModel.Adult(), new PorcupineModel.Child(), 0.55F);
    }

    @Override
    protected void scale(PorcupineEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.75F : 0.85F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}
