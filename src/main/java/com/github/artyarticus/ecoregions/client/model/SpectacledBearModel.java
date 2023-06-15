package com.github.artyarticus.ecoregions.client.model;

import com.github.artyarticus.ecoregions.entity.SpectacledBearEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class SpectacledBearModel extends ZawaBaseModel<SpectacledBearEntity> {
    private Iterable<ModelRenderer> parts;

    @Override
    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(/*body*/);
        }

        return this.parts;
    }

    public static class Adult extends SpectacledBearModel {
        public Adult() {
            this.saveBase();
        }

        @Override
        public void setupAnim(SpectacledBearEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        }

        @Override
        public void playIdleAnimation(Entity entity, float v, float v1, float v2, float v3, float v4) {

        }

        @Override
        public void playMovementAnimation(Entity entity, float v, float v1, float v2, float v3, float v4) {

        }
    }

    public static class Child extends SpectacledBearModel {
        public Child() {
            this.saveBase();
        }

        @Override
        public void setupAnim(SpectacledBearEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        }

        @Override
        public void playIdleAnimation(Entity entity, float v, float v1, float v2, float v3, float v4) {

        }

        @Override
        public void playMovementAnimation(Entity entity, float v, float v1, float v2, float v3, float v4) {

        }
    }
}
