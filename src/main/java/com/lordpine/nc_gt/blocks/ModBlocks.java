package com.lordpine.nc_gt.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod.EventBusSubscriber
public class ModBlocks {

    @GameRegistry.ObjectHolder("nc_gt:rad_accelerator")
    public static Block rad_accelerator;

    public static void init() {
//        rad_accelerator = new BlockRadDecayAccelerator(net.minecraft.block.material.Material.IRON, "rad_accelerator");
//        registerBlock(rad_accelerator);
    }

    public static void registerBlock(Block block) {
        ForgeRegistries.BLOCKS.register(block);
    }

    public static void registerItemBlock(Block block, RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
    }



    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        //registerItemBlock(rad_accelerator, event);
    }
}
