package com.github.artyarticus.ecoregions.item;

import com.github.artyarticus.ecoregions.EcoRegions;
import com.github.artyarticus.ecoregions.block.EcoRegionsBlocks;
import com.github.artyarticus.ecoregions.entity.EcoRegionsEntities;
import net.minecraft.Util;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.material.Fluids;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.zawamod.zawa.world.item.PlushBlockItem;
import org.zawamod.zawa.world.item.ZawaBucketItem;
import org.zawamod.zawa.world.item.ZawaEggItem;

import java.util.ArrayList;
import java.util.List;

import static com.github.artyarticus.ecoregions.EcoRegions.PLUSHIES_LIST;

public class EcoRegionsItems {
    public static final DeferredRegister<Item> ITEMS_REGISTRAR = DeferredRegister.create(ForgeRegistries.ITEMS, EcoRegions.MOD_ID);
    public static final DeferredRegister<Item> DECORATIONS_REGISTRAR = DeferredRegister.create(ForgeRegistries.ITEMS, EcoRegions.MOD_ID);

    public static final List<RegistryObject<Item>> PLUSHIES = Util.make(new ArrayList<>(), list -> {
        for (String plush : PLUSHIES_LIST)
            list.add(DECORATIONS_REGISTRAR.register(plush + "_plush", () -> new PlushBlockItem(EcoRegionsBlocks.PLUSHIES.get(plush).get(), new Item.Properties())));
    });

    public static final RegistryObject<Item> RHEA_EGG = ITEMS_REGISTRAR.register("rhea_egg", () -> new ZawaEggItem(EcoRegionsEntities.RHEA, new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> SERIEMA_EGG = ITEMS_REGISTRAR.register("seriema_egg", () -> new ZawaEggItem(EcoRegionsEntities.SERIEMA, new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> BEE_EATER_EGG = ITEMS_REGISTRAR.register("bee_eater_egg", () -> new ZawaEggItem(EcoRegionsEntities.BEE_EATER, new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> SKINK_EGG = ITEMS_REGISTRAR.register("skink_egg", () -> new ZawaEggItem(EcoRegionsEntities.SKINK, new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> TEGU_EGG = ITEMS_REGISTRAR.register("tegu_egg", () -> new ZawaEggItem(EcoRegionsEntities.TEGU, new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> SCREAMER_EGG = ITEMS_REGISTRAR.register("screamer_egg", () -> new ZawaEggItem(EcoRegionsEntities.SCREAMER, new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> BASS = ITEMS_REGISTRAR.register("bass", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BASS_BUCKET = ITEMS_REGISTRAR.register("bucket_of_bass", () -> new ZawaBucketItem(EcoRegionsEntities.BASS, () -> Fluids.WATER, () -> SoundEvents.BUCKET_EMPTY_FISH, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> FOXFACE = ITEMS_REGISTRAR.register("foxface", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FOXFACE_BUCKET = ITEMS_REGISTRAR.register("bucket_of_foxface", () -> new ZawaBucketItem(EcoRegionsEntities.FOXFACE, () -> Fluids.WATER, () -> SoundEvents.BUCKET_EMPTY_FISH, new Item.Properties().stacksTo(1)));
}
