package com.pablocnvs.gregicalityoreaddon.recipe.chain;

import com.pablocnvs.gregicalityoreaddon.items.GAOEMetaItem;
import gregtech.api.items.OreDictNames;
import gregtech.api.items.metaitem.MetaItem;
import gregtech.api.recipes.ingredients.IntCircuitIngredient;
import gregtech.api.unification.OreDictUnifier;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import static com.pablocnvs.gregicalityoreaddon.items.GAOEMetaItem.*;
import static gregicadditions.item.GAMetaItems.*;
import static gregicadditions.item.GAMetaItems.SENSOR_UEV;
import static gregicadditions.recipes.GARecipeMaps.*;
import static gregtech.api.GTValues.L;
import static gregtech.api.unification.material.MarkerMaterials.Tier.Infinite;
import static gregtech.api.unification.ore.OrePrefix.*;
import static com.pablocnvs.gregicalityoreaddon.GAOEMaterialHandler.*;
import static gregicadditions.GAMaterials.*;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;

public class TourmalineAndSensor {
    public static void init(){
        CHEMICAL_RECIPES.recipeBuilder()
                .duration(190)
                .EUt(500)
                .input(dust, Hafnium)
                .fluidInputs(OxalicAcid.getFluid(2000))
                .outputs(HafniumOxalate.getItemStack(13))
                .fluidOutputs(Hydrogen.getFluid(4000))
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .duration(190)
                .EUt(500)
                .inputs(HafniumOxalate.getItemStack(13))
                .fluidInputs(Water.getFluid(5000))
                .notConsumable(Isopropylsuccinate.getFluid(50))
                .fluidOutputs(HafniumOxideNPSolution.getFluid(3000))
                .fluidOutputs(OxalicAcid.getFluid(2000))
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .duration(130)
                .EUt(125)
                .input(dust, Rubidium)
                .fluidInputs(NitricAcid.getFluid(1000))
                .outputs(RubidiumNitrate.getItemStack(5))
                .fluidOutputs(Hydrogen.getFluid(1000))
                .buildAndRegister();

        /*
        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .duration(210)
                .EUt(32750)
                .input(dust, Trinium)
                .fluidInputs(KryptonDifluoride.getFluid(2000))
                .outputs(TriniumTetrafluoride.getItemStack(5))
                .fluidOutputs(Krypton.getFluid(2000))
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .duration(260)
                .EUt(8100)
                .inputs(TriniumTetrafluoride.getItemStack(5))
                .fluidInputs(OxalicAcid.getFluid(2000))
                .outputs(TriniumOxalate.getItemStack(13))
                .fluidOutputs(HydrofluoricAcid.getFluid(4000))
                .buildAndRegister();

         */

        CHEMICAL_RECIPES.recipeBuilder()
                .duration(180)
                .EUt(2000)
                .input(dust, NaquadahEnriched)
                .fluidInputs(OxalicAcid.getFluid(1000))
                .outputs(EnrichedNaquadahOxalate.getItemStack(7))
                .fluidOutputs(Hydrogen.getFluid(1000))
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .duration(230)
                .EUt(2000)
                .fluidInputs(HafniumOxideNPSolution.getFluid(3000))
                .inputs(RubidiumNitrate.getItemStack(5))
                .inputs(MercuryIodide.getItemStack(3))
                .fluidOutputs(ThermochromaticSolution.getFluid(3000))
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .duration(230)
                .EUt(2000)
                .fluidInputs(HafniumOxideNPSolution.getFluid(3000))
                .inputs(EnrichedNaquadahOxalate.getItemStack(5))
                .inputs(MercuryIodide.getItemStack(3))
                .fluidOutputs(AdvancedThermochromaticSolution.getFluid(3000))
                .buildAndRegister();

        ItemStack[] tourmaline_lenses_basic = {TOURMALT_BLUE_LENS.getStackForm(), TOURMALT_GREEN_LENS.getStackForm(),
        TOURMALT_WHITE_LENS.getStackForm(), TOURMALT_LIGHT_BLUE_LENS.getStackForm()};

        ItemStack[] tourmaline_lenses_advanced = {TOURMALT_MAGENTA_LENS.getStackForm(), TOURMALT_LIME_LENS.getStackForm(),
        TOURMALT_PINK_LENS.getStackForm(), TOURMALT_YELLOW_LENS.getStackForm(), TOURMALT_ORANGE_LENS.getStackForm(),
        TOURMALT_PURPLE_LENS.getStackForm()};

        for (int i = 0; i < tourmaline_lenses_basic.length; i++) {
            CHEMICAL_DEHYDRATOR_RECIPES.recipeBuilder().duration(220).EUt(300)
                    .input(lens, Tourmaline)
                    .fluidInputs(ThermochromaticSolution.getFluid(250))
                    .notConsumable(new IntCircuitIngredient(i))
                    .outputs(tourmaline_lenses_basic[i])
                    .buildAndRegister();
        }

        for (int i = 0; i < tourmaline_lenses_advanced.length; i++) {
            CHEMICAL_DEHYDRATOR_RECIPES.recipeBuilder().duration(220).EUt(300)
                    .input(lens, Tourmaline)
                    .fluidInputs(AdvancedThermochromaticSolution.getFluid(250))
                    .notConsumable(new IntCircuitIngredient(i))
                    .outputs(tourmaline_lenses_advanced[i])
                    .buildAndRegister();
        }

        TOURMALT_BLUE_LENS.addOreDict(OreDictNames.craftingLensBlue);
        TOURMALT_WHITE_LENS.addOreDict(OreDictNames.craftingLensWhite);
        TOURMALT_GREEN_LENS.addOreDict(OreDictNames.craftingLensLime);
        TOURMALT_LIGHT_BLUE_LENS.addOreDict(OreDictNames.craftingLensLightBlue);
        TOURMALT_MAGENTA_LENS.addOreDict(OreDictNames.craftingLensMagenta);
        TOURMALT_ORANGE_LENS.addOreDict(OreDictNames.craftingLensOrange);
        TOURMALT_GREEN_LENS.addOreDict(OreDictNames.craftingLensLightGray);
        TOURMALT_YELLOW_LENS.addOreDict(OreDictNames.craftingLensYellow);

        LASER_ENGRAVER_RECIPES.recipeBuilder().duration(100).EUt(7680) .inputs(WAFER_RUTHERFORDIUM.getStackForm()).notConsumable(TOURMALT_PINK_LENS).outputs(ARAM_WAFER.getStackForm(1)).buildAndRegister();
        LASER_ENGRAVER_RECIPES.recipeBuilder().duration(50).EUt(30720) .inputs(WAFER_DUBNIUM.getStackForm())      .notConsumable(TOURMALT_PINK_LENS).outputs(ARAM_WAFER.getStackForm(4)).buildAndRegister();
        LASER_ENGRAVER_RECIPES.recipeBuilder().duration(25).EUt(122880).inputs(WAFER_NEUTRONIUM.getStackForm())   .notConsumable(TOURMALT_PINK_LENS).outputs(ARAM_WAFER.getStackForm(8)).buildAndRegister();


        LASER_ENGRAVER_RECIPES.recipeBuilder().duration(100).EUt(7680) .inputs(WAFER_RUTHERFORDIUM.getStackForm()).notConsumable(TOURMALT_MAGENTA_LENS).outputs(UHPIC_WAFER.getStackForm(1)).buildAndRegister();
        LASER_ENGRAVER_RECIPES.recipeBuilder().duration(25).EUt(30720) .inputs(WAFER_DUBNIUM.getStackForm())      .notConsumable(TOURMALT_MAGENTA_LENS).outputs(UHPIC_WAFER.getStackForm(2)).buildAndRegister();
        LASER_ENGRAVER_RECIPES.recipeBuilder().duration(12).EUt(122880).inputs(WAFER_NEUTRONIUM.getStackForm())   .notConsumable(TOURMALT_MAGENTA_LENS).outputs(UHPIC_WAFER.getStackForm(4)).buildAndRegister();

        // HASoC Wafer
        LASER_ENGRAVER_RECIPES.recipeBuilder().duration(100).EUt(7680) .inputs(WAFER_RUTHERFORDIUM.getStackForm()).notConsumable(TOURMALT_PURPLE_LENS).outputs(HASOC_WAFER.getStackForm(1)).buildAndRegister();
        LASER_ENGRAVER_RECIPES.recipeBuilder().duration(25).EUt(30720) .inputs(WAFER_DUBNIUM.getStackForm())      .notConsumable(TOURMALT_PURPLE_LENS).outputs(HASOC_WAFER.getStackForm(4)).buildAndRegister();
        LASER_ENGRAVER_RECIPES.recipeBuilder().duration(12).EUt(122880).inputs(WAFER_NEUTRONIUM.getStackForm())   .notConsumable(TOURMALT_PURPLE_LENS).outputs(HASOC_WAFER.getStackForm(8)).buildAndRegister();

        // UHASoC Wafer
        LASER_ENGRAVER_RECIPES.recipeBuilder().duration(25).EUt(30720) .inputs(WAFER_DUBNIUM.getStackForm())      .notConsumable(TOURMALT_LIME_LENS).outputs(UHASOC_WAFER.getStackForm(1)).buildAndRegister();
        LASER_ENGRAVER_RECIPES.recipeBuilder().duration(12).EUt(122880).inputs(WAFER_NEUTRONIUM.getStackForm())   .notConsumable(TOURMALT_LIME_LENS).outputs(UHASOC_WAFER.getStackForm(4)).buildAndRegister();


        ASSEMBLER_RECIPES.recipeBuilder().duration(210).EUt(65300)
                .input(plate, Polyurethane, 2)
                .input(gemExquisite, LeadZirconateTitanate)
                .input(gemExquisite, Tourmaline)
                .fluidInputs(PEDOT.getFluid(144))
                .outputs(PIEZOPYROELECTRIC_SENSOR_CRYSTAL.getStackForm())
                .buildAndRegister();

        LARGE_ENGRAVER_RECIPES.recipeBuilder().duration(170).EUt(8100)
                .input(plate, LithiumNiobate)
                .notConsumable(TOURMALT_LIME_LENS)
                .fluidInputs(LiquidNitrogen.getFluid(1500))
                .outputs(EngravedLithiumNiobatePlate.getItemStack())
                .fluidOutputs(Nitrogen.getFluid(1500))
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder().duration(260).EUt(262000)
                .inputs(EngravedLithiumNiobatePlate.getItemStack())
                .input(gemExquisite, Tourmaline)
                .inputs(PIEZOELECTRIC_CRYSTAL.getStackForm())
                .inputs(HIGHLY_INSULATING_FOIL.getStackForm(2))
                .fluidInputs(AmmoniumNiobiumOxalateSolution.getFluid(1000))
                .outputs(UIV_SENSOR_CRYSTAL.getStackForm())
                .buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder().duration(600).EUt(983040)
                .input(frameGt, HDCS)
                .inputs(LeadScandiumTantalate.getItemStack(16))
                .input(foil, Osmiridium, 64)
                .input(cableGtSingle, TungstenTitaniumCarbide, 8)
                .input(gemExquisite, Tourmaline, 2)
                .inputs(BOSE_EINSTEIN_COOLING_CONTAINER.getStackForm(4))
                .input(circuit, Infinite, 2)
                .fluidInputs(SolderingAlloy.getFluid(L * 2))
                .outputs(SENSOR_UHV.getStackForm())
                .buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder().duration(600).EUt(3932160)
                .input(frameGt, HDCS)
                .inputs(MagnetorestrictiveAlloy.getItemStack(16))
                .input(foil, Osmiridium, 64)
                .input(foil, Osmiridium, 64)
                .input(cableGtSingle, Pikyonium, 8)
                .inputs(PIEZOPYROELECTRIC_SENSOR_CRYSTAL.getStackForm())
                .inputs(BOSE_EINSTEIN_COOLING_CONTAINER.getStackForm(8))
                .input(circuit, UEV, 2)
                .fluidInputs(SolderingAlloy.getFluid(L * 4))
                .outputs(SENSOR_UEV.getStackForm())
                .buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder().duration(600).EUt(3932160)
                .input(frameGt, Cinobite)
                .inputs(MagnetorestrictiveAlloy.getItemStack(4))
                .fluidInputs(LiquidCrystalDetector.getFluid(2500))
                .input(foil, NaquadahAlloy, 64)
                .input(cableGtSingle, BlackTitanium, 8)
                .inputs(UIV_SENSOR_CRYSTAL.getStackForm(2))
                .inputs(BOSE_EINSTEIN_COOLING_CONTAINER.getStackForm(12))
                .input(circuit, UIV, 2)
                .fluidInputs(SolderingAlloy.getFluid(L * 6))
                .fluidInputs(Trinium.getFluid(L))
                .outputs(SENSOR_UIV.getStackForm())
                .buildAndRegister();
    }
}
