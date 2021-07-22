package com.pablocnvs.gregicalityoreaddon.recipe.chain;

import gregtech.api.unification.OreDictUnifier;

import static gregicadditions.GAMaterials.*;
import static com.pablocnvs.gregicalityoreaddon.GAOEMaterialHandler.*;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;

public class PyrometallurgyAndMisc {
    public static void init(){
        //Uvarovite
        BLAST_RECIPES.recipeBuilder()
                .duration(250)
                .EUt(125)
                .blastFurnaceTemp(1200)
                .input(dust, Uvarovite, 12)
                .input(dust, Quicklime, 2)
                .input(dust, SodaAsh, 24)
                .fluidInputs(Oxygen.getFluid(4000))
                .output(dust, SiliconDioxide, 9)
                .output(dust, Calcite, 20)
                .fluidOutputs(SodiumChromateSolution.getFluid(2000))
                .buildAndRegister();
        BLAST_RECIPES.recipeBuilder()
                .duration(215)
                .EUt(60)
                .blastFurnaceTemp(1100)
                .inputs(CopperSulfide.getItemStack(2))
                .fluidInputs(Oxygen.getFluid(3000))
                .outputs(CupricOxide.getItemStack(2))
                .fluidOutputs(SulfurDioxide.getFluid(1000))
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .duration(215)
                .EUt(60)
                .blastFurnaceTemp(1100)
                .inputs(CupricOxide.getItemStack(2))
                .input(dust, Coke)
                .output(dust, Copper)
                .chancedOutput(OreDictUnifier.get(dustSmall, DarkAsh), 2500, 750)
                .fluidOutputs(CarbonDioxide.getFluid(1000))
                .buildAndRegister();


    }
}
