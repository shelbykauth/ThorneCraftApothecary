package thornecraft.apothecary.proxies;

import thornecraft.apothecary.items.ModItemsClient;
import net.minecraftforge.fml.common.Mod.EventHandler;

public class ClientProxy extends CommonProxy {
  
  @EventHandler
  public void preInit() {
    super.preInit();
    ModItemsClient.preInit();
  }

  @EventHandler
  public void init() {
    super.init();
  }

  public void postInit() {
    super.postInit();
  }
}