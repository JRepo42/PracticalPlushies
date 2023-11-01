package com.practical_plushies_animals.datagen;

import com.practical_plushies_animals.PracticalPlushiesAnimals;
import com.practical_plushies_animals.registry.PlushieRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

import java.util.HashMap;

public class PlushieLootTables extends FabricBlockLootTableProvider {
    protected PlushieLootTables(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    public static void addDropEntries(HashMap plushieMap) {
        PracticalPlushiesAnimals.LOGGER.info(plushieMap.toString());
    }

    @Override
    public void generate() {
        addDrop(PlushieRegistry.FOX_PLUSHIE, PlushieRegistry.FOX_PLUSHIE.asItem());
    }
}
