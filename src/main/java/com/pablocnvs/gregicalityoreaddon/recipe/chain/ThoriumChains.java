package com.pablocnvs.gregicalityoreaddon.recipe.chain;


import static com.pablocnvs.gregicalityoreaddon.GAOEMaterialHandler.*;
import static com.pablocnvs.gregicalityoreaddon.GAOEMaterialHandler.MoltenCalciumSalts;
import static gregicadditions.GAEnums.GAOrePrefix.dioxide;
import static gregicadditions.GAMaterials.*;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregicadditions.recipes.GARecipeMaps.*;

public class ThoriumChains {
    public static void init(){
        CHEMICAL_DEHYDRATOR_RECIPES.recipeBuilder()
                .duration(320)
                .EUt(500)
                .input(dust, Thorite, 40)
                .fluidInputs(SulfuricAcid.getFluid(24000))
                .fluidInputs(HydrogenPeroxide.getFluid(1000))
                .outputs(ThoriumSulfate.getItemStack(110))
                .outputs(UranylThoriumSulfate.getItemStack(18))
                .fluidOutputs(RareEarthSulfateSolution.getFluid(2000))
                .output(dust, SiliconDioxide, 30)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .duration(160)
                .EUt(125)
                .fluidInputs(RareEarthSulfateSolution.getFluid(2000))
                .fluidInputs(HydrochloricAcid.getFluid(6000))
                .fluidOutputs(SulfuricAcid.getFluid(3000))
                .fluidOutputs(RareEarthChloridesSolution.getFluid(2000))
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .duration(190)
                .EUt(125)
                .inputs(ThoriumSulfate.getItemStack(11))
                .fluidInputs(HydrofluoricAcid.getFluid(4000))
                .outputs(ThoriumFluoride.getItemStack(5))
                .fluidOutputs(SulfuricAcid.getFluid(2000))
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .duration(160)
                .EUt(32)
                .input(dust, Calcium)
                .fluidInputs(Fluorite.getFluid(432))
                .fluidOutputs(MoltenCalciumSalts.getFluid(1000))
                .buildAndRegister();

        ELECTROLYZER_RECIPES.recipeBuilder()
                .duration(200)
                .EUt(125)
                .inputs(ThoriumFluoride.getItemStack(5))
                .fluidInputs(MoltenCalciumSalts.getFluid(1000))
                .output(dust, Thorium)
                .output(dust, Calcium, 2)
                .fluidOutputs(Fluorine.getFluid(7000))
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .duration(190)
                .EUt(125)
                .blastFurnaceTemp(2500)
                .inputs(ThoriumSulfate.getItemStack(11))
                .outputs(ThoriumRadioactive.getItemStack(dioxide))
                .fluidOutputs(SulfurTrioxide.getFluid(2000))
                .buildAndRegister();




    }

}
