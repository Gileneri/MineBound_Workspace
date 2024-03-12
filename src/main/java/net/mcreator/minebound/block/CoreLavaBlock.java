
package net.mcreator.minebound.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.minebound.procedures.CoreLavaUpdateTickProcedure;
import net.mcreator.minebound.procedures.CoreLavaMobplayerCollidesBlockProcedure;
import net.mcreator.minebound.init.MineboundModFluids;

public class CoreLavaBlock extends LiquidBlock {
	public CoreLavaBlock() {
		super(() -> MineboundModFluids.CORE_LAVA.get(), BlockBehaviour.Properties.of(Material.LAVA, MaterialColor.COLOR_RED).strength(1000f).lightLevel(s -> 8).noCollission().noLootTable());
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public void neighborChanged(BlockState blockstate, Level world, BlockPos pos, Block neighborBlock, BlockPos fromPos, boolean moving) {
		super.neighborChanged(blockstate, world, pos, neighborBlock, fromPos, moving);
		CoreLavaUpdateTickProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		CoreLavaMobplayerCollidesBlockProcedure.execute(entity);
	}
}
