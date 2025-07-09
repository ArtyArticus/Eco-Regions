package com.github.artyarticus.ecoregions.client.render.entity;

import com.github.artyarticus.ecoregions.client.model.BushDogModel;
import com.github.artyarticus.ecoregions.entity.BushDogEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class BushDogRenderer extends ZawaMobRenderer<BushDogEntity, BushDogModel> {
    public BushDogRenderer(EntityRendererManager manager) {
        super(manager, new BushDogModel.Adult(), new BushDogModel.Child(), 0.4F);
    }

    @Override
    protected void scale(BushDogEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.95F : 0.9F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}
