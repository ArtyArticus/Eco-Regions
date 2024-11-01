package com.github.artyarticus.ecoregions.entity;

import com.github.artyarticus.ecoregions.EcoRegions;
import com.github.artyarticus.ecoregions.client.render.entity.*;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntitySpawnPlacementRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.world.gen.Heightmap;
import net.minecraftforge.fml.RegistryObject;
import org.zawamod.zawa.Zawa;
import org.zawamod.zawa.config.ZawaSpawnCategory;
import org.zawamod.zawa.world.entity.ZawaEntityRegistry;
import org.zawamod.zawa.world.entity.ambient.ZawaAmbientFishEntity;
import org.zawamod.zawa.world.entity.animal.ZawaBaseEntity;

public class EcoRegionsEntities {
    public static final ZawaEntityRegistry REGISTRY = new ZawaEntityRegistry(EcoRegions.MOD_ID, Zawa.ENTITIES_GROUP);

    public static final RegistryObject<EntityType<BushDogEntity>> BUSH_DOG =
            REGISTRY.builder(BushDogEntity::new, EntityClassification.CREATURE)
                    .attributes(BushDogEntity::registerAttributes)
                    .renderer(() -> BushDogRenderer::new)
                    .spawns(2, 2, 3, ZawaSpawnCategory.WET_RAINFOREST)
                    .data(entityBuilder -> entityBuilder.sized(0.4F, 0.4F).clientTrackingRange(10))
                    .build("bush_dog");

