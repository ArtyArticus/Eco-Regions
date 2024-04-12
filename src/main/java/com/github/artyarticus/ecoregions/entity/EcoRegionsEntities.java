package com.github.artyarticus.ecoregions.entity;

import com.github.artyarticus.ecoregions.EcoRegions;
import com.github.artyarticus.ecoregions.client.render.entity.BushDogRenderer;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntitySpawnPlacementRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.world.gen.Heightmap;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.zawamod.zawa.config.ZawaSpawnCategory;
import org.zawamod.zawa.world.entity.animal.ZawaBaseEntity;

import static org.zawamod.zawa.world.entity.ZawaEntities.REGISTRY;

public class EcoRegionsEntities {
    public static final DeferredRegister<EntityType<?>> REGISTRAR = DeferredRegister.create(ForgeRegistries.ENTITIES, EcoRegions.MOD_ID);

    public static final RegistryObject<EntityType<BushDogEntity>> BUSH_DOG =
            REGISTRY.builder (BushDogEntity::new, EntityClassification.CREATURE)
                    .attributes(BushDogEntity::registerAttributes)
                    .renderer(() -> BushDogRenderer::new)
                    .spawns(2, 2, 3, ZawaSpawnCategory.DRY_GRASSLAND, ZawaSpawnCategory.DRY_RAINFOREST, ZawaSpawnCategory.TROPICAL_ALPINE)
                    .data(entityBuilder -> entityBuilder.sized(0.0F, 0.0F).clientTrackingRange(10))
                    .build("bush_dog");
    public static void registerSpawnPlacements() {

        EntitySpawnPlacementRegistry.register(BUSH_DOG.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
    }
}

