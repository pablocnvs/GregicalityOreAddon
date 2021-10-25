package com.pablocnvs.gregicalityoreaddon.recipe.chain;

import gregtech.api.unification.OreDictUnifier;

import static com.pablocnvs.gregicalityoreaddon.GAOEMaterialHandler.*;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;

public class CopperChain {
    public static void init() {
        //Copper
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
