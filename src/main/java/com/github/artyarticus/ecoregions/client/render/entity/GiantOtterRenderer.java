package com.github.artyarticus.ecoregions.client.render.entity;

import com.github.artyarticus.ecoregions.client.model.GiantOtterModel;
import com.github.artyarticus.ecoregions.entity.GiantOtterEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class GiantOtterRenderer extends ZawaMobRenderer<GiantOtterEntity, GiantOtterModel> {
    public GiantOtterRenderer(EntityRendererManager manager) {
        super(manager, new GiantOtterModel.Adult(), new GiantOtterModel.Child(), 0.4F);
    }

    @Override
    protected void scale(GiantOtterEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.9F : 0.85F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}
