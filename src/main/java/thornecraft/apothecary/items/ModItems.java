package thornecraft.apothecary.items;
import thornecraft.apothecary.Tabs;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraft.creativetab.CreativeTabs;

@ObjectHolder("apothecary")
public class ModItems {

  @ObjectHolder("wool_of_bat")
  public static final Item woolOfBat = new Item();
  @ObjectHolder("chalk")
  public static final Chalk chalk = new Chalk();

  public static void preInit() {
    //woolOfBat.func_77637_a(CreativeTabs.BREWING);
    woolOfBat.setCreativeTab(Tabs.apothecaryItemTab);
    woolOfBat.setRegistryName("wool_of_bat");
    woolOfBat.setTranslationKey("apothecary.wool_of_bat");
    ForgeRegistries.ITEMS.register(woolOfBat);
    
    chalk.setCreativeTab(Tabs.apothecaryItemTab);
    chalk.setRegistryName("chalk");
    chalk.setTranslationKey("apothecary.chalk");
    ForgeRegistries.ITEMS.register(chalk);
  }
  public static void registerItems(RegistryEvent.Register<Item> event) {
    // event.getRegistry().registerAll(woolOfBat);
    event.getRegistry().registerAll(woolOfBat, chalk);
  }
  public static void init() {

  }
  public static void postInit() {
  
  }
}