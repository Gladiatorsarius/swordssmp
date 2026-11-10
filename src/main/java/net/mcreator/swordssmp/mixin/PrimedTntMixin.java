package net.mcreator.swordssmp.mixin;

import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.world.entity.item.PrimedTnt;
import net.minecraft.world.level.Level;

import net.mcreator.swordssmp.procedures.DescendingDarkOnUseTickProcedure;
import net.mcreator.swordssmp.procedures.TNTSword2RightclickedOnBlockProcedure;

@Mixin(PrimedTnt.class)
public abstract class PrimedTntMixin {
	@Inject(method = "explode", at = @At("HEAD"), cancellable = true)
	private void onExplode(CallbackInfo ci) {
		PrimedTnt tnt = (PrimedTnt) (Object) this;
		// The UUID set is per-world SavedData so it survives a server restart together
		// with the still-fused TNT entity. explode() runs server-side; guard anyway.
		var server = tnt.level().getServer();
		if (server != null && TNTSword2RightclickedOnBlockProcedure.isBigTnt(server, tnt.getUUID())) {
			TNTSword2RightclickedOnBlockProcedure.consumeBigTnt(server, tnt.getUUID());
			Level level = tnt.level();
			level.explode(tnt, tnt.getX(), tnt.getY(0.0625), tnt.getZ(), 8.0F, Level.ExplosionInteraction.TNT);
			ci.cancel();
			return;
		}
		Float descendingPower = DescendingDarkOnUseTickProcedure.DESCENDING_DARK_TNT_POWERS.remove(tnt.getUUID());
		if (descendingPower != null) {
			Level level = tnt.level();
			level.explode(tnt, tnt.getX(), tnt.getY(0.0625), tnt.getZ(), descendingPower, Level.ExplosionInteraction.TNT);
			ci.cancel();
		}
	}
}
