package com.kowloon.moreswords.core;

import com.kowloon.moreswords.init.*;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;


@Mod(modid = MoreSwords.MODID, name = MoreSwords.NAME, version = MoreSwords.VERSION)
public class MoreSwords {

    public static final String MODID = "kowloonswords";
    public static final String NAME = "Kowloon's More Swords";
    public static final String VERSION = "1.2";




    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        ItemInit.init();
        SwordInit.init();
        ToolInit.init();
        BlockInit.init();


    }

    @EventHandler
    public void init(FMLInitializationEvent event){
        GameRegistry.registerWorldGenerator(new OreGen(), 0);
        SmeltRecipe.init();
    }

}
