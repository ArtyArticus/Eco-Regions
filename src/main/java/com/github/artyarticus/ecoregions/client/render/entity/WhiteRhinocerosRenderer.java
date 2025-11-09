package com.github.artyarticus.ecoregions.client.render.entity;

import com.github.artyarticus.ecoregions.client.model.EcoRegionsModelLayers;
import com.github.artyarticus.ecoregions.client.model.WhiteRhinocerosModel;
import com.github.artyarticus.ecoregions.entity.WhiteRhinocerosEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class WhiteRhinocerosRenderer extends ZawaMobRenderer<WhiteRhinocerosEntity, WhiteRhinocerosModel> {
    public WhiteRhinocerosRenderer(EntityRendererProvider.Context context) {
        super(context, new WhiteRhinocerosModel.Adult(context.bakeLayer(EcoRegionsModelLayers.WHITE_RHINOCEROS_ADULT)), new WhiteRhinocerosModel.Child(context.bakeLayer(EcoRegionsModelLayers.WHITE_RHINOCEROS_CHILD)), 1.7F);
    }

    @Override
    protected void scale(WhiteRhinocerosEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 1.0F : 1.25F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}
