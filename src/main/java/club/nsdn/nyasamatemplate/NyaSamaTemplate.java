package club.nsdn.nyasamatemplate;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.EventHandler;
import club.nsdn.nyasamatemplate.proxy.CommonProxy;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by drzzm32 on 2016.10.8.
 */
@Mod(modid = NyaSamaTemplate.MODID, version = NyaSamaTemplate.VERSION)
public class NyaSamaTemplate {

    @Mod.Instance("NyaSamaTemplate")
    public static NyaSamaTemplate instance;
    public static final String MODID = "NyaSamaTemplate";
    public static final String modid = MODID.toLowerCase();
    public static final String VERSION = "0.2";
    public static final boolean isDebug = false;
    public static Logger log = LogManager.getLogger(MODID);

    @SidedProxy(clientSide = "club.nsdn.nyasamatemplate.proxy.ClientProxy",
                serverSide = "club.nsdn.nyasamatemplate.proxy.ServerProxy")
    public static CommonProxy proxy;

    public static NyaSamaTemplate getInstance() { return instance; }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }

}
