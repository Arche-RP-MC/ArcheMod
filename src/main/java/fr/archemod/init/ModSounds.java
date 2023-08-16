package fr.archemod.init;

import fr.archemod.util.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ModSounds {
    // Déclarer les SoundEvents ici
    public static SoundEvent ADD_KEY_KEYRING;

    public static void registerSounds() {
        // Initialiser les SoundEvents ici
        ADD_KEY_KEYRING = registerSound("key_ring");
    }

    private static SoundEvent registerSound(String soundName) {
        SoundEvent soundEvent = new SoundEvent(new ResourceLocation(Reference.MOD_ID, soundName)).setRegistryName(soundName);
        ForgeRegistries.SOUND_EVENTS.register(soundEvent);
        return soundEvent;
    }
}