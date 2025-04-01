package net.mcreator.rival.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.rival.entity.HogRiderEntity;

public class HogRiderModel extends GeoModel<HogRiderEntity> {
	@Override
	public ResourceLocation getAnimationResource(HogRiderEntity entity) {
		return new ResourceLocation("rival", "animations/pigrider2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HogRiderEntity entity) {
		return new ResourceLocation("rival", "geo/pigrider2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HogRiderEntity entity) {
		return new ResourceLocation("rival", "textures/entities/" + entity.getTexture() + ".png");
	}

}
