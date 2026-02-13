package com.github.artyarticus.ecoregions.client.render.entity;

import com.github.artyarticus.ecoregions.client.model.AracariModel;
import com.github.artyarticus.ecoregions.client.model.EcoRegionsModelLayers;
import com.github.artyarticus.ecoregions.entity.AracariEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class AracariRenderer extends ZawaMobRenderer<AracariEntity, AracariModel> {
    public AracariRenderer(EntityRendererProvider.Context context) {
        super(context, new AracariModel.Adult(context.bakeLayer(EcoRegionsModelLayers.ARACARI_ADULT)), new AracariModel.Flying(context.bakeLayer(EcoRegionsModelLayers.ARACARI_FLYING)), new AracariModel.Child(context.bakeLayer(EcoRegionsModelLayers.ARACARI_CHILD)), 0.15F);
    }

    @Override
    protected void scale(AracariEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.5F : 0.75F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    protected boolean hasBabyVariants(AracariEntity entity) {
        return false;
    }

    @Override
    protected boolean isSexuallyDimorphic() {
        return true;
    }
}
