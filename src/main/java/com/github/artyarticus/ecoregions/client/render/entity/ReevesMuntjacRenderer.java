package com.github.artyarticus.ecoregions.client.render.entity;

import com.github.artyarticus.ecoregions.client.model.ReevesMuntjacModel;
import com.github.artyarticus.ecoregions.entity.ReevesMuntjacEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class ReevesMuntjacRenderer extends ZawaMobRenderer<ReevesMuntjacEntity, ReevesMuntjacModel> {
    public ReevesMuntjacRenderer(EntityRendererManager manager) {
        super(manager, new ReevesMuntjacModel.Adult(), new ReevesMuntjacModel.Child(), 0.45F);
    }

    @Override
    protected void scale(ReevesMuntjacEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.65F : 0.7F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
    @Override
    protected boolean isSexuallyDimorphic() {
        return true;
    }
}
