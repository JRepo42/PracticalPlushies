package com.practical_plushies_animals.datagen;

import com.practical_plushies_animals.registry.PlushieItemGroupRegistry;
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
        translationBuilder.add("itemGroup.practical_plushies_animals.plushieGroup", "Practical Plushies - Animals!");
        translationBuilder.add(PlushieRegistry.ALLAY_PLUSHIE, "Allay Plushie");
        translationBuilder.add(PlushieRegistry.AXOLOTL_PLUSHIE, "Axolotl Plushie");
        translationBuilder.add(PlushieRegistry.BEE_PLUSHIE, "Bee Plushie");
        translationBuilder.add(PlushieRegistry.CHICKEN_PLUSHIE, "Chicken Plushie");
        translationBuilder.add(PlushieRegistry.COW_PLUSHIE, "Cow Plushie");
        translationBuilder.add(PlushieRegistry.FOX_PLUSHIE, "Fox Plushie");
        translationBuilder.add(PlushieRegistry.PARROT_PLUSHIE, "Parrot Plushie");
        translationBuilder.add(PlushieRegistry.PIG_PLUSHIE, "Pig Plushie");
        translationBuilder.add(PlushieRegistry.SHEEP_PLUSHIE, "Sheep Plushie");
        translationBuilder.add(PlushieRegistry.TURTLE_PLUSHIE, "Turtle Plushie");
    }
}
