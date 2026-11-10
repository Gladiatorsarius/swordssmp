package net.mcreator.swordssmp.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.swordssmp.init.SwordssmpModItems;

public class DescendingDarkReleaseUsingProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!(entity instanceof Player player))
			return;

		boolean needsReset = DescendingDarkHelper.resetDiveAttributes(player);
		if (needsReset) {
			ItemStack mainHandStack = player.getMainHandItem();
			if (mainHandStack.getItem() == SwordssmpModItems.DESCENDING_DARK) {
				DescendingDarkHelper.applyCooldown(world, player, mainHandStack);
			}
		}
	}
}
