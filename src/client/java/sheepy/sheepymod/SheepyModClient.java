package sheepy.sheepymod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockRenderView;
import sheepy.sheepymod.block.ModBlocks;
import net.minecraft.client.color.world.BiomeColors;
public class SheepyModClient implements ClientModInitializer {
	public static final Block TINTED_BLOCK = ModBlocks.THATCH_BLOCK; // Replace with your block

	@Override
	public void onInitializeClient() {
		ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
			if (world != null && pos != null) {
				//int biomeColor = getBiomeGrassColor(world, pos);
				return getBiomeGrassColor(world, pos); // Return the biome's grass color as the block's color
			}
			return -1; // Default color if information is missing
		}, TINTED_BLOCK);
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.THATCH_BLOCK, RenderLayer.getCutout());
	}

	// Utility method to get biome grass color
	private int getBiomeGrassColor(BlockRenderView world, BlockPos pos) {
		return BiomeColors.getGrassColor(world, pos); // Get biome's grass color
	}
}
