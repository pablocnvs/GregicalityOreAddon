package com.pablocnvs.gregicalityoreaddon.recipe.chain;

import static com.pablocnvs.gregicalityoreaddon.GAOEMaterialHandler.*;
import static gregicadditions.GAMaterials.*;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregicadditions.recipes.GARecipeMaps.*;

public class TinChain {
    public static void init(){
        BLAST_RECIPES.recipeBuilder()
                .duration(230)
                .EUt(125)
                .blastFurnaceTemp(1000)
                .input(dust, Stannite, 8)
                .fluidInputs(Oxygen.getFluid(13000))
                .outputs(CuSnFeOxidesMixture.getItemStack(9))
                .fluidOutputs(SulfurDioxide.getFluid(4000))
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .duration(250)
                .EUt(125)
                .blastFurnaceTemp(1000)
                .inputs(CuSnFeOxidesMixture.getItemStack(9))
                .input(dust, Coke, 2)
                .input(dust, SiliconDioxide, 3)
                .outputs(TinCopperMix.getItemStack(3))
                .outputs(IronSilicateResidue.getItemStack(5))
                .fluidOutputs(CarbonDioxide.getFluid(2000))
                .buildAndRegister();

        MACERATOR_RECIPES.recipeBuilder()
                .duration(160)
                .EUt(32)
                .inputs(IronSilicateResidue.getItemStack(5))
                .output(dust, Ferrosilite, 5)
                .output(dust, AntimonyTrioxide)
                .output(dust, ArsenicTrioxide)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .duration(220)
                .EUt(32)
                .inputs(TinCopperMix.getItemStack(3))
                .fluidInputs(HydrogenSulfide.getFluid(2000))
                .outputs(ImpureTinDust.getItemStack())
                .outputs(CopperSulfide.getItemStack(4))
                .fluidOutputs(Hydrogen.getFluid(4000))
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .duration(130)
                .EUt(125)
                .blastFurnaceTemp(1000)
                .inputs(ImpureTinDust.getItemStack(3))
                .input(dust, Calcium)
                .output(dust, Tin, 3)
                .outputs(CalciumBismuthAlloy.getItemStack(2))
                .buildAndRegister();

    }
}
