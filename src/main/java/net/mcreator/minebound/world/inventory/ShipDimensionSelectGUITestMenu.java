
package net.mcreator.minebound.world.inventory;

import net.mcreator.minebound.MineboundMod;

public class ShipDimensionSelectGUITestMenu extends AbstractContainerMenu implements Supplier<Map<Integer, Slot>> {
	public final static HashMap<String, Object> guistate = new HashMap<>();
	public final Level world;
	public final Player entity;
	public int x, y, z;
	private IItemHandler internal;
	private final Map<Integer, Slot> customSlots = new HashMap<>();
	private boolean bound = false;

	public ShipDimensionSelectGUITestMenu(int id, Inventory inv, FriendlyByteBuf extraData) {
		super(MineboundModMenus.SHIP_DIMENSION_SELECT_GUI_TEST.get(), id);
		this.entity = inv.player;
		this.world = inv.player.level;
		this.internal = new ItemStackHandler(0);
		BlockPos pos = null;
		if (extraData != null) {
			pos = extraData.readBlockPos();
			this.x = pos.getX();
			this.y = pos.getY();
			this.z = pos.getZ();
		}
	}

	@Override
	public boolean stillValid(Player player) {
		return true;
	}

	@Override
	public ItemStack quickMoveStack(Player playerIn, int index) {
		return ItemStack.EMPTY;
	}

	@Override
	public void removed(Player playerIn) {
		super.removed(playerIn);
		ShipDimensionSelectGUITestThisGUIIsClosedProcedure.execute();
	}

	public Map<Integer, Slot> get() {
		return customSlots;
	}
}