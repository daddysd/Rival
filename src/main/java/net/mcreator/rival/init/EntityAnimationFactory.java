package net.mcreator.rival.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.mcreator.rival.entity.WitchEntity;
import net.mcreator.rival.entity.SwordPillagerEntity;
import net.mcreator.rival.entity.SwordPillagerDiamondSwordEntity;
import net.mcreator.rival.entity.SummonerPillagerEntity;
import net.mcreator.rival.entity.SpearPillagerEntity;
import net.mcreator.rival.entity.RoyalGuardsEntity;
import net.mcreator.rival.entity.MinerPillagerEntity;
import net.mcreator.rival.entity.MagePillagerEntity;
import net.mcreator.rival.entity.HogRiderEntity;
import net.mcreator.rival.entity.DayiciUstaPhase2Entity;
import net.mcreator.rival.entity.DayiciUstaEntity;
import net.mcreator.rival.entity.BadVillagerEntity;

@Mod.EventBusSubscriber
public class EntityAnimationFactory {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		if (event != null && event.getEntity() != null) {
			if (event.getEntity() instanceof SwordPillagerEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof SpearPillagerEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof MinerPillagerEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof SummonerPillagerEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof WitchEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof RoyalGuardsEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BadVillagerEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof HogRiderEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof SwordPillagerDiamondSwordEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof MagePillagerEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof DayiciUstaEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof DayiciUstaPhase2Entity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
		}
	}
}
