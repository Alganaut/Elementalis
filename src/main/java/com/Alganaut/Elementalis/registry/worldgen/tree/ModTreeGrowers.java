package com.Alganaut.Elementalis.registry.worldgen.tree;

import com.Alganaut.Elementalis.Elementalis;
import com.Alganaut.Elementalis.registry.worldgen.ModConfiguredFeatures;
import net.minecraft.world.level.block.grower.TreeGrower;

import java.util.Optional;

public class ModTreeGrowers {
    public static final TreeGrower MOROSE = new TreeGrower(Elementalis.MODID + ":morose",
            Optional.empty(), Optional.of(ModConfiguredFeatures.MOROSE_KEY), Optional.empty());

    public static final TreeGrower CASKET = new TreeGrower(Elementalis.MODID + ":casket",
            Optional.empty(), Optional.of(ModConfiguredFeatures.CASKET_KEY), Optional.empty());
}
