package com.example.eyecandycraftblocks;

import com.example.eyecandycraftblocks.blocks.BasicBlocks;
import com.example.eyecandycraftblocks.items.BasicItemBlocks;
import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(EyeCandyCraftBlocks.MODID)
public class EyeCandyCraftBlocks
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "eyecandycraftblocks";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    // Create a Deferred Register to hold Blocks which will all be registered under the "examplemod" namespace
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    // Create a Deferred Register to hold Items which will all be registered under the "examplemod" namespace
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    public EyeCandyCraftBlocks()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);
        BasicBlocks.register(modEventBus);
        BasicItemBlocks.register(modEventBus);
        // Register the Deferred Register to the mod event bus so blocks get registered
        BLOCKS.register(modEventBus);
        // Register the Deferred Register to the mod event bus so items get registered
        ITEMS.register(modEventBus);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        // Some common setup code
        LOGGER.info("HELLO FROM COMMON SETUP");
        LOGGER.info("DIRT BLOCK >> {}", ForgeRegistries.BLOCKS.getKey(Blocks.DIRT));
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        // Do something when the server starts
        LOGGER.info("EyeCandyCraft in carihamento...");
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            // Meno male che setRenderLayer viene rimosso nelle versioni future, è una palla assurda sta merda
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
            ItemBlockRenderTypes.setRenderLayer(BasicBlocks.TINTEDWHITE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BasicBlocks.TINTEDLIGHTGRAY.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BasicBlocks.TINTEDGRAY.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BasicBlocks.TINTEDBLACK.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BasicBlocks.TINTEDBROWN.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BasicBlocks.TINTEDRED.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BasicBlocks.TINTEDORANGE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BasicBlocks.TINTEDYELLOW.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BasicBlocks.TINTEDLIME.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BasicBlocks.TINTEDGREEN.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BasicBlocks.TINTEDLIGHTBLUE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BasicBlocks.TINTEDCYAN.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BasicBlocks.TINTEDBLUE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BasicBlocks.TINTEDPURPLE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BasicBlocks.TINTEDMAGENTA.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BasicBlocks.TINTEDPINK.get(), RenderType.translucent());
        }
    }
}
