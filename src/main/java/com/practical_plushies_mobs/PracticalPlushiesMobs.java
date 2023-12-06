package com.practical_plushies_mobs;

import com.practical_plushies_mobs.config.Config;
import com.practical_plushies_mobs.datagen.PlushieLootTables;
import com.practical_plushies_mobs.registry.PlushieItemGroupRegistry;
import com.practical_plushies_mobs.registry.PlushieParticleRegistry;
import com.practical_plushies_mobs.registry.PlushieRegistry;

import elocindev.necronomicon.api.config.v1.NecConfigAPI;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PracticalPlushiesMobs implements ModInitializer {
	public static final String MODID = "practical_plushies_mobs";
	public static final String CONFIG_FILE = "mobs.json";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	public static Config CONFIG;

	@Override
	public void onInitialize() {
		NecConfigAPI.registerConfig(Config.class);
		CONFIG = Config.INSTANCE;

		PlushieRegistry.register();
		PlushieItemGroupRegistry.register();
		PlushieParticleRegistry.register();

		ServerLifecycleEvents.END_DATA_PACK_RELOAD.register((server, resourceManager, success) -> {
			PlushieLootTables.addDropEntries(PlushieRegistry.PLUSHIES);
			
			NecConfigAPI.registerConfig(Config.class);
			CONFIG = Config.INSTANCE;
		});	
	}
}