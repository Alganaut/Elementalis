package com.Alganaut.Elementalis.registry.entity.client;

import com.Alganaut.Elementalis.Elementalis;
import com.Alganaut.Elementalis.registry.entity.custom.Blight;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;

public class BlightModel<T extends Blight> extends HierarchicalModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION =
            new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath (Elementalis.MODID, "blight"), "main");

    private final ModelPart rods;
    private final ModelPart lowerrods;
    private final ModelPart head;


    public BlightModel(ModelPart root) {
        this.rods = root.getChild("rods");
        this.lowerrods = root.getChild("lowerrods");
        this.head = root.getChild("head");

    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition rods = partdefinition.addOrReplaceChild("rods", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition upperrodright = rods.addOrReplaceChild("upperrodright", CubeListBuilder.create().texOffs(24, 16).addBox(-1.0F, -6.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(25, 2).addBox(-1.5F, -12.0F, 0.0F, 3.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, -13.0F, 3.0F));

        PartDefinition wick2_r1 = upperrodright.addOrReplaceChild("wick2_r1", CubeListBuilder.create().texOffs(3, 1).addBox(-1.2F, -2.0F, -0.75F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -6.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

        PartDefinition wick1_r1 = upperrodright.addOrReplaceChild("wick1_r1", CubeListBuilder.create().texOffs(3, 1).addBox(-1.24F, -2.0F, -0.7F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.0F, 1.0F, 0.0F, -0.7854F, 0.0F));

        PartDefinition upperrodleft = rods.addOrReplaceChild("upperrodleft", CubeListBuilder.create().texOffs(24, 16).addBox(-11.0F, -19.0F, 2.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(25, 2).addBox(-11.5F, -25.0F, 3.0F, 3.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition wick2_r2 = upperrodleft.addOrReplaceChild("wick2_r2", CubeListBuilder.create().texOffs(3, 1).addBox(-1.2F, -2.0F, -0.75F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.0F, -19.0F, 3.0F, 0.0F, 0.7854F, 0.0F));

        PartDefinition wick1_r2 = upperrodleft.addOrReplaceChild("wick1_r2", CubeListBuilder.create().texOffs(3, 1).addBox(-1.24F, -2.0F, -0.7F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.0F, -19.0F, 4.0F, 0.0F, -0.7854F, 0.0F));

        PartDefinition lowerrodmiddle = rods.addOrReplaceChild("lowerrodmiddle", CubeListBuilder.create().texOffs(24, 16).addBox(-4.0F, -12.0F, 2.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(25, 2).addBox(-4.5F, -18.0F, 3.0F, 3.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 0.0F));

        PartDefinition wick2_r3 = lowerrodmiddle.addOrReplaceChild("wick2_r3", CubeListBuilder.create().texOffs(3, 1).addBox(-1.2F, -2.0F, -0.75F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -12.0F, 3.0F, 0.0F, 0.7854F, 0.0F));

        PartDefinition wick1_r3 = lowerrodmiddle.addOrReplaceChild("wick1_r3", CubeListBuilder.create().texOffs(3, 1).addBox(-1.24F, -2.0F, -0.7F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, -12.0F, 4.0F, 0.0F, -0.7854F, 0.0F));

        PartDefinition lowerrods = partdefinition.addOrReplaceChild("lowerrods", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition lowerrodleft = lowerrods.addOrReplaceChild("lowerrodleft", CubeListBuilder.create().texOffs(24, 16).addBox(-8.0F, -9.0F, 2.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(25, 2).addBox(-8.5F, -15.0F, 3.0F, 3.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 0.0F));

        PartDefinition wick2_r4 = lowerrodleft.addOrReplaceChild("wick2_r4", CubeListBuilder.create().texOffs(3, 1).addBox(-1.2F, -2.0F, -0.75F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.0F, -9.0F, 3.0F, 0.0F, 0.7854F, 0.0F));

        PartDefinition wick1_r4 = lowerrodleft.addOrReplaceChild("wick1_r4", CubeListBuilder.create().texOffs(3, 1).addBox(-1.24F, -2.0F, -0.7F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.0F, -9.0F, 4.0F, 0.0F, -0.7854F, 0.0F));

        PartDefinition lowerrodright = lowerrods.addOrReplaceChild("lowerrodright", CubeListBuilder.create().texOffs(24, 16).addBox(0.0F, -9.0F, 2.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(25, 2).addBox(-0.5F, -15.0F, 3.0F, 3.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 0.0F));

        PartDefinition wick2_r5 = lowerrodright.addOrReplaceChild("wick2_r5", CubeListBuilder.create().texOffs(3, 1).addBox(-1.2F, -2.0F, -0.75F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -9.0F, 3.0F, 0.0F, 0.7854F, 0.0F));

        PartDefinition wick1_r5 = lowerrodright.addOrReplaceChild("wick1_r5", CubeListBuilder.create().texOffs(3, 1).addBox(-1.24F, -2.0F, -0.7F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -9.0F, 4.0F, 0.0F, -0.7854F, 0.0F));

        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 16).addBox(3.0F, -5.0F, -4.0F, 8.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(3.0F, -13.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(20, 24).addBox(4.0F, -22.0F, 0.0F, 6.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-10.0F, 11.0F, 3.0F));

        PartDefinition headwick = head.addOrReplaceChild("headwick", CubeListBuilder.create(), PartPose.offset(10.0F, 14.0F, -3.0F));

        PartDefinition wick2_r6 = headwick.addOrReplaceChild("wick2_r6", CubeListBuilder.create().texOffs(3, 1).addBox(0.2F, -2.0F, 0.7F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -27.0F, 3.0F, 0.0F, 0.7854F, 0.0F));

        PartDefinition wick1_r6 = headwick.addOrReplaceChild("wick1_r6", CubeListBuilder.create().texOffs(0, 0).addBox(0.2F, -2.0F, -0.7F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -27.0F, 3.0F, 0.0F, -0.7854F, 0.0F));

        return LayerDefinition.create(meshdefinition, 32, 32);
    }

    @Override
    public void setupAnim(Blight entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
        this.applyHeadRotation(netHeadYaw, headPitch);

        this.animateWalk(BlightAnimations.ANIM_BLIGHT_IDLE, limbSwing, limbSwingAmount, 2f, 2.5f);
        this.animate(entity.idleAnimationState, BlightAnimations.ANIM_BLIGHT_IDLE, ageInTicks, 1f);
    }

    private void applyHeadRotation(float headYaw, float headPitch) {
        headYaw = Mth.clamp(headYaw, -30f, 30f);
        headPitch = Mth.clamp(headPitch, -25f, 45);

        this.head.yRot = headYaw * ((float)Math.PI / 180f);
        this.head.xRot = headPitch *  ((float)Math.PI / 180f);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
        rods.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
        lowerrods.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
        head.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
    }

    @Override
    public ModelPart root() {
        return rods;
    }
}

