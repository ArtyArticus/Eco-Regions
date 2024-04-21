package com.github.artyarticus.ecoregions.client.render.entity;

import com.github.artyarticus.ecoregions.client.model.MongooseModel;
import com.github.artyarticus.ecoregions.entity.LorisEntity;
import com.github.artyarticus.ecoregions.entity.MongooseEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class MongooseRenderer extends ZawaMobRenderer<MongooseEntity, MongooseModel> {
    public MongooseRenderer(EntityRendererManager manager) {
        super(manager, new MongooseModel.Adult(), new MongooseModel.Child(), 0.65F);
    }

    @Override
    protected void scale(MongooseEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.8F : 1.0F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    protected boolean hasBabyVariants(MongooseEntity entity) {
        return false;
    }
}

