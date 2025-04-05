package net.mcreator.rival.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.rival.entity.DayiciUstaPhase2Entity;

public class DayiciUstaPhase2Model extends GeoModel<DayiciUstaPhase2Entity> {
	@Override
	public ResourceLocation getAnimationResource(DayiciUstaPhase2Entity entity) {
		return new ResourceLocation("rival", "animations/dayici2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DayiciUstaPhase2Entity entity) {
		return new ResourceLocation("rival", "geo/dayici2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DayiciUstaPhase2Entity entity) {
		return new ResourceLocation("rival", "textures/entities/" + entity.getTexture() + ".png");
	}

}
