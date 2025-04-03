package net.mcreator.rival.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.rival.init.RivalModEntities;
import net.mcreator.rival.entity.SummonerPillagerEntity;

public class SummonerPillagerEntityIsHurtProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double particleRadius = 0;
		double particleAmount = 0;
		if (0.5 < 1) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = RivalModEntities.SWORD_PILLAGER_DIAMOND_SWORD.get().spawn(_level, BlockPos.containing(x - 1, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
			particleAmount = 8;
			particleRadius = 2;
			for (int index0 = 0; index0 < (int) particleAmount; index0++) {
				world.addParticle(ParticleTypes.ENCHANT, (x + 0 + Mth.nextDouble(RandomSource.create(), -1, 1) * particleRadius), (y + 0 + Mth.nextDouble(RandomSource.create(), -1, 1) * particleRadius),
						(z + 0 + Mth.nextDouble(RandomSource.create(), -1, 1) * particleRadius), (Mth.nextDouble(RandomSource.create(), -0.001, 0.001)), (Mth.nextDouble(RandomSource.create(), -0.001, 0.001)),
						(Mth.nextDouble(RandomSource.create(), -0.001, 0.001)));
			}
		}
		if (0.5 < 1) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = RivalModEntities.SWORD_PILLAGER.get().spawn(_level, BlockPos.containing(x - 1, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
		}
		if (entity instanceof SummonerPillagerEntity) {
			((SummonerPillagerEntity) entity).setAnimation("summon");
		}
	}
}
