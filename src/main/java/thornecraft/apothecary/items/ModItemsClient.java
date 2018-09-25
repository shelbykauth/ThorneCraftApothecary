package thornecraft.apothecary.items;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public class ModItemsClient {
  public static void preInit()
  {
    // required in order for the renderer to know how to render your item.
    ModelResourceLocation itemModelResourceLocation = new ModelResourceLocation("apothecary:wool_of_bat", "inventory");
    final int DEFAULT_ITEM_SUBTYPE = 0;
    ModelLoader.setCustomModelResourceLocation(ModItems.woolOfBat, DEFAULT_ITEM_SUBTYPE, itemModelResourceLocation);
  }
  public static void init() {

  }
  public static void postInit() {

  }
}