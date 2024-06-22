package net.mcreator.literalfeverdream.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class FIREEEEProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.hurt(DamageSource.ON_FIRE, 3);
	}
}
