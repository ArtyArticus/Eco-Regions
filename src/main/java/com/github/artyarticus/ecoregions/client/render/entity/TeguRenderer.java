package com.github.artyarticus.ecoregions.client.render.entity;

import com.github.artyarticus.ecoregions.client.model.EcoRegionsModelLayers;
import com.github.artyarticus.ecoregions.client.model.TeguModel;
import com.github.artyarticus.ecoregions.entity.TeguEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class TeguRenderer extends ZawaMobRenderer<TeguEntity, TeguModel> {
    public TeguRenderer(EntityRendererProvider.Context context) {
        super(context, new TeguModel.Adult(context.bakeLayer(EcoRegionsModelLayers.TEGU_ADULT)), new TeguModel.Child(context.bakeLayer(EcoRegionsModelLayers.TEGU_CHILD)), 0.4F);
    }

    @Override
    protected void scale(TeguEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.55F : 0.7F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}
