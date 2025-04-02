package net.mcreator.rival.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.rival.entity.SwordPillagerDiamondSwordEntity;

public class SwordPillagerDiamondSwordModel extends GeoModel<SwordPillagerDiamondSwordEntity> {
	@Override
	public ResourceLocation getAnimationResource(SwordPillagerDiamondSwordEntity entity) {
		return new ResourceLocation("rival", "animations/swordpillager.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SwordPillagerDiamondSwordEntity entity) {
		return new ResourceLocation("rival", "geo/swordpillager.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SwordPillagerDiamondSwordEntity entity) {
		return new ResourceLocation("rival", "textures/entities/" + entity.getTexture() + ".png");
	}

}
