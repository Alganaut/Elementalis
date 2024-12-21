package com.Alganaut.Elementalis.registry.entity;

import com.Alganaut.Elementalis.Elementalis;
import com.Alganaut.Elementalis.registry.entity.custom.Dirtman;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, Elementalis.MODID);

    public static final Supplier<EntityType<Dirtman>> DIRTMAN =
            ENTITY_TYPES.register("dirtman", () -> EntityType.Builder.of(Dirtman::new, MobCategory.MONSTER)
                    .sized(1.99f,0.6f).build("dirtman"));

    public static void register (IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }

    }
