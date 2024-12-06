package com.Alganaut.Elementalis.item;

import com.Alganaut.Elementalis.Elementalis;
import com.Alganaut.Elementalis.block.ModBlocks;
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
        () -> CreativeModeTab.builder().icon(() -> new ItemStack(Moditems.BLIGHT_POWDER.get()))
                .title(Component.translatable("creativetab.elementalis.elementalis"))
                .displayItems((itemDisplayParameters, output) -> {
                    output.accept(Moditems.SIX_MUSIC_DISC);

                    output.accept(Moditems.BLIGHT_ROD);
                    output.accept(Moditems.BLIGHT_POWDER);
                    output.accept(Moditems.UNDEAD_CHARGE);

                    output.accept(Moditems.PERISH_SMITHING_TEMPLATE);

                    output.accept(ModBlocks.TOMBSTONE);
                    output.accept(ModBlocks.POLISHED_TOMBSTONE);
                    output.accept(ModBlocks.TOMBSTONE_BRICKS);
                    output.accept(ModBlocks.CRACKED_TOMBSTONE_BRICKS);
                    output.accept(ModBlocks.CHISELED_TOMBSTONE_BRICKS);
                    output.accept(ModBlocks.BLOOMING_TOMBSTONE_BRICKS);
                    output.accept(ModBlocks.TOMBSTONE_PILLAR);
                }).build());

public static void register(IEventBus eventBus) {
    CREATIVE_MODE_TAB   .register(eventBus);


}
}
