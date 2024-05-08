package com.teamabnormals.upgrade_aquatic.core.registry;

import com.teamabnormals.upgrade_aquatic.core.UpgradeAquatic;
import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class UAPaintingVariants {
	public static final DeferredRegister<PaintingVariant> PAINTING_VARIANTS = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, UpgradeAquatic.MOD_ID);

	public static final RegistryObject<PaintingVariant> SIGHTLESS = PAINTING_VARIANTS.register("sightless", () -> new PaintingVariant(64, 32));
	public static final RegistryObject<PaintingVariant> MONUMENT = PAINTING_VARIANTS.register("monument", () -> new PaintingVariant(64, 48));
	public static final RegistryObject<PaintingVariant> UTENSIL = PAINTING_VARIANTS.register("utensil", () -> new PaintingVariant(16, 16));
	public static final RegistryObject<PaintingVariant> COIL = PAINTING_VARIANTS.register("coil", () -> new PaintingVariant(48, 48));
}
