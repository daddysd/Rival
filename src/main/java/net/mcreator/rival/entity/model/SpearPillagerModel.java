package net.mcreator.rival.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.rival.entity.SpearPillagerEntity;

public class SpearPillagerModel extends GeoModel<SpearPillagerEntity> {
	@Override
	public ResourceLocation getAnimationResource(SpearPillagerEntity entity) {
		return new ResourceLocation("rival", "animations/spearpillager.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpearPillagerEntity entity) {
		return new ResourceLocation("rival", "geo/spearpillager.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpearPillagerEntity entity) {
		return new ResourceLocation("rival", "textures/entities/" + entity.getTexture() + ".png");
	}

}
