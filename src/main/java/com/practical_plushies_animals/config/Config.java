package com.practical_plushies_animals.config;

import elocindev.necronomicon.api.config.v1.NecConfigAPI;
import elocindev.necronomicon.config.NecConfig;

public class Config {
    @NecConfig
    public static Config INSTANCE;

    public String getFile() {
        return NecConfigAPI.getFile("animals.json");
    }

    public boolean enable_animal_plushies = true;
}
