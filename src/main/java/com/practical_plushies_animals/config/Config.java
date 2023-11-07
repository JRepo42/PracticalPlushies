package com.practical_plushies_animals.config;

import java.nio.file.Path;

import com.practical_plushies_animals.PracticalPlushiesAnimals;

import elocindev.necronomicon.config.NecConfig;
import net.fabricmc.loader.api.FabricLoader;

public class Config {
    @NecConfig
    public static Config INSTANCE;

    public static String getFile() {
        Path folder = FabricLoader.getInstance().getConfigDir().resolve("practical_plushies");

        if (!folder.toFile().exists())
            folder.toFile().mkdir();

        return folder.resolve(PracticalPlushiesAnimals.CONFIG_FILE).toString();
    }

    public boolean enable_drops = true;
    // TODO: add drop chances
}
