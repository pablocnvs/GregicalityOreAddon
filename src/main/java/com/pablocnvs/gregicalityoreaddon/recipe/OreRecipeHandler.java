package com.pablocnvs.gregicalityoreaddon.recipe;

import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.material.type.DustMaterial;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.api.util.GTUtility;
import net.minecraft.item.ItemStack;

import static gregtech.api.recipes.RecipeMaps.*;
import static com.pablocnvs.gregicalityoreaddon.GAOEMaterialHandler.*;
import static gregtech.api.unification.ore.OrePrefix.*;

public class OreRecipeHandler {

    public static void register(){
        crushed.addProcessingHandler(DustMaterial.class, OreRecipeHandler::frothflotation);
    }

    public static void frothflotation(OrePrefix dustCrushedPrefix, DustMaterial material) {
            DustMaterial firstbyproduct = GTUtility.selectItemInList(0, material, material.oreByProducts, DustMaterial.class);
            DustMaterial secondbyproduct = GTUtility.selectItemInList(1, material, material.oreByProducts, DustMaterial.class);
            ItemStack firstbyproductstack = OreDictUnifier.get(OrePrefix.dust, firstbyproduct, 2);
            ItemStack secondbyproductstack = OreDictUnifier.get(OrePrefix.dust, secondbyproduct, 1);
                CHEMICAL_BATH_RECIPES.recipeBuilder()
                        .fluidInputs(FrothFlotationFluid.getFluid((int) material.getAverageMass() * 3))
                        .input(dustCrushedPrefix, material)
                        .output(crushedPurified, material, 2)
                        .chancedOutput(firstbyproductstack, 5000, 500)
                        .chancedOutput(secondbyproductstack, 4500, 750)
                        .duration(800).EUt(24)
                        .buildAndRegister();
    }
}
