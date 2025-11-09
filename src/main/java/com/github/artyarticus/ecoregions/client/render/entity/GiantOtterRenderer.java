package com.github.artyarticus.ecoregions.client.render.entity;

import com.github.artyarticus.ecoregions.client.model.EcoRegionsModelLayers;
import com.github.artyarticus.ecoregions.client.model.GiantOtterModel;
import com.github.artyarticus.ecoregions.entity.GiantOtterEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class GiantOtterRenderer extends ZawaMobRenderer<GiantOtterEntity, GiantOtterModel> {
    public GiantOtterRenderer(EntityRendererProvider.Context context) {
        super(context, new GiantOtterModel.Adult(context.bakeLayer(EcoRegionsModelLayers.GIANT_OTTER_ADULT)), new GiantOtterModel.Child(context.bakeLayer(EcoRegionsModelLayers.GIANT_OTTER_CHILD)), 0.4F);
    }

    @Override
    protected void scale(GiantOtterEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.9F : 0.85F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}
