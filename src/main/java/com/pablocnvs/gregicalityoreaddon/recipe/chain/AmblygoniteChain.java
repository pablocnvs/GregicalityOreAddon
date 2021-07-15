package com.pablocnvs.gregicalityoreaddon.recipe.chain;

import static com.pablocnvs.gregicalityoreaddon.GAOEMaterialHandler.*;
import static gregicadditions.GAMaterials.*;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;

public class AmblygoniteChain {
    public static void init(){
        MIXER_RECIPES.recipeBuilder()
                .EUt(120)
                .duration(210)
                .input(dust, Amblygonite,16)
                .fluidInputs(SulfuricAcid.getFluid(3000))
                .fluidInputs(Water.getFluid(1800))
                .fluidOutputs(AmblygoniteSlurry.getFluid(2000))
                .buildAndRegister();
        MIXER_RECIPES.recipeBuilder()
                .EUt(320)
                .duration(170)
                .input(dust, Calcite,5)
                .fluidInputs(AmblygoniteSlurry.getFluid(2000))
                .fluidInputs(Steam.getFluid(16000))
                .outputs(MajorAmblygoniteResidue.getItemStack(9))
                .fluidOutputs(NeutralAmblygoniteSlurry.getFluid(2000))
                .buildAndRegister();
        CENTRIFUGE_RECIPES.recipeBuilder()
                .EUt(120)
                .duration(200)
                .inputs(MajorAmblygoniteResidue.getItemStack(9))
                .fluidInputs(SodiumHydroxideSolution.getFluid(10000))
                .output(dust, Gypsum, 6)
                .outputs(AluminiumHydroxide.getItemStack(28))
                .output(dust, SodiumFluoride, 8)
                .outputs(DisodiumPhosphate.getItemStack(32))
                .buildAndRegister();
        MIXER_RECIPES.recipeBuilder()
                .EUt(220)
                .duration(170)
                .input(dust, Quicklime,4)
                .fluidInputs(NeutralAmblygoniteSlurry.getFluid(2000))
                .fluidInputs(Steam.getFluid(16000))
                .outputs(MinorAmblygoniteResidue.getItemStack(4))
                .fluidOutputs(LithiumAmblygoniteSolution.getFluid(2000))
                .buildAndRegister();
        CENTRIFUGE_RECIPES.recipeBuilder()
                .EUt(120)
                .duration(160)
                .inputs(MinorAmblygoniteResidue.getItemStack(12))
                .output(dust,BandedIron,5)
                .output(dust,Magnesia,2)
                .output(dust, Pyrolusite, 3)
                .buildAndRegister();
        CHEMICAL_RECIPES.recipeBuilder()
                .EUt(410)
                .duration(115)
                .input(dust,SodaAsh,12)
                .fluidInputs(LithiumAmblygoniteSolution.getFluid(2000))
                .output(dust,Calcite,10)
                .fluidOutputs(SodiumSulfateSolution.getFluid(2000))
                .fluidOutputs(LithiumCarbonateSolution.getFluid(1000))
                .buildAndRegister();

    }
}
