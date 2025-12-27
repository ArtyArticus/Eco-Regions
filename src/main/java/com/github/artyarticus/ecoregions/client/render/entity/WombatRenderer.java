package com.github.artyarticus.ecoregions.client.render.entity;

import com.github.artyarticus.ecoregions.client.model.WombatModel;
import com.github.artyarticus.ecoregions.entity.WombatEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class WombatRenderer extends ZawaMobRenderer<WombatEntity, WombatModel> {
    public WombatRenderer(EntityRendererManager manager) {
        super(manager, new WombatModel.Adult(), new WombatModel.Child(), 0.4F);
    }

    @Override
    protected void scale(WombatEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.4F : 0.65F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}

