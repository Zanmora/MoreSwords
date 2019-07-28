package com.kowloon.moreswords.init;

import com.kowloon.moreswords.common.blocks.KowBlock;
import com.kowloon.moreswords.common.blocks.KowOre;
import com.kowloon.moreswords.core.MoreSwords;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = MoreSwords.MODID)

public class BlockInit{

    static Block darkOre;
    static Block rustOre;
    static Block blackGemOre;
    static Block blueGemOre;
    static Block brownGemOre;
    static Block greenGemOre;
    static Block orangeGemOre;
    static Block purpleGemOre;
    static Block redGemOre;
    static Block yellowGemOre;

    public static void init(){
        darkOre = new KowOre("dark_ore", Material.ROCK).setHardness(1.5f);
        darkOre.setHarvestLevel("pickaxe", 2);
        rustOre = new KowOre("rust_ore", Material.ROCK, ItemInit.rustShard).setHardness(1.5f);
        rustOre.setHarvestLevel("pickaxe", 2);
        blackGemOre = new KowOre("blackgem_ore", Material.ROCK, ItemInit.blackGem);
        blueGemOre = new KowOre("bluegem_ore", Material.ROCK, ItemInit.blueGem);
        brownGemOre = new KowOre("browngem_ore", Material.ROCK, ItemInit.brownGem);
        greenGemOre = new KowOre("greengem_ore", Material.ROCK, ItemInit.greenGem);
        orangeGemOre = new KowOre("orangegem_ore", Material.ROCK, ItemInit.orangeGem);
        purpleGemOre = new KowOre("purplegem_ore", Material.ROCK, ItemInit.purpleGem);
        redGemOre = new KowOre("redgem_ore", Material.ROCK, ItemInit.redGem);
        yellowGemOre = new KowOre("yellowgem_ore", Material.ROCK, ItemInit.yellowGem);

    }
    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event){
        event.getRegistry().registerAll(
                darkOre, rustOre, blackGemOre, blueGemOre, brownGemOre, greenGemOre,
                 orangeGemOre, purpleGemOre, redGemOre, yellowGemOre);
    }

    @SubscribeEvent
    public static void registerItemBlocks(RegistryEvent.Register<Item> event){
        event.getRegistry().registerAll(
                new ItemBlock(darkOre).setRegistryName(darkOre.getRegistryName()),
                new ItemBlock(rustOre).setRegistryName(rustOre.getRegistryName()),
                new ItemBlock(blackGemOre).setRegistryName(blackGemOre.getRegistryName()),
                new ItemBlock(blueGemOre).setRegistryName(blueGemOre.getRegistryName()),
                new ItemBlock(brownGemOre).setRegistryName(brownGemOre.getRegistryName()),
                new ItemBlock(greenGemOre).setRegistryName(greenGemOre.getRegistryName()),
                new ItemBlock(orangeGemOre).setRegistryName(orangeGemOre.getRegistryName()),
                new ItemBlock(purpleGemOre).setRegistryName(purpleGemOre.getRegistryName()),
                new ItemBlock(redGemOre).setRegistryName(redGemOre.getRegistryName()),
                new ItemBlock(yellowGemOre).setRegistryName(yellowGemOre.getRegistryName())
        );
    }

    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event){
        registerRender(Item.getItemFromBlock(darkOre));
        registerRender(Item.getItemFromBlock(rustOre));
        registerRender(Item.getItemFromBlock(blackGemOre));
        registerRender(Item.getItemFromBlock(blueGemOre));
        registerRender(Item.getItemFromBlock(brownGemOre));
        registerRender(Item.getItemFromBlock(greenGemOre));
        registerRender(Item.getItemFromBlock(orangeGemOre));
        registerRender(Item.getItemFromBlock(purpleGemOre));
        registerRender(Item.getItemFromBlock(redGemOre));
        registerRender(Item.getItemFromBlock(yellowGemOre));

    }

    public static void registerRender(Item item){
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
    }
}
