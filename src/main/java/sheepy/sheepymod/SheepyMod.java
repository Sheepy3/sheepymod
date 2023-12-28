package sheepy.sheepymod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.render.ColorProviderRegistry;
import net.minecraft.client.color.world.BiomeColors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sheepy.sheepymod.block.ModBlocks;
import sheepy.sheepymod.item.ModItems;
import net.minecraft.block.Block;
public class SheepyMod implements ModInitializer {
	public static final String MOD_ID = "sheepymod";
    public static final Logger LOGGER = LoggerFactory.getLogger("sheepymod");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");

		ModBlocks.registerModBlocks();
		ModItems.registerModItems();
	}
}

