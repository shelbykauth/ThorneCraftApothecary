package thornecraft.apothecary.proxies;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import thornecraft.apothecary.items.ModItems;
import thornecraft.apothecary.items.LootTables;
public abstract class CommonProxy {

  @EventHandler
  public void preInit() {
    ModItems.preInit();
    LootTables.preInit();
  }

  @SubscribeEvent
  public void registerItems(RegistryEvent.Register<Item> event) {
      //event.getRegistry().registerAll();
      ModItems.registerItems(event);
  }

  @EventHandler
  public void init() {
    ModItems.init();
  }

  @EventHandler
  public void postInit() {
    ModItems.postInit();
  }
}