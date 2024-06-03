package net.mcreator.minebound.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ReduceFallDamageProcedure {
	@SubscribeEvent
	public static void onEntityFall(LivingFallEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity(), event.getDistance());
		}
	}

	public static void execute(Entity entity, double distance) {
		execute(null, entity, distance);
	}

	private static void execute(@Nullable Event event, Entity entity, double distance) {
		if (entity == null)
			return;
		double fallDamage = 0;
		if (("" + entity.level.dimension()).contains("minebound")) {
			fallDamage = distance - 10;
			if (event != null && event.isCancelable()) {
				event.setCanceled(true);
			}
			if (!("" + entity.level.dimension()).equals("moon") && fallDamage > 0) {
				entity.hurt(DamageSource.FALL, (float) fallDamage);
			}
		}
	}
}
