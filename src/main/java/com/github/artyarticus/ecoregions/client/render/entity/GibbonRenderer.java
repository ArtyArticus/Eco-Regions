package com.github.artyarticus.ecoregions.client.render.entity;

import com.github.artyarticus.ecoregions.client.model.GibbonModel;
import com.github.artyarticus.ecoregions.entity.GibbonEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;
import org.zawamod.zawa.world.entity.animal.Giraffe;

public class GibbonRenderer extends ZawaMobRenderer<GibbonEntity, GibbonModel> {
    public GibbonRenderer(EntityRendererManager manager) {
        super(manager, new GibbonModel.Adult(), new GibbonModel.Child(), 0.3F);
    }

    @Override
    protected void scale(GibbonEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.getVariant() == 0 ? 0.75F : 0.65F;
        if (!entity.isBaby()) {
            matrixStack.scale(scale, scale, scale);
        }

        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    protected boolean isSexuallyDimorphic() {
        return true;
    }
}
