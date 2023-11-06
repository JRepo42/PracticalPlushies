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
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.ArrayList;

public class PlushieRegistry {
    private static ArrayList<Block> plushies = new ArrayList<>();

    private static FabricBlockSettings DEFAULT_PLUSHIE_SETTINGS = FabricBlockSettings.create().strength(0.5f).nonOpaque().sounds(BlockSoundGroup.WOOL);

    public static final Block ALLAY_PLUSHIE = new Plushie(DEFAULT_PLUSHIE_SETTINGS, "small");
    public static final Block AXOLOTL_PLUSHIE = new Plushie(DEFAULT_PLUSHIE_SETTINGS, "floor");
    public static final Block BEE_PLUSHIE = new Plushie(DEFAULT_PLUSHIE_SETTINGS, "small");
    public static final Block CHICKEN_PLUSHIE = new Plushie(DEFAULT_PLUSHIE_SETTINGS, "big");
    public static final Block COW_PLUSHIE = new Plushie(DEFAULT_PLUSHIE_SETTINGS, "floor");
    public static final Block FOX_PLUSHIE = new Plushie(DEFAULT_PLUSHIE_SETTINGS, "big");
    public static final Block PARROT_PLUSHIE = new Plushie(DEFAULT_PLUSHIE_SETTINGS, "small");
    public static final Block PIG_PLUSHIE = new Plushie(DEFAULT_PLUSHIE_SETTINGS, "floor");
    public static final Block SHEEP_PLUSHIE = new Plushie(DEFAULT_PLUSHIE_SETTINGS, "floor");
    public static final Block TURTLE_PLUSHIE = new Plushie(DEFAULT_PLUSHIE_SETTINGS, "floor");

    public static final Block CAMEL_PLUSHIE = new Plushie(DEFAULT_PLUSHIE_SETTINGS, "floor");
    public static final Block HORSE_PLUSHIE = new Plushie(DEFAULT_PLUSHIE_SETTINGS, "floor");
    public static final Block MOOSHROOM_PLUSHIE = new Plushie(DEFAULT_PLUSHIE_SETTINGS, "floor");
    public static final Block FROG_PLUSHIE = new Plushie(DEFAULT_PLUSHIE_SETTINGS, "small");
    public static final Block RABBIT_PLUSHIE = new Plushie(DEFAULT_PLUSHIE_SETTINGS, "small");
    public static final Block CAT_PLUSHIE = new Plushie(DEFAULT_PLUSHIE_SETTINGS, "big");
    public static final Block WOLF_PLUSHIE = new Plushie(DEFAULT_PLUSHIE_SETTINGS, "big");
    public static final Block SNIFFER_PLUSHIE = new Plushie(DEFAULT_PLUSHIE_SETTINGS, "big_floor");
    public static final Block DOLPHIN_PLUSHIE = new Plushie(DEFAULT_PLUSHIE_SETTINGS, "floor");
    public static final Block PANDA_PLUSHIE = new Plushie(DEFAULT_PLUSHIE_SETTINGS, "big_floor");

    public static void register() {
        registerPlushie(ALLAY_PLUSHIE, "allay_plushie");
        registerPlushie(AXOLOTL_PLUSHIE, "axolotl_plushie");
        registerPlushie(BEE_PLUSHIE, "bee_plushie");
        registerPlushie(CHICKEN_PLUSHIE, "chicken_plushie");
        registerPlushie(COW_PLUSHIE, "cow_plushie");
        registerPlushie(FOX_PLUSHIE, "fox_plushie");
        registerPlushie(PARROT_PLUSHIE, "parrot_plushie");
        registerPlushie(PIG_PLUSHIE, "pig_plushie");
        registerPlushie(SHEEP_PLUSHIE, "sheep_plushie");
        registerPlushie(TURTLE_PLUSHIE, "turtle_plushie");

        registerPlushie(CAMEL_PLUSHIE, "camel_plushie");
        registerPlushie(HORSE_PLUSHIE, "horse_plushie");
        registerPlushie(MOOSHROOM_PLUSHIE, "mooshroom_plushie");
        registerPlushie(FROG_PLUSHIE, "frog_plushie");
        registerPlushie(RABBIT_PLUSHIE, "rabbit_plushie");
        registerPlushie(CAT_PLUSHIE, "cat_plushie");
        registerPlushie(WOLF_PLUSHIE, "wolf_plushie");
        registerPlushie(SNIFFER_PLUSHIE, "sniffer_plushie");
        registerPlushie(DOLPHIN_PLUSHIE, "dolphin_plushie");
        registerPlushie(PANDA_PLUSHIE, "panda_plushie");

        PlushieLootTables.addDropEntries(plushies);
        PlushieItemGroupRegistry.addItemGroupEntries(plushies);
    }

    public static void registerPlushie(Block plushieInstance, String identifier) {
        Registry.register(Registries.BLOCK, new Identifier(PracticalPlushiesAnimals.MODID, identifier), plushieInstance);
        Registry.register(Registries.ITEM, new Identifier(PracticalPlushiesAnimals.MODID, identifier), new BlockItem(plushieInstance, new FabricItemSettings()));
        plushies.add(plushieInstance);
    }
}
