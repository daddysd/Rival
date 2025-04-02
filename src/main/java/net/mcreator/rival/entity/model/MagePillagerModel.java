package net.mcreator.rival.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.rival.entity.MagePillagerEntity;

public class MagePillagerModel extends GeoModel<MagePillagerEntity> {
	@Override
	public ResourceLocation getAnimationResource(MagePillagerEntity entity) {
		return new ResourceLocation("rival", "animations/witchpillager.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MagePillagerEntity entity) {
		return new ResourceLocation("rival", "geo/witchpillager.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MagePillagerEntity entity) {
		return new ResourceLocation("rival", "textures/entities/" + entity.getTexture() + ".png");
	}

}
