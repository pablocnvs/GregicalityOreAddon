package com.pablocnvs.gregicalityoreaddon;

import com.pablocnvs.gregicalityoreaddon.recipe.GAOERecipeAddition;
import com.pablocnvs.gregicalityoreaddon.recipe.OreRecipeHandler;
import com.pablocnvs.gregicalityoreaddon.utils.GAOELog;
import gregtech.api.unification.ore.OrePrefix;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

import java.io.IOException;
import java.util.Objects;
import java.util.function.Function;


@Mod.EventBusSubscriber(modid = GregicalityOreAddon.MODID)
public class CommonProxy {


    public void preLoad() {
        GAOEMaterialHandler gaoeMaterials = new GAOEMaterialHandler();
    }

    public void onLoad() throws IOException {

    }

    @SubscribeEvent
    public static void syncConfigValues(ConfigChangedEvent.OnConfigChangedEvent event) {
        if (event.getModID().equals(GregicalityOreAddon.MODID)) {
            ConfigManager.sync(GregicalityOreAddon.MODID, Config.Type.INSTANCE);
        }
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        /*
        GTFOLog.logger.info("Registering blocks...");
        IForgeRegistry<Block> registry = event.getRegistry();
        registry.register(GAMetaBlocks.MUTLIBLOCK_CASING);
         */
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        GAOELog.logger.info("Registering Items...");
        IForgeRegistry<Item> registry = event.getRegistry();
    }

    @SubscribeEvent(priority = EventPriority.LOW)
    public static void registerRecipes(RegistryEvent.Register<IRecipe> event) {
        GAOELog.logger.info("Registering recipe low...");
    }


    @SubscribeEvent
    public static void registerOrePrefix(RegistryEvent.Register<IRecipe> event) {
        GAOELog.logger.info("Registering ore prefix...");
        OrePrefix.runMaterialHandlers();
        GAOERecipeAddition.init();
        OreRecipeHandler.register();
        GAOELog.logger.info("Registering froth flotation chain...");
    }

    private static <T extends Block> ItemBlock createItemBlock(T block, Function<T, ItemBlock> producer) {
        ItemBlock itemBlock = producer.apply(block);
        itemBlock.setRegistryName(Objects.requireNonNull(block.getRegistryName()));
        return itemBlock;
    }

    @SubscribeEvent(priority = EventPriority.LOWEST)
    public static void registerRecipesLowest(RegistryEvent.Register<IRecipe> event) {
    }

    // These recipes are generated at the beginning of the init() phase with the proper config set.
    // This is not great practice, but ensures that they are run AFTER CraftTweaker,
    // meaning they will follow the recipes in the map with CraftTweaker changes,
    // being significantly easier for modpack authors.


    /*
    @SubscribeEvent(priority = EventPriority.HIGH)
    public static void onLogin(PlayerEvent.PlayerLoggedInEvent event) {
        if (!event.player.world.isRemote) {
        }
    }

    @SubscribeEvent
    public static void onSave(WorldEvent.Save event) {

    }

    @SubscribeEvent
    public static void onUnload(WorldEvent.Unload event) {

    }
    */
}
