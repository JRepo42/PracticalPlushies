package com.practical_plushies_animals;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PracticalPlushiesAnimals implements ModInitializer {
	public static final String MODID = "practical_plushies_animals";
    public static final Logger LOGGER = LoggerFactory.getLogger("practical_plushies_animals");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}