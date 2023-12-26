package sheepy.sheepymod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import sheepy.sheepymod.SheepyMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
public class ModBlocks {
    public static final Block THATCH_BLOCK = registerBlock("thatch_block",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));


    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(SheepyMod.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(SheepyMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks(){
        SheepyMod.LOGGER.info("Registering Mod Blocks for" + SheepyMod.MOD_ID);
    }
}

