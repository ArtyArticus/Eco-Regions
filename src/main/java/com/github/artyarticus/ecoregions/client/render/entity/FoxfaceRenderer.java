package com.github.artyarticus.ecoregions.client.render.entity;

import com.github.artyarticus.ecoregions.EcoRegions;
import com.github.artyarticus.ecoregions.client.model.FoxfaceModel;
import com.github.artyarticus.ecoregions.client.model.FoxfaceModel;
import com.github.artyarticus.ecoregions.entity.FoxfaceEntity;
import com.github.artyarticus.ecoregions.entity.FoxfaceEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;
import org.zawamod.zawa.resources.EntityStatsManager;

public class FoxfaceRenderer extends ZawaMobRenderer<FoxfaceEntity, FoxfaceModel> {
    public FoxfaceRenderer(EntityRendererManager manager) {
        super(manager, new FoxfaceModel(), 0.2F);
    }

    @Override
    protected void scale(FoxfaceEntity entity, MatrixStack matrixStack, float partialTickTime) {
        matrixStack.scale(0.5F, 0.5F, 0.5F);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    public ResourceLocation getBabyTexture(FoxfaceEntity entity, int variant) {
        if (variant >= entity.getWildVariants()) {
            String variantName = EntityStatsManager.INSTANCE.getStats(entity).getCaptiveVariantsList().get(variant - entity.getWildVariants());
            return new ResourceLocation(EcoRegions.MOD_ID, "textures/entity/foxface/foxface_" + variantName + ".png");
        } else return this.babyTexture != null ? this.babyTexture : this.babyTextures[variant];
    }
}
