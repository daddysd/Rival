package net.mcreator.rival.entity.model;

import software.bernie.geckolib.core.animation.AnimationState;

public class MinerPillagerModel extends GeoModel<MinerPillagerEntity> {
	@Override
	public ResourceLocation getAnimationResource(MinerPillagerEntity entity) {
		return new ResourceLocation("rival", "animations/truck.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MinerPillagerEntity entity) {
		return new ResourceLocation("rival", "geo/truck.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MinerPillagerEntity entity) {
		return new ResourceLocation("rival", "textures/entities/" + entity.getTexture() + ".png");
	}

}