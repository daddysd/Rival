
package net.mcreator.rival.client.renderer;

public class MinerPillagerRenderer extends GeoEntityRenderer<MinerPillagerEntity> {
	public MinerPillagerRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new MinerPillagerModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(MinerPillagerEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, MinerPillagerEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	protected float getDeathMaxRotation(MinerPillagerEntity entityLivingBaseIn) {
		return 0.0F;
	}
}