package club.nsdn.nyasamatemplate.block;

import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

import java.util.Hashtable;

/**
 * Created by drzzm32 on 2016.10.8.
 */
public class BlockLoader {

    public static Hashtable<String, Block> blocks;
    public static Block logo;

    private static void register(Block block, String name) {
        GameRegistry.registerBlock(block, name);
    }

    public BlockLoader(FMLPreInitializationEvent event) {
        blocks = new Hashtable<String, Block>();

        logo = new BlockNSDNLogo();
        blocks.put("nsdn_logo", logo);

        for (String name : blocks.keySet()) {
            register(blocks.get(name), name);
        }
    }

}