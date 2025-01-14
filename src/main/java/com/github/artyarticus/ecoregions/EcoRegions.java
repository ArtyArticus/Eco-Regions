package com.github.artyarticus.ecoregions;

import com.github.artyarticus.ecoregions.block.EcoRegionsBlocks;
import com.github.artyarticus.ecoregions.entity.EcoRegionsEntities;
import com.github.artyarticus.ecoregions.item.EcoRegionsItems;
import com.github.artyarticus.ecoregions.sounds.EcoRegionsSounds;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(EcoRegions.MOD_ID)
public class EcoRegions {
    public static final String MOD_ID = "ecoregions";
    public static final String[] PLUSHIES_LIST = new String[]{"rhea", "andean_bear", "giant_otter", "porcupine", "white_rhino", "mongoose", "gibbon", "gibbon_hanging"};

    public EcoRegions() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        EcoRegionsEntities.REGISTRY.initialize();
        EcoRegionsItems.REGISTRAR.register(bus);
        EcoRegionsBlocks.REGISTRAR.register(bus);
        EcoRegionsSounds.REGISTRAR.register(bus);

        bus.addListener(this::setup);
        bus.addListener(this::setupClient);
    }

    private void setup(final FMLCommonSetupEvent event) {
        EcoRegionsEntities.registerSpawnPlacements();
    }

    private void setupClient(final FMLClientSetupEvent event) {
        EcoRegionsBlocks.setRenderLayers();
    }
}
