package sheepy.sheepymod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SheepyMod implements ModInitializer {
	public static final String MOD_ID = "sheepymod";
    public static final Logger LOGGER = LoggerFactory.getLogger("sheepymod");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}