package net.mcreator.rival.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.rival.entity.DayiciBabaPhase2Entity;

public class DayiciBabaPhase2Model extends GeoModel<DayiciBabaPhase2Entity> {
	@Override
	public ResourceLocation getAnimationResource(DayiciBabaPhase2Entity entity) {
		return new ResourceLocation("rival", "animations/truck.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DayiciBabaPhase2Entity entity) {
		return new ResourceLocation("rival", "geo/truck.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DayiciBabaPhase2Entity entity) {
		return new ResourceLocation("rival", "textures/entities/" + entity.getTexture() + ".png");
	}

}
