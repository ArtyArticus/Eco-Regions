package com.github.artyarticus.ecoregions.client.render.entity;

import com.github.artyarticus.ecoregions.client.model.EcoRegionsModelLayers;
import com.github.artyarticus.ecoregions.client.model.KuduModel;
import com.github.artyarticus.ecoregions.entity.KuduEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class KuduRenderer extends ZawaMobRenderer<KuduEntity, KuduModel> {
    public KuduRenderer(EntityRendererProvider.Context context) {
        super(context, new KuduModel.AdultMale(context.bakeLayer(EcoRegionsModelLayers.KUDU_ADULT_MALE)), new KuduModel.Child(context.bakeLayer(EcoRegionsModelLayers.KUDU_CHILD)), 0.9F);
        adultFemaleModel = new KuduModel.AdultFemale(context.bakeLayer(EcoRegionsModelLayers.KUDU_ADULT_FEMALE));
    }

    @Override
    protected void scale(KuduEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 1.0F : 0.85F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
    @Override
    protected boolean isSexuallyDimorphic() {
        return true;
    }
}
