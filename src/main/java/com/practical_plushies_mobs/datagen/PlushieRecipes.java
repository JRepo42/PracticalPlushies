package com.practical_plushies_mobs.datagen;

import com.practical_plushies_mobs.registry.PlushieRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.function.Consumer;

public class PlushieRecipes extends FabricRecipeProvider {
    public PlushieRecipes(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        // Todo: fix recipes
        generatePlushieRecipe(PlushieRegistry.CREEPER_PLUSHIE, Blocks.LIME_WOOL, Blocks.GREEN_WOOL, Items.GUNPOWDER, exporter);
        generatePlushieRecipe(PlushieRegistry.ENDERMAN_PLUSHIE, Blocks.BLACK_WOOL, Blocks.MAGENTA_WOOL, Items.ENDER_EYE, exporter);
        generatePlushieRecipe(PlushieRegistry.GHAST_PLUSHIE, Blocks.WHITE_WOOL, Blocks.LIGHT_GRAY_WOOL, Items.GHAST_TEAR, exporter);
        generatePlushieRecipe(PlushieRegistry.PHANTOM_PLUSHIE, Blocks.BLUE_WOOL, Blocks.LIGHT_GRAY_WOOL, Items.PHANTOM_MEMBRANE, exporter);
        generatePlushieRecipe(PlushieRegistry.SKELETON_PLUSHIE, Blocks.WHITE_WOOL, Blocks.LIGHT_GRAY_WOOL, Items.BOW, exporter);
        generatePlushieRecipe(PlushieRegistry.SPIDER_PLUSHIE, Blocks.BLACK_WOOL, Blocks.GRAY_WOOL, Items.STRING, exporter);
        generatePlushieRecipe(PlushieRegistry.WITCH_PLUSHIE, Blocks.PURPLE_WOOL, Blocks.GRAY_WOOL, Items.RED_MUSHROOM, exporter);
        generatePlushieRecipe(PlushieRegistry.WITHER_SKELETON_PLUSHIE, Blocks.BLACK_WOOL, Blocks.GRAY_WOOL, Items.COAL, exporter);
        generatePlushieRecipe(PlushieRegistry.ZOGLIN_PLUSHIE, Blocks.PINK_WOOL, Blocks.LIGHT_GRAY_WOOL, Items.GOLD_INGOT, exporter);
        generatePlushieRecipe(PlushieRegistry.ZOMBIE_PLUSHIE, Blocks.GREEN_WOOL, Blocks.PURPLE_WOOL, Items.ROTTEN_FLESH, exporter);
        generatePlushieRecipe(PlushieRegistry.SKELETON_HORSE_PLUSHIE, Blocks.WHITE_WOOL, Blocks.LIGHT_GRAY_WOOL, Items.SADDLE, exporter);
    }

    private void generatePlushieRecipe(Block outputPlushie, Block primaryWool, Block secondaryWool, Item specialItem, Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, outputPlushie).pattern(" # ").pattern("#s#").pattern("i#i")
                .input('#', primaryWool)
                .input('i', secondaryWool)
                .input('s', specialItem)
                .criterion(FabricRecipeProvider.hasItem(primaryWool),
                        FabricRecipeProvider.conditionsFromItem(primaryWool))
                .criterion(FabricRecipeProvider.hasItem(secondaryWool),
                        FabricRecipeProvider.conditionsFromItem(secondaryWool))
                .criterion(FabricRecipeProvider.hasItem(specialItem),
                        FabricRecipeProvider.conditionsFromItem(specialItem))
                .offerTo(exporter);
    }
}
