package com.practical_plushies_animals;

import com.practical_plushies_animals.particle.PlushieAppearanceParticle;
import com.practical_plushies_animals.registry.PlushieParticleRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;

public class PracticalPlushiesAnimalsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ParticleFactoryRegistry.getInstance().register(PlushieParticleRegistry.ALLAY_PLUSHIE_APPEARANCE, new PlushieAppearanceParticle.Factory("allay"));
        ParticleFactoryRegistry.getInstance().register(PlushieParticleRegistry.AXOLOTL_PLUSHIE_APPEARANCE, new PlushieAppearanceParticle.Factory("axolotl"));
        ParticleFactoryRegistry.getInstance().register(PlushieParticleRegistry.BEE_PLUSHIE_APPEARANCE, new PlushieAppearanceParticle.Factory("bee"));
        ParticleFactoryRegistry.getInstance().register(PlushieParticleRegistry.CHICKEN_PLUSHIE_APPEARANCE, new PlushieAppearanceParticle.Factory("chicken"));
        ParticleFactoryRegistry.getInstance().register(PlushieParticleRegistry.COW_PLUSHIE_APPEARANCE, new PlushieAppearanceParticle.Factory("cow"));
        ParticleFactoryRegistry.getInstance().register(PlushieParticleRegistry.FOX_PLUSHIE_APPEARANCE, new PlushieAppearanceParticle.Factory("fox"));
        ParticleFactoryRegistry.getInstance().register(PlushieParticleRegistry.PARROT_PLUSHIE_APPEARANCE, new PlushieAppearanceParticle.Factory("parrot"));
        ParticleFactoryRegistry.getInstance().register(PlushieParticleRegistry.PIG_PLUSHIE_APPEARANCE, new PlushieAppearanceParticle.Factory("pig"));
        ParticleFactoryRegistry.getInstance().register(PlushieParticleRegistry.SHEEP_PLUSHIE_APPEARANCE, new PlushieAppearanceParticle.Factory("sheep"));
        ParticleFactoryRegistry.getInstance().register(PlushieParticleRegistry.TURTLE_PLUSHIE_APPEARANCE, new PlushieAppearanceParticle.Factory("turtle"));
    }
}

