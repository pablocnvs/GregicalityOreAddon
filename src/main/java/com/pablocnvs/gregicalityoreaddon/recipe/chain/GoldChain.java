package com.pablocnvs.gregicalityoreaddon.recipe.chain;

import gregtech.api.recipes.ModHandler;
import gregtech.api.recipes.ingredients.IntCircuitIngredient;
import gregtech.api.unification.OreDictUnifier;

import static com.pablocnvs.gregicalityoreaddon.GAOEMaterialHandler.*;
import static gregicadditions.GAMaterials.*;
import static gregicadditions.recipes.GARecipeMaps.CHEMICAL_DEHYDRATOR_RECIPES;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtech.api.unification.ore.OrePrefix.dustTiny;

public class GoldChain {
    public static void init() {

        /* Gold Chain Attempt #5
         *
         * With the transfer to my mod, the chain has merged a bit the last two iterations of this chain.
         *
         * The main stages of the chain, like in the previous iteration by Dan:
         *
         * - Precious Metal Ingot: Smelts to 1 nugget of gold
         * - Gold Alloy: Centrifuges to 1 nugget of gold each, 4 nuggets total per Precious Metal
         * - Gold Leach: Electrolyzes to 2 nuggets of gold each, 8 nuggets total per Precious Metal
         * - Chloroauric Acid: The step creating this outputs the byproducts, and returns the Copper from Gold Alloy
         * - Chloroauric Acid: Processes into 2 ingots
         *
         * In the end, each step has a major compensation, but each step is reasonable return.
         * STEP 1: +3 nuggets of gold
         * STEP 2: +4 nuggets of gold
         * STEP 3: +byproducts and Copper no longer voided
         * STEP 4: +10 nuggets of gold
         *
         * Everything else in this chain is a fully closed loop.
         *
         * Credits for Hjae and Dan who were the ones to implement and later modify
         * the gold chain in Gregicality*/

        // RECOVERY STEPS ==============================================================================================

        // Step 0 recovery (1 nugget per PM)
        ModHandler.addSmeltingRecipe(OreDictUnifier.get(ingot, PreciousMetal), OreDictUnifier.get(nugget, Gold));

        // Step 1 recovery (8 nuggets per PM)
        CENTRIFUGE_RECIPES.recipeBuilder()
                .input(dust, GoldAlloy, 4)
                .output(dust, Copper, 3)
                .output(dustTiny, Gold, 4)
                .duration(500)
                .EUt(30)
                .buildAndRegister();

        // Step 2 recovery (16 nuggets per PM)
        ELECTROLYZER_RECIPES.recipeBuilder()
                .inputs(GoldLeach.getItemStack(4))
                .fluidInputs(Hydrogen.getFluid(1000))
                .fluidOutputs(Water.getFluid(1000))
                .output(dust, Copper, 3)
                .output(dustTiny, Gold, 8)
                .duration(300)
                .EUt(30)
                .buildAndRegister();


        // MAIN CHAIN ==================================================================================================

        // STEP 1
        // Au? + 3Cu -> Cu3Au?
        ALLOY_SMELTER_RECIPES.recipeBuilder().EUt(30).duration(125)
                .input(dust, PreciousMetal)
                .input(dust, Copper, 3)
                .output(ingot, GoldAlloy, 4)
                .buildAndRegister();

        ALLOY_SMELTER_RECIPES.recipeBuilder().EUt(30).duration(125)
                .input(ingot, PreciousMetal)
                .input(dust, Copper, 3)
                .output(ingot, GoldAlloy, 4)
                .buildAndRegister();

        ALLOY_SMELTER_RECIPES.recipeBuilder().EUt(30).duration(125)
                .input(dust, PreciousMetal)
                .input(ingot, Copper, 3)
                .output(ingot, GoldAlloy, 4)
                .buildAndRegister();

        ALLOY_SMELTER_RECIPES.recipeBuilder().EUt(30).duration(125)
                .input(ingot, PreciousMetal)
                .input(ingot, Copper, 3)
                .output(ingot, GoldAlloy, 4)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder().EUt(90).duration(400).blastFurnaceTemp(750)
                .input(dust, PreciousMetal, 4)
                .input(dust, Copper, 12)
                .output(ingot, GoldAlloy, 16)
                .buildAndRegister();

        // STEP 2
        // Cu3Au? + 6 HNO3 -> Au? + 3 NO2 + [3 CuNO3 + ?NO3 + 3 H2O]
        CHEMICAL_RECIPES.recipeBuilder().duration(800).EUt(30)
                .input(ingot, GoldAlloy, 4)
                .fluidInputs(NitricAcid.getFluid(6000))
                .fluidInputs(Water.getFluid(1000))
                .outputs(GoldLeach.getItemStack())
                .fluidOutputs(NitrogenDioxide.getFluid(3000))
                .fluidOutputs(PreciousLeachNitrate.getFluid(3000))
                .buildAndRegister();

        // STEP 3
        // Au? + 3 [HNO3 + HCl] -> HAuCl4 + 3 NO2 + 0.10 PbSO4 + 3 H2O
        CHEMICAL_RECIPES.recipeBuilder().duration(800)
                .inputs(GoldLeach.getItemStack())
                .fluidInputs(SulfuricAcid.getFluid(100))
                .fluidInputs(AquaRegia.getFluid(3000))
                .fluidInputs(HydrochloricAcid.getFluid(1000))
                .output(dustSmall, SilverChloride)
                .chancedOutput(LeadSulfate.getItemStack(6), 1000, 0)
                .fluidOutputs(ChloroauricAcid.getFluid(1000))
                .fluidOutputs(NitrogenDioxide.getFluid(1000))
                .buildAndRegister();

        // STEP 4
        // 3 K2S2O5 + 9 H2O + 4 HAuCl4 -> 6 KHSO4 + 16 HCl + 4Au
        CHEMICAL_RECIPES.recipeBuilder().duration(750).EUt(30)
                .input(dustSmall, PotassiumMetabisulfite, 27)
                .fluidInputs(ChloroauricAcid.getFluid(1000))
                .fluidInputs(Water.getFluid(2250))
                .output(dust, Gold)
                .outputs(PotassiumBisulfate.getItemStack(9))
                .fluidOutputs(HydrochloricAcid.getFluid(4000))
                .buildAndRegister();

        //2 KHSO4 + 2 H2S -> K2S2O5 + 2 S + 3 H2O
        CHEMICAL_RECIPES.recipeBuilder().duration(350).EUt(30)
                .inputs(PotassiumBisulfate.getItemStack(12))
                .fluidInputs(HydrogenSulfide.getFluid(2000))
                .output(dust, PotassiumMetabisulfite, 9)
                .output(dust, Sulfur, 2)
                .fluidOutputs(Water.getFluid(3000))
                .buildAndRegister();

        ELECTROLYZER_RECIPES.recipeBuilder().duration(600).EUt(125)
                .fluidInputs(ChloroauricAcid.getFluid(1000))
                .notConsumable(plate, Gold)
                .notConsumable(Gold.getFluid(288))
                .fluidOutputs(Chlorine.getFluid(4000))
                .fluidOutputs(Hydrogen.getFluid(1000))
                .output(dust, Gold)
                .buildAndRegister();

        ELECTROLYZER_RECIPES.recipeBuilder()
                .input(dust, RockSalt, 2)
                .fluidInputs(Water.getFluid(1000))
                .fluidOutputs(PotassiumHydroxide.getFluid(1000))
                .fluidOutputs(HydrochloricAcid.getFluid(1000))
                .EUt(30)
                .duration(240)
                .buildAndRegister();

        ELECTROLYZER_RECIPES.recipeBuilder()
                .input(dust, RockSalt, 2)
                .notConsumable(new IntCircuitIngredient(1))
                .fluidOutputs(PotassiumHydroxide.getFluid(1000))
                .fluidOutputs(HydrochloricAcid.getFluid(1000))
                .EUt(30)
                .duration(280)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(PotassiumHydroxide.getFluid(2000))
                .fluidInputs(SulfurDioxide.getFluid(2000))
                .output(dust, PotassiumMetabisulfite, 9)
                .fluidOutputs(Water.getFluid(1000))
                .EUt(30)
                .duration(290)
                .buildAndRegister();

        //Silver Processing

        //[3 CuNO3 + 0.5 AgNO3 + 0.1 ?NO3 + 3 H2O] + HCl -> [3 CuNO3 + 0.1 ?NO3 + 3 H2O + 0.5 HNO3] + 0.5 AgCl
        CHEMICAL_RECIPES.recipeBuilder().duration(150).EUt(60)
                .fluidInputs(HydrochloricAcid.getFluid(1500))
                .fluidInputs(PreciousLeachNitrate.getFluid(9000))
                .output(dust, SilverChloride, 3)
                .fluidOutputs(ResidualCopperNitrate.getFluid(9000))
                .buildAndRegister();

        CHEMICAL_DEHYDRATOR_RECIPES.recipeBuilder().duration(3000).EUt(120)
                .fluidInputs(ResidualCopperNitrate.getFluid(3000))
                .output(dust, Copper, 3)
                .chancedOutput(OreDictUnifier.get(dustSmall, Copper), 5000, 0)
                .chancedOutput(OreDictUnifier.get(dustTiny, Zinc), 5000, 0)
                .chancedOutput(OreDictUnifier.get(dustTiny, Nickel), 5000, 0)
                .fluidOutputs(NitrogenDioxide.getFluid(3000))
                .buildAndRegister();


    }
}
