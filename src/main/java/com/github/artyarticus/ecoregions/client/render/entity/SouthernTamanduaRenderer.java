package com.github.artyarticus.ecoregions.client.render.entity;

import com.github.artyarticus.ecoregions.client.model.SouthernTamanduaModel;
import com.github.artyarticus.ecoregions.entity.SouthernTamanduaEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class SouthernTamanduaRenderer extends ZawaMobRenderer<SouthernTamanduaEntity, SouthernTamanduaModel> {
    public SouthernTamanduaRenderer(EntityRendererManager manager) {
        super(manager, new SouthernTamanduaModel.Adult(), new SouthernTamanduaModel.Child(), 0.3F);
    }

    @Override
    protected void scale(SouthernTamanduaEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.45F : 0.7F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}
