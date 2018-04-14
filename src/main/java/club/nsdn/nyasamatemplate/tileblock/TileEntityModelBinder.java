package club.nsdn.nyasamatemplate.tileblock;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;

import java.util.LinkedHashMap;

/**
 * Created by drzzm32 on 2016.10.8.
 */
public class TileEntityModelBinder {

    public static LinkedHashMap<Class<? extends TileEntity>, TileEntitySpecialRenderer> renderers;

    private static void bind(TileEntitySpecialRenderer renderer, Class<? extends TileEntity> tileEntity) {
        ClientRegistry.bindTileEntitySpecialRenderer(tileEntity, renderer);
    }

    public TileEntityModelBinder(FMLInitializationEvent event) {
        renderers = new LinkedHashMap<Class<? extends TileEntity>, TileEntitySpecialRenderer>();

        renderers.put(null, null);

        for (Class<? extends TileEntity> tile : renderers.keySet()) {
            bind(renderers.get(tile), tile);
        }
    }

}
