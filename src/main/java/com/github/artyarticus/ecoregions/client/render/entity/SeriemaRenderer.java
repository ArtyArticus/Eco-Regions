package com.github.artyarticus.ecoregions.client.render.entity;

import com.github.artyarticus.ecoregions.client.model.SeriemaModel;
import com.github.artyarticus.ecoregions.entity.SeriemaEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class SeriemaRenderer extends ZawaMobRenderer<SeriemaEntity, SeriemaModel> {
    public SeriemaRenderer(EntityRendererManager manager) {
        super(manager, new SeriemaModel.Adult(), new SeriemaModel.Child(), 0.3F);
    }

    @Override
    protected void scale(SeriemaEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.35F : 0.75F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}
