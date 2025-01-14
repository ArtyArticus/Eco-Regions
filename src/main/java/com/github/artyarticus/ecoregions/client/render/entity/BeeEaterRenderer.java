package com.github.artyarticus.ecoregions.client.render.entity;

import com.github.artyarticus.ecoregions.client.model.BeeEaterModel;
import com.github.artyarticus.ecoregions.entity.BeeEaterEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class BeeEaterRenderer extends ZawaMobRenderer<BeeEaterEntity, BeeEaterModel> {
    public BeeEaterRenderer(EntityRendererManager manager) {
        super(manager, new BeeEaterModel.Adult(), new BeeEaterModel.Flying(), new BeeEaterModel.Child(), 0.15F);
    }

    @Override
    protected void scale(BeeEaterEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.4F : 0.75F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    protected boolean hasBabyVariants(BeeEaterEntity entity) {
        return false;
    }
}
