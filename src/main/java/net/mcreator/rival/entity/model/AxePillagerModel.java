package net.mcreator.rival.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.rival.entity.AxePillagerEntity;

public class AxePillagerModel extends GeoModel<AxePillagerEntity> {
	@Override
	public ResourceLocation getAnimationResource(AxePillagerEntity entity) {
		return new ResourceLocation("rival", "animations/truck.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AxePillagerEntity entity) {
		return new ResourceLocation("rival", "geo/truck.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AxePillagerEntity entity) {
		return new ResourceLocation("rival", "textures/entities/" + entity.getTexture() + ".png");
	}

}
