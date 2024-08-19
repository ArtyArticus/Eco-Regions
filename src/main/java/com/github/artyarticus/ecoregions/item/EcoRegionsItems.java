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
    public static final RegistryObject<Item> RHEA_EGG = REGISTRAR.register("rhea_egg", () -> new ZawaEggItem(EcoRegionsEntities.RHEA, new Item.Properties().stacksTo(16).tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item> SERIEMA_EGG = REGISTRAR.register("seriema_egg", () -> new ZawaEggItem(EcoRegionsEntities.SERIEMA, new Item.Properties().stacksTo(16).tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item>
            BASS = REGISTRAR.register("bass", () -> new Item(new Item.Properties().tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item>
            BASS_BUCKET = REGISTRAR.register("bucket_of_bass", () -> new ZawaFishBucketItem(EcoRegionsEntities.BASS, () -> Fluids.WATER,
            new Item.Properties().stacksTo(1).tab(Zawa.ITEMS_GROUP)));
}
