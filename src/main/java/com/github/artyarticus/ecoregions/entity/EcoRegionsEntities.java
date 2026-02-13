package com.github.artyarticus.ecoregions.entity;

import com.github.artyarticus.ecoregions.EcoRegions;
import com.github.artyarticus.ecoregions.client.render.entity.*;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.registries.RegistryObject;
import org.zawamod.zawa.config.ZawaSpawnCategory;
import org.zawamod.zawa.world.entity.ZawaEntityRegistry;
import org.zawamod.zawa.world.entity.ambient.ZawaAmbientFishEntity;
import org.zawamod.zawa.world.entity.animal.ZawaBaseEntity;
import org.zawamod.zawa.world.entity.animal.ZawaFlyingEntity;
import org.zawamod.zawa.world.entity.animal.ZawaSemiAquaticEntity;

public class EcoRegionsEntities {
    public static final ZawaEntityRegistry REGISTRY = new ZawaEntityRegistry(EcoRegions.MOD_ID);

    public static final RegistryObject<EntityType<BushDogEntity>> BUSH_DOG =
            REGISTRY.builder(BushDogEntity::new, MobCategory.CREATURE)
                    .attributes(BushDogEntity::registerAttributes)
                    .spawns(2, 2, 3, ZawaSpawnCategory.WET_RAINFOREST)
                    .data(entityBuilder -> entityBuilder.sized(0.4F, 0.4F).clientTrackingRange(10))
                    .build("bush_dog");

