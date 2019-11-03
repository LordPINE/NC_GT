package com.lordpine.nc_gt.tiles;

import com.lordpine.nc_gt.NC_GT;
import nc.Global;
import nc.tile.processor.TileNuclearFurnace;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModTiles {

    public static void register() {
        GameRegistry.registerTileEntity(TileRadDecayAccelerator.class, NC_GT.MODID + ":tile_rad_accelerator");
    }
}
