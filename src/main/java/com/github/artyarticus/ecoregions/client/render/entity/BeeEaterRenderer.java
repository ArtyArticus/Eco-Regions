package com.github.artyarticus.ecoregions.client.render.entity;

import com.github.artyarticus.ecoregions.client.model.BeeEaterModel;
import com.github.artyarticus.ecoregions.client.model.EcoRegionsModelLayers;
import com.github.artyarticus.ecoregions.entity.BeeEaterEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class BeeEaterRenderer extends ZawaMobRenderer<BeeEaterEntity, BeeEaterModel> {
    public BeeEaterRenderer(EntityRendererProvider.Context context) {
        super(context, new BeeEaterModel.Adult(context.bakeLayer(EcoRegionsModelLayers.BEE_EATER_ADULT)), new BeeEaterModel.Flying(context.bakeLayer(EcoRegionsModelLayers.BEE_EATER_FLYING)), new BeeEaterModel.Child(context.bakeLayer(EcoRegionsModelLayers.BEE_EATER_CHILD)), 0.15F);
    }

    @Override
    protected void scale(BeeEaterEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.5F : 0.75F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    protected boolean hasBabyVariants(BeeEaterEntity entity) {
        return false;
    }
}
