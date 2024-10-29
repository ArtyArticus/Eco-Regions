package com.github.artyarticus.ecoregions.client.render.entity;

import com.github.artyarticus.ecoregions.client.model.WhiteRhinocerosModel;
import com.github.artyarticus.ecoregions.entity.WhiteRhinocerosEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class WhiteRhinocerosRenderer extends ZawaMobRenderer<WhiteRhinocerosEntity, WhiteRhinocerosModel> {
    public WhiteRhinocerosRenderer(EntityRendererManager manager) {
        super(manager, new WhiteRhinocerosModel.Adult(), new WhiteRhinocerosModel.Child(), 1.7F);
    }

    @Override
    protected void scale(WhiteRhinocerosEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 1.0F : 1.25F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}
