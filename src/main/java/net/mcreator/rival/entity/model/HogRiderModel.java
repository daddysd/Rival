package net.mcreator.rival.entity.model;

import software.bernie.geckolib.core.animation.AnimationState;

public class HogRiderModel extends GeoModel<HogRiderEntity> {
	@Override
	public ResourceLocation getAnimationResource(HogRiderEntity entity) {
		return new ResourceLocation("rival", "animations/truck.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HogRiderEntity entity) {
		return new ResourceLocation("rival", "geo/truck.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HogRiderEntity entity) {
		return new ResourceLocation("rival", "textures/entities/" + entity.getTexture() + ".png");
	}

}