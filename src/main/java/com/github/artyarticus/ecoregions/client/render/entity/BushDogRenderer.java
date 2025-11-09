package com.github.artyarticus.ecoregions.client.render.entity;

import com.github.artyarticus.ecoregions.client.model.BushDogModel;
import com.github.artyarticus.ecoregions.client.model.EcoRegionsModelLayers;
import com.github.artyarticus.ecoregions.entity.BushDogEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class BushDogRenderer extends ZawaMobRenderer<BushDogEntity, BushDogModel> {
    public BushDogRenderer(EntityRendererProvider.Context context) {
        super(context, new BushDogModel.Adult(context.bakeLayer(EcoRegionsModelLayers.BUSH_DOG_ADULT)), new BushDogModel.Child(context.bakeLayer(EcoRegionsModelLayers.BUSH_DOG_CHILD)), 0.4F);
    }

    @Override
    protected void scale(BushDogEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.95F : 0.9F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}
