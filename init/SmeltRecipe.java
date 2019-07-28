package com.kowloon.moreswords.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class SmeltRecipe {

    public static void init(){
        GameRegistry.addSmelting(BlockInit.darkOre, new ItemStack(ItemInit.darkSteel, 1), 0.5f);
    }
}
