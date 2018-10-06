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

import org.apache.logging.log4j.Logger;

@Mod.EventBusSubscriber
@Mod(modid = Apothecary.MODID, name = Apothecary.NAME, version = Apothecary.VERSION)
public class Apothecary
{
    public static final String MODID = "apothecary";
    public static final String NAME = "ThorneCraft Apothecary";
    public static final String VERSION = "1.12.2-0.0.0.0";
    public static Logger logger;

    @SidedProxy(clientSide="thornecraft.apothecary.proxies.ClientProxy", serverSide="thornecraft.apothecary.proxies.ServerProxy")
    public static thornecraft.apothecary.proxies.CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
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
        //proxy.postInit();
    }
}
