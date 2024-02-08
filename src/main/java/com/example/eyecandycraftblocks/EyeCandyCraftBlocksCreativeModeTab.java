package com.example.eyecandycraftblocks;

import com.example.eyecandycraftblocks.blocks.BasicBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class EyeCandyCraftBlocksCreativeModeTab extends CreativeModeTab {
    public static final EyeCandyCraftBlocksCreativeModeTab ECC_BLOCKS_CREATIVE_MODE_TAB = new EyeCandyCraftBlocksCreativeModeTab(CreativeModeTab.TABS.length, "eyecandyblocks");
    private EyeCandyCraftBlocksCreativeModeTab(int index, String label) {
        super(index, label);
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(BasicBlocks.WHITE_CORRUGATED_STEEL.get());
    }

}