package com.example.eyecandycraftblocks.items;

import com.example.eyecandycraftblocks.EyeCandyCraftBlocks;
import com.example.eyecandycraftblocks.EyeCandyCraftBlocksCreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.redstone.Redstone;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BasicItemBlocks {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, EyeCandyCraftBlocks.MODID);

    public static final RegistryObject<Item> STRAW = ITEMS.register("straw",
            () -> new Item(new Item.Properties().tab(EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB)));

    public static final RegistryObject<Item> MOLTENGLASS = ITEMS.register("moltenglass",
            () -> new Item(new Item.Properties().tab(EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB)));


    public static void register(IEventBus eventBus) { ITEMS.register(eventBus);}

}
