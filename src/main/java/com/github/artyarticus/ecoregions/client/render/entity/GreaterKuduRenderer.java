package com.github.artyarticus.ecoregions.client.render.entity;

import com.github.artyarticus.ecoregions.client.model.GreaterKuduModel;
import com.github.artyarticus.ecoregions.entity.GreaterKuduEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class GreaterKuduRenderer extends ZawaMobRenderer<GreaterKuduEntity, GreaterKuduModel> {
    public GreaterKuduRenderer(EntityRendererManager manager) {
        super(manager, new GreaterKuduModel.AdultMale(), new GreaterKuduModel.Child(), 0.9F);
        adultFemaleModel = new GreaterKuduModel.AdultFemale();
    }

    @Override
    protected void scale(GreaterKuduEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 1.0F : 0.85F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
    @Override
    protected boolean isSexuallyDimorphic() {
        return true;
    }
}
