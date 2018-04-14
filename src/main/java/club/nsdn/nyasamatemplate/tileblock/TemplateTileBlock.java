package club.nsdn.nyasamatemplate.tileblock;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class TemplateTileBlock extends BlockContainer {

    public TemplateTileBlock() {
        super(Material.rock);
    }

    @Override
    public TileEntity createNewTileEntity(World world, int i) {
        return null;
    }
}
