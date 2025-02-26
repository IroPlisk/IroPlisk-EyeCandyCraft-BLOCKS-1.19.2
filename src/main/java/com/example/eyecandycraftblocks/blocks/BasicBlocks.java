package com.example.eyecandycraftblocks.blocks;

import com.example.eyecandycraftblocks.EyeCandyCraftBlocks;
import com.example.eyecandycraftblocks.EyeCandyCraftBlocksCreativeModeTab;
import com.example.eyecandycraftblocks.items.BasicItemBlocks;

import net.minecraft.world.level.block.*;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BasicBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, EyeCandyCraftBlocks.MODID);

    // corrugated steel
    public static final RegistryObject<Block> WHITE_CORRUGATED_STEEL = registerBlock("corrugatedsteelwhite",
            () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> LIGHT_GRAY_CORRUGATED_STEEL = registerBlock("corrugatedsteellightgray",
            () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> GRAY_CORRUGATED_STEEL = registerBlock("corrugatedsteelgray",
            () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> BLACK_CORRUGATED_STEEL = registerBlock("corrugatedsteelblack",
            () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> BROWN_CORRUGATED_STEEL = registerBlock("corrugatedsteelbrown",
            () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> RED_CORRUGATED_STEEL = registerBlock("corrugatedsteelred",
            () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> ORANGE_CORRUGATED_STEEL = registerBlock("corrugatedsteelorange",
            () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> YELLOW_CORRUGATED_STEEL = registerBlock("corrugatedsteelyellow",
            () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> LIME_CORRUGATED_STEEL = registerBlock("corrugatedsteellime",
            () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> GREEN_CORRUGATED_STEEL = registerBlock("corrugatedsteelgreen",
            () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> LIGHT_BLUE_CORRUGATED_STEEL = registerBlock("corrugatedsteellightblue",
            () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> CYAN_CORRUGATED_STEEL = registerBlock("corrugatedsteelcyan",
            () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> BLUE_CORRUGATED_STEEL = registerBlock("corrugatedsteelblue",
            () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> PURPLE_CORRUGATED_STEEL = registerBlock("corrugatedsteelpurple",
            () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> MAGENTA_CORRUGATED_STEEL = registerBlock("corrugatedsteelmagenta",
            () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> PINK_CORRUGATED_STEEL = registerBlock("corrugatedsteelpink",
            () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    // misto
    public static final RegistryObject<Block> ASPHALT = registerBlock("asphalt",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> HAZSTRIPE = registerBlock("hazstripe",
            () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> FAKESOLAR = registerBlock("fakesolar",
            () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> FAKECRATE = registerBlock("fakecrate",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.5f).sound(SoundType.WOOD).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> FAKEVENT = registerBlock("fakevent",
            () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> CARTAI = registerBlock("cartai",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.5f).sound(SoundType.WOOD).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> CARTAX = registerBlock("cartax",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.5f).sound(SoundType.WOOD).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> MORTAR = registerBlock("mortar",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> THATCH = registerBlock("thatch",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.5f).sound(SoundType.WOOD).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);

    // Tinted glass
    public static final RegistryObject<Block> TINTEDWHITE = registerBlock("tintedwhite",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion().sound(SoundType.GLASS).isViewBlocking((state, getter, pos) -> false)), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> TINTEDLIGHTGRAY = registerBlock("tintedlightgray",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion().sound(SoundType.GLASS).isViewBlocking((state, getter, pos) -> false)), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> TINTEDGRAY = registerBlock("tintedgray",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion().sound(SoundType.GLASS).isViewBlocking((state, getter, pos) -> false)), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> TINTEDBLACK = registerBlock("tintedblack",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion().sound(SoundType.GLASS).isViewBlocking((state, getter, pos) -> false)), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> TINTEDBROWN = registerBlock("tintedbrown",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion().sound(SoundType.GLASS).isViewBlocking((state, getter, pos) -> false)), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> TINTEDRED = registerBlock("tintedred",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion().sound(SoundType.GLASS).isViewBlocking((state, getter, pos) -> false)), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> TINTEDORANGE = registerBlock("tintedorange",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion().sound(SoundType.GLASS).isViewBlocking((state, getter, pos) -> false)), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> TINTEDYELLOW = registerBlock("tintedyellow",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion().sound(SoundType.GLASS).isViewBlocking((state, getter, pos) -> false)), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> TINTEDLIME = registerBlock("tintedlime",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion().sound(SoundType.GLASS).isViewBlocking((state, getter, pos) -> false)), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> TINTEDGREEN = registerBlock("tintedgreen",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion().sound(SoundType.GLASS).isViewBlocking((state, getter, pos) -> false)), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> TINTEDLIGHTBLUE = registerBlock("tintedlightblue",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion().sound(SoundType.GLASS).isViewBlocking((state, getter, pos) -> false)), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> TINTEDCYAN = registerBlock("tintedcyan",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion().sound(SoundType.GLASS).isViewBlocking((state, getter, pos) -> false)), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> TINTEDBLUE = registerBlock("tintedblue",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion().sound(SoundType.GLASS).isViewBlocking((state, getter, pos) -> false)), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> TINTEDPURPLE = registerBlock("tintedpurple",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion().sound(SoundType.GLASS).isViewBlocking((state, getter, pos) -> false)), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> TINTEDMAGENTA = registerBlock("tintedmagenta",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion().sound(SoundType.GLASS).isViewBlocking((state, getter, pos) -> false)), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> TINTEDPINK = registerBlock("tintedpink",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion().sound(SoundType.GLASS).isViewBlocking((state, getter, pos) -> false)), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);

    //Diagonal Tiles
    public static final RegistryObject<Block> WHITE_DIAGONAL_TILE = registerBlock("diagonaltilewhite",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> LIGHT_GRAY_DIAGONAL_TILE = registerBlock("diagonaltilelightgray",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> GRAY_DIAGONAL_TILE = registerBlock("diagonaltilegray",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> BLACK_DIAGONAL_TILE = registerBlock("diagonaltileblack",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> BROWN_DIAGONAL_TILE = registerBlock("diagonaltilebrown",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> RED_DIAGONAL_TILE = registerBlock("diagonaltilered",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> ORANGE_DIAGONAL_TILE = registerBlock("diagonaltileorange",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> YELLOW_DIAGONAL_TILE = registerBlock("diagonaltileyellow",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> LIME_DIAGONAL_TILE = registerBlock("diagonaltilelime",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> GREEN_DIAGONAL_TILE = registerBlock("diagonaltilegreen",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> LIGHT_BLUE_DIAGONAL_TILE = registerBlock("diagonaltilelightblue",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> CYAN_DIAGONAL_TILE = registerBlock("diagonaltilecyan",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> BLUE_DIAGONAL_TILE = registerBlock("diagonaltileblue",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> PURPLE_DIAGONAL_TILE = registerBlock("diagonaltilepurple",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> MAGENTA_DIAGONAL_TILE = registerBlock("diagonaltilemagenta",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> PINK_DIAGONAL_TILE = registerBlock("diagonaltilepink",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);

    //Tiles
    public static final RegistryObject<Block> WHITE_TILE = registerBlock("tilewhite",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> LIGHT_GRAY_TILE = registerBlock("tilelightgray",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> GRAY_TILE = registerBlock("tilegray",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> BLACK_TILE = registerBlock("tileblack",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> BROWN_TILE = registerBlock("tilebrown",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> RED_TILE = registerBlock("tilered",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> ORANGE_TILE = registerBlock("tileorange",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> YELLOW_TILE = registerBlock("tileyellow",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> LIME_TILE = registerBlock("tilelime",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> GREEN_TILE = registerBlock("tilegreen",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> LIGHT_BLUE_TILE = registerBlock("tilelightblue",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> CYAN_TILE = registerBlock("tilecyan",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> BLUE_TILE = registerBlock("tileblue",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> PURPLE_TILE = registerBlock("tilepurple",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> MAGENTA_TILE = registerBlock("tilemagenta",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> PINK_TILE = registerBlock("tilepink",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);

    //Small Tiles
    public static final RegistryObject<Block> SMALL_WHITE_TILE = registerBlock("tileswhite",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> SMALL_LIGHT_GRAY_TILE = registerBlock("tileslightgray",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> SMALL_GRAY_TILE = registerBlock("tilesgray",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> SMALL_BLACK_TILE = registerBlock("tilesblack",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> SMALL_BROWN_TILE = registerBlock("tilesbrown",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> SMALL_RED_TILE = registerBlock("tilesred",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> SMALL_ORANGE_TILE = registerBlock("tilesorange",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> SMALL_YELLOW_TILE = registerBlock("tilesyellow",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> SMALL_LIME_TILE = registerBlock("tileslime",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> SMALL_GREEN_TILE = registerBlock("tilesgreen",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> SMALL_LIGHT_BLUE_TILE = registerBlock("tileslightblue",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> SMALL_CYAN_TILE = registerBlock("tilescyan",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> SMALL_BLUE_TILE = registerBlock("tilesblue",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> SMALL_PURPLE_TILE = registerBlock("tilespurple",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> SMALL_MAGENTA_TILE = registerBlock("tilesmagenta",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> SMALL_PINK_TILE = registerBlock("tilespink",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);

    //Brick Tiles
    public static final RegistryObject<Block> WHITE_BRICK_TILE = registerBlock("tilebwhite",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> LIGHT_GRAY_BRICK_TILE = registerBlock("tileblightgray",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> GRAY_BRICK_TILE = registerBlock("tilebgray",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> BLACK_BRICK_TILE = registerBlock("tilebblack",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> BROWN_BRICK_TILE = registerBlock("tilebbrown",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> RED_BRICK_TILE = registerBlock("tilebred",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> ORANGE_BRICK_TILE = registerBlock("tileborange",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> YELLOW_BRICK_TILE = registerBlock("tilebyellow",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> LIME_BRICK_TILE = registerBlock("tileblime",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> GREEN_BRICK_TILE = registerBlock("tilebgreen",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> LIGHT_BLUE_BRICK_TILE = registerBlock("tileblightblue",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> CYAN_BRICK_TILE = registerBlock("tilebcyan",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> BLUE_BRICK_TILE = registerBlock("tilebblue",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> PURPLE_BRICK_TILE = registerBlock("tilebpurple",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> MAGENTA_BRICK_TILE = registerBlock("tilebmagenta",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> PINK_BRICK_TILE = registerBlock("tilebpink",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.5f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);


    // Doors, trapdoors and whatnot
    public static final RegistryObject<Block> TOMBINO = registerBlock("tombino",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(7f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    // emitter
    public static final RegistryObject<Block> EMITTERBIRCH = registerBlock("emitterbirch",
            () -> new PoweredBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS)
                    .strength(2.5f)), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> EMITTEROAK = registerBlock("emitteroak",
            () -> new PoweredBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(2.5f)), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> EMITTERSPRUCE = registerBlock("emitterspruce",
            () -> new PoweredBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)
                    .strength(2.5f)), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> EMITTERSTONE = registerBlock("emitterstone",
            () -> new PoweredBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2.5f)), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> EMITTERCOBBLESTONE = registerBlock("emittercobblestone",
            () -> new PoweredBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)
                    .strength(2.5f)), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> EMITTERSTONEBRICKS = registerBlock("emitterstonebricks",
            () -> new PoweredBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)
                    .strength(2.5f)), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> EMITTERCONCRETE = registerBlock("emitterconcrete",
            () -> new PoweredBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA) //lmao teracota 8====D
                    .strength(2.5f)), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);

    // reinforced concrete della railcraft
    public static final RegistryObject<Block> CONCRETE_RED = registerBlock("concretered",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(6f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> CONCRETE_ORANGE = registerBlock("concreteorange",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(6f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> CONCRETE_YELLOW = registerBlock("concreteyellow",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(6f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> CONCRETE_LIME = registerBlock("concretelime",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(6f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> CONCRETE_GREEN = registerBlock("concretegreen",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(6f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> CONCRETE_CYAN = registerBlock("concretecyan",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(6f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> CONCRETE_LIGHT_BLUE = registerBlock("concretelightblue",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(6f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> CONCRETE_BLUE = registerBlock("concreteblue",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(6f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> CONCRETE_PURPLE = registerBlock("concretepurple",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(6f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> CONCRETE_MAGENTA = registerBlock("concretemagenta",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(6f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> CONCRETE_PINK = registerBlock("concretepink",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(6f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> CONCRETE_BROWN = registerBlock("concretebrown",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(6f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> CONCRETE_BLACK = registerBlock("concreteblack",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(6f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> CONCRETE_GRAY = registerBlock("concretegray",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(6f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> CONCRETE_LIGHT_GRAY = registerBlock("concretelightgray",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(6f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> CONCRETE_WHITE = registerBlock("concretewhite",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(6f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> OLD_GRASS = registerBlock("old_grass",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(1f).sound(SoundType.GRASS).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> AETHER_GRASS = registerBlock("angelic_grass",
            () -> new Block(BlockBehaviour.Properties.of(Material.GRASS)
                    .strength(1f).sound(SoundType.GRASS).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> AETHER_DIRT = registerBlock("angelic_dirt",
            () -> new Block(BlockBehaviour.Properties.of(Material.GRASS)
                    .strength(1f).sound(SoundType.ROOTED_DIRT).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab){
        return BasicItemBlocks.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
