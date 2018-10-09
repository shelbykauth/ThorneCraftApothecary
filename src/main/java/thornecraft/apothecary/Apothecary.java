package thornecraft.apothecary;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.*;
//import gigaherz.guidebook.client.BookRegistryEvent;
import net.minecraft.util.ResourceLocation;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

@Mod.EventBusSubscriber
@Mod(modid = Apothecary.MODID, name = Apothecary.NAME, version = Apothecary.VERSION, dependencies="after:gbook")
public class Apothecary
{
    public static final String MODID = "apothecary";
    public static final String NAME = "ThorneCraft Apothecary";
    public static final String VERSION = "1.12.2-0.0.0.0";
    public static final Logger logger = LogManager.getLogger(MODID);

    @SidedProxy(clientSide="thornecraft.apothecary.proxies.ClientProxy", serverSide="thornecraft.apothecary.proxies.ServerProxy")
    public static thornecraft.apothecary.proxies.CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
        proxy.init();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit();
    }

    // @Optional.Method(modid="gbook")
    // @SubscribeEvent
    // public static void registerBook(BookRegistryEvent event) {
    //     logger.info("Registering Books");
    //     //event.register(new ResourceLocation("apothecary:xml/book_one.xml"));
    // }
}
