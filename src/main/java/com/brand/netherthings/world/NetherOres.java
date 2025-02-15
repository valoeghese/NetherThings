package com.brand.netherthings.world;

import com.brand.netherthings.NetherThings;
import com.brand.netherthings.content.Ores;
import com.brand.netherthings.content.OtherBlocks;
import com.brand.netherthings.features.NetherThingsFeatures;

import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.CountDecoratorConfig;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class NetherOres {
	public static void addNetherOres() {
		if (NetherThings.CONFIG.enableOverworldOresInNether) {
			for (Biome biome : Registry.BIOME) {
				if (biome.getCategory() == Biome.Category.NETHER) {
					biome.addFeature(GenerationStep.Feature.UNDERGROUND_ORES, Biome.configureFeature(NetherThingsFeatures.BLAZING_NETHERRACK_ORE, new OreFeatureConfig(OreFeatureConfig.Target.NETHERRACK, Ores.NETHER_COAL_ORE.getDefaultState(), 9), Decorator.COUNT_RANGE, new RangeDecoratorConfig(16, 0, 0, 128)));
					biome.addFeature(GenerationStep.Feature.UNDERGROUND_ORES, Biome.configureFeature(NetherThingsFeatures.BLAZING_NETHERRACK_ORE, new OreFeatureConfig(OreFeatureConfig.Target.NETHERRACK, Ores.NETHER_IRON_ORE.getDefaultState(), 9), Decorator.COUNT_RANGE, new RangeDecoratorConfig(16, 0, 0, 128)));
					biome.addFeature(GenerationStep.Feature.UNDERGROUND_ORES, Biome.configureFeature(NetherThingsFeatures.BLAZING_NETHERRACK_ORE, new OreFeatureConfig(OreFeatureConfig.Target.NETHERRACK, Ores.NETHER_GOLD_ORE.getDefaultState(), 10), Decorator.COUNT_RANGE, new RangeDecoratorConfig(7, 0, 0, 85)));
					biome.addFeature(GenerationStep.Feature.UNDERGROUND_ORES, Biome.configureFeature(NetherThingsFeatures.BLAZING_NETHERRACK_ORE, new OreFeatureConfig(OreFeatureConfig.Target.NETHERRACK, Ores.NETHER_REDSTONE_ORE.getDefaultState(), 8), Decorator.COUNT_RANGE, new RangeDecoratorConfig(8, 0, 0, 60)));
					biome.addFeature(GenerationStep.Feature.UNDERGROUND_ORES, Biome.configureFeature(NetherThingsFeatures.BLAZING_NETHERRACK_ORE, new OreFeatureConfig(OreFeatureConfig.Target.NETHERRACK, Ores.NETHER_LAPIS_ORE.getDefaultState(), 6), Decorator.COUNT_RANGE, new RangeDecoratorConfig(6, 0, 0, 110)));
					biome.addFeature(GenerationStep.Feature.UNDERGROUND_ORES, Biome.configureFeature(NetherThingsFeatures.BLAZING_NETHERRACK_ORE, new OreFeatureConfig(OreFeatureConfig.Target.NETHERRACK, Ores.NETHER_DIAMOND_ORE.getDefaultState(), 8), Decorator.COUNT_RANGE, new RangeDecoratorConfig(1, 0, 0, 40)));
					biome.addFeature(GenerationStep.Feature.UNDERGROUND_ORES, Biome.configureFeature(NetherThingsFeatures.BLAZING_NETHERRACK_ORE, new OreFeatureConfig(OreFeatureConfig.Target.NETHERRACK, Ores.NETHER_EMERALD_ORE.getDefaultState(), 4), Decorator.COUNT_RANGE, new RangeDecoratorConfig(1, 0, 0, 40)));
				}
			}
		}
	}
	
	public static void addVibraniumOres() {
		if (NetherThings.CONFIG.enableNetherVibraniumOre) {
			for (Biome biome : Registry.BIOME) {
				if (biome.getCategory() == Biome.Category.NETHER) {
					biome.addFeature(GenerationStep.Feature.UNDERGROUND_ORES, Biome.configureFeature(NetherThingsFeatures.BLAZING_NETHERRACK_ORE, new OreFeatureConfig(OreFeatureConfig.Target.NETHERRACK, Ores.NETHER_VIBRANIUM_ORE.getDefaultState(), 4), Decorator.COUNT_RANGE, new RangeDecoratorConfig(1, 0, 0, 60)));
				}
			}
		}
	}

	public static void addOverworldOres() {
		if (NetherThings.CONFIG.enableNetherOresInOverworld) {
			for (Biome biome : Registry.BIOME) {
				biome.addFeature(GenerationStep.Feature.UNDERGROUND_ORES, Biome.configureFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.Target.NATURAL_STONE, Ores.GLOWSTONE_ORE.getDefaultState(), 8), Decorator.COUNT_RANGE, new RangeDecoratorConfig(8, 0, 0, 32)));
				biome.addFeature(GenerationStep.Feature.UNDERGROUND_ORES, Biome.configureFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.Target.NATURAL_STONE, Ores.QUARTZ_ORE.getDefaultState(), 6), Decorator.COUNT_RANGE, new RangeDecoratorConfig(10, 0, 0, 16)));
			}
		}
	}

	public static void addNetherMineables() {
		if (NetherThings.CONFIG.enableBasaltGeneration) {
			for (Biome biome : Registry.BIOME) {
				if (biome.getCategory() == Biome.Category.NETHER) {
					biome.addFeature(GenerationStep.Feature.UNDERGROUND_ORES, Biome.configureFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.Target.NETHERRACK, OtherBlocks.BASALT.getDefaultState(), 35), Decorator.MAGMA, new CountDecoratorConfig(15)));
				}
			}
		}
	}
}