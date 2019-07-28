package com.kowloon.moreswords.common.blocks;

import com.kowloon.moreswords.common.items.KowItem;
import com.kowloon.moreswords.core.MoreSwords;
import com.kowloon.moreswords.init.ItemInit;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

import java.util.ArrayList;

public class KowOre extends KowBlock{

    Item blockDrop;

    public KowOre(String name, Material material){
        this(name, material, null);
    }

    public KowOre(String name, Material material, Item oreDrop){
        super(name, material);
        this.blockDrop = oreDrop;
        setHardness(3f);
        setHarvestLevel("pickaxe", 3);

    }

    @Override
    public ArrayList<ItemStack> getDrops(IBlockAccess world, BlockPos pos, IBlockState blockState, int fortune){
        ArrayList<ItemStack> drops = new ArrayList<ItemStack>();

        if(blockDrop == null){
            drops.add(new ItemStack(Item.getItemFromBlock(this), 1));
        }
        else{
            drops.add(new ItemStack(blockDrop, 1));
        }
        return drops;
    }


}
