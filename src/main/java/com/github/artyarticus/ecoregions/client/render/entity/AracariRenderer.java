package com.github.artyarticus.ecoregions.client.render.entity;

import com.github.artyarticus.ecoregions.client.model.AracariModel;
import com.github.artyarticus.ecoregions.entity.AracariEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class AracariRenderer extends ZawaMobRenderer<AracariEntity, AracariModel> {
    public AracariRenderer(EntityRendererManager manager) {
        super(manager, new AracariModel.Adult(), new AracariModel.Flying(), new AracariModel.Child(), 0.15F);
    }

    @Override
    protected void scale(AracariEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.5F : 0.75F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    protected boolean hasBabyVariants(AracariEntity entity) {
        return false;
    }
}
