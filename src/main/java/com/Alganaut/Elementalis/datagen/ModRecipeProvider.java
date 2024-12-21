package com.Alganaut.Elementalis.datagen;

import com.Alganaut.Elementalis.Elementalis;
import com.Alganaut.Elementalis.registry.block.ModBlocks;
import com.Alganaut.Elementalis.registry.item.ModItems;
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

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BLIGHT_POWDER.get(), 2)
                .requires(ModItems.BLIGHT_ROD)
                .unlockedBy("has_blight_rod", has(ModItems.BLIGHT_ROD)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.UNDEAD_CHARGE.get(), 1)
                .pattern(" B ")
                .pattern("BRB")
                .pattern(" B ")
                .define('B', ModItems.BLIGHT_POWDER)
                .define('R', Items.ROTTEN_FLESH)
                .unlockedBy("has_blight_rod", has(ModItems.BLIGHT_ROD)).save(recipeOutput);

        trimSmithing(recipeOutput, ModItems.PERISH_SMITHING_TEMPLATE.get(), ResourceLocation.fromNamespaceAndPath(Elementalis.MODID, "perish"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PERISH_SMITHING_TEMPLATE.get(), 2)
                .pattern("DPD")
                .pattern("DBD")
                .pattern("DDD")
                .define('B', ModItems.BLIGHT_ROD)
                .define('D', Items.DIAMOND)
                .define('P', ModItems.PERISH_SMITHING_TEMPLATE)
                .unlockedBy("has_perish_smithing_template", has(ModItems.PERISH_SMITHING_TEMPLATE)).save(recipeOutput);

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

        stairBuilder(ModBlocks.MOROSE_STAIRS.get(), Ingredient.of(ModBlocks.MOROSE_PLANKS)).group("morose_planks")
                .unlockedBy("has_morose_planks", has(ModBlocks.MOROSE_PLANKS)).save(recipeOutput);

        doorBuilder(ModBlocks.MOROSE_DOOR.get(), Ingredient.of(ModBlocks.MOROSE_PLANKS)).group("morose_planks")
                .unlockedBy("has_morose_planks", has(ModBlocks.MOROSE_PLANKS)).save(recipeOutput);

        trapdoorBuilder(ModBlocks.MOROSE_TRAPDOOR.get(), Ingredient.of(ModBlocks.MOROSE_PLANKS)).group("morose_planks")
                .unlockedBy("has_morose_planks", has(ModBlocks.MOROSE_PLANKS)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOROSE_PLANKS.get(), 4)
                .requires(ModBlocks.MOROSE_BRANCH)
                .unlockedBy("has_morose_branch", has(ModBlocks.MOROSE_BRANCH)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOROSE_PLANKS.get(), 3)
                .requires(ModBlocks.MOROSE_WOOD)
                .unlockedBy("has_morose_branch", has(ModBlocks.MOROSE_BRANCH)).save(recipeOutput, "elementalis:morose_planks_2");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOROSE_PLANKS.get(), 4)
                .requires(ModBlocks.STRIPPED_MOROSE_BRANCH)
                .unlockedBy("has_morose_branch", has(ModBlocks.MOROSE_BRANCH)).save(recipeOutput, "elementalis:morose_planks_3");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOROSE_PLANKS.get(), 3)
                .requires(ModBlocks.STRIPPED_MOROSE_WOOD)
                .unlockedBy("has_morose_branch", has(ModBlocks.MOROSE_BRANCH)).save(recipeOutput, "elementalis:morose_planks_4");

        pressurePlate(recipeOutput, ModBlocks.MOROSE_PRESSURE_PLATE.get(), ModBlocks.MOROSE_PLANKS.get());

    }

}
