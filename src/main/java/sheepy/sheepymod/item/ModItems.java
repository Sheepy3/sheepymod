package sheepy.sheepymod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

import sheepy.sheepymod.SheepyMod;
import sheepy.sheepymod.block.ModBlocks;

public class ModItems {
    public static final Item SharpRock = registerItem("sharprock", new Item(new FabricItemSettings()));
    public static final Item Twig = registerItem("twig", new Item(new FabricItemSettings()));
    public static final Item GrassTuft = registerItem("grasstuft", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(SharpRock);
        entries.add(Twig);
        entries.add(GrassTuft);
    }
    private static void addItemsToBuildingBlocksTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(ModBlocks.THATCH_BLOCK);
    }
    

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(SheepyMod.MOD_ID, name),item);
    }

    public static void registerModItems(){
        SheepyMod.LOGGER.info("Registering Mod Items for" + SheepyMod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(ModItems::addItemsToBuildingBlocksTabItemGroup);

    }
}
