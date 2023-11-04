package com.practical_plushies_animals.datagen;

import com.practical_plushies_animals.registry.PlushieRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

import java.util.ArrayList;

public class PlushieLanguages extends FabricLanguageProvider {
    protected PlushieLanguages(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(PlushieRegistry.ALLAY_PLUSHIE, "Allay Plushie");
    }
}
