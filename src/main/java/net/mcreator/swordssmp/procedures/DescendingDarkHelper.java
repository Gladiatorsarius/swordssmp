package net.mcreator.swordssmp.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.component.CustomData;

public class DescendingDarkHelper {
	public static final long COOLDOWN_TICKS = 200L;

	public static boolean resetDiveAttributes(Player player) {
		boolean needsReset = false;
		AttributeInstance gravity = player.getAttribute(Attributes.GRAVITY);
		if (gravity != null && gravity.getBaseValue() != gravity.getAttribute().value().getDefaultValue()) {
			gravity.setBaseValue(gravity.getAttribute().value().getDefaultValue());
			needsReset = true;
		}
		AttributeInstance fallDamage = player.getAttribute(Attributes.FALL_DAMAGE_MULTIPLIER);
		if (fallDamage != null && fallDamage.getBaseValue() != fallDamage.getAttribute().value().getDefaultValue()) {
			fallDamage.setBaseValue(fallDamage.getAttribute().value().getDefaultValue());
			needsReset = true;
		}
		return needsReset;
	}

	public static void applyCooldown(LevelAccessor world, Player player, ItemStack swordStack) {
		CustomData customData = swordStack.get(DataComponents.CUSTOM_DATA);
		CompoundTag cooldownTag = customData != null ? customData.copyTag() : new CompoundTag();
		long now = 0L;
		if (world instanceof Level _level) {
			now = _level.getGameTime();
		}
		cooldownTag.putLong("DescendingDarkCooldownUntil", now + COOLDOWN_TICKS);
		cooldownTag.putString("DescendingDarkCooldownOwner", player.getStringUUID());
		swordStack.set(DataComponents.CUSTOM_DATA, CustomData.of(cooldownTag));
		if (!world.isClientSide()) {
			player.getCooldowns().addCooldown(swordStack, (int) COOLDOWN_TICKS);
		}
	}
}
