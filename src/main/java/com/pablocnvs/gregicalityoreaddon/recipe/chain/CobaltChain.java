package com.pablocnvs.gregicalityoreaddon.recipe.chain;

import static com.pablocnvs.gregicalityoreaddon.GAOEMaterialHandler.*;
import static gregicadditions.GAMaterials.*;
import static gregicadditions.recipes.GARecipeMaps.*;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;

public class CobaltChain {
    public static void init(){
        BLAST_RECIPES.recipeBuilder()
                .duration(320)
                .EUt(125)
                .blastFurnaceTemp(1100)
                .input(dust, Carrolite, 12)
                .fluidInputs(Oxygen.getFluid(42500))
                .outputs(RoastedCarrolite.getItemStack(21))
                .fluidOutputs(SulfurDioxide.getFluid(14000))
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .duration(100)
                .EUt(32)
                .fluidInputs(SulfuricAcid.getFluid(13750))
                .inputs(RoastedCarrolite.getItemStack(21))
                .fluidOutputs(CarroliteSulfuricSolution.getFluid(7500))
                .output(dust, BandedIron, 5)
                .buildAndRegister();

        ELECTROLYZER_RECIPES.recipeBuilder()
                .duration(190)
                .EUt(125)
                .fluidInputs(CarroliteSulfuricSolution.getFluid(2500))
                .notConsumable(wireFine, Copper)
                .output(dust, Copper)
                .fluidOutputs(Oxygen.getFluid(1000))
                .fluidOutputs(ImpureCobaltSulfateSolution.getFluid(2000))
                .buildAndRegister();

        CHEMICAL_DEHYDRATOR_RECIPES.recipeBuilder()
                .duration(260)
                .EUt(125)
                .input(dust, Quicklime, 53)
                .inputs(SodiumHydrosulfide.getItemStack(6))
                .fluidInputs(ImpureCobaltSulfateSolution.getFluid(12000))
                .outputs(NickelSulfide.getItemStack(4))
                .outputs(Alumina.getItemStack(3))
                .outputs(CobaltOxideHydroxide.getItemStack(48))
                .output(dust, Gypsum, 114)
                .output(dust, SodiumSulfate, 7)
                .buildAndRegister();

        ELECTROLYZER_RECIPES.recipeBuilder()
                .duration(125)
                .EUt(32)
                .inputs(CobaltOxideHydroxide.getItemStack(4))
                .output(dust, Cobalt)
                .fluidOutputs(Oxygen.getFluid(2000))
                .fluidOutputs(Hydrogen.getFluid(1000))
                .buildAndRegister();

        ARC_FURNACE_RECIPES.recipeBuilder()
                .duration(160)
                .EUt(250)
                .inputs(CobaltOxideHydroxide.getItemStack(4))
                .fluidInputs(Hydrogen.getFluid(1000))
                .output(dust, CobaltOxide, 2)
                .fluidOutputs(Water.getFluid(1000))
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .duration(160)
                .EUt(500)
                .blastFurnaceTemp(900)
                .inputs(LithiumHydroxide.getItemStack(3))
                .inputs(CobaltOxideHydroxide.getItemStack(4))
                .notConsumable(VanadiumOxide.getItemStack())
                .outputs(LithiumCobaltOxide.getItemStack(4))
                .fluidOutputs(Steam.getFluid(1000))
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .duration(220)
                .EUt(32)
                .inputs(SodiumEthoxide.getItemStack(8))
                .fluidInputs(HydrogenSulfide.getFluid(1000))
                .outputs(SodiumHydrosulfide.getItemStack(3))
                .fluidOutputs(Ethanol.getFluid(1000))
                .buildAndRegister();

    }
}
