package com.kowloon.moreswords.init;

import com.kowloon.moreswords.common.items.*;
import com.kowloon.moreswords.core.MoreSwords;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import scala.xml.Null;

import java.util.List;

import static com.kowloon.moreswords.init.ToolInit.*;

@Mod.EventBusSubscriber(modid = MoreSwords.MODID)

public class SwordInit {

    static Item barbSword;
    static Item blazeSword;
    static Item blessedSword;
    static Item celestialAxe;
    static Item cognacSword;
    static Item crimsonSword;
    static Item darkSteelSword;
    static Item emeraldSword;
    static Item igSword;
    static Item neonSword;
    static Item oceanSword;
    static Item rustySword;
    static Item skySword;
    static Item tyrianSword;
    static Item tigerSword;
    static Item wornSword;


    public static void init(){
        barbSword = new KowMediumSword("barbarian_sword", barbMat);
        blazeSword = new KowFlameSword("blaze_sword", blazeMat, 1.3D);
        blessedSword = new KowQuickSword("blessed_sword", blessedMat);
        celestialAxe = new KowMediumSword("celestial_axe", celestialMat);
        cognacSword = new KowSword("cognac_sword", cognacMat);
        crimsonSword = new KowSword("crimson_sword", crimsonMat);
        darkSteelSword = new KowMediumSword("dark_steel_sword", darkSteelMat);
        emeraldSword = new KowMediumSword("emerald_sword", emeraldMat);
        igSword = new KowGreatSword("ig_sword", igMat);
        neonSword = new KowSword("neon_sword", neonMat);
        oceanSword = new KowSword("ocean_sword", oceanMat);
        rustySword = new KowSword("rusty_sword", rustMat);
        skySword = new KowSword("sky_sword", skyMat);
        tyrianSword = new KowSword("tyrian_sword", tyrianMat);
        tigerSword = new KowQuickSword("tiger_sword", tigerMat);
        wornSword = new KowSword("worn_sword", wornMat);
    }


    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event){
        event.getRegistry().registerAll(
                barbSword, blazeSword, blessedSword, celestialAxe, cognacSword, crimsonSword,
                darkSteelSword, emeraldSword, igSword, neonSword, oceanSword,
                rustySword, skySword, tyrianSword, tigerSword, wornSword);
    }

    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event){
        registerRender(barbSword);
        registerRender(blazeSword);
        registerRender(blessedSword);
        registerRender(celestialAxe);
        registerRender(cognacSword);
        registerRender(crimsonSword);
        registerRender(darkSteelSword);
        registerRender(emeraldSword);
        registerRender(igSword);
        registerRender(neonSword);
        registerRender(oceanSword);
        registerRender(rustySword);
        registerRender(skySword);
        registerRender(tyrianSword);
        registerRender(tigerSword);
        registerRender(wornSword);
    }

    public static void registerRender(Item item){
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
