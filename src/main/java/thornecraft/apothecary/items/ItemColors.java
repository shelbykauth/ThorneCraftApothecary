package thornecraft.apothecary.items;

import java.awt.Color;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import thornecraft.apothecary.Apothecary;

@SideOnly(Side.CLIENT)
public class ItemColors {
    public static void preInit() {

    }
    public static void init() {
        net.minecraft.client.renderer.color.ItemColors itemColors = Minecraft.getMinecraft().getItemColors();

        // Colors that follow the metadata color pattern.  Put color on base layer (layer 0)
        itemColors.registerItemColorHandler(new IItemColor(){
            @Override
            public int colorMultiplier(ItemStack stack, int tintIndex) {
                switch (tintIndex) {
                    case 0:
                        EnumDyeColor dyeColor = EnumDyeColor.byMetadata(stack.getMetadata());
                        return dyeColor.getColorValue();
                    case 1:
                    default:
                        return Color.white.getRGB();
                }
            }
        }, ModItems.chalk);
    }
    public static void postInit() {
        // net.minecraft.client.renderer.color.ItemColors itemColors = Minecraft.getMinecraft().getItemColors();
        // itemColors.registerItemColorHandler(new IItemColor(){
        //     @Override
        //     public int colorMultiplier(ItemStack stack, int tintIndex) {
        //         Apothecary.logger.info(stack.getDisplayName());
        //         Apothecary.logger.info(tintIndex);
        //         switch (tintIndex) {
        //             case 0:
        //                 String color = EnumDyeColor.byMetadata(stack.getMetadata()).toString();
        //                 return Color.getColor(color).getRGB();
        //                 //return Color.white.getRGB();
        //             case 1:
        //             default:
        //                 return Color.white.getRGB();
        //         }
        //     }
        // }, ModItems.chalk);
    }
}