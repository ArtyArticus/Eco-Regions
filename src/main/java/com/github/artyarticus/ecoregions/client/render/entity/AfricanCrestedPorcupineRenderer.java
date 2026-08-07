package com.github.artyarticus.ecoregions.client.render.entity;

import com.github.artyarticus.ecoregions.client.model.AfricanCrestedPorcupineModel;
import com.github.artyarticus.ecoregions.entity.AfricanCrestedPorcupineEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class AfricanCrestedPorcupineRenderer extends ZawaMobRenderer<AfricanCrestedPorcupineEntity, AfricanCrestedPorcupineModel> {
    public AfricanCrestedPorcupineRenderer(EntityRendererManager manager) {
        super(manager, new AfricanCrestedPorcupineModel.Adult(), new AfricanCrestedPorcupineModel.Child(), 0.5F);
    }

    @Override
    protected void scale(AfricanCrestedPorcupineEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.75F : 0.85F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}
