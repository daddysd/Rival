package net.mcreator.rival.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.rival.entity.DayiciBabaEntity;

public class DayiciBabaModel extends GeoModel<DayiciBabaEntity> {
	@Override
	public ResourceLocation getAnimationResource(DayiciBabaEntity entity) {
		return new ResourceLocation("rival", "animations/truck.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DayiciBabaEntity entity) {
		return new ResourceLocation("rival", "geo/truck.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DayiciBabaEntity entity) {
		return new ResourceLocation("rival", "textures/entities/" + entity.getTexture() + ".png");
	}

}
