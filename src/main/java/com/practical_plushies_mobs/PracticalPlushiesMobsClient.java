package com.practical_plushies_mobs;

import com.practical_plushies_mobs.particle.PlushieAppearanceParticle;
import com.practical_plushies_mobs.registry.PlushieParticleRegistry;
import com.practical_plushies_mobs.registry.PlushieRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.minecraft.client.render.RenderLayer;

public class PracticalPlushiesMobsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(PlushieRegistry.CREEPER_PLUSHIE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(PlushieRegistry.ENDERMAN_PLUSHIE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(PlushieRegistry.GHAST_PLUSHIE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(PlushieRegistry.PHANTOM_PLUSHIE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(PlushieRegistry.SKELETON_PLUSHIE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(PlushieRegistry.SPIDER_PLUSHIE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(PlushieRegistry.WITCH_PLUSHIE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(PlushieRegistry.WITHER_SKELETON_PLUSHIE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(PlushieRegistry.ZOGLIN_PLUSHIE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(PlushieRegistry.ZOMBIE_PLUSHIE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(PlushieRegistry.SKELETON_HORSE_PLUSHIE, RenderLayer.getCutout());
    }
}

