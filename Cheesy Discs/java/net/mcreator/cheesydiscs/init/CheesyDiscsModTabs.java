/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cheesydiscs.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.cheesydiscs.CheesyDiscsMod;

public class CheesyDiscsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CheesyDiscsMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CHEESY_DISCS = REGISTRY.register("cheesy_discs",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.cheesy_discs.cheesy_discs")).icon(() -> new ItemStack(CheesyDiscsModItems.CHEESY_DISC_1.get())).displayItems((parameters, tabData) -> {
				tabData.accept(CheesyDiscsModItems.CHEESY_DISC_1.get());
				tabData.accept(CheesyDiscsModItems.CHEESY_DISC_2.get());
				tabData.accept(CheesyDiscsModItems.CHEESY_DISC_3.get());
				tabData.accept(CheesyDiscsModItems.CHEESY_DISC_4.get());
				tabData.accept(CheesyDiscsModItems.CHEESY_DISC_5.get());
				tabData.accept(CheesyDiscsModItems.CHEESY_DISC_6.get());
				tabData.accept(CheesyDiscsModItems.CHEESY_DISC_7.get());
				tabData.accept(CheesyDiscsModItems.CHEESY_DISC_8.get());
				tabData.accept(CheesyDiscsModItems.CHEESY_DISC_9.get());
				tabData.accept(CheesyDiscsModItems.CHEESY_DISC_10.get());
			}).withSearchBar().build());
}