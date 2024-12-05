package com.Alganaut.Elementalis.item;

import com.Alganaut.Elementalis.Elementalis;
import com.Alganaut.Elementalis.sound.ModSounds;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class Moditems {
    public static final DeferredRegister.Items  ITEMS = DeferredRegister.createItems(Elementalis.MODID);

    public static final DeferredItem<Item> BLIGHT_ROD = ITEMS.register("blight_rod",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BLIGHT_POWDER = ITEMS.register("blight_powder",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> UNDEAD_CHARGE = ITEMS.register("undead_charge",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> SIX_MUSIC_DISC = ITEMS.register("6_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.SIX_KEY).stacksTo(1)));

    public static void register (IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
