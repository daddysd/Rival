package net.mcreator.rival.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.rival.entity.SwordPillagerEntity;

public class SwordPillagerModel extends GeoModel<SwordPillagerEntity> {
	@Override
	public ResourceLocation getAnimationResource(SwordPillagerEntity entity) {
		return new ResourceLocation("rival", "animations/swordpillager.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SwordPillagerEntity entity) {
		return new ResourceLocation("rival", "geo/swordpillager.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SwordPillagerEntity entity) {
		return new ResourceLocation("rival", "textures/entities/" + entity.getTexture() + ".png");
	}

}
