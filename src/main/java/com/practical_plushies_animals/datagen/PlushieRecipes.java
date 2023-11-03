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
        generatePlushieRecipe(PlushieRegistry.ALLAY_PLUSHIE, Blocks.LIGHT_BLUE_WOOL, Blocks.CYAN_WOOL, Items.IRON_INGOT, exporter);
        generatePlushieRecipe(PlushieRegistry.AXOLOTL_PLUSHIE, Blocks.PINK_WOOL, Blocks.MAGENTA_WOOL, Items.WATER_BUCKET, exporter);
        generatePlushieRecipe(PlushieRegistry.BEE_PLUSHIE, Blocks.YELLOW_WOOL, Blocks.BLACK_WOOL, Items.HONEYCOMB, exporter);
        generatePlushieRecipe(PlushieRegistry.CHICKEN_PLUSHIE, Blocks.LIGHT_GRAY_WOOL, Blocks.GRAY_WOOL, Items.EGG, exporter);
        generatePlushieRecipe(PlushieRegistry.COW_PLUSHIE, Blocks.BROWN_WOOL, Blocks.LIGHT_GRAY_WOOL, Items.MILK_BUCKET, exporter);
        generatePlushieRecipe(PlushieRegistry.FOX_PLUSHIE, Blocks.ORANGE_WOOL, Blocks.BROWN_WOOL, Items.SWEET_BERRIES, exporter);
        generatePlushieRecipe(PlushieRegistry.PARROT_PLUSHIE, Blocks.RED_WOOL, Blocks.LIGHT_BLUE_WOOL, Items.FEATHER, exporter);
        generatePlushieRecipe(PlushieRegistry.PIG_PLUSHIE, Blocks.PINK_WOOL, Blocks.MAGENTA_WOOL, Items.CARROT, exporter);
        generatePlushieRecipe(PlushieRegistry.SHEEP_PLUSHIE, Blocks.WHITE_WOOL, Blocks.LIGHT_GRAY_WOOL, Items.WHEAT, exporter);
        generatePlushieRecipe(PlushieRegistry.TURTLE_PLUSHIE, Blocks.LIME_WOOL, Blocks.GREEN_WOOL, Items.SEAGRASS, exporter);
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
