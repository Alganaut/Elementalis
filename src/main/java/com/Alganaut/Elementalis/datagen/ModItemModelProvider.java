package com.Alganaut.Elementalis.datagen;

import com.Alganaut.Elementalis.Elementalis;
import com.Alganaut.Elementalis.item.Moditems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

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
    }
}
