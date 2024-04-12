package com.github.artyarticus.ecoregions;

import com.github.artyarticus.ecoregions.entity.EcoRegionsEntities;
import com.github.artyarticus.ecoregions.item.EcoRegionsItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(EcoRegions.MOD_ID)
public class EcoRegions {
    public static final String MOD_ID = "ecoregions";

    public EcoRegions() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        EcoRegionsEntities.REGISTRY.initialize();
        EcoRegionsItems.REGISTRAR.register(bus);

        bus.addListener(this::setup);
    }

    private void setup(final FMLCommonSetupEvent event) {
        EcoRegionsEntities.registerSpawnPlacements();
    }
}
