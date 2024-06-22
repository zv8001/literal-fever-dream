package net.mcreator.literalfeverdream.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class Uranium235ItemInHandTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.hurt(new DamageSource("DMU").bypassArmor(), 1);
	}
}
