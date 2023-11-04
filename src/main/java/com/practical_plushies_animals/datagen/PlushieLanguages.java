package com.practical_plushies_animals.datagen;

import com.practical_plushies_animals.registry.PlushieRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

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

        translationBuilder.add(PlushieRegistry.CAMEL_PLUSHIE, "Camel Plushie");
        translationBuilder.add(PlushieRegistry.HORSE_PLUSHIE, "Horse Plushie");
        translationBuilder.add(PlushieRegistry.MOOSHROOM_PLUSHIE, "Mooshroom Plushie");
        translationBuilder.add(PlushieRegistry.FROG_PLUSHIE, "Frog Plushie");
        translationBuilder.add(PlushieRegistry.RABBIT_PLUSHIE, "Rabbit Plushie");
        translationBuilder.add(PlushieRegistry.CAT_PLUSHIE, "Cat Plushie");
        translationBuilder.add(PlushieRegistry.WOLF_PLUSHIE, "Wolf Plushie");
        translationBuilder.add(PlushieRegistry.SNIFFER_PLUSHIE, "Sniffer Plushie");
        translationBuilder.add(PlushieRegistry.DOLPHIN_PLUSHIE, "Dolphin Plushie");
        translationBuilder.add(PlushieRegistry.PANDA_PLUSHIE, "Panda Plushie");
    }
}
