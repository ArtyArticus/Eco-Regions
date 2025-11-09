package com.github.artyarticus.ecoregions.client.render.entity;

import com.github.artyarticus.ecoregions.client.model.BlackbuckModel;
import com.github.artyarticus.ecoregions.client.model.EcoRegionsModelLayers;
import com.github.artyarticus.ecoregions.entity.BlackbuckEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class BlackbuckRenderer extends ZawaMobRenderer<BlackbuckEntity, BlackbuckModel> {
    public BlackbuckRenderer(EntityRendererProvider.Context context) {
        super(context, new BlackbuckModel.Adult(context.bakeLayer(EcoRegionsModelLayers.BLACKBUCK_ADULT)), new BlackbuckModel.Child(context.bakeLayer(EcoRegionsModelLayers.BLACKBUCK_CHILD)), 0.6F);
    }

    @Override
    protected void scale(BlackbuckEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.8F : 1.05F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    protected boolean isSexuallyDimorphic() {
        return true;
    }
}

