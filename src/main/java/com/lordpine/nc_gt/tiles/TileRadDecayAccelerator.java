package com.lordpine.nc_gt.tiles;

import net.minecraft.tileentity.TileEntity;

public class TileRadDecayAccelerator extends TileEntity {//implements ITickable {

//    private double old_rads = -1.0d;
//    private final int iterations = 3;
//
//    /**
//     * Like the old updateEntity(), except more generic.
//     */
//    @Override
//    public void update() {
//        if (this.world.isRemote || (this.world.getWorldTime() % NCConfig.radiation_world_tick_rate) != 0 || !(this.world instanceof WorldServer)) return;
//        Chunk chunk = this.getWorld().getChunkFromBlockCoords(this.getPos());
//        if (!chunk.hasCapability(IRadiationSource.CAPABILITY_RADIATION_SOURCE, null)) return;
//        IRadiationSource chunkRadiation = chunk.getCapability(IRadiationSource.CAPABILITY_RADIATION_SOURCE, null);
//        double changeRate = NCConfig.radiation_decay_rate;
//        this.old_rads = Math.max(0D, this.old_rads *  Math.pow((1-changeRate),((double)iterations)));
//        System.out.println("old_rads = " + this.old_rads);
//        chunkRadiation.setRadiationLevel(2*this.old_rads);
//        System.out.println("level = " + chunkRadiation.getRadiationLevel());
//    }
//
//    @Override
//    public void onLoad() {
//        super.onLoad();
//        if (this.old_rads == -1.0d) {
//            Chunk chunk = this.getWorld().getChunkFromBlockCoords(this.getPos());
//            if (!chunk.hasCapability(IRadiationSource.CAPABILITY_RADIATION_SOURCE, null)) return;
//            IRadiationSource chunkRadiation = chunk.getCapability(IRadiationSource.CAPABILITY_RADIATION_SOURCE, null);
//            this.old_rads = chunkRadiation.getRadiationLevel();
//        }
//    }
//
//    @Override
//    public NBTTagCompound writeToNBT(NBTTagCompound compound) {
//        compound.setDouble("old_rads", this.old_rads);
//        return super.writeToNBT(compound);
//    }
//
//    @Override
//    public void readFromNBT(NBTTagCompound compound) {
//        this.old_rads = compound.getDouble("old_rads");
//        super.readFromNBT(compound);
//    }
//
//    public void resetRads() {
//        Chunk chunk = this.getWorld().getChunkFromBlockCoords(this.getPos());
//        if (!chunk.hasCapability(IRadiationSource.CAPABILITY_RADIATION_SOURCE, null)) return;
//        IRadiationSource chunkRadiation = chunk.getCapability(IRadiationSource.CAPABILITY_RADIATION_SOURCE, null);
//        chunkRadiation.setRadiationLevel(old_rads);
//    }
}
