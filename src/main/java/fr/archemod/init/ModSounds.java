package fr.archemod.init;

import fr.archemod.util.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ModSounds {
    // Déclarer les SoundEvents ici
    public static SoundEvent SIFFLET;

    public static void registerSounds() {
        // Initialiser les SoundEvents ici
        SIFFLET = registerSound("sifflet");

    }

    private static SoundEvent registerSound(String soundName) {
        ResourceLocation location = new ResourceLocation(Reference.MOD_ID, soundName);
        SoundEvent soundEvent = new SoundEvent(location);
        soundEvent.setRegistryName(location);
        ForgeRegistries.SOUND_EVENTS.register(soundEvent);
        return soundEvent;
    }
}