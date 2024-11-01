
package wuzu.ian.chaosket.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class WeavingMobEffect extends MobEffect {
	public WeavingMobEffect() {
		super(MobEffectCategory.HARMFUL, -13421773);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
