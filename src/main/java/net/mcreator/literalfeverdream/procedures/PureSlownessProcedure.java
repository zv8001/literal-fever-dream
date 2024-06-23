package net.mcreator.literalfeverdream.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class PureSlownessProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 20, 2));
	}
}
