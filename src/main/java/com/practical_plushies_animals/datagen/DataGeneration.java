package com.practical_plushies_animals.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class DataGeneration implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack myPack = fabricDataGenerator.createPack();
		myPack.addProvider(PlushieLootTables::new);
		myPack.addProvider(PlushieRecipes::new);
		myPack.addProvider(PlushieLanguages::new);
	}
}
