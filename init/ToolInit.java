package com.kowloon.moreswords.init;

import com.kowloon.moreswords.common.items.KowAxe;
import com.kowloon.moreswords.common.items.KowHoe;
import com.kowloon.moreswords.common.items.KowPickaxe;
import com.kowloon.moreswords.common.items.KowShovel;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


@Mod.EventBusSubscriber

public class ToolInit {

    //Types
    public static final Item.ToolMaterial darkSteelMat = EnumHelper.addToolMaterial("darkMat", 2, 500,8f,3f, 14).setRepairItem(ItemInit.darkSteel.getDefaultInstance());
    public static final Item.ToolMaterial barbMat = EnumHelper.addToolMaterial("barbMat", 2, 750,6f,2.5f, 14).setRepairItem(Item.getItemFromBlock(Blocks.IRON_BLOCK).getDefaultInstance());
    public static final Item.ToolMaterial celestialMat = EnumHelper.addToolMaterial("celestialMat", 2, 3000,6f,6f, 14).setRepairItem(ItemInit.blueGem.getDefaultInstance());
    public static final Item.ToolMaterial emeraldMat = EnumHelper.addToolMaterial("emeraldMat", 3, 1000,8f,4f, 14).setRepairItem(Items.EMERALD.getDefaultInstance());
    public static final Item.ToolMaterial crimsonMat = EnumHelper.addToolMaterial("crimsonMat", 3, 2500,8f,8f, 14).setRepairItem(ItemInit.redGem.getDefaultInstance());
    public static final Item.ToolMaterial blazeMat = EnumHelper.addToolMaterial("blazeMat", 3, 2800,8f,13f, 14).setRepairItem(ItemInit.redGem.getDefaultInstance());
    public static final Item.ToolMaterial igMat = EnumHelper.addToolMaterial("igMat", 3, 2700,8f,11f, 14).setRepairItem(Item.getItemFromBlock(Blocks.IRON_BLOCK).getDefaultInstance());
    public static final Item.ToolMaterial wornMat = EnumHelper.addToolMaterial("wornMat", 3, 20,8f,0f, 14).setRepairItem(ItemInit.blackGem.getDefaultInstance());
    public static final Item.ToolMaterial rustMat = EnumHelper.addToolMaterial("rustMat", 3, 700,8f,5f, 14).setRepairItem(ItemInit.blackGem.getDefaultInstance());
    public static final Item.ToolMaterial skyMat = EnumHelper.addToolMaterial("skyMat", 3, 2100,8f,15f, 14).setRepairItem(ItemInit.blackGem.getDefaultInstance());
    public static final Item.ToolMaterial oceanMat = EnumHelper.addToolMaterial("oceanMat", 3, 2000,12f,13f, 14).setRepairItem(ItemInit.blueGem.getDefaultInstance());
    public static final Item.ToolMaterial neonMat = EnumHelper.addToolMaterial("neonMat", 3, 2300,12f,13f, 14).setRepairItem(ItemInit.greenGem.getDefaultInstance());
    public static final Item.ToolMaterial tigerMat = EnumHelper.addToolMaterial("tigerMat", 3, 1300,12f,17f, 14).setRepairItem(ItemInit.orangeGem.getDefaultInstance());
    public static final Item.ToolMaterial tyrianMat = EnumHelper.addToolMaterial("tyrianMat", 3, 2300,12f,14f, 14).setRepairItem(ItemInit.purpleGem.getDefaultInstance());
    public static final Item.ToolMaterial cognacMat = EnumHelper.addToolMaterial("cognacMat", 3, 1700,12f,14f, 14).setRepairItem(ItemInit.brownGem.getDefaultInstance());
    public static final Item.ToolMaterial blessedMat = EnumHelper.addToolMaterial("blessedMat", 3, 1800,12f,12f, 60).setRepairItem(ItemInit.yellowGem.getDefaultInstance());




    static Item darkPickaxe;
    static Item darkAxe;
    static Item darkHoe;
    static Item darkShovel;
    static Item oceanPickaxe;
    static Item oceanAxe;
    static Item oceanHoe;
    static Item oceanShovel;

    public static void init(){
        darkPickaxe = new KowPickaxe("dark_pick", darkSteelMat);
        darkAxe = new KowAxe("dark_axe", darkSteelMat, 8f, -3.1f);
        darkHoe = new KowHoe("dark_hoe", darkSteelMat);
        darkShovel = new KowShovel("dark_shovel", darkSteelMat);
        oceanPickaxe = new KowPickaxe("ocean_pick", oceanMat);
        oceanAxe = new KowAxe("ocean_axe", oceanMat, 22f, -3.1f);
        oceanHoe = new KowHoe("ocean_hoe", oceanMat);
        oceanShovel = new KowShovel("ocean_shovel", oceanMat);

    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event){
        event.getRegistry().registerAll(darkPickaxe, darkAxe, darkHoe, darkShovel, oceanAxe, oceanHoe, oceanPickaxe, oceanShovel);
    }

    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event){
        registerRender(darkPickaxe);
        registerRender(darkAxe);
        registerRender(darkHoe);
        registerRender(darkShovel);
        registerRender(oceanAxe);
        registerRender(oceanHoe);
        registerRender(oceanPickaxe);
        registerRender(oceanShovel);
    }

    public static void registerRender(Item item){
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}


