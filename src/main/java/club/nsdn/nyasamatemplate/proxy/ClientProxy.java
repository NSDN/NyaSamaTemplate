package club.nsdn.nyasamatemplate.proxy;

import club.nsdn.nyasamatemplate.event.EventRegister;
import cpw.mods.fml.common.event.*;
import club.nsdn.nyasamatemplate.tileblock.TileEntityModelBinder;

/**
 * Created by drzzm32 on 2016.10.8.
 */
public class ClientProxy extends CommonProxy {

    @Override
    public void preInit(FMLPreInitializationEvent event)
    {
        super.preInit(event);
    }

    @Override
    public void init(FMLInitializationEvent event)
    {
        super.init(event);
        new TileEntityModelBinder(event);
        EventRegister.registerClient();
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) { super.postInit(event); }


}
