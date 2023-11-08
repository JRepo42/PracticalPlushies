package com.practical_plushies_mobs.registry;

import com.practical_plushies_mobs.PracticalPlushiesMobs;
import com.practical_plushies_mobs.datagen.PlushieLootTables;
import com.practical_plushies_mobs.plushies.variants.BigFloorPlushie;
import com.practical_plushies_mobs.plushies.variants.BigPlushie;
import com.practical_plushies_mobs.plushies.variants.FloorPlushie;
import com.practical_plushies_mobs.plushies.variants.SmallPlushie;
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

    public static final Block CREEPER_PLUSHIE = new FloorPlushie(DEFAULT_PLUSHIE_SETTINGS);
    public static final Block ENDERMAN_PLUSHIE = new SmallPlushie(DEFAULT_PLUSHIE_SETTINGS);
    public static final Block GHAST_PLUSHIE = new FloorPlushie(DEFAULT_PLUSHIE_SETTINGS);
    public static final Block PHANTOM_PLUSHIE = new SmallPlushie(DEFAULT_PLUSHIE_SETTINGS);
    public static final Block SKELETON_PLUSHIE = new BigPlushie(DEFAULT_PLUSHIE_SETTINGS);
    public static final Block SPIDER_PLUSHIE = new FloorPlushie(DEFAULT_PLUSHIE_SETTINGS);
    public static final Block WITCH_PLUSHIE = new BigPlushie(DEFAULT_PLUSHIE_SETTINGS);
    public static final Block WITHER_SKELETON_PLUSHIE = new BigPlushie(DEFAULT_PLUSHIE_SETTINGS);
    public static final Block ZOGLIN_PLUSHIE = new SmallPlushie(DEFAULT_PLUSHIE_SETTINGS);
    public static final Block ZOMBIE_PLUSHIE = new FloorPlushie(DEFAULT_PLUSHIE_SETTINGS);
    public static final Block SKELETON_HORSE_PLUSHIE = new FloorPlushie(DEFAULT_PLUSHIE_SETTINGS);

    public static void register() {
        registerPlushie(CREEPER_PLUSHIE, "creeper_plushie");
        registerPlushie(ENDERMAN_PLUSHIE, "enderman_plushie");
        registerPlushie(GHAST_PLUSHIE, "ghast_plushie");
        registerPlushie(PHANTOM_PLUSHIE, "phantom_plushie");
        registerPlushie(SKELETON_PLUSHIE, "skeleton_plushie");
        registerPlushie(SPIDER_PLUSHIE, "spider_plushie");
        registerPlushie(WITCH_PLUSHIE, "witch_plushie");
        registerPlushie(WITHER_SKELETON_PLUSHIE, "wither_skeleton_plushie");
        registerPlushie(ZOGLIN_PLUSHIE, "zoglin_plushie");
        registerPlushie(ZOMBIE_PLUSHIE, "zombie_plushie");
        registerPlushie(SKELETON_HORSE_PLUSHIE, "skeleton_hose_plushie");

        PlushieLootTables.addDropEntries(plushies);
        PlushieItemGroupRegistry.addItemGroupEntries(plushies);
    }

    public static void registerPlushie(Block plushieInstance, String identifier) {
        Registry.register(Registries.BLOCK, new Identifier(PracticalPlushiesMobs.MODID, identifier), plushieInstance);
        Registry.register(Registries.ITEM, new Identifier(PracticalPlushiesMobs.MODID, identifier), new BlockItem(plushieInstance, new FabricItemSettings()));
        plushies.add(plushieInstance);
    }
}
