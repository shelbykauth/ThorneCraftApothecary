package thornecraft.apothecary.items;
import thornecraft.apothecary.Apothecary;
import thornecraft.apothecary.Tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Chalk extends Item {

    public Chalk() {
        this.setMaxDamage(0);
        this.setHasSubtypes(true);
        this.setMaxStackSize(16);
        this.setCreativeTab(Tabs.apothecaryItemTab);
    }

    @Override
    public String getTranslationKey(ItemStack stack) {
        NBTTagCompound nbt = stack.getTagCompound();
        String color = "white";
        if (nbt != null) {
            color = nbt.getString("color");
        }
        color = EnumDyeColor.byMetadata(stack.getMetadata()).toString();
        return super.getTranslationKey(stack) + "." + color;
    }



    @SideOnly(Side.CLIENT)
    @Override
    public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> subItems) {
        for (int i = 0; i < 16; i++) {
            EnumDyeColor color = EnumDyeColor.byMetadata(i);
            //Apothecary.logger.info("Color {}: {}", i, color.toString());
            NBTTagCompound nbt = new NBTTagCompound();
            nbt.setString("color", color.toString());
            ItemStack subStack = new ItemStack(this, 1, i, nbt);
            subItems.add(subStack);
        }
    }
}