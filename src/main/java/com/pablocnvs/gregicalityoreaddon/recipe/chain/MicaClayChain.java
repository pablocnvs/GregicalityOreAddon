package com.pablocnvs.gregicalityoreaddon.recipe.chain;

import static com.pablocnvs.gregicalityoreaddon.GAOEMaterialHandler.*;
import static gregicadditions.GAMaterials.*;
import static gregicadditions.recipes.GARecipeMaps.CHEMICAL_DEHYDRATOR_RECIPES;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;

public class MicaClayChain {
    public static void init(){
        MIXER_RECIPES.recipeBuilder().duration(320).EUt(30)
                .input(dust, Mica, 13)
                .input(dust, Clay, 17)
                .fluidInputs(Water.getFluid(3000))
                .fluidOutputs(MicaClaySlurry.getFluid(3000))
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder().duration(730).EUt(120).blastFurnaceTemp(1500)
                .input(dust, Calcite, 20)
                .input(dust, Gypsum, 24)
                .fluidInputs(MicaClaySlurry.getFluid(3000))
                .outputs(FusedMicaClayMix.getItemStack(47))
                .fluidOutputs(MicaClayOutputGasses.getFluid(12000))
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder().duration(600).EUt(120)
                .fluidInputs(MicaClayOutputGasses.getFluid(12000))
                .fluidOutputs(Fluorine.getFluid(1000))
                .fluidOutputs(SulfurDioxide.getFluid(4000))
                .fluidOutputs(CarbonDioxide.getFluid(4000))
                .fluidOutputs(Steam.getFluid(3000))
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder().duration(290).EUt(30)
                .inputs(FusedMicaClayMix.getItemStack(47))
                .fluidInputs(Water.getFluid(9000))
                .fluidOutputs(ClayMicaAlkalineSolution.getFluid(6000))
                .outputs(SilicateOxideResidue.getItemStack(38))
                .buildAndRegister();

        CHEMICAL_DEHYDRATOR_RECIPES.recipeBuilder().duration(610).EUt(120)
                .inputs(SilicateOxideResidue.getItemStack(38))
                .fluidInputs(SulfuricAcid.getFluid(15000))
                .output(dust, SiliconDioxide, 15)
                .output(dust, Gypsum, 48)
                .output(dust, Magnesite, 6)
                .outputs(AluminiumSulfate.getItemStack(34))
                .buildAndRegister();

        //Li2O + Na2O + K2O + 3H2O + Na2CO3 -> Li2CO3 + 4 NaOH + 2 KOH
        CENTRIFUGE_RECIPES.recipeBuilder().duration(310).EUt(30)
                .input(dust, SodaAsh, 6)
                .fluidInputs(ClayMicaAlkalineSolution.getFluid(9000))
                .output(dust, SodiumHydroxide, 12)
                .fluidOutputs(PotassiumHydroxide.getFluid(2000))
                .fluidOutputs(LithiumCarbonateSolution.getFluid(1000))
                .buildAndRegister();



    }
}
