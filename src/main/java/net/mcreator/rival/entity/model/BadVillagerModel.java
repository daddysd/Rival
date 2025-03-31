package net.mcreator.rival.entity.model;

import software.bernie.geckolib.core.animation.AnimationState;

public class BadVillagerModel extends GeoModel<BadVillagerEntity> {
	@Override
	public ResourceLocation getAnimationResource(BadVillagerEntity entity) {
		return new ResourceLocation("rival", "animations/truck.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BadVillagerEntity entity) {
		return new ResourceLocation("rival", "geo/truck.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BadVillagerEntity entity) {
		return new ResourceLocation("rival", "textures/entities/" + entity.getTexture() + ".png");
	}

}