package com.github.artyarticus.ecoregions.client.render.entity;

import com.github.artyarticus.ecoregions.client.model.ScreamerModel;
import com.github.artyarticus.ecoregions.entity.BeeEaterEntity;
import com.github.artyarticus.ecoregions.entity.ScreamerEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class ScreamerRenderer extends ZawaMobRenderer<ScreamerEntity, ScreamerModel> {
    public ScreamerRenderer(EntityRendererManager manager) {
        super(manager, new ScreamerModel.Adult(), new ScreamerModel.Child(), 0.2F);
    }

    @Override
    protected void scale(ScreamerEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.65F : 0.8F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
    @Override
    protected boolean hasBabyVariants(ScreamerEntity entity) {
        return false;
    }
}
