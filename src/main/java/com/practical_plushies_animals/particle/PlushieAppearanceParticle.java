package com.practical_plushies_animals.particle;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.model.Model;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleFactory;
import net.minecraft.client.particle.ParticleTextureSheet;
import net.minecraft.client.render.*;
import net.minecraft.client.render.entity.model.*;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.LivingEntity;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;

@Environment(EnvType.CLIENT)
public class PlushieAppearanceParticle extends Particle {
    private final Model model;
    private final RenderLayer layer;

    PlushieAppearanceParticle(ClientWorld clientWorld, double d, double e, double f, EntityModel<LivingEntity> model, Identifier identifier) {
        super(clientWorld, d, e, f);
        this.layer = RenderLayer.getEntityTranslucent(identifier);
        this.model = model;
        this.gravityStrength = 0.0F;
        this.maxAge = 30;
    }

    public ParticleTextureSheet getType() {
        return ParticleTextureSheet.CUSTOM;
    }

    public void buildGeometry(VertexConsumer vertexConsumer, Camera camera, float tickDelta) {
        float f = ((float)this.age + tickDelta) / (float)this.maxAge;
        float g = 0.05F + 0.5F * MathHelper.sin(f * 3.1415927F);
        MatrixStack matrixStack = new MatrixStack();
        matrixStack.multiply(camera.getRotation());
        matrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(150.0F * f - 60.0F));
        matrixStack.scale(-1.0F, -1.0F, 1.0F);
        matrixStack.translate(0.0F, -1.101F, 1.5F);
        VertexConsumerProvider.Immediate immediate = MinecraftClient.getInstance().getBufferBuilders().getEntityVertexConsumers();
        VertexConsumer vertexConsumer2 = immediate.getBuffer(this.layer);
        this.model.render(matrixStack, vertexConsumer2, 15728880, OverlayTexture.DEFAULT_UV, 1.0F, 1.0F, 1.0F, g);
        immediate.draw();
    }

    @Environment(EnvType.CLIENT)
    public static class Factory implements ParticleFactory<DefaultParticleType> {
        private final String mob;

        private Model getModel() {
            switch (mob) {
                case "allay":
                    return new AllayEntityModel(MinecraftClient.getInstance().getEntityModelLoader().getModelPart(EntityModelLayers.ALLAY));
                case "axolotl":
                    return new AxolotlEntityModel(MinecraftClient.getInstance().getEntityModelLoader().getModelPart(EntityModelLayers.AXOLOTL));
                case "bee":
                    return new BeeEntityModel(MinecraftClient.getInstance().getEntityModelLoader().getModelPart(EntityModelLayers.BEE));
                case "chicken":
                    return new ChickenEntityModel(MinecraftClient.getInstance().getEntityModelLoader().getModelPart(EntityModelLayers.CHICKEN));
                case "cow":
                    return new CowEntityModel(MinecraftClient.getInstance().getEntityModelLoader().getModelPart(EntityModelLayers.COW));
                case "fox":
                    return new FoxEntityModel(MinecraftClient.getInstance().getEntityModelLoader().getModelPart(EntityModelLayers.FOX));
                case "parrot":
                    return new ParrotEntityModel(MinecraftClient.getInstance().getEntityModelLoader().getModelPart(EntityModelLayers.PARROT));
                case "pig":
                    return new PigEntityModel(MinecraftClient.getInstance().getEntityModelLoader().getModelPart(EntityModelLayers.PIG));
                case "sheep":
                    return new SheepEntityModel(MinecraftClient.getInstance().getEntityModelLoader().getModelPart(EntityModelLayers.SHEEP));
                case "turtle":
                    return new TurtleEntityModel(MinecraftClient.getInstance().getEntityModelLoader().getModelPart(EntityModelLayers.TURTLE));
                default:
                    return new EndermiteEntityModel(MinecraftClient.getInstance().getEntityModelLoader().getModelPart(EntityModelLayers.ENDERMITE));
            }
        }

        private Identifier getIdentifier() {
            switch (mob) {
                case "allay":
                    return new Identifier("textures/entity/allay/allay.png");
                case "axolotl":
                    return new Identifier("textures/entity/axolotl/axolotl_lucy.png");
                case "bee":
                    return new Identifier("textures/entity/bee/bee.png");
                case "chicken":
                    return new Identifier("textures/entity/chicken.png");
                case "cow":
                    return new Identifier("textures/entity/cow/cow.png");
                case "fox":
                    return new Identifier("textures/entity/fox/fox.png");
                case "parrot":
                    return new Identifier("textures/entity/parrot/parrot_red_blue.png");
                case "pig":
                    return new Identifier("textures/entity/pig/pig.png");
                case "sheep":
                    return new Identifier("textures/entity/sheep/sheep.png");
                case "turtle":
                    return new Identifier("textures/entity/turtle/big_sea_turtle.png");
                default:
                    return new Identifier("textures/entity/endermite/endermite.png");
            }
        }

        public Factory(String mob) {
            this.mob = mob;
        }

        public Particle createParticle(DefaultParticleType defaultParticleType, ClientWorld clientWorld, double d, double e, double f, double g, double h, double i) {
            return new PlushieAppearanceParticle(clientWorld, d, e, f, (EntityModel<LivingEntity>) getModel(), getIdentifier());
        }
    }
}
