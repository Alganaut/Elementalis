package com.Alganaut.Elementalis.datagen;

import com.Alganaut.Elementalis.Elementalis;
import com.Alganaut.Elementalis.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Elementalis.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
blockWithItem(ModBlocks.TOMBSTONE);
        blockWithItem(ModBlocks.POLISHED_TOMBSTONE);
        blockWithItem(ModBlocks.TOMBSTONE_BRICKS);
        blockWithItem(ModBlocks.BLOOMING_TOMBSTONE_BRICKS);
        blockWithItem(ModBlocks.CRACKED_TOMBSTONE_BRICKS);
        blockWithItem(ModBlocks.CHISELED_TOMBSTONE_BRICKS);
        blockWithItem(ModBlocks.TOMBSTONE_PILLAR);

        stairsBlock(ModBlocks.TOMBSTONE_STAIRS.get(), blockTexture(ModBlocks.TOMBSTONE.get()));
        stairsBlock(ModBlocks.POLISHED_TOMBSTONE_STAIRS.get(), blockTexture(ModBlocks.POLISHED_TOMBSTONE.get()));
        stairsBlock(ModBlocks.TOMBSTONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.TOMBSTONE_BRICKS.get()));

        slabBlock(ModBlocks.TOMBSTONE_SLAB.get(), blockTexture(ModBlocks.TOMBSTONE.get()), blockTexture(ModBlocks.TOMBSTONE.get()));
        slabBlock(ModBlocks.POLISHED_TOMBSTONE_SLAB.get(), blockTexture(ModBlocks.POLISHED_TOMBSTONE.get()), blockTexture(ModBlocks.POLISHED_TOMBSTONE.get()));
        slabBlock(ModBlocks.TOMBSTONE_BRICK_SLAB.get(), blockTexture(ModBlocks.TOMBSTONE_BRICKS.get()), blockTexture(ModBlocks.TOMBSTONE_BRICKS.get()));

        wallBlock(ModBlocks.TOMBSTONE_WALL.get(), blockTexture(ModBlocks.TOMBSTONE.get()));
        wallBlock(ModBlocks.POLISHED_TOMBSTONE_WALL.get(), blockTexture(ModBlocks.POLISHED_TOMBSTONE.get()));
        wallBlock(ModBlocks.TOMBSTONE_BRICK_WALL.get(), blockTexture(ModBlocks.TOMBSTONE_BRICKS.get()));

        doorBlockWithRenderType(ModBlocks.BLACK_IRON_DOOR.get(), modLoc("block/black_iron_door_bottom"), modLoc("block/black_iron_door_top"), "cutout");
        trapdoorBlockWithRenderType(ModBlocks.BLACK_IRON_TRAPDOOR.get(), modLoc("block/black_iron_trapdoor"), true, "cutout");

        blockItem(ModBlocks.TOMBSTONE_STAIRS);
        blockItem(ModBlocks.POLISHED_TOMBSTONE_STAIRS);
        blockItem(ModBlocks.TOMBSTONE_BRICK_STAIRS);

        blockItem(ModBlocks.TOMBSTONE_SLAB);
        blockItem(ModBlocks.POLISHED_TOMBSTONE_SLAB);
        blockItem(ModBlocks.TOMBSTONE_BRICK_SLAB);

        blockItem(ModBlocks.BLACK_IRON_TRAPDOOR, "_bottom");

    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));

    }
    private void blockItem(DeferredBlock<?> deferredBlock) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("elementalis:block/" + deferredBlock.getId().getPath()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock, String appendix) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("elementalis:block/" + deferredBlock.getId().getPath() + appendix));
}}
