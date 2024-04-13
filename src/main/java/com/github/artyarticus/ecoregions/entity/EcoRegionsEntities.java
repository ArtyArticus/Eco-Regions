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
import org.zawamod.zawa.world.entity.animal.ZawaBaseEntity;

public class EcoRegionsEntities {
    public static final ZawaEntityRegistry REGISTRY = new ZawaEntityRegistry(EcoRegions.MOD_ID, Zawa.ENTITIES_GROUP);

    public static final RegistryObject<EntityType<BushDogEntity>> BUSH_DOG =
            REGISTRY.builder(BushDogEntity::new, EntityClassification.CREATURE)
                    .attributes(BushDogEntity::registerAttributes)
                    .renderer(() -> BushDogRenderer::new)
                    .spawns(2, 2, 3, ZawaSpawnCategory.DRY_GRASSLAND, ZawaSpawnCategory.DRY_RAINFOREST, ZawaSpawnCategory.TROPICAL_ALPINE)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.0F).clientTrackingRange(10))
                    .build("bush_dog");
<<<<<<< Updated upstream

=======
<<<<<<< HEAD

    public static final RegistryObject<EntityType<SpectacledBearEntity>> SPECTACLED_BEAR =
            REGISTRY.builder (SpectacledBearEntity::new, EntityClassification.CREATURE)
                    .attributes(SpectacledBearEntity::registerAttributes)
                    .renderer(() -> SpectacledBearRenderer::new)
                    .spawns(2, 2, 3, ZawaSpawnCategory.DRY_GRASSLAND, ZawaSpawnCategory.DRY_RAINFOREST, ZawaSpawnCategory.TROPICAL_ALPINE)
                    .data(entityBuilder -> entityBuilder.sized(0.0F, 0.0F).clientTrackingRange(10))
                    .build("spectacled_bear");

    public static final RegistryObject<EntityType<RheaEntity>> RHEA =
            REGISTRY.builder (RheaEntity::new, EntityClassification.CREATURE)
                    .attributes(RheaEntity::registerAttributes)
                    .renderer(() -> RheaRenderer::new)
                    .spawns(2, 2, 3, ZawaSpawnCategory.DRY_GRASSLAND, ZawaSpawnCategory.DRY_RAINFOREST, ZawaSpawnCategory.TROPICAL_ALPINE)
                    .data(entityBuilder -> entityBuilder.sized(0.0F, 0.0F).clientTrackingRange(10))
                    .build("rhea");

    public static final RegistryObject<EntityType<BlackbuckEntity>> BLACKBUCK =
            REGISTRY.builder (BlackbuckEntity::new, EntityClassification.CREATURE)
                    .attributes(BlackbuckEntity::registerAttributes)
                    .renderer(() -> BlackbuckRenderer::new)
                    .spawns(2, 2, 3, ZawaSpawnCategory.DRY_GRASSLAND, ZawaSpawnCategory.DRY_RAINFOREST, ZawaSpawnCategory.TROPICAL_ALPINE)
                    .data(entityBuilder -> entityBuilder.sized(0.0F, 0.0F).clientTrackingRange(10))
                    .build("blackbuck");

    public static final RegistryObject<EntityType<PorcupineEntity>> PORCUPINE =
            REGISTRY.builder (PorcupineEntity::new, EntityClassification.CREATURE)
                    .attributes(PorcupineEntity::registerAttributes)
                    .renderer(() -> PorcupineRenderer::new)
                    .spawns(2, 2, 3, ZawaSpawnCategory.DRY_GRASSLAND, ZawaSpawnCategory.DRY_RAINFOREST, ZawaSpawnCategory.TROPICAL_ALPINE)
                    .data(entityBuilder -> entityBuilder.sized(0.0F, 0.0F).clientTrackingRange(10))
                    .build("porcupine");

    public static final RegistryObject<EntityType<GiantOtterEntity>> GIANT_OTTER =
            REGISTRY.builder (GiantOtterEntity::new, EntityClassification.CREATURE)
                    .attributes(GiantOtterEntity::registerAttributes)
                    .renderer(() -> GiantOtterRenderer::new)
                    .spawns(2, 2, 3, ZawaSpawnCategory.DRY_GRASSLAND, ZawaSpawnCategory.DRY_RAINFOREST, ZawaSpawnCategory.TROPICAL_ALPINE)
                    .data(entityBuilder -> entityBuilder.sized(0.0F, 0.0F).clientTrackingRange(10))
                    .build("giant_otter");

    public static final RegistryObject<EntityType<RedRiverHogEntity>> RED_RIVER_HOG =
            REGISTRY.builder (RedRiverHogEntity::new, EntityClassification.CREATURE)
                    .attributes(RedRiverHogEntity::registerAttributes)
                    .renderer(() -> RedRiverHogRenderer::new)
                    .spawns(2, 2, 3, ZawaSpawnCategory.DRY_GRASSLAND, ZawaSpawnCategory.DRY_RAINFOREST, ZawaSpawnCategory.TROPICAL_ALPINE)
                    .data(entityBuilder -> entityBuilder.sized(0.0F, 0.0F).clientTrackingRange(10))
                    .build("red_river_hog");
    public static void registerSpawnPlacements() {
=======
>>>>>>> e72678ad9e555d469b3f26c4fc0e51a934badef5

>>>>>>> Stashed changes
    public static void registerSpawnPlacements() {
        EntitySpawnPlacementRegistry.register(BUSH_DOG.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        EntitySpawnPlacementRegistry.register(SPECTACLED_BEAR.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        EntitySpawnPlacementRegistry.register(RHEA.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        EntitySpawnPlacementRegistry.register(BLACKBUCK.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        EntitySpawnPlacementRegistry.register(PORCUPINE.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        EntitySpawnPlacementRegistry.register(GIANT_OTTER.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        EntitySpawnPlacementRegistry.register(RED_RIVER_HOG.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
    }
}

