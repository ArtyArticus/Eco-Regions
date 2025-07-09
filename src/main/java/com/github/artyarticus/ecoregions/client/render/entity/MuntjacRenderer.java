package com.github.artyarticus.ecoregions.client.render.entity;

import com.github.artyarticus.ecoregions.client.model.MuntjacModel;
import com.github.artyarticus.ecoregions.entity.MuntjacEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class MuntjacRenderer extends ZawaMobRenderer<MuntjacEntity, MuntjacModel> {
    public MuntjacRenderer(EntityRendererManager manager) {
        super(manager, new MuntjacModel.Adult(), new MuntjacModel.Child(), 0.5F);
    }

    @Override
    protected void scale(MuntjacEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.55F : 0.7F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
    @Override
    protected boolean isSexuallyDimorphic() {
        return true;
    }
}
