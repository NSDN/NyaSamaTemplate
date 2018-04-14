package club.nsdn.nyasamatemplate.creativetab;

import net.minecraft.item.Item;
import cpw.mods.fml.common.event.*;
import net.minecraft.creativetab.CreativeTabs;
import club.nsdn.nyasamatemplate.block.BlockLoader;

/**
 * Created by drzzm32 on 2016.10.8.
 */
public class CreativeTabLoader {

    public static CreativeTabs tabNyaSamaTemplate;

    public CreativeTabLoader(FMLPreInitializationEvent event) {
        tabNyaSamaTemplate = new CreativeTabs("tabNyaSamaTemplate") {
            @Override
            public Item getTabIconItem() {
                return Item.getItemFromBlock(BlockLoader.logo);
            }
        };
    }

}
