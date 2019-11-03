package com.lordpine.nc_gt.blocks;

import com.lordpine.nc_gt.tiles.TileRadDecayAccelerator;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class BlockRadDecayAccelerator extends Block implements ITileEntityProvider {

    public BlockRadDecayAccelerator(Material materialIn, String unlocalized_name) {
        super(materialIn);
        this.setRegistryName(unlocalized_name);
    }


    /**
     * Returns a new instance of a block's tile entity class. Called on placing the block.
     *
     * @param worldIn
     * @param meta
     */
    @Nullable
    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileRadDecayAccelerator();
    }

    @Override
    public void onBlockHarvested(World worldIn, BlockPos pos, IBlockState state, EntityPlayer player)
    {
        if (worldIn.getTileEntity(pos) instanceof TileRadDecayAccelerator) {
            //((TileRadDecayAccelerator) worldIn.getTileEntity(pos)).resetRads();
        }
    }
}
