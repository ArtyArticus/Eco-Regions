package com.github.artyarticus.ecoregions.client.render.entity;

import com.github.artyarticus.ecoregions.client.model.AoudadModel;
import com.github.artyarticus.ecoregions.client.model.EcoRegionsModelLayers;
import com.github.artyarticus.ecoregions.entity.AoudadEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class AoudadRenderer extends ZawaMobRenderer<AoudadEntity, AoudadModel> {
    public AoudadRenderer(EntityRendererProvider.Context context) {
        super(context, new AoudadModel.Adult(context.bakeLayer(EcoRegionsModelLayers.AOUDAD_ADULT)), new AoudadModel.Child(context.bakeLayer(EcoRegionsModelLayers.AOUDAD_CHILD)), 0.4F);
    }

    @Override
    protected void scale(AoudadEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.4F : 0.65F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    protected boolean isSexuallyDimorphic() {
        return true;
    }
}

