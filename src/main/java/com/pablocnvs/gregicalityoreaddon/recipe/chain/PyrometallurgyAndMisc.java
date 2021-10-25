package com.pablocnvs.gregicalityoreaddon.recipe.chain;

import com.pablocnvs.gregicalityoreaddon.material.GAOEFluidMaterial;
import gregicadditions.GAValues;
import gregtech.api.GTValues;
import gregtech.api.unification.OreDictUnifier;

import static com.pablocnvs.gregicalityoreaddon.GAOEMaterialHandler.MoltenCalciumSalts;
import static gregicadditions.GAMaterials.*;
import static com.pablocnvs.gregicalityoreaddon.GAOEMaterialHandler.*;
import static gregicadditions.recipes.GARecipeMaps.*;
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

        //Spessartine

        CHEMICAL_BATH_RECIPES.recipeBuilder().duration(620).EUt(30)
                .input(dust, Spessartine, 20)
                .fluidInputs(SulfuricAcid.getFluid(7250))
                .outputs(IronCalciumSiliconSlag.getItemStack(10))
                .outputs(ManganeseSulfate.getItemStack(18))
                .outputs(AluminiumChromiumSulfates.getItemStack(17))
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder().duration(360).blastFurnaceTemp(1000).EUt(120)
                .inputs(IronCalciumSiliconSlag.getItemStack(40))
                .fluidInputs(Oxygen.getFluid(500))
                .output(dust, SiliconDioxide, 36)
                .outputs(IronCalciumOxides.getItemStack(4))
                .fluidOutputs(SulfurTrioxide.getFluid(2000))
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder().duration(215).EUt(30)
                .inputs(IronCalciumOxides.getItemStack(8))
                .output(dust, BandedIron, 5)
                .output(dust, Quicklime, 4)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder().duration(360).blastFurnaceTemp(1000).EUt(120)
                .inputs(AluminiumChromiumSulfates.getItemStack(34))
                .outputs(ChromiumIIIOxide.getItemStack(5))
                .outputs(Alumina.getItemStack(20))
                .fluidOutputs(SulfurTrioxide.getFluid(15000))
                .buildAndRegister();

        //Zirkeline

        LARGE_CENTRIFUGE_RECIPES.recipeBuilder().duration(3500).EUt(320)
                .input(dust, Zirkelite, 58)
                .fluidInputs(HydrofluoricAcid.getFluid(88000))
                .output(dust, Fluorite, 6)
                .fluidOutputs(TitaniumTetrafluoride.getFluid(6000))
                .outputs(ZrHfFluorides.getItemStack(35))
                .outputs(ThoriumFluoride.getItemStack(10))
                .outputs(CeriumFluoride.getItemStack(5))
                .fluidOutputs(FluoroniobicAcid.getFluid(4000))
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder().duration(260).EUt(120)
                .inputs(ZrHfFluorides.getItemStack(5))
                .fluidInputs(HydrochloricAcid.getFluid(4000)) //Change to dilute hydrofluoric
                .fluidOutputs(ZrHfChloride.getFluid(1000))
                .fluidOutputs(HydrofluoricAcid.getFluid(4000))
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder().duration(340).EUt(120)
                .blastFurnaceTemp(Titanium.blastFurnaceTemperature)
                .fluidInputs(TitaniumTetrafluoride.getFluid(1000))
                .input(dust, Magnesium, 2)
                .output(ingotHot, Titanium)
                .outputs(MagnesiumFluoride.getItemStack(6))
                .buildAndRegister();

        ELECTROLYZER_RECIPES.recipeBuilder().duration(200).EUt(120)
                .inputs(CeriumFluoride.getItemStack(5))
                .fluidInputs(MoltenCalciumSalts.getFluid(1000))
                .output(dust, Cerium)
                .output(dust, Calcium, 2)
                .fluidOutputs(Fluorine.getFluid(6000))
                .buildAndRegister();

        //Cinnabar

        BLAST_RECIPES.recipeBuilder().duration(820).EUt(60)
                .input(dust, Cinnabar, 8)
                .input(dust, Quicklime, 8)
                .output(dust, Gypsum, 6)
                .outputs(CalciumSulfide.getItemStack(6))
                .fluidOutputs(Mercury.getFluid(4* GTValues.L))
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder().duration(820).EUt(60)
                .input(dust, Gypsum, 6)
                .inputs(CalciumSulfide.getItemStack(6))
                .fluidInputs(Oxygen.getFluid(8000))
                .output(dust, Quicklime, 8)
                .fluidOutputs(SulfurDioxide.getFluid(4000))
                .buildAndRegister();


    }
}
