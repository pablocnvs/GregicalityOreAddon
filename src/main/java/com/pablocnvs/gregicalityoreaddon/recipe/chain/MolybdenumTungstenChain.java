package com.pablocnvs.gregicalityoreaddon.recipe.chain;

import net.minecraftforge.fml.common.Loader;

import static com.pablocnvs.gregicalityoreaddon.GAOEMaterialHandler.*;
import static com.pablocnvs.gregicalityoreaddon.integration.GAOEGTFOMaterialHandler.*;
import static com.pablocnvs.gregicalityoreaddon.items.GAOEMetaItem.CLOGGED_STYRENE_MESH;
import static com.pablocnvs.gregicalityoreaddon.items.GAOEMetaItem.STYRENE_MESH;
import static gregicadditions.GAMaterials.*;
import static gregicadditions.recipes.GARecipeMaps.*;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;

public class MolybdenumTungstenChain {
    public static void init(){
        //Tungsten Chain Tweaks

        CHEMICAL_RECIPES.recipeBuilder().duration(200).EUt(480)
                .input(dust, Tungstate, 7)
                .fluidInputs(Water.getFluid(2000))
                .fluidInputs(HydrochloricAcid.getFluid(2000))
                .fluidOutputs(LithiumChlorideSolution.getFluid(2000))
                .fluidOutputs(TungsticAcid.getFluid(1000))
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder().duration(500).EUt(480)
                .input(dust, Scheelite, 18)
                .input(dust, SodaAsh, 18)
                .input(dust, SodiumSulfide, 12)
                .outputs(SodiumOxide.getItemStack(9))
                .fluidOutputs(SodiumTungstate.getFluid(3000))
                .output(dust, Calcite, 15)
                .outputs(SodiumTetrathiomolybdate.getItemStack(7))
                .buildAndRegister();


        //Powellite

        CHEMICAL_RECIPES.recipeBuilder().duration(180).EUt(480)
                .input(dust, Powellite, 6)
                .fluidInputs(PotassiumHydroxide.getFluid(2250))
                .outputs(CalciumHydroxide.getItemStack(5))
                .fluidOutputs(ImpurePotassiumMolybdate.getFluid(1000))
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder().duration(170).EUt(120)
                .fluidInputs(ImpurePotassiumMolybdate.getFluid(1000))
                .fluidInputs(AmmoniumChloride.getFluid(2250))
                .outputs(AmmoniumMolybdate.getItemStack(15))
                .outputs(AmmoniumVanadate.getItemStack(2))
                .output(dustSmall, RockSalt, 9)
                .buildAndRegister();

        CHEMICAL_DEHYDRATOR_RECIPES.recipeBuilder().duration(120).EUt(120)
                .inputs(AmmoniumMolybdate.getItemStack(15))
                .outputs(MolybdenumTrioxide.getItemStack(4))
                .fluidOutputs(Ammonia.getFluid(2000))
                .buildAndRegister();

        //Wulfenite

        BLAST_RECIPES.recipeBuilder().duration(850).EUt(480).blastFurnaceTemp(1500)
                .input(dust, Wulfenite, 30)
                .input(dust, SodiumSulfide, 17)
                .outputs(RoastedWulfenite.getItemStack(35))
                .outputs(CopperLeadSulfides.getItemStack(9))
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder().duration(250).EUt(120).blastFurnaceTemp(900)
                .inputs(CopperLeadSulfides.getItemStack(9))
                .fluidInputs(Oxygen.getFluid(5000))
                .outputs(LeadSulfate.getItemStack(30))
                .outputs(CopperSulfide.getItemStack(2))
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder().duration(110).EUt(120)
                .inputs(RoastedWulfenite.getItemStack(14))
                .fluidInputs(Water.getFluid(4000))
                .output(dust, Zincite)
                .fluidOutputs(ImpureSodiumMolybdateSolution.getFluid(4000))
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder().duration(310).EUt(210)
                .input(dust, MagnesiumChloride, 18)
                .fluidInputs(ImpureSodiumMolybdateSolution.getFluid(12000))
                .outputs(MagnesiumArsenate.getItemStack(13))
                .outputs(MagnesiumArsenate.getItemStack(13))
                .fluidOutputs(ArsenicPhosphorousFreeMolybdateSolution.getFluid(12000))
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder().duration(180).EUt(480)
                .input(wireFine, Styrene, 5)
                .fluidInputs(DiethylhexylPhosphoricAcid.getFluid(200))
                .outputs(STYRENE_MESH.getStackForm())
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder().duration(1100).EUt(240)
                .inputs(STYRENE_MESH.getStackForm(6))
                .fluidInputs(ArsenicPhosphorousFreeMolybdateSolution.getFluid(12000))
                .fluidInputs(Ammonia.getFluid(13250))
                .outputs(AmmoniumMolybdate.getItemStack(90))
                .outputs(AmmoniumParatungstate.getItemStack(13))
                .outputs(CLOGGED_STYRENE_MESH.getStackForm())
                .fluidOutputs(SaltWater.getFluid(12000))
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder().duration(80).EUt(480)
                .fluidInputs(SulfuricAcid.getFluid(1000))
                .inputs(CLOGGED_STYRENE_MESH.getStackForm(4))
                .outputs(IronSulfateDust.getItemStack(6))
                .chancedOutput(STYRENE_MESH.getStackForm(4), 9000, 100)
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder().duration(130).EUt(120)
                .inputs(MagnesiumPhosphate.getItemStack(13))
                .input(dust, SodaAsh, 6)
                .inputs(SodiumBicarbonate.getItemStack(12))
                .outputs(DisodiumPhosphate.getItemStack(16))
                .output(dust, Magnesite, 15)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder().duration(130).EUt(120)
                .inputs(MagnesiumArsenate.getItemStack(13))
                .input(dust, SodaAsh, 18)
                .notConsumable(Water.getFluid(3000))
                .outputs(SodiumArsenate.getItemStack(16))
                .output(dust, Magnesite, 15)
                .buildAndRegister();

        //Wolframite and more Tungsten

        LARGE_CHEMICAL_RECIPES.recipeBuilder().duration(650).EUt(500)
                .input(dust, Wolframite, 36)
                .fluidInputs(SodiumHydroxideSolution.getFluid(10000))
                .inputs(SodiumHydrosulfide.getItemStack(12))
                .fluidOutputs(SodiumTungstate.getFluid(6000))
                .outputs(SodiumTetrathiomolybdate.getItemStack(7))
                .outputs(Iron2ManganeseHydroxides.getItemStack(30))
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder().duration(220).EUt(125)
                .inputs(Iron2ManganeseHydroxides.getItemStack(10))
                .fluidInputs(SulfuricAcid.getFluid(8000))
                .outputs(ManganeseSulfate.getItemStack(6))
                .outputs(IronSulfateDust.getItemStack(6))
                .fluidOutputs(DilutedSulfuricAcid.getFluid(6000))
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder().duration(350).EUt(500)
                .fluidInputs(SodiumTungstate.getFluid(6000))
                .fluidInputs(HydrochloricAcid.getFluid(12000))
                .fluidInputs(Ammonia.getFluid(5000))
                .outputs(AmmoniumParatungstate.getItemStack(52))
                .fluidOutputs(SaltWater.getFluid(3000))
                .output(dust, Salt, 18)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder().duration(310).EUt(8000)
                .inputs(AmmoniumParatungstate.getItemStack(26))
                .output(dust, TungstenTrioxide, 12)
                .fluidOutputs(Ammonia.getFluid(2500))
                .buildAndRegister();

        //Bonus

        CHEMICAL_RECIPES.recipeBuilder().duration(320).EUt(120)
                .fluidInputs(Octanol.getFluid(1000))
                .fluidInputs(Acetylene.getFluid(1000))
                .fluidInputs(HydroiodicAcid.getFluid(1000))
                .notConsumable(SodiumAzanide.getItemStack())
                .fluidOutputs(DecylIodide.getFluid(1000))
                .fluidOutputs(Water.getFluid(1000))
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder().duration(320).EUt(500)
                .fluidInputs(DecylIodide.getFluid(3000))
                .inputs(SodiumAzanide.getItemStack(4))
                .fluidOutputs(Tridecylamine.getFluid(1000))
                .fluidOutputs(HydroiodicAcid.getFluid(2000))
                .outputs(SodiumIodide.getItemStack(2))
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder().duration(130).EUt(30)
                .fluidInputs(Trioctylamine.getFluid(1000))
                .fluidInputs(Tridecylamine.getFluid(1000))
                .fluidOutputs(Alamine336.getFluid(2000))
                .buildAndRegister();

        if (Loader.isModLoaded("gregtechfoodoption")){
        LARGE_CHEMICAL_RECIPES.recipeBuilder().duration(230).EUt(120)
                .fluidInputs(OleicAcid.getFluid(3000))
                .fluidInputs(HydrogenPeroxide.getFluid(6000))
                .fluidInputs(Ozone.getFluid(2000))
                .fluidOutputs(AzaleicAcid.getFluid(3000))
                .fluidOutputs(NonanoicAcid.getFluid(3000))
                .fluidOutputs(Water.getFluid(6000))
                .buildAndRegister();


        CHEMICAL_RECIPES.recipeBuilder().duration(290).EUt(200)
                .fluidInputs(Chloromethane.getFluid(1000))
                .input(dust, Lithium, 2)
                .outputs(LithiumChloride.getItemStack(2))
                .fluidOutputs(MethylLithium.getFluid(1000))
                .buildAndRegister();

        //C9H18O2 + CH3Li + LiAlH4 + 2 HI -> C10H21I + LiOH + LiI + AlH3 + H2O
        LARGE_CHEMICAL_RECIPES.recipeBuilder().duration(290).EUt(480)
                .fluidInputs(MethylLithium.getFluid(1000))
                .fluidInputs(NonanoicAcid.getFluid(1000))
                .inputs(LithiumAluminiumHydride.getItemStack(6))
                .fluidInputs(HydroiodicAcid.getFluid(1000))
                .notConsumable(SodiumPhosphotungstate.getItemStack())
                .notConsumable(Methanol)
                .fluidOutputs(DecylIodide.getFluid(1000))
                .outputs(AluminiumHydride.getItemStack(4))
                .outputs(LithiumHydroxide.getItemStack(3))
                .outputs(LithiumIodide.getItemStack(2))
                .buildAndRegister();

        //C9H16O4 + 2 LiAlH4 + 2 HCl + H2O -> C8H18O + CO2 + 2 [LiCl + H2O] + 2 AlH3
        CHEMICAL_PLANT_RECIPES.recipeBuilder().duration(290).EUt(480)
                .fluidInputs(AzaleicAcid.getFluid(1000))
                .fluidInputs(HydrochloricAcid.getFluid(2000))
                .inputs(LithiumAluminiumHydride.getItemStack(12))
                .fluidInputs(Water.getFluid(1000))
                .notConsumable(dust, SilverChloride)
                .notConsumable(Methanol)
                .fluidOutputs(CarbonDioxide.getFluid(1000))
                .outputs(AluminiumHydride.getItemStack(8))
                .fluidOutputs(LithiumChlorideSolution.getFluid(2000))
                .fluidOutputs(Octanol.getFluid(1000))
                .buildAndRegister();}


        MIXER_RECIPES.recipeBuilder().duration(350).EUt(120)
                .fluidInputs(SulfuricAcid.getFluid(650))
                .fluidInputs(HydrobromicAcid.getFluid(1200))
                .fluidInputs(Kerosene.getFluid(1800))
                .fluidInputs(Alamine336.getFluid(600))
                .fluidInputs(Octanol.getFluid(550))
                .fluidOutputs(AmineTungstenSeparationMixture.getFluid(3600))
                .buildAndRegister();


        LARGE_CHEMICAL_RECIPES.recipeBuilder().duration(350).EUt(500)
                .fluidInputs(SodiumTungstate.getFluid(600))
                .fluidInputs(Water.getFluid(1800))
                .fluidInputs(AmineTungstenSeparationMixture.getFluid(3600))
                .fluidOutputs(AminePolytungstateSolution.getFluid(2800))
                .fluidOutputs(TungtstenExtractionResidualSolution.getFluid(2800))
                .buildAndRegister();

        CHEMICAL_DEHYDRATOR_RECIPES.recipeBuilder().duration(350).EUt(125)
                .fluidInputs(TungtstenExtractionResidualSolution.getFluid(28000))
                .outputs(SodiumBromide.getItemStack(24))
                .fluidOutputs(PurifiedZincVanadylSulfateSolution.getFluid(2250))
                .fluidOutputs(SodiumSulfateSolution.getFluid(6000))
                .buildAndRegister();

        CHEMICAL_PLANT_RECIPES.recipeBuilder().duration(350).EUt(500)
                .fluidInputs(AminePolytungstateSolution.getFluid(14000))
                .fluidInputs(Ammonia.getFluid(6500))
                .outputs(AmmoniumParatungstate.getItemStack(52))
                .outputs(AmmoniumMolybdate.getItemStack(22))
                .fluidOutputs(Kerosene.getFluid(1800*9/2))
                .fluidOutputs(Alamine336.getFluid(600*9/2))
                .fluidOutputs(Octanol.getFluid(550*9/2))
                .buildAndRegister();

        }
}
