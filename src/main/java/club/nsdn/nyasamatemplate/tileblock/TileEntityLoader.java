package club.nsdn.nyasamatemplate.tileblock;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.tileentity.TileEntity;

import java.util.LinkedHashMap;

/**
 * Created by drzzm32 on 2016.10.8.
 */
public class TileEntityLoader {

    public static LinkedHashMap<String, Class<? extends TileEntity>> tileEntities;

    private static void register(Class<? extends TileEntity> tileEntity, String name) {
        GameRegistry.registerTileEntity(tileEntity, name);
    }

    public TileEntityLoader(FMLInitializationEvent event) {
        tileEntities = new LinkedHashMap<String, Class<? extends TileEntity>>();

        tileEntities.put("null", null);

        for (String name : tileEntities.keySet()) {
            register(tileEntities.get(name), name);
        }
    }

}
