package com.pablocnvs.gregicalityoreaddon.recipe;

import com.pablocnvs.gregicalityoreaddon.recipe.chain.*;
import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.material.type.DustMaterial;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.api.util.GTUtility;
import net.minecraft.item.ItemStack;

import static com.pablocnvs.gregicalityoreaddon.GAOEConfig.tripleOresFrothFlotation;
import static com.pablocnvs.gregicalityoreaddon.GAOEMaterialHandler.*;
import static gregtech.api.recipes.RecipeMaps.CHEMICAL_BATH_RECIPES;
import static gregtech.api.unification.ore.OrePrefix.*;

public class RecipeHandler {

    public static void register(){
        crushed.addProcessingHandler(DustMaterial.class, RecipeHandler::floatFlotation);
    }

    public static void floatFlotation(OrePrefix CrushedPrefix, DustMaterial material) {
        if (material.hasFlag(SULFIDE_ORE)){
            DustMaterial firstbyproduct = GTUtility.selectItemInList(0, material, material.oreByProducts, DustMaterial.class);
            DustMaterial secondbyproduct = GTUtility.selectItemInList(1, material, material.oreByProducts, DustMaterial.class);
            ItemStack firstbyproductstack = OreDictUnifier.get(OrePrefix.dust, firstbyproduct, 2);
            ItemStack secondbyproductstack = OreDictUnifier.get(OrePrefix.dust, secondbyproduct, 1);
            int crushedMultiplier;
            if (tripleOresFrothFlotation) {crushedMultiplier = 3;} else {crushedMultiplier = 2;}
            CHEMICAL_BATH_RECIPES.recipeBuilder()
                    .fluidInputs(FrothFlotationFluid.getFluid((int) material.getAverageMass() * 3))
                    .input(CrushedPrefix, material)
                    .output(crushedPurified, material, crushedMultiplier)
                    .chancedOutput(firstbyproductstack, 5000, 500)
                    .chancedOutput(secondbyproductstack, 4500, 750)
                    .duration(800).EUt(24)
                    .buildAndRegister();
        }
    }


    public static void initChains() {
        FrothFlotationChain.init();
        AmblygoniteChain.init();
        BerylChain.init();
        AikiniteChain.init();
        VanadiumChains.init();
        PyrometallurgyAndMisc.init();
        TinChain.init();
        NickelChains.init();
        TelluriumChain.init();
        TourmalineAndSensor.init();
        ThoriumChains.init();
        RheniumChain.init();
        CobaltChain.init();
    }

}
