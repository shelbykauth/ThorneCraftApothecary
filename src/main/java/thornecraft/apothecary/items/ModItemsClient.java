package thornecraft.apothecary.items;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.EnumDyeColor;
import net.minecraftforge.client.model.ModelLoader;

public class ModItemsClient {

  public static void preInit()
  {
    final int DEFAULT_ITEM_SUBTYPE = 0;
    ModelResourceLocation itemModelResourceLocation;

    // required in order for the renderer to know how to render your item.
    itemModelResourceLocation = new ModelResourceLocation("apothecary:wool_of_bat", "inventory");
    ModelLoader.setCustomModelResourceLocation(ModItems.woolOfBat, DEFAULT_ITEM_SUBTYPE, itemModelResourceLocation);

    itemModelResourceLocation = new ModelResourceLocation("apothecary:chalk", "inventory");
    ModelLoader.setCustomModelResourceLocation(ModItems.chalk, DEFAULT_ITEM_SUBTYPE, itemModelResourceLocation);
    for (int i = 0; i < 16; i++) {
      ModelLoader.setCustomModelResourceLocation(ModItems.chalk, i, itemModelResourceLocation);
    }
    ItemColors.preInit();
  }
  public static void init() {
    ItemColors.init();
  }
  public static void postInit() {
    ItemColors.postInit();

  }
}