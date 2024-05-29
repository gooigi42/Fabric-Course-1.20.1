package net.gooigi42.mccourse;

import net.fabricmc.api.ModInitializer;

import net.gooigi42.mccourse.block.ModBlocks;
import net.gooigi42.mccourse.item.ModItems;
import net.gooigi42.mccourse.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MCCourseMod implements ModInitializer {
	public static final String MOD_ID = "mccourse";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// Very important Commment!
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModWorldGeneration.generateModWorldGeneration();
	}
}