package com.github.artyarticus.ecoregions.item;

import com.github.artyarticus.ecoregions.EcoRegions;
import com.github.artyarticus.ecoregions.block.EcoRegionsBlocks;
import com.github.artyarticus.ecoregions.entity.EcoRegionsEntities;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.Item;
import net.minecraft.util.Util;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.zawamod.zawa.Zawa;
import org.zawamod.zawa.world.item.PlushBlockItem;
import org.zawamod.zawa.world.item.ZawaEggItem;
import org.zawamod.zawa.world.item.ZawaFishBucketItem;

import java.util.ArrayList;
import java.util.List;

import static com.github.artyarticus.ecoregions.EcoRegions.PLUSHIES_LIST;

public class EcoRegionsItems {
    public static final DeferredRegister<Item> REGISTRAR = DeferredRegister.create(ForgeRegistries.ITEMS, EcoRegions.MOD_ID);
    public static final List<RegistryObject<Item>> PLUSHIES = Util.make(new ArrayList<>(), list -> {
        for (String plush : PLUSHIES_LIST)
            list.add(REGISTRAR.register(plush + "_plush", () -> new PlushBlockItem(EcoRegionsBlocks.PLUSHIES.get(plush).get(), new Item.Properties().tab(Zawa.DECORATIONS_GROUP))));
    });
    public static final RegistryObject<Item> GREATER_RHEA_EGG = REGISTRAR.register("greater_rhea_egg", () -> new ZawaEggItem(EcoRegionsEntities.GREATER_RHEA, new Item.Properties().stacksTo(16).tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item> RED_LEGGED_SERIEMA_EGG = REGISTRAR.register("red_legged_seriema_egg", () -> new ZawaEggItem(EcoRegionsEntities.RED_LEGGED_SERIEMA, new Item.Properties().stacksTo(16).tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item> BEE_EATER_EGG = REGISTRAR.register("bee_eater_egg", () -> new ZawaEggItem(EcoRegionsEntities.BEE_EATER, new Item.Properties().stacksTo(16).tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item> BLUE_TOUNGED_SKINK_EGG = REGISTRAR.register("blue_tounged_skink_egg", () -> new ZawaEggItem(EcoRegionsEntities.BLUE_TOUNGED_SKINK, new Item.Properties().stacksTo(16).tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item> TEGU_EGG = REGISTRAR.register("tegu_egg", () -> new ZawaEggItem(EcoRegionsEntities.TEGU, new Item.Properties().stacksTo(16).tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item> SCREAMER_EGG = REGISTRAR.register("screamer_egg", () -> new ZawaEggItem(EcoRegionsEntities.SCREAMER, new Item.Properties().stacksTo(16).tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item> ASIAN_WATER_MONITOR_EGG = REGISTRAR.register("asian_water_monitor_egg", () -> new ZawaEggItem(EcoRegionsEntities.ASIAN_WATER_MONITOR, new Item.Properties().stacksTo(16).tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item> ARACARI_EGG = REGISTRAR.register("aracari_egg", () -> new ZawaEggItem(EcoRegionsEntities.ARACARI, new Item.Properties().stacksTo(16).tab(Zawa.ITEMS_GROUP)));

    public static final RegistryObject<Item>
            BASS = REGISTRAR.register("peacock_bass", () -> new Item(new Item.Properties().tab(Zawa.ITEMS_GROUP)));

    public static final RegistryObject<Item>
            FOXFACE = REGISTRAR.register("foxface", () -> new Item(new Item.Properties().tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item>
            PEACOCK_BASS_BUCKET = REGISTRAR.register("bucket_of_peacock_bass", () -> new ZawaFishBucketItem(EcoRegionsEntities.PEACOCK_BASS, () -> Fluids.WATER,
            new Item.Properties().stacksTo(1).tab(Zawa.ITEMS_GROUP)));

    public static final RegistryObject<Item>
            FOXFACE_BUCKET = REGISTRAR.register("bucket_of_foxface", () -> new ZawaFishBucketItem(EcoRegionsEntities.FOXFACE, () -> Fluids.WATER,
            new Item.Properties().stacksTo(1).tab(Zawa.ITEMS_GROUP)));
}
