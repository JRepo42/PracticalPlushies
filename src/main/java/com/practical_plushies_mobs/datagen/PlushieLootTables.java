package com.practical_plushies_mobs.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;

import java.util.ArrayList;

public class PlushieLootTables extends FabricBlockLootTableProvider {
    protected PlushieLootTables(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    private static Block[] dataBlockArray;

    public static void addDropEntries(ArrayList<Block> blockArray) {
        dataBlockArray = blockArray.toArray(new Block[0]);
    }

    @Override
    public void generate() {
        for (int i = 0; i < dataBlockArray.length; i++) {
            addDrop(dataBlockArray[i]);
        }
    }
}