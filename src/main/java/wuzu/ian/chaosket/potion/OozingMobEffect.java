
package wuzu.ian.chaosket.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class OozingMobEffect extends MobEffect {
	public OozingMobEffect() {
		super(MobEffectCategory.HARMFUL, -13395712);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
