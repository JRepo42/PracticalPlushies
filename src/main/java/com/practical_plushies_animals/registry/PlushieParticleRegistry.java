package com.practical_plushies_animals.registry;

import com.practical_plushies_animals.PracticalPlushiesAnimals;
import com.practical_plushies_animals.particle.PlushieAppearanceParticle;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class PlushieParticleRegistry {

    public static final DefaultParticleType ALLAY_PLUSHIE_APPEARANCE = FabricParticleTypes.simple();
    public static final DefaultParticleType AXOLOTL_PLUSHIE_APPEARANCE = FabricParticleTypes.simple();
    public static final DefaultParticleType BEE_PLUSHIE_APPEARANCE = FabricParticleTypes.simple();
    public static final DefaultParticleType CHICKEN_PLUSHIE_APPEARANCE = FabricParticleTypes.simple();
    public static final DefaultParticleType COW_PLUSHIE_APPEARANCE = FabricParticleTypes.simple();
    public static final DefaultParticleType FOX_PLUSHIE_APPEARANCE = FabricParticleTypes.simple();
    public static final DefaultParticleType PARROT_PLUSHIE_APPEARANCE = FabricParticleTypes.simple();
    public static final DefaultParticleType PIG_PLUSHIE_APPEARANCE = FabricParticleTypes.simple();
    public static final DefaultParticleType SHEEP_PLUSHIE_APPEARANCE = FabricParticleTypes.simple();
    public static final DefaultParticleType TURTLE_PLUSHIE_APPEARANCE = FabricParticleTypes.simple();

    public static void register() {
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(PracticalPlushiesAnimals.MODID, "allay_plushie_appearance"), ALLAY_PLUSHIE_APPEARANCE);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(PracticalPlushiesAnimals.MODID, "axolotl_plushie_appearance"), AXOLOTL_PLUSHIE_APPEARANCE);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(PracticalPlushiesAnimals.MODID, "bee_plushie_appearance"), BEE_PLUSHIE_APPEARANCE);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(PracticalPlushiesAnimals.MODID, "chicken_plushie_appearance"), CHICKEN_PLUSHIE_APPEARANCE);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(PracticalPlushiesAnimals.MODID, "cow_plushie_appearance"), COW_PLUSHIE_APPEARANCE);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(PracticalPlushiesAnimals.MODID, "fox_plushie_appearance"), FOX_PLUSHIE_APPEARANCE);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(PracticalPlushiesAnimals.MODID, "parrot_plushie_appearance"), PARROT_PLUSHIE_APPEARANCE);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(PracticalPlushiesAnimals.MODID, "pig_plushie_appearance"), PIG_PLUSHIE_APPEARANCE);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(PracticalPlushiesAnimals.MODID, "sheep_plushie_appearance"), SHEEP_PLUSHIE_APPEARANCE);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(PracticalPlushiesAnimals.MODID, "turtle_plushie_appearance"), TURTLE_PLUSHIE_APPEARANCE);

    }
}
