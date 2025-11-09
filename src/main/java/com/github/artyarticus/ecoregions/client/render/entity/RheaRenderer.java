package com.github.artyarticus.ecoregions.client.render.entity;

import com.github.artyarticus.ecoregions.client.model.EcoRegionsModelLayers;
import com.github.artyarticus.ecoregions.client.model.RheaModel;
import com.github.artyarticus.ecoregions.entity.RheaEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class RheaRenderer extends ZawaMobRenderer<RheaEntity, RheaModel> {
    public RheaRenderer(EntityRendererProvider.Context context) {
        super(context, new RheaModel.Adult(context.bakeLayer(EcoRegionsModelLayers.RHEA_ADULT)), new RheaModel.Child(context.bakeLayer(EcoRegionsModelLayers.RHEA_CHILD)), 0.25F);
    }

    @Override
    protected void scale(RheaEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.8F : 1.0F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}
