package com.Alganaut.Elementalis.registry.entity.client;

import com.Alganaut.Elementalis.Elementalis;
import com.Alganaut.Elementalis.registry.entity.client.layer.DirtmanClothingLayer;
import com.Alganaut.Elementalis.registry.entity.custom.Dirtman;
import com.Alganaut.Elementalis.registry.init.ElementalisRenderers;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.SkeletonRenderer;
import net.minecraft.resources.ResourceLocation;

public class DirtmanRenderer extends SkeletonRenderer<Dirtman>
{
    private static final ResourceLocation DIRTMAN_LOCATION = ResourceLocation.fromNamespaceAndPath(Elementalis.MODID, "textures/entity/dirtman/dirtman.png");

    public DirtmanRenderer(EntityRendererProvider.Context context)
    {
        super(context, ElementalisRenderers.DIRTMAN, ModelLayers.SKELETON_INNER_ARMOR, ModelLayers.SKELETON_OUTER_ARMOR);
        this.addLayer(new DirtmanClothingLayer(this, context.getModelSet()));
    }

    @Override
    public ResourceLocation getTextureLocation(Dirtman entity)
    {
        return DIRTMAN_LOCATION;
    }
}
