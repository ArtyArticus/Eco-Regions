package com.github.artyarticus.ecoregions.client.render.entity;

import com.github.artyarticus.ecoregions.client.model.EcoRegionsModelLayers;
import com.github.artyarticus.ecoregions.client.model.PorcupineModel;
import com.github.artyarticus.ecoregions.entity.PorcupineEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class PorcupineRenderer extends ZawaMobRenderer<PorcupineEntity, PorcupineModel> {
    public PorcupineRenderer(EntityRendererProvider.Context context) {
        super(context, new PorcupineModel.Adult(context.bakeLayer(EcoRegionsModelLayers.PORCUPINE_ADULT)), new PorcupineModel.Child(context.bakeLayer(EcoRegionsModelLayers.PORCUPINE_CHILD)), 0.55F);
    }

    @Override
    protected void scale(PorcupineEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.75F : 0.85F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}
