package com.pablocnvs.gregicalityoreaddon.items;

import com.pablocnvs.gregicalityoreaddon.GAOEEnums;
import gregtech.api.items.materialitem.MaterialMetaItem;
import gregtech.api.items.metaitem.MetaItem;
import net.minecraft.item.ItemStack;


public class GAOEMetaItem extends MaterialMetaItem {
        public GAOEMetaItem() {
            super();
        }

    public static MetaItem<?>.MetaValueItem STYRENE_MESH;
    public static MetaItem<?>.MetaValueItem CLOGGED_STYRENE_MESH;
    public static MetaItem<?>.MetaValueItem TOURMALT_YELLOW_LENS;
    public static MetaItem<?>.MetaValueItem TOURMALT_ORANGE_LENS;
    public static MetaItem<?>.MetaValueItem TOURMALT_GREEN_LENS;
    public static MetaItem<?>.MetaValueItem TOURMALT_LIGHT_BLUE_LENS;
    public static MetaItem<?>.MetaValueItem TOURMALT_WHITE_LENS;
    public static MetaItem<?>.MetaValueItem TOURMALT_BLUE_LENS;
    public static MetaItem<?>.MetaValueItem TOURMALT_MAGENTA_LENS;
    public static MetaItem<?>.MetaValueItem TOURMALT_PURPLE_LENS;
    public static MetaItem<?>.MetaValueItem TOURMALT_LIME_LENS;
    public static MetaItem<?>.MetaValueItem TOURMALT_PINK_LENS;
    public static MetaItem<?>.MetaValueItem PIEZOPYROELECTRIC_SENSOR_CRYSTAL;
    public static MetaItem<?>.MetaValueItem UIV_SENSOR_CRYSTAL;

    @Override
    public void registerSubItems(){
        PIEZOPYROELECTRIC_SENSOR_CRYSTAL = addItem(0, "pzt.tourmaline.sensor.crystal");
        STYRENE_MESH = addItem(1, "styrene.mesh");
        CLOGGED_STYRENE_MESH = addItem(2, "clogged.styrene.mesh");
        TOURMALT_YELLOW_LENS = addItem(3, "tourmaline.altered.yellow.lens");
        TOURMALT_ORANGE_LENS = addItem(4, "tourmaline.altered.orange.lens");
        TOURMALT_GREEN_LENS = addItem(5, "tourmaline.altered.green.lens");
        TOURMALT_LIGHT_BLUE_LENS = addItem(6, "tourmaline.altered.light.blue.lens");
        TOURMALT_WHITE_LENS = addItem(7, "tourmaline.altered.white.lens");
        TOURMALT_BLUE_LENS = addItem(8, "tourmaline.altered.blue.lens");
        TOURMALT_MAGENTA_LENS = addItem(9, "tourmaline.altered.magenta.lens");
        TOURMALT_PURPLE_LENS = addItem(10, "tourmaline.altered.purple.lens");
        TOURMALT_LIME_LENS = addItem(11, "tourmaline.altered.lime.lens");
        TOURMALT_PINK_LENS = addItem(12, "tourmaline.altered.pink.lens");
        UIV_SENSOR_CRYSTAL = addItem(13, "sensor.uiv.crystal");

    }

    @Override
    public ItemStack getContainerItem(ItemStack stack) {
        return stack.copy();
    }
}
