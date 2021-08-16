package com.pablocnvs.gregicalityoreaddon;

import codechicken.lib.util.ItemNBTUtils;
import com.pablocnvs.gregicalityoreaddon.items.GAOEMetaItem;
import com.pablocnvs.gregicalityoreaddon.items.GAOEMetaItems;
import com.pablocnvs.gregicalityoreaddon.utils.GAOELog;
import gregicadditions.item.GADustItem;
import gregicadditions.materials.SimpleDustMaterial;
import gregtech.api.unification.OreDictUnifier;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.io.IOException;
import java.util.Optional;

@SideOnly(Side.CLIENT)
@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientProxy extends CommonProxy {


    @Override
    public void preLoad() {
        super.preLoad();
    }


    @Override
    public void onLoad() throws IOException {
        super.onLoad();
    }


    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        GAOEMetaItems.registerModels();
    }
}
