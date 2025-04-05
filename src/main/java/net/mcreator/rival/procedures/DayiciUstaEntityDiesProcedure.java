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

public class DayiciUstaEntityDiesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double particleRadius = 0;
		double particleAmount = 0;
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = RivalModEntities.DAYICI_USTA_PHASE_2.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
			if (entityToSpawn != null) {
				entityToSpawn.setDeltaMovement(0, 0, 0);
			}
		}
		particleAmount = 4;
		particleRadius = 2;
		for (int index0 = 0; index0 < (int) particleAmount; index0++) {
			world.addParticle(ParticleTypes.GLOW_SQUID_INK, (x + 0 + Mth.nextDouble(RandomSource.create(), -0.1, 0.1) * particleRadius), (y + 0 + Mth.nextDouble(RandomSource.create(), 0, 5) * particleRadius),
					(z + 0 + Mth.nextDouble(RandomSource.create(), -0.1, 0.1) * particleRadius), 0, 0, 0);
		}
	}
}
