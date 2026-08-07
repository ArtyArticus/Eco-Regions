package com.github.artyarticus.ecoregions.client.render.entity;

import com.github.artyarticus.ecoregions.client.model.AoudadModel;
import com.github.artyarticus.ecoregions.entity.AoudadEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class AoudadRenderer extends ZawaMobRenderer<AoudadEntity, AoudadModel> {
    public AoudadRenderer(EntityRendererManager manager) {
        super(manager, new AoudadModel.Adult(), new AoudadModel.Child(), 0.4F);
    }

    @Override
    protected void scale(AoudadEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.75F : 0.8F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
    @Override
    protected boolean isSexuallyDimorphic() {
        return true;
    }
}

