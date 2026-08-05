package com.github.artyarticus.ecoregions.client.render.entity;

import com.github.artyarticus.ecoregions.client.model.HamadrayasBaboonModel;
import com.github.artyarticus.ecoregions.entity.HamadrayasBaboonEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class HamadrayasBaboonRenderer extends ZawaMobRenderer<HamadrayasBaboonEntity, HamadrayasBaboonModel> {
    public HamadrayasBaboonRenderer(EntityRendererManager manager) {
        super(manager, new HamadrayasBaboonModel.Adult(), new HamadrayasBaboonModel.Child(), 0.65F);
    }

    @Override
    protected void scale(HamadrayasBaboonEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.65F : 0.7F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    protected boolean isSexuallyDimorphic() {
        return true;
    }
}
