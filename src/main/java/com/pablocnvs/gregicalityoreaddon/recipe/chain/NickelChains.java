package com.pablocnvs.gregicalityoreaddon.recipe.chain;

import gregtech.api.unification.OreDictUnifier;

import static com.pablocnvs.gregicalityoreaddon.GAOEMaterialHandler.*;
import static gregicadditions.GAMaterials.*;
import static gregicadditions.recipes.GARecipeMaps.*;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;

public class NickelChains {
    public static void init(){
        //Nickeline
        CHEMICAL_RECIPES.recipeBuilder()
                .duration(190)
                .EUt(125)
                .input(dust, Pentlandite, 17)
                .input(dust, Nickeline, 2)
                .fluidInputs(SulfuricAcid.getFluid(4000))
                .fluidInputs(Oxygen.getFluid(37000))
                .fluidInputs(Water.getFluid(9500))
                .outputs(NickelRareResidue.getItemStack())
                .fluidOutputs(NickelSulfuricSolution.getFluid(10000))
                .buildAndRegister();
        SIFTER_RECIPES.recipeBuilder()
                .duration(450)
                .EUt(125)
                .inputs(NickelRareResidue.getItemStack())
                .chancedOutput(OreDictUnifier.get(dust, Silver), 1650, 700)
                .chancedOutput(OreDictUnifier.get(dust, Zinc), 2500, 900)
                .chancedOutput(OreDictUnifier.get(dust, PlatinumMetallicPowder), 1250, 350)
                .buildAndRegister();

        VACUUM_RECIPES.recipeBuilder()
                .duration(210)
                .EUt(125)
                .fluidInputs(NickelSulfuricSolution.getFluid(1000))
                .outputs(NickelSulfatePrecipitate.getItemStack())
                .fluidOutputs(ArsenicSolution.getFluid(150))
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .duration(190)
                .EUt(250)
                .inputs(SodiumIodide.getItemStack(8))
                .fluidInputs(ArsenicSolution.getFluid(2000))
                .output(dust, SodiumSulfate, 14)
                .output(dust, ArsenicTrioxide, 5)
                .output(dust, Iodine, 4)
                .fluidOutputs(Water.getFluid(5000))
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .duration(210)
                .EUt(250)
                .blastFurnaceTemp(950)
                .inputs(NickelSulfatePrecipitate.getItemStack(12))
                .input(dust, Sulfur, 2)
                .fluidInputs(Oxygen.getFluid(2000))
                .outputs(CopperFreeNickelSulfate.getItemStack(12))
                .outputs(CopperSulfide.getItemStack(2))
                .fluidOutputs(SulfurDioxide.getFluid(1000))
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .duration(150)
                .EUt(250)
                .inputs(CopperFreeNickelSulfate.getItemStack(6))
                .fluidInputs(Ammonia.getFluid(2800))
                .fluidInputs(Hydrogen.getFluid(2000))
                .output(dust, Nickel)
                .fluidOutputs(AmmoniaMetalSulfuricSolution.getFluid(1000))
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .duration(130)
                .EUt(125)
                .fluidInputs(AmmoniaMetalSulfuricSolution.getFluid(5000))
                .fluidInputs(HydrogenSulfide.getFluid(2000))
                .outputs(NickelSulfide.getItemStack(2))
                .outputs(CobaltSulfide.getItemStack(2))
                .fluidOutputs(AmmoniumSulfate.getFluid(7000))
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .duration(150)
                .EUt(125)
                .inputs(NickelSulfide.getItemStack(2))
                .fluidInputs(Hydrogen.getFluid(2000))
                .output(dust, Nickel)
                .fluidOutputs(HydrogenSulfide.getFluid(1000))
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .duration(150)
                .EUt(125)
                .inputs(NickelSulfide.getItemStack(2))
                .fluidInputs(Hydrogen.getFluid(2000))
                .output(dust, Nickel)
                .fluidOutputs(HydrogenSulfide.getFluid(1000))
                .buildAndRegister();
    }
}
