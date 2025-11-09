package com.github.artyarticus.ecoregions.client.render.entity;

import com.github.artyarticus.ecoregions.client.model.EcoRegionsModelLayers;
import com.github.artyarticus.ecoregions.client.model.GazelleModel;
import com.github.artyarticus.ecoregions.entity.GazelleEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class GazelleRenderer extends ZawaMobRenderer<GazelleEntity, GazelleModel> {
    public GazelleRenderer(EntityRendererProvider.Context context) {
        super(context, new GazelleModel.Adult(context.bakeLayer(EcoRegionsModelLayers.GAZELLE_ADULT)), new GazelleModel.Child(context.bakeLayer(EcoRegionsModelLayers.GAZELLE_CHILD)), 0.45F);
    }

    @Override
    protected void scale(GazelleEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.8F : 0.85F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}
