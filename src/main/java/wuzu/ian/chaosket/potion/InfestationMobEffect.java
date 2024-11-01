
package wuzu.ian.chaosket.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class InfestationMobEffect extends MobEffect {
	public InfestationMobEffect() {
		super(MobEffectCategory.HARMFUL, -6710887);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
