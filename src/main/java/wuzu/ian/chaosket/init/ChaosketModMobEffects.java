
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package wuzu.ian.chaosket.init;

import wuzu.ian.chaosket.potion.WeavingMobEffect;
import wuzu.ian.chaosket.potion.OozingMobEffect;
import wuzu.ian.chaosket.potion.InfestationMobEffect;
import wuzu.ian.chaosket.ChaosketMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

public class ChaosketModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, ChaosketMod.MODID);
	public static final RegistryObject<MobEffect> INFESTATION = REGISTRY.register("infestation", () -> new InfestationMobEffect());
	public static final RegistryObject<MobEffect> OOZING = REGISTRY.register("oozing", () -> new OozingMobEffect());
	public static final RegistryObject<MobEffect> WEAVING = REGISTRY.register("weaving", () -> new WeavingMobEffect());
}
