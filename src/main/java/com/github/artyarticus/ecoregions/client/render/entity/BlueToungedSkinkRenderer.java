package com.github.artyarticus.ecoregions.client.render.entity;

import com.github.artyarticus.ecoregions.client.model.BlueToungedSkinkModel;
import com.github.artyarticus.ecoregions.entity.BlueToungedSkinkEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class BlueToungedSkinkRenderer extends ZawaMobRenderer<BlueToungedSkinkEntity, BlueToungedSkinkModel> {
    public BlueToungedSkinkRenderer(EntityRendererManager manager) {
        super(manager, new BlueToungedSkinkModel.Adult(), new BlueToungedSkinkModel.Child(), 0.3F);
    }

    @Override
    protected void scale(BlueToungedSkinkEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.5F : 0.55F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}