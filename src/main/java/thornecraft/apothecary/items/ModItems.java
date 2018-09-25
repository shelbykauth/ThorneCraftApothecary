package thornecraft.apothecary.items;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraft.creativetab.CreativeTabs;

@ObjectHolder("apothecary")
public class ModItems {
  @ObjectHolder("wool_of_bat")
  public static final Item woolOfBat = new Item();

  public static void preInit() {
    //woolOfBat.func_77637_a(CreativeTabs.BREWING);
    woolOfBat.setCreativeTab(CreativeTabs.BREWING);
    woolOfBat.setRegistryName("wool_of_bat");
    woolOfBat.setTranslationKey("apothecary.wool_of_bat");
    ForgeRegistries.ITEMS.register(woolOfBat);
    
  }
  public static void registerItems(RegistryEvent.Register<Item> event) {
    event.getRegistry().registerAll(woolOfBat);
  }
  public static void init() {

  }
  public static void postInit() {
  
  }
}