package com.lordpine.nc_gt;

import com.lordpine.nc_gt.Elements.ModElements;
import com.lordpine.nc_gt.blocks.ModBlocks;
import com.lordpine.nc_gt.proxies.CommonProxy;
import com.lordpine.nc_gt.tiles.ModTiles;
import nc.radiation.RadSources;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = NC_GT.MODID, name = NC_GT.NAME, version = NC_GT.VERSION)
public class NC_GT
{
    public static final String MODID = "nuclearcraft_gregtech";
    public static final String NAME = "Nuclearcraft-Gregtech Integration";
    public static final String VERSION = "1.0";

    private static Logger logger;

    @SidedProxy(modId = MODID, clientSide = "com.lordpine.nc_gt.proxies.ClientProxy", serverSide = "com.lordpine.nc_gt.proxies.CommonProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ModBlocks.init();
        logger = event.getModLog();
        ModTiles.register();
        ModElements.registerElements();

    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        RadSources.putMaterial(1d/5.2713d, "Cobalt60");
        RadSources.putMaterial(365d/244d, "Zinc65");
    }
}

