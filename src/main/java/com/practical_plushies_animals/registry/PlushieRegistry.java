package com.practical_plushies_animals.registry;

import com.practical_plushies_animals.PracticalPlushiesAnimals;
import com.practical_plushies_animals.datagen.PlushieLootTables;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.HashMap;

public class PlushieRegistry {
    private static HashMap<Block, BlockItem> plushieMap = new HashMap<Block, BlockItem>();

    public static final Block FOX_PLUSHIE = new Block(FabricBlockSettings.create().strength(1.0f));
    public static final Block PIG_PLUSHIE = new Block(FabricBlockSettings.create().strength(1.0f));

    public static void register() {
        registerPlushie("fox_plushie", FOX_PLUSHIE);
        registerPlushie("pig_plushie", PIG_PLUSHIE);
        PlushieLootTables.addDropEntries(plushieMap);
    }

    public static void registerPlushie(String identifier, Block plushieInstance) {
        final BlockItem PLUSHIE_ITEM = new BlockItem(plushieInstance, new FabricItemSettings());
        
        Registry.register(Registries.BLOCK, new Identifier(PracticalPlushiesAnimals.MODID, identifier), plushieInstance);
        Registry.register(Registries.ITEM, new Identifier(PracticalPlushiesAnimals.MODID, identifier), PLUSHIE_ITEM);

        plushieMap.put(plushieInstance, PLUSHIE_ITEM);
    }
}
