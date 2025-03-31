
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rival.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.rival.block.TestBlock;
import net.mcreator.rival.block.DayakBlock;
import net.mcreator.rival.block.BarindirmasinBlock;
import net.mcreator.rival.RivalMod;

public class RivalModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, RivalMod.MODID);
	public static final RegistryObject<Block> TEST = REGISTRY.register("test", () -> new TestBlock());
	public static final RegistryObject<Block> BARINDIRMASIN = REGISTRY.register("barindirmasin", () -> new BarindirmasinBlock());
	public static final RegistryObject<Block> DAYAK = REGISTRY.register("dayak", () -> new DayakBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
