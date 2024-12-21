package com.Alganaut.Elementalis.registry.entity.client;

import com.Alganaut.Elementalis.Elementalis;
import com.Alganaut.Elementalis.registry.entity.custom.Dirtman;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class DirtmanRenderer extends MobRenderer<Dirtman, DirtmanModel<Dirtman>> {
    public DirtmanRenderer(EntityRendererProvider.Context context) {
        super(context, new DirtmanModel<>(context.bakeLayer(DirtmanModel.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(Dirtman dirtman) {
        return ResourceLocation.fromNamespaceAndPath(Elementalis.MODID, "textures/entity/dirtman/dirtman.png");
    }

    @Override
    public void render(Dirtman entity, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource buffer, int packedLight) {
        super.render(entity, entityYaw, partialTicks, poseStack, buffer, packedLight);
    }
}
