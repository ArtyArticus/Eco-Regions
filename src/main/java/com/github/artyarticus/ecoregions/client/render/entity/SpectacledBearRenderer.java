package com.github.artyarticus.ecoregions.client.render.entity;

import com.github.artyarticus.ecoregions.client.model.EcoRegionsModelLayers;
import com.github.artyarticus.ecoregions.client.model.SpectacledBearModel;
import com.github.artyarticus.ecoregions.entity.SpectacledBearEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class SpectacledBearRenderer extends ZawaMobRenderer<SpectacledBearEntity, SpectacledBearModel> {
    public SpectacledBearRenderer(EntityRendererProvider.Context context) {
        super(context, new SpectacledBearModel.Adult(context.bakeLayer(EcoRegionsModelLayers.SPECTACLED_BEAR_ADULT)), new SpectacledBearModel.Child(context.bakeLayer(EcoRegionsModelLayers.SPECTACLED_BEAR_CHILD)), 0.65F);
    }

    @Override
    protected void scale(SpectacledBearEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.8F : 1.0F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    protected boolean hasBabyVariants(SpectacledBearEntity entity) {
        return false;
    }
}

