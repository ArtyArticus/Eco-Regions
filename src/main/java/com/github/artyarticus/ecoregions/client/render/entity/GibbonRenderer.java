package com.github.artyarticus.ecoregions.client.render.entity;

import com.github.artyarticus.ecoregions.client.model.EcoRegionsModelLayers;
import com.github.artyarticus.ecoregions.client.model.GibbonModel;
import com.github.artyarticus.ecoregions.entity.GibbonEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class GibbonRenderer extends ZawaMobRenderer<GibbonEntity, GibbonModel> {
    public GibbonRenderer(EntityRendererProvider.Context context) {
        super(context, new GibbonModel.Adult(context.bakeLayer(EcoRegionsModelLayers.GIBBON_ADULT)), new GibbonModel.Child(context.bakeLayer(EcoRegionsModelLayers.GIBBON_CHILD)), 0.3F);
    }

    @Override
    protected void scale(GibbonEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.75F : 0.8F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    protected boolean isSexuallyDimorphic() {
        return true;
    }
}
