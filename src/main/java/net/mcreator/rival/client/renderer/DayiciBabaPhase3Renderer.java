
package net.mcreator.rival.client.renderer;

import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.cache.object.BakedGeoModel;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.rival.entity.model.DayiciBabaPhase3Model;
import net.mcreator.rival.entity.DayiciBabaPhase3Entity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class DayiciBabaPhase3Renderer extends GeoEntityRenderer<DayiciBabaPhase3Entity> {
	public DayiciBabaPhase3Renderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new DayiciBabaPhase3Model());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(DayiciBabaPhase3Entity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, DayiciBabaPhase3Entity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
