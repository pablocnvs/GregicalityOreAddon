package com.pablocnvs.gregicalityoreaddon.recipe.chain;


import static com.pablocnvs.gregicalityoreaddon.GAOEMaterialHandler.*;
import static gregicadditions.GAMaterials.*;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregicadditions.recipes.GARecipeMaps.*;

public class TelluriumChain {
    public static void init(){
        BLAST_RECIPES.recipeBuilder()
                .duration(260)
                .EUt(250)
                .blastFurnaceTemp(1600)
                .input(dust, Sylvanite, 5)
                .fluidInputs(Oxygen.getFluid(1000))
                .output(dust, SilverOxide, 3)
                .outputs(GoldTelluride.getItemStack(6))
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .duration(160)
                .EUt(125)
                .inputs(CalciumCyanamide.getItemStack(8))
                .fluidInputs(CarbonDioxide.getFluid(1000))
                .fluidInputs(HydrogenSulfide.getFluid(4000))
                .output(dust, Quicklime, 4)
                .fluidOutputs(CarbonSulfide.getFluid(1000))
                .fluidOutputs(Thiourea.getFluid(2000))
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .duration(190)
                .EUt(125)
                .inputs(GoldTelluride.getItemStack(6))
                .fluidInputs(Thiourea.getFluid(1000))
                .fluidInputs(HydrogenPeroxide.getFluid(2000))
                .outputs(TelluriumOxide.getItemStack(6))
                .fluidOutputs(GoldThioureaSolution.getFluid(2000))
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .duration(230)
                .EUt(500)
                .inputs(SodiumThiosulfate.getItemStack(21))
                .fluidInputs(GoldThioureaSolution.getFluid(4000))
                .fluidInputs(Water.getFluid(1000))
                .output(dust, PreciousMetal, 4)
                .output(dust, SodiumHydroxide, 18)
                .fluidOutputs(Ammonia.getFluid(4000))
                .fluidOutputs(CarbonSulfide.getFluid(2000))
                .fluidOutputs(SulfurDioxide.getFluid(4000))
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .duration(130)
                .EUt(32)
                .fluidInputs(CarbonSulfide.getFluid(1000))
                .fluidInputs(Oxygen.getFluid(6000))
                .fluidOutputs(CarbonDioxide.getFluid(1000))
                .fluidOutputs(SulfurDioxide.getFluid(2000))
                .buildAndRegister();
    }
}

