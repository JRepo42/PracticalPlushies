package com.practical_plushies_mobs.registry;

import com.practical_plushies_mobs.PracticalPlushiesMobs;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Block;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.ArrayList;

public class PlushieItemGroupRegistry {
    private static Block[] plushieArray;

    public static void addItemGroupEntries(ArrayList<Block> blockArray) {
        PracticalPlushiesMobs.LOGGER.info(blockArray.toString());
        plushieArray = blockArray.toArray(new Block[0]);
    }

    private static final ItemGroup ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(PlushieRegistry.FOX_PLUSHIE))
            .displayName(Text.translatable("itemGroup.practical_plushies_animals.plushieGroup"))
            .entries((context, entries) -> {
                for (int i = 0; i < plushieArray.length; i++) {
                    entries.add(plushieArray[i]);
                }
            })
            .build();

    public static void register() {
        Registry.register(Registries.ITEM_GROUP, new Identifier(PracticalPlushiesMobs.MODID, "plushie_group"), ITEM_GROUP);
    }
}
