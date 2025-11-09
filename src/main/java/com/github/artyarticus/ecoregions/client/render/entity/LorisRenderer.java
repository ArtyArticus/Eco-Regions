package com.github.artyarticus.ecoregions.client.render.entity;

import com.github.artyarticus.ecoregions.client.model.EcoRegionsModelLayers;
import com.github.artyarticus.ecoregions.client.model.LorisModel;
import com.github.artyarticus.ecoregions.entity.LorisEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class LorisRenderer extends ZawaMobRenderer<LorisEntity, LorisModel> {
    public LorisRenderer(EntityRendererProvider.Context context) {
        super(context, new LorisModel.Adult(context.bakeLayer(EcoRegionsModelLayers.LORIS_ADULT)), new LorisModel.Child(context.bakeLayer(EcoRegionsModelLayers.LORIS_CHILD)), 0.35F);
    }

    @Override
    protected void scale(LorisEntity entity, PoseStack matrixStack, float partialTickTime) {
        if (entity.isBaby()) matrixStack.scale(0.65F, 0.65F, 0.65F);
        else {
            int variant = entity.getVariant();
            if (variant == 0) matrixStack.scale(0.7F, 0.7F, 0.7F);
            if (variant == 1) matrixStack.scale(0.65F, 0.65F, 0.65F);
        }
        super.scale(entity, matrixStack, partialTickTime);
    }
}
