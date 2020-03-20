package com.lordpine.nc_gt.blocks;

import com.lordpine.nc_gt.tiles.TileGTTurbineDynamoCoil;
import nc.multiblock.turbine.block.BlockTurbineDynamoCoil;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockTurbineCoilGT extends BlockTurbineDynamoCoil {
    private int voltage;

    public BlockTurbineCoilGT(int voltage) {
        this.voltage = voltage;
    }

    public TileEntity createNewTileEntity(World world, int metadata) {
        switch(metadata) {
            case 0:
                return new TileGTTurbineDynamoCoil.MagnesiumGT(voltage);
            case 1:
                return new TileGTTurbineDynamoCoil.BerylliumGT(voltage);
            case 2:
                return new TileGTTurbineDynamoCoil.AluminumGT(voltage);
            case 3:
                return new TileGTTurbineDynamoCoil.GoldGT(voltage);
            case 4:
                return new TileGTTurbineDynamoCoil.CopperGT(voltage);
            case 5:
                return new TileGTTurbineDynamoCoil.SilverGT(voltage);
            default:
                return new TileGTTurbineDynamoCoil.MagnesiumGT(voltage);
        }
    }

}
