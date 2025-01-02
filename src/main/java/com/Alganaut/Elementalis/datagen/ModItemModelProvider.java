package com.Alganaut.Elementalis.datagen;

import com.Alganaut.Elementalis.Elementalis;
import com.Alganaut.Elementalis.registry.block.ModBlocks;
import com.Alganaut.Elementalis.registry.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Elementalis.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.SIX_MUSIC_DISC.get());
        basicItem(ModItems.BLIGHT_ROD.get());
        basicItem(ModItems.BLIGHT_POWDER.get());
        basicItem(ModItems.UNDEAD_CHARGE.get());
        basicItem(ModItems.PERISH_SMITHING_TEMPLATE.get());

        wallItem(ModBlocks.TOMBSTONE_WALL, ModBlocks.TOMBSTONE);
        wallItem(ModBlocks.POLISHED_TOMBSTONE_WALL, ModBlocks.POLISHED_TOMBSTONE);
        wallItem(ModBlocks.TOMBSTONE_BRICK_WALL, ModBlocks.TOMBSTONE_BRICKS);

        basicItem(ModBlocks.BLACK_IRON_DOOR.asItem());
        basicItem(ModBlocks.MOROSE_DOOR.asItem());
        basicItem(ModBlocks.CASKET_DOOR.asItem());

        saplingItem(ModBlocks.MOROSE_BUD);
        saplingItem(ModBlocks.CASKET_SAPLING);

        this.getBuilder(ModBlocks.BLACK_IRON_BARS.getId().toString())
                .parent(new ModelFile.UncheckedModelFile("item/generated"))
                .texture("layer0", this.modLoc("block/black_iron_bars"))
                .renderType("translucent");

        buttonItem(ModBlocks.MOROSE_BUTTON, ModBlocks.MOROSE_PLANKS);
        buttonItem(ModBlocks.CASKET_BUTTON, ModBlocks.CASKET_PLANKS);

        fenceItem(ModBlocks.MOROSE_FENCE, ModBlocks.MOROSE_PLANKS);
        fenceItem(ModBlocks.CASKET_FENCE, ModBlocks.CASKET_PLANKS);

        withExistingParent(ModItems.DIRTMAN_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.BLIGHT_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
    }

    private ItemModelBuilder saplingItem(DeferredBlock<Block> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(Elementalis.MODID, "block/" + item.getId().getPath()));
    }

    public void wallItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/wall_inventory"))
                .texture("wall", ResourceLocation.fromNamespaceAndPath(Elementalis.MODID,
                        "block/" + baseBlock.getId().getPath()));
    }

    public void buttonItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  ResourceLocation.fromNamespaceAndPath(Elementalis.MODID,
                        "block/" + baseBlock.getId().getPath()));
    }

    public void fenceItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/fence_inventory"))
                .texture("texture", ResourceLocation.fromNamespaceAndPath(Elementalis.MODID,
                        "block/" + baseBlock.getId().getPath()));
    }
}
