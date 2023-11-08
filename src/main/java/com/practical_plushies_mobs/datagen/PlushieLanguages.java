package com.practical_plushies_mobs.datagen;

import com.practical_plushies_mobs.registry.PlushieRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class PlushieLanguages extends FabricLanguageProvider {
    protected PlushieLanguages(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add("itemGroup.practical_plushies_mobs.plushieGroup", "Practical Plushies - Mobs!");

        translationBuilder.add(PlushieRegistry.CREEPER_PLUSHIE, "Creeper Plushie");
        translationBuilder.add(PlushieRegistry.ENDERMAN_PLUSHIE, "Enderman Plushie");
        translationBuilder.add(PlushieRegistry.GHAST_PLUSHIE, "Ghast Plushie");
        translationBuilder.add(PlushieRegistry.PHANTOM_PLUSHIE, "Phantom Plushie");
        translationBuilder.add(PlushieRegistry.SKELETON_PLUSHIE, "Skeleton Plushie");
        translationBuilder.add(PlushieRegistry.SPIDER_PLUSHIE, "Spider Plushie");
        translationBuilder.add(PlushieRegistry.WITCH_PLUSHIE, "Witch Plushie");
        translationBuilder.add(PlushieRegistry.WITHER_SKELETON_PLUSHIE, "Wither Skeleton Plushie");
        translationBuilder.add(PlushieRegistry.ZOGLIN_PLUSHIE, "Zoglin Plushie");
        translationBuilder.add(PlushieRegistry.ZOMBIE_PLUSHIE, "Zombie Plushie");
        translationBuilder.add(PlushieRegistry.SKELETON_HORSE_PLUSHIE, "Skeleton Horse Plushie");
    }
}
