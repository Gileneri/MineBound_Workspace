
package net.mcreator.minebound.world.dimension;

@Mod.EventBusSubscriber
public class MidnightPlanetDimension {

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class Fixers {

		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public static void registerDimensionSpecialEffects(FMLClientSetupEvent event) {
			DimensionSpecialEffects customEffect = new DimensionSpecialEffects(128, true, DimensionSpecialEffects.SkyType.NORMAL, false, false) {

				@Override
				public Vec3 getBrightnessDependentFogColor(Vec3 color, float sunHeight) {
					return new Vec3(0.058823529412, 0.058823529412, 0.176470588235);
				}

				@Override
				public boolean isFoggyAt(int x, int y) {
					return false;
				}

			};
			event.enqueueWork(() -> DimensionSpecialEffects.EFFECTS.put(new ResourceLocation("minebound:midnight_planet"), customEffect));
		}

	}

	@SubscribeEvent
	public static void onPlayerChangedDimensionEvent(PlayerEvent.PlayerChangedDimensionEvent event) {
		Entity entity = event.getEntity();
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		if (event.getFrom() == ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("minebound:midnight_planet"))) {

			WhenLeavingDimensionProcedure.execute(world, entity);
		}

		if (event.getTo() == ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("minebound:midnight_planet"))) {

			WhenEnteringDimensionProcedure.execute(world, entity);
		}
	}

}
