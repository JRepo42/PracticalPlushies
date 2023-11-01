package com.practical_plushies_animals.datagen;

import com.practical_plushies_animals.PracticalPlushiesAnimals;
import com.practical_plushies_animals.registry.PlushieRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;

import java.util.ArrayList;
import java.util.HashMap;

public class PlushieLootTables extends FabricBlockLootTableProvider {
    protected PlushieLootTables(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    private static Block[] dataBlockArray;

    public static void addDropEntries(ArrayList<Block> blockArray) {
        PracticalPlushiesAnimals.LOGGER.info(blockArray.toString());
        dataBlockArray = blockArray.toArray(new Block[0]);
    }

    @Override
    public void generate() {
        for (int i = 0; i < dataBlockArray.length; i++) {
            addDrop(dataBlockArray[i]);
        }
    }
}
