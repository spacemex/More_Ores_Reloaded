package me.spacemex.moreores.procedures;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import me.spacemex.moreores.MoreoresModElements;
import me.spacemex.moreores.MoreoresMod;

import java.util.Map;

@MoreoresModElements.ModElement.Tag
public class LolProcedure extends MoreoresModElements.ModElement {
	public LolProcedure(MoreoresModElements instance) {
		super(instance, 66);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MoreoresMod.LOGGER.warn("Failed to load dependency entity for procedure Lol!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
			((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("This Is Not Finished Yet ! Please Be Patient!!"), (true));
		}
	}
}
