package com.github.artyarticus.ecoregions.sounds;

import com.github.artyarticus.ecoregions.EcoRegions;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EcoRegionsSounds {
    public static final DeferredRegister<SoundEvent> REGISTRAR = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, EcoRegions.MOD_ID);

    private static RegistryObject<SoundEvent> registerSound(String name) {
        return REGISTRAR.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(EcoRegions.MOD_ID, name)));
    }
}
