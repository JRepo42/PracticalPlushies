package com.practical_plushies_animals;

import com.practical_plushies_animals.particle.PlushieAppearanceParticle;
import com.practical_plushies_animals.registry.PlushieParticleRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;

public class PracticalPlushiesAnimalsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ParticleFactoryRegistry.getInstance().register(PlushieParticleRegistry.PIG_PLUSHIE_APPEARANCE, new PlushieAppearanceParticle.Factory("pig"));
        ParticleFactoryRegistry.getInstance().register(PlushieParticleRegistry.TURTLE_PLUSHIE_APPEARANCE, new PlushieAppearanceParticle.Factory("turtle"));
    }
}
