package com.pablocnvs.gregicalityoreaddon.recipe.chain;

import static com.pablocnvs.gregicalityoreaddon.GAOEMaterialHandler.*;
import static gregicadditions.GAMaterials.*;
import static gregicadditions.recipes.GARecipeMaps.*;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;

public class FrothFlotationChain {
    public static void init(){
        CHEMICAL_RECIPES.recipeBuilder()
                .duration(160)
                .EUt(125)
                .inputs(PalladiumChloride.getItemStack(3))
                .inputs(Alumina.getItemStack(15))
                .fluidInputs(Water.getFluid(1000))
                .fluidInputs(IsopropylAlcohol.getFluid(1000))
                .outputs(PalladiumAluminaCatalyst.getItemStack(15))
                .fluidOutputs(DilutedHydrochloricAcid.getFluid(2000))
                .buildAndRegister();


        FLUID_HEATER_RECIPES.recipeBuilder()
                .duration(360)
                .EUt(32)
                .notConsumable(PalladiumAluminaCatalyst.getItemStack())
                .fluidInputs(StearicAcid.getFluid(1000))
                .fluidOutputs(OleicAcid.getFluid(1000))
                .buildAndRegister();


        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .duration(160)
                .EUt(760)
                .fluidInputs(Tertbutanol.getFluid(1000))
                .fluidInputs(HydrobromicAcid.getFluid(1000))
                .fluidInputs(DibenzylPeroxide.getFluid(50))
                .notConsumable(SulfuricAcid)
                .fluidOutputs(IsobutylBromide.getFluid(1000))
                .fluidOutputs(Water.getFluid(1000))
                .fluidOutputs(Phenol.getFluid(100))
                .buildAndRegister();
        CHEMICAL_RECIPES.recipeBuilder()
                .duration(100)
                .EUt(120)
                .fluidInputs(Phenol.getFluid(2000))
                .fluidInputs(HydrogenPeroxide.getFluid(1000))
                .notConsumable(SulfuricAcid)
                .fluidOutputs(DibenzylPeroxide.getFluid(1000))
                .fluidOutputs(Water.getFluid(2000))
                .buildAndRegister();
        CHEMICAL_RECIPES.recipeBuilder()
                .duration(120)
                .EUt(480)
                .input(dust, Magnesium)
                .fluidInputs(IsobutylBromide.getFluid(1000))
                .fluidInputs(Acetaldehyde.getFluid(1000))
                .fluidInputs(HydrochloricAcid.getFluid(1000))
                .outputs(MgClBromide.getItemStack(3))
                .fluidOutputs(Methylpentanol.getFluid(1000))
                .buildAndRegister();
        CHEMICAL_RECIPES.recipeBuilder()
                .duration(130)
                .EUt(120)
                .input(dust, SodiumHydroxide, 3)
                .fluidInputs(IsopropylAlcohol.getFluid(1000))
                .fluidInputs(CarbonSulfide.getFluid(1000))
                .fluidOutputs(SodiumIsopropylXanthate.getFluid(1000))
                .fluidOutputs(Water.getFluid(1000))
                .buildAndRegister();
        CHEMICAL_RECIPES.recipeBuilder()
                .duration(130)
                .EUt(120)
                .fluidInputs(OleicAcid.getFluid(1000))
                .fluidInputs(Ammonia.getFluid(1000))
                .fluidOutputs(OleicNitrile.getFluid(1000))
                .fluidOutputs(Water.getFluid(2000))
                .buildAndRegister();
        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .duration(130)
                .EUt(120)
                .fluidInputs(OleicNitrile.getFluid(1000))
                .fluidInputs(Hydrogen.getFluid(4000))
                .fluidInputs(HydrobromicAcid.getFluid(1000))
                .notConsumable(Ammonia)
                .fluidOutputs(OleicAmmoniumBromide.getFluid(1000))
                .buildAndRegister();
        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Methylpentanol.getFluid(375))
                .fluidInputs(OleicAmmoniumBromide.getFluid(250))
                .fluidInputs(SodiumIsopropylXanthate.getFluid(375))
                .fluidInputs(Water.getFluid(1000))
                .fluidOutputs(FrothFlotationFluid.getFluid(2000))
                .duration(210)
                .EUt(480)
                .buildAndRegister();
    }
}
