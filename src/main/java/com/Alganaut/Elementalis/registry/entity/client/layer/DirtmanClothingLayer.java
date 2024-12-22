package com.Alganaut.Elementalis.registry.entity.client.layer;

import com.Alganaut.Elementalis.Elementalis;
import com.Alganaut.Elementalis.registry.init.ElementalisRenderers;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.SkeletonModel;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.monster.RangedAttackMob;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class DirtmanClothingLayer<T extends Mob & RangedAttackMob, M extends EntityModel<T>> extends RenderLayer<T, M>
{
    private static final ResourceLocation DIRTMAN_OUTER_LOCATION = ResourceLocation.fromNamespaceAndPath(Elementalis.MODID, "textures/entity/dirtman/dirtman_outer.png");
    private final SkeletonModel<T> layerModel;

    public DirtmanClothingLayer(RenderLayerParent<T, M> renderLayerParent, EntityModelSet entityModelSet)
    {
        super(renderLayerParent);
        this.layerModel = new SkeletonModel<>(entityModelSet.bakeLayer(ElementalisRenderers.DIRTMAN_OUTER_LAYER));
    }

    public void render(PoseStack poseStack, MultiBufferSource multiBufferSource, int p_117555_, T p_117556_, float p_117557_, float p_117558_, float p_117559_, float p_117560_, float p_117561_, float p_117562_)
    {
        coloredCutoutModelCopyLayerRender(this.getParentModel(), this.layerModel, DIRTMAN_OUTER_LOCATION, poseStack, multiBufferSource, p_117555_, p_117556_, p_117557_, p_117558_, p_117560_, p_117561_, p_117562_, p_117559_, -1);
    }
}
