
package net.mcreator.minebound.world.features.ores;

import net.minecraft.world.level.levelgen.structure.templatesystem.BlockStateMatchTest;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.core.Registry;
import net.minecraft.core.Holder;

import net.mcreator.minebound.init.MineboundModBlocks;

import java.util.Set;
import java.util.List;

public class GraniteRockFeature extends OreFeature {
	public static GraniteRockFeature FEATURE = null;
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new GraniteRockFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("minebound:granite_rock", FEATURE,
				new OreConfiguration(List.of(OreConfiguration.target(new BlockStateMatchTest(MineboundModBlocks.OBSIDIAN.get().defaultBlockState()), MineboundModBlocks.GRANITE_ROCK.get().defaultBlockState())), 48));
		PLACED_FEATURE = PlacementUtils.register("minebound:granite_rock", CONFIGURED_FEATURE,
				List.of(CountPlacement.of(8), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.absolute(-16), VerticalAnchor.absolute(100)), BiomeFilter.biome()));
		return FEATURE;
	}

	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("minebound:lava_planet")));

	public GraniteRockFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;
		return super.place(context);
	}
}
