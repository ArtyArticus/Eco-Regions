package com.github.artyarticus.ecoregions.client.render.entity;

import com.github.artyarticus.ecoregions.client.model.EcoRegionsModelLayers;
import com.github.artyarticus.ecoregions.client.model.MongooseModel;
import com.github.artyarticus.ecoregions.entity.MongooseEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class MongooseRenderer extends ZawaMobRenderer<MongooseEntity, MongooseModel> {
    public MongooseRenderer(EntityRendererProvider.Context context) {
        super(context, new MongooseModel.Adult(context.bakeLayer(EcoRegionsModelLayers.MONGOOSE_ADULT)), new MongooseModel.Child(context.bakeLayer(EcoRegionsModelLayers.MONGOOSE_CHILD)), 0.4F);
    }

    @Override
    protected void scale(MongooseEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.4F : 0.65F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}

