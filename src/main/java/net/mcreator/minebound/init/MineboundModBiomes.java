
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minebound.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.biome.Biome;

import net.mcreator.minebound.world.biome.ToxicOceanBiome;
import net.mcreator.minebound.world.biome.NoSnowHighUpBiomeBiome;
import net.mcreator.minebound.world.biome.MoonBiomeBiome;
import net.mcreator.minebound.world.biome.EmptyspaceBiome;
import net.mcreator.minebound.MineboundMod;

public class MineboundModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, MineboundMod.MODID);
	public static final RegistryObject<Biome> EMPTYSPACE = REGISTRY.register("emptyspace", EmptyspaceBiome::createBiome);
	public static final RegistryObject<Biome> NO_SNOW_HIGH_UP_BIOME = REGISTRY.register("no_snow_high_up_biome", NoSnowHighUpBiomeBiome::createBiome);
	public static final RegistryObject<Biome> MOON_BIOME = REGISTRY.register("moon_biome", MoonBiomeBiome::createBiome);
	public static final RegistryObject<Biome> TOXIC_OCEAN = REGISTRY.register("toxic_ocean", ToxicOceanBiome::createBiome);
}
