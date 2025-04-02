
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rival.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.rival.RivalMod;

public class RivalModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, RivalMod.MODID);
	public static final RegistryObject<SoundEvent> HOGRIDERDEATH = REGISTRY.register("hogriderdeath", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("rival", "hogriderdeath")));
	public static final RegistryObject<SoundEvent> HOGRIDERLIVING = REGISTRY.register("hogriderliving", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("rival", "hogriderliving")));
	public static final RegistryObject<SoundEvent> HOGRIDERHURTS = REGISTRY.register("hogriderhurts", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("rival", "hogriderhurts")));
}
