package git.invisreal.qualityofmod.item;

import git.invisreal.qualityofmod.InvisQualityOfMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item UNREFINED_COSMICALITE = registerItem("unrefined_cosmicalite", new Item(new Item.Settings()));
    public static final Item COSMICALITE_GEMSTONE = registerItem("cosmicalite_gemstone", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(InvisQualityOfMod.MOD_ID, name),  item);
    }


    public static void registerModItems() {
        InvisQualityOfMod.LOGGER.info("Quality Control and Registration is running for " + InvisQualityOfMod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(COSMICALITE_GEMSTONE);
            fabricItemGroupEntries.add(UNREFINED_COSMICALITE);
        });
    }


}
