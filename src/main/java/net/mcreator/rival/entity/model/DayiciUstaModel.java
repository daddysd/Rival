package net.mcreator.rival.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.rival.entity.DayiciUstaEntity;

public class DayiciUstaModel extends GeoModel<DayiciUstaEntity> {
	@Override
	public ResourceLocation getAnimationResource(DayiciUstaEntity entity) {
		return new ResourceLocation("rival", "animations/dayici11.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DayiciUstaEntity entity) {
		return new ResourceLocation("rival", "geo/dayici11.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DayiciUstaEntity entity) {
		return new ResourceLocation("rival", "textures/entities/" + entity.getTexture() + ".png");
	}

}
