package com.lordpine.nc_gt.tiles;

import gregtech.api.capability.GregtechCapabilities;
import gregtech.api.capability.IEnergyContainer;
import nc.config.NCConfig;
import nc.multiblock.turbine.tile.TileTurbineDynamoCoil;
import nc.multiblock.turbine.tile.TileTurbinePart;
import nc.tile.energy.ITileEnergy;
import nc.tile.passive.ITilePassive;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;

import javax.annotation.Nonnull;

public class TileGTTurbineDynamoCoil {
    public static class SilverGT extends TileTurbineDynamoCoil.Silver {
        private int voltage;

        public SilverGT(int voltage) {
            super();
            this.voltage = voltage;
        }

        @Override
        public void pushEnergyToSide(@Nonnull EnumFacing side) {
            if (this.getEnergyConnection(side).canExtract() && this.getEnergyStorage().getEnergyStored() != 0) {
                TileEntity tile = this.getTileWorld().getTileEntity(this.getTilePos().offset(side));
                if (tile != null && !(tile instanceof TileTurbinePart)) {
                    if (!(tile instanceof ITileEnergy) || ((ITileEnergy) tile).getEnergyConnection(side.getOpposite()).canReceive()) {
                        if (!(tile instanceof ITilePassive) || ((ITilePassive) tile).canPushEnergyTo()) {
                            if (this.getEnergyStorage().getEnergyStored() >= NCConfig.rf_per_eu * voltage) {
                                IEnergyContainer adjStorageGT = tile.getCapability(GregtechCapabilities.CAPABILITY_ENERGY_CONTAINER, side.getOpposite());
                                if (adjStorageGT != null && this.getEnergyStorage().canExtract()) {
                                    int amperage =  Math.floorDiv(this.getEnergyStorage().getEnergyStored(), voltage);
                                    this.getEnergyStorage().extractEnergy((int)
                                            Math.min((long) voltage * adjStorageGT.acceptEnergyFromNetwork(side.getOpposite(), voltage, amperage) * (long) NCConfig.rf_per_eu,
                                                    2147483647L), false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static class CopperGT extends TileTurbineDynamoCoil.Copper {
        private int voltage;

        public CopperGT(int voltage) {
            super();
            this.voltage = voltage;
        }

        @Override
        public void pushEnergyToSide(@Nonnull EnumFacing side) {
            if (this.getEnergyConnection(side).canExtract() && this.getEnergyStorage().getEnergyStored() != 0) {
                TileEntity tile = this.getTileWorld().getTileEntity(this.getTilePos().offset(side));
                if (tile != null && !(tile instanceof TileTurbinePart)) {
                    if (!(tile instanceof ITileEnergy) || ((ITileEnergy) tile).getEnergyConnection(side.getOpposite()).canReceive()) {
                        if (!(tile instanceof ITilePassive) || ((ITilePassive) tile).canPushEnergyTo()) {
                            if (this.getEnergyStorage().getEnergyStored() >= NCConfig.rf_per_eu * voltage) {
                                IEnergyContainer adjStorageGT = tile.getCapability(GregtechCapabilities.CAPABILITY_ENERGY_CONTAINER, side.getOpposite());
                                if (adjStorageGT != null && this.getEnergyStorage().canExtract()) {
                                    int amperage =  Math.floorDiv(this.getEnergyStorage().getEnergyStored(), voltage);
                                    this.getEnergyStorage().extractEnergy((int)
                                            Math.min((long) voltage * adjStorageGT.acceptEnergyFromNetwork(side.getOpposite(), voltage, amperage) * (long) NCConfig.rf_per_eu,
                                                    2147483647L), false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static class GoldGT extends TileTurbineDynamoCoil.Gold {
        private int voltage;

        public GoldGT(int voltage) {
            super();
            this.voltage = voltage;
        }

        @Override
        public void pushEnergyToSide(@Nonnull EnumFacing side) {
            if (this.getEnergyConnection(side).canExtract() && this.getEnergyStorage().getEnergyStored() != 0) {
                TileEntity tile = this.getTileWorld().getTileEntity(this.getTilePos().offset(side));
                if (tile != null && !(tile instanceof TileTurbinePart)) {
                    if (!(tile instanceof ITileEnergy) || ((ITileEnergy) tile).getEnergyConnection(side.getOpposite()).canReceive()) {
                        if (!(tile instanceof ITilePassive) || ((ITilePassive) tile).canPushEnergyTo()) {
                            if (this.getEnergyStorage().getEnergyStored() >= NCConfig.rf_per_eu * voltage) {
                                IEnergyContainer adjStorageGT = tile.getCapability(GregtechCapabilities.CAPABILITY_ENERGY_CONTAINER, side.getOpposite());
                                if (adjStorageGT != null && this.getEnergyStorage().canExtract()) {
                                    int amperage =  Math.floorDiv(this.getEnergyStorage().getEnergyStored(), voltage);
                                    this.getEnergyStorage().extractEnergy((int)
                                            Math.min((long) voltage * adjStorageGT.acceptEnergyFromNetwork(side.getOpposite(), voltage, amperage) * (long) NCConfig.rf_per_eu,
                                                    2147483647L), false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static class AluminumGT extends TileTurbineDynamoCoil.Aluminum {
        private int voltage;

        public AluminumGT(int voltage) {
            super();
            this.voltage = voltage;
        }

        @Override
        public void pushEnergyToSide(@Nonnull EnumFacing side) {
            if (this.getEnergyConnection(side).canExtract() && this.getEnergyStorage().getEnergyStored() != 0) {
                TileEntity tile = this.getTileWorld().getTileEntity(this.getTilePos().offset(side));
                if (tile != null && !(tile instanceof TileTurbinePart)) {
                    if (!(tile instanceof ITileEnergy) || ((ITileEnergy) tile).getEnergyConnection(side.getOpposite()).canReceive()) {
                        if (!(tile instanceof ITilePassive) || ((ITilePassive) tile).canPushEnergyTo()) {
                            if (this.getEnergyStorage().getEnergyStored() >= NCConfig.rf_per_eu * voltage) {
                                IEnergyContainer adjStorageGT = tile.getCapability(GregtechCapabilities.CAPABILITY_ENERGY_CONTAINER, side.getOpposite());
                                if (adjStorageGT != null && this.getEnergyStorage().canExtract()) {
                                    int amperage =  Math.floorDiv(this.getEnergyStorage().getEnergyStored(), voltage);
                                    this.getEnergyStorage().extractEnergy((int)
                                            Math.min((long) voltage * adjStorageGT.acceptEnergyFromNetwork(side.getOpposite(), voltage, amperage) * (long) NCConfig.rf_per_eu,
                                                    2147483647L), false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static class BerylliumGT extends TileTurbineDynamoCoil.Beryllium {
        private int voltage;

        public BerylliumGT(int voltage) {
            super();
            this.voltage = voltage;
        }

        @Override
        public void pushEnergyToSide(@Nonnull EnumFacing side) {
            if (this.getEnergyConnection(side).canExtract() && this.getEnergyStorage().getEnergyStored() != 0) {
                TileEntity tile = this.getTileWorld().getTileEntity(this.getTilePos().offset(side));
                if (tile != null && !(tile instanceof TileTurbinePart)) {
                    if (!(tile instanceof ITileEnergy) || ((ITileEnergy) tile).getEnergyConnection(side.getOpposite()).canReceive()) {
                        if (!(tile instanceof ITilePassive) || ((ITilePassive) tile).canPushEnergyTo()) {
                            if (this.getEnergyStorage().getEnergyStored() >= NCConfig.rf_per_eu * voltage) {
                                IEnergyContainer adjStorageGT = tile.getCapability(GregtechCapabilities.CAPABILITY_ENERGY_CONTAINER, side.getOpposite());
                                if (adjStorageGT != null && this.getEnergyStorage().canExtract()) {
                                    int amperage =  Math.floorDiv(this.getEnergyStorage().getEnergyStored(), voltage);
                                    this.getEnergyStorage().extractEnergy((int)
                                            Math.min((long) voltage * adjStorageGT.acceptEnergyFromNetwork(side.getOpposite(), voltage, amperage) * (long) NCConfig.rf_per_eu,
                                                    2147483647L), false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static class MagnesiumGT extends TileTurbineDynamoCoil.Magnesium {
        private int voltage;

        public MagnesiumGT(int voltage) {
            super();
            this.voltage = voltage;
        }

        @Override
        public void pushEnergyToSide(@Nonnull EnumFacing side) {
            if (this.getEnergyConnection(side).canExtract() && this.getEnergyStorage().getEnergyStored() != 0) {
                TileEntity tile = this.getTileWorld().getTileEntity(this.getTilePos().offset(side));
                if (tile != null && !(tile instanceof TileTurbinePart)) {
                    if (!(tile instanceof ITileEnergy) || ((ITileEnergy) tile).getEnergyConnection(side.getOpposite()).canReceive()) {
                        if (!(tile instanceof ITilePassive) || ((ITilePassive) tile).canPushEnergyTo()) {
                            if (this.getEnergyStorage().getEnergyStored() >= NCConfig.rf_per_eu * voltage) {
                                IEnergyContainer adjStorageGT = tile.getCapability(GregtechCapabilities.CAPABILITY_ENERGY_CONTAINER, side.getOpposite());
                                if (adjStorageGT != null && this.getEnergyStorage().canExtract()) {
                                    int amperage =  Math.floorDiv(this.getEnergyStorage().getEnergyStored(), voltage);
                                    this.getEnergyStorage().extractEnergy((int)
                                            Math.min((long) voltage * adjStorageGT.acceptEnergyFromNetwork(side.getOpposite(), voltage, amperage) * (long) NCConfig.rf_per_eu,
                                                    2147483647L), false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

}
