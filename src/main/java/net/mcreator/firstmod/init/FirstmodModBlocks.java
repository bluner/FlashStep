
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.firstmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.firstmod.block.DirtSuperBlock;
import net.mcreator.firstmod.FirstmodMod;

public class FirstmodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, FirstmodMod.MODID);
	public static final RegistryObject<Block> DIRT_SUPER = REGISTRY.register("dirt_super", () -> new DirtSuperBlock());
}
