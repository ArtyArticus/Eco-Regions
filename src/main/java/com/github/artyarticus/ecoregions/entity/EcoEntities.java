package com.github.artyarticus.ecoregions.entity;

import com.github.artyarticus.ecoregions.EcoRegions;
import com.github.artyarticus.ecoregions.client.render.entity.SpectacledBearRenderer;
import com.github.artyarticus.ecoregions.item.EcoItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntitySpawnPlacementRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.world.gen.Heightmap;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.zawamod.zawa.Zawa;
import org.zawamod.zawa.config.ZawaSpawnCategory;
import org.zawamod.zawa.world.entity.animal.ZawaBaseEntity;
import org.zawamod.zawa.world.entity.animal.ZawaEntities;

public class EcoEntities {
    public static final DeferredRegister<EntityType<?>> REGISTRAR = DeferredRegister.create(ForgeRegistries.ENTITIES, EcoRegions.MOD_ID);

    public static final RegistryObject<EntityType<SpectacledBearEntity>> SPECTACLED_BEAR = new Builder<>(SpectacledBearEntity::new, EntityClassification.CREATURE)
            .attributes(SpectacledBearEntity::registerAttributes)
            .renderer(() -> SpectacledBearRenderer::new)
            .spawns(8, 1, 1, ZawaSpawnCategory.DRY_GRASSLAND, ZawaSpawnCategory.DRY_RAINFOREST, ZawaSpawnCategory.TROPICAL_ALPINE)
            .data(entityBuilder -> entityBuilder.sized(1.0F, 1.0F).clientTrackingRange(10))
            .build(REGISTRAR, "spectacled_bear");

    public static void registerSpawnPlacements() {
        EntitySpawnPlacementRegistry.register(SPECTACLED_BEAR.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
    }

    public static class Builder<T extends Entity> extends ZawaEntities.Builder<T> {
        public Builder(EntityType.IFactory<T> factory, EntityClassification category) {
            super(factory, category);
            setupMod(EcoRegions.MOD_ID, EcoItems.REGISTRAR, Zawa.ENTITIES_GROUP);
        }
    }
}
