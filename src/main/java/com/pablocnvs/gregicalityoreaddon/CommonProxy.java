package com.pablocnvs.gregicalityoreaddon;

import com.pablocnvs.gregicalityoreaddon.fluid.GAOEMetaFluids;
import com.pablocnvs.gregicalityoreaddon.integration.GAOEGTFOMaterialHandler;
import com.pablocnvs.gregicalityoreaddon.items.GAOEMetaItems;
import com.pablocnvs.gregicalityoreaddon.recipe.RecipeHandler;
import com.pablocnvs.gregicalityoreaddon.recipe.GAOERecipeRemoval;
import com.pablocnvs.gregicalityoreaddon.utils.GAOELog;
import com.pablocnvs.gregicalityoreaddon.worldgen.ores.GAOEOreGenRegister;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.IOException;
import java.util.Objects;
import java.util.function.Function;


@Mod.EventBusSubscriber(modid = GregicalityOreAddon.MODID)
public class CommonProxy {


    public void preLoad() {
        GAOEMaterialHandler gaoeMaterials = new GAOEMaterialHandler();
        if (Loader.isModLoaded("gregtechfoodoption")){
            GAOEGTFOMaterialHandler gaoegtfoMaterials = new GAOEGTFOMaterialHandler();
        }
        GAOEMetaFluids.init();
        GAOEMetaItems.init();
        RecipeHandler.register();
        GAOETexture.preInit();
    }

    public void onLoad() throws IOException {
        GAOEOreGenRegister.init();

    }

    @SubscribeEvent
    public static void syncConfigValues(ConfigChangedEvent.OnConfigChangedEvent event) {
        if (event.getModID().equals(GregicalityOreAddon.MODID)) {
            ConfigManager.sync(GregicalityOreAddon.MODID, Config.Type.INSTANCE);
        }
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        GAOELog.logger.info("Registering Items...");
        GAOEMetaItems.registerOreDict();
    }

    @SubscribeEvent(priority = EventPriority.LOW)
    public static void registerRecipes(RegistryEvent.Register<IRecipe> event) {
        GAOELog.logger.info("Registering recipe low...");
        GAOERecipeRemoval.init();
        RecipeHandler.initChains();
    }


    @SubscribeEvent
    public static void registerOrePrefix(RegistryEvent.Register<IRecipe> event) {
        GAOELog.logger.info("Registering ore prefixes...");

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
