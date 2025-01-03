package com.Alganaut.Elementalis.datagen;

import com.Alganaut.Elementalis.Elementalis;
import com.Alganaut.Elementalis.registry.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Elementalis.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.TOMBSTONE.get())
                .add(ModBlocks.POLISHED_TOMBSTONE.get())
                .add(ModBlocks.TOMBSTONE_BRICKS.get())
                .add(ModBlocks.BLOOMING_TOMBSTONE_BRICKS.get())
                .add(ModBlocks.CRACKED_TOMBSTONE_BRICKS.get())
                .add(ModBlocks.CHISELED_TOMBSTONE_BRICKS.get())
                .add(ModBlocks.TOMBSTONE_PILLAR.get())
                .add(ModBlocks.TOMBSTONE_SLAB.get())
                .add(ModBlocks.TOMBSTONE_STAIRS.get())
                .add(ModBlocks.TOMBSTONE_WALL.get())
                .add(ModBlocks.POLISHED_TOMBSTONE_STAIRS.get())
                .add(ModBlocks.POLISHED_TOMBSTONE_SLAB.get())
                .add(ModBlocks.POLISHED_TOMBSTONE_WALL.get())
                .add(ModBlocks.TOMBSTONE_BRICK_STAIRS.get())
                .add(ModBlocks.TOMBSTONE_BRICK_SLAB.get())
                .add(ModBlocks.TOMBSTONE_BRICK_WALL.get())
                .add(ModBlocks.TOMBSTONE_BRICK_WALL.get())
                .add(ModBlocks.BLACK_IRON_DOOR.get())
                .add(ModBlocks.BLACK_IRON_TRAPDOOR.get())
                .add(ModBlocks.BLACK_IRON_BARS.get());

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.BLACK_IRON_DOOR.get())
                .add(ModBlocks.BLACK_IRON_TRAPDOOR.get())
                .add(ModBlocks.BLACK_IRON_BARS.get());


        tag(BlockTags.WALLS).add(ModBlocks.TOMBSTONE_WALL.get());
        tag(BlockTags.WALLS).add(ModBlocks.POLISHED_TOMBSTONE_WALL.get());
        tag(BlockTags.WALLS).add(ModBlocks.TOMBSTONE_BRICK_WALL.get());
        tag(BlockTags.WOODEN_FENCES).add(ModBlocks.MOROSE_FENCE.get());
        tag(BlockTags.WOODEN_FENCES).add(ModBlocks.CASKET_FENCE.get());
        tag(BlockTags.FENCE_GATES).add(ModBlocks.MOROSE_FENCE_GATE.get());
        tag(BlockTags.FENCE_GATES).add(ModBlocks.CASKET_FENCE_GATE.get());

        this.tag(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.MOROSE_BRANCH.get())
                .add(ModBlocks.STRIPPED_MOROSE_BRANCH.get())
                .add(ModBlocks.MOROSE_WOOD.get())
                .add(ModBlocks.STRIPPED_MOROSE_WOOD.get())
                .add(ModBlocks.CASKET_LOG.get())
                .add(ModBlocks.STRIPPED_CASKET_LOG.get())
                .add(ModBlocks.CASKET_WOOD.get())
                .add(ModBlocks.STRIPPED_CASKET_WOOD.get());
    }
}
