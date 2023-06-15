package com.github.artyarticus.ecoregions.client.render.entity;

import com.github.artyarticus.ecoregions.EcoRegions;
import com.github.artyarticus.ecoregions.client.model.SpectacledBearModel;
import com.github.artyarticus.ecoregions.entity.SpectacledBearEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class SpectacledBearRenderer extends ZawaMobRenderer<SpectacledBearEntity, SpectacledBearModel> {
    private final SpectacledBearModel adultModel;
    private final SpectacledBearModel babyModel;

    public SpectacledBearRenderer(EntityRendererManager rendererManager) {
        super(rendererManager, new SpectacledBearModel.Adult(), 1.0F);
        adultModel = model;
        babyModel = new SpectacledBearModel.Child();
    }

    @Override
    public void render(SpectacledBearEntity entity, float entityYaw, float partialTicks, MatrixStack matrixStack, IRenderTypeBuffer buffer, int packedLight) {
        model = entity.isBaby() ? babyModel : adultModel;
        super.render(entity, entityYaw, partialTicks, matrixStack, buffer, packedLight);
    }

    @Override
    public void setupAdultTextures(SpectacledBearEntity entity) {
        int variantCount = entity.getTotalVariants();
        adultTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            adultTextures[i] = new ResourceLocation(EcoRegions.MOD_ID, "textures/entity/spectacled_bear/spectacled_bear_" + (i + 1) + ".png");
    }

    @Override
    public void setupBabyTextures(SpectacledBearEntity entity) {
        int variantCount = entity.getTotalVariants();
        babyTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            babyTextures[i] = new ResourceLocation(EcoRegions.MOD_ID, "textures/entity/spectacled_bear/spectacled_bear_baby_" + (i + 1) + ".png");
    }
}
