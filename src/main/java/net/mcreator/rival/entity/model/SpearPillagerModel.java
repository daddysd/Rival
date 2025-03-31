package net.mcreator.rival.entity.model;

import software.bernie.geckolib.core.animation.AnimationState;

public class SpearPillagerModel extends GeoModel<SpearPillagerEntity> {
	@Override
	public ResourceLocation getAnimationResource(SpearPillagerEntity entity) {
		return new ResourceLocation("rival", "animations/truck.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpearPillagerEntity entity) {
		return new ResourceLocation("rival", "geo/truck.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpearPillagerEntity entity) {
		return new ResourceLocation("rival", "textures/entities/" + entity.getTexture() + ".png");
	}

}