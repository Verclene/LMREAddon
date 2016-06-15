package net.blacklab.lmr.entity.mode;

import net.blacklab.lmr.entity.EntityLittleMaid;
import net.minecraft.entity.ai.EntityAITasks;

public class EntityMode_Builder extends EntityModeBlockBase {

	public EntityMode_Builder(EntityLittleMaid pEntity) {
		super(pEntity);
	}

	@Override
	public int priority() {
		return 6400;
	}

	@Override
	public void addEntityMode(EntityAITasks pDefaultMove, EntityAITasks pDefaultTargeting) {

	}

}
