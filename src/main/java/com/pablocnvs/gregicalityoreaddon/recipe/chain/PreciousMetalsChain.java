package com.pablocnvs.gregicalityoreaddon.recipe.chain;

import gregicadditions.recipes.helper.HelperMethods;

import static com.pablocnvs.gregicalityoreaddon.GAOEMaterialHandler.*;
import static gregicadditions.GAMaterials.*;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregicadditions.recipes.GARecipeMaps.*;

public class PreciousMetalsChain {
    public static void init(){
        //Rhenium
        BLAST_RECIPES.recipeBuilder()
                .duration(200)
                .EUt(500000)
                .blastFurnaceTemp(7800)
                .input(dust, Rheniite, 6)
                .inputs(BariumPeroxide.getItemStack(21))
                .input(dust, Quicklime, 4)
                .fluidInputs(SulfurTrioxide.getFluid(8000))
                .outputs(RoastedRheniite.getItemStack(10))
                .fluidOutputs(RheniumSulfuricSolution.getFluid(12000))
                .buildAndRegister();

        LARGE_MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Kerosene.getFluid(2000))
                .fluidInputs(Alamine336.getFluid(500))
                .fluidInputs(Octanol.getFluid(250))
                .fluidInputs(MethylIsobutylKetone.getFluid(500))
                .fluidInputs(AceticAcid.getFluid(375))
                .fluidInputs(IsoamylAlcohol.getFluid(375))
                .fluidOutputs(RheniumSeparationMixture.getFluid(4000))
                .EUt(7680)
                .duration(90)
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .duration(290)
                .EUt(32000)
                .inputs(RoastedRheniite.getItemStack(10))
                .fluidInputs(RheniumSeparationMixture.getFluid(500))
                .fluidInputs(SulfuricAcid.getFluid(21000))
                .fluidOutputs(RheniumScrubbedSolution.getFluid(500))
                .output(dust, Powellite, 6)
                .output(dust, Tungstate, 6)
                .outputs(RheniiteResidualOxides.getItemStack(5))
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .duration(240)
                .EUt(32000)
                .inputs(RheniiteResidualOxides.getItemStack(10))
                .fluidInputs(HydrochloricAcid.getFluid(3000))
                .notConsumable(DiethylhexylPhosphoricAcid.getFluid(100))
                .outputs(REEFilteredRheniiteResiudalOxides.getItemStack(6))
                .fluidOutputs(RareEarthChloridesSolution.getFluid(1000))
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .duration(210)
                .EUt(128000)
                .inputs(REEFilteredRheniiteResiudalOxides.getItemStack(8))
                .fluidInputs(HydrochloricAcid.getFluid(8000))
                .fluidInputs(HydrofluoricAcid.getFluid(12000))
                .fluidInputs(NbTaSeparationMixture.getFluid(100))
                .fluidInputs(ZrHfSeparationMix.getFluid(100))
                .output(dust, RarestMetalResidue, 2)
                .fluidOutputs(OxypentafluoroNiobate.getFluid(1000))
                .fluidOutputs(HeptafluoroTantalate.getFluid(1000))
                .outputs(ZirconiumTetrachloride.getItemStack(5))
                .outputs(HafniumChloride.getItemStack(5))
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .EUt(1920)
                .duration(110)
                .fluidInputs(RheniumScrubbedSolution.getFluid(1000))
                .fluidInputs(Ammonia.getFluid(3000))
                .fluidInputs(SulfuricAcid.getFluid(1000))
                .fluidOutputs(AmmoniumSulfate.getFluid(1000))
                .fluidOutputs(AmmoniumPerrhenate.getFluid(1000))
                .fluidOutputs(UsedRheniumSeparationMixture.getFluid(1000))
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .EUt(1920)
                .duration(190)
                .fluidInputs(UsedRheniumSeparationMixture.getFluid(2000))
                .outputs(Leucine.getItemStack(4))
                .fluidOutputs(Octanol.getFluid(400))
                .fluidOutputs(RheniumSeparationMixture.getFluid(1000))
                .fluidOutputs(AceticAcid.getFluid(150))
                .buildAndRegister();

        BIO_REACTOR_RECIPES.recipeBuilder()
                .duration(210)
                .EUt(8120)
                .inputs(Leucine.getItemStack(22))
                .fluidInputs(Water.getFluid(1000))
                .inputs(Yeast.getItemStack())
                .fluidOutputs(IsoamylAlcohol.getFluid(1000))
                .fluidOutputs(CarbonDioxide.getFluid(1000))
                .chancedOutput(Yeast.getItemStack(), 3000, 1500)
                .buildAndRegister();

        BIO_REACTOR_RECIPES.recipeBuilder()
                .duration(210)
                .EUt(8120)
                .inputs(Leucine.getItemStack(22))
                .input(dust, Quicklime)
                .fluidInputs(FormicAcid.getFluid(2000))
                .inputs(CupriavidusNecator.getItemStack())
                .fluidOutputs(MethylIsobutylKetone.getFluid(1000))
                .output(dust, Calcite)
                .fluidOutputs(Ammonia.getFluid(1000))
                .buildAndRegister();

        //Cooperite

        BLAST_RECIPES.recipeBuilder().duration(320).EUt(240).blastFurnaceTemp(3400)
                .input(dust, Cooperite, 6)
                .inputs(BariumPeroxide.getItemStack(9))
                .outputs(RoastedCooperite.getItemStack(9))
                .output(dust, Garnierite, 2)
                .fluidOutputs(SulfurDioxide.getFluid(1000))
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder().duration(620).EUt(240)
                .inputs(RoastedCooperite.getItemStack(12))
                .inputs(PotassiumFerrocyanide.getItemStack(51))
                .fluidInputs(SodiumThiocyanate.getFluid(6000))
                .input(dust, Sodium, 6)
                .fluidInputs(HydrogenPeroxide.getFluid(6600))
                .fluidInputs(SulfuricAcid.getFluid(12000))
                .output(dust, PlatinumMetallicPowder, 12)
                .output(dust, PalladiumMetallicPowder, 6)
                .output(dust, Barite, 54)
                .fluidOutputs(RhodiumSulfate.getFluid(3000))
                .fluidOutputs(ResidualCooperiteSolution.getFluid(15600))
                .fluidOutputs(HydrogenCyanide.getFluid(5500))
                .fluidOutputs(GoldCyanide.getFluid(500))
                .buildAndRegister();

        LARGE_CENTRIFUGE_RECIPES.recipeBuilder().duration(410).EUt(30)
                .fluidInputs(ResidualCooperiteSolution.getFluid(7800))
                .output(dust, SodiumSulfide, 9)
                .output(dust, Potash, 9)
                .outputs(PrussianBlue.getItemStack(20))
                .fluidOutputs(Water.getFluid(7800))
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder().duration(290).EUt(60)
                .inputs(PrussianBlue.getItemStack(40))
                .fluidInputs(HydrochloricAcid.getFluid(18000))
                .fluidOutputs(Iron2Chloride.getFluid(3000))
                .fluidOutputs(IronChloride.getFluid(4000))
                .fluidOutputs(HydrogenCyanide.getFluid(18000))
                .buildAndRegister();

    }
}
