package net.mcreator.literalfeverdream.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class TooHeavyProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.hurt(DamageSource.WITHER, 5);
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 10, 1));
	}
}