    public static final RegistryObject<EntityType<SpectacledBearEntity>> SPECTACLED_BEAR =
            REGISTRY.builder(SpectacledBearEntity::new, EntityClassification.CREATURE)
                    .attributes(SpectacledBearEntity::registerAttributes)
                    .renderer(() -> SpectacledBearRenderer::new)
                    .spawns(8, 1, 1, ZawaSpawnCategory.WET_RAINFOREST, ZawaSpawnCategory.TROPICAL_ALPINE)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.0F).clientTrackingRange(10))
                    .build("spectacled_bear");

    public static final RegistryObject<EntityType<RheaEntity>> RHEA =
            REGISTRY.builder(RheaEntity::new, EntityClassification.CREATURE)
                    .attributes(RheaEntity::registerAttributes)
                    .renderer(() -> RheaRenderer::new)
                    .spawns(10, 1, 4, ZawaSpawnCategory.DRY_GRASSLAND)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.5F).clientTrackingRange(10))
                    .build("rhea");

    public static final RegistryObject<EntityType<BlackbuckEntity>> BLACKBUCK =
            REGISTRY.builder(BlackbuckEntity::new, EntityClassification.CREATURE)
                    .attributes(BlackbuckEntity::registerAttributes)
                    .renderer(() -> BlackbuckRenderer::new)
                    .spawns(8, 3, 4, ZawaSpawnCategory.DRY_GRASSLAND, ZawaSpawnCategory.DRY_SAVANNA)
                    .data(entityBuilder -> entityBuilder.sized(0.8F, 1.2F).clientTrackingRange(10))
                    .build("blackbuck");

    public static final RegistryObject<EntityType<PorcupineEntity>> PORCUPINE =
            REGISTRY.builder(PorcupineEntity::new, EntityClassification.CREATURE)
                    .attributes(PorcupineEntity::registerAttributes)
                    .renderer(() -> PorcupineRenderer::new)
                    .spawns(10, 1, 1, ZawaSpawnCategory.HOT_DESERT, ZawaSpawnCategory.DRY_SAVANNA)
                    .data(entityBuilder -> entityBuilder.sized(0.9F, 0.9F).clientTrackingRange(10))
                    .build("porcupine");

    public static final RegistryObject<EntityType<GiantOtterEntity>> GIANT_OTTER =
            REGISTRY.builder(GiantOtterEntity::new, EntityClassification.CREATURE)
                    .attributes(GiantOtterEntity::registerAttributes)
                    .renderer(() -> GiantOtterRenderer::new)
                    .spawns(8, 2, 2, ZawaSpawnCategory.SLOW_FRESH_WATER)
                    .data(entityBuilder -> entityBuilder.sized(0.8F, 0.5F).clientTrackingRange(10))
                    .build("giant_otter");

    public static final RegistryObject<EntityType<RedRiverHogEntity>> RED_RIVER_HOG =
            REGISTRY.builder(RedRiverHogEntity::new, EntityClassification.CREATURE)
                    .attributes(RedRiverHogEntity::registerAttributes)
                    .renderer(() -> RedRiverHogRenderer::new)
                    .spawns(8, 2, 3, ZawaSpawnCategory.WET_RAINFOREST)
                    .data(entityBuilder -> entityBuilder.sized(0.85F, 0.85F).clientTrackingRange(10))
                    .build("red_river_hog");

    public static final RegistryObject<EntityType<LorisEntity>> LORIS =
            REGISTRY.builder(LorisEntity::new, EntityClassification.CREATURE)
                    .attributes(LorisEntity::registerAttributes)
                    .renderer(() -> LorisRenderer::new)
                    .spawns(2, 1, 1, ZawaSpawnCategory.DRY_RAINFOREST, ZawaSpawnCategory.WET_RAINFOREST)
                    .data(entityBuilder -> entityBuilder.sized(0.6F, 0.55F).clientTrackingRange(10))
                    .build("loris");

    public static final RegistryObject<EntityType<MongooseEntity>> MONGOOSE =
            REGISTRY.builder(MongooseEntity::new, EntityClassification.CREATURE)
                    .attributes(MongooseEntity::registerAttributes)
                    .renderer(() -> MongooseRenderer::new)
                    .spawnVariant(MongooseEntity.VARIANT_SPAWNS, 15, 2, 3)
                    .data(entityBuilder -> entityBuilder.sized(0.55F, 0.4F).clientTrackingRange(10))
                    .build("mongoose");

    public static final RegistryObject<EntityType<BassEntity>> BASS =
            REGISTRY.builder(BassEntity::new, EntityClassification.WATER_AMBIENT)
                    .attributes(BassEntity::registerAttributes)
                    .renderer(() -> BassRenderer::new)
                    .spawns(10, 3, 5, ZawaSpawnCategory.SLOW_FRESH_WATER)
                    .data(tBuilder -> tBuilder.sized(0.4F, 0.4F).clientTrackingRange(4))
                    .build("bass");

    public static final RegistryObject<EntityType<WhiteRhinocerosEntity>> WHITE_RHINOCEROS =
            REGISTRY.builder(WhiteRhinocerosEntity::new, EntityClassification.CREATURE)
                    .attributes(WhiteRhinocerosEntity::registerAttributes)
                    .renderer(() -> WhiteRhinocerosRenderer::new)
                    .spawns(8, 2, 3, ZawaSpawnCategory.DRY_SAVANNA)
                    .data(entityBuilder -> entityBuilder.sized(2.6F, 2.0F).clientTrackingRange(10))
                    .build("white_rhinoceros");

    public static final RegistryObject<EntityType<SeriemaEntity>> SERIEMA =
            REGISTRY.builder(SeriemaEntity::new, EntityClassification.CREATURE)
                    .attributes(SeriemaEntity::registerAttributes)
                    .renderer(() -> SeriemaRenderer::new)
                    .spawns(10, 1, 2, ZawaSpawnCategory.TROPICAL_ALPINE)
                    .data(entityBuilder -> entityBuilder.sized(0.6F, 1.0F).clientTrackingRange(10))
                    .build("seriema");

    public static void registerSpawnPlacements() {
        EntitySpawnPlacementRegistry.register(BUSH_DOG.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        EntitySpawnPlacementRegistry.register(SPECTACLED_BEAR.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        EntitySpawnPlacementRegistry.register(RHEA.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        EntitySpawnPlacementRegistry.register(BLACKBUCK.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        EntitySpawnPlacementRegistry.register(PORCUPINE.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        EntitySpawnPlacementRegistry.register(GIANT_OTTER.get(), EntitySpawnPlacementRegistry.PlacementType.NO_RESTRICTIONS, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkSemiAquaticSpawnRules);
        EntitySpawnPlacementRegistry.register(RED_RIVER_HOG.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        EntitySpawnPlacementRegistry.register(LORIS.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        EntitySpawnPlacementRegistry.register(MONGOOSE.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        EntitySpawnPlacementRegistry.register(BASS.get(), EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaAmbientFishEntity::checkAquaticSpawnRules);
        EntitySpawnPlacementRegistry.register(WHITE_RHINOCEROS.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        EntitySpawnPlacementRegistry.register(SERIEMA.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
    }
}

