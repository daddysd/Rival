package net.mcreator.rival.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.rival.entity.DayiciBabaPhase3Entity;

public class DayiciBabaPhase3Model extends GeoModel<DayiciBabaPhase3Entity> {
	@Override
	public ResourceLocation getAnimationResource(DayiciBabaPhase3Entity entity) {
		return new ResourceLocation("rival", "animations/truck.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DayiciBabaPhase3Entity entity) {
		return new ResourceLocation("rival", "geo/truck.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DayiciBabaPhase3Entity entity) {
		return new ResourceLocation("rival", "textures/entities/" + entity.getTexture() + ".png");
	}

}
