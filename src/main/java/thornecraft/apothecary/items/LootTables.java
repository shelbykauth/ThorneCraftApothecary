package thornecraft.apothecary.items;

import thornecraft.apothecary.Apothecary;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.*;
import net.minecraft.world.storage.loot.conditions.LootCondition;
import net.minecraft.world.storage.loot.functions.LootFunction;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class LootTables {
    private static ResourceLocation batTable;
    public static void preInit() {
        batTable = new ResourceLocation("apothecary:inject/bat");
        Apothecary.logger.info("Bat Table Location found!");
    }

    @SubscribeEvent
    public static void lootLoad(LootTableLoadEvent event) {
        if (event.getName().equals(LootTableList.ENTITIES_BAT)) {
            LootEntryTable woolOfBat = new LootEntryTable(batTable, 1, 0, new LootCondition[0], "thorne_inject_entry");
            LootPool thornePool = new LootPool(new LootEntryTable[]{woolOfBat}, new LootCondition[0], new RandomValueRange(1), new RandomValueRange(0,1), "thorne_inject_pool");
            event.getTable().addPool(thornePool);
            Apothecary.logger.info("Loot Table for Bat Found!  Entry Added!");
        }
    }
}