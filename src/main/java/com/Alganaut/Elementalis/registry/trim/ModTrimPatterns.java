package com.Alganaut.Elementalis.registry.trim;

import com.Alganaut.Elementalis.Elementalis;
import com.Alganaut.Elementalis.registry.item.ModItems;
import net.minecraft.Util;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimPattern;
import net.neoforged.neoforge.registries.DeferredItem;

public class ModTrimPatterns {
        public static final ResourceKey<TrimPattern> PERISH = ResourceKey.create(Registries.TRIM_PATTERN,
            ResourceLocation.fromNamespaceAndPath(Elementalis.MODID, "perish"));

    public static void bootstrap(BootstrapContext<TrimPattern> context) {
        register(context, ModItems.PERISH_SMITHING_TEMPLATE, PERISH);
    }

    private static void register(BootstrapContext<TrimPattern> context, DeferredItem<Item> item, ResourceKey<TrimPattern> key) {
        TrimPattern trimPattern = new TrimPattern(key.location(), item.getDelegate(),
                Component.translatable(Util.makeDescriptionId("trim_pattern", key.location())), false);
        context.register(key, trimPattern);
}}
