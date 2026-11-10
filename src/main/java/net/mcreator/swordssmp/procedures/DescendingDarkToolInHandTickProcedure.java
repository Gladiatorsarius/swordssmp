package net.mcreator.swordssmp.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.swordssmp.init.SwordssmpModItems;

public class DescendingDarkToolInHandTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!(entity instanceof Player player))
			return;

		ItemStack mainHand = player.getMainHandItem();
		if (mainHand.getItem() != SwordssmpModItems.DESCENDING_DARK || !player.isUsingItem()) {
			boolean needsReset = DescendingDarkHelper.resetDiveAttributes(player);
			if (needsReset) {
				ItemStack swordStack = mainHand.getItem() == SwordssmpModItems.DESCENDING_DARK ? mainHand : ItemStack.EMPTY;
				if (swordStack.isEmpty()) {
					for (int i = 0; i < player.getInventory().getContainerSize(); i++) {
						ItemStack stack = player.getInventory().getItem(i);
						if (stack.getItem() == SwordssmpModItems.DESCENDING_DARK) {
							swordStack = stack;
							break;
						}
					}
				}
				if (!swordStack.isEmpty()) {
					DescendingDarkHelper.applyCooldown(world, player, swordStack);
				}
			}
		}
	}
}
