package net.mcreator.rival.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.rival.entity.WitchEntity;

public class WitchModel extends GeoModel<WitchEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitchEntity entity) {
		return new ResourceLocation("rival", "animations/truck.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitchEntity entity) {
		return new ResourceLocation("rival", "geo/truck.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitchEntity entity) {
		return new ResourceLocation("rival", "textures/entities/" + entity.getTexture() + ".png");
	}

}
