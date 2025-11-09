package com.github.artyarticus.ecoregions.client.render.entity;

import com.github.artyarticus.ecoregions.client.model.BaboonModel;
import com.github.artyarticus.ecoregions.client.model.EcoRegionsModelLayers;
import com.github.artyarticus.ecoregions.entity.BaboonEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class BaboonRenderer extends ZawaMobRenderer<BaboonEntity, BaboonModel> {
    public BaboonRenderer(EntityRendererProvider.Context context) {
        super(context, new BaboonModel.Adult(context.bakeLayer(EcoRegionsModelLayers.BABOON_ADULT)), new BaboonModel.Child(context.bakeLayer(EcoRegionsModelLayers.BABOON_CHILD)), 0.65F);
    }

    @Override
    protected void scale(BaboonEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.65F : 0.7F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    protected boolean isSexuallyDimorphic() {
        return true;
    }
}
