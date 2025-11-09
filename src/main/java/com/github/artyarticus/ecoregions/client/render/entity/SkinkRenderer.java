package com.github.artyarticus.ecoregions.client.render.entity;

import com.github.artyarticus.ecoregions.client.model.EcoRegionsModelLayers;
import com.github.artyarticus.ecoregions.client.model.SkinkModel;
import com.github.artyarticus.ecoregions.entity.SkinkEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class SkinkRenderer extends ZawaMobRenderer<SkinkEntity, SkinkModel> {
    public SkinkRenderer(EntityRendererProvider.Context context) {
        super(context, new SkinkModel.Adult(context.bakeLayer(EcoRegionsModelLayers.SKINK_ADULT)), new SkinkModel.Child(context.bakeLayer(EcoRegionsModelLayers.SKINK_CHILD)), 0.3F);
    }

    @Override
    protected void scale(SkinkEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.5F : 0.55F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}