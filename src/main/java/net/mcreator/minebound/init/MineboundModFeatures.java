
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minebound.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.minebound.world.features.ores.WasteFeature;
import net.mcreator.minebound.world.features.ores.UnrefinedAndesiteFeature;
import net.mcreator.minebound.world.features.ores.TarTestFeature;
import net.mcreator.minebound.world.features.ores.SlushFeature;
import net.mcreator.minebound.world.features.ores.RustyBlockFeature;
import net.mcreator.minebound.world.features.ores.RoughsandstoneFeature;
import net.mcreator.minebound.world.features.ores.RawSewageFeature;
import net.mcreator.minebound.world.features.ores.MudFeature;
import net.mcreator.minebound.world.features.ores.MoonstoneFeature;
import net.mcreator.minebound.world.features.ores.MoonrockFeature;
import net.mcreator.minebound.world.features.ores.MoonDustFeature;
import net.mcreator.minebound.world.features.ores.GraniteRockFeature;
import net.mcreator.minebound.world.features.ores.DirtmaterialFeature;
import net.mcreator.minebound.world.features.ores.AshFeature;
import net.mcreator.minebound.world.features.GlassTopperStructureFeature;
import net.mcreator.minebound.world.features.ErchiusFuelPoolFeature;
import net.mcreator.minebound.world.features.ErchiusCavePoolFeature;
import net.mcreator.minebound.world.features.AirTopperStructureFeature;
import net.mcreator.minebound.MineboundMod;

@Mod.EventBusSubscriber
public class MineboundModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, MineboundMod.MODID);
	public static final RegistryObject<Feature<?>> ASH = REGISTRY.register("ash", AshFeature::feature);
	public static final RegistryObject<Feature<?>> DIRTMATERIAL = REGISTRY.register("dirtmaterial", DirtmaterialFeature::feature);
	public static final RegistryObject<Feature<?>> MOON_DUST = REGISTRY.register("moon_dust", MoonDustFeature::feature);
	public static final RegistryObject<Feature<?>> MOONROCK = REGISTRY.register("moonrock", MoonrockFeature::feature);
	public static final RegistryObject<Feature<?>> MOONSTONE = REGISTRY.register("moonstone", MoonstoneFeature::feature);
	public static final RegistryObject<Feature<?>> MUD = REGISTRY.register("mud", MudFeature::feature);
	public static final RegistryObject<Feature<?>> ROUGHSANDSTONE = REGISTRY.register("roughsandstone", RoughsandstoneFeature::feature);
	public static final RegistryObject<Feature<?>> SLUSH = REGISTRY.register("slush", SlushFeature::feature);
	public static final RegistryObject<Feature<?>> WASTE = REGISTRY.register("waste", WasteFeature::feature);
	public static final RegistryObject<Feature<?>> UNREFINED_ANDESITE = REGISTRY.register("unrefined_andesite", UnrefinedAndesiteFeature::feature);
	public static final RegistryObject<Feature<?>> GRANITE_ROCK = REGISTRY.register("granite_rock", GraniteRockFeature::feature);
	public static final RegistryObject<Feature<?>> TAR_TEST = REGISTRY.register("tar_test", TarTestFeature::feature);
	public static final RegistryObject<Feature<?>> RUSTY_BLOCK = REGISTRY.register("rusty_block", RustyBlockFeature::feature);
	public static final RegistryObject<Feature<?>> RAW_SEWAGE = REGISTRY.register("raw_sewage", RawSewageFeature::feature);
	public static final RegistryObject<Feature<?>> GLASS_TOPPER_STRUCTURE = REGISTRY.register("glass_topper_structure", GlassTopperStructureFeature::feature);
	public static final RegistryObject<Feature<?>> AIR_TOPPER_STRUCTURE = REGISTRY.register("air_topper_structure", AirTopperStructureFeature::feature);
	public static final RegistryObject<Feature<?>> ERCHIUS_FUEL_POOL = REGISTRY.register("erchius_fuel_pool", ErchiusFuelPoolFeature::new);
	public static final RegistryObject<Feature<?>> ERCHIUS_CAVE_POOL = REGISTRY.register("erchius_cave_pool", ErchiusCavePoolFeature::new);
}
