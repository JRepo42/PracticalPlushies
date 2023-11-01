package com.practical_plushies_animals;

import mod.azure.azurelib.AzureLib;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PracticalPlushiesAnimals implements ModInitializer {
	public static final String MODID = "practical_plushies_animals";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	@Override
	public void onInitialize() {
		AzureLib.initialize();
	}
}