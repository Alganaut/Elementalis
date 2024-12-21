package com.Alganaut.Elementalis.registry.event;

import com.Alganaut.Elementalis.Elementalis;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.common.EventBusSubscriber;

@EventBusSubscriber(modid = Elementalis.MODID, bus = EventBusSubscriber.Bus.GAME, value =  Dist.CLIENT)
public class ModClientEvents {
}
