package com.brand.netherthings.items;

import com.brand.netherthings.NetherThings;
import com.brand.netherthings.entities.NetherEntities;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.MushroomStewItem;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class NetherItems {

	public static final Item GLOWSTONE_INGOT = register("glowstone_ingot", new Item(new Item.Settings().maxCount(64).group(NetherThings.NETHER_THINGS_GROUP)));
	public static final Item OBSIDIAN_ROD = register("obsidian_rod", new Item(new Item.Settings().maxCount(64).group(NetherThings.NETHER_THINGS_GROUP)));
	public static final Item VIBRANIUM = register("vibranium", new Item(new Item.Settings().maxCount(64).group(NetherThings.NETHER_THINGS_GROUP)));
	public static final Item GLOWING_STEW = register("glowing_stew", new MushroomStewItem(new Item.Settings().maxCount(1).group(NetherThings.NETHER_THINGS_GROUP).food(new FoodComponent.Builder().hunger(6).saturationModifier(0.6F)
			.statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 1200, 0, true, false, true), 1.0F)
			.statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 1200, 0, true, false, true), 1.0F).build())));
	public static final Item WITHER_PIGMAN_SPAWN_EGG = register("wither_pigman_spawn_egg", new SpawnEggItem(NetherEntities.WITHER_PIGMAN, 2823460, 5972771, new Item.Settings().maxCount(64).group(ItemGroup.MISC)));

	public static Item register(String name, Item item) {
	    return Registry.register(Registry.ITEM, new Identifier(NetherThings.MOD_ID, name), item);
	}
}
