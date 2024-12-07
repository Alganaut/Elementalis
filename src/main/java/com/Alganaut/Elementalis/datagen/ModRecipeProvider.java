package com.Alganaut.Elementalis.datagen;

import com.Alganaut.Elementalis.Elementalis;
import com.Alganaut.Elementalis.block.ModBlocks;
import com.Alganaut.Elementalis.item.Moditems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
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
                .unlockedBy("has_tombstone", has(ModBlocks.TOMBSTONE)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Moditems.BLIGHT_POWDER.get(), 2)
                .requires(Moditems.BLIGHT_ROD)
                .unlockedBy("has_blight_rod", has(Moditems.BLIGHT_ROD)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Moditems.UNDEAD_CHARGE.get(), 1)
                .pattern(" B ")
                .pattern("BRB")
                .pattern(" B ")
                .define('B', Moditems.BLIGHT_POWDER)
                .define('R', Items.ROTTEN_FLESH)
                .unlockedBy("has_blight_rod", has(Moditems.BLIGHT_ROD)).save(recipeOutput);

        trimSmithing(recipeOutput, Moditems.PERISH_SMITHING_TEMPLATE.get(), ResourceLocation.fromNamespaceAndPath(Elementalis.MODID, "perish"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Moditems.PERISH_SMITHING_TEMPLATE.get(), 2)
                .pattern("DPD")
                .pattern("DBD")
                .pattern("DDD")
                .define('B', Moditems.BLIGHT_ROD)
                .define('D', Items.DIAMOND)
                .define('P', Moditems.PERISH_SMITHING_TEMPLATE)
                .unlockedBy("has_perish_smithing_template", has(Moditems.PERISH_SMITHING_TEMPLATE)).save(recipeOutput);

        stairBuilder(ModBlocks.TOMBSTONE_STAIRS.get(), Ingredient.of(ModBlocks.TOMBSTONE)).group("tombstone")
                .unlockedBy("has_tombstone", has(ModBlocks.TOMBSTONE)).save(recipeOutput);

        stairBuilder(ModBlocks.POLISHED_TOMBSTONE_STAIRS.get(), Ingredient.of(ModBlocks.POLISHED_TOMBSTONE)).group("tombstone")
                .unlockedBy("has_tombstone", has(ModBlocks.TOMBSTONE)).save(recipeOutput);

        stairBuilder(ModBlocks.TOMBSTONE_BRICK_STAIRS.get(), Ingredient.of(ModBlocks.TOMBSTONE)).group("tombstone")
                .unlockedBy("has_tombstone", has(ModBlocks.TOMBSTONE)).save(recipeOutput);

        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.TOMBSTONE_SLAB.get(), ModBlocks.TOMBSTONE.get());

        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_TOMBSTONE_SLAB.get(), ModBlocks.POLISHED_TOMBSTONE.get());

        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.TOMBSTONE_BRICK_SLAB.get(), ModBlocks.TOMBSTONE_BRICKS.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLACK_IRON_DOOR.get(), 3)
                .pattern(" II")
                .pattern("BII")
                .pattern(" II")
                .define('I', Items.IRON_INGOT)
                .define('B', Items.BLACK_DYE)
                .unlockedBy("has_iron_ingot", has(Items.IRON_INGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLACK_IRON_TRAPDOOR.get(), 4)
                .pattern(" B ")
                .pattern("III")
                .pattern("III")
                .define('I', Items.IRON_INGOT)
                .define('B', Items.BLACK_DYE)
                .unlockedBy("has_iron_ingot", has(Items.IRON_INGOT)).save(recipeOutput);

    }

}
