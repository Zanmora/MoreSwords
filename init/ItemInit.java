package com.kowloon.moreswords.init;

import com.kowloon.moreswords.common.items.KowItem;
import com.kowloon.moreswords.core.MoreSwords;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = MoreSwords.MODID)

public class ItemInit {

    public static final CreativeTabs kowTab = (new CreativeTabs("tabKowloon") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(SwordInit.blazeSword);
        }
    });

    static Item blackGem;
    static Item blueGem;
    static Item brownGem;
    static Item greenGem;
    static Item orangeGem;
    static Item purpleGem;
    static Item redGem;
    static Item yellowGem;
    static Item darkSteel;
    static Item oceanIngot;
    static Item rustShard;
    static Item blessedBlade;
    static Item blessedHilt;
    static Item celestialHilt;
    static Item lcAxe;
    static Item rcAxe;
    static Item cognacBlade;
    static Item cognacHilt;
    static Item crimsonBlade;
    static Item crimsonHilt;
    static Item igBlade;
    static Item igHilt;
    static Item igLeftBlade;
    static Item igRightBlade;
    static Item neonBlade;
    static Item neonHilt;
    static Item oceanBlade;
    static Item oceanHilt;
    static Item tigerBlade;
    static Item tigerHilt;
    static Item tyrianBlade;

    public static void init(){
        //Gems
        blackGem = new KowItem("black_gem").setCreativeTab(kowTab);
        blueGem = new KowItem("blue_gem").setCreativeTab(kowTab);
        brownGem = new KowItem("brown_gem").setCreativeTab(kowTab);
        greenGem = new KowItem("green_gem").setCreativeTab(kowTab);
        orangeGem = new KowItem("orange_gem").setCreativeTab(kowTab);
        purpleGem = new KowItem("purple_gem").setCreativeTab(kowTab);
        redGem = new KowItem("red_gem").setCreativeTab(kowTab);
        yellowGem = new KowItem("yellow_gem").setCreativeTab(kowTab);

        //Other Materials
        darkSteel = new KowItem("dark_steel").setCreativeTab(kowTab);
        oceanIngot = new KowItem("ocean_ingot").setCreativeTab(kowTab);
        rustShard = new KowItem("rust_shard").setCreativeTab(kowTab);

        //Sword Parts
        blessedBlade = new KowItem("blessed_blade");
        blessedHilt = new KowItem("blessed_hilt");
        lcAxe = new KowItem("lc_axe");
        rcAxe = new KowItem("rc_axe");
        celestialHilt = new KowItem("celestial_hilt");
        cognacBlade = new KowItem("cognac_blade");
        cognacHilt = new KowItem("cognac_hilt");
        crimsonBlade = new KowItem("crimson_blade");
        crimsonHilt = new KowItem("crimson_hilt");
        igBlade = new KowItem("ig_blade");
        igHilt = new KowItem("ig_hilt");
        igLeftBlade = new KowItem("igl_blade");
        igRightBlade = new KowItem("igr_blade");
        neonBlade = new KowItem("neon_blade");
        neonHilt = new KowItem("neon_hilt");
        oceanBlade = new KowItem("ocean_blade");
        oceanHilt = new KowItem("ocean_hilt");
        tigerBlade  = new KowItem("tiger_blade");
        tigerHilt  = new KowItem("tiger_hilt");
        tyrianBlade = new KowItem("tyrian_blade");
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event){
        event.getRegistry().registerAll(
                blackGem, blueGem, brownGem, greenGem, orangeGem, purpleGem, redGem, yellowGem,
                darkSteel, oceanIngot, rustShard, blessedBlade, blessedHilt, celestialHilt, cognacBlade
                , cognacHilt, crimsonBlade, crimsonHilt, igBlade, igHilt, igLeftBlade, igRightBlade, lcAxe,
                rcAxe, neonBlade, neonHilt, oceanBlade, oceanHilt, tigerBlade, tigerHilt, tyrianBlade);
    }


    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event){
        registerRender(blackGem);
        registerRender(blueGem);
        registerRender(brownGem);
        registerRender(greenGem);
        registerRender(purpleGem);
        registerRender(orangeGem);
        registerRender(redGem);
        registerRender(yellowGem);
        registerRender(darkSteel);
        registerRender(oceanIngot);
        registerRender(rustShard);
        registerRender(blessedBlade);
        registerRender(blessedHilt);
        registerRender(celestialHilt);
        registerRender(rcAxe);
        registerRender(lcAxe);
        registerRender(cognacBlade);
        registerRender(cognacHilt);
        registerRender(crimsonBlade);
        registerRender(crimsonHilt);
        registerRender(igBlade);
        registerRender(igHilt);
        registerRender(igLeftBlade);
        registerRender(igRightBlade);
        registerRender(neonBlade);
        registerRender(neonHilt);
        registerRender(oceanBlade);
        registerRender(oceanHilt);
        registerRender(tigerBlade);
        registerRender(tigerHilt);
        registerRender(tyrianBlade);
    }


    public static void registerRender(Item item){
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
