package com.practical_plushies_animals.registry;

import com.practical_plushies_animals.PracticalPlushiesAnimals;
import com.practical_plushies_animals.particle.PlushieAppearanceParticle;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class PlushieParticleRegistry {

    public static final DefaultParticleType PLUSHIE_APPEARANCE = FabricParticleTypes.simple();

    public static void register() {
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(PracticalPlushiesAnimals.MODID, "plushie_appearance"), PLUSHIE_APPEARANCE);
    }
}
