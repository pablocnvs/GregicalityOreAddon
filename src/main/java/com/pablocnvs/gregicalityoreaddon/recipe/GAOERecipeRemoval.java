package com.pablocnvs.gregicalityoreaddon.recipe;

import gregicadditions.recipes.GARecipeMaps;
import gregicadditions.recipes.helper.HelperMethods;
import gregtech.api.unification.OreDictUnifier;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;

import static gregicadditions.GAMaterials.*;
import static gregicadditions.item.GAMetaItems.BOSE_EINSTEIN_COOLING_CONTAINER;
import static gregicadditions.item.GAMetaItems.SENSOR_UEV;
import static gregtech.api.GTValues.L;
import static gregtech.api.unification.material.MarkerMaterials.Tier.Infinite;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;

public class GAOERecipeRemoval {
    public static void init(){
        HelperMethods.removeRecipesByInputs(GARecipeMaps.LARGE_CHEMICAL_RECIPES, RheniumScrubbedSolution.getFluid(1000), Ammonia.getFluid(3000), SulfuricAcid.getFluid(1000));
        HelperMethods.removeRecipesByInputs(GARecipeMaps.ASSEMBLY_LINE_RECIPES, new ItemStack[]{OreDictUnifier.get(frameGt, HDCS)
                ,LeadScandiumTantalate.getItemStack(16)
                ,OreDictUnifier.get(foil, Osmiridium, 64)
                ,OreDictUnifier.get(cableGtSingle, TungstenTitaniumCarbide, 8)
                ,OreDictUnifier.get(gemExquisite, Diamond, 2)
                ,BOSE_EINSTEIN_COOLING_CONTAINER.getStackForm(4)
                ,OreDictUnifier.get(circuit, Infinite, 2)}
                ,new FluidStack[]{SolderingAlloy.getFluid(L * 2)});
        HelperMethods.removeRecipesByInputs(GARecipeMaps.ASSEMBLY_LINE_RECIPES,new ItemStack[]{OreDictUnifier.get(frameGt, HDCS)
                ,MagnetorestrictiveAlloy.getItemStack(16)
                ,OreDictUnifier.get(foil, Osmiridium, 64)
                ,OreDictUnifier.get(foil, Osmiridium, 64)
                ,OreDictUnifier.get(cableGtSingle, Pikyonium, 8)
                ,OreDictUnifier.get(gemExquisite, Diamond, 2)
                ,BOSE_EINSTEIN_COOLING_CONTAINER.getStackForm(8)
                ,OreDictUnifier.get(circuit, UEV, 2)}
                ,new FluidStack[]{SolderingAlloy.getFluid(L * 4)});
    }
}
