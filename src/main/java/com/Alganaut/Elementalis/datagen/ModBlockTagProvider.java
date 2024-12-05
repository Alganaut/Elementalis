package com.Alganaut.Elementalis.datagen;

import com.Alganaut.Elementalis.Elementalis;
import com.Alganaut.Elementalis.block.ModBlocks;
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
                .add(ModBlocks.TOMBSTONE_PILLAR.get());

        tag(BlockTags.NEEDS_IRON_TOOL);

    }
}
