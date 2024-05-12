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

    // porte trapdoor e altre cazzate
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
