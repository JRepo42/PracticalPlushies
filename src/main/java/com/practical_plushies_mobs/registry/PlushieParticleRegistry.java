package com.practical_plushies_mobs.registry;

import com.practical_plushies_mobs.PracticalPlushiesMobs;
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
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(PracticalPlushiesMobs.MODID, "allay"), ALLAY_PLUSHIE_APPEARANCE);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(PracticalPlushiesMobs.MODID, "axolotl"), AXOLOTL_PLUSHIE_APPEARANCE);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(PracticalPlushiesMobs.MODID, "bee"), BEE_PLUSHIE_APPEARANCE);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(PracticalPlushiesMobs.MODID, "chicken"), CHICKEN_PLUSHIE_APPEARANCE);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(PracticalPlushiesMobs.MODID, "cow"), COW_PLUSHIE_APPEARANCE);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(PracticalPlushiesMobs.MODID, "fox"), FOX_PLUSHIE_APPEARANCE);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(PracticalPlushiesMobs.MODID, "parrot"), PARROT_PLUSHIE_APPEARANCE);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(PracticalPlushiesMobs.MODID, "pig"), PIG_PLUSHIE_APPEARANCE);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(PracticalPlushiesMobs.MODID, "sheep"), SHEEP_PLUSHIE_APPEARANCE);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(PracticalPlushiesMobs.MODID, "turtle"), TURTLE_PLUSHIE_APPEARANCE);
    }
}
