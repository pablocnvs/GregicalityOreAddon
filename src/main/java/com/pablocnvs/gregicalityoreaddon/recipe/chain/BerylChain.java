package com.pablocnvs.gregicalityoreaddon.recipe.chain;

import static com.pablocnvs.gregicalityoreaddon.GAOEMaterialHandler.*;
import static gregicadditions.recipes.GARecipeMaps.*;
import static gregicadditions.GAMaterials.*;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;


public class BerylChain {
    public static void init(){
        CHEMICAL_RECIPES.recipeBuilder()
                .EUt(120)
                .duration(180)
                .input(dust, Sodium, 2 )
                .fluidInputs(FluorosilicicAcid.getFluid(1000))
                .outputs(SodiumFluorosilicate.getItemStack(9))
                .fluidOutputs(Hydrogen.getFluid(2000))
                .buildAndRegister();
        BLAST_RECIPES.recipeBuilder()
                .EUt(480)
                .duration(210)
                .blastFurnaceTemp(2100)
                .input(dust, Bertrandite, 13)
                .inputs(SodiumFluorosilicate.getItemStack(36))
                .output(dust, SiliconDioxide, 21)
                .outputs(VanadiumOxide.getItemStack(1))
                .fluidOutputs(SodiumFluoroberyllate.getFluid(6000))
                .buildAndRegister();
        CENTRIFUGE_RECIPES.recipeBuilder()
                .EUt(120)
                .duration(200)
                .input(dust, SodiumHydroxide, 6)
                .fluidInputs(SodiumFluoroberyllate.getFluid(1000))
                .output(dust, SodiumFluoride, 8)
                .outputs(BerylliumHydroxide.getItemStack(5))
                .buildAndRegister();
        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .EUt(480)
                .duration(180)
                .input(dust, Emerald, 15)
                .fluidInputs(SulfuricAcid.getFluid(6000))
                .output(dust, SiliconDioxide, 18)
                .outputs(BerylliumAluminiumSulfate.getItemStack(35))
                .outputs(VanadiumOxide.getItemStack(1))
                .buildAndRegister();
        CHEMICAL_DEHYDRATOR_RECIPES.recipeBuilder()
                .EUt(200)
                .duration(190)
                .inputs(BerylliumAluminiumSulfate.getItemStack(35))
                .fluidInputs(Ammonia.getFluid(6000))
                .fluidInputs(Water.getFluid(6000))
                .outputs(BerylliumHydroxide.getItemStack(15))
                .outputs(AmmoniumAlum.getItemStack(32))
                .fluidOutputs(AmmoniumSulfate.getFluid(2000))
                .buildAndRegister();
        CHEMICAL_RECIPES.recipeBuilder()
                .EUt(200)
                .duration(190)
                .inputs(AmmoniumAlum.getItemStack(32))
                .fluidInputs(Ammonia.getFluid(6000))
                .fluidInputs(Water.getFluid(3000))
                .outputs(Alumina.getItemStack(5))
                .fluidOutputs(AmmoniumSulfate.getFluid(4000))
                .buildAndRegister();
        CHEMICAL_RECIPES.recipeBuilder()
                .EUt(120)
                .duration(210)
                .inputs(BerylliumHydroxide.getItemStack(5))
                .inputs(AmmoniumBifluoride.getItemStack(16))
                .output(dust, BerylliumFluoride, 3)
                .fluidOutputs(Ammonia.getFluid(2000))
                .fluidOutputs(HydrofluoricAcid.getFluid(2000))
                .buildAndRegister();
        BLAST_RECIPES.recipeBuilder()
                .EUt(240)
                .duration(200)
                .blastFurnaceTemp(2000)
                .input(dust, BerylliumFluoride, 3)
                .input(dust, Calcium)
                .output(dust, Beryllium)
                .output(dust, Fluorite, 3)
                .buildAndRegister();


    }
}
