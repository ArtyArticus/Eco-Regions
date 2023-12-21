package com.github.artyarticus.ecoregions.client.render.entity;

import com.github.artyarticus.ecoregions.EcoRegions;
import com.github.artyarticus.ecoregions.client.model.SpectacledBearModel;
import com.github.artyarticus.ecoregions.entity.SpectacledBearEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class SpectacledBearRenderer extends ZawaMobRenderer<SpectacledBearEntity, SpectacledBearModel> {
    public SpectacledBearRenderer(EntityRendererManager manager) {
        super(manager, new SpectacledBearModel.Adult(), new SpectacledBearModel.Child(), 0.35F);

    }

    @Override
    protected void scale(SpectacledBearEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.9F : 1.1F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    protected boolean hasBabyVariants(SpectacledBearEntity entity) {
        return false;
    }
}