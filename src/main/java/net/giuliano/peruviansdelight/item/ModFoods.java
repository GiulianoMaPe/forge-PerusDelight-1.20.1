package net.giuliano.peruviansdelight.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties CAUSA = new FoodProperties.Builder().nutrition(6)
            .saturationMod(0.2f).meat().build();
    public static final FoodProperties INCA_KOLA = new FoodProperties.Builder().nutrition(2).fast().saturationMod(0.1f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 400), 1f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 400), 1f)
            .build();
}