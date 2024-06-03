
package net.mcreator.minebound.world.features.ores;

public class GenerateInDepth6Feature extends OreFeature {

	public static GenerateInDepth6Feature FEATURE = null;
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new GenerateInDepth6Feature();
		CONFIGURED_FEATURE = FeatureUtils.register("minebound:generate_in_depth_6", FEATURE,
				new OreConfiguration(List.of(OreConfiguration.target(new BlockStateMatchTest(MineboundModBlocks.CONCRETE_BLOCK.get().defaultBlockState()), MineboundModBlocks.GENERATE_IN_DEPTH_6.get().defaultBlockState())), 64));
		PLACED_FEATURE = PlacementUtils.register("minebound:generate_in_depth_6", CONFIGURED_FEATURE,
				List.of(CountPlacement.of(64), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(16)), BiomeFilter.biome()));
		return FEATURE;
	}

	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("minebound:mountain_topper_dim")));

	public GenerateInDepth6Feature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;

		return super.place(context);
	}

}
