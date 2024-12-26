package com.Alganaut.Elementalis.registry.item;

import com.Alganaut.Elementalis.Elementalis;
import com.Alganaut.Elementalis.registry.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Elementalis.MODID);

public static final Supplier<CreativeModeTab> ELEMENTALIS_TAB = CREATIVE_MODE_TAB.register( "elementalis_tab",
        () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BLIGHT_POWDER.get()))
                .title(Component.translatable("creativetab.elementalis.elementalis"))
                .displayItems((itemDisplayParameters, output) -> {
                    output.accept(ModItems.SIX_MUSIC_DISC);

                    output.accept(ModItems.BLIGHT_ROD);
                    output.accept(ModItems.BLIGHT_POWDER);
                    output.accept(ModItems.UNDEAD_CHARGE);

                    output.accept(ModItems.PERISH_SMITHING_TEMPLATE);

                    output.accept(ModBlocks.TOMBSTONE);
                    output.accept(ModBlocks.TOMBSTONE_STAIRS);
                    output.accept(ModBlocks.TOMBSTONE_SLAB);
                    output.accept(ModBlocks.TOMBSTONE_WALL);

                    output.accept(ModBlocks.POLISHED_TOMBSTONE);
                    output.accept(ModBlocks.POLISHED_TOMBSTONE_STAIRS);
                    output.accept(ModBlocks.POLISHED_TOMBSTONE_SLAB);
                    output.accept(ModBlocks.POLISHED_TOMBSTONE_WALL);

                    output.accept(ModBlocks.TOMBSTONE_BRICKS);
                    output.accept(ModBlocks.TOMBSTONE_BRICK_STAIRS);
                    output.accept(ModBlocks.TOMBSTONE_BRICK_SLAB);
                    output.accept(ModBlocks.TOMBSTONE_BRICK_WALL);
                    output.accept(ModBlocks.CRACKED_TOMBSTONE_BRICKS);
                    output.accept(ModBlocks.CHISELED_TOMBSTONE_BRICKS);
                    output.accept(ModBlocks.BLOOMING_TOMBSTONE_BRICKS);

                    output.accept(ModBlocks.TOMBSTONE_PILLAR);

                    output.accept(ModBlocks.BLACK_IRON_DOOR);
                    output.accept(ModBlocks.BLACK_IRON_TRAPDOOR);

                    output.accept(ModBlocks.MOROSE_BUD);
                    output.accept(ModBlocks.MOROSE_BRANCH);
                    output.accept(ModBlocks.MOROSE_WOOD);
                    output.accept(ModBlocks.STRIPPED_MOROSE_BRANCH);
                    output.accept(ModBlocks.STRIPPED_MOROSE_WOOD);
                    output.accept(ModBlocks.MOROSE_PLANKS);
                    output.accept(ModBlocks.MOROSE_STAIRS);
                    output.accept(ModBlocks.MOROSE_SLAB);
                    output.accept(ModBlocks.MOROSE_FENCE);
                    output.accept(ModBlocks.MOROSE_FENCE_GATE);
                    output.accept(ModBlocks.MOROSE_DOOR);
                    output.accept(ModBlocks.MOROSE_TRAPDOOR);
                    output.accept(ModBlocks.MOROSE_PRESSURE_PLATE);
                    output.accept(ModBlocks.MOROSE_BUTTON);
                    output.accept(ModBlocks.MOROSE_LEAVES);
                    output.accept(ModBlocks.BUDDING_MOROSE_LEAVES);

                    output.accept(ModItems.DIRTMAN_SPAWN_EGG);

                }).build());

public static void register(IEventBus eventBus) {
    CREATIVE_MODE_TAB   .register(eventBus);


}
}
