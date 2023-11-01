package com.practical_plushies_animals.datagen;

import com.practical_plushies_animals.PracticalPlushiesAnimals;
import com.practical_plushies_animals.registry.PlushieRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;

import java.util.HashMap;

public class PlushieLootTables extends FabricBlockLootTableProvider {
    protected PlushieLootTables(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    private static HashMap<Block, BlockItem> dataPlushieMap = new HashMap<Block, BlockItem>();

    public static void addDropEntries(HashMap plushieMap) {
        PracticalPlushiesAnimals.LOGGER.info(plushieMap.toString());
        dataPlushieMap = plushieMap;
    }

    @Override
    public void generate() {
        for (Block i : dataPlushieMap.keySet()) {
            addDrop(i, dataPlushieMap.get(i).asItem());
        }
    }
}
