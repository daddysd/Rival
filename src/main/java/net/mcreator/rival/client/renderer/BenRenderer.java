
package net.mcreator.rival.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.rival.entity.BenEntity;

public class BenRenderer extends HumanoidMobRenderer<BenEntity, HumanoidModel<BenEntity>> {
	public BenRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<BenEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(BenEntity entity) {
		return new ResourceLocation("rival:textures/entities/8a605f546ff45a2f.png");
	}
}
