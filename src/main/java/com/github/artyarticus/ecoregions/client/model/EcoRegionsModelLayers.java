package com.github.artyarticus.ecoregions.client.model;

import com.github.artyarticus.ecoregions.EcoRegions;
import com.google.common.collect.Sets;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Tuple;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

@OnlyIn(Dist.CLIENT)
public class EcoRegionsModelLayers {
    public static final Set<ModelLayerLocation> ALL_MODELS = Sets.newHashSet();
    public static final List<Tuple<ModelLayerLocation, Supplier<LayerDefinition>>> MODEL_LAYERS_LIST = new ArrayList<>();
    public static final ModelLayerLocation BUSH_DOG_ADULT = register("bush_dog", "adult", BushDogModel.Adult::createBodyLayer);
    public static final ModelLayerLocation BUSH_DOG_CHILD = register("bush_dog", "child", BushDogModel.Child::createBodyLayer);
    public static final ModelLayerLocation SPECTACLED_BEAR_ADULT = register("spectacled_bear", "adult", SpectacledBearModel.Adult::createBodyLayer);
    public static final ModelLayerLocation SPECTACLED_BEAR_CHILD = register("spectacled_bear", "child", SpectacledBearModel.Child::createBodyLayer);
    public static final ModelLayerLocation RHEA_ADULT = register("rhea", "adult", RheaModel.Adult::createBodyLayer);
    public static final ModelLayerLocation RHEA_CHILD = register("rhea", "child", RheaModel.Child::createBodyLayer);
    public static final ModelLayerLocation BLACKBUCK_ADULT = register("blackbuck", "adult", BlackbuckModel.Adult::createBodyLayer);
    public static final ModelLayerLocation BLACKBUCK_CHILD = register("blackbuck", "child", BlackbuckModel.Child::createBodyLayer);
    public static final ModelLayerLocation PORCUPINE_ADULT = register("porcupine", "adult", PorcupineModel.Adult::createBodyLayer);
    public static final ModelLayerLocation PORCUPINE_CHILD = register("porcupine", "child", PorcupineModel.Child::createBodyLayer);
    public static final ModelLayerLocation GIANT_OTTER_ADULT = register("giant_otter", "adult", GiantOtterModel.Adult::createBodyLayer);
    public static final ModelLayerLocation GIANT_OTTER_CHILD = register("giant_otter", "child", GiantOtterModel.Child::createBodyLayer);
    public static final ModelLayerLocation RED_RIVER_HOG_ADULT = register("red_river_hog", "adult", RedRiverHogModel.Adult::createBodyLayer);
    public static final ModelLayerLocation RED_RIVER_HOG_CHILD = register("red_river_hog", "child", RedRiverHogModel.Child::createBodyLayer);
    public static final ModelLayerLocation LORIS_ADULT = register("loris", "adult", LorisModel.Adult::createBodyLayer);
    public static final ModelLayerLocation LORIS_CHILD = register("loris", "child", LorisModel.Child::createBodyLayer);
    public static final ModelLayerLocation MONGOOSE_ADULT = register("mongoose", "adult", MongooseModel.Adult::createBodyLayer);
    public static final ModelLayerLocation MONGOOSE_CHILD = register("mongoose", "child", MongooseModel.Child::createBodyLayer);
    public static final ModelLayerLocation WHITE_RHINOCEROS_ADULT = register("white_rhinoceros", "adult", WhiteRhinocerosModel.Adult::createBodyLayer);
    public static final ModelLayerLocation WHITE_RHINOCEROS_CHILD = register("white_rhinoceros", "child", WhiteRhinocerosModel.Child::createBodyLayer);
    public static final ModelLayerLocation SERIEMA_ADULT = register("seriema", "adult", SeriemaModel.Adult::createBodyLayer);
    public static final ModelLayerLocation SERIEMA_CHILD = register("seriema", "child", SeriemaModel.Child::createBodyLayer);
    public static final ModelLayerLocation BABOON_ADULT = register("baboon", "adult", BaboonModel.Adult::createBodyLayer);
    public static final ModelLayerLocation BABOON_CHILD = register("baboon", "child", BaboonModel.Child::createBodyLayer);
    public static final ModelLayerLocation GIBBON_ADULT = register("gibbon", "adult", GibbonModel.Adult::createBodyLayer);
    public static final ModelLayerLocation GIBBON_CHILD = register("gibbon", "child", GibbonModel.Child::createBodyLayer);
    public static final ModelLayerLocation GAZELLE_ADULT = register("gazelle", "adult", GazelleModel.Adult::createBodyLayer);
    public static final ModelLayerLocation GAZELLE_CHILD = register("gazelle", "child", GazelleModel.Child::createBodyLayer);
    public static final ModelLayerLocation SKINK_ADULT = register("skink", "adult", SkinkModel.Adult::createBodyLayer);
    public static final ModelLayerLocation SKINK_CHILD = register("skink", "child", SkinkModel.Child::createBodyLayer);
    public static final ModelLayerLocation TEGU_ADULT = register("tegu", "adult", TeguModel.Adult::createBodyLayer);
    public static final ModelLayerLocation TEGU_CHILD = register("tegu", "child", TeguModel.Child::createBodyLayer);
    public static final ModelLayerLocation BEE_EATER_ADULT = register("bee_eater", "adult", BeeEaterModel.Adult::createBodyLayer);
    public static final ModelLayerLocation BEE_EATER_FLYING = register("bee_eater", "flying", BeeEaterModel.Flying::createBodyLayer);
    public static final ModelLayerLocation BEE_EATER_CHILD = register("bee_eater", "child", BeeEaterModel.Child::createBodyLayer);
    public static final ModelLayerLocation SCREAMER_ADULT = register("screamer", "adult", ScreamerModel.Adult::createBodyLayer);
    public static final ModelLayerLocation SCREAMER_CHILD = register("screamer", "child", ScreamerModel.Child::createBodyLayer);
    public static final ModelLayerLocation TREE_KANGAROO_ADULT = register("tree_kangaroo", "adult", TreeKangarooModel.Adult::createBodyLayer);
    public static final ModelLayerLocation TREE_KANGAROO_CHILD = register("tree_kangaroo", "child", TreeKangarooModel.Child::createBodyLayer);
    public static final ModelLayerLocation MUNTJAC_ADULT = register("muntjac", "adult", MuntjacModel.Adult::createBodyLayer);
    public static final ModelLayerLocation MUNTJAC_CHILD = register("muntjac", "child", MuntjacModel.Child::createBodyLayer);
    public static final ModelLayerLocation KUDU_ADULT_MALE = register("kudu", "adult/male", KuduModel.AdultMale::createBodyLayer);
    public static final ModelLayerLocation KUDU_ADULT_FEMALE = register("kudu", "adult/female", KuduModel.AdultFemale::createBodyLayer);
    public static final ModelLayerLocation KUDU_CHILD = register("kudu", "child", KuduModel.Child::createBodyLayer);
    public static final ModelLayerLocation AOUDAD_ADULT = register("aoudad", "adult", AoudadModel.Adult::createBodyLayer);
    public static final ModelLayerLocation AOUDAD_CHILD = register("aoudad", "child", AoudadModel.Child::createBodyLayer);
    public static final ModelLayerLocation WOMBAT_ADULT = register("wombat", "adult", WombatModel.Adult::createBodyLayer);
    public static final ModelLayerLocation WOMBAT_CHILD = register("wombat", "child", WombatModel.Child::createBodyLayer);
    public static final ModelLayerLocation ARACARI_ADULT = register("aracari", "adult", AracariModel.Adult::createBodyLayer);
    public static final ModelLayerLocation ARACARI_FLYING = register("aracari", "flying", AracariModel.Flying::createBodyLayer);
    public static final ModelLayerLocation ARACARI_CHILD = register("aracari", "child", AracariModel.Child::createBodyLayer);
    public static final ModelLayerLocation MARMOSET_ADULT = register("marmoset", "adult", MarmosetModel.Adult::createBodyLayer);
    public static final ModelLayerLocation MARMOSET_CHILD = register("marmoset", "child", MarmosetModel.Child::createBodyLayer);
    public static final ModelLayerLocation SOUTHERN_TAMANDUA_ADULT = register("southern_tamandua", "adult", SouthernTamanduaModel.Adult::createBodyLayer);
    public static final ModelLayerLocation SOUTHERN_TAMANDUA_CHILD = register("southern_tamandua", "child", SouthernTamanduaModel.Child::createBodyLayer);
    public static final ModelLayerLocation MONITOR_ADULT = register("monitor", "adult", MonitorModel.Adult::createBodyLayer);
    public static final ModelLayerLocation MONITOR_CHILD = register("monitor", "child", MonitorModel.Child::createBodyLayer);

    public static final ModelLayerLocation BASS = register("bass", BassModel::createBodyLayer);
    public static final ModelLayerLocation FOXFACE = register("foxface", FoxfaceModel::createBodyLayer);

    public EcoRegionsModelLayers() {
    }

    private static ModelLayerLocation register(String path, Supplier<LayerDefinition> layerDefinition) {
        return register(path, "main", layerDefinition);
    }

    private static ModelLayerLocation register(String path, String model, Supplier<LayerDefinition> layerDefinition) {
        ModelLayerLocation modellayerlocation = createLocation(path, model);
        MODEL_LAYERS_LIST.add(new Tuple<>(modellayerlocation, layerDefinition));
        if (!ALL_MODELS.add(modellayerlocation))
            throw new IllegalStateException("Duplicate registration for " + modellayerlocation);
        else return modellayerlocation;
    }

    private static ModelLayerLocation createLocation(String path, String model) {
        return new ModelLayerLocation(new ResourceLocation(EcoRegions.MOD_ID, path), model);
    }
}
