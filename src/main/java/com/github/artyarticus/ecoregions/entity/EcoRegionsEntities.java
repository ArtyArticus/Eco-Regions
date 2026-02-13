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
import org.zawamod.zawa.world.entity.animal.ZawaFlyingEntity;
import org.zawamod.zawa.world.entity.animal.ZawaSemiAquaticEntity;

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

    public static final RegistryObject<EntityType<BaboonEntity>> BABOON =
            REGISTRY.builder(BaboonEntity::new, EntityClassification.CREATURE)
                    .attributes(BaboonEntity::registerAttributes)
                    .renderer(() -> BaboonRenderer::new)
                    .spawns(10, 3, 5, ZawaSpawnCategory.DRY_SAVANNA)
                    .data(entityBuilder -> entityBuilder.sized(1.2F, 0.95F).clientTrackingRange(10))
                    .build("baboon");

    public static final RegistryObject<EntityType<GibbonEntity>> GIBBON =
            REGISTRY.builder(GibbonEntity::new, EntityClassification.CREATURE)
                    .attributes(GibbonEntity::registerAttributes)
                    .renderer(() -> GibbonRenderer::new)
                    .spawns(8, 1, 2, ZawaSpawnCategory.WET_RAINFOREST)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.25F).clientTrackingRange(10))
                    .build("gibbon");

    public static final RegistryObject<EntityType<GazelleEntity>> GAZELLE =
            REGISTRY.builder(GazelleEntity::new, EntityClassification.CREATURE)
                    .attributes(GazelleEntity::registerAttributes)
                    .renderer(() -> GazelleRenderer::new)
                    .spawns(10, 3, 4, ZawaSpawnCategory.DRY_SAVANNA)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.5F).clientTrackingRange(10))
                    .build("gazelle");

    public static final RegistryObject<EntityType<SkinkEntity>> SKINK =
            REGISTRY.builder(SkinkEntity::new, EntityClassification.CREATURE)
                    .attributes(SkinkEntity::registerAttributes)
                    .renderer(() -> SkinkRenderer::new)
                    .spawns(10, 1, 1, ZawaSpawnCategory.HOT_DESERT)
                    .data(entityBuilder -> entityBuilder.sized(0.75F, 0.23F).clientTrackingRange(10))
                    .build("skink");

    public static final RegistryObject<EntityType<TeguEntity>> TEGU =
            REGISTRY.builder(TeguEntity::new, EntityClassification.CREATURE)
                    .attributes(TeguEntity::registerAttributes)
                    .renderer(() -> TeguRenderer::new)
                    .spawns(2, 1, 1, ZawaSpawnCategory.DRY_RAINFOREST)
                    .data(entityBuilder -> entityBuilder.sized(0.8F, 0.45F).clientTrackingRange(10))
                    .build("tegu");

    public static final RegistryObject<EntityType<FoxfaceEntity>> FOXFACE =
            REGISTRY.builder(FoxfaceEntity::new, EntityClassification.WATER_AMBIENT)
                    .attributes(FoxfaceEntity::registerAttributes)
                    .renderer(() -> FoxfaceRenderer::new)
                    .spawns(8, 5, 6, ZawaSpawnCategory.FAST_FRESH_WATER)
                    .data(entityBuilder -> entityBuilder.sized(0.35F, 0.35F).clientTrackingRange(10))
                    .build("foxface");
    public static final RegistryObject<EntityType<BeeEaterEntity>> BEE_EATER =
            REGISTRY.builder(BeeEaterEntity::new, EntityClassification.CREATURE)
                    .attributes(BeeEaterEntity::registerAttributes)
                    .renderer(() -> BeeEaterRenderer::new)
                    .spawns(8, 1, 2, ZawaSpawnCategory.DRY_FOREST)
                    .data(entityBuilder -> entityBuilder.sized(0.55F, 0.55F).clientTrackingRange(10))
                    .build("bee_eater");

    public static final RegistryObject<EntityType<ScreamerEntity>> SCREAMER =
            REGISTRY.builder(ScreamerEntity::new, EntityClassification.CREATURE)
                    .attributes(ScreamerEntity::registerAttributes)
                    .renderer(() -> ScreamerRenderer::new)
                    .spawns(15, 1, 3, ZawaSpawnCategory.WET_RAINFOREST)
                    .data(entityBuilder -> entityBuilder.sized(0.65F, 0.7F).clientTrackingRange(10))
                    .build("screamer");

    public static final RegistryObject<EntityType<TreeKangarooEntity>> TREE_KANGAROO =
            REGISTRY.builder(TreeKangarooEntity::new, EntityClassification.CREATURE)
                    .attributes(TreeKangarooEntity::registerAttributes)
                    .renderer(() -> TreeKangarooRenderer::new)
                    .spawns(2, 1, 2, ZawaSpawnCategory.TEMPERATE_FOREST,ZawaSpawnCategory.DEEP_RAINFOREST)
                    .data(entityBuilder -> entityBuilder.sized(0.75F, 0.75F).clientTrackingRange(10))
                    .build("tree_kangaroo");

    public static final RegistryObject<EntityType<MuntjacEntity>> MUNTJAC =
            REGISTRY.builder(MuntjacEntity::new, EntityClassification.CREATURE)
                    .attributes(MuntjacEntity::registerAttributes)
                    .renderer(() -> MuntjacRenderer::new)
                    .spawns(10, 1, 3, ZawaSpawnCategory.COASTAL_TAIGA)
                    .data(entityBuilder -> entityBuilder.sized(0.85F, 0.85F).clientTrackingRange(10))
                    .build("muntjac");

    public static final RegistryObject<EntityType<KuduEntity>> KUDU =
            REGISTRY.builder(KuduEntity::new, EntityClassification.CREATURE)
                    .attributes(KuduEntity::registerAttributes)
                    .renderer(() -> KuduRenderer::new)
                    .spawns(8, 3, 4, ZawaSpawnCategory.WET_SAVANNA)
                    .data(entityBuilder -> entityBuilder.sized(1.65F, 1.65F).clientTrackingRange(10))
                    .build("kudu");
    public static final RegistryObject<EntityType<AoudadEntity>> AOUDAD =
            REGISTRY.builder(AoudadEntity::new, EntityClassification.CREATURE)
                    .attributes(AoudadEntity::registerAttributes)
                    .renderer(() -> AoudadRenderer::new)
                    .spawns(8, 2, 4, ZawaSpawnCategory.DRY_ALPINE)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.0F).clientTrackingRange(10))
                    .build("aoudad");
    
    public static final RegistryObject<EntityType<WombatEntity>> WOMBAT =
            REGISTRY.builder(WombatEntity::new, EntityClassification.CREATURE)
                    .attributes(WombatEntity::registerAttributes)
                    .renderer(() -> WombatRenderer::new)
                    .spawns(10, 1, 1, ZawaSpawnCategory.TEMPERATE_FOREST)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.0F).clientTrackingRange(10))
                    .build("wombat");
    
    public static final RegistryObject<EntityType<AracariEntity>> ARACARI =
            REGISTRY.builder(AracariEntity::new, EntityClassification.CREATURE)
                    .attributes(AracariEntity::registerAttributes)
                    .renderer(() -> AracariRenderer::new)
                    .spawns(10, 2, 5, ZawaSpawnCategory.DEEP_RAINFOREST)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.0F).clientTrackingRange(10))
                    .build("aracari");
    
    public static final RegistryObject<EntityType<MarmosetEntity>> MARMOSET =
            REGISTRY.builder(MarmosetEntity::new, EntityClassification.CREATURE)
                    .attributes(MarmosetEntity::registerAttributes)
                    .renderer(() -> MarmosetRenderer::new)
                    .spawns(15, 3, 5, ZawaSpawnCategory.DEEP_RAINFOREST)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.0F).clientTrackingRange(10))
                    .build("marmoset");
    
    public static final RegistryObject<EntityType<TamanduaEntity>> TAMANDUA =
            REGISTRY.builder(TamanduaEntity::new, EntityClassification.CREATURE)
                    .attributes(TamanduaEntity::registerAttributes)
                    .renderer(() -> TamanduaRenderer::new)
                    .spawns(2, 1, 1, ZawaSpawnCategory.DRY_RAINFOREST)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.0F).clientTrackingRange(10))
                    .build("tamandua");
    
    public static final RegistryObject<EntityType<MonitorEntity>> MONITOR =
            REGISTRY.builder(MonitorEntity::new, EntityClassification.CREATURE)
                    .attributes(MonitorEntity::registerAttributes)
                    .renderer(() -> MonitorRenderer::new)
                    .spawns(8, 1, 1, ZawaSpawnCategory.WET_RAINFOREST)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.0F).clientTrackingRange(10))
                    .build("monitor");

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
        EntitySpawnPlacementRegistry.register(FOXFACE.get(), EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaAmbientFishEntity::checkAquaticSpawnRules);
        EntitySpawnPlacementRegistry.register(GAZELLE.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        EntitySpawnPlacementRegistry.register(TEGU.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        EntitySpawnPlacementRegistry.register(SKINK.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        EntitySpawnPlacementRegistry.register(GIBBON.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        EntitySpawnPlacementRegistry.register(BABOON.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        EntitySpawnPlacementRegistry.register(BEE_EATER.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING, ZawaFlyingEntity::checkFlyingSpawnRules);
        EntitySpawnPlacementRegistry.register(SCREAMER.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        EntitySpawnPlacementRegistry.register(TREE_KANGAROO.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        EntitySpawnPlacementRegistry.register(MUNTJAC.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        EntitySpawnPlacementRegistry.register(KUDU.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        EntitySpawnPlacementRegistry.register(MARMOSET.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        EntitySpawnPlacementRegistry.register(WOMBAT.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        EntitySpawnPlacementRegistry.register(MONITOR.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaSemiAquaticEntity::checkLandSpawnRules);
        EntitySpawnPlacementRegistry.register(ARACARI.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaFlyingEntity::checkLandSpawnRules);
        EntitySpawnPlacementRegistry.register(AOUDAD.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        EntitySpawnPlacementRegistry.register(TAMANDUA.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);

    }
}

