package com.github.artyarticus.ecoregions.client.render.entity;

import com.github.artyarticus.ecoregions.client.model.EcoRegionsModelLayers;
import com.github.artyarticus.ecoregions.client.model.MarmosetModel;
import com.github.artyarticus.ecoregions.entity.MarmosetEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class MarmosetRenderer extends ZawaMobRenderer<MarmosetEntity, MarmosetModel> {
    public MarmosetRenderer(EntityRendererProvider.Context context) {
        super(context, new MarmosetModel.Adult(context.bakeLayer(EcoRegionsModelLayers.MARMOSET_ADULT)), new MarmosetModel.Child(context.bakeLayer(EcoRegionsModelLayers.MARMOSET_CHILD)), 0.4F);
    }

    @Override
    protected void scale(MarmosetEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.2F : 0.45F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}

