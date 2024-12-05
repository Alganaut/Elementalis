package com.Alganaut.Elementalis.datagen;

import com.Alganaut.Elementalis.Elementalis;
import com.Alganaut.Elementalis.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
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
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
}
