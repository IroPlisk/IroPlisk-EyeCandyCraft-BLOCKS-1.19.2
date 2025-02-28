package com.example.eyecandycraftblocks.items;

import com.example.eyecandycraftblocks.EyeCandyCraftBlocks;
import com.example.eyecandycraftblocks.EyeCandyCraftBlocksCreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
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

    //diagonal tiles
    public static final RegistryObject<Item> WHITE_DIAGONAL_TILE_MOLD = ITEMS.register("white_diagonal_tile_mold",
            () -> new Item(new Item.Properties().tab(EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> LIGHT_GRAY_DIAGONAL_TILE_MOLD = ITEMS.register("light_gray_diagonal_tile_mold",
            () -> new Item(new Item.Properties().tab(EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> GRAY_DIAGONAL_TILE_MOLD = ITEMS.register("gray_diagonal_tile_mold",
            () -> new Item(new Item.Properties().tab(EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> BLACK_DIAGONAL_TILE_MOLD = ITEMS.register("black_diagonal_tile_mold",
            () -> new Item(new Item.Properties().tab(EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> BROWN_DIAGONAL_TILE_MOLD = ITEMS.register("brown_diagonal_tile_mold",
            () -> new Item(new Item.Properties().tab(EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> RED_DIAGONAL_TILE_MOLD = ITEMS.register("red_diagonal_tile_mold",
            () -> new Item(new Item.Properties().tab(EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> ORANGE_DIAGONAL_TILE_MOLD = ITEMS.register("orange_diagonal_tile_mold",
            () -> new Item(new Item.Properties().tab(EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> YELLOW_DIAGONAL_TILE_MOLD = ITEMS.register("yellow_diagonal_tile_mold",
            () -> new Item(new Item.Properties().tab(EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> LIME_DIAGONAL_TILE_MOLD = ITEMS.register("lime_diagonal_tile_mold",
            () -> new Item(new Item.Properties().tab(EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> GREEN_DIAGONAL_TILE_MOLD = ITEMS.register("green_diagonal_tile_mold",
            () -> new Item(new Item.Properties().tab(EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> LIGHT_BLUE_DIAGONAL_TILE_MOLD = ITEMS.register("light_blue_diagonal_tile_mold",
            () -> new Item(new Item.Properties().tab(EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> CYAN_DIAGONAL_TILE_MOLD = ITEMS.register("cyan_diagonal_tile_mold",
            () -> new Item(new Item.Properties().tab(EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> BLUE_DIAGONAL_TILE_MOLD = ITEMS.register("blue_diagonal_tile_mold",
            () -> new Item(new Item.Properties().tab(EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> PURPLE_DIAGONAL_TILE_MOLD = ITEMS.register("purple_diagonal_tile_mold",
            () -> new Item(new Item.Properties().tab(EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> MAGENTA_DIAGONAL_TILE_MOLD = ITEMS.register("magenta_diagonal_tile_mold",
            () -> new Item(new Item.Properties().tab(EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> PINK_DIAGONAL_TILE_MOLD = ITEMS.register("pink_diagonal_tile_mold",
            () -> new Item(new Item.Properties().tab(EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB)));

    // tile
    public static final RegistryObject<Item> WHITE_TILE_MOLD = ITEMS.register("white_tile_mold",
            () -> new Item(new Item.Properties().tab(EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> LIGHT_GRAY_TILE_MOLD = ITEMS.register("light_gray_tile_mold",
            () -> new Item(new Item.Properties().tab(EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> GRAY_TILE_MOLD = ITEMS.register("gray_tile_mold",
            () -> new Item(new Item.Properties().tab(EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> BLACK_TILE_MOLD = ITEMS.register("black_tile_mold",
            () -> new Item(new Item.Properties().tab(EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> BROWN_TILE_MOLD = ITEMS.register("brown_tile_mold",
            () -> new Item(new Item.Properties().tab(EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> RED_TILE_MOLD = ITEMS.register("red_tile_mold",
            () -> new Item(new Item.Properties().tab(EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> ORANGE_TILE_MOLD = ITEMS.register("orange_tile_mold",
            () -> new Item(new Item.Properties().tab(EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> YELLOW_TILE_MOLD = ITEMS.register("yellow_tile_mold",
            () -> new Item(new Item.Properties().tab(EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> LIME_TILE_MOLD = ITEMS.register("lime_tile_mold",
            () -> new Item(new Item.Properties().tab(EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> GREEN_TILE_MOLD = ITEMS.register("green_tile_mold",
            () -> new Item(new Item.Properties().tab(EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> LIGHT_BLUE_TILE_MOLD = ITEMS.register("light_blue_tile_mold",
            () -> new Item(new Item.Properties().tab(EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> CYAN_TILE_MOLD = ITEMS.register("cyan_tile_mold",
            () -> new Item(new Item.Properties().tab(EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> BLUE_TILE_MOLD = ITEMS.register("blue_tile_mold",
            () -> new Item(new Item.Properties().tab(EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> PURPLE_TILE_MOLD = ITEMS.register("purple_tile_mold",
            () -> new Item(new Item.Properties().tab(EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> MAGENTA_TILE_MOLD = ITEMS.register("magenta_tile_mold",
            () -> new Item(new Item.Properties().tab(EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> PINK_TILE_MOLD = ITEMS.register("pink_tile_mold",
            () -> new Item(new Item.Properties().tab(EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB)));

    // small tile
    public static final RegistryObject<Item> WHITE_SMALL_TILE_MOLD = ITEMS.register("white_small_tile_mold",
            () -> new Item(new Item.Properties().tab(EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> LIGHT_SMALL_GRAY_TILE_MOLD = ITEMS.register("light_gray_small_tile_mold",
            () -> new Item(new Item.Properties().tab(EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> GRAY_SMALL_TILE_MOLD = ITEMS.register("gray_small_tile_mold",
            () -> new Item(new Item.Properties().tab(EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> BLACK_SMALL_TILE_MOLD = ITEMS.register("black_small_tile_mold",
            () -> new Item(new Item.Properties().tab(EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> BROWN_SMALL_TILE_MOLD = ITEMS.register("brown_small_tile_mold",
            () -> new Item(new Item.Properties().tab(EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> RED_SMALL_TILE_MOLD = ITEMS.register("red_small_tile_mold",
            () -> new Item(new Item.Properties().tab(EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> ORANGE_SMALL_TILE_MOLD = ITEMS.register("orange_small_tile_mold",
            () -> new Item(new Item.Properties().tab(EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> YELLOW_SMALL_TILE_MOLD = ITEMS.register("yellow_small_tile_mold",
            () -> new Item(new Item.Properties().tab(EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> LIME_SMALL_TILE_MOLD = ITEMS.register("lime_small_tile_mold",
            () -> new Item(new Item.Properties().tab(EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> GREEN_SMALL_TILE_MOLD = ITEMS.register("green_small_tile_mold",
            () -> new Item(new Item.Properties().tab(EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> LIGHT_SMALL_BLUE_TILE_MOLD = ITEMS.register("light_blue_small_tile_mold",
            () -> new Item(new Item.Properties().tab(EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> CYAN_SMALL_TILE_MOLD = ITEMS.register("cyan_small_tile_mold",
            () -> new Item(new Item.Properties().tab(EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> BLUE_SMALL_TILE_MOLD = ITEMS.register("blue_small_tile_mold",
            () -> new Item(new Item.Properties().tab(EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> PURPLE_SMALL_TILE_MOLD = ITEMS.register("purple_small_tile_mold",
            () -> new Item(new Item.Properties().tab(EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> MAGENTA_SMALL_TILE_MOLD = ITEMS.register("magenta_small_tile_mold",
            () -> new Item(new Item.Properties().tab(EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> PINK_SMALL_TILE_MOLD = ITEMS.register("pink_small_tile_mold",
            () -> new Item(new Item.Properties().tab(EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB)));

    //Brick tile
    public static final RegistryObject<Item> WHITE_BRICK_TILE_MOLD = ITEMS.register("white_brick_tile_mold",
            () -> new Item(new Item.Properties().tab(EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> LIGHT_GRAY_BRICK_TILE_MOLD = ITEMS.register("light_gray_brick_tile_mold",
            () -> new Item(new Item.Properties().tab(EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> GRAY_BRICK_TILE_MOLD = ITEMS.register("gray_brick_tile_mold",
            () -> new Item(new Item.Properties().tab(EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> BLACK_BRICK_TILE_MOLD = ITEMS.register("black_brick_tile_mold",
            () -> new Item(new Item.Properties().tab(EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> BROWN_BRICK_TILE_MOLD = ITEMS.register("brown_brick_tile_mold",
            () -> new Item(new Item.Properties().tab(EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> RED_BRICK_TILE_MOLD = ITEMS.register("red_brick_tile_mold",
            () -> new Item(new Item.Properties().tab(EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> ORANGE_BRICK_TILE_MOLD = ITEMS.register("orange_brick_tile_mold",
            () -> new Item(new Item.Properties().tab(EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> YELLOW_BRICK_TILE_MOLD = ITEMS.register("yellow_brick_tile_mold",
            () -> new Item(new Item.Properties().tab(EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> LIME_BRICK_TILE_MOLD = ITEMS.register("lime_brick_tile_mold",
            () -> new Item(new Item.Properties().tab(EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> GREEN_BRICK_TILE_MOLD = ITEMS.register("green_brick_tile_mold",
            () -> new Item(new Item.Properties().tab(EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> LIGHT_BLUE_BRICK_TILE_MOLD = ITEMS.register("light_blue_brick_tile_mold",
            () -> new Item(new Item.Properties().tab(EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> CYAN_BRICK_TILE_MOLD = ITEMS.register("cyan_brick_tile_mold",
            () -> new Item(new Item.Properties().tab(EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> BLUE_BRICK_TILE_MOLD = ITEMS.register("blue_brick_tile_mold",
            () -> new Item(new Item.Properties().tab(EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> PURPLE_BRICK_TILE_MOLD = ITEMS.register("purple_brick_tile_mold",
            () -> new Item(new Item.Properties().tab(EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> MAGENTA_BRICK_TILE_MOLD = ITEMS.register("magenta_brick_tile_mold",
            () -> new Item(new Item.Properties().tab(EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> PINK_BRICK_TILE_MOLD = ITEMS.register("pink_brick_tile_mold",
            () -> new Item(new Item.Properties().tab(EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB)));

    public static void register(IEventBus eventBus) { ITEMS.register(eventBus);}

}
