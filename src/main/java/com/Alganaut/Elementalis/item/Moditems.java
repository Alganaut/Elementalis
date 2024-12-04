package com.Alganaut.Elementalis.item;

import com.Alganaut.Elementalis.Elementalis;
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

    public static void register (IEventBus eventBus) {
        ITEMS.register(eventBus);
    }




}
