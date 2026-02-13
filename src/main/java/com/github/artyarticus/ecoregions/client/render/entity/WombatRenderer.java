package com.github.artyarticus.ecoregions.client.render.entity;

import com.github.artyarticus.ecoregions.client.model.EcoRegionsModelLayers;
import com.github.artyarticus.ecoregions.client.model.WombatModel;
import com.github.artyarticus.ecoregions.entity.WombatEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class WombatRenderer extends ZawaMobRenderer<WombatEntity, WombatModel> {
    public WombatRenderer(EntityRendererProvider.Context context) {
        super(context, new WombatModel.Adult(context.bakeLayer(EcoRegionsModelLayers.WOMBAT_ADULT)), new WombatModel.Child(context.bakeLayer(EcoRegionsModelLayers.WOMBAT_CHILD)), 0.4F);
    }

    @Override
    protected void scale(WombatEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.4F : 0.65F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}

