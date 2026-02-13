package com.github.artyarticus.ecoregions.client.render.entity;

import com.github.artyarticus.ecoregions.client.model.EcoRegionsModelLayers;
import com.github.artyarticus.ecoregions.client.model.SouthernTamanduaModel;
import com.github.artyarticus.ecoregions.entity.SouthernTamanduaEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class SouthernTamanduaRenderer extends ZawaMobRenderer<SouthernTamanduaEntity, SouthernTamanduaModel> {
    public SouthernTamanduaRenderer(EntityRendererProvider.Context context) {
        super(context, new SouthernTamanduaModel.Adult(context.bakeLayer(EcoRegionsModelLayers.SOUTHERN_TAMANDUA_ADULT)), new SouthernTamanduaModel.Child(context.bakeLayer(EcoRegionsModelLayers.SOUTHERN_TAMANDUA_CHILD)), 0.4F);
    }

    @Override
    protected void scale(SouthernTamanduaEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.4F : 0.65F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}
