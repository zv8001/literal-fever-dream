package net.mcreator.literalfeverdream.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

import java.util.Collections;

public class FusionBlockBlockDestroyedByPlayerProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof ServerPlayer _serverPlayer)
			_serverPlayer.awardRecipesByKey(Collections.singletonList(ResourceKey.create(Registries.RECIPE, Identifier.parse("literal_fever_dream:rainbowcore"))));
	}
}