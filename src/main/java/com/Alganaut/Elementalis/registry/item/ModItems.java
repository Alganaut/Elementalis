package com.Alganaut.Elementalis.registry.item;

import com.Alganaut.Elementalis.Elementalis;
import com.Alganaut.Elementalis.registry.entity.ModEntities;
import com.Alganaut.Elementalis.registry.sound.ModSounds;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SmithingTemplateItem;
import net.minecraft.world.item.Tiers;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items  ITEMS = DeferredRegister.createItems(Elementalis.MODID);

    public static final DeferredItem<Item> BLIGHT_ROD = ITEMS.register("blight_rod",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BLIGHT_POWDER = ITEMS.register("blight_powder",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> UNDEAD_CHARGE = ITEMS.register("undead_charge",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> PERISH_SMITHING_TEMPLATE = ITEMS.register("perish_armor_trim_smithing_template",
            () -> SmithingTemplateItem.createArmorTrimTemplate(ResourceLocation.fromNamespaceAndPath(Elementalis.MODID, "perish")));

    public static final DeferredItem<Item> SIX_MUSIC_DISC = ITEMS.register("6_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.SIX_KEY).stacksTo(1)));

    public static final DeferredItem<Item> DIRTMAN_SPAWN_EGG = ITEMS.register("dirtman_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntities.DIRTMAN, 0xa1c2a7, 0x8c6a43,
                    new Item.Properties()));


    public static void register (IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
