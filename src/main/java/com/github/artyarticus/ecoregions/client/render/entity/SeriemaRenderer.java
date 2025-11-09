package com.github.artyarticus.ecoregions.client.render.entity;

import com.github.artyarticus.ecoregions.client.model.EcoRegionsModelLayers;
import com.github.artyarticus.ecoregions.client.model.SeriemaModel;
import com.github.artyarticus.ecoregions.entity.SeriemaEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class SeriemaRenderer extends ZawaMobRenderer<SeriemaEntity, SeriemaModel> {
    public SeriemaRenderer(EntityRendererProvider.Context context) {
        super(context, new SeriemaModel.Adult(context.bakeLayer(EcoRegionsModelLayers.SERIEMA_ADULT)), new SeriemaModel.Child(context.bakeLayer(EcoRegionsModelLayers.SERIEMA_CHILD)), 0.3F);
    }

    @Override
    protected void scale(SeriemaEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.7F : 0.75F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}
