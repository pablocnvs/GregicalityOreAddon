package com.pablocnvs.gregicalityoreaddon;

import gregtech.api.unification.material.MaterialIconType;
import gregtech.api.unification.material.type.GemMaterial;
import gregtech.api.unification.material.type.Material;
import gregtech.api.unification.ore.OrePrefix;
import net.minecraftforge.common.util.EnumHelper;

import java.util.function.Predicate;

import static gregicadditions.GAEnums.createMaterialIconType;
import static gregtech.api.GTValues.M;

public class GAOEEnums {


    /*public static class GAOEMaterialIconType{
        public static final MaterialIconType gemSupreme = createMaterialIconType("gemSupreme");
        public static final MaterialIconType alteredLens = createMaterialIconType("alteredLens");
    }

    public static class GAOEOrePrefix{
            public final static OrePrefix alteredLens = createOrePrefix("alteredLens", "Altered Lens", 2*M, null, GAOEMaterialIconType.alteredLens, 0, pred(gem::test));
    }


    public static final Predicate<Material> gem = mat -> mat instanceof GemMaterial;


    public static OrePrefix createOrePrefix(String orePrefix, String categoryName, long materialAmount, Material material, MaterialIconType materialIconType, long flags, Predicate<Material> condition) {
        EnumHelper.addEnum(OrePrefix.class, orePrefix,
                new Class[]{String.class, long.class, Material.class, MaterialIconType.class, long.class, Predicate.class},
                categoryName, materialAmount, material, materialIconType, flags, condition);
        return OrePrefix.valueOf(orePrefix);

    }

    private static Predicate<Material> pred(Predicate<Material> in) {
        return in::test;
    }


     */

}
