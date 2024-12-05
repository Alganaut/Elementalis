package com.Alganaut.Elementalis.datagen;

import com.Alganaut.Elementalis.block.ModBlocks;
import com.Alganaut.Elementalis.item.Moditems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_TOMBSTONE.get(), 4)
                .pattern("TT")
                .pattern("TT")
                .define('T', ModBlocks.TOMBSTONE.get())
                .unlockedBy("has_tombstone", has(ModBlocks.TOMBSTONE)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TOMBSTONE_BRICKS.get(), 4)
                .pattern("PP")
                .pattern("PP")
                .define('P', ModBlocks.POLISHED_TOMBSTONE.get())
                .unlockedBy("has_polished_tombstone", has(ModBlocks.POLISHED_TOMBSTONE)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Moditems.BLIGHT_POWDER.get(), 2)
                .requires(Moditems.BLIGHT_ROD)
                .unlockedBy("has_blight_rod", has(Moditems.BLIGHT_ROD)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Moditems.UNDEAD_CHARGE.get(), 1)
                .pattern(" B ")
                .pattern("BRB")
                .pattern(" B ")
                .define('B', Moditems.BLIGHT_POWDER)
                .define('R', Items.ROTTEN_FLESH)
                .unlockedBy("has_blight_powder", has(Moditems.BLIGHT_POWDER)).save(recipeOutput);

    }
}
