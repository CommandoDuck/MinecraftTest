package com.commandoduck.modTest.init;

import com.commandoduck.modTest.item.ItemMapleLeaf;
import com.commandoduck.modTest.item.ItemModTest;
import com.commandoduck.modTest.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems 
{
	public static final ItemModTest mapleLeaf = new ItemMapleLeaf();

    public static void init()
    {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
    }
}
