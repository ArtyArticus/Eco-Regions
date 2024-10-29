package com.github.artyarticus.ecoregions.sounds;

import com.github.artyarticus.ecoregions.EcoRegions;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EcoRegionsSounds {
    public static final DeferredRegister<SoundEvent> REGISTRAR = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, EcoRegions.MOD_ID);


    private static RegistryObject<SoundEvent> registerSound(String name) {
        return REGISTRAR.register(name, () -> new SoundEvent(new ResourceLocation(EcoRegions.MOD_ID, name)));
    }
}
