package com.pablocnvs.gregicalityoreaddon.recipe.chain;


import static com.pablocnvs.gregicalityoreaddon.GAOEMaterialHandler.*;
import static gregicadditions.GAMaterials.*;
import static gregicadditions.recipes.GARecipeMaps.CHEMICAL_DEHYDRATOR_RECIPES;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;


public class CesiumChain {
    public static void init(){
        CHEMICAL_RECIPES.recipeBuilder().duration(390).EUt(120)
                .input(dust, Pollucite, 26)
                .input(dust, SodiumHydroxide, 21)
                .fluidInputs(HydrochloricAcid.getFluid(10000))
                .output(dust, SiliconDioxide, 12)
                .outputs(IronHydroxide.getItemStack(2))
                .fluidOutputs(PureAluminiumHydroxideSolution.getFluid(2000))
                .fluidOutputs(PolluciteAlkaliChlorides.getFluid(7000))
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder().duration(260).EUt(120)
                .inputs(PotassiumPermanganate.getItemStack(12))
                .fluidInputs(PolluciteAlkaliChlorides.getFluid(7000))
                .fluidOutputs(CesiumFreeAlkaliChlorides.getFluid(7000))
                .outputs(CesiumPermanganate.getItemStack(12))
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder().duration(290).EUt(30)
                .inputs(CesiumPermanganate.getItemStack(12))
                .fluidInputs(OxalicAcid.getFluid(3000))
                .fluidInputs(HydrochloricAcid.getFluid(2000))
                .output(dust, Pyrolusite, 6)
                .outputs(CesiumChloride.getItemStack(4))
                .fluidOutputs(CarbonDioxide.getFluid(3000))
                .fluidOutputs(Water.getFluid(4000))
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder().duration(310).EUt(30)
                .input(dust, Saltpeter, 5)
                .fluidInputs(CesiumFreeAlkaliChlorides.getFluid(7000))
                .outputs(RubidiumNitrate.getItemStack(2))
                .fluidOutputs(NaKChloridesSolution.getFluid(7000))
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder().duration(350).EUt(400)
                .fluidInputs(NaKChloridesSolution.getFluid(7000))
                .fluidInputs(Water.getFluid(3000))
                .inputs(SodiumPerchlorate.getItemStack(24))
                .fluidOutputs(SaltWater.getFluid(11000))
                .outputs(PotassiumPerchlorate.getItemStack(24))
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder().duration(160).EUt(30)
                .inputs(RubidiumNitrate.getItemStack(5))
                .fluidInputs(HydrochloricAcid.getFluid(1000))
                .outputs(RubidiumChloride.getItemStack(2))
                .fluidOutputs(NitricAcid.getFluid(1000))
                .buildAndRegister();

        /*CHEMICAL_RECIPES.recipeBuilder().duration(160).EUt(30)
                .inputs(RubidiumNitrate.getItemStack(5))
                .fluidInputs(HydroiodicAcid.getFluid(1000))
                .outputs(RubidiumIodide.getItemStack(2))
                .fluidOutputs(NitricAcid.getFluid(1000))
                .buildAndRegister();
        */

        CHEMICAL_DEHYDRATOR_RECIPES.recipeBuilder().duration(720).EUt(60)
                .fluidInputs(NaKChloridesSolution.getFluid(7000))
                .output(dust, Salt, 14)
                .output(dust, RockSalt, 6)
                .buildAndRegister();

        ELECTROLYZER_RECIPES.recipeBuilder().duration(210).EUt(120)
                .inputs(RubidiumChloride.getItemStack(2))
                .output(dust, Rubidium)
                .fluidOutputs(Chlorine.getFluid(1000))
                .buildAndRegister();

        ELECTROLYZER_RECIPES.recipeBuilder().duration(210).EUt(120)
                .inputs(CesiumChloride.getItemStack(2))
                .output(dust, Caesium)
                .fluidOutputs(Chlorine.getFluid(1000))
                .buildAndRegister();

        ELECTROLYZER_RECIPES.recipeBuilder().duration(460).EUt(120)
                .inputs(PotassiumPerchlorate.getItemStack(2))
                .output(dust, Potassium)
                .fluidOutputs(Chlorine.getFluid(1000))
                .fluidOutputs(Oxygen.getFluid(4000))
                .buildAndRegister();
    }
}
