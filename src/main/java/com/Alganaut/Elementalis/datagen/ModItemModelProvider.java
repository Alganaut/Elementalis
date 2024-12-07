package com.Alganaut.Elementalis.datagen;

import com.Alganaut.Elementalis.Elementalis;
import com.Alganaut.Elementalis.block.ModBlocks;
import com.Alganaut.Elementalis.item.Moditems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Elementalis.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(Moditems.SIX_MUSIC_DISC.get());
        basicItem(Moditems.BLIGHT_ROD.get());
        basicItem(Moditems.BLIGHT_POWDER.get());
        basicItem(Moditems.UNDEAD_CHARGE.get());
        basicItem(Moditems.PERISH_SMITHING_TEMPLATE.get());

        wallItem(ModBlocks.TOMBSTONE_WALL, ModBlocks.TOMBSTONE);
        wallItem(ModBlocks.POLISHED_TOMBSTONE_WALL, ModBlocks.POLISHED_TOMBSTONE);
        wallItem(ModBlocks.TOMBSTONE_BRICK_WALL, ModBlocks.TOMBSTONE_BRICKS);

        basicItem(ModBlocks.BLACK_IRON_DOOR.asItem());

    }

    public void wallItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  ResourceLocation.fromNamespaceAndPath(Elementalis.MODID,
                        "block/" + baseBlock.getId().getPath()));
}}
