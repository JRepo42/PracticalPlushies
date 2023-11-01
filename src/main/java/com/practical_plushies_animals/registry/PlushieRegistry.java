package com.practical_plushies_animals.registry;

import com.practical_plushies_animals.PracticalPlushiesAnimals;
import com.practical_plushies_animals.datagen.PlushieLootTables;
import com.practical_plushies_animals.plushies.Plushie;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.ArrayList;

public class PlushieRegistry {
    private static ArrayList<Block> plushies = new ArrayList<>();

    public static final Block ALLAY_PLUSHIE = new Plushie(FabricBlockSettings.create().strength(10.0f).nonOpaque());
    public static final Block AXOLOTYL_PLUSHIE = new Block(FabricBlockSettings.create().strength(1.0f).nonOpaque());
    public static final Block BEE_PLUSHIE = new Block(FabricBlockSettings.create().strength(1.0f).nonOpaque());
    public static final Block CHICKEN_PLUSHIE = new Block(FabricBlockSettings.create().strength(1.0f).nonOpaque());
    public static final Block COW_PLUSHIE = new Block(FabricBlockSettings.create().strength(1.0f).nonOpaque());
    public static final Block FOX_PLUSHIE = new Block(FabricBlockSettings.create().strength(1.0f).nonOpaque());
    public static final Block PARROT_PLUSHIE = new Block(FabricBlockSettings.create().strength(1.0f).nonOpaque());
    public static final Block PIG_PLUSHIE = new Block(FabricBlockSettings.create().strength(1.0f).nonOpaque());
    public static final Block SHEEP_PLUSHIE = new Block(FabricBlockSettings.create().strength(1.0f).nonOpaque());
    public static final Block TURTLE_PLUSHIE = new Block(FabricBlockSettings.create().strength(1.0f).nonOpaque());

    public static void register() {
        registerPlushie(ALLAY_PLUSHIE, "allay_plushie");
        registerPlushie(AXOLOTYL_PLUSHIE, "axolotyl_plushie");
        registerPlushie(BEE_PLUSHIE, "bee_plushie");
        registerPlushie(CHICKEN_PLUSHIE, "chicken_plushie");
        registerPlushie(COW_PLUSHIE, "cow_plushie");
        registerPlushie(FOX_PLUSHIE, "fox_plushie");
        registerPlushie(PARROT_PLUSHIE, "parrot_plushie");
        registerPlushie(PIG_PLUSHIE, "pig_plushie");
        registerPlushie(SHEEP_PLUSHIE, "sheep_plushie");
        registerPlushie(TURTLE_PLUSHIE, "turtle_plushie");
        PlushieLootTables.addDropEntries(plushies);
        PlushieItemGroupRegistry.addItemGroupEntries(plushies);
    }

    public static void registerPlushie(Block plushieInstance, String identifier) {
        Registry.register(Registries.BLOCK, new Identifier(PracticalPlushiesAnimals.MODID, identifier), plushieInstance);
        Registry.register(Registries.ITEM, new Identifier(PracticalPlushiesAnimals.MODID, identifier), new BlockItem(plushieInstance, new FabricItemSettings()));

        plushies.add(plushieInstance);
    }
}
