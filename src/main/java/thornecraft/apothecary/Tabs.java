package thornecraft.apothecary;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import thornecraft.apothecary.items.ModItems;

public class Tabs {
  public static final CreativeTabs apothecaryItemTab = (new CreativeTabs("apothecaryItemTab") {
    @Override
    public ItemStack createIcon() {
        return new ItemStack(ModItems.woolOfBat);
    }
  });
}