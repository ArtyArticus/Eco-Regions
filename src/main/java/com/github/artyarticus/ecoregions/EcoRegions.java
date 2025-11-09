package com.github.artyarticus.ecoregions;

import com.github.artyarticus.ecoregions.block.EcoRegionsBlocks;
import com.github.artyarticus.ecoregions.client.model.EcoRegionsModelLayers;
import com.github.artyarticus.ecoregions.entity.EcoRegionsEntities;
import com.github.artyarticus.ecoregions.item.EcoRegionsItems;
import com.github.artyarticus.ecoregions.sounds.EcoRegionsSounds;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.util.Tuple;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.zawamod.zawa.Zawa;

import java.util.function.Supplier;

@Mod(EcoRegions.MOD_ID)
public class EcoRegions {
    public static final String MOD_ID = "ecoregions";
    public static final String[] PLUSHIES_LIST = new String[]{"rhea", "andean_bear", "giant_otter", "porcupine", "white_rhino", "mongoose", "gibbon", "gibbon_hanging"};

    public EcoRegions() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        EcoRegionsEntities.REGISTRY.initialize();
        EcoRegionsItems.ITEMS_REGISTRAR.register(bus);
        EcoRegionsItems.DECORATIONS_REGISTRAR.register(bus);
        EcoRegionsBlocks.REGISTRAR.register(bus);
        EcoRegionsSounds.REGISTRAR.register(bus);

        bus.addListener(this::addCreativeTabs);
        bus.addListener(this::setup);
        bus.addListener(this::registerLayerDefinitions);
        bus.addListener(this::setupClient);
    }

    private void addCreativeTabs(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == Zawa.ITEMS_GROUP.getKey()) {
            EcoRegionsItems.ITEMS_REGISTRAR.getEntries().forEach(item -> event.accept(item.get()));
        }
        if (event.getTabKey() == Zawa.DECORATIONS_GROUP.getKey()) {
            EcoRegionsItems.DECORATIONS_REGISTRAR.getEntries().forEach(item -> event.accept(item.get()));
        }
        if (event.getTabKey() == Zawa.ENTITIES_GROUP.getKey()) {
            EcoRegionsEntities.REGISTRY.itemRegistrar.getEntries().forEach(item -> event.accept(item.get()));
        }
    }

    private void setup(final FMLCommonSetupEvent event) {
        EcoRegionsEntities.registerSpawnPlacements();
    }

    private void setupClient(final FMLClientSetupEvent event) {
        EcoRegionsEntities.registerRenderers();
        EcoRegionsBlocks.setRenderLayers();
    }

    public void registerLayerDefinitions(final EntityRenderersEvent.RegisterLayerDefinitions event) {
        for (Tuple<ModelLayerLocation, Supplier<LayerDefinition>> layer : EcoRegionsModelLayers.MODEL_LAYERS_LIST) {
            event.registerLayerDefinition(layer.getA(), layer.getB());
        }
    }
}
