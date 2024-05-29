package net.gooigi42.mccourse.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.gooigi42.mccourse.world.ModPlacedFeatures;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class NodeGeneration {
    public static void generateNodes() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.PLAINS),
                GenerationStep.Feature.SURFACE_STRUCTURES, ModPlacedFeatures.NODE_TEST_PLACED_KEY);
    }
}
