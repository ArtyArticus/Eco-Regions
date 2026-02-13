package com.github.artyarticus.ecoregions.client.render.entity;

import com.github.artyarticus.ecoregions.client.model.EcoRegionsModelLayers;
import com.github.artyarticus.ecoregions.client.model.CommonWombatModel;
import com.github.artyarticus.ecoregions.entity.CommonWombatEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class CommonWombatRenderer extends ZawaMobRenderer<CommonWombatEntity, CommonWombatModel> {
    public CommonWombatRenderer(EntityRendererProvider.Context context) {
        super(context, new CommonWombatModel.Adult(context.bakeLayer(EcoRegionsModelLayers.COMMON_WOMBAT_ADULT)), new CommonWombatModel.Child(context.bakeLayer(EcoRegionsModelLayers.COMMON_WOMBAT_CHILD)), 0.4F);
    }

    @Override
    protected void scale(CommonWombatEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.75F : 0.8F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}

