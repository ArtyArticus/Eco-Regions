package com.github.artyarticus.ecoregions.client.render.entity;

import com.github.artyarticus.ecoregions.client.model.TreeKangarooModel;
import com.github.artyarticus.ecoregions.entity.TreeKangarooEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class TreeKangarooRenderer extends ZawaMobRenderer<TreeKangarooEntity, TreeKangarooModel> {
    public TreeKangarooRenderer(EntityRendererManager manager) {
        super(manager, new TreeKangarooModel.Adult(), new TreeKangarooModel.Child(), 0.4F);
    }

    @Override
    protected void scale(TreeKangarooEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.7F : 0.8F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}
