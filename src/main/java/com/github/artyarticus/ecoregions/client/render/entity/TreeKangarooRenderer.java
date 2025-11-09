package com.github.artyarticus.ecoregions.client.render.entity;

import com.github.artyarticus.ecoregions.client.model.EcoRegionsModelLayers;
import com.github.artyarticus.ecoregions.client.model.TreeKangarooModel;
import com.github.artyarticus.ecoregions.entity.TreeKangarooEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class TreeKangarooRenderer extends ZawaMobRenderer<TreeKangarooEntity, TreeKangarooModel> {
    public TreeKangarooRenderer(EntityRendererProvider.Context context) {
        super(context, new TreeKangarooModel.Adult(context.bakeLayer(EcoRegionsModelLayers.TREE_KANGAROO_ADULT)), new TreeKangarooModel.Child(context.bakeLayer(EcoRegionsModelLayers.TREE_KANGAROO_CHILD)), 0.4F);
    }

    @Override
    protected void scale(TreeKangarooEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.7F : 0.8F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}
