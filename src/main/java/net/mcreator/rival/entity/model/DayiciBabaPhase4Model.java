package net.mcreator.rival.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.rival.entity.DayiciBabaPhase4Entity;

public class DayiciBabaPhase4Model extends GeoModel<DayiciBabaPhase4Entity> {
	@Override
	public ResourceLocation getAnimationResource(DayiciBabaPhase4Entity entity) {
		return new ResourceLocation("rival", "animations/truck.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DayiciBabaPhase4Entity entity) {
		return new ResourceLocation("rival", "geo/truck.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DayiciBabaPhase4Entity entity) {
		return new ResourceLocation("rival", "textures/entities/" + entity.getTexture() + ".png");
	}

}
