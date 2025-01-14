package com.github.artyarticus.ecoregions.client.render.entity;

import com.github.artyarticus.ecoregions.client.model.BaboonModel;
import com.github.artyarticus.ecoregions.entity.BaboonEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class BaboonRenderer extends ZawaMobRenderer<BaboonEntity, BaboonModel> {
    public BaboonRenderer(EntityRendererManager manager) {
        super(manager, new BaboonModel.Adult(), new BaboonModel.Child(), 0.65F);
    }

    @Override
    protected void scale(BaboonEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.65F : 0.7F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    protected boolean isSexuallyDimorphic() {
        return true;
    }
}
