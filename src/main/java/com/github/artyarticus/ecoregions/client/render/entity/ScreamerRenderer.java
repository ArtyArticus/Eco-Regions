package com.github.artyarticus.ecoregions.client.render.entity;

import com.github.artyarticus.ecoregions.client.model.EcoRegionsModelLayers;
import com.github.artyarticus.ecoregions.client.model.ScreamerModel;
import com.github.artyarticus.ecoregions.entity.ScreamerEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class ScreamerRenderer extends ZawaMobRenderer<ScreamerEntity, ScreamerModel> {
    public ScreamerRenderer(EntityRendererProvider.Context context) {
        super(context, new ScreamerModel.Adult(context.bakeLayer(EcoRegionsModelLayers.SCREAMER_ADULT)), new ScreamerModel.Child(context.bakeLayer(EcoRegionsModelLayers.SCREAMER_CHILD)), 0.2F);
    }

    @Override
    protected void scale(ScreamerEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.65F : 0.8F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
    @Override
    protected boolean hasBabyVariants(ScreamerEntity entity) {
        return false;
    }
}
