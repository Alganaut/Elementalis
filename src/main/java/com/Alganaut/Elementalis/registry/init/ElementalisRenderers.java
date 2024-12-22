package com.Alganaut.Elementalis.registry.init;

import com.Alganaut.Elementalis.Elementalis;
import com.Alganaut.Elementalis.registry.entity.ModEntities;
import com.Alganaut.Elementalis.registry.entity.client.DirtmanRenderer;
import com.Alganaut.Elementalis.registry.entity.client.model.DirtmanClothingModel;
import net.minecraft.client.model.HumanoidArmorModel;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.SkeletonModel;
import net.minecraft.client.model.geom.LayerDefinitions;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;

@OnlyIn(Dist.CLIENT)
@EventBusSubscriber(modid = Elementalis.MODID, value = Dist.CLIENT, bus = EventBusSubscriber.Bus.MOD)
public class ElementalisRenderers
{
    //Use me to register mobs, if you need help feel free to ask!

    //Mob Itself
    public static final ModelLayerLocation DIRTMAN = new ModelLayerLocation(Elementalis.id("dirtman"), "main");

    //Mob's Armor Layers
    public static final ModelLayerLocation DIRTMAN_INNER_ARMOR = new ModelLayerLocation(Elementalis.id("dirtman"), "inner_armor");
    public static final ModelLayerLocation DIRTMAN_OUTER_ARMOR = new ModelLayerLocation(Elementalis.id("dirtman"), "outer_armor");

    //Mob's Clothing Layer(s)
    public static final ModelLayerLocation DIRTMAN_OUTER_LAYER = new ModelLayerLocation(Elementalis.id("dirtman"), "outer_layer");

    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event)
    {
        event.registerEntityRenderer(ModEntities.DIRTMAN.get(), DirtmanRenderer::new);
    }

    @SubscribeEvent
    public static void registerModelLayers(EntityRenderersEvent.RegisterLayerDefinitions event)
    {
        //Humanoid Armor Layer
        LayerDefinition humanoidOuter = LayerDefinition.create(HumanoidArmorModel.createBodyLayer(LayerDefinitions.OUTER_ARMOR_DEFORMATION), 64, 32);
        LayerDefinition humanoidInner = LayerDefinition.create(HumanoidArmorModel.createBodyLayer(LayerDefinitions.INNER_ARMOR_DEFORMATION), 64, 32);

        //Change the 0.25F if you want to mess with how far the clothes render off the body
        LayerDefinition dirtmanClothingLayer = LayerDefinition.create(DirtmanClothingModel.createMesh(new CubeDeformation(0.25F), 0.0F), 64, 64);

        event.registerLayerDefinition(DIRTMAN, SkeletonModel::createBodyLayer);
        event.registerLayerDefinition(DIRTMAN_INNER_ARMOR, () -> humanoidInner);
        event.registerLayerDefinition(DIRTMAN_OUTER_ARMOR, () -> humanoidOuter);
        event.registerLayerDefinition(DIRTMAN_OUTER_LAYER, () -> dirtmanClothingLayer);
    }
}
