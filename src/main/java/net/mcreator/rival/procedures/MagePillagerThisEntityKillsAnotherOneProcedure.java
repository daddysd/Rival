package net.mcreator.rival.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;

public class MagePillagerThisEntityKillsAnotherOneProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, x, y, z, 1, Level.ExplosionInteraction.TNT);
	}
}
