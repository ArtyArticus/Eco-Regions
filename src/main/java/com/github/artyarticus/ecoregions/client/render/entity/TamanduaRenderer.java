package com.github.artyarticus.ecoregions.client.render.entity;

import com.github.artyarticus.ecoregions.client.model.EcoRegionsModelLayers;
import com.github.artyarticus.ecoregions.client.model.TamanduaModel;
import com.github.artyarticus.ecoregions.entity.TamanduaEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class TamanduaRenderer extends ZawaMobRenderer<TamanduaEntity, TamanduaModel> {
    public TamanduaRenderer(EntityRendererProvider.Context context) {
        super(context, new TamanduaModel.Adult(context.bakeLayer(EcoRegionsModelLayers.TAMANDUA_ADULT)), new TamanduaModel.Child(context.bakeLayer(EcoRegionsModelLayers.TAMANDUA_CHILD)), 0.4F);
    }

    @Override
    protected void scale(TamanduaEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.4F : 0.65F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}
