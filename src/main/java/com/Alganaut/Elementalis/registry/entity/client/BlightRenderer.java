package com.Alganaut.Elementalis.registry.entity.client;

import com.Alganaut.Elementalis.Elementalis;
import com.Alganaut.Elementalis.registry.entity.custom.Blight;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class BlightRenderer extends MobRenderer<Blight, BlightModel<Blight>> {
    public BlightRenderer(EntityRendererProvider.Context context) {
        super(context, new BlightModel<>(context.bakeLayer(BlightModel.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(Blight blight) {
        return ResourceLocation.fromNamespaceAndPath(Elementalis.MODID, "textures/entity/blight/blight.png");
    }

    @Override
    public void render(Blight entity, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource buffer, int packedLight) {
        super.render(entity, entityYaw, partialTicks, poseStack, buffer, packedLight);
    }
}
