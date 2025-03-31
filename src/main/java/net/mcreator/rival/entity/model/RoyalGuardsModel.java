package net.mcreator.rival.entity.model;

import software.bernie.geckolib.core.animation.AnimationState;

public class RoyalGuardsModel extends GeoModel<RoyalGuardsEntity> {
	@Override
	public ResourceLocation getAnimationResource(RoyalGuardsEntity entity) {
		return new ResourceLocation("rival", "animations/truck.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RoyalGuardsEntity entity) {
		return new ResourceLocation("rival", "geo/truck.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RoyalGuardsEntity entity) {
		return new ResourceLocation("rival", "textures/entities/" + entity.getTexture() + ".png");
	}

}