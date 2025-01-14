package com.github.artyarticus.ecoregions.client.render.entity;

import com.github.artyarticus.ecoregions.client.model.GazelleModel;
import com.github.artyarticus.ecoregions.entity.GazelleEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class GazelleRenderer extends ZawaMobRenderer<GazelleEntity, GazelleModel> {
    public GazelleRenderer(EntityRendererManager manager) {
        super(manager, new GazelleModel.Adult(), new GazelleModel.Child(), 0.45F);
    }

    @Override
    protected void scale(GazelleEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.8F : 0.85F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}
