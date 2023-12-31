package com.practical_plushies_animals.registry;

import com.practical_plushies_animals.PracticalPlushiesAnimals;
import com.practical_plushies_animals.datagen.PlushieLootTables;
import com.practical_plushies_animals.plushies.variants.BigFloorPlushie;
import com.practical_plushies_animals.plushies.variants.BigPlushie;
import com.practical_plushies_animals.plushies.variants.FloorPlushie;
import com.practical_plushies_animals.plushies.variants.SmallPlushie;
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
    private static FabricBlockSettings DEFAULT_PLUSHIE_SETTINGS = FabricBlockSettings.create().strength(0.5f).nonOpaque().sounds(BlockSoundGroup.WOOL);

    public static final Block ALLAY_PLUSHIE = new SmallPlushie(DEFAULT_PLUSHIE_SETTINGS);
    public static final Block AXOLOTL_PLUSHIE = new FloorPlushie(DEFAULT_PLUSHIE_SETTINGS);
    public static final Block BEE_PLUSHIE = new SmallPlushie(DEFAULT_PLUSHIE_SETTINGS);
    public static final Block CHICKEN_PLUSHIE = new BigPlushie(DEFAULT_PLUSHIE_SETTINGS);
    public static final Block COW_PLUSHIE = new FloorPlushie(DEFAULT_PLUSHIE_SETTINGS);
    public static final Block FOX_PLUSHIE = new BigPlushie(DEFAULT_PLUSHIE_SETTINGS);
    public static final Block PARROT_PLUSHIE = new SmallPlushie(DEFAULT_PLUSHIE_SETTINGS);
    public static final Block PIG_PLUSHIE = new FloorPlushie(DEFAULT_PLUSHIE_SETTINGS);
    public static final Block SHEEP_PLUSHIE = new FloorPlushie(DEFAULT_PLUSHIE_SETTINGS);
    public static final Block TURTLE_PLUSHIE = new FloorPlushie(DEFAULT_PLUSHIE_SETTINGS);

    public static final Block CAMEL_PLUSHIE = new FloorPlushie(DEFAULT_PLUSHIE_SETTINGS);
    public static final Block HORSE_PLUSHIE = new FloorPlushie(DEFAULT_PLUSHIE_SETTINGS);
    public static final Block MOOSHROOM_PLUSHIE = new FloorPlushie(DEFAULT_PLUSHIE_SETTINGS);
    public static final Block FROG_PLUSHIE = new SmallPlushie(DEFAULT_PLUSHIE_SETTINGS);
    public static final Block RABBIT_PLUSHIE = new SmallPlushie(DEFAULT_PLUSHIE_SETTINGS);
    public static final Block CAT_PLUSHIE = new BigPlushie(DEFAULT_PLUSHIE_SETTINGS);
    public static final Block WOLF_PLUSHIE = new BigPlushie(DEFAULT_PLUSHIE_SETTINGS);
    public static final Block SNIFFER_PLUSHIE = new BigFloorPlushie(DEFAULT_PLUSHIE_SETTINGS);
    public static final Block DOLPHIN_PLUSHIE = new FloorPlushie(DEFAULT_PLUSHIE_SETTINGS);
    public static final Block PANDA_PLUSHIE = new BigFloorPlushie(DEFAULT_PLUSHIE_SETTINGS);

    public static final ArrayList<Block> PLUSHIES = new ArrayList<Block>() {{
        add(ALLAY_PLUSHIE);
        add(AXOLOTL_PLUSHIE);
        add(BEE_PLUSHIE);
        add(CHICKEN_PLUSHIE);
        add(COW_PLUSHIE);
        add(FOX_PLUSHIE);
        add(PARROT_PLUSHIE);
        add(PIG_PLUSHIE);
        add(SHEEP_PLUSHIE);
        add(TURTLE_PLUSHIE);
        add(CAMEL_PLUSHIE);
        add(HORSE_PLUSHIE);
        add(MOOSHROOM_PLUSHIE);
        add(FROG_PLUSHIE);
        add(RABBIT_PLUSHIE);
        add(CAT_PLUSHIE);
        add(WOLF_PLUSHIE);
        add(SNIFFER_PLUSHIE);
        add(DOLPHIN_PLUSHIE);
        add(PANDA_PLUSHIE);
    }};


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

        PlushieItemGroupRegistry.addItemGroupEntries(PLUSHIES);
    }

    public static void registerPlushie(Block plushieInstance, String identifier) {
        Registry.register(Registries.BLOCK, new Identifier(PracticalPlushiesAnimals.MODID, identifier), plushieInstance);
        Registry.register(Registries.ITEM, new Identifier(PracticalPlushiesAnimals.MODID, identifier), new BlockItem(plushieInstance, new FabricItemSettings()));
    }
}
