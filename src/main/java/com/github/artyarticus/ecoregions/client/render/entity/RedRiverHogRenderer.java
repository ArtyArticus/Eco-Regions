package com.github.artyarticus.ecoregions.client.render.entity;

import com.github.artyarticus.ecoregions.client.model.EcoRegionsModelLayers;
import com.github.artyarticus.ecoregions.client.model.RedRiverHogModel;
import com.github.artyarticus.ecoregions.entity.RedRiverHogEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class RedRiverHogRenderer extends ZawaMobRenderer<RedRiverHogEntity, RedRiverHogModel> {
    public RedRiverHogRenderer(EntityRendererProvider.Context context) {
        super(context, new RedRiverHogModel.Adult(context.bakeLayer(EcoRegionsModelLayers.RED_RIVER_HOG_ADULT)), new RedRiverHogModel.Child(context.bakeLayer(EcoRegionsModelLayers.RED_RIVER_HOG_CHILD)), 0.65F);
    }

    @Override
    protected void scale(RedRiverHogEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.8F : 1.15F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    protected boolean isSexuallyDimorphic() {
        return true;
    }
}
