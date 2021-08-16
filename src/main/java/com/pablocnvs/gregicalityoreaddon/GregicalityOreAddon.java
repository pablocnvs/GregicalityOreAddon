package com.pablocnvs.gregicalityoreaddon;

import com.pablocnvs.gregicalityoreaddon.utils.GAOELog;
import gregicadditions.GAEnums;
import gregicadditions.network.IPSaveData;
import gregicadditions.utils.GALog;
import gregtech.api.GTValues;
import gregtech.api.capability.SimpleCapabilityManager;
import gregtech.api.net.NetworkHandler;
import gregtech.api.recipes.RecipeMaps;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartedEvent;
import net.minecraftforge.fml.relauncher.Side;

import java.io.IOException;

import gregicadditions.GAEnums;

import static gregicadditions.GAEnums.addSlotsToGTCEMaps;

@Mod(modid = GregicalityOreAddon.MODID, name = GregicalityOreAddon.NAME, version = GregicalityOreAddon.VERSION,
        dependencies = "required-after:gregtech@[1.14.0.689,);" +
                "after:exnihilocreatio;")
public class GregicalityOreAddon {
    public static final String MODID = "gregicalityoreaddon";
    public static final String NAME = "Gregicality Ore Addon";
    public static final String VERSION = "@1.12@";

    @SidedProxy(modId = MODID, clientSide = "com.pablocnvs.gregicalityoreaddon.ClientProxy", serverSide = "com.pablocnvs.gregicalityoreaddon.CommonProxy")
    public static CommonProxy proxy;

    public GregicalityOreAddon() {
        try {
            addSlotsToGTCEMaps(
                    RecipeMaps.FLUID_HEATER_RECIPES,
                    "maxInputs",
                    1);
        } catch (Exception e) {
            GAOELog.logger.error("Error setting recipe map fields, {}",
                    e.toString());
        }
    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        GAOELog.init(event.getModLog());
        proxy.preLoad();
        MinecraftForge.EVENT_BUS.register(new GAOEEventHandler());

        MinecraftForge.EVENT_BUS.register(this);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) throws IOException {
        proxy.onLoad();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }


}
