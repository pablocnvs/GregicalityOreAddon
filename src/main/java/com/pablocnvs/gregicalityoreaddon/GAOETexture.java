package com.pablocnvs.gregicalityoreaddon;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(modid = GregicalityOreAddon.MODID, value = Side.CLIENT)
public class GAOETexture {
    public static ResourceLocation AUTH_CAPE;

    public static void preInit(){
        AUTH_CAPE = new ResourceLocation(GregicalityOreAddon.MODID,"textures/other/auth_cape.png");
    }
}