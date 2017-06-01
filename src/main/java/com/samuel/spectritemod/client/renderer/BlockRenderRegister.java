package com.samuel.spectritemod.client.renderer;

import com.samuel.spectritemod.SpectriteMod;
import com.samuel.spectritemod.init.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class BlockRenderRegister {
	public static String modid = SpectriteMod.MOD_ID;

	public static void registerBlockRenderer() {
		reg(ModBlocks.mineral_chest_spectrite, 0);
		reg(ModBlocks.mineral_chest_spectrite_trapped, 0);;
		reg(ModBlocks.spectrite_ore, 0, "spectrite_ore_surface");
		reg(ModBlocks.spectrite_ore, 1, "spectrite_ore_nether");
		reg(ModBlocks.spectrite_ore, 2, "spectrite_ore_end");
		reg(ModBlocks.spectrite_block, 0);
	}

	public static void reg(Block block, int meta) {
		Minecraft.getMinecraft().getRenderItem()
			.getItemModelMesher().register(
				Item.getItemFromBlock(block),
				meta,
				new ModelResourceLocation(modid
					+ ":"
					+ block.getUnlocalizedName().substring(
						5), "inventory"));
	}

	public static void reg(Block block, int meta,
		String name) {
		Minecraft.getMinecraft().getRenderItem()
			.getItemModelMesher().register(
				Item.getItemFromBlock(block),
				meta,
				new ModelResourceLocation(modid + ":"
					+ name, "inventory"));
	}
}
