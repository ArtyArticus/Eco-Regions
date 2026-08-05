package com.github.artyarticus.ecoregions.client.render.entity;

import com.github.artyarticus.ecoregions.client.model.AndeanBearModel;
import com.github.artyarticus.ecoregions.entity.AndeanBearEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class AndeanBearRenderer extends ZawaMobRenderer<AndeanBearEntity, AndeanBearModel> {
    public AndeanBearRenderer(EntityRendererManager manager) {
        super(manager, new AndeanBearModel.Adult(), new AndeanBearModel.Child(), 0.65F);
    }

    @Override
    protected void scale(AndeanBearEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.8F : 1.0F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    protected boolean hasBabyVariants(AndeanBearEntity entity) {
        return false;
    }
}

