package com.kowloon.moreswords.common.items;

import com.kowloon.moreswords.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

public class KowHoe extends ItemHoe {
    public KowHoe(String name, ToolMaterial material){
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(ItemInit.kowTab);
    }
}
