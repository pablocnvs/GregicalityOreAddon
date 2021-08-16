package com.pablocnvs.gregicalityoreaddon.items;

import com.bruberu.gregtechfoodoption.item.GTFOMetaItem;
import com.bruberu.gregtechfoodoption.item.GTFOOredictItem;
import com.bruberu.gregtechfoodoption.tools.GTFOMetaTool;
import gregtech.api.items.metaitem.MetaItem;
import gregtech.common.items.MetaItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

public class GAOEMetaItems {
    public static List<MetaItem<?>> ITEMS = MetaItem.getMetaItems();

    public static void init() {
        GAOEMetaItem item = new GAOEMetaItem();
        item.setRegistryName("gaoe_meta_item");
        GAOEOredictItem oreDictItem = new GAOEOredictItem((short) 0);
        oreDictItem.setRegistryName("gaoe_oredict_item");
    }

    @SideOnly(Side.CLIENT)
    public static void registerModels() {
        MinecraftForge.EVENT_BUS.register(MetaItems.class);
        for (MetaItem<?> item : ITEMS) {
            item.registerModels();
        }
    }

    public static void registerOreDict() {
        for (MetaItem<?> item : ITEMS) {
            if (item instanceof GAOEMetaItem) {
                ((GAOEMetaItem) item).registerOreDict();
            }
        }
    }
}
