package com.pablocnvs.gregicalityoreaddon.recipe.chain;

import static com.pablocnvs.gregicalityoreaddon.GAOEMaterialHandler.*;
import static gregicadditions.recipes.GARecipeMaps.*;
import static gregicadditions.GAMaterials.*;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;


public class AikiniteChain {
    public static void init(){
        BLAST_RECIPES.recipeBuilder()
                .blastFurnaceTemp(700)
                .EUt(500)
                .duration(240)
                .input(dust, Aikinite, 12)
                .fluidInputs(Oxygen.getFluid(19000))
                .outputs(PbCuBiOxidesMix.getItemStack(13))
                .fluidOutputs(SulfurDioxide.getFluid(6000))
                .buildAndRegister();
        CENTRIFUGE_RECIPES.recipeBuilder()
                .EUt(60)
                .duration(150)
                .inputs(PbCuBiOxidesMix.getItemStack(13))
                .outputs(CupricOxide.getItemStack(4))
                .outputs(WellMixedPbBiOxides.getItemStack(9))
                .buildAndRegister();
        BLAST_RECIPES.recipeBuilder()
                .blastFurnaceTemp(700)
                .EUt(120)
                .duration(260)
                .inputs(WellMixedPbBiOxides.getItemStack(18))
                .input(dust, Calcium, 13)
                .input(dust, Carbon, 5)
                .outputs(CalciumPlumbide.getItemStack(12))
                .outputs(CalciumBismuthAlloy.getItemStack(10))
                .fluidOutputs(CarbonDioxide.getFluid(5000))
                .buildAndRegister();
        CHEMICAL_RECIPES.recipeBuilder()
                .EUt(30)
                .duration(130)
                .inputs(CalciumPlumbide.getItemStack(3))
                .fluidInputs(Chlorine.getFluid(4000))
                .output(dust, Lead)
                .output(dust, CalciumChloride, 6)
                .buildAndRegister();
        CHEMICAL_RECIPES.recipeBuilder()
                .EUt(30)
                .duration(130)
                .inputs(CalciumBismuthAlloy.getItemStack(2))
                .fluidInputs(Chlorine.getFluid(2000))
                .output(dust, Bismuth)
                .output(dust, CalciumChloride, 3)
                .buildAndRegister();
        CHEMICAL_RECIPES.recipeBuilder()
                .EUt(120)
                .duration(190)
                .input(dust, Bismite, 5)
                .fluidInputs(Hydrogen.getFluid(6000))
                .output(dust, Bismuth, 2)
                .fluidOutputs(Water.getFluid(3000))
                .buildAndRegister();
    }
}
