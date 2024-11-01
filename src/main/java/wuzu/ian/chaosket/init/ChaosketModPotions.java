
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package wuzu.ian.chaosket.init;

import wuzu.ian.chaosket.ChaosketMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;

public class ChaosketModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, ChaosketMod.MODID);
	public static final RegistryObject<Potion> POTION_OOZING = REGISTRY.register("potion_oozing", () -> new Potion(new MobEffectInstance(ChaosketModMobEffects.OOZING.get(), 3600, 0, false, true)));
	public static final RegistryObject<Potion> POTION_WEAVING = REGISTRY.register("potion_weaving", () -> new Potion(new MobEffectInstance(ChaosketModMobEffects.WEAVING.get(), 3600, 0, false, true)));
	public static final RegistryObject<Potion> POTION_INFESTATION = REGISTRY.register("potion_infestation", () -> new Potion(new MobEffectInstance(ChaosketModMobEffects.INFESTATION.get(), 3600, 0, false, true)));
}
