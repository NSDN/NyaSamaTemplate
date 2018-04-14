package club.nsdn.nyasamatemplate.proxy;

import club.nsdn.nyasamatemplate.event.EventRegister;
import cpw.mods.fml.common.event.*;
import club.nsdn.nyasamatemplate.item.ItemLoader;
import club.nsdn.nyasamatemplate.block.BlockLoader;
import club.nsdn.nyasamatemplate.creativetab.CreativeTabLoader;
import club.nsdn.nyasamatemplate.tileblock.TileEntityLoader;

/**
 * Created by drzzm32 on 2016.10.8.
 */
public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event) {
        new CreativeTabLoader(event);
        new ItemLoader(event);
        new BlockLoader(event);
    }

    public void init(FMLInitializationEvent event) {
        new TileEntityLoader(event);
        EventRegister.registerCommon();
    }

    public void postInit(FMLPostInitializationEvent event) {

    }

}
