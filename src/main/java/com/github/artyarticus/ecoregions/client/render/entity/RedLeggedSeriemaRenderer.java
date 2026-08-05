package com.github.artyarticus.ecoregions.client.render.entity;

import com.github.artyarticus.ecoregions.client.model.RedLeggedSeriemaModel;
import com.github.artyarticus.ecoregions.entity.RedLeggedSeriemaEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class RedLeggedSeriemaRenderer extends ZawaMobRenderer<RedLeggedSeriemaEntity, RedLeggedSeriemaModel> {
    public RedLeggedSeriemaRenderer(EntityRendererManager manager) {
        super(manager, new RedLeggedSeriemaModel.Adult(), new RedLeggedSeriemaModel.Child(), 0.3F);
    }

    @Override
    protected void scale(RedLeggedSeriemaEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.7F : 0.75F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}
