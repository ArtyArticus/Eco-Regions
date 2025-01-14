package com.github.artyarticus.ecoregions.client.render.entity;

import com.github.artyarticus.ecoregions.client.model.GibbonModel;
import com.github.artyarticus.ecoregions.entity.GibbonEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class GibbonRenderer extends ZawaMobRenderer<GibbonEntity, GibbonModel> {
    public GibbonRenderer(EntityRendererManager manager) {
        super(manager, new GibbonModel.Adult(), new GibbonModel.Child(), 0.3F);
    }

    @Override
    protected void scale(GibbonEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.75F : 0.8F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    protected boolean isSexuallyDimorphic() {
        return true;
    }
}
