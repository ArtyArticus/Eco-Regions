package com.github.artyarticus.ecoregions.client.render.entity;

import com.github.artyarticus.ecoregions.client.model.CommonWombatModel;
import com.github.artyarticus.ecoregions.entity.CommonWombatEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class CommonWombatRenderer extends ZawaMobRenderer<CommonWombatEntity, CommonWombatModel> {
    public CommonWombatRenderer(EntityRendererManager manager) {
        super(manager, new CommonWombatModel.Adult(), new CommonWombatModel.Child(), 0.4F);
    }

    @Override
    protected void scale(CommonWombatEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.75F : 0.8F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}

