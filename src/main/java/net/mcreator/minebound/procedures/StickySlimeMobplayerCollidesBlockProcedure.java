package net.mcreator.minebound.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.minebound.init.MineboundModMobEffects;

public class StickySlimeMobplayerCollidesBlockProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!world.isClientSide()) {
			if (!entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("minebound:slime_creature")))) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MineboundModMobEffects.SLIME.get(), 20, 0));
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(MineboundModMobEffects.BURNING.get());
			}
		}
	}
}