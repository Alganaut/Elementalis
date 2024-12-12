package com.Alganaut.Elementalis.registry.sound;

import com.Alganaut.Elementalis.Elementalis;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.JukeboxSong;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(BuiltInRegistries.SOUND_EVENT, Elementalis.MODID);

private static Supplier<SoundEvent> registerSoundEvent(String name) {
    ResourceLocation id = ResourceLocation.fromNamespaceAndPath(Elementalis.MODID, name);
    return SOUND_EVENTS.register(name, () ->SoundEvent.createVariableRangeEvent(id));
}


    public static final Supplier<SoundEvent> SIX = registerSoundEvent("6");
public static final ResourceKey<JukeboxSong> SIX_KEY = createSong("6");


    private static ResourceKey<JukeboxSong> createSong (String name) {
        return ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath(Elementalis.MODID, name));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
