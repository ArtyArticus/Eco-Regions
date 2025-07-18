package com.github.artyarticus.ecoregions.client.render.entity;

import com.github.artyarticus.ecoregions.client.model.KuduModel;
import com.github.artyarticus.ecoregions.entity.KuduEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class KuduRenderer extends ZawaMobRenderer<KuduEntity, KuduModel> {
    public KuduRenderer(EntityRendererManager manager) {
        super(manager, new KuduModel.AdultMale(), new KuduModel.Child(), 0.9F);
        adultFemaleModel = new KuduModel.AdultFemale();
    }

    @Override
    protected void scale(KuduEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 1.0F : 0.85F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
    @Override
    protected boolean isSexuallyDimorphic() {
        return true;
    }
}
