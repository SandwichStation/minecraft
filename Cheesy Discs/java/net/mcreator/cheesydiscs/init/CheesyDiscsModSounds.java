/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cheesydiscs.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.cheesydiscs.CheesyDiscsMod;

public class CheesyDiscsModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, CheesyDiscsMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> HEHASRETURNED = REGISTRY.register("hehasreturned", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("cheesy_discs", "hehasreturned")));
	public static final DeferredHolder<SoundEvent, SoundEvent> PUSHITTOTHELIMIT = REGISTRY.register("pushittothelimit", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("cheesy_discs", "pushittothelimit")));
	public static final DeferredHolder<SoundEvent, SoundEvent> DEADMARAUDER = REGISTRY.register("deadmarauder", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("cheesy_discs", "deadmarauder")));
	public static final DeferredHolder<SoundEvent, SoundEvent> PARTY = REGISTRY.register("party", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("cheesy_discs", "party")));
	public static final DeferredHolder<SoundEvent, SoundEvent> BF1942 = REGISTRY.register("bf1942", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("cheesy_discs", "bf1942")));
	public static final DeferredHolder<SoundEvent, SoundEvent> KINGFORADAY = REGISTRY.register("kingforaday", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("cheesy_discs", "kingforaday")));
	public static final DeferredHolder<SoundEvent, SoundEvent> HALFHORSE = REGISTRY.register("halfhorse", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("cheesy_discs", "halfhorse")));
	public static final DeferredHolder<SoundEvent, SoundEvent> DIMSUM = REGISTRY.register("dimsum", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("cheesy_discs", "dimsum")));
	public static final DeferredHolder<SoundEvent, SoundEvent> CLOGS = REGISTRY.register("clogs", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("cheesy_discs", "clogs")));
	public static final DeferredHolder<SoundEvent, SoundEvent> KOBOLDS = REGISTRY.register("kobolds", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("cheesy_discs", "kobolds")));
}