    public static final RegistryObject<EntityType<SpectacledBearEntity>> SPECTACLED_BEAR =
            REGISTRY.builder(SpectacledBearEntity::new, MobCategory.CREATURE)
                    .attributes(SpectacledBearEntity::registerAttributes)
                    .spawns(8, 1, 1, ZawaSpawnCategory.WET_RAINFOREST, ZawaSpawnCategory.TROPICAL_ALPINE)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.0F).clientTrackingRange(10))
                    .build("spectacled_bear");

    public static final RegistryObject<EntityType<RheaEntity>> RHEA =
            REGISTRY.builder(RheaEntity::new, MobCategory.CREATURE)
                    .attributes(RheaEntity::registerAttributes)
                    .spawns(10, 1, 4, ZawaSpawnCategory.DRY_GRASSLAND)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.5F).clientTrackingRange(10))
                    .build("rhea");

    public static final RegistryObject<EntityType<BlackbuckEntity>> BLACKBUCK =
            REGISTRY.builder(BlackbuckEntity::new, MobCategory.CREATURE)
                    .attributes(BlackbuckEntity::registerAttributes)
                    .spawns(8, 3, 4, ZawaSpawnCategory.DRY_GRASSLAND, ZawaSpawnCategory.DRY_SAVANNA)
                    .data(entityBuilder -> entityBuilder.sized(0.8F, 1.2F).clientTrackingRange(10))
                    .build("blackbuck");

    public static final RegistryObject<EntityType<PorcupineEntity>> PORCUPINE =
            REGISTRY.builder(PorcupineEntity::new, MobCategory.CREATURE)
                    .attributes(PorcupineEntity::registerAttributes)
                    .spawns(10, 1, 1, ZawaSpawnCategory.HOT_DESERT, ZawaSpawnCategory.DRY_SAVANNA)
                    .data(entityBuilder -> entityBuilder.sized(0.9F, 0.9F).clientTrackingRange(10))
                    .build("porcupine");

    public static final RegistryObject<EntityType<GiantOtterEntity>> GIANT_OTTER =
            REGISTRY.builder(GiantOtterEntity::new, MobCategory.CREATURE)
                    .attributes(GiantOtterEntity::registerAttributes)
                    .spawns(8, 2, 2, ZawaSpawnCategory.SLOW_FRESH_WATER)
                    .data(entityBuilder -> entityBuilder.sized(0.8F, 0.5F).clientTrackingRange(10))
                    .build("giant_otter");

    public static final RegistryObject<EntityType<RedRiverHogEntity>> RED_RIVER_HOG =
            REGISTRY.builder(RedRiverHogEntity::new, MobCategory.CREATURE)
                    .attributes(RedRiverHogEntity::registerAttributes)
                    .spawns(8, 2, 3, ZawaSpawnCategory.WET_RAINFOREST)
                    .data(entityBuilder -> entityBuilder.sized(0.85F, 0.85F).clientTrackingRange(10))
                    .build("red_river_hog");

    public static final RegistryObject<EntityType<LorisEntity>> LORIS =
            REGISTRY.builder(LorisEntity::new, MobCategory.CREATURE)
                    .attributes(LorisEntity::registerAttributes)
                    .spawns(2, 1, 1, ZawaSpawnCategory.DRY_RAINFOREST, ZawaSpawnCategory.WET_RAINFOREST)
                    .data(entityBuilder -> entityBuilder.sized(0.6F, 0.55F).clientTrackingRange(10))
                    .build("loris");

    public static final RegistryObject<EntityType<MongooseEntity>> MONGOOSE =
            REGISTRY.builder(MongooseEntity::new, MobCategory.CREATURE)
                    .attributes(MongooseEntity::registerAttributes)
                    .spawnVariant(MongooseEntity.VARIANT_SPAWNS, 15, 2, 3)
                    .data(entityBuilder -> entityBuilder.sized(0.55F, 0.4F).clientTrackingRange(10))
                    .build("mongoose");

    public static final RegistryObject<EntityType<BassEntity>> BASS =
            REGISTRY.builder(BassEntity::new, MobCategory.WATER_AMBIENT)
                    .attributes(BassEntity::registerAttributes)
                    .spawns(10, 3, 5, ZawaSpawnCategory.SLOW_FRESH_WATER)
                    .data(tBuilder -> tBuilder.sized(0.4F, 0.4F).clientTrackingRange(4))
                    .build("bass");

    public static final RegistryObject<EntityType<WhiteRhinocerosEntity>> WHITE_RHINOCEROS =
            REGISTRY.builder(WhiteRhinocerosEntity::new, MobCategory.CREATURE)
                    .attributes(WhiteRhinocerosEntity::registerAttributes)
                    .spawns(8, 2, 3, ZawaSpawnCategory.DRY_SAVANNA)
                    .data(entityBuilder -> entityBuilder.sized(2.6F, 2.0F).clientTrackingRange(10))
                    .build("white_rhinoceros");

    public static final RegistryObject<EntityType<SeriemaEntity>> SERIEMA =
            REGISTRY.builder(SeriemaEntity::new, MobCategory.CREATURE)
                    .attributes(SeriemaEntity::registerAttributes)
                    .spawns(10, 1, 2, ZawaSpawnCategory.TROPICAL_ALPINE)
                    .data(entityBuilder -> entityBuilder.sized(0.6F, 1.0F).clientTrackingRange(10))
                    .build("seriema");

    public static final RegistryObject<EntityType<BaboonEntity>> BABOON =
            REGISTRY.builder(BaboonEntity::new, MobCategory.CREATURE)
                    .attributes(BaboonEntity::registerAttributes)
                    .spawns(10, 3, 5, ZawaSpawnCategory.DRY_SAVANNA)
                    .data(entityBuilder -> entityBuilder.sized(1.2F, 0.95F).clientTrackingRange(10))
                    .build("baboon");

    public static final RegistryObject<EntityType<GibbonEntity>> GIBBON =
            REGISTRY.builder(GibbonEntity::new, MobCategory.CREATURE)
                    .attributes(GibbonEntity::registerAttributes)
                    .spawns(8, 1, 2, ZawaSpawnCategory.WET_RAINFOREST)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.25F).clientTrackingRange(10))
                    .build("gibbon");

    public static final RegistryObject<EntityType<GazelleEntity>> GAZELLE =
            REGISTRY.builder(GazelleEntity::new, MobCategory.CREATURE)
                    .attributes(GazelleEntity::registerAttributes)
                    .spawns(10, 3, 4, ZawaSpawnCategory.DRY_SAVANNA)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.5F).clientTrackingRange(10))
                    .build("gazelle");

    public static final RegistryObject<EntityType<SkinkEntity>> SKINK =
            REGISTRY.builder(SkinkEntity::new, MobCategory.CREATURE)
                    .attributes(SkinkEntity::registerAttributes)
                    .spawns(10, 1, 1, ZawaSpawnCategory.HOT_DESERT)
                    .data(entityBuilder -> entityBuilder.sized(0.75F, 0.23F).clientTrackingRange(10))
                    .build("skink");

    public static final RegistryObject<EntityType<TeguEntity>> TEGU =
            REGISTRY.builder(TeguEntity::new, MobCategory.CREATURE)
                    .attributes(TeguEntity::registerAttributes)
                    .spawns(2, 1, 1, ZawaSpawnCategory.DRY_RAINFOREST)
                    .data(entityBuilder -> entityBuilder.sized(0.8F, 0.45F).clientTrackingRange(10))
                    .build("tegu");

    public static final RegistryObject<EntityType<FoxfaceEntity>> FOXFACE =
            REGISTRY.builder(FoxfaceEntity::new, MobCategory.WATER_AMBIENT)
                    .attributes(FoxfaceEntity::registerAttributes)
                    .spawns(8, 5, 6, ZawaSpawnCategory.FAST_FRESH_WATER)
                    .data(entityBuilder -> entityBuilder.sized(0.35F, 0.35F).clientTrackingRange(10))
                    .build("foxface");

    public static final RegistryObject<EntityType<BeeEaterEntity>> BEE_EATER =
            REGISTRY.builder(BeeEaterEntity::new, MobCategory.CREATURE)
                    .attributes(BeeEaterEntity::registerAttributes)
                    .spawns(8, 1, 2, ZawaSpawnCategory.DRY_FOREST)
                    .data(entityBuilder -> entityBuilder.sized(0.55F, 0.55F).clientTrackingRange(10))
                    .build("bee_eater");

    public static final RegistryObject<EntityType<ScreamerEntity>> SCREAMER =
            REGISTRY.builder(ScreamerEntity::new, MobCategory.CREATURE)
                    .attributes(ScreamerEntity::registerAttributes)
                    .spawns(15, 1, 3, ZawaSpawnCategory.WET_RAINFOREST)
                    .data(entityBuilder -> entityBuilder.sized(0.65F, 0.7F).clientTrackingRange(10))
                    .build("screamer");

    public static final RegistryObject<EntityType<TreeKangarooEntity>> TREE_KANGAROO =
            REGISTRY.builder(TreeKangarooEntity::new, MobCategory.CREATURE)
                    .attributes(TreeKangarooEntity::registerAttributes)
                    .spawns(2, 1, 2, ZawaSpawnCategory.TEMPERATE_FOREST, ZawaSpawnCategory.DEEP_RAINFOREST)
                    .data(entityBuilder -> entityBuilder.sized(0.75F, 0.75F).clientTrackingRange(10))
                    .build("tree_kangaroo");

    public static final RegistryObject<EntityType<MuntjacEntity>> MUNTJAC =
            REGISTRY.builder(MuntjacEntity::new, MobCategory.CREATURE)
                    .attributes(MuntjacEntity::registerAttributes)
                    .spawns(10, 1, 3, ZawaSpawnCategory.COASTAL_TAIGA)
                    .data(entityBuilder -> entityBuilder.sized(0.85F, 0.85F).clientTrackingRange(10))
                    .build("muntjac");

    public static final RegistryObject<EntityType<KuduEntity>> KUDU =
            REGISTRY.builder(KuduEntity::new, MobCategory.CREATURE)
                    .attributes(KuduEntity::registerAttributes)
                    .spawns(8, 3, 4, ZawaSpawnCategory.WET_SAVANNA)
                    .data(entityBuilder -> entityBuilder.sized(1.65F, 1.65F).clientTrackingRange(10))
                    .build("kudu");
    public static final RegistryObject<EntityType<AoudadEntity>> AOUDAD =
            REGISTRY.builder(AoudadEntity::new, MobCategory.CREATURE)
                    .attributes(AoudadEntity::registerAttributes)
                    .spawns(8, 1, 1, ZawaSpawnCategory.WET_RAINFOREST, ZawaSpawnCategory.TROPICAL_ALPINE)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.0F).clientTrackingRange(10))
                    .build("aoudad");
    
    public static final RegistryObject<EntityType<CommonWombatEntity>> COMMON_WOMBAT =
            REGISTRY.builder(CommonWombatEntity::new, MobCategory.CREATURE)
                    .attributes(CommonWombatEntity::registerAttributes)
                    .spawns(8, 1, 1, ZawaSpawnCategory.WET_RAINFOREST, ZawaSpawnCategory.TROPICAL_ALPINE)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.0F).clientTrackingRange(10))
                    .build("common_wombat");
    
    public static final RegistryObject<EntityType<AracariEntity>> ARACARI =
            REGISTRY.builder(AracariEntity::new, MobCategory.CREATURE)
                    .attributes(AracariEntity::registerAttributes)
                    .spawns(8, 1, 1, ZawaSpawnCategory.WET_RAINFOREST, ZawaSpawnCategory.TROPICAL_ALPINE)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.0F).clientTrackingRange(10))
                    .build("aracari");
    
    public static final RegistryObject<EntityType<MarmosetEntity>> MARMOSET =
            REGISTRY.builder(MarmosetEntity::new, MobCategory.CREATURE)
                    .attributes(MarmosetEntity::registerAttributes)
                    .spawns(8, 1, 1, ZawaSpawnCategory.WET_RAINFOREST, ZawaSpawnCategory.TROPICAL_ALPINE)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.0F).clientTrackingRange(10))
                    .build("marmoset");
    
    public static final RegistryObject<EntityType<SouthernTamanduaEntity>> SOUTHERN_TAMANDUA =
            REGISTRY.builder(SouthernTamanduaEntity::new, MobCategory.CREATURE)
                    .attributes(SouthernTamanduaEntity::registerAttributes)
                    .spawns(8, 1, 1, ZawaSpawnCategory.WET_RAINFOREST, ZawaSpawnCategory.TROPICAL_ALPINE)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.0F).clientTrackingRange(10))
                    .build("southern_tamandua");
    
    public static final RegistryObject<EntityType<MonitorEntity>> MONITOR =
            REGISTRY.builder(MonitorEntity::new, MobCategory.CREATURE)
                    .attributes(MonitorEntity::registerAttributes)
                    .spawns(8, 1, 1, ZawaSpawnCategory.WET_RAINFOREST, ZawaSpawnCategory.TROPICAL_ALPINE)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.0F).clientTrackingRange(10))
                    .build("monitor");

    public static void registerSpawnPlacements() {
        SpawnPlacements.register(BUSH_DOG.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        SpawnPlacements.register(SPECTACLED_BEAR.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        SpawnPlacements.register(RHEA.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        SpawnPlacements.register(BLACKBUCK.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        SpawnPlacements.register(PORCUPINE.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        SpawnPlacements.register(GIANT_OTTER.get(), SpawnPlacements.Type.NO_RESTRICTIONS, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkSemiAquaticSpawnRules);
        SpawnPlacements.register(RED_RIVER_HOG.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        SpawnPlacements.register(LORIS.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        SpawnPlacements.register(MONGOOSE.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        SpawnPlacements.register(BASS.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaAmbientFishEntity::checkAquaticSpawnRules);
        SpawnPlacements.register(WHITE_RHINOCEROS.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        SpawnPlacements.register(SERIEMA.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        SpawnPlacements.register(FOXFACE.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaAmbientFishEntity::checkAquaticSpawnRules);
        SpawnPlacements.register(GAZELLE.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        SpawnPlacements.register(TEGU.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        SpawnPlacements.register(SKINK.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        SpawnPlacements.register(GIBBON.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        SpawnPlacements.register(BABOON.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        SpawnPlacements.register(BEE_EATER.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING, ZawaFlyingEntity::checkFlyingSpawnRules);
        SpawnPlacements.register(SCREAMER.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        SpawnPlacements.register(TREE_KANGAROO.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        SpawnPlacements.register(MUNTJAC.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        SpawnPlacements.register(KUDU.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        SpawnPlacements.register(MARMOSET.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        SpawnPlacements.register(COMMON_WOMBAT.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        SpawnPlacements.register(MONITOR.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaSemiAquaticEntity::checkLandSpawnRules);
        SpawnPlacements.register(ARACARI.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaFlyingEntity::checkLandSpawnRules);
        SpawnPlacements.register(AOUDAD.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        SpawnPlacements.register(SOUTHERN_TAMANDUA.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
    }

    public static void registerRenderers() {
        EntityRenderers.register(BUSH_DOG.get(), BushDogRenderer::new);
        EntityRenderers.register(SPECTACLED_BEAR.get(), SpectacledBearRenderer::new);
        EntityRenderers.register(RHEA.get(), RheaRenderer::new);
        EntityRenderers.register(BLACKBUCK.get(), BlackbuckRenderer::new);
        EntityRenderers.register(PORCUPINE.get(), PorcupineRenderer::new);
        EntityRenderers.register(GIANT_OTTER.get(), GiantOtterRenderer::new);
        EntityRenderers.register(RED_RIVER_HOG.get(), RedRiverHogRenderer::new);
        EntityRenderers.register(LORIS.get(), LorisRenderer::new);
        EntityRenderers.register(MONGOOSE.get(), MongooseRenderer::new);
        EntityRenderers.register(BASS.get(), BassRenderer::new);
        EntityRenderers.register(WHITE_RHINOCEROS.get(), WhiteRhinocerosRenderer::new);
        EntityRenderers.register(SERIEMA.get(), SeriemaRenderer::new);
        EntityRenderers.register(BABOON.get(), BaboonRenderer::new);
        EntityRenderers.register(GIBBON.get(), GibbonRenderer::new);
        EntityRenderers.register(GAZELLE.get(), GazelleRenderer::new);
        EntityRenderers.register(SKINK.get(), SkinkRenderer::new);
        EntityRenderers.register(TEGU.get(), TeguRenderer::new);
        EntityRenderers.register(FOXFACE.get(), FoxfaceRenderer::new);
        EntityRenderers.register(BEE_EATER.get(), BeeEaterRenderer::new);
        EntityRenderers.register(SCREAMER.get(), ScreamerRenderer::new);
        EntityRenderers.register(TREE_KANGAROO.get(), TreeKangarooRenderer::new);
        EntityRenderers.register(MUNTJAC.get(), MuntjacRenderer::new);
        EntityRenderers.register(KUDU.get(), KuduRenderer::new);
        EntityRenderers.register(AOUDAD.get(), AoudadRenderer::new);
        EntityRenderers.register(COMMON_WOMBAT.get(), CommonWombatRenderer::new);
        EntityRenderers.register(ARACARI.get(), AracariRenderer::new);
        EntityRenderers.register(MARMOSET.get(), MarmosetRenderer::new);
        EntityRenderers.register(SOUTHERN_TAMANDUA.get(), SouthernTamanduaRenderer::new);
        EntityRenderers.register(MONITOR.get(), MonitorRenderer::new);
    }
}