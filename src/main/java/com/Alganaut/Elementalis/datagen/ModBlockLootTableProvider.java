package com.Alganaut.Elementalis.datagen;

import com.Alganaut.Elementalis.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.TOMBSTONE.get());
        dropSelf(ModBlocks.POLISHED_TOMBSTONE.get());
        dropSelf(ModBlocks.TOMBSTONE_BRICKS.get());
        dropSelf(ModBlocks.BLOOMING_TOMBSTONE_BRICKS.get());
        dropSelf(ModBlocks.CRACKED_TOMBSTONE_BRICKS.get());
        dropSelf(ModBlocks.CHISELED_TOMBSTONE_BRICKS.get());

        dropSelf(ModBlocks.TOMBSTONE_PILLAR.get());

        dropSelf(ModBlocks.TOMBSTONE_STAIRS.get());
        dropSelf(ModBlocks.POLISHED_TOMBSTONE_STAIRS.get());
        dropSelf(ModBlocks.TOMBSTONE_BRICK_STAIRS.get());

            dropSelf(ModBlocks.TOMBSTONE_WALL.get());
        dropSelf(ModBlocks.POLISHED_TOMBSTONE_WALL.get());
        dropSelf(ModBlocks.TOMBSTONE_BRICK_WALL.get());

        dropSelf(ModBlocks.BLACK_IRON_TRAPDOOR.get());

        add(ModBlocks.BLACK_IRON_DOOR.get(),
                block -> createDoorTable(ModBlocks.BLACK_IRON_DOOR.get()));

        add(ModBlocks.TOMBSTONE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.TOMBSTONE_SLAB.get()));

        add(ModBlocks.POLISHED_TOMBSTONE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.POLISHED_TOMBSTONE_SLAB.get()));

        add(ModBlocks.TOMBSTONE_BRICK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.TOMBSTONE_BRICK_SLAB.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
