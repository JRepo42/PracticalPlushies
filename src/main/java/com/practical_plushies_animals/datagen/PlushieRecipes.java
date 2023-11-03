package com.practical_plushies_animals.datagen;

import com.practical_plushies_animals.plushies.Plushie;
import com.practical_plushies_animals.registry.PlushieRegistry;
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
        generatePlushieRecipe(PlushieRegistry.BEE_PLUSHIE, Blocks.YELLOW_WOOL, Blocks.BLACK_WOOL, Items.HONEYCOMB, exporter);
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
