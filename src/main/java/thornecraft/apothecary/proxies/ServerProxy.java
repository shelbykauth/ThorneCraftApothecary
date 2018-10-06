package thornecraft.apothecary.proxies;

import net.minecraftforge.fml.common.Mod.EventHandler;

public class ServerProxy extends CommonProxy {

  @EventHandler
  public void preInit() {
    super.preInit();
  }

  @EventHandler
  public void init() {
    super.init();
  }

  @EventHandler
  public void postInit() {
    super.postInit();
  }
}