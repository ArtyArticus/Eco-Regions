package com.github.artyarticus.ecoregions.client.render.entity;

import com.github.artyarticus.ecoregions.client.model.BlackbuckModel;
import com.github.artyarticus.ecoregions.entity.BlackbuckEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class BlackbuckRenderer extends ZawaMobRenderer<BlackbuckEntity, BlackbuckModel> {
    public BlackbuckRenderer(EntityRendererManager manager) {
        super(manager, new BlackbuckModel.Adult(), new BlackbuckModel.Child(), 0.65F);
    }

    @Override
    protected void scale(BlackbuckEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.8F : 1.0F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    protected boolean isSexuallyDimorphic() {
        return true;
    }
}

