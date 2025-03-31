package net.mcreator.rival.entity.model;

import software.bernie.geckolib.core.animation.AnimationState;

public class MagePillagerModel extends GeoModel<MagePillagerEntity> {
	@Override
	public ResourceLocation getAnimationResource(MagePillagerEntity entity) {
		return new ResourceLocation("rival", "animations/truck.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MagePillagerEntity entity) {
		return new ResourceLocation("rival", "geo/truck.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MagePillagerEntity entity) {
		return new ResourceLocation("rival", "textures/entities/" + entity.getTexture() + ".png");
	}

}