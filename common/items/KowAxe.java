package com.kowloon.moreswords.common.items;

import com.kowloon.moreswords.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class KowAxe extends ItemAxe {
    public KowAxe(String name, ToolMaterial material, float damage, float speed) {
        super(material, damage, speed);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(ItemInit.kowTab);
        this.attackDamage = damage;
        this.attackSpeed = speed;
    }
}
