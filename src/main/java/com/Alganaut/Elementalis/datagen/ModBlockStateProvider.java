package com.Alganaut.Elementalis.datagen;

import com.Alganaut.Elementalis.Elementalis;
import com.Alganaut.Elementalis.registry.block.ModBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SaplingBlock;
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
        blockWithItem(ModBlocks.TOMBSOIL);
        blockWithItem(ModBlocks.POLISHED_TOMBSTONE);
        blockWithItem(ModBlocks.TOMBSTONE_BRICKS);
        blockWithItem(ModBlocks.BLOOMING_TOMBSTONE_BRICKS);
        blockWithItem(ModBlocks.CRACKED_TOMBSTONE_BRICKS);
        blockWithItem(ModBlocks.CHISELED_TOMBSTONE_BRICKS);
        blockWithItem(ModBlocks.MOROSE_PLANKS);
        blockWithItem(ModBlocks.CASKET_PLANKS);

        stairsBlock(ModBlocks.TOMBSTONE_STAIRS.get(), blockTexture(ModBlocks.TOMBSTONE.get()));
        stairsBlock(ModBlocks.POLISHED_TOMBSTONE_STAIRS.get(), blockTexture(ModBlocks.POLISHED_TOMBSTONE.get()));
        stairsBlock(ModBlocks.TOMBSTONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.TOMBSTONE_BRICKS.get()));
        stairsBlock(ModBlocks.MOROSE_STAIRS.get(), blockTexture(ModBlocks.MOROSE_PLANKS.get()));
        stairsBlock(ModBlocks.CASKET_STAIRS.get(), blockTexture(ModBlocks.CASKET_PLANKS.get()));

        slabBlock(ModBlocks.TOMBSTONE_SLAB.get(), blockTexture(ModBlocks.TOMBSTONE.get()), blockTexture(ModBlocks.TOMBSTONE.get()));
        slabBlock(ModBlocks.POLISHED_TOMBSTONE_SLAB.get(), blockTexture(ModBlocks.POLISHED_TOMBSTONE.get()), blockTexture(ModBlocks.POLISHED_TOMBSTONE.get()));
        slabBlock(ModBlocks.TOMBSTONE_BRICK_SLAB.get(), blockTexture(ModBlocks.TOMBSTONE_BRICKS.get()), blockTexture(ModBlocks.TOMBSTONE_BRICKS.get()));
        slabBlock(ModBlocks.MOROSE_SLAB.get(), blockTexture(ModBlocks.MOROSE_PLANKS.get()), blockTexture(ModBlocks.MOROSE_PLANKS.get()));
        slabBlock(ModBlocks.CASKET_SLAB.get(), blockTexture(ModBlocks.CASKET_PLANKS.get()), blockTexture(ModBlocks.CASKET_PLANKS.get()));

        wallBlock(ModBlocks.TOMBSTONE_WALL.get(), blockTexture(ModBlocks.TOMBSTONE.get()));
        wallBlock(ModBlocks.POLISHED_TOMBSTONE_WALL.get(), blockTexture(ModBlocks.POLISHED_TOMBSTONE.get()));
        wallBlock(ModBlocks.TOMBSTONE_BRICK_WALL.get(), blockTexture(ModBlocks.TOMBSTONE_BRICKS.get()));

        doorBlockWithRenderType(ModBlocks.BLACK_IRON_DOOR.get(), modLoc("block/black_iron_door_bottom"), modLoc("block/black_iron_door_top"), "cutout");
        trapdoorBlockWithRenderType(ModBlocks.BLACK_IRON_TRAPDOOR.get(), modLoc("block/black_iron_trapdoor"), true, "cutout");

        doorBlockWithRenderType(ModBlocks.MOROSE_DOOR.get(), modLoc("block/morose_door_bottom"), modLoc("block/morose_door_top"), "cutout");
        trapdoorBlockWithRenderType(ModBlocks.MOROSE_TRAPDOOR.get(), modLoc("block/morose_trapdoor"), true, "cutout");

        doorBlockWithRenderType(ModBlocks.CASKET_DOOR.get(), modLoc("block/casket_door_bottom"), modLoc("block/casket_door_top"), "cutout");
        trapdoorBlockWithRenderType(ModBlocks.CASKET_TRAPDOOR.get(), modLoc("block/casket_trapdoor"), true, "cutout");

        paneBlockWithRenderType((IronBarsBlock)ModBlocks.BLACK_IRON_BARS.get(), modLoc("block/black_iron_bars"), modLoc("block/black_iron_bars_top"), "translucent");

        blockItem(ModBlocks.TOMBSTONE_STAIRS);
        blockItem(ModBlocks.POLISHED_TOMBSTONE_STAIRS);
        blockItem(ModBlocks.TOMBSTONE_BRICK_STAIRS);
        blockItem(ModBlocks.MOROSE_STAIRS);
        blockItem(ModBlocks.CASKET_STAIRS);

        blockItem(ModBlocks.TOMBSTONE_SLAB);
        blockItem(ModBlocks.POLISHED_TOMBSTONE_SLAB);
        blockItem(ModBlocks.TOMBSTONE_BRICK_SLAB);
        blockItem(ModBlocks.MOROSE_SLAB);
        blockItem(ModBlocks.CASKET_SLAB);
        blockItem(ModBlocks.MOROSE_PRESSURE_PLATE);
        blockItem(ModBlocks.CASKET_PRESSURE_PLATE);

        blockItem(ModBlocks.MOROSE_BRANCH);
        blockItem(ModBlocks.MOROSE_WOOD);
        blockItem(ModBlocks.STRIPPED_MOROSE_BRANCH);
        blockItem(ModBlocks.STRIPPED_MOROSE_WOOD);

        blockItem(ModBlocks.CASKET_LOG);
        blockItem(ModBlocks.CASKET_WOOD);
        blockItem(ModBlocks.STRIPPED_CASKET_LOG);
        blockItem(ModBlocks.STRIPPED_CASKET_WOOD);

        blockItem(ModBlocks.TOMBSTONE_PILLAR);

        leavesBlock(ModBlocks.MOROSE_LEAVES);
        leavesBlock(ModBlocks.BUDDING_MOROSE_LEAVES);
        saplingBlock(ModBlocks.MOROSE_BUD);
        saplingBlock(ModBlocks.CASKET_SAPLING);

        paneBlockWithRenderType(ModBlocks.BLACK_IRON_BARS);

        blockItem(ModBlocks.MOROSE_FENCE_GATE);
        blockItem(ModBlocks.CASKET_FENCE_GATE);

        buttonBlock(ModBlocks.MOROSE_BUTTON.get(), blockTexture(ModBlocks.MOROSE_PLANKS.get()));
        buttonBlock(ModBlocks.CASKET_BUTTON.get(), blockTexture(ModBlocks.CASKET_PLANKS.get()));

        fenceBlock(ModBlocks.MOROSE_FENCE.get(), blockTexture(ModBlocks.MOROSE_PLANKS.get()));
        fenceBlock(ModBlocks.CASKET_FENCE.get(), blockTexture(ModBlocks.CASKET_PLANKS.get()));
        fenceGateBlock(ModBlocks.MOROSE_FENCE_GATE.get(), blockTexture(ModBlocks.MOROSE_PLANKS.get()));
        fenceGateBlock(ModBlocks.CASKET_FENCE_GATE.get(), blockTexture(ModBlocks.CASKET_PLANKS.get()));

        blockItem(ModBlocks.BLACK_IRON_TRAPDOOR, "_bottom");
        blockItem(ModBlocks.MOROSE_TRAPDOOR, "_bottom");
        blockItem(ModBlocks.CASKET_TRAPDOOR, "_bottom");

        pressurePlateBlock(ModBlocks.MOROSE_PRESSURE_PLATE.get(), blockTexture(ModBlocks.MOROSE_PLANKS.get()));
        pressurePlateBlock(ModBlocks.CASKET_PRESSURE_PLATE.get(), blockTexture(ModBlocks.CASKET_PLANKS.get()));

        logBlock(((RotatedPillarBlock) ModBlocks.MOROSE_BRANCH.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.CASKET_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.MOROSE_WOOD.get()), blockTexture(ModBlocks.MOROSE_BRANCH.get()), blockTexture(ModBlocks.MOROSE_BRANCH.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.CASKET_WOOD.get()), blockTexture(ModBlocks.CASKET_LOG.get()), blockTexture(ModBlocks.CASKET_LOG.get()));

        logBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_MOROSE_BRANCH.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_CASKET_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_MOROSE_WOOD.get()), blockTexture(ModBlocks.STRIPPED_MOROSE_BRANCH.get()), blockTexture(ModBlocks.STRIPPED_MOROSE_BRANCH.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_CASKET_WOOD.get()), blockTexture(ModBlocks.STRIPPED_CASKET_LOG.get()), blockTexture(ModBlocks.STRIPPED_CASKET_LOG.get()));

        logBlock(((RotatedPillarBlock) ModBlocks.TOMBSTONE_PILLAR.get()));

    }

    private void paneBlockWithRenderType(DeferredBlock<IronBarsBlock> blackIronBars) {
    }

    private void saplingBlock(DeferredBlock<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(BuiltInRegistries.BLOCK.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void leavesBlock(DeferredBlock<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().singleTexture(BuiltInRegistries.BLOCK.getKey(blockRegistryObject.get()).getPath(), ResourceLocation.parse("minecraft:block/leaves"),
                        "all", blockTexture(blockRegistryObject.get())).renderType("cutout"));
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
