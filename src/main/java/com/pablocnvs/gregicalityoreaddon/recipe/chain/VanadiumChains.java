package com.pablocnvs.gregicalityoreaddon.recipe.chain;

import static com.pablocnvs.gregicalityoreaddon.GAOEMaterialHandler.*;
import static gregicadditions.GAMaterials.*;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregicadditions.recipes.GARecipeMaps.*;

public class VanadiumChains {
    public static void init(){
        BLAST_RECIPES.recipeBuilder()
                .blastFurnaceTemp(1200)
                .duration(150)
                .EUt(1000)
                .input(dust, Carnotite, 9)
                .input(dust, SodiumNitrate, 30)
                .outputs(RoastedCarnotite.getItemStack(42))
                .outputs(SodiumOxide.getItemStack(6))
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .duration(210)
                .EUt(125)
                .inputs(RoastedCarnotite.getItemStack(42))
                .fluidInputs(Water.getFluid(2000))
                .outputs(SodiumVanadate.getItemStack(10))
                .output(dust, Saltpeter, 10)
                .fluidOutputs(UranylNitrateSolution.getFluid(2000))
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .duration(180)
                .EUt(2000)
                .input(dust, Vanadinite, 21)
                .inputs(SodiumZirconate.getItemStack(6))
                .fluidInputs(SulfuricAcid.getFluid(18000))
                .fluidInputs(HydrogenPeroxide.getFluid(4000))
                .outputs(LeadSulfate.getItemStack(60))
                .outputs(ZirconiumHydrogenphosphate.getItemStack(13))
                .fluidOutputs(ZincVanadylSulfateSolution.getFluid(9000))
                .fluidOutputs(SaltWater.getFluid(2000))
                .buildAndRegister();

        ELECTROLYZER_RECIPES.recipeBuilder()
                .duration(165)
                .EUt(32)
                .inputs(LeadSulfate.getItemStack(6))
                .output(dust, Lead)
                .output(dust, Sulfur)
                .fluidOutputs(Oxygen.getFluid(4000))
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .duration(130)
                .EUt(125)
                .input(dust, SodiumSulfide, 9)
                .fluidInputs(ZincVanadylSulfateSolution.getFluid(27000))
                .outputs(CopperSulfide.getItemStack(6))
                .outputs(SodiumArsenate.getItemStack(16))
                .fluidOutputs(PurifiedZincVanadylSulfateSolution.getFluid(27000))
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .duration(160)
                .EUt(250)
                .input(dust, Zinc, 3)
                .inputs(SodiumChlorate.getItemStack(15))
                .fluidInputs(PurifiedZincVanadylSulfateSolution.getFluid(4500))
                .fluidOutputs(Chlorine.getFluid(3000))
                .output(dust, ZincSulfate, 24)
                .outputs(SodiumVanadate.getItemStack(15))
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .duration(160)
                .EUt(125)
                .inputs(ZirconiumHydrogenphosphate.getItemStack(13))
                .fluidInputs(HydrochloricAcid.getFluid(4000))
                .outputs(ZirconiumTetrachloride.getItemStack(1000))
                .fluidOutputs(PhosphoricAcid.getFluid(2000))
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .duration(210)
                .EUt(125)
                .blastFurnaceTemp(1500)
                .input(dust, CubicZirconia, 3)
                .input(dust, SodaAsh, 6)
                .outputs(SodiumZirconate.getItemStack(6))
                .fluidOutputs(CarbonDioxide.getFluid(1000))
                .buildAndRegister();


    }
}
