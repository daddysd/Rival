package net.mcreator.rival.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.rival.init.RivalModEntities;

public class SummonerPillagerEntityIsHurtProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (0.5 < 1) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = RivalModEntities.AXE_PILLAGER.get().spawn(_level, BlockPos.containing(x + 1, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
		}
		if (0.5 < 1) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = RivalModEntities.SWORD_PILLAGER.get().spawn(_level, BlockPos.containing(x + 1, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
		}
	}
}
