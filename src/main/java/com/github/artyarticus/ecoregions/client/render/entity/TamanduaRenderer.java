package com.github.artyarticus.ecoregions.client.render.entity;

import com.github.artyarticus.ecoregions.client.model.TamanduaModel;
import com.github.artyarticus.ecoregions.entity.TamanduaEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class TamanduaRenderer extends ZawaMobRenderer<TamanduaEntity, TamanduaModel> {
    public TamanduaRenderer(EntityRendererManager manager) {
        super(manager, new TamanduaModel.Adult(), new TamanduaModel.Child(), 0.3F);
    }

    @Override
    protected void scale(TamanduaEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.45F : 0.7F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}